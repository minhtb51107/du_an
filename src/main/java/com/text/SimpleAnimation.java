/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text;

/**
 *
 * @author PC
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleAnimation extends JFrame {
    private JButton button;
    private int xPosition = 10; // Vị trí ban đầu

    public SimpleAnimation() {
        setTitle("Simple Animation with Timer");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Tắt layout manager để tự do di chuyển component

        button = new JButton("Move Me");
        button.setBounds(xPosition, 100, 100, 50);
        add(button);

        // Tạo Timer để cập nhật vị trí của button mỗi 16ms (tương đương 60 FPS)
        Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xPosition += 2; // Tăng vị trí X để di chuyển nút sang phải
                if (xPosition > getWidth()) {
                    xPosition = -100; // Nếu ra khỏi màn hình thì quay lại từ trái
                }
                button.setBounds(xPosition, 100, 100, 50);
            }
        });
        timer.start(); // Bắt đầu chạy hoạt ảnh
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleAnimation().setVisible(true);
        });
    }
}

