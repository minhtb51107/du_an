package com.tuongtac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class AICodeCompilerUI extends JPanel {
    private JTextArea codeArea;
    private JTextArea outputArea;
    private JComboBox<String> languageBox;
    private JButton runButton;
    private static final String API_KEY = "AIzaSyA7BaBxVKCqrHA-2cjGmcu7PuEgrGh3ui4"; // Thay bằng API KEY thật của bạn

    public AICodeCompilerUI() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        setOpaque(false);

        // Font và màu sắc cho giống VS Code
        Font codeFont = new Font("Consolas", Font.PLAIN, 16);
        Color background = new Color(43,43,41,255);
        Color foreground = new Color(230, 230, 230);
        Color panelColor = new Color(45, 45, 45);
        Color borderColor = new Color(60, 60, 60);

        codeArea = new JTextArea();
        codeArea.setFont(codeFont);
        codeArea.setBackground(background);
        codeArea.setForeground(foreground);
        codeArea.setCaretColor(Color.WHITE);
        codeArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        outputArea = new JTextArea();
        outputArea.setFont(codeFont);
        outputArea.setEditable(false);
        outputArea.setBackground(background);
        outputArea.setForeground(new Color(0, 255, 128));
        outputArea.setCaretColor(Color.WHITE);
        outputArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane codeScroll = new JScrollPane(codeArea);
        JScrollPane outputScroll = new JScrollPane(outputArea);

        codeScroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(borderColor), "Code Editor", 0, 0, null, Color.WHITE));
        outputScroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(borderColor), "Output", 0, 0, null, Color.WHITE));

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, codeScroll, outputScroll);
        splitPane.setDividerLocation(800);
        splitPane.setResizeWeight(0.5);

        languageBox = new JComboBox<>(new String[]{"Java", "Python", "C", "JavaScript"});
        languageBox.setFont(new Font("Arial", Font.PLAIN, 14));
        runButton = new JButton("▶ Run with AI");
        runButton.setBackground(new Color(255, 255, 255));
        runButton.setForeground(Color.BLACK);
        //runButton.setBorder(null);
        runButton.setFocusPainted(false);

        runButton.addActionListener((ActionEvent e) -> {
            String selectedLang = (String) languageBox.getSelectedItem();
            String code = codeArea.getText();
            String prompt = "Bây giờ bạn là trình biên dịch, chỉ in ra kết quả đoạn mã, sai thì báo lỗi(lỗi nhỏ nhất vẫn báo nhé). Hãy chạy đoạn mã sau bằng ngôn ngữ " + selectedLang + ":\n" + code;

            try {
                String result = callGeminiAPI(prompt);
                outputArea.setText(result);
            } catch (IOException ex) {
                outputArea.setText("Lỗi gọi API: " + ex.getMessage());
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        controlPanel.setBackground(panelColor);
        JLabel label = new JLabel("\uD83D\uDD22 Ngôn ngữ:");
        label.setForeground(Color.WHITE);   
        controlPanel.add(label);
        controlPanel.add(languageBox);
        controlPanel.add(runButton);

        add(controlPanel, BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);
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

        JSONObject jsonResponse = new JSONObject(response.toString());
        JSONArray candidates = jsonResponse.optJSONArray("candidates");
        if (candidates != null && candidates.length() > 0) {
            JSONObject content = candidates.getJSONObject(0).optJSONObject("content");
            if (content != null) {
                JSONArray parts = content.optJSONArray("parts");
                if (parts != null && parts.length() > 0) {
                    return parts.getJSONObject(0).optString("text", "").trim();
                }
            }
        }
        return "Lỗi: Không tìm thấy nội dung phản hồi!";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AICodeCompilerUI().setVisible(true));
    }
}