package com.swing;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class Panel1 extends JPanel {
//    public Panel1() {
//        setOpaque(false); // Đảm bảo nền trong suốt
//    }
//
//@Override
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g;
//        
//        // Đặt màu nền là màu của JPanel
//        g2.setColor(getBackground());
//        
//        // Bật chế độ khử răng cưa để vẽ mượt hơn
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        
//        // Gradient từ xanh dương (#4568dc) sang tím (#b06ab3)
//        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#4568dc"), 
//                                             0, getHeight(), Color.decode("#b06ab3"));
//        g2.setPaint(gp);
//        
//        // Vẽ hình chữ nhật bo tròn với góc bo là 20px
//        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
//        super.paintComponent(g);
//    }
}
