package com.babe.components;

import com.babe.theme.AppTheme;
import javax.swing.*;
import java.awt.*;

public class StyledButton extends JButton {
    private final boolean isPrimary;

    public StyledButton(String text, boolean isPrimary) {
        super(text);
        this.isPrimary = isPrimary;
        setupStyle();
    }

    private void setupStyle() {
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setPreferredSize(new Dimension(120, 35));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if (isPrimary) {
            if (getModel().isPressed()) {
                g2.setColor(AppTheme.PRIMARY.darker());
            } else if (getModel().isRollover()) {
                g2.setColor(AppTheme.PRIMARY.brighter());
            } else {
                g2.setColor(AppTheme.PRIMARY);
            }
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            g2.setColor(Color.WHITE);
        } else {
            if (getModel().isRollover()) {
                g2.setColor(new Color(245, 248, 255));
                g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
            g2.setColor(AppTheme.PRIMARY);
            g2.setStroke(new BasicStroke(1.5f));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            g2.setColor(AppTheme.PRIMARY);
        }

        FontMetrics fm = g2.getFontMetrics();
        int textWidth = fm.stringWidth(getText());
        int x = (getWidth() - textWidth) / 2;
        int y = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
        
        g2.drawString(getText(), x, y);
        g2.dispose();
    }
} 