package com.trangchu;

import com.dao.ThoiGianHoatDongDAO;
import com.entity.NguoiDung;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.Map;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

public class LineChartExample extends JPanel {

    private CategoryPlot plot;
    private LineAndShapeRenderer renderer;

    public LineChartExample() {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        // Tạo dataset
        CategoryDataset dataset = createDataset();

        // Tạo biểu đồ
        JFreeChart lineChart = ChartFactory.createLineChart(
                null, // Bỏ tiêu đề
                null, // Bỏ nhãn trục X
                null, // Bỏ nhãn trục Y
                dataset, // Dữ liệu
                PlotOrientation.VERTICAL, // Hướng vẽ biểu đồ
                false, // Không hiển thị chú thích
                true, // Hiển thị tooltip
                false // Không hiển thị URL
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

        plot.getRangeAxis().setRange(0, 100);
        ((NumberAxis) plot.getRangeAxis()).setTickUnit(new NumberTickUnit(10));

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

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String[] daysOfWeek = {
            "Thứ 2", "Thứ 3", "Thứ 4",
            "Thứ 5", "Thứ 6", "Thứ 7", "Chủ Nhật"
        };

        // Lấy mã người dùng
        NguoiDung nguoiDung = new NguoiDung();
        String maNguoiDung = nguoiDung.getMaNguoiDung();
        ThoiGianHoatDongDAO dao = new ThoiGianHoatDongDAO();

        // Xác định đầu và cuối tuần này
        LocalDate today = LocalDate.now();
        LocalDate startOfWeek = today.minusDays(today.getDayOfWeek().getValue() - 1);
        LocalDate endOfWeek = startOfWeek.plusDays(6);

        // Lấy tổng giây hoạt động mỗi ngày trong tuần này
        Map<LocalDate, Integer> dataThisWeek
                = dao.getTongThoiGianTheoNgay(maNguoiDung, startOfWeek, endOfWeek);

        // Đưa vào dataset
        for (int i = 0; i < 7; i++) {
            LocalDate date = startOfWeek.plusDays(i);
            int seconds = dataThisWeek.getOrDefault(date, 0);

            // Chuyển sang %: 7200s = 100%, 1800s = 25%
            double percent = Math.min(seconds * 100.0 / 7200.0, 100.0);

            // Ở đây ta đặt tên series là "Tuần này"
            dataset.addValue(percent, "Tuần này", daysOfWeek[i]);
        }

        return dataset;
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
