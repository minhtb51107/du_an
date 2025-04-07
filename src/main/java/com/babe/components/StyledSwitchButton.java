package com.babe.components;

import javax.swing.*;
import java.awt.*;

public class StyledSwitchButton extends JToggleButton {
    private static final Color BLUE_COLOR = new Color(63, 131, 248);
    private static final Color GRAY_COLOR = new Color(200, 210, 230);
    private static final Dimension SWITCH_SIZE = new Dimension(50, 25);
    
    public StyledSwitchButton() {
        setupButton();
    }

    private void setupButton() {
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setPreferredSize(SWITCH_SIZE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        paintTrack(g2);
        paintThumb(g2);
        paintHoverEffect(g2);
        
        g2.dispose();
    }

    private void paintTrack(Graphics2D g2) {
        // Vẽ đường ray của switch
        g2.setColor(isSelected() ? BLUE_COLOR : GRAY_COLOR);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getHeight(), getHeight());
    }

    private void paintThumb(Graphics2D g2) {
        // Vẽ nút trượt
        int diameter = getHeight() - 4;
        int x = isSelected() ? getWidth() - diameter - 2 : 2;
        
        // Thêm hiệu ứng bóng nhẹ
        g2.setColor(new Color(0, 0, 0, 20));
        g2.fillOval(x + 1, 3, diameter, diameter);
        
        // Vẽ nút trượt màu trắng
        g2.setColor(Color.WHITE);
        g2.fillOval(x, 2, diameter, diameter);
    }

    private void paintHoverEffect(Graphics2D g2) {
        // Thêm hiệu ứng hover
        if (getModel().isRollover()) {
            g2.setColor(new Color(BLUE_COLOR.getRed(), BLUE_COLOR.getGreen(), BLUE_COLOR.getBlue(), 30));
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getHeight(), getHeight());
        }
    }
} 