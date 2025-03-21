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

public class RoundedFilledTrapezoid extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Bật chế độ làm mượt
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Thiết lập màu sắc
        g2d.setColor(new Color(0, 150, 255)); // Màu xanh dương

        // Kích thước hình thang
        int topWidth = 100;
        int bottomWidth = 200;
        int height = 100;
        int arc = 20; // Độ bo tròn góc

        // Tọa độ các điểm
        int x1 = 100, y1 = 50;  // Đỉnh trên trái
        int x2 = x1 + topWidth, y2 = y1; // Đỉnh trên phải
        int x3 = x1 - (bottomWidth - topWidth) / 2, y3 = y1 + height; // Đỉnh dưới trái
        int x4 = x3 + bottomWidth, y4 = y3; // Đỉnh dưới phải

        // Tạo hình thang bo tròn
        Path2D path = new Path2D.Double();
        
        // Bắt đầu từ góc trên trái
        path.moveTo(x1 + arc, y1);
        path.lineTo(x2 - arc, y2);
        path.quadTo(x2, y2, x2, y2 + arc);

        path.lineTo(x4, y4 - arc);
        path.quadTo(x4, y4, x4 - arc, y4);

        path.lineTo(x3 + arc, y3);
        path.quadTo(x3, y3, x3, y3 - arc);

        path.lineTo(x1, y1 + arc);
        path.quadTo(x1, y1, x1 + arc, y1);

        // Tô đầy hình
        g2d.fill(path);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hình thang đầy màu bo tròn");
        RoundedFilledTrapezoid panel = new RoundedFilledTrapezoid();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
