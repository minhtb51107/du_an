package com.trangchu;

import com.dao.ThoiGianHoatDongDAO;
import com.data.DanhSachBaiHocData;
import com.entity.NguoiDung;
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
import java.time.LocalDate;
import java.util.Map;

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

        //--- chuẩn bị dữ liệu tuần này và tuần trước ---
        NguoiDung nguoiDung = new NguoiDung();
        String maNguoiDung = nguoiDung.getMaNguoiDung();
        ThoiGianHoatDongDAO dao = new ThoiGianHoatDongDAO();

        LocalDate today = LocalDate.now();
        // tuần này: từ thứ 2 đến CN
        LocalDate startOfWeek = today.minusDays(today.getDayOfWeek().getValue() - 1);
        LocalDate endOfWeek = startOfWeek.plusDays(6);
        // tuần trước
        LocalDate startOfLastWeek = startOfWeek.minusWeeks(1);
        LocalDate endOfLastWeek = startOfWeek.minusDays(1);

        Map<LocalDate, Integer> dataThisWeek
                = dao.getTongThoiGianTheoNgay(maNguoiDung, startOfWeek, endOfWeek);
        Map<LocalDate, Integer> dataLastWeek
                = dao.getTongThoiGianTheoNgay(maNguoiDung, startOfLastWeek, endOfLastWeek);

        //--- vòng lặp tạo 2 cột: "Tuần này" và "Tuần trước" ---
        for (int i = 0; i < 7; i++) {
            LocalDate dateThis = startOfWeek.plusDays(i);
            LocalDate dateLast = startOfLastWeek.plusDays(i);

            int secondsThis = dataThisWeek.getOrDefault(dateThis, 0);
            int secondsLast = dataLastWeek.getOrDefault(dateLast, 0);

            // chuyển sang %: percent = seconds * 100 / 7200, cắt max 100
            double percentThis = Math.min(secondsThis * 100.0 / 7200.0, 100.0);
            double percentLast = Math.min(secondsLast * 100.0 / 7200.0, 100.0);

            dataset.addValue(percentLast, "Tuần trước", daysOfWeek[i]);
            dataset.addValue(percentThis, "Tuần này", daysOfWeek[i]);
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
