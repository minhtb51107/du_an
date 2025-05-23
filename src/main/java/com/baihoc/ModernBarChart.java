package com.baihoc;

import com.dao.BaiHocDAO;
import com.data.DanhSachBaiHocData;
import com.entity.Diem;
import com.entity.NguoiDung;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ModernBarChart extends JPanel {
    NguoiDung nguoiDung = new NguoiDung();
    String maND = nguoiDung.getMaNguoiDung();
    BaiHocDAO dao = new BaiHocDAO();
    int mabhc;

    public ModernBarChart(String title, String content) {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);
        setBorder(null);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        //setPreferredSize(new Dimension(400, 400));
        
        mabhc = dao.getMaBaiHocConByTen(content);

        // Tạo dataset
        CategoryDataset dataset = createDataset();

        // Tạo biểu đồ
        JFreeChart chart = ChartFactory.createBarChart(
                "",
                "",
                "",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                false,
                false);

        // Tùy chỉnh biểu đồ
        chart.setBackgroundPaint(new Color(0, 0, 0, 0)); // Nền chart trong suốt
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(0, 0, 0, 0)); // Nền plot trong suốt
        plot.getRangeAxis().setRange(0, 10);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        // Đổi màu chữ trục X và Y thành màu trắng
        plot.getDomainAxis().setLabelPaint(Color.WHITE);
        plot.getDomainAxis().setTickLabelPaint(Color.WHITE);
        plot.getRangeAxis().setLabelPaint(Color.WHITE);
        plot.getRangeAxis().setTickLabelPaint(Color.WHITE);

// Đổi màu gridline nếu cần
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);

        // Tùy chỉnh màu sắc cột
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        Color[] colors = {new Color(247,246,244,255)};
        for (int i = 0; i < colors.length; i++) {
            renderer.setSeriesPaint(i, colors[i % colors.length]);
        }
        renderer.setMaximumBarWidth(0.1);
        renderer.setItemMargin(0.3);
        plot.setOutlinePaint(null);
        // ChartPanel trong suốt
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(100, 100));
        chartPanel.setOpaque(false);
        chartPanel.setBackground(new Color(0, 0, 0, 0));
        chartPanel.setBorder(null);

        // JScrollPane trong suốt
        JScrollPane scrollPane = new JScrollPane(chartPanel);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBackground(new Color(0, 0, 0, 0));
        scrollPane.getViewport().setBackground(new Color(0, 0, 0, 0));
        scrollPane.setBorder(null);

        add(scrollPane);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Lấy danh sách điểm
        List<Diem> danhSachDiem = dao.getDanhSachDiemByNguoiDungVaBaiHocCon(maND, mabhc);

        int i = 1;
        for (Diem diem : danhSachDiem) {
            dataset.addValue(diem.getSoDiem(), "", "Bài: " + i);
            i++;
        }

        return dataset;
    }

}
