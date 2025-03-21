/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.data.DataHopDangKyKhoaHoc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class HopDangKyKhoaHoc extends JPanel {
    
    public HopDangKyKhoaHoc(int index) {
        setOpaque(false);
        setBorder(null);
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Thêm padding
        setPreferredSize(new Dimension(60, 100)); // Chiều rộng 200px, chiều cao 100px
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Cấu hình mặc định
        gbc.gridx = 0;
        gbc.weightx = 1.0; // Kéo giãn theo chiều ngang
        gbc.anchor = GridBagConstraints.WEST; // Căn trái
        gbc.fill = GridBagConstraints.HORIZONTAL; // Giãn theo chiều ngang
        gbc.insets = new Insets(5, 0, 5, 0); // Khoảng cách giữa các hàng

        // Tiêu đề khóa học (Hàng đầu tiên)
        gbc.gridy = 0;
        JLabel courseTitle = new JLabel(DataHopDangKyKhoaHoc.getTitle(index));
        courseTitle.setFont(new Font("Arial", Font.BOLD, 26));
              courseTitle.setForeground(Color.BLACK);
        add(courseTitle, gbc);
        
        // Khoảng trống để mô tả nằm giữa
        gbc.gridy = 1;
        gbc.weighty = 0.2; // Tạo khoảng trống trước mô tả
        add(new JLabel(), gbc);

        // Mô tả ngắn gọn (Phần giữa)
        gbc.gridy = 2;
        gbc.weighty = 0.1; // Tạo khoảng trống trước mô tả
        JLabel courseDescription = new JLabel(DataHopDangKyKhoaHoc.getDescription(index));
        courseDescription.setFont(new Font("Arial", Font.PLAIN, 16));
        courseDescription.setForeground(Color.BLACK);
        add(courseDescription, gbc);

        // Thời lượng khóa học
        gbc.gridy = 3;
        JLabel durationLabel = new JLabel(DataHopDangKyKhoaHoc.getDuration(index));
                durationLabel.setFont(new Font("Arial", Font.PLAIN, 14));
                     durationLabel.setForeground(Color.BLACK);
        add(durationLabel, gbc);

        // Số lượng bài học
        gbc.gridy = 4;
        JLabel lessonsLabel = new JLabel(DataHopDangKyKhoaHoc.getLessons(index));
         lessonsLabel.setFont(new Font("Arial", Font.PLAIN, 14));
         lessonsLabel.setForeground(Color.BLACK);
        add(lessonsLabel, gbc);
        
        // Khoảng trống để nút đăng ký nằm ở dưới cùng
        gbc.gridy = 5;
        gbc.weighty = 0.5; // Tạo khoảng cách giữa thông tin và nút đăng ký

        add(new JLabel(), gbc);

        // Nút đăng ký (Hàng cuối)
        gbc.gridy = 6;
        gbc.weighty = 0;
        gbc.weightx = 0.2;
        gbc.anchor = GridBagConstraints.EAST; // Căn giữa nút
        
        JButton registerButton = new JButton("Đăng ký ngay");
        registerButton.setFocusPainted(false);
        registerButton.setBackground(new Color(255,255,255,255));
        registerButton.setForeground(Color.BLACK);
        registerButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setBorder(null);

        registerButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Thêm padding
         
        JPanel rowPanel = new JPanel(new BorderLayout());
        
        rowPanel.add(registerButton, BorderLayout.EAST);
        rowPanel.setOpaque(false);
        
        add(rowPanel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0; // Tạo khoảng cách giữa thông tin và nút đăng ký

        add(new JLabel(), gbc);
    }
}