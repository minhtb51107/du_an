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
import java.awt.geom.Path2D;

public class RoundedPanel extends JPanel {
    private final int cornerRadius;

    public RoundedPanel(int radius) {
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
        
        // Vẽ hình chữ nhật bo góc
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
        
        g2.dispose();
    }
}


//public class RoundedPanel extends JPanel {
//     @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2 = (Graphics2D) g.create();
//        
//        // Chất lượng đồ họa mượt hơn
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        
//        // Màu nền
//        g2.setColor(Color.BLUE);
//        
//        int width = 1000;
//        int height = 100;
//        int arc = 90; // Độ cong
//        
//        Path2D path = new Path2D.Double();
//        path.moveTo(0, height / 2); // Bắt đầu từ bên trái
//        path.lineTo(width / 2 - arc, height / 2); // Vẽ đường thẳng ngang đến gần giữa
//        path.quadTo(width / 2, -arc, width / 2 + arc, height / 2); // Bo cong lên
//        path.lineTo(width, height / 2); // Tiếp tục vẽ thẳng qua phải
//        
//        g2.fill(path);
//        g2.dispose();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Rounded Line Demo");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(200, 100);
//            
//            RoundedPanel panel = new RoundedPanel();
//            panel.setBackground(Color.WHITE);
//            frame.add(panel);
//            
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//        });
//    }
//}
