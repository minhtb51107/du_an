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

public class AutoResizeTextAreaPanel extends JFrame {
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel contentPanel;

    public AutoResizeTextAreaPanel() {
        setTitle("Auto Resize JTextAreas with ScrollPane");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo panel chứa các JTextArea
        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(Color.LIGHT_GRAY);

        // Tạo JTextArea 1
        textArea1 = createAutoResizeTextArea(new Color(173, 216, 230)); // Màu xanh nhạt
        contentPanel.add(textArea1);

        // Tạo JTextArea 2
        textArea2 = createAutoResizeTextArea(new Color(255, 228, 196)); // Màu cam nhạt
        contentPanel.add(textArea2);

        // Đưa vào ScrollPane
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        setVisible(true);
    }

    private JTextArea createAutoResizeTextArea(Color backgroundColor) {
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(backgroundColor);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));

        // Theo dõi thay đổi để tự mở rộng
        textArea.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                adjustTextAreaSize(textArea);
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                adjustTextAreaSize(textArea);
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                adjustTextAreaSize(textArea);
            }
        });

        return textArea;
    }

    private void adjustTextAreaSize(JTextArea textArea) {
        FontMetrics metrics = textArea.getFontMetrics(textArea.getFont());
        int lineHeight = metrics.getHeight();
        int lines = textArea.getLineCount();
        int newHeight = lines * lineHeight + 10;

        textArea.setPreferredSize(new Dimension(textArea.getWidth(), newHeight));
        textArea.revalidate();
        contentPanel.revalidate();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AutoResizeTextAreaPanel::new);
    }
}
