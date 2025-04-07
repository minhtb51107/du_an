/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text.text_swing;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;

public class TwoColorPanel extends JPanel {
    public TwoColorPanel() {
        setPreferredSize(new Dimension(400, 300)); // Kích thước panel
        setLayout(null); // Tắt layout manager để đặt panelA theo vị trí tùy chỉnh
        
        JPanel panelA = new JPanel();
        panelA.setBackground(new Color(255, 255, 255, 200)); // Màu trắng với độ trong suốt
        panelA.setBounds(100, 75, 200, 150); // Định vị panelA ở giữa
        add(panelA);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        int width = getWidth();
        int height = getHeight();
        
        // Tạo hiệu ứng gradient giữa màu xanh và vàng
        GradientPaint gradient = new GradientPaint(0, 0, new Color(204, 218, 231, 255), width, 0, new Color(229, 235, 221, 255));
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, width, height);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Two Color Panel with Overlay");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new TwoColorPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
