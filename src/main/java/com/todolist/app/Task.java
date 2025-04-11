package com.todolist.app;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task extends JPanel {
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private String status;
    private String priority;
    private Color backgroundColor;
    private static final Color[] PRIORITY_COLORS = {
        new Color(255, 223, 223), // High - Light Red
        new Color(255, 243, 223), // Medium - Light Orange
        new Color(223, 242, 255)  // Low - Light Blue
    };
    private static final Color ACCENT_COLOR = new Color(89, 65, 169);
    private JLabel titleLabel;
    private JLabel descriptionLabel;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = "Todo";
        this.priority = "Medium";
        this.backgroundColor = PRIORITY_COLORS[1];
        this.dueDate = LocalDateTime.now().plusDays(3); // Mặc định 3 ngày
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createCompoundBorder(
            new RoundedBorder(12),
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 140));
        
        // Task header
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setOpaque(false);
        
        // Title with tag
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        titlePanel.setOpaque(false);
        
        // Priority tag
        JPanel tagPanel = new JPanel();
        tagPanel.setPreferredSize(new Dimension(60, 24));
        tagPanel.setBackground(new Color(245, 240, 255));
        tagPanel.setBorder(new RoundedBorder(12));
        
        JLabel tagLabel = new JLabel("Task");
        tagLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        tagLabel.setForeground(ACCENT_COLOR);
        tagPanel.add(tagLabel);
        
        titlePanel.add(tagPanel);
        
        // Title
        titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        titlePanel.add(titleLabel);
        
        headerPanel.add(titlePanel, BorderLayout.WEST);
        
        // Menu button
        JButton menuButton = new JButton("•••");
        menuButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        menuButton.setBorderPainted(false);
        menuButton.setContentAreaFilled(false);
        menuButton.setFocusPainted(false);
        menuButton.setForeground(new Color(150, 150, 150));
        menuButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        headerPanel.add(menuButton, BorderLayout.EAST);
        
        add(headerPanel);
        
        // Space between header and description
        add(Box.createRigidArea(new Dimension(0, 10)));
        
        // Description
        descriptionLabel = new JLabel("<html><body style='width: 200px'>" + description + "</body></html>");
        descriptionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        descriptionLabel.setForeground(new Color(120, 120, 120));
        add(descriptionLabel);
        
        // Space before time
        add(Box.createRigidArea(new Dimension(0, 12)));
        
        // Time section
        JPanel timePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        timePanel.setOpaque(false);
        
        // Calendar icon
        JLabel calendarIcon = new JLabel("📅");
        calendarIcon.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        timePanel.add(calendarIcon);
        
        // Due date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, h:mm a");
        JLabel timeLabel = new JLabel(dueDate.format(formatter));
        timeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        timeLabel.setForeground(new Color(120, 120, 120));
        timePanel.add(timeLabel);
        
        add(timePanel);
        
        // Space before footer
        add(Box.createRigidArea(new Dimension(0, 12)));
        
        // Footer
        JPanel footerPanel = new JPanel(new BorderLayout());
        footerPanel.setOpaque(false);
        
        // Assignees
        JPanel assigneesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        assigneesPanel.setOpaque(false);
        
        // Add assignee circles
        addAssigneeCircle(assigneesPanel, 220, 0);
        addAssigneeCircle(assigneesPanel, 200, 1);
        addAssigneeCircle(assigneesPanel, 180, 2);
        
        footerPanel.add(assigneesPanel, BorderLayout.WEST);
        
        // Comments and attachments
        JPanel actionsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        actionsPanel.setOpaque(false);
        
        // Comments
        JPanel commentsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        commentsPanel.setOpaque(false);
        
        JLabel commentIcon = new JLabel("💬");
        commentIcon.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        commentsPanel.add(commentIcon);
        
        JLabel commentCount = new JLabel("2");
        commentCount.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        commentCount.setForeground(new Color(150, 150, 150));
        commentsPanel.add(commentCount);
        
        actionsPanel.add(commentsPanel);
        
        // Attachments
        JPanel attachmentsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        attachmentsPanel.setOpaque(false);
        
        JLabel attachIcon = new JLabel("📎");
        attachIcon.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        attachmentsPanel.add(attachIcon);
        
        JLabel attachCount = new JLabel("1");
        attachCount.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        attachCount.setForeground(new Color(150, 150, 150));
        attachmentsPanel.add(attachCount);
        
        actionsPanel.add(attachmentsPanel);
        
        footerPanel.add(actionsPanel, BorderLayout.EAST);
        
        add(footerPanel);
    }

    private void addAssigneeCircle(JPanel parent, final int colorValue, int index) {
        JPanel circle = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(new Color(colorValue, colorValue, colorValue));
                g2d.fillOval(0, 0, 24, 24);
                g2d.dispose();
            }
        };
        circle.setPreferredSize(new Dimension(24, 24));
        circle.setBorder(BorderFactory.createEmptyBorder(0, -8 * index, 0, 0));
        parent.add(circle);
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
            g2.setColor(new Color(240, 240, 240));
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

    private Color getStatusColor() {
        switch (status.toLowerCase()) {
            case "todo": return new Color(150, 150, 150);
            case "in progress": return new Color(255, 170, 50);
            case "in review": return new Color(100, 150, 255);
            case "done": return new Color(50, 180, 50);
            default: return new Color(150, 150, 150);
        }
    }

    private Color getPriorityColor() {
        switch (priority.toLowerCase()) {
            case "high": return new Color(255, 100, 100);
            case "medium": return new Color(255, 170, 50);
            case "low": return new Color(100, 150, 255);
            default: return new Color(150, 150, 150);
        }
    }

    // Getters and setters with UI updates
    public void setStatus(String status) {
        this.status = status;
        repaint();
    }

    public void setPriority(String priority) {
        this.priority = priority;
        this.backgroundColor = PRIORITY_COLORS[
            priority.equalsIgnoreCase("high") ? 0 :
            priority.equalsIgnoreCase("low") ? 2 : 1
        ];
        setBackground(backgroundColor);
        repaint();
    }

    // Other getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDateTime getDueDate() { return dueDate; }
    public void setDueDate(LocalDateTime dueDate) { this.dueDate = dueDate; }
    public String getStatus() { return status; }
    public String getPriority() { return priority; }
} 