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
import java.awt.geom.GeneralPath;

public class SmoothLineDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(3)); // Độ dày nét vẽ

        // Tạo đường cong liền mạch với góc bo tròn
        GeneralPath path = new GeneralPath();
        path.moveTo(50, 50);  // Điểm bắt đầu
        path.lineTo(110, 50); // Đoạn thẳng ngang

        // Vẽ góc bo tròn (cung tròn nhỏ)
        path.quadTo(130, 50, 130, 70); // Cung tròn bo từ ngang sang dọc

        path.lineTo(130, 130); // Đoạn thẳng dọc xuống

        // Vẽ góc bo tròn thứ hai
        path.quadTo(130, 150, 150, 150); // Cung tròn bo từ dọc sang ngang

        path.lineTo(200, 150); // Đoạn thẳng ngang tiếp tục

        g2d.draw(path); // Vẽ đường bo tròn liền mạch
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vẽ đường bo tròn liền mạch");
        SmoothLineDrawing panel = new SmoothLineDrawing();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
