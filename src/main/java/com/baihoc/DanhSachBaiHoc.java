/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baihoc;

import com.data.DanhSachBaiHocConData;
import com.data.DanhSachBaiHocData;
import com.swing.RoundedPanel;
import com.ui.MainFrame;
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
public class DanhSachBaiHoc extends JPanel {

    private JPanel containerPanel;
    private JScrollPane scrollPane;
    private int startY;
    private MainFrame mainFrame;

    public DanhSachBaiHoc(String content, MainFrame mainFram) {
        this.mainFrame = mainFram;
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
        String[] titles = DanhSachBaiHocData.getTitles(content);

        for (int i = 0; i < titles.length; i++) {
            containerPanel.add(createItemPanel(i, content), gbc);
            containerPanel.revalidate();
            containerPanel.repaint();
            gbc.gridy++;
        }
    }

    private JPanel createItemPanel(int index, String content) {
        String[] icons = DanhSachBaiHocData.getIcons(content);

        String[] descriptions = DanhSachBaiHocData.getDescriptions(content);

        // Lấy danh sách tiêu đề từ hashmap
        String[] titles = DanhSachBaiHocData.getTitles(content);
        //RoundedPanel

        RoundedPanel panel = new RoundedPanel(30);
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(255, 255, 255, 255));
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
        // Lấy danh sách tiêu đề từ hashmap
        MainFrame.TrangBaiHoc example;
        if (content.equals("Giới thiệu SQL")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu SQL", "Giới thiệu SQL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu SQL", "Khái niệm");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu SQL", "Kiểu dữ liệu, toán tử, biểu thức");
                    mainFrame.updateDanhSachBai(example);
                    break;
//                case 3:
//
//                    break;
                default:

            }
        }

        if (content.equals("Các lệnh truy vấn dữ liệu cơ bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các lệnh truy vấn dữ liệu cơ bản", "SELECT");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các lệnh truy vấn dữ liệu cơ bản", "INSERT");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các lệnh truy vấn dữ liệu cơ bản", "UPDATE");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các lệnh truy vấn dữ liệu cơ bản", "DELETE");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Kiểu dữ liệu và toán tử")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kiểu dữ liệu và toán tử", "Kiểu dữ liệu số, chuỗi, ngày tháng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kiểu dữ liệu và toán tử", "Toán tử số học, so sánh, logic");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Các hàm SQL cơ bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các hàm SQL cơ bản", "Hàm tổng hợp");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các hàm SQL cơ bản", "Hàm xử lý chuỗi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các hàm SQL cơ bản", "Hàm xử lý ngày tháng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Ràng buộc SQL(Constraints)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ràng buộc SQL(Constraints)", "PRIMARY KEY, FOREIGN KEY");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ràng buộc SQL(Constraints)", "UNIQUE, CHECK, NOT NULL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ràng buộc SQL(Constraints)", "DEFAULT");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Quản lý cơ sở dữ liệu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý cơ sở dữ liệu", "Tạo, xóa cơ sở dữ liệu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý cơ sở dữ liệu", "Sao lưu và phục hồi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý cơ sở dữ liệu", "Quản lý quyền truy cập");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Quản lý bảng")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý bảng", "Tạo, xóa, sửa bảng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý bảng", "Tăng giá trị tự động");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý bảng", "Tạo, xóa VIEW");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Kết hợp dữ liệu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kết hợp dữ liệu", "JOIN");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kết hợp dữ liệu", "SELF JOIN");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kết hợp dữ liệu", "UNION");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Nhóm và tính toán dữ liệu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nhóm và tính toán dữ liệu", "GROUP BY");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nhóm và tính toán dữ liệu", "Hàm tổng hợp");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nhóm và tính toán dữ liệu", "HAVING");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Xử lý chuỗi và dữ liệu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi và dữ liệu", "UPPER, LOWER");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi và dữ liệu", "SUBSTRING");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi và dữ liệu", "ROUND");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi và dữ liệu", "NOW, DATE_FORMAT");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Xử lý dữ liệu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý dữ liệu", "SELECT INTO");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý dữ liệu", "INSERT INTO SELECT");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý dữ liệu", "CASE");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Thủ tục lưu trữ")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thủ tục lưu trữ", "Tạo và sử dụng PROCEDURE");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thủ tục lưu trữ", "Truyền tham số vào PROCEDURE");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thủ tục lưu trữ", "Lợi ích và ứng dụng thực tế");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Bảo mật SQL")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật SQL", "Phòng chống SQL Injection");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật SQL", "Nguyên tắc Least Privilege");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Quản lý dữ liệu quy mô lớn")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý dữ liệu quy mô lớn", "PARTITIONING, HASH PARTITIONING");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý dữ liệu quy mô lớn", "SHARDING");
                    mainFrame.updateDanhSachBai(example);
                    break;

                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý dữ liệu quy mô lớn", "BATCH PROCESSING");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Quản lý truy vấn phức tạp")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý truy vấn phức tạp", "RECURSIVE QUERIES");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý truy vấn phức tạp", "Biểu thức CTE");
                    mainFrame.updateDanhSachBai(example);
                    break;

                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý truy vấn phức tạp", "WINDOW FUNCTIONS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Quản lý truy vấn phức tạp", "Dynamic SQL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("SQL trong các hệ quản trị cơ sở dữ liệu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "SQL trong các hệ quản trị cơ sở dữ liệu", "MySQL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "SQL trong các hệ quản trị cơ sở dữ liệu", "SQL Server");
                    mainFrame.updateDanhSachBai(example);
                    break;

                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "SQL trong các hệ quản trị cơ sở dữ liệu", "PostgreSQL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "SQL trong các hệ quản trị cơ sở dữ liệu", "Oracle");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Các công cụ hỗ trợ SQL")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các công cụ hỗ trợ SQL", "IDE cho SQL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các công cụ hỗ trợ SQL", "Công cụ GUI");
                    mainFrame.updateDanhSachBai(example);
                    break;

                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các công cụ hỗ trợ SQL", "ORM");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các công cụ hỗ trợ SQL", "Công cụ tối ưu hiệu suất");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        //Python
        if (content.equals("Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", "Giới thiệu về Python");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", "Lịch sử phát triển");
                    mainFrame.updateDanhSachBai(example);
                    break;

                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", "Lý do chọn Python");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Cấu trúc chương trình Python, cài đặt môi trường và IDE.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc chương trình Python, cài đặt môi trường và IDE.", "Cấu trúc chương trình Python");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc chương trình Python, cài đặt môi trường và IDE.", "Cài đặt môi trường và IDE");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", "Biến");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", "Kiểu dữ liệu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", "Toán tử");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", "Nhập xuất dữ liệu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", "Cấu trúc điều kiện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", "Vòng lặp");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", "Danh sách");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", "Tuple");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", "Dictionary");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Lập trình hướng đối tượng (OOP) trong Python.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP) trong Python.", "OOP");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Xử lý tập tin: đọc/ghi file CSV, JSON, XML.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", "Đọc/ghi file CSV");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", "JSON");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", "XML");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", "Try-except");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", "Finally");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", "Tạo ngoại lệ tùy chỉnh");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Lập trình đa luồng và bất đồng bộ (async, threading).")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình đa luồng và bất đồng bộ (async, threading).", "Lập trình đa luồng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình đa luồng và bất đồng bộ (async, threading).", "Bất đồng bộ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Làm việc với API: requests, BeautifulSoup, Selenium.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API: requests, BeautifulSoup, Selenium.", "Requests");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API: requests, BeautifulSoup, Selenium.", "BeautifulSoup");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API: requests, BeautifulSoup, Selenium.", "Selenium");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", "SQLite");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", "MySQL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", "PostgreSQL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", "ORM với SQLAlchemy");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Xử lý dữ liệu lớn: pandas, numpy, matplotlib.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", "Pandas");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", "Numpy");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", "Matplotlib");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Lập trình mạng: socket, giao thức TCP/IP, UDP.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình mạng: socket, giao thức TCP/IP, UDP.", "Socket");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình mạng: socket, giao thức TCP/IP, UDP.", "Giao thức TCP/IP");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình mạng: socket, giao thức TCP/IP, UDP.", "UDP");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Xây dựng ứng dụng Web với Flask/Django.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xây dựng ứng dụng Web với Flask/Django.", "Xây dựng ứng dụng Web với Flask/Django");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Machine Learning với scikit-learn, TensorFlow, PyTorch.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Machine Learning với scikit-learn, TensorFlow, PyTorch.", "Machine Learning với scikit-learn, TensorFlow, PyTorch");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Tự động hóa với Selenium, bot Telegram/Discord.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tự động hóa với Selenium, bot Telegram/Discord.", "Tự động hóa với Selenium, bot Telegram/Discord.");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", "Bảo mật, tối ưu hiệu năng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", "kiểm thử với pytest, unittest");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        //C
        if (content.equals("Giới thiệu về ngôn ngữ C")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về ngôn ngữ C", "C là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về ngôn ngữ C", "Tại sao nên học C?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về ngôn ngữ C", "Các đặc điểm nổi bật của C");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Lịch sử và sự phát triển của ngôn ngữ C")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lịch sử và sự phát triển của ngôn ngữ C", "Nguồn gốc của C");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lịch sử và sự phát triển của ngôn ngữ C", "Các phiên bản của C");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lịch sử và sự phát triển của ngôn ngữ C", "C và các ngôn ngữ lập trình khác");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Đặc điểm và ứng dụng của C")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đặc điểm và ứng dụng của C", "Ứng dụng của C trong lập trình hệ thống");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đặc điểm và ứng dụng của C", "C trong phát triển phần mềm nhúng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Cấu trúc cơ bản của một chương trình C")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc cơ bản của một chương trình C", "Cấu trúc tổng quát");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc cơ bản của một chương trình C", "Khai báo biến");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc cơ bản của một chương trình C", "Hàm main");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Các câu lệnh điều kiện (if, if-else, switch-case)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các câu lệnh điều kiện (if, if-else, switch-case)", "Câu lệnh if");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các câu lệnh điều kiện (if, if-else, switch-case)", "Câu lệnh if-else");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các câu lệnh điều kiện (if, if-else, switch-case)", "Câu lệnh switch-case");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Các vòng lặp (for, while, do-while)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các vòng lặp (for, while, do-while)", "Vòng lặp for");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các vòng lặp (for, while, do-while)", "Vòng lặp while");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các vòng lặp (for, while, do-while)", "Vòng lặp do-while");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", "Khai báo mảng một chiều");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", "Truy cập và thao tác với phần tử trong mảng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Mảng hai chiều: Ứng dụng và thao tác")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mảng hai chiều: Ứng dụng và thao tác", "Khai báo mảng hai chiều");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mảng hai chiều: Ứng dụng và thao tác", "Truy cập và thao tác với phần tử");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Xử lý chuỗi trong C (thư viện string.h)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi trong C (thư viện string.h)", "Khai báo chuỗi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi trong C (thư viện string.h)", "Các hàm xử lý chuỗi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý chuỗi trong C (thư viện string.h)", "So sánh và nối chuỗi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Con trỏ: Khái niệm, khai báo, toán tử con trỏ")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Con trỏ: Khái niệm, khai báo, toán tử con trỏ", "Khái niệm về con trỏ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Con trỏ: Khái niệm, khai báo, toán tử con trỏ", "Khai báo con trỏ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Con trỏ: Khái niệm, khai báo, toán tử con trỏ", "Toán tử con trỏ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Định nghĩa và sử dụng hàm")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Định nghĩa và sử dụng hàm", "Cú pháp định nghĩa hàm");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Định nghĩa và sử dụng hàm", "Gọi hàm");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Định nghĩa và sử dụng hàm", "Hàm trả về giá trị");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Truyền tham số vào hàm")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Truyền tham số vào hàm", "Truyền tham số theo giá trị");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Truyền tham số vào hàm", "Truyền tham số theo tham chiếu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Truyền tham số vào hàm", "Sử dụng con trỏ để truyền tham số");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Hàm đệ quy")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm đệ quy", "Khái niệm hàm đệ quy");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm đệ quy", "Cách hoạt động của hàm đệ quy");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm đệ quy", "Ví dụ về hàm đệ quy");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Cấu trúc dữ liệu & file I/O")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc dữ liệu & file I/O", "Cấu trúc dữ liệu cơ bản");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc dữ liệu & file I/O", "File I/O trong C");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc dữ liệu & file I/O", "Các hàm file I/O");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Kiểu dữ liệu struct và union")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kiểu dữ liệu struct và union", "Khái niệm về struct");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kiểu dữ liệu struct và union", "Khái niệm về union");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Kiểu dữ liệu struct và union", "Sự khác biệt giữa struct và union");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Danh sách liên kết, ngăn xếp, hàng đợi")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách liên kết, ngăn xếp, hàng đợi", "Danh sách liên kết");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách liên kết, ngăn xếp, hàng đợi", "Ngăn xếp");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách liên kết, ngăn xếp, hàng đợi", "Hàng đợi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        if (content.equals("Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", "Mở và đóng tệp tin");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", "Đọc và ghi tệp tin");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", "Các hàm xử lý tệp tin");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }

        //Java
        if (content.equals("Giới thiệu về Java, lịch sử phát triển, lý do chọn Java")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", "Java là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", "Lịch sử phát triển của Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", "Lý do chọn Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", "Ứng dụng của Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Cấu trúc chương trình Java, cài đặt JDK, IDE")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc chương trình Java, cài đặt JDK, IDE", "Cấu trúc cơ bản của một chương trình Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc chương trình Java, cài đặt JDK, IDE", "Cài đặt JDK");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc chương trình Java, cài đặt JDK, IDE", "IDE phổ biến để lập trình Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc chương trình Java, cài đặt JDK, IDE", "Viết và chạy chương trình Java đầu tiên");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", "Biến và kiểu dữ liệu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", "Toán tử trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", "Xuất dữ liệu ra màn hình");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", "Nhập dữ liệu từ bàn phím");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", "Cấu trúc điều kiện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", "Vòng lặp trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", "Mảng trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", "Xử lý chuỗi trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Lập trình đa luồng, xử lý sự kiện")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình đa luồng, xử lý sự kiện", "Lập trình đa luồng là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình đa luồng, xử lý sự kiện", "Tạo luồng trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình đa luồng, xử lý sự kiện", "Đồng bộ hóa luồng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình đa luồng, xử lý sự kiện", "Xử lý sự kiện trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Lập trình mạng (Socket, TCP/IP, UDP)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình mạng (Socket, TCP/IP, UDP)", "Giới thiệu về lập trình mạng trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình mạng (Socket, TCP/IP, UDP)", "Lập trình Socket với TCP/IP");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình mạng (Socket, TCP/IP, UDP)", "Lập trình UDP trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("JDBC: Kết nối cơ sở dữ liệu, CRUD")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JDBC: Kết nối cơ sở dữ liệu, CRUD", "JDBC là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JDBC: Kết nối cơ sở dữ liệu, CRUD", "Kết nối MySQL với Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JDBC: Kết nối cơ sở dữ liệu, CRUD", "Thực hiện CRUD");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Lập trình Web: Servlet, JSP, MVC")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình Web: Servlet, JSP, MVC", "Servlet là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình Web: Servlet, JSP, MVC", "Tạo Servlet cơ bản");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình Web: Servlet, JSP, MVC", "JSP là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình Web: Servlet, JSP, MVC", "Mô hình MVC trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức", "Lập trình hướng đối tượng là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức", "Lớp và đối tượng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức", "Constructor");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức", "Phương thức (Method)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Đóng gói, kế thừa, đa hình, interface, abstract class")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đóng gói, kế thừa, đa hình, interface, abstract class", "Đóng gói (Encapsulation)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đóng gói, kế thừa, đa hình, interface, abstract class", "Kế thừa (Inheritance)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đóng gói, kế thừa, đa hình, interface, abstract class", "Đa hình (Polymorphism)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đóng gói, kế thừa, đa hình, interface, abstract class", "Interface và Abstract Class");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Xử lý ngoại lệ, làm việc với tập tin")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý ngoại lệ, làm việc với tập tin", "Xử lý ngoại lệ (Exception Handling)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý ngoại lệ, làm việc với tập tin", "Đọc và ghi file trong Java");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Collection Framework: ArrayList, LinkedList, HashMap")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Collection Framework: ArrayList, LinkedList, HashMap", "Giới thiệu Collection Framework");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Collection Framework: ArrayList, LinkedList, HashMap", "ArrayList");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Collection Framework: ArrayList, LinkedList, HashMap", "LinkedList");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Collection Framework: ArrayList, LinkedList, HashMap", "HashMap");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("JavaFX: Xây dựng giao diện đồ họa")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JavaFX: Xây dựng giao diện đồ họa", "Giới thiệu JavaFX");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JavaFX: Xây dựng giao diện đồ họa", "Cấu trúc ứng dụng JavaFX");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Spring Boot: REST API, kết nối cơ sở dữ liệu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Spring Boot: REST API, kết nối cơ sở dữ liệu", "Giới thiệu Spring Boot");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Spring Boot: REST API, kết nối cơ sở dữ liệu", "Tạo REST API với Spring Boot");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Spring Boot: REST API, kết nối cơ sở dữ liệu", "Kết nối cơ sở dữ liệu MySQL với Spring Boot");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Microservices với Spring Cloud")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Microservices với Spring Cloud", "Giới thiệu về Microservices");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Microservices với Spring Cloud", "Xây dựng Microservice với Spring Boot");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Microservices với Spring Cloud", "Kết nối cơ sở dữ liệu MySQL với Spring Boot");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:

            }
        }
        if (content.equals("Bảo mật (Spring Security, OAuth2, JWT), Hiệu năng & Kiểm thử")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật (Spring Security, OAuth2, JWT), Hiệu năng & Kiểm thử", "Bảo mật với Spring Security");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật (Spring Security, OAuth2, JWT), Hiệu năng & Kiểm thử", "Xác thực bằng JWT");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảo mật (Spring Security, OAuth2, JWT), Hiệu năng & Kiểm thử", "Kiểm thử với JUnit và Mockito");
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
