package com.text.baihoc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;

public class CodeSubmissionApp extends JFrame {

    private JTextArea codeArea;
    private JTextArea resultArea;
    private JButton submitButton;
    private final String API_KEY = "AIzaSyCZlzpr_9_RHfPwnYmWyxgQwVWjL7ywSUE"; // Thay bằng API key của bạn

    public CodeSubmissionApp() {
        setTitle("Code Submission System with Gemini");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        codeArea = new JTextArea(10, 50);
        JScrollPane codeScrollPane = new JScrollPane(codeArea);
        codeScrollPane.setBorder(BorderFactory.createTitledBorder("Nhập mã code"));

        resultArea = new JTextArea(8, 50);
        resultArea.setEditable(false);
        JScrollPane resultScrollPane = new JScrollPane(resultArea);
        resultScrollPane.setBorder(BorderFactory.createTitledBorder("Kết quả trả về"));

        submitButton = new JButton("Gửi Code");
        submitButton.addActionListener(e -> sendCodeToAI());

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(codeScrollPane, BorderLayout.CENTER);
        inputPanel.add(submitButton, BorderLayout.SOUTH);

        add(inputPanel, BorderLayout.NORTH);
        add(resultScrollPane, BorderLayout.CENTER);
    }

    private void sendCodeToAI() {
        String code = codeArea.getText().trim();
        if (code.isEmpty()) {
            resultArea.setText("Vui lòng nhập mã code để gửi!");
            return;
        }

        new Thread(() -> {
            try {
                String response = callGeminiAPI(code);
                String formattedResponse = formatResponse(response);
                SwingUtilities.invokeLater(() -> {
                    resultArea.setText(formattedResponse);
                    removeUnwantedLines();
                });
            } catch (IOException e) {
                SwingUtilities.invokeLater(() -> resultArea.setText("Lỗi khi gửi yêu cầu: " + e.getMessage()));
            }
        }).start();
    }

    private void removeUnwantedLines() {
        String content = resultArea.getText();
        StringBuilder cleanedContent = new StringBuilder();

        String[] lines = content.split("\\n");
        for (String line : lines) {
            if (!line.contains("idates") && !line.contains("finishReason") && !line.contains("avgLogprobs")) {
                cleanedContent.append(line).append("\n");
            }
        }
        resultArea.setText(cleanedContent.toString().trim());
    }

    private String callGeminiAPI(String code) throws IOException {
        URL url = new URL("https://generativelanguage.googleapis.com/v1/models/gemini-1.5-pro-002:generateContent?key=" + API_KEY);
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        connection.setDoOutput(true);

        String safeCode = code.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
        String payload = String.format("{\"contents\":[{\"parts\":[{\"text\":\"%s\"}]}]}", safeCode);

        try (OutputStream os = connection.getOutputStream()) {
            os.write(payload.getBytes("UTF-8"));
            os.flush();
        }

        int statusCode = connection.getResponseCode();
        InputStream inputStream = (statusCode >= 200 && statusCode < 300) ? connection.getInputStream() : connection.getErrorStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        String jsonResponse = response.toString().replaceAll("\\\\u003c", "<")
                .replaceAll("\\\\u003e", ">")
                .replaceAll("\\\\n", "\n")
                .replaceAll("\\\\\"", "\"");

        return formatJsonResponse(jsonResponse);
    }

    private String formatJsonResponse(String jsonResponse) {
        try {
            int startIndex = jsonResponse.indexOf("\"text\":\"") + 9;
            int endIndex = jsonResponse.indexOf("\"}", startIndex);
            if (startIndex > 0 && endIndex > startIndex) {
                String extractedText = jsonResponse.substring(startIndex, endIndex);
                return extractedText.replaceAll("\\n", "\n");
            }
        } catch (Exception e) {
            return "Lỗi định dạng kết quả: " + e.getMessage();
        }
        return "Không thể phân tích kết quả từ API.";
    }

    private String formatResponse(String response) {
    if (response == null || response.isEmpty()) {
        return "Phản hồi rỗng hoặc không hợp lệ.";
    }
    response = response.replaceAll(".*?\"text\":\"0.*?\\n", "")
                        .replaceAll(".*?\"text\":\"\\s*\\n", "");
    return response.replaceAll("\\n", "\n")
                    .replaceAll(".*?\\\"text\\\":\\\"(.*?)\\\".*", "$1")
                    .replaceAll("\\\\\"", "\"");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CodeSubmissionApp app = new CodeSubmissionApp();
            app.setVisible(true);
        });
    }
}