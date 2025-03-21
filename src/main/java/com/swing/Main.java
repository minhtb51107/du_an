/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swing;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author PC
 */
public class Main {
     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Test RoundedPanel");
            frame.setLayout(new BorderLayout());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 110);
            frame.setLocationRelativeTo(null);

            // Tạo RoundedPanel với màu xanh dương
            JPanel panel1 = new JPanel();
            panel1.setLayout(new BorderLayout());
            panel1.setBounds(10, 10, 50, 50);
            panel1.setBackground(Color.red);
            
            JPanel panel2 = new JPanel();
            panel2.setLayout(new BorderLayout());
            panel1.setBackground(Color.GREEN);

//            JButton buttons = new JButton("abc");
//           panel1.add(buttons);
            // Thêm panel vào frame
            frame.add(panel1, BorderLayout.CENTER);
            panel1.add(panel2, BorderLayout.NORTH);
            frame.setVisible(true);
        });
}
}
