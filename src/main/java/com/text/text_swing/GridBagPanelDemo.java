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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagPanelDemo extends JFrame {
    private JPanel mainPanel; // Panel chứa nội dung sẽ thay đổi
    private CardLayout cardLayout; // Layout giúp chuyển đổi nội dung

    public GridBagPanelDemo() {
        setTitle("Quản lý công việc");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Sử dụng GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Hàng 1: Thanh Menu
        JPanel menuPanel = new JPanel(new FlowLayout());
        JButton btnKhoaBieu = new JButton("Khóa biểu");
        JButton btnTodoList = new JButton("To-do List");
        JButton btnNhatKy = new JButton("Nhật ký");

        menuPanel.add(btnKhoaBieu);
        menuPanel.add(btnTodoList);
        menuPanel.add(btnNhatKy);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(menuPanel, gbc);

        // Hàng 2: Panel chứa nội dung thay đổi
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Các panel nội dung
        JPanel panelKhoaBieu = createPanel(Color.LIGHT_GRAY, "Khóa biểu nội dung");
        JPanel panelTodoList = createPanel(Color.CYAN, "To-do List nội dung");
        JPanel panelNhatKy = createPanel(Color.PINK, "Nhật ký nội dung");

        mainPanel.add(panelKhoaBieu, "KhoaBieu");
        mainPanel.add(panelTodoList, "TodoList");
        mainPanel.add(panelNhatKy, "NhatKy");

        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(mainPanel, gbc);

        // Xử lý sự kiện chuyển đổi nội dung
        btnKhoaBieu.addActionListener(e -> cardLayout.show(mainPanel, "KhoaBieu"));
        btnTodoList.addActionListener(e -> cardLayout.show(mainPanel, "TodoList"));
        btnNhatKy.addActionListener(e -> cardLayout.show(mainPanel, "NhatKy"));
    }

    private JPanel createPanel(Color color, String text) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.add(new JLabel(text));
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GridBagPanelDemo().setVisible(true);
        });
    }
}
