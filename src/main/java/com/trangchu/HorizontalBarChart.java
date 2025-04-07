package com.trangchu;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class HorizontalBarChart extends JPanel {
    
    CategoryPlot plot;
    BarRenderer renderer;

    public HorizontalBarChart() {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);
        setBorder(null);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Tạo dataset
        CategoryDataset dataset = createDataset();

        // Tạo biểu đồ cột ngang
        JFreeChart chart = ChartFactory.createBarChart(
                "", // Tiêu đề
                "", // Nhãn trục Y
                "", // Nhãn trục X
                dataset,
                PlotOrientation.HORIZONTAL, // Biểu đồ ngang
                false, // Ẩn legend
                false,
                false
        );

        // Tùy chỉnh biểu đồ
        chart.setBackgroundPaint(new Color(0, 0, 0, 0)); // Nền trong suốt
        plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(0, 0, 0, 0)); // Ẩn nền plot
        plot.setOutlinePaint(null); // Ẩn viền

        // Cài đặt trục X (giá trị từ 0 - 100)
        plot.getRangeAxis().setRange(0, 100);
        plot.getRangeAxis().setLabelPaint(Color.BLACK);
        plot.getRangeAxis().setTickLabelPaint(Color.BLACK);

        // Cài đặt trục Y (hiển thị danh sách ngôn ngữ lập trình)
        plot.getDomainAxis().setLabelPaint(Color.BLACK);
        plot.getDomainAxis().setTickLabelPaint(Color.BLACK);

        // Đổi màu gridline
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);

        // Tùy chỉnh thanh cột
        renderer = (BarRenderer) plot.getRenderer();
        renderer.setMaximumBarWidth(0.1); // Độ rộng cột
        renderer.setItemMargin(0.2); // Khoảng cách giữa các cột
//        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
//        renderer.setBaseItemLabelsVisible(true);
//        renderer.setBaseItemLabelPaint(Color.BLACK);

        // Tô màu từng cột
        Color[] colors = {
                new Color(43,43,41,255)
        };

        for (int i = 0; i < colors.length; i++) {
            renderer.setSeriesPaint(i, colors[i % colors.length]);
        }

        // Thêm chart vào panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(200, 100));
        chartPanel.setOpaque(false);
        chartPanel.setBackground(new Color(0, 0, 0, 0));
        chartPanel.setBorder(null);

        add(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String[] languages = {"Java", "HTML & CSS", "C", "JavaScript", "Python", "SQL"};

        for (String lang : languages) {
            dataset.addValue((int) (Math.random() * 100), "Số lượng", lang);
        }

        return dataset;
    }

    public void applyTheme(Color barColor) {
        // Đổi màu cột
        renderer.setSeriesPaint(0, barColor);

        // Đổi màu trục X và Y
        plot.getDomainAxis().setLabelPaint(barColor);
        plot.getDomainAxis().setTickLabelPaint(barColor);
        plot.getRangeAxis().setLabelPaint(barColor);
        plot.getRangeAxis().setTickLabelPaint(barColor);

        // Đổi màu gridline
        plot.setRangeGridlinePaint(barColor);
        plot.setDomainGridlinePaint(barColor);
        renderer.setBaseItemLabelPaint(barColor);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Horizontal Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.add(new HorizontalBarChart());
        frame.setVisible(true);
    }
}
