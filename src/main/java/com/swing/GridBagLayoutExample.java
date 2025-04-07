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

public class GridBagLayoutExample {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("GridBagLayout Example");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(400, 400);
//            
//            JPanel mainPanel = new JPanel(new GridBagLayout());
//            GridBagConstraints gbc = new GridBagConstraints();
//            
//            gbc.gridx = 0;
//            gbc.gridy = 0;
//            gbc.fill = GridBagConstraints.HORIZONTAL;
//            gbc.weightx = 1.0;
//            gbc.fill = GridBagConstraints.HORIZONTAL;
//            JPanel PanelA = new JPanel(new BorderLayout());
//            JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0)); // Giảm khoảng cách để panelB gần panel2 hơn
//            PanelA.add(panel, BorderLayout.SOUTH);
//            
//            JButton[] buttons = new JButton[3];
//            for (int i = 0; i < 3; i++) {
//                buttons[i] = new JButton("Button " + (i + 1));
//                buttons[i].setContentAreaFilled(false); // Xóa nền
//                buttons[i].setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // Xóa viền gốc
//                panel.add(buttons[i]);
//            }
//            
//            panel.setBackground(Color.BLUE);
//            mainPanel.add(PanelA, gbc);
//            
//            // Panel B - Hiển thị bên trong nút bấm
//// Panel B - Hiển thị trong JButton với kiểu CustomRoundedPanel
//RoundedPanel1 panelB = new RoundedPanel1(10);
//
//            panelB.setLayout(new FlowLayout());
//            panelB.add(new JLabel(buttons[0].getText())); // Mặc định hiển thị trên nút đầu tiên
//            
//            buttons[0].setLayout(new BorderLayout());
//            buttons[0].add(panelB, BorderLayout.CENTER);
//            
//            ActionListener buttonListener = new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JButton clickedButton = (JButton) e.getSource();
//                    for (JButton button : buttons) {
//                        button.removeAll(); // Xóa panelB khỏi tất cả các nút
//                    }
//                    
//                    clickedButton.setLayout(new BorderLayout());
//                    clickedButton.add(panelB, BorderLayout.CENTER); // Đưa panelB vào trong nút
//                    panelB.removeAll();
//                    panelB.add(new JLabel(clickedButton.getText())); // Hiển thị tên nút
//                    panelB.setVisible(true);
//                    clickedButton.revalidate();
//                    clickedButton.repaint();
//                }
//            };
//            
//            for (JButton button : buttons) {
//                button.addActionListener(buttonListener);
//            }
//            
//            // Hàng 2 - Chiều cao 0.8 (sát với PanelA)
//            gbc.gridy = 1;
//            gbc.weighty = 1.0;
//            gbc.fill = GridBagConstraints.BOTH;
//            JPanel panel2 = new JPanel();
//            panel2.setBackground(Color.GREEN);
//            mainPanel.add(panel2, gbc);
//            
//            frame.add(mainPanel);
//            frame.setVisible(true);
//        });
//    }
}