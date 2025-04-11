
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.baihoc.DanhSachBaiHoc;
import com.data.DanhSachBaiHocConData;
import com.ui.MainFrame;
import com.ui.MainFrame.TrangBaiHoc;
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

    private MainFrame mainFrame;

    private JPanel containerPanel;
    private JScrollPane scrollPane;
    private int startY;

    DanhSachBaiHoc danhSachBaiHoc;
    //TrangBaiHoc trangBaiHoc;

    public DanhSachBaiHocCon(String content, MainFrame mainFrame) {
//                System.out.println(content);
        this.mainFrame = mainFrame;
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
        String[] icons = DanhSachBaiHocConData.getIcons(content);

        String[] descriptions = DanhSachBaiHocConData.getDescriptions(content);

        // Lấy danh sách tiêu đề từ hashmap
        String[] titles = DanhSachBaiHocConData.getTitles(content);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(255, 255, 255));
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

        //JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource(icons[index])));
        ImageIcon originalIcon1 = new ImageIcon(getClass().getResource(icons[index]));
        Image scaledImage1 = originalIcon1.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
        JLabel iconLabel = new JLabel(scaledIcon1);

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
        //danhSachBaiHoc = new DanhSachBaiHoc("Java");
//        MainFrame.TrangBaiHoc example = mainFrame.new TrangBaiHoc(mainFrame, "Java");
        MainFrame.TrangBaiHoc example;
        // Lấy danh sách tiêu đề từ hashmap
        //System.out.println("content "+ content);
        if (content.equals("Java Cơ Bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc chương trình Java, cài đặt JDK, IDE", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Java Nâng Cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình đa luồng, xử lý sự kiện", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình mạng (Socket, TCP/IP, UDP)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JDBC: Kết nối cơ sở dữ liệu, CRUD", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình Web: Servlet, JSP, MVC", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Java Chuyên Nghiệp")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đóng gói, kế thừa, đa hình, interface, abstract class", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý ngoại lệ, làm việc với tập tin", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Collection Framework: ArrayList, LinkedList, HashMap", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Java Ứng Dụng Thực Tế")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JavaFX: Xây dựng giao diện đồ họa", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Spring Boot: REST API, kết nối cơ sở dữ liệu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Microservices với Spring Cloud", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật (Spring Security, OAuth2, JWT), Hiệu năng & Kiểm thử", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        
        if (content.equals("JavaScript Cơ Bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu Javascript", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách nhúng JavaScript vào HTML", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến và Kiểu dữ liệu trong JavaScript", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Toán tử và Cấu trúc điều kiện trong JavaScript", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Vòng lặp và Mảng trong JavaScript", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm và Phạm vi biến trong JavaScript", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng trò chơi nhỏ", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("JavaScript Nâng Cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Vòng lặp và Hàm", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Closure và Hoisting", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "ES6+ và Các tính năng mới", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý lỗi và Debugging", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng To-Do List", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("JavaScript Chuyên Nghiệp")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình bất đồng bộ (Asynchronous)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "DOM và Xử lý sự kiện", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "LocalStorage và SessionStorage", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web Workers và Hiệu suất JavaScript", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng thời tiết", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Ứng Dụng Thực Tế")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JavaScript trong dự án Web", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Framework JavaScript (React, Vue, Node.js)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Webpack và tối ưu hiệu suất", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viết Unit Test với Jest", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng Chat thời gian thực", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Python Cơ Bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc chương trình Python, cài đặt môi trường và IDE.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Python Nâng Cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP) trong Python.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình đa luồng và bất đồng bộ (async, threading).", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Python Chuyên Nghiệp")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API: requests, BeautifulSoup, Selenium.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình mạng: socket, giao thức TCP/IP, UDP.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Python Ứng Dụng Thực Tế")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xây dựng ứng dụng Web với Flask/Django.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Machine Learning với scikit-learn, TensorFlow, PyTorch.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tự động hóa với Selenium, bot Telegram/Discord.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("C cơ bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về ngôn ngữ C", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lịch sử và sự phát triển của ngôn ngữ C", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đặc điểm và ứng dụng của C", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc cơ bản của một chương trình C", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quá trình biên dịch và thực thi chương trình C", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các câu lệnh điều kiện (if, if-else, switch-case)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các vòng lặp (for, while, do-while)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("C trung bình")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mảng hai chiều: Ứng dụng và thao tác", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi trong C (thư viện string.h)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Con trỏ: Khái niệm, khai báo, toán tử con trỏ", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Định nghĩa và sử dụng hàm", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Truyền tham số vào hàm", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm đệ quy", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("C nâng cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc dữ liệu & file I/O", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kiểu dữ liệu struct và union", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách liên kết, ngăn xếp, hàng đợi", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("SQL cơ bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu SQL", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các lệnh truy vấn dữ liệu cơ bản", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kiểu dữ liệu và toán tử", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các hàm SQL cơ bản", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ràng buộc SQL(Constraints)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("SQL trung bình")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý cơ sở dữ liệu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý bảng", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kết hợp dữ liệu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nhóm và tính toán dữ liệu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi và dữ liệu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("SQL nâng cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý dữ liệu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thủ tục lưu trữ", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật SQL", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý dữ liệu quy mô lớn", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("SQL chuyên nghiệp")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý truy vấn phức tạp", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "SQL trong các hệ quản trị cơ sở dữ liệu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các công cụ hỗ trợ SQL", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        
        if (content.equals("HTML Cơ Bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "HTML là gì?", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "CẤU TRÚC CƠ BẢN CỦA HTML", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách viết file HTML và hiển thị trên trình duyệt", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tiêu đề (<h1> đến <h6>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Định dạng văn bản (<b>, <i>, <u>, <strong>, <em>, <mark>, <small>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 7:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 8:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo liên kết (<a>) và điều hướng trang web", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 9:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nhúng iframe (<iframe>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 10:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảng (<table>, <tr>, <td>, <th>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 11:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biểu mẫu (<form>, <input>, <textarea>, <select>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("HTML Nâng Cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ứng dụng Semantic HTML để tối ưu SEO", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Sử dụng <meta> để tối ưu công cụ tìm kiếm", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Open Graph, Twitter Card", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Favicon, Sitemap, robots.txt", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Local Storage & Session Storage", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Geolocation API (Xác định vị trí người dùng)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 7:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Drag & Drop API", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("CSS Cơ Bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Inline CSS, Internal CSS, External CSS", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cú pháp CSS cơ bản", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Selectors cơ bản: class, id, tag, attribute", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đơn vị đo lường trong CSS: px, %, em, rem, vw, vh", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Margin, Border, Padding, Content – CSS Box Model", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thuộc tính width, height, max-width, min-height", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Positioning (static, relative, absolute, fixed, sticky)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 7:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Màu HEX, RGB, HSL", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 8:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Font-family, font-size, font-weight", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 9:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Line-height, Letter-spacing", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 10:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: block, inline, inline-block, flex, grid", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 11:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viewport meta tag", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("CSS Nâng Cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: flex", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Căn chỉnh bằng justify-content, align-items, align-self", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "flex-wrap, flex-direction", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: grid", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "grid-template-columns, grid-template-rows, gap, align-items, justify-content", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Media Queries (@media)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mobile-first vs. Desktop-first", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 7:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "CSS Container Queries", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 8:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "transition, animation, keyframes", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 9:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hover effect nâng cao", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 10:
                    example = mainFrame.new TrangBaiHoc(mainFrame, ":nth-child(), :not(), :focus-within", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 11:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Pseudo-elements (::before, ::after)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("CSS Chuyên Nghiệp")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "BEM (Block Element Modifier)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "OOCSS (Object-Oriented CSS)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "SMACSS (Scalable and Modular Architecture for CSS)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến trong CSS (--main-color)", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nested Rules, Mixins, Functions", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tối ưu hóa mã CSS với SCSS", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Minify CSS", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 7:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Load font tối ưu", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 8:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Critical CSS & Lazy Loading", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 9:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bootstrap", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 10:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tailwind CSS", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 11:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "ARIA Roles", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 12:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Keyboard Navigation", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 13:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Dark Mode hỗ trợ người dùng khiếm thị", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 14:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo hình ảnh, animations phức tạp bằng CSS", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 15:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "CSS Art & Pure CSS Illustrations", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Ứng Dụng & Dự Án Thực Tế")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Blog cá nhân", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Landing Page sản phẩm", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web bán hàng cơ bản", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hiệu ứng scroll, parallax", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Dark Mode", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Animation nâng cao", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 6:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo manifest.json", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 7:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Service Worker & Caching", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 8:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Offline Mode & Push Notifications", "");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
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