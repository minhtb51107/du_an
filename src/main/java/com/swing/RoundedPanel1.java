/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swing;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;

public class RoundedPanel1 extends JPanel{
        private final int cornerRadius;

    public RoundedPanel1(int radius) {
        this.cornerRadius = radius;
        setOpaque(false); // Đặt panel trong suốt để hiển thị góc bo tròn
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        
        // Chất lượng đồ họa mượt hơn
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Màu nền cho panel
        g2.setColor(getBackground());
        
        int width = getWidth();
        int height = getHeight();
        int arc = cornerRadius;
        
        // Vẽ hình chữ nhật với chỉ 2 góc trên bo tròn
        g2.fillRoundRect(0, 0, width, height, arc, arc);
        g2.fillRect(0, arc / 2, width, height - arc / 2);
        
        g2.dispose();
    }
}
