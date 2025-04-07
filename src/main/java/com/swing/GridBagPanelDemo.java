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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagPanelDemo extends JFrame {
//    private JPanel mainPanel; // Panel chứa nội dung thay đổi
//    private CardLayout cardLayout; // Layout giúp chuyển đổi nội dung
//    private JPanel currentSelectedPanel; // Panel chứa nút đang được chọn
//
//    public GridBagPanelDemo() {
//        setTitle("Quản lý công việc");
//        setSize(500, 300);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        // Sử dụng GridBagLayout
//        setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//
//        // Hàng 1: Thanh Menu
//        JPanel menuPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
//
//        // Tạo các nút menu và bọc chúng trong JPanel riêng
//        JPanel panelKhoaBieu = createMenuPanel("Khóa biểu", Color.LIGHT_GRAY, "KhoaBieu");
//        JPanel panelTodoList = createMenuPanel("To-do List", Color.CYAN, "TodoList");
//        JPanel panelNhatKy = createMenuPanel("Nhật ký", Color.PINK, "NhatKy");
//
//        menuPanel.add(panelKhoaBieu);
//        menuPanel.add(panelTodoList);
//        menuPanel.add(panelNhatKy);
//
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.weightx = 1.0;
//        add(menuPanel, gbc);
//
//        // Hàng 2: Panel chứa nội dung thay đổi
//        cardLayout = new CardLayout();
//        mainPanel = new JPanel(cardLayout);
//
//        // Các panel nội dung với màu tương ứng
//        JPanel panelKhoaBieuContent = createContentPanel(Color.LIGHT_GRAY, "Khóa biểu nội dung");
//        JPanel panelTodoListContent = createContentPanel(Color.CYAN, "To-do List nội dung");
//        JPanel panelNhatKyContent = createContentPanel(Color.PINK, "Nhật ký nội dung");
//
//        mainPanel.add(panelKhoaBieuContent, "KhoaBieu");
//        mainPanel.add(panelTodoListContent, "TodoList");
//        mainPanel.add(panelNhatKyContent, "NhatKy");
//
//        gbc.gridy = 1;
//        gbc.weighty = 1.0;
//        gbc.fill = GridBagConstraints.BOTH;
//        add(mainPanel, gbc);
//    }
//
//    // Tạo panel nội dung
//    private JPanel createContentPanel(Color color, String text) {
//        JPanel panel = new JPanel();
//        panel.setBackground(color);
//        panel.add(new JLabel(text));
//        return panel;
//    }
//
//    // Tạo panel chứa nút, có viền bao quanh sát với nội dung bên dưới
//    private JPanel createMenuPanel(String text, Color color, String panelName) {
//        RoundedPanel wrapperPanel = new RoundedPanel(20);
//        wrapperPanel.setLayout(new BorderLayout());
//        JButton button = new JButton(text);
//
//        button.setFocusPainted(false);
//        button.setBorder(null);
//        button.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Xóa viền gốc
//        button.setContentAreaFilled(false); // Xóa nền
//        wrapperPanel.add(button, BorderLayout.CENTER);
//
//        // Xử lý khi nhấn nút
//        button.addActionListener(e -> updateSelection(wrapperPanel, color, panelName));
//
//        return wrapperPanel;
//    }
//
//    // Cập nhật khi chọn menu
//    private void updateSelection(JPanel selectedPanel, Color color, String panelName) {
//        // Xóa viền panel trước đó (nếu có)
//        if (currentSelectedPanel != null) {
//            currentSelectedPanel.setBorder(null);
//        }
//
//        // Đặt viền sát với nội dung bên dưới
//        selectedPanel.setBorder(BorderFactory.createLineBorder(color, 2));
//        currentSelectedPanel = selectedPanel;
//
//        // Hiển thị panel nội dung tương ứng
//        cardLayout.show(mainPanel, panelName);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new GridBagPanelDemo().setVisible(true);
//        });
//    }
}
