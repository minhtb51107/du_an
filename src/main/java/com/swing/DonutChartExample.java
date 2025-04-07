/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swing;

/**
 *
 * @author PC
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;

public class DonutChartExample {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Donut Chart Example");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(600, 400);
//
//            JPanel panel = createDonutChartPanel();
//            frame.setContentPane(panel);
//            frame.setVisible(true);
//        });
//    }
//
//    private static JPanel createDonutChartPanel() {
//        DefaultPieDataset dataset = new DefaultPieDataset();
//
//        // Các phần đã hoàn thành
//        dataset.setValue("Bài 1", 10);
//        dataset.setValue("Bài 2", 16.67);
//        dataset.setValue("Bài 3", 16.67);
//        dataset.setValue("Bài 4", 16.67);
//        dataset.setValue("Bài 5", 16.67);
//        dataset.setValue("Bài 6", 16.67);
//
//        // Tính tổng phần trăm đã hoàn thành
//        double totalCompleted = 0;
//        for (Object key : dataset.getKeys()) {
//            totalCompleted += dataset.getValue((String) key).doubleValue();
//        }
//
//        // Nếu chưa đạt 100%, thêm phần "Chưa hoàn thành"
//        if (totalCompleted < 100) {
//            dataset.setValue("Chưa hoàn thành", 100 - totalCompleted);
//        }
//
//        // Tạo biểu đồ
//        JFreeChart chart = ChartFactory.createRingChart(
//            "Tiến Độ Bài Học", dataset, false, true, false
//        );
//
//        PiePlot plot = (PiePlot) chart.getPlot();
//
//        // Gán màu sắc cho từng phần
//        plot.setSectionPaint(1, new Color(255, 99, 132));  // Đỏ hồng
//        plot.setSectionPaint(2, new Color(54, 162, 235));  // Xanh dương
//        plot.setSectionPaint(3, new Color(255, 206, 86));  // Vàng
//        plot.setSectionPaint(4, new Color(75, 192, 192));  // Xanh ngọc
//        plot.setSectionPaint(5, new Color(153, 102, 255)); // Tím
//        plot.setSectionPaint(6, new Color(255, 159, 64));  // Cam
//
//        // Nếu có "Chưa hoàn thành", đặt màu xám
//        if (dataset.getKeys().contains("Chưa hoàn thành")) {
//            plot.setSectionPaint(0, Color.LIGHT_GRAY);
//        }
//
//        // Tạo hiệu ứng donut
//        plot.setInteriorGap(0.4);
//
//        // Ẩn label của từng phần để tránh rối mắt
//        plot.setLabelGenerator(null);
//
//        // Tạo ChartPanel chứa biểu đồ
//        ChartPanel chartPanel = new ChartPanel(chart);
//        chartPanel.setLayout(new BorderLayout());
//
//        // Tạo JLabel hiển thị tổng % ở giữa biểu đồ
//        JLabel lblCenter = new JLabel();
//        lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
//        lblCenter.setVerticalAlignment(SwingConstants.CENTER);
//        lblCenter.setFont(new Font("Arial", Font.BOLD, 20));
//
//        // Nếu đã đạt 100%, hiển thị "100%"
//        if (totalCompleted >= 100) {
//            lblCenter.setText("100%");
//        } else {
//            lblCenter.setText(String.format("%.2f%%", totalCompleted));
//        }
//
//        // Đặt JLabel vào giữa biểu đồ
//        chartPanel.add(lblCenter, BorderLayout.CENTER);
//
//        return chartPanel;
//    }
}
