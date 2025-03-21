package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class SmoothPanelSlide extends JFrame {
//    private CustomRoundedPanel panel1;
//    private int panelX = 50; // Vị trí ban đầu của panel
//    private Timer timer;
//    private int targetX;
//
//    public SmoothPanelSlide() {
//        setTitle("Smooth Panel Slide");
//        setSize(500, 400);
//        setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // 🔹 Tạo panel1
//        panel1 = new CustomRoundedPanel(new Color(100, 149, 237));
//        panel1.setBounds(panelX, 100, 150, 100);
//        panel1.setLayout(null); // Tắt layout để đặt nút theo tọa độ
//        add(panel1);
//
//        // 🔹 Tạo 3 nút và đặt chúng vào bên trong panel1
//        JButton button1 = createButton(20, "Nút 1", 50);
//        JButton button2 = createButton(20, "Nút 2", 200);
//        JButton button3 = createButton(20, "Nút 3", 350);
//
//        panel1.add(button1);
//        panel1.add(button2);
//        panel1.add(button3);
//
//        setVisible(true);
//    }
//
//    // 🔹 Tạo nút
//    private JButton createButton(int y, String text, int destinationX) {
//        JButton button = new JButton(text);
//        button.setBounds(35, y, 80, 30); // Căn giữa trong panel
//        button.setBackground(Color.WHITE);
//        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        button.setFocusPainted(false);
//        
//        button.addActionListener(e -> animatePanel(destinationX));
//
//        return button;
//    }
//
//    // 🔹 Di chuyển panel1
//    private void animatePanel(int destinationX) {
//        targetX = destinationX;
//
//        if (timer != null && timer.isRunning()) {
//            timer.stop();
//        }
//
//        timer = new Timer(5, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (panelX < targetX) {
//                    panelX += 5; // Tăng tốc độ di chuyển
//                } else if (panelX > targetX) {
//                    panelX -= 5;
//                } else {
//                    ((Timer) e.getSource()).stop();
//                }
//                panel1.setLocation(panelX, 100);
//            }
//        });
//
//        timer.start();
//    }
//
//    public static void main(String[] args) {
//        new SmoothPanelSlide();
//    }
//}
