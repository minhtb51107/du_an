/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text.baihoc;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionPanel extends JFrame {
    private JPanel mainPanel;
    private JButton submitButton;
    private int questionCount;

    public QuestionPanel() {
        this.questionCount = questionCount;
        setTitle("Dynamic Question Panel");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane, BorderLayout.CENTER);

        for (int i = 1; i <= questionCount; i++) {
            mainPanel.add(createQuestionPanel("Câu hỏi " + i + ": Nội dung câu hỏi?"));
        }

        submitButton = new JButton("Gửi Đáp Án");
        submitButton.addActionListener(new SubmitAction());
        add(submitButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createQuestionPanel(String questionText) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JTextArea questionArea = new JTextArea(questionText);
        questionArea.setLineWrap(true);
        questionArea.setWrapStyleWord(true);
        questionArea.setEditable(false);
        questionArea.setBackground(new Color(240, 240, 240));
        questionArea.setFont(new Font("Arial", Font.BOLD, 12));
        panel.add(questionArea, BorderLayout.NORTH);

        JTextArea answerField = new JTextArea();
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
            System.out.println(output.toString());
            JOptionPane.showMessageDialog(null, output.toString(), "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuestionPanel()); // Số lượng câu hỏi có thể thay đổi tùy ý
    }
}

