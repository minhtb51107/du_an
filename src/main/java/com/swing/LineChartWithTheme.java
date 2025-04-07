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
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LineChartWithTheme extends JPanel {

    private CategoryPlot plot;
    private LineAndShapeRenderer renderer;
    private JComboBox<String> themeComboBox;

    public LineChartWithTheme() {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        // Tạo dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Doanh thu", "Thứ 2");
        dataset.addValue(20, "Doanh thu", "Thứ 3");
        dataset.addValue(30, "Doanh thu", "Thứ 4");
        dataset.addValue(25, "Doanh thu", "Thứ 5");
        dataset.addValue(35, "Doanh thu", "Thứ 6");
        dataset.addValue(40, "Doanh thu", "Thứ 7");
        dataset.addValue(50, "Doanh thu", "Chủ Nhật");

        // Tạo biểu đồ
        JFreeChart lineChart = ChartFactory.createLineChart(
                null,
                null,
                null,
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
        );

        // Lấy plot và renderer để thao tác màu sắc
        plot = lineChart.getCategoryPlot();
        renderer = (LineAndShapeRenderer) plot.getRenderer();

        // Thiết lập ban đầu
        applyTheme(Color.BLACK);

        // Chart Panel
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setOpaque(false);
        chartPanel.setPopupMenu(null);
        chartPanel.setDomainZoomable(false);
        chartPanel.setRangeZoomable(false);

        add(chartPanel, BorderLayout.CENTER);

        // ComboBox chọn chủ đề
        themeComboBox = new JComboBox<>(new String[]{"Sáng", "Tối"});
        themeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedTheme = (String) themeComboBox.getSelectedItem();
                if ("Sáng".equals(selectedTheme)) {
                    applyTheme(Color.BLACK);
                } else if ("Tối".equals(selectedTheme)) {
                    applyTheme(Color.WHITE);
                }
            }
        });

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        controlPanel.setOpaque(false);
        controlPanel.add(new JLabel("Chọn giao diện: "));
        controlPanel.add(themeComboBox);

        add(controlPanel, BorderLayout.SOUTH);
    }

    private void applyTheme(Color color) {
        // Đổi màu line
        renderer.setSeriesPaint(0, color);

        // Đổi màu trục X
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setAxisLinePaint(color);
        domainAxis.setTickLabelPaint(color);

        // Đổi màu trục Y
        ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setAxisLinePaint(color);
        rangeAxis.setTickLabelPaint(color);

        // Đổi màu grid line
        plot.setDomainGridlinePaint(color);
        plot.setRangeGridlinePaint(color);
    }

    // Thêm hàm main để chạy
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Biểu đồ có thay đổi giao diện");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setContentPane(new LineChartWithTheme());
            frame.setVisible(true);
        });
    }
}