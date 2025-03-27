/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baihoc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
//public class GridBagLayoutExample extends JPanel {
//
//        private JPanel mainPanel;
//        private DanhSachBaiHoc danhSachBaiHoc;
//
//        public GridBagLayoutExample() {
//            setLayout(new BorderLayout()); // Sử dụng BorderLayout cho việc mở rộng toàn bộ
//
//            // Panel chứa 2 hàng
//            JPanel topContainerPanel = new JPanel(new GridBagLayout());
//            GridBagConstraints topGbc = new GridBagConstraints();
//            topGbc.gridx = 0;
//            topGbc.fill = GridBagConstraints.BOTH;
//
//            // Header Panel (Hàng 1 - 10%)
//            JPanel headerPanel = new JPanel();
//            headerPanel.setBackground(Color.BLUE);
//            topGbc.gridy = 0;
//            topGbc.weightx = 1.0;
//            topGbc.weighty = 0.1;
//            topContainerPanel.add(headerPanel, topGbc);
//
//            // Main Panel (Hàng 2 - 90%)
//            mainPanel = new JPanel(new GridBagLayout());
//            GridBagConstraints gbc = new GridBagConstraints();
//            gbc.insets = new Insets(10, 10, 10, 10);
//            gbc.fill = GridBagConstraints.BOTH;
//
//            // Left Panel
//            JPanel leftPanel = new JPanel(new GridBagLayout());
//            leftPanel.setBackground(Color.LIGHT_GRAY);
//            GridBagConstraints leftGbc = new GridBagConstraints();
//            leftGbc.weightx = 1.0;
//            leftGbc.weighty = 1.0;
//            leftGbc.fill = GridBagConstraints.BOTH;
//
//            // Top Panel
//            JPanel topPanel = new JPanel();
//            topPanel.setBackground(Color.CYAN);
//            leftGbc.gridx = 0;
//            leftGbc.gridy = 0;
//            leftPanel.add(topPanel, leftGbc);
//
//            // Bottom Panel
//            JPanel bottomPanel = new JPanel();
//            bottomPanel.setBackground(Color.MAGENTA);
//            leftGbc.gridx = 0;
//            leftGbc.gridy = 1;
//            leftPanel.add(bottomPanel, leftGbc);
//
//            danhSachBaiHoc = new DanhSachBaiHoc(content);
//            bottomPanel.add(danhSachBaiHoc, BorderLayout.CENTER);
//            bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
//
//            // Thêm Left Panel vào Main Panel
//            gbc.gridx = 0;
//            gbc.gridy = 0;
//            gbc.weightx = 0.3;
//            gbc.weighty = 1.0;
//            mainPanel.add(leftPanel, gbc);
//
//            // Right Panel
//            JPanel rightPanel = new JPanel();
//            rightPanel.setBackground(Color.ORANGE);
//            gbc.gridx = 1;
//            gbc.weightx = 0.7;
//            mainPanel.add(rightPanel, gbc);
//
//            // Thêm Main Panel vào topContainerPanel
//            topGbc.gridy = 1;
//            topGbc.weighty = 0.9;
//            topContainerPanel.add(mainPanel, topGbc);
//
//            add(topContainerPanel, BorderLayout.CENTER); // Đảm bảo toàn bộ giao diện được hiển thị
//        }
//    }