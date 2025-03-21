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

public class LineDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; // Chuyển sang Graphics2D để vẽ mượt hơn
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(3)); // Tăng độ dày nét vẽ

        // Đoạn ngang từ (50,50) đến (110,50)
        g2d.drawLine(50, 50, 110, 50);

        // Góc bo tròn từ ngang sang dọc (vẽ 1/4 cung tròn)
        g2d.drawArc(100, 50, 20, 20, 270, 90);

        // Đoạn dọc từ (110,70) đến (110,130)
        g2d.drawLine(110, 70, 110, 130);

        // Góc bo tròn từ dọc sang ngang
        g2d.drawArc(100, 120, 20, 20, 0, 90);

        // Đoạn ngang từ (110,140) đến (200,140)
        g2d.drawLine(110, 140, 200, 140);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vẽ đường bo góc tròn");
        LineDrawing panel = new LineDrawing();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
