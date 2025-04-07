/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.data.DanhSachBaiHocChinhData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
class MucConCuaBieuDo extends JPanel {

    private static final Color[] COLORS = {
        new Color(255, 99, 132), // Đỏ hồng
        new Color(54, 162, 235), // Xanh dương
        new Color(255, 206, 86), // Vàng
        new Color(75, 192, 192), // Xanh ngọc
        new Color(153, 102, 255), // Tím
        new Color(255, 159, 64) // Cam
    };

    public MucConCuaBieuDo(String selectedLanguage) {
        setLayout(new GridBagLayout());
        setOpaque(false);
        setBorder(null);
        setPreferredSize(new Dimension(300, 150));
        setMinimumSize(new Dimension(300, 150));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(10, 5, 10, 5); // Thêm padding giữa các hàng

        //String[] subjects = {"Java", "Python", "C", "C++", "JavaScript", "Ruby"};
        String[] titles = DanhSachBaiHocChinhData.getTitles(selectedLanguage);

        int index = 0;
        int soLuong = titles.length; // Thay đổi số lượng bạn muốn hiển thị

        for (int i = 0; i < 3; i++) {
            gbc.gridy = i;
            for (int j = 0; j < 2; j++) {
                // Điều kiện bỏ bớt cột nếu không đủ số lượng
                if ((i == 2 && soLuong == 5 && j == 1)
                        || (i == 2 && soLuong == 4)) {
                    continue; // Bỏ qua cột thứ 2 hoặc toàn bộ hàng
                }

                if (index < soLuong && index < titles.length && index < COLORS.length) {
                    gbc.gridx = j;
                    add(createRowPanel(titles[index], COLORS[index]), gbc);
                    index++;
                }
            }
        }
    }

    private JPanel createRowPanel(String subjectName, Color color) {
        JPanel rowPanel = new JPanel(new GridBagLayout());
        rowPanel.setOpaque(false);
        rowPanel.setBorder(null);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;

        // Panel màu sắc
        gbc.gridx = 0;
        gbc.weightx = 0.2;
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(color);
        rowPanel.add(colorPanel, gbc);

        // Label hiển thị tên môn học với dấu ...
        gbc.gridx = 1;
        gbc.weightx = 0.6;
        JLabel titleLabel = new JLabel(subjectName, SwingConstants.LEFT);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        titleLabel.setPreferredSize(new java.awt.Dimension(100, 20)); // Giới hạn chiều rộng
        titleLabel.setToolTipText(subjectName); // Hiển thị tooltip khi hover
        titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        titleLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        titleLabel.setText(shortenText(subjectName, titleLabel)); // Cắt chữ nếu cần
        rowPanel.add(titleLabel, gbc);

        // Label phần trăm
        gbc.gridx = 2;
        gbc.weightx = 0.2;
        JLabel percentageLabel = new JLabel("0%/100%", SwingConstants.RIGHT);
        percentageLabel.setForeground(Color.WHITE);
        rowPanel.add(percentageLabel, gbc);

        return rowPanel;
    }

// Hàm để cắt chữ và thêm dấu "..."
    private String shortenText(String text, JLabel label) {
        java.awt.FontMetrics fm = label.getFontMetrics(label.getFont());
        int maxWidth = label.getPreferredSize().width;

        if (fm.stringWidth(text) <= maxWidth) {
            return text;
        }

        String ellipsis = "...";
        int ellipsisWidth = fm.stringWidth(ellipsis);
        int textWidth = maxWidth - ellipsisWidth;

        for (int i = text.length() - 1; i >= 0; i--) {
            if (fm.stringWidth(text.substring(0, i)) <= textWidth) {
                return text.substring(0, i) + ellipsis;
            }
        }
        return ellipsis;
    }
}
