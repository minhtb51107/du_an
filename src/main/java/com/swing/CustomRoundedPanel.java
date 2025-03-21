package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class CustomRoundedPanel extends JPanel {
            
    public CustomRoundedPanel(Color color) {
        setLayout(new BorderLayout()); // Chia layout 3 phần (trái, giữa, phải)

        RoundedTopPanel centerPanel = new RoundedTopPanel(color);
        RoundedLeftPanel leftPanel = new RoundedLeftPanel(color);
        RoundedRightPanel rightPanel = new RoundedRightPanel(color);

        add(centerPanel, BorderLayout.CENTER);
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);
    }
}

// 🟦 Panel bo tròn 2 góc trên
class RoundedTopPanel extends JPanel {
    Color panelColor;
    public RoundedTopPanel(Color color) {
                this.panelColor = color;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int arcSize = 40;

        Path2D.Double path = new Path2D.Double();
        path.moveTo(arcSize, 0);
        path.quadTo(0, 0, 0, arcSize);
        path.lineTo(0, height);
        path.lineTo(width, height);
        path.lineTo(width, arcSize);
        path.quadTo(width, 0, width - arcSize, 0);
        path.closePath();

        g2d.setColor(panelColor); // Màu xanh dương
        g2d.fill(path);   
    }
}

// ⬜ Panel bo góc dưới bên phải
class RoundedLeftPanel extends JPanel {
        private Color panelColor;
            
    public RoundedLeftPanel(Color color) {
        this.panelColor = color;
        setOpaque(false);
        setPreferredSize(new Dimension(50, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int arcSize = 40;

        g2d.setColor(panelColor); 
        g2d.fillRect(0, 0, width, height);

        // Bo góc dưới bên phải
        Path2D.Double path = new Path2D.Double();
        path.moveTo(width, height - arcSize);
        path.quadTo(width, height, width - arcSize, height);
        path.lineTo(0, height);
        path.lineTo(0, 0);
        path.lineTo(width, 0);
        path.closePath();

        g2d.setColor(new Color(255, 255, 255)); 
        g2d.fill(path);
    }
}

// ⬜ Panel bo góc dưới bên trái
class RoundedRightPanel extends JPanel {
            private Color panelColor;
            
    public RoundedRightPanel(Color color) {
                this.panelColor = color;
        setOpaque(false);
        setPreferredSize(new Dimension(50, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int arcSize = 40;

        g2d.setColor(panelColor); 
        g2d.fillRect(0, 0, width, height);

        // Bo góc dưới bên trái
        Path2D.Double path = new Path2D.Double();
        path.moveTo(0, height - arcSize);
        path.quadTo(0, height, arcSize, height);
        path.lineTo(width, height);
        path.lineTo(width, 0);
        path.lineTo(0, 0);
        path.closePath();

        g2d.setColor(new Color(255, 255, 255)); 
        g2d.fill(path);
    }
}
