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
        panel.setBackground(new Color(119, 200, 191, 255));
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
