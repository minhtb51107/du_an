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

public class PanelManager extends JFrame {
//    private JPanel parentPanel;
//    private int panelCount = 0;
//
//    public PanelManager() {
//        setTitle("Quản lý Panel");
//        setSize(400, 300);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        // Tạo panel chứa nút điều khiển
//        JPanel controls = new JPanel();
//        JButton addButton = new JButton("Thêm Panel");
//        JButton removeButton = new JButton("Xóa Panel");
//        controls.add(addButton);
//        controls.add(removeButton);
//
//        // Panel cha chứa các panel con
//        parentPanel = new JPanel();
//        parentPanel.setLayout(new FlowLayout());
//        parentPanel.setBackground(Color.LIGHT_GRAY);
//
//        // Thêm sự kiện cho nút "Thêm Panel"
//        addButton.addActionListener(e -> addNewPanel());
//
//        // Thêm sự kiện cho nút "Xóa Panel"
//        removeButton.addActionListener(e -> removeLastPanel());
//
//        // Sắp xếp layout
//        setLayout(new BorderLayout());
//        add(controls, BorderLayout.NORTH);
//        add(parentPanel, BorderLayout.CENTER);
//    }
//
//    private void addNewPanel() {
//        JPanel newPanel = new JPanel();
//        newPanel.setPreferredSize(new Dimension(100, 50));
//        newPanel.setBackground(new Color((int) (Math.random() * 0x1000000))); // Random màu
//        newPanel.setName("Panel " + (++panelCount));
//        parentPanel.add(newPanel);
//        parentPanel.revalidate();
//        parentPanel.repaint();
//    }
//
//    private void removeLastPanel() {
//        if (parentPanel.getComponentCount() > 0) {
//            Component lastPanel = parentPanel.getComponent(parentPanel.getComponentCount() - 1);
//            parentPanel.removeAll();
//            panelCount--;
//            parentPanel.revalidate();
//            parentPanel.repaint();
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new PanelManager().setVisible(true);
//        });
//    }
}
