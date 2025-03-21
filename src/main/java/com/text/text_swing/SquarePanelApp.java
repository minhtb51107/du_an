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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class SquarePanelApp extends JPanel {
    private final List<Line> lines = new ArrayList<>();
    private final int mainLength = 100;
    private final int halfLength = mainLength / 2;

    public SquarePanelApp() {
        setLayout(null);
        setBackground(Color.WHITE);
        
        JPanel squarePanel = createSquarePanel(200, 200);
        add(squarePanel);
    }

    private JPanel createSquarePanel(int x, int y) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(x - 25, y - 25, 50, 50);
        
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addLinesFromPanel(panel);
                repaint();
            }
        });
        return panel;
    }

    private void addLinesFromPanel(JPanel panel) {
        Point panelLocation = panel.getLocation();
        int centerX = panelLocation.x + panel.getWidth() / 2;
        int centerY = panelLocation.y + panel.getHeight() / 2;
        
        // Đoạn ngang từ tâm panel
        lines.add(new Line(centerX, centerY, centerX + mainLength, centerY));
        // Đoạn dọc từ tâm panel
        lines.add(new Line(centerX, centerY, centerX, centerY + mainLength));
        // Đoạn ngang ngắn hơn
        int newX = centerX + halfLength;
        lines.add(new Line(centerX, centerY, newX, centerY));
        // Đoạn dọc ngắn hơn ở đầu phải đoạn ngang nhỏ
        lines.add(new Line(newX, centerY, newX, centerY + halfLength));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        for (Line line : lines) {
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Square Panel App");
        SquarePanelApp panel = new SquarePanelApp();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SquarePanelApp::createAndShowGUI);
    }
}

class Line {
    int x1, y1, x2, y2;
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
