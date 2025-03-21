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

public class RoundedCornerTest extends JPanel {
    
    public RoundedCornerTest() {
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        
        int panelX = 150, panelY = 150, panelSize = 50;
        int lineLength = 100;
        
        // Vẽ panel vuông
        g2d.setColor(Color.BLACK);
        g2d.fillRect(panelX, panelY, panelSize, panelSize);
        
        // Tính toán điểm giữa panel
        int centerX = panelX + panelSize / 2;
        int centerY = panelY + panelSize / 2;
        
        // Vẽ đoạn thẳng ngang từ tâm panel
        g2d.setColor(Color.BLUE);
        g2d.drawLine(centerX, centerY, centerX + lineLength, centerY);
        
        // Vẽ đoạn thẳng dọc từ tâm panel
        g2d.setColor(Color.RED);
        g2d.drawLine(centerX, centerY, centerX, centerY + lineLength);
        
        // Vẽ góc vuông thay vì bo tròn
        g2d.setColor(Color.GREEN);
        g2d.drawLine(centerX, centerY, centerX + lineLength / 2, centerY); // Đường ngang nửa
        g2d.drawLine(centerX + lineLength / 2, centerY, centerX + lineLength / 2, centerY + lineLength / 2); // Đường dọc nửa
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rounded Corner Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RoundedCornerTest());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

