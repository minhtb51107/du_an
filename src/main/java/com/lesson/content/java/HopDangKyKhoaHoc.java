/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.dao.KhoaBieuDAO;
import com.data.DataHopDangKyKhoaHoc;
import com.entity.NguoiDung;
import com.kehoach.GridBagPanelDemo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class HopDangKyKhoaHoc extends JPanel {
    GridBagPanelDemo gridBagPanelDemo;
    
    public HopDangKyKhoaHoc(int index, String selectedLanguage, GridBagPanelDemo gridBagPanelDemo) {
        this.gridBagPanelDemo = gridBagPanelDemo;
        setOpaque(false);
        setBorder(null);
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Thêm padding
        setPreferredSize(new Dimension(60, 100)); // Chiều rộng 200px, chiều cao 100px
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Cấu hình mặc định
        gbc.gridx = 0;
        gbc.weightx = 1.0; // Kéo giãn theo chiều ngang
        gbc.anchor = GridBagConstraints.WEST; // Căn trái
        gbc.fill = GridBagConstraints.HORIZONTAL; // Giãn theo chiều ngang
        gbc.insets = new Insets(5, 0, 5, 0); // Khoảng cách giữa các hàng

        // Tiêu đề khóa học (Hàng đầu tiên)
        gbc.gridy = 0;
        JLabel courseTitle = new JLabel(DataHopDangKyKhoaHoc.getTitle(index));
        courseTitle.setFont(new Font("Arial", Font.BOLD, 26));
              courseTitle.setForeground(Color.BLACK);
        add(courseTitle, gbc);
        
        // Khoảng trống để mô tả nằm giữa
        gbc.gridy = 1;
        gbc.weighty = 0.2; // Tạo khoảng trống trước mô tả
        add(new JLabel(), gbc);

        // Mô tả ngắn gọn (Phần giữa)
        gbc.gridy = 2;
        gbc.weighty = 0.1; // Tạo khoảng trống trước mô tả
        JLabel courseDescription = new JLabel(DataHopDangKyKhoaHoc.getDescription(index));
        courseDescription.setFont(new Font("Arial", Font.PLAIN, 16));
        courseDescription.setForeground(Color.BLACK);
        add(courseDescription, gbc);

        // Thời lượng khóa học
        gbc.gridy = 3;
        JLabel durationLabel = new JLabel(DataHopDangKyKhoaHoc.getDuration(index));
                durationLabel.setFont(new Font("Arial", Font.PLAIN, 14));
                     durationLabel.setForeground(Color.BLACK);
        add(durationLabel, gbc);

        // Số lượng bài học
        gbc.gridy = 4;
        JLabel lessonsLabel = new JLabel(DataHopDangKyKhoaHoc.getLessons(index));
         lessonsLabel.setFont(new Font("Arial", Font.PLAIN, 14));
         lessonsLabel.setForeground(Color.BLACK);
        add(lessonsLabel, gbc);
        
        // Khoảng trống để nút đăng ký nằm ở dưới cùng
        gbc.gridy = 5;
        gbc.weighty = 0.5; // Tạo khoảng cách giữa thông tin và nút đăng ký

        add(new JLabel(), gbc);

        // Nút đăng ký (Hàng cuối)
        gbc.gridy = 6;
        gbc.weighty = 0;
        gbc.weightx = 0.2;
        gbc.anchor = GridBagConstraints.EAST; // Căn giữa nút
        
        JButton registerButton = new JButton("Đăng ký ngay");
        registerButton.setFocusPainted(false);
        registerButton.setBackground(new Color(255,255,255,255));
        registerButton.setForeground(Color.BLACK);
        registerButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setBorder(null);
   
        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (selectedLanguage.equals("SQL")) {

                    KhoaBieuDAO dao = new KhoaBieuDAO();
                    NguoiDung nguoiDung = new NguoiDung();
                    String o = nguoiDung.getMaNguoiDung();
                    int id_kehoach = dao.getIdKeHoachByIdUser(o);
                    dao.deleteAllByKeHoach(id_kehoach);

                    // ======================
                    // 1) BẢNG KHOABIEU
                    // ======================
                    dao.insertKhoaBieu(4, id_kehoach);  // (TUAN = 4, ID_KEHOACH = 1)
                    dao.insertKhoaBieu(1, id_kehoach);  // (TUAN = 1, ID_KEHOACH = 1)

                    // ======================
                    // 2) BẢNG TUAN
                    // ======================
                    dao.insertTuan(1, 1, 4, "Tuần 1", null, 1, id_kehoach);
                    dao.insertTuan(2, 2, 2, "Tuần 5", null, 1, id_kehoach);
                    dao.insertTuan(1, 3, 4, "Tuần 2", null, 2, id_kehoach);
                    dao.insertTuan(1, 4, 4, "Tuần 3", null, 3, id_kehoach);
                    dao.insertTuan(1, 5, 4, "Tuần 4", null, 4, id_kehoach);

                    // ======================
                    // 3) BẢNG NGAY
                    // ======================
                    dao.insertNgay(1, 1, "Thứ 2: Giới thiệu SQL", 1, id_kehoach);
                    dao.insertNgay(2, 2, "Thứ 2: UNIQUE, CHECK, NOT NULL", 2, id_kehoach);
                    dao.insertNgay(3, 3, "", 3, 1);
                    dao.insertNgay(4, 4, "Thứ 2: SELECT", 4, 1);
                    dao.insertNgay(5, 5, null, 5, 1);
                    dao.insertNgay(6, 6, "Thứ 4: Khái niệm ", 1, 1);
                    dao.insertNgay(7, 7, null, 1, 1);
                    dao.insertNgay(8, 8, "Thứ 2: Kiểu dữ liệu số, chuỗi, ngày t...", 1, id_kehoach);
                    dao.insertNgay(9, 9, "Thứ 4: DEFAULT", 1, 1);
                    dao.insertNgay(10, 11, "Thứ 4: INSERT", 3, 1);
                    dao.insertNgay(11, 12, null, 3, 1);
                    dao.insertNgay(12, 14, "Thứ 6: Kiểu dữ liệu, toán tử, biểu thức", 4, id_kehoach);
                    dao.insertNgay(13, 16, "Thứ 4: Toán tử số học, so sánh, logic", 4, id_kehoach);
                    dao.insertNgay(14, 17, null, 4, 1);
                    dao.insertNgay(15, 18, "Thứ 6: UPDATE + DELETE", 5, id_kehoach);
                    dao.insertNgay(16, 19, null, 5, 1);
                    dao.insertNgay(17, 21, "Thứ 6: Hàm tổng hợp", 5, id_kehoach);
                    dao.insertNgay(18, 22, null, 2, 1);
                    dao.insertNgay(19, 13, "Thứ 2: Hàm xử lý chuỗi", 3, id_kehoach);
                    dao.insertNgay(20, 15, null, 4, 1);
                    dao.insertNgay(21, 20, "Thứ 4: Hàm xử lý ngày tháng", 5, id_kehoach);
                    dao.insertNgay(22, 23, "Thứ 6: PRIMARY KEY, FOREIGN ...", 2, id_kehoach);
                    
                    gridBagPanelDemo.updateKhoaBieu();

                    JOptionPane.showMessageDialog(null, "Đã tạo thời khóa biểu!");
                }
                
                if (selectedLanguage.equals("Java")) {

                    KhoaBieuDAO dao = new KhoaBieuDAO();
                    NguoiDung nguoiDung = new NguoiDung();
                    String o = nguoiDung.getMaNguoiDung();
                    int id_kehoach = dao.getIdKeHoachByIdUser(o);
                    dao.deleteAllByKeHoach(id_kehoach);

                    // ======================
                    // 1) BẢNG KHOABIEU
                    // ======================
                    dao.insertKhoaBieu(4, id_kehoach);  // (TUAN = 4, ID_KEHOACH = 1)
                    dao.insertKhoaBieu(1, id_kehoach);  // (TUAN = 1, ID_KEHOACH = 1)

                    // ======================
                    // 2) BẢNG TUAN
                    // ======================
                    dao.insertTuan(1, 1, 4, "Tuần 1", null, 1, id_kehoach);
                    dao.insertTuan(2, 2, 2, "Tuần 5", null, 1, id_kehoach);
                    dao.insertTuan(1, 3, 4, "Tuần 2", null, 2, id_kehoach);
                    dao.insertTuan(1, 4, 4, "Tuần 3", null, 3, id_kehoach);
                    dao.insertTuan(1, 5, 4, "Tuần 4", null, 4, id_kehoach);

                    // ======================
                    // 3) BẢNG NGAY
                    // ======================
                    dao.insertNgay(1, 1, "Thứ 2: Java là gì? + Lịch sử phát triển của Java", 1, id_kehoach);
                    dao.insertNgay(2, 2, "", 2, id_kehoach);
                    dao.insertNgay(3, 3, "", 3, 1);
                    dao.insertNgay(4, 4, "Thứ 2: Cài đặt JDK + IDE phổ biến", 4, 1);
                    dao.insertNgay(5, 5, null, 5, 1);
                    dao.insertNgay(6, 6, "Thứ 4: Lý do chọn Java + Ứng dụng của Java ", 1, 1);
                    dao.insertNgay(7, 7, null, 1, 1);
                    dao.insertNgay(8, 8, "Thứ 2: Toán tử trong Java", 1, id_kehoach);
                    dao.insertNgay(9, 9, "", 1, 1);
                    dao.insertNgay(10, 11, "Thứ 4: Viết và chạy chương trình Java đầu tiên", 3, 1);
                    dao.insertNgay(11, 12, null, 3, 1);
                    dao.insertNgay(12, 14, "Thứ 6: Cấu trúc cơ bản chương trình Java", 4, id_kehoach);
                    dao.insertNgay(13, 16, "Thứ 4: Xuất dữ liệu ra màn hình", 4, id_kehoach);
                    dao.insertNgay(14, 17, null, 4, 1);
                    dao.insertNgay(15, 18, "Thứ 6: Biến và kiểu dữ liệu", 5, id_kehoach);
                    dao.insertNgay(16, 19, null, 5, 1);
                    dao.insertNgay(17, 21, "Thứ 6: Nhập dữ liệu từ bàn phím", 5, id_kehoach);
                    dao.insertNgay(18, 22, null, 2, 1);
                    dao.insertNgay(19, 13, "Thứ 2: Cấu trúc điều kiện", 3, id_kehoach);
                    dao.insertNgay(20, 15, null, 4, 1);
                    dao.insertNgay(21, 20, "Thứ 4: Vòng lặp", 5, id_kehoach);
                    dao.insertNgay(22, 23, "Thứ 6: Mảng và xử lý chuỗi ...", 2, id_kehoach);
                    
                    gridBagPanelDemo.updateKhoaBieu();

                    JOptionPane.showMessageDialog(null, "Đã tạo thời khóa biểu!");
                }
            }
        });

        registerButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Thêm padding
         
        JPanel rowPanel = new JPanel(new BorderLayout());
        
        rowPanel.add(registerButton, BorderLayout.EAST);
        rowPanel.setOpaque(false);
        
        add(rowPanel, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0; // Tạo khoảng cách giữa thông tin và nút đăng ký

        add(new JLabel(), gbc);
    }
}