/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {
//
//    public Dashboard() {
//        setTitle("Dashboard với Thanh Menu Dọc Chuyên Nghiệp");
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        // Bố cục tổng thể
//        setLayout(new BorderLayout());
//
//        // Tạo thanh menu dọc
//        JPanel sideMenu = new JPanel();
//        sideMenu.setBackground(new Color(54, 57, 63));
//        sideMenu.setPreferredSize(new Dimension(200, getHeight()));
//        sideMenu.setLayout(new BoxLayout(sideMenu, BoxLayout.Y_AXIS));
//
//        // Tạo các nút menu
//        String[] menuItems = {"Trang chủ", "Quản lý", "Cài đặt", "Trợ giúp"};
//        for (String item : menuItems) {
//            JButton menuButton = new JButton(item);
//            menuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//            menuButton.setMaximumSize(new Dimension(180, 50));
//            menuButton.setBackground(new Color(54, 57, 63));
//            menuButton.setForeground(Color.WHITE);
//            menuButton.setFocusPainted(false);
//            menuButton.setBorderPainted(false);
//            
//            // Tạo hiệu ứng hover
//            menuButton.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseEntered(MouseEvent e) {
//                    menuButton.setBackground(new Color(79, 84, 92));
//                }
//
//                @Override
//                public void mouseExited(MouseEvent e) {
//                    menuButton.setBackground(new Color(54, 57, 63));
//                }
//            });
//            
//            sideMenu.add(Box.createRigidArea(new Dimension(0, 10)));
//            sideMenu.add(menuButton);
//        }
//
//        // Khu vực hiển thị nội dung chính
//        JPanel mainContent = new JPanel();
//        mainContent.setBackground(Color.WHITE);
//        mainContent.setLayout(new BorderLayout());
//        mainContent.add(new JLabel("Nội dung chính hiển thị ở đây", SwingConstants.CENTER), BorderLayout.CENTER);
//
//        // Thêm các phần vào giao diện chính
//        add(sideMenu, BorderLayout.WEST);
//        add(mainContent, BorderLayout.CENTER);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new Dashboard().setVisible(true);
//        });
//    }
}
