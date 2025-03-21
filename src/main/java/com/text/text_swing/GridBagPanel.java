/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text.text_swing;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author PC
 */
public class GridBagPanel extends JFrame{
    private JPanel mainPanel; // Panel chứa nội dung sẽ thay đổi
    private CardLayout cardLayout; // Layout giúp chuyển đổi nội dung

    public GridBagPanel() {
setTitle("Quản lý công việc");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Hàng 1: Thanh Menu
        JPanel menuPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));

        // Tạo từng button trong panel riêng
        JPanel panelKhoaBieu = createButtonPanel("Khóa biểu", "KhoaBieu");
        JPanel panelTodoList = createButtonPanel("To-do List", "TodoList");
        JPanel panelNhatKy = createButtonPanel("Nhật ký", "NhatKy");

        menuPanel.add(panelKhoaBieu);
        menuPanel.add(panelTodoList);
        menuPanel.add(panelNhatKy);

        // Định vị Menu ở hàng 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(menuPanel, gbc);

        // Hàng 2: Panel chứa nội dung thay đổi
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(createContentPanel(Color.LIGHT_GRAY, "Khóa biểu nội dung"), "KhoaBieu");
        mainPanel.add(createContentPanel(Color.CYAN, "To-do List nội dung"), "TodoList");
        mainPanel.add(createContentPanel(Color.PINK, "Nhật ký nội dung"), "NhatKy");

        // Định vị Panel nội dung ở hàng 2
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(mainPanel, gbc);
    }

    // Tạo Panel chứa button (có viền bo góc)
    private JPanel createButtonPanel(String text, String panelName) {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true)); // Viền bo
        buttonPanel.setBackground(Color.WHITE);

        JButton button = new JButton(text);
        button.setBorderPainted(false); // Xóa viền
        button.setContentAreaFilled(false); // Xóa nền
        button.setFocusPainted(false);
        button.setOpaque(false);
        button.setFont(new Font("Arial", Font.BOLD, 12));

        // Thêm hiệu ứng khi di chuột
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                buttonPanel.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseExited(MouseEvent e) {
                buttonPanel.setBackground(Color.WHITE);
            }
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(mainPanel, panelName);
            }
        });

        buttonPanel.add(button);
        return buttonPanel;
    }

    // Tạo Panel nội dung khi bấm vào button
    private JPanel createContentPanel(Color color, String text) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.add(new JLabel(text));
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GridBagPanelDemo().setVisible(true));
    }
}
