
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

        if (content.equals("Giới thiệu Javascript")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu Javascript", "JavaScript là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu Javascript", "Lý do nên học JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu Javascript", "Cách nhúng JavaScript vào trang web");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu Javascript", "Các công cụ hỗ trợ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Giới thiệu Javascript", "Bài tập");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Cách nhúng JavaScript vào HTML")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách nhúng JavaScript vào HTML", "Giới thiệu cách nhúng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách nhúng JavaScript vào HTML", "Viết trực tiếp trong thẻ <script>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách nhúng JavaScript vào HTML", "Nhúng JavaScript vào thuộc tính của thẻ HTML");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách nhúng JavaScript vào HTML", "Nhúng JavaScript từ tệp bên ngoài");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách nhúng JavaScript vào HTML", "Bài tập Cách nhúng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Biến và Kiểu dữ liệu trong JavaScript")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến và Kiểu dữ liệu trong JavaScript", "Biến trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến và Kiểu dữ liệu trong JavaScript", "Các kiểu dữ liệu trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến và Kiểu dữ liệu trong JavaScript", "Ép kiểu dữ liệu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến và Kiểu dữ liệu trong JavaScript", "Kiểm tra kiểu dữ liệu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến và Kiểu dữ liệu trong JavaScript", "Bài tập Biến và kiểu dữ liệu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Toán tử và Cấu trúc điều kiện trong JavaScript")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Toán tử và Cấu trúc điều kiện trong JavaScript", "Giới thiệu toán tử và cấu trúc điều kiện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Toán tử và Cấu trúc điều kiện trong JavaScript", "Toán tử trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Toán tử và Cấu trúc điều kiện trong JavaScript", "Cấu trúc điều kiện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Toán tử và Cấu trúc điều kiện trong JavaScript", "Bài tập Toán tử và cấu trúc điều kiện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Vòng lặp và Mảng trong JavaScript")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Vòng lặp và Mảng trong JavaScript", "Giới thiệu vòng lặp và mảng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Vòng lặp và Mảng trong JavaScript", "Vòng lặp trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Vòng lặp và Mảng trong JavaScript", "Mảng trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Vòng lặp và Mảng trong JavaScript", "Bài tập vòng lặp và mảng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Hàm và Phạm vi biến trong JavaScript")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm và Phạm vi biến trong JavaScript", "Giới thiệu hàm và phạm vi hàm");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm và Phạm vi biến trong JavaScript", "Định nghĩa hàm");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm và Phạm vi biến trong JavaScript", "Phạm vi biến");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hàm và Phạm vi biến trong JavaScript", "Bài tập hàm và phạm vi biến");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Thực hành: Xây dựng trò chơi nhỏ")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng trò chơi nhỏ", "Giới thiệu trò chơi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng trò chơi nhỏ", "Lập kế hoạch và chuẩn bị");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng trò chơi nhỏ", "Viết mã JavaScript cho trò chơi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng trò chơi nhỏ", "Bài tập thực hành trò chơi nhỏ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Vòng lặp và Hàm")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Vòng lặp và Hàm", "Vòng Lặp và hàm trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Vòng lặp và Hàm", "Hàm trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Lập trình hướng đối tượng (OOP)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP)", "Giới thiệu về OOP trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP)", "Đối tượng và Lớp (Object & Class)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP)", "Tính kế thừa (Inheritance)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP)", "Đóng gói (Encapsulation)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP)", "Đa hình (Polymorphism)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình hướng đối tượng (OOP)", "Tính trừu tượng (Abstraction)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Closure và Hoisting")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Closure và Hoisting", "Closure trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Closure và Hoisting", "Hoisting trong JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("ES6+ và Các tính năng mới")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "ES6+ và Các tính năng mới", "Giới thiệu về ES6+");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "ES6+ và Các tính năng mới", "Các Tính Năng Mới Trong ES6+");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Xử lý lỗi và Debugging")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý lỗi và Debugging", "Giới thiệu về Xử Lý Lỗi");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý lỗi và Debugging", "Cách Bắt Lỗi với try...catch");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý lỗi và Debugging", "Sử Dụng throw Để Tạo Lỗi Tùy Chỉnh");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý lỗi và Debugging", "Debugging Với console.log() và console.error()");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Xử lý lỗi và Debugging", "Debugging Bằng Developer Tools");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Thực hành: Xây dựng ứng dụng To-Do List")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng To-Do List", "Giới thiệu Xây dựng ứng dụng To-Do List");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng To-Do List", "Xây dựng giao diện HTML");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng To-Do List", "Viết mã JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng To-Do List", "Cải tiến - Lưu công việc vào LocalStorage");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Lập trình bất đồng bộ (Asynchronous)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình bất đồng bộ (Asynchronous)", "Giới thiệu Lập trình bất đồng bộ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình bất đồng bộ (Asynchronous)", "setTimeout và setInterval");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình bất đồng bộ (Asynchronous)", "Callback Function");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình bất đồng bộ (Asynchronous)", "Promise – Giải pháp thay thế Callback");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Lập trình bất đồng bộ (Asynchronous)", "Async/Await – Cách Viết Promise Dễ Hiểu Hơn");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Làm việc với API")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API", "Giới thiệu Làm việc với API");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API", "Sử dụng fetch() để gọi API");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API", "Gửi Dữ Liệu Lên API với fetch()");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Làm việc với API", "Xử Lý Lỗi Khi Gọi API");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("DOM và Xử lý sự kiện")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "DOM và Xử lý sự kiện", "Giới Thiệu DOM và Xử lý sự kiện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "DOM và Xử lý sự kiện", "Truy Xuất Phần Tử DOM");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "DOM và Xử lý sự kiện", "Thay Đổi Nội Dung và Kiểu Dáng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "DOM và Xử lý sự kiện", "Lắng Nghe và Xử Lý Sự Kiện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("LocalStorage và SessionStorage")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "LocalStorage và SessionStorage", "Giới Thiệu LocalStorage và SessionStorage");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "LocalStorage và SessionStorage", "Sự Khác Biệt Giữa Local Storage và SessionStorage");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "LocalStorage và SessionStorage", "Cách Sử Dụng Local Storage");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "LocalStorage và SessionStorage", "Cách Sử Dụng SessionStorage");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "LocalStorage và SessionStorage", "Ứng Dụng Thực Tế");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Web Workers và Hiệu suất JavaScript")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web Workers và Hiệu suất JavaScript", "Giới Thiệu Web Workers và Hiệu suất JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web Workers và Hiệu suất JavaScript", "Web Workers là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web Workers và Hiệu suất JavaScript", "Cách Tạo Web Worker");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web Workers và Hiệu suất JavaScript", "Kết Thúc Web Worker");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web Workers và Hiệu suất JavaScript", "Truyền Dữ Liệu Giữa Main Thread và Worker");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web Workers và Hiệu suất JavaScript", "Ứng Dụng Thực Tế");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Thực hành: Xây dựng ứng dụng thời tiết")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng thời tiết", "Giới Thiệu Xây dựng ứng dụng thời tiết");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng thời tiết", "Yêu Cầu Công Nghệ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng thời tiết", "Xây Dựng Giao Diện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng thời tiết", "Xử lý dữ liệu với JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng thời tiết", "Cải Tiến Giao Diện");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("JavaScript trong dự án Web")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JavaScript trong dự án Web", "Giới thiệu JavaScript trong dự án Web");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JavaScript trong dự án Web", "Cấu trúc một dự án Web sử dụng JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JavaScript trong dự án Web", "Thêm JavaScript vào trang Web");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "JavaScript trong dự án Web", "Tương tác với HTML và CSS bằng JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Framework JavaScript (React, Vue, Node.js)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Framework JavaScript (React, Vue, Node.js)", "Giới thiệu Framework JavaScript");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Framework JavaScript (React, Vue, Node.js)", "React.js - Xây dựng giao diện động");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Framework JavaScript (React, Vue, Node.js)", "Vue.js - Framework dễ học và mạnh mẽ");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Framework JavaScript (React, Vue, Node.js)", "Node.js - Xây dựng Backend với Express.js");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Webpack và tối ưu hiệu suất")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Webpack và tối ưu hiệu suất", "Giới thiệu về Webpack");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Webpack và tối ưu hiệu suất", "Cài đặt Webpack");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Webpack và tối ưu hiệu suất", "Loaders và Plugins");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Webpack và tối ưu hiệu suất", "Tối ưu hóa hiệu suất với Webpack");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Viết Unit Test với Jest")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viết Unit Test với Jest", "Giới thiệu về Jest");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viết Unit Test với Jest", "Cài đặt Jest");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viết Unit Test với Jest", "Viết bài kiểm thử đơn giản");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viết Unit Test với Jest", "Kiểm thử bất đồng bộ với Jest");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viết Unit Test với Jest", "Kiểm thử với Mock Functions");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }

        if (content.equals("Thực hành: Xây dựng ứng dụng Chat thời gian thực")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng Chat thời gian thực", "Giới thiệu Xây dựng ứng dụng Chat thời gian thực");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng Chat thời gian thực", "Cài đặt môi trường");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng Chat thời gian thực", "Xây dựng Backend");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng Chat thời gian thực", "Xây dựng Frontend");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Thực hành: Xây dựng ứng dụng Chat thời gian thực", "Chạy ứng dụng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
                    break;
            }
        }
        
        //HTML Cơ Bản
        if (content.equals("HTML là gì?")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "HTML là gì?", "Giới Thiệu HTML");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "HTML là gì?", "Lịch Sử Phát Triển Của HTML");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "HTML là gì?", "Cách HTML Hoạt Động");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("CẤU TRÚC CƠ BẢN CỦA HTML")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "CẤU TRÚC CƠ BẢN CỦA HTML", "Các Phần Của Tài Liệu HTML");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "CẤU TRÚC CƠ BẢN CỦA HTML", "Mô Tả Chi Tiết Các Thẻ Quan Trọng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Cách viết file HTML và hiển thị trên trình duyệt")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách viết file HTML và hiển thị trên trình duyệt", "Tạo File HTML");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách viết file HTML và hiển thị trên trình duyệt", "Chạy File HTML Trên Trình Duyệt");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cách viết file HTML và hiển thị trên trình duyệt", "Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Tiêu đề (<h1> đến <h6>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tiêu đề (<h1> đến <h6>)", "Ý Nghĩa Của Các Mức Tiêu Đề");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tiêu đề (<h1> đến <h6>)", "Lỗi Thường Gặp");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)", "Đoạn Văn (<p>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)", "Xuống Dòng (<br>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)", "Đường Ngang (<hr>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Định dạng văn bản (<b>, <i>, <u>, <strong>, <em>, <mark>, <small>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Định dạng văn bản (<b>, <i>, <u>, <strong>, <em>, <mark>, <small>)", "Các Thẻ Định Dạng Phổ Biến");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Định dạng văn bản (<b>, <i>, <u>, <strong>, <em>, <mark>, <small>)", "Ví Dụ Về Định Dạng Văn Bản");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)", "Danh sách là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)", "Danh Sách Có Thứ Tự (<ol>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)", "Danh Sách Không Thứ Tự (<ul>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)", "Danh Sách Mô Tả (<dl>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)", "Chèn Ảnh (<img>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)", "Chèn Video (<video>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)", "Chèn Âm Thanh (<audio>)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Tạo liên kết (<a>) và điều hướng trang web")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo liên kết (<a>) và điều hướng trang web", "Cấu Trúc Cơ Bản Của Liên Kết");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo liên kết (<a>) và điều hướng trang web", "Liên Kết Tới Các Đoạn Văn Trong Cùng Một Trang");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo liên kết (<a>) và điều hướng trang web", "Các Thuộc Tính Thường Dùng Của Thẻ <a>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo liên kết (<a>) và điều hướng trang web", "Liên Kết Hình Ảnh");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Nhúng iframe (<iframe>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nhúng iframe (<iframe>)", "Cấu Trúc Thẻ <iframe>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nhúng iframe (<iframe>)", "Tại Sao Sử Dụng Iframe?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nhúng iframe (<iframe>)", "Lưu Ý Khi Sử Dụng Iframe");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Bảng (<table>, <tr>, <td>, <th>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảng (<table>, <tr>, <td>, <th>)", "Cấu Trúc Cơ Bản Của Bảng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảng (<table>, <tr>, <td>, <th>)", "Các Thuộc Tính Của Bảng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bảng (<table>, <tr>, <td>, <th>)", "Bảng Nâng Cao");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Biểu mẫu (<form>, <input>, <textarea>, <select>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biểu mẫu (<form>, <input>, <textarea>, <select>)", "Cấu Trúc Cơ Bản Của Biểu Mẫu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biểu mẫu (<form>, <input>, <textarea>, <select>)", "Các Loại Trường Nhập");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biểu mẫu (<form>, <input>, <textarea>, <select>)", "Các Thuộc Tính Khác Của Thẻ <form>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }

        //HTML Nâng Cao
        if (content.equals("Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", "HTML semantic là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", "<header>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", "<footer>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", "<nav>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", "<article>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 5:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", "<section>");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Ứng dụng Semantic HTML để tối ưu SEO")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ứng dụng Semantic HTML để tối ưu SEO", "Semantic HTML là gì");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ứng dụng Semantic HTML để tối ưu SEO", "Giúp công cụ tìm kiếm hiểu rõ cấu trúc và nội dung trang");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ứng dụng Semantic HTML để tối ưu SEO", "Tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Ứng dụng Semantic HTML để tối ưu SEO", "Hỗ trợ tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Sử dụng <meta> để tối ưu công cụ tìm kiếm")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Sử dụng <meta> để tối ưu công cụ tìm kiếm", "Các thẻ <meta> quan trọng trong HTML");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Sử dụng <meta> để tối ưu công cụ tìm kiếm", "Meta Title và Meta Description");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Sử dụng <meta> để tối ưu công cụ tìm kiếm", "Meta Robots và Meta Viewport");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Sử dụng <meta> để tối ưu công cụ tìm kiếm", "Meta Charset");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Open Graph, Twitter Card")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Open Graph, Twitter Card", "Giới thiệu Open Graph và Twitter Card");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Open Graph, Twitter Card", "Open Graph");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Open Graph, Twitter Card", "Twitter Card");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Favicon, Sitemap, robots.txt")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Favicon, Sitemap, robots.txt", "Favicon");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Favicon, Sitemap, robots.txt", "Sitemap");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Favicon, Sitemap, robots.txt", "robots.txt");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Local Storage & Session Storage")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Local Storage & Session Storage", "Local Storage");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Local Storage & Session Storage", "Session Storage");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Geolocation API (Xác định vị trí người dùng)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Geolocation API (Xác định vị trí người dùng)", "Geolocation API là");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Geolocation API (Xác định vị trí người dùng)", "Tính năng của Geolocation API");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Geolocation API (Xác định vị trí người dùng)", "Lợi ích SEO gián tiếp");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Drag & Drop API")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Drag & Drop API", "Drag & Drop API là gì");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Drag & Drop API", "Tính năng của Drag & Drop API");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Drag & Drop API", "Lợi ích đối với SEO");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }

        //CSS Cơ Bản
        if (content.equals("Inline CSS, Internal CSS, External CSS")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Inline CSS, Internal CSS, External CSS", "Inline CSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Inline CSS, Internal CSS, External CSS", "Internal CSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Inline CSS, Internal CSS, External CSS", "External CSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Cú pháp CSS cơ bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cú pháp CSS cơ bản", "CSS sử dụng cú pháp gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cú pháp CSS cơ bản", "Cấu trúc cơ bản của một quy tắc CSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Cú pháp CSS cơ bản", "Các kiểu Selector trong CSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Selectors cơ bản: class, id, tag, attribute")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Selectors cơ bản: class, id, tag, attribute", "Tag Selector");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Selectors cơ bản: class, id, tag, attribute", "Class Selector");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Selectors cơ bản: class, id, tag, attribute", "ID Selector");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Selectors cơ bản: class, id, tag, attribute", "Attribute Selector");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Đơn vị đo lường trong CSS: px, %, em, rem, vw, vh")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đơn vị đo lường trong CSS: px, %, em, rem, vw, vh", "Đơn vị tuyệt đối");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Đơn vị đo lường trong CSS: px, %, em, rem, vw, vh", "Đơn vị tương đối");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Margin, Border, Padding, Content – CSS Box Model")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Margin, Border, Padding, Content – CSS Box Model", "Cấu trúc Box Model");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Các thuộc tính width, height, max-width, min-height")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thuộc tính width, height, max-width, min-height", "Width và Height");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Các thuộc tính width, height, max-width, min-height", "max-width và min-width");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Positioning (static, relative, absolute, fixed, sticky)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Positioning (static, relative, absolute, fixed, sticky)", "Các loại position chính");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Positioning (static, relative, absolute, fixed, sticky)", "Sự khác biệt giữa các kiểu positioning");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Positioning (static, relative, absolute, fixed, sticky)", "Ứng dụng thực tế của từng loại");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Màu HEX, RGB, HSL")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Màu HEX, RGB, HSL", "Hệ màu HEX");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Màu HEX, RGB, HSL", "Hệ màu RGB");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Màu HEX, RGB, HSL", "Hệ màu HSL");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Font-family, font-size, font-weight")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Font-family, font-size, font-weight", "Font-family");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Font-family, font-size, font-weight", "Font-size");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Font-family, font-size, font-weight", "Font-weight");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Line-height, Letter-spacing")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Line-height, Letter-spacing", "Line-height");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Line-height, Letter-spacing", "Letter-spacing");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Line-height, Letter-spacing", "Ứng dụng thực tế");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("display: block, inline, inline-block, flex, grid")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: block, inline, inline-block, flex, grid", "Display: block");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: block, inline, inline-block, flex, grid", "Display: inline");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: block, inline, inline-block, flex, grid", "Display: inline-block");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: block, inline, inline-block, flex, grid", "Display: flex");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 4:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: block, inline, inline-block, flex, grid", "Display: grid");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Viewport meta tag")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viewport meta tag", "Viewport là gì");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viewport meta tag", "Cú pháp chuẩn của thẻ Viewport");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viewport meta tag", "Các thuộc tính quan trọng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Viewport meta tag", "Vai trò của Viewport meta tag");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }

        //CSS Nâng Cao
        if (content.equals("display: flex")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: flex", "display: flex là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: flex", "Các thuộc tính chính của Flexbox");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Căn chỉnh bằng justify-content, align-items, align-self")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Căn chỉnh bằng justify-content, align-items, align-self", "justify-content");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Căn chỉnh bằng justify-content, align-items, align-self", "align-items");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Căn chỉnh bằng justify-content, align-items, align-self", "align-self");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("flex-wrap, flex-direction")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "flex-wrap, flex-direction", "flex-wrap");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "flex-wrap, flex-direction", "flex-direction");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("display: grid")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: grid", "display: grid là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "display: grid", "Các thuộc tính chính của CSS Grid");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("grid-template-columns, grid-template-rows, gap, align-items, justify-content")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "grid-template-columns, grid-template-rows, gap, align-items, justify-content", "Khái Niệm về CSS Grid Layout");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "grid-template-columns, grid-template-rows, gap, align-items, justify-content", "Các Thuộc Tính Chính trong CSS Grid");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "grid-template-columns, grid-template-rows, gap, align-items, justify-content", "Chi Tiết về Các Thuộc Tính");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Media Queries (@media)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Media Queries (@media)", "Khái Niệm");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Media Queries (@media)", "Cách Sử Dụng Media Queries");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Media Queries (@media)", "Tại Sao Media Queries Quan Trọng?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Mobile-first vs. Desktop-first")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mobile-first vs. Desktop-first", "Mobile-first");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mobile-first vs. Desktop-first", "Desktop-first");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Mobile-first vs. Desktop-first", "So Sánh Mobile-first và Desktop-first");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("CSS Container Queries")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "CSS Container Queries", "CSS Container Queries");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("transition, animation, keyframes")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "transition, animation, keyframes", "Transition");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "transition, animation, keyframes", "Animation");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "transition, animation, keyframes", "Keyframes");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Hover effect nâng cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hover effect nâng cao", "Hover effect nâng cao");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals(":nth-child(), :not(), :focus-within")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, ":nth-child(), :not(), :focus-within", ":nth-child(n) - Chọn Phần Tử Theo Thứ Tự");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, ":nth-child(), :not(), :focus-within", ":not() - Loại Trừ Một Phần Tử");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, ":nth-child(), :not(), :focus-within", ":focus-within - Chọn Phần Tử Khi Có Focus Bên Trong");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Pseudo-elements (::before, ::after)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Pseudo-elements (::before, ::after)", "Pseudo-elements (::before, ::after)");
                    mainFrame.updateDanhSachBai(example);
                    break;
            }
        }
        //CSS Chuyên Nghiệp
        if (content.equals("BEM (Block Element Modifier)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "BEM (Block Element Modifier)", "BEM (Block Element Modifier)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("OOCSS (Object-Oriented CSS)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "OOCSS (Object-Oriented CSS)", "OOCSS (Object-Oriented CSS)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("SMACSS (Scalable and Modular Architecture for CSS)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "SMACSS (Scalable and Modular Architecture for CSS)", "SMACSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Biến trong CSS (--main-color)")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Biến trong CSS (--main-color)", "Biến trong CSS (--main-color)");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Nested Rules, Mixins, Functions")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nested Rules, Mixins, Functions", "Nested Rules");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nested Rules, Mixins, Functions", "Mixins – Định nghĩa một nhóm CSS tái sử dụng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Nested Rules, Mixins, Functions", "Functions – Xử lý logic trong SCSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Tối ưu hóa mã CSS với SCSS")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tối ưu hóa mã CSS với SCSS", "Tối ưu hóa mã CSS với SCSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Minify CSS")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Minify CSS", "Minify CSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Load Font Tối ưu")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Load Font Tối ưu", "Load Font Tối ưu");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Critical CSS & Lazy Loading")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Critical CSS & Lazy Loading", "Critical CSS – Tải trước những phần CSS quan trọng");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Critical CSS & Lazy Loading", "Lazy Loading – Tải tài nguyên khi cần thiết");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Bootstrap")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Bootstrap", "Bootstrap");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Tailwind CSS")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tailwind CSS", "Tailwind CSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("ARIA Roles")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "ARIA Roles", "ARIA Roles");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Keyboard Navigation")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Keyboard Navigation", "Keyboard Navigation");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Dark Mode hỗ trợ người dùng khiếm thị")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Dark Mode hỗ trợ người dùng khiếm thị", "Dark Mode hỗ trợ người dùng khiếm thị");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Tạo hình ảnh, animations phức tạp bằng CSS")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo hình ảnh, animations phức tạp bằng CSS", "Tạo hình ảnh bằng CSS");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo hình ảnh, animations phức tạp bằng CSS", "Tạo Animations (Hoạt ảnh) Phức Tạp");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("CSS Art & Pure CSS Illustrations")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "CSS Art & Pure CSS Illustrations", "CSS Art");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "CSS Art & Pure CSS Illustrations", "Pure CSS Illustrations");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        //Ứng Dụng & Dự Án Thực Tế
        if (content.equals("Blog cá nhân")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Blog cá nhân", "Một Blog cá nhân là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Blog cá nhân", "Các yếu tố quan trọng của blog cá nhân");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Landing Page sản phẩm")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Landing Page sản phẩm", "Landing page sản phẩm là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Landing Page sản phẩm", "Các yếu tố quan trọng của landing page sản phẩm");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Web bán hàng cơ bản")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web bán hàng cơ bản", "Web bán hàng cơ bản là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Web bán hàng cơ bản", "Các yếu tố quan trọng của web bán hàng cơ bản");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Hiệu ứng scroll, parallax")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hiệu ứng scroll, parallax", "Hiệu ứng scroll");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hiệu ứng scroll, parallax", "Parallax");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Hiệu ứng scroll, parallax", "Ứng dụng trong thiết kế");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Dark Mode")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Dark Mode", "Dark Mode (chế độ tối) là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Dark Mode", "Các yếu tố quan trọng của Dark Mode");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Dark Mode", "Cách thức triển khai Dark Mode");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Animation nâng cao")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Animation nâng cao", "Animation nâng cao là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Animation nâng cao", "Các yếu tố quan trọng của animation nâng cao");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Animation nâng cao", "Lợi ích của animation nâng cao");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Tạo manifest.json")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo manifest.json", "Manifest.json là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Tạo manifest.json", "Các yếu tố quan trọng của manifest.json");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Service Worker & Caching")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Service Worker & Caching", "Service Worker là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Service Worker & Caching", "Các yếu tố quan trọng về Service Worker");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Service Worker & Caching", "Caching trong Service Worker");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Service Worker & Caching", "Các lợi ích của Service Worker & Caching");
                    mainFrame.updateDanhSachBai(example);
                    break;
                default:
            }
        }
        if (content.equals("Offline Mode & Push Notifications")) {
            switch (index) {
                case 0:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Offline Mode & Push Notifications", "Offline Mode (Chế độ ngoại tuyến) là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 1:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Offline Mode & Push Notifications", "Các yếu tố quan trọng của Offline Mode");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 2:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Offline Mode & Push Notifications", "Push Notifications (Thông báo đẩy) là gì?");
                    mainFrame.updateDanhSachBai(example);
                    break;
                case 3:
                    example = mainFrame.new TrangBaiHoc(mainFrame, "Offline Mode & Push Notifications", "Các yếu tố quan trọng của Push Notifications");
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