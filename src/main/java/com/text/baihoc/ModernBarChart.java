package com.text.baihoc;

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

public class ModernBarChart extends JFrame {

    public ModernBarChart(String title) {
        super(title);

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
        CategoryPlot plot = chart.getCategoryPlot();
        plot.getRangeAxis().setRange(0, 10); // Đặt chỉ số tối đa là 100

//        plot.setBackgroundPaint(Color.WHITE);
//        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);
        // Tùy chỉnh màu sắc cột
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        Color[] colors = {new Color(52, 152, 219), new Color(46, 204, 113), new Color(231, 76, 60)};
        for (int i = 0; i < colors.length; i++) {
            renderer.setSeriesPaint(i, colors[i % colors.length]);
        }
        
        renderer.setMaximumBarWidth(0.1); // Giá trị từ 0.0 đến 1.0
        renderer.setItemMargin(0.3); // Khoảng cách giữa các cột là 30%

        // Làm tròn góc cột
//        renderer.setBarPainter(new org.jfree.chart.renderer.category.StandardBarPainter());
//
        // Căn chỉnh và thêm hiệu ứng
//        renderer.setShadowVisible(false);
//        renderer.setItemMargin(0.05);

        // Thêm biểu đồ vào panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(600, 600));

        JScrollPane scrollPane = new JScrollPane(chartPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setContentPane(scrollPane);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i <= 4; i++) {
            dataset.addValue(100 + (int) (Math.random() * 100), "Nhóm 1", String.valueOf("Bài: " + i));
        }
        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ModernBarChart example = new ModernBarChart("");
            example.setSize(1200, 700);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
