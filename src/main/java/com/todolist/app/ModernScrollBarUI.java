package com.todolist.app;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class ModernScrollBarUI extends BasicScrollBarUI {
    private final int THUMB_SIZE = 8;
    
    @Override
    protected JButton createDecreaseButton(int orientation) {
        return createZeroButton();
    }
    
    @Override
    protected JButton createIncreaseButton(int orientation) {
        return createZeroButton();
    }
    
    private JButton createZeroButton() {
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(0, 0));
        button.setMinimumSize(new Dimension(0, 0));
        button.setMaximumSize(new Dimension(0, 0));
        return button;
    }
    
    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        // Không vẽ track
    }
    
    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) {
            return;
        }
        
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        Color thumbColor = scrollbar.getComponentOrientation().isLeftToRight() 
            ? new Color(200, 200, 200, 100)
            : new Color(160, 160, 160, 100);
        
        g2.setColor(thumbColor);
        g2.fillRoundRect(
            thumbBounds.x,
            thumbBounds.y,
            THUMB_SIZE,
            thumbBounds.height,
            THUMB_SIZE,
            THUMB_SIZE
        );
        
        g2.dispose();
    }
    
    @Override
    protected void setThumbBounds(int x, int y, int width, int height) {
        super.setThumbBounds(x, y, THUMB_SIZE, height);
        scrollbar.repaint();
    }
}
