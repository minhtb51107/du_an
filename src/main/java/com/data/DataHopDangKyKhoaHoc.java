/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author PC
 */
public class DataHopDangKyKhoaHoc {
        // Mảng chứa các tiêu đề
    private static final String[] TITLES = {
        "<html>Khóa học JAVA từ cơ bản đến nâng cao</html>",
        
        "<html>Khóa học HTML & CSS từ cơ bản đến nâng cao</html>",
        
        "<html>Khóa học JAVASCRIPT từ cơ bản đến nâng cao</html>",
        
        "<html>Khóa học PYTHON từ cơ bản đến nâng cao</html>",
        
        "<html>Khóa học C từ cơ bản đến nâng cao</html>",
        
        "<html>Khóa học Cơ sở dữ liệu SQL từ cơ bản đến nâng cao</html>"
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getTitle(int index) {
        if (index >= 0 && index < TITLES.length) {
            return TITLES[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllTitle() {
        return Arrays.asList(TITLES);
    }
    
    private static final String[] Description = {
        "<html>Giới thiệu chung về khóa học, những gì học viên sẽ nhận được.</html>",
        
        "<html>Giới thiệu chung về khóa học, những gì học viên sẽ nhận được.</html>",
        
        "<html>Giới thiệu chung về khóa học, những gì học viên sẽ nhận được.</html>",
        
        "<html>Giới thiệu chung về khóa học, những gì học viên sẽ nhận được.</html>",
        
        "<html>Giới thiệu chung về khóa học, những gì học viên sẽ nhận được.</html>",
        
        "<html>Giới thiệu chung về khóa học, những gì học viên sẽ nhận được.</html>"
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
    
        private static final String[] duration = {
        "<html>Thời lượng: 60 giờ, 3 tháng học</html>",
        
        "<html>Thời lượng: 60 giờ, 3 tháng học</html>",
        
        "<html>Thời lượng: 60 giờ, 3 tháng học</html>",
        
        "<html>Thời lượng: 60 giờ, 3 tháng học</html>",
        
        "<html>Thời lượng: 60 giờ, 3 tháng học</html>",
        
        "<html>Thời lượng: 60 giờ, 3 tháng học</html>"
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getDuration(int index) {
        if (index >= 0 && index < duration.length) {
            return duration[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllDuration() {
        return Arrays.asList(duration);
    }
    
            private static final String[] Lessons = {
        "<html>Số lượng bài học: 50 bài giảng + bài tập thực hành</html>",
        
        "<html>Số lượng bài học: 50 bài giảng + bài tập thực hành</html>",
        
        "<html>Số lượng bài học: 50 bài giảng + bài tập thực hành</html>",
        
        "<html>Số lượng bài học: 50 bài giảng + bài tập thực hành</html>",
        
        "<html>Số lượng bài học: 50 bài giảng + bài tập thực hành</html>",
        
        "<html>Số lượng bài học: 50 bài giảng + bài tập thực hành</html>"
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getLessons(int index) {
        if (index >= 0 && index < Lessons.length) {
            return Lessons[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllLessons() {
        return Arrays.asList(Lessons);
    }
}
