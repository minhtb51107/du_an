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

public class ImagePanel extends JPanel {
    private ImageIcon icon;

    public ImagePanel(String imagePath, int width, int height) {
        setPreferredSize(new Dimension(width, height));
        setLayout(new BorderLayout());
        setOpaque(false); // Ẩn nền của label

        // Load hình ảnh từ đường dẫn
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(imagePath));
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);

        // Tạo JLabel chứa icon
        JLabel label = new JLabel(icon);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setOpaque(false); // Ẩn nền của label
 

        add(label, BorderLayout.CENTER);
    }
}




