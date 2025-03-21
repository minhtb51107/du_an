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
import java.awt.event.*;

public class DragPanel extends JFrame {
    private JPanel panelContainer;
    private int startX;
    private int panelX;

    private String[] titles = {"Panel 1", "Panel 2", "Panel 3", "Panel 4", "Panel 5", "Panel 6"};
    private String[] descriptions = {
        "Mô tả 1", "Mô tả 2", "Mô tả 3", 
        "Mô tả 4", "Mô tả 5", "Mô tả 6"
    };

    public DragPanel() {
        setTitle("Kéo Để Lướt Ô Vuông");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        panelContainer = new JPanel();
        panelContainer.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelContainer.setBounds(0, 50, 1000, 100);

        for (int i = 0; i < 6; i++) {
            RoundedPanel square = new RoundedPanel(10);
            square.setPreferredSize(new Dimension(150, 80));
            square.setBackground(new Color(37, 36, 41, 205));
            square.setLayout(new BorderLayout());

            // Panel 2 (chứa tiêu đề và nút)
            JPanel topPanel = new JPanel(new GridLayout(1, 2));  
            topPanel.setOpaque(false);  // Đảm bảo không bị nền xám

            JLabel label = new JLabel(titles[i], SwingConstants.CENTER);
            label.setForeground(Color.WHITE);

            JButton button = new JButton(">");
            button.setPreferredSize(new Dimension(30, 20));  // Làm nhỏ nút
            final int index = i;
            button.addActionListener(e -> handleButtonClick(index));

            topPanel.add(label);
            topPanel.add(button);

            // Panel 1 (chứa mô tả)
            JLabel descriptionLabel = new JLabel(descriptions[i], SwingConstants.CENTER);
            descriptionLabel.setForeground(Color.LIGHT_GRAY);

            // Thêm hai panel vào square
            square.add(topPanel, BorderLayout.NORTH);
            square.add(descriptionLabel, BorderLayout.CENTER);

            panelContainer.add(square);
        }

        panelContainer.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                panelX = panelContainer.getX();
            }
        });

        panelContainer.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getX() - startX;
                int newX = panelX + deltaX;
                if (newX > 0) newX = 0;
                if (newX < getWidth() - panelContainer.getWidth()) {
                    newX = getWidth() - panelContainer.getWidth();
                }
                panelContainer.setLocation(newX, panelContainer.getY());
            }
        });

        add(panelContainer);
    }

    private void handleButtonClick(int index) {
        JOptionPane.showMessageDialog(this, "Bạn đã nhấn vào " + titles[index]);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DragPanel().setVisible(true));
    }
}

