/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils;

/**
 *
 * @author PC
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class AdvancedFileReader {
    public static List<String> readSpecificSection(String fileName, String targetSection) {
        List<String> result = new ArrayList<>();

        // Kiểm tra tên file hợp lệ
        if (fileName == null || fileName.isEmpty()) {
            System.err.println("Error: File name is null or empty.");
            return result;
        }

        File file = new File(fileName);
        if (!file.exists()) {
            System.err.println("Error: File not found - " + fileName);
            return result;
        }

        boolean inTargetSection = false;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();

                // Xác định phần cần đọc
                if (line.startsWith("[") && line.endsWith("]")) {
                    inTargetSection = line.substring(1, line.length() - 1).equalsIgnoreCase(targetSection);
                    continue;
                }

                // Nếu đang ở phần cần đọc, thêm vào danh sách kết quả
                if (inTargetSection && !line.isEmpty()) {
                    result.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }

        return result;
    }
}


