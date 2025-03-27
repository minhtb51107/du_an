package com.baihoc;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DynamicPanelExample extends JPanel {

    public DynamicPanelExample() {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);
        setBorder(BorderFactory.createEmptyBorder());

        int[] dataArray = {2, 0, 2, 1, 0, 2, 1, 0, 0, 0, 2, 0};

        JPanel parentPanel = new JPanel();
        parentPanel.setOpaque(false);
        parentPanel.setBackground(null);
        parentPanel.setLayout(new BoxLayout(parentPanel, BoxLayout.Y_AXIS));

        for (int value : dataArray) {
            if (value == 0) {
                parentPanel.add(createPanelA());
            } else if (value == 1) {
                parentPanel.add(createPanelB());
            } else if (value == 2) {
                parentPanel.add(createPanelC());
            }
        }

        JScrollPane scrollPane = new JScrollPane(parentPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.getViewport().setBackground(null);
        scrollPane.setViewportBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        add(scrollPane);
    }

    private JPanel createPanelA() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        panel.setBackground(null);
        panel.setPreferredSize(new Dimension(350, 80));

        JTextArea textArea = createTransparentTextArea();
        textArea.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 10));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setText("Panel A Content\nMore text can go here...");

        panel.add(textArea, BorderLayout.CENTER);
        return panel;
    }

    private JPanel createPanelB() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(350, 80));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;

        JLabel copyLabel = new JLabel("Sao chép");
        copyLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        copyLabel.setForeground(Color.YELLOW);
        copyLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        panel.add(copyLabel, gbc);

        JTextArea textArea = createAutoResizeTextArea(Color.WHITE);
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setText("Panel B Content\nMore text can go here...");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        panel.add(textArea, gbc);

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

    private JPanel createPanelC() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        panel.setBackground(null);
        panel.setPreferredSize(new Dimension(350, 20));

        JTextArea textArea = createTransparentTextArea();
        textArea.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 5));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setText("Tiêu đề...");
        textArea.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(textArea, BorderLayout.CENTER);
        return panel;
    }

    private JTextArea createTransparentTextArea() {
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setBackground(null);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setForeground(Color.BLACK);
        return textArea;
    }

    private JTextArea createAutoResizeTextArea(Color backgroundColor) {
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(backgroundColor.darker());
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setForeground(Color.BLACK);
        return textArea;
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Dynamic Panel Example");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(400, 600);
//            frame.add(new DynamicPanelExample());
//            frame.setVisible(true);
//        });
//    }
}