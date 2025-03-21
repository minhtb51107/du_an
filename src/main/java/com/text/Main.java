/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.text;

import com.utils.AdvancedFileReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\PC\\Documents\\NetBeansProjects\\du_an_tot_nghiep\\src\\main\\resources\\com\\data\\data.txt";
        String sectionToRead = "KHÓA HỌC"; // Chỉ lấy phần này

        // Đọc đúng phần mong muốn
        List<String> courses = AdvancedFileReader.readSpecificSection(fileName, sectionToRead);

        // In ra kết quả
        System.out.println("📌 Danh sách khóa học:");
        for (String course : courses) {
            System.out.println(new String("Xin chào!".getBytes(), StandardCharsets.UTF_8));

            System.out.println("  - " + course);
        }
    }
}

