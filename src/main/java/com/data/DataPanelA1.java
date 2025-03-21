package com.data;

import java.util.Arrays;
import java.util.List;

public class DataPanelA1 {
    // Mảng chứa các tiêu đề
    private static final String[] TITLES = {
        "Ngôn ngữ JAVA",
        "HTML & CSS",
        "JAVASCRIPT",
        "Ngôn ngữ PYTHON",
        "Ngôn ngữ C",
        "Cơ sở dữ liệu SQL"
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getTitle(int index) {
        if (index >= 0 && index < TITLES.length) {
            return TITLES[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllTitles() {
        return Arrays.asList(TITLES);
    }
    
    private static final String[] Description = {
        "Ngôn ngữ JAVA",
        
        "HTML & CSS",
        
        "JAVASCRIPT",
        
        "Ngôn ngữ PYTHON",
        
        "Ngôn ngữ C",
        
        "Cơ sở dữ liệu SQL"
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getDescription(int index) {
        if (index >= 0 && index < Description.length) {
            return Description[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllDescription() {
        return Arrays.asList(Description);
    }
    
    private static final String[] Introduce = {
        "Ngôn ngữ JAVA",
        
        "HTML & CSS",
        
        "JAVASCRIPT",
        
        "Ngôn ngữ PYTHON",
        
        "Ngôn ngữ C",
        
        "Cơ sở dữ liệu SQL"
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getIntroduce(int index) {
        if (index >= 0 && index < Introduce.length) {
            return Introduce[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllIntroduce() {
        return Arrays.asList(Introduce);
    }
}
