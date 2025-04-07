/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class BaiTapData {
    private static final Map<String, int[]> Index_MAP = new HashMap<>();

    static {
        Index_MAP.put("Giới thiệu SQL", new int[]{
            5
        });
    }

    // Phương thức lấy tiêu đề theo chỉ số dựa vào ngôn ngữ
    public static int getIndex(String language, int index) {
        if (Index_MAP.containsKey(language)) {
            int[] titles = Index_MAP.get(language);
            if (index >= 0 && index < titles.length) {
                return titles[index];
            }
        }
        return 0;
    }

    // Phương thức lấy toàn bộ danh sách tiêu đề của một ngôn ngữ
    public static int[] getIndex(String language) {
        return Index_MAP.getOrDefault(language, new int[]{});
    }

    private static final Map<String, String[]> TITLE_MAP = new HashMap<>();

    static {
        TITLE_MAP.put("Giới thiệu SQL", new String[]{
            "Câu 1: SQL là viết tắt của gì?\n"
            + "A. Structured Query Language\n"
            + "B. System Query Language\n"
            + "C. Simple Query Language\n"
            + "D. Standard Query Language",
            "Câu 2: Câu lệnh SQL nào được sử dụng để truy vấn dữ liệu từ một bảng?\n"
            + "A. GET\n"
            + "B. SELECT\n"
            + "C. FETCH\n"
            + "D. QUERY",
            "Câu 3: Để thêm dữ liệu vào một bảng trong SQL, ta sử dụng câu lệnh nào?\n"
            + "A. ADD\n"
            + "B. INSERT INTO\n"
            + "C. APPEND\n"
            + "D. UPDATE",
            "Câu 4: Lệnh nào dùng để xóa toàn bộ dữ liệu trong một bảng mà vẫn giữ nguyên cấu trúc bảng?\n"
            + "A. DELETE\n"
            + "B. REMOVE\n"
            + "C. DROP\n"
            + "D. TRUNCATE",
            "Câu 5: Lệnh nào dùng để cập nhật dữ liệu trong bảng?\n"
            + "A. MODIFY\n"
            + "B. UPDATE\n"
            + "C. CHANGE\n"
            + "D. SET"
        });
    }

    // Phương thức lấy tiêu đề theo chỉ số dựa vào ngôn ngữ
    public static String getTitle(String language, int index) {
        if (TITLE_MAP.containsKey(language)) {
            String[] titles = TITLE_MAP.get(language);
            if (index >= 0 && index < titles.length) {
                return titles[index];
            }
        }
        return "Không có tiêu đề";
    }

    // Phương thức lấy toàn bộ danh sách tiêu đề của một ngôn ngữ
    public static String[] getTitles(String language) {
        return TITLE_MAP.getOrDefault(language, new String[]{"Không có danh sách tiêu đề"});
    }
}
