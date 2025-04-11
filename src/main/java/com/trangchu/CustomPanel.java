package com.trangchu;

import com.dao.HethongDAO;
import com.entity.Data;
import com.entity.NguoiDung;
import com.swing.RoundedPanel;
import com.ui.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class CustomPanel extends JPanel {

    MainFrame mainFrame;

    // Thêm biến này để giữ tham chiếu
    private LineChartExample lineChartExample;

    ModernBarChart modernBarChart;

    HorizontalBarChart horizontalBarChart;

    List<JLabel> sectionLabels = new ArrayList<>();
    
    private DanhSachBaiHocCon danhSachBaiHocCon;
    JPanel bottomPanel = new JPanel();

            Data data = new Data();
            
    public CustomPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        setLayout(new GridBagLayout());
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;

        // Main Panel (2 columns, 1 row)
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setOpaque(false);
        GridBagConstraints mainGbc = new GridBagConstraints();
        mainGbc.fill = GridBagConstraints.BOTH;
        mainGbc.weightx = 1;
        mainGbc.weighty = 1;

        // Panel A (3 rows, 1 column)
        JPanel panelA = new JPanel(new GridBagLayout());
        panelA.setOpaque(false);
        GridBagConstraints panelAGbc = new GridBagConstraints();
        panelAGbc.fill = GridBagConstraints.BOTH;
        panelAGbc.weightx = 1;
        panelAGbc.weighty = 1;
        panelAGbc.gridx = 0;

        // Thêm từng giao diện vào panelA
        panelAGbc.gridy = 0;
        panelA.add(createSectionPanel("Danh sách công việc", new DanhSachBaiHocChinh()), panelAGbc);

        panelAGbc.gridy = 1;
        // Khởi tạo và lưu instance vào biến field
        lineChartExample = new LineChartExample();
        panelA.add(createSectionPanel("Hiệu quả học tập", lineChartExample), panelAGbc);

        panelAGbc.gridy = 2;
        modernBarChart = new ModernBarChart();
        panelA.add(createSectionPanel("So sánh tiến độ học", modernBarChart), panelAGbc);
        panelA.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        // Panel B (có thể bổ sung thành phần nếu cần)
        JPanel panelB = new JPanel();
        //panelB.setBackground(new Color(43,43,41,255));
        panelB.setLayout(new GridBagLayout());
        panelB.setOpaque(false);

        GridBagConstraints panelBGbc = new GridBagConstraints();
        panelBGbc.fill = GridBagConstraints.BOTH;
        panelBGbc.weightx = 1;
        panelBGbc.weighty = 1;
        panelBGbc.gridx = 0;

        panelBGbc.gridy = 0;
        horizontalBarChart = new HorizontalBarChart();
        panelB.add(createSectionPanel("Tiến độ hoàn thành khóa học", horizontalBarChart), panelBGbc);

        panelBGbc.gridy = 1;
        bottomPanel = new JPanel();
        //bottomPanel.setBackground(new Color(242,240,228,0));
        bottomPanel.setOpaque(false);
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        
        NguoiDung nguoiDung = new NguoiDung();
        String maND = nguoiDung.getMaNguoiDung();
        HethongDAO dao = new HethongDAO();
        String check = dao.getBaiHocHienTai(maND);
        Data data = new Data();
        data.setBaihoc(check);
        bottomPanel.add(createSectionPanel("Danh sách bài học đang học", new DanhSachBaiHocCon(data.getBaihoc(), mainFrame)), BorderLayout.CENTER);
        panelB.add(bottomPanel, panelBGbc);

        // Thêm panelA và panelB vào mainPanel
        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        mainGbc.weightx = 0.7;
        mainPanel.add(panelA, mainGbc);

        mainGbc.gridx = 1;
        mainGbc.weightx = 0.3;
        mainPanel.add(panelB, mainGbc);

        // Add mainPanel to CustomPanel
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(mainPanel, gbc);
    }

    public void applyThemeToChart(Color color) {
        if (lineChartExample != null) {
            lineChartExample.applyTheme(color);
        }
    }

    public void applyThemeToModernBarChart(Color barColor, Color axisColor, Color gridlineColor) {
        if (modernBarChart != null) {
            modernBarChart.applyTheme(barColor, axisColor, gridlineColor);
        }
    }

    public void applyThemeToHorizontalBarChart(Color color) {
        if (horizontalBarChart != null) {
            horizontalBarChart.applyTheme(color);
        }
    }

    public void setSectionTitleColor(Color color) {
        for (JLabel label : sectionLabels) {
            label.setForeground(color);
        }
    }

    private JPanel createSectionPanel(String title, JComponent component) {
        setOpaque(false);
        JPanel sectionPanel = new JPanel(new GridBagLayout());
        sectionPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;

        // Tiêu đề
        JLabel label = new JLabel(title, JLabel.LEFT); // Đổi thành biến cục bộ
        label.setFont(new Font("Arial", Font.BOLD, 22));

        sectionLabels.add(label); // Thêm vào danh sách

        gbc.gridy = 0;
        gbc.weighty = 0.1;
        sectionPanel.add(label, gbc);

        // Nội dung chính
        gbc.gridy = 1;
        gbc.weighty = 0.9;
        sectionPanel.add(component, gbc);

        return sectionPanel;
    }

    public void updateDanhSachBai(String content) {
        if (danhSachBaiHocCon != null) {
            bottomPanel.removeAll();
        }

        danhSachBaiHocCon = new DanhSachBaiHocCon(content, mainFrame);
        Data data = new Data();
        data.setBaihoc(content);
        bottomPanel.add(createSectionPanel("Danh sách bài học đang học", danhSachBaiHocCon), BorderLayout.CENTER);

        // Cập nhật lại giao diện
        bottomPanel.revalidate();
        bottomPanel.repaint();
    }
}
