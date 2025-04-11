/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.dao.HethongDAO;
import com.data.DanhSachBaiHocConData;
import com.entity.Data;
import com.entity.NguoiDung;
import com.kehoach.GridBagPanelDemo;
import com.swing.ProfessionalSidebarForm;
import com.swing.RoundedPanel;
import com.trangchu.CustomPanel;
import com.ui.MainFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class TrangChinh extends JPanel {

    private DanhSachBaiHocCon danhSachBaiHocCon;
    JPanel bottomSubPanel = new JPanel();

    MainFrame mainFrame;
    
    private JLabel title;
    
    CustomPanel customPanel;
    
    GridBagPanelDemo gridBagPanelDemo;

    public TrangChinh(int index, String selectedLanguage, String content, MainFrame mainFrame, CustomPanel customPanel, GridBagPanelDemo gridBagPanelDemo) {
        this.customPanel = customPanel;
        this.gridBagPanelDemo = gridBagPanelDemo;
        this.mainFrame = mainFrame;
//                System.out.println(content);
        setLayout(new BorderLayout());
        setOpaque(false);

        // Tạo outerPanel với GridBagLayout, 2 hàng 1 cột
        JPanel outerPanel = new JPanel(new GridBagLayout());
        outerPanel.setOpaque(false);
        GridBagConstraints outerGbc = new GridBagConstraints();
        outerGbc.insets = new Insets(5, 5, 5, 5);
        outerGbc.fill = GridBagConstraints.BOTH;

        // Hàng đầu tiên của outerPanel với chiều cao nhỏ
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(37, 36, 41, 150)); // Màu nền mờ
        topPanel.setOpaque(false);
        outerGbc.gridx = 0;
        outerGbc.gridy = 0;
        outerGbc.weightx = 1.0;
        outerGbc.weighty = 0.02; // Chiều cao nhỏ
        outerPanel.add(topPanel, outerGbc);

        title = new JLabel("Lessons");
        title.setForeground(new Color(37, 36, 41)); // Màu chữ trắng
        title.setFont(new Font("Arial", Font.BOLD, 45)); // Font chữ Arial đậm, kích thước 20
        title.setAlignmentX(Component.CENTER_ALIGNMENT); // Căn giữa logo trong sidebar
        title.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 10)); // Tạo khoảng cách dưới logo

        topPanel.add(title, BorderLayout.WEST);

        // Tạo panel chính với GridBagLayout để tùy chỉnh chiều rộng các cột
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setOpaque(false);
        GridBagConstraints mainGbc = new GridBagConstraints();
        mainGbc.insets = new Insets(10, 10, 10, 10);
        mainGbc.fill = GridBagConstraints.BOTH;

        // Tạo panel phụ với GridBagLayout để điều chỉnh tỷ lệ chiều cao các hàng
        JPanel nestedPanel = new JPanel(new GridBagLayout());
        nestedPanel.setOpaque(false);
        GridBagConstraints nestedGbc = new GridBagConstraints();
        nestedGbc.insets = new Insets(5, 5, 5, 5);
        nestedGbc.fill = GridBagConstraints.BOTH;

        // Tạo panel A1 với màu cam
        RoundedPanel panelA1 = new RoundedPanel(50);
        panelA1.setBackground(new Color(241,239,227,255)); // Màu nền sidebar
        panelA1.setLayout(new BorderLayout()); // Đặt layout cho panelA1 để chứa NestedPanelExample

        // Thêm NestedPanelExample vào trong RoundedPanel
        panelA1.add(new KhungGioiThieuNgonNgu(index, selectedLanguage, gridBagPanelDemo), BorderLayout.CENTER);

        // Thêm panelA1 vào giao diện chính
        add(panelA1, BorderLayout.CENTER);

        // Tạo panel A2 với màu hồng
        RoundedPanel panelA2 = new RoundedPanel(50);
        panelA2.setBackground(new Color(0, 0, 0, 0));
        panelA2.setLayout(new BorderLayout());
        panelA2.setPreferredSize(new Dimension(200, 20)); // Kích thước cố định của panelA2

        panelA2.add(new DanhSachBaiHocChinh(this, selectedLanguage), BorderLayout.CENTER);

        // Tạo panel chứa 2 hàng 1 cột
        JPanel innerPanel = new JPanel(new GridBagLayout());
        innerPanel.setOpaque(false); // Đảm bảo trong suốt nếu cần
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;

// Tạo panel trên (hàng 1)
        JPanel topSubPanel = new JPanel();
        topSubPanel.setBackground(new Color(37, 36, 41, 0)); // Đổi màu để dễ nhận diện
        topSubPanel.setPreferredSize(new Dimension(100, 100)); // Kích thước mẫu
        topSubPanel.setLayout(new BorderLayout());
        topSubPanel.add(new PanelAA1(selectedLanguage), BorderLayout.CENTER);
        topSubPanel.setOpaque(false);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5; // Chiếm 50% chiều cao
        innerPanel.add(topSubPanel, gbc);

// Tạo panel dưới (hàng 2)
        bottomSubPanel.setOpaque(false);
        bottomSubPanel.setPreferredSize(new Dimension(100, 100)); // Kích thước mẫu
        bottomSubPanel.setLayout(new BorderLayout());

        danhSachBaiHocCon = new DanhSachBaiHocCon(content, mainFrame);
        bottomSubPanel.add(danhSachBaiHocCon, BorderLayout.CENTER);
        bottomSubPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5; // Chiếm 50% chiều cao
        gbc.gridy = 1;
        innerPanel.add(bottomSubPanel, gbc);

        // Tạo panel B với màu xám nhạt
        RoundedPanel panelB = new RoundedPanel(50);
        panelB.setBackground(new Color(43, 43, 41, 255)); // Màu nền sidebar
        panelB.setLayout(new BorderLayout());
        panelB.add(innerPanel, BorderLayout.CENTER);

        // Thêm panel A1 vào hàng đầu tiên (chiếm 70% chiều cao)
        nestedGbc.gridx = 0;
        nestedGbc.gridy = 0;
        nestedGbc.weighty = 0.7; // Chiều cao 70%
        nestedGbc.weightx = 1.0; // Chiều rộng lấp đầy
        nestedPanel.add(panelA1, nestedGbc);

        // Thêm panel A2 vào hàng thứ hai (chiếm 30% chiều cao)
        nestedGbc.gridy = 1;
        nestedGbc.weighty = 0.3; // Chiều cao 30%
        nestedPanel.add(panelA2, nestedGbc);
//            nestedPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Thêm nestedPanel vào cột đầu tiên của mainPanel
        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        mainGbc.weightx = 0.7; // Chiếm 70% chiều rộng
        mainGbc.weighty = 1.0; // Chiều cao lấp đầy
        mainPanel.add(nestedPanel, mainGbc);

        // Thêm panel B vào cột thứ hai của mainPanel
        mainGbc.gridx = 1;
        mainGbc.weightx = 0.3; // Chiếm 30% chiều rộng
        mainPanel.add(panelB, mainGbc);

        // Thêm mainPanel vào hàng thứ hai của outerPanel
        outerGbc.gridy = 1;
        outerGbc.weighty = 0.9; // Chiều cao chính
        outerPanel.add(mainPanel, outerGbc);

        // Thêm outerPanel vào NestedGridLayoutExample
        add(outerPanel, BorderLayout.CENTER);

    }

    public void setTitleColor(Color color) {
            title.setForeground(color);
    }

    public class PanelAA1 extends JPanel {

        public PanelAA1(String selectedLanguage) {
            setLayout(new GridBagLayout());
            setOpaque(false);
            setBorder(null);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1;
            gbc.weighty = 0.9;
            gbc.insets = new Insets(0, 10, 0, 10); // Thêm padding giữa tiêu đề và panelA2
            add(new BieuDoDonut(selectedLanguage), gbc);

            gbc.gridy = 1;
            gbc.weighty = 0.1;
            add(new MucConCuaBieuDo(selectedLanguage), gbc);
        }
    }

    public void updateDanhSachBaiHocCon(String content) {
        if (danhSachBaiHocCon != null) {
            bottomSubPanel.remove(danhSachBaiHocCon);
        }

        Data data = new Data();
        data.setBaihoc(content);

        danhSachBaiHocCon = new DanhSachBaiHocCon(content, mainFrame);
        bottomSubPanel.add(danhSachBaiHocCon, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        bottomSubPanel.revalidate();
        bottomSubPanel.repaint();

        NguoiDung nguoiDung = new NguoiDung();
        String maND = nguoiDung.getMaNguoiDung();
        HethongDAO dao = new HethongDAO();
        String check = dao.getBaiHocHienTai(maND);
        if (check != null) {
            dao.updateBaiHocHienTai(maND, content);
        } else {
            dao.insertHeThong(maND, content);
        }
        
        customPanel.updateDanhSachBai(content);
    }
}
