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
import java.awt.geom.*;

public class SmoothCurvedLine extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Bật Anti-Aliasing để làm mượt nét vẽ
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(3)); // Độ dày nét vẽ

        // Tạo đường cong với bo góc mượt hơn
        Path2D path = new Path2D.Double();
        path.moveTo(50, 50);  // Điểm bắt đầu
        path.lineTo(110, 50); // Đoạn ngang

       // Góc bo tròn 1 (từ ngang sang dọc)
        path.curveTo(130, 50, 130, 60, 130, 80);

        path.lineTo(130, 130); // Đoạn dọc xuống

        // Góc bo tròn 2 (từ dọc sang ngang)
//        path.curveTo(130, 150, 130, 150, 150, 150);

//        path.lineTo(200, 150); // Đoạn ngang tiếp tục

        g2d.draw(path); // Vẽ đường bo tròn siêu mượt
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Đường bo tròn siêu mượt");
        SmoothCurvedLine panel = new SmoothCurvedLine();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
