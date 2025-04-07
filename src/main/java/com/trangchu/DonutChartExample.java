/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trangchu;

/**
 *
 * @author PC
 */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.RingPlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import java.awt.Color;

public class DonutChartExample extends ApplicationFrame {

    public DonutChartExample(String title) {
        super(title);
        JFreeChart chart = createChart(createDataset());
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        double completed = 60.0;  // Phần trăm hoàn thành
        double remaining = 100.0 - completed;  // Phần trăm chưa hoàn thành
        dataset.setValue("Hoàn Thành", completed);
        dataset.setValue("Chưa Hoàn Thành", remaining);
        return dataset;
    }

    private JFreeChart createChart(DefaultPieDataset dataset) {
        // Tạo biểu đồ tròn kiểu donut
        JFreeChart chart = ChartFactory.createRingChart(
                "Biểu Đồ Donut",     // Tiêu đề biểu đồ
                dataset,             // Dữ liệu biểu đồ
                true,                // Hiển thị chú thích
                true,                // Hiển thị tooltip
                false                // Không tạo URL
        );

        // Lấy plot của biểu đồ tròn
        RingPlot plot = (RingPlot) chart.getPlot();
        
        // Chỉnh sửa màu sắc cho phần "Hoàn Thành" và "Chưa Hoàn Thành"
        plot.setSectionPaint(0, Color.BLACK);  // Màu đen cho phần hoàn thành
        plot.setSectionPaint(0, Color.WHITE);  // Màu trắng cho phần chưa hoàn thành
        
        // Sử dụng một cách khác để điều chỉnh độ rộng, thay vì setSectionDepth
        plot.setSectionOutlinePaint(Color.BLACK);  // Đặt đường viền của các phần là màu đen
        return chart;
    }

    public static void main(String[] args) {
        DonutChartExample demo = new DonutChartExample("Biểu Đồ Donut");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}
