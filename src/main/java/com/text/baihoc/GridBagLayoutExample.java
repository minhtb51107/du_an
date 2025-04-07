/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text.baihoc;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {

    public GridBagLayoutExample() {
        setTitle("GridBagLayout Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;

        // Cột 1: Left Panel với 2 hàng 1 cột
        JPanel leftPanel = new JPanel(new GridBagLayout());
        leftPanel.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints leftGbc = new GridBagConstraints();
        leftGbc.fill = GridBagConstraints.BOTH;
        leftGbc.weightx = 1.0;
        leftGbc.weighty = 1.0;

        // Panel 1 trong Left Panel
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.CYAN);
        leftGbc.gridx = 0;
        leftGbc.gridy = 0;
        leftPanel.add(topPanel, leftGbc);

        // Panel 2 trong Left Panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.MAGENTA);
        leftGbc.gridx = 0;
        leftGbc.gridy = 1;
        leftPanel.add(bottomPanel, leftGbc);

        // Thêm Left Panel vào Main Panel (Cột 1)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 1.0;
        mainPanel.add(leftPanel, gbc);

        // Cột 2: Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.ORANGE);
        gbc.gridx = 1;
        gbc.weightx = 0.5;
        mainPanel.add(rightPanel, gbc);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GridBagLayoutExample().setVisible(true);
        });
    }
} 
