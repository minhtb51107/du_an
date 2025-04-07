package com.babe;

import com.babe.model.UserProfile;
import com.babe.screens.SettingsScreen;
import com.babe.theme.AppTheme;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Đảm bảo UI chạy trong Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            try {
                // Thiết lập giao diện
                AppTheme.setupTheme();
                
                // Tạo frame chính
                JFrame frame = new JFrame("Babe Learning");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1024, 768);
                frame.setMinimumSize(new Dimension(800, 600));
                frame.setLocationRelativeTo(null);
                
                // Tạo profile mẫu
                UserProfile userProfile = new UserProfile();
                
                // Tạo và thêm màn hình cài đặt
                SettingsScreen settingsScreen = new SettingsScreen(userProfile);
                frame.add(settingsScreen);
                
                // Hiển thị frame
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
} 