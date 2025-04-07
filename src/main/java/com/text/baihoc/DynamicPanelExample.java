package com.text.baihoc;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DynamicPanelExample extends JFrame {

    public DynamicPanelExample() {
        setTitle("Dynamic Panel Example");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int[] dataArray = {0, 1, 0, 1, 1, 0, 0, 1}; // Mảng chứa 0 và 1

        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BoxLayout(parentPanel, BoxLayout.Y_AXIS));

        // Vòng lặp thêm panel dựa trên mảng
        for (int value : dataArray) {
            if (value == 0) {
                parentPanel.add(createPanelA());
            } else {
                parentPanel.add(createPanelB());
            }
        }

        JScrollPane scrollPane = new JScrollPane(parentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);
    }

    private JPanel createPanelA() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(350, 80));

        JTextArea textArea = createAutoResizeTextArea(Color.BLUE);
        textArea.setText("Panel A Content\nMore text can go here...");

        panel.add(textArea, BorderLayout.CENTER);
        return panel;
    }

    private JPanel createPanelB() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.RED);
        panel.setPreferredSize(new Dimension(350, 80));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;

        // Label sao chép
        JLabel copyLabel = new JLabel("Sao chép");
        copyLabel.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        panel.add(copyLabel, gbc);

        // Text Area
        JTextArea textArea = createAutoResizeTextArea(Color.RED);
        textArea.setText("Panel B Content\nMore text can go here...");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        panel.add(textArea, gbc);

        // Copy event
        copyLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StringSelection selection = new StringSelection(textArea.getText());
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
                JOptionPane.showMessageDialog(panel, "Nội dung đã được sao chép!");
            }
        });

        return panel;
    }

    private JTextArea createAutoResizeTextArea(Color backgroundColor) {
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(backgroundColor.darker());
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setForeground(Color.WHITE);

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
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DynamicPanelExample().setVisible(true);
        });
    }
}
