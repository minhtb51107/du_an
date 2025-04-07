package com.babe.components;

import javax.swing.*;
import java.awt.*;

public class StyledToggleButton extends JToggleButton {
    private static final Color BLUE_COLOR = new Color(63, 131, 248);
    private static final int BORDER_RADIUS = 20;
    
    public StyledToggleButton(String text) {
        super(text);
        setupButton();
    }

    private void setupButton() {
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        paintBackground(g2);
        paintBorder(g2);
        paintText(g2);

        g2.dispose();
    }

    private void paintBackground(Graphics2D g2) {
        if (isSelected()) {
            // Nút được chọn - màu xanh đậm
            g2.setColor(BLUE_COLOR);
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, BORDER_RADIUS, BORDER_RADIUS);
        } else if (getModel().isRollover()) {
            // Nút hover - màu xanh nhạt
            g2.setColor(new Color(BLUE_COLOR.getRed(), BLUE_COLOR.getGreen(), BLUE_COLOR.getBlue(), 20));
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, BORDER_RADIUS, BORDER_RADIUS);
        }
    }

    private void paintBorder(Graphics2D g2) {
        g2.setStroke(new BasicStroke(1.5f));
        if (isSelected()) {
            g2.setColor(BLUE_COLOR);
        } else {
            // Border màu xanh nhạt hơn khi không được chọn
            g2.setColor(new Color(BLUE_COLOR.getRed(), BLUE_COLOR.getGreen(), BLUE_COLOR.getBlue(), 180));
        }
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, BORDER_RADIUS, BORDER_RADIUS);
    }

    private void paintText(Graphics2D g2) {
        FontMetrics fm = g2.getFontMetrics();
        Rectangle textRect = fm.getStringBounds(getText(), g2).getBounds();
        
        // Căn giữa text
        int x = (getWidth() - textRect.width) / 2;
        int y = (getHeight() - textRect.height) / 2 + fm.getAscent();

        // Màu chữ trắng khi được chọn, xanh khi không được chọn
        g2.setColor(isSelected() ? Color.WHITE : BLUE_COLOR);
        g2.drawString(getText(), x, y);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        return new Dimension(size.width + 30, 32);
    }
} 