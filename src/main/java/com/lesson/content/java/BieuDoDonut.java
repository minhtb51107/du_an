/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson.content.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author PC
 */
public class BieuDoDonut extends JPanel {

    public BieuDoDonut() {
        setLayout(new BorderLayout());
        setBorder(null);
        setOpaque(false);
        setBackground(null);
        setPreferredSize(new Dimension(500, 500));
        setMinimumSize(new Dimension(300, 300));

        add(createDonutChartPanel(), BorderLayout.CENTER);
    }

    private JPanel createDonutChartPanel() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        dataset.setValue("Bài 1", 10);
        dataset.setValue("Bài 2", 16.67);
        dataset.setValue("Bài 3", 16.67);
        dataset.setValue("Bài 4", 16.67);
        dataset.setValue("Bài 5", 16.67);
        dataset.setValue("Bài 6", 16.67);

        double totalCompleted = dataset.getKeys().stream()
                .mapToDouble(key -> dataset.getValue((String) key).doubleValue()).sum();

        if (totalCompleted < 100) {
            dataset.setValue("Chưa hoàn thành", 100 - totalCompleted);
        }

        JFreeChart chart = ChartFactory.createRingChart(
                null, dataset, false, true, false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionPaint(1, new Color(255, 99, 132));
        plot.setSectionPaint(2, new Color(54, 162, 235));
        plot.setSectionPaint(3, new Color(255, 206, 86));
        plot.setSectionPaint(4, new Color(75, 192, 192));
        plot.setSectionPaint(5, new Color(153, 102, 255));
        plot.setSectionPaint(6, new Color(255, 159, 64));
        plot.setInteriorGap(0);
        plot.setShadowPaint(null);

        if (dataset.getKeys().contains("Chưa hoàn thành")) {
            plot.setSectionPaint(0, Color.WHITE);
        }

        plot.setInteriorGap(0.4);
        plot.setLabelGenerator(null);
        plot.setOutlinePaint(null);
        plot.setBackgroundPaint(null);
        chart.setBackgroundPaint(null);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setLayout(new BorderLayout());
        chartPanel.setOpaque(false);
        chartPanel.setBorder(BorderFactory.createEmptyBorder());
        chartPanel.setBackground(null);
        chartPanel.setBorder(null);
        chartPanel.setPreferredSize(new Dimension(600, 600)); // Kích thước lớn hơn
        chartPanel.setMinimumSize(new Dimension(600, 600));

        JLabel lblCenter = new JLabel(String.format("%.2f%%", totalCompleted), SwingConstants.CENTER);
        lblCenter.setFont(new Font("Arial", Font.BOLD, 20));
        lblCenter.setForeground(Color.WHITE);
        lblCenter.setOpaque(false);

        chartPanel.add(lblCenter, BorderLayout.CENTER);
        return chartPanel;
    }
}
