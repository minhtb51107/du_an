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
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;
import java.util.*;

public class ClickSimulator extends JFrame {
    private final Map<Integer, Integer> monthClickCounts = new HashMap<>();
    private final List<JPanel> panels = new ArrayList<>();

    public ClickSimulator() {
        setTitle("Click Simulator");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Tạo 4 panel tương ứng với 4 tháng
        for (int i = 0; i < 4; i++) {
            JPanel panel = createPanelMonth(50 + i * 100, 100, i);
            panels.add(panel);
            add(panel);
        }

        // Giả lập click chuột sau khi tạo GUI
        SwingUtilities.invokeLater(this::simulateClicks);
    }

    private JPanel createPanelMonth(int x, int y, int i) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(x, y, 50, 50);
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        monthClickCounts.put(i, 0);

        // Hiển thị số lần click
        JLabel label = new JLabel("0", SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        panel.add(label, BorderLayout.CENTER);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int currentClicks = monthClickCounts.getOrDefault(i, 0);
                if (currentClicks < 4) {
                    monthClickCounts.put(i, currentClicks + 1);
                    label.setText(String.valueOf(currentClicks + 1));

                    if (currentClicks + 1 == 4) {
                        panel.setBackground(Color.YELLOW); // Đổi màu sau 4 lần click
                    }
                }
            }
        });

        return panel;
    }

    private void simulateClicks() {
        List<int[]> clickSimulationData = Arrays.asList(
            new int[]{0, 2},  // Panel 0 click 2 lần
            new int[]{1, 3},  // Panel 1 click 3 lần
            new int[]{2, 1},  // Panel 2 click 1 lần
            new int[]{3, 4}   // Panel 3 click 4 lần
        );

        for (int[] data : clickSimulationData) {
            int index = data[0];  
            int clickTimes = data[1];  
            JPanel panel = panels.get(index); // Lấy panel đúng chỉ số

            for (int j = 0; j < clickTimes; j++) {
                panel.dispatchEvent(new MouseEvent(panel, MouseEvent.MOUSE_CLICKED, 
                                                   System.currentTimeMillis(), 0, 0, 0, 1, false));
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClickSimulator().setVisible(true));
    }
}
