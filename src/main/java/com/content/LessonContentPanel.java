/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.content;

import com.lesson.content.java.TrangChinh;
import com.ui.MainFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
class LessonContentPanel extends JPanel {

        private CardLayout cardLayout;
        private JPanel mainContent;
        private int currentPage = 0;
        private final int totalPages = 5; // Số trang nội dung bài học

        public LessonContentPanel() {
            setLayout(new BorderLayout());
            cardLayout = new CardLayout();
            mainContent = new JPanel(cardLayout);
            setOpaque(false);
            mainContent.setOpaque(false);

            // Tạo các trang nội dung với switch case
            for (int i = 1; i <= totalPages; i++) {
                JPanel page = createPage(i);
                page.setOpaque(false);
                mainContent.add(page, "Page" + i);
            }

            // Nút Previous
            ImageIcon IconPrve = new ImageIcon(getClass().getResource("/com/img/prev.png"));
            Image scaledImagePrve = IconPrve.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
            JButton btnPrev = new JButton(new ImageIcon(scaledImagePrve));
            btnPrev.setBorderPainted(false);
            btnPrev.setContentAreaFilled(false);
            btnPrev.setFocusPainted(false);
            btnPrev.setOpaque(false);
            btnPrev.addActionListener(e -> {
                if (currentPage > 0) {
                    currentPage--;
                    cardLayout.show(mainContent, "Page" + (currentPage + 1));
                }
            });

            // Nút Next
            ImageIcon IconNext = new ImageIcon(getClass().getResource("/com/img/next.png"));
            Image scaledImageNext = IconNext.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
            JButton btnNext = new JButton(new ImageIcon(scaledImageNext));
            btnNext.setBorderPainted(false);
            btnNext.setContentAreaFilled(false);
            btnNext.setFocusPainted(false);
            btnNext.setOpaque(false);
            btnNext.addActionListener(e -> {
                if (currentPage < totalPages - 1) {
                    currentPage++;
                    cardLayout.show(mainContent, "Page" + (currentPage + 1));
                }
            });

            add(btnPrev, BorderLayout.WEST);
            add(mainContent, BorderLayout.CENTER);
            add(btnNext, BorderLayout.EAST);
            cardLayout.show(mainContent, "Page1");
        }

        // Phương thức tạo nội dung trang dựa trên chỉ số trang
        private JPanel createPage(int pageIndex) {
            JPanel page = new JPanel();
            page.setLayout(new BorderLayout());

//            switch (pageIndex) {
//                case 1 -> {
//                    page.add(new TrangChinh(0), BorderLayout.CENTER);
//                }
//                case 2 -> {
//                    page.add(new TrangChinh(1), BorderLayout.CENTER);
//                }
//                case 3 -> {
//                    page.add(new TrangChinh(2), BorderLayout.CENTER);
//                }
//                case 4 -> {
//                    page.add(new TrangChinh(3), BorderLayout.CENTER);
//                }
//                case 5 -> {
//                    page.add(new TrangChinh(4), BorderLayout.CENTER);
//                }
//                case 6 -> {
//                    page.add(new TrangChinh(5), BorderLayout.CENTER);
//                }
//                default -> {
//                    page.add(new TrangChinh(5), BorderLayout.CENTER);
//                }
//            }

            return page;
        }
    }