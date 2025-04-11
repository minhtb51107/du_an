/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimeTrackerUI extends JFrame {
    private JLabel timeLabel;
    private JLabel statusLabel;
    private JButton interactButton;
    private JButton stopButton;

    private TimeTracker tracker;

    public TimeTrackerUI() {
        tracker = new TimeTracker();

        setTitle("Kiểm tra Thời gian hoạt động");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeLabel = new JLabel("Tổng thời gian: 0 giây", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 16));

        statusLabel = new JLabel("Trạng thái: Đang hoạt động", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.ITALIC, 14));

        interactButton = new JButton("Tương tác");
        interactButton.addActionListener(e -> {
            tracker.recordInteraction();
            statusLabel.setText("Trạng thái: Đang hoạt động");
        });

        stopButton = new JButton("Thoát");
        stopButton.addActionListener(e -> {
            tracker.stop();
            dispose();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(interactButton);
        buttonPanel.add(stopButton);

        add(timeLabel, BorderLayout.NORTH);
        add(statusLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Cập nhật giao diện mỗi giây để xem tổng thời gian hoạt động
        Timer uiTimer = new Timer(1000, e -> {
            timeLabel.setText("Tổng thời gian: " + tracker.getTotalActiveSeconds() + " giây");
            if (!tracker.isActive()) {
                statusLabel.setText("Trạng thái: Timeout do không tương tác");
            }
        });
        uiTimer.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TimeTrackerUI::new);
    }
}

// Class theo dõi thời gian
class TimeTracker {
    private LocalDateTime lastInteractionTime;
    private long totalActiveSeconds;
    private final long timeoutSeconds = 10; // Timeout sau 10 giây không tương tác
    private boolean isActive = true;

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public TimeTracker() {
        lastInteractionTime = LocalDateTime.now();
        totalActiveSeconds = 0;
        startTimeoutChecker();
    }

    private void startTimeoutChecker() {
        scheduler.scheduleAtFixedRate(() -> {
            if (isActive) {
                Duration idleDuration = Duration.between(lastInteractionTime, LocalDateTime.now());
                if (idleDuration.getSeconds() >= timeoutSeconds) {
                    isActive = false;
                    System.out.println("Timeout do không tương tác.");
                } else {
                    totalActiveSeconds++;
                }
            }
        }, 0, 1, TimeUnit.SECONDS); // Kiểm tra mỗi giây
    }

    public void recordInteraction() {
        if (!isActive) {
            isActive = true;
            System.out.println("Người dùng quay lại, tiếp tục tính thời gian.");
        }
        lastInteractionTime = LocalDateTime.now();
    }

    public long getTotalActiveSeconds() {
        return totalActiveSeconds;
    }

    public boolean isActive() {
        return isActive;
    }

    public void stop() {
        scheduler.shutdown();
    }
}

