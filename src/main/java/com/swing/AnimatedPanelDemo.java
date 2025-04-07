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

public class AnimatedPanelDemo {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Animated Panel");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(400, 300);
//            frame.setLayout(null);
//
//            JPanel buttonPanel = new JPanel();
//            buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
//            buttonPanel.setBounds(50, 100, 300, 50);
//            
//            JButton btn1 = new JButton("1");
//            JButton btn2 = new JButton("2");
//            JButton btn3 = new JButton("3");
//            buttonPanel.add(btn1);
//            buttonPanel.add(btn2);
//            buttonPanel.add(btn3);
//            
//            frame.add(buttonPanel);
//            
//            CustomRoundedPanel indicator = new CustomRoundedPanel(Color.BLUE);
//            indicator.setBounds(50, 95, 50, 10);
//            frame.add(indicator);
//            
//            btn1.addActionListener(e -> moveIndicator(indicator, btn1, frame));
//            btn2.addActionListener(e -> moveIndicator(indicator, btn2, frame));
//            btn3.addActionListener(e -> moveIndicator(indicator, btn3, frame));
//            
//            frame.setVisible(true);
//        });
//    }
//
//    private static void moveIndicator(CustomRoundedPanel indicator, JButton target, JFrame frame) {
//        int startX = indicator.getX();
//        int endX = target.getX() + target.getWidth() / 2 - indicator.getWidth() / 2;
//        Timer timer = new Timer(5, new ActionListener() {
//            int currentX = startX;
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (Math.abs(currentX - endX) < 2) {
//                    indicator.setLocation(endX, indicator.getY());
//                    ((Timer) e.getSource()).stop();
//                } else {
//                    currentX += (endX - currentX) / 5;
//                    indicator.setLocation(currentX, indicator.getY());
//                }
//                frame.repaint();
//            }
//        });
//        timer.start();
//    }
}

