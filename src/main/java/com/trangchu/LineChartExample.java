package com.trangchu;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;

public class LineChartExample extends JPanel {
    
    private CategoryPlot plot;
    private LineAndShapeRenderer renderer;

    public LineChartExample() {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(0,20,0,20));

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
                null,   // Bỏ tiêu đề
                null,   // Bỏ nhãn trục X
                null,   // Bỏ nhãn trục Y
                dataset,            // Dữ liệu
                PlotOrientation.VERTICAL,  // Hướng vẽ biểu đồ
                false,              // Không hiển thị chú thích
                true,               // Hiển thị tooltip
                false               // Không hiển thị URL
        );

        // Tùy chỉnh plot
        lineChart.setBackgroundPaint(new Color(0, 0, 0, 0));
        plot = lineChart.getCategoryPlot();

        // Renderer để vẽ line
        renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.WHITE); // Màu line chính
        renderer.setSeriesStroke(0, new BasicStroke(2.0f)); // Độ dày line

// Trục X
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setAxisLinePaint(Color.WHITE); // Màu trục X
        domainAxis.setTickLabelPaint(Color.WHITE); // Màu chữ dưới trục X

// Trục Y
        ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setAxisLinePaint(Color.WHITE); // Màu trục Y
        rangeAxis.setTickLabelPaint(Color.WHITE); // Màu số của trục Y

// Gridline (bạn đã có, nhưng nên thống nhất màu)
        plot.setDomainGridlinePaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.WHITE);


        plot.setBackgroundPaint(null);  // Bỏ nền của biểu đồ
        plot.setOutlinePaint(null);     // Bỏ viền của biểu đồ
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.getRangeAxis().setRange(0, 100);
        plot.setBackgroundPaint(new Color(0, 0, 0, 0));
        
        NumberAxis rangeAxis1 = (NumberAxis) plot.getRangeAxis();
        rangeAxis1.setTickUnit(new NumberTickUnit(10));

        // Tùy chỉnh đường vẽ
        renderer = new LineAndShapeRenderer();
        renderer = (LineAndShapeRenderer) plot.getRenderer();
        //renderer.setSeriesPaint(0, Color.BLACK); // Màu đường
        renderer.setSeriesShapesVisible(0, true); // Hiển thị điểm
        plot.setRenderer(renderer);

        // Hiển thị biểu đồ
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new Dimension(100, 200)); // Kích thước lớn hơn
        chartPanel.setMinimumSize(new Dimension(100, 200));
        chartPanel.setOpaque(false);
        add(chartPanel);
    }
    
        public void applyTheme(Color color) {
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LineChartExample example = new LineChartExample();
            example.setPreferredSize(new Dimension(800, 600));
            JFrame frame = new JFrame("Line Chart Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(example);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
