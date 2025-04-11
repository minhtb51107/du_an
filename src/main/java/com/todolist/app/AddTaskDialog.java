package com.todolist.app;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class AddTaskDialog extends JDialog {
    private JTextField titleField;
    private JTextArea descriptionArea;
    private boolean approved = false;
    private static final Color ACCENT_COLOR = new Color(89, 65, 169);

    public AddTaskDialog(JFrame parent) {
        super(parent, "Create New Task", true);
        setSize(450, 350);
        setLocationRelativeTo(parent);
        setResizable(false);

        // Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 30, 25, 30));
        mainPanel.setBackground(Color.WHITE);

        // Title section
        JLabel titleLabel = new JLabel("Task title");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        titleField = new JTextField();
        titleField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        titleField.setPreferredSize(new Dimension(390, 35));
        titleField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        titleField.setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(8),
            BorderFactory.createEmptyBorder(5, 12, 5, 12)
        ));

        // Description section
        JLabel descriptionLabel = new JLabel("Description");
        descriptionLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        descriptionLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        descriptionArea = new JTextArea();
        descriptionArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(descriptionArea);
        scrollPane.setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(8),
            BorderFactory.createEmptyBorder(8, 12, 8, 12)
        ));
        scrollPane.setPreferredSize(new Dimension(390, 150));
        scrollPane.setMaximumSize(new Dimension(Integer.MAX_VALUE, 150));

        // Buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 12, 0));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton cancelButton = new JButton("Cancel");
        styleButton(cancelButton, false);
        cancelButton.addActionListener(e -> dispose());

        JButton addButton = new JButton("Create task");
        styleButton(addButton, true);
        addButton.addActionListener(e -> {
            if (titleField.getText().trim().isEmpty()) {
                showError("Please enter a task title");
                return;
            }
            approved = true;
            dispose();
        });

        // Add components with spacing
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        mainPanel.add(titleField);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(descriptionLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        mainPanel.add(scrollPane);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        buttonPanel.add(cancelButton);
        buttonPanel.add(addButton);
        mainPanel.add(buttonPanel);

        // Add main panel to dialog
        add(mainPanel);

        // Set focus to title field when dialog opens
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                titleField.requestFocus();
            }
        });
    }

    private void styleButton(JButton button, boolean isPrimary) {
        button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        button.setFocusPainted(false);
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setPreferredSize(new Dimension(isPrimary ? 120 : 100, 35));

        if (isPrimary) {
            button.setBackground(ACCENT_COLOR);
            button.setForeground(Color.WHITE);
            button.setBorder(BorderFactory.createCompoundBorder(
                new RoundedBorder(8),
                BorderFactory.createEmptyBorder(8, 15, 8, 15)
            ));
        } else {
            button.setForeground(new Color(100, 100, 100));
            button.setBorder(BorderFactory.createCompoundBorder(
                new RoundedBorder(8),
                BorderFactory.createEmptyBorder(8, 15, 8, 15)
            ));
        }

        // Hover effect
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setContentAreaFilled(true);
                if (isPrimary) {
                    button.setBackground(ACCENT_COLOR.darker());
                } else {
                    button.setBackground(new Color(245, 245, 245));
                }
            }

            public void mouseExited(MouseEvent e) {
                if (isPrimary) {
                    button.setBackground(ACCENT_COLOR);
                } else {
                    button.setContentAreaFilled(false);
                }
            }
        });
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this,
            message,
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }

    // Custom rounded border
    private static class RoundedBorder extends AbstractBorder {
        private int radius;
        
        RoundedBorder(int radius) {
            this.radius = radius;
        }
        
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(220, 220, 220));
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
            g2.dispose();
        }
        
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius/2, radius/2, radius/2, radius/2);
        }
        
        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    }

    public boolean isApproved() {
        return approved;
    }

    public String getTaskTitle() {
        return titleField.getText().trim();
    }

    public String getTaskDescription() {
        return descriptionArea.getText().trim();
    }
} 