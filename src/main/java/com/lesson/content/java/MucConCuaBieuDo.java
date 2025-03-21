/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
class MucConCuaBieuDo extends JPanel {
    private static final Color[] COLORS = {
        new Color(255, 99, 132),   // Đỏ hồng
        new Color(54, 162, 235),   // Xanh dương
        new Color(255, 206, 86),   // Vàng
        new Color(75, 192, 192),   // Xanh ngọc
        new Color(153, 102, 255),  // Tím
        new Color(255, 159, 64)    // Cam
    };

    public MucConCuaBieuDo() {
        setLayout(new GridBagLayout());
        setOpaque(false);
        setBorder(null);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(10, 5, 10, 5); // Thêm padding giữa các hàng
        
        for (int i = 0; i < 3; i++) {
            gbc.gridy = i;
            for (int j = 0; j < 2; j++) {
                gbc.gridx = j;
                int index = i * 2 + j;
                if (index < COLORS.length) {
                    add(createRowPanel(index + 1, COLORS[index]), gbc);
                }
            }
        }
    }

    private JPanel createRowPanel(int lessonNumber, Color color) {
        JPanel rowPanel = new JPanel(new GridBagLayout());
        rowPanel.setOpaque(false);
        rowPanel.setBorder(null);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        
        gbc.gridx = 0;
        gbc.weightx = 0.2;
        JPanel colorPanel = new JPanel();

        colorPanel.setBackground(color);
        rowPanel.add(colorPanel, gbc);
        
        gbc.gridx = 1;
        gbc.weightx = 0.6;
        JLabel titleLabel = new JLabel("Bài " + lessonNumber, SwingConstants.LEFT);
        titleLabel.setForeground(Color.WHITE);
        rowPanel.add(titleLabel, gbc);
                titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5)); // Tạo khoảng trống xung quanh
        
        gbc.gridx = 2;
        gbc.weightx = 0.2;
        JLabel percentageLabel = new JLabel("0%/100%", SwingConstants.RIGHT);
                percentageLabel.setForeground(Color.WHITE);
        rowPanel.add(percentageLabel, gbc);
        
        return rowPanel;
    }
}