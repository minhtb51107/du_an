/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baihoc;

import com.swing.RoundedPanel;
import com.ui.MainFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
//    public class TrangBaiHoc extends JPanel {
//
//        private JPanel mainPanel;
//        private DanhSachBaiHoc danhSachBaiHoc;
//        RoundedPanel newPanel;
//        QuestionPanel questionPanel;
//        MainFrame.LessonContentPanel lessonContentPanel;
//        DynamicPanelExample dynamicPanelExample;
//
//        public TrangBaiHoc(MainFrame mainFrame, String content, String content1) {
//            setOpaque(false);
//            //System.out.println("content "+ content);
//            setLayout(new BorderLayout()); // Sử dụng BorderLayout cho việc mở rộng toàn bộ
//            setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
//            GridBagConstraints gbc = new GridBagConstraints();
//
//            // Panel chứa 2 hàng
//            JPanel topContainerPanel = new JPanel(new GridBagLayout());
//            topContainerPanel.setOpaque(false);
//            GridBagConstraints topGbc = new GridBagConstraints();
//            topGbc.gridx = 0;
//            topGbc.fill = GridBagConstraints.BOTH;
//
//            // Header Panel (Hàng 1 - 10%)
//            JPanel headerPanel = new JPanel(new BorderLayout());
//            headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // Xóa viền gốc
//            headerPanel.setOpaque(false);
//            headerPanel.setPreferredSize(new Dimension(100, 5));
//            //headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
//            topGbc.gridy = 0;
//            topGbc.weightx = 1.0;
//            topGbc.weighty = 0.1;
//            topContainerPanel.add(headerPanel, topGbc);
//
//            // Tạo JLabel tiêu đề
//            JLabel lblTitle = new JLabel("Bài học");
//            lblTitle.setFont(new Font("Arial", Font.BOLD, 34));
//            lblTitle.setForeground(Color.BLACK);
//            lblTitle.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 20)); // Cách phải 1 chút
//
//            // Tạo panel chứa các nút, dùng FlowLayout.RIGHT
//            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
//            buttonPanel.setOpaque(false);
//
//            // Tạo RoundedPanel chứa JButton
//            //RoundedPanel KhoaBieu = createRoundedPanel();
//            RoundedPanel baitap = createRoundedPanel();
//            RoundedPanel Thoattrang = createRoundedPanel();
//
//            // Tạo JButton với icon
////            JButton btnKhoaBieu = createButtonWithIcon("Khóa biểu", "/com/img/calendar (1).png");
////            KhoaBieu.setBackground(new Color(238, 239, 233, 255));
////            btnKhoaBieu.addMouseListener(new MouseAdapter() {
////                @Override
////                public void mouseClicked(MouseEvent e) {
////                    KhoaBieu.setBackground(new Color(238, 239, 233, 255));
////                    TodoList.setBackground(new Color(223, 223, 215, 255));
////                    NhatKy.setBackground(new Color(223, 223, 215, 255));
////                }
////            });
//            JButton btnbaitap = createButtonWithIcon("Bài tập", "/com/img/to-do-list.png");
//            btnbaitap.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    questionPanel = new QuestionPanel(content1);
//                    BaiTap(questionPanel);
//                }
//            });
//
//            JButton btnThoattrang = createButtonWithIcon("Thoát", "/com/img/logout1.png");
//            btnThoattrang.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    lessonContentPanel = new MainFrame.LessonContentPanel(mainFrame);
//                    updateDanhSachBai(lessonContentPanel);
//                }
//            });
//
//            // Đặt JButton vào RoundedPanel với GridBagConstraints để căn giữa
//            gbc.gridx = 0;
//            gbc.gridy = 0;
//            gbc.anchor = GridBagConstraints.CENTER;
//
//            //KhoaBieu.add(btnKhoaBieu, gbc);
//            baitap.add(btnbaitap, gbc);
//            Thoattrang.add(btnThoattrang, gbc);
//
//            // Thêm các RoundedPanel vào buttonPanel
//            //buttonPanel.add(KhoaBieu);
//            buttonPanel.add(baitap);
//            buttonPanel.add(Thoattrang);
//            buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); // Xóa viền gốc
//
//            // Thêm tiêu đề và các nút vào menuPanel
//            headerPanel.add(lblTitle, BorderLayout.WEST);
//            headerPanel.add(buttonPanel, BorderLayout.CENTER);
//
//            // Main Panel (Hàng 2 - 90%)
//            mainPanel = new JPanel(new GridBagLayout());
//            mainPanel.setOpaque(false);
//            gbc.insets = new Insets(10, 10, 10, 10);
//            gbc.fill = GridBagConstraints.BOTH;
//
//            // Left Panel
//            JPanel leftPanel = new JPanel(new GridBagLayout());
//            leftPanel.setOpaque(false);
//            GridBagConstraints leftGbc = new GridBagConstraints();
//            leftGbc.weightx = 1.0;
//            leftGbc.weighty = 1.0;
//            leftGbc.fill = GridBagConstraints.BOTH;
//
//            // Top Panel
//            JPanel topPanel = new JPanel();
//            topPanel.setOpaque(false);
//            topPanel.setPreferredSize(new Dimension(100, 100));
//            RoundedPanel topPanelA = new RoundedPanel(50);
//            //topPanelA.setPreferredSize(new Dimension(100, 100));
//            topPanelA.setBackground(new Color(43, 43, 41, 255));
//            topPanelA.setLayout(new BorderLayout());
//            topPanelA.add(new ModernBarChart("", content), BorderLayout.CENTER);
//            topPanel.setLayout(new BorderLayout());
//            topPanel.add(topPanelA, BorderLayout.CENTER);
//            topPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
//            leftGbc.gridx = 0;
//            leftGbc.gridy = 0;
//            leftPanel.add(topPanel, leftGbc);
//
//            // Bottom Panel
//            RoundedPanel bottomPanel = new RoundedPanel(50);
//            bottomPanel.setBackground(new Color(43, 43, 41, 255));
//            bottomPanel.setPreferredSize(new Dimension(100, 100)); // Kích thước mẫu
//            bottomPanel.setLayout(new BorderLayout());
//            danhSachBaiHoc = new DanhSachBaiHoc(content, mainFrame);
//            bottomPanel.add(danhSachBaiHoc, BorderLayout.CENTER);
//            bottomPanel.setBorder(BorderFactory.createEmptyBorder(15, 5, 15, 5));
//            leftGbc.gridx = 0;
//            leftGbc.gridy = 1;
//            leftPanel.add(bottomPanel, leftGbc);
//            leftPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
//
//            // Thêm Left Panel vào Main Panel
//// Thêm Left Panel vào Main Panel
//            gbc.gridx = 0;
//            gbc.gridy = 0;
//            gbc.weightx = 0.3; // Tăng trọng số để giữ lại diện tích
//            gbc.weighty = 1.0;
//            mainPanel.add(leftPanel, gbc);
//
//            // Right Panel
//// Right Panel
//            JPanel rightPanel = new JPanel(new BorderLayout());
//            rightPanel.setOpaque(false);
//            
//            dynamicPanelExample = new DynamicPanelExample(content1, this);
//
//            newPanel = new RoundedPanel(50);
//            newPanel.setBackground(new Color(240, 238, 225, 255));
//            newPanel.setPreferredSize(new Dimension(150, 100));
//            newPanel.setLayout(new BorderLayout());
//            newPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//            newPanel.add(dynamicPanelExample, BorderLayout.CENTER);
//            rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
//            rightPanel.add(newPanel, BorderLayout.CENTER);
//
//            gbc.gridx = 1;
//            gbc.weightx = 0.7;
//            gbc.weighty = 1.0;
//            mainPanel.add(rightPanel, gbc);
//
//// Cập nhật lại giao diện
//            mainPanel.revalidate();
//            mainPanel.repaint();
//
//            // Thêm Main Panel vào topContainerPanel
//            topGbc.gridy = 1;
//            topGbc.weighty = 0.9;
//            topContainerPanel.add(mainPanel, topGbc);
//
//            add(topContainerPanel, BorderLayout.CENTER); // Đảm bảo toàn bộ giao diện được hiển thị
//        }
//
//        private RoundedPanel createRoundedPanel() {
//            RoundedPanel panel = new RoundedPanel(50);
//            panel.setBackground(new Color(241, 239, 227, 255));
//            panel.setPreferredSize(new Dimension(130, 50)); // Tăng kích thước để vừa icon + text
//            panel.setLayout(new GridBagLayout()); // Căn giữa
//            return panel;
//        }
//
//        private JButton createButtonWithIcon(String text, String iconPath) {
//            ImageIcon originalIcon = new ImageIcon(getClass().getResource(iconPath));
//
//            // Thay đổi kích thước icon (32x32)
//            Image scaledImage = originalIcon.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
//            ImageIcon scaledIcon = new ImageIcon(scaledImage);
//
//            JButton button = new JButton(text, scaledIcon);
//            button.setContentAreaFilled(false);
//            button.setBorderPainted(false);
//            button.setFont(new Font("Arial", Font.PLAIN, 14));
//            button.setHorizontalAlignment(SwingConstants.LEFT); // Căn text về bên phải icon
//            button.setVerticalAlignment(SwingConstants.CENTER);
//            button.setIconTextGap(5); // Khoảng cách giữa icon và text
//            return button;
//        }
//
//        public void BaiTap(JPanel Panel) {
//            newPanel.removeAll();
//            newPanel.add(Panel, BorderLayout.CENTER);
//            newPanel.revalidate();
//            newPanel.repaint();
//        }
//
//        public void setFont() {
//            String cochu = ht.getCochu(); // Giả sử bạn đã có instance của HeThong là "ht"
//
//            switch (cochu) {
//                case "Nhỏ":
//                    dynamicPanelExample.setFontSizes(12, 12, 12);
//                    break;
//                case "Vừa":
//                    dynamicPanelExample.setFontSizes(16, 16, 16);
//                    break;
//                case "Lớn":
//                    dynamicPanelExample.setFontSizes(20, 20, 20);
//                    break;
//            }
//        }
//    }