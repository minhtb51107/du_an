/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.data.DanhSachBaiHocConData;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
public class DanhSachBaiHocCon extends JPanel {

    private JPanel containerPanel;
    private JScrollPane scrollPane;
    private int startY;

    private String[] icons = {
        "", "", "", "", "",
        "", "", "", "", ""
    };

    public DanhSachBaiHocCon(String content) {
//                System.out.println(content);
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);
        setBorder(BorderFactory.createEmptyBorder());

        containerPanel = new JPanel(new GridBagLayout());
        containerPanel.setBackground(null);
        containerPanel.setOpaque(false);

        scrollPane = new JScrollPane(containerPanel);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.setViewportBorder(null);

        add(scrollPane, BorderLayout.CENTER);

        addDragScrolling();
        addSampleItems(content);
    }

    public void addSampleItems(String content) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Lấy danh sách tiêu đề từ hashmap
        String[] titles = DanhSachBaiHocConData.getTitles(content);

        for (int i = 0; i < titles.length; i++) {
            containerPanel.add(createItemPanel(i, content), gbc);
            containerPanel.revalidate();
            containerPanel.repaint();
            gbc.gridy++;
        }
    }

    private JPanel createItemPanel(int index, String content) {

        String[] descriptions = DanhSachBaiHocConData.getDescriptions(content);

        // Lấy danh sách tiêu đề từ hashmap
        String[] titles = DanhSachBaiHocConData.getTitles(content);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(255, 99, 132));
        panel.setPreferredSize(new Dimension(350, 70));
        panel.setBorder(null);

        GridBagConstraints gbc = new GridBagConstraints();

        // Cột 1 - Icon
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.weightx = 0.3;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource(icons[index])));
        panel.add(iconLabel, gbc);

// Cột 2 - Nội dung (Tiêu đề & Mô tả)
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.6;
        gbc.anchor = GridBagConstraints.WEST; // Căn trái
        gbc.insets = new Insets(5, 10, 5, 10); // Đảm bảo lề đều nhau

// Panel bọc nội dung
        JPanel textPanel = new JPanel(new GridBagLayout());
        textPanel.setOpaque(false);

// GridBagConstraints cho textPanel
        GridBagConstraints gbcText = new GridBagConstraints();
        gbcText.gridx = 0;
        gbcText.gridy = 0;
        gbcText.anchor = GridBagConstraints.WEST; // Căn trái
        gbcText.weightx = 1; // Đảm bảo mở rộng hết phần còn lại
        gbcText.fill = GridBagConstraints.HORIZONTAL;

// Tiêu đề
        JLabel titleLabel = new JLabel(titles[index]);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        titleLabel.setPreferredSize(new Dimension(250, 20)); // Đảm bảo độ rộng cố định

// Mô tả
        JLabel descLabel = new JLabel(descriptions[index]);
        descLabel.setHorizontalAlignment(SwingConstants.LEFT);
        descLabel.setPreferredSize(new Dimension(250, 20)); // Đảm bảo độ rộng cố định

// Thêm vào textPanel
        textPanel.add(titleLabel, gbcText);
        gbcText.gridy++;
        textPanel.add(descLabel, gbcText);

// Thêm textPanel vào panel cha
        panel.add(textPanel, gbc);

        // Cột 3 - Nút "Bắt đầu"
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.EAST;

        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/com/img/next.png"));
// Thay đổi kích thước icon (32x32)
        Image scaledImage = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JButton button = new JButton(scaledIcon);
        button.setPreferredSize(new Dimension(30, 30));
        button.setFocusable(false);
        button.setBorderPainted(false);  // Ẩn viền
        button.setContentAreaFilled(false); // Xóa nền
        button.setFocusPainted(false);  // Xóa viền khi focus
        button.setOpaque(false);  // Đảm bảo không có nền

        // Gán sự kiện cho nút
        final int lessonIndex = index;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openLesson(lessonIndex, content);
            }
        });

        panel.add(button, gbc);
        return panel;
    }

    private void openLesson(int index, String content) {
        // Lấy danh sách tiêu đề từ hashmap
        String[] titles = DanhSachBaiHocConData.getTitles(content);
        switch (index) {
            case 0 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 1 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 2 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 3 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 4 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 5 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 6 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 7 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 8 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            case 9 ->
                JOptionPane.showMessageDialog(this, "Mở: " + titles[index]);
            default ->
                JOptionPane.showMessageDialog(this, "Bài học không tồn tại.");
        }
    }

    private void addDragScrolling() {
        containerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startY = e.getY();
            }
        });

        containerPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
                int newValue = verticalBar.getValue() + (startY - e.getY());
                verticalBar.setValue(newValue);
                startY = e.getY();
            }
        });
    }
}
