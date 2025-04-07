package com.trangchu;

import com.data.DanhSachBaiHocData;
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

public class ModernBarChart extends JPanel {

    private BarRenderer renderer;
    private CategoryPlot plot;

    public ModernBarChart() {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(null);
        setBorder(null);
        setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

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
        plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(0, 0, 0, 0)); // Nền plot trong suốt
        plot.getRangeAxis().setRange(0, 10);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        plot.getRangeAxis().setRange(0, 100);
        
        // Đổi màu chữ trục X và Y thành màu trắng
        plot.getDomainAxis().setLabelPaint(Color.BLACK);
        plot.getDomainAxis().setTickLabelPaint(Color.BLACK);
        plot.getRangeAxis().setLabelPaint(Color.BLACK);
        plot.getRangeAxis().setTickLabelPaint(Color.BLACK);

        // Đổi màu gridline nếu cần
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);

        // Tùy chỉnh màu sắc cột
        renderer = (BarRenderer) plot.getRenderer();
        Color[] colors = {new Color(43,43,41,255), new Color(242,240,228,255)};
        for (int i = 0; i < colors.length; i++) {
            renderer.setSeriesPaint(i, colors[i % colors.length]);
        }
        renderer.setMaximumBarWidth(0.1);
        renderer.setItemMargin(0.1); // Giảm khoảng cách giữa các cột
        plot.setOutlinePaint(null);
        
        // Hiển thị tỉ lệ % trên cột
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);
        renderer.setBaseItemLabelPaint(Color.BLACK);

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
        String[] daysOfWeek = {"Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7", "Chủ Nhật"};

        for (int i = 0; i < 7; i++) {
            dataset.addValue((int) (Math.random() * 100), "Nhóm 1", daysOfWeek[i]);
            dataset.addValue((int) (Math.random() * 100), "Nhóm 2", daysOfWeek[i]);
        }
        return dataset;
    }

    // Phương thức applyTheme để thay đổi màu sắc các thành phần trong biểu đồ
    public void applyTheme(Color barColor, Color axisColor, Color gridlineColor) {
        // Đổi màu cột
//        for (int i = 1; i < 2; i++) {
//            renderer.setSeriesPaint(i, barColor);
//        }

        // Đổi màu trục X và Y
        plot.getDomainAxis().setLabelPaint(axisColor);
        plot.getDomainAxis().setTickLabelPaint(axisColor);
        plot.getRangeAxis().setLabelPaint(axisColor);
        plot.getRangeAxis().setTickLabelPaint(axisColor);

        // Đổi màu gridline
        plot.setRangeGridlinePaint(gridlineColor);
        plot.setDomainGridlinePaint(gridlineColor);
        renderer.setBaseItemLabelPaint(gridlineColor);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Modern Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.add(new ModernBarChart());
        frame.setVisible(true);
    }
}
