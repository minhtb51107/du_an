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
import java.awt.geom.Ellipse2D;

public class AvatarPanel extends JPanel {
//
//    private Image avatarImage;
//    private String userName = "Người dùng";
//    private String greeting = "Chào mừng bạn trở lại!";
//
//    public AvatarPanel() {
//        setPreferredSize(new Dimension(200, 250));
//        setOpaque(false); // Để nền trong suốt
//
//        // Tải hình ảnh avatar từ file (đảm bảo đường dẫn đúng)
//        avatarImage = new ImageIcon(getClass().getResource("")).getImage();
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g.create();
//
//        // Khử răng cưa cho hình tròn
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//        // Vẽ avatar hình tròn
//        int avatarSize = 100;
//        int x = (getWidth() - avatarSize) / 2;
//        int y = 20;
//        
//        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, avatarSize, avatarSize);
//        g2d.setClip(circle);
//        g2d.drawImage(avatarImage, x, y, avatarSize, avatarSize, this);
//        g2d.setClip(null);
//
//        // Vẽ viền cho avatar
//        g2d.setColor(Color.WHITE);
//        g2d.setStroke(new BasicStroke(3));
//        g2d.draw(circle);
//
//        // Hiển thị tên người dùng
//        g2d.setFont(new Font("Arial", Font.BOLD, 16));
//        g2d.setColor(Color.WHITE);
//        FontMetrics fm = g2d.getFontMetrics();
//        int textX = (getWidth() - fm.stringWidth(userName)) / 2;
//        g2d.drawString(userName, textX, y + avatarSize + 30);
//
//        // Hiển thị lời chào
//        g2d.setFont(new Font("Arial", Font.ITALIC, 14));
//        g2d.setColor(Color.LIGHT_GRAY);
//        fm = g2d.getFontMetrics();
//        textX = (getWidth() - fm.stringWidth(greeting)) / 2;
//        g2d.drawString(greeting, textX, y + avatarSize + 50);
//
//        g2d.dispose();
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Avatar Panel");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 400);
//        frame.setLayout(new BorderLayout());
//        frame.getContentPane().setBackground(new Color(45, 52, 54)); // Màu nền sidebar
//
//        AvatarPanel avatarPanel = new AvatarPanel();
//        frame.add(avatarPanel, BorderLayout.CENTER);
//
//        frame.setVisible(true);
//    }
}
