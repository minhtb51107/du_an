/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.data.DataHopDangKyKhoaHoc;
import com.data.DanhSachBaiHocChinhData;
import com.data.DataPanelA1;
import com.kehoach.GridBagPanelDemo;
import com.swing.ProfessionalSidebarForm;
import com.swing.RoundedPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author PC
 */
public class KhungGioiThieuNgonNgu extends JPanel {
    GridBagPanelDemo gridBagPanelDemo;

    public KhungGioiThieuNgonNgu(int index, String content, GridBagPanelDemo gridBagPanelDemo) {
        this.gridBagPanelDemo = gridBagPanelDemo;
        setLayout(new BorderLayout());
        setOpaque(false);

        // Panel 1: 1 cột, 2 hàng
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setOpaque(false);
        panel1.setPreferredSize(new Dimension(220, 100)); // Chiều rộng 200px, chiều cao 100px
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 5, 5, 5);
        gbc1.fill = GridBagConstraints.BOTH;

        // Panel 2: Nằm trong hàng 1 của panel 1, 2 cột, 1 hàng
        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setOpaque(false);
        panel2.setPreferredSize(new Dimension(100, 100));
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(5, 5, 5, 5);
        gbc2.fill = GridBagConstraints.BOTH;

        // Panel 3: Nằm trong cột 1 của panel 2, 2 hàng, 1 cột
        JPanel panel3 = new JPanel(new GridBagLayout());
        panel3.setPreferredSize(new Dimension(100, 120)); // Chiều rộng 200px, chiều cao 100px
        //panel3.setBackground(new Color(200, 255, 200)); // Màu nền nhẹ
        panel3.setOpaque(false);
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.insets = new Insets(5, 5, 5, 5);
        gbc3.fill = GridBagConstraints.BOTH;

        // Thêm các component vào Panel 3 (2 hàng, 1 cột)
        gbc3.gridx = 0;
        gbc3.gridy = 0;
        gbc3.weightx = 1.0;
        gbc3.weighty = 0.2;

        JLabel tieude = new JLabel(DataPanelA1.getTitle(index));
        tieude.setForeground(Color.BLACK); // Màu chữ
        tieude.setFont(new Font("Arial", Font.BOLD, 30)); // Cài đặt font chữ
        tieude.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        panel3.add(tieude, gbc3);

        // Tạo JTextArea với nền trong suốt
        JTextArea textArea1 = new JTextArea(DataPanelA1.getDescription(index));
        textArea1.setBackground(new Color(0, 0, 0, 0)); // Loại bỏ nền JTextArea
        textArea1.setPreferredSize(new Dimension(200, 300)); // Chiều rộng 200px, chiều cao 100px
        textArea1.setBorder(null); // Loại bỏ viền
        textArea1.setForeground(Color.BLACK); // Màu chữ
        textArea1.setFont(new Font("Arial", Font.PLAIN, 14)); // Cài đặt font chữ
        textArea1.setEditable(false); // Không cho chỉnh sửa
        textArea1.setFocusable(false); // Loại bỏ focus border
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        textArea1.setOpaque(false);
        textArea1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
//        textArea1.setEnabled(false);
            textArea1.setRequestFocusEnabled(false);
        textArea1.setHighlighter(null); // Ngăn chặn bôi xanh

        gbc3.gridy = 1;
        gbc3.weighty = 0.8; // Chiều cao chiếm 80%
        panel3.add(textArea1, gbc3);

        // Thêm panel 3 vào cột 1 của panel 2
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.weightx = 0.5;
        gbc2.weighty = 1.0;
        panel2.add(panel3, gbc2);

        // Thêm một component vào cột 2 của panel 2
        gbc2.gridx = 1;

        RoundedPanel panel4 = new RoundedPanel(30);
        panel4.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel4.setBackground(new Color(251,214,138,255));
        panel4.setLayout(new BorderLayout());
        panel4.add(new HopDangKyKhoaHoc(index, content, gridBagPanelDemo), BorderLayout.CENTER);

        panel2.add(panel4, gbc2);

        JTextArea textArea2 = new JTextArea(DataPanelA1.getIntroduce(index));
        textArea2.setBackground(new Color(0, 0, 0, 0)); // Loại bỏ nền JTextArea
        textArea2.setBorder(null); // Loại bỏ viền
        textArea2.setForeground(Color.BLACK); // Màu chữ
        textArea2.setFont(new Font("Arial", Font.PLAIN, 16)); // Cài đặt font chữ
        textArea2.setEditable(false); // Không cho chỉnh sửa
        textArea2.setFocusable(false); // Loại bỏ focus border
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);
        textArea2.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20)); // Tạo khoảng trống xung quanh
        //textArea2.setEnabled(false);
        textArea2.setRequestFocusEnabled(false);
        textArea2.setOpaque(false);
        textArea2.setHighlighter(null); // Ngăn chặn bôi xanh
        
        JPanel Panel = new JPanel(new BorderLayout());
        Panel.add(textArea2, BorderLayout.NORTH);
        Panel.setOpaque(false);
        Panel.setPreferredSize(new Dimension(200, 0));
        Panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        

        // Thêm panel 2 vào hàng 1 của panel 1
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.weightx = 1.0;
        gbc1.weighty = 0.7;
        panel1.add(panel2, gbc1);

        // Thêm một component vào hàng 2 của panel 1
        gbc1.gridy = 1;
        gbc1.weighty = 0.3;
        panel1.add(Panel, gbc1);

        // Thêm panel 1 vào NestedPanelExample
        add(panel1, BorderLayout.CENTER);
    }
}
