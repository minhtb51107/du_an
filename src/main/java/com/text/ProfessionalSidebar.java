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

public class ProfessionalSidebar extends JFrame {

    public ProfessionalSidebar() {
        setTitle("Dashboard với Thanh Menu Dọc Chuyên Nghiệp");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Tạo thanh menu dọc bên trái
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(45, 52, 54));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(200, getHeight()));

        // Thêm logo hoặc tiêu đề phía trên thanh menu
        JLabel logo = new JLabel("DASHBOARD");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Arial", Font.BOLD, 20));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        logo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        sidebar.add(logo);

        // Tạo các mục menu với hiệu ứng chuyên nghiệp
        String[] menuItems = {"Trang chủ", "Quản lý", "Cài đặt", "Trợ giúp"};
        for (String item : menuItems) {
            JPanel menuPanel = new JPanel();
            menuPanel.setBackground(new Color(45, 52, 54));
            menuPanel.setMaximumSize(new Dimension(200, 50));
            menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            JLabel menuLabel = new JLabel(item);
            menuLabel.setForeground(Color.WHITE);
            menuLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            menuLabel.setIcon(new ImageIcon(getClass().getResource(""))); // Thêm icon (tùy chọn)
            
            menuPanel.add(menuLabel);

            // Hiệu ứng hover
            menuPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    menuPanel.setBackground(new Color(99, 110, 114));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    menuPanel.setBackground(new Color(45, 52, 54));
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn: " + item);
                }
            });

            sidebar.add(menuPanel);
        }

        // Khu vực hiển thị nội dung chính
        JPanel mainContent = new JPanel();
        mainContent.setBackground(Color.WHITE);
        mainContent.setLayout(new BorderLayout());
        mainContent.add(new JLabel("Nội dung chính hiển thị ở đây", SwingConstants.CENTER), BorderLayout.CENTER);

        // Thêm sidebar và nội dung vào frame
        add(sidebar, BorderLayout.WEST);
        add(mainContent, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ProfessionalSidebar().setVisible(true);
        });
    }
}
