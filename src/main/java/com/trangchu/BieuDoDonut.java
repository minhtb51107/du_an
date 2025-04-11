/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trangchu;

/**
 *
 * @author PC
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class BieuDoDonut extends JPanel {

    public BieuDoDonut() {
        setLayout(new BorderLayout());
        setBorder(null);
        setOpaque(false);
        setBackground(null);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        add(createDonutChartPanel(), BorderLayout.CENTER);
    }

    private JPanel createDonutChartPanel() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        dataset.setValue("Hoàn Thành", 60.0);  // Phần hoàn thành
        dataset.setValue("Chưa Hoàn Thành", 40.0);  // Phần chưa hoàn thành

        JFreeChart chart = ChartFactory.createRingChart(
                null, dataset, false, true, false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        
        // Đặt màu sắc cho các phần
        plot.setSectionPaint(0, Color.WHITE);  // Màu trắng cho phần "Chưa Hoàn Thành"
        plot.setSectionPaint(1, Color.BLACK);  // Màu đen cho phần "Hoàn Thành"

        plot.setInteriorGap(0.1); // Giảm khoảng trống giữa phần của donut
        plot.setShadowPaint(null); // Tắt bóng

        // Nếu có phần "Chưa Hoàn Thành", đảm bảo nó được hiển thị màu trắng
        if (dataset.getKeys().contains("Chưa Hoàn Thành")) {
            plot.setSectionPaint(0, Color.WHITE);
        }

        plot.setInteriorGap(0.4); // Điều chỉnh khoảng cách giữa các phần
        plot.setLabelGenerator(null);  // Không hiển thị nhãn
        plot.setOutlinePaint(null);  // Không hiển thị viền ngoài
        plot.setBackgroundPaint(null);  // Không có màu nền
        chart.setBackgroundPaint(null);  // Không có màu nền cho biểu đồ

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setLayout(new BorderLayout());
        chartPanel.setOpaque(false);
        chartPanel.setBorder(BorderFactory.createEmptyBorder());
        chartPanel.setBackground(null);
        chartPanel.setPreferredSize(new Dimension(100, 100)); // Kích thước lớn hơn
        chartPanel.setMinimumSize(new Dimension(100, 100));

        // Hiển thị tỷ lệ phần trăm vào giữa biểu đồ
        JLabel lblCenter = new JLabel("60%", SwingConstants.CENTER);  // Đặt phần trăm hoàn thành
        lblCenter.setFont(new Font("Arial", Font.BOLD, 20));
        lblCenter.setForeground(Color.WHITE);
        lblCenter.setOpaque(false);

        chartPanel.add(lblCenter, BorderLayout.CENTER);
        return chartPanel;
    }

//    public static void main(String[] args) {
//        // Sử dụng SwingUtilities để đảm bảo giao diện người dùng được tạo trong luồng sự kiện đúng
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                // Tạo cửa sổ JFrame
//                JFrame frame = new JFrame("Biểu đồ Donut");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setSize(800, 800); // Đặt kích thước cửa sổ
//
//                // Thêm panel chứa biểu đồ donut vào cửa sổ
//                frame.add(new BieuDoDonut());
//
//                // Đặt cửa sổ ở giữa màn hình
//                frame.setLocationRelativeTo(null);
//
//                // Hiển thị cửa sổ
//                frame.setVisible(true);
//            }
//        });
//    }
}

