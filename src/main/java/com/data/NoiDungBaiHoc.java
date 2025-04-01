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
public class NoiDungBaiHoc {

    private static final Map<String, int[]> Index_MAP = new HashMap<>();

    static {
        Index_MAP.put("Giới thiệu SQL", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1});
        Index_MAP.put("Khái niệm", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2
        });
        Index_MAP.put("Kiểu dữ liệu, toán tử, biểu thức", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2
        });
        Index_MAP.put("SELECT", new int[]{
            0, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1
        });
        Index_MAP.put("INSERT", new int[]{
            0, 1, 1, 1, 2, 1, 2, 1, 2, 1
        });
        Index_MAP.put("UPDATE", new int[]{
            0, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1
        });
        Index_MAP.put("DELETE", new int[]{
            0, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1
        });

        Index_MAP.put("Kiểu dữ liệu số, chuỗi, ngày tháng", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("Toán tử số học, so sánh, logic", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2

        });

        Index_MAP.put("Hàm tổng hợp", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2
        });

        Index_MAP.put("Hàm xử lý chuỗi", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 1, 1, 2
        });

        Index_MAP.put("Hàm xử lý ngày tháng", new int[]{
            0, 1, 2, 0, 1, 2, 2, 2, 2
        });

        Index_MAP.put("PRIMARY KEY, FOREIGN KEY", new int[]{
            0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2
        });

        Index_MAP.put("UNIQUE, CHECK, NOT NULL", new int[]{
            0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("DEFAULT", new int[]{
            0, 1, 1, 2, 1, 2
        });

        Index_MAP.put("Tạo, xóa cơ sở dữ liệu", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 1, 2, 1, 2

        });

        Index_MAP.put("Sao lưu và phục hồi", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 0, 1, 1, 2, 0, 1, 2, 1
        });

        Index_MAP.put("Quản lý quyền truy cập", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Tạo, xóa, sửa bảng", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("Tăng giá trị tự động", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Tạo, xóa VIEW", new int[]{
            0, 1, 1, 2, 1, 2, 0, 1, 2
        });

        Index_MAP.put("JOIN", new int[]{
            0, 1, 1, 2, 1, 2, 1
        });

        Index_MAP.put("SELF JOIN", new int[]{
            0, 1, 2, 1, 2
        });

        Index_MAP.put("UNION", new int[]{
            0, 1, 1, 2, 1, 2
        });

        Index_MAP.put("GROUP BY", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Hàm tổng hợp", new int[]{
            0, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("HAVING", new int[]{
            0, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("UPPER, LOWER", new int[]{
            0, 1, 1, 2, 1, 2
        });

        Index_MAP.put("SUBSTRING", new int[]{
            0, 1, 1, 1, 2
        });

        Index_MAP.put("ROUND", new int[]{
            0, 1, 1, 2
        });

        Index_MAP.put("NOW, DATE_FORMAT", new int[]{
            0, 1, 1, 2, 1, 1, 2, 1, 2
        });

        Index_MAP.put("SELECT INTO", new int[]{
            0, 1, 2, 1, 1, 2, 1
        });

        Index_MAP.put("INSERT INTO SELECT", new int[]{
            0, 1, 1, 2, 1, 2, 1, 1
        });

        Index_MAP.put("CASE", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Tạo và sử dụng PROCEDURE", new int[]{
            0, 1, 1, 1, 2, 1, 2
        });

        Index_MAP.put("Truyền tham số vào PROCEDURE", new int[]{
            0, 1, 2, 1, 2, 0, 1, 2, 1, 1, 2, 1, 2
        });

        Index_MAP.put("Lợi ích và ứng dụng thực tế", new int[]{
            0, 1, 0, 1
        });

        Index_MAP.put("Phòng chống SQL Injection", new int[]{
            0, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 1
        });

        Index_MAP.put("Nguyên tắc Least Privilege", new int[]{
            0, 1, 1, 1, 2, 1
        });

        Index_MAP.put("PARTITIONING, HASH PARTITIONING", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1
        });

        Index_MAP.put("SHARDING", new int[]{
            0, 1, 1, 1, 1, 2, 1
        });

        Index_MAP.put("BATCH PROCESSING", new int[]{
            0, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1
        });

        Index_MAP.put("RECURSIVE QUERIES", new int[]{
            0, 1, 0, 1, 1, 1, 2, 1
        });

        Index_MAP.put("Biểu thức CTE", new int[]{
            0, 1, 1, 2, 1
        });

        Index_MAP.put("WINDOW FUNCTIONS", new int[]{
            0, 1, 1, 2, 1, 1
        });

        Index_MAP.put("Dynamic SQL", new int[]{
            0, 1, 1, 2, 1, 1
        });

        Index_MAP.put("MySQL", new int[]{
            0, 1, 1, 0, 1, 1, 1, 2, 1, 2
        });

        Index_MAP.put("SQL Server", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2
        });

        Index_MAP.put("PostgreSQL", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2
        });

        Index_MAP.put("Oracle", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2
        });

        Index_MAP.put("IDE cho SQL", new int[]{
            0, 1, 1, 1, 1, 2
        });

        Index_MAP.put("Công cụ GUI", new int[]{
            0, 1, 1, 1, 1, 2
        });

        Index_MAP.put("ORM", new int[]{
            0, 1, 1, 1, 1, 2
        });

        Index_MAP.put("Công cụ tối ưu hiệu suất", new int[]{
            0, 1, 1, 2
        });

        //Python
        Index_MAP.put("Giới thiệu về Python", new int[]{
            0, 1, 0, 1, 0, 1, 1, 1, 1, 1
        });

        Index_MAP.put("Lịch sử phát triển", new int[]{
            0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1
        });

        Index_MAP.put("Lý do chọn Python", new int[]{
            0, 1, 1, 1, 1, 1, 1, 0, 1
        });

        Index_MAP.put("Cấu trúc chương trình Python", new int[]{
            0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 0, 2, 0, 1, 2, 1
        });

        Index_MAP.put("Cài đặt môi trường và IDE", new int[]{
            0, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2
        });

        Index_MAP.put("Biến", new int[]{
            0, 2, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1, 0, 2, 0, 1, 2, 0, 1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2
        });

        Index_MAP.put("Kiểu dữ liệu", new int[]{
            0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Toán tử", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("Nhập xuất dữ liệu", new int[]{
            0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Cấu trúc điều kiện", new int[]{
            0, 1, 1, 2, 1, 2, 1, 0, 1, 1, 2, 1, 2, 1, 0, 1, 1, 2, 1, 2, 1, 0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("Vòng lặp", new int[]{
            0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("Danh sách", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 1, 2, 0, 2, 0, 2, 0, 2
        });

        Index_MAP.put("Tuple", new int[]{
            0, 1, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2, 1, 2, 0, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 2, 0, 2, 0, 2
        });

        Index_MAP.put("Dictionary", new int[]{
            0, 1, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("OOP", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2
        });

        Index_MAP.put("Đọc/ghi file CSV", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("JSON", new int[]{
            0, 1, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("XML", new int[]{
            0, 1, 1, 1, 2, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 2, 0, 2, 0, 2
        });

        Index_MAP.put("Try-except", new int[]{
            0, 1, 2, 0, 1, 0, 1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Finally", new int[]{
            0, 1, 1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1, 0, 1
        });

        Index_MAP.put("Tạo ngoại lệ tùy chỉnh", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("Lập trình đa luồng", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Bất đồng bộ", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Requests", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("BeautifulSoup", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Selenium", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("SQLite", new int[]{
            0, 1, 1, 1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2
        });

        Index_MAP.put("MySQL", new int[]{
            0, 1, 0, 1, 1, 2, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("PostgreSQL", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("ORM với SQLAlchemy", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Pandas", new int[]{
            0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Numpy", new int[]{
            0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 2, 0, 2, 0, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Matplotlib", new int[]{
            0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Socket", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2
        });

        Index_MAP.put("Giao thức TCP/IP", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 1, 2, 1, 2, 0, 2, 0, 1, 2, 0, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("UDP", new int[]{
            0, 1, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 0, 1, 0, 1, 1, 1, 2, 0, 1
        });

        Index_MAP.put("Xây dựng ứng dụng Web với Flask/Django", new int[]{
            0, 1, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch", new int[]{
            0, 1, 0, 1, 1, 1, 2, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 1, 2, 1, 2, 0, 1, 1, 1, 2, 1, 2, 0, 1, 0, 1
        });

        Index_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Bảo mật, tối ưu hiệu năng", new int[]{
            0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("kiểm thử với pytest, unittest", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2
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
            "Giới thiệu SQL",
            "SQL là gì?",
            "Lịch sử và ứng dụng của SQL",
            "Các hệ quản trị cơ sở dữ liệu phổ biến"
        });

        TITLE_MAP.put("Khái niệm", new String[]{
            "Khái niệm",
            "Khái niệm RDBMS",
            "Database là gì?",
            "Cú pháp SQL cơ bản"
        });

        TITLE_MAP.put("Kiểu dữ liệu, toán tử, biểu thức", new String[]{
            "Kiểu dữ liệu",
            "Toán tử",
            "Biểu thức"
        });

        TITLE_MAP.put("SELECT", new String[]{
            "công dụng",
            "Cú pháp",
            "Ví dụ"
        });

        TITLE_MAP.put("INSERT", new String[]{
            "công dụng",
            "Cú pháp",
            "Ví dụ"
        });

        TITLE_MAP.put("UPDATE", new String[]{
            "công dụng",
            "Cú pháp",
            "Ví dụ"
        });

        TITLE_MAP.put("DELETE", new String[]{
            "công dụng",
            "Cú pháp",
            "Ví dụ"
        });

        TITLE_MAP.put("Kiểu dữ liệu số, chuỗi, ngày tháng", new String[]{
            "Kiểu dữ liệu số",
            "Kiểu dữ liệu chuỗi",
            "Kiểu dữ liệu ngày tháng"
        });

        TITLE_MAP.put("Toán tử số học, so sánh, logic", new String[]{
            "Toán tử số học",
            "Toán tử so sánh",
            "Toán tử logic"
        });

        TITLE_MAP.put("Hàm tổng hợp", new String[]{
            "COUNT",
            "SUM",
            "AVG",
            "MIN/MAX"
        });

        TITLE_MAP.put("Hàm xử lý chuỗi", new String[]{
            "CONCAT",
            "SUBSTRING",
            "UPPER",
            "LOWER"
        });

        TITLE_MAP.put("Hàm xử lý ngày tháng", new String[]{
            "NOW",
            "DATE_FORMAT"
        });

        TITLE_MAP.put("PRIMARY KEY, FOREIGN KEY", new String[]{
            "Khóa chính",
            "Khóa ngoại"
        });

        TITLE_MAP.put("UNIQUE, CHECK, NOT NULL", new String[]{
            "Giá trị duy nhất",
            "Kiểm tra điều kiện dữ liệu",
            "Không cho phép giá trị NULL"
        });

        TITLE_MAP.put("DEFAULT", new String[]{
            "Giá trị mặc định"
        });

        TITLE_MAP.put("Tạo, xóa cơ sở dữ liệu", new String[]{
            "Tạo Cơ Sở Dữ Liệu (CREATE DATABASE)",
            "Xóa Cơ Sở Dữ Liệu (DROP DATABASE)"
        });

        TITLE_MAP.put("Sao lưu và phục hồi", new String[]{
            "Sao Lưu Cơ Sở Dữ Liệu (Backup Database)",
            "Sao Lưu Bằng MySQL Dump",
            "Sao Lưu Trong SQL Server",
            "Phục Hồi Cơ Sở Dữ Liệu (Restore Database)",
            "Phục Hồi Trong SQL Server",
            ""
        });

        TITLE_MAP.put("Quản lý quyền truy cập", new String[]{
            "Quản Lý Quyền Truy Cập (User Permissions Management)",
            "Tạo Người Dùng Mới",
            "Cấp Quyền Cho Người Dùng",
            "Xóa Người Dùng"
        });

        TITLE_MAP.put("Tạo, xóa, sửa bảng", new String[]{
            "Tạo bảng",
            "Xóa bảng",
            "Sửa bảng"
        });

        TITLE_MAP.put("Tăng giá trị tự động", new String[]{
            "Cách thiết lập"
        });

        TITLE_MAP.put("Tạo, xóa VIEW", new String[]{
            "Tạo VIEW",
            "Xóa VIEW"
        });

        TITLE_MAP.put("JOIN", new String[]{
            "Kết hợp bảng"
        });

        TITLE_MAP.put("SELF JOIN", new String[]{
            "Kết hợp bảng với chính nó"
        });

        TITLE_MAP.put("UNION", new String[]{
            "Kết hợp nhiều tập dữ liệu"
        });

        TITLE_MAP.put("GROUP BY", new String[]{
            "Gom nhóm dữ liệu"
        });

        TITLE_MAP.put("Hàm tổng hợp", new String[]{
            "COUNT, SUM, AVG"
        });

        TITLE_MAP.put("HAVING", new String[]{
            "Lọc dữ liệu sau GROUP BY"
        });

        TITLE_MAP.put("UPPER, LOWER", new String[]{
            "Chuyển đổi chữ hoa/thường"
        });

        TITLE_MAP.put("SUBSTRING", new String[]{
            "Trích xuất chuỗi"
        });

        TITLE_MAP.put("ROUND", new String[]{
            "Làm tròn số"
        });

        TITLE_MAP.put("NOW, DATE_FORMAT", new String[]{
            "Xử lý ngày tháng"
        });

        TITLE_MAP.put("SELECT INTO", new String[]{
            "Tạo bản sao dữ liệu"
        });

        TITLE_MAP.put("INSERT INTO SELECT", new String[]{
            "Sao chép dữ liệu giữa bảng"
        });

        TITLE_MAP.put("CASE", new String[]{
            "Cấu trúc điều kiện trong SQL"
        });

        TITLE_MAP.put("Tạo và sử dụng PROCEDURE", new String[]{
            "Tạo PROCEDURE trong SQL"
        });

        TITLE_MAP.put("Truyền tham số vào PROCEDURE", new String[]{
            "Truyền tham số vào PROCEDURE",
            "PROCEDURE với nhiều tham số"
        });

        TITLE_MAP.put("Lợi ích và ứng dụng thực tế", new String[]{
            "Lợi ích",
            "Ứng dụng thực tế"
        });

        TITLE_MAP.put("Phòng chống SQL Injection", new String[]{
            "Mô tả"
        });

        TITLE_MAP.put("Nguyên tắc Least Privilege", new String[]{
            "Nguyên tắc"
        });

        TITLE_MAP.put("PARTITIONING, HASH PARTITIONING", new String[]{
            "PARTITIONING là gì?",
            "Các loại PARTITIONING",
            "Phân vùng theo hàm băm"
        });

        TITLE_MAP.put("SHARDING", new String[]{
            "Chia nhỏ dữ liệu"
        });

        TITLE_MAP.put("BATCH PROCESSING", new String[]{
            "Xử lý hàng loạt"
        });

        TITLE_MAP.put("RECURSIVE QUERIES", new String[]{
            "Truy vấn đệ quy",
            "Sử dụng CTE đệ quy(WITH RECURSIVE)"
        });

        TITLE_MAP.put("Biểu thức CTE", new String[]{
            "COMMON TABLE EXPRESSIONS"
        });

        TITLE_MAP.put("WINDOW FUNCTIONS", new String[]{
            "Hàm cửa sổ"
        });

        TITLE_MAP.put("Dynamic SQL", new String[]{
            "SQL động"
        });

        TITLE_MAP.put("MySQL", new String[]{
            "Ưu điểm",
            "Nhược điểm"
        });

        TITLE_MAP.put("SQL Server", new String[]{
            "Ưu điểm",
            "Nhược điểm"
        });

        TITLE_MAP.put("PostgreSQL", new String[]{
            "Ưu điểm",
            "Nhược điểm"
        });

        TITLE_MAP.put("Oracle", new String[]{
            "Ưu điểm",
            "Nhược điểm"
        });

        TITLE_MAP.put("IDE cho SQL", new String[]{
            "IDE cho SQL (MySQL Workbench, DBeaver)"
        });

        TITLE_MAP.put("Công cụ GUI", new String[]{
            "Công cụ GUI (pgAdmin, SQL Server Management Studio)"
        });

        TITLE_MAP.put("ORM", new String[]{
            "ORM (Hibernate, SQLAlchemy)"
        });

        TITLE_MAP.put("Công cụ tối ưu hiệu suất", new String[]{
            "Công cụ tối ưu hiệu suất (EXPLAIN, Query Profiler)"
        });

        //Python
        TITLE_MAP.put("Giới thiệu về Python", new String[]{
            "Giới thiệu",
            "Tại sao Python phổ biến?",
            "Những tính năng nổi bật"
        });

        TITLE_MAP.put("Lịch sử phát triển", new String[]{
            "Khởi nguồn",
            "Phiên bản đầu tiên",
            "Các mốc quan trọng",
            "Python hiện đại(2020-nay)",
            "Tại sao Python thành công",
            "Sự thật thú vị",
            "Tương lai của Python"
        });

        TITLE_MAP.put("Lý do chọn Python", new String[]{
            "Python dùng để làm gì?",
            "Tại sao nên học Python"
        });

        TITLE_MAP.put("Cấu trúc chương trình Python", new String[]{
            "1. Dòng đầu tiên",
            "2. Mô tả tổng quan",
            "3. Import thư viện",
            "4. Khai báo hằng số",
            "5. Khai báo lớp(class)",
            "6. Khai báo hàm",
            "7. Main Program",
            "8. Các thành phần khác",
            "9. Cấu trúc thư mục dự án",
            "10. Best Practices"
        });

        TITLE_MAP.put("Cài đặt môi trường và IDE", new String[]{
            "Cài đặt môi trường Python",
            "Cài đặt IDE để lập trình Python"
        });

        TITLE_MAP.put("Biến", new String[]{
            "1. Khái niệm cơ bản",
            "2. Quy tắc đặt tên biến",
            "3. Các kiểu biến quan trọng",
            "4. Phạm vi biến (Scope)",
            "5. Ép kiểu biến (Type Casting)",
            "6. Kiểm tra kiểu biến",
            "7. Biến đặc biệt",
            "8. Cách đặt tên biến chuẩn PEP 8",
            "9. Xóa biến",
            "10. Dynamic Typing",
            "11. Mutable vs Immutable",
            "12. Gán nhiều biến cùng lúc",
            "13. Biến môi trường",
            "14. Biến trong Class",
            "15. Biến magic methods",
            "16. Biến global và nonlocal",
            "17. Biến trong lambda",
            "18. Biến đặc biệt trong hàm",
            "19. Biến _ trong Python"
        });

        TITLE_MAP.put("Kiểu dữ liệu", new String[]{
            "1. Kiểu dữ liệu số (Numeric Types)",
            "2. Kiểu dữ liệu chuỗi (String - str)",
            "3. Kiểu Boolean (bool)",
            "4. Kiểu danh sách (List - list)",
            "5. Kiểu tuple (tuple)",
            "6. Kiểu tập hợp (Set - set)",
            "7. Kiểu từ điển (Dictionary - dict)",
            "8. Kiểu dữ liệu đặc biệt",
            "9. NoneType (None)",
            "10. bytes & bytearray",
            "11. Kiểu dữ liệu do người dùng định nghĩa (User-defined)",
            "12. Kiểm tra kiểu dữ liệu"
        });

        TITLE_MAP.put("Toán tử", new String[]{
            "1. Toán tử số học (Arithmetic Operators)",
            "2. Toán tử so sánh (Comparison Operators)",
            "3. Toán tử gán (Assignment Operators)",
            "4. Toán tử logic (Logical Operators)",
            "5. Toán tử bitwise (Bitwise Operators)",
            "6. Toán tử thành viên (Membership Operators)",
            "7. Toán tử nhận dạng (Identity Operators)"
        });

        TITLE_MAP.put("Nhập xuất dữ liệu", new String[]{
            "Xuất dữ liệu (Output)",
            "Nhập dữ liệu (Input)",
            "Đọc/Ghi File (File I/O)"
        });

        TITLE_MAP.put("Cấu trúc điều kiện", new String[]{
            "1. Câu lệnh if cơ bản",
            "2. Câu lệnh if-else",
            "3. Câu lệnh if-elif-else (nhiều điều kiện)",
            "4. Câu lệnh if lồng nhau",
            "5. Toán tử Ternary (if-else ngắn gọn)",
            "6. Kết hợp and, or, not",
            "7. So sánh với nhiều giá trị (dùng in)",
            "8. Kiểm tra kiểu dữ liệu (isinstance)"
        });

        TITLE_MAP.put("Vòng lặp", new String[]{
            "1. Vòng lặp for",
            "2. Vòng lặp while",
            "3. Các lệnh điều khiển vòng lặp",
            "4. Vòng lặp lồng nhau",
            "5. Vòng lặp với enumerate()",
            "6. Vòng lặp với zip()",
            "7. List comprehension (Tạo list từ vòng lặp)"
        });

        TITLE_MAP.put("Danh sách", new String[]{
            "1. Khái niệm cơ bản",
            "2. Truy cập phần tử",
            "3. Cắt danh sách (Slicing)",
            "4. Các phương thức cơ bản",
            "5. Các toán tử với list",
            "6. List comprehension",
            "7. Các hàm tích hợp với list",
            "8. Duyệt danh sách",
            "9. Ứng dụng thực tế"
        });

        TITLE_MAP.put("Tuple", new String[]{
            "1. Khái niệm cơ bản",
            "2. Truy cập phần tử",
            "3. Cắt tuple (Slicing)",
            "4. Các phương thức cơ bản",
            "5. Các toán tử với tuple",
            "6. Tuple unpacking",
            "7. So sánh tuple",
            "8. Ưu điểm của tuple",
            "9. Chuyển đổi giữa tuple và list",
            "10. Các hàm tích hợp với tuple",
            "11. Ứng dụng thực tế"
        });

        TITLE_MAP.put("Dictionary", new String[]{
            "1. Khái niệm cơ bản",
            "2. Truy cập phần tử",
            "3. Thêm và sửa phần tử",
            "4. Xóa phần tử",
            "5. Các phương thức quan trọng",
            "6. Duyệt dictionary",
            "7. Dictionary comprehension",
            "8. Dictionary lồng nhau",
            "9. Ứng dụng thực tế"
        });

        TITLE_MAP.put("OOP", new String[]{
            "1. Các khái niệm cơ bản",
            "2. 4 tính chất cơ bản của OOP",
            "3. Các khái niệm nâng cao",
            "4. Kế thừa đa cấp và đa kế thừa",
            "5. Ứng dụng thực tế"
        });

        TITLE_MAP.put("Đọc/ghi file CSV", new String[]{
            "1. Đọc file CSV",
            "2. Ghi file CSV",
            "3. Xử lý các trường hợp đặc biệt",
            "4. Các thao tác nâng cao",
            "5. Xử lý lỗi thường gặp",
            "6. Best Practices khi làm việc với CSV"
        });

        TITLE_MAP.put("JSON", new String[]{
            "1. Cấu trúc JSON cơ bản",
            "2. Chuyển đổi giữa Python và JSON",
            "3. Các hàm chính trong module json",
            "4. Tuỳ chỉnh quá trình mã hoá/giải mã",
            "5. Xử lý lỗi phổ biến"
        });

        TITLE_MAP.put("XML", new String[]{
            "1. Cấu trúc XML cơ bản",
            "2. Các module xử lý XML trong Python",
            "3. Sử dụng xml.etree.ElementTree",
            "4. Xử lý XML với lxml (thư viện bên thứ ba mạnh mẽ)",
            "5. Xử lý XML với DOM API",
            "6. Xử lý XML với SAX API (cho file lớn)",
            "7. Ví dụ hoàn chỉnh: Quản lý danh sách sinh viên bằng XML"
        });

        TITLE_MAP.put("Try-except", new String[]{
            "1. Cấu trúc cơ bản",
            "2. Các thành phần chính",
            "3. Các loại ngoại lệ phổ biến",
            "4. Xử lý ngoại lệ cơ bản",
            "5. Xử lý nhiều loại ngoại lệ",
            "6. Sử dụng else và finally",
            "7. Bắt nhiều ngoại lệ cùng lúc",
            "8. Tự định nghĩa ngoại lệ",
            "9. Sử dụng try-except trong hàm",
            "10. Try-except lồng nhau",
            "11. Sử dụng try-except với file và database",
            "12. Ghi log ngoại lệ",
            "13. Try-except trong vòng lặp",
            "Best practices khi sử dụng try-except"
        });

        TITLE_MAP.put("Finally", new String[]{
            "Đặc điểm chính của finally",
            "Cấu trúc cơ bản",
            "1. Dùng finally với file",
            "2. Finally với return",
            "3. Finally với ngoại lệ",
            "4. Dọn dẹp kết nối database",
            "5. Finally với break/continue trong vòng lặp",
            "6. Kết hợp try-except-else-finally",
            "7. Finally với generator",
            "8. Xử lý transaction với finally",
            "9. Finally với context manager",
            "10. Finally trong đa luồng",
            "Khi nào nên sử dụng finally",
            "Lưu ý quan trọng"
        });

        TITLE_MAP.put("Tạo ngoại lệ tùy chỉnh", new String[]{
            "1. Giới thiệu ngoại lệ tùy chỉnh",
            "2. Tạo ngoại lệ cơ bản",
            "3. Ngoại lệ với thuộc tính tùy chỉnh",
            "4. Hệ thống phân cấp ngoại lệ",
            "5. Ngoại lệ với phương thức bổ sung",
            "6. Override phương thức magic",
            "7. Kết hợp với try-except-finally",
            "8. Ngoại lệ đa ngôn ngữ",
            "9. Best Practices",
            "10. Ứng dụng thực tế"
        });

        TITLE_MAP.put("Lập trình đa luồng", new String[]{
            "1. Giới thiệu về đa luồng (Multithreading)",
            "2. Module threading cơ bản",
            "3. Truyền tham số cho luồng",
            "4. Đồng bộ hóa với Lock",
            "5. ThreadPoolExecutor",
            "6. Giao tiếp giữa các luồng",
            "7. Daemon Thread",
            "8. Thread-local data",
            "9. Timer Thread",
            "10. Ứng dụng thực tế",
            "Kết luận"
        });

        TITLE_MAP.put("Bất đồng bộ", new String[]{
            "1. Giới thiệu về lập trình bất đồng bộ",
            "2. Các thành phần cốt lõi",
            "3. Async/Await cơ bản",
            "4. Chạy đồng thời với gather",
            "5. Timeout và Cancellation",
            "6. Queue trong asyncio",
            "7. Synchronization Primitives",
            "8. Asyncio với Network I/O",
            "9. Subprocesses với asyncio",
            "10. Ứng dụng thực tế: Web Crawler",
            "Kết luận"
        });

        TITLE_MAP.put("Requests", new String[]{
            "1. Giới thiệu thư viện Requests",
            "2. Các phương thức HTTP cơ bản",
            "3. Tham số URL và Query Parameters",
            "4. Request Headers",
            "5. Request Body",
            "6. Xử lý Response",
            "7. Timeout và Exception Handling",
            "8. Session Objects",
            "9. Authentication",
            "10. Proxy và SSL Verification",
            "11. Stream và Download lớn",
            "12. Ví dụ hoàn chỉnh: API Client",
            "Kết luận"
        });

        TITLE_MAP.put("BeautifulSoup", new String[]{
            "1. Giới thiệu BeautifulSoup",
            "2. Cài đặt và Parser",
            "3. Các đối tượng chính",
            "4. Tìm kiếm phần tử",
            "5. Truy cập thuộc tính và nội dung",
            "6. Duyệt cây HTML",
            "7. Thao tác với thẻ HTML",
            "8. Lọc kết quả tìm kiếm",
            "9. Xử lý dữ liệu trích xuất",
            "10. Ví dụ hoàn chỉnh: Web Scraper",
            "11. Xử lý vấn đề thực tế",
            "Kết luận"
        });

        TITLE_MAP.put("Selenium", new String[]{
            "1. Giới thiệu Selenium",
            "2. Cài đặt và thiết lập",
            "3. Tương tác với trình duyệt",
            "4. Tìm kiếm phần tử (Locators)",
            "5. Tương tác với phần tử",
            "6. Dropdown và Iframe",
            "7. Chờ đợi (Waits)",
            "8. Xử lý cửa sổ và tab",
            "9. Cookies và Local Storage",
            "10. JavaScript Execution",
            "11. Action Chains",
            "12. Headless Mode",
            "13. Ví dụ hoàn chỉnh: Đăng nhập tự động",
            "14. Ví dụ hoàn chỉnh: Thu thập dữ liệu",
            "Kết luận"
        });

        TITLE_MAP.put("SQLite", new String[]{
            "1. Giới thiệu SQLite",
            "2. Kết nối đến cơ sở dữ liệu",
            "3. Tạo bảng",
            "4. Thêm dữ liệu (INSERT)",
            "5. Truy vấn dữ liệu (SELECT)",
            "6. Cập nhật dữ liệu (UPDATE)",
            "7. Xóa dữ liệu (DELETE)",
            "8. Giao dịch (Transactions)",
            "9. Sử dụng với context manager",
            "10. Làm việc với kiểu dữ liệu",
            "11. Truy vấn phức tạp (JOIN, GROUP BY)",
            "12. Xử lý lỗi",
            "13. Backup cơ sở dữ liệu",
            "14. Tối ưu hiệu năng",
            "15. Ứng dụng thực tế: Quản lý sách"
        });

        TITLE_MAP.put("MySQL", new String[]{
            "1. Giới thiệu về MySQL trong Python",
            "2. Cài đặt thư viện",
            "3. Kết nối đến MySQL",
            "4. Tạo bảng (CREATE TABLE)",
            "5. Thêm dữ liệu (INSERT)",
            "6. Truy vấn dữ liệu (SELECT)",
            "7. Cập nhật dữ liệu (UPDATE)",
            "8. Xóa dữ liệu (DELETE)",
            "9. Kết luận"
        });

        TITLE_MAP.put("PostgreSQL", new String[]{
            "1. Cài đặt và thiết lập ban đầu",
            "2. Tạo bảng và các ràng buộc",
            "3. Thao tác CRUD cơ bản",
            "4. Giao dịch (Transactions)",
            "5. Truy vấn phức tạp với JOIN",
            "6. Sử dụng SQLAlchemy ORM",
            "7. Index và tối ưu hiệu suất",
            "8. Stored Procedures và Functions",
            "9. Full-text Search",
            "10. Kết nối Pool với psycopg2",
            "11. Xử lý JSON trong PostgreSQL"
        });

        TITLE_MAP.put("ORM với SQLAlchemy", new String[]{
            "1. Giới thiệu về ORM và SQLAlchemy",
            "2. Kết nối đến cơ sở dữ liệu",
            "3. Định nghĩa Model (Bảng)",
            "4. Tạo bảng trong database",
            "5. Session và Thao tác CRUD cơ bản",
            "6. Quan hệ giữa các bảng",
            "7. Truy vấn nâng cao",
            "8. Transaction",
            "9. Sử dụng SQL Expression Language",
            "10. Hỗ trợ AsyncIO (SQLAlchemy 2.0+)",
            "11. Alembic - Công cụ Migration",
            "12. Một số tính năng nâng cao khác"
        });

        TITLE_MAP.put("Pandas", new String[]{
            "1. Cài đặt Pandas",
            "2. Cấu trúc dữ liệu chính trong Pandas",
            "3. Đọc và Ghi dữ liệu với Pandas",
            "4. Thao tác với DataFrame",
            "5. Nhóm dữ liệu và Tính toán thống kê",
            "6. Kết hợp DataFrame",
            "7. Xử lý dữ liệu thời gian (DateTime)",
            "8. Vẽ biểu đồ với Pandas",
            "Kết luận"
        });

        TITLE_MAP.put("Numpy", new String[]{
            "1. Cài đặt NumPy",
            "2. Tạo mảng NumPy (Arrays)",
            "3. Thuộc tính của mảng NumPy",
            "4. Truy cập và chỉnh sửa mảng",
            "5. Các phép toán cơ bản",
            "6. Broadcasting (Tự động mở rộng mảng)",
            "7. Reshape và Transpose",
            "8. Tính toán thống kê",
            "9. Lọc dữ liệu (Boolean Indexing)",
            "10. Lưu và đọc mảng từ file",
            "Kết luận"
        });

        TITLE_MAP.put("Matplotlib", new String[]{
            "1. Giới thiệu Matplotlib",
            "2. Cách tạo một đồ thị cơ bản",
            "3. Đồ thị phân tán (Scatter Plot)",
            "4. Đồ thị tròn (Pie Chart)",
            "5. Đồ thị histogram",
            "6. Đồ thị 3D",
            "7. Tùy chỉnh đồ thị",
            "8. Kết luận"
        });

        TITLE_MAP.put("Socket", new String[]{
            "1. Giới thiệu về Socket",
            "2. TCP Server",
            "3. TCP Client",
            "4. UDP Server",
            "5. UDP Client",
            "6. Xử lý nhiều kết nối với select",
            "7. Socket với IPv6",
            "8. Thiết lập Timeout",
            "9. Gửi File qua Socket",
            "10. Multi-threaded Server",
            "11. Broadcast UDP",
            "12. Socket với SSL/TLS",
            "13. Lấy thông tin mạng",
            "14. Raw Socket (Packet Sniffing)",
            "15. Socket Non-blocking"
        });

        TITLE_MAP.put("Giao thức TCP/IP", new String[]{
            "1. Giới thiệu về TCP/IP",
            "2. Tạo socket TCP cơ bản",
            "3. TCP Server cơ bản",
            "4. TCP Client cơ bản",
            "5. Xử lý nhiều kết nối đồng thời",
            "6. Gửi và nhận dữ liệu phức tạp",
            "7. Timeout và xử lý lỗi",
            "8. TCP với IPv6",
            "9. TCP Keepalive",
            "10. TCP với SSL/TLS (Secure Socket)",
            "11. TCP Port Scanner",
            "12. TCP Proxy Server",
            "Kết luận"
        });

        TITLE_MAP.put("UDP", new String[]{
            "1. Giới thiệu về UDP",
            "2. Socket UDP trong Python",
            "3. Gửi dữ liệu qua UDP",
            "4. Nhận dữ liệu qua UDP",
            "5. Ví dụ hoàn chỉnh: Client-Server UDP",
            "6. Xử lý lỗi trong UDP",
            "7. Broadcast với UDP",
            "8. Multicast với UDP",
            "9. So sánh UDP và TCP",
            "10. Ứng dụng thực tế của UDP",
            "11. Hạn chế của UDP và cách khắc phục",
            "Kết luận"
        });

        TITLE_MAP.put("Xây dựng ứng dụng Web với Flask/Django", new String[]{
            "Phần 1: Giới thiệu về Flask và Django",
            "Phần 2: Xây dựng ứng dụng web với Flask",
            "Phần 3: Xây dựng ứng dụng web với Django",
            "Phần 4: So sánh Flask và Django",
            "Phần 5: Triển khai ứng dụng",
            "Kết luận"
        });

        TITLE_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch", new String[]{
            "1. Giới thiệu tổng quan",
            "2. Machine Learning với Scikit-learn",
            "3. Deep Learning với TensorFlow",
            "4. Deep Learning với PyTorch",
            "5. So sánh Scikit-learn, TensorFlow và PyTorch",
            "6. Kết luận"
        });

        TITLE_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            "Phần 1: Tự Động Hóa Web với Selenium",
            "Phần 2: Tạo Bot Telegram",
            "Phần 3: Tạo Bot Discord",
            "Kết luận"
        });

        TITLE_MAP.put("Bảo mật, tối ưu hiệu năng", new String[]{
            "Phần 1: Bảo Mật trong Python",
            "Phần 2: Tối Ưu Hiệu Năng trong Python"
        });

        TITLE_MAP.put("kiểm thử với pytest, unittest", new String[]{
            "1. Giới thiệu về kiểm thử trong Python",
            "2. Kiểm thử với unittest",
            "3. Kiểm thử với pytest",
            "4. So sánh unittest và pytest",
            "5. Best Practices cho kiểm thử",
            "6. Ví dụ tích hợp kiểm thử trong dự án",
            "7. Chạy kiểm thử"
        });

    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getTitle(String language, int index) {
        if (TITLE_MAP.containsKey(language)) {
            String[] descriptions = TITLE_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getTitle(String language) {
        return TITLE_MAP.getOrDefault(language, new String[]{});
    }

    private static final Map<String, String[]> Content_MAP = new HashMap<>();

    static {
        Content_MAP.put("Giới thiệu SQL", new String[]{
            "SQL (Structured Query Language) là ngôn ngữ chuẩn để tương tác với hệ quản trị cơ sở dữ liệu quan hệ (RDBMS). ",
            "SQL (Structured Query Language) là ngôn ngữ chuẩn để tương tác với hệ quản trị cơ sở dữ liệu quan hệ (RDBMS). Nó cho phép: \n"
            + "Tạo và quản lý cấu trúc cơ sở dữ liệu \n"
            + "Thao tác dữ liệu (thêm/sửa/xóa) \n"
            + "Truy vấn dữ liệu phức tạp \n"
            + "Quản lý quyền truy cập",
            "	Lịch sử phát triển của SQL \n"
            + "SQL (Structured Query Language) là ngôn ngữ truy vấn có cấu trúc được sử dụng để tương tác với cơ sở dữ liệu quan hệ (RDBMS - Relational Database Management System). \n"
            + "Giai đoạn hình thành (1970s) \n"
            + "•	Năm 1970, Edgar F. Codd (IBM) đưa ra mô hình cơ sở dữ liệu quan hệ (Relational Model). \n"
            + "•	Năm 1974, IBM phát triển ngôn ngữ SEQUEL (Structured English Query Language), tiền thân của SQL. \n"
            + "•	Năm 1979, Oracle Corporation phát hành hệ quản trị cơ sở dữ liệu thương mại đầu tiên sử dụng SQL. \n"
            + "Chuẩn hóa SQL (1980s - 1990s) \n"
            + "•	1986: SQL được ANSI (American National Standards Institute) công nhận là chuẩn. \n"
            + "•	1987: SQL trở thành chuẩn ISO (International Organization for Standardization). \n"
            + "•	1992: SQL-92 ra đời với nhiều cải tiến như JOIN, CHECK. \n"
            + "Hiện đại hóa SQL (2000s - nay) \n"
            + "•	SQL được mở rộng với các tính năng mới như CTE (Common Table Expressions), JSON, XML, Window Functions. \n"
            + "•	Hỗ trợ Big Data, NoSQL, và các dịch vụ đám mây (AWS RDS, Google Cloud SQL). \n"
            + "  Ứng dụng của SQL \n"
            + "SQL có mặt trong hầu hết các lĩnh vực sử dụng dữ liệu. Dưới đây là một số ứng dụng chính: \n"
            + "1. Quản lý dữ liệu trong doanh nghiệp  \n"
            + "•	Lưu trữ, truy xuất và xử lý dữ liệu khách hàng. \n"
            + "•	Quản lý đơn hàng, hóa đơn, tồn kho. \n"
            + "•	Báo cáo kinh doanh, phân tích dữ liệu. \n"
            + "2. Phát triển web và ứng dụng \n"
            + "•	Xây dựng hệ thống đăng nhập, quản lý tài khoản người dùng. \n"
            + "•	Kết hợp với PHP, Python, Java để phát triển ứng dụng web. \n"
            + "•	Dùng trong các CMS như WordPress, Magento. \n"
            + "3. Khoa học dữ liệu & Phân tích \n"
            + "•	Xử lý dữ liệu lớn (Big Data) với Google BigQuery, Amazon Redshift. \n"
            + "•	Truy vấn và làm sạch dữ liệu trước khi phân tích với Python (Pandas), R. \n"
            + "•	Dùng trong Business Intelligence với Power BI, Tableau. \n"
            + "4. Hệ thống ngân hàng và tài chính \n"
            + "•	Theo dõi giao dịch, quản lý tài khoản ngân hàng. \n"
            + "•	Xử lý giao dịch trực tuyến, đảm bảo tính toàn vẹn dữ liệu. \n"
            + "5. Hệ thống thương mại điện tử \n"
            + "•	Lưu trữ thông tin sản phẩm, đơn hàng, khách hàng. \n"
            + "•	Gợi ý sản phẩm dựa trên dữ liệu mua hàng.",
            "Các hệ quản trị cơ sở dữ liệu phổ biến: MySQL, PostgreSQL, SQL Server, Oracle \n"
            + "Hệ quản trị cơ sở dữ liệu (Database Management System - DBMS) là phần mềm giúp quản lý, lưu trữ và truy vấn dữ liệu. Trong đó, hệ quản trị cơ sở dữ liệu quan hệ (RDBMS - Relational Database Management System) dựa trên mô hình quan hệ và sử dụng SQL để thao tác dữ liệu. \n",
            "1. MySQL \n"
            + "🔹 Giới thiệu \n"
            + "•Phát triển bởi MySQL AB, hiện thuộc sở hữu của Oracle. \n"
            + "•Mã nguồn mở, miễn phí, phổ biến trong phát triển web. \n"
            + "•Hỗ trợ nhiều hệ điều hành: Windows, Linux, macOS. \n"
            + "🔹 Đặc điểm \n"
            + "✅ Dễ học, dễ cài đặt \n"
            + "✅ Hiệu suất cao cho các ứng dụng web \n"
            + "✅ Hỗ trợ nhiều kiểu lưu trữ (Storage Engines): InnoDB, MyISAM \n"
            + "✅ Hỗ trợ ACID với InnoDB \n"
            + "✅ Hỗ trợ sao lưu và nhân bản (Replication) \n"
            + "🔹 Ứng dụng \n"
            + "•WordPress, Magento, Joomla \n"
            + "•Facebook, Twitter, YouTube \n"
            + "•Các hệ thống quản lý nội dung (CMS) \n"
            + "🔹 Ví dụ MySQL \n"
            + "Tạo bảng users và thêm dữ liệu: ",
            "2. PostgreSQL \n"
            + "🔹 Giới thiệu \n"
            + "•	Phát triển từ năm 1986, mã nguồn mở, được biết đến với độ tin cậy cao. \n"
            + "•	Hỗ trợ SQL chuẩn cùng nhiều tính năng mở rộng mạnh mẽ. \n"
            + "🔹 Đặc điểm \n"
            + "✅ Mã nguồn mở, miễn phí, hỗ trợ JSON & NoSQL \n"
            + "✅ Cực kỳ mạnh mẽ trong xử lý truy vấn phức tạp \n"
            + "✅ Hỗ trợ ACID & MVCC (Multi-Version Concurrency Control) \n"
            + "✅ Hỗ trợ Stored Procedures với nhiều ngôn ngữ (PL/pgSQL, Python, JavaScript) \n"
            + "✅ Tính năng Table Inheritance và Partitioning \n"
            + "🔹 Ứng dụng \n"
            + "•	Quản lý dữ liệu doanh nghiệp, tài chính, GIS \n"
            + "•	Spotify, Instagram, Apple iTunes, Uber \n"
            + "🔹 Ví dụ PostgreSQL \n"
            + "Tạo bảng và chèn dữ liệu: ",
            "3. SQL Server (Microsoft SQL Server) \n"
            + "🔹 Giới thiệu \n"
            + "•	Được Microsoft phát triển, sử dụng nhiều trong doanh nghiệp. \n"
            + "•	Hỗ trợ tích hợp tốt với hệ sinh thái Microsoft như .NET, Azure. \n"
            + "🔹 Đặc điểm \n"
            + "✅ Hỗ trợ Windows, Linux, Azure \n"
            + "✅ Quản lý dữ liệu hiệu quả với SQL Server Management Studio (SSMS) \n"
            + "✅ Tích hợp Business Intelligence (BI), Data Warehousing \n"
            + "✅ Hỗ trợ Always On (High Availability), Replication, Clustering \n"
            + "🔹 Ứng dụng \n"
            + "•	Ngân hàng, tài chính, quản lý doanh nghiệp \n"
            + "•	Các hệ thống ERP, CRM lớn \n"
            + "🔹 Ví dụ SQL Server \n"
            + "Tạo bảng khách hàng:",
            "4. Oracle Database \n"
            + "🔹 Giới thiệu \n"
            + "•	Do Oracle Corporation phát triển, tập trung vào hệ thống doanh nghiệp lớn. \n"
            + "•	Cung cấp nhiều tính năng mạnh mẽ, đảm bảo hiệu suất cao. \n"
            + "🔹 Đặc điểm \n"
            + "✅ Tối ưu cho hệ thống lớn, hỗ trợ xử lý song song \n"
            + "✅ Cơ chế bảo mật mạnh, mã hóa dữ liệu \n"
            + "✅ Hỗ trợ PL/SQL (Procedural SQL) để lập trình nâng cao \n"
            + "✅ Hỗ trợ Data Partitioning, Real Application Clusters (RAC) \n"
            + "✅ Khả năng sao lưu, phục hồi mạnh mẽ \n"
            + "🔹 Ứng dụng \n"
            + "•	Ngân hàng, tài chính, bảo hiểm, viễn thông \n"
            + "•	Amazon, eBay, NASA \n"
            + "🔹 Ví dụ Oracle SQL \n"
            + "Tạo bảng nhân viên:",
            "Kết luận \n"
            + "•	MySQL: Tốt nhất cho web và ứng dụng nhỏ - trung bình. \n"
            + "•	PostgreSQL: Mạnh mẽ, linh hoạt cho hệ thống lớn và phân tích dữ liệu. \n"
            + "•	SQL Server: Tốt nhất cho doanh nghiệp Microsoft. \n"
            + "•	Oracle: Lựa chọn hàng đầu cho doanh nghiệp lớn, ngân hàng, tài chính."
        });

        Content_MAP.put("Khái niệm", new String[]{
            "Khái niệm của RDBMS, DATABASE và cú pháp SQL",
            "RDBMS (Hệ quản trị cơ sở dữ liệu quan hệ): RDBMS là một loại hệ quản trị cơ sở dữ liệu (DBMS) mà dữ liệu được tổ chức theo mô hình quan hệ. Trong RDBMS, dữ liệu được lưu trữ trong các bảng (tables) và các bảng có thể liên kết với nhau thông qua các khóa (keys). Một số RDBMS phổ biến bao gồm MySQL, PostgreSQL, Oracle, Microsoft SQL Server, và SQLite.",
            "Database (Cơ sở dữ liệu): Cơ sở dữ liệu là một tập hợp có tổ chức các dữ liệu, thường được lưu trữ và truy cập điện tử từ một hệ thống máy tính. Cơ sở dữ liệu có thể được sử dụng để lưu trữ thông tin về bất kỳ thứ gì, từ danh sách khách hàng đến thông tin sản phẩm.",
            "SQL (Structured Query Language) là ngôn ngữ tiêu chuẩn để quản lý và thao tác với cơ sở dữ liệu quan hệ. Dưới đây là một số cú pháp SQL cơ bản:",
            "1. Tạo cơ sở dữ liệu",
            "2. Sử dụng cơ sở dữ liệu",
            "3. Tạo bảng",
            "4. Chèn dữ liệu vào bảng",
            "5. Truy vấn dữ liệu",
            "Lấy tất cả dữ liệu từ bảng:",
            "Lấy dữ liệu với điều kiện:",
            "6. Cập nhật dữ liệu",
            "7. Xóa dữ liệu",
            "8. Thêm cột vào bảng",
            "9. Xóa bảng"
        });

        Content_MAP.put("Kiểu dữ liệu, toán tử, biểu thức", new String[]{
            "Trong SQL, kiểu dữ liệu xác định loại dữ liệu mà một cột trong bảng có thể lưu trữ, bao gồm các loại như số nguyên (INT), chuỗi (VARCHAR), và ngày tháng (DATETIME). Toán tử là các ký hiệu hoặc từ khóa dùng để thực hiện các phép toán trên dữ liệu, như toán tử số học (+, -, *, /) và toán tử so sánh (=, >, <). Biểu thức là sự kết hợp của các giá trị, toán tử và hàm, cho phép tính toán hoặc so sánh để trả về một giá trị.",
            "Kiểu Dữ Liệu Số (Numeric Data Types) \n"
            + "INT: Số nguyên (4 byte), ví dụ: 10, -25, 500. \n"
            + "BIGINT: Số nguyên lớn (8 byte), ví dụ: 9000000000. \n"
            + "DECIMAL(p, s): Số thực với số chữ số thập phân xác định, ví dụ: 123.45 (DECIMAL(5,2)). \n"
            + "FLOAT: Số thực dấu chấm động, ví dụ: 3.14159. \n"
            + "BIT: Dữ liệu nhị phân (0 hoặc 1), ví dụ: 0, 1.",
            "Kiểu Dữ Liệu Chuỗi (String Data Types) \n"
            + "CHAR(n): Chuỗi cố định độ dài n, ví dụ: 'A', 'SQL'. \n"
            + "VARCHAR(n): Chuỗi có độ dài thay đổi, ví dụ: 'Nguyễn Văn A'. \n"
            + "TEXT: Chuỗi lớn (dùng cho mô tả dài), ví dụ: 'Mô tả sản phẩm...'. \n",
            "Kiểu Dữ Liệu Ngày Tháng (Date and Time Data Types) \n"
            + "DATE: Ngày (YYYY-MM-DD), ví dụ: '2025-03-27'. \n"
            + "TIME: Giờ (HH:MI:SS), ví dụ: '14:30:00'. \n"
            + "DATETIME: Ngày và giờ, ví dụ: '2025-03-27 14:30:00'. \n"
            + "TIMESTAMP: Mốc thời gian, ví dụ: '2025-03-27 14:30:00'.",
            "Toán Tử Số Học (Arithmetic Operators) \n"
            + "+: Cộng \n"
            + "-: Trừ \n"
            + "*: Nhân \n"
            + "/: Chia \n"
            + "%: Chia lấy dư (Modulo) \n",
            "Toán Tử So Sánh (Comparison Operators) \n"
            + "=: Bằng \n"
            + "!= hoặc <>: Khác \n"
            + ">=: Lớn hơn hoặc bằng \n"
            + ">: Lớn hơn \n"
            + "<: Nhỏ hơn \n"
            + "<=: Nhỏ hơn hoặc bằng \n",
            "Toán Tử Logic (Logical Operators) \n"
            + "AND: Cả hai điều kiện đúng \n"
            + "OR: Một trong hai điều kiện đúng \n"
            + "NOT: Phủ định điều kiện",
            "Biểu Thức trong SQL \n"
            + "Biểu thức là sự kết hợp của các giá trị, toán tử và hàm, cho phép tính toán hoặc so sánh để trả về một giá trị duy nhất."

        });

        Content_MAP.put("SELECT", new String[]{
            "Lệnh SELECT dùng để truy vấn dữ liệu từ một hoặc nhiều bảng trong cơ sở dữ liệu. Nó cho phép lọc, sắp xếp và nhóm dữ liệu theo yêu cầu.",
            "Cú pháp cơ bản: \n"
            + "SELECT column1, column2 FROM table_name WHERE condition;",
            "Ví dụ: \n",
            "- Lấy tất cả dữ liệu từ bảng Customers: \n",
            "- Lấy khách hàng có tuổi lớn hơn 30: \n",
            "- Sắp xếp kết quả theo tên: \n",
            "- Lọc giá trị không trùng lặp: \n",
            "Bài tập \n"
            + "Bảng: Customers (ID, Name, Age, City) \n"
            + "Yêu cầu: \n"
            + "Lấy tất cả thông tin từ bảng Customers. \n"
            + "Lấy tên và tuổi của khách hàng sống ở thành phố HÀ NỘI \n"
            + "Đếm số khách hàng có tuổi > 25.\n"

        });

        Content_MAP.put("INSERT", new String[]{
            "Lệnh INSERT dùng để thêm dữ liệu mới vào bảng. Có thể thêm một hoặc nhiều bản ghi cùng lúc.",
            "Cú pháp cơ bản: \n"
            + "INSERT INTO table_name (column1, column2) VALUES (value1, value2);",
            "Ví dụ: \n",
            "- Thêm một khách hàng mới: \n",
            "- Thêm nhiều khách hàng cùng lúc: \n",
            "Bài tập \n"
            + "Yêu cầu:\n"
            + "Lấy danh sách khách hàng sắp xếp theo tuổi giảm dần.\n"
            + "Lấy 5 khách hàng đầu tiên từ bảng Customers.\n"
        });

        Content_MAP.put("UPDATE", new String[]{
            "Lệnh UPDATE dùng để sửa đổi dữ liệu hiện có trong bảng. Luôn kết hợp với WHERE để tránh cập nhật toàn bộ bảng.",
            "Cú pháp cơ bản: \n"
            + "UPDATE table_name SET column1 = value1 WHERE condition;",
            "Ví dụ: \n",
            "- Cập nhật tuổi của khách hàng có ID = 1: \n",
            "- Cập nhật nhiều cột cùng lúc: \n",
            "⚠️ Lưu ý: Nếu bỏ qua WHERE, tất cả bản ghi sẽ bị cập nhật!",
            "Bài tập \n"
            + "Bảng: Employees (ID, Name, Salary) \n"
            + "Yêu cầu:\n"
            + "Tăng lương nhân viên có ID = 1 lên 10%.\n"
            + "Đổi tên nhân viên có ID = 2 thành \"Nguyễn Văn B\".\n"
        });

        Content_MAP.put("DELETE", new String[]{
            "Lệnh DELETE dùng để xóa dữ liệu từ bảng. Luôn kết hợp với WHERE để tránh xóa toàn bộ dữ liệu.",
            "Cú pháp cơ bản: \n"
            + "DELETE FROM table_name WHERE condition;",
            "Ví dụ: \n",
            "- Xóa khách hàng có ID = 3: \n",
            "- Xóa tất cả dữ liệu trong bảng (⚠️ Nguy hiểm!): \n",
            "🔹 Lệnh TRUNCATE (xóa nhanh hơn, không thể hoàn tác): \n",
            "Bài tập \n"
            + "Yêu cầu \n"
            + "Xóa đơn hàng có ID = 5.\n"
            + "Xóa tất cả đơn hàng trước năm 2023.\n"
        });

        Content_MAP.put("Kiểu dữ liệu số, chuỗi, ngày tháng", new String[]{
            "Dùng để lưu trữ giá trị số (số nguyên và số thực). \n"
            + "INT: Số nguyên (4 byte) \n"
            + "BIGINT: Số nguyên lớn (8 byte) \n"
            + "DECIMAL(p, s): Số thực với số chữ số thập phân xác định \n"
            + "FLOAT: Số thực dấu chấm động \n"
            + "BIT: Dữ liệu nhị phân (0 hoặc 1)",
            "Ví dụ: Tạo bảng Products với cột số lượng (Quantity) kiểu INT và giá (Price) kiểu DECIMAL.",
            "Dùng để lưu trữ văn bản hoặc ký tự. \n"
            + "CHAR(n): Chuỗi cố định độ dài n \n"
            + "VARCHAR(n): Chuỗi có độ dài thay đổi \n"
            + "TEXT: Chuỗi lớn (dùng cho mô tả dài)",
            "Ví dụ: Tạo bảng Customers với cột Name kiểu VARCHAR.",
            "Dùng để lưu trữ dữ liệu liên quan đến thời gian. \n"
            + "DATE: Ngày (YYYY-MM-DD) \n"
            + "TIME: Giờ (HH:MI:SS) \n"
            + "DATETIME: Ngày và giờ \n"
            + "TIMESTAMP: Mốc thời gian \n",
            "Ví dụ: Tạo bảng Orders với ngày đặt hàng (OrderDate) kiểu DATETIME."
        });

        Content_MAP.put("Toán tử số học, so sánh, logic", new String[]{
            "Dùng để thực hiện các phép toán trên dữ liệu số. \n"
            + "+: cộng \n"
            + "-: trừ \n"
            + "*: nhân \n"
            + "/: chia \n"
            + "%: chia lấy dư(Modulo)",
            "Ví dụ: Lấy tổng giá trị đơn hàng từ bảng Orders. \n",
            "Dùng để so sánh giá trị giữa các cột hoặc điều kiện. \n"
            + "=: Bằng \n"
            + "!= hoặc <>: Khác \n"
            + ">: Lớn hơn \n"
            + "<: Nhỏ hơn \n"
            + ">=: Lớn hơn hoặc bằng \n"
            + "<=: Nhỏ hơn hoặc bằng \n",
            "Ví dụ: Lấy danh sách khách hàng có tuổi lớn hơn 30.",
            "Dùng để kết hợp nhiều điều kiện trong câu truy vấn. \n"
            + "AND: Cả hai điều kiện đúng \n"
            + "OR: Một trong hai điều kiện đúng \n"
            + "NOT: Phủ định điều kiện",
            "Ví dụ: Lấy danh sách đơn hàng có tổng tiền > 500 hoặc số lượng > 10."
        });

        Content_MAP.put("Hàm tổng hợp", new String[]{
            // COUNT - Đếm số bản ghi
            "COUNT(column): Đếm số dòng không NULL (COUNT(*) đếm tất cả)",
            // SUM - Tính tổng
            "SUM(column): Tính tổng giá trị số (bỏ qua NULL)",
            // AVG - Trung bình
            "AVG(column): Tính giá trị trung bình (AVG(Price))",
            // MIN/MAX - Giá trị nhỏ nhất/lớn nhất
            "MIN(column)/MAX(column): Tìm giá trị nhỏ nhất/lớn nhất",
            "Kết hợp nhiều hàm"
        });

        Content_MAP.put("Hàm xử lý chuỗi", new String[]{
            // CONCAT - Nối chuỗi
            "CONCAT(s1, s2): Nối chuỗi (CONCAT('Hello', ' ', 'World'))",
            // SUBSTRING - Cắt chuỗi
            "SUBSTRING(str, start, length): Cắt chuỗi con (SUBSTRING('SQL', 1, 2) → 'SQ')",
            // UPPER/LOWER - Chuyển đổi chữ hoa/thường
            "UPPER(str)/LOWER(str): Chuyển thành chữ hoa/thường",
            // Lưu ý đặc biệt
            "⚠️ Lỗi phổ biến: SUBSTRING bắt đầu từ 1 (không phải 0)",
            "Kết hợp nhiều hàm"
        });

        Content_MAP.put("Hàm xử lý ngày tháng", new String[]{
            // NOW - Thời gian hiện tại
            "NOW(): Trả về ngày giờ hiện tại (2023-10-30 14:25:00)",
            // DATE_FORMAT - Định dạng ngày
            "DATE_FORMAT(date, format): Định dạng ngày (DATE_FORMAT(NOW(), '%d/%m/%Y') → 30/10/2023",
            // Ví dụ thực tế
            "Ứng dụng: Tính tuổi khách hàng từ ngày sinh",
            "Kết hợp nhiều hàm"
        });

        Content_MAP.put("PRIMARY KEY, FOREIGN KEY", new String[]{
            "🔹 Chức năng: \n"
            + "•	Xác định duy nhất mỗi dòng trong bảng. \n"
            + " •Không cho phép giá trị NULL.",
            "Ví dụ: Tạo bảng Customers với CustomerID là khóa chính",
            "📌 Lưu ý:\n"
            + "•	Mỗi bảng chỉ có một PRIMARY KEY.\n"
            + "•	Có thể tạo khóa chính trên nhiều cột (Composite Key):",
            "🔹 Chức năng:\n"
            + "•	Ràng buộc dữ liệu giữa hai bảng.\n"
            + "•	Khóa ngoại trỏ đến PRIMARY KEY của bảng khác.",
            "Ví dụ: Bảng Orders có khóa ngoại tham chiếu đến Customers",
            "📌 Lưu ý:\n"
            + "•	Nếu xóa một khách hàng trong Customers, cần xử lý quan hệ khóa ngoại (ON DELETE CASCADE hoặc ON DELETE SET NULL)."
        });

        Content_MAP.put("UNIQUE, CHECK, NOT NULL", new String[]{
            "🔹 Chức năng:\n"
            + "•	Đảm bảo giá trị trong cột không bị trùng lặp.\n"
            + "•	Khác PRIMARY KEY ở chỗ một bảng có thể có nhiều cột UNIQUE.",
            "Ví dụ: Đảm bảo Email trong Customers là duy nhất",
            "📌 Lưu ý:\n"
            + "•	UNIQUE có thể áp dụng trên nhiều cột:",
            "🔹 Chức năng:\n"
            + "•	Xác định điều kiện hợp lệ cho dữ liệu.",
            "Ví dụ: Ràng buộc Age phải lớn hơn 18",
            "📌 Lưu ý:\n"
            + "•	CHECK có thể kết hợp nhiều điều kiện:",
            "🔹 Chức năng:\n"
            + "•	Bắt buộc nhập giá trị vào cột.",
            "Ví dụ: Name và Email không được NULL",
            "📌 Lưu ý:\n"
            + "•	Dùng NOT NULL khi luôn bắt buộc có dữ liệu."
        });

        Content_MAP.put("DEFAULT", new String[]{
            "🔹 Chức năng:\n"
            + "•	Gán giá trị mặc định nếu không có dữ liệu nhập vào.",
            "Ví dụ: Mặc định Status là 'Active'",
            "📌 Lưu ý:\n"
            + "•	Khi thêm bản ghi mà không nhập Status, hệ thống sẽ tự động gán 'Active'."
        });

        Content_MAP.put("Tạo, xóa cơ sở dữ liệu", new String[]{
            "Tạo Cơ Sở Dữ Liệu (CREATE DATABASE) \n"
            + "🔹 Chức năng:\n"
            + "•	Tạo một cơ sở dữ liệu mới.\n"
            + "•	Đảm bảo tên cơ sở dữ liệu là duy nhất",
            "Cú pháp",
            "Ví dụ:\n"
            + "Tạo cơ sở dữ liệu ShopDB",
            "📌 Lưu ý:\n"
            + "•	Trong MySQL, có thể kiểm tra và chỉ tạo nếu chưa tồn tại:\n",
            "•	Sau khi tạo, cần chọn cơ sở dữ liệu để làm việc:",
            "Xóa Cơ Sở Dữ Liệu (DROP DATABASE) \n"
            + "🔹 Chức năng:\n"
            + "•	Xóa hoàn toàn cơ sở dữ liệu và toàn bộ dữ liệu trong đó.",
            "Cú pháp",
            "Ví dụ:\n"
            + "Xóa cơ sở dữ liệu ShopDB",
            "📌 Lưu ý:\n"
            + "•	Hành động này không thể hoàn tác, nên cần kiểm tra kỹ trước khi thực hiện.\n"
            + "•	Có thể kiểm tra trước khi xóa:"
        });

        Content_MAP.put("Sao lưu và phục hồi", new String[]{
            "Sao Lưu Cơ Sở Dữ Liệu (Backup Database) \n"
            + "🔹 Chức năng:\n"
            + "•	Sao lưu toàn bộ dữ liệu để khôi phục khi cần.",
            "Sao Lưu Bằng MySQL Dump \n"
            + "Trong MySQL, dùng lệnh mysqldump để sao lưu:",
            "📌 Giải thích:\n"
            + "•	-u root: Đăng nhập bằng user root.\n"
            + "•	-p: Yêu cầu nhập mật khẩu.\n"
            + "•	ShopDB: Cơ sở dữ liệu cần sao lưu.\n"
            + "•	backup.sql: File chứa dữ liệu sao lưu.",
            "Sao Lưu Trong SQL Server \n"
            + "Dùng lệnh BACKUP DATABASE:",
            "Phục Hồi Cơ Sở Dữ Liệu (Restore Database) \n"
            + "🔹 Chức năng:\n"
            + "•	Khôi phục dữ liệu từ file sao lưu.",
            "Phục Hồi Trong MySQL\n"
            + "Dùng lệnh mysql để nhập dữ liệu từ file backup:",
            "Phục Hồi Trong SQL Server\n"
            + "Dùng lệnh RESTORE DATABASE:",
            "📌 Lưu ý:\n"
            + "•	WITH REPLACE cho phép ghi đè cơ sở dữ liệu cũ."
        });

        Content_MAP.put("Quản lý quyền truy cập", new String[]{
            "🔹 Chức năng:\n"
            + "•	Phân quyền cho user truy cập hoặc thao tác trên cơ sở dữ liệu.",
            "Tạo Người Dùng Mới",
            "Cấp Quyền Cho Người Dùng\n"
            + "Cho phép user newuser sử dụng ShopDB",
            "📌 Các loại quyền phổ biến:\n"
            + "Quyền	Chức năng\n"
            + "ALL PRIVILEGES	Toàn quyền\n"
            + "SELECT	Xem dữ liệu\n"
            + "INSERT	Chèn dữ liệu\n"
            + "UPDATE	Cập nhật dữ liệu\n"
            + "DELETE	Xóa dữ liệu\n"
            + "CREATE	Tạo bảng, view, function\n"
            + "DROP	Xóa bảng, cơ sở dữ liệu\n"
            + "GRANT OPTION	Cho phép cấp quyền",
            "Thu Hồi Quyền (REVOKE)",
            "Xóa Người Dùng"
        });

        Content_MAP.put("Tạo, xóa, sửa bảng", new String[]{
            "🔹 Tạo Bảng (CREATE TABLE) \n"
            + "• Tạo bảng mới với các cột và ràng buộc \n"
            + "• Xác định kiểu dữ liệu (INT, VARCHAR, DATE...) \n"
            + "• Thiết lập PRIMARY KEY, FOREIGN KEY, UNIQUE...",
            "📌 Ví dụ: \n",
            "🔹 Xóa Bảng (DROP TABLE) \n"
            + "• Xóa hoàn toàn bảng và dữ liệu \n"
            + "• Không thể hoàn tác sau khi thực hiện",
            "📌 Ví dụ:",
            "🔹 Sửa Bảng (ALTER TABLE) \n"
            + "• Thêm/Xóa/Sửa cột \n"
            + "• Thay đổi kiểu dữ liệu \n",
            "📌 Ví dụ:",});

        Content_MAP.put("Tăng giá trị tự động", new String[]{
            "🔹 AUTO_INCREMENT \n"
            + "• Tự động tăng giá trị khóa chính \n"
            + "• Chỉ dùng cho kiểu số (INT, BIGINT...) \n",
            "📌 Ví dụ:",
            "🔹 Thiết lập giá trị bắt đầu",
            "🔹 Đặt lại giá trị",
            "⚠️ Lưu ý: \n"
            + "• Không tự động reset khi xóa dữ liệu \n"
            + "• Không dùng được với PRIMARY KEY kiểu VARCHAR"
        });

        Content_MAP.put("Tạo, xóa VIEW", new String[]{
            "🔹 Tạo VIEW \n"
            + "• Bảng ảo từ kết quả truy vấn \n"
            + "• Bảo mật bằng cách ẩn cột nhạy cảm \n",
            "📌 Ví dụ:",
            "🔹 Sử dụng VIEW",
            "🔹 Xóa VIEW",
            "Ưu điểm VIEW: \n"
            + "• Đơn giản hóa truy vấn phức tạp \n"
            + "• Giới hạn quyền truy cập dữ liệu \n"
            + "• Có thể dùng như bảng thông thường"
        });

        Content_MAP.put("JOIN", new String[]{
            "Chức năng \n"
            + "•	Dùng để lấy dữ liệu từ hai bảng có quan hệ với nhau thông qua khóa chính (Primary Key) và khóa ngoại (Foreign Key). \n"
            + "•	Có nhiều loại JOIN, phổ biến nhất gồm: \n"
            + "o	INNER JOIN: Chỉ lấy dữ liệu khớp giữa hai bảng. \n"
            + "o	LEFT JOIN: Lấy toàn bộ dữ liệu từ bảng bên trái, kể cả khi không có dữ liệu tương ứng từ bảng bên phải. \n"
            + "o	RIGHT JOIN: Lấy toàn bộ dữ liệu từ bảng bên phải, kể cả khi không có dữ liệu tương ứng từ bảng bên trái. \n"
            + "o	FULL JOIN: Lấy tất cả dữ liệu từ cả hai bảng.",
            "Cấu trúc INNER JOIN (Phổ biến nhất)",
            "Ví dụ thực tế: \n"
            + "Có hai bảng: \n"
            + "•	KhachHang (ID, HoTen, Email) \n"
            + "•	DonHang (ID, KhachHangID, SanPham, SoLuong) \n"
            + "👉 Lấy danh sách khách hàng và đơn hàng của họ:",
            "📌 Kết quả INNER JOIN chỉ hiển thị khách hàng có đơn hàng."
        });

        Content_MAP.put("SELF JOIN", new String[]{
            "Chức năng: \n"
            + "•Dùng khi bảng có quan hệ đệ quy, ví dụ cấu trúc cây phân cấp (nhân viên - quản lý). \n"
            + "•Dùng một bảng nhưng truy vấn như hai bảng khác nhau.",
            "Ví dụ: \n"
            + "Bảng NhanVien chứa thông tin nhân viên và ID quản lý của họ. \n"
            + "👉 Lấy danh sách nhân viên và tên quản lý của họ:",
            "📌 Lưu ý:\n"
            + "•	NV1 là nhân viên\n"
            + "•	NV2 là quản lý của nhân viên đó.\n"
            + "•	Kết quả sẽ hiển thị nhân viên và người quản lý trực tiếp của họ."
        });

        Content_MAP.put("UNION", new String[]{
            "Chức năng:\n"
            + "•	Dùng để gộp kết quả của nhiều truy vấn thành một tập kết quả.\n"
            + "•	Các cột trong các truy vấn phải cùng số lượng và kiểu dữ liệu.\n"
            + "•	Có hai loại:\n"
            + "o	UNION (Không lấy dữ liệu trùng lặp).\n"
            + "o	UNION ALL (Lấy cả dữ liệu trùng lặp).",
            "Ví dụ:\n"
            + "Bảng KhachHang và NhaCungCap đều có cột Ten, chứa tên khách hàng và nhà cung cấp.\n"
            + "👉 Gộp danh sách khách hàng và nhà cung cấp thành một danh sách chung:",
            "📌 Lưu ý:\n"
            + "•	UNION tự động loại bỏ các giá trị trùng nhau.\n"
            + "•	Nếu muốn giữ lại giá trị trùng lặp, dùng UNION ALL:"
        });

        Content_MAP.put("GROUP BY", new String[]{
            "Chức năng:\n"
            + "•	Dùng để gom nhóm các dòng dữ liệu có giá trị giống nhau trong một hoặc nhiều cột.\n"
            + "•	Thường được sử dụng cùng với hàm tổng hợp để tính toán trên từng nhóm dữ liệu.",
            "Cú pháp GROUP BY",
            "📌 Lưu ý:\n"
            + "•	Các cột trong SELECT phải xuất hiện trong GROUP BY, trừ các cột được dùng trong hàm tổng hợp.",
            "Ví dụ:\n"
            + "Bảng DonHang có dữ liệu sau: \n"
            + "👉 Đếm số đơn hàng của từng khách hàng:",
            "📌 Kết quả: \n"
            + "👉 Tính tổng số lượng sản phẩm khách hàng đã mua:"
        });

        Content_MAP.put("Hàm tổng hợp", new String[]{
            "Các hàm tổng hợp thường dùng với GROUP BY để tính toán trên từng nhóm dữ liệu. \n"
            + "COUNT(*)	Đếm số dòng dữ liệu trong một nhóm \n"
            + "SUM(cot)	Tính tổng giá trị của cột \n"
            + "AVG(cot)	Tính giá trị trung bình của cột \n"
            + "MIN(cot)	Lấy giá trị nhỏ nhất trong cột \n"
            + "MAX(cot)	Lấy giá trị lớn nhất trong cột ",
            "Ví dụ thực tế: \n"
            + "👉 Tính tổng số lượng sản phẩm bán được cho từng sản phẩm:",
            "📌 Kết quả:",
            "👉 Tính số lượng khách hàng đã mua từng loại sản phẩm:",
            "📌 Lưu ý:\n"
            + "•	COUNT(*): Đếm tổng số dòng.\n"
            + "•	COUNT(DISTINCT KhachHang): Đếm số khách hàng không trùng lặp."
        });

        Content_MAP.put("HAVING", new String[]{
            "🔹 Chức năng:\n"
            + "•	Giống WHERE, nhưng HAVING dùng để lọc dữ liệu sau khi đã GROUP BY.\n"
            + "•	WHERE lọc trước khi GROUP BY, còn HAVING lọc sau khi đã tổng hợp dữ liệu.",
            "Cú pháp:",
            "Ví dụ:\n"
            + "👉 Chỉ lấy những khách hàng có từ 2 đơn hàng trở lên:",
            "📌 Kết quả: "
        });

        Content_MAP.put("UPPER, LOWER", new String[]{
            "Chức năng:\n"
            + "•	UPPER(text): Chuyển toàn bộ chuỗi thành chữ hoa.\n"
            + "•	LOWER(text): Chuyển toàn bộ chuỗi thành chữ thường.",
            "👉 Chuyển tất cả tên thành chữ hoa:",
            "👉 Chuyển tất cả tên thành chữ thường:"
        });

        Content_MAP.put("SUBSTRING", new String[]{
            "🔹 Chức năng:\n"
            + "•	SUBSTRING(text, vị_trí_bắt_đầu, số_ký_tự):\n"
            + "o	Cắt một phần của chuỗi từ vị trí bắt đầu và lấy số ký tự nhất định.",
            "👉 Lấy 3 ký tự đầu tiên của tên khách hàng:",
            "📌 Kết quả:"
        });

        Content_MAP.put("ROUND", new String[]{
            "🔹 Chức năng:\n"
            + "•	ROUND(số, số_chữ_số_thập_phân): Làm tròn số đến chữ số thập phân chỉ định.",
            "Ví dụ: \n"
            + "👉 Làm tròn giá trị đơn hàng đến 2 chữ số thập phân:"
        });

        Content_MAP.put("NOW, DATE_FORMAT", new String[]{
            "SQL cung cấp các hàm mạnh mẽ để làm việc với ngày và giờ.",
            "🔹 Lấy Thời Gian Hiện Tại (NOW)\n"
            + "•	NOW(): Lấy ngày và giờ hiện tại.",
            "🔹 Định Dạng Ngày Giờ (DATE_FORMAT) \n"
            + "•	DATE_FORMAT(ngày, 'định_dạng'): Hiển thị ngày giờ theo định dạng mong muốn.",
            "👉 Ví dụ:",
            "👉 Lấy ngày và tháng từ một cột ngày:"
        });

        Content_MAP.put("SELECT INTO", new String[]{
            "🔹 Chức năng:\n"
            + "•	SELECT INTO cho phép tạo một bảng mới chứa dữ liệu được chọn từ một bảng khác.\n"
            + "•	Thích hợp khi cần sao lưu dữ liệu hoặc tạo bảng tạm thời.",
            "Ví dụ:\n"
            + "Giả sử có bảng KhachHang:",
            "👉 Tạo bản sao của khách hàng có ID nhỏ hơn 3 vào bảng mới KhachHangSaoLuu:",
            "⏩ Lưu ý:\n"
            + "•	KhachHangSaoLuu phải chưa tồn tại trước khi chạy lệnh.\n"
            + "•	Nếu bảng đã tồn tại, dùng INSERT INTO SELECT thay vì SELECT INTO."
        });

        Content_MAP.put("INSERT INTO SELECT", new String[]{
            "🔹 Chức năng:\n"
            + "•	Sao chép dữ liệu từ một bảng sang bảng khác mà không tạo bảng mới.",
            "Cú pháp:",
            "Ví dụ:\n"
            + "👉 Chèn tất cả khách hàng có ID nhỏ hơn 3 từ KhachHang vào KhachHangLuuTru:",
            "📌 Kết quả:\n"
            + "Bảng KhachHangLuuTru sẽ chứa dữ liệu được chép từ KhachHang.",
            "⏩ Lưu ý:\n"
            + "•	KhachHangLuuTru phải tồn tại trước khi chạy lệnh.\n"
            + "•	Cột trong INSERT INTO phải khớp số lượng và kiểu dữ liệu với SELECT."
        });

        Content_MAP.put("CASE", new String[]{
            "🔹 Chức năng:\n"
            + "•	CASE hoạt động giống như IF-ELSE, giúp xử lý điều kiện trong truy vấn SQL.\n"
            + "•	Dùng trong SELECT, WHERE, ORDER BY để thực hiện logic có điều kiện.",
            "Cú pháp:",
            "Ví dụ : Phân loại khách hàng dựa trên số điểm\n"
            + "Giả sử bảng KhachHang có thêm cột DiemTichLuy:",
            "👉 Phân loại khách hàng dựa trên điểm:",
            "Ví dụ 2: Hiển thị trạng thái đơn hàng \n"
            + "👉 Thay thế mã trạng thái thành văn bản dễ hiểu:"
        });

        Content_MAP.put("Tạo và sử dụng PROCEDURE", new String[]{
            "🔹 Stored Procedure là một hàm lưu trữ trong SQL, giúp thực thi một nhóm câu lệnh SQL bằng một lệnh gọi duy nhất.",
            "🔹 Ứng dụng:\n"
            + "•	Giảm lặp lại mã SQL trong ứng dụng.\n"
            + "•	Tăng hiệu suất vì SQL Server lưu trữ thủ tục trong bộ nhớ đệm.\n"
            + "•	Cải thiện bảo mật bằng cách giới hạn quyền truy cập trực tiếp vào dữ liệu.",
            "Ví dụ:\n"
            + "Tạo một Stored Procedure để lấy danh sách khách hàng từ bảng KhachHang:",
            "📌 Cách gọi Procedure:"
        });

        Content_MAP.put("Truyền tham số vào PROCEDURE", new String[]{
            "🔹 Lợi ích:\n"
            + "•	Giúp Procedure linh hoạt hơn.\n"
            + "•	Có thể truyền giá trị để lọc dữ liệu hoặc thực hiện hành động cụ thể.",
            "Ví dụ:\n"
            + "Procedure lấy thông tin khách hàng theo ID:",
            "📌 Gọi Procedure với tham số:",
            "Procedure có thể nhận nhiều tham số để linh hoạt hơn.",
            "Ví dụ:\n"
            + "Tạo Procedure cập nhật email của khách hàng theo ID:",
            "📌 Gọi Procedure với nhiều tham số:"
        });

        Content_MAP.put("Lợi ích và ứng dụng thực tế", new String[]{
            "✔ Tăng hiệu suất – SQL Server lưu trữ Procedure trong bộ nhớ cache.\n"
            + "✔ Bảo mật tốt hơn – Giới hạn quyền truy cập vào dữ liệu, không cần cấp quyền trực tiếp trên bảng.\n"
            + "✔ Tái sử dụng – Giảm lặp lại mã SQL trong ứng dụng.",
            "📌 Tự động hóa báo cáo hàng tháng:\n"
            + "•	Procedure có thể chạy mỗi tháng để tổng hợp doanh số.\n"
            + "📌 Xử lý đăng nhập, kiểm tra tài khoản:\n"
            + "•	Một Procedure kiểm tra tài khoản hợp lệ trước khi cho phép đăng nhập.\n"
            + "📌 Xử lý đơn hàng, cập nhật tồn kho:\n"
            + "•	Khi có đơn hàng mới, Procedure có thể trừ số lượng hàng trong kho."
        });

        Content_MAP.put("Phòng chống SQL Injection", new String[]{
            "🔹 SQL Injection là một dạng tấn công bảo mật trong đó kẻ tấn công chèn mã SQL độc hại vào các truy vấn để lấy cắp dữ liệu hoặc làm hỏng hệ thống.",
            "🔹 Hậu quả:\n"
            + "✔ Đánh cắp thông tin nhạy cảm (tài khoản, mật khẩu, dữ liệu khách hàng).\n"
            + "✔ Xóa hoặc thay đổi dữ liệu trong cơ sở dữ liệu.\n"
            + "✔ Điều khiển toàn bộ hệ thống nếu quyền truy cập quá cao.",
            "Ví dụ SQL Injection\n"
            + "Giả sử có một đoạn mã SQL trong ứng dụng web:",
            "Kẻ tấn công nhập vào trường mật khẩu:",
            "Khi đó, truy vấn SQL sẽ trở thành:",
            "Do '1'='1' luôn đúng, kẻ tấn công có thể đăng nhập mà không cần mật khẩu!",
            "Cách phòng chống SQL Injection",
            "✅ Sử dụng Prepared Statements (Query có tham số)\n"
            + "Chuẩn bị truy vấn trước với tham số thay vì nối chuỗi trực tiếp.",
            "🔹 Ví dụ trong MySQL với PHP:",
            "✔ Lợi ích: Chặn hoàn toàn SQL Injection vì tham số không được thực thi như mã SQL.",
            "Dùng Stored Procedure\n"
            + "🔹 Ví dụ tạo Stored Procedure an toàn:",
            "✔ Lợi ích: Tránh kết hợp chuỗi SQL trực tiếp.\n"
            + "✅ Hạn chế quyền của tài khoản kết nối SQL\n"
            + "❌ Sai: Kết nối bằng tài khoản admin có quyền cao.\n"
            + "✅ Đúng: Chỉ cấp quyền SELECT, INSERT cho tài khoản ứng dụng.",
            "🔹 Ví dụ cấp quyền chỉ đọc:",
            "🔹 Thu hồi quyền thừa:",
            "✔ Lợi ích: Nếu hacker tấn công, họ không thể xóa hoặc sửa dữ liệu."
        });

        Content_MAP.put("Nguyên tắc Least Privilege", new String[]{
            "🔹 Least Privilege là nguyên tắc bảo mật yêu cầu mỗi người dùng chỉ có quyền tối thiểu cần thiết để thực hiện công việc của họ.",
            "✔ Ứng dụng thực tế:\n"
            + "•	Nhân viên kế toán chỉ có quyền đọc dữ liệu tài chính, không thể xóa.\n"
            + "•	Người dùng ứng dụng web chỉ có quyền SELECT, không thể sửa hoặc xóa.\n"
            + "•	Tài khoản admin không dùng để kết nối từ ứng dụng web.",
            "🔹 Cách áp dụng trong SQL:\n"
            + "1️⃣ Tạo tài khoản riêng cho từng nhóm người dùng.",
            "2️⃣ Không cấp quyền GRANT hoặc SUPER cho tài khoản không cần thiết.\n"
            + "3️⃣ Sử dụng VIEW để giới hạn dữ liệu người dùng có thể truy cập."
        });

        Content_MAP.put("PARTITIONING, HASH PARTITIONING", new String[]{
            "Phân vùng dữ liệu (Partitioning) là kỹ thuật chia một bảng lớn thành nhiều phần nhỏ hơn để cải thiện hiệu suất truy vấn và quản lý dữ liệu tốt hơn.",
            "🔹 Range Partitioning (Phân vùng theo khoảng giá trị)\n"
            + "•	Dữ liệu được chia theo một khoảng giá trị nhất định (VD: theo năm, tháng).\n"
            + "•	Ví dụ: Chia bảng Orders theo năm đặt hàng.",
            "🔹 List Partitioning (Phân vùng theo danh sách giá trị cụ thể)\n"
            + "•	Dữ liệu được chia dựa trên một danh sách giá trị xác định trước.\n"
            + "•	Ví dụ: Phân vùng bảng khách hàng theo khu vực.",
            "🔹 Hash Partitioning (Phân vùng theo hàm băm)\n"
            + "•	Dữ liệu được phân chia ngẫu nhiên dựa trên giá trị băm để cân bằng tải.\n"
            + "•	Ví dụ: Chia bảng Users theo UserID.",
            "✔ Lợi ích: Truy vấn nhanh hơn, tối ưu xử lý dữ liệu lớn."
        });

        Content_MAP.put("SHARDING", new String[]{
            "Sharding là kỹ thuật chia một cơ sở dữ liệu lớn thành nhiều cơ sở dữ liệu nhỏ hơn trên các máy chủ khác nhau để cải thiện hiệu suất.",
            "🔹 Phân biệt Partitioning & Sharding \n"
            + "Dữ liệu chia trên cùng một máy chủ	✅\n"
            + "Dữ liệu chia trên nhiều máy chủ khác nhau	❌ \n"
            + "Tăng tốc truy vấn trên một bảng lớn	✅ \n"
            + "Giảm tải cho một máy chủ	❌",
            "✅ Ví dụ Sharding",
            "Giả sử chúng ta có một bảng Users chứa hàng triệu người dùng, ta có thể chia thành 3 database:\n"
            + "•	users_shard1 chứa UserID từ 1 - 1 triệu\n"
            + "•	users_shard2 chứa UserID từ 1 triệu - 2 triệu\n"
            + "•	users_shard3 chứa UserID từ 2 triệu - 3 triệu",
            "📌 Cách triển khai:\n"
            + "•	Dùng UserID % số lượng máy chủ để xác định nơi lưu trữ.",
            "✔ Lợi ích: Giảm tải cho một máy chủ, hỗ trợ mở rộng dễ dàng."
        });

        Content_MAP.put("BATCH PROCESSING", new String[]{
            "Batch Processing là phương pháp xử lý dữ liệu theo từng nhóm thay vì từng bản ghi một.",
            "🔹 Tại sao cần Batch Processing?\n"
            + "✔ Tránh làm chậm hệ thống khi cập nhật quá nhiều bản ghi cùng lúc.\n"
            + "✔ Giảm tải cho cơ sở dữ liệu bằng cách xử lý dữ liệu theo từng cụm.",
            "✅ Ví dụ Batch Processing trong SQL\n"
            + "🔹 Cập nhật hàng loạt thay vì cập nhật từng dòng\n"
            + "❌ Cách không tối ưu (gửi nhiều truy vấn nhỏ):",
            "✅ Cách tối ưu (dùng một truy vấn lớn):",
            "🔹 Chèn dữ liệu hàng loạt thay vì từng dòng\n"
            + "❌ Chèn từng bản ghi riêng lẻ (không hiệu quả):",
            "✅ Dùng một truy vấn duy nhất:",
            "🔹 Xóa hàng loạt dữ liệu theo nhóm\n"
            + "•	Xóa 1000 dòng một lúc thay vì toàn bộ bảng.",
            "✔ Lợi ích: Giảm tải cho cơ sở dữ liệu và tránh gây nghẽn hệ thống."
        });

        Content_MAP.put("RECURSIVE QUERIES", new String[]{
            "✅ Truy vấn đệ quy là gì?\n"
            + "•	Là truy vấn tự gọi chính nó để xử lý cấu trúc dữ liệu phân cấp (cây thư mục, sơ đồ nhân sự…).\n",
            "•Sử dụng CTE đệ quy (WITH RECURSIVE).",
            "✅ Ví dụ: Tìm cấp bậc nhân viên trong công ty\n"
            + "Bảng Employees:",
            "🛠 Truy vấn để lấy toàn bộ cây nhân viên từ CEO",
            "✔ Kết quả: Nhân viên được hiển thị theo cấp bậc."
        });

        Content_MAP.put("Biểu thức CTE", new String[]{
            "✅ CTE là gì?\n"
            + "•	CTE (WITH) là một dạng bảng tạm thời chỉ tồn tại trong một truy vấn.\n"
            + "•	Dễ đọc, dễ debug hơn SUBQUERY.",
            "✅ Ví dụ: Tính tổng doanh thu theo tháng",
            "✔ Kết quả: Tổng doanh thu mỗi tháng."
        });

        Content_MAP.put("WINDOW FUNCTIONS", new String[]{
            "✅ Hàm cửa sổ là gì?\n"
            + "•	Dùng để tính toán trên từng hàng nhưng không làm thay đổi số lượng hàng.\n"
            + "•	Khác với GROUP BY vì không gộp dữ liệu.",
            "✅ Ví dụ: Xếp hạng doanh số nhân viên",
            "✔ Kết quả: Xếp hạng nhân viên theo phòng ban.",
            "Các hàm cửa sổ phổ biến: \n"
            + "ROW_NUMBER(): Gán số thứ tự cho mỗi dòng \n"
            + "RANK(): Xếp hạng có thể bị nhảy số(1,2,3,4...) \n"
            + "DENSE_RANK(): Xếp hạng liên tục(1,2,2,3...) \n"
            + "LAG(): Lấy giá trị dòng trước \n"
            + "LEAD(): Lấy giá trị dòng sau"
        });

        Content_MAP.put("Dynamic SQL", new String[]{
            "✅ SQL động là gì?\n"
            + "•	Cho phép tạo truy vấn dựa trên điều kiện đầu vào.\n"
            + "•	Dùng trong thủ tục lưu trữ (Stored Procedures).",
            "✅ Ví dụ: Truy vấn bảng linh hoạt dựa trên tham số",
            "✔ Kết quả: Truy vấn được thực thi với bảng được chỉ định động.",
            "📌 Cảnh báo: Cần xử lý đúng để tránh SQL Injection!"
        });

        Content_MAP.put("MySQL", new String[]{
            "MySQL: Đặc điểm và cú pháp riêng",
            "🔹 Ưu điểm:\n"
            + "✅ Miễn phí, mã nguồn mở.\n"
            + "✅ Hiệu suất cao, phổ biến với web apps (WordPress, Laravel, v.v.).\n"
            + "✅ Hỗ trợ InnoDB với khóa ngoại (FOREIGN KEY).\n"
            + "✅ Cú pháp đơn giản, dễ học.",
            "🔹 Nhược điểm:\n"
            + "⚠️ Không hỗ trợ FULL OUTER JOIN.\n"
            + "⚠️ Hạn chế trong xử lý stored procedures so với các hệ khác.",
            "🔹 Ví dụ:\n"
            + "👉 Tạo bảng & AUTO_INCREMENT",
            "👉 LIMIT (thay vì TOP trong SQL Server)"
        });

        Content_MAP.put("SQL Server", new String[]{
            "SQL Server: Tích hợp với Microsoft",
            "🔹 Ưu điểm:\n"
            + "✅ Tích hợp chặt với Windows & Microsoft tools (Power BI, .NET, Azure).\n"
            + "✅ Hỗ trợ tốt Stored Procedures, Triggers, Functions.\n"
            + "✅ Hỗ trợ transaction mạnh (ACID).",
            "🔹 Nhược điểm:\n"
            + "⚠️ Chi phí bản quyền cao.\n"
            + "⚠️ Windows-centric (hạn chế hỗ trợ trên Linux trước đây, nhưng đã được cải thiện).",
            "🔹 Ví dụ:\n"
            + "👉 Sử dụng TOP thay vì LIMIT trong MySQL",
            "👉 Tạo Stored Procedure"
        });

        Content_MAP.put("PostgreSQL", new String[]{
            "PostgreSQL: Tính năng mạnh mẽ",
            "🔹 Ưu điểm:\n"
            + "✅ Mã nguồn mở, nhưng mạnh mẽ như Oracle.\n"
            + "✅ Hỗ trợ JSON, XML, khóa ngoại mạnh.\n"
            + "✅ Hỗ trợ FULL OUTER JOIN & Recursive Queries.\n"
            + "✅ Hiệu suất cao với các truy vấn phức tạp.",
            "🔹 Nhược điểm:\n"
            + "⚠️ Hơi phức tạp hơn MySQL trong cài đặt và tối ưu hóa.",
            "🔹 Ví dụ:\n"
            + "👉 Hỗ trợ JSON mạnh mẽ",
            "👉 FULL OUTER JOIN (không có trong MySQL)"
        });

        Content_MAP.put("Oracle", new String[]{
            "Oracle: Doanh nghiệp và bảo mật",
            "🔹 Ưu điểm:\n"
            + "✅ Bảo mật mạnh – dùng trong ngân hàng, tài chính.\n"
            + "✅ Hỗ trợ tốt PL/SQL (Procedural SQL).\n"
            + "✅ Hỗ trợ tốt phân vùng dữ liệu (Partitioning).\n"
            + "✅ Hiệu suất cao với các hệ thống lớn.",
            "🔹 Nhược điểm:\n"
            + "⚠️ Chi phí rất cao.\n"
            + "⚠️ Khó tiếp cận cho người mới học SQL.\n",
            "🔹 Ví dụ:\n"
            + "👉 PL/SQL (thủ tục nâng cao hơn so với SQL Server/MySQL)",
            "👉 Sequence (tạo ID tự động thay vì AUTO_INCREMENT)"
        });

        Content_MAP.put("IDE cho SQL", new String[]{
            "IDE (Integrated Development Environment) giúp viết, chạy và quản lý truy vấn SQL dễ dàng hơn.",
            "🔹 MySQL Workbench (MySQL)\n"
            + "✅ Công cụ chính thức của MySQL.\n"
            + "✅ Hỗ trợ thiết kế cơ sở dữ liệu trực quan (ER Diagram).\n"
            + "✅ Hỗ trợ truy vấn và tối ưu SQL.",
            "🔹 DBeaver (Hỗ trợ nhiều RDBMS: MySQL, PostgreSQL, SQL Server, Oracle, v.v.)\n"
            + "✅ Hỗ trợ nhiều hệ quản trị.\n"
            + "✅ Giao diện thân thiện, dễ sử dụng.\n"
            + "✅ Có bản miễn phí và bản trả phí với nhiều tính năng nâng cao.",
            "📌 Ví dụ:\n"
            + "👉 Viết truy vấn trong MySQL Workbench:"
        });

        Content_MAP.put("Công cụ GUI", new String[]{
            "Các công cụ GUI giúp quản lý cơ sở dữ liệu trực quan hơn.",
            "🔹 pgAdmin (PostgreSQL)\n"
            + "✅ Công cụ chính thức của PostgreSQL.\n"
            + "✅ Hỗ trợ viết truy vấn, quản lý người dùng, tạo backup.",
            "🔹 SQL Server Management Studio (SSMS) (SQL Server)\n"
            + "✅ Công cụ chính thức của Microsoft.\n"
            + "✅ Hỗ trợ quản lý dữ liệu và lập trình SQL Server.",
            "📌 Ví dụ:\n"
            + "👉 Tạo bảng mới trong SSMS bằng giao diện đồ họa mà không cần viết SQL."
        });

        Content_MAP.put("ORM", new String[]{
            "ORM giúp lập trình viên tương tác với cơ sở dữ liệu bằng code thay vì SQL thuần.",
            "🔹 Hibernate (Java)\n"
            + "✅ ORM mạnh nhất cho Java.\n"
            + "✅ Tích hợp tốt với Spring Boot.",
            "🔹 SQLAlchemy (Python)\n"
            + "✅ ORM phổ biến nhất cho Python.\n"
            + "✅ Linh hoạt và dễ sử dụng.",
            "📌 Ví dụ:\n"
            + "👉 Dùng SQLAlchemy để lấy dữ liệu"
        });

        Content_MAP.put("Công cụ tối ưu hiệu suất", new String[]{
            "🔹 EXPLAIN – Kiểm tra cách truy vấn chạy.\n"
            + "🔹 Query Profiler – Phân tích hiệu suất truy vấn.",
            "📌 Ví dụ:\n"
            + "👉 Dùng EXPLAIN để tối ưu truy vấn trong MySQL:"
        });

        //Python
        Content_MAP.put("Giới thiệu về Python", new String[]{
            "Python là một ngôn ngữ lập trình bậc cao, đa mục đích, dễ đọc và mạnh mẽ, được tạo ra bởi Guido van Rossum vào năm 1991. Python nổi tiếng với cú pháp đơn giản, gần gũi với ngôn ngữ tự nhiên, giúp lập trình viên tập trung vào logic thay vì cú pháp phức tạp. \n"
            + "Python nổi bật với cú pháp đơn giản, dễ đọc, và khả năng ứng dụng linh hoạt từ phát triển web, trí tuệ nhân tạo, phân tích dữ liệu, đến lập trình nhúng.",
            "✅ Dễ học, dễ đọc: Cú pháp rõ ràng, ít từ khóa phức tạp.\n"
            + "✅ Đa nền tảng: Chạy trên Windows, macOS, Linux.\n"
            + "✅ Thư viện phong phú: Hỗ trợ AI, web, phân tích dữ liệu, tự động hóa,...\n"
            + "✅ Cộng đồng lớn: Nhiều tài liệu, hỗ trợ từ cộng đồng.\n"
            + "✅ Ứng dụng rộng rãi: Từ web, AI đến khoa học dữ liệu, IoT.",
            "1. Cú pháp đơn giản",
            "2. Hỗ trợ nhiều mô hình lập trình \n"
            + "Hướng đối tượng (OOP)\n"
            + "Lập trình hàm (Functional Programming)\n"
            + "Lập trình thủ tục (Procedural)",
            "3. Quản lý bộ nhớ tự động \n"
            + "Python sử dụng cơ chế garbage collection, giúp tự động giải phóng bộ nhớ không dùng đến.",
            "4. Thư viện chuẩn (Standard Library) phong phú \n"
            + "os: Làm việc với hệ thống tệp.\n"
            + "math: Các hàm toán học.\n"
            + "datetime: Xử lý ngày giờ.\n"
            + "json: Làm việc với dữ liệu JSON.\n"
            + "socket: Lập trình mạng TCP/IP.",
            "5. Hỗ trợ tích hợp với C/C++ \n"
            + "Có thể nhúng code C/C++ vào Python để tăng hiệu suất (dùng ctypes, Cython)."
        });

        Content_MAP.put("Lịch sử phát triển", new String[]{
            "Python là một trong những ngôn ngữ lập trình phổ biến nhất hiện nay, nhưng ít người biết rằng nó đã trải qua một hành trình phát triển thú vị từ những năm 1980. Dưới đây là dòng thời gian chi tiết về lịch sử của Python:",
            "1. Khởi nguồn (1980 - 1991)\n"
            + "- 1989: Guido van Rossum (người Hà Lan) bắt đầu phát triển Python trong kỳ nghỉ Giáng sinh khi làm việc tại CWI (Trung tâm Toán học và Tin học Hà Lan).  \n"
            + "- Mục tiêu: Tạo ra ngôn ngữ kế thừa ưu điểm của ABC (ngôn ngữ giáo dục) nhưng khắc phục hạn chế về khả năng mở rộng.  \n"
            + "- Tên gọi \"Python\": Lấy cảm hứng từ chương trình hài Monty Python's Flying Circus (Guido là fan của nhóm này).",
            "2. Phiên bản đầu tiên (1991)\n"
            + "- Python 0.9.0 ra mắt vào tháng 2/1991, tích hợp:  \n"
            + "  - Lập trình hướng đối tượng.  \n"
            + "  - Hệ thống module.  \n"
            + "  - Xử lý ngoại lệ.  \n"
            + "  - Cú pháp đơn giản với thụt lề (indentation) thay vì dấu ngoặc `{}`.  ",
            "3. Các mốc quan trọng\n"
            + "1994 - Python 1.0  \n"
            + "- Ra mắt lambda, map, filter, reduce.  \n"
            + "- Cộng đồng Python hình thành qua nhóm comp.lang.python.  \n"
            + "\n"
            + "2000 - Python 2.0  \n"
            + "- Bổ sung list comprehension, unicode support.  \n"
            + "- Giới thiệu cycle-detecting garbage collector (tự động dọn rác bộ nhớ).  \n"
            + "\n"
            + "2008 - Python 3.0 (Python 3000) \n"
            + "- Phá vỡ khả năng tương thích ngược để sửa các thiết kế cũ.  \n"
            + "- Thay đổi lớn:  \n"
            + "  - `print` trở thành hàm (`print()` thay vì `print \"\"`).  \n"
            + "  - Kiểu `unicode` mặc định (Python 2 dùng `str` và `unicode` riêng).  \n"
            + "  - Chia số nguyên (`/` trả về float, `//` trả về integer).  \n"
            + "\n"
            + "2020 - Python 2.7 \"End of Life\" \n"
            + "- Ngừng hỗ trợ Python 2, khuyến khích chuyển sang Python 3.  ",
            "4. Python hiện đại (2020 - nay)\n"
            + "- Python 3.9+: Cải tiến hiệu năng, cú pháp (vd: `dict union` với `|`).  \n"
            + "- Python 3.10 (2021): Thêm `match-case` (tương tự `switch`).  \n"
            + "- Python 3.11 (2022): Tăng tốc độ 50% so với 3.10.  ",
            "Tại sao Python thành công?\n"
            + "- Triết lý \"Zen of Python\":  \n"
            + "  ```python\n"
            + "  import this  # Try this in Python!\n"
            + "  ```\n"
            + "  - \"Đơn giản là tốt hơn phức tạp\" (**Simple is better than complex**).  \n"
            + "  - \"Dễ đọc quan trọng\" (**Readability counts**).  \n"
            + "\n"
            + "- Ứng dụng đa lĩnh vực:  \n"
            + "  - AI/ML: TensorFlow, PyTorch.  \n"
            + "  - Web: Django, Flask.  \n"
            + "  - Data Science: Pandas, NumPy.  \n"
            + "\n"
            + "- Cộng đồng mạnh: PyPI (kho thư viện khổng lồ), các hội nghị như PyCon.  ",
            "Sự thật thú vị\n"
            + "🔹 Logo Python: Hai con rắn màu xanh/vàng lấy cảm hứng từ rắn hổ mang và Monty Python.  \n"
            + "🔹 Python được dùng ở Google, NASA, Netflix.  \n"
            + "🔹 Guido van Rossum từng là \"Benevolent Dictator For Life\" (BDFL) của Python đến năm 2018.  ",
            "Tương lai của Python\n"
            + "- Python 3.12+: Tiếp tục tối ưu tốc độ.  \n"
            + "- WebAssembly: Chạy Python trên trình duyệt.  \n"
            + "- AI Integration: Hỗ trợ sâu hơn cho AI/ML.  "
        });

        Content_MAP.put("Lý do chọn Python", new String[]{
            "1. Phát triển Web (Backend) \n"
            + "Framework: Django, Flask, FastAPI.\n"
            + "Ví dụ: Xây dựng API, website thương mại điện tử.",
            "2. Khoa học dữ liệu & AI/ML \n"
            + "Thư viện: NumPy, Pandas, Matplotlib, TensorFlow, PyTorch.\n"
            + "Ứng dụng: Phân tích dữ liệu, dự đoán xu hướng, nhận diện hình ảnh.",
            "3. Tự động hóa (Automation) \n"
            + "Scripting: Tự động hóa tác vụ (backup, web scraping).\n"
            + "Ví dụ: Bot tự động gửi email, thu thập dữ liệu web.",
            "4. Phát triển Game \n"
            + "Thư viện: Pygame, Panda3D.\n"
            + "Ví dụ: Game 2D đơn giản.",
            "5. Lập trình IoT & Embedded Systems \n"
            + "Thư viện: MicroPython, CircuitPython.\n"
            + "Ví dụ: Điều khiển Raspberry Pi, Arduino.",
            "6. DevOps & Cloud Computing \n"
            + "Công cụ: Ansible, Docker, AWS SDK.\n"
            + "Ví dụ: Triển khai ứng dụng trên cloud.",
            "🚀 Dễ học: Phù hợp cho người mới bắt đầu.\n"
            + "💡 Linh hoạt: Ứng dụng từ web đến AI.\n"
            + "📊 Nhu cầu cao: Top ngôn ngữ lập trình phổ biến nhất (theo Stack Overflow, GitHub).\n"
            + "🌍 Cộng đồng mạnh: Nhiều tài nguyên miễn phí."
        });

        Content_MAP.put("Cấu trúc chương trình Python", new String[]{
            "✓ Shebang: Chỉ định trình thông dịch Python (quan trọng trên Linux/Mac)\n"
            + "✓ Encoding: Khai báo mã hóa ký tự (thường là UTF-8 cho tiếng Việt)",
            "✓ Nên viết đầy đủ thông tin theo chuẩn PEP 257\n"
            + "✓ Có thể thêm ví dụ sử dụng và hướng dẫn",
            "✓ Quy tắc:\n"
            + "\n"
            + "Import thư viện chuẩn trước\n"
            + "\n"
            + "Sau đó đến thư viện bên thứ ba\n"
            + "\n"
            + "Cuối cùng là thư viện tự viết\n"
            + "\n"
            + "Mỗi import trên 1 dòng (trừ cùng package)\n"
            + "\n"
            + "Sắp xếp theo thứ tự alphabet",
            "✓ Quy ước:\n"
            + "\n"
            + "Viết hoa toàn bộ với dấu gạch dưới\n"
            + "\n"
            + "Đặt ở đầu file sau phần import\n"
            + "\n"
            + "Có thể tách ra file config riêng cho dự án lớn",
            "✓ Thành phần class:\n"
            + "\n"
            + "Docstring mô tả\n"
            + "\n"
            + "Biến class (class variable)\n"
            + "\n"
            + "Hàm khởi tạo __init__\n"
            + "\n"
            + "Các phương thức (method)\n"
            + "\n"
            + "Phương thức tĩnh (@staticmethod)",
            "✓ Thành phần hàm:\n"
            + "\n"
            + "Docstring mô tả tham số và giá trị trả về\n"
            + "\n"
            + "Kiểm tra đầu vào\n"
            + "\n"
            + "Xử lý logic chính\n"
            + "\n"
            + "Xử lý ngoại lệ\n"
            + "\n"
            + "Giá trị trả về",
            "✓ Cấu trúc main:\n"
            + "\n"
            + "Tách logic chính vào hàm main()\n"
            + "\n"
            + "Xử lý ngoại lệ tổng thể\n"
            + "\n"
            + "Kiểm tra __name__ == \"__main__\"\n"
            + "\n"
            + "Thoát chương trình với mã lỗi khi cần",
            "PEP 8: Quy tắc coding style chuẩn\n"
            + "\n"
            + "Type Hints: Từ Python 3.5+",
            "Virtual Environment: Tách biệt môi trường cho mỗi dự án\n"
            + "\n"
            + "Logging: Thay thế print() bằng logging module\n"
            + "\n"
            + "Error Handling: Bắt cụ thể từng loại exception"
        });

        Content_MAP.put("Cài đặt môi trường và IDE", new String[]{
            "1. Kiểm tra Python đã được cài đặt chưa\n"
            + "Mở Terminal (Linux/macOS) hoặc Command Prompt (Windows) và nhập lệnh:\n"
            + "python --version\n"
            + "Nếu chưa có Python, bạn cần tải về và cài đặt.",
            "2. Cài đặt Python",
            "1. Cài đặt Python interpreter\n"
            + "Trên Windows\n"
            + "Truy cập python.org/downloads\n"
            + "\n"
            + "Tải bản mới nhất (khuyến nghị Python 3.11+)\n"
            + "\n"
            + "Chạy installer:\n"
            + "\n"
            + "Tick \"Add Python to PATH\"\n"
            + "\n"
            + "Chọn \"Customize installation\"\n"
            + "\n"
            + "Tick tất cả optional features\n"
            + "\n"
            + "Verify cài đặt:",
            "Trên macOS/Linux",
            "2. Thiết lập Virtual Environment\n"
            + "Tạo môi trường ảo để quản lý dependencies riêng cho từng dự án:",
            "Sau khi kích hoạt, prompt sẽ hiển thị tên môi trường:",
            "3. Cài đặt công cụ quản lý gói\n"
            + "Nâng cấp pip và cài đặt các công cụ cần thiết:",
            "4. Cấu hình IDE/Editor\n"
            + "Visual Studio Code (Khuyến nghị)\n"
            + "Cài extension:\n"
            + "\n"
            + "Python (Microsoft)\n"
            + "\n"
            + "Pylance\n"
            + "\n"
            + "Python Environment Manager\n"
            + "\n"
            + "Thiết lập Python interpreter:\n"
            + "\n"
            + "Ctrl+Shift+P > \"Python: Select Interpreter\"\n"
            + "\n"
            + "Chọn interpreter từ .venv bạn đã tạo\n"
            + "\n"
            + "PyCharm (Professional/Community)\n"
            + "Tạo new project\n"
            + "\n"
            + "Chọn \"New environment using Virtualenv\"\n"
            + "\n"
            + "Chỉ định location .venv\n"
            + "\n"
            + "5. Quản lý dependencies\n"
            + "Tạo file requirements.txt:",
            "Cài đặt packages:",
            "Xuất danh sách packages đã cài:",
            "6. Cấu hình nâng cao\n"
            + "pyenv (Quản lý nhiều phiên bản Python)",
            "poetry (Quản lý dependencies chuyên nghiệp)",
            "7. Kiểm tra hoàn chỉnh\n"
            + "Tạo file test.py:",
            "Chạy thử:",
            "Kết quả mong đợi:",
            "8. Các lệnh hữu ích khác\n"
            + "Lệnh	Mục đích\n"
            + "deactivate	Thoát khỏi virtualenv\n"
            + "python -m pip list	Xem các package đã cài\n"
            + "pip show package_name	Xem thông tin package\n"
            + "pip install --upgrade package	Nâng cấp package",
            "9. Xử lý sự cố thường gặp\n"
            + "Lỗi không nhận lệnh python/pip\n"
            + "\n"
            + "Windows: Thêm Python vào PATH trong Environment Variables\n"
            + "\n"
            + "macOS/Linux: Chạy alias python=python3 trong ~/.zshrc hoặc ~/.bashrc\n"
            + "\n"
            + "Lỗi permission",
            "Lỗi SSL khi cài package",
            //IDE
            "1. Visual Studio Code (VS Code) - IDE phổ biến nhất\n"
            + "Ưu điểm: Nhẹ, miễn phí, hỗ trợ đa ngôn ngữ, kho extension phong phú\n"
            + "\n"
            + "Cài đặt:\n"
            + "\n"
            + "Tải về từ code.visualstudio.com",
            "Cài các extension Python thiết yếu:\n"
            + "\n"
            + "Python (Microsoft)\n"
            + "\n"
            + "Pylance (Type checking)\n"
            + "\n"
            + "Python Environment Manager (Quản lý môi trường ảo)\n"
            + "\n"
            + "Jupyter (Để làm Data Science)",
            "Cấu hình:\n"
            + "\n"
            + "Mở Command Palette (Ctrl+Shift+P) > \"Python: Select Interpreter\"\n"
            + "\n"
            + "Chọn Python từ virtualenv\n"
            + "\n"
            + "Pro Tip: Dùng shortcut Ctrl+, để mở Settings, bật \"autoSave\": \"afterDelay\"",
            "2. PyCharm - IDE mạnh nhất cho Python\n"
            + "Phiên bản:\n"
            + "\n"
            + "Community (Miễn phí)\n"
            + "\n"
            + "Professional (Trả phí, hỗ trợ Django, Flask, Data Science)",
            "Cài đặt:",
            "Cấu hình ban đầu:\n"
            + "\n"
            + "Tạo mới project: Chọn interpreter từ virtualenv\n"
            + "\n"
            + "Bật Scientific Mode (View -> Scientific Mode) nếu làm Data Science\n"
            + "\n"
            + "Cài plugin Database Tools để làm việc với SQL",
            "3. Jupyter Notebook/JupyterLab - Cho Data Science\n"
            + "Cài đặt:",
            "Tính năng nổi bật:\n"
            + "\n"
            + "Chạy code theo ô (cell)\n"
            + "\n"
            + "Hỗ trợ Markdown và LaTeX\n"
            + "\n"
            + "Trực quan hóa dữ liệu ngay trong notebook",
            "4. Spyder - IDE cho khoa học dữ liệu\n"
            + "Cài đặt (có sẵn trong Anaconda):",
            "Giao diện đặc trưng:\n"
            + "\n"
            + "Variable Explorer xem biến trực quan\n"
            + "\n"
            + "IP Console tích hợp\n"
            + "\n"
            + "Hỗ trợ debug mạnh mẽ",
            "5. Sublime Text - Editor nhẹ\n"
            + "a. Cài đặt:\n"
            + "\n"
            + "Tải từ sublimetext.com\n"
            + "\n"
            + "b. Cài gói Python qua Package Control:\n"
            + "\n"
            + "Ctrl+Shift+P > \"Install Package\"\n"
            + "\n"
            + "Cài: Anaconda (auto-complete), Python PEP8 Autoformat",
            "So sánh các IDE",
            "IDE	Ưu điểm	Nhược điểm	Phù hợp\n"
            + "VS Code	Nhẹ, miễn phí, nhiều extension	Cần cấu hình thủ công	Mọi mục đích\n"
            + "PyCharm	Debug mạnh, tích hợp sẵn tools	Nặng, bản Pro trả phí	Dự án lớn\n"
            + "Jupyter	Trực quan hóa dữ liệu	Khó quản lý dự án phức tạp	Data Science\n"
            + "Spyder	Giao diện MATLAB-like	Ít hỗ trợ web development	Khoa học dữ liệu",
            "Cấu hình nâng cao cho VS Code\n"
            + "Thêm vào settings.json (mở bằng Ctrl+,):",
            "Lời khuyên chọn IDE\n"
            + "Web Development: VS Code + Django/Flask extension\n"
            + "\n"
            + "Data Science: JupyterLab + VS Code\n"
            + "\n"
            + "Machine Learning: PyCharm Professional\n"
            + "\n"
            + "Scripting đơn giản: Sublime Text/Vim",
            "Sau khi cài đặt, hãy tạo project đầu tiên với:"
        });

        Content_MAP.put("Biến", new String[]{
            "Hợp lệ	Không hợp lệ	Lý do\n"
            + "user_name	user-name	Không chứa dấu gạch ngang\n"
            + "_private_var	123variable	Không bắt đầu bằng số\n"
            + "MAX_VALUE	for	Trùng từ khóa Python\n"
            + "camelCase	first name	Chứa khoảng trắng",
            "Biến số (Numeric)",
            "Biến chuỗi (String)",
            "Biến sequence",
            "Biến ánh xạ (Mapping)",
            "Biến tập hợp (Set)",
            "Biến boolean",
            "Biến thường: lower_case_with_underscores\n"
            + "\n"
            + "Hằng số: UPPER_CASE_WITH_UNDERSCORES\n"
            + "\n"
            + "Private: _single_leading_underscore\n"
            + "\n"
            + "Strong Private: __double_leading_underscore",
            "Python tự động nhận diện kiểu:",
            "Kiểu dữ liệu	Ví dụ	Tính chất\n"
            + "Mutable	List, Dict, Set	Có thể thay đổi\n"
            + "Immutable	Int, Float, Tuple	Không thay đổi"
        });

        Content_MAP.put("Kiểu dữ liệu", new String[]{
            "int: Số nguyên (không giới hạn độ dài).",
            "float: Số thực (có dấu chấm động).",
            "complex: Số phức (phần thực + phần ảo j).",
            "Dùng để lưu trữ văn bản, được đặt trong ' ', \" \" hoặc ''' '''.\"",
            "Chỉ có hai giá trị: True hoặc False",
            "Mutable (có thể thay đổi), chứa các phần tử phân cách bằng dấu phẩy, đặt trong [ ]",
            "Immutable (không thể thay đổi), đặt trong ( )",
            "Không có thứ tự, không chứa phần tử trùng lặp, đặt trong { }.",
            "Lưu trữ dữ liệu dạng key: value, đặt trong { }",
            "Đại diện cho giá trị \"không có gì\".",
            "Dùng cho dữ liệu nhị phân.",
            "Class: Tạo kiểu dữ liệu mới từ lớp.",
            "Dùng hàm type() hoặc isinstance():"
        });

        Content_MAP.put("Toán tử", new String[]{
            "Dùng để thực hiện các phép toán ố học cơ bản:",
            "Toán tử	Ví dụ	Ý nghĩa	Kết quả ví dụ\n"
            + "+	5 + 3	Cộng	8\n"
            + "-	10 - 2	Trừ	8\n"
            + "*	4 * 3	Nhân	12\n"
            + "/	10 / 3	Chia thường (float)	3.333...\n"
            + "//	10 // 3	Chia lấy phần nguyên	3\n"
            + "%	10 % 3	Chia lấy phần dư	1\n"
            + "**	2 ** 3	Lũy thừa	8",
            "Dùng để so sánh hai giá trị, trả về True hoặc False:",
            "Toán tử	Ví dụ	Ý nghĩa	Kết quả ví dụ\n"
            + "==	5 == 5	Bằng nhau	True\n"
            + "!=	5 != 3	Khác nhau	True\n"
            + ">	10 > 7	Lớn hơn	True\n"
            + "<	3 < 2	Nhỏ hơn	False\n"
            + ">=	7 >= 7	Lớn hơn hoặc bằng	True\n"
            + "<=	5 <= 3	Nhỏ hơn hoặc bằng	False",
            "Dùng để gán giá trị cho biến:",
            "Toán tử	Ví dụ	Tương đương	Kết quả (nếu a=5)\n"
            + "=	a = 5	Gán giá trị	a = 5\n"
            + "+=	a += 2	a = a + 2	7\n"
            + "-=	a -= 3	a = a - 3	2\n"
            + "*=	a *= 4	a = a * 4	20\n"
            + "/=	a /= 2	a = a / 2	2.5\n"
            + "//=	a //= 2	a = a // 2	2\n"
            + "%=	a %= 2	a = a % 2	1\n"
            + "**=	a **= 3	a = a ** 3	125",
            "Dùng để kết hợp các điều kiện:",
            "Toán tử	Ví dụ	Ý nghĩa	Kết quả ví dụ\n"
            + "and	True and False	True nếu cả 2 đều True	False\n"
            + "or	True or False	True nếu ít nhất 1 True	True\n"
            + "not	not True	Đảo ngược giá trị boolean	False",
            "Thao tác trên bit (dùng cho số nguyên):",
            "Toán tử	Ví dụ	Ý nghĩa	Kết quả nhị phân\n"
            + "&	5 & 3	AND bit	0101 & 0011 = 0001 (1)\n"
            + "|	5 | 3	OR bit	0101	0011 = 0111 (7)\n"
            + "^	5 ^ 3	XOR bit	0101 ^ 0011 = 0110 (6)\n"
            + "~	~5	Đảo bit	~0101 = 1010 (-6)\n"
            + "<<	5 << 1	Dịch trái 1 bit	0101 → 1010 (10)\n"
            + ">>	5 >> 1	Dịch phải 1 bit	0101 → 0010 (2)",
            "Kiểm tra xem một giá trị có nằm trong một chuỗi (list, tuple, chuỗi, dict, set) không:",
            "Toán tử	Ví dụ	Ý nghĩa	Kết quả ví dụ\n"
            + "in	2 in [1, 2, 3]	Kiểm tra tồn tại	True\n"
            + "not in	5 not in [1, 2, 3]	Kiểm tra không tồn tại	True",
            "Kiểm tra xem hai biến có trỏ đến cùng một đối tượng không:",
            "Toán tử	Ví dụ	Ý nghĩa	Kết quả ví dụ\n"
            + "is	x is y (cùng object)	Kiểm tra cùng đối tượng	True/False\n"
            + "is not	x is not y	Kiểm tra khác đối tượng	True/False"
        });

        Content_MAP.put("Nhập xuất dữ liệu", new String[]{
            "1.1. Hàm print()\n"
            + "Dùng để in giá trị ra màn hình.\n"
            + "\n"
            + "Có thể in nhiều giá trị, phân cách bằng dấu phẩy (,).\n"
            + "\n"
            + "Ví dụ:",
            "1.2. Định dạng xuất\n"
            + "F-strings (Python 3.6+):",
            ".format():",
            "2.1. Hàm input()\n"
            + "Dùng để nhận dữ liệu từ người dùng qua bàn phím.\n"
            + "\n"
            + "Luôn trả về kiểu str, cần chuyển đổi nếu muốn dùng kiểu khác.\n"
            + "\n"
            + "Ví dụ:",
            "2.2. Xử lý nhập số\n"
            + "Luôn kiểm tra lỗi khi ép kiểu:",
            "3.1. Ghi dữ liệu vào file\n"
            + "Mở file bằng open() với mode 'w' (ghi đè) hoặc 'a' (ghi tiếp).",
            "3.2. Đọc dữ liệu từ file\n"
            + "Đọc toàn bộ file:",
            "Đọc từng dòng:"
        });

        Content_MAP.put("Cấu trúc điều kiện", new String[]{
            "Nội dung:\n"
            + "Dùng để kiểm tra một điều kiện duy nhất.\n"
            + "\n"
            + "Nếu điều kiện đúng (True), khối lệnh bên trong if sẽ được thực thi.\n"
            + "\n"
            + "Nếu sai (False), chương trình bỏ qua khối lệnh này.",
            "Cú pháp:",
            "Ví dụ:",
            "Kết quả:\n"
            + "Bạn đủ tuổi bầu cử (vì age >= 18 là True).",
            "Nội dung:\n"
            + "Mở rộng của if, thêm nhánh else để xử lý trường hợp điều kiện sai (False).\n"
            + "\n"
            + "Luôn có 1 trong 2 khối lệnh được thực thi.",
            "Cú pháp:",
            "Ví dụ:",
            "Kết quả:\n"
            + "Bạn chưa đủ tuổi! (vì tuoi >= 18 là False).",
            "Nội dung:\n"
            + "Kiểm tra nhiều điều kiện liên tiếp.\n"
            + "\n"
            + "elif (viết tắt của else if) có thể xuất hiện nhiều lần.\n"
            + "\n"
            + "Chỉ một khối lệnh đầu tiên thỏa mãn điều kiện được thực thi.",
            "Cú pháp:",
            "Ví dụ:",
            "Kết quả:\n"
            + "Khá (vì diem >= 80 là True đầu tiên).",
            "Nội dung:\n"
            + "Đặt if bên trong một if khác để kiểm tra điều kiện phức tạp.\n"
            + "\n"
            + "Mỗi cấp lồng nhau thụt lề thêm 1 level.",
            "Cú pháp:",
            "Ví dụ:",
            "Kết quả:",
            "Nội dung:\n"
            + "Viết gọn câu lệnh if-else trong một dòng.\n"
            + "\n"
            + "Phù hợp cho phép gán giá trị đơn giản.",
            "Cú pháp:",
            "Ví dụ:",
            "Nội dung:\n"
            + "and: Cả 2 điều kiện đều đúng.\n"
            + "\n"
            + "or: Ít nhất 1 điều kiện đúng.\n"
            + "\n"
            + "not: Phủ định điều kiện.",
            "Ví dụ:",
            "Nội dung:\n"
            + "Kiểm tra một biến có nằm trong tập giá trị cho trước không.\n"
            + "\n"
            + "Thay thế cho nhiều or.",
            "Ví dụ:",
            "Nội dung:\n"
            + "Xác định một biến có thuộc kiểu dữ liệu cụ thể không.",
            "Ví dụ:"
        });

        Content_MAP.put("Vòng lặp", new String[]{
            "Nội dung:\n"
            + "Dùng để lặp qua các phần tử của một đối tượng có thể lặp (iterable) như list, tuple, string, dictionary, set,...\n"
            + "\n"
            + "Thực hiện khối lệnh cho mỗi phần tử trong đối tượng\n"
            + "\n"
            + "Số lần lặp được xác định trước dựa trên số phần tử",
            "Cú pháp:",
            "Ví dụ:",
            "Nội dung:\n"
            + "Lặp lại khối lệnh khi điều kiện còn đúng (True)\n"
            + "\n"
            + "Số lần lặp không xác định trước\n"
            + "\n"
            + "Cần đảm bảo điều kiện sẽ sai tại một thời điểm để tránh vòng lặp vô hạn",
            "Cú pháp:",
            "Ví dụ:",
            "a. break\n"
            + "Dừng hoàn toàn vòng lặp\n"
            + "\n"
            + "Thoát khỏi vòng lặp ngay lập tức",
            "b. continue\n"
            + "Bỏ qua lần lặp hiện tại\n"
            + "\n"
            + "Chuyển ngay đến lần lặp tiếp theo",
            "c. else trong vòng lặp\n"
            + "Khối lệnh else được thực thi khi vòng lặp kết thúc bình thường (không bị break)",
            "Nội dung:\n"
            + "Đặt vòng lặp bên trong một vòng lặp khác\n"
            + "\n"
            + "Thường dùng để xử lý ma trận, bảng dữ liệu",
            "Ví dụ:",
            "Nội dung:\n"
            + "Lặp qua iterable đồng thời lấy cả chỉ số và giá trị\n"
            + "\n"
            + "Hữu ích khi cần biết vị trí của phần tử",
            "Ví dụ:",
            "Nội dung:\n"
            + "Lặp qua nhiều iterable cùng lúc\n"
            + "\n"
            + "Dừng khi iterable ngắn nhất kết thúc",
            "Ví dụ:",
            "Nội dung:\n"
            + "Cú pháp ngắn gọn để tạo list từ vòng lặp\n"
            + "\n"
            + "Kết hợp cả vòng lặp và điều kiện",
            "Ví dụ:"
        });

        Content_MAP.put("Danh sách", new String[]{
            "Nội dung:\n"
            + "List là tập hợp các phần tử có thứ tự, có thể thay đổi (mutable)\n"
            + "\n"
            + "Cho phép chứa các phần tử thuộc các kiểu dữ liệu khác nhau\n"
            + "\n"
            + "Được khai báo bằng cặp dấu ngoặc vuông []",
            "Ví dụ:",
            "Nội dung:\n"
            + "Truy cập phần tử bằng chỉ số (indexing)\n"
            + "\n"
            + "Chỉ số bắt đầu từ 0\n"
            + "\n"
            + "Chỉ số âm đếm từ cuối danh sách (-1 là phần tử cuối cùng)",
            "Ví dụ:",
            "Nội dung:\n"
            + "Lấy một phần danh sách bằng cú pháp [start:stop:step]\n"
            + "\n"
            + "start: vị trí bắt đầu (mặc định 0)\n"
            + "\n"
            + "stop: vị trí kết thúc (không bao gồm)\n"
            + "\n"
            + "step: bước nhảy (mặc định 1)",
            "Ví dụ:",
            "a. Thêm phần tử",
            "b. Xóa phần tử",
            "c. Các phương thức khác",
            "Nội dung:\n"
            + "Cú pháp ngắn gọn để tạo list mới từ list hiện có\n"
            + "\n"
            + "Kết hợp cả vòng lặp và điều kiện",
            "Ví dụ:"
        });

        Content_MAP.put("Tuple", new String[]{
            "Tuple là một trong những kiểu dữ liệu dãy (sequence) cơ bản của Python, tương tự như list nhưng có một số khác biệt quan trọng.",
            "Nội dung:\n"
            + "Tuple là một dãy các phần tử có thứ tự, không thể thay đổi (immutable)\n"
            + "\n"
            + "Được khai báo bằng cặp dấu ngoặc tròn ()\n"
            + "\n"
            + "Có thể chứa các phần tử thuộc các kiểu dữ liệu khác nhau\n"
            + "\n"
            + "Thường được sử dụng cho các dữ liệu không thay đổi",
            "Ví dụ:",
            "Nội dung:\n"
            + "Truy cập phần tử bằng chỉ số (indexing) giống list\n"
            + "\n"
            + "Chỉ số bắt đầu từ 0\n"
            + "\n"
            + "Chỉ số âm đếm từ cuối tuple (-1 là phần tử cuối cùng)",
            "Ví dụ:",
            "Nội dung:\n"
            + "Tương tự như list, sử dụng cú pháp [start:stop:step]\n"
            + "\n"
            + "Tạo ra một tuple mới từ tuple ban đầu",
            "Ví dụ:",
            "a. Đếm số lần xuất hiện (count())",
            "b. Tìm vị trí đầu tiên (index())",
            "Nội dung:\n"
            + "Gán các phần tử của tuple vào các biến riêng lẻ\n"
            + "\n"
            + "Số biến phải khớp với số phần tử",
            "Ví dụ:",
            "Nội dung:\n"
            + "Tuple có thể so sánh với nhau theo thứ tự từ điển\n"
            + "\n"
            + "So sánh lần lượt từng phần tử từ trái sang phải",
            "Ví dụ:",
            "Nội dung:\n"
            + "Hiệu suất tốt hơn list do immutable\n"
            + "\n"
            + "An toàn vì dữ liệu không thể thay đổi\n"
            + "\n"
            + "Có thể dùng làm key trong dictionary (khác với list)\n"
            + "\n"
            + "Thường dùng cho dữ liệu không đổi (ngày tháng, tọa độ...)",
            "Ví dụ:"
        });

        Content_MAP.put("Dictionary", new String[]{
            "Dictionary (từ điển) là một cấu trúc dữ liệu quan trọng trong Python, lưu trữ dữ liệu dưới dạng các cặp key-value.",
            "Nội dung:\n"
            + "Là tập hợp các cặp key-value không có thứ tự\n"
            + "\n"
            + "Key phải là immutable (số, chuỗi, tuple) và duy nhất\n"
            + "\n"
            + "Value có thể là bất kỳ kiểu dữ liệu nào\n"
            + "\n"
            + "Được khai báo bằng cặp dấu ngoặc nhọn {} hoặc hàm dict()",
            "Ví dụ:",
            "Nội dung:\n"
            + "Truy cập value thông qua key\n"
            + "\n"
            + "Có thể dùng get() để tránh lỗi khi key không tồn tại",
            "Ví dụ:",
            "Nội dung:\n"
            + "Thêm mới hoặc cập nhật value thông qua key\n"
            + "\n"
            + "Nếu key đã tồn tại → cập nhật value\n"
            + "\n"
            + "Nếu key chưa tồn tại → thêm mới",
            "Ví dụ:",
            "Nội dung:\n"
            + "pop(key): Xóa theo key và trả về value\n"
            + "\n"
            + "popitem(): Xóa cặp cuối cùng (Python 3.7+)\n"
            + "\n"
            + "del: Xóa bằng key\n"
            + "\n"
            + "clear(): Xóa toàn bộ",
            "Ví dụ:",
            "a. Lấy danh sách keys/values/items",
            "b. Kiểm tra key tồn tại",
            "c. Tạo dictionary mới từ keys",
            "Nội dung:\n"
            + "Có thể duyệt qua keys, values hoặc cả key-value",
            "Ví dụ:",
            "Nội dung:\n"
            + "Tạo dictionary một cách ngắn gọn\n"
            + "\n"
            + "Tương tự list comprehension",
            "Ví dụ:",
            "Nội dung:\n"
            + "Value có thể là một dictionary khác\n"
            + "\n"
            + "Hữu ích cho dữ liệu phức tạp",
            "Ví dụ:",
            "a. Đếm tần suất",
            "b. Lưu trữ cấu hình",
            "c. JSON data"
        });

        Content_MAP.put("OOP", new String[]{
            "OOP (Object-Oriented Programming) là phương pháp lập trình sử dụng các \"đối tượng\" để tổ chức code. Python hỗ trợ đầy đủ các tính chất của OOP.\n",
            "a. Class và Object\n"
            + "Class: Khuôn mẫu/mô tả trừu tượng cho các đối tượng\n"
            + "\n"
            + "Object: Thể hiện cụ thể của class",
            "b. Thuộc tính (Attributes)\n"
            + "Dữ liệu đặc trưng cho đối tượng",
            "c. Phương thức (Methods)\n"
            + "Hành vi của đối tượng",
            "a. Tính đóng gói (Encapsulation)\n"
            + "Che giấu thông tin nội bộ\n"
            + "\n"
            + "Chỉ expose những gì cần thiết",
            "b. Tính kế thừa (Inheritance)\n"
            + "Class con kế thừa từ class cha",
            "c. Tính đa hình (Polymorphism)\n"
            + "Cùng phương thức nhưng hành vi khác nhau",
            "d. Tính trừu tượng (Abstraction)\n"
            + "Ẩn đi chi tiết phức tạp",
            "a. Class method và Static method",
            "b. Property Decorators\n"
            + "Kiểm soát truy cập thuộc tính",
            "c. Magic/Dunder methods\n"
            + "Phương thức đặc biệt bắt đầu và kết thúc bằng __",
            "a. Kế thừa đa cấp",
            "b. Đa kế thừa",
            "a. Xây dựng hệ thống quản lý nhân viên",
            "b. Xây dựng hệ thống đặt hàng"
        });

        Content_MAP.put("Đọc/ghi file CSV", new String[]{
            "CSV (Comma-Separated Values) là định dạng file phổ biến để lưu trữ dữ liệu dạng bảng. Python cung cấp nhiều cách để làm việc với file CSV.",
            "a. Sử dụng module csv tích hợp",
            "b. Đọc vào dictionary",
            "c. Đọc bằng pandas (cho dữ liệu lớn)",
            "a. Ghi từ list",
            "b. Ghi từ dictionary",
            "c. Ghi bằng pandas",
            "a. File có dấu phân cách khác",
            "b. File có dấu ngoặc kép",
            "c. Xử lý encoding khác UTF-8",
            "a. Đọc file CSV lớn theo từng phần",
            "b. Ghi file CSV nén",
            "c. Đọc nhiều file CSV cùng lúc",
            "a. Xử lý lỗi encoding",
            "b. Xử lý dữ liệu bị thiếu",
            "c. Xử lý dữ liệu không hợp lệ",
            "Luôn chỉ định encoding: Thường dùng utf-8 hoặc utf-8-sig\n"
            + "\n"
            + "Sử dụng with statement: Đảm bảo file luôn được đóng đúng cách\n"
            + "\n"
            + "Xử lý header cẩn thận: Kiểm tra xem file có header hay không\n"
            + "\n"
            + "Kiểm tra dữ liệu thiếu: Xử lý các giá trị trống hoặc không hợp lệ\n"
            + "\n"
            + "Đối với dữ liệu lớn: Đọc từng phần hoặc sử dụng thư viện như pandas\n"
            + "\n"
            + "Ghi chú về định dạng: Lưu ý về dấu phân cách, kiểu dấu ngoặc kép"
        });

        Content_MAP.put("JSON", new String[]{
            "JSON (JavaScript Object Notation) là một định dạng dữ liệu nhẹ, dễ đọc và dễ viết cho cả con người và máy tính. Trong Python, JSON được hỗ trợ thông qua module json tích hợp sẵn.",
            "JSON có các kiểu dữ liệu cơ bản:\n"
            + "\n"
            + "Số (number)\n"
            + "\n"
            + "Chuỗi (string)\n"
            + "\n"
            + "Boolean (true/false)\n"
            + "\n"
            + "Mảng (array)\n"
            + "\n"
            + "Đối tượng (object)\n"
            + "\n"
            + "null",
            "Python và JSON có các kiểu tương đương:\n"
            + "\n"
            + "Python	JSON\n"
            + "dict	object\n"
            + "list, tuple	array\n"
            + "str	string\n"
            + "int, float	number\n"
            + "True	true\n"
            + "False	false\n"
            + "None	null",
            "a. json.dumps() - Chuyển Python object thành JSON string",
            "b. json.dump() - Ghi Python object vào file JSON",
            "c. json.loads() - Chuyển JSON string thành Python object",
            "d. json.load() - Đọc file JSON thành Python object",
            "a. Tuỳ chỉnh serialization với tham số default",
            "b. Tuỳ chỉnh deserialization với tham số object_hook",
            "a. JSONDecodeError",
            "b. TypeError khi serialization",
            "Ví dụ hoàn chỉnh"
        });

        Content_MAP.put("XML", new String[]{
            "XML (eXtensible Markup Language) là ngôn ngữ đánh dấu mở rộng được sử dụng rộng rãi để lưu trữ và trao đổi dữ liệu. Trong Python, có nhiều cách để làm việc với XML, phổ biến nhất là sử dụng module xml.etree.ElementTree.",
            "Một tài liệu XML bao gồm:\n"
            + "\n"
            + "Thẻ mở và thẻ đóng (<tag></tag>)\n"
            + "\n"
            + "Thuộc tính (<tag attribute=\"value\">)\n"
            + "\n"
            + "Nội dung văn bản\n"
            + "\n"
            + "Các phần tử lồng nhau",
            "Ví dụ:",
            "Python cung cấp nhiều module để làm việc với XML:\n"
            + "\n"
            + "xml.etree.ElementTree (đơn giản và hiệu quả)\n"
            + "\n"
            + "xml.dom (DOM API)\n"
            + "\n"
            + "xml.sax (SAX API)\n"
            + "\n"
            + "lxml (thư viện bên thứ ba mạnh mẽ)",
            "a. Tạo XML",
            "b. Đọc và phân tích XML",
            "c. Chỉnh sửa XML",
            "Cần cài đặt: pip install lxml"
        });

        Content_MAP.put("Try-except", new String[]{
            "try-except là cấu trúc xử lý ngoại lệ (exception handling) trong Python, cho phép chương trình bắt và xử lý các lỗi xảy ra trong quá trình thực thi mà không làm chương trình dừng đột ngột.",
            "try: Khối code cần kiểm tra lỗi\n"
            + "\n"
            + "except: Bắt và xử lý ngoại lệ\n"
            + "\n"
            + "else: Thực thi khi không có ngoại lệ\n"
            + "\n"
            + "finally: Luôn thực thi dù có lỗi hay không",
            "Exception: Lớp cơ sở cho tất cả ngoại lệ\n"
            + "\n"
            + "ValueError: Giá trị không hợp lệ\n"
            + "\n"
            + "TypeError: Kiểu dữ liệu không hợp lệ\n"
            + "\n"
            + "IndexError: Chỉ số nằm ngoài phạm vi\n"
            + "\n"
            + "KeyError: Khóa không tồn tại trong từ điển\n"
            + "\n"
            + "FileNotFoundError: Không tìm thấy file\n"
            + "\n"
            + "ZeroDivisionError: Chia cho 0",
            "Cụ thể trong việc bắt ngoại lệ: Bắt các ngoại lệ cụ thể thay vì dùng except Exception chung chung\n"
            + "\n"
            + "Không bỏ qua ngoại lệ: Tránh dùng except: pass vì sẽ che giấu lỗi\n"
            + "\n"
            + "Ghi log lỗi: Luôn ghi lại thông tin lỗi để debug\n"
            + "\n"
            + "Sử dụng finally cho dọn dẹp: Đóng file, kết nối database trong khối finally\n"
            + "\n"
            + "Tạo ngoại lệ tùy chỉnh: Khi cần xử lý các lỗi nghiệp vụ cụ thể"
        });

        Content_MAP.put("Finally", new String[]{
            "Khối finally trong Python được sử dụng cùng với try-except để định nghĩa một đoạn code sẽ luôn được thực thi, bất kể có ngoại lệ xảy ra hay không.",
            "Luôn được thực thi: Dù có lỗi hay không có lỗi\n"
            + "\n"
            + "Thứ tự thực thi:\n"
            + "\n"
            + "Thực thi sau khối try nếu không có ngoại lệ\n"
            + "\n"
            + "Thực thi sau khối except nếu có ngoại lệ\n"
            + "\n"
            + "Không ngăn chặn ngoại lệ: Nếu có ngoại lệ, finally vẫn chạy trước khi ngoại lệ được truyền ra ngoài\n"
            + "\n"
            + "Thường dùng cho dọn dẹp: Đóng file, đóng kết nối, giải phóng tài nguyên",
            "Đóng tài nguyên: File, kết nối mạng, kết nối database\n"
            + "\n"
            + "Ghi log: Ghi nhận trạng thái thực thi dù thành công hay thất bại\n"
            + "\n"
            + "Dọn dẹp bộ nhớ: Giải phóng tài nguyên hệ thống\n"
            + "\n"
            + "Đảm bảo tính toàn vẹn: Rollback transaction nếu cần\n"
            + "\n"
            + "Thực hiện thao tác cuối cùng: Dù chương trình có lỗi hay không",
            "Khối finally chạy ngay cả khi bạn dùng return, break hoặc continue trong khối try hoặc except\n"
            + "\n"
            + "Nếu có return trong cả finally và try, giá trị trong finally sẽ được trả về\n"
            + "\n"
            + "Ngoại lệ trong finally sẽ ghi đè ngoại lệ trong try hoặc except"
        });

        Content_MAP.put("Tạo ngoại lệ tùy chỉnh", new String[]{
            "Nội dung:\n"
            + "\n"
            + "Là các lớp kế thừa từ lớp Exception hoặc các ngoại lệ có sẵn\n"
            + "\n"
            + "Giúp phân loại lỗi nghiệp vụ cụ thể trong ứng dụng\n"
            + "\n"
            + "Cung cấp thông tin lỗi chi tiết hơn so với ngoại lệ tiêu chuẩn",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Định nghĩa lớp kế thừa từ Exception\n"
            + "\n"
            + "Có thể thêm thông báo lỗi mặc định",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Thêm các thuộc tính bổ sung cho lỗi\n"
            + "\n"
            + "Thuộc tính có thể được truy cập khi bắt lỗi",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Tạo hệ thống ngoại lệ phân cấp theo nghiệp vụ\n"
            + "\n"
            + "Giúp bắt lỗi ở nhiều mức độ chi tiết",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Thêm các phương thức xử lý tùy chỉnh\n"
            + "\n"
            + "Ví dụ: Ghi log, gửi thông báo...",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Tùy chỉnh cách hiển thị lỗi bằng __str__\n"
            + "\n"
            + "Thêm các phương thức magic khác nếu cần",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Sử dụng ngoại lệ tùy chỉnh trong khối try-except\n"
            + "\n"
            + "Kết hợp với khối finally để dọn dẹp tài nguyên",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Hỗ trợ thông báo lỗi bằng nhiều ngôn ngữ\n"
            + "\n"
            + "Tự động chọn ngôn ngữ phù hợp",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Đặt tên rõ ràng với hậu tố Error\n"
            + "\n"
            + "Kế thừa từ lớp ngoại lệ phù hợp nhất\n"
            + "\n"
            + "Cung cấp thông báo lỗi có ý nghĩa\n"
            + "\n"
            + "Ghi lại đầy đủ thông tin debug\n"
            + "\n"
            + "Tạo hệ thống phân cấp hợp lý\n"
            + "\n"
            + "Hạn chế sử dụng ngoại lệ tùy chỉnh khi không cần thiết",
            "Ví dụ tốt:",
            "Nội dung:\n"
            + "\n"
            + "Xác thực dữ liệu đầu vào\n"
            + "\n"
            + "Xử lý nghiệp vụ đặc thù\n"
            + "\n"
            + "Quản lý kết nối hệ thống\n"
            + "\n"
            + "API error handling",
            "Code mẫu:"
        });

        Content_MAP.put("Lập trình đa luồng", new String[]{
            "Nội dung:\n"
            + "Lập trình đa luồng là kỹ thuật cho phép thực thi nhiều luồng (thread) đồng thời trong cùng một tiến trình. Mỗi luồng là một đơn vị thực thi độc lập, chia sẻ cùng không gian bộ nhớ với luồng chính và các luồng khác.\n"
            + "\n"
            + "Ưu điểm:\n"
            + "\n"
            + "Tăng hiệu suất ứng dụng I/O bound\n"
            + "\n"
            + "Chia sẻ tài nguyên dễ dàng\n"
            + "\n"
            + "Tiết kiệm tài nguyên hơn so với đa tiến trình\n"
            + "\n"
            + "Nhược điểm:\n"
            + "\n"
            + "GIL (Global Interpreter Lock) trong Python hạn chế hiệu suất với CPU-bound tasks\n"
            + "\n"
            + "Phức tạp trong quản lý đồng bộ hóa",
            "Nội dung:\n"
            + "Module threading cung cấp các lớp và hàm để làm việc với luồng:\n"
            + "\n"
            + "Thread: Lớp đại diện cho một luồng thực thi\n"
            + "\n"
            + "Lock: Cơ chế đồng bộ hóa cơ bản\n"
            + "\n"
            + "Event, Condition, Semaphore: Các cơ chế đồng bộ nâng cao\n"
            + "\n"
            + "current_thread(): Lấy thông tin luồng hiện tại",
            "Nội dung:\n"
            + "Có 2 cách truyền tham số cho luồng:\n"
            + "\n"
            + "Qua args (tuple) và kwargs (dictionary)\n"
            + "\n"
            + "Kế thừa lớp Thread và override phương thức run()",
            "Nội dung:\n"
            + "Lock (khóa) ngăn chặn race condition bằng cách chỉ cho phép một luồng truy cập tài nguyên tại một thời điểm.\n"
            + "\n"
            + "Các phương thức chính:\n"
            + "\n"
            + "acquire(): Lấy khóa\n"
            + "\n"
            + "release(): Nhả khóa\n"
            + "\n"
            + "with statement: Cách sử dụng khóa an toàn",
            "Nội dung:\n"
            + "ThreadPoolExecutor từ module concurrent.futures quản lý pool các luồng, giúp:\n"
            + "\n"
            + "Tái sử dụng luồng\n"
            + "\n"
            + "Giới hạn số luồng đồng thời\n"
            + "\n"
            + "Nhận kết quả qua Future objects",
            "Nội dung:\n"
            + "Các cơ chế giao tiếp giữa luồng:\n"
            + "\n"
            + "Queue: Hàng đợi an toàn cho đa luồng\n"
            + "\n"
            + "Event: Tín hiệu giữa các luồng\n"
            + "\n"
            + "Condition: Đồng bộ hóa phức tạp",
            "Nội dung:\n"
            + "Daemon thread là luồng chạy ngầm, sẽ tự động kết thúc khi chương trình chính kết thúc.\n"
            + "\n"
            + "Đặc điểm:\n"
            + "\n"
            + "Đặt bằng thread.daemon = True trước khi start\n"
            + "\n"
            + "Thường dùng cho các tác vụ phụ trợ\n"
            + "\n"
            + "Không thể join() daemon thread",
            "Nội dung:\n"
            + "Dữ liệu thread-local là dữ liệu riêng biệt cho từng luồng, không chia sẻ giữa các luồng.\n"
            + "\n"
            + "Cách tạo:\n"
            + "\n"
            + "Sử dụng threading.local()\n"
            + "\n"
            + "Mỗi luồng có thể thêm thuộc tính động",
            "Nội dung:\n"
            + "Thread thực thi sau một khoảng thời gian định trước.\n"
            + "\n"
            + "Cách dùng:\n"
            + "\n"
            + "threading.Timer(interval, function)\n"
            + "\n"
            + "Hủy bằng timer.cancel()",
            "Nội dung:\n"
            + "Ví dụ hoàn chỉnh quản lý download đa luồng:\n"
            + "\n"
            + "Chia nhỏ file thành các phần\n"
            + "\n"
            + "Download đồng thời bằng nhiều luồng\n"
            + "\n"
            + "Gộp các phần khi hoàn thành",
            "Lập trình đa luồng trong Python phù hợp cho:\n"
            + "\n"
            + "Ứng dụng I/O bound (network, file, database)\n"
            + "\n"
            + "Giao diện người dùng cần đáp ứng\n"
            + "\n"
            + "Xử lý đồng thời nhiều tác vụ độc lập\n"
            + "\n"
            + "Hạn chế:\n"
            + "\n"
            + "Không hiệu quả cho CPU-bound do GIL\n"
            + "\n"
            + "Cần cẩn thận với race condition và deadlock\n"
            + "\n"
            + "Các thư viện thay thế cho CPU-bound:\n"
            + "\n"
            + "multiprocessing: Đa tiến trình\n"
            + "\n"
            + "asyncio: Lập trình bất đồng bộ\n"
            + "\n"
            + "joblib, dask: Xử lý song song nâng cao"
        });

        Content_MAP.put("Bất đồng bộ", new String[]{
            "Nội dung:\n"
            + "Lập trình bất đồng bộ là mô hình cho phép thực thi các tác vụ I/O mà không cần chờ đợi, giúp tăng hiệu suất ứng dụng. Khác với đa luồng:\n"
            + "\n"
            + "Chạy trên một luồng đơn\n"
            + "\n"
            + "Sử dụng cơ chế event loop\n"
            + "\n"
            + "Phù hợp cho I/O-bound operations (network, file, database)",
            "Nội dung:\n"
            + "\n"
            + "Coroutine: Hàm async định nghĩa bằng async def\n"
            + "\n"
            + "Event Loop: Quản lý thực thi các coroutine\n"
            + "\n"
            + "Future: Đại diện cho kết quả tính toán trong tương lai\n"
            + "\n"
            + "Task: Wrapper của coroutine, chạy trên event loop",
            "Nội dung:\n"
            + "\n"
            + "async def: Định nghĩa coroutine\n"
            + "\n"
            + "await: Tạm dừng coroutine cho đến khi operation hoàn thành\n"
            + "\n"
            + "Một coroutine phải được await hoặc chạy bằng event loop",
            "Nội dung:\n"
            + "asyncio.gather() cho phép chạy nhiều coroutine đồng thời và thu thập kết quả.",
            "Nội dung:\n"
            + "\n"
            + "wait_for: Đặt timeout cho coroutine\n"
            + "\n"
            + "cancel(): Hủy task đang chạy",
            "Nội dung:\n"
            + "Hàng đợi bất đồng bộ cho mô hình Producer-Consumer.",
            "Nội dung:\n"
            + "Các cơ chế đồng bộ hóa cho asyncio:\n"
            + "\n"
            + "Lock: Ngăn race condition\n"
            + "\n"
            + "Event: Thông báo giữa các coroutine\n"
            + "\n"
            + "Semaphore: Giới hạn đồng thời",
            "Nội dung:\n"
            + "Ví dụ thực tế với HTTP requests bất đồng bộ.",
            "Nội dung:\n"
            + "Chạy và quản lý subprocess bất đồng bộ.",
            "Nội dung:\n"
            + "Ví dụ hoàn chỉnh crawler website bất đồng bộ.",
            "Lập trình bất đồng bộ trong Python phù hợp cho:\n"
            + "\n"
            + "Ứng dụng I/O-bound (API calls, database, file operations)\n"
            + "\n"
            + "Web servers (FastAPI, aiohttp)\n"
            + "\n"
            + "Real-time applications (WebSocket, chat)\n"
            + "\n"
            + "High-performance network services\n"
            + "\n"
            + "Thư viện hỗ trợ:\n"
            + "\n"
            + "asyncio: Core library\n"
            + "\n"
            + "aiohttp: HTTP client/server\n"
            + "\n"
            + "aiomysql, asyncpg: Database async\n"
            + "\n"
            + "FastAPI: Web framework async\n"
            + "\n"
            + "Hạn chế:\n"
            + "\n"
            + "Không phù hợp CPU-bound tasks\n"
            + "\n"
            + "Learning curve cao hơn synchronous code\n"
            + "\n"
            + "Debug phức tạp hơn"
        });

        Content_MAP.put("Requests", new String[]{
            "Nội dung:\n"
            + "Requests là thư viện HTTP phổ biến nhất Python, cung cấp cách đơn giản để gửi HTTP requests. Ưu điểm:\n"
            + "\n"
            + "API đơn giản, dễ sử dụng\n"
            + "\n"
            + "Hỗ trợ đầy đủ HTTP methods (GET, POST, PUT, DELETE,...)\n"
            + "\n"
            + "Xử lý tự động encoding/decoding\n"
            + "\n"
            + "Hỗ trợ session, cookie, proxy, SSL",
            "Nội dung:\n"
            + "Requests hỗ trợ đầy đủ các phương thức HTTP:\n"
            + "\n"
            + "GET: Lấy dữ liệu\n"
            + "\n"
            + "POST: Tạo mới dữ liệu\n"
            + "\n"
            + "PUT: Cập nhật toàn bộ\n"
            + "\n"
            + "PATCH: Cập nhật một phần\n"
            + "\n"
            + "DELETE: Xóa dữ liệu",
            "Nội dung:\n"
            + "\n"
            + "Thêm tham số vào URL với params\n"
            + "\n"
            + "Tự động encode URL\n"
            + "\n"
            + "Hỗ trợ dictionary hoặc list of tuples",
            "Nội dung:\n"
            + "\n"
            + "Thêm headers tùy chỉnh cho request\n"
            + "\n"
            + "Thường dùng cho authentication, content-type\n"
            + "\n"
            + "Có thể ghi đè headers mặc định",
            "Nội dung:\n"
            + "Gửi dữ liệu trong request body với:\n"
            + "\n"
            + "data: Cho form-encoded\n"
            + "\n"
            + "json: Cho JSON data\n"
            + "\n"
            + "files: Cho upload file",
            "Nội dung:\n"
            + "Các cách xử lý response:\n"
            + "\n"
            + "response.text: Nội dung dạng string\n"
            + "\n"
            + "response.json(): Parse JSON\n"
            + "\n"
            + "response.content: Binary content\n"
            + "\n"
            + "response.status_code: HTTP status code\n"
            + "\n"
            + "response.headers: Response headers",
            "Nội dung:\n"
            + "\n"
            + "timeout: Giới hạn thời gian chờ response\n"
            + "\n"
            + "Xử lý các exception phổ biến:\n"
            + "\n"
            + "requests.exceptions.RequestException: Base exception\n"
            + "\n"
            + "ConnectionError: Lỗi kết nối\n"
            + "\n"
            + "Timeout: Request timeout\n"
            + "\n"
            + "HTTPError: HTTP error (4xx, 5xx)",
            "Nội dung:\n"
            + "Session cho phép duy trì các tham số qua nhiều request:\n"
            + "\n"
            + "Giữ cookies giữa các request\n"
            + "\n"
            + "Tối ưu performance với TCP connection pooling\n"
            + "\n"
            + "Áp dụng settings mặc định cho mọi request",
            "Nội dung:\n"
            + "Requests hỗ trợ nhiều phương thức xác thực:\n"
            + "\n"
            + "Basic Auth\n"
            + "\n"
            + "Digest Auth\n"
            + "\n"
            + "OAuth\n"
            + "\n"
            + "Custom Auth",
            "Nội dung:\n"
            + "\n"
            + "Cấu hình proxy cho request\n"
            + "\n"
            + "Tùy chỉnh SSL verification\n"
            + "\n"
            + "Tự động giải quyết redirects",
            "Nội dung:\n"
            + "Tải file lớn theo từng chunk để tiết kiệm bộ nhớ:\n"
            + "\n"
            + "Sử dụng iter_content()\n"
            + "\n"
            + "Kiểm soát kích thước chunk\n"
            + "\n"
            + "Hiển thị tiến trình download",
            "Nội dung:\n"
            + "Xây dựng client cho REST API với requests:",
            "Thư viện Requests là công cụ mạnh mẽ để:\n"
            + "\n"
            + "Tương tác với REST APIs\n"
            + "\n"
            + "Thu thập dữ liệu web (web scraping)\n"
            + "\n"
            + "Tự động hóa các tác vụ HTTP\n"
            + "\n"
            + "Xây dựng ứng dụng tích hợp dịch vụ web\n"
            + "\n"
            + "Các thư viện liên quan:\n"
            + "\n"
            + "requests-oauthlib: Hỗ trợ OAuth\n"
            + "\n"
            + "requests-toolbelt: Công cụ mở rộng\n"
            + "\n"
            + "requests-cache: Cache requests\n"
            + "\n"
            + "aiohttp: Phiên bản async (cho Python async)\n"
            + ""
        });

        Content_MAP.put("BeautifulSoup", new String[]{
            "Nội dung:\n"
            + "BeautifulSoup là thư viện Python dùng để parse (phân tích cú pháp) và trích xuất dữ liệu từ HTML/XML. Nó tạo cây phân tích cú pháp từ tài liệu HTML/XML, cho phép bạn dễ dàng truy vấn và thao tác với nội dung.\n"
            + "\n"
            + "Ưu điểm:\n"
            + "\n"
            + "Hỗ trợ nhiều parser (html.parser, lxml, html5lib)\n"
            + "\n"
            + "API đơn giản, dễ sử dụng\n"
            + "\n"
            + "Xử lý HTML/XML bị hỏng tốt\n"
            + "\n"
            + "Tích hợp tốt với requests",
            "Nội dung:\n"
            + "Các parser phổ biến:\n"
            + "\n"
            + "html.parser: Parser mặc định của Python (không cần cài thêm)\n"
            + "\n"
            + "lxml: Nhanh, cần cài đặt (pip install lxml)\n"
            + "\n"
            + "html5lib: Xử lý HTML5 tốt, chậm hơn (pip install html5lib)",
            "Nội dung:\n"
            + "BeautifulSoup có 4 đối tượng chính:\n"
            + "\n"
            + "Tag: Đại diện cho thẻ HTML/XML\n"
            + "\n"
            + "NavigableString: Văn bản bên trong thẻ\n"
            + "\n"
            + "BeautifulSoup: Đại diện toàn bộ tài liệu\n"
            + "\n"
            + "Comment: Phần chú thích trong HTML",
            "Nội dung:\n"
            + "Các phương thức tìm kiếm cơ bản:\n"
            + "\n"
            + "find(): Tìm một phần tử\n"
            + "\n"
            + "find_all(): Tìm tất cả phần tử phù hợp\n"
            + "\n"
            + "select(): Tìm bằng CSS selector\n"
            + "\n"
            + "Truy cập trực tiếp qua tên thẻ (soup.tag)",
            "Nội dung:\n"
            + "Cách truy cập:\n"
            + "\n"
            + "Thuộc tính: tag['attribute'] hoặc tag.attrs\n"
            + "\n"
            + "Nội dung văn bản: tag.text hoặc tag.get_text()\n"
            + "\n"
            + "Nội dung gốc: tag.string hoặc tag.strings",
            "Nội dung:\n"
            + "Các phương thức duyệt cây:\n"
            + "\n"
            + "parent: Phần tử cha\n"
            + "\n"
            + "parents: Các phần tử cha theo thứ tự từ gần đến xa\n"
            + "\n"
            + "children: Các phần tử con trực tiếp\n"
            + "\n"
            + "descendants: Tất cả phần tử con (đệ quy)\n"
            + "\n"
            + "next_sibling/previous_sibling: Phần tử cùng cấp\n"
            + "\n"
            + "next_element/previous_element: Phần tử tiếp theo trong tài liệu",
            "Nội dung:\n"
            + "Có thể thay đổi cấu trúc HTML:\n"
            + "\n"
            + "Thêm/thay đổi thuộc tính\n"
            + "\n"
            + "Thay đổi nội dung\n"
            + "\n"
            + "Thêm thẻ mới\n"
            + "\n"
            + "Xóa thẻ",
            "Nội dung:\n"
            + "Có thể lọc kết quả bằng:\n"
            + "\n"
            + "Hàm\n"
            + "\n"
            + "Regular expression\n"
            + "\n"
            + "List giá trị\n"
            + "\n"
            + "Thuộc tính",
            "Nội dung:\n"
            + "Sau khi trích xuất dữ liệu, có thể:\n"
            + "\n"
            + "Làm sạch văn bản (loại bỏ khoảng trắng, ký tự đặc biệt)\n"
            + "\n"
            + "Chuyển đổi định dạng\n"
            + "\n"
            + "Lưu vào cấu trúc dữ liệu Python\n"
            + "\n"
            + "Xuất ra file (CSV, JSON, database)",
            "Nội dung:\n"
            + "Xây dựng web scraper hoàn chỉnh với BeautifulSoup và requests:",
            "Nội dung:\n"
            + "Các vấn đề thường gặp và giải pháp:\n"
            + "\n"
            + "Xử lý JavaScript-rendered content (dùng Selenium hoặc Playwright)\n"
            + "\n"
            + "Tránh bị chặn (thay đổi User-Agent, dùng proxy, giới hạn request rate)\n"
            + "\n"
            + "Xử lý HTML không hợp lệ (dùng html5lib)\n"
            + "\n"
            + "Xử lý encoding (chỉ định encoding khi tạo BeautifulSoup object)",
            "BeautifulSoup là công cụ mạnh mẽ cho:\n"
            + "\n"
            + "Web scraping\n"
            + "\n"
            + "Data extraction từ HTML/XML\n"
            + "\n"
            + "Web automation\n"
            + "\n"
            + "Testing web applications\n"
            + "\n"
            + "Kết hợp với các thư viện khác:\n"
            + "\n"
            + "requests: Lấy nội dung web\n"
            + "\n"
            + "lxml: Parser nhanh hơn\n"
            + "\n"
            + "pandas: Xử lý dữ liệu dạng bảng\n"
            + "\n"
            + "selenium: Xử lý trang web động\n"
            + "\n"
            + "Lưu ý khi sử dụng:\n"
            + "\n"
            + "Tuân thủ robots.txt và điều khoản sử dụng website\n"
            + "\n"
            + "Không gửi quá nhiều request trong thời gian ngắn\n"
            + "\n"
            + "Xử lý ngoại lệ khi kết nối hoặc parse dữ liệu"
        });

        Content_MAP.put("Selenium", new String[]{
            "Nội dung:\n"
            + "Selenium là bộ công cụ tự động hóa trình duyệt mạnh mẽ, thường dùng để:\n"
            + "\n"
            + "Kiểm thử tự động web application (Automated Testing)\n"
            + "\n"
            + "Thu thập dữ liệu từ website (Web Scraping)\n"
            + "\n"
            + "Tự động hóa các thao tác trình duyệt",
            "Nội dung:\n"
            + "Cần cài đặt:\n"
            + "\n"
            + "Thư viện Selenium: pip install selenium\n"
            + "\n"
            + "WebDriver tương ứng trình duyệt (ChromeDriver, GeckoDriver,...)\n"
            + "\n"
            + "Cấu hình PATH hoặc chỉ định đường dẫn đến WebDriver",
            "Nội dung:\n"
            + "Các thao tác cơ bản với trình duyệt:\n"
            + "\n"
            + "Mở trang web: get()\n"
            + "\n"
            + "Điều hướng: back(), forward(), refresh()\n"
            + "\n"
            + "Quản lý cửa sổ và tab\n"
            + "\n"
            + "Chụp màn hình",
            "Nội dung:\n"
            + "Các phương pháp định vị phần tử:\n"
            + "\n"
            + "find_element(By.ID, \"id\")\n"
            + "\n"
            + "find_element(By.NAME, \"name\")\n"
            + "\n"
            + "find_element(By.XPATH, \"xpath\")\n"
            + "\n"
            + "find_element(By.CSS_SELECTOR, \"css\")\n"
            + "\n"
            + "find_element(By.LINK_TEXT, \"text\")",
            "Nội dung:\n"
            + "Các thao tác với phần tử web:\n"
            + "\n"
            + "Nhập văn bản: send_keys()\n"
            + "\n"
            + "Click: click()\n"
            + "\n"
            + "Xóa nội dung: clear()\n"
            + "\n"
            + "Lấy thông tin: text, get_attribute()",
            "Nội dung:\n"
            + "Xử lý các phần tử đặc biệt:\n"
            + "\n"
            + "Dropdown/Select: Sử dụng Select class\n"
            + "\n"
            + "Iframe: Chuyển đổi ngữ cảnh với switch_to.frame()",
            "Nội dung:\n"
            + "Xử lý tải trang không đồng bộ:\n"
            + "\n"
            + "Implicit Wait: Chờ ngầm định\n"
            + "\n"
            + "Explicit Wait: Chờ cụ thể cho phần tử\n"
            + "\n"
            + "Expected Conditions: Điều kiện chờ",
            "Nội dung:\n"
            + "Quản lý nhiều cửa sổ/tab trình duyệt:\n"
            + "\n"
            + "Chuyển đổi giữa các cửa sổ\n"
            + "\n"
            + "Đóng cửa sổ/tab\n"
            + "\n"
            + "Lấy danh sách cửa sổ",
            "Nội dung:\n"
            + "Làm việc với dữ liệu trình duyệt:\n"
            + "\n"
            + "Thêm/xóa/get cookies\n"
            + "\n"
            + "Truy cập Local Storage, Session Storage",
            "Nội dung:\n"
            + "Thực thi JavaScript trong trình duyệt:\n"
            + "\n"
            + "execute_script(): Chạy JS code\n"
            + "\n"
            + "execute_async_script(): Chạy JS bất đồng bộ\n"
            + "\n"
            + "Scroll trang, thay đổi thuộc tính,...",
            "Nội dung:\n"
            + "Thực hiện chuỗi hành động phức tạp:\n"
            + "\n"
            + "Di chuyển chuột\n"
            + "\n"
            + "Kéo thả (Drag and Drop)\n"
            + "\n"
            + "Nhấn giữ, nhả phím\n"
            + "\n"
            + "Context click (right click)",
            "Nội dung:\n"
            + "Chạy trình duyệt ẩn (không hiển thị GUI):\n"
            + "\n"
            + "Tiết kiệm tài nguyên\n"
            + "\n"
            + "Chạy trên server không có GUI\n"
            + "\n"
            + "Tùy chỉnh User-Agent",
            "Nội dung:\n"
            + "Tự động hóa quy trình đăng nhập website:",
            "Nội dung:\n"
            + "Web scraping với Selenium:",
            "Selenium trong Python là công cụ mạnh mẽ cho:\n"
            + "\n"
            + "Kiểm thử tự động web application\n"
            + "\n"
            + "Thu thập dữ liệu từ website động (sử dụng JavaScript)\n"
            + "\n"
            + "Tự động hóa các tác vụ trình duyệt\n"
            + "\n"
            + "Tạo bot tương tác với web\n"
            + "\n"
            + "Các thư viện liên quan:\n"
            + "\n"
            + "BeautifulSoup: Phân tích HTML (kết hợp với Selenium)\n"
            + "\n"
            + "pytest: Viết test case với Selenium\n"
            + "\n"
            + "selenium-wire: Chặn và kiểm tra network requests\n"
            + "\n"
            + "webdriver-manager: Tự động quản lý WebDriver\n"
            + ""
        });

        Content_MAP.put("SQLite", new String[]{
            "SQLite là một hệ quản trị cơ sở dữ liệu quan hệ nhúng (embedded SQL database engine) được tích hợp sẵn trong Python thông qua module sqlite3.",
            "SQLite là một thư viện C cung cấp cơ sở dữ liệu SQL nhẹ, không cần máy chủ, không cần cấu hình và lưu trữ toàn bộ cơ sở dữ liệu trong một file duy nhất.",
            "Đặc điểm chính:\n"
            + "\n"
            + "Không cần cài đặt server riêng\n"
            + "\n"
            + "Toàn bộ DB trong một file\n"
            + "\n"
            + "Hỗ trợ hầu hết các tính năng SQL chuẩn\n"
            + "\n"
            + "Phù hợp cho ứng dụng nhỏ đến trung bình",
            "SQLite hỗ trợ 5 kiểu dữ liệu chính:\n"
            + "\n"
            + "NULL\n"
            + "\n"
            + "INTEGER\n"
            + "\n"
            + "REAL (số thực)\n"
            + "\n"
            + "TEXT\n"
            + "\n"
            + "BLOB (binary data)"
        });

        Content_MAP.put("MySQL", new String[]{
            "MySQL là một hệ thống quản lý cơ sở dữ liệu quan hệ (RDBMS) sử dụng ngôn ngữ SQL để thao tác dữ liệu. Python cung cấp nhiều thư viện để kết nối và làm việc với MySQL, giúp thực hiện các truy vấn như:\n"
            + "\n"
            + "Tạo, sửa, xóa bảng (CREATE, ALTER, DROP)\n"
            + "\n"
            + "Thêm, sửa, xóa dữ liệu (INSERT, UPDATE, DELETE)\n"
            + "\n"
            + "Truy vấn dữ liệu (SELECT)\n"
            + "\n"
            + "Quản lý giao dịch (Transaction)\n"
            + "\n"
            + "Xử lý lỗi và kết nối an toàn",
            "Trước khi làm việc với MySQL trong Python, bạn cần cài đặt thư viện hỗ trợ. Hai thư viện phổ biến nhất là:\n"
            + "\n"
            + "mysql-connector-python (chính thức từ MySQL)\n"
            + "\n"
            + "PyMySQL (thư viện thuần Python)",
            "Cài đặt bằng pip",
            "Để làm việc với MySQL, trước tiên cần thiết lập kết nối đến database.\n"
            + "\n"
            + "Code mẫu: Kết nối MySQL",
            "Giải thích:\n"
            + "mysql.connector.connect(): Tạo kết nối đến MySQL.\n"
            + "\n"
            + "cursor(): Tạo đối tượng để thực thi truy vấn SQL.\n"
            + "\n"
            + "conn.close(): Đóng kết nối để giải phóng tài nguyên.",
            "Sau khi kết nối, bạn có thể tạo bảng để lưu trữ dữ liệu.",
            "Giải thích:\n"
            + "CREATE TABLE IF NOT EXISTS: Tạo bảng nếu chưa tồn tại.\n"
            + "\n"
            + "AUTO_INCREMENT: Tự động tăng ID.\n"
            + "\n"
            + "UNIQUE: Email phải là duy nhất.\n"
            + "\n"
            + "DEFAULT CURRENT_TIMESTAMP: Tự động ghi thời gian tạo bản ghi.",
            "Sau khi có bảng, bạn có thể thêm dữ liệu vào.\n"
            + "\n"
            + "Code mẫu: Thêm 1 bản ghi",
            "Giải thích:\n"
            + "cursor.execute(query, params): Thực thi truy vấn với tham số.\n"
            + "\n"
            + "conn.commit(): Lưu thay đổi vào database.\n"
            + "\n"
            + "conn.rollback(): Hoàn tác nếu có lỗi.",
            "Bạn có thể lấy dữ liệu từ bảng bằng SELECT.\n"
            + "\n"
            + "Code mẫu: Lấy tất cả khách hàng",
            "Giải thích:\n"
            + "cursor.fetchall(): Lấy tất cả kết quả.\n"
            + "\n"
            + "dictionary=True: Trả về dạng dict thay vì tuple.",
            "Để sửa dữ liệu, dùng UPDATE.\n"
            + "\n"
            + "Code mẫu: Cập nhật email khách hàng",
            "Để xóa bản ghi, dùng DELETE.\n"
            + "\n"
            + "Code mẫu: Xóa khách hàng theo ID",
            "MySQL + Python giúp quản lý dữ liệu hiệu quả.\n"
            + "\n"
            + "Luôn đóng kết nối sau khi sử dụng.\n"
            + "\n"
            + "Sử dụng try-except để xử lý lỗi.\n"
            + "\n"
            + "commit() để lưu thay đổi, rollback() để hoàn tác khi có lỗi."
        });

        Content_MAP.put("PostgreSQL", new String[]{
            "Nội dung:\n"
            + "Trước khi làm việc với PostgreSQL trong Python, bạn cần cài đặt thư viện psycopg2 và thiết lập kết nối đến cơ sở dữ liệu.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Tạo bảng với các trường dữ liệu và ràng buộc như PRIMARY KEY, FOREIGN KEY, NOT NULL, UNIQUE.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Các thao tác Create (thêm), Read (đọc), Update (cập nhật), Delete (xóa) dữ liệu.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Quản lý giao dịch để đảm bảo tính toàn vẹn dữ liệu, có thể rollback nếu có lỗi.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Thực hiện các truy vấn phức tạp kết hợp nhiều bảng với JOIN.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Sử dụng SQLAlchemy - một ORM (Object-Relational Mapping) mạnh mẽ để tương tác với PostgreSQL.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Tạo index để cải thiện hiệu suất truy vấn và các kỹ thuật tối ưu khác.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Tạo và gọi stored procedures và functions trong PostgreSQL từ Python.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Triển khai tìm kiếm full-text trong PostgreSQL từ Python.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Sử dụng connection pool để quản lý kết nối hiệu quả trong ứng dụng web.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Lưu trữ và truy vấn dữ liệu JSON trong PostgreSQL từ Python.",
            "Code mẫu:"
        });

        Content_MAP.put("ORM với SQLAlchemy", new String[]{
            "ORM (Object-Relational Mapping) là kỹ thuật ánh xạ các đối tượng trong lập trình hướng đối tượng sang các bảng trong cơ sở dữ liệu quan hệ. SQLAlchemy cung cấp:\n"
            + "\n"
            + "Công cụ ORM mạnh mẽ\n"
            + "\n"
            + "SQL Expression Language\n"
            + "\n"
            + "Kết nối database\n"
            + "\n"
            + "Hỗ trợ nhiều hệ quản trị CSDL",
            "SQLAlchemy hỗ trợ nhiều loại database như PostgreSQL, MySQL, SQLite, Oracle, MS-SQL...",
            "Sử dụng Declarative Base để định nghĩa các lớp model tương ứng với bảng trong database.",
            "Session là giao diện để tương tác với database.",
            "Tạo session",
            "Thêm dữ liệu (Create)",
            "Truy vấn dữ liệu (Read)",
            "Cập nhật dữ liệu (Update)",
            "Xóa dữ liệu (Delete)",
            "SQLAlchemy hỗ trợ các loại quan hệ: one-to-many, many-to-one, many-to-many, one-to-one.",
            "Quan hệ One-to-Many",
            "Sử dụng quan hệ",
            "Join các bảng",
            "Lọc dữ liệu phức tạp",
            "Phân trang",
            "SQLAlchemy hỗ trợ transaction để đảm bảo tính toàn vẹn dữ liệu.",
            "Bên cạnh ORM, SQLAlchemy cung cấp SQL Expression Language để viết truy vấn SQL một cách Pythonic.",
            "SQLAlchemy 2.0 hỗ trợ async/await với asyncio.",
            "Alembic là công cụ quản lý phiên bản database đi kèm với SQLAlchemy.",
            "Hybrid Attributes: Thuộc tính hoạt động cả ở Python và SQL\n"
            + "\n"
            + "Association Proxy: Tạo proxy cho quan hệ phức tạp\n"
            + "\n"
            + "Event Listening: Lắng nghe sự kiện thay đổi\n"
            + "\n"
            + "Multiple Databases: Làm việc với nhiều database cùng lúc\n"
            + "\n"
            + "Horizontal Sharding: Phân tán dữ liệu ngang"
        });

        Content_MAP.put("Pandas", new String[]{
            "Trước khi sử dụng, cần cài đặt Pandas bằng pip:",
            "2.1. Series\n"
            + "Series là một mảng 1 chiều chứa dữ liệu cùng kiểu, có nhãn (label) gọi là index.\n"
            + "\n"
            + "Ví dụ:",
            "Output:",
            "2.2. DataFrame\n"
            + "DataFrame là cấu trúc dữ liệu 2 chiều (giống bảng Excel hoặc SQL).\n"
            + "\n"
            + "Ví dụ:",
            "Output:",
            "3.1. Đọc dữ liệu từ CSV",
            "3.2. Ghi dữ liệu vào CSV",
            "3.3. Đọc dữ liệu từ Excel",
            "3.4. Ghi dữ liệu vào Excel",
            "4.1. Xem thông tin cơ bản",
            "4.2. Truy cập dữ liệu",
            "4.3. Thêm/Xóa cột",
            "4.4. Sắp xếp dữ liệu",
            "4.5. Xử lý giá trị thiếu (NaN)",
            "5.1. Nhóm dữ liệu (GroupBy)",
            "5.2. Tính toán thống kê",
            "6.1. Nối DataFrame (Concatenate)",
            "6.2. Ghép DataFrame (Merge)",
            "Pandas là công cụ cực kỳ mạnh mẽ để xử lý dữ liệu trong Python. Với các chức năng như:\n"
            + "\n"
            + "Đọc/ghi dữ liệu từ CSV, Excel, SQL.\n"
            + "\n"
            + "Lọc, sắp xếp, nhóm dữ liệu.\n"
            + "\n"
            + "Xử lý giá trị thiếu, thống kê.\n"
            + "\n"
            + "Kết hợp nhiều DataFrame.\n"
            + "\n"
            + "Hỗ trợ thời gian và vẽ biểu đồ."
        });

        Content_MAP.put("Numpy", new String[]{
            "NumPy (Numerical Python) là một thư viện cốt lõi trong Python dùng để xử lý các phép tính số học, đặc biệt là các mảng đa chiều (arrays) và ma trận (matrices). NumPy cung cấp các hàm toán học mạnh mẽ, giúp tối ưu hiệu suất tính toán so với Python thuần.",
            "Trước khi sử dụng, bạn cần cài đặt NumPy bằng pip:",
            "Sau đó import vào chương trình:",
            "NumPy làm việc chủ yếu với đối tượng ndarray (N-dimensional array).",
            "2.1. Tạo mảng từ danh sách Python",
            "2.2. Tạo mảng với các giá trị đặc biệt",
            "Các thuộc tính quan trọng của mảng NumPy:",
            "4.1. Truy cập phần tử",
            "4.2. Thay đổi giá trị",
            "5.1. Phép toán số học",
            "5.2. Phép toán ma trận",
            "NumPy tự động mở rộng mảng nhỏ để phù hợp với phép toán:",
            "7.1. Thay đổi kích thước mảng (Reshape)",
            "7.2. Chuyển vị ma trận (Transpose)",
            "10.1. Lưu mảng vào file",
            "10.2. Đọc mảng từ file",
            "NumPy là thư viện quan trọng trong Khoa học dữ liệu, Machine Learning, và Tính toán số. Nó giúp xử lý dữ liệu nhanh hơn Python thuần nhờ tối ưu hóa bộ nhớ và tốc độ."
        });

        Content_MAP.put("Matplotlib", new String[]{
            "Matplotlib là thư viện đồ họa phổ biến nhất trong Python, được sử dụng để:\n"
            + "\n"
            + "Vẽ đồ thị 2D và 3D.\n"
            + "\n"
            + "Hiển thị dữ liệu dưới dạng biểu đồ đường, cột, tròn, scatter, v.v.\n"
            + "\n"
            + "Tùy chỉnh màu sắc, kiểu đường, chú thích, tiêu đề.\n"
            + "\n"
            + "Cài đặt:",
            "2.1. Đồ thị đường (Line Plot)",
            "2.2. Đồ thị cột (Bar Plot)",
            "Dùng để hiển thị mối quan hệ giữa hai biến.",
            "Dùng để biểu diễn tỷ lệ phần trăm.",
            "Dùng để phân phối tần suất dữ liệu.",
            "7.1. Thêm chú thích (Legend)",
            "7.2. Thay đổi kích thước và màu sắc",
            "7.3. Lưu đồ thị thành file ảnh",
            "Matplotlib là công cụ mạnh mẽ để vẽ đồ thị trong Python.\n"
            + "\n"
            + "Có thể tạo nhiều loại biểu đồ khác nhau (đường, cột, tròn, 3D, v.v.).\n"
            + "\n"
            + "Dễ dàng tùy chỉnh màu sắc, kiểu đường, chú thích, tiêu đề."
        });

        Content_MAP.put("Socket", new String[]{
            "Nội dung:\n"
            + "Socket là cơ chế giao tiếp giữa các tiến trình (process) trên cùng máy hoặc khác máy qua mạng.\n"
            + "\n"
            + "TCP Socket (SOCK_STREAM): Đảm bảo dữ liệu gửi nhận đầy đủ, đúng thứ tự.\n"
            + "\n"
            + "UDP Socket (SOCK_DGRAM): Không đảm bảo độ tin cậy nhưng tốc độ cao.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Server TCP cần:\n"
            + "\n"
            + "Tạo socket → Bind địa chỉ/port → Listen → Accept kết nối → Nhận/gửi dữ liệu.\n"
            + "\n"
            + "Xử lý từng client tuần tự (blocking).",
            "Code mẫu:",
            "Nội dung:\n"
            + "Client TCP kết nối đến server, gửi/nhận dữ liệu.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Server UDP không cần thiết lập kết nối, dùng recvfrom() để nhận dữ liệu và địa chỉ client.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Client UDP gửi dữ liệu trực tiếp đến server mà không cần kết nối trước.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Dùng select.select() để theo dõi nhiều socket cùng lúc, tránh blocking.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Tạo socket IPv6 bằng AF_INET6, bind vào địa chỉ IPv6 (vd: ::1 cho localhost).",
            "Code mẫu:",
            "Nội dung:\n"
            + "Đặt thời gian chờ (giây) cho socket bằng settimeout().",
            "Code mẫu:",
            "Nội dung:\n"
            + "\n"
            + "Client đọc file và gửi từng chunk dữ liệu.\n"
            + "\n"
            + "Server nhận và ghi vào file mới.",
            "Code Client:",
            "Code Server:",
            "Nội dung:\n"
            + "Dùng threading để xử lý nhiều client song song.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Gửi tin nhắn đến tất cả client trong mạng LAN bằng UDP Broadcast.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Mã hóa kết nối bằng ssl.wrap_socket().",
            "Code mẫu:",
            "Nội dung:\n"
            + "Dùng gethostbyname(), getaddrinfo() để phân giải tên miền.",
            "Code mẫu:",
            "Nội dung:\n"
            + "Bắt gói tin mạng (yêu cầu quyền root/admin).",
            "Code mẫu:",
            "Nội dung:\n"
            + "Đặt socket ở chế độ không chặn (non-blocking) với setblocking(0).",
            "Code mẫu:"
        });

        Content_MAP.put("Giao thức TCP/IP", new String[]{
            "TCP/IP là bộ giao thức bao gồm hai giao thức chính:\n"
            + "\n"
            + "IP (Internet Protocol): Chịu trách nhiệm định tuyến và địa chỉ hóa các gói tin\n"
            + "\n"
            + "TCP (Transmission Control Protocol): Đảm bảo truyền dữ liệu tin cậy, có thứ tự và kiểm soát lỗi\n"
            + "\n"
            + "Trong mô hình OSI, TCP/IP hoạt động ở:\n"
            + "\n"
            + "Tầng mạng (Network Layer) - IP\n"
            + "\n"
            + "Tầng giao vận (Transport Layer) - TCP",
            "Socket là điểm cuối (endpoint) của giao tiếp hai chiều giữa hai chương trình chạy trên mạng.",
            "Giải thích:\n"
            + "\n"
            + "AF_INET: IPv4\n"
            + "\n"
            + "SOCK_STREAM: Socket stream (TCP)",
            "Một TCP server cần thực hiện các bước:\n"
            + "\n"
            + "Tạo socket\n"
            + "\n"
            + "Bind (ràng buộc) địa chỉ và cổng\n"
            + "\n"
            + "Lắng nghe kết nối\n"
            + "\n"
            + "Chấp nhận kết nối\n"
            + "\n"
            + "Giao tiếp với client\n"
            + "\n"
            + "Đóng kết nối",
            "TCP client thực hiện các bước:\n"
            + "\n"
            + "Tạo socket\n"
            + "\n"
            + "Kết nối đến server\n"
            + "\n"
            + "Giao tiếp với server\n"
            + "\n"
            + "Đóng kết nối",
            "Để xử lý nhiều client cùng lúc, chúng ta có thể sử dụng threading.",
            "Để gửi các đối tượng Python phức tạp, chúng ta có thể sử dụng module pickle.",
            "Server:",
            "Client:",
            "Python cũng hỗ trợ IPv6 thông qua AF_INET6.",
            "Để duy trì kết nối TCP lâu dài và phát hiện kết nối bị ngắt:",
            "Để mã hóa kết nối TCP, sử dụng module ssl.",
            "Server:",
            "Client:",
            "Ví dụ về ứng dụng thực tế - quét cổng TCP:",
            "Ví dụ về proxy server đơn giản:",
            "TCP/IP trong Python cung cấp một cách mạnh mẽ và linh hoạt để xây dựng các ứng dụng mạng. Module socket của Python cho phép chúng ta làm việc với các giao thức mạng ở mức độ thấp, trong khi các module như ssl và threading giúp xây dựng các ứng dụng an toàn và hiệu suất cao."
        });

        Content_MAP.put("UDP", new String[]{
            "UDP (User Datagram Protocol) là một giao thức truyền thông không hướng kết nối (connectionless) trong mạng máy tính, nằm trong tầng giao vận của mô hình TCP/IP. Khác với TCP, UDP không đảm bảo việc gói tin sẽ được gửi đến đích, không sắp xếp thứ tự gói tin và không kiểm soát tắc nghẽn.",
            "Đặc điểm chính của UDP:\n"
            + "\n"
            + "Không thiết lập kết nối trước khi truyền dữ liệu\n"
            + "\n"
            + "Không đảm bảo độ tin cậy (có thể mất gói tin)\n"
            + "\n"
            + "Không sắp xếp thứ tự gói tin\n"
            + "\n"
            + "Tốc độ nhanh hơn TCP\n"
            + "\n"
            + "Phù hợp cho ứng dụng real-time như video streaming, VoIP",
            "Python cung cấp module socket để làm việc với UDP. Để tạo socket UDP, chúng ta sử dụng socket.SOCK_DGRAM.",
            "Để gửi dữ liệu qua UDP, chúng ta sử dụng phương thức sendto().",
            "Để nhận dữ liệu, chúng ta sử dụng phương thức recvfrom().",
            "Server UDP:",
            "Client UDP:",
            "Do UDP không đảm bảo độ tin cậy, chúng ta cần xử lý các trường hợp lỗi:",
            "UDP hỗ trợ gửi broadcast đến tất cả các máy trong mạng con:",
            "Multicast cho phép gửi dữ liệu đến một nhóm các máy nhận:",
            "Đặc điểm	UDP	TCP\n"
            + "Kết nối	Không hướng kết nối	Hướng kết nối\n"
            + "Độ tin cậy	Không đảm bảo	Đảm bảo\n"
            + "Thứ tự gói tin	Không đảm bảo	Đảm bảo\n"
            + "Kiểm soát tắc nghẽn	Không có	Có\n"
            + "Tốc độ	Nhanh hơn	Chậm hơn\n"
            + "Header size	8 bytes	20 bytes\n"
            + "Phù hợp cho	Video streaming, VoIP, DNS	Web, email, file transfer",
            "DNS (Domain Name System): UDP được sử dụng cho các truy vấn DNS do tốc độ nhanh\n"
            + "\n"
            + "VoIP (Voice over IP): Các ứng dụng gọi điện thoại qua Internet ưu tiên tốc độ hơn độ tin cậy\n"
            + "\n"
            + "Video Streaming: Các dịch vụ streaming thường sử dụng UDP để giảm độ trễ\n"
            + "\n"
            + "Online Games: Nhiều game online sử dụng UDP để đảm bảo tốc độ phản hồi\n"
            + "\n"
            + "DHCP (Dynamic Host Configuration Protocol): Sử dụng UDP để cấp phát địa chỉ IP",
            "Hạn chế:\n"
            + "\n"
            + "Không đảm bảo gói tin sẽ đến đích\n"
            + "\n"
            + "Không đảm bảo thứ tự gói tin\n"
            + "\n"
            + "Dễ bị mất gói tin trong mạng bận",
            "Cách khắc phục:\n"
            + "\n"
            + "Triển khai cơ chế ACK (Acknowledgment) ở tầng ứng dụng\n"
            + "\n"
            + "Đánh số thứ tự gói tin và sắp xếp lại ở phía nhận\n"
            + "\n"
            + "Sử dụng timeout và gửi lại gói tin khi cần\n"
            + "\n"
            + "Nén dữ liệu để giảm kích thước gói tin",
            "Ví dụ triển khai cơ chế ACK đơn giản:",
            "UDP là giao thức mạng quan trọng khi tốc độ được ưu tiên hơn độ tin cậy. Python cung cấp module socket giúp lập trình UDP dễ dàng với các phương thức sendto(), recvfrom(). Khi làm việc với UDP, lập trình viên cần tự xử lý các vấn đề về độ tin cậy nếu cần thiết."
        });

        Content_MAP.put("Xây dựng ứng dụng Web với Flask/Django", new String[]{
            "1.1 Flask - Microframework nhẹ\n"
            + "Flask là một microframework Python nhẹ để xây dựng ứng dụng web. Nó được thiết kế để đơn giản và dễ mở rộng, cung cấp các công cụ cơ bản để xây dựng ứng dụng web.",
            "Ưu điểm:\n"
            + "\n"
            + "Nhẹ và linh hoạt\n"
            + "\n"
            + "Dễ học và sử dụng\n"
            + "\n"
            + "Cộng đồng lớn với nhiều extension\n"
            + "\n"
            + "Phù hợp cho ứng dụng nhỏ và API",
            "1.2 Django - Full-stack framework\n"
            + "Django là một full-stack framework Python mạnh mẽ cung cấp mọi thứ cần thiết để xây dựng ứng dụng web phức tạp.",
            "Ưu điểm:\n"
            + "\n"
            + "Bao gồm ORM, admin interface, authentication\n"
            + "\n"
            + "Tuân theo nguyên tắc \"Batteries included\"\n"
            + "\n"
            + "Hệ thống template mạnh mẽ\n"
            + "\n"
            + "Phù hợp cho ứng dụng phức tạp, CMS, e-commerce",
            "2.1 Cài đặt Flask",
            "2.2 Ứng dụng Flask cơ bản",
            "2.3 Xử lý route và tham số URL",
            "2.4 Template với Jinja2\n"
            + "Tạo file templates/hello.html:",
            "Code Python:",
            "2.5 Xử lý form\n"
            + "Tạo file templates/form.html:",
            "Code Python:",
            "2.6 Kết nối database với Flask-SQLAlchemy",
            "3.1 Cài đặt Django",
            "3.2 Cấu trúc dự án Django",
            "3.3 Tạo view cơ bản\n"
            + "Trong myapp/views.py:",
            "Trong myproject/urls.py:",
            "3.4 Template Django\n"
            + "Tạo file myapp/templates/myapp/home.html:",
            "Cập nhật view:",
            "3.5 Model và Admin\n"
            + "Trong myapp/models.py:",
            "Trong myapp/admin.py:",
            "Chạy migrations:",
            "3.6 Form trong Django\n"
            + "Tạo file myapp/forms.py:",
            "View xử lý form:",
            "Template contact.html:",
            "3.7 Class-based Views",
            "4.1 Khi nào nên dùng Flask?\n"
            + "Dự án nhỏ, đơn giản\n"
            + "\n"
            + "API services (RESTful, GraphQL)\n"
            + "\n"
            + "Microservices\n"
            + "\n"
            + "Prototyping nhanh\n"
            + "\n"
            + "Khi cần kiểm soát cao các thành phần",
            "4.2 Khi nào nên dùng Django?\n"
            + "Dự án phức tạp, nhiều tính năng\n"
            + "\n"
            + "CMS, e-commerce, social networks\n"
            + "\n"
            + "Khi cần admin interface sẵn có\n"
            + "\n"
            + "Khi cần ORM mạnh mẽ\n"
            + "\n"
            + "Dự án cần bảo mật cao (Django có nhiều tính năng bảo mật built-in)",
            "Tiêu chí	Flask	Django\n"
            + "Độ phức tạp	Đơn giản, nhẹ	Phức tạp, đầy đủ tính năng\n"
            + "ORM	Không có, cần extension	Django ORM tích hợp\n"
            + "Admin interface	Không có	Có sẵn\n"
            + "Template engine	Jinja2	Django template\n"
            + "Routing	Decorator-based	URLconf\n"
            + "Bảo mật	Cần tự xử lý nhiều	Nhiều tính năng built-in\n"
            + "Tốc độ phát triển	Nhanh cho dự án nhỏ	Nhanh cho dự án lớn",
            "5.1 Triển khai Flask\n"
            + "Ví dụ với Waitress (production WSGI server):",
            "5.2 Triển khai Django\n"
            + "Sử dụng Gunicorn + Nginx:",
            "Cấu hình Nginx (ví dụ):",
            "Flask và Django đều là những framework mạnh mẽ cho phát triển web với Python. Sự lựa chọn giữa chúng phụ thuộc vào yêu cầu dự án:\n"
            + "\n"
            + "Chọn Flask nếu bạn cần một framework nhẹ, linh hoạt cho ứng dụng nhỏ hoặc API\n"
            + "\n"
            + "Chọn Django nếu bạn cần một framework đầy đủ tính năng cho ứng dụng phức tạp"
        });

        Content_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch", new String[]{
            "Machine Learning (ML) là một lĩnh vực của Trí tuệ nhân tạo (AI) tập trung vào việc phát triển các thuật toán cho phép máy tính học từ dữ liệu và đưa ra dự đoán hoặc quyết định mà không cần lập trình rõ ràng.\n"
            + "\n"
            + "Ba thư viện phổ biến nhất trong Python cho ML:\n"
            + "\n"
            + "Scikit-learn: Thư viện ML cổ điển, đơn giản, phù hợp cho các bài toán truyền thống\n"
            + "\n"
            + "TensorFlow: Framework ML mạnh mẽ của Google, đặc biệt cho Deep Learning\n"
            + "\n"
            + "PyTorch: Framework ML của Facebook, linh hoạt và phổ biến trong nghiên cứu",
            "2.1 Giới thiệu Scikit-learn\n"
            + "Scikit-learn là thư viện mã nguồn mở cung cấp các công cụ đơn giản và hiệu quả để phân tích dữ liệu và khai phá dữ liệu. Nó được xây dựng trên NumPy, SciPy và matplotlib.",
            "Ưu điểm:\n"
            + "\n"
            + "Dễ sử dụng, API nhất quán\n"
            + "\n"
            + "Tài liệu phong phú\n"
            + "\n"
            + "Hiệu suất tốt cho các bộ dữ liệu vừa và nhỏ\n"
            + "\n"
            + "Đầy đủ các thuật toán ML truyền thống",
            "2.2 Các bước cơ bản với Scikit-learn",
            "2.3 Các thuật toán chính trong Scikit-learn",
            "a. Hồi quy (Regression)",
            "b. Phân loại (Classification)",
            "c. Phân cụm (Clustering)",
            "3.1 Giới thiệu TensorFlow\n"
            + "TensorFlow là một framework mã nguồn mở do Google phát triển cho các ứng dụng machine learning và deep learning. Nó sử dụng đồ thị tính toán (computation graphs) để biểu diễn các phép tính.",
            "Ưu điểm:\n"
            + "\n"
            + "Hỗ trợ mạnh mẽ cho Deep Learning\n"
            + "\n"
            + "Tính toán hiệu quả trên CPU/GPU/TPU\n"
            + "\n"
            + "Hệ sinh thái phong phú (TensorFlow Lite, TensorFlow.js, etc.)\n"
            + "\n"
            + "TensorBoard để visualize quá trình huấn luyện",
            "3.2 Mạng Neural cơ bản với TensorFlow",
            "3.3 Mạng CNN với TensorFlow",
            "4.1 Giới thiệu PyTorch\n"
            + "PyTorch là một framework deep learning mã nguồn mở do Facebook phát triển, nổi tiếng với tính linh hoạt và dễ sử dụng trong nghiên cứu.",
            "Ưu điểm:\n"
            + "\n"
            + "Tính toán tensor mạnh mẽ (tương tự NumPy nhưng hỗ trợ GPU)\n"
            + "\n"
            + "Đồ thị tính toán động (dynamic computation graph)\n"
            + "\n"
            + "Hỗ trợ tốt cho nghiên cứu và phát triển mô hình mới\n"
            + "\n"
            + "Cộng đồng lớn và phát triển nhanh",
            "4.2 Mạng Neural cơ bản với PyTorch",
            "4.3 Mạng CNN với PyTorch",
            "Tiêu chí	Scikit-learn	TensorFlow	PyTorch\n"
            + "Mục đích chính	ML truyền thống	Deep Learning	Deep Learning\n"
            + "Độ khó	Dễ	Trung bình - Khó	Trung bình\n"
            + "Hiệu suất	Tốt cho dữ liệu nhỏ/vừa	Cao, hỗ trợ GPU/TPU	Cao, hỗ trợ GPU\n"
            + "Tính linh hoạt	Hạn chế	Linh hoạt	Rất linh hoạt\n"
            + "Đồ thị tính toán	Không có	Tĩnh	Động\n"
            + "Cộng đồng	Lớn	Rất lớn	Lớn và đang phát triển nhanh\n"
            + "Sử dụng trong	Ứng dụng ML cơ bản	Sản phẩm thương mại, nghiên cứu	Nghiên cứu, prototype nhanh",
            "Scikit-learn là lựa chọn tốt cho các bài toán ML truyền thống với dữ liệu có cấu trúc\n"
            + "\n"
            + "TensorFlow phù hợp cho các ứng dụng Deep Learning quy mô lớn, triển khai sản phẩm\n"
            + "\n"
            + "PyTorch lý tưởng cho nghiên cứu và phát triển mô hình mới nhờ tính linh hoạt"
        });

        Content_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            "1.1 Giới thiệu Selenium\n"
            + "Selenium là một bộ công cụ mã nguồn mở để tự động hóa trình duyệt web, hỗ trợ nhiều ngôn ngữ lập trình trong đó có Python.",
            "Cài đặt:",
            "1.2 Khởi tạo WebDriver\n"
            + "WebDriver là thành phần chính để điều khiển trình duyệt.",
            "1.3 Tìm kiếm phần tử\n"
            + "Có nhiều cách để định vị phần tử trên trang web.",
            "1.4 Tương tác với phần tử\n"
            + "Các thao tác cơ bản với phần tử web.",
            "1.5 Xử lý form\n"
            + "Cách tự động điền và gửi form.",
            "1.6 Chờ phần tử xuất hiện\n"
            + "Sử dụng WebDriverWait để chờ phần tử.",
            "1.7 Xử lý cửa sổ và tab\n"
            + "Điều khiển nhiều cửa sổ trình duyệt.",
            "2.1 Giới thiệu Telegram Bot API\n"
            + "Telegram cung cấp API mạnh mẽ để tạo và quản lý bot.",
            "Cài đặt:",
            "2.2 Tạo bot mới\n"
            + "Các bước tạo bot với BotFather.\n"
            + "\n"
            + "Tìm @BotFather trên Telegram\n"
            + "\n"
            + "Gửi lệnh /newbot\n"
            + "\n"
            + "Đặt tên và username cho bot\n"
            + "\n"
            + "Nhận token API",
            "2.3 Bot cơ bản\n"
            + "Code mẫu bot echo đơn giản.",
            "2.4 Xử lý lệnh\n"
            + "Thêm các lệnh tùy chỉnh cho bot.",
            "2.5 Gửi tin nhắn đa dạng\n"
            + "Gửi ảnh, file, sticker...",
            "3.1 Giới thiệu Discord.py\n"
            + "Thư viện chính thức để tạo bot Discord bằng Python.",
            "Cài đặt:",
            "3.2 Tạo bot trên Discord Developer Portal\n"
            + "Truy cập https://discord.com/developers/applications\n"
            + "\n"
            + "Tạo ứng dụng mới\n"
            + "\n"
            + "Chuyển sang tab \"Bot\" và thêm bot\n"
            + "\n"
            + "Lấy token",
            "3.3 Bot cơ bản\n"
            + "Code mẫu bot Discord đơn giản.",
            "3.4 Xử lý sự kiện\n"
            + "Các sự kiện phổ biến trong Discord.",
            "3.5 Lệnh với tham số\n"
            + "Tạo lệnh có tham số.",
            "3.6 Embed message\n"
            + "Tạo tin nhắn đẹp với Embed.",
            "3.7 Bot với Cogs (Module)\n"
            + "Tổ chức code thành các module.\n"
            + "\n"
            + "main.py:",
            "cogs/fun.py:",
            "Trên đây là hướng dẫn đầy đủ để:\n"
            + "\n"
            + "Tự động hóa trình duyệt web với Selenium\n"
            + "\n"
            + "Tạo bot Telegram với python-telegram-bot\n"
            + "\n"
            + "Xây dựng bot Discord với discord.py"
        });

        Content_MAP.put("Bảo mật, tối ưu hiệu năng", new String[]{
            "1. Xử lý dữ liệu nhạy cảm\n"
            + "Nội dung: Khi làm việc với dữ liệu nhạy cảm như mật khẩu, token, cần đảm bảo không lưu trữ trực tiếp trong code hoặc log.",
            "2. Ngăn chặn SQL Injection\n"
            + "Nội dung: Luôn sử dụng parameterized queries thay vì nối chuỗi SQL",
            "3. Xác thực và ủy quyền\n"
            + "Nội dung: Sử dụng thư viện bảo mật để xác thực, không tự implement các thuật toán phức tạp.",
            "4. Bảo mật API\n"
            + "Nội dung: Khi xây dựng API, cần implement các biện pháp bảo mật cơ bản.",
            "5. Bảo mật file và thư mục\n"
            + "Nội dung: Kiểm soát quyền truy cập file và thư mục.",
            "1. Sử dụng Generator thay cho List\n"
            + "Nội dung: Generator tiết kiệm bộ nhớ bằng cách không lưu toàn bộ dữ liệu cùng lúc.",
            "2. Sử dụng caching\n"
            + "Nội dung: Cache kết quả các hàm tốn tài nguyên để tăng tốc độ.",
            "3. Sử dụng thư viện hiệu năng cao\n"
            + "Nội dung: Thay thế các thao tác bằng thư viện tối ưu như NumPy, Pandas.",
            "4. Đa luồng và đa tiến trình\n"
            + "Nội dung: Sử dụng đa luồng cho I/O-bound tasks và đa tiến trình cho CPU-bound tasks.",
            "5. Tối ưu vòng lặp\n"
            + "Nội dung: Tránh các thao tác không cần thiết trong vòng lặp.",
            "6. Sử dụng slots để tiết kiệm bộ nhớ\n"
            + "Nội dung: Khi có nhiều instance, __slots__ giúp giảm đáng kể bộ nhớ sử dụng.",
            "7. Tối ưu thao tác với string\n"
            + "Nội dung: Tránh nối string trong vòng lặp, sử dụng join thay thế.",
            "8. Sử dụng cProfile để phân tích hiệu năng\n"
            + "Nội dung: Xác định các hàm tốn nhiều thời gian để tối ưu.",
            "9. Tối ưu truy vấn database\n"
            + "Nội dung: Sử dụng batch query, chỉ select các cột cần thiết.",
            "10. Sử dụng các cấu trúc dữ liệu phù hợp\n"
            + "Nội dung: Chọn cấu trúc dữ liệu phù hợp với nhu cầu sử dụng."
        });

        Content_MAP.put("kiểm thử với pytest, unittest", new String[]{
            "Kiểm thử (testing) là quá trình quan trọng trong phát triển phần mềm giúp đảm bảo code hoạt động đúng như mong đợi. Python cung cấp hai framework phổ biến cho kiểm thử:\n"
            + "\n"
            + "unittest: Framework kiểm thử tích hợp sẵn trong thư viện chuẩn Python\n"
            + "\n"
            + "pytest: Framework kiểm thử bên thứ ba mạnh mẽ với cú pháp đơn giản",
            "2.1. Cơ bản về unittest\n"
            + "unittest là framework kiểm thử được lấy cảm hứng từ JUnit (Java). Nó hỗ trợ:\n"
            + "\n"
            + "Tự động phát hiện test case\n"
            + "\n"
            + "Tổ chức test case thành test suites\n"
            + "\n"
            + "Các phương thức assert để kiểm tra điều kiện\n"
            + "\n"
            + "Test fixtures (setUp và tearDown)",
            "2.2. Các phương thức assert phổ biến\n"
            + "Phương thức	Mục đích\n"
            + "assertEqual(a, b)	Kiểm tra a == b\n"
            + "assertNotEqual(a, b)	Kiểm tra a != b\n"
            + "assertTrue(x)	Kiểm tra x là True\n"
            + "assertFalse(x)	Kiểm tra x là False\n"
            + "assertIs(a, b)	Kiểm tra a is b\n"
            + "assertIsNot(a, b)	Kiểm tra a is not b\n"
            + "assertIsNone(x)	Kiểm tra x is None\n"
            + "assertIsNotNone(x)	Kiểm tra x is not None\n"
            + "assertIn(a, b)	Kiểm tra a in b\n"
            + "assertNotIn(a, b)	Kiểm tra a not in b\n"
            + "assertRaises(exc, func, *args, **kwargs)	Kiểm tra func ném ra ngoại lệ exc",
            "2.3. Test Fixtures (setUp và tearDown)\n"
            + "Fixtures giúp thiết lập môi trường trước khi chạy test và dọn dẹp sau khi test hoàn thành.",
            "2.4. Test Suites\n"
            + "Tổ chức nhiều test case thành test suites để chạy cùng nhau.",
            "3.1. Cơ bản về pytest\n"
            + "pytest là framework kiểm thử bên thứ ba với nhiều tính năng mạnh mẽ:\n"
            + "\n"
            + "Tự động phát hiện test case\n"
            + "\n"
            + "Cú pháp đơn giản (không cần class)\n"
            + "\n"
            + "Nhiều plugin hỗ trợ\n"
            + "\n"
            + "Báo cáo chi tiết",
            "Chạy test: pytest test_sample.py",
            "3.2. Các cách viết assert trong pytest\n"
            + "pytest sử dụng câu lệnh assert đơn giản thay vì các phương thức assert như unittest.",
            "3.3. Fixtures trong pytest\n"
            + "Fixtures trong pytest linh hoạt hơn unittest, có thể sử dụng lại giữa các test module.",
            "3.4. Parametrize trong pytest\n"
            + "Cho phép chạy cùng một test với nhiều bộ dữ liệu khác nhau.",
            "3.5. Mocking trong pytest\n"
            + "Sử dụng thư viện unittest.mock hoặc plugin pytest-mock để mock các đối tượng.",
            "Với pytest-mock:",
            "Tính năng	unittest	pytest\n"
            + "Cú pháp	Dựa trên class	Hàm đơn giản\n"
            + "Assert	Phương thức assert	Câu lệnh assert\n"
            + "Fixtures	setUp/tearDown	@pytest.fixture\n"
            + "Parametrize	Cần subclass	@pytest.mark.parametrize\n"
            + "Mocking	unittest.mock	pytest-mock\n"
            + "Tự động phát hiện test	Có	Có\n"
            + "Plugin	Hạn chế	Phong phú\n"
            + "Báo cáo	Cơ bản	Chi tiết",
            "Đặt tên test rõ ràng: Tên test nên mô tả hành vi được kiểm tra\n"
            + "\n"
            + "Test độc lập: Mỗi test không nên phụ thuộc vào test khác\n"
            + "\n"
            + "Test nhanh: Test nên chạy nhanh để khuyến khích chạy thường xuyên\n"
            + "\n"
            + "Test một thứ tại một thời điểm: Mỗi test nên kiểm tra một khía cạnh cụ thể\n"
            + "\n"
            + "Sử dụng fixtures: Để tái sử dụng code thiết lập và dọn dẹp\n"
            + "\n"
            + "Kiểm tra edge cases: Các trường hợp biên, đầu vào không hợp lệ\n"
            + "\n"
            + "Test coverage: Sử dụng công cụ như coverage.py để đo độ bao phủ",
            "Cấu trúc thư mục dự án:",
            "src/calculator.py:",
            "tests/test_calculator.py (unittest):",
            "tests/test_calculator.py (pytest):",
            "Với unittest:",
            "Với pytest:",
            "Để xem báo cáo coverage:"
        });

    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getContent(String language, int index) {
        if (Content_MAP.containsKey(language)) {
            String[] descriptions = Content_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getContent(String language) {
        return Content_MAP.getOrDefault(language, new String[]{});
    }

    private static final Map<String, String[]> Code_MAP = new HashMap<>();

    static {
        Code_MAP.put("Giới thiệu SQL", new String[]{
            "CREATE DATABASE myDatabase;",
            "//tạo database \n"
            + "CREATE DATABASE myDatabase; \n"
            + "//hiển thị tất cả database \n"
            + "SHOW DATABASES; --MySQL \n"
            + "SELECT name FROM myDatabase --SQL server",
            "CREATE TABLE users ( \n"
            + "id INT AUTO_INCREMENT PRIMARY KEY, \n"
            + "name VARCHAR(100), \n"
            + "    email VARCHAR(255) UNIQUE \n"
            + "); \n"
            + "INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com');",
            "CREATE TABLE employees ( \n"
            + "emp_id SERIAL PRIMARY KEY, \n"
            + "name TEXT NOT NULL, \n"
            + "salary NUMERIC(10,2) \n"
            + "); \n"
            + "INSERT INTO employees (name, salary) VALUES ('Alice', 75000); ",
            "CREATE TABLE Customers ( \n"
            + "CustomerID INT IDENTITY(1,1) PRIMARY KEY, \n"
            + "Name NVARCHAR(100), \n"
            + "Email NVARCHAR(255) UNIQUE \n "
            + "); \n"
            + "INSERT INTO Customers (Name, Email) VALUES (N'Nguyễn Văn A', 'nguyenvana@example.com');",
            "CREATE TABLE employees ( \n"
            + "emp_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY, \n"
            + "name VARCHAR2(100), \n"
            + "department VARCHAR2(50) \n"
            + "); \n"
            + "INSERT INTO employees (name, department) VALUES ('David', 'IT');"
        });

        Code_MAP.put("Khái niệm", new String[]{
            "CREATE DATABASE ten_csd;",
            "USE ten_csd;",
            "CREATE TABLE khach_hang ( \n"
            + "id INT PRIMARY KEY AUTO_INCREMENT, \n"
            + "ten VARCHAR(100), \n"
            + "email VARCHAR(100), \n"
            + "so_dien_thoai VARCHAR(15) \n"
            + "); \n",
            "INSERT INTO khach_hang (ten, email, so_dien_thoai) \n"
            + "VALUES ('Nguyen Van A', 'a@example.com', '0123456789');",
            "SELECT * FROM khach_hang;",
            "SELECT * FROM khach_hang WHERE email = 'a@example.com';",
            "UPDATE khach_hang \n"
            + "SET so_dien_thoai = '0987654321' \n"
            + "WHERE id = 1;",
            "DELETE FROM khach_hang \n"
            + "WHERE id = 1;",
            "ALTER TABLE khach_hang \n"
            + "ADD dia_chi VARCHAR(255);",
            "DROP TABLE khach_hang;"

        });

        Code_MAP.put("Kiểu dữ liệu, toán tử, biểu thức", new String[]{
            "CREATE TABLE Products ( \n"
            + "Quantity INT, \n"
            + "Price DECIMAL(10, 2) \n"
            + ");",
            "CREATE TABLE Customers ( \n"
            + "Name VARCHAR(100) \n"
            + ");",
            "CREATE TABLE Orders ( \n"
            + "OrderDate DATETIME \n"
            + ");",
            "SELECT 10 + 5 AS Total; -- Kết quả: 15",
            "SELECT * FROM Customers WHERE Age > 30;",
            "SELECT * FROM Customers WHERE Age > 25 AND City = 'Hà Nội';",
            "SELECT Name, Price * Quantity AS TotalPrice FROM Products;"
        });

        Code_MAP.put("SELECT", new String[]{
            "SELECT * FROM Customers;",
            "SELECT Name, Age FROM Customers WHERE Age > 30;",
            "SELECT * FROM Customers ORDER BY Name DESC;",
            "SELECT DISTINCT City FROM Customers;",
            "SELECT COUNT(*) AS TotalCustomers FROM Customers;"
        });

        Code_MAP.put("INSERT", new String[]{
            "INSERT INTO Customers (Name, Age) VALUES ('Nguyễn Văn A', 25);",
            "INSERT INTO Customers (Name, Age, City) VALUES ('Trần Thị B', 30, 'Hà Nội');",
            "INSERT INTO Customers (Name, Age) VALUES ('Lê Văn C', 28), ('Phạm Thị D', 35);"
        });

        Code_MAP.put("UPDATE", new String[]{
            "UPDATE Customers SET Age = 26 WHERE CustomerID = 1;",
            "UPDATE Customers SET City = 'TP.HCM' WHERE City = 'Hồ Chí Minh';",
            "UPDATE Products SET Price = Price * 1.1; -- Tăng giá 10% (⚠️ Không có WHERE!)"
        });

        Code_MAP.put("DELETE", new String[]{
            "DELETE FROM Customers WHERE CustomerID = 3;",
            "DELETE FROM Orders WHERE OrderDate < '2023-01-01';",
            "TRUNCATE TABLE Logs; -- Xóa nhanh, không thể hoàn tác"
        });

        Code_MAP.put("Kiểu dữ liệu số, chuỗi, ngày tháng", new String[]{
            "CREATE TABLE Products (\n"
            + "    ID INT PRIMARY KEY,\n"
            + "    Name VARCHAR(50) NOT NULL,\n"
            + "    Quantity INT DEFAULT 0,\n"
            + "    Price DECIMAL(10, 2) CHECK (Price > 0)\n"
            + ");",
            "CREATE TABLE Customers (\n"
            + "    ID INT PRIMARY KEY,\n"
            + "    Name VARCHAR(100) NOT NULL,\n"
            + "    Address TEXT,\n"
            + "    Email VARCHAR(100) UNIQUE\n"
            + ");",
            "CREATE TABLE Customers (\n"
            + "    ID INT PRIMARY KEY,\n"
            + "    Name VARCHAR(100) NOT NULL,\n"
            + "    Address TEXT,\n"
            + "    Email VARCHAR(100) UNIQUE\n"
            + ");",
            "CREATE TABLE Orders (\n"
            + "    OrderID INT PRIMARY KEY,\n"
            + "    CustomerID INT,\n"
            + "    OrderDate DATETIME DEFAULT CURRENT_TIMESTAMP,\n"
            + "    TotalAmount DECIMAL(12, 2),\n"
            + "    FOREIGN KEY (CustomerID) REFERENCES Customers(ID)\n"
            + ");",
            "-- Thêm khách hàng\n"
            + "INSERT INTO Customers (ID, Name, Email) \n"
            + "VALUES (1, 'Nguyễn Văn A', 'a@example.com');\n"
            + "\n"
            + "-- Thêm sản phẩm\n"
            + "INSERT INTO Products (ID, Name, Price) \n"
            + "VALUES (101, 'Laptop', 15000000);\n"
            + "\n"
            + "-- Thêm đơn hàng\n"
            + "INSERT INTO Orders (OrderID, CustomerID, TotalAmount) \n"
            + "VALUES (1001, 1, 15000000);"
        });

        Code_MAP.put("Toán tử số học, so sánh, logic", new String[]{
            "SELECT SUM(Price * Quantity) AS TotalAmount FROM Orders;",
            "SELECT Name, Age FROM Customers WHERE Age > 30;",
            "SELECT * FROM Orders \n"
            + "WHERE TotalAmount > 500 OR Quantity > 10;"
        });

        Code_MAP.put("Hàm tổng hợp", new String[]{
            // Đếm số khách hàng
            "SELECT COUNT(*) AS TotalCustomers FROM Customers;",
            // Tính tổng doanh thu
            "SELECT SUM(TotalAmount) AS Revenue FROM Orders;",
            // Tính giá trung bình sản phẩm
            "SELECT AVG(Price) AS AveragePrice FROM Products;",
            // Tìm giá sản phẩm thấp nhất/cao nhất
            "SELECT MIN(Price) AS MinPrice, MAX(Price) AS MaxPrice FROM Products;",
            // Kết hợp nhiều hàm
            "SELECT COUNT(*) AS OrderCount, SUM(TotalAmount) AS TotalRevenue FROM Orders WHERE OrderDate >= '2023-01-01';"
        });

        Code_MAP.put("Hàm xử lý chuỗi", new String[]{
            // Ghép họ và tên
            "SELECT CONCAT(FirstName, ' ', LastName) AS FullName FROM Employees;",
            // Lấy 3 ký tự đầu mã sản phẩm
            "SELECT SUBSTRING(ProductCode, 1, 3) AS ShortCode FROM Products;",
            // Chuyển tên thành chữ hoa
            "SELECT UPPER(ProductName) AS UpperName FROM Products;",
            // Chuyển email thành chữ thường
            "SELECT LOWER(Email) AS LowerEmail FROM Customers;",
            // Kết hợp nhiều hàm
            "SELECT CONCAT(UPPER(SUBSTRING(LastName, 1, 1)), LOWER(SUBSTRING(LastName, 2)) FROM Employees;"
        });

        Code_MAP.put("Hàm xử lý ngày tháng", new String[]{
            // Lấy ngày giờ hiện tại
            "SELECT NOW() AS CurrentDateTime;",
            // Định dạng ngày theo kiểu Việt Nam
            "SELECT DATE_FORMAT(OrderDate, '%d/%m/%Y') AS FormattedDate FROM Orders;",
            // Tính số ngày giữa 2 ngày
            "SELECT DATEDIFF(NOW(), BirthDate)/365 AS Age FROM Customers;",
            // Thêm 7 ngày vào ngày hiện tại
            "SELECT DATE_ADD(NOW(), INTERVAL 7 DAY) AS NextWeek;",
            // Trích xuất tháng từ ngày
            "SELECT MONTH(OrderDate) AS OrderMonth FROM Orders;"
        });

        Code_MAP.put("PRIMARY KEY, FOREIGN KEY", new String[]{
            "CREATE TABLE Customers (\n"
            + "    CustomerID INT PRIMARY KEY,\n"
            + "    Name VARCHAR(100) NOT NULL,\n"
            + "    Email VARCHAR(100) NOT NULL UNIQUE\n"
            + ");",
            "CREATE TABLE Orders (\n"
            + "    OrderID INT,\n"
            + "    ProductID INT,\n"
            + "    Quantity INT,\n"
            + "    PRIMARY KEY (OrderID, ProductID) -- Khóa chính gồm 2 cột\n"
            + ");",
            "CREATE TABLE Orders (\n"
            + "    OrderID INT PRIMARY KEY,\n"
            + "    CustomerID INT,\n"
            + "    OrderDate DATE,\n"
            + "    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)\n"
            + ");",
            "FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID) ON DELETE CASCADE"
        });

        Code_MAP.put("UNIQUE, CHECK, NOT NULL", new String[]{
            "CREATE TABLE Customers (\n"
            + "    CustomerID INT PRIMARY KEY,\n"
            + "    Name VARCHAR(100),\n"
            + "    Email VARCHAR(100) UNIQUE\n"
            + ");",
            "CREATE TABLE Products (\n"
            + "    ProductID INT PRIMARY KEY,\n"
            + "    Name VARCHAR(100),\n"
            + "    Code VARCHAR(50),\n"
            + "    UNIQUE (Name, Code) -- Combination of both columns must be unique\n"
            + ");",
            "CREATE TABLE Employees (\n"
            + "    EmployeeID INT PRIMARY KEY,\n"
            + "    Name VARCHAR(100),\n"
            + "    Age INT CHECK (Age >= 18)\n"
            + ");",
            "CREATE TABLE Products (\n"
            + "    ProductID INT PRIMARY KEY,\n"
            + "    Price DECIMAL(10,2) CHECK (Price > 0),\n"
            + "    Stock INT CHECK (Stock >= 0)\n"
            + ");",
            "CREATE TABLE Customers (\n"
            + "    CustomerID INT PRIMARY KEY,\n"
            + "    Name VARCHAR(100) NOT NULL,\n"
            + "    Email VARCHAR(100) NOT NULL\n"
            + ");"
        });

        Code_MAP.put("DEFAULT", new String[]{
            "CREATE TABLE Users (\n"
            + "    UserID INT PRIMARY KEY,\n"
            + "    Username VARCHAR(50) NOT NULL,\n"
            + "    Status VARCHAR(20) DEFAULT 'Active'\n"
            + ");",
            "INSERT INTO Users (UserID, Username) VALUES (1, 'JohnDoe');\n"
            + "-- Status will automatically be 'Active' due to DEFAULT constraint"
        });

        Code_MAP.put("Tạo, xóa cơ sở dữ liệu", new String[]{
            "CREATE DATABASE myDatabase",
            "CREATE DATABASE ShopDB;",
            "CREATE DATABASE IF NOT EXISTS ShopDB;",
            "USE ShopDB",
            "DROP DATABASE ShopDB;",
            "DROP DATABASE IF EXISTS ShopDB;"
        });

        Code_MAP.put("Sao lưu và phục hồi", new String[]{
            "mysqldump -u root -p ShopDB > backup.sql",
            "BACKUP DATABASE ShopDB  \n"
            + "TO DISK = 'D:\\backup\\ShopDB.bak'  \n"
            + "WITH FORMAT;",
            "mysql -u root -p ShopDB < backup.sql",
            "RESTORE DATABASE ShopDB\n"
            + "FROM DISK = 'D:\\backup\\ShopDB.bak'\n"
            + "WITH REPLACE;"
        });

        Code_MAP.put("Quản lý quyền truy cập", new String[]{
            "CREATE USER 'newuser'@'localhost' IDENTIFIED BY 'password';",
            "GRANT ALL PRIVILEGES ON ShopDB.* TO 'newuser'@'localhost';",
            "REVOKE INSERT, UPDATE ON ShopDB.* FROM 'newuser'@'localhost';",
            "DROP USER 'newuser'@'localhost';"
        });

        Code_MAP.put("Tạo, xóa, sửa bảng", new String[]{
            "CREATE TABLE KhachHang ( \n"
            + "   ID INT PRIMARY KEY AUTO_INCREMENT, \n"
            + "   HoTen VARCHAR(100) NOT NULL, \n"
            + "   Email VARCHAR(100) UNIQUE, \n"
            + "   NgayDangKy DATE DEFAULT CURRENT_DATE"
            + ");",
            "DROP TABLE IF EXISTS KhachHang;",
            "ALTER TABLE KhachHang ADD COLUMN SoDT VARCHAR(15);",
            "ALTER TABLE KhachHang DROP COLUMN NgayDangKy;",
            "ALTER TABLE KhachHang MODIFY COLUMN Email VARCHAR(150);"
        });

        Code_MAP.put("Tăng giá trị tự động", new String[]{
            "CREATE TABLE SanPham ( \n"
            + "   ID INT PRIMARY KEY AUTO_INCREMENT, \n"
            + "   TenSP VARCHAR(100) \n"
            + ");",
            "ALTER TABLE SanPham AUTO_INCREMENT = 1000;",
            "ALTER TABLE SanPham AUTO_INCREMENT = 1;",});

        Code_MAP.put("Tạo, xóa VIEW", new String[]{
            "CREATE VIEW KhachHangVIP AS \n"
            + "SELECT ID, HoTen FROM KhachHang \n"
            + "WHERE DiemTichLuy > 1000;",
            "SELECT * FROM KhachHangVIP;",
            "DROP VIEW IF EXISTS KhachHangVIP;",});

        Code_MAP.put("JOIN", new String[]{
            "SELECT A.TenCot, B.TenCot\n"
            + "FROM Bang1 A\n"
            + "INNER JOIN Bang2 B ON A.KhoaChinh = B.KhoaNgoai;",
            "SELECT KhachHang.HoTen, DonHang.SanPham, DonHang.SoLuong\n"
            + "FROM KhachHang\n"
            + "INNER JOIN DonHang ON KhachHang.ID = DonHang.KhachHangID;"
        });

        Code_MAP.put("SELF JOIN", new String[]{
            "SELECT NV1.TenNhanVien AS NhanVien, NV2.TenNhanVien AS QuanLy\n"
            + "FROM NhanVien NV1\n"
            + "LEFT JOIN NhanVien NV2 ON NV1.QuanLyID = NV2.ID;"
        });

        Code_MAP.put("UNION", new String[]{
            "SELECT Ten FROM KhachHang\n"
            + "UNION\n"
            + "SELECT Ten FROM NhaCungCap;",
            "SELECT Ten FROM KhachHang\n"
            + "UNION ALL\n"
            + "SELECT Ten FROM NhaCungCap;"
        });

        Code_MAP.put("GROUP BY", new String[]{
            "SELECT Cot1, Cot2, Ham_Tong_Hop(Cot3)\n"
            + "FROM TenBang\n"
            + "GROUP BY Cot1, Cot2;",
            "SELECT KhachHang, COUNT(ID) AS SoDonHang\n"
            + "FROM DonHang\n"
            + "GROUP BY KhachHang;",
            "SELECT KhachHang, SUM(SoLuong) AS TongSoLuong\n"
            + "FROM DonHang\n"
            + "GROUP BY KhachHang;"
        });

        Code_MAP.put("Hàm tổng hợp", new String[]{
            "SELECT SanPham, SUM(SoLuong) AS TongSoLuong\n"
            + "FROM DonHang\n"
            + "GROUP BY SanPham;",
            "SELECT SanPham, COUNT(DISTINCT KhachHang) AS SoKhachHang\n"
            + "FROM DonHang\n"
            + "GROUP BY SanPham;"
        });

        Code_MAP.put("HAVING", new String[]{
            "SELECT Cot1, Ham_Tong_Hop(Cot2)\n"
            + "FROM TenBang\n"
            + "GROUP BY Cot1\n"
            + "HAVING DieuKien;",
            "SELECT KhachHang, COUNT(ID) AS SoDonHang\n"
            + "FROM DonHang\n"
            + "GROUP BY KhachHang\n"
            + "HAVING COUNT(ID) >= 2;",
            "SELECT SanPham, SUM(SoLuong) AS TongSoLuong\n"
            + "FROM DonHang\n"
            + "GROUP BY SanPham\n"
            + "HAVING SUM(SoLuong) > 2;"
        });

        Code_MAP.put("UPPER, LOWER", new String[]{
            "SELECT ID, UPPER(TenKhachHang) AS TenHoa\n"
            + "FROM KhachHang;",
            "SELECT ID, LOWER(TenKhachHang) AS TenThuong\n"
            + "FROM KhachHang;"
        });

        Code_MAP.put("SUBSTRING", new String[]{
            "SELECT ID, TenKhachHang, SUBSTRING(TenKhachHang, 1, 3) AS Chuoicat\n"
            + "FROM KhachHang;"
        });

        Code_MAP.put("ROUND", new String[]{
            "SELECT ID, GiaTri, ROUND(GiaTri, 2) AS GiaTriLamTron\n"
            + "FROM DonHang;"
        });

        Code_MAP.put("NOW, DATE_FORMAT", new String[]{
            "SELECT NOW() AS ThoidianHienTai;",
            "SELECT NOW() AS Goc, DATE_FORMAT(NOW(), '%d-%m-%Y') AS DinhDangNgay;",
            "SELECT DATE_FORMAT(NgayMua, '%d/%m/%Y') AS NgayMuaFormatted \n"
            + "FROM DonHang;"
        });

        Code_MAP.put("SELECT INTO", new String[]{
            "SELECT * INTO ten_bang_moi"
            + "FROM ten_bang_cu"
            + "WHERE dieu_kien;",
            "SELECT * INTO KhachHangSaoluu "
            + "FROM KhachHang "
            + "WHERE ID < 3;"
        });

        Code_MAP.put("INSERT INTO SELECT", new String[]{
            "INSERT INTO ten_bang_dich (cot1, cot2, ...)\n"
            + "SELECT cot1, cot2, ... "
            + "FROM ten_bang_nguon "
            + "WHERE dieu_kien;",
            "INSERT INTO KhachHangLuuTru (ID, TenKhachHang, Email)\n"
            + "SELECT ID, TenKhachHang, Email "
            + "FROM KhachHang "
            + "WHERE ID < 3;"
        });

        Code_MAP.put("CASE", new String[]{
            "SELECT cot,\n"
            + "    CASE\n"
            + "        WHEN dieu_kien_1 THEN gia_tri_1\n"
            + "        WHEN dieu_kien_2 THEN gia_tri_2\n"
            + "        ELSE gia_tri_mac_dinh\n"
            + "    END AS cot_moi\n"
            + "FROM ten_bang;",
            "SELECT ID, TenKhachHang, DiemTichLuy,\n"
            + "    CASE\n"
            + "        WHEN DiemTichLuy >= 1000 THEN 'VIP'\n"
            + "        WHEN DiemTichLuy >= 500 THEN 'Thành viên thường'\n"
            + "        ELSE 'Khách mới'\n"
            + "    END AS LoaiKhachHang\n"
            + "FROM KhachHang; ",
            "SELECT ID,\n"
            + "    CASE TrangThai\n"
            + "        WHEN 1 THEN 'Chờ xử lý'\n"
            + "        WHEN 2 THEN 'Đang giao hàng'\n"
            + "        WHEN 3 THEN 'Đã giao hàng'\n"
            + "        ELSE 'Không xác định'\n"
            + "    END AS TrangThaiDonHang\n"
            + "FROM DonHang;"
        });

        Code_MAP.put("Tạo và sử dụng PROCEDURE", new String[]{
            "CREATE PROCEDURE ten_procedure\n"
            + "AS\n"
            + "BEGIN\n"
            + "    -- Câu lệnh SQL thực thi\n"
            + "END;",
            "CREATE PROCEDURE GetAllKhachHang\n"
            + "AS\n"
            + "BEGIN\n"
            + "    SELECT * FROM KhachHang;\n"
            + "END;",
            "EXEC GetAllKhachHang;"
        });

        Code_MAP.put("Truyền tham số vào PROCEDURE", new String[]{
            "CREATE PROCEDURE ten_procedure (@tham_so KieuDulieu)\n"
            + "AS\n"
            + "BEGIN\n"
            + "    -- Câu lệnh SQL sử dụng tham số\n"
            + "END;",
            "CREATE PROCEDURE GetKhachHangByID\n"
            + "    @ID INT\n"
            + "AS\n"
            + "BEGIN\n"
            + "    SELECT * FROM KhachHang WHERE ID = @ID;\n"
            + "END;",
            "EXEC GetKhachHangByID @ID = 2;",
            "CREATE PROCEDURE UpdateKhachHangEmail\n"
            + "    @ID INT,\n"
            + "    @EmailMoi VARCHAR(100)\n"
            + "AS\n"
            + "BEGIN\n"
            + "    UPDATE KhachHang\n"
            + "    SET Email = @EmailMoi\n"
            + "    WHERE ID = @ID;\n"
            + "END;",
            "EXEC UpdateKhachHangEmail @ID = 1, @EmailMoi = 'newemail@gmail.com';"
        });

        Code_MAP.put("Lợi ích và ứng dụng thực tế", new String[]{});

        Code_MAP.put("Phòng chống SQL Injection", new String[]{
            "SELECT * FROM Users WHERE username = 'admin' AND password = '123456';",
            "OR '1'='1';",
            "SELECT * FROM Users WHERE username = 'admin' AND password = '' OR '1'='1';",
            "$stmt = $conn->prepare(\"SELECT * FROM Users WHERE username = ? AND password = ?\");\n"
            + "$stmt->bind_param(\"ss\", $username, $password);\n"
            + "$stmt->execute();",
            "CREATE PROCEDURE CheckLogin(@username NVARCHAR(50), @password NVARCHAR(50))\n"
            + "AS\n"
            + "BEGIN\n"
            + "    SELECT * FROM Users WHERE username = @username AND password = @password;\n"
            + "END;",
            "GRANT SELECT ON Users TO web_user;",
            "REVOKE DELETE ON Users FROM web_user;"
        });

        Code_MAP.put("Nguyên tắc Least Privilege", new String[]{
            "CREATE USER 'report_user'@'localhost' IDENTIFIED BY 'password';\n"
            + "GRANT SELECT ON Sales TO report_user;"
        });

        Code_MAP.put("PARTITIONING, HASH PARTITIONING", new String[]{
            "CREATE TABLE Orders (\n"
            + "    order_id INT,\n"
            + "    order_date DATE,\n"
            + "    total_amount DECIMAL(10,2)\n"
            + ")\n"
            + "PARTITION BY RANGE(YEAR(order_date)) (\n"
            + "    PARTITION p2019 VALUES LESS THAN (2020),\n"
            + "    PARTITION p2020 VALUES LESS THAN (2021),\n"
            + "    PARTITION p2021 VALUES LESS THAN (2022)\n"
            + ");",
            "CREATE TABLE Customers (\n"
            + "    customer_id INT,\n"
            + "    customer_name VARCHAR(100),\n"
            + "    region VARCHAR(50)\n"
            + ")\n"
            + "PARTITION BY LIST(region) (\n"
            + "    PARTITION pNorth VALUES IN ('North', 'Central'),\n"
            + "    PARTITION pSouth VALUES IN ('South')\n"
            + ");",
            "CREATE TABLE Users (\n"
            + "    user_id INT,\n"
            + "    user_name VARCHAR(100)\n"
            + ")\n"
            + "PARTITION BY HASH(user_id) PARTITIONS 4;"
        });

        Code_MAP.put("SHARDING", new String[]{
            "server_id = user_id % 3 -- Phân bố dữ liệu vào 3 server khác nhau"
        });

        Code_MAP.put("BATCH PROCESSING", new String[]{
            "UPDATE Orders SET status = 'Shipped' WHERE order_id = 101;\n"
            + "UPDATE Orders SET status = 'Shipped' WHERE order_id = 102;\n"
            + "UPDATE Orders SET status = 'Shipped' WHERE order_id = 103;",
            "UPDATE Orders SET status = 'Shipped' WHERE order_id IN (101, 102, 103);",
            "INSERT INTO Products (id, name, price) VALUES (1, 'A', 100);\n"
            + "INSERT INTO Products (id, name, price) VALUES (2, 'B', 200);\n"
            + "INSERT INTO Products (id, name, price) VALUES (3, 'C', 300);",
            "INSERT INTO Products (id, name, price) VALUES\n"
            + "(1, 'A', 100),\n"
            + "(2, 'B', 200),\n"
            + "(3, 'C', 300);",
            "DELETE FROM Logs WHERE created_at < '2023-01-01' LIMIT 1000;"
        });

        Code_MAP.put("RECURSIVE QUERIES", new String[]{
            "WITH RECURSIVE EmployeeHierarchy AS (\n"
            + "    -- Anchor member: Lấy nhân viên cấp cao nhất (không có manager)\n"
            + "    SELECT emp_id, emp_name, manager_id, 1 AS level\n"
            + "    FROM Employees\n"
            + "    WHERE manager_id IS NULL\n"
            + "    \n"
            + "    UNION ALL\n"
            + "    \n"
            + "    -- Recursive member: Lấy các nhân viên cấp dưới\n"
            + "    SELECT e.emp_id, e.emp_name, e.manager_id, eh.level + 1\n"
            + "    FROM Employees e\n"
            + "    INNER JOIN EmployeeHierarchy eh ON e.manager_id = eh.emp_id\n"
            + ")\n"
            + "SELECT * FROM EmployeeHierarchy;"
        });

        Code_MAP.put("Biểu thức CTE", new String[]{
            "WITH MonthlySales AS (\n"
            + "    SELECT\n"
            + "        MONTH(order_date) AS month,\n"
            + "        SUM(total_amount) AS total_sales\n"
            + "    FROM Orders\n"
            + "    GROUP BY MONTH(order_date)\n"
            + ")\n"
            + "SELECT * FROM MonthlySales;"
        });

        Code_MAP.put("WINDOW FUNCTIONS", new String[]{
            "SELECT\n"
            + "    emp_id, emp_name,\n"
            + "    department,\n"
            + "    SUM(sales) OVER (PARTITION BY department) AS total_sales,\n"
            + "    RANK() OVER (PARTITION BY department ORDER BY sales DESC) AS rank_in_dept\n"
            + "FROM Employees;"
        });

        Code_MAP.put("Dynamic SQL", new String[]{
            "SET @tableName = 'Employees';\n"
            + "SET @sql = CONCAT('SELECT * FROM ', @tableName);\n"
            + "\n"
            + "PREPARE stmt FROM @sql;\n"
            + "EXECUTE stmt;\n"
            + "DEALLOCATE PREPARE stmt;"
        });

        Code_MAP.put("MySQL", new String[]{
            "CREATE TABLE users (\n"
            + "    id INT AUTO_INCREMENT PRIMARY KEY,\n"
            + "    name VARCHAR(100) NOT NULL\n"
            + ");",
            "SELECT * FROM users LIMIT 5;"
        });

        Code_MAP.put("SQL Server", new String[]{
            "SELECT TOP 5 * FROM Employees;",
            "CREATE PROCEDURE GetEmployees\n"
            + "AS\n"
            + "BEGIN\n"
            + "    SELECT * FROM Employees;\n"
            + "END;"
        });

        Code_MAP.put("PostgreSQL", new String[]{
            "SELECT '{\"name\": \"John\", \"age\": 30}'::jsonb ->> 'name';",
            "SELECT * FROM A\n"
            + "FULL OUTER JOIN B ON A.id = B.id;"
        });
        Code_MAP.put("Oracle", new String[]{
            "DECLARE  \n"
            + "v_name VARCHAR2(50);  \n"
            + "BEGIN  \n"
            + "SELECT name INTO v_name FROM employees WHERE id = 1;  \n"
            + "DBMS_OUTPUT.PUT_LINE('Tên nhân viên: ' || v_name);  \n"
            + "END;",
            "CREATE SEQUENCE user_seq START WITH 1 INCREMENT BY 1;"
        });

        Code_MAP.put("IDE cho SQL", new String[]{
            "SELECT name, email "
            + "FROM users "
            + "WHERE active = 1;"
        });

        Code_MAP.put("Công cụ GUI", new String[]{
            "CREATE TABLE Customers (\n"
            + "    CustomerID INT IDENTITY(1,1) PRIMARY KEY,\n"
            + "    CustomerName NVARCHAR(100) NOT NULL,\n"
            + "    Email NVARCHAR(255) NULL,\n"
            + "    RegistrationDate DATETIME DEFAULT GETDATE()\n"
            + ");"
        });

        Code_MAP.put("ORM", new String[]{
            "from sqlalchemy import create_engine\n"
            + "\n"
            + "# Tạo kết nối đến MySQL\n"
            + "engine = create_engine('mysql://user:pass@localhost/db_name')\n"
            + "\n"
            + "# Thực thi truy vấn\n"
            + "result = engine.execute(\"SELECT * FROM users\")\n"
            + "\n"
            + "# Lặp qua kết quả\n"
            + "for row in result:\n"
            + "    print(row)"
        });

        Code_MAP.put("Công cụ tối ưu hiệu suất", new String[]{
            "EXPLAIN SELECT * "
            + "FROM users "
            + "WHERE email = 'test@example.com';"
        });

        //Python
        Code_MAP.put("Giới thiệu về Python", new String[]{});

        Code_MAP.put("Lịch sử phát triển", new String[]{});

        Code_MAP.put("Lý do chọn Python", new String[]{});

        Code_MAP.put("Cấu trúc chương trình Python", new String[]{
            "#!/usr/bin/env python3\n"
            + "# -*- coding: utf-8 -*-",
            "Tên module: calculator.py\n"
            + "Mô tả: Chương trình máy tính đơn giản với các chức năng cơ bản\n"
            + "Tác giả: Nguyễn Văn A\n"
            + "Ngày tạo: 20/10/2023\n"
            + "Phiên bản: 1.0",
            "# Thư viện chuẩn\n"
            + "import math\n"
            + "import sys\n"
            + "from datetime import datetime, timedelta\n"
            + "\n"
            + "# Thư viện bên thứ ba\n"
            + "import numpy as np\n"
            + "import pandas as pd\n"
            + "from flask import Flask\n"
            + "\n"
            + "# Thư viện tự viết\n"
            + "from .utils import helper_functions",
            "# Cấu hình chương trình\n"
            + "MAX_ATTEMPTS = 3\n"
            + "TIMEOUT = 30.0\n"
            + "API_URL = \"https://api.example.com/v1\"\n"
            + "\n"
            + "# Hằng số toán học\n"
            + "PI = 3.141592653589793\n"
            + "GOLDEN_RATIO = 1.618033988749895",
            "class ScientificCalculator:\n"
            + "    \"\"\"Lớp máy tính khoa học với các hàm nâng cao\"\"\"\n"
            + "    \n"
            + "    CLASS_VERSION = \"1.2\"  # Biến class\n"
            + "    \n"
            + "    def __init__(self, model):\n"
            + "        \"\"\"Hàm khởi tạo\"\"\"\n"
            + "        self.model = model\n"
            + "        self.last_result = None\n"
            + "    \n"
            + "    def factorial(self, n):\n"
            + "        \"\"\"Tính giai thừa với kiểm tra đầu vào\"\"\"\n"
            + "        if not isinstance(n, int) or n < 0:\n"
            + "            raise ValueError(\"Input must be non-negative integer\")\n"
            + "        return math.factorial(n)\n"
            + "    \n"
            + "    @staticmethod\n"
            + "    def circle_area(radius):\n"
            + "        \"\"\"Tính diện tích hình tròn\"\"\"\n"
            + "        return PI * (radius ** 2)",
            "def quadratic_equation(a, b, c):\n"
            + "    \"\"\"\n"
            + "    Giải phương trình bậc 2: ax² + bx + c = 0\n"
            + "    Trả về tuple nghiệm (x1, x2)\n"
            + "    \"\"\"\n"
            + "    discriminant = b**2 - 4*a*c\n"
            + "    \n"
            + "    if discriminant < 0:\n"
            + "        raise ValueError(\"Phương trình vô nghiệm thực\")\n"
            + "    \n"
            + "    x1 = (-b + math.sqrt(discriminant)) / (2*a)\n"
            + "    x2 = (-b - math.sqrt(discriminant)) / (2*a)\n"
            + "    \n"
            + "    return x1, x2",
            "def main():\n"
            + "    \"\"\"Hàm chính thực thi chương trình\"\"\"\n"
            + "    print(\"CHƯƠNG TRÌNH MÁY TÍNH KHOA HỌC\")\n"
            + "    calc = ScientificCalculator(\"FX-9000\")\n"
            + "    \n"
            + "    try:\n"
            + "        result = calc.factorial(5)\n"
            + "        print(f\"5! = {result}\")\n"
            + "        \n"
            + "        x1, x2 = quadratic_equation(1, -5, 6)\n"
            + "        print(f\"Nghiệm phương trình: {x1}, {x2}\")\n"
            + "        \n"
            + "    except Exception as e:\n"
            + "        print(f\"Lỗi: {str(e)}\", file=sys.stderr)\n"
            + "        sys.exit(1)\n"
            + "\n"
            + "if __name__ == \"__main__\":\n"
            + "    main()\n"
            + "    print(\"Kết thúc chương trình\")",
            "# Kiểm tra unit test (có thể tách file riêng)\n"
            + "def test_factorial():\n"
            + "    assert ScientificCalculator(\"Test\").factorial(5) == 120\n"
            + "\n"
            + "# Code để chạy khi import như module\n"
            + "INIT_DATA = {\"version\": \"1.0\", \"author\": \"Nguyễn Văn A\"}\n"
            + "\n"
            + "# Cấu hình logging\n"
            + "import logging\n"
            + "logging.basicConfig(level=logging.INFO)\n"
            + "logger = logging.getLogger(__name__)",
            "my_project/\n"
            + "├── main.py                # Điểm vào chính\n"
            + "├── config.py              # Biến cấu hình\n"
            + "├── requirements.txt       # Thư viện cần cài\n"
            + "├── docs/                  # Tài liệu\n"
            + "├── tests/                 # Kiểm thử\n"
            + "│   ├── test_calculator.py\n"
            + "├── utils/                 # Tiện ích\n"
            + "│   ├── __init__.py\n"
            + "│   ├── helpers.py\n"
            + "└── data/                  # Dữ liệu",
            "def greet(name: str) -> str:\n"
            + "    return f\"Hello, {name}\""
        });

        Code_MAP.put("Cài đặt môi trường và IDE", new String[]{
            "python --version\n"
            + "pip --version",
            "# macOS (sử dụng Homebrew)\n"
            + "brew install python\n"
            + "\n"
            + "# Linux (Ubuntu/Debian)\n"
            + "sudo apt update\n"
            + "sudo apt install python3 python3-pip python3-venv",
            "# Tạo môi trường\n"
            + "python -m venv .venv\n"
            + "\n"
            + "# Kích hoạt trên Windows\n"
            + ".venv\\Scripts\\activate\n"
            + "\n"
            + "# Kích hoạt trên macOS/Linux\n"
            + "source .venv/bin/activate",
            "(.venv) C:\\your_project>",
            "python -m pip install --upgrade pip\n"
            + "pip install wheel setuptools",
            "# requirements.txt\n"
            + "flask==2.3.2\n"
            + "numpy>=1.24.0\n"
            + "pandas<2.0.0",
            "pip install -r requirements.txt",
            "pip freeze > requirements.txt",
            "# Trên macOS/Linux\n"
            + "brew install pyenv\n"
            + "\n"
            + "# Liệt kê các phiên bản có sẵn\n"
            + "pyenv install --list\n"
            + "\n"
            + "# Cài đặt phiên bản cụ thể\n"
            + "pyenv install 3.11.4\n"
            + "\n"
            + "# Thiết lập phiên bản mặc định\n"
            + "pyenv global 3.11.4",
            "pip install poetry\n"
            + "poetry init  # Tạo pyproject.toml\n"
            + "poetry add flask numpy  # Thêm package\n"
            + "poetry install  # Cài đặt dependencies",
            "import sys\n"
            + "print(f\"Python version: {sys.version}\")\n"
            + "print(f\"Virtualenv: {'running in' if hasattr(sys, 'real_prefix') else 'not active'}\")",
            "python test.py",
            "Python version: 3.11.4 (main, Jun  6 2023, 10:13:20) [Clang 14.0.3...]\n"
            + "Virtualenv: running in",
            "sudo chown -R $(whoami) /usr/local/*",
            "pip install --trusted-host pypi.org --trusted-host files.pythonhosted.org package_name",
            //IDE
            "# Trên macOS (dùng Homebrew):\n"
            + "brew install --cask pycharm-ce\n"
            + "\n"
            + "# Trên Windows:\n"
            + "# Tải từ https://www.jetbrains.com/pycharm/download/",
            "pip install jupyterlab\n"
            + "jupyter-lab  # Khởi chạy",
            "pip install spyder\n"
            + "spyder  # Khởi chạy",
            "{\n"
            + "    \"python.linting.enabled\": true,\n"
            + "    \"python.linting.pylintEnabled\": true,\n"
            + "    \"python.formatting.provider\": \"black\",\n"
            + "    \"python.analysis.typeCheckingMode\": \"basic\",\n"
            + "    \"[python]\": {\n"
            + "        \"editor.defaultFormatter\": \"ms-python.black-formatter\"\n"
            + "    }\n"
            + "}",
            "mkdir my_project\n"
            + "cd my_project\n"
            + "python -m venv .venv\n"
            + "code .  # Mở VS Code"
        });

        Code_MAP.put("Biến", new String[]{
            "x = 10          # Biến số nguyên\n"
            + "name = \"Alice\"  # Biến chuỗi\n"
            + "is_active = True # Biến boolean",
            "a = 10       # int\n"
            + "b = 3.14     # float\n"
            + "c = 2 + 3j   # complex",
            "s1 = 'Hello'          # Chuỗi đơn\n"
            + "s2 = \"Python\"         # Chuỗi kép\n"
            + "s3 = \"\"\"Đa dòng\n"
            + "chuỗi\"\"\"              # Chuỗi đa dòng",
            "lst = [1, 2, 3]       # List (thay đổi được)\n"
            + "tup = (4, 5, 6)       # Tuple (không thay đổi)\n"
            + "rng = range(10)       # Range",
            "dict_info = {\"name\": \"Bob\", \"age\": 30}  # Dictionary",
            "set_a = {1, 2, 3}         # Set (không trùng)\n"
            + "frozen_set = frozenset()   # Set không thay đổi",
            "is_valid = True\n"
            + "has_permission = False",
            "global_var = \"Tôi là global\"\n"
            + "\n"
            + "def my_func():\n"
            + "    local_var = \"Tôi là local\"\n"
            + "    print(global_var)  # Truy cập được\n"
            + "    \n"
            + "my_func()\n"
            + "print(local_var)  # Lỗi: không truy cập được",
            "x = \"10\"\n"
            + "num = int(x)        # Chuyển thành số nguyên\n"
            + "pi = float(\"3.14\")  # Chuyển thành số thực\n"
            + "text = str(100)     # Chuyển thành chuỗi",
            "print(type(10))         # <class 'int'>\n"
            + "print(isinstance(3.14, float))  # True",
            "__doc__ = \"Biến tài liệu module\"\n"
            + "__name__ = \"__main__\"  # Tên module khi chạy",
            "del x  # Xóa biến x khỏi bộ nhớ",
            "x = 10      # Ban đầu là int\n"
            + "x = \"Hello\" # Chuyển thành str mà không báo lỗi",
            "x, y, z = 1, 2, 3           # Gán riêng\n"
            + "a = b = c = \"Same value\"     # Gán chung",
            "import os\n"
            + "print(os.getenv(\"PATH\"))  # Truy cập biến môi trường hệ thống",
            "class Person:\n"
            + "    class_var = \"Biến class\"  # Dùng chung\n"
            + "    \n"
            + "    def __init__(self, name):\n"
            + "        self.instance_var = name  # Biến instance",
            "class Vector:\n"
            + "    def __init__(self, x, y):\n"
            + "        self.x = x\n"
            + "        self.y = y\n"
            + "        \n"
            + "    def __str__(self):\n"
            + "        return f\"Vector({self.x}, {self.y})\"",
            "count = 0  # Biến global\n"
            + "\n"
            + "def increment():\n"
            + "    global count  # Khai báo sử dụng global\n"
            + "    count += 1\n"
            + "    \n"
            + "def outer():\n"
            + "    x = \"local\"\n"
            + "    def inner():\n"
            + "        nonlocal x  # Tham chiếu biến outer\n"
            + "        x = \"nonlocal\"",
            "square = lambda x: x ** 2  # x là biến lambda\n"
            + "print(square(5))  # 25",
            "def func(*args, **kwargs):\n"
            + "    print(args)   # Biến tuple chứa tham số vị trí\n"
            + "    print(kwargs) # Biến dict chứa tham số tên",
            "for _ in range(3):  # Biến không sử dụng\n"
            + "    print(\"Hello\")\n"
            + "\n"
            + "x, _, y = (1, 2, 3)  # Bỏ qua giá trị"
        });

        Code_MAP.put("Kiểu dữ liệu", new String[]{
            "a = 10\n"
            + "b = -5\n"
            + "print(type(a))  # <class 'int'>",
            "c = 3.14\n"
            + "d = -0.001\n"
            + "print(type(c))  # <class 'float'>",
            "e = 2 + 3j\n"
            + "print(type(e))  # <class 'complex'>",
            "s1 = \"Hello\"\n"
            + "s2 = 'Python'\n"
            + "s3 = '''Đây là chuỗi\n"
            + "nhiều dòng'''\n"
            + "print(type(s1))  # <class 'str'>",
            "is_active = True\n"
            + "is_admin = False\n"
            + "print(type(is_active))  # <class 'bool'>",
            "my_list = [1, \"Python\", 3.14, True]\n"
            + "my_list[0] = 100  # Thay đổi phần tử\n"
            + "print(type(my_list))  # <class 'list'>",
            "my_tuple = (1, \"Python\", False)\n"
            + "# my_tuple[0] = 100  # Lỗi vì tuple không thể thay đổi\n"
            + "print(type(my_tuple))  # <class 'tuple'>",
            "my_set = {1, 2, 3, 2, 1}  # Kết quả: {1, 2, 3}\n"
            + "print(type(my_set))  # <class 'set'>",
            "my_dict = {\"name\": \"Alice\", \"age\": 25}\n"
            + "print(my_dict[\"name\"])  # Truy cập giá trị qua key\n"
            + "print(type(my_dict))  # <class 'dict'>",
            "x = None\n"
            + "print(type(x))  # <class 'NoneType'>",
            "data = b\"Hello\"  # Kiểu bytes (immutable)\n"
            + "data_arr = bytearray(b\"Hello\")  # Kiểu bytearray (mutable)",
            "class Person:\n"
            + "    def __init__(self, name):\n"
            + "        self.name = name\n"
            + "\n"
            + "p = Person(\"Alice\")\n"
            + "print(type(p))  # <class '__main__.Person'>",
            "x = 10\n"
            + "print(type(x) == int)  # True\n"
            + "print(isinstance(x, int))  # True"
        });

        Code_MAP.put("Toán tử", new String[]{
            "print(5 + 3)   # 8\n"
            + "print(10 / 3)  # 3.333...\n"
            + "print(10 // 3) # 3\n"
            + "print(2 ** 3)  # 8 (2^3)",
            "print(5 == 5)  # True\n"
            + "print(3 != 2)  # True\n"
            + "print(10 > 7)  # True",
            "x = 10\n"
            + "x += 5  # x = x + 5 → 15\n"
            + "print(x)  # 15",
            "print(True and False)  # False\n"
            + "print(True or False)   # True\n"
            + "print(not True)        # False",
            "print(5 & 3)   # 1 (0101 & 0011 = 0001)\n"
            + "print(5 | 3)   # 7 (0101 | 0011 = 0111)\n"
            + "print(5 << 1)  # 10 (0101 → 1010)",
            "numbers = [1, 2, 3]\n"
            + "print(2 in numbers)      # True\n"
            + "print(5 not in numbers)  # True",
            "x = [1, 2, 3]\n"
            + "y = x\n"
            + "z = [1, 2, 3]\n"
            + "\n"
            + "print(x is y)      # True (cùng tham chiếu)\n"
            + "print(x is z)      # False (khác đối tượng)"
        });

        Code_MAP.put("Nhập xuất dữ liệu", new String[]{
            "print(\"Hello, Python!\")  # In chuỗi\n"
            + "print(10 + 5)           # In kết quả tính toán\n"
            + "print(\"Giá trị là:\", 100)  # In nhiều giá trị",
            "name = \"Alice\"\n"
            + "age = 25\n"
            + "print(f\"Tên: {name}, Tuổi: {age}\")  # Tên: Alice, Tuổi: 25",
            "print(\"Tên: {}, Tuổi: {}\".format(name, age))",
            "name = input(\"Nhập tên của bạn: \")  # Nhập chuỗi\n"
            + "print(\"Xin chào,\", name)\n"
            + "\n"
            + "age = int(input(\"Nhập tuổi: \"))     # Ép kiểu sang int\n"
            + "print(\"Tuổi của bạn là:\", age)",
            "try:\n"
            + "    num = float(input(\"Nhập một số: \"))\n"
            + "    print(\"Số đã nhập:\", num)\n"
            + "except ValueError:\n"
            + "    print(\"Lỗi: Vui lòng nhập số hợp lệ!\")",
            "with open(\"data.txt\", \"w\", encoding=\"utf-8\") as f:\n"
            + "    f.write(\"Xin chào Python!\\n\")\n"
            + "    f.write(\"Dòng thứ hai\\n\")",
            "with open(\"data.txt\", \"r\", encoding=\"utf-8\") as f:\n"
            + "    content = f.read()\n"
            + "    print(content)",
            "with open(\"data.txt\", \"r\", encoding=\"utf-8\") as f:\n"
            + "    for line in f:\n"
            + "        print(line.strip())  # strip() để bỏ ký tự xuống dòng"
        });

        Code_MAP.put("Cấu trúc điều kiện", new String[]{
            "if điều_kiện:\n"
            + "    # Khối lệnh thực thi nếu điều_kiện là True",
            "age = 20\n"
            + "if age >= 18:\n"
            + "    print(\"Bạn đủ tuổi bầu cử\")",
            "if điều_kiện:\n"
            + "    # Khối lệnh nếu điều_kiện đúng\n"
            + "else:\n"
            + "    # Khối lệnh nếu điều_kiện sai",
            "tuoi = 16\n"
            + "if tuoi >= 18:\n"
            + "    print(\"Bạn được xem phim 18+\")\n"
            + "else:\n"
            + "    print(\"Bạn chưa đủ tuổi!\")",
            "if điều_kiện_1:\n"
            + "    # Khối lệnh 1\n"
            + "elif điều_kiện_2:\n"
            + "    # Khối lệnh 2\n"
            + "...\n"
            + "else:\n"
            + "    # Khối lệnh mặc định (nếu tất cả sai)",
            "diem = 85\n"
            + "if diem >= 90:\n"
            + "    print(\"Giỏi\")\n"
            + "elif diem >= 80:\n"
            + "    print(\"Khá\")  # Được thực thi\n"
            + "elif diem >= 70:\n"
            + "    print(\"Trung bình\")\n"
            + "else:\n"
            + "    print(\"Yếu\")",
            "if điều_kiện_1:\n"
            + "    if điều_kiện_2:\n"
            + "        # Khối lệnh nếu cả 2 điều kiện đúng\n"
            + "    else:\n"
            + "        # Khối lệnh nếu điều_kiện_1 đúng, điều_kiện_2 sai\n"
            + "else:\n"
            + "    # Khối lệnh nếu điều_kiện_1 sai",
            "so = 12\n"
            + "if so > 10:\n"
            + "    print(\"Số lớn hơn 10\")\n"
            + "    if so % 2 == 0:\n"
            + "        print(\"Và là số chẵn\")  # Được thực thi\n"
            + "    else:\n"
            + "        print(\"Và là số lẻ\")\n"
            + "else:\n"
            + "    print(\"Số <= 10\")",
            "Số lớn hơn 10\n"
            + "Và là số chẵn",
            "biến = giá_trị_1 if điều_kiện else giá_trị_2",
            "x = 10\n"
            + "loai = \"Lớn\" if x > 5 else \"Nhỏ\"\n"
            + "print(loai)  # Kết quả: \"Lớn\"",
            "username = \"admin\"\n"
            + "password = \"123456\"\n"
            + "\n"
            + "if username == \"admin\" and password == \"123456\":\n"
            + "    print(\"Đăng nhập thành công\")  # Được thực thi\n"
            + "else:\n"
            + "    print(\"Sai thông tin\")\n"
            + "\n"
            + "if (1 == 1) or (2 > 3):\n"
            + "    print(\"Ít nhất 1 điều kiện đúng\")  # Được thực thi",
            "thang = 2\n"
            + "if thang in [1, 3, 5, 7, 8, 10, 12]:\n"
            + "    print(\"Tháng có 31 ngày\")\n"
            + "elif thang == 2:\n"
            + "    print(\"Tháng 2 có 28/29 ngày\")  # Được thực thi\n"
            + "else:\n"
            + "    print(\"Tháng có 30 ngày\")",
            "x = 3.14\n"
            + "if isinstance(x, int):\n"
            + "    print(\"Số nguyên\")\n"
            + "elif isinstance(x, float):\n"
            + "    print(\"Số thực\")  # Được thực thi"
        });

        Code_MAP.put("Vòng lặp", new String[]{
            "for biến in iterable:\n"
            + "    # Khối lệnh thực thi",
            "# Lặp qua list\n"
            + "fruits = [\"apple\", \"banana\", \"cherry\"]\n"
            + "for fruit in fruits:\n"
            + "    print(fruit)\n"
            + "\n"
            + "# Lặp qua string\n"
            + "for char in \"Python\":\n"
            + "    print(char)\n"
            + "\n"
            + "# Lặp với range()\n"
            + "for i in range(5):  # 0 đến 4\n"
            + "    print(i)",
            "while điều_kiện:\n"
            + "    # Khối lệnh thực thi",
            "# Đếm ngược\n"
            + "count = 5\n"
            + "while count > 0:\n"
            + "    print(count)\n"
            + "    count -= 1\n"
            + "\n"
            + "# Nhập dữ liệu cho đến khi hợp lệ\n"
            + "while True:\n"
            + "    age = input(\"Nhập tuổi của bạn: \")\n"
            + "    if age.isdigit():\n"
            + "        break\n"
            + "    print(\"Vui lòng nhập số!\")",
            "for i in range(10):\n"
            + "    if i == 5:\n"
            + "        break\n"
            + "    print(i)  # Chỉ in 0-4",
            "for i in range(5):\n"
            + "    if i == 2:\n"
            + "        continue\n"
            + "    print(i)  # Bỏ qua số 2",
            "for i in range(3):\n"
            + "    print(i)\n"
            + "else:\n"
            + "    print(\"Vòng lặp kết thúc\")\n"
            + "\n"
            + "# Khi có break thì else không chạy\n"
            + "for i in range(3):\n"
            + "    if i == 1:\n"
            + "        break\n"
            + "    print(i)\n"
            + "else:\n"
            + "    print(\"Không chạy vào đây\")",
            "# In bảng cửu chương\n"
            + "for i in range(1, 10):\n"
            + "    for j in range(1, 11):\n"
            + "        print(f\"{i} x {j} = {i*j}\")\n"
            + "    print()  # Xuống dòng sau mỗi bảng",
            "fruits = [\"apple\", \"banana\", \"cherry\"]\n"
            + "for index, fruit in enumerate(fruits):\n"
            + "    print(f\"Vị trí {index}: {fruit}\")",
            "names = [\"An\", \"Bình\", \"Châu\"]\n"
            + "scores = [8.5, 9.0, 7.5]\n"
            + "for name, score in zip(names, scores):\n"
            + "    print(f\"{name}: {score} điểm\")",
            "# Tạo list bình phương\n"
            + "squares = [x**2 for x in range(10)]\n"
            + "\n"
            + "# Tạo list với điều kiện\n"
            + "even_squares = [x**2 for x in range(10) if x % 2 == 0]"
        });

        Code_MAP.put("Danh sách", new String[]{
            "# Danh sách rỗng\n"
            + "empty_list = []\n"
            + "\n"
            + "# Danh sách số nguyên\n"
            + "numbers = [1, 2, 3, 4, 5]\n"
            + "\n"
            + "# Danh sách hỗn hợp\n"
            + "mixed_list = [1, \"hello\", 3.14, True]\n"
            + "\n"
            + "# Danh sách lồng nhau\n"
            + "nested_list = [[1, 2], [3, 4], [5, 6]]",
            "fruits = [\"apple\", \"banana\", \"cherry\", \"orange\"]\n"
            + "\n"
            + "# Truy cập phần tử\n"
            + "print(fruits[0])    # \"apple\"\n"
            + "print(fruits[-1])   # \"orange\"\n"
            + "\n"
            + "# Truy cập phần tử trong list lồng nhau\n"
            + "matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]\n"
            + "print(matrix[1][2])  # 6",
            "numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]\n"
            + "\n"
            + "# Lấy từ vị trí 2 đến 5\n"
            + "print(numbers[2:6])    # [2, 3, 4, 5]\n"
            + "\n"
            + "# Lấy từ đầu đến vị trí 4\n"
            + "print(numbers[:5])     # [0, 1, 2, 3, 4]\n"
            + "\n"
            + "# Lấy từ vị trí 5 đến cuối\n"
            + "print(numbers[5:])     # [5, 6, 7, 8, 9]\n"
            + "\n"
            + "# Lấy mọi phần tử cách nhau 2 vị trí\n"
            + "print(numbers[::2])    # [0, 2, 4, 6, 8]\n"
            + "\n"
            + "# Đảo ngược danh sách\n"
            + "print(numbers[::-1])   # [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]",
            "fruits = [\"apple\", \"banana\"]\n"
            + "\n"
            + "# Thêm vào cuối\n"
            + "fruits.append(\"orange\")    # [\"apple\", \"banana\", \"orange\"]\n"
            + "\n"
            + "# Thêm tại vị trí xác định\n"
            + "fruits.insert(1, \"kiwi\")  # [\"apple\", \"kiwi\", \"banana\", \"orange\"]\n"
            + "\n"
            + "# Thêm nhiều phần tử\n"
            + "fruits.extend([\"grape\", \"mango\"])  # [\"apple\", \"kiwi\", \"banana\", \"orange\", \"grape\", \"mango\"]",
            "numbers = [1, 2, 3, 4, 5, 6]\n"
            + "\n"
            + "# Xóa theo giá trị\n"
            + "numbers.remove(3)    # [1, 2, 4, 5, 6]\n"
            + "\n"
            + "# Xóa theo vị trí\n"
            + "del numbers[1]       # [1, 4, 5, 6]\n"
            + "popped = numbers.pop(2)  # popped = 5, numbers = [1, 4, 6]\n"
            + "\n"
            + "# Xóa toàn bộ\n"
            + "numbers.clear()      # []",
            "nums = [1, 2, 3, 2, 4]\n"
            + "\n"
            + "# Đếm số lần xuất hiện\n"
            + "print(nums.count(2))    # 2\n"
            + "\n"
            + "# Tìm vị trí đầu tiên\n"
            + "print(nums.index(3))    # 2\n"
            + "\n"
            + "# Sắp xếp\n"
            + "nums.sort()             # [1, 2, 2, 3, 4]\n"
            + "nums.sort(reverse=True) # [4, 3, 2, 2, 1]\n"
            + "\n"
            + "# Đảo ngược\n"
            + "nums.reverse()          # [1, 2, 2, 3, 4]\n"
            + "\n"
            + "# Tạo bản sao\n"
            + "copy_nums = nums.copy()",
            "a = [1, 2, 3]\n"
            + "b = [4, 5, 6]\n"
            + "\n"
            + "# Nối list\n"
            + "c = a + b    # [1, 2, 3, 4, 5, 6]\n"
            + "\n"
            + "# Lặp list\n"
            + "d = a * 2    # [1, 2, 3, 1, 2, 3]\n"
            + "\n"
            + "# Kiểm tra tồn tại\n"
            + "print(2 in a)    # True\n"
            + "print(7 not in a) # True",
            "# Tạo list bình phương\n"
            + "squares = [x**2 for x in range(10)]\n"
            + "\n"
            + "# Tạo list số chẵn\n"
            + "evens = [x for x in range(20) if x % 2 == 0]\n"
            + "\n"
            + "# Biến đổi phần tử\n"
            + "words = [\"hello\", \"world\", \"python\"]\n"
            + "upper_words = [word.upper() for word in words]\n"
            + "\n"
            + "# List comprehension lồng nhau\n"
            + "matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]\n"
            + "flatten = [num for row in matrix for num in row]",
            "numbers = [5, 2, 8, 1, 9]\n"
            + "\n"
            + "# Độ dài list\n"
            + "print(len(numbers))    # 5\n"
            + "\n"
            + "# Giá trị lớn nhất/nhỏ nhất\n"
            + "print(max(numbers))    # 9\n"
            + "print(min(numbers))    # 1\n"
            + "\n"
            + "# Tổng các phần tử\n"
            + "print(sum(numbers))    # 25\n"
            + "\n"
            + "# Kiểm tra tất cả/bất kỳ\n"
            + "print(all(x > 0 for x in numbers))  # True (tất cả > 0)\n"
            + "print(any(x > 8 for x in numbers))  # True (có số 9 > 8)",
            "colors = [\"red\", \"green\", \"blue\"]\n"
            + "\n"
            + "# Dùng for thông thường\n"
            + "for color in colors:\n"
            + "    print(color)\n"
            + "\n"
            + "# Dùng for với enumerate\n"
            + "for index, color in enumerate(colors):\n"
            + "    print(f\"Vị trí {index}: {color}\")\n"
            + "\n"
            + "# Dùng while\n"
            + "i = 0\n"
            + "while i < len(colors):\n"
            + "    print(colors[i])\n"
            + "    i += 1",
            "# Xử lý điểm số\n"
            + "scores = [7.5, 8.0, 6.5, 9.0, 5.5]\n"
            + "average = sum(scores) / len(scores)\n"
            + "above_avg = [score for score in scores if score > average]\n"
            + "\n"
            + "# Ma trận\n"
            + "matrix = [\n"
            + "    [1, 2, 3],\n"
            + "    [4, 5, 6],\n"
            + "    [7, 8, 9]\n"
            + "]\n"
            + "transpose = [[row[i] for row in matrix] for i in range(3)]\n"
            + "\n"
            + "# Stack và Queue\n"
            + "stack = []\n"
            + "stack.append(1)  # push\n"
            + "stack.append(2)\n"
            + "top = stack.pop() # pop -> 2\n"
            + "\n"
            + "queue = []\n"
            + "queue.append(1)   # enqueue\n"
            + "queue.append(2)\n"
            + "front = queue.pop(0) # dequeue -> 1"
        });

        Code_MAP.put("Tuple", new String[]{
            "# Tuple rỗng\n"
            + "empty_tuple = ()\n"
            + "\n"
            + "# Tuple chứa số nguyên\n"
            + "numbers = (1, 2, 3, 4, 5)\n"
            + "\n"
            + "# Tuple hỗn hợp kiểu dữ liệu\n"
            + "mixed_tuple = (1, \"hello\", 3.14, True)\n"
            + "\n"
            + "# Tuple lồng nhau\n"
            + "nested_tuple = ((1, 2), (3, 4), (5, 6))\n"
            + "\n"
            + "# Tuple với 1 phần tử (cần dấu phẩy)\n"
            + "single_element = (42,)  # Không phải là (42)",
            "fruits = (\"apple\", \"banana\", \"cherry\", \"orange\")\n"
            + "\n"
            + "# Truy cập phần tử\n"
            + "print(fruits[0])    # \"apple\"\n"
            + "print(fruits[-1])   # \"orange\"\n"
            + "\n"
            + "# Truy cập phần tử trong tuple lồng nhau\n"
            + "matrix = ((1, 2, 3), (4, 5, 6), (7, 8, 9))\n"
            + "print(matrix[1][2])  # 6",
            "numbers = (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)\n"
            + "\n"
            + "# Lấy từ vị trí 2 đến 5\n"
            + "print(numbers[2:6])    # (2, 3, 4, 5)\n"
            + "\n"
            + "# Lấy từ đầu đến vị trí 4\n"
            + "print(numbers[:5])     # (0, 1, 2, 3, 4)\n"
            + "\n"
            + "# Lấy từ vị trí 5 đến cuối\n"
            + "print(numbers[5:])     # (5, 6, 7, 8, 9)\n"
            + "\n"
            + "# Lấy mọi phần tử cách nhau 2 vị trí\n"
            + "print(numbers[::2])    # (0, 2, 4, 6, 8)\n"
            + "\n"
            + "# Đảo ngược tuple\n"
            + "print(numbers[::-1])   # (9, 8, 7, 6, 5, 4, 3, 2, 1, 0)",
            "t = (1, 2, 3, 2, 4, 2)\n"
            + "print(t.count(2))  # 3",
            "t = ('a', 'b', 'c', 'b', 'a')\n"
            + "print(t.index('b'))    # 1\n"
            + "print(t.index('b', 2)) # 3 (tìm từ vị trí 2)",
            "a = (1, 2, 3)\n"
            + "b = (4, 5, 6)\n"
            + "\n"
            + "# Nối tuple\n"
            + "c = a + b    # (1, 2, 3, 4, 5, 6)\n"
            + "\n"
            + "# Lặp tuple\n"
            + "d = a * 2    # (1, 2, 3, 1, 2, 3)\n"
            + "\n"
            + "# Kiểm tra tồn tại\n"
            + "print(2 in a)    # True\n"
            + "print(7 not in a) # True",
            "# Gán cơ bản\n"
            + "point = (10, 20)\n"
            + "x, y = point\n"
            + "print(x)  # 10\n"
            + "print(y)  # 20\n"
            + "\n"
            + "# Dùng dấu * để gán nhiều phần tử vào 1 biến\n"
            + "numbers = (1, 2, 3, 4, 5)\n"
            + "first, *middle, last = numbers\n"
            + "print(first)   # 1\n"
            + "print(middle)  # [2, 3, 4] (trở thành list)\n"
            + "print(last)    # 5\n"
            + "\n"
            + "# Hoán đổi giá trị\n"
            + "a, b = 5, 10\n"
            + "a, b = b, a  # a=10, b=5",
            "print((1, 2, 3) < (1, 2, 4))  # True\n"
            + "print((1, 2, 3) < (1, 2))      # False\n"
            + "print((1, 2) < (1, 2, -1))     # True\n"
            + "print((1, 2, 3) == (1.0, 2.0, 3.0))  # True",
            "# Dùng làm key trong dictionary\n"
            + "locations = {\n"
            + "    (35.6895, 139.6917): \"Tokyo\",\n"
            + "    (40.7128, -74.0060): \"New York\"\n"
            + "}\n"
            + "\n"
            + "# Trả về nhiều giá trị từ hàm\n"
            + "def get_stats(numbers):\n"
            + "    return min(numbers), max(numbers), sum(numbers)/len(numbers)\n"
            + "\n"
            + "min_val, max_val, avg = get_stats([1, 2, 3, 4, 5])",
            "# Từ list sang tuple\n"
            + "lst = [1, 2, 3]\n"
            + "tpl = tuple(lst)  # (1, 2, 3)\n"
            + "\n"
            + "# Từ tuple sang list\n"
            + "tpl = ('a', 'b', 'c')\n"
            + "lst = list(tpl)   # ['a', 'b', 'c']",
            "t = (5, 2, 8, 1, 9)\n"
            + "\n"
            + "# Độ dài tuple\n"
            + "print(len(t))    # 5\n"
            + "\n"
            + "# Giá trị lớn nhất/nhỏ nhất\n"
            + "print(max(t))    # 9\n"
            + "print(min(t))    # 1\n"
            + "\n"
            + "# Tổng các phần tử\n"
            + "print(sum(t))    # 25\n"
            + "\n"
            + "# Sắp xếp (trả về list)\n"
            + "print(sorted(t))      # [1, 2, 5, 8, 9]\n"
            + "print(sorted(t, reverse=True))  # [9, 8, 5, 2, 1]",
            "# Lưu trữ thông tin không đổi\n"
            + "RGB_RED = (255, 0, 0)\n"
            + "RGB_GREEN = (0, 255, 0)\n"
            + "RGB_BLUE = (0, 0, 255)\n"
            + "\n"
            + "# Trả về nhiều giá trị từ hàm\n"
            + "def get_circle_info(radius):\n"
            + "    circumference = 2 * 3.14159 * radius\n"
            + "    area = 3.14159 * radius * radius\n"
            + "    return (radius, circumference, area)\n"
            + "\n"
            + "r, c, a = get_circle_info(5)\n"
            + "\n"
            + "# Dùng trong câu lệnh SQL\n"
            + "query = \"SELECT name, age FROM users WHERE id = %s\"\n"
            + "params = (user_id,)  # Bảo vệ chống SQL injection"
        });

        Code_MAP.put("Dictionary", new String[]{
            "# Dictionary rỗng\n"
            + "empty_dict = {}\n"
            + "\n"
            + "# Dictionary với các cặp key-value\n"
            + "student = {\n"
            + "    \"name\": \"Nguyễn Văn A\",\n"
            + "    \"age\": 20,\n"
            + "    \"grades\": [8.5, 7.8, 9.0]\n"
            + "}\n"
            + "\n"
            + "# Dictionary với key là số\n"
            + "square_dict = {1: 1, 2: 4, 3: 9, 4: 16}\n"
            + "\n"
            + "# Dictionary lồng nhau\n"
            + "contacts = {\n"
            + "    \"John\": {\"phone\": \"123456\", \"email\": \"john@example.com\"},\n"
            + "    \"Alice\": {\"phone\": \"789012\", \"email\": \"alice@example.com\"}\n"
            + "}",
            "person = {\"name\": \"Alice\", \"age\": 25}\n"
            + "\n"
            + "# Truy cập bằng key\n"
            + "print(person[\"name\"])  # \"Alice\"\n"
            + "\n"
            + "# Dùng get() - an toàn hơn\n"
            + "print(person.get(\"age\"))     # 25\n"
            + "print(person.get(\"address\")) # None (không báo lỗi)\n"
            + "print(person.get(\"address\", \"Không có\")) # \"Không có\"\n"
            + "\n"
            + "# Truy cập trong dictionary lồng nhau\n"
            + "print(contacts[\"John\"][\"phone\"])  # \"123456\"",
            "product = {\"id\": 1, \"name\": \"Laptop\"}\n"
            + "\n"
            + "# Thêm mới\n"
            + "product[\"price\"] = 1500  # {\"id\": 1, \"name\": \"Laptop\", \"price\": 1500}\n"
            + "\n"
            + "# Cập nhật\n"
            + "product[\"name\"] = \"MacBook Pro\"\n"
            + "\n"
            + "# Cập nhật nhiều key cùng lúc\n"
            + "product.update({\"price\": 2000, \"in_stock\": True})",
            "data = {\"a\": 1, \"b\": 2, \"c\": 3, \"d\": 4}\n"
            + "\n"
            + "# Xóa bằng pop\n"
            + "value = data.pop(\"b\")  # value = 2, data còn {\"a\":1, \"c\":3, \"d\":4}\n"
            + "\n"
            + "# Xóa cặp cuối\n"
            + "key, value = data.popitem()  # (\"d\", 4)\n"
            + "\n"
            + "# Xóa bằng del\n"
            + "del data[\"a\"]  # {\"c\": 3}\n"
            + "\n"
            + "# Xóa toàn bộ\n"
            + "data.clear()   # {}",
            "student = {\"name\": \"Alice\", \"age\": 20, \"grade\": \"A\"}\n"
            + "\n"
            + "# Lấy tất cả keys\n"
            + "keys = student.keys()    # dict_keys(['name', 'age', 'grade'])\n"
            + "\n"
            + "# Lấy tất cả values\n"
            + "values = student.values() # dict_values(['Alice', 20, 'A'])\n"
            + "\n"
            + "# Lấy tất cả cặp key-value\n"
            + "items = student.items()  # dict_items([('name', 'Alice'), ('age', 20), ('grade', 'A')])",
            "if \"age\" in student:\n"
            + "    print(\"Tuổi:\", student[\"age\"])",
            "keys = [\"a\", \"b\", \"c\"]\n"
            + "default_dict = dict.fromkeys(keys, 0)  # {'a': 0, 'b': 0, 'c': 0}",
            "scores = {\"Math\": 9, \"Physics\": 8.5, \"Chemistry\": 7.5}\n"
            + "\n"
            + "# Duyệt keys\n"
            + "for subject in scores:\n"
            + "    print(subject)\n"
            + "\n"
            + "# Duyệt values\n"
            + "for score in scores.values():\n"
            + "    print(score)\n"
            + "\n"
            + "# Duyệt cả key-value\n"
            + "for subject, score in scores.items():\n"
            + "    print(f\"{subject}: {score}\")",
            "# Tạo dictionary bình phương\n"
            + "squares = {x: x**2 for x in range(1, 6)}\n"
            + "# {1: 1, 2: 4, 3: 9, 4: 16, 5: 25}\n"
            + "\n"
            + "# Tạo dictionary với điều kiện\n"
            + "even_squares = {x: x**2 for x in range(10) if x % 2 == 0}\n"
            + "\n"
            + "# Đảo key và value\n"
            + "original = {\"a\": 1, \"b\": 2, \"c\": 3}\n"
            + "inverted = {v: k for k, v in original.items()}\n"
            + "# {1: 'a', 2: 'b', 3: 'c'}",
            "employees = {\n"
            + "    1: {\n"
            + "        \"name\": \"John\",\n"
            + "        \"age\": 30,\n"
            + "        \"department\": \"Sales\"\n"
            + "    },\n"
            + "    2: {\n"
            + "        \"name\": \"Alice\",\n"
            + "        \"age\": 25,\n"
            + "        \"department\": \"IT\"\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "# Truy cập dữ liệu lồng\n"
            + "print(employees[2][\"name\"])  # \"Alice\"\n"
            + "\n"
            + "# Thêm nhân viên mới\n"
            + "employees[3] = {\"name\": \"Bob\", \"age\": 35, \"department\": \"Marketing\"}",
            "text = \"hello world hello python\"\n"
            + "words = text.split()\n"
            + "\n"
            + "word_count = {}\n"
            + "for word in words:\n"
            + "    word_count[word] = word_count.get(word, 0) + 1\n"
            + "\n"
            + "# {'hello': 2, 'world': 1, 'python': 1}",
            "config = {\n"
            + "    \"database\": {\n"
            + "        \"host\": \"localhost\",\n"
            + "        \"port\": 5432,\n"
            + "        \"user\": \"admin\",\n"
            + "        \"password\": \"secret\"\n"
            + "    },\n"
            + "    \"debug\": True,\n"
            + "    \"log_level\": \"INFO\"\n"
            + "}",
            "import json\n"
            + "\n"
            + "# Dictionary → JSON string\n"
            + "person_dict = {\"name\": \"John\", \"age\": 30}\n"
            + "person_json = json.dumps(person_dict)\n"
            + "\n"
            + "# JSON string → Dictionary\n"
            + "person_dict = json.loads(person_json)"
        });

        Code_MAP.put("OOP", new String[]{
            "# Định nghĩa class\n"
            + "class Dog:\n"
            + "    pass\n"
            + "\n"
            + "# Tạo object từ class\n"
            + "my_dog = Dog()",
            "class Dog:\n"
            + "    # Thuộc tính class (dùng chung)\n"
            + "    species = \"Canis familiaris\"\n"
            + "    \n"
            + "    def __init__(self, name, age):\n"
            + "        # Thuộc tính instance (riêng từng đối tượng)\n"
            + "        self.name = name\n"
            + "        self.age = age\n"
            + "\n"
            + "# Tạo đối tượng\n"
            + "buddy = Dog(\"Buddy\", 5)\n"
            + "print(buddy.name)  # \"Buddy\"\n"
            + "print(buddy.species)  # \"Canis familiaris\"",
            "class Dog:\n"
            + "    def __init__(self, name, age):\n"
            + "        self.name = name\n"
            + "        self.age = age\n"
            + "    \n"
            + "    # Phương thức instance\n"
            + "    def description(self):\n"
            + "        return f\"{self.name} is {self.age} years old\"\n"
            + "    \n"
            + "    # Phương thức với tham số\n"
            + "    def speak(self, sound):\n"
            + "        return f\"{self.name} says {sound}\"\n"
            + "\n"
            + "buddy = Dog(\"Buddy\", 5)\n"
            + "print(buddy.description())  # \"Buddy is 5 years old\"\n"
            + "print(buddy.speak(\"Woof Woof\"))  # \"Buddy says Woof Woof\"",
            "class BankAccount:\n"
            + "    def __init__(self, account_holder, initial_balance=0):\n"
            + "        self._account_holder = account_holder  # Protected\n"
            + "        self.__balance = initial_balance      # Private\n"
            + "    \n"
            + "    def deposit(self, amount):\n"
            + "        self.__balance += amount\n"
            + "    \n"
            + "    def withdraw(self, amount):\n"
            + "        if amount <= self.__balance:\n"
            + "            self.__balance -= amount\n"
            + "            return amount\n"
            + "        return \"Insufficient funds\"\n"
            + "    \n"
            + "    def get_balance(self):\n"
            + "        return self.__balance\n"
            + "\n"
            + "account = BankAccount(\"Alice\", 1000)\n"
            + "account.deposit(500)\n"
            + "print(account.get_balance())  # 1500",
            "class Animal:\n"
            + "    def __init__(self, name):\n"
            + "        self.name = name\n"
            + "    \n"
            + "    def speak(self):\n"
            + "        raise NotImplementedError(\"Subclass must implement this method\")\n"
            + "\n"
            + "class Dog(Animal):\n"
            + "    def speak(self):\n"
            + "        return f\"{self.name} says Woof!\"\n"
            + "\n"
            + "class Cat(Animal):\n"
            + "    def speak(self):\n"
            + "        return f\"{self.name} says Meow!\"\n"
            + "\n"
            + "animals = [Dog(\"Buddy\"), Cat(\"Misty\")]\n"
            + "for animal in animals:\n"
            + "    print(animal.speak())",
            "class Rectangle:\n"
            + "    def __init__(self, width, height):\n"
            + "        self.width = width\n"
            + "        self.height = height\n"
            + "    \n"
            + "    def area(self):\n"
            + "        return self.width * self.height\n"
            + "\n"
            + "class Circle:\n"
            + "    def __init__(self, radius):\n"
            + "        self.radius = radius\n"
            + "    \n"
            + "    def area(self):\n"
            + "        return 3.14 * self.radius ** 2\n"
            + "\n"
            + "shapes = [Rectangle(4, 5), Circle(7)]\n"
            + "for shape in shapes:\n"
            + "    print(\"Area:\", shape.area())",
            "from abc import ABC, abstractmethod\n"
            + "\n"
            + "class Database(ABC):\n"
            + "    @abstractmethod\n"
            + "    def connect(self):\n"
            + "        pass\n"
            + "    \n"
            + "    @abstractmethod\n"
            + "    def query(self, sql):\n"
            + "        pass\n"
            + "\n"
            + "class MySQLDatabase(Database):\n"
            + "    def connect(self):\n"
            + "        print(\"Connecting to MySQL database...\")\n"
            + "    \n"
            + "    def query(self, sql):\n"
            + "        print(f\"Executing MySQL query: {sql}\")\n"
            + "\n"
            + "db = MySQLDatabase()\n"
            + "db.connect()\n"
            + "db.query(\"SELECT * FROM users\")",
            "class MyClass:\n"
            + "    class_attribute = \"Class Value\"\n"
            + "    \n"
            + "    @classmethod\n"
            + "    def class_method(cls):\n"
            + "        print(f\"Called class_method of {cls}\")\n"
            + "        return cls.class_attribute\n"
            + "    \n"
            + "    @staticmethod\n"
            + "    def static_method():\n"
            + "        print(\"Called static_method\")\n"
            + "\n"
            + "print(MyClass.class_method())  # \"Class Value\"\n"
            + "MyClass.static_method()",
            "class Person:\n"
            + "    def __init__(self, first_name, last_name):\n"
            + "        self._first_name = first_name\n"
            + "        self._last_name = last_name\n"
            + "    \n"
            + "    @property\n"
            + "    def full_name(self):\n"
            + "        return f\"{self._first_name} {self._last_name}\"\n"
            + "    \n"
            + "    @full_name.setter\n"
            + "    def full_name(self, name):\n"
            + "        first, last = name.split(\" \")\n"
            + "        self._first_name = first\n"
            + "        self._last_name = last\n"
            + "\n"
            + "person = Person(\"John\", \"Doe\")\n"
            + "print(person.full_name)  # \"John Doe\"\n"
            + "person.full_name = \"Alice Smith\"\n"
            + "print(person._first_name)  # \"Alice\"",
            "class Book:\n"
            + "    def __init__(self, title, author, pages):\n"
            + "        self.title = title\n"
            + "        self.author = author\n"
            + "        self.pages = pages\n"
            + "    \n"
            + "    def __str__(self):\n"
            + "        return f\"{self.title} by {self.author}\"\n"
            + "    \n"
            + "    def __len__(self):\n"
            + "        return self.pages\n"
            + "    \n"
            + "    def __eq__(self, other):\n"
            + "        return self.title == other.title and self.author == other.author\n"
            + "\n"
            + "book = Book(\"Python\", \"Guido van Rossum\", 500)\n"
            + "print(book)  # \"Python by Guido van Rossum\"\n"
            + "print(len(book))  # 500",
            "class Animal:\n"
            + "    def eat(self):\n"
            + "        print(\"Eating...\")\n"
            + "\n"
            + "class Mammal(Animal):\n"
            + "    def feed_milk(self):\n"
            + "        print(\"Feeding milk...\")\n"
            + "\n"
            + "class Dog(Mammal):\n"
            + "    def bark(self):\n"
            + "        print(\"Barking...\")\n"
            + "\n"
            + "dog = Dog()\n"
            + "dog.eat()        # Từ Animal\n"
            + "dog.feed_milk()   # Từ Mammal\n"
            + "dog.bark()        # Từ Dog",
            "class Flyer:\n"
            + "    def fly(self):\n"
            + "        print(\"Flying...\")\n"
            + "\n"
            + "class Swimmer:\n"
            + "    def swim(self):\n"
            + "        print(\"Swimming...\")\n"
            + "\n"
            + "class Duck(Flyer, Swimmer):\n"
            + "    pass\n"
            + "\n"
            + "duck = Duck()\n"
            + "duck.fly()    # Từ Flyer\n"
            + "duck.swim()   # Từ Swimmer",
            "class Employee:\n"
            + "    def __init__(self, name, employee_id):\n"
            + "        self.name = name\n"
            + "        self.employee_id = employee_id\n"
            + "        self.__salary = 0  # Private\n"
            + "    \n"
            + "    def calculate_pay(self):\n"
            + "        raise NotImplementedError\n"
            + "    \n"
            + "    def __str__(self):\n"
            + "        return f\"ID: {self.employee_id}, Name: {self.name}\"\n"
            + "\n"
            + "class FullTimeEmployee(Employee):\n"
            + "    def __init__(self, name, employee_id, monthly_salary):\n"
            + "        super().__init__(name, employee_id)\n"
            + "        self.__monthly_salary = monthly_salary\n"
            + "    \n"
            + "    def calculate_pay(self):\n"
            + "        return self.__monthly_salary\n"
            + "\n"
            + "class PartTimeEmployee(Employee):\n"
            + "    def __init__(self, name, employee_id, hourly_rate, hours_worked):\n"
            + "        super().__init__(name, employee_id)\n"
            + "        self.hourly_rate = hourly_rate\n"
            + "        self.hours_worked = hours_worked\n"
            + "    \n"
            + "    def calculate_pay(self):\n"
            + "        return self.hourly_rate * self.hours_worked\n"
            + "\n"
            + "employees = [\n"
            + "    FullTimeEmployee(\"Alice\", \"FT001\", 5000),\n"
            + "    PartTimeEmployee(\"Bob\", \"PT001\", 20, 80)\n"
            + "]\n"
            + "\n"
            + "for emp in employees:\n"
            + "    print(f\"{emp} - Pay: ${emp.calculate_pay()}\")",
            "class Product:\n"
            + "    def __init__(self, product_id, name, price):\n"
            + "        self.product_id = product_id\n"
            + "        self.name = name\n"
            + "        self.price = price\n"
            + "    \n"
            + "    def __str__(self):\n"
            + "        return f\"{self.name} (${self.price})\"\n"
            + "\n"
            + "class OrderItem:\n"
            + "    def __init__(self, product, quantity):\n"
            + "        self.product = product\n"
            + "        self.quantity = quantity\n"
            + "    \n"
            + "    def total_price(self):\n"
            + "        return self.product.price * self.quantity\n"
            + "\n"
            + "class Order:\n"
            + "    def __init__(self, order_id, customer):\n"
            + "        self.order_id = order_id\n"
            + "        self.customer = customer\n"
            + "        self.items = []\n"
            + "    \n"
            + "    def add_item(self, product, quantity):\n"
            + "        self.items.append(OrderItem(product, quantity))\n"
            + "    \n"
            + "    def total_amount(self):\n"
            + "        return sum(item.total_price() for item in self.items)\n"
            + "    \n"
            + "    def __str__(self):\n"
            + "        items_str = \"\\n\".join(f\"- {item.product} x {item.quantity}\" for item in self.items)\n"
            + "        return f\"Order #{self.order_id}\\nCustomer: {self.customer}\\nItems:\\n{items_str}\\nTotal: ${self.total_amount()}\"\n"
            + "\n"
            + "# Sử dụng\n"
            + "p1 = Product(1, \"Laptop\", 1000)\n"
            + "p2 = Product(2, \"Mouse\", 20)\n"
            + "order = Order(\"ORD001\", \"John Doe\")\n"
            + "order.add_item(p1, 1)\n"
            + "order.add_item(p2, 2)\n"
            + "print(order)"
        });

        Code_MAP.put("Đọc/ghi file CSV", new String[]{
            "import csv\n"
            + "\n"
            + "# Mở file để đọc\n"
            + "with open('data.csv', mode='r', encoding='utf-8') as file:\n"
            + "    # Tạo reader object\n"
            + "    csv_reader = csv.reader(file)\n"
            + "    \n"
            + "    # Bỏ qua header nếu cần\n"
            + "    next(csv_reader)\n"
            + "    \n"
            + "    # Đọc từng dòng\n"
            + "    for row in csv_reader:\n"
            + "        print(row)  # Mỗi row là một list các giá trị",
            "import csv\n"
            + "\n"
            + "with open('data.csv', mode='r', encoding='utf-8') as file:\n"
            + "    # Sử dụng DictReader để đọc thành dictionary\n"
            + "    csv_reader = csv.DictReader(file)\n"
            + "    \n"
            + "    for row in csv_reader:\n"
            + "        print(row)  # Mỗi row là một dictionary\n"
            + "        print(row['column_name'])  # Truy cập theo tên cột",
            "import pandas as pd\n"
            + "\n"
            + "# Đọc toàn bộ file\n"
            + "df = pd.read_csv('data.csv')\n"
            + "print(df.head())\n"
            + "\n"
            + "# Đọc với các tùy chọn\n"
            + "df = pd.read_csv('data.csv', \n"
            + "                 sep=',',          # Dấu phân cách\n"
            + "                 header=0,        # Dòng nào làm header\n"
            + "                 skiprows=1,      # Bỏ qua dòng\n"
            + "                 na_values=['NA']) # Giá trị thiếu",
            "import csv\n"
            + "\n"
            + "data = [\n"
            + "    ['Name', 'Age', 'City'],\n"
            + "    ['Alice', 24, 'New York'],\n"
            + "    ['Bob', 30, 'London'],\n"
            + "    ['Charlie', 28, 'Paris']\n"
            + "]\n"
            + "\n"
            + "with open('output.csv', mode='w', encoding='utf-8', newline='') as file:\n"
            + "    writer = csv.writer(file)\n"
            + "    writer.writerows(data)  # Ghi nhiều dòng cùng lúc",
            "import csv\n"
            + "\n"
            + "data = [\n"
            + "    {'Name': 'Alice', 'Age': 24, 'City': 'New York'},\n"
            + "    {'Name': 'Bob', 'Age': 30, 'City': 'London'},\n"
            + "    {'Name': 'Charlie', 'Age': 28, 'City': 'Paris'}\n"
            + "]\n"
            + "\n"
            + "with open('output_dict.csv', mode='w', encoding='utf-8', newline='') as file:\n"
            + "    fieldnames = ['Name', 'Age', 'City']\n"
            + "    writer = csv.DictWriter(file, fieldnames=fieldnames)\n"
            + "    \n"
            + "    writer.writeheader()  # Ghi tiêu đề\n"
            + "    writer.writerows(data)  # Ghi dữ liệu",
            "import pandas as pd\n"
            + "\n"
            + "data = {\n"
            + "    'Name': ['Alice', 'Bob', 'Charlie'],\n"
            + "    'Age': [24, 30, 28],\n"
            + "    'City': ['New York', 'London', 'Paris']\n"
            + "}\n"
            + "\n"
            + "df = pd.DataFrame(data)\n"
            + "df.to_csv('pandas_output.csv', \n"
            + "          index=False,       # Không ghi index\n"
            + "          encoding='utf-8')",
            "# Dấu phân cách là tab\n"
            + "with open('data.tsv', mode='r') as file:\n"
            + "    reader = csv.reader(file, delimiter='\\t')\n"
            + "    for row in reader:\n"
            + "        print(row)\n"
            + "\n"
            + "# Dấu phân cách là dấu chấm phẩy\n"
            + "with open('data_semicolon.csv', mode='r') as file:\n"
            + "    reader = csv.reader(file, delimiter=';')\n"
            + "    for row in reader:\n"
            + "        print(row)",
            "with open('quoted_data.csv', mode='r') as file:\n"
            + "    reader = csv.reader(file, quotechar='\"', quoting=csv.QUOTE_MINIMAL)\n"
            + "    for row in reader:\n"
            + "        print(row)",
            "# Với file Windows (thường dùng cp1252 hoặc utf-8-sig)\n"
            + "with open('windows_data.csv', mode='r', encoding='utf-8-sig') as file:\n"
            + "    reader = csv.reader(file)\n"
            + "    for row in reader:\n"
            + "        print(row)\n"
            + "\n"
            + "# Với file tiếng Việt (thường dùng utf-8 hoặc cp1258)\n"
            + "with open('vietnamese_data.csv', mode='r', encoding='utf-8') as file:\n"
            + "    reader = csv.reader(file)\n"
            + "    for row in reader:\n"
            + "        print(row)",
            "import pandas as pd\n"
            + "\n"
            + "# Đọc từng chunk (phần) để tiết kiệm bộ nhớ\n"
            + "chunk_size = 10000  # Số dòng mỗi chunk\n"
            + "for chunk in pd.read_csv('large_file.csv', chunksize=chunk_size):\n"
            + "    process(chunk)  # Xử lý từng phần",
            "import gzip\n"
            + "import csv\n"
            + "\n"
            + "with gzip.open('compressed.csv.gz', mode='wt', encoding='utf-8', newline='') as file:\n"
            + "    writer = csv.writer(file)\n"
            + "    writer.writerows(data)",
            "import glob\n"
            + "import pandas as pd\n"
            + "\n"
            + "# Đọc tất cả file CSV trong thư mục\n"
            + "all_files = glob.glob('data/*.csv')\n"
            + "df_list = []\n"
            + "\n"
            + "for filename in all_files:\n"
            + "    df = pd.read_csv(filename)\n"
            + "    df_list.append(df)\n"
            + "\n"
            + "# Gộp tất cả DataFrame\n"
            + "combined_df = pd.concat(df_list, ignore_index=True)",
            "try:\n"
            + "    with open('data.csv', mode='r', encoding='utf-8') as file:\n"
            + "        reader = csv.reader(file)\n"
            + "        for row in reader:\n"
            + "            print(row)\n"
            + "except UnicodeDecodeError:\n"
            + "    # Thử encoding khác nếu utf-8 không đọc được\n"
            + "    with open('data.csv', mode='r', encoding='cp1252') as file:\n"
            + "        reader = csv.reader(file)\n"
            + "        for row in reader:\n"
            + "            print(row)",
            "import csv\n"
            + "\n"
            + "with open('data_with_missing.csv', mode='r') as file:\n"
            + "    reader = csv.reader(file)\n"
            + "    for row in reader:\n"
            + "        # Thay thế giá trị trống bằng None\n"
            + "        processed_row = [value if value != '' else None for value in row]\n"
            + "        print(processed_row)",
            "import csv\n"
            + "\n"
            + "def safe_float_conversion(value):\n"
            + "    try:\n"
            + "        return float(value)\n"
            + "    except ValueError:\n"
            + "        return None\n"
            + "\n"
            + "with open('data.csv', mode='r') as file:\n"
            + "    reader = csv.reader(file)\n"
            + "    for row in reader:\n"
            + "        processed_row = [safe_float_conversion(value) for value in row]\n"
            + "        print(processed_row)"
        });

        Code_MAP.put("JSON", new String[]{
            "import json\n"
            + "\n"
            + "data = {\n"
            + "    \"name\": \"Nguyễn Văn A\",\n"
            + "    \"age\": 30,\n"
            + "    \"is_student\": False,\n"
            + "    \"courses\": [\"Python\", \"JavaScript\", \"SQL\"],\n"
            + "    \"address\": None\n"
            + "}\n"
            + "\n"
            + "json_string = json.dumps(data, ensure_ascii=False, indent=4)\n"
            + "print(json_string)",
            "with open('data.json', 'w', encoding='utf-8') as f:\n"
            + "    json.dump(data, f, ensure_ascii=False, indent=4)",
            "json_data = '''\n"
            + "{\n"
            + "    \"name\": \"Nguyễn Thị B\",\n"
            + "    \"age\": 25,\n"
            + "    \"is_student\": true,\n"
            + "    \"courses\": [\"Math\", \"Physics\"],\n"
            + "    \"address\": {\n"
            + "        \"street\": \"123 Đường ABC\",\n"
            + "        \"city\": \"Hà Nội\"\n"
            + "    }\n"
            + "}\n"
            + "'''\n"
            + "\n"
            + "python_data = json.loads(json_data)\n"
            + "print(python_data[\"name\"])  # Output: Nguyễn Thị B",
            "with open('data.json', 'r', encoding='utf-8') as f:\n"
            + "    loaded_data = json.load(f)\n"
            + "    print(loaded_data)",
            "import json\n"
            + "from datetime import datetime\n"
            + "\n"
            + "class User:\n"
            + "    def __init__(self, name, join_date):\n"
            + "        self.name = name\n"
            + "        self.join_date = join_date\n"
            + "\n"
            + "def user_encoder(obj):\n"
            + "    if isinstance(obj, User):\n"
            + "        return {\n"
            + "            \"name\": obj.name,\n"
            + "            \"join_date\": obj.join_date.strftime(\"%Y-%m-%d\")\n"
            + "        }\n"
            + "    elif isinstance(obj, datetime):\n"
            + "        return obj.strftime(\"%Y-%m-%d %H:%M:%S\")\n"
            + "    raise TypeError(f\"Object of type {type(obj)} is not JSON serializable\")\n"
            + "\n"
            + "user = User(\"Trần Văn C\", datetime.now())\n"
            + "json_data = json.dumps(user, default=user_encoder, ensure_ascii=False)\n"
            + "print(json_data)",
            "def user_decoder(dct):\n"
            + "    if \"name\" in dct and \"join_date\" in dct:\n"
            + "        return User(dct[\"name\"], datetime.strptime(dct[\"join_date\"], \"%Y-%m-%d\"))\n"
            + "    return dct\n"
            + "\n"
            + "user_data = '{\"name\": \"Lê Thị D\", \"join_date\": \"2023-01-15\"}'\n"
            + "user_obj = json.loads(user_data, object_hook=user_decoder)\n"
            + "print(f\"Tên: {user_obj.name}, Ngày tham gia: {user_obj.join_date}\")",
            "invalid_json = '{\"name\": \"John\", \"age\": 30,}'\n"
            + "\n"
            + "try:\n"
            + "    data = json.loads(invalid_json)\n"
            + "except json.JSONDecodeError as e:\n"
            + "    print(f\"Lỗi JSON: {e.msg} tại dòng {e.lineno}, cột {e.colno}\")",
            "invalid_data = {\"date\": datetime.now()}\n"
            + "\n"
            + "try:\n"
            + "    json.dumps(invalid_data)\n"
            + "except TypeError as e:\n"
            + "    print(f\"Lỗi: {e}\")",
            "import json\n"
            + "from datetime import datetime\n"
            + "\n"
            + "# 1. Tạo dữ liệu Python phức tạp\n"
            + "class Product:\n"
            + "    def __init__(self, id, name, price):\n"
            + "        self.id = id\n"
            + "        self.name = name\n"
            + "        self.price = price\n"
            + "\n"
            + "def product_encoder(obj):\n"
            + "    if isinstance(obj, Product):\n"
            + "        return {\n"
            + "            \"product_id\": obj.id,\n"
            + "            \"product_name\": obj.name,\n"
            + "            \"product_price\": obj.price\n"
            + "        }\n"
            + "    elif isinstance(obj, datetime):\n"
            + "        return obj.isoformat()\n"
            + "    raise TypeError(f\"Object of type {type(obj)} is not JSON serializable\")\n"
            + "\n"
            + "# Dữ liệu đơn hàng\n"
            + "order = {\n"
            + "    \"order_id\": \"ORD12345\",\n"
            + "    \"customer\": {\n"
            + "        \"name\": \"Phạm Văn E\",\n"
            + "        \"email\": \"pham.e@example.com\"\n"
            + "    },\n"
            + "    \"products\": [\n"
            + "        Product(1, \"Laptop\", 15000000),\n"
            + "        Product(2, \"Điện thoại\", 8000000)\n"
            + "    ],\n"
            + "    \"order_date\": datetime.now(),\n"
            + "    \"is_completed\": False,\n"
            + "    \"total\": 23000000\n"
            + "}\n"
            + "\n"
            + "# 2. Chuyển thành JSON\n"
            + "order_json = json.dumps(order, default=product_encoder, ensure_ascii=False, indent=4)\n"
            + "print(\"Đơn hàng dạng JSON:\")\n"
            + "print(order_json)\n"
            + "\n"
            + "# 3. Lưu vào file\n"
            + "with open('order.json', 'w', encoding='utf-8') as f:\n"
            + "    json.dump(order, f, default=product_encoder, ensure_ascii=False, indent=4)\n"
            + "\n"
            + "# 4. Đọc từ file\n"
            + "def product_decoder(dct):\n"
            + "    if \"product_id\" in dct and \"product_name\" in dct and \"product_price\" in dct:\n"
            + "        return Product(dct[\"product_id\"], dct[\"product_name\"], dct[\"product_price\"])\n"
            + "    return dct\n"
            + "\n"
            + "with open('order.json', 'r', encoding='utf-8') as f:\n"
            + "    loaded_order = json.load(f, object_hook=product_decoder)\n"
            + "    print(\"\\nĐơn hàng đọc từ file:\")\n"
            + "    print(f\"Mã đơn hàng: {loaded_order['order_id']}\")\n"
            + "    print(f\"Khách hàng: {loaded_order['customer']['name']}\")\n"
            + "    print(f\"Sản phẩm đầu tiên: {loaded_order['products'][0].name}\")\n"
            + "    print(f\"Ngày đặt hàng: {loaded_order['order_date']}\")"
        });

        Code_MAP.put("XML", new String[]{
            "<bookstore>\n"
            + "  <book category=\"programming\">\n"
            + "    <title lang=\"en\">Python Crash Course</title>\n"
            + "    <author>Eric Matthes</author>\n"
            + "    <year>2019</year>\n"
            + "    <price>39.99</price>\n"
            + "  </book>\n"
            + "</bookstore>",
            "import xml.etree.ElementTree as ET\n"
            + "\n"
            + "# Tạo root element\n"
            + "root = ET.Element(\"bookstore\")\n"
            + "\n"
            + "# Tạo child element với thuộc tính\n"
            + "book = ET.SubElement(root, \"book\", category=\"programming\")\n"
            + "\n"
            + "# Thêm các phần tử con\n"
            + "title = ET.SubElement(book, \"title\", lang=\"en\")\n"
            + "title.text = \"Python Crash Course\"\n"
            + "ET.SubElement(book, \"author\").text = \"Eric Matthes\"\n"
            + "ET.SubElement(book, \"year\").text = \"2019\"\n"
            + "ET.SubElement(book, \"price\").text = \"39.99\"\n"
            + "\n"
            + "# Tạo XML tree\n"
            + "tree = ET.ElementTree(root)\n"
            + "\n"
            + "# Ghi ra file\n"
            + "tree.write(\"books.xml\", encoding=\"utf-8\", xml_declaration=True)",
            "import xml.etree.ElementTree as ET\n"
            + "\n"
            + "# Phân tích từ file\n"
            + "tree = ET.parse(\"books.xml\")\n"
            + "root = tree.getroot()\n"
            + "\n"
            + "# Duyệt qua các phần tử\n"
            + "for book in root.findall(\"book\"):\n"
            + "    category = book.get(\"category\")\n"
            + "    title = book.find(\"title\").text\n"
            + "    author = book.find(\"author\").text\n"
            + "    price = book.find(\"price\").text\n"
            + "    print(f\"Thể loại: {category}, Tên sách: {title}, Tác giả: {author}, Giá: {price}\")",
            "# Tăng giá tất cả sách lên 10%\n"
            + "for book in root.findall(\"book\"):\n"
            + "    price = book.find(\"price\")\n"
            + "    new_price = float(price.text) * 1.1\n"
            + "    price.text = f\"{new_price:.2f}\"\n"
            + "\n"
            + "# Lưu file đã chỉnh sửa\n"
            + "tree.write(\"books_updated.xml\", encoding=\"utf-8\")",
            "from lxml import etree\n"
            + "\n"
            + "# Tạo XML\n"
            + "root = etree.Element(\"bookstore\")\n"
            + "book = etree.SubElement(root, \"book\", category=\"web\")\n"
            + "etree.SubElement(book, \"title\").text = \"Learning XML\"\n"
            + "etree.SubElement(book, \"author\").text = \"Erik T. Ray\"\n"
            + "\n"
            + "# Pretty print\n"
            + "print(etree.tostring(root, pretty_print=True, encoding=\"unicode\"))\n"
            + "\n"
            + "# XPath với lxml\n"
            + "xml_data = \"\"\"\n"
            + "<bookstore>\n"
            + "  <book category=\"programming\">\n"
            + "    <title lang=\"en\">Python Crash Course</title>\n"
            + "    <author>Eric Matthes</author>\n"
            + "    <price>39.99</price>\n"
            + "  </book>\n"
            + "  <book category=\"web\">\n"
            + "    <title lang=\"en\">Learning XML</title>\n"
            + "    <author>Erik T. Ray</author>\n"
            + "    <price>31.95</price>\n"
            + "  </book>\n"
            + "</bookstore>\n"
            + "\"\"\"\n"
            + "\n"
            + "tree = etree.fromstring(xml_data)\n"
            + "# Tìm tất cả sách có giá > 35\n"
            + "expensive_books = tree.xpath(\"//book[price > 35]/title/text()\")\n"
            + "print(\"Sách đắt (>35$):\", expensive_books)",
            "from xml.dom import minidom\n"
            + "\n"
            + "# Tạo tài liệu XML\n"
            + "doc = minidom.Document()\n"
            + "\n"
            + "# Tạo root element\n"
            + "bookstore = doc.createElement(\"bookstore\")\n"
            + "doc.appendChild(bookstore)\n"
            + "\n"
            + "# Tạo book element\n"
            + "book = doc.createElement(\"book\")\n"
            + "book.setAttribute(\"category\", \"programming\")\n"
            + "bookstore.appendChild(book)\n"
            + "\n"
            + "# Thêm các phần tử con\n"
            + "title = doc.createElement(\"title\")\n"
            + "title.setAttribute(\"lang\", \"en\")\n"
            + "title.appendChild(doc.createTextNode(\"Python Crash Course\"))\n"
            + "book.appendChild(title)\n"
            + "\n"
            + "author = doc.createElement(\"author\")\n"
            + "author.appendChild(doc.createTextNode(\"Eric Matthes\"))\n"
            + "book.appendChild(author)\n"
            + "\n"
            + "# Ghi ra file\n"
            + "with open(\"books_dom.xml\", \"w\", encoding=\"utf-8\") as f:\n"
            + "    doc.writexml(f, indent=\"  \", addindent=\"  \", newl=\"\\n\", encoding=\"utf-8\")",
            "import xml.sax\n"
            + "\n"
            + "class BookHandler(xml.sax.ContentHandler):\n"
            + "    def __init__(self):\n"
            + "        self.current_element = \"\"\n"
            + "        self.title = \"\"\n"
            + "        self.author = \"\"\n"
            + "    \n"
            + "    def startElement(self, name, attrs):\n"
            + "        self.current_element = name\n"
            + "        if name == \"book\":\n"
            + "            print(f\"\\nThể loại sách: {attrs['category']}\")\n"
            + "    \n"
            + "    def characters(self, content):\n"
            + "        if self.current_element == \"title\":\n"
            + "            self.title = content\n"
            + "        elif self.current_element == \"author\":\n"
            + "            self.author = content\n"
            + "    \n"
            + "    def endElement(self, name):\n"
            + "        if name == \"title\":\n"
            + "            print(f\"Tiêu đề: {self.title}\")\n"
            + "        elif name == \"author\":\n"
            + "            print(f\"Tác giả: {self.author}\")\n"
            + "        self.current_element = \"\"\n"
            + "\n"
            + "# Tạo parser\n"
            + "parser = xml.sax.make_parser()\n"
            + "handler = BookHandler()\n"
            + "parser.setContentHandler(handler)\n"
            + "\n"
            + "# Phân tích file XML\n"
            + "parser.parse(\"books.xml\")",
            "import xml.etree.ElementTree as ET\n"
            + "from datetime import datetime\n"
            + "\n"
            + "class StudentManager:\n"
            + "    def __init__(self, filename):\n"
            + "        self.filename = filename\n"
            + "        try:\n"
            + "            self.tree = ET.parse(filename)\n"
            + "            self.root = self.tree.getroot()\n"
            + "        except FileNotFoundError:\n"
            + "            self.root = ET.Element(\"students\")\n"
            + "            self.tree = ET.ElementTree(self.root)\n"
            + "    \n"
            + "    def add_student(self, student_id, name, birthdate, major, gpa):\n"
            + "        student = ET.SubElement(self.root, \"student\", id=student_id)\n"
            + "        ET.SubElement(student, \"name\").text = name\n"
            + "        ET.SubElement(student, \"birthdate\").text = birthdate\n"
            + "        ET.SubElement(student, \"major\").text = major\n"
            + "        ET.SubElement(student, \"gpa\").text = str(gpa)\n"
            + "        self.save()\n"
            + "    \n"
            + "    def find_student(self, student_id):\n"
            + "        for student in self.root.findall(f\"student[@id='{student_id}']\"):\n"
            + "            return {\n"
            + "                \"id\": student.get(\"id\"),\n"
            + "                \"name\": student.find(\"name\").text,\n"
            + "                \"birthdate\": student.find(\"birthdate\").text,\n"
            + "                \"major\": student.find(\"major\").text,\n"
            + "                \"gpa\": float(student.find(\"gpa\").text)\n"
            + "            }\n"
            + "        return None\n"
            + "    \n"
            + "    def update_student(self, student_id, **kwargs):\n"
            + "        student = self.root.find(f\"student[@id='{student_id}']\")\n"
            + "        if student is not None:\n"
            + "            for key, value in kwargs.items():\n"
            + "                element = student.find(key)\n"
            + "                if element is not None:\n"
            + "                    element.text = str(value)\n"
            + "            self.save()\n"
            + "            return True\n"
            + "        return False\n"
            + "    \n"
            + "    def list_students(self):\n"
            + "        students = []\n"
            + "        for student in self.root.findall(\"student\"):\n"
            + "            students.append({\n"
            + "                \"id\": student.get(\"id\"),\n"
            + "                \"name\": student.find(\"name\").text,\n"
            + "                \"major\": student.find(\"major\").text\n"
            + "            })\n"
            + "        return students\n"
            + "    \n"
            + "    def save(self):\n"
            + "        self.tree.write(self.filename, encoding=\"utf-8\", xml_declaration=True)\n"
            + "\n"
            + "# Sử dụng\n"
            + "manager = StudentManager(\"students.xml\")\n"
            + "\n"
            + "# Thêm sinh viên\n"
            + "manager.add_student(\"SV001\", \"Nguyễn Văn A\", \"2000-05-15\", \"Công nghệ thông tin\", 3.5)\n"
            + "manager.add_student(\"SV002\", \"Trần Thị B\", \"2001-02-20\", \"Kế toán\", 3.2)\n"
            + "\n"
            + "# Tìm kiếm sinh viên\n"
            + "print(manager.find_student(\"SV001\"))\n"
            + "\n"
            + "# Cập nhật thông tin\n"
            + "manager.update_student(\"SV001\", gpa=3.7, major=\"Khoa học máy tính\")\n"
            + "\n"
            + "# Danh sách sinh viên\n"
            + "print(\"\\nDanh sách sinh viên:\")\n"
            + "for student in manager.list_students():\n"
            + "    print(f\"{student['id']}: {student['name']} - {student['major']}\")"
        });

        Code_MAP.put("Try-except", new String[]{
            "try:\n"
            + "    # Khối code có thể gây ra lỗi\n"
            + "    pass\n"
            + "except ExceptionType:\n"
            + "    # Khối code xử lý khi lỗi xảy ra\n"
            + "    pass",
            "try:\n"
            + "    num = int(input(\"Nhập một số: \"))\n"
            + "    print(f\"Bình phương của {num} là {num ** 2}\")\n"
            + "except ValueError:\n"
            + "    print(\"Lỗi: Bạn phải nhập một số nguyên hợp lệ!\")",
            "try:\n"
            + "    a = int(input(\"Nhập số a: \"))\n"
            + "    b = int(input(\"Nhập số b: \"))\n"
            + "    print(f\"{a} / {b} = {a / b}\")\n"
            + "except ValueError:\n"
            + "    print(\"Lỗi: Bạn phải nhập số nguyên!\")\n"
            + "except ZeroDivisionError:\n"
            + "    print(\"Lỗi: Không thể chia cho 0!\")\n"
            + "except Exception as e:\n"
            + "    print(f\"Lỗi không xác định: {e}\")",
            "try:\n"
            + "    file = open(\"data.txt\", \"r\")\n"
            + "    content = file.read()\n"
            + "    print(content)\n"
            + "except FileNotFoundError:\n"
            + "    print(\"Lỗi: Không tìm thấy file!\")\n"
            + "else:\n"
            + "    print(\"Đọc file thành công!\")\n"
            + "finally:\n"
            + "    if 'file' in locals():\n"
            + "        file.close()\n"
            + "    print(\"Luôn thực thi khối này dù có lỗi hay không\")",
            "try:\n"
            + "    data = {\"name\": \"Alice\", \"age\": 30}\n"
            + "    print(data[\"address\"])  # KeyError\n"
            + "    print(10 / 0)  # ZeroDivisionError\n"
            + "except (KeyError, ZeroDivisionError) as e:\n"
            + "    print(f\"Lỗi xảy ra: {type(e).__name__} - {e}\")",
            "class TuoiKhongHopLeError(Exception):\n"
            + "    \"\"\"Ngoại lệ khi tuổi không hợp lệ\"\"\"\n"
            + "    pass\n"
            + "\n"
            + "try:\n"
            + "    tuoi = int(input(\"Nhập tuổi của bạn: \"))\n"
            + "    if tuoi < 0 or tuoi > 120:\n"
            + "        raise TuoiKhongHopLeError(\"Tuổi phải từ 0 đến 120\")\n"
            + "    print(f\"Tuổi của bạn là {tuoi}\")\n"
            + "except ValueError:\n"
            + "    print(\"Bạn phải nhập một số!\")\n"
            + "except TuoiKhongHopLeError as e:\n"
            + "    print(f\"Lỗi tuổi: {e}\")",
            "def tinh_tb(diem):\n"
            + "    try:\n"
            + "        if not diem:\n"
            + "            raise ValueError(\"Danh sách điểm rỗng\")\n"
            + "        return sum(diem) / len(diem)\n"
            + "    except TypeError:\n"
            + "        print(\"Lỗi: Danh sách điểm phải chứa các số\")\n"
            + "        return None\n"
            + "    except ZeroDivisionError:\n"
            + "        print(\"Lỗi: Danh sách điểm không được rỗng\")\n"
            + "        return None\n"
            + "    except Exception as e:\n"
            + "        print(f\"Lỗi không xác định: {e}\")\n"
            + "        return None\n"
            + "\n"
            + "# Test hàm\n"
            + "print(tinh_tb([8, 9, 7.5]))  # 8.166...\n"
            + "print(tinh_tb([]))  # Lỗi: Danh sách điểm không được rỗng\n"
            + "print(tinh_tb([\"a\", \"b\"]))  # Lỗi: Danh sách điểm phải chứa các số",
            "try:\n"
            + "    try:\n"
            + "        num = int(input(\"Nhập số: \"))\n"
            + "        print(10 / num)\n"
            + "    except ValueError:\n"
            + "        print(\"Lỗi: Không phải số hợp lệ\")\n"
            + "    except ZeroDivisionError:\n"
            + "        print(\"Lỗi: Không thể chia cho 0\")\n"
            + "except Exception as e:\n"
            + "    print(f\"Lỗi ở mức ngoài cùng: {e}\")",
            "import sqlite3\n"
            + "\n"
            + "def get_user_data(user_id):\n"
            + "    try:\n"
            + "        conn = sqlite3.connect('database.db')\n"
            + "        cursor = conn.cursor()\n"
            + "        cursor.execute(\"SELECT * FROM users WHERE id=?\", (user_id,))\n"
            + "        user = cursor.fetchone()\n"
            + "        \n"
            + "        if not user:\n"
            + "            raise ValueError(\"Người dùng không tồn tại\")\n"
            + "            \n"
            + "        return user\n"
            + "    except sqlite3.Error as e:\n"
            + "        print(f\"Lỗi database: {e}\")\n"
            + "        return None\n"
            + "    except ValueError as e:\n"
            + "        print(f\"Lỗi giá trị: {e}\")\n"
            + "        return None\n"
            + "    finally:\n"
            + "        if 'conn' in locals():\n"
            + "            conn.close()",
            "import logging\n"
            + "\n"
            + "logging.basicConfig(filename='app.log', level=logging.ERROR)\n"
            + "\n"
            + "try:\n"
            + "    # Code có thể gây lỗi\n"
            + "    result = 10 / 0\n"
            + "except Exception as e:\n"
            + "    logging.error(f\"Lỗi xảy ra: {e}\", exc_info=True)\n"
            + "    print(\"Đã xảy ra lỗi. Vui lòng xem log để biết chi tiết.\")",
            "numbers = [\"10\", \"5\", \"abc\", \"0\", \"20\"]\n"
            + "\n"
            + "for num in numbers:\n"
            + "    try:\n"
            + "        value = int(num)\n"
            + "        print(f\"100 / {value} = {100 / value}\")\n"
            + "    except ValueError:\n"
            + "        print(f\"'{num}' không phải số hợp lệ\")\n"
            + "    except ZeroDivisionError:\n"
            + "        print(f\"Không thể chia 100 cho {num}\")\n"
            + "    else:\n"
            + "        print(\"Tính toán thành công!\")"
        });

        Code_MAP.put("Finally", new String[]{
            "try:\n"
            + "    # Code có thể gây lỗi\n"
            + "    pass\n"
            + "except:\n"
            + "    # Xử lý lỗi\n"
            + "    pass\n"
            + "finally:\n"
            + "    # Luôn thực thi\n"
            + "    pass",
            "try:\n"
            + "    file = open(\"data.txt\", \"r\")\n"
            + "    content = file.read()\n"
            + "    print(content)\n"
            + "except FileNotFoundError:\n"
            + "    print(\"File không tồn tại\")\n"
            + "finally:\n"
            + "    if 'file' in locals() and not file.closed:\n"
            + "        file.close()\n"
            + "        print(\"Đã đóng file\")",
            "def test_finally():\n"
            + "    try:\n"
            + "        print(\"Trong khối try\")\n"
            + "        return \"Giá trị từ try\"\n"
            + "    except:\n"
            + "        pass\n"
            + "    finally:\n"
            + "        print(\"Luôn chạy, kể cả có return\")\n"
            + "\n"
            + "print(test_finally())\n"
            + "# Output:\n"
            + "# Trong khối try\n"
            + "# Luôn chạy, kể cả có return\n"
            + "# Giá trị từ try",
            "try:\n"
            + "    print(10 / 0)\n"
            + "except ZeroDivisionError:\n"
            + "    print(\"Lỗi chia cho 0\")\n"
            + "    raise  # Ném lại ngoại lệ\n"
            + "finally:\n"
            + "    print(\"Vẫn chạy trước khi chương trình dừng do lỗi\")",
            "import sqlite3\n"
            + "\n"
            + "def get_data():\n"
            + "    conn = None\n"
            + "    try:\n"
            + "        conn = sqlite3.connect('example.db')\n"
            + "        cursor = conn.cursor()\n"
            + "        cursor.execute(\"SELECT * FROM users\")\n"
            + "        return cursor.fetchall()\n"
            + "    except sqlite3.Error as e:\n"
            + "        print(f\"Lỗi database: {e}\")\n"
            + "    finally:\n"
            + "        if conn:\n"
            + "            conn.close()\n"
            + "            print(\"Đã đóng kết nối database\")",
            "for i in range(5):\n"
            + "    try:\n"
            + "        if i == 3:\n"
            + "            break\n"
            + "        print(i)\n"
            + "    finally:\n"
            + "        print(f\"Vòng lặp {i} - finally luôn chạy\")\n"
            + "\n"
            + "# Output:\n"
            + "# 0\n"
            + "# Vòng lặp 0 - finally luôn chạy\n"
            + "# 1\n"
            + "# Vòng lặp 1 - finally luôn chạy\n"
            + "# 2\n"
            + "# Vòng lặp 2 - finally luôn chạy\n"
            + "# Vòng lặp 3 - finally luôn chạy",
            "def divide(a, b):\n"
            + "    try:\n"
            + "        result = a / b\n"
            + "    except ZeroDivisionError:\n"
            + "        print(\"Không thể chia cho 0\")\n"
            + "    except TypeError:\n"
            + "        print(\"Phải nhập số\")\n"
            + "    else:\n"
            + "        print(f\"Kết quả: {result}\")\n"
            + "        return result\n"
            + "    finally:\n"
            + "        print(\"Phép tính hoàn tất\")\n"
            + "\n"
            + "divide(10, 2)   # Thành công\n"
            + "divide(10, 0)   # Lỗi chia 0\n"
            + "divide(\"10\", 2) # Lỗi kiểu dữ liệu",
            "def generator_example():\n"
            + "    try:\n"
            + "        for i in range(3):\n"
            + "            yield i\n"
            + "    finally:\n"
            + "        print(\"Generator đã hoàn thành\")\n"
            + "\n"
            + "gen = generator_example()\n"
            + "print(next(gen))  # 0\n"
            + "print(next(gen))  # 1\n"
            + "# Dừng generator trước khi kết thúc\n"
            + "gen.close()       # Vẫn in \"Generator đã hoàn thành\"",
            "def process_transaction(account_from, account_to, amount):\n"
            + "    try:\n"
            + "        # Giả lập kiểm tra tài khoản\n"
            + "        if account_from.balance < amount:\n"
            + "            raise ValueError(\"Không đủ số dư\")\n"
            + "        \n"
            + "        # Thực hiện giao dịch\n"
            + "        account_from.withdraw(amount)\n"
            + "        account_to.deposit(amount)\n"
            + "        \n"
            + "        print(\"Giao dịch thành công\")\n"
            + "        return True\n"
            + "    except Exception as e:\n"
            + "        print(f\"Giao dịch thất bại: {e}\")\n"
            + "        return False\n"
            + "    finally:\n"
            + "        # Ghi log dù giao dịch thành công hay thất bại\n"
            + "        log_transaction(account_from, account_to, amount)",
            "class ResourceManager:\n"
            + "    def __enter__(self):\n"
            + "        print(\"Khởi tạo tài nguyên\")\n"
            + "        return self\n"
            + "    \n"
            + "    def __exit__(self, exc_type, exc_val, exc_tb):\n"
            + "        print(\"Giải phóng tài nguyên\")\n"
            + "        return False  # Không xử lý ngoại lệ\n"
            + "\n"
            + "# Sử dụng\n"
            + "try:\n"
            + "    with ResourceManager() as resource:\n"
            + "        print(\"Đang sử dụng tài nguyên\")\n"
            + "        raise ValueError(\"Lỗi xảy ra\")\n"
            + "except:\n"
            + "    print(\"Đã bắt lỗi\")\n"
            + "finally:\n"
            + "    print(\"Khối finally bên ngoài\")\n"
            + "\n"
            + "# Output:\n"
            + "# Khởi tạo tài nguyên\n"
            + "# Đang sử dụng tài nguyên\n"
            + "# Giải phóng tài nguyên\n"
            + "# Đã bắt lỗi\n"
            + "# Khối finally bên ngoài",
            "import threading\n"
            + "import time\n"
            + "\n"
            + "def worker():\n"
            + "    try:\n"
            + "        print(\"Luồng bắt đầu làm việc\")\n"
            + "        time.sleep(1)\n"
            + "        raise RuntimeError(\"Lỗi trong luồng\")\n"
            + "    except:\n"
            + "        print(\"Bắt lỗi trong luồng\")\n"
            + "        raise  # Ném lại ngoại lệ\n"
            + "    finally:\n"
            + "        print(\"Dọn dẹp luồng\")\n"
            + "\n"
            + "t = threading.Thread(target=worker)\n"
            + "t.start()\n"
            + "t.join()\n"
            + "print(\"Chương trình chính kết thúc\")"
        });

        Code_MAP.put("Tạo ngoại lệ tùy chỉnh", new String[]{
            "class MyCustomError(Exception):\n"
            + "    \"\"\"Mô tả lỗi\"\"\"\n"
            + "    pass",
            "class InvalidAgeError(Exception):\n"
            + "    def __init__(self, message=\"Tuổi không hợp lệ\"):\n"
            + "        self.message = message\n"
            + "        super().__init__(self.message)\n"
            + "\n"
            + "try:\n"
            + "    raise InvalidAgeError()\n"
            + "except InvalidAgeError as e:\n"
            + "    print(e)  # Output: Tuổi không hợp lệ",
            "class PaymentError(Exception):\n"
            + "    def __init__(self, amount, account):\n"
            + "        self.amount = amount\n"
            + "        self.account = account\n"
            + "        super().__init__(f\"Thanh toán {amount} cho tài khoản {account} thất bại\")\n"
            + "\n"
            + "try:\n"
            + "    raise PaymentError(1000, \"ACC123\")\n"
            + "except PaymentError as e:\n"
            + "    print(e)          # Output thông báo lỗi\n"
            + "    print(e.amount)   # Output: 1000\n"
            + "    print(e.account)  # Output: ACC123",
            "class AppBaseError(Exception):\n"
            + "    \"\"\"Lớp cơ sở cho toàn bộ ngoại lệ ứng dụng\"\"\"\n"
            + "    pass\n"
            + "\n"
            + "class DatabaseError(AppBaseError):\n"
            + "    \"\"\"Lỗi liên quan đến database\"\"\"\n"
            + "    pass\n"
            + "\n"
            + "class ConnectionError(DatabaseError):\n"
            + "    \"\"\"Lỗi kết nối database\"\"\"\n"
            + "    pass\n"
            + "\n"
            + "try:\n"
            + "    raise ConnectionError(\"Timeout khi kết nối database\")\n"
            + "except DatabaseError as e:\n"
            + "    print(\"Bắt được lỗi database:\", e)",
            "class LoggedError(Exception):\n"
            + "    def __init__(self, message):\n"
            + "        super().__init__(message)\n"
            + "        self.log_error()\n"
            + "    \n"
            + "    def log_error(self):\n"
            + "        print(f\"[LOGGED] Error occurred: {self}\")\n"
            + "\n"
            + "try:\n"
            + "    raise LoggedError(\"Lỗi hệ thống\")\n"
            + "except LoggedError:\n"
            + "    pass  # Lỗi đã được log tự động",
            "class DetailedError(Exception):\n"
            + "    def __init__(self, code, details):\n"
            + "        self.code = code\n"
            + "        self.details = details\n"
            + "    \n"
            + "    def __str__(self):\n"
            + "        return f\"[ERR-{self.code}] {self.details}\"\n"
            + "\n"
            + "try:\n"
            + "    raise DetailedError(404, \"Resource not found\")\n"
            + "except DetailedError as e:\n"
            + "    print(e)  # Output: [ERR-404] Resource not found",
            "class FileProcessingError(Exception):\n"
            + "    pass\n"
            + "\n"
            + "def process_file(filename):\n"
            + "    try:\n"
            + "        if not filename.endswith('.txt'):\n"
            + "            raise FileProcessingError(\"Chỉ chấp nhận file .txt\")\n"
            + "        # Xử lý file...\n"
            + "    except FileProcessingError as e:\n"
            + "        print(f\"Lỗi xử lý file: {e}\")\n"
            + "    finally:\n"
            + "        print(\"Quá trình xử lý hoàn tất\")\n"
            + "\n"
            + "process_file(\"data.csv\")",
            "class MultiLangError(Exception):\n"
            + "    MSG = {\n"
            + "        'en': \"Error occurred\",\n"
            + "        'vi': \"Đã xảy ra lỗi\",\n"
            + "        'ja': \"エラーが発生しました\"\n"
            + "    }\n"
            + "    \n"
            + "    def __init__(self, lang='en'):\n"
            + "        self.lang = lang\n"
            + "        super().__init__(self.MSG.get(lang, self.MSG['en']))\n"
            + "\n"
            + "try:\n"
            + "    raise MultiLangError('vi')\n"
            + "except MultiLangError as e:\n"
            + "    print(e)  # Output: Đã xảy ra lỗi",
            "class UserNotFoundError(ValueError):\n"
            + "    \"\"\"Raised when user lookup fails\"\"\"\n"
            + "    def __init__(self, user_id):\n"
            + "        self.user_id = user_id\n"
            + "        super().__init__(f\"User with ID {user_id} not found\")\n"
            + "\n"
            + "def get_user(user_id):\n"
            + "    if not user_exists(user_id):\n"
            + "        raise UserNotFoundError(user_id)\n"
            + "    # ...",
            "class APIError(Exception):\n"
            + "    \"\"\"Base API error\"\"\"\n"
            + "    def __init__(self, status_code, message):\n"
            + "        self.status_code = status_code\n"
            + "        self.message = message\n"
            + "        super().__init__(f\"{status_code}: {message}\")\n"
            + "\n"
            + "class NotFoundError(APIError):\n"
            + "    \"\"\"404 Not Found\"\"\"\n"
            + "    def __init__(self, resource):\n"
            + "        super().__init__(404, f\"{resource} not found\")\n"
            + "\n"
            + "def fetch_resource(resource_id):\n"
            + "    if not resource_exists(resource_id):\n"
            + "        raise NotFoundError(f\"Resource {resource_id}\")\n"
            + "    # ...\n"
            + "\n"
            + "try:\n"
            + "    fetch_resource(123)\n"
            + "except NotFoundError as e:\n"
            + "    print(f\"Error: {e.status_code} - {e}\")\n"
            + "except APIError as e:\n"
            + "    print(f\"API Error: {e}\")"
        });

        Code_MAP.put("Lập trình đa luồng", new String[]{
            "import threading\n"
            + "import time\n"
            + "\n"
            + "def task(name):\n"
            + "    print(f\"Luồng {name} bắt đầu\")\n"
            + "    time.sleep(2)\n"
            + "    print(f\"Luồng {name} kết thúc\")\n"
            + "\n"
            + "# Tạo và chạy các luồng\n"
            + "thread1 = threading.Thread(target=task, args=(\"1\",))\n"
            + "thread2 = threading.Thread(target=task, args=(\"2\",))\n"
            + "\n"
            + "thread1.start()\n"
            + "thread2.start()\n"
            + "\n"
            + "thread1.join()\n"
            + "thread2.join()\n"
            + "\n"
            + "print(\"Tất cả luồng đã hoàn thành\")",
            "import threading\n"
            + "\n"
            + "def worker():\n"
            + "    print(f\"Luồng {threading.current_thread().name} đang làm việc\")\n"
            + "    for i in range(3):\n"
            + "        print(f\"Bước {i}\")\n"
            + "\n"
            + "# Tạo luồng với tên tùy chỉnh\n"
            + "thread = threading.Thread(target=worker, name=\"WorkerThread\")\n"
            + "thread.start()\n"
            + "thread.join()",
            "import threading\n"
            + "\n"
            + "# Cách 1: Dùng args và kwargs\n"
            + "def greet(name, message):\n"
            + "    print(f\"{message}, {name}!\")\n"
            + "\n"
            + "thread1 = threading.Thread(\n"
            + "    target=greet,\n"
            + "    args=(\"Alice\",),\n"
            + "    kwargs={\"message\": \"Xin chào\"}\n"
            + ")\n"
            + "\n"
            + "# Cách 2: Kế thừa lớp Thread\n"
            + "class MyThread(threading.Thread):\n"
            + "    def __init__(self, name):\n"
            + "        super().__init__()\n"
            + "        self.name = name\n"
            + "    \n"
            + "    def run(self):\n"
            + "        print(f\"Xin chào từ {self.name}\")\n"
            + "\n"
            + "thread2 = MyThread(\"Luồng tùy chỉnh\")\n"
            + "\n"
            + "thread1.start()\n"
            + "thread2.start()\n"
            + "\n"
            + "thread1.join()\n"
            + "thread2.join()",
            "import threading\n"
            + "\n"
            + "counter = 0\n"
            + "lock = threading.Lock()\n"
            + "\n"
            + "def increment():\n"
            + "    global counter\n"
            + "    for _ in range(100000):\n"
            + "        with lock:  # Tương đương lock.acquire() và lock.release()\n"
            + "            counter += 1\n"
            + "\n"
            + "threads = []\n"
            + "for _ in range(5):\n"
            + "    thread = threading.Thread(target=increment)\n"
            + "    threads.append(thread)\n"
            + "    thread.start()\n"
            + "\n"
            + "for thread in threads:\n"
            + "    thread.join()\n"
            + "\n"
            + "print(f\"Counter cuối cùng: {counter}\")  # Luôn là 500000",
            "from concurrent.futures import ThreadPoolExecutor\n"
            + "import time\n"
            + "\n"
            + "def task(n):\n"
            + "    time.sleep(1)\n"
            + "    return n * n\n"
            + "\n"
            + "with ThreadPoolExecutor(max_workers=3) as executor:\n"
            + "    # Gửi các task vào pool\n"
            + "    futures = [executor.submit(task, i) for i in range(5)]\n"
            + "    \n"
            + "    # Nhận kết quả khi hoàn thành\n"
            + "    for future in futures:\n"
            + "        print(f\"Kết quả: {future.result()}\")\n"
            + "\n"
            + "print(\"Tất cả task hoàn thành\")",
            "import threading\n"
            + "import queue\n"
            + "import time\n"
            + "\n"
            + "# Sử dụng Queue\n"
            + "def producer(q):\n"
            + "    for i in range(5):\n"
            + "        time.sleep(0.5)\n"
            + "        q.put(i)\n"
            + "        print(f\"Sản xuất: {i}\")\n"
            + "\n"
            + "def consumer(q):\n"
            + "    while True:\n"
            + "        item = q.get()\n"
            + "        if item is None:  # Tín hiệu dừng\n"
            + "            break\n"
            + "        print(f\"Tiêu thụ: {item}\")\n"
            + "        q.task_done()\n"
            + "\n"
            + "q = queue.Queue()\n"
            + "threads = [\n"
            + "    threading.Thread(target=producer, args=(q,)),\n"
            + "    threading.Thread(target=consumer, args=(q,))\n"
            + "]\n"
            + "\n"
            + "for t in threads:\n"
            + "    t.start()\n"
            + "\n"
            + "threads[0].join()  # Đợi producer hoàn thành\n"
            + "q.put(None)        # Gửi tín hiệu dừng\n"
            + "threads[1].join()",
            "import threading\n"
            + "import time\n"
            + "\n"
            + "def background_task():\n"
            + "    while True:\n"
            + "        print(\"Đang chạy ngầm...\")\n"
            + "        time.sleep(1)\n"
            + "\n"
            + "daemon_thread = threading.Thread(target=background_task)\n"
            + "daemon_thread.daemon = True  # Đánh dấu là daemon thread\n"
            + "daemon_thread.start()\n"
            + "\n"
            + "print(\"Chương trình chính đang chạy...\")\n"
            + "time.sleep(3)\n"
            + "print(\"Chương trình chính kết thúc\")  # Daemon thread tự động dừng",
            "import threading\n"
            + "\n"
            + "local_data = threading.local()\n"
            + "\n"
            + "def show_data():\n"
            + "    print(f\"{threading.current_thread().name}: {local_data.value}\")\n"
            + "\n"
            + "def worker(value):\n"
            + "    local_data.value = value\n"
            + "    show_data()\n"
            + "\n"
            + "threads = [\n"
            + "    threading.Thread(target=worker, args=(\"A\",), name=\"Thread-A\"),\n"
            + "    threading.Thread(target=worker, args=(\"B\",), name=\"Thread-B\")\n"
            + "]\n"
            + "\n"
            + "for t in threads:\n"
            + "    t.start()\n"
            + "\n"
            + "for t in threads:\n"
            + "    t.join()",
            "import threading\n"
            + "\n"
            + "def hello():\n"
            + "    print(\"Xin chào sau 3 giây!\")\n"
            + "\n"
            + "timer = threading.Timer(3.0, hello)\n"
            + "timer.start()  # Bắt đầu đếm ngược\n"
            + "\n"
            + "# Có thể hủy trước khi chạy\n"
            + "# timer.cancel()",
            "import threading\n"
            + "import requests\n"
            + "import os\n"
            + "\n"
            + "class Downloader:\n"
            + "    def __init__(self, url, num_threads=4):\n"
            + "        self.url = url\n"
            + "        self.num_threads = num_threads\n"
            + "        self.lock = threading.Lock()\n"
            + "        self.progress = 0\n"
            + "    \n"
            + "    def download_chunk(self, start, end, chunk_id):\n"
            + "        headers = {'Range': f'bytes={start}-{end}'}\n"
            + "        response = requests.get(self.url, headers=headers, stream=True)\n"
            + "        \n"
            + "        with open(f\"part_{chunk_id}\", 'wb') as f:\n"
            + "            for chunk in response.iter_content(1024):\n"
            + "                f.write(chunk)\n"
            + "                \n"
            + "        with self.lock:\n"
            + "            self.progress += 1\n"
            + "            print(f\"Phần {chunk_id} hoàn thành ({self.progress}/{self.num_threads})\")\n"
            + "    \n"
            + "    def run(self):\n"
            + "        response = requests.head(self.url)\n"
            + "        file_size = int(response.headers.get('content-length', 0))\n"
            + "        \n"
            + "        chunk_size = file_size // self.num_threads\n"
            + "        threads = []\n"
            + "        \n"
            + "        for i in range(self.num_threads):\n"
            + "            start = i * chunk_size\n"
            + "            end = start + chunk_size - 1 if i < self.num_threads - 1 else file_size - 1\n"
            + "            \n"
            + "            thread = threading.Thread(\n"
            + "                target=self.download_chunk,\n"
            + "                args=(start, end, i)\n"
            + "            )\n"
            + "            threads.append(thread)\n"
            + "            thread.start()\n"
            + "        \n"
            + "        for thread in threads:\n"
            + "            thread.join()\n"
            + "        \n"
            + "        # Gộp các phần\n"
            + "        with open(\"output_file\", 'wb') as outfile:\n"
            + "            for i in range(self.num_threads):\n"
            + "                with open(f\"part_{i}\", 'rb') as infile:\n"
            + "                    outfile.write(infile.read())\n"
            + "                os.remove(f\"part_{i}\")\n"
            + "        \n"
            + "        print(\"Download hoàn thành!\")\n"
            + "\n"
            + "# Sử dụng\n"
            + "downloader = Downloader(\"https://example.com/large_file.zip\")\n"
            + "downloader.run()"
        });

        Code_MAP.put("Bất đồng bộ", new String[]{
            "import asyncio\n"
            + "\n"
            + "async def main():\n"
            + "    print(\"Hello\")\n"
            + "    await asyncio.sleep(1)  # Non-blocking sleep\n"
            + "    print(\"World\")\n"
            + "\n"
            + "asyncio.run(main())  # Chạy chương trình async",
            "import asyncio\n"
            + "\n"
            + "async def fetch_data():\n"
            + "    print(\"Bắt đầu lấy dữ liệu\")\n"
            + "    await asyncio.sleep(2)  # Giả lập I/O operation\n"
            + "    print(\"Hoàn thành lấy dữ liệu\")\n"
            + "    return {\"data\": 123}\n"
            + "\n"
            + "async def main():\n"
            + "    task = asyncio.create_task(fetch_data())\n"
            + "    print(\"Task đã được tạo\")\n"
            + "    \n"
            + "    # Có thể làm việc khác trong khi chờ task hoàn thành\n"
            + "    await asyncio.sleep(1)\n"
            + "    print(\"Đang chờ task...\")\n"
            + "    \n"
            + "    result = await task\n"
            + "    print(\"Kết quả:\", result)\n"
            + "\n"
            + "asyncio.run(main())",
            "import asyncio\n"
            + "\n"
            + "async def say_after(delay, message):\n"
            + "    await asyncio.sleep(delay)\n"
            + "    print(message)\n"
            + "\n"
            + "async def main():\n"
            + "    print(f\"Bắt đầu lúc {time.strftime('%X')}\")\n"
            + "    \n"
            + "    await say_after(1, 'Xin chào')\n"
            + "    await say_after(2, 'Thế giới')\n"
            + "    \n"
            + "    print(f\"Kết thúc lúc {time.strftime('%X')}\")\n"
            + "\n"
            + "asyncio.run(main())",
            "import asyncio\n"
            + "\n"
            + "async def factorial(name, number):\n"
            + "    f = 1\n"
            + "    for i in range(2, number + 1):\n"
            + "        print(f\"Task {name}: Tính factorial({i})...\")\n"
            + "        await asyncio.sleep(1)\n"
            + "        f *= i\n"
            + "    print(f\"Task {name}: Kết quả = {f}\")\n"
            + "    return f\n"
            + "\n"
            + "async def main():\n"
            + "    # Chạy đồng thời 3 coroutine\n"
            + "    results = await asyncio.gather(\n"
            + "        factorial(\"A\", 3),\n"
            + "        factorial(\"B\", 4),\n"
            + "        factorial(\"C\", 5),\n"
            + "    )\n"
            + "    print(\"Tất cả kết quả:\", results)\n"
            + "\n"
            + "asyncio.run(main())",
            "import asyncio\n"
            + "\n"
            + "async def eternity():\n"
            + "    await asyncio.sleep(3600)\n"
            + "    print('Hoàn thành!')\n"
            + "\n"
            + "async def main():\n"
            + "    try:\n"
            + "        # Timeout sau 1 giây\n"
            + "        await asyncio.wait_for(eternity(), timeout=1.0)\n"
            + "    except asyncio.TimeoutError:\n"
            + "        print('Timeout!')\n"
            + "\n"
            + "    # Hủy task\n"
            + "    task = asyncio.create_task(asyncio.sleep(5))\n"
            + "    await asyncio.sleep(1)\n"
            + "    task.cancel()\n"
            + "    \n"
            + "    try:\n"
            + "        await task\n"
            + "    except asyncio.CancelledError:\n"
            + "        print(\"Task đã bị hủy\")\n"
            + "\n"
            + "asyncio.run(main())",
            "import asyncio\n"
            + "import random\n"
            + "\n"
            + "async def producer(queue, id):\n"
            + "    for i in range(3):\n"
            + "        item = f\"sản phẩm {i} từ {id}\"\n"
            + "        await queue.put(item)\n"
            + "        print(f\"Producer {id}: Đã thêm {item}\")\n"
            + "        await asyncio.sleep(random.random())\n"
            + "\n"
            + "async def consumer(queue, id):\n"
            + "    while True:\n"
            + "        item = await queue.get()\n"
            + "        if item is None:\n"
            + "            break\n"
            + "            \n"
            + "        print(f\"Consumer {id}: Đã xử lý {item}\")\n"
            + "        queue.task_done()\n"
            + "\n"
            + "async def main():\n"
            + "    queue = asyncio.Queue(maxsize=2)\n"
            + "    \n"
            + "    producers = [asyncio.create_task(producer(queue, i)) for i in range(2)]\n"
            + "    consumers = [asyncio.create_task(consumer(queue, i)) for i in range(3)]\n"
            + "    \n"
            + "    await asyncio.gather(*producers)\n"
            + "    await queue.join()  # Đợi tất cả item được xử lý\n"
            + "    \n"
            + "    # Tắt consumers\n"
            + "    for _ in consumers:\n"
            + "        await queue.put(None)\n"
            + "    await asyncio.gather(*consumers)\n"
            + "\n"
            + "asyncio.run(main())",
            "import asyncio\n"
            + "\n"
            + "async def worker(lock, name):\n"
            + "    print(f\"{name} đang chờ lock\")\n"
            + "    async with lock:  # Tương đương await lock.acquire()\n"
            + "        print(f\"{name} đã lấy lock\")\n"
            + "        await asyncio.sleep(1)\n"
            + "    print(f\"{name} đã nhả lock\")\n"
            + "\n"
            + "async def main():\n"
            + "    lock = asyncio.Lock()\n"
            + "    \n"
            + "    await asyncio.gather(\n"
            + "        worker(lock, \"A\"),\n"
            + "        worker(lock, \"B\"),\n"
            + "        worker(lock, \"C\")\n"
            + "    )\n"
            + "\n"
            + "asyncio.run(main())",
            "import asyncio\n"
            + "import aiohttp  # Thư viện HTTP async\n"
            + "\n"
            + "async def fetch_url(session, url):\n"
            + "    async with session.get(url) as response:\n"
            + "        return await response.text()\n"
            + "\n"
            + "async def main():\n"
            + "    urls = [\n"
            + "        'https://python.org',\n"
            + "        'https://google.com',\n"
            + "        'https://github.com'\n"
            + "    ]\n"
            + "    \n"
            + "    async with aiohttp.ClientSession() as session:\n"
            + "        tasks = [fetch_url(session, url) for url in urls]\n"
            + "        results = await asyncio.gather(*tasks)\n"
            + "        \n"
            + "        for url, content in zip(urls, results):\n"
            + "            print(f\"{url}: {len(content)} bytes\")\n"
            + "\n"
            + "asyncio.run(main())",
            "import asyncio\n"
            + "\n"
            + "async def run_command(cmd):\n"
            + "    proc = await asyncio.create_subprocess_shell(\n"
            + "        cmd,\n"
            + "        stdout=asyncio.subprocess.PIPE,\n"
            + "        stderr=asyncio.subprocess.PIPE\n"
            + "    )\n"
            + "    \n"
            + "    stdout, stderr = await proc.communicate()\n"
            + "    \n"
            + "    if proc.returncode == 0:\n"
            + "        print(f\"[Thành công]\\n{stdout.decode()}\")\n"
            + "    else:\n"
            + "        print(f\"[Lỗi {proc.returncode}]\\n{stderr.decode()}\")\n"
            + "\n"
            + "async def main():\n"
            + "    await asyncio.gather(\n"
            + "        run_command(\"ls -l\"),\n"
            + "        run_command(\"echo 'Hello async'\"),\n"
            + "        run_command(\"ping -c 4 google.com\")\n"
            + "    )\n"
            + "\n"
            + "asyncio.run(main())",
            "import asyncio\n"
            + "import aiohttp\n"
            + "from urllib.parse import urljoin\n"
            + "from bs4 import BeautifulSoup\n"
            + "\n"
            + "class AsyncCrawler:\n"
            + "    def __init__(self, base_url, max_concurrent=5):\n"
            + "        self.base_url = base_url\n"
            + "        self.visited = set()\n"
            + "        self.semaphore = asyncio.Semaphore(max_concurrent)\n"
            + "    \n"
            + "    async def fetch(self, session, url):\n"
            + "        async with self.semaphore:\n"
            + "            try:\n"
            + "                async with session.get(url) as response:\n"
            + "                    if response.status == 200:\n"
            + "                        return await response.text()\n"
            + "            except Exception as e:\n"
            + "                print(f\"Lỗi khi fetch {url}: {e}\")\n"
            + "                return None\n"
            + "    \n"
            + "    async def parse_links(self, html, current_url):\n"
            + "        soup = BeautifulSoup(html, 'html.parser')\n"
            + "        links = set()\n"
            + "        \n"
            + "        for link in soup.find_all('a', href=True):\n"
            + "            url = urljoin(current_url, link['href'])\n"
            + "            if url.startswith(self.base_url) and url not in self.visited:\n"
            + "                links.add(url)\n"
            + "        \n"
            + "        return links\n"
            + "    \n"
            + "    async def crawl(self, session, url):\n"
            + "        if url in self.visited:\n"
            + "            return\n"
            + "        \n"
            + "        print(f\"Crawling: {url}\")\n"
            + "        self.visited.add(url)\n"
            + "        \n"
            + "        html = await self.fetch(session, url)\n"
            + "        if not html:\n"
            + "            return\n"
            + "        \n"
            + "        links = await self.parse_links(html, url)\n"
            + "        tasks = [self.crawl(session, link) for link in links]\n"
            + "        await asyncio.gather(*tasks)\n"
            + "    \n"
            + "    async def run(self):\n"
            + "        async with aiohttp.ClientSession() as session:\n"
            + "            await self.crawl(session, self.base_url)\n"
            + "        \n"
            + "        print(f\"\\nTổng số trang đã crawl: {len(self.visited)}\")\n"
            + "        print(\"5 trang đầu tiên:\")\n"
            + "        for url in list(self.visited)[:5]:\n"
            + "            print(f\"- {url}\")\n"
            + "\n"
            + "async def main():\n"
            + "    crawler = AsyncCrawler(\"https://python.org\")\n"
            + "    await crawler.run()\n"
            + "\n"
            + "asyncio.run(main())"
        });

        Code_MAP.put("Requests", new String[]{
            "import requests\n"
            + "\n"
            + "# Gửi GET request cơ bản\n"
            + "response = requests.get('https://api.github.com')\n"
            + "print(response.status_code)  # 200\n"
            + "print(response.json())  # Nội dung response dạng JSON",
            "import requests\n"
            + "\n"
            + "# GET request\n"
            + "response = requests.get('https://httpbin.org/get')\n"
            + "\n"
            + "# POST request với data\n"
            + "response = requests.post('https://httpbin.org/post', data={'key': 'value'})\n"
            + "\n"
            + "# PUT request\n"
            + "response = requests.put('https://httpbin.org/put', data={'key': 'new-value'})\n"
            + "\n"
            + "# DELETE request\n"
            + "response = requests.delete('https://httpbin.org/delete')\n"
            + "\n"
            + "print(response.status_code)",
            "import requests\n"
            + "\n"
            + "# Thêm query parameters\n"
            + "params = {\n"
            + "    'q': 'python requests',\n"
            + "    'page': 2,\n"
            + "    'sort': 'relevance'\n"
            + "}\n"
            + "\n"
            + "response = requests.get(\n"
            + "    'https://httpbin.org/get',\n"
            + "    params=params\n"
            + ")\n"
            + "\n"
            + "print(response.url)\n"
            + "# https://httpbin.org/get?q=python+requests&page=2&sort=relevance",
            "import requests\n"
            + "\n"
            + "headers = {\n"
            + "    'User-Agent': 'MyApp/1.0',\n"
            + "    'Accept': 'application/json',\n"
            + "    'Authorization': 'Bearer token123'\n"
            + "}\n"
            + "\n"
            + "response = requests.get(\n"
            + "    'https://httpbin.org/headers',\n"
            + "    headers=headers\n"
            + ")\n"
            + "\n"
            + "print(response.json())  # Xem headers đã gửi",
            "import requests\n"
            + "\n"
            + "# Form-encoded data\n"
            + "response = requests.post(\n"
            + "    'https://httpbin.org/post',\n"
            + "    data={'key': 'value'}\n"
            + ")\n"
            + "\n"
            + "# JSON data\n"
            + "response = requests.post(\n"
            + "    'https://httpbin.org/post',\n"
            + "    json={'key': 'value'}\n"
            + ")\n"
            + "\n"
            + "# Upload file\n"
            + "files = {'file': open('report.txt', 'rb')}\n"
            + "response = requests.post(\n"
            + "    'https://httpbin.org/post',\n"
            + "    files=files\n"
            + ")\n"
            + "\n"
            + "print(response.json())",
            "import requests\n"
            + "\n"
            + "response = requests.get('https://api.github.com/events')\n"
            + "\n"
            + "# Kiểm tra status code\n"
            + "if response.status_code == 200:\n"
            + "    print('Success!')\n"
            + "elif response.status_code == 404:\n"
            + "    print('Not Found.')\n"
            + "\n"
            + "# Lấy nội dung response\n"
            + "print(response.headers['Content-Type'])  # 'application/json'\n"
            + "data = response.json()  # Parse JSON\n"
            + "print(data[0]['id'])  # Truy cập dữ liệu JSON",
            "import requests\n"
            + "from requests.exceptions import RequestException, Timeout\n"
            + "\n"
            + "try:\n"
            + "    response = requests.get(\n"
            + "        'https://api.github.com',\n"
            + "        timeout=3.5  # Timeout cho cả connect và read\n"
            + "    )\n"
            + "    response.raise_for_status()  # Raise exception nếu status code lỗi\n"
            + "except Timeout:\n"
            + "    print(\"Request timeout\")\n"
            + "except ConnectionError:\n"
            + "    print(\"Không thể kết nối\")\n"
            + "except RequestException as e:\n"
            + "    print(f\"Lỗi request: {e}\")\n"
            + "else:\n"
            + "    print(\"Request thành công!\")",
            "import requests\n"
            + "\n"
            + "# Tạo session\n"
            + "session = requests.Session()\n"
            + "\n"
            + "# Cấu hình mặc định cho session\n"
            + "session.headers.update({'User-Agent': 'MyApp/1.0'})\n"
            + "\n"
            + "# Sử dụng session\n"
            + "session.get('https://httpbin.org/cookies/set/sessioncookie/123456789')\n"
            + "response = session.get('https://httpbin.org/cookies')\n"
            + "\n"
            + "print(response.json())  # Hiển thị cookies đã lưu",
            "import requests\n"
            + "from requests.auth import HTTPBasicAuth\n"
            + "\n"
            + "# Basic Authentication\n"
            + "response = requests.get(\n"
            + "    'https://api.github.com/user',\n"
            + "    auth=HTTPBasicAuth('username', 'password')\n"
            + ")\n"
            + "\n"
            + "# Hoặc ngắn gọn hơn\n"
            + "response = requests.get(\n"
            + "    'https://api.github.com/user',\n"
            + "    auth=('username', 'password')\n"
            + ")\n"
            + "\n"
            + "# OAuth với Bearer token\n"
            + "headers = {'Authorization': 'Bearer token123'}\n"
            + "response = requests.get(\n"
            + "    'https://api.github.com/user',\n"
            + "    headers=headers\n"
            + ")",
            "import requests\n"
            + "\n"
            + "# Sử dụng proxy\n"
            + "proxies = {\n"
            + "    'http': 'http://10.10.1.10:3128',\n"
            + "    'https': 'http://10.10.1.10:1080'\n"
            + "}\n"
            + "\n"
            + "response = requests.get(\n"
            + "    'https://api.github.com',\n"
            + "    proxies=proxies\n"
            + ")\n"
            + "\n"
            + "# Tắt SSL verification (không khuyến khích)\n"
            + "response = requests.get(\n"
            + "    'https://api.github.com',\n"
            + "    verify=False\n"
            + ")\n"
            + "\n"
            + "# Tùy chỉnh CA bundle\n"
            + "response = requests.get(\n"
            + "    'https://api.github.com',\n"
            + "    verify='/path/to/cert.pem'\n"
            + ")",
            "import requests\n"
            + "\n"
            + "url = 'https://www.python.org/static/img/python-logo.png'\n"
            + "\n"
            + "# Tải file với stream\n"
            + "response = requests.get(url, stream=True)\n"
            + "\n"
            + "# Lưu file theo từng chunk\n"
            + "with open('python-logo.png', 'wb') as f:\n"
            + "    for chunk in response.iter_content(chunk_size=8192):\n"
            + "        if chunk:  # Lọc keep-alive chunks\n"
            + "            f.write(chunk)\n"
            + "            print('Đã ghi 8KB...')\n"
            + "\n"
            + "print('Download hoàn thành!')",
            "import requests\n"
            + "from requests.exceptions import RequestException\n"
            + "\n"
            + "class GitHubAPI:\n"
            + "    BASE_URL = 'https://api.github.com'\n"
            + "    \n"
            + "    def __init__(self, token=None):\n"
            + "        self.session = requests.Session()\n"
            + "        if token:\n"
            + "            self.session.headers.update({\n"
            + "                'Authorization': f'token {token}'\n"
            + "            })\n"
            + "    \n"
            + "    def get_user(self, username):\n"
            + "        try:\n"
            + "            response = self.session.get(\n"
            + "                f'{self.BASE_URL}/users/{username}',\n"
            + "                timeout=5\n"
            + "            )\n"
            + "            response.raise_for_status()\n"
            + "            return response.json()\n"
            + "        except RequestException as e:\n"
            + "            print(f\"Lỗi khi lấy thông tin user: {e}\")\n"
            + "            return None\n"
            + "    \n"
            + "    def get_repos(self, username):\n"
            + "        try:\n"
            + "            response = self.session.get(\n"
            + "                f'{self.BASE_URL}/users/{username}/repos',\n"
            + "                timeout=5\n"
            + "            )\n"
            + "            response.raise_for_status()\n"
            + "            return response.json()\n"
            + "        except RequestException as e:\n"
            + "            print(f\"Lỗi khi lấy danh sách repo: {e}\")\n"
            + "            return None\n"
            + "\n"
            + "# Sử dụng\n"
            + "api = GitHubAPI()\n"
            + "user = api.get_user('octocat')\n"
            + "repos = api.get_repos('octocat')\n"
            + "\n"
            + "print(f\"User: {user['login']}\")\n"
            + "print(f\"Số repo: {len(repos)}\")"
        });

        Code_MAP.put("BeautifulSoup", new String[]{
            "from bs4 import BeautifulSoup\n"
            + "import requests\n"
            + "\n"
            + "# Lấy nội dung HTML từ web\n"
            + "response = requests.get('https://example.com')\n"
            + "html_content = response.text\n"
            + "\n"
            + "# Tạo đối tượng BeautifulSoup\n"
            + "soup = BeautifulSoup(html_content, 'html.parser')\n"
            + "\n"
            + "# Lấy tiêu đề trang\n"
            + "print(soup.title)  # <title>Example Domain</title>\n"
            + "print(soup.title.string)  # Example Domain",
            "from bs4 import BeautifulSoup\n"
            + "\n"
            + "html_doc = \"\"\"\n"
            + "<html><head><title>Test Page</title></head>\n"
            + "<body>\n"
            + "<p class=\"title\"><b>Test BeautifulSoup</b></p>\n"
            + "<p class=\"story\">...</p>\n"
            + "</body></html>\n"
            + "\"\"\"\n"
            + "\n"
            + "# Sử dụng các parser khác nhau\n"
            + "soup1 = BeautifulSoup(html_doc, 'html.parser')\n"
            + "soup2 = BeautifulSoup(html_doc, 'lxml')\n"
            + "soup3 = BeautifulSoup(html_doc, 'html5lib')\n"
            + "\n"
            + "print(soup1.prettify())  # Hiển thị HTML đã định dạng lại",
            "from bs4 import BeautifulSoup\n"
            + "\n"
            + "soup = BeautifulSoup('<b class=\"boldest\">Extremely bold</b>', 'html.parser')\n"
            + "\n"
            + "tag = soup.b  # Đối tượng Tag\n"
            + "print(type(tag))  # <class 'bs4.element.Tag'>\n"
            + "\n"
            + "string = tag.string  # Đối tượng NavigableString\n"
            + "print(type(string))  # <class 'bs4.element.NavigableString'>\n"
            + "\n"
            + "comment = BeautifulSoup(\"<!--This is a comment-->\", 'html.parser').contents[0]\n"
            + "print(type(comment))  # <class 'bs4.element.Comment'>",
            "from bs4 import BeautifulSoup\n"
            + "\n"
            + "html_doc = \"\"\"\n"
            + "<html>\n"
            + "<body>\n"
            + "<div id=\"main\">\n"
            + "  <h1>Header 1</h1>\n"
            + "  <p class=\"content\">Paragraph 1</p>\n"
            + "  <p class=\"content\">Paragraph 2</p>\n"
            + "  <a href=\"https://example.com\">Link</a>\n"
            + "</div>\n"
            + "</body>\n"
            + "</html>\n"
            + "\"\"\"\n"
            + "\n"
            + "soup = BeautifulSoup(html_doc, 'html.parser')\n"
            + "\n"
            + "# Tìm bằng find/find_all\n"
            + "first_p = soup.find('p')  # Tìm thẻ p đầu tiên\n"
            + "all_p = soup.find_all('p')  # Tìm tất cả thẻ p\n"
            + "p_with_class = soup.find_all('p', class_='content')  # Tìm p với class cụ thể\n"
            + "\n"
            + "# Tìm bằng CSS selector\n"
            + "div_content = soup.select('div#main')  # Tìm div có id=\"main\"\n"
            + "links = soup.select('a[href]')  # Tìm thẻ a có thuộc tính href\n"
            + "\n"
            + "print(f\"Tìm thấy {len(all_p)} thẻ p\")\n"
            + "print(f\"Link: {links[0]['href']}\")",
            "from bs4 import BeautifulSoup\n"
            + "\n"
            + "html = \"\"\"\n"
            + "<a href=\"https://example.com\" id=\"link1\" class=\"external\">Example <b>Site</b></a>\n"
            + "\"\"\"\n"
            + "\n"
            + "soup = BeautifulSoup(html, 'html.parser')\n"
            + "tag = soup.a\n"
            + "\n"
            + "# Truy cập thuộc tính\n"
            + "print(tag['href'])  # https://example.com\n"
            + "print(tag['id'])  # link1\n"
            + "print(tag.get('class'))  # ['external']\n"
            + "\n"
            + "# Truy cập nội dung\n"
            + "print(tag.text)  # Example Site\n"
            + "print(tag.get_text())  # Example Site\n"
            + "print(list(tag.strings))  # ['Example ', 'Site']",
            "from bs4 import BeautifulSoup\n"
            + "\n"
            + "html = \"\"\"\n"
            + "<html>\n"
            + "<body>\n"
            + "<div>\n"
            + "  <p>Paragraph 1</p>\n"
            + "  <p>Paragraph 2</p>\n"
            + "</div>\n"
            + "</body>\n"
            + "</html>\n"
            + "\"\"\"\n"
            + "\n"
            + "soup = BeautifulSoup(html, 'html.parser')\n"
            + "div = soup.div\n"
            + "\n"
            + "# Duyệt cây\n"
            + "print(div.parent.name)  # body\n"
            + "print([child.name for child in div.children])  # [None, 'p', None, 'p', None]\n"
            + "print([desc.name for desc in div.descendants if desc.name is not None])  # ['p', 'p']\n"
            + "\n"
            + "first_p = div.p\n"
            + "print(first_p.next_sibling.next_sibling)  # <p>Paragraph 2</p>",
            "from bs4 import BeautifulSoup\n"
            + "\n"
            + "soup = BeautifulSoup('<b class=\"boldest\">Old text</b>', 'html.parser')\n"
            + "tag = soup.b\n"
            + "\n"
            + "# Thay đổi thuộc tính\n"
            + "tag['class'] = 'newclass'\n"
            + "tag['id'] = 'boldest'\n"
            + "\n"
            + "# Thay đổi nội dung\n"
            + "tag.string = 'New text'\n"
            + "\n"
            + "# Thêm thẻ mới\n"
            + "new_tag = soup.new_tag('a', href='https://example.com')\n"
            + "new_tag.string = 'Link'\n"
            + "tag.append(new_tag)\n"
            + "\n"
            + "# Xóa thẻ\n"
            + "new_tag.decompose()\n"
            + "\n"
            + "print(soup.prettify())",
            "from bs4 import BeautifulSoup\n"
            + "import re\n"
            + "\n"
            + "html = \"\"\"\n"
            + "<div>\n"
            + "  <p id=\"first\">First paragraph</p>\n"
            + "  <p id=\"second\">Second paragraph</p>\n"
            + "  <p id=\"special\">Special paragraph</p>\n"
            + "</div>\n"
            + "\"\"\"\n"
            + "\n"
            + "soup = BeautifulSoup(html, 'html.parser')\n"
            + "\n"
            + "# Lọc bằng hàm\n"
            + "def has_id_but_no_class(tag):\n"
            + "    return tag.has_attr('id') and not tag.has_attr('class')\n"
            + "\n"
            + "results = soup.find_all(has_id_but_no_class)\n"
            + "\n"
            + "# Lọc bằng regex\n"
            + "tags = soup.find_all(id=re.compile(\"^[a-z]+\"))\n"
            + "\n"
            + "# Lọc bằng list\n"
            + "tags = soup.find_all(id=[\"first\", \"second\"])\n"
            + "\n"
            + "print(f\"Found {len(results)} tags with id but no class\")",
            "from bs4 import BeautifulSoup\n"
            + "import re\n"
            + "\n"
            + "html = \"\"\"\n"
            + "<ul>\n"
            + "  <li>  Item 1  </li>\n"
            + "  <li>Item 2 (price: $10.99)</li>\n"
            + "  <li>Item 3 (price: $20.50)</li>\n"
            + "</ul>\n"
            + "\"\"\"\n"
            + "\n"
            + "soup = BeautifulSoup(html, 'html.parser')\n"
            + "items = []\n"
            + "\n"
            + "for li in soup.find_all('li'):\n"
            + "    # Làm sạch văn bản\n"
            + "    text = li.get_text().strip()\n"
            + "    \n"
            + "    # Trích xuất giá\n"
            + "    price_match = re.search(r'\\$(\\d+\\.\\d{2})', text)\n"
            + "    price = float(price_match.group(1)) if price_match else None\n"
            + "    \n"
            + "    items.append({\n"
            + "        'name': re.sub(r'\\(.*\\)', '', text).strip(),\n"
            + "        'price': price\n"
            + "    })\n"
            + "\n"
            + "print(items)\n"
            + "# [{'name': 'Item 1', 'price': None}, \n"
            + "#  {'name': 'Item 2', 'price': 10.99}, \n"
            + "#  {'name': 'Item 3', 'price': 20.5}]",
            "import requests\n"
            + "from bs4 import BeautifulSoup\n"
            + "import csv\n"
            + "\n"
            + "def scrape_quotes():\n"
            + "    url = 'https://quotes.toscrape.com'\n"
            + "    quotes = []\n"
            + "    \n"
            + "    while url:\n"
            + "        # Gửi request và parse HTML\n"
            + "        response = requests.get(url)\n"
            + "        soup = BeautifulSoup(response.text, 'html.parser')\n"
            + "        \n"
            + "        # Trích xuất quotes trên trang hiện tại\n"
            + "        for quote in soup.select('div.quote'):\n"
            + "            text = quote.find('span', class_='text').get_text()\n"
            + "            author = quote.find('small', class_='author').get_text()\n"
            + "            tags = [tag.get_text() for tag in quote.find_all('a', class_='tag')]\n"
            + "            \n"
            + "            quotes.append({\n"
            + "                'text': text,\n"
            + "                'author': author,\n"
            + "                'tags': ', '.join(tags)\n"
            + "            })\n"
            + "        \n"
            + "        # Kiểm tra trang tiếp theo\n"
            + "        next_button = soup.select_one('li.next > a')\n"
            + "        url = f\"{url}{next_button['href']}\" if next_button else None\n"
            + "    \n"
            + "    # Lưu kết quả vào CSV\n"
            + "    with open('quotes.csv', 'w', newline='', encoding='utf-8') as f:\n"
            + "        writer = csv.DictWriter(f, fieldnames=['text', 'author', 'tags'])\n"
            + "        writer.writeheader()\n"
            + "        writer.writerows(quotes)\n"
            + "    \n"
            + "    print(f\"Đã lưu {len(quotes)} quotes vào quotes.csv\")\n"
            + "\n"
            + "scrape_quotes()",
            "import requests\n"
            + "from bs4 import BeautifulSoup\n"
            + "\n"
            + "# Thiết lập header để tránh bị chặn\n"
            + "headers = {\n"
            + "    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36'\n"
            + "}\n"
            + "\n"
            + "# Xử lý encoding\n"
            + "response = requests.get('https://example.com', headers=headers)\n"
            + "response.encoding = 'utf-8'  # Chỉ định encoding nếu cần\n"
            + "\n"
            + "# Dùng html5lib cho HTML không hợp lệ\n"
            + "soup = BeautifulSoup(response.text, 'html5lib')\n"
            + "\n"
            + "print(soup.title)"
        });

        Code_MAP.put("Selenium", new String[]{
            "from selenium import webdriver\n"
            + "\n"
            + "# Khởi tạo trình duyệt Chrome\n"
            + "driver = webdriver.Chrome()\n"
            + "\n"
            + "# Mở trang web\n"
            + "driver.get(\"https://www.google.com\")\n"
            + "\n"
            + "# In tiêu đề trang\n"
            + "print(driver.title)\n"
            + "\n"
            + "# Đóng trình duyệt\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.chrome.service import Service\n"
            + "\n"
            + "# Cấu hình ChromeDriver\n"
            + "service = Service('/path/to/chromedriver')  # Thay bằng đường dẫn thực tế\n"
            + "options = webdriver.ChromeOptions()\n"
            + "\n"
            + "# Khởi tạo trình duyệt với options\n"
            + "driver = webdriver.Chrome(service=service, options=options)",
            "from selenium import webdriver\n"
            + "import time\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "\n"
            + "# Mở trang web\n"
            + "driver.get(\"https://www.python.org\")\n"
            + "\n"
            + "# Điều hướng\n"
            + "time.sleep(2)\n"
            + "driver.get(\"https://www.google.com\")\n"
            + "time.sleep(2)\n"
            + "driver.back()  # Quay lại trang trước\n"
            + "time.sleep(2)\n"
            + "driver.forward()  # Tiến tới trang sau\n"
            + "\n"
            + "# Chụp màn hình\n"
            + "driver.save_screenshot(\"screenshot.png\")\n"
            + "\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.common.by import By\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "driver.get(\"https://www.python.org\")\n"
            + "\n"
            + "# Tìm phần tử bằng ID\n"
            + "search_box = driver.find_element(By.ID, \"id-search-field\")\n"
            + "\n"
            + "# Tìm phần tử bằng CSS selector\n"
            + "download_button = driver.find_element(By.CSS_SELECTOR, \"#downloads > a\")\n"
            + "\n"
            + "# Tìm phần tử bằng XPath\n"
            + "docs_link = driver.find_element(By.XPATH, \"//a[text()='Docs']\")\n"
            + "\n"
            + "print(search_box.get_attribute(\"placeholder\"))  # Lấy thuộc tính\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.common.by import By\n"
            + "from selenium.webdriver.common.keys import Keys\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "driver.get(\"https://www.google.com\")\n"
            + "\n"
            + "# Tìm ô tìm kiếm và nhập text\n"
            + "search_box = driver.find_element(By.NAME, \"q\")\n"
            + "search_box.send_keys(\"Selenium Python\")\n"
            + "search_box.send_keys(Keys.RETURN)  # Nhấn Enter\n"
            + "\n"
            + "# Click vào kết quả đầu tiên\n"
            + "first_result = driver.find_element(By.CSS_SELECTOR, \"h3\")\n"
            + "first_result.click()\n"
            + "\n"
            + "print(driver.title)\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.common.by import By\n"
            + "from selenium.webdriver.support.ui import Select\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "driver.get(\"https://example.com\")\n"
            + "\n"
            + "# Xử lý dropdown\n"
            + "dropdown = Select(driver.find_element(By.ID, \"dropdown\"))\n"
            + "dropdown.select_by_visible_text(\"Option 1\")\n"
            + "dropdown.select_by_value(\"value1\")\n"
            + "\n"
            + "# Xử lý iframe\n"
            + "iframe = driver.find_element(By.TAG_NAME, \"iframe\")\n"
            + "driver.switch_to.frame(iframe)\n"
            + "# Thao tác với các phần tử trong iframe\n"
            + "driver.switch_to.default_content()  # Quay lại main frame\n"
            + "\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.common.by import By\n"
            + "from selenium.webdriver.support.ui import WebDriverWait\n"
            + "from selenium.webdriver.support import expected_conditions as EC\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "driver.implicitly_wait(10)  # Implicit wait (giây)\n"
            + "\n"
            + "driver.get(\"https://www.google.com\")\n"
            + "\n"
            + "# Explicit wait\n"
            + "try:\n"
            + "    element = WebDriverWait(driver, 10).until(\n"
            + "        EC.presence_of_element_located((By.NAME, \"q\"))\n"
            + "    )\n"
            + "    element.send_keys(\"Selenium\")\n"
            + "except:\n"
            + "    print(\"Không tìm thấy phần tử\")\n"
            + "\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "driver.get(\"https://www.google.com\")\n"
            + "\n"
            + "# Mở tab mới\n"
            + "driver.execute_script(\"window.open('https://www.python.org')\")\n"
            + "\n"
            + "# Lấy danh sách các tab\n"
            + "windows = driver.window_handles\n"
            + "\n"
            + "# Chuyển sang tab mới\n"
            + "driver.switch_to.window(windows[1])\n"
            + "print(driver.title)\n"
            + "\n"
            + "# Đóng tab hiện tại\n"
            + "driver.close()\n"
            + "\n"
            + "# Quay lại tab gốc\n"
            + "driver.switch_to.window(windows[0])\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "driver.get(\"https://www.google.com\")\n"
            + "\n"
            + "# Thêm cookie\n"
            + "driver.add_cookie({\n"
            + "    'name': 'test_cookie',\n"
            + "    'value': '12345',\n"
            + "    'domain': '.google.com'\n"
            + "})\n"
            + "\n"
            + "# Lấy tất cả cookies\n"
            + "cookies = driver.get_cookies()\n"
            + "for cookie in cookies:\n"
            + "    print(cookie)\n"
            + "\n"
            + "# Xóa cookie\n"
            + "driver.delete_cookie('test_cookie')\n"
            + "\n"
            + "# Xóa tất cả cookies\n"
            + "driver.delete_all_cookies()\n"
            + "\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "driver.get(\"https://www.python.org\")\n"
            + "\n"
            + "# Scroll đến cuối trang\n"
            + "driver.execute_script(\"window.scrollTo(0, document.body.scrollHeight);\")\n"
            + "\n"
            + "# Thay đổi thuộc tính phần tử\n"
            + "driver.execute_script(\"document.title = 'New Title';\")\n"
            + "\n"
            + "# Lấy giá trị trả về từ JS\n"
            + "result = driver.execute_script(\"return 5 + 5;\")\n"
            + "print(result)  # 10\n"
            + "\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.common.action_chains import ActionChains\n"
            + "\n"
            + "driver = webdriver.Chrome()\n"
            + "driver.get(\"https://jqueryui.com/droppable/\")\n"
            + "\n"
            + "# Chuyển vào iframe\n"
            + "driver.switch_to.frame(driver.find_element(By.TAG_NAME, \"iframe\"))\n"
            + "\n"
            + "# Tạo action chain\n"
            + "source = driver.find_element(By.ID, \"draggable\")\n"
            + "target = driver.find_element(By.ID, \"droppable\")\n"
            + "\n"
            + "actions = ActionChains(driver)\n"
            + "actions.drag_and_drop(source, target).perform()\n"
            + "\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.chrome.options import Options\n"
            + "\n"
            + "# Cấu hình headless\n"
            + "chrome_options = Options()\n"
            + "chrome_options.add_argument(\"--headless\")\n"
            + "chrome_options.add_argument(\"--disable-gpu\")\n"
            + "chrome_options.add_argument(\"user-agent=Mozilla/5.0...\")\n"
            + "\n"
            + "driver = webdriver.Chrome(options=chrome_options)\n"
            + "driver.get(\"https://www.google.com\")\n"
            + "\n"
            + "print(driver.title)\n"
            + "driver.quit()",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.common.by import By\n"
            + "from selenium.webdriver.support.ui import WebDriverWait\n"
            + "from selenium.webdriver.support import expected_conditions as EC\n"
            + "\n"
            + "def auto_login(username, password):\n"
            + "    driver = webdriver.Chrome()\n"
            + "    driver.get(\"https://example.com/login\")\n"
            + "    \n"
            + "    try:\n"
            + "        # Chờ các phần tử hiển thị\n"
            + "        username_field = WebDriverWait(driver, 10).until(\n"
            + "            EC.presence_of_element_located((By.NAME, \"username\"))\n"
            + "        )\n"
            + "        password_field = driver.find_element(By.NAME, \"password\")\n"
            + "        login_button = driver.find_element(By.XPATH, \"//button[contains(text(),'Login')]\")\n"
            + "        \n"
            + "        # Nhập thông tin và đăng nhập\n"
            + "        username_field.send_keys(username)\n"
            + "        password_field.send_keys(password)\n"
            + "        login_button.click()\n"
            + "        \n"
            + "        # Kiểm tra đăng nhập thành công\n"
            + "        WebDriverWait(driver, 10).until(\n"
            + "            EC.title_contains(\"Dashboard\")\n"
            + "        )\n"
            + "        print(\"Đăng nhập thành công!\")\n"
            + "        \n"
            + "    except Exception as e:\n"
            + "        print(f\"Lỗi: {e}\")\n"
            + "        driver.save_screenshot(\"login_error.png\")\n"
            + "    finally:\n"
            + "        driver.quit()\n"
            + "\n"
            + "# Sử dụng\n"
            + "auto_login(\"your_username\", \"your_password\")",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.common.by import By\n"
            + "from selenium.webdriver.support.ui import WebDriverWait\n"
            + "from selenium.webdriver.support import expected_conditions as EC\n"
            + "\n"
            + "def scrape_products(url):\n"
            + "    driver = webdriver.Chrome()\n"
            + "    driver.get(url)\n"
            + "    \n"
            + "    products = []\n"
            + "    \n"
            + "    try:\n"
            + "        # Chờ các sản phẩm tải xong\n"
            + "        WebDriverWait(driver, 10).until(\n"
            + "            EC.presence_of_all_elements_located((By.CSS_SELECTOR, \".product\"))\n"
            + "        )\n"
            + "        \n"
            + "        # Lặp qua các sản phẩm\n"
            + "        items = driver.find_elements(By.CSS_SELECTOR, \".product\")\n"
            + "        for item in items:\n"
            + "            name = item.find_element(By.CSS_SELECTOR, \".name\").text\n"
            + "            price = item.find_element(By.CSS_SELECTOR, \".price\").text\n"
            + "            products.append({\"name\": name, \"price\": price})\n"
            + "            \n"
            + "        print(f\"Thu thập được {len(products)} sản phẩm\")\n"
            + "        return products\n"
            + "        \n"
            + "    except Exception as e:\n"
            + "        print(f\"Lỗi khi thu thập dữ liệu: {e}\")\n"
            + "        return []\n"
            + "    finally:\n"
            + "        driver.quit()\n"
            + "\n"
            + "# Sử dụng\n"
            + "products = scrape_products(\"https://example.com/products\")\n"
            + "for product in products[:5]:\n"
            + "    print(product)"
        });

        Code_MAP.put("SQLite", new String[]{
            "import sqlite3\n"
            + "\n"
            + "# Kết nối đến DB (tạo mới nếu chưa tồn tại)\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "\n"
            + "# Tạo đối tượng cursor để thực thi các lệnh SQL\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Đóng kết nối khi hoàn tất\n"
            + "conn.close()",
            "import sqlite3\n"
            + "\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Tạo bảng users\n"
            + "cursor.execute('''CREATE TABLE IF NOT EXISTS users\n"
            + "               (id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + "                name TEXT NOT NULL,\n"
            + "                age INTEGER,\n"
            + "                email TEXT UNIQUE NOT NULL)''')\n"
            + "\n"
            + "# Lưu thay đổi\n"
            + "conn.commit()\n"
            + "conn.close()",
            "import sqlite3\n"
            + "\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Thêm một bản ghi\n"
            + "cursor.execute(\"INSERT INTO users (name, age, email) VALUES (?, ?, ?)\",\n"
            + "              ('John Doe', 30, 'john@example.com'))\n"
            + "\n"
            + "# Thêm nhiều bản ghi cùng lúc\n"
            + "users = [\n"
            + "    ('Alice Smith', 25, 'alice@example.com'),\n"
            + "    ('Bob Johnson', 35, 'bob@example.com'),\n"
            + "    ('Charlie Brown', 40, 'charlie@example.com')\n"
            + "]\n"
            + "cursor.executemany(\"INSERT INTO users (name, age, email) VALUES (?, ?, ?)\", users)\n"
            + "\n"
            + "conn.commit()\n"
            + "conn.close()",
            "import sqlite3\n"
            + "\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Lấy tất cả bản ghi\n"
            + "cursor.execute(\"SELECT * FROM users\")\n"
            + "print(\"Tất cả người dùng:\")\n"
            + "print(cursor.fetchall())  # Trả về list các tuple\n"
            + "\n"
            + "# Lấy từng bản ghi một\n"
            + "cursor.execute(\"SELECT * FROM users\")\n"
            + "print(\"\\nTừng người dùng:\")\n"
            + "for row in cursor:\n"
            + "    print(row)\n"
            + "\n"
            + "# Lấy bản ghi với điều kiện\n"
            + "cursor.execute(\"SELECT * FROM users WHERE age > ?\", (30,))\n"
            + "print(\"\\nNgười dùng trên 30 tuổi:\")\n"
            + "print(cursor.fetchall())\n"
            + "\n"
            + "# Lấy một bản ghi duy nhất\n"
            + "cursor.execute(\"SELECT * FROM users WHERE email = ?\", ('john@example.com',))\n"
            + "print(\"\\nThông tin John:\")\n"
            + "print(cursor.fetchone())\n"
            + "\n"
            + "conn.close()",
            "import sqlite3\n"
            + "\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Cập nhật tuổi của John\n"
            + "cursor.execute(\"UPDATE users SET age = ? WHERE name = ?\", (31, 'John Doe'))\n"
            + "\n"
            + "# Kiểm tra số bản ghi bị ảnh hưởng\n"
            + "print(f\"Số bản ghi được cập nhật: {cursor.rowcount}\")\n"
            + "\n"
            + "conn.commit()\n"
            + "conn.close()",
            "import sqlite3\n"
            + "\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Xóa người dùng có email 'bob@example.com'\n"
            + "cursor.execute(\"DELETE FROM users WHERE email = ?\", ('bob@example.com',))\n"
            + "\n"
            + "print(f\"Số bản ghi bị xóa: {cursor.rowcount}\")\n"
            + "\n"
            + "conn.commit()\n"
            + "conn.close()",
            "import sqlite3\n"
            + "\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "try:\n"
            + "    # Bắt đầu giao dịch\n"
            + "    cursor.execute(\"INSERT INTO users (name, age, email) VALUES (?, ?, ?)\",\n"
            + "                  ('David Wilson', 28, 'david@example.com'))\n"
            + "    \n"
            + "    # Một thao tác khác\n"
            + "    cursor.execute(\"UPDATE users SET age = age + 1 WHERE name = ?\", ('Alice Smith',))\n"
            + "    \n"
            + "    # Nếu mọi thứ ok, commit\n"
            + "    conn.commit()\n"
            + "except sqlite3.Error as e:\n"
            + "    # Nếu có lỗi, rollback\n"
            + "    print(f\"Có lỗi xảy ra: {e}\")\n"
            + "    conn.rollback()\n"
            + "finally:\n"
            + "    conn.close()",
            "import sqlite3\n"
            + "\n"
            + "# Tự động commit/rollback và đóng kết nối\n"
            + "with sqlite3.connect('example.db') as conn:\n"
            + "    cursor = conn.cursor()\n"
            + "    cursor.execute(\"SELECT * FROM users\")\n"
            + "    print(cursor.fetchall())\n"
            + "# Kết nối tự động đóng khi ra khỏi block with",
            "import sqlite3\n"
            + "import datetime\n"
            + "\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Tạo bảng với nhiều kiểu dữ liệu\n"
            + "cursor.execute('''CREATE TABLE IF NOT EXISTS products\n"
            + "               (id INTEGER PRIMARY KEY,\n"
            + "                name TEXT,\n"
            + "                price REAL,\n"
            + "                quantity INTEGER,\n"
            + "                created_at TEXT,\n"
            + "                image BLOB)''')\n"
            + "\n"
            + "# Chèn dữ liệu với các kiểu khác nhau\n"
            + "current_time = datetime.datetime.now().isoformat()\n"
            + "cursor.execute(\"INSERT INTO products VALUES (?, ?, ?, ?, ?, ?)\",\n"
            + "              (1, 'Laptop', 999.99, 10, current_time, None))\n"
            + "\n"
            + "conn.commit()\n"
            + "conn.close()",
            "import sqlite3\n"
            + "\n"
            + "# Tạo thêm bảng orders để demo JOIN\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Tạo bảng orders\n"
            + "cursor.execute('''CREATE TABLE IF NOT EXISTS orders\n"
            + "               (id INTEGER PRIMARY KEY,\n"
            + "                user_id INTEGER,\n"
            + "                product TEXT,\n"
            + "                amount REAL,\n"
            + "                FOREIGN KEY(user_id) REFERENCES users(id))''')\n"
            + "\n"
            + "# Thêm dữ liệu mẫu\n"
            + "cursor.executemany(\"INSERT INTO orders VALUES (?, ?, ?, ?)\",\n"
            + "                  [(1, 1, 'Laptop', 999.99),\n"
            + "                   (2, 1, 'Mouse', 19.99),\n"
            + "                   (3, 2, 'Keyboard', 49.99)])\n"
            + "\n"
            + "# INNER JOIN\n"
            + "print(\"\\nĐơn hàng với thông tin người dùng:\")\n"
            + "cursor.execute('''SELECT users.name, orders.product, orders.amount \n"
            + "               FROM orders INNER JOIN users ON orders.user_id = users.id''')\n"
            + "for row in cursor:\n"
            + "    print(row)\n"
            + "\n"
            + "# GROUP BY\n"
            + "print(\"\\nTổng chi tiêu của mỗi người dùng:\")\n"
            + "cursor.execute('''SELECT users.name, SUM(orders.amount) as total\n"
            + "               FROM orders JOIN users ON orders.user_id = users.id\n"
            + "               GROUP BY users.name''')\n"
            + "for row in cursor:\n"
            + "    print(row)\n"
            + "\n"
            + "conn.commit()\n"
            + "conn.close()",
            "import sqlite3\n"
            + "\n"
            + "try:\n"
            + "    conn = sqlite3.connect('example.db')\n"
            + "    cursor = conn.cursor()\n"
            + "    \n"
            + "    # Câu lệnh SQL không hợp lệ\n"
            + "    cursor.execute(\"SELECT * FROM non_existent_table\")\n"
            + "    \n"
            + "except sqlite3.OperationalError as e:\n"
            + "    print(f\"Lỗi thao tác: {e}\")\n"
            + "except sqlite3.Error as e:\n"
            + "    print(f\"Lỗi SQLite: {e}\")\n"
            + "finally:\n"
            + "    if conn:\n"
            + "        conn.close()",
            "import sqlite3\n"
            + "\n"
            + "def backup_db(src_db, dst_db):\n"
            + "    \"\"\"Sao lưu DB từ src_db sang dst_db\"\"\"\n"
            + "    try:\n"
            + "        # Kết nối đến DB nguồn\n"
            + "        src_conn = sqlite3.connect(src_db)\n"
            + "        \n"
            + "        # Kết nối đến DB đích\n"
            + "        dst_conn = sqlite3.connect(dst_db)\n"
            + "        \n"
            + "        # Sao lưu\n"
            + "        with dst_conn:\n"
            + "            src_conn.backup(dst_conn)\n"
            + "            \n"
            + "        print(f\"Sao lưu thành công từ {src_db} sang {dst_db}\")\n"
            + "    except sqlite3.Error as e:\n"
            + "        print(f\"Lỗi khi sao lưu: {e}\")\n"
            + "    finally:\n"
            + "        if src_conn:\n"
            + "            src_conn.close()\n"
            + "        if dst_conn:\n"
            + "            dst_conn.close()\n"
            + "\n"
            + "# Sử dụng\n"
            + "backup_db('example.db', 'example_backup.db')",
            "import sqlite3\n"
            + "import time\n"
            + "\n"
            + "conn = sqlite3.connect('example.db')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# 1. Sử dụng chỉ mục (index)\n"
            + "cursor.execute(\"CREATE INDEX IF NOT EXISTS idx_user_email ON users(email)\")\n"
            + "\n"
            + "# 2. Thực thi nhiều lệnh cùng lúc\n"
            + "start_time = time.time()\n"
            + "for i in range(1000):\n"
            + "    cursor.execute(\"INSERT INTO users (name, age, email) VALUES (?, ?, ?)\",\n"
            + "                  (f'User{i}', 20+i, f'user{i}@example.com'))\n"
            + "conn.commit()\n"
            + "print(f\"Thời gian không dùng executemany: {time.time() - start_time:.4f}s\")\n"
            + "\n"
            + "# Xóa dữ liệu vừa thêm\n"
            + "cursor.execute(\"DELETE FROM users WHERE name LIKE 'User%'\")\n"
            + "conn.commit()\n"
            + "\n"
            + "# 3. Sử dụng executemany để tối ưu\n"
            + "users = [(f'User{i}', 20+i, f'user{i}@example.com') for i in range(1000)]\n"
            + "start_time = time.time()\n"
            + "cursor.executemany(\"INSERT INTO users (name, age, email) VALUES (?, ?, ?)\", users)\n"
            + "conn.commit()\n"
            + "print(f\"Thời gian dùng executemany: {time.time() - start_time:.4f}s\")\n"
            + "\n"
            + "conn.close()",
            "import sqlite3\n"
            + "from dataclasses import dataclass\n"
            + "\n"
            + "@dataclass\n"
            + "class Book:\n"
            + "    id: int\n"
            + "    title: str\n"
            + "    author: str\n"
            + "    year: int\n"
            + "    price: float\n"
            + "\n"
            + "class BookManager:\n"
            + "    def __init__(self, db_name):\n"
            + "        self.conn = sqlite3.connect(db_name)\n"
            + "        self.create_table()\n"
            + "    \n"
            + "    def create_table(self):\n"
            + "        cursor = self.conn.cursor()\n"
            + "        cursor.execute('''CREATE TABLE IF NOT EXISTS books\n"
            + "                       (id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + "                        title TEXT NOT NULL,\n"
            + "                        author TEXT NOT NULL,\n"
            + "                        year INTEGER,\n"
            + "                        price REAL)''')\n"
            + "        self.conn.commit()\n"
            + "    \n"
            + "    def add_book(self, book):\n"
            + "        cursor = self.conn.cursor()\n"
            + "        cursor.execute(\"INSERT INTO books (title, author, year, price) VALUES (?, ?, ?, ?)\",\n"
            + "                      (book.title, book.author, book.year, book.price))\n"
            + "        self.conn.commit()\n"
            + "        return cursor.lastrowid\n"
            + "    \n"
            + "    def get_all_books(self):\n"
            + "        cursor = self.conn.cursor()\n"
            + "        cursor.execute(\"SELECT * FROM books\")\n"
            + "        return [Book(*row) for row in cursor.fetchall()]\n"
            + "    \n"
            + "    def search_books(self, author=None, year=None):\n"
            + "        cursor = self.conn.cursor()\n"
            + "        query = \"SELECT * FROM books WHERE 1=1\"\n"
            + "        params = []\n"
            + "        \n"
            + "        if author:\n"
            + "            query += \" AND author LIKE ?\"\n"
            + "            params.append(f\"%{author}%\")\n"
            + "        \n"
            + "        if year:\n"
            + "            query += \" AND year = ?\"\n"
            + "            params.append(year)\n"
            + "        \n"
            + "        cursor.execute(query, params)\n"
            + "        return [Book(*row) for row in cursor.fetchall()]\n"
            + "    \n"
            + "    def close(self):\n"
            + "        self.conn.close()\n"
            + "\n"
            + "# Sử dụng\n"
            + "manager = BookManager('books.db')\n"
            + "\n"
            + "# Thêm sách\n"
            + "manager.add_book(Book(None, \"Python Crash Course\", \"Eric Matthes\", 2019, 29.99))\n"
            + "manager.add_book(Book(None, \"Fluent Python\", \"Luciano Ramalho\", 2015, 39.99))\n"
            + "manager.add_book(Book(None, \"Effective Python\", \"Brett Slatkin\", 2019, 34.99))\n"
            + "\n"
            + "# Lấy tất cả sách\n"
            + "print(\"Tất cả sách:\")\n"
            + "for book in manager.get_all_books():\n"
            + "    print(book)\n"
            + "\n"
            + "# Tìm kiếm sách\n"
            + "print(\"\\nSách xuất bản năm 2019:\")\n"
            + "for book in manager.search_books(year=2019):\n"
            + "    print(book)\n"
            + "\n"
            + "manager.close()"
        });

        Code_MAP.put("MySQL", new String[]{
            "pip install mysql-connector-python\n"
            + "# Hoặc\n"
            + "pip install pymysql",
            "import mysql.connector\n"
            + "\n"
            + "# Cấu hình kết nối\n"
            + "config = {\n"
            + "    'user': 'your_username',\n"
            + "    'password': 'your_password',\n"
            + "    'host': 'localhost',  # hoặc địa chỉ IP của server MySQL\n"
            + "    'database': 'your_database',\n"
            + "    'raise_on_warnings': True  # Hiển thị cảnh báo nếu có lỗi\n"
            + "}\n"
            + "\n"
            + "try:\n"
            + "    # Tạo kết nối\n"
            + "    conn = mysql.connector.connect(**config)\n"
            + "    print(\"✅ Kết nối thành công!\")\n"
            + "    \n"
            + "    # Tạo cursor để thực thi truy vấn\n"
            + "    cursor = conn.cursor()\n"
            + "    \n"
            + "except mysql.connector.Error as err:\n"
            + "    print(f\"❌ Lỗi kết nối: {err}\")\n"
            + "finally:\n"
            + "    # Luôn đóng kết nối sau khi dùng xong\n"
            + "    if 'conn' in locals() and conn.is_connected():\n"
            + "        cursor.close()\n"
            + "        conn.close()\n"
            + "        print(\"🔌 Đã đóng kết nối.\")",
            "import mysql.connector\n"
            + "\n"
            + "conn = mysql.connector.connect(\n"
            + "    host=\"localhost\",\n"
            + "    user=\"your_username\",\n"
            + "    password=\"your_password\",\n"
            + "    database=\"your_database\"\n"
            + ")\n"
            + "\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Tạo bảng customers nếu chưa tồn tại\n"
            + "create_table_query = \"\"\"\n"
            + "CREATE TABLE IF NOT EXISTS customers (\n"
            + "    id INT AUTO_INCREMENT PRIMARY KEY,\n"
            + "    name VARCHAR(255) NOT NULL,\n"
            + "    email VARCHAR(255) UNIQUE NOT NULL,\n"
            + "    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n"
            + ")\n"
            + "\"\"\"\n"
            + "\n"
            + "try:\n"
            + "    cursor.execute(create_table_query)\n"
            + "    print(\"✅ Tạo bảng thành công!\")\n"
            + "except mysql.connector.Error as err:\n"
            + "    print(f\"❌ Lỗi: {err}\")\n"
            + "finally:\n"
            + "    cursor.close()\n"
            + "    conn.close()",
            "conn = mysql.connector.connect(\n"
            + "    host=\"localhost\",\n"
            + "    user=\"your_username\",\n"
            + "    password=\"your_password\",\n"
            + "    database=\"your_database\"\n"
            + ")\n"
            + "\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Thêm dữ liệu vào bảng customers\n"
            + "add_customer = \"INSERT INTO customers (name, email) VALUES (%s, %s)\"\n"
            + "data_customer = (\"Nguyễn Văn A\", \"nguyenvana@example.com\")\n"
            + "\n"
            + "try:\n"
            + "    cursor.execute(add_customer, data_customer)\n"
            + "    conn.commit()  # Lưu thay đổi vào database\n"
            + "    print(\"✅ Thêm dữ liệu thành công!\")\n"
            + "except mysql.connector.Error as err:\n"
            + "    print(f\"❌ Lỗi: {err}\")\n"
            + "    conn.rollback()  # Hoàn tác nếu có lỗi\n"
            + "finally:\n"
            + "    cursor.close()\n"
            + "    conn.close()",
            "import mysql.connector\n"
            + "\n"
            + "conn = mysql.connector.connect(\n"
            + "    host=\"localhost\",\n"
            + "    user=\"your_username\",\n"
            + "    password=\"your_password\",\n"
            + "    database=\"your_database\"\n"
            + ")\n"
            + "\n"
            + "cursor = conn.cursor(dictionary=True)  # Trả về dạng dictionary\n"
            + "\n"
            + "query = \"SELECT id, name, email FROM customers\"\n"
            + "\n"
            + "try:\n"
            + "    cursor.execute(query)\n"
            + "    customers = cursor.fetchall()  # Lấy tất cả bản ghi\n"
            + "    \n"
            + "    for customer in customers:\n"
            + "        print(f\"ID: {customer['id']}, Tên: {customer['name']}, Email: {customer['email']}\")\n"
            + "        \n"
            + "except mysql.connector.Error as err:\n"
            + "    print(f\"❌ Lỗi: {err}\")\n"
            + "finally:\n"
            + "    cursor.close()\n"
            + "    conn.close()",
            "import mysql.connector\n"
            + "\n"
            + "conn = mysql.connector.connect(\n"
            + "    host=\"localhost\",\n"
            + "    user=\"your_username\",\n"
            + "    password=\"your_password\",\n"
            + "    database=\"your_database\"\n"
            + ")\n"
            + "\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "update_query = \"UPDATE customers SET email = %s WHERE id = %s\"\n"
            + "new_data = (\"new_email@example.com\", 1)  # (email_mới, id_cần_sửa)\n"
            + "\n"
            + "try:\n"
            + "    cursor.execute(update_query, new_data)\n"
            + "    conn.commit()\n"
            + "    print(\"✅ Cập nhật thành công!\")\n"
            + "except mysql.connector.Error as err:\n"
            + "    print(f\"❌ Lỗi: {err}\")\n"
            + "    conn.rollback()\n"
            + "finally:\n"
            + "    cursor.close()\n"
            + "    conn.close()",
            "import mysql.connector\n"
            + "\n"
            + "conn = mysql.connector.connect(\n"
            + "    host=\"localhost\",\n"
            + "    user=\"your_username\",\n"
            + "    password=\"your_password\",\n"
            + "    database=\"your_database\"\n"
            + ")\n"
            + "\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "delete_query = \"DELETE FROM customers WHERE id = %s\"\n"
            + "customer_id = (1,)  # Xóa khách hàng có ID = 1\n"
            + "\n"
            + "try:\n"
            + "    cursor.execute(delete_query, customer_id)\n"
            + "    conn.commit()\n"
            + "    print(\"✅ Xóa thành công!\")\n"
            + "except mysql.connector.Error as err:\n"
            + "    print(f\"❌ Lỗi: {err}\")\n"
            + "    conn.rollback()\n"
            + "finally:\n"
            + "    cursor.close()\n"
            + "    conn.close()"
        });

        Code_MAP.put("PostgreSQL", new String[]{
            "# Cài đặt thư viện\n"
            + "# pip install psycopg2-binary\n"
            + "\n"
            + "import psycopg2\n"
            + "\n"
            + "# Thiết lập kết nối\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "\n"
            + "# Tạo cursor để thực thi truy vấn\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# Kiểm tra phiên bản PostgreSQL\n"
            + "cur.execute(\"SELECT version();\")\n"
            + "version = cur.fetchone()\n"
            + "print(f\"PostgreSQL version: {version}\")\n"
            + "\n"
            + "# Đóng kết nối\n"
            + "cur.close()\n"
            + "conn.close()",
            "import psycopg2\n"
            + "\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# Tạo bảng users\n"
            + "cur.execute(\"\"\"\n"
            + "    CREATE TABLE IF NOT EXISTS users (\n"
            + "        user_id SERIAL PRIMARY KEY,\n"
            + "        username VARCHAR(50) UNIQUE NOT NULL,\n"
            + "        email VARCHAR(100) UNIQUE NOT NULL,\n"
            + "        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n"
            + "    )\n"
            + "\"\"\")\n"
            + "\n"
            + "# Tạo bảng posts với khóa ngoại đến users\n"
            + "cur.execute(\"\"\"\n"
            + "    CREATE TABLE IF NOT EXISTS posts (\n"
            + "        post_id SERIAL PRIMARY KEY,\n"
            + "        title VARCHAR(200) NOT NULL,\n"
            + "        content TEXT,\n"
            + "        user_id INTEGER REFERENCES users(user_id),\n"
            + "        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n"
            + "    )\n"
            + "\"\"\")\n"
            + "\n"
            + "# Commit các thay đổi\n"
            + "conn.commit()\n"
            + "\n"
            + "cur.close()\n"
            + "conn.close()",
            "import psycopg2\n"
            + "\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# CREATE - Thêm dữ liệu\n"
            + "cur.execute(\"\"\"\n"
            + "    INSERT INTO users (username, email)\n"
            + "    VALUES (%s, %s)\n"
            + "\"\"\", (\"john_doe\", \"john@example.com\"))\n"
            + "\n"
            + "# READ - Đọc dữ liệu\n"
            + "cur.execute(\"SELECT * FROM users\")\n"
            + "users = cur.fetchall()\n"
            + "print(\"All users:\")\n"
            + "for user in users:\n"
            + "    print(user)\n"
            + "\n"
            + "# UPDATE - Cập nhật dữ liệu\n"
            + "cur.execute(\"\"\"\n"
            + "    UPDATE users\n"
            + "    SET email = %s\n"
            + "    WHERE username = %s\n"
            + "\"\"\", (\"john.doe@example.com\", \"john_doe\"))\n"
            + "\n"
            + "# DELETE - Xóa dữ liệu\n"
            + "cur.execute(\"DELETE FROM users WHERE username = %s\", (\"john_doe\",))\n"
            + "\n"
            + "conn.commit()\n"
            + "cur.close()\n"
            + "conn.close()",
            "import psycopg2\n"
            + "\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "\n"
            + "try:\n"
            + "    cur = conn.cursor()\n"
            + "    \n"
            + "    # Bắt đầu giao dịch\n"
            + "    cur.execute(\"BEGIN\")\n"
            + "    \n"
            + "    # Thực hiện các thao tác\n"
            + "    cur.execute(\"INSERT INTO users (username, email) VALUES (%s, %s)\", \n"
            + "                (\"alice\", \"alice@example.com\"))\n"
            + "    cur.execute(\"INSERT INTO posts (title, content, user_id) VALUES (%s, %s, %s)\", \n"
            + "                (\"First Post\", \"Hello World!\", 1))\n"
            + "    \n"
            + "    # Commit nếu mọi thứ thành công\n"
            + "    conn.commit()\n"
            + "    print(\"Transaction committed successfully\")\n"
            + "    \n"
            + "except Exception as e:\n"
            + "    # Rollback nếu có lỗi\n"
            + "    conn.rollback()\n"
            + "    print(f\"Transaction rolled back due to error: {e}\")\n"
            + "    \n"
            + "finally:\n"
            + "    cur.close()\n"
            + "    conn.close()",
            "import psycopg2\n"
            + "\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# Truy vấn với INNER JOIN\n"
            + "cur.execute(\"\"\"\n"
            + "    SELECT u.username, p.title, p.created_at\n"
            + "    FROM users u\n"
            + "    INNER JOIN posts p ON u.user_id = p.user_id\n"
            + "    ORDER BY p.created_at DESC\n"
            + "\"\"\")\n"
            + "\n"
            + "# Lấy kết quả\n"
            + "posts_with_authors = cur.fetchall()\n"
            + "print(\"Posts with authors:\")\n"
            + "for post in posts_with_authors:\n"
            + "    print(f\"Author: {post[0]}, Title: {post[1]}, Date: {post[2]}\")\n"
            + "\n"
            + "cur.close()\n"
            + "conn.close()",
            "from sqlalchemy import create_engine, Column, Integer, String, ForeignKey\n"
            + "from sqlalchemy.ext.declarative import declarative_base\n"
            + "from sqlalchemy.orm import sessionmaker, relationship\n"
            + "\n"
            + "# Kết nối database\n"
            + "engine = create_engine('postgresql://postgres:yourpassword@localhost/mydatabase')\n"
            + "Base = declarative_base()\n"
            + "\n"
            + "# Định nghĩa model\n"
            + "class User(Base):\n"
            + "    __tablename__ = 'users'\n"
            + "    \n"
            + "    id = Column(Integer, primary_key=True)\n"
            + "    username = Column(String(50), unique=True)\n"
            + "    email = Column(String(100), unique=True)\n"
            + "    \n"
            + "    posts = relationship(\"Post\", back_populates=\"author\")\n"
            + "\n"
            + "class Post(Base):\n"
            + "    __tablename__ = 'posts'\n"
            + "    \n"
            + "    id = Column(Integer, primary_key=True)\n"
            + "    title = Column(String(200))\n"
            + "    content = Column(String)\n"
            + "    user_id = Column(Integer, ForeignKey('users.id'))\n"
            + "    \n"
            + "    author = relationship(\"User\", back_populates=\"posts\")\n"
            + "\n"
            + "# Tạo bảng\n"
            + "Base.metadata.create_all(engine)\n"
            + "\n"
            + "# Tạo session\n"
            + "Session = sessionmaker(bind=engine)\n"
            + "session = Session()\n"
            + "\n"
            + "# Thêm dữ liệu\n"
            + "new_user = User(username=\"bob\", email=\"bob@example.com\")\n"
            + "session.add(new_user)\n"
            + "session.commit()\n"
            + "\n"
            + "new_post = Post(title=\"SQLAlchemy Tutorial\", content=\"Learn SQLAlchemy\", author=new_user)\n"
            + "session.add(new_post)\n"
            + "session.commit()\n"
            + "\n"
            + "# Truy vấn dữ liệu\n"
            + "users = session.query(User).all()\n"
            + "for user in users:\n"
            + "    print(f\"User: {user.username}, Email: {user.email}\")\n"
            + "    for post in user.posts:\n"
            + "        print(f\"  - Post: {post.title}\")\n"
            + "\n"
            + "session.close()",
            "import psycopg2\n"
            + "\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# Tạo index để tối ưu truy vấn tìm kiếm theo username\n"
            + "cur.execute(\"CREATE INDEX IF NOT EXISTS idx_users_username ON users(username)\")\n"
            + "\n"
            + "# Tạo index phức hợp\n"
            + "cur.execute(\"\"\"\n"
            + "    CREATE INDEX IF NOT EXISTS idx_posts_user_created \n"
            + "    ON posts(user_id, created_at)\n"
            + "\"\"\")\n"
            + "\n"
            + "# Phân tích hiệu suất truy vấn\n"
            + "cur.execute(\"EXPLAIN ANALYZE SELECT * FROM users WHERE username = 'john_doe'\")\n"
            + "explanation = cur.fetchall()\n"
            + "print(\"Query explanation:\")\n"
            + "for line in explanation:\n"
            + "    print(line[0])\n"
            + "\n"
            + "conn.commit()\n"
            + "cur.close()\n"
            + "conn.close()",
            "import psycopg2\n"
            + "\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# Tạo function\n"
            + "cur.execute(\"\"\"\n"
            + "    CREATE OR REPLACE FUNCTION get_user_posts(user_id INTEGER)\n"
            + "    RETURNS TABLE (\n"
            + "        post_id INTEGER,\n"
            + "        title VARCHAR,\n"
            + "        created_at TIMESTAMP\n"
            + "    ) AS $$\n"
            + "    BEGIN\n"
            + "        RETURN QUERY\n"
            + "        SELECT p.post_id, p.title, p.created_at\n"
            + "        FROM posts p\n"
            + "        WHERE p.user_id = $1;\n"
            + "    END;\n"
            + "    $$ LANGUAGE plpgsql;\n"
            + "\"\"\")\n"
            + "\n"
            + "# Gọi function\n"
            + "cur.execute(\"SELECT * FROM get_user_posts(%s)\", (1,))\n"
            + "user_posts = cur.fetchall()\n"
            + "print(\"User posts:\")\n"
            + "for post in user_posts:\n"
            + "    print(post)\n"
            + "\n"
            + "conn.commit()\n"
            + "cur.close()\n"
            + "conn.close()",
            "import psycopg2\n"
            + "\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# Tạo cột tsvector và index cho tìm kiếm full-text\n"
            + "cur.execute(\"\"\"\n"
            + "    ALTER TABLE posts ADD COLUMN IF NOT EXISTS search_vector tsvector;\n"
            + "    UPDATE posts SET search_vector = to_tsvector('english', title || ' ' || content);\n"
            + "    CREATE INDEX IF NOT EXISTS idx_search_vector ON posts USING gin(search_vector);\n"
            + "\"\"\")\n"
            + "\n"
            + "# Thực hiện tìm kiếm full-text\n"
            + "search_query = \"tutorial\"\n"
            + "cur.execute(\"\"\"\n"
            + "    SELECT title, content\n"
            + "    FROM posts\n"
            + "    WHERE search_vector @@ to_tsquery('english', %s)\n"
            + "\"\"\", (search_query,))\n"
            + "\n"
            + "results = cur.fetchall()\n"
            + "print(f\"Search results for '{search_query}':\")\n"
            + "for result in results:\n"
            + "    print(f\"Title: {result[0]}\\nContent: {result[1][:100]}...\\n\")\n"
            + "\n"
            + "conn.commit()\n"
            + "cur.close()\n"
            + "conn.close()",
            "from psycopg2 import pool\n"
            + "\n"
            + "# Tạo connection pool\n"
            + "connection_pool = pool.SimpleConnectionPool(\n"
            + "    minconn=1,\n"
            + "    maxconn=10,\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "\n"
            + "# Lấy kết nối từ pool\n"
            + "conn = connection_pool.getconn()\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# Thực hiện truy vấn\n"
            + "cur.execute(\"SELECT * FROM users LIMIT 5\")\n"
            + "users = cur.fetchall()\n"
            + "for user in users:\n"
            + "    print(user)\n"
            + "\n"
            + "# Trả kết nối về pool\n"
            + "cur.close()\n"
            + "connection_pool.putconn(conn)\n"
            + "\n"
            + "# Đóng tất cả kết nối khi không cần thiết\n"
            + "connection_pool.closeall()",
            "import psycopg2\n"
            + "import json\n"
            + "\n"
            + "conn = psycopg2.connect(\n"
            + "    host=\"localhost\",\n"
            + "    database=\"mydatabase\",\n"
            + "    user=\"postgres\",\n"
            + "    password=\"yourpassword\"\n"
            + ")\n"
            + "cur = conn.cursor()\n"
            + "\n"
            + "# Tạo bảng với cột JSON\n"
            + "cur.execute(\"\"\"\n"
            + "    CREATE TABLE IF NOT EXISTS products (\n"
            + "        id SERIAL PRIMARY KEY,\n"
            + "        name VARCHAR(100) NOT NULL,\n"
            + "        attributes JSONB,\n"
            + "        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n"
            + "    )\n"
            + "\"\"\")\n"
            + "\n"
            + "# Thêm dữ liệu JSON\n"
            + "product_data = {\n"
            + "    \"color\": \"black\",\n"
            + "    \"weight\": 1.5,\n"
            + "    \"dimensions\": {\"width\": 10, \"height\": 20, \"depth\": 5},\n"
            + "    \"tags\": [\"electronics\", \"gadget\"]\n"
            + "}\n"
            + "\n"
            + "cur.execute(\"\"\"\n"
            + "    INSERT INTO products (name, attributes)\n"
            + "    VALUES (%s, %s)\n"
            + "\"\"\", (\"Smartphone\", json.dumps(product_data)))\n"
            + "\n"
            + "# Truy vấn dữ liệu JSON\n"
            + "cur.execute(\"\"\"\n"
            + "    SELECT name, attributes->>'color' as color\n"
            + "    FROM products\n"
            + "    WHERE attributes @> '{\"tags\": [\"electronics\"]}'\n"
            + "\"\"\")\n"
            + "\n"
            + "products = cur.fetchall()\n"
            + "print(\"Electronics products:\")\n"
            + "for product in products:\n"
            + "    print(f\"{product[0]} - Color: {product[1]}\")\n"
            + "\n"
            + "conn.commit()\n"
            + "cur.close()\n"
            + "conn.close()"
        });

        Code_MAP.put("ORM với SQLAlchemy", new String[]{
            "# Cài đặt SQLAlchemy\n"
            + "pip install sqlalchemy",
            "from sqlalchemy import create_engine\n"
            + "\n"
            + "# Kết nối đến SQLite (tạo file database.db nếu chưa có)\n"
            + "engine = create_engine('sqlite:///database.db', echo=True)\n"
            + "\n"
            + "# Kết nối đến MySQL\n"
            + "# engine = create_engine('mysql+pymysql://user:password@localhost/dbname')\n"
            + "\n"
            + "# Kết nối đến PostgreSQL\n"
            + "# engine = create_engine('postgresql://user:password@localhost/dbname')",
            "from sqlalchemy import Column, Integer, String\n"
            + "from sqlalchemy.ext.declarative import declarative_base\n"
            + "\n"
            + "Base = declarative_base()\n"
            + "\n"
            + "class User(Base):\n"
            + "    __tablename__ = 'users'\n"
            + "    \n"
            + "    id = Column(Integer, primary_key=True)\n"
            + "    name = Column(String(50))\n"
            + "    fullname = Column(String(50))\n"
            + "    nickname = Column(String(50))\n"
            + "    \n"
            + "    def __repr__(self):\n"
            + "        return f\"<User(name='{self.name}', fullname='{self.fullname}', nickname='{self.nickname}')>\"",
            "# Tạo tất cả các bảng chưa tồn tại\n"
            + "Base.metadata.create_all(engine)",
            "from sqlalchemy.orm import sessionmaker\n"
            + "\n"
            + "Session = sessionmaker(bind=engine)\n"
            + "session = Session()",
            "# Tạo đối tượng mới\n"
            + "new_user = User(name='john', fullname='John Doe', nickname='johnd')\n"
            + "\n"
            + "# Thêm vào session\n"
            + "session.add(new_user)\n"
            + "\n"
            + "# Commit để lưu vào database\n"
            + "session.commit()",
            "# Lấy tất cả users\n"
            + "users = session.query(User).all()\n"
            + "print(users)\n"
            + "\n"
            + "# Lấy user đầu tiên\n"
            + "first_user = session.query(User).first()\n"
            + "print(first_user)\n"
            + "\n"
            + "# Lọc theo điều kiện\n"
            + "johns = session.query(User).filter(User.name == 'john').all()\n"
            + "print(johns)",
            "# Lấy user cần cập nhật\n"
            + "user_to_update = session.query(User).filter_by(name='john').first()\n"
            + "\n"
            + "# Cập nhật thông tin\n"
            + "user_to_update.nickname = 'jd'\n"
            + "\n"
            + "# Commit thay đổi\n"
            + "session.commit()",
            "# Lấy user cần xóa\n"
            + "user_to_delete = session.query(User).filter_by(name='john').first()\n"
            + "\n"
            + "# Xóa user\n"
            + "session.delete(user_to_delete)\n"
            + "\n"
            + "# Commit thay đổi\n"
            + "session.commit()",
            "from sqlalchemy import ForeignKey\n"
            + "from sqlalchemy.orm import relationship\n"
            + "\n"
            + "class Address(Base):\n"
            + "    __tablename__ = 'addresses'\n"
            + "    id = Column(Integer, primary_key=True)\n"
            + "    email_address = Column(String, nullable=False)\n"
            + "    user_id = Column(Integer, ForeignKey('users.id'))\n"
            + "    \n"
            + "    user = relationship(\"User\", back_populates=\"addresses\")\n"
            + "    \n"
            + "    def __repr__(self):\n"
            + "        return f\"<Address(email_address='{self.email_address}')>\"\n"
            + "\n"
            + "# Thêm quan hệ ngược lại trong User\n"
            + "User.addresses = relationship(\"Address\", order_by=Address.id, back_populates=\"user\")",
            "# Tạo user với nhiều địa chỉ\n"
            + "new_user = User(\n"
            + "    name='alice',\n"
            + "    fullname='Alice Smith',\n"
            + "    nickname='alice'\n"
            + ")\n"
            + "new_user.addresses = [\n"
            + "    Address(email_address='alice@example.com'),\n"
            + "    Address(email_address='alice@work.com')\n"
            + "]\n"
            + "\n"
            + "session.add(new_user)\n"
            + "session.commit()\n"
            + "\n"
            + "# Truy vấn user và các địa chỉ\n"
            + "user = session.query(User).filter_by(name='alice').first()\n"
            + "print(user.addresses)",
            "# Join User và Address\n"
            + "results = session.query(User, Address).join(Address).all()\n"
            + "for user, address in results:\n"
            + "    print(user.name, address.email_address)",
            "from sqlalchemy import or_\n"
            + "\n"
            + "# Lọc với nhiều điều kiện\n"
            + "users = session.query(User).filter(\n"
            + "    or_(\n"
            + "        User.name == 'john',\n"
            + "        User.name == 'alice'\n"
            + "    )\n"
            + ").all()",
            "# Lấy 5 users đầu tiên\n"
            + "users_page1 = session.query(User).limit(5).all()\n"
            + "\n"
            + "# Lấy 5 users tiếp theo (bỏ qua 5 đầu)\n"
            + "users_page2 = session.query(User).offset(5).limit(5).all()",
            "try:\n"
            + "    # Bắt đầu transaction\n"
            + "    user1 = User(name='user1', fullname='User One', nickname='u1')\n"
            + "    session.add(user1)\n"
            + "    \n"
            + "    user2 = User(name='user2', fullname='User Two', nickname='u2')\n"
            + "    session.add(user2)\n"
            + "    \n"
            + "    # Commit nếu mọi thứ thành công\n"
            + "    session.commit()\n"
            + "except:\n"
            + "    # Rollback nếu có lỗi\n"
            + "    session.rollback()\n"
            + "    raise\n"
            + "finally:\n"
            + "    # Đóng session\n"
            + "    session.close()",
            "from sqlalchemy import select, insert, update, delete\n"
            + "\n"
            + "# SELECT\n"
            + "stmt = select(User).where(User.name == 'john')\n"
            + "result = session.execute(stmt)\n"
            + "for user in result.scalars():\n"
            + "    print(user)\n"
            + "\n"
            + "# INSERT\n"
            + "stmt = insert(User).values(name='bob', fullname='Bob Brown', nickname='bb')\n"
            + "session.execute(stmt)\n"
            + "session.commit()\n"
            + "\n"
            + "# UPDATE\n"
            + "stmt = update(User).where(User.name == 'bob').values(nickname='bobby')\n"
            + "session.execute(stmt)\n"
            + "session.commit()\n"
            + "\n"
            + "# DELETE\n"
            + "stmt = delete(User).where(User.name == 'bob')\n"
            + "session.execute(stmt)\n"
            + "session.commit()",
            "from sqlalchemy.ext.asyncio import create_async_engine, AsyncSession\n"
            + "from sqlalchemy.future import select\n"
            + "\n"
            + "async def main():\n"
            + "    # Tạo async engine\n"
            + "    engine = create_async_engine('sqlite+aiosqlite:///async_db.db')\n"
            + "    \n"
            + "    async with engine.begin() as conn:\n"
            + "        await conn.run_sync(Base.metadata.create_all)\n"
            + "    \n"
            + "    # Tạo async session\n"
            + "    async_session = AsyncSession(engine)\n"
            + "    \n"
            + "    # Thêm user mới\n"
            + "    async with async_session:\n"
            + "        new_user = User(name='async', fullname='Async User', nickname='async')\n"
            + "        async_session.add(new_user)\n"
            + "        await async_session.commit()\n"
            + "    \n"
            + "    # Truy vấn dữ liệu\n"
            + "    async with async_session:\n"
            + "        result = await async_session.execute(select(User))\n"
            + "        users = result.scalars().all()\n"
            + "        print(users)\n"
            + "    \n"
            + "    await engine.dispose()\n"
            + "\n"
            + "# Chạy với asyncio\n"
            + "import asyncio\n"
            + "asyncio.run(main())",
            "# Cài đặt\n"
            + "pip install alembic\n"
            + "\n"
            + "# Khởi tạo\n"
            + "alembic init migrations\n"
            + "\n"
            + "# Cấu hình alembic.ini và env.py\n"
            + "# Tạo migration\n"
            + "alembic revision --autogenerate -m \"create user table\"\n"
            + "\n"
            + "# Áp dụng migration\n"
            + "alembic upgrade head"
        });

        Code_MAP.put("Pandas", new String[]{
            "pip install pandas",
            "import pandas as pd\n"
            + "\n"
            + "# Tạo Series từ list\n"
            + "data = [10, 20, 30, 40]\n"
            + "s = pd.Series(data, index=['a', 'b', 'c', 'd'])\n"
            + "print(s)",
            "a    10\n"
            + "b    20\n"
            + "c    30\n"
            + "d    40\n"
            + "dtype: int64",
            "import pandas as pd\n"
            + "\n"
            + "# Tạo DataFrame từ dictionary\n"
            + "data = {\n"
            + "    'Tên': ['An', 'Bình', 'Chi'],\n"
            + "    'Tuổi': [20, 25, 30],\n"
            + "    'Lương': [1000, 1500, 2000]\n"
            + "}\n"
            + "df = pd.DataFrame(data)\n"
            + "print(df)",
            "   Tên  Tuổi  Lương\n"
            + "0   An    20   1000\n"
            + "1 Bình    25   1500\n"
            + "2  Chi    30   2000",
            "import pandas as pd\n"
            + "\n"
            + "# Đọc file CSV\n"
            + "df = pd.read_csv('data.csv')\n"
            + "print(df.head())  # Hiển thị 5 dòng đầu",
            "df.to_csv('output.csv', index=False)  # index=False để không ghi số thứ tự",
            "df = pd.read_excel('data.xlsx', sheet_name='Sheet1')",
            "df.to_excel('output.xlsx', sheet_name='Sheet1', index=False)",
            "print(df.head())    # 5 dòng đầu\n"
            + "print(df.tail())    # 5 dòng cuối\n"
            + "print(df.info())    # Thông tin cấu trúc\n"
            + "print(df.describe()) # Thống kê cơ bản",
            "# Lấy cột \"Tên\"\n"
            + "print(df['Tên'])\n"
            + "\n"
            + "# Lấy dòng đầu tiên\n"
            + "print(df.iloc[0])\n"
            + "\n"
            + "# Lọc dữ liệu theo điều kiện\n"
            + "print(df[df['Tuổi'] > 25])",
            "# Thêm cột mới\n"
            + "df['Thưởng'] = [100, 200, 300]\n"
            + "\n"
            + "# Xóa cột\n"
            + "df.drop('Thưởng', axis=1, inplace=True)",
            "# Sắp xếp theo cột \"Tuổi\" giảm dần\n"
            + "df.sort_values('Tuổi', ascending=False, inplace=True)",
            "# Kiểm tra giá trị thiếu\n"
            + "print(df.isnull())\n"
            + "\n"
            + "# Xóa dòng có giá trị thiếu\n"
            + "df.dropna(inplace=True)\n"
            + "\n"
            + "# Thay thế NaN bằng giá trị mặc định\n"
            + "df.fillna(0, inplace=True)",
            "# Nhóm theo cột \"Tên\" và tính trung bình\n"
            + "grouped = df.groupby('Tên').mean()\n"
            + "print(grouped)",
            "print(df['Lương'].sum())    # Tổng\n"
            + "print(df['Tuổi'].mean())    # Trung bình\n"
            + "print(df['Lương'].max())    # Giá trị lớn nhất",
            "df1 = pd.DataFrame({'A': [1, 2], 'B': [3, 4]})\n"
            + "df2 = pd.DataFrame({'A': [5, 6], 'B': [7, 8]})\n"
            + "result = pd.concat([df1, df2], ignore_index=True)\n"
            + "print(result)",
            "left = pd.DataFrame({'key': ['A', 'B'], 'value': [1, 2]})\n"
            + "right = pd.DataFrame({'key': ['A', 'B'], 'value': [3, 4]})\n"
            + "merged = pd.merge(left, right, on='key')\n"
            + "print(merged)",
            "# Chuyển cột thành kiểu datetime\n"
            + "df['Ngày'] = pd.to_datetime(df['Ngày'])\n"
            + "\n"
            + "# Lấy năm, tháng, ngày\n"
            + "df['Năm'] = df['Ngày'].dt.year\n"
            + "df['Tháng'] = df['Ngày'].dt.month",
            "import matplotlib.pyplot as plt\n"
            + "\n"
            + "# Vẽ biểu đồ cột\n"
            + "df.plot(kind='bar', x='Tên', y='Lương')\n"
            + "plt.show()"
        });

        Code_MAP.put("Numpy", new String[]{
            "pip install numpy",
            "import numpy as np  # Quy ước đặt tên ngắn gọn là np",
            "import numpy as np\n"
            + "\n"
            + "# Tạo mảng 1 chiều\n"
            + "arr1 = np.array([1, 2, 3, 4, 5])\n"
            + "print(arr1)  # Output: [1 2 3 4 5]\n"
            + "\n"
            + "# Tạo mảng 2 chiều (ma trận)\n"
            + "arr2 = np.array([[1, 2, 3], [4, 5, 6]])\n"
            + "print(arr2)\n"
            + "# Output:\n"
            + "# [[1 2 3]\n"
            + "#  [4 5 6]]",
            "# Mảng toàn số 0\n"
            + "zeros_arr = np.zeros((2, 3))  # 2 hàng, 3 cột\n"
            + "print(zeros_arr)\n"
            + "# Output:\n"
            + "# [[0. 0. 0.]\n"
            + "#  [0. 0. 0.]]\n"
            + "\n"
            + "# Mảng toàn số 1\n"
            + "ones_arr = np.ones((3, 2))\n"
            + "print(ones_arr)\n"
            + "# Output:\n"
            + "# [[1. 1.]\n"
            + "#  [1. 1.]\n"
            + "#  [1. 1.]]\n"
            + "\n"
            + "# Mảng với giá trị ngẫu nhiên\n"
            + "random_arr = np.random.random((2, 2))\n"
            + "print(random_arr)\n"
            + "# Output (ví dụ):\n"
            + "# [[0.42 0.89]\n"
            + "#  [0.15 0.73]]",
            "arr = np.array([[1, 2, 3], [4, 5, 6]])\n"
            + "\n"
            + "print(\"Shape:\", arr.shape)      # Kích thước: (2, 3)\n"
            + "print(\"Number of dimensions:\", arr.ndim)  # Số chiều: 2\n"
            + "print(\"Data type:\", arr.dtype)  # Kiểu dữ liệu: int64\n"
            + "print(\"Size:\", arr.size)        # Tổng số phần tử: 6",
            "arr = np.array([[1, 2, 3], [4, 5, 6]])\n"
            + "\n"
            + "# Lấy phần tử ở hàng 1, cột 2\n"
            + "print(arr[1, 2])  # Output: 6\n"
            + "\n"
            + "# Lấy cả hàng đầu tiên\n"
            + "print(arr[0, :])  # Output: [1 2 3]\n"
            + "\n"
            + "# Lấy cột cuối cùng\n"
            + "print(arr[:, -1])  # Output: [3 6]",
            "arr[1, 1] = 99  # Gán giá trị mới\n"
            + "print(arr)\n"
            + "# Output:\n"
            + "# [[ 1  2  3]\n"
            + "#  [ 4 99  6]]",
            "a = np.array([1, 2, 3])\n"
            + "b = np.array([4, 5, 6])\n"
            + "\n"
            + "print(\"a + b =\", a + b)  # Cộng: [5 7 9]\n"
            + "print(\"a - b =\", a - b)  # Trừ: [-3 -3 -3]\n"
            + "print(\"a * b =\", a * b)  # Nhân từng phần tử: [4 10 18]\n"
            + "print(\"a / b =\", a / b)  # Chia từng phần tử: [0.25 0.4 0.5]",
            "A = np.array([[1, 2], [3, 4]])\n"
            + "B = np.array([[5, 6], [7, 8]])\n"
            + "\n"
            + "# Nhân ma trận (dot product)\n"
            + "C = np.dot(A, B)\n"
            + "print(C)\n"
            + "# Output:\n"
            + "# [[19 22]\n"
            + "#  [43 50]]",
            "a = np.array([1, 2, 3])\n"
            + "b = 2  # Tự động thành [2, 2, 2]\n"
            + "\n"
            + "print(a + b)  # Output: [3 4 5]",
            "arr = np.arange(6)  # [0 1 2 3 4 5]\n"
            + "reshaped = arr.reshape(2, 3)\n"
            + "print(reshaped)\n"
            + "# Output:\n"
            + "# [[0 1 2]\n"
            + "#  [3 4 5]]",
            "A = np.array([[1, 2], [3, 4]])\n"
            + "A_transposed = A.T\n"
            + "print(A_transposed)\n"
            + "# Output:\n"
            + "# [[1 3]\n"
            + "#  [2 4]]",
            "data = np.array([1, 2, 3, 4, 5])\n"
            + "\n"
            + "print(\"Mean:\", np.mean(data))      # Trung bình: 3.0\n"
            + "print(\"Max:\", np.max(data))        # Giá trị lớn nhất: 5\n"
            + "print(\"Min:\", np.min(data))        # Giá trị nhỏ nhất: 1\n"
            + "print(\"Sum:\", np.sum(data))        # Tổng: 15\n"
            + "print(\"Standard deviation:\", np.std(data))  # Độ lệch chuẩn",
            "arr = np.array([1, 2, 3, 4, 5])\n"
            + "\n"
            + "# Lọc các phần tử > 3\n"
            + "filtered = arr[arr > 3]\n"
            + "print(filtered)  # Output: [4 5]",
            "arr = np.array([1, 2, 3])\n"
            + "np.save(\"my_array.npy\", arr)  # Lưu dưới dạng .npy",
            "loaded_arr = np.load(\"my_array.npy\")\n"
            + "print(loaded_arr)  # Output: [1 2 3]"
        });

        Code_MAP.put("Matplotlib", new String[]{
            "pip install matplotlib",
            "import matplotlib.pyplot as plt\n"
            + "\n"
            + "# Dữ liệu\n"
            + "x = [1, 2, 3, 4, 5]\n"
            + "y = [2, 4, 6, 8, 10]\n"
            + "\n"
            + "# Vẽ đồ thị\n"
            + "plt.plot(x, y)\n"
            + "\n"
            + "# Thêm tiêu đề và nhãn\n"
            + "plt.title(\"Biểu đồ đường đơn giản\")\n"
            + "plt.xlabel(\"Trục X\")\n"
            + "plt.ylabel(\"Trục Y\")\n"
            + "\n"
            + "# Hiển thị đồ thị\n"
            + "plt.show()",
            "import matplotlib.pyplot as plt\n"
            + "\n"
            + "# Dữ liệu\n"
            + "categories = ['A', 'B', 'C', 'D']\n"
            + "values = [15, 20, 10, 25]\n"
            + "\n"
            + "# Vẽ đồ thị cột\n"
            + "plt.bar(categories, values, color='skyblue')\n"
            + "\n"
            + "# Thêm tiêu đề và nhãn\n"
            + "plt.title(\"Biểu đồ cột\")\n"
            + "plt.xlabel(\"Danh mục\")\n"
            + "plt.ylabel(\"Giá trị\")\n"
            + "\n"
            + "plt.show()",
            "import matplotlib.pyplot as plt\n"
            + "\n"
            + "# Dữ liệu\n"
            + "x = [1, 2, 3, 4, 5]\n"
            + "y = [2, 3, 5, 7, 11]\n"
            + "\n"
            + "# Vẽ đồ thị phân tán\n"
            + "plt.scatter(x, y, color='red', marker='o')\n"
            + "\n"
            + "# Thêm tiêu đề\n"
            + "plt.title(\"Biểu đồ phân tán\")\n"
            + "plt.xlabel(\"X\")\n"
            + "plt.ylabel(\"Y\")\n"
            + "\n"
            + "plt.show()",
            "import matplotlib.pyplot as plt\n"
            + "\n"
            + "# Dữ liệu\n"
            + "labels = ['A', 'B', 'C', 'D']\n"
            + "sizes = [15, 30, 45, 10]\n"
            + "colors = ['gold', 'lightcoral', 'lightskyblue', 'lightgreen']\n"
            + "\n"
            + "# Vẽ biểu đồ tròn\n"
            + "plt.pie(sizes, labels=labels, colors=colors, autopct='%1.1f%%')\n"
            + "\n"
            + "# Thêm tiêu đề\n"
            + "plt.title(\"Biểu đồ tròn\")\n"
            + "\n"
            + "plt.show()",
            "import matplotlib.pyplot as plt\n"
            + "import numpy as np\n"
            + "\n"
            + "# Tạo dữ liệu ngẫu nhiên\n"
            + "data = np.random.randn(1000)\n"
            + "\n"
            + "# Vẽ histogram\n"
            + "plt.hist(data, bins=30, color='purple', alpha=0.7)\n"
            + "\n"
            + "# Thêm tiêu đề\n"
            + "plt.title(\"Histogram\")\n"
            + "plt.xlabel(\"Giá trị\")\n"
            + "plt.ylabel(\"Tần suất\")\n"
            + "\n"
            + "plt.show()",
            "import matplotlib.pyplot as plt\n"
            + "from mpl_toolkits.mplot3d import Axes3D\n"
            + "import numpy as np\n"
            + "\n"
            + "# Tạo dữ liệu\n"
            + "x = np.linspace(-5, 5, 100)\n"
            + "y = np.linspace(-5, 5, 100)\n"
            + "X, Y = np.meshgrid(x, y)\n"
            + "Z = np.sin(np.sqrt(X**2 + Y**2))\n"
            + "\n"
            + "# Tạo figure 3D\n"
            + "fig = plt.figure()\n"
            + "ax = fig.add_subplot(111, projection='3d')\n"
            + "\n"
            + "# Vẽ đồ thị bề mặt\n"
            + "ax.plot_surface(X, Y, Z, cmap='viridis')\n"
            + "\n"
            + "# Thêm tiêu đề\n"
            + "plt.title(\"Đồ thị 3D\")\n"
            + "\n"
            + "plt.show()",
            "import matplotlib.pyplot as plt\n"
            + "\n"
            + "x = [1, 2, 3, 4, 5]\n"
            + "y1 = [1, 2, 3, 4, 5]\n"
            + "y2 = [1, 4, 9, 16, 25]\n"
            + "\n"
            + "plt.plot(x, y1, label='y = x')\n"
            + "plt.plot(x, y2, label='y = x²')\n"
            + "\n"
            + "plt.legend()  # Hiển thị chú thích\n"
            + "plt.title(\"Đồ thị có chú thích\")\n"
            + "plt.show()",
            "plt.plot(x, y1, color='red', linewidth=2, linestyle='--')\n"
            + "plt.plot(x, y2, color='blue', linewidth=3, linestyle=':')\n"
            + "plt.show()",
            "plt.savefig(\"plot.png\")  # Lưu dưới dạng PNG\n"
            + "plt.savefig(\"plot.pdf\")  # Lưu dưới dạng PDF"
        });

        Code_MAP.put("Socket", new String[]{
            "import socket\n"
            + "# Tạo socket TCP\n"
            + "tcp_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "# Tạo socket UDP\n"
            + "udp_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)",
            "import socket\n"
            + "server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "server_socket.bind(('localhost', 12345))\n"
            + "server_socket.listen(5)\n"
            + "print(\"Server đang chờ kết nối...\")\n"
            + "client_socket, addr = server_socket.accept()\n"
            + "data = client_socket.recv(1024)\n"
            + "print(\"Nhận:\", data.decode())\n"
            + "client_socket.sendall(b\"Hello Client\")\n"
            + "client_socket.close()",
            "import socket\n"
            + "client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "client_socket.connect(('localhost', 12345))\n"
            + "client_socket.sendall(b\"Hello Server\")\n"
            + "response = client_socket.recv(1024)\n"
            + "print(\"Phản hồi từ server:\", response.decode())\n"
            + "client_socket.close()",
            "import socket\n"
            + "udp_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "udp_socket.bind(('localhost', 12345))\n"
            + "data, addr = udp_socket.recvfrom(1024)\n"
            + "print(\"Nhận từ\", addr, \":\", data.decode())\n"
            + "udp_socket.sendto(b\"Hello UDP Client\", addr)",
            "import socket\n"
            + "udp_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "udp_socket.sendto(b\"Hello UDP Server\", ('localhost', 12345))\n"
            + "response, addr = udp_socket.recvfrom(1024)\n"
            + "print(\"Phản hồi từ server:\", response.decode())",
            "import socket, select\n"
            + "server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "server_socket.bind(('localhost', 12345))\n"
            + "server_socket.listen(5)\n"
            + "sockets_list = [server_socket]\n"
            + "while True:\n"
            + "    read_sockets, _, _ = select.select(sockets_list, [], [])\n"
            + "    for sock in read_sockets:\n"
            + "        if sock == server_socket:  # Kết nối mới\n"
            + "            client_socket, addr = server_socket.accept()\n"
            + "            sockets_list.append(client_socket)\n"
            + "        else:  # Dữ liệu từ client\n"
            + "            data = sock.recv(1024)\n"
            + "            if not data:  # Client đóng kết nối\n"
            + "                sockets_list.remove(sock)\n"
            + "                sock.close()",
            "import socket\n"
            + "sock = socket.socket(socket.AF_INET6, socket.SOCK_STREAM)\n"
            + "sock.bind(('::1', 12345))  # ::1 là IPv6 localhost",
            "import socket\n"
            + "sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "sock.settimeout(5.0)  # 5 giây\n"
            + "try:\n"
            + "    sock.connect(('localhost', 12345))\n"
            + "except socket.timeout:\n"
            + "    print(\"Kết nối timeout!\")",
            "with open('file.txt', 'rb') as f:\n"
            + "    while (chunk := f.read(1024)):\n"
            + "        client_socket.sendall(chunk)",
            "with open('received_file.txt', 'wb') as f:\n"
            + "    while True:\n"
            + "        data = client_socket.recv(1024)\n"
            + "        if not data:\n"
            + "            break\n"
            + "        f.write(data)",
            "import threading\n"
            + "def handle_client(client_socket):\n"
            + "    data = client_socket.recv(1024)\n"
            + "    client_socket.sendall(b\"OK\")\n"
            + "    client_socket.close()\n"
            + "\n"
            + "server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "server_socket.bind(('localhost', 12345))\n"
            + "server_socket.listen(5)\n"
            + "while True:\n"
            + "    client_socket, addr = server_socket.accept()\n"
            + "    thread = threading.Thread(target=handle_client, args=(client_socket,))\n"
            + "    thread.start()",
            "udp_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "udp_socket.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, 1)\n"
            + "udp_socket.sendto(b\"Broadcast Message\", ('255.255.255.255', 12345))",
            "import ssl\n"
            + "context = ssl.create_default_context()\n"
            + "ssl_socket = context.wrap_socket(socket.socket(), server_hostname='example.com')\n"
            + "ssl_socket.connect(('example.com', 443))\n"
            + "ssl_socket.sendall(b\"GET / HTTP/1.1\\r\\nHost: example.com\\r\\n\\r\\n\")",
            "print(socket.gethostbyname('google.com'))  # IP của Google\n"
            + "print(socket.getaddrinfo('google.com', 80))  # Thông tin đầy đủ",
            "raw_socket = socket.socket(socket.AF_PACKET, socket.SOCK_RAW, socket.htons(0x0003))\n"
            + "while True:\n"
            + "    packet = raw_socket.recvfrom(65565)\n"
            + "    print(packet[0][:20])  # In 20 byte đầu",
            "sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "sock.setblocking(0)  # Non-blocking mode\n"
            + "try:\n"
            + "    sock.connect(('localhost', 12345))\n"
            + "except BlockingIOError:\n"
            + "    print(\"Đang chờ kết nối...\")"
        });

        Code_MAP.put("Giao thức TCP/IP", new String[]{
            "import socket\n"
            + "\n"
            + "# Tạo socket TCP\n"
            + "sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "print(\"Socket created successfully\")\n"
            + "\n"
            + "# Đóng socket khi không dùng nữa\n"
            + "sock.close()",
            "import socket\n"
            + "\n"
            + "# Tạo socket TCP\n"
            + "server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "\n"
            + "# Bind địa chỉ và cổng\n"
            + "server_address = ('localhost', 12345)\n"
            + "print(f\"Starting server on {server_address[0]} port {server_address[1]}\")\n"
            + "server_socket.bind(server_address)\n"
            + "\n"
            + "# Lắng nghe kết nối, tối đa 5 kết nối chờ\n"
            + "server_socket.listen(5)\n"
            + "\n"
            + "while True:\n"
            + "    print(\"Waiting for connection...\")\n"
            + "    # Chấp nhận kết nối mới\n"
            + "    connection, client_address = server_socket.accept()\n"
            + "    \n"
            + "    try:\n"
            + "        print(f\"Connection from {client_address}\")\n"
            + "        \n"
            + "        # Nhận dữ liệu từ client\n"
            + "        data = connection.recv(1024)\n"
            + "        print(f\"Received: {data.decode()}\")\n"
            + "        \n"
            + "        # Gửi phản hồi\n"
            + "        connection.sendall(b\"Message received by server\")\n"
            + "    \n"
            + "    finally:\n"
            + "        # Đóng kết nối\n"
            + "        connection.close()",
            "import socket\n"
            + "\n"
            + "# Tạo socket TCP\n"
            + "client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "\n"
            + "# Địa chỉ server\n"
            + "server_address = ('localhost', 12345)\n"
            + "\n"
            + "try:\n"
            + "    # Kết nối đến server\n"
            + "    print(f\"Connecting to {server_address[0]} port {server_address[1]}\")\n"
            + "    client_socket.connect(server_address)\n"
            + "    \n"
            + "    # Gửi dữ liệu\n"
            + "    message = b\"Hello, server!\"\n"
            + "    print(f\"Sending: {message}\")\n"
            + "    client_socket.sendall(message)\n"
            + "    \n"
            + "    # Nhận phản hồi\n"
            + "    data = client_socket.recv(1024)\n"
            + "    print(f\"Received: {data.decode()}\")\n"
            + "\n"
            + "finally:\n"
            + "    # Đóng kết nối\n"
            + "    print(\"Closing socket\")\n"
            + "    client_socket.close()",
            "import socket\n"
            + "import threading\n"
            + "\n"
            + "def handle_client(connection, client_address):\n"
            + "    try:\n"
            + "        print(f\"Connection from {client_address}\")\n"
            + "        \n"
            + "        while True:\n"
            + "            data = connection.recv(1024)\n"
            + "            if not data:\n"
            + "                break\n"
            + "            print(f\"Received from {client_address}: {data.decode()}\")\n"
            + "            connection.sendall(b\"Message received\")\n"
            + "    \n"
            + "    finally:\n"
            + "        connection.close()\n"
            + "\n"
            + "# Tạo socket server\n"
            + "server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "server_address = ('localhost', 12345)\n"
            + "server_socket.bind(server_address)\n"
            + "server_socket.listen(5)\n"
            + "print(f\"Server listening on {server_address[0]}:{server_address[1]}\")\n"
            + "\n"
            + "try:\n"
            + "    while True:\n"
            + "        connection, client_address = server_socket.accept()\n"
            + "        client_thread = threading.Thread(\n"
            + "            target=handle_client,\n"
            + "            args=(connection, client_address)\n"
            + "        )\n"
            + "        client_thread.start()\n"
            + "        print(f\"Active connections: {threading.active_count() - 1}\")\n"
            + "\n"
            + "finally:\n"
            + "    server_socket.close()",
            "import socket\n"
            + "import pickle\n"
            + "\n"
            + "server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "server_socket.bind(('localhost', 12345))\n"
            + "server_socket.listen(1)\n"
            + "\n"
            + "conn, addr = server_socket.accept()\n"
            + "\n"
            + "try:\n"
            + "    data = conn.recv(4096)\n"
            + "    received_object = pickle.loads(data)\n"
            + "    print(f\"Received object: {received_object}\")\n"
            + "    \n"
            + "    # Gửi phản hồi\n"
            + "    response = {\"status\": \"success\", \"message\": \"Object received\"}\n"
            + "    conn.sendall(pickle.dumps(response))\n"
            + "\n"
            + "finally:\n"
            + "    conn.close()",
            "import socket\n"
            + "import pickle\n"
            + "\n"
            + "client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "client_socket.connect(('localhost', 12345))\n"
            + "\n"
            + "data_to_send = {\n"
            + "    \"name\": \"Alice\",\n"
            + "    \"age\": 30,\n"
            + "    \"hobbies\": [\"reading\", \"swimming\"]\n"
            + "}\n"
            + "\n"
            + "try:\n"
            + "    client_socket.sendall(pickle.dumps(data_to_send))\n"
            + "    \n"
            + "    response = client_socket.recv(4096)\n"
            + "    print(f\"Server response: {pickle.loads(response)}\")\n"
            + "\n"
            + "finally:\n"
            + "    client_socket.close()",
            "import socket\n"
            + "\n"
            + "# Tạo socket với timeout\n"
            + "sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "sock.settimeout(5.0)  # Timeout 5 giây\n"
            + "\n"
            + "try:\n"
            + "    sock.connect(('localhost', 12345))\n"
            + "    sock.sendall(b\"Test message\")\n"
            + "    data = sock.recv(1024)\n"
            + "    print(f\"Received: {data.decode()}\")\n"
            + "    \n"
            + "except socket.timeout:\n"
            + "    print(\"Connection or read operation timed out\")\n"
            + "    \n"
            + "except socket.error as e:\n"
            + "    print(f\"Socket error: {e}\")\n"
            + "    \n"
            + "finally:\n"
            + "    sock.close()",
            "import socket\n"
            + "\n"
            + "# Tạo IPv6 TCP socket\n"
            + "sock = socket.socket(socket.AF_INET6, socket.SOCK_STREAM)\n"
            + "\n"
            + "# Bind với IPv6\n"
            + "server_address = ('::1', 12345)  # ::1 là localhost IPv6\n"
            + "sock.bind(server_address)\n"
            + "sock.listen(1)\n"
            + "\n"
            + "print(\"IPv6 TCP server is running...\")\n"
            + "conn, addr = sock.accept()\n"
            + "\n"
            + "try:\n"
            + "    print(f\"Connection from {addr}\")\n"
            + "    data = conn.recv(1024)\n"
            + "    print(f\"Received: {data.decode()}\")\n"
            + "    conn.sendall(b\"Hello IPv6 client\")\n"
            + "\n"
            + "finally:\n"
            + "    conn.close()\n"
            + "    sock.close()",
            "import socket\n"
            + "\n"
            + "sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "\n"
            + "# Bật TCP keepalive\n"
            + "sock.setsockopt(socket.SOL_SOCKET, socket.SO_KEEPALIVE, 1)\n"
            + "\n"
            + "# Cấu hình keepalive (Linux)\n"
            + "sock.setsockopt(socket.IPPROTO_TCP, socket.TCP_KEEPIDLE, 60)  # 60s không hoạt động\n"
            + "sock.setsockopt(socket.IPPROTO_TCP, socket.TCP_KEEPINTVL, 10)  # Gửi mỗi 10s\n"
            + "sock.setsockopt(socket.IPPROTO_TCP, socket.TCP_KEEPCNT, 6)     # Số lần thử\n"
            + "\n"
            + "sock.connect(('localhost', 12345))\n"
            + "\n"
            + "try:\n"
            + "    while True:\n"
            + "        sock.sendall(b\"Keepalive test\")\n"
            + "        data = sock.recv(1024)\n"
            + "        print(f\"Received: {data.decode()}\")\n"
            + "        \n"
            + "except socket.error as e:\n"
            + "    print(f\"Connection error: {e}\")\n"
            + "    \n"
            + "finally:\n"
            + "    sock.close()",
            "import socket\n"
            + "import ssl\n"
            + "\n"
            + "context = ssl.create_default_context(ssl.Purpose.CLIENT_AUTH)\n"
            + "context.load_cert_chain(certfile=\"server.crt\", keyfile=\"server.key\")\n"
            + "\n"
            + "sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "sock.bind(('localhost', 12345))\n"
            + "sock.listen(5)\n"
            + "\n"
            + "print(\"SSL server is running...\")\n"
            + "\n"
            + "while True:\n"
            + "    conn, addr = sock.accept()\n"
            + "    ssl_conn = context.wrap_socket(conn, server_side=True)\n"
            + "    \n"
            + "    try:\n"
            + "        print(f\"Connection from {addr}\")\n"
            + "        data = ssl_conn.recv(1024)\n"
            + "        print(f\"Received: {data.decode()}\")\n"
            + "        ssl_conn.sendall(b\"Secure message received\")\n"
            + "    \n"
            + "    except ssl.SSLError as e:\n"
            + "        print(f\"SSL error: {e}\")\n"
            + "    \n"
            + "    finally:\n"
            + "        ssl_conn.close()",
            "import socket\n"
            + "import ssl\n"
            + "\n"
            + "context = ssl.create_default_context(ssl.Purpose.SERVER_AUTH)\n"
            + "context.load_verify_locations(\"server.crt\")  # Chứng chỉ server\n"
            + "\n"
            + "sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "ssl_sock = context.wrap_socket(sock, server_hostname=\"localhost\")\n"
            + "\n"
            + "try:\n"
            + "    ssl_sock.connect(('localhost', 12345))\n"
            + "    ssl_sock.sendall(b\"Hello secure server\")\n"
            + "    data = ssl_sock.recv(1024)\n"
            + "    print(f\"Received: {data.decode()}\")\n"
            + "\n"
            + "except ssl.SSLError as e:\n"
            + "    print(f\"SSL error: {e}\")\n"
            + "\n"
            + "finally:\n"
            + "    ssl_sock.close()",
            "import socket\n"
            + "from concurrent.futures import ThreadPoolExecutor\n"
            + "\n"
            + "def scan_port(host, port):\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "    sock.settimeout(1)\n"
            + "    \n"
            + "    try:\n"
            + "        result = sock.connect_ex((host, port))\n"
            + "        if result == 0:\n"
            + "            print(f\"Port {port} is open\")\n"
            + "        sock.close()\n"
            + "    except socket.error:\n"
            + "        pass\n"
            + "\n"
            + "def tcp_port_scanner(host, start_port, end_port, max_threads=100):\n"
            + "    print(f\"Scanning {host} from port {start_port} to {end_port}\")\n"
            + "    \n"
            + "    with ThreadPoolExecutor(max_workers=max_threads) as executor:\n"
            + "        for port in range(start_port, end_port + 1):\n"
            + "            executor.submit(scan_port, host, port)\n"
            + "\n"
            + "# Sử dụng\n"
            + "tcp_port_scanner('localhost', 1, 1024)  # Quét các cổng phổ biến trên localhost",
            "import socket\n"
            + "import threading\n"
            + "\n"
            + "def handle_client(client_socket, target_host, target_port):\n"
            + "    target_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "    target_socket.connect((target_host, target_port))\n"
            + "    \n"
            + "    # Chuyển tiếp dữ liệu từ client đến target\n"
            + "    client_to_target = threading.Thread(\n"
            + "        target=forward_data,\n"
            + "        args=(client_socket, target_socket)\n"
            + "    )\n"
            + "    \n"
            + "    # Chuyển tiếp dữ liệu từ target đến client\n"
            + "    target_to_client = threading.Thread(\n"
            + "        target=forward_data,\n"
            + "        args=(target_socket, client_socket)\n"
            + "    )\n"
            + "    \n"
            + "    client_to_target.start()\n"
            + "    target_to_client.start()\n"
            + "\n"
            + "def forward_data(source, destination):\n"
            + "    while True:\n"
            + "        try:\n"
            + "            data = source.recv(4096)\n"
            + "            if not data:\n"
            + "                break\n"
            + "            destination.sendall(data)\n"
            + "        except:\n"
            + "            break\n"
            + "    source.close()\n"
            + "    destination.close()\n"
            + "\n"
            + "def start_proxy(proxy_host, proxy_port, target_host, target_port):\n"
            + "    proxy_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)\n"
            + "    proxy_socket.bind((proxy_host, proxy_port))\n"
            + "    proxy_socket.listen(5)\n"
            + "    \n"
            + "    print(f\"Proxy server running on {proxy_host}:{proxy_port}\")\n"
            + "    print(f\"Forwarding to {target_host}:{target_port}\")\n"
            + "    \n"
            + "    while True:\n"
            + "        client_socket, addr = proxy_socket.accept()\n"
            + "        print(f\"Accepted connection from {addr[0]}:{addr[1]}\")\n"
            + "        \n"
            + "        proxy_thread = threading.Thread(\n"
            + "            target=handle_client,\n"
            + "            args=(client_socket, target_host, target_port)\n"
            + "        )\n"
            + "        proxy_thread.start()\n"
            + "\n"
            + "# Sử dụng\n"
            + "start_proxy('localhost', 8888, 'example.com', 80)  # Proxy localhost:8888 -> example.com:80"
        });

        Code_MAP.put("UDP", new String[]{
            "import socket\n"
            + "\n"
            + "# Tạo socket UDP\n"
            + "udp_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "print(\"Socket UDP được tạo thành công\")",
            "import socket\n"
            + "\n"
            + "# Tạo socket UDP\n"
            + "sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "\n"
            + "# Địa chỉ và port của máy nhận\n"
            + "server_address = ('localhost', 12345)\n"
            + "\n"
            + "# Dữ liệu cần gửi\n"
            + "message = b'Hello UDP Server'\n"
            + "\n"
            + "try:\n"
            + "    # Gửi dữ liệu\n"
            + "    sent = sock.sendto(message, server_address)\n"
            + "    print(f\"Đã gửi {sent} bytes đến {server_address}\")\n"
            + "finally:\n"
            + "    # Đóng socket\n"
            + "    sock.close()",
            "import socket\n"
            + "\n"
            + "# Tạo socket UDP\n"
            + "sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "\n"
            + "# Bind socket đến một port\n"
            + "server_address = ('localhost', 12345)\n"
            + "sock.bind(server_address)\n"
            + "print(f\"Đang lắng nghe trên {server_address}\")\n"
            + "\n"
            + "while True:\n"
            + "    print(\"\\nĐang chờ nhận dữ liệu...\")\n"
            + "    data, address = sock.recvfrom(4096)\n"
            + "    \n"
            + "    print(f\"Nhận {len(data)} bytes từ {address}\")\n"
            + "    print(f\"Dữ liệu: {data.decode()}\")\n"
            + "    \n"
            + "    if data:\n"
            + "        # Gửi phản hồi\n"
            + "        sent = sock.sendto(data, address)\n"
            + "        print(f\"Đã gửi lại {sent} bytes đến {address}\")",
            "import socket\n"
            + "\n"
            + "def udp_server():\n"
            + "    # Tạo socket UDP\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "    \n"
            + "    # Bind socket đến địa chỉ và port\n"
            + "    server_address = ('localhost', 12345)\n"
            + "    sock.bind(server_address)\n"
            + "    print(f\"UDP Server đang lắng nghe trên {server_address}\")\n"
            + "    \n"
            + "    try:\n"
            + "        while True:\n"
            + "            # Nhận dữ liệu\n"
            + "            data, address = sock.recvfrom(4096)\n"
            + "            print(f\"Nhận từ {address}: {data.decode()}\")\n"
            + "            \n"
            + "            # Gửi phản hồi\n"
            + "            response = f\"Server nhận được: {data.decode()}\"\n"
            + "            sock.sendto(response.encode(), address)\n"
            + "    except KeyboardInterrupt:\n"
            + "        print(\"\\nServer đang dừng...\")\n"
            + "    finally:\n"
            + "        sock.close()\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    udp_server()",
            "import socket\n"
            + "\n"
            + "def udp_client():\n"
            + "    # Tạo socket UDP\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "    \n"
            + "    # Địa chỉ server\n"
            + "    server_address = ('localhost', 12345)\n"
            + "    \n"
            + "    try:\n"
            + "        while True:\n"
            + "            # Nhập dữ liệu từ người dùng\n"
            + "            message = input(\"Nhập tin nhắn (hoặc 'exit' để thoát): \")\n"
            + "            if message.lower() == 'exit':\n"
            + "                break\n"
            + "                \n"
            + "            # Gửi dữ liệu\n"
            + "            sock.sendto(message.encode(), server_address)\n"
            + "            \n"
            + "            # Nhận phản hồi\n"
            + "            data, _ = sock.recvfrom(4096)\n"
            + "            print(f\"Nhận từ server: {data.decode()}\")\n"
            + "    finally:\n"
            + "        sock.close()\n"
            + "        print(\"Đóng kết nối\")\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    udp_client()",
            "import socket\n"
            + "import time\n"
            + "\n"
            + "def reliable_udp_sender():\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "    server_address = ('localhost', 12345)\n"
            + "    message = b'Important data'\n"
            + "    timeout = 2  # 2 giây timeout\n"
            + "    max_retries = 3\n"
            + "    retries = 0\n"
            + "    \n"
            + "    sock.settimeout(timeout)\n"
            + "    \n"
            + "    while retries < max_retries:\n"
            + "        try:\n"
            + "            sock.sendto(message, server_address)\n"
            + "            print(\"Đã gửi dữ liệu, đang chờ xác nhận...\")\n"
            + "            \n"
            + "            # Chờ ACK\n"
            + "            data, _ = sock.recvfrom(1024)\n"
            + "            if data == b'ACK':\n"
            + "                print(\"Nhận được xác nhận, gửi thành công!\")\n"
            + "                break\n"
            + "                \n"
            + "        except socket.timeout:\n"
            + "            retries += 1\n"
            + "            print(f\"Timeout, thử lại lần {retries}/{max_retries}\")\n"
            + "        except Exception as e:\n"
            + "            print(f\"Lỗi: {e}\")\n"
            + "            break\n"
            + "    \n"
            + "    if retries == max_retries:\n"
            + "        print(\"Đã đạt số lần thử tối đa, gửi thất bại\")\n"
            + "    \n"
            + "    sock.close()\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    reliable_udp_sender()",
            "import socket\n"
            + "\n"
            + "def udp_broadcast():\n"
            + "    # Tạo socket UDP\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "    \n"
            + "    # Cho phép broadcast\n"
            + "    sock.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, 1)\n"
            + "    \n"
            + "    # Địa chỉ broadcast và port\n"
            + "    broadcast_address = ('255.255.255.255', 12345)\n"
            + "    message = b'Hello all devices in the network!'\n"
            + "    \n"
            + "    try:\n"
            + "        # Gửi broadcast\n"
            + "        sent = sock.sendto(message, broadcast_address)\n"
            + "        print(f\"Đã gửi broadcast {sent} bytes\")\n"
            + "    except Exception as e:\n"
            + "        print(f\"Lỗi khi gửi broadcast: {e}\")\n"
            + "    finally:\n"
            + "        sock.close()\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    udp_broadcast()",
            "import socket\n"
            + "import struct\n"
            + "\n"
            + "def udp_multicast_sender():\n"
            + "    # Địa chỉ multicast (trong dải 224.0.0.0 đến 239.255.255.255)\n"
            + "    multicast_group = ('224.3.29.71', 12345)\n"
            + "    \n"
            + "    # Tạo socket\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "    \n"
            + "    # Thiết lập TTL (Time To Live)\n"
            + "    ttl = struct.pack('b', 1)\n"
            + "    sock.setsockopt(socket.IPPROTO_IP, socket.IP_MULTICAST_TTL, ttl)\n"
            + "    \n"
            + "    try:\n"
            + "        message = b'Hello multicast group!'\n"
            + "        sent = sock.sendto(message, multicast_group)\n"
            + "        print(f\"Đã gửi {sent} bytes đến {multicast_group}\")\n"
            + "    finally:\n"
            + "        sock.close()\n"
            + "\n"
            + "def udp_multicast_receiver():\n"
            + "    # Địa chỉ multicast\n"
            + "    multicast_group = '224.3.29.71'\n"
            + "    server_address = ('', 12345)\n"
            + "    \n"
            + "    # Tạo socket\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "    \n"
            + "    # Bind đến port\n"
            + "    sock.bind(server_address)\n"
            + "    \n"
            + "    # Thêm socket vào nhóm multicast\n"
            + "    group = socket.inet_aton(multicast_group)\n"
            + "    mreq = struct.pack('4sL', group, socket.INADDR_ANY)\n"
            + "    sock.setsockopt(socket.IPPROTO_IP, socket.IP_ADD_MEMBERSHIP, mreq)\n"
            + "    \n"
            + "    try:\n"
            + "        while True:\n"
            + "            print(\"\\nĐang chờ nhận multicast message...\")\n"
            + "            data, address = sock.recvfrom(1024)\n"
            + "            print(f\"Nhận {len(data)} bytes từ {address}\")\n"
            + "            print(f\"Dữ liệu: {data.decode()}\")\n"
            + "    except KeyboardInterrupt:\n"
            + "        print(\"\\nDừng nhận multicast\")\n"
            + "    finally:\n"
            + "        sock.close()\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    # Chạy sender hoặc receiver tùy theo nhu cầu\n"
            + "    # udp_multicast_sender()\n"
            + "    udp_multicast_receiver()",
            "import socket\n"
            + "import time\n"
            + "\n"
            + "def reliable_udp_server():\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "    sock.bind(('localhost', 12345))\n"
            + "    \n"
            + "    expected_seq = 0\n"
            + "    \n"
            + "    try:\n"
            + "        while True:\n"
            + "            data, addr = sock.recvfrom(1024)\n"
            + "            seq, message = data.split(b'|', 1)\n"
            + "            seq = int(seq.decode())\n"
            + "            \n"
            + "            if seq == expected_seq:\n"
            + "                print(f\"Nhận đúng thứ tự: {message.decode()}\")\n"
            + "                sock.sendto(b'ACK', addr)\n"
            + "                expected_seq += 1\n"
            + "            else:\n"
            + "                print(f\"Nhận sai thứ tự, mong đợi {expected_seq} nhưng nhận {seq}\")\n"
            + "                sock.sendto(b'NACK', addr)\n"
            + "    except KeyboardInterrupt:\n"
            + "        print(\"\\nServer đang dừng...\")\n"
            + "    finally:\n"
            + "        sock.close()\n"
            + "\n"
            + "def reliable_udp_client():\n"
            + "    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)\n"
            + "    server_addr = ('localhost', 12345)\n"
            + "    seq = 0\n"
            + "    messages = [\"Hello\", \"World\", \"UDP\", \"Reliability\"]\n"
            + "    \n"
            + "    for msg in messages:\n"
            + "        while True:\n"
            + "            # Gửi message với số thứ tự\n"
            + "            packet = f\"{seq}|{msg}\".encode()\n"
            + "            sock.sendto(packet, server_addr)\n"
            + "            print(f\"Đã gửi: {msg} (seq={seq})\")\n"
            + "            \n"
            + "            # Chờ ACK với timeout\n"
            + "            sock.settimeout(2)\n"
            + "            try:\n"
            + "                ack, _ = sock.recvfrom(1024)\n"
            + "                if ack == b'ACK':\n"
            + "                    print(\"Nhận ACK, chuyển sang gói tiếp theo\")\n"
            + "                    seq += 1\n"
            + "                    break\n"
            + "                elif ack == b'NACK':\n"
            + "                    print(\"Nhận NACK, gửi lại gói tin\")\n"
            + "            except socket.timeout:\n"
            + "                print(\"Timeout, gửi lại gói tin\")\n"
            + "    \n"
            + "    sock.close()\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    # Chạy server hoặc client tùy theo nhu cầu\n"
            + "    # reliable_udp_server()\n"
            + "    reliable_udp_client()"
        });

        Code_MAP.put("Xây dựng ứng dụng Web với Flask/Django", new String[]{
            "pip install flask",
            "from flask import Flask\n"
            + "\n"
            + "app = Flask(__name__)\n"
            + "\n"
            + "@app.route('/')\n"
            + "def home():\n"
            + "    return 'Hello, Flask!'\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    app.run(debug=True)",
            "@app.route('/user/<username>')\n"
            + "def show_user_profile(username):\n"
            + "    return f'User {username}'\n"
            + "\n"
            + "@app.route('/post/<int:post_id>')\n"
            + "def show_post(post_id):\n"
            + "    return f'Post {post_id}'",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <title>Hello</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <h1>Hello, {{ name }}!</h1>\n"
            + "</body>\n"
            + "</html>",
            "from flask import render_template\n"
            + "\n"
            + "@app.route('/hello/<name>')\n"
            + "def hello(name):\n"
            + "    return render_template('hello.html', name=name)",
            "<form method=\"POST\">\n"
            + "    <input type=\"text\" name=\"username\">\n"
            + "    <input type=\"submit\" value=\"Submit\">\n"
            + "</form>",
            "from flask import request, redirect, url_for\n"
            + "\n"
            + "@app.route('/login', methods=['GET', 'POST'])\n"
            + "def login():\n"
            + "    if request.method == 'POST':\n"
            + "        username = request.form['username']\n"
            + "        return redirect(url_for('hello', name=username))\n"
            + "    return render_template('form.html')",
            "from flask_sqlalchemy import SQLAlchemy\n"
            + "\n"
            + "app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///site.db'\n"
            + "db = SQLAlchemy(app)\n"
            + "\n"
            + "class User(db.Model):\n"
            + "    id = db.Column(db.Integer, primary_key=True)\n"
            + "    username = db.Column(db.String(20), unique=True, nullable=False)\n"
            + "    email = db.Column(db.String(120), unique=True, nullable=False)\n"
            + "\n"
            + "    def __repr__(self):\n"
            + "        return f\"User('{self.username}', '{self.email}')\"\n"
            + "\n"
            + "# Trong view\n"
            + "@app.route('/users')\n"
            + "def users():\n"
            + "    users = User.query.all()\n"
            + "    return render_template('users.html', users=users)",
            "pip install django\n"
            + "django-admin startproject myproject\n"
            + "cd myproject\n"
            + "python manage.py startapp myapp",
            "myproject/\n"
            + "    manage.py\n"
            + "    myproject/\n"
            + "        __init__.py\n"
            + "        settings.py\n"
            + "        urls.py\n"
            + "        asgi.py\n"
            + "        wsgi.py\n"
            + "    myapp/\n"
            + "        migrations/\n"
            + "        __init__.py\n"
            + "        admin.py\n"
            + "        apps.py\n"
            + "        models.py\n"
            + "        tests.py\n"
            + "        views.py",
            "from django.http import HttpResponse\n"
            + "\n"
            + "def home(request):\n"
            + "    return HttpResponse(\"Hello, Django!\")",
            "from django.urls import path\n"
            + "from myapp import views\n"
            + "\n"
            + "urlpatterns = [\n"
            + "    path('', views.home, name='home'),\n"
            + "]",
            "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <title>Home</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <h1>Welcome, {{ name }}!</h1>\n"
            + "</body>\n"
            + "</html>",
            "from django.shortcuts import render\n"
            + "\n"
            + "def home(request):\n"
            + "    return render(request, 'myapp/home.html', {'name': 'Django User'})",
            "from django.db import models\n"
            + "\n"
            + "class Product(models.Model):\n"
            + "    name = models.CharField(max_length=100)\n"
            + "    price = models.DecimalField(max_digits=10, decimal_places=2)\n"
            + "    description = models.TextField()\n"
            + "\n"
            + "    def __str__(self):\n"
            + "        return self.name",
            "from django.contrib import admin\n"
            + "from .models import Product\n"
            + "\n"
            + "admin.site.register(Product)",
            "python manage.py makemigrations\n"
            + "python manage.py migrate\n"
            + "python manage.py createsuperuser",
            "from django import forms\n"
            + "\n"
            + "class ContactForm(forms.Form):\n"
            + "    name = forms.CharField(max_length=100)\n"
            + "    email = forms.EmailField()\n"
            + "    message = forms.CharField(widget=forms.Textarea)",
            "from .forms import ContactForm\n"
            + "\n"
            + "def contact(request):\n"
            + "    if request.method == 'POST':\n"
            + "        form = ContactForm(request.POST)\n"
            + "        if form.is_valid():\n"
            + "            # Xử lý dữ liệu\n"
            + "            return redirect('home')\n"
            + "    else:\n"
            + "        form = ContactForm()\n"
            + "    return render(request, 'myapp/contact.html', {'form': form})",
            "<form method=\"post\">\n"
            + "    {% csrf_token %}\n"
            + "    {{ form.as_p }}\n"
            + "    <button type=\"submit\">Submit</button>\n"
            + "</form>",
            "from django.views.generic import ListView, DetailView\n"
            + "from .models import Product\n"
            + "\n"
            + "class ProductListView(ListView):\n"
            + "    model = Product\n"
            + "    template_name = 'myapp/product_list.html'\n"
            + "    context_object_name = 'products'\n"
            + "\n"
            + "class ProductDetailView(DetailView):\n"
            + "    model = Product\n"
            + "    template_name = 'myapp/product_detail.html'",
            "from waitress import serve\n"
            + "from myapp import app\n"
            + "\n"
            + "serve(app, host='0.0.0.0', port=8080)",
            "pip install gunicorn\n"
            + "gunicorn myproject.wsgi:application --bind 0.0.0.0:8000",
            "server {\n"
            + "    listen 80;\n"
            + "    server_name example.com;\n"
            + "\n"
            + "    location / {\n"
            + "        proxy_pass http://127.0.0.1:8000;\n"
            + "        proxy_set_header Host $host;\n"
            + "        proxy_set_header X-Real-IP $remote_addr;\n"
            + "    }\n"
            + "}"
        });

        Code_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch", new String[]{
            "# Import thư viện\n"
            + "from sklearn.datasets import load_iris\n"
            + "from sklearn.model_selection import train_test_split\n"
            + "from sklearn.preprocessing import StandardScaler\n"
            + "from sklearn.neighbors import KNeighborsClassifier\n"
            + "from sklearn.metrics import accuracy_score\n"
            + "\n"
            + "# 1. Load dataset\n"
            + "iris = load_iris()\n"
            + "X, y = iris.data, iris.target\n"
            + "\n"
            + "# 2. Chia tập train/test\n"
            + "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)\n"
            + "\n"
            + "# 3. Chuẩn hóa dữ liệu\n"
            + "scaler = StandardScaler()\n"
            + "X_train = scaler.fit_transform(X_train)\n"
            + "X_test = scaler.transform(X_test)\n"
            + "\n"
            + "# 4. Huấn luyện mô hình\n"
            + "model = KNeighborsClassifier(n_neighbors=3)\n"
            + "model.fit(X_train, y_train)\n"
            + "\n"
            + "# 5. Dự đoán và đánh giá\n"
            + "y_pred = model.predict(X_test)\n"
            + "print(f\"Accuracy: {accuracy_score(y_test, y_pred):.2f}\")",
            "from sklearn.linear_model import LinearRegression\n"
            + "from sklearn.datasets import load_diabetes\n"
            + "\n"
            + "# Load data\n"
            + "data = load_diabetes()\n"
            + "X, y = data.data, data.target\n"
            + "\n"
            + "# Train model\n"
            + "model = LinearRegression()\n"
            + "model.fit(X, y)\n"
            + "\n"
            + "# Predict\n"
            + "print(f\"Coefficients: {model.coef_}\")\n"
            + "print(f\"Intercept: {model.intercept_}\")",
            "from sklearn.svm import SVC\n"
            + "from sklearn.datasets import load_breast_cancer\n"
            + "\n"
            + "# Load data\n"
            + "data = load_breast_cancer()\n"
            + "X, y = data.data, data.target\n"
            + "\n"
            + "# Train model\n"
            + "model = SVC(kernel='linear')\n"
            + "model.fit(X, y)\n"
            + "\n"
            + "# Evaluate\n"
            + "print(f\"Training accuracy: {model.score(X, y):.2f}\")",
            "from sklearn.cluster import KMeans\n"
            + "from sklearn.datasets import make_blobs\n"
            + "\n"
            + "# Generate data\n"
            + "X, _ = make_blobs(n_samples=300, centers=4, random_state=42)\n"
            + "\n"
            + "# Cluster\n"
            + "kmeans = KMeans(n_clusters=4)\n"
            + "kmeans.fit(X)\n"
            + "\n"
            + "# Visualize\n"
            + "import matplotlib.pyplot as plt\n"
            + "plt.scatter(X[:, 0], X[:, 1], c=kmeans.labels_)\n"
            + "plt.scatter(kmeans.cluster_centers_[:, 0], kmeans.cluster_centers_[:, 1], s=200, marker='X', c='red')\n"
            + "plt.show()",
            "import tensorflow as tf\n"
            + "from tensorflow.keras import layers, models\n"
            + "from tensorflow.keras.datasets import mnist\n"
            + "\n"
            + "# 1. Load và chuẩn bị dữ liệu\n"
            + "(X_train, y_train), (X_test, y_test) = mnist.load_data()\n"
            + "X_train, X_test = X_train / 255.0, X_test / 255.0  # Chuẩn hóa\n"
            + "\n"
            + "# 2. Xây dựng mô hình\n"
            + "model = models.Sequential([\n"
            + "    layers.Flatten(input_shape=(28, 28)),\n"
            + "    layers.Dense(128, activation='relu'),\n"
            + "    layers.Dropout(0.2),\n"
            + "    layers.Dense(10, activation='softmax')\n"
            + "])\n"
            + "\n"
            + "# 3. Biên dịch mô hình\n"
            + "model.compile(optimizer='adam',\n"
            + "              loss='sparse_categorical_crossentropy',\n"
            + "              metrics=['accuracy'])\n"
            + "\n"
            + "# 4. Huấn luyện\n"
            + "history = model.fit(X_train, y_train, epochs=5, validation_split=0.2)\n"
            + "\n"
            + "# 5. Đánh giá\n"
            + "test_loss, test_acc = model.evaluate(X_test, y_test)\n"
            + "print(f\"\\nTest accuracy: {test_acc:.4f}\")",
            "# Xây dựng mô hình CNN\n"
            + "model = models.Sequential([\n"
            + "    layers.Conv2D(32, (3, 3), activation='relu', input_shape=(28, 28, 1)),\n"
            + "    layers.MaxPooling2D((2, 2)),\n"
            + "    layers.Conv2D(64, (3, 3), activation='relu'),\n"
            + "    layers.MaxPooling2D((2, 2)),\n"
            + "    layers.Flatten(),\n"
            + "    layers.Dense(64, activation='relu'),\n"
            + "    layers.Dense(10, activation='softmax')\n"
            + "])\n"
            + "\n"
            + "# Reshape dữ liệu cho CNN\n"
            + "X_train = X_train.reshape(-1, 28, 28, 1)\n"
            + "X_test = X_test.reshape(-1, 28, 28, 1)\n"
            + "\n"
            + "model.compile(optimizer='adam',\n"
            + "              loss='sparse_categorical_crossentropy',\n"
            + "              metrics=['accuracy'])\n"
            + "\n"
            + "model.fit(X_train, y_train, epochs=5, validation_split=0.2)",
            "import torch\n"
            + "import torch.nn as nn\n"
            + "import torch.optim as optim\n"
            + "from torchvision import datasets, transforms\n"
            + "from torch.utils.data import DataLoader\n"
            + "\n"
            + "# 1. Chuẩn bị dữ liệu\n"
            + "transform = transforms.Compose([\n"
            + "    transforms.ToTensor(),\n"
            + "    transforms.Normalize((0.5,), (0.5,))\n"
            + "])\n"
            + "\n"
            + "train_set = datasets.MNIST('data', download=True, train=True, transform=transform)\n"
            + "train_loader = DataLoader(train_set, batch_size=64, shuffle=True)\n"
            + "\n"
            + "# 2. Định nghĩa mô hình\n"
            + "class Net(nn.Module):\n"
            + "    def __init__(self):\n"
            + "        super(Net, self).__init__()\n"
            + "        self.fc1 = nn.Linear(28*28, 128)\n"
            + "        self.fc2 = nn.Linear(128, 64)\n"
            + "        self.fc3 = nn.Linear(64, 10)\n"
            + "        \n"
            + "    def forward(self, x):\n"
            + "        x = x.view(-1, 28*28)  # Flatten\n"
            + "        x = torch.relu(self.fc1(x))\n"
            + "        x = torch.relu(self.fc2(x))\n"
            + "        x = self.fc3(x)\n"
            + "        return x\n"
            + "\n"
            + "model = Net()\n"
            + "\n"
            + "# 3. Định nghĩa loss và optimizer\n"
            + "criterion = nn.CrossEntropyLoss()\n"
            + "optimizer = optim.Adam(model.parameters(), lr=0.001)\n"
            + "\n"
            + "# 4. Huấn luyện\n"
            + "for epoch in range(5):\n"
            + "    running_loss = 0.0\n"
            + "    for images, labels in train_loader:\n"
            + "        optimizer.zero_grad()\n"
            + "        outputs = model(images)\n"
            + "        loss = criterion(outputs, labels)\n"
            + "        loss.backward()\n"
            + "        optimizer.step()\n"
            + "        running_loss += loss.item()\n"
            + "    print(f\"Epoch {epoch+1}, Loss: {running_loss/len(train_loader):.4f}\")",
            "class CNN(nn.Module):\n"
            + "    def __init__(self):\n"
            + "        super(CNN, self).__init__()\n"
            + "        self.conv1 = nn.Conv2d(1, 32, 3, 1)\n"
            + "        self.conv2 = nn.Conv2d(32, 64, 3, 1)\n"
            + "        self.dropout = nn.Dropout2d(0.25)\n"
            + "        self.fc1 = nn.Linear(9216, 128)\n"
            + "        self.fc2 = nn.Linear(128, 10)\n"
            + "\n"
            + "    def forward(self, x):\n"
            + "        x = torch.relu(self.conv1(x))\n"
            + "        x = torch.max_pool2d(x, 2)\n"
            + "        x = torch.relu(self.conv2(x))\n"
            + "        x = torch.max_pool2d(x, 2)\n"
            + "        x = self.dropout(x)\n"
            + "        x = torch.flatten(x, 1)\n"
            + "        x = torch.relu(self.fc1(x))\n"
            + "        x = self.fc2(x)\n"
            + "        return x\n"
            + "\n"
            + "model = CNN()\n"
            + "optimizer = optim.Adam(model.parameters())\n"
            + "\n"
            + "# Huấn luyện tương tự như trên"
        });

        Code_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            "pip install selenium",
            "from selenium import webdriver\n"
            + "from selenium.webdriver.chrome.service import Service\n"
            + "from webdriver_manager.chrome import ChromeDriverManager\n"
            + "\n"
            + "# Khởi tạo ChromeDriver tự động\n"
            + "driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))\n"
            + "\n"
            + "# Mở một trang web\n"
            + "driver.get(\"https://www.google.com\")\n"
            + "\n"
            + "# Đóng trình duyệt sau 5 giây\n"
            + "import time\n"
            + "time.sleep(5)\n"
            + "driver.quit()",
            "from selenium.webdriver.common.by import By\n"
            + "\n"
            + "# Tìm phần tử bằng ID\n"
            + "search_box = driver.find_element(By.ID, \"search\")\n"
            + "\n"
            + "# Tìm bằng tên\n"
            + "search_box = driver.find_element(By.NAME, \"q\")\n"
            + "\n"
            + "# Tìm bằng XPath\n"
            + "search_box = driver.find_element(By.XPATH, \"//input[@name='q']\")\n"
            + "\n"
            + "# Tìm bằng CSS selector\n"
            + "search_box = driver.find_element(By.CSS_SELECTOR, \"input.search-field\")",
            "# Nhập văn bản\n"
            + "search_box.send_keys(\"Selenium Python\")\n"
            + "\n"
            + "# Click vào phần tử\n"
            + "button = driver.find_element(By.NAME, \"btnK\")\n"
            + "button.click()\n"
            + "\n"
            + "# Lấy văn bản từ phần tử\n"
            + "text = driver.find_element(By.TAG_NAME, \"h1\").text\n"
            + "print(text)\n"
            + "\n"
            + "# Lấy thuộc tính\n"
            + "value = search_box.get_attribute(\"value\")",
            "# Điền form đăng nhập\n"
            + "username = driver.find_element(By.ID, \"username\")\n"
            + "password = driver.find_element(By.ID, \"password\")\n"
            + "\n"
            + "username.send_keys(\"my_username\")\n"
            + "password.send_keys(\"my_password\")\n"
            + "\n"
            + "# Gửi form\n"
            + "driver.find_element(By.ID, \"submit\").click()",
            "from selenium.webdriver.support.ui import WebDriverWait\n"
            + "from selenium.webdriver.support import expected_conditions as EC\n"
            + "\n"
            + "try:\n"
            + "    element = WebDriverWait(driver, 10).until(\n"
            + "        EC.presence_of_element_located((By.ID, \"dynamic-element\"))\n"
            + "    )\n"
            + "    print(\"Phần tử đã xuất hiện!\")\n"
            + "except:\n"
            + "    print(\"Không tìm thấy phần tử sau 10 giây\")",
            "# Mở tab mới\n"
            + "driver.execute_script(\"window.open('');\")\n"
            + "\n"
            + "# Chuyển giữa các tab\n"
            + "driver.switch_to.window(driver.window_handles[1])\n"
            + "driver.get(\"https://www.python.org\")\n"
            + "\n"
            + "# Quay lại tab gốc\n"
            + "driver.switch_to.window(driver.window_handles[0])",
            "pip install python-telegram-bot",
            "from telegram import Update\n"
            + "from telegram.ext import Updater, CommandHandler, MessageHandler, Filters, CallbackContext\n"
            + "\n"
            + "TOKEN = \"YOUR_TELEGRAM_BOT_TOKEN\"\n"
            + "\n"
            + "def start(update: Update, context: CallbackContext):\n"
            + "    update.message.reply_text('Xin chào! Tôi là bot Telegram.')\n"
            + "\n"
            + "def echo(update: Update, context: CallbackContext):\n"
            + "    update.message.reply_text(update.message.text)\n"
            + "\n"
            + "def main():\n"
            + "    updater = Updater(TOKEN)\n"
            + "    dp = updater.dispatcher\n"
            + "    \n"
            + "    dp.add_handler(CommandHandler(\"start\", start))\n"
            + "    dp.add_handler(MessageHandler(Filters.text & ~Filters.command, echo))\n"
            + "    \n"
            + "    updater.start_polling()\n"
            + "    updater.idle()\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    main()",
            "def help_command(update: Update, context: CallbackContext):\n"
            + "    update.message.reply_text('Danh sách lệnh:\\n/start - Bắt đầu\\n/help - Trợ giúp')\n"
            + "\n"
            + "def custom_command(update: Update, context: CallbackContext):\n"
            + "    # Xử lý tham số lệnh\n"
            + "    args = context.args\n"
            + "    if args:\n"
            + "        update.message.reply_text(f'Bạn đã nhập: {\" \".join(args)}')\n"
            + "    else:\n"
            + "        update.message.reply_text('Vui lòng nhập tham số sau lệnh')\n"
            + "\n"
            + "# Thêm vào hàm main()\n"
            + "dp.add_handler(CommandHandler(\"help\", help_command))\n"
            + "dp.add_handler(CommandHandler(\"custom\", custom_command))",
            "def send_photo(update: Update, context: CallbackContext):\n"
            + "    context.bot.send_photo(\n"
            + "        chat_id=update.effective_chat.id,\n"
            + "        photo=open('example.jpg', 'rb')\n"
            + "    )\n"
            + "\n"
            + "def send_document(update: Update, context: CallbackContext):\n"
            + "    context.bot.send_document(\n"
            + "        chat_id=update.effective_chat.id,\n"
            + "        document=open('example.pdf', 'rb'),\n"
            + "        caption='Đây là file PDF mẫu'\n"
            + "    )",
            "pip install discord.py",
            "import discord\n"
            + "from discord.ext import commands\n"
            + "\n"
            + "TOKEN = \"YOUR_DISCORD_BOT_TOKEN\"\n"
            + "\n"
            + "bot = commands.Bot(command_prefix='!')\n"
            + "\n"
            + "@bot.event\n"
            + "async def on_ready():\n"
            + "    print(f'Bot {bot.user.name} đã sẵn sàng!')\n"
            + "\n"
            + "@bot.command()\n"
            + "async def hello(ctx):\n"
            + "    await ctx.send(f'Xin chào {ctx.author.name}!')\n"
            + "\n"
            + "bot.run(TOKEN)",
            "@bot.event\n"
            + "async def on_member_join(member):\n"
            + "    channel = member.guild.system_channel\n"
            + "    if channel is not None:\n"
            + "        await channel.send(f'Chào mừng {member.mention} đã đến với server!')\n"
            + "\n"
            + "@bot.event\n"
            + "async def on_message(message):\n"
            + "    if message.author == bot.user:\n"
            + "        return\n"
            + "    \n"
            + "    if 'hello' in message.content.lower():\n"
            + "        await message.channel.send(f'Xin chào {message.author.mention}!')\n"
            + "    \n"
            + "    await bot.process_commands(message)",
            "@bot.command()\n"
            + "async def add(ctx, a: int, b: int):\n"
            + "    await ctx.send(f'Kết quả: {a + b}')\n"
            + "\n"
            + "@bot.command()\n"
            + "async def userinfo(ctx, member: discord.Member):\n"
            + "    await ctx.send(f'Tên: {member.name}\\nID: {member.id}\\nTham gia: {member.joined_at}')",
            "@bot.command()\n"
            + "async def info(ctx):\n"
            + "    embed = discord.Embed(\n"
            + "        title=\"Thông tin bot\",\n"
            + "        description=\"Bot được tạo bằng discord.py\",\n"
            + "        color=discord.Color.blue()\n"
            + "    )\n"
            + "    embed.add_field(name=\"Phiên bản\", value=\"1.0.0\", inline=False)\n"
            + "    embed.add_field(name=\"Tác giả\", value=\"Bạn\", inline=False)\n"
            + "    embed.set_footer(text=\"Liên hệ nếu cần hỗ trợ\")\n"
            + "    \n"
            + "    await ctx.send(embed=embed)",
            "from discord.ext import commands\n"
            + "\n"
            + "bot = commands.Bot(command_prefix='!')\n"
            + "\n"
            + "# Tải các module\n"
            + "initial_extensions = ['cogs.admin', 'cogs.fun']\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    for extension in initial_extensions:\n"
            + "        bot.load_extension(extension)\n"
            + "\n"
            + "bot.run(TOKEN)",
            "from discord.ext import commands\n"
            + "\n"
            + "class Fun(commands.Cog):\n"
            + "    def __init__(self, bot):\n"
            + "        self.bot = bot\n"
            + "\n"
            + "    @commands.command()\n"
            + "    async def joke(self, ctx):\n"
            + "        await ctx.send(\"Tại sao con gà băng qua đường? Để sang bên kia!\")\n"
            + "\n"
            + "def setup(bot):\n"
            + "    bot.add_cog(Fun(bot))"
        });

        Code_MAP.put("Bảo mật, tối ưu hiệu năng", new String[]{
            "import getpass\n"
            + "from hashlib import pbkdf2_hmac\n"
            + "import os\n"
            + "\n"
            + "# Cách an toàn để nhập mật khẩu\n"
            + "password = getpass.getpass(\"Nhập mật khẩu: \")\n"
            + "\n"
            + "# Hash mật khẩu với salt\n"
            + "salt = os.urandom(16)  # Tạo salt ngẫu nhiên\n"
            + "hashed = pbkdf2_hmac('sha256', password.encode(), salt, 100000)\n"
            + "\n"
            + "# Lưu salt và hash, không lưu mật khẩu gốc\n"
            + "print(f\"Salt: {salt.hex()}\")\n"
            + "print(f\"Hash: {hashed.hex()}\")",
            "import sqlite3\n"
            + "\n"
            + "# Cách không an toàn (dễ bị SQL injection)\n"
            + "def unsafe_query(user_input):\n"
            + "    conn = sqlite3.connect('example.db')\n"
            + "    cursor = conn.cursor()\n"
            + "    cursor.execute(f\"SELECT * FROM users WHERE username = '{user_input}'\")  # Nguy hiểm!\n"
            + "    return cursor.fetchall()\n"
            + "\n"
            + "# Cách an toàn\n"
            + "def safe_query(user_input):\n"
            + "    conn = sqlite3.connect('example.db')\n"
            + "    cursor = conn.cursor()\n"
            + "    cursor.execute(\"SELECT * FROM users WHERE username = ?\", (user_input,))  # Sử dụng parameter\n"
            + "    return cursor.fetchall()",
            "from werkzeug.security import generate_password_hash, check_password_hash\n"
            + "import secrets\n"
            + "\n"
            + "# Tạo và xác thực mật khẩu\n"
            + "password = \"my_secure_password\"\n"
            + "hashed_pw = generate_password_hash(password, method='pbkdf2:sha256', salt_length=16)\n"
            + "\n"
            + "# Xác thực\n"
            + "print(check_password_hash(hashed_pw, password))  # True\n"
            + "print(check_password_hash(hashed_pw, \"wrong_pw\"))  # False\n"
            + "\n"
            + "# Tạo token an toàn\n"
            + "secure_token = secrets.token_urlsafe(32)\n"
            + "print(f\"Secure token: {secure_token}\")",
            "from flask import Flask, request, jsonify\n"
            + "import hmac\n"
            + "import hashlib\n"
            + "\n"
            + "app = Flask(__name__)\n"
            + "API_SECRET = \"your_api_secret_here\"  # Nên lưu trong biến môi trường\n"
            + "\n"
            + "@app.route('/api/data', methods=['POST'])\n"
            + "def get_data():\n"
            + "    # Xác thực signature\n"
            + "    received_sign = request.headers.get('X-Signature')\n"
            + "    payload = request.get_data()\n"
            + "    \n"
            + "    # Tính toán signature\n"
            + "    expected_sign = hmac.new(\n"
            + "        API_SECRET.encode(),\n"
            + "        payload,\n"
            + "        hashlib.sha256\n"
            + "    ).hexdigest()\n"
            + "    \n"
            + "    if not hmac.compare_digest(received_sign, expected_sign):\n"
            + "        return jsonify({\"error\": \"Invalid signature\"}), 401\n"
            + "    \n"
            + "    # Xử lý logic an toàn\n"
            + "    return jsonify({\"data\": \"secure_data\"})\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    app.run(ssl_context='adhoc')  # Bật HTTPS",
            "import os\n"
            + "import stat\n"
            + "\n"
            + "# Tạo file với quyền hạn an toàn\n"
            + "def create_secure_file(filename, content):\n"
            + "    with open(filename, 'w') as f:\n"
            + "        f.write(content)\n"
            + "    # Thiết lập quyền: chủ sở hữu đọc/ghi, nhóm và khác chỉ đọc\n"
            + "    os.chmod(filename, stat.S_IRUSR | stat.S_IWUSR | stat.S_IRGRP | stat.S_IROTH)\n"
            + "    \n"
            + "create_secure_file('secure_data.txt', 'Nội dung bí mật')\n"
            + "\n"
            + "# Kiểm tra quyền file\n"
            + "file_stat = os.stat('secure_data.txt')\n"
            + "print(oct(file_stat.st_mode)[-3:])  # Hiển thị quyền dạng octal",
            "# Cách không tối ưu: tạo list lớn\n"
            + "def get_squares_list(n):\n"
            + "    return [x**2 for x in range(n)]  # Tạo toàn bộ list trong bộ nhớ\n"
            + "\n"
            + "# Cách tối ưu: sử dụng generator\n"
            + "def get_squares_gen(n):\n"
            + "    for x in range(n):\n"
            + "        yield x**2  # Tạo từng giá trị khi cần\n"
            + "\n"
            + "# Sử dụng\n"
            + "for square in get_squares_gen(1000000):  # Tiết kiệm bộ nhớ\n"
            + "    # Xử lý từng giá trị\n"
            + "    pass",
            "from functools import lru_cache\n"
            + "import time\n"
            + "\n"
            + "# Hàm tính Fibonacci không cache\n"
            + "def fib(n):\n"
            + "    if n < 2:\n"
            + "        return n\n"
            + "    return fib(n-1) + fib(n-2)\n"
            + "\n"
            + "# Hàm có cache\n"
            + "@lru_cache(maxsize=128)\n"
            + "def fib_cached(n):\n"
            + "    if n < 2:\n"
            + "        return n\n"
            + "    return fib_cached(n-1) + fib_cached(n-2)\n"
            + "\n"
            + "# So sánh hiệu năng\n"
            + "start = time.time()\n"
            + "fib(35)\n"
            + "print(f\"Không cache: {time.time() - start:.2f}s\")\n"
            + "\n"
            + "start = time.time()\n"
            + "fib_cached(35)\n"
            + "print(f\"Có cache: {time.time() - start:.2f}s\")",
            "import numpy as np\n"
            + "import time\n"
            + "\n"
            + "# Cách chậm: sử dụng list Python\n"
            + "def sum_python(n):\n"
            + "    numbers = [i for i in range(n)]\n"
            + "    return sum(numbers)\n"
            + "\n"
            + "# Cách nhanh: sử dụng NumPy\n"
            + "def sum_numpy(n):\n"
            + "    numbers = np.arange(n)\n"
            + "    return np.sum(numbers)\n"
            + "\n"
            + "# So sánh\n"
            + "n = 10_000_000\n"
            + "\n"
            + "start = time.time()\n"
            + "sum_python(n)\n"
            + "print(f\"Python list: {time.time() - start:.4f}s\")\n"
            + "\n"
            + "start = time.time()\n"
            + "sum_numpy(n)\n"
            + "print(f\"NumPy: {time.time() - start:.4f}s\")",
            "import concurrent.futures\n"
            + "import time\n"
            + "\n"
            + "# Hàm mô phỏng task tốn CPU\n"
            + "def cpu_bound_task(n):\n"
            + "    return sum(i * i for i in range(n))\n"
            + "\n"
            + "# Hàm mô phỏng task I/O\n"
            + "def io_bound_task(url):\n"
            + "    time.sleep(2)  # Giả lập thời gian chờ I/O\n"
            + "    return f\"Data from {url}\"\n"
            + "\n"
            + "# Đa tiến trình cho CPU-bound tasks\n"
            + "def run_cpu_bound():\n"
            + "    with concurrent.futures.ProcessPoolExecutor() as executor:\n"
            + "        results = list(executor.map(cpu_bound_task, [10_000_000, 20_000_000]))\n"
            + "    print(results)\n"
            + "\n"
            + "# Đa luồng cho I/O-bound tasks\n"
            + "def run_io_bound():\n"
            + "    urls = ['url1', 'url2', 'url3', 'url4']\n"
            + "    with concurrent.futures.ThreadPoolExecutor() as executor:\n"
            + "        results = list(executor.map(io_bound_task, urls))\n"
            + "    print(results)\n"
            + "\n"
            + "run_io_bound()\n"
            + "run_cpu_bound()",
            "# Cách không tối ưu\n"
            + "def process_data_slow(data):\n"
            + "    result = []\n"
            + "    for item in data:\n"
            + "        # Gọi len(data) trong mỗi vòng lặp\n"
            + "        if item % 2 == 0 and len(data) > 10:\n"
            + "            result.append(item ** 2)\n"
            + "    return result\n"
            + "\n"
            + "# Cách tối ưu\n"
            + "def process_data_fast(data):\n"
            + "    result = []\n"
            + "    data_len = len(data)  # Tính 1 lần\n"
            + "    for item in data:\n"
            + "        if item % 2 == 0 and data_len > 10:\n"
            + "            result.append(item ** 2)\n"
            + "    return result\n"
            + "\n"
            + "# Sử dụng list comprehension còn tốt hơn\n"
            + "def process_data_best(data):\n"
            + "    data_len = len(data)\n"
            + "    return [item ** 2 for item in data if item % 2 == 0 and data_len > 10]",
            "import sys\n"
            + "\n"
            + "# Class thông thường\n"
            + "class RegularUser:\n"
            + "    def __init__(self, name, age):\n"
            + "        self.name = name\n"
            + "        self.age = age\n"
            + "\n"
            + "# Class sử dụng __slots__\n"
            + "class SlotsUser:\n"
            + "    __slots__ = ['name', 'age']\n"
            + "    def __init__(self, name, age):\n"
            + "        self.name = name\n"
            + "        self.age = age\n"
            + "\n"
            + "# Tạo nhiều instance\n"
            + "regular_users = [RegularUser(\"User\", i) for i in range(1000)]\n"
            + "slots_users = [SlotsUser(\"User\", i) for i in range(1000)]\n"
            + "\n"
            + "# So sánh bộ nhớ\n"
            + "print(f\"Regular users: {sys.getsizeof(regular_users)} bytes\")\n"
            + "print(f\"Slots users: {sys.getsizeof(slots_users)} bytes\")",
            "# Cách chậm: nối string trong vòng lặp\n"
            + "def build_string_slow(n):\n"
            + "    s = \"\"\n"
            + "    for i in range(n):\n"
            + "        s += str(i)\n"
            + "    return s\n"
            + "\n"
            + "# Cách nhanh: sử dụng join\n"
            + "def build_string_fast(n):\n"
            + "    return \"\".join(str(i) for i in range(n))\n"
            + "\n"
            + "# So sánh\n"
            + "start = time.time()\n"
            + "build_string_slow(100_000)\n"
            + "print(f\"Nối string: {time.time() - start:.4f}s\")\n"
            + "\n"
            + "start = time.time()\n"
            + "build_string_fast(100_000)\n"
            + "print(f\"Join string: {time.time() - start:.4f}s\")",
            "import cProfile\n"
            + "import math\n"
            + "\n"
            + "def slow_function():\n"
            + "    total = 0\n"
            + "    for i in range(10_000):\n"
            + "        total += math.sqrt(i) * math.sin(i)\n"
            + "    return total\n"
            + "\n"
            + "def fast_function():\n"
            + "    return sum(math.sqrt(i) * math.sin(i) for i in range(10_000))\n"
            + "\n"
            + "# Phân tích hiệu năng\n"
            + "print(\"Phân tích slow_function:\")\n"
            + "cProfile.run('slow_function()')\n"
            + "\n"
            + "print(\"\\nPhân tích fast_function:\")\n"
            + "cProfile.run('fast_function()')",
            "import sqlite3\n"
            + "import time\n"
            + "\n"
            + "# Kết nối database\n"
            + "conn = sqlite3.connect(':memory:')\n"
            + "cursor = conn.cursor()\n"
            + "\n"
            + "# Tạo bảng\n"
            + "cursor.execute(\"CREATE TABLE users (id INTEGER PRIMARY KEY, name TEXT, age INTEGER)\")\n"
            + "cursor.executemany(\"INSERT INTO users (name, age) VALUES (?, ?)\", \n"
            + "                 [('User'+str(i), i%100) for i in range(100_000)])\n"
            + "conn.commit()\n"
            + "\n"
            + "# Cách chậm: lấy tất cả dữ liệu\n"
            + "def get_users_slow():\n"
            + "    cursor.execute(\"SELECT * FROM users\")\n"
            + "    return cursor.fetchall()\n"
            + "\n"
            + "# Cách nhanh: chỉ lấy cột cần thiết + batch\n"
            + "def get_users_fast():\n"
            + "    cursor.execute(\"SELECT name, age FROM users WHERE age > 50\")\n"
            + "    users = []\n"
            + "    while True:\n"
            + "        batch = cursor.fetchmany(1000)  # Lấy theo batch\n"
            + "        if not batch:\n"
            + "            break\n"
            + "        users.extend(batch)\n"
            + "    return users\n"
            + "\n"
            + "# So sánh\n"
            + "start = time.time()\n"
            + "get_users_slow()\n"
            + "print(f\"Truy vấn chậm: {time.time() - start:.4f}s\")\n"
            + "\n"
            + "start = time.time()\n"
            + "get_users_fast()\n"
            + "print(f\"Truy vấn tối ưu: {time.time() - start:.4f}s\")\n"
            + "\n"
            + "conn.close()",
            "from collections import defaultdict, deque\n"
            + "import time\n"
            + "\n"
            + "# So sánh list và deque cho thao tác queue\n"
            + "def test_queue(n):\n"
            + "    # Sử dụng list\n"
            + "    start = time.time()\n"
            + "    q = []\n"
            + "    for i in range(n):\n"
            + "        q.append(i)\n"
            + "    for _ in range(n):\n"
            + "        q.pop(0)\n"
            + "    list_time = time.time() - start\n"
            + "    \n"
            + "    # Sử dụng deque\n"
            + "    start = time.time()\n"
            + "    q = deque()\n"
            + "    for i in range(n):\n"
            + "        q.append(i)\n"
            + "    for _ in range(n):\n"
            + "        q.popleft()\n"
            + "    deque_time = time.time() - start\n"
            + "    \n"
            + "    return list_time, deque_time\n"
            + "\n"
            + "list_t, deque_t = test_queue(100_000)\n"
            + "print(f\"List time: {list_t:.4f}s, Deque time: {deque_t:.4f}s\")"
        });

        Code_MAP.put("kiểm thử với pytest, unittest", new String[]{
            "import unittest\n"
            + "\n"
            + "def add(a, b):\n"
            + "    return a + b\n"
            + "\n"
            + "class TestMathOperations(unittest.TestCase):\n"
            + "    def test_add(self):\n"
            + "        self.assertEqual(add(2, 3), 5)\n"
            + "        self.assertEqual(add(-1, 1), 0)\n"
            + "        self.assertEqual(add(0, 0), 0)\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    unittest.main()",
            "import unittest\n"
            + "\n"
            + "class TestAssertMethods(unittest.TestCase):\n"
            + "    def test_assert_methods(self):\n"
            + "        self.assertEqual(3 + 2, 5)\n"
            + "        self.assertNotEqual(3 + 2, 6)\n"
            + "        self.assertTrue(3 > 2)\n"
            + "        self.assertFalse(3 < 2)\n"
            + "        self.assertIsNone(None)\n"
            + "        self.assertIn(2, [1, 2, 3])\n"
            + "        self.assertNotIn(4, [1, 2, 3])\n"
            + "        \n"
            + "        with self.assertRaises(ZeroDivisionError):\n"
            + "            1 / 0",
            "import unittest\n"
            + "\n"
            + "class TestDatabase(unittest.TestCase):\n"
            + "    def setUp(self):\n"
            + "        # Khởi tạo kết nối database trước mỗi test\n"
            + "        self.db = DatabaseConnection()\n"
            + "        self.db.connect()\n"
            + "    \n"
            + "    def tearDown(self):\n"
            + "        # Đóng kết nối sau mỗi test\n"
            + "        self.db.disconnect()\n"
            + "    \n"
            + "    def test_query(self):\n"
            + "        result = self.db.query(\"SELECT * FROM users\")\n"
            + "        self.assertEqual(len(result), 10)\n"
            + "    \n"
            + "    def test_insert(self):\n"
            + "        self.db.insert(\"users\", {\"name\": \"John\"})\n"
            + "        result = self.db.query(\"SELECT * FROM users WHERE name='John'\")\n"
            + "        self.assertEqual(len(result), 1)",
            "import unittest\n"
            + "\n"
            + "class TestStringMethods(unittest.TestCase):\n"
            + "    def test_upper(self):\n"
            + "        self.assertEqual('foo'.upper(), 'FOO')\n"
            + "\n"
            + "class TestMath(unittest.TestCase):\n"
            + "    def test_add(self):\n"
            + "        self.assertEqual(1 + 1, 2)\n"
            + "\n"
            + "def suite():\n"
            + "    suite = unittest.TestSuite()\n"
            + "    suite.addTest(TestStringMethods('test_upper'))\n"
            + "    suite.addTest(TestMath('test_add'))\n"
            + "    return suite\n"
            + "\n"
            + "if __name__ == '__main__':\n"
            + "    runner = unittest.TextTestRunner()\n"
            + "    test_suite = suite()\n"
            + "    runner.run(test_suite)",
            "# test_sample.py\n"
            + "def add(a, b):\n"
            + "    return a + b\n"
            + "\n"
            + "def test_add():\n"
            + "    assert add(2, 3) == 5\n"
            + "    assert add(-1, 1) == 0\n"
            + "    assert add(0, 0) == 0",
            "def test_assertions():\n"
            + "    # So sánh bằng\n"
            + "    assert 1 + 1 == 2\n"
            + "    \n"
            + "    # Kiểm tra điều kiện\n"
            + "    assert 2 > 1\n"
            + "    \n"
            + "    # Kiểm tra phần tử có trong collection\n"
            + "    assert 'a' in ['a', 'b', 'c']\n"
            + "    \n"
            + "    # Kiểm tra ngoại lệ\n"
            + "    with pytest.raises(ZeroDivisionError):\n"
            + "        1 / 0",
            "import pytest\n"
            + "\n"
            + "@pytest.fixture\n"
            + "def database():\n"
            + "    db = DatabaseConnection()\n"
            + "    db.connect()\n"
            + "    yield db  # Trả về db cho test sử dụng\n"
            + "    db.disconnect()  # Dọn dẹp sau khi test hoàn thành\n"
            + "\n"
            + "def test_query(database):  # Sử dụng fixture như tham số\n"
            + "    result = database.query(\"SELECT * FROM users\")\n"
            + "    assert len(result) == 10",
            "import pytest\n"
            + "\n"
            + "@pytest.mark.parametrize(\"a,b,expected\", [\n"
            + "    (1, 2, 3),\n"
            + "    (0, 0, 0),\n"
            + "    (-1, 1, 0),\n"
            + "    (10, -5, 5),\n"
            + "])\n"
            + "def test_add(a, b, expected):\n"
            + "    assert add(a, b) == expected",
            "from unittest.mock import Mock\n"
            + "\n"
            + "def test_mocking():\n"
            + "    # Tạo mock object\n"
            + "    mock = Mock()\n"
            + "    mock.method.return_value = 42\n"
            + "    \n"
            + "    # Gọi method và kiểm tra\n"
            + "    assert mock.method() == 42\n"
            + "    mock.method.assert_called_once()",
            "def test_mocking_with_pytest_mock(mocker):\n"
            + "    mock = mocker.patch('module.function')\n"
            + "    mock.return_value = 42\n"
            + "    \n"
            + "    assert module.function() == 42\n"
            + "    mock.assert_called_once()",
            "my_project/\n"
            + "├── src/\n"
            + "│   ├── __init__.py\n"
            + "│   ├── calculator.py\n"
            + "│   └── database.py\n"
            + "└── tests/\n"
            + "    ├── __init__.py\n"
            + "    ├── test_calculator.py\n"
            + "    └── test_database.py",
            "def add(a, b):\n"
            + "    return a + b\n"
            + "\n"
            + "def subtract(a, b):\n"
            + "    return a - b\n"
            + "\n"
            + "def multiply(a, b):\n"
            + "    return a * b\n"
            + "\n"
            + "def divide(a, b):\n"
            + "    if b == 0:\n"
            + "        raise ValueError(\"Cannot divide by zero\")\n"
            + "    return a / b",
            "import unittest\n"
            + "from src.calculator import add, subtract, multiply, divide\n"
            + "\n"
            + "class TestCalculator(unittest.TestCase):\n"
            + "    def test_add(self):\n"
            + "        self.assertEqual(add(2, 3), 5)\n"
            + "        self.assertEqual(add(-1, 1), 0)\n"
            + "    \n"
            + "    def test_subtract(self):\n"
            + "        self.assertEqual(subtract(5, 3), 2)\n"
            + "        self.assertEqual(subtract(1, -1), 2)\n"
            + "    \n"
            + "    def test_multiply(self):\n"
            + "        self.assertEqual(multiply(2, 3), 6)\n"
            + "        self.assertEqual(multiply(-1, 1), -1)\n"
            + "    \n"
            + "    def test_divide(self):\n"
            + "        self.assertEqual(divide(6, 3), 2)\n"
            + "        self.assertEqual(divide(1, 2), 0.5)\n"
            + "        \n"
            + "        with self.assertRaises(ValueError):\n"
            + "            divide(1, 0)",
            "import pytest\n"
            + "from src.calculator import add, subtract, multiply, divide\n"
            + "\n"
            + "@pytest.mark.parametrize(\"a,b,expected\", [\n"
            + "    (2, 3, 5),\n"
            + "    (-1, 1, 0),\n"
            + "])\n"
            + "def test_add(a, b, expected):\n"
            + "    assert add(a, b) == expected\n"
            + "\n"
            + "def test_divide_by_zero():\n"
            + "    with pytest.raises(ValueError, match=\"Cannot divide by zero\"):\n"
            + "        divide(1, 0)",
            "python -m unittest discover -s tests",
            "pytest tests/",
            "pytest --cov=src tests/"
        });

    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getCode(String language, int index) {
        if (Code_MAP.containsKey(language)) {
            String[] descriptions = Code_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getCode(String language) {
        return Code_MAP.getOrDefault(language, new String[]{});
    }
}
