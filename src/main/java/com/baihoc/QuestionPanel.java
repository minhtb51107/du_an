/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baihoc;

/**
 *
 * @author PC
 */
import com.dao.BaiHocDAO;
import com.data.BaiTapData;
import com.data.BaiTapHTML_CSS;
import com.data.BaiTapJava;
import com.entity.Data;
import com.entity.NguoiDung;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionPanel extends JPanel {
    private JPanel mainPanel;
    private JButton submitButton;
    private int questionCount;
    private final String API_KEY = "AIzaSyA7BaBxVKCqrHA-2cjGmcu7PuEgrGh3ui4";
    String[] dataArrayContent;
    int[] dataArrayIndex;
    Data data = new Data();
    BaiHocDAO dao = new BaiHocDAO();
    int mabhct;
    NguoiDung nguoiDung = new NguoiDung();
    String maND = nguoiDung.getMaNguoiDung();

    public QuestionPanel(String content) {
        mabhct = dao.getMaBaiHocChiTietByTen(content);
        
//        dataArrayIndex = BaiTapData.getIndex(content);
//        this.questionCount = dataArrayIndex[0];
//        dataArrayContent = BaiTapData.getTitles(content);
        
        if (data.getMonhoc().equals("Java")) {
        dataArrayIndex = BaiTapJava.getIndex(content);
        this.questionCount = dataArrayIndex[0];
        dataArrayContent = BaiTapJava.getTitles(content);
        }

        if (data.getMonhoc().equals("HTML & CSS")) {
        dataArrayIndex = BaiTapHTML_CSS.getIndex(content);
        this.questionCount = dataArrayIndex[0];
        dataArrayContent = BaiTapHTML_CSS.getTitles(content);
        }
        
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);
        setBorder(BorderFactory.createEmptyBorder());
        setPreferredSize(new Dimension(350, 110));

        mainPanel = new JPanel();
        mainPanel.setOpaque(false);
        mainPanel.setBackground(null);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        //scrollPane.getViewport().setBackground(null);
        //scrollPane.setViewportBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        add(scrollPane, BorderLayout.CENTER);

        for (int i = 1; i <= questionCount; i++) {
            mainPanel.add(createQuestionPanel("Câu hỏi " + i + dataArrayContent[i - 1]));
        }

        submitButton = new JButton("Gửi Đáp Án");
        submitButton.addActionListener(new SubmitAction());
        add(submitButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createQuestionPanel(String questionText) {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JTextArea questionArea = new JTextArea(questionText);
        questionArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        questionArea.setLineWrap(true);
        questionArea.setOpaque(false);
        questionArea.setWrapStyleWord(true);
        questionArea.setEditable(false);
        questionArea.setBackground(new Color(240, 240, 240));
        questionArea.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(questionArea, BorderLayout.NORTH);

        JTextArea answerField = new JTextArea();
        answerField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.add(answerField, BorderLayout.CENTER);

        return panel;
    }

    private class SubmitAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Component[] components = mainPanel.getComponents();
            StringBuilder output = new StringBuilder();
            for (Component component : components) {
                if (component instanceof JPanel) {
                    JPanel panel = (JPanel) component;
                    JTextArea questionArea = (JTextArea) panel.getComponent(0);
                    JTextArea answerField = (JTextArea) panel.getComponent(1);
                    output.append(questionArea.getText()).append("\nĐáp án: ").append(answerField.getText()).append("\n\n");
                }
            }
            try {
                String resspon = "dưới đây là câu hỏi và câu trả lời tương ứng của người dùng cho mỗi câu hỏi, ghi các câu hỏi câu nào đúng câu nào sai dưới from sau (điểm chỉ cần ghi 1 số duy nhất tính theo thang điểm 10):\n"
                        + "câu 1: đúng\n"
                        + "câu 2: sai\n"
                        + "...\n"
                        + "điểm: ... \n" + output.toString();
                String respon = callGeminiAPI(resspon);
                updateUIWithResults(respon);
            } catch (IOException ex) {
                Logger.getLogger(QuestionPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(output.toString());
            //JOptionPane.showMessageDialog(null, output.toString(), "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    int i;

    private void updateUIWithResults(String apiResponse) {
        SwingUtilities.invokeLater(() -> {
            // Tạo Pattern cho việc tìm "đúng", "sai" và điểm số
            Pattern answerPattern = Pattern.compile("(đúng|sai)");
            Pattern scorePattern = Pattern.compile("điểm: (\\d+)");
            Component[] components = mainPanel.getComponents();

            // Tìm các kết quả đúng và sai
            Matcher answerMatcher = answerPattern.matcher(apiResponse);
            while (answerMatcher.find()) {
                //System.out.println(answerMatcher.group());

                JPanel panel = (JPanel) components[i];
                JTextArea questionArea = (JTextArea) panel.getComponent(0);

                if ("đúng".equals(answerMatcher.group())) {
                    questionArea.setForeground(Color.GREEN);
                } else {
                    questionArea.setForeground(Color.RED);
                }
                i++;
            }

        // Tìm điểm số
            Matcher scoreMatcher = scorePattern.matcher(apiResponse);
            if (scoreMatcher.find()) {
                String scoreText = scoreMatcher.group(1);
                double score = Double.parseDouble(scoreText);
                int index = dao.countDiemByNguoiDungAndBaiHoc(maND, mabhct);
                if(index != 0){
                    dao.updateDiem(maND, mabhct, score);
                } else{
                dao.insertDiem(maND, mabhct, score);
                }
                //System.out.println("Điểm: " + scoreText);
            } else {
                System.out.println("Điểm: không xác định");
            }
    });
}

    private String callGeminiAPI(String code) throws IOException {
        URL url = new URL("https://generativelanguage.googleapis.com/v1/models/gemini-1.5-pro-002:generateContent?key=" + API_KEY);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        connection.setDoOutput(true);

        // Xử lý dữ liệu đầu vào
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

        // Chuyển đổi JSON thành đối tượng
        JSONObject jsonResponse = new JSONObject(response.toString());

        // Lấy phần "candidates" -> "content" -> "parts" -> "text"
        JSONArray candidates = jsonResponse.optJSONArray("candidates");
        if (candidates != null && candidates.length() > 0) {
            JSONObject content = candidates.getJSONObject(0).optJSONObject("content");
            if (content != null) {
                JSONArray parts = content.optJSONArray("parts");
                if (parts != null && parts.length() > 0) {
                    return parts.getJSONObject(0).optString("text", "").trim(); // Lấy nội dung text
                }
            }
        }

        return "Lỗi: Không tìm thấy nội dung phản hồi!";
    }
}
