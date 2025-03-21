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
import java.nio.file.*;

public class FileUtils {

    // Phương thức ghi nội dung vào file
    public static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Ghi file thành công: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức đọc nội dung từ file và trả về String
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Phương thức kiểm tra file có tồn tại không
    public static boolean fileExists(String fileName) {
        return Files.exists(Paths.get(fileName));
    }

    // Phương thức xóa file
    public static boolean deleteFile(String fileName) {
        try {
            return Files.deleteIfExists(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
