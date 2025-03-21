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

public class RoundedTrapezoid extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Bật chế độ làm mượt
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Thiết lập màu sắc và độ dày nét vẽ
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(3));

        // Kích thước hình thang
        int topWidth = 100;
        int bottomWidth = 200;
        int height = 100;
        int arc = 10; // Độ bo tròn góc

        // Tọa độ các điểm
        int x1 = 100, y1 = 50;  // Đỉnh trên trái
        int x2 = x1 + topWidth, y2 = y1; // Đỉnh trên phải
        int x3 = x1 - (bottomWidth - topWidth) / 2, y3 = y1 + height; // Đỉnh dưới trái
        int x4 = x3 + bottomWidth, y4 = y3; // Đỉnh dưới phải

        // Vẽ hình thang bo tròn bằng Path2D
        Path2D path = new Path2D.Double();
        
        // Bắt đầu từ điểm trên trái
        path.moveTo(x1 + arc, y1);
        
        // Đỉnh trên phải (bo tròn)
        path.lineTo(x2 - arc, y2);
        path.quadTo(x2, y2, x2, y2 + arc);

        // Cạnh phải (bo tròn)
        path.lineTo(x4, y4 - arc);
        path.quadTo(x4, y4, x4 - arc, y4);

        // Đỉnh dưới trái (bo tròn)
        path.lineTo(x3 + arc, y3);
        path.quadTo(x3, y3, x3, y3 - arc);

        // Cạnh trái (bo tròn)
        path.lineTo(x1, y1 + arc);
        path.quadTo(x1, y1, x1 + arc, y1);

        // Vẽ hình
        g2d.draw(path);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hình thang bo tròn");
        RoundedTrapezoid panel = new RoundedTrapezoid();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
