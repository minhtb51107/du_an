/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import com.dao.BaiHocDAO;
import com.data.DanhSachBaiHocChinhData;
import com.entity.Diem;
import com.entity.DiemTrungBinhBaiHocChinh;
import com.entity.NguoiDung;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;

import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author PC
 */
public class BieuDoDonut extends JPanel {
        BaiHocDAO dao = new BaiHocDAO();
    Diem diem = new Diem();
    NguoiDung nguoiDung = new NguoiDung();
    String maND = nguoiDung.getMaNguoiDung();
    int makh;

    public BieuDoDonut(String selectedLanguage) {
        this.makh = dao.getMaKhoaHocByTen(selectedLanguage);
        setLayout(new BorderLayout());
        setBorder(null);
        setOpaque(false);
        setBackground(null);
//        setPreferredSize(new Dimension(600, 600));
//        setMinimumSize(new Dimension(600, 600));
        setBorder(BorderFactory.createEmptyBorder(0,0,10,0));

        add(createDonutChartPanel(selectedLanguage), BorderLayout.CENTER);
    }

    private JPanel createDonutChartPanel(String selectedLanguage) {
        DefaultPieDataset dataset = new DefaultPieDataset();

        String[] titles = DanhSachBaiHocChinhData.getTitles(selectedLanguage);

        int soLuongMucCon = titles.length; // Số lượng mục con bạn muốn
        double tiLeMoiMuc = 100.0 / soLuongMucCon;
        List<DiemTrungBinhBaiHocChinh> list = dao.getDiemTrungBinhBaiHocChinh(maND, makh);

        int index = 0;
//        double diemTB = list.get(index).getDiemTrungBinhBaiHocChinh();
        double diemTB = 0;


//        for (int i = 0; i < soLuongMucCon; i++) {
//            diemTB = list.get(index).getDiemTrungBinhBaiHocChinh();
//            dataset.setValue("" + i, tiLeMoiMuc);
//            index++;
//        }

        for (int i = 0; i < soLuongMucCon; i++) {
            diemTB = list.get(i).getDiemTrungBinhBaiHocChinh();
            dataset.setValue(""+ i, diemTB/tiLeMoiMuc);
        }

        double totalCompleted = dataset.getKeys().stream()
                .mapToDouble(key -> dataset.getValue((String) key).doubleValue()).sum();

        if (totalCompleted < 100) {
            dataset.setValue("Chưa hoàn thành", 100 - totalCompleted);
        }

        JFreeChart chart = ChartFactory.createRingChart(
                null, dataset, false, true, false
        );

        Color[] colors = {
            new Color(255, 99, 132), // Đỏ hồng
            new Color(54, 162, 235), // Xanh dương
            new Color(255, 206, 86), // Vàng
            new Color(75, 192, 192), // Xanh ngọc
            new Color(153, 102, 255), // Tím
            new Color(255, 159, 64) // Cam
        };

        PiePlot plot = (PiePlot) chart.getPlot();
        for (int i = 0; i < soLuongMucCon; i++) {
            plot.setSectionPaint(i, colors[i]);
        }

        if (dataset.getKeys().contains("Chưa hoàn thành")) {
            plot.setSectionPaint(soLuongMucCon, Color.WHITE);
        }

        plot.setInteriorGap(0.1); // Giảm khoảng trống, biểu đồ to hơn
        plot.setShadowPaint(null);

        plot.setInteriorGap(0.4);
        plot.setLabelGenerator(null);
        plot.setOutlinePaint(null);
        plot.setBackgroundPaint(null);
        chart.setBackgroundPaint(null);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setLayout(new BorderLayout());
        chartPanel.setOpaque(false);
        chartPanel.setBorder(BorderFactory.createEmptyBorder());
        chartPanel.setBackground(null);
        chartPanel.setBorder(null);
        chartPanel.setPreferredSize(new Dimension(700, 700)); // Kích thước lớn hơn
        chartPanel.setMinimumSize(new Dimension(700, 700));

        JLabel lblCenter = new JLabel(String.format("%.2f%%", totalCompleted), SwingConstants.CENTER);
        lblCenter.setFont(new Font("Arial", Font.BOLD, 20));
        lblCenter.setForeground(Color.WHITE);
        lblCenter.setOpaque(false);

        chartPanel.add(lblCenter, BorderLayout.CENTER);
        return chartPanel;
    }
}
