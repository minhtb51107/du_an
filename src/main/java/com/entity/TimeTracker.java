/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author PC
 */
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
