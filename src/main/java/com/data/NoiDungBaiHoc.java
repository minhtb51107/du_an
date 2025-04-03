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

        //C
        Index_MAP.put("C là gì?", new int[]{
            0, 1, 1, 0, 1, 2, 0, 1, 1, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 1, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });

        Index_MAP.put("Tại sao nên học C?", new int[]{
            0, 1, 1, 1, 2, 2, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 0, 1, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1
        });

        Index_MAP.put("Các đặc điểm nổi bật của C", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Nguồn gốc của C", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Các phiên bản của C", new int[]{
            0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2
        });

        Index_MAP.put("C và các ngôn ngữ lập trình khác", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 1, 1, 0, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Ứng dụng của C trong lập trình hệ thống", new int[]{
            0, 1, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1
        });

        Index_MAP.put("C trong phát triển phần mềm nhúng", new int[]{
            0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Cấu trúc tổng quát", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Khai báo biến", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 2, 0, 2, 0, 2, 0, 2, 0, 1, 2, 1, 2, 0, 2, 0, 1, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Hàm main", new int[]{
            0, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 0, 1
        });

        Index_MAP.put("Các bước biên dịch", new int[]{
            0, 1, 1, 1, 2, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Trình biên dịch và trình liên kết", new int[]{
            0, 1, 1, 1, 2, 1, 2, 0, 1, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2
        });

        Index_MAP.put("Quá trình thực thi", new int[]{
            0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 0, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Câu lệnh if", new int[]{
            0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1
        });

        Index_MAP.put("Câu lệnh if-else", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 0, 2
        });

        Index_MAP.put("Câu lệnh switch-case", new int[]{
            0, 1, 0, 2, 0, 1, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Vòng lặp for", new int[]{
            0, 1, 2, 1, 1, 1, 0, 1, 2, 1, 1, 21, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Vòng lặp while", new int[]{
            0, 1, 2, 0, 1, 1, 1, 0, 1, 2, 1, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Vòng lặp do-while", new int[]{
            0, 1, 2, 1, 1, 1, 0, 1, 2, 1, 1, 2, 1, 1, 2, 0, 1
        });

        Index_MAP.put("Khai báo mảng một chiều", new int[]{
            0, 1, 1, 2, 1, 0, 1, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1
        });

        Index_MAP.put("Truy cập và thao tác với phần tử trong mảng", new int[]{
            0, 1, 0, 2, 0, 1, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 1
        });

        Index_MAP.put("Khai báo mảng hai chiều", new int[]{
            0, 1, 2, 1, 0, 1, 1, 2, 1, 2, 1, 2, 0, 2, 0, 1, 1, 1, 1, 1, 1, 0, 1
        });

        Index_MAP.put("Truy cập và thao tác với phần tử", new int[]{
            0, 1, 1, 0, 1, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Khai báo chuỗi", new int[]{
            0, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Các hàm xử lý chuỗi", new int[]{
            0, 1, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("So sánh và nối chuỗi", new int[]{
            0, 1, 1, 2, 1, 1, 2, 0, 1, 2, 1, 1, 2, 0, 1, 1, 2, 1
        });

        Index_MAP.put("Khái niệm về con trỏ", new int[]{
            0, 1, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1
        });

        Index_MAP.put("Khai báo con trỏ", new int[]{
            0, 1, 1, 1, 1, 1, 0, 2, 0, 1
        });

        Index_MAP.put("Toán tử con trỏ", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Cú pháp định nghĩa hàm", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 2, 1
        });

        Index_MAP.put("Gọi hàm", new int[]{
            0, 1, 1, 1, 0, 2, 0, 1
        });

        Index_MAP.put("Hàm trả về giá trị", new int[]{
            0, 1, 1, 1, 1, 1, 0, 2, 0, 1
        });

        Index_MAP.put("Truyền tham số theo giá trị", new int[]{
            0, 1, 0, 1, 0, 2, 0, 2, 0, 1, 0, 1, 1
        });

        Index_MAP.put("Truyền tham số theo tham chiếu", new int[]{
            0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Sử dụng con trỏ để truyền tham số", new int[]{
            0, 1, 1, 0, 1, 0, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 2, 1
        });

        Index_MAP.put("Khái niệm hàm đệ quy", new int[]{
            0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Cách hoạt động của hàm đệ quy", new int[]{
            0, 1, 0, 1, 0, 1, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });

        Index_MAP.put("Ví dụ về hàm đệ quy", new int[]{
            0, 1, 2, 0, 1, 1, 1, 0, 1, 1
        });

        Index_MAP.put("Cấu trúc dữ liệu cơ bản", new int[]{
            0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2, 0, 1, 1, 1, 2
        });

        Index_MAP.put("File I/O trong C", new int[]{
            0, 1, 0, 1, 2, 1, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 1, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 2
        });

        Index_MAP.put("Các hàm file I/O", new int[]{
            0, 1, 2, 1, 2, 1, 1, 2, 0, 1, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 1, 2, 0, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 0, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2, 0, 1, 2, 2, 2, 2
        });

        Index_MAP.put("", new int[]{});
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

        //C
        TITLE_MAP.put("C là gì?", new String[]{
            "1. Giới thiệu về C",
            "2. Cấu trúc cơ bản của chương trình C",
            "3. Kiểu dữ liệu trong C",
            "4. Biến và hằng số",
            "5. Toán tử trong C",
            "6. Cấu trúc điều khiển",
            "7. Hàm trong C",
            "8. Mảng và chuỗi",
            "9. Con trỏ",
            "10. Cấu trúc (struct)",
            "11. File I/O",
            "12. Ví dụ hoàn chỉnh",
            "Kết luận"
        });

        TITLE_MAP.put("Tại sao nên học C?", new String[]{
            "1. C là nền tảng của nhiều ngôn ngữ lập trình hiện đại",
            "2. Hiệu suất cao và gần với phần cứng",
            "3. Được sử dụng rộng rãi trong hệ thống nhúng và hệ điều hành",
            "4. Giúp hiểu sâu về cấu trúc dữ liệu và thuật toán",
            "5. Cộng đồng hỗ trợ lớn và tài nguyên phong phú",
            "6. Cơ hội nghề nghiệp rộng mở",
            "7. Rèn luyện tư duy lập trình chặt chẽ",
            "8. Tiền đề cho lập trình hệ thống và bảo mật",
            "Kết luận"
        });

        TITLE_MAP.put("Các đặc điểm nổi bật của C", new String[]{
            "1. Ngôn ngữ lập trình cấp trung (Middle-level language)",
            "2. Ngôn ngữ có cấu trúc (Structured programming language)",
            "3. Ngôn ngữ đa nền tảng (Portable)",
            "4. Hỗ trợ con trỏ (Pointers)",
            "5. Quản lý bộ nhớ thủ công (Manual memory management)",
            "6. Tốc độ thực thi nhanh",
            "7. Thư viện phong phú",
            "8. Ngôn ngữ đơn giản và nhỏ gọn",
            "9. Hỗ trợ lập trình hệ thống",
            "10. Khả năng mở rộng"
        });

        TITLE_MAP.put("Nguồn gốc của C", new String[]{
            "1. Bối cảnh ra đời",
            "2. Các mốc phát triển chính",
            "3. Đặc điểm nổi bật",
            "4. Ảnh hưởng và ứng dụng",
            "5. Code mẫu minh họa",
            "6. Kết luận"
        });

        TITLE_MAP.put("Các phiên bản của C", new String[]{
            "1. K&R C (1978)",
            "2. ANSI C (C89/C90)",
            "3. C99",
            "4. C11",
            "5. C17 (C18)",
            "6. C23 (Dự thảo)"
        });

        TITLE_MAP.put("C và các ngôn ngữ lập trình khác", new String[]{
            "1. Giới thiệu tổng quan",
            "2. So sánh cú pháp cơ bản",
            "3. Quản lý bộ nhớ",
            "4. Hướng đối tượng",
            "5. Hiệu suất",
            "6. Ứng dụng thực tế",
            "7. Ví dụ thuật toán (Tính giai thừa)",
            "8. Kết luận"
        });

        TITLE_MAP.put("Ứng dụng của C trong lập trình hệ thống", new String[]{
            "1. Hệ điều hành (Operating Systems)",
            "2. Trình điều khiển thiết bị (Device Drivers)",
            "3. Hệ thống nhúng (Embedded Systems)",
            "4. Mạng máy tính (Networking)",
            "5. Công cụ hệ thống (System Utilities)",
            "6. Bảo mật hệ thống (System Security)",
            "7. Hệ thống file (File Systems)",
            "8. Ảo hóa (Virtualization)",
            "Kết luận"
        });

        TITLE_MAP.put("C trong phát triển phần mềm nhúng", new String[]{
            "1. Giới thiệu về C trong lập trình nhúng",
            "2. Các khái niệm cơ bản trong C cho hệ thống nhúng",
            "3. Lập trình phần cứng với C",
            "4. Quản lý bộ nhớ trong hệ thống nhúng",
            "5. Giao tiếp phần cứng",
            "6. Real-Time Operating Systems (RTOS) với C",
            "7. Tối ưu hóa code nhúng",
            "8. Debug và kiểm tra phần mềm nhúng",
            "9. Best practices trong lập trình nhúng bằng C",
            "Kết luận"
        });

        TITLE_MAP.put("Cấu trúc tổng quát", new String[]{
            "1. Phần khai báo thư viện (Includes)",
            "2. Phần định nghĩa hằng số (Macros/Constants)",
            "3. Phần khai báo nguyên mẫu hàm (Function Prototypes)",
            "4. Phần khai báo biến toàn cục (Global Variables)",
            "5. Hàm main (Main Function)",
            "6. Phần định nghĩa hàm (Function Definitions)",
            "Chương trình mẫu hoàn chỉnh",
            "Giải thích các phần:"
        });

        TITLE_MAP.put("Khai báo biến", new String[]{
            "1. Giới thiệu về biến trong C",
            "2. Cú pháp khai báo biến",
            "3. Các kiểu dữ liệu cơ bản",
            "4. Khai báo nhiều biến cùng kiểu",
            "5. Biến static",
            "6. Biến register (gợi ý lưu trong thanh ghi)",
            "7. Biến volatile (ngăn trình biên dịch tối ưu)",
            "8. Biến const (hằng số)",
            "9. Biến extern (khai báo biến toàn cục)",
            "10. Ví dụ hoàn chỉnh",
            "11. Quy tắc đặt tên biến",
            "12. Phạm vi biến"
        });

        TITLE_MAP.put("Hàm main", new String[]{
            "Các thành phần chính của hàm main",
            "Các dạng hàm main phổ biến",
            "Ví dụ đầy đủ với chức năng cụ thể",
            "Giải thích ví dụ trên",
            "Lưu ý quan trọng"
        });

        TITLE_MAP.put("Các bước biên dịch", new String[]{
            "1. Tiền xử lý (Preprocessing)",
            "2. Biên dịch (Compilation)",
            "3. Dịch sang ngôn ngữ máy (Assembly)",
            "4. Liên kết (Linking)",
            "Ví dụ hoàn chỉnh"
        });

        TITLE_MAP.put("Trình biên dịch và trình liên kết", new String[]{
            "1. Trình biên dịch (Compiler)",
            "2. Trình liên kết (Linker)",
            "3. Quá trình từ mã nguồn đến file thực thi",
            "4. Các tùy chọn biên dịch quan trọng"
        });

        TITLE_MAP.put("Quá trình thực thi", new String[]{
            "1. Viết mã nguồn (Source Code)",
            "2. Tiền xử lý (Preprocessing)",
            "3. Biên dịch (Compilation)",
            "4. Dịch sang ngôn ngữ máy (Assembly)",
            "5. Liên kết (Linking)",
            "6. Nạp chương trình (Loading)",
            "7. Thực thi (Execution)",
            "Chương trình mẫu đầy đủ",
            "Quá trình biên dịch và thực thi đầy đủ",
            "Các loại file trong quá trình biên dịch"
        });

        TITLE_MAP.put("Câu lệnh if", new String[]{
            "1. Cú pháp cơ bản của if",
            "2. Câu lệnh if-else",
            "3. Câu lệnh if-else if-else",
            "4. If lồng nhau",
            "5. Toán tử điều kiện và if",
            "6. If với phép gán và so sánh"
        });

        TITLE_MAP.put("Câu lệnh if-else", new String[]{
            "1. Giới thiệu",
            "2. Cú pháp đầy đủ",
            "3. Ví dụ minh họa",
            "4. Lưu ý quan trọng",
            "5. Ví dụ kết hợp toán tử logic"
        });

        TITLE_MAP.put("Câu lệnh switch-case", new String[]{
            "1. Giới thiệu",
            "2. Cú pháp đầy đủ",
            "3. Các thành phần chi tiết",
            "4. Code mẫu đầy đủ",
            "5. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Vòng lặp for", new String[]{
            "Cấu trúc của vòng lặp for",
            "Ví dụ minh họa",
            "Khi nào nên dùng vòng lặp for"
        });

        TITLE_MAP.put("Vòng lặp while", new String[]{
            "Cấu trúc của vòng lặp while",
            "Các phần chi tiết",
            "Ví dụ minh họa",
            "Lưu ý khi sử dụng vòng lặp while"
        });

        TITLE_MAP.put("Vòng lặp do-while", new String[]{
            "Cấu trúc của vòng lặp do-while",
            "Code mẫu",
            "Lưu ý quan trọng"
        });

        TITLE_MAP.put("Khai báo mảng một chiều", new String[]{
            "1. Cú pháp khai báo mảng",
            "2. Khởi tạo mảng",
            "3. Truy cập phần tử mảng",
            "4. Kích thước mảng",
            "5. Code mẫu đầy đủ",
            "6. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Truy cập và thao tác với phần tử trong mảng", new String[]{
            "1. Giới thiệu về mảng trong C",
            "2. Khai báo mảng",
            "3. Truy cập phần tử mảng",
            "4. Thay đổi giá trị phần tử",
            "5. Duyệt mảng bằng vòng lặp",
            "6. Nhập và xuất mảng",
            "7. Mảng nhiều chiều",
            "8. Mảng và con trỏ",
            "9. Một số thao tác cơ bản với mảng",
            "10. Truyền mảng vào hàm"
        });

        TITLE_MAP.put("Khai báo mảng hai chiều", new String[]{
            "1. Cú pháp khai báo cơ bản",
            "2. Khởi tạo mảng 2 chiều",
            "3. Code mẫu đầy đủ",
            "4. Giải thích từng phần trong code mẫu",
            "5. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Truy cập và thao tác với phần tử", new String[]{
            "1. Giới thiệu về mảng 2 chiều",
            "2. Khai báo mảng 2 chiều",
            "3. Truy cập phần tử trong mảng 2 chiều",
            "4. Các thao tác cơ bản với mảng 2 chiều",
            "5. Các thao tác nâng cao",
            "6. Truyền mảng 2 chiều vào hàm",
            "7. Lưu ý khi làm việc với mảng 2 chiều"
        });

        TITLE_MAP.put("Khai báo chuỗi", new String[]{
            "1. Các cách khai báo chuỗi cơ bản",
            "2. Khai báo chuỗi không khởi tạo",
            "3. Khai báo nhiều chuỗi cùng lúc",
            "4. Code mẫu đầy đủ",
            "5. Lưu ý quan trọng"
        });

        TITLE_MAP.put("Các hàm xử lý chuỗi", new String[]{
            "1. Các hàm cơ bản",
            "2. Các hàm so sánh",
            "3. Các hàm tìm kiếm",
            "4. Các hàm khác",
            "5. Các hàm an toàn hơn (C11)",
            "Kết luận"
        });

        TITLE_MAP.put("So sánh và nối chuỗi", new String[]{
            "1. So sánh chuỗi trong C",
            "2. Nối chuỗi trong C",
            "3. Các hàm liên quan khác"
        });

        TITLE_MAP.put("Khái niệm về con trỏ", new String[]{
            "1. Định nghĩa con trỏ",
            "2. Cú pháp khai báo con trỏ",
            "3. Toán tử địa chỉ (&) và toán tử dereference (*)",
            "4. Con trỏ và mảng",
            "5. Con trỏ và hàm (Pass by reference)",
            "6. Con trỏ cấp 2 (Con trỏ đến con trỏ)",
            "7. Con trỏ NULL",
            "8. Con trỏ hàm",
            "9. Cấp phát động với con trỏ",
            "10. Con trỏ void (void pointer)"
        });

        TITLE_MAP.put("Khai báo con trỏ", new String[]{
            "Các phần của khai báo con trỏ",
            "Code mẫu",
            "Giải thích code mẫu"
        });

        TITLE_MAP.put("Toán tử con trỏ", new String[]{
            "1. Toán tử địa chỉ (&)",
            "2. Toán tử dereference (*)",
            "3. Toán tử gán con trỏ",
            "4. Toán tử số học con trỏ",
            "5. Toán tử so sánh con trỏ",
            "6. Con trỏ trỏ tới con trỏ",
            "7. Toán tử arrow (->) với cấu trúc"
        });

        TITLE_MAP.put("Cú pháp định nghĩa hàm", new String[]{
            "Kiểu trả về (Return type):",
            "Tên hàm (Function name):",
            "Tham số (Parameters):",
            "Thân hàm (Function body):",
            "Cú pháp đầy đủ:",
            "Ví dụ minh họa:"
        });

        TITLE_MAP.put("Gọi hàm", new String[]{
            "Các phần của lời gọi hàm",
            "Code mẫu minh họa",
            "Giải thích chi tiết"
        });

        TITLE_MAP.put("Hàm trả về giá trị", new String[]{
            "Các phần chính của hàm trả về giá trị",
            "Code mẫu",
            "Giải thích code mẫu"
        });

        TITLE_MAP.put("Truyền tham số theo giá trị", new String[]{
            "Khái niệm",
            "Đặc điểm",
            "Code mẫu minh họa",
            "Kết quả chạy chương trình",
            "Giải thích kết quả",
            "Ưu điểm và nhược điểm"
        });

        TITLE_MAP.put("Truyền tham số theo tham chiếu", new String[]{
            "1. Khái niệm",
            "2. Đặc điểm",
            "3. Cú pháp",
            "4. So sánh với truyền tham trị",
            "5. Code mẫu",
            "6. Kết luận"
        });

        TITLE_MAP.put("Sử dụng con trỏ để truyền tham số", new String[]{
            "1. Khái niệm cơ bản",
            "2. Cách thức hoạt động",
            "3. Cú pháp",
            "4. Ví dụ minh họa",
            "5. Lưu ý quan trọng",
            "6. Truyền tham số con trỏ với const"
        });

        TITLE_MAP.put("Khái niệm hàm đệ quy", new String[]{
            "1. Khái niệm hàm đệ quy",
            "2. Các thành phần của hàm đệ quy",
            "3. Ưu điểm và nhược điểm",
            "4. Các loại đệ quy",
            "5. Code mẫu",
            "6. Lưu ý khi sử dụng hàm đệ quy"
        });

        TITLE_MAP.put("Cách hoạt động của hàm đệ quy", new String[]{
            "1. Khái niệm đệ quy",
            "2. Cơ chế hoạt động",
            "3. Ưu điểm và nhược điểm",
            "4. Ví dụ minh họa",
            "5. Lưu ý khi sử dụng đệ quy"
        });

        TITLE_MAP.put("Ví dụ về hàm đệ quy", new String[]{
            "Ví dụ về hàm đệ quy tính giai thừa",
            "Giải thích chi tiết",
            "Ưu điểm và nhược điểm"
        });

        TITLE_MAP.put("Cấu trúc dữ liệu cơ bản", new String[]{
            "1. Mảng (Array)",
            "2. Chuỗi (String)",
            "3. Cấu trúc (Struct)",
            "4. Union",
            "5. Enum",
            "6. Con trỏ (Pointer)",
            "7. Danh sách liên kết (Linked List)"
        });

        TITLE_MAP.put("File I/O trong C", new String[]{
            "1. Giới thiệu về File I/O trong C",
            "2. Các thao tác cơ bản với file",
            "3. Đọc và ghi file văn bản",
            "4. Đọc và ghi file nhị phân",
            "5. Các hàm điều khiển vị trí con trỏ file",
            "6. Xử lý lỗi file I/O",
            "7. Ví dụ tổng hợp"
        });

        TITLE_MAP.put("Các hàm file I/O", new String[]{
            "1. Mở và đóng file",
            "2. Ghi dữ liệu vào file",
            "3. Đọc dữ liệu từ file",
            "4. Các hàm kiểm tra và điều khiển",
            "Ví dụ hoàn chỉnh"
        });

        TITLE_MAP.put("", new String[]{});

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

        //C
        Content_MAP.put("C là gì?", new String[]{
            "C là ngôn ngữ lập trình cấp cao được phát triển bởi Dennis Ritchie tại Bell Labs vào năm 1972. Nó được thiết kế để lập trình hệ thống, đặc biệt là để viết hệ điều hành UNIX. C là ngôn ngữ biên dịch, đa nền tảng và có cú pháp gần với ngôn ngữ máy.",
            "Đặc điểm nổi bật:\n"
            + "\n"
            + "Ngôn ngữ cấu trúc\n"
            + "\n"
            + "Hiệu suất cao\n"
            + "\n"
            + "Tiếp cận mức thấp (low-level)\n"
            + "\n"
            + "Thư viện phong phú\n"
            + "\n"
            + "Ảnh hưởng đến nhiều ngôn ngữ khác (C++, Java, C#...)",
            "Một chương trình C cơ bản gồm các phần:",
            "C có các kiểu dữ liệu cơ bản:",
            "Kiểu số nguyên:\n"
            + "int: số nguyên (4 bytes)\n"
            + "\n"
            + "short: số nguyên ngắn (2 bytes)\n"
            + "\n"
            + "long: số nguyên dài (4 hoặc 8 bytes)\n"
            + "\n"
            + "char: ký tự (1 byte)",
            "Kiểu số thực:\n"
            + "float: số thực dấu phẩy động (4 bytes)\n"
            + "\n"
            + "double: số thực độ chính xác kép (8 bytes)",
            "Kiểu void:\n"
            + "void: kiểu không có giá trị",
            "Ví dụ:",
            "Biến:\n"
            + "Là tên gọi của vùng nhớ\n"
            + "\n"
            + "Phải được khai báo trước khi sử dụng\n"
            + "\n"
            + "Cú pháp: kiểu_dữ_liệu tên_biến;",
            "Hằng số:\n"
            + "Giá trị không thay đổi\n"
            + "\n"
            + "Khai báo bằng #define hoặc const",
            "Ví dụ:",
            "Toán tử số học:\n"
            + "+, -, *, /, % (chia lấy dư)",
            "Toán tử quan hệ:\n"
            + "==, !=, >, <, >=, <=",
            "Toán tử logic:\n"
            + "&& (AND), || (OR), ! (NOT)",
            "Toán tử gán:\n"
            + "=, +=, -=, *=, /=, %=",
            "Ví dụ:",
            "Câu lệnh if-else:",
            "Vòng lặp for:",
            "Vòng lặp while:",
            "Vòng lặp do-while:",
            "Câu lệnh switch:",
            "Ví dụ:",
            "Hàm là khối lệnh thực hiện một tác vụ cụ thể.\n"
            + "\n"
            + "Cú pháp:",
            "Ví dụ:",
            "Mảng:\n"
            + "Tập hợp các phần tử cùng kiểu\n"
            + "\n"
            + "Kích thước cố định",
            "Chuỗi:\n"
            + "Mảng các ký tự kết thúc bằng '\\0'\n"
            + "\n"
            + "Thư viện string.h hỗ trợ các hàm xử lý chuỗi",
            "Con trỏ là biến lưu địa chỉ của biến khác.",
            "Struct cho phép gom nhóm các biến khác kiểu.",
            "Xử lý file trong C sử dụng FILE pointer và các hàm trong stdio.h.",
            "Chương trình quản lý sinh viên đơn giản:",
            "C là ngôn ngữ mạnh mẽ, hiệu suất cao và là nền tảng cho nhiều ngôn ngữ lập trình hiện đại. Mặc dù cú pháp đơn giản nhưng C yêu cầu lập trình viên phải quản lý bộ nhớ và hiểu rõ cách hoạt động của hệ thống."
        });

        Content_MAP.put("Tại sao nên học C?", new String[]{
            "C là một ngôn ngữ lập trình cổ điển nhưng vẫn cực kỳ quan trọng trong thế giới lập trình hiện đại. Dưới đây là những lý do tại sao bạn nên học C cùng với các nội dung chi tiết và code mẫu minh họa.",
            "Nội dung: C (được phát triển năm 1972) là cơ sở cho nhiều ngôn ngữ phổ biến như C++, Java, Python, JavaScript. Hiểu C giúp bạn dễ dàng học các ngôn ngữ khác.",
            "Code mẫu: So sánh cú pháp cơ bản giữa C và các ngôn ngữ khác",
            "Nội dung: C là ngôn ngữ bậc thấp, cho phép kiểm soát trực tiếp bộ nhớ và tài nguyên hệ thống, mang lại hiệu suất vượt trội cho các ứng dụng đòi hỏi tốc độ.",
            "Code mẫu: Quản lý bộ nhớ trực tiếp",
            "Nội dung: Hầu hết hệ điều hành (Linux, Windows) và firmware đều được viết bằng C do khả năng tương tác trực tiếp với phần cứng.",
            "Code mẫu: Tương tác với phần cứng cơ bản",
            "Nội dung: C yêu cầu lập trình viên tự triển khai các cấu trúc dữ liệu từ đầu, giúp hiểu sâu cách chúng hoạt động.",
            "Code mẫu: Triển khai Linked List",
            "Nội dung: C có cộng đồng lập trình viên rộng lớn, nhiều tài liệu hướng dẫn, thư viện mã nguồn mở đa dạng.",
            "Nội dung: C được sử dụng trong nhiều lĩnh vực: hệ điều hành, nhúng, game, IoT, tài chính. Các công ty lớn như Microsoft, Google, Intel đều cần kỹ sư giỏi C.",
            "Nội dung: C yêu cầu quản lý bộ nhớ thủ công, kiểm soát lỗi cẩn thận, giúp hình thành thói quen lập trình kỷ luật.",
            "Code mẫu: Xử lý lỗi trong C",
            "Nội dung: Hiểu C là cần thiết để làm việc với hệ thống cấp thấp, phân tích mã độc, phát triển phần mềm bảo mật.",
            "Code mẫu: Làm việc với con trỏ hàm",
            "Học C cung cấp nền tảng vững chắc cho sự nghiệp lập trình, giúp bạn:\n"
            + "\n"
            + "Hiểu sâu cách máy tính hoạt động\n"
            + "\n"
            + "Phát triển kỹ năng lập trình hệ thống\n"
            + "\n"
            + "Dễ dàng chuyển sang ngôn ngữ khác\n"
            + "\n"
            + "Mở ra cơ hội trong nhiều lĩnh vực công nghệ"
        });

        Content_MAP.put("Các đặc điểm nổi bật của C", new String[]{
            "C kết hợp các tính năng của ngôn ngữ cấp cao và cấp thấp, cho phép lập trình hệ thống (như driver, hệ điều hành) và ứng dụng.",
            "C hỗ trợ các cấu trúc lập trình như hàm, vòng lặp, điều kiện giúp code dễ đọc và bảo trì.",
            "Code C có thể chạy trên nhiều nền tảng khác nhau với ít hoặc không cần thay đổi.",
            "Con trỏ cho phép truy cập và thao tác trực tiếp với bộ nhớ.",
            "C cung cấp các hàm như malloc(), calloc(), free() để quản lý bộ nhớ động.",
            "C được biên dịch trực tiếp thành mã máy nên có tốc độ thực thi nhanh.",
            "C có nhiều thư viện chuẩn (standard library) cung cấp các hàm hữu ích.",
            "C chỉ có khoảng 32 từ khóa và cú pháp đơn giản.",
            "C thường được dùng để phát triển hệ điều hành, trình biên dịch, driver.",
            "Có thể dễ dàng mở rộng chức năng bằng cách thêm các hàm mới."
        });

        Content_MAP.put("Nguồn gốc của C", new String[]{
            "Ngôn ngữ C được phát triển vào đầu những năm 1970 tại Bell Labs (Phòng thí nghiệm Bell) bởi Dennis Ritchie. Ngôn ngữ này ra đời trong bối cảnh:\n"
            + "\n"
            + "Hệ điều hành UNIX đang được phát triển tại Bell Labs\n"
            + "\n"
            + "Cần một ngôn ngữ lập trình hệ thống hiệu quả hơn assembly\n"
            + "\n"
            + "Kế thừa từ ngôn ngữ B (do Ken Thompson phát triển) và BCPL",
            "1969-1973: Giai đoạn phát triển ban đầu bởi Dennis Ritchie\n"
            + "\n"
            + "1978: Xuất bản cuốn \"The C Programming Language\" (K&R C)\n"
            + "\n"
            + "1989: Chuẩn hóa bởi ANSI (ANSI C hay C89)\n"
            + "\n"
            + "1990: ISO chấp nhận thành chuẩn ISO/IEC 9899:1990 (C90)\n"
            + "\n"
            + "1999: Chuẩn C99 với nhiều cải tiến\n"
            + "\n"
            + "2011: Chuẩn C11 bổ sung tính năng đa luồng\n"
            + "\n"
            + "2018: Chuẩn C18 (chủ yếu sửa lỗi)",
            "Ngôn ngữ bậc trung (middle-level)\n"
            + "\n"
            + "Cấu trúc và thủ tục (structured/procedural)\n"
            + "\n"
            + "Tương thích với phần cứng\n"
            + "\n"
            + "Hiệu suất cao\n"
            + "\n"
            + "Thư viện phong phú\n"
            + "\n"
            + "Tính linh hoạt và khả năng di động",
            "C đã ảnh hưởng đến nhiều ngôn ngữ khác như C++, Java, C#, Objective-C. Ứng dụng chính:\n"
            + "\n"
            + "Hệ điều hành (UNIX, Linux, Windows kernel)\n"
            + "\n"
            + "Hệ thống nhúng\n"
            + "\n"
            + "Trình biên dịch\n"
            + "\n"
            + "Cơ sở dữ liệu\n"
            + "\n"
            + "Ứng dụng hiệu suất cao",
            "Chương trình \"Hello World\" cơ bản",
            "Ví dụ về cấu trúc điều khiển",
            "Ví dụ về hàm và con trỏ",
            "Ví dụ về struct",
            "Ví dụ về quản lý bộ nhớ động",
            "Ngôn ngữ C đã tồn tại hơn 50 năm nhưng vẫn giữ vị trí quan trọng trong lập trình hệ thống và các ứng dụng hiệu suất cao. Sự đơn giản, hiệu quả và khả năng kiểm soát phần cứng khiến C trở thành ngôn ngữ không thể thay thế trong nhiều lĩnh vực."
        });

        Content_MAP.put("Các phiên bản của C", new String[]{
            "Mô tả: Phiên bản đầu tiên được mô tả trong cuốn \"The C Programming Language\" bởi Brian Kernighan và Dennis Ritchie.",
            "Đặc điểm:\n"
            + "\n"
            + "Không có prototype hàm\n"
            + "\n"
            + "Khai báo hàm kiểu cũ\n"
            + "\n"
            + "Không có kiểu void\n"
            + "\n"
            + "Xử lý kiểu đơn giản",
            "Code mẫu:",
            "Mô tả: Chuẩn hóa đầu tiên bởi ANSI (1989) và ISO (1990).",
            "Đặc điểm mới:\n"
            + "\n"
            + "Thêm prototype hàm\n"
            + "\n"
            + "Thêm kiểu void\n"
            + "\n"
            + "Thêm hằng chuỗi (string literal)\n"
            + "\n"
            + "Thêm thư viện chuẩn\n"
            + "\n"
            + "Hỗ trợ comment //",
            "Code mẫu:",
            "Mô tả: Chuẩn ISO năm 1999, bổ sung nhiều tính năng quan trọng.",
            "Đặc điểm mới:\n"
            + "\n"
            + "Biến có thể khai báo ở bất kỳ đâu\n"
            + "\n"
            + "Hỗ trợ comment một dòng //\n"
            + "\n"
            + "Kiểu long long\n"
            + "\n"
            + "Mảng có kích thước thay đổi (VLA)\n"
            + "\n"
            + "Hỗ trợ số học phức tạp\n"
            + "\n"
            + "Macro với số lượng đối số thay đổi",
            "Code mẫu:",
            "Mô tả: Chuẩn ISO năm 2011, tập trung vào đa luồng và an toàn.",
            "Đặc điểm mới:\n"
            + "\n"
            + "Hỗ trợ đa luồng (_Thread_local, <threads.h>)\n"
            + "\n"
            + "Biểu thức kiểu generic (_Generic)\n"
            + "\n"
            + "Hàm an toàn (bounds-checking) trong Annex K\n"
            + "\n"
            + "Macro static_assert\n"
            + "\n"
            + "Hủy bỏ gets()",
            "Code mẫu:",
            "Mô tả: Chuẩn ISO năm 2018, chủ yếu sửa lỗi và cải tiến nhỏ.",
            "Đặc điểm mới:\n"
            + "\n"
            + "Sửa lỗi từ C11\n"
            + "\n"
            + "Thêm một số tính năng từ thư viện\n"
            + "\n"
            + "Không thay đổi ngôn ngữ cốt lõi",
            "Code mẫu:",
            "Mô tả: Chuẩn sắp tới (dự kiến 2023), nhiều cải tiến quan trọng.",
            "Đặc điểm mới (dự kiến):\n"
            + "\n"
            + "#elifdef và #elifndef\n"
            + "\n"
            + "Thuộc tính [[deprecated]]\n"
            + "\n"
            + "Hỗ trợ UTF-8 tốt hơn\n"
            + "\n"
            + "Thêm constexpr\n"
            + "\n"
            + "nullptr thay cho NULL",
            "Code mẫu (dự thảo):"
        });

        Content_MAP.put("C và các ngôn ngữ lập trình khác", new String[]{
            "Ngôn ngữ C\n"
            + "Mục đích: Ngôn ngữ lập trình hệ thống, phát triển hệ điều hành, driver, embedded systems\n"
            + "\n"
            + "Năm ra đời: 1972\n"
            + "\n"
            + "Đặc điểm: Ngôn ngữ bậc thấp, thủ tục, biên dịch\n"
            + "\n"
            + "Ưu điểm: Hiệu suất cao, kiểm soát phần cứng tốt, nhỏ gọn\n"
            + "\n"
            + "Nhược điểm: Không hỗ trợ OOP, quản lý bộ nhớ thủ công",
            "Các ngôn ngữ khác\n"
            + "Java: Hướng đối tượng, đa nền tảng (JVM), tự động quản lý bộ nhớ\n"
            + "\n"
            + "Python: Ngôn ngữ bậc cao, thông dịch, đa mục đích, cú pháp đơn giản\n"
            + "\n"
            + "JavaScript: Ngôn ngữ kịch bản web, chạy trên trình duyệt\n"
            + "\n"
            + "C++: Mở rộng từ C, hỗ trợ OOP và lập trình đa hình",
            "Hello World trong các ngôn ngữ",
            "C:",
            "Java:",
            "Python:",
            "JavaScript:",
            "C++:",
            "C\n"
            + "Quản lý thủ công bằng malloc/calloc/realloc/free\n"
            + "\n"
            + "Dễ xảy ra rò rỉ bộ nhớ nếu không giải phóng",
            "Java/Python/JavaScript\n"
            + "Tự động quản lý bộ nhớ (Garbage Collection)\n"
            + "\n"
            + "Lập trình viên không cần quan tâm đến giải phóng bộ nhớ",
            "Java:",
            "C\n"
            + "Không hỗ trợ OOP nguyên bản\n"
            + "\n"
            + "Có thể mô phỏng bằng struct và function pointer",
            "C++/Java/Python\n"
            + "Hỗ trợ đầy đủ OOP: lớp, đối tượng, kế thừa, đa hình",
            "C++:",
            "C\n"
            + "Hiệu suất cao nhất do gần với phần cứng\n"
            + "\n"
            + "Tối ưu hóa tốt khi biên dịch\n"
            + "\n"
            + "Không có overhead từ runtime environment",
            "C++\n"
            + "Hiệu suất gần bằng C, có thể chậm hơn đôi chút do các tính năng OOP",
            "Java/Python/JavaScript\n"
            + "Chậm hơn do chạy trên máy ảo hoặc thông dịch\n"
            + "\n"
            + "Java nhanh hơn Python/JavaScript nhờ JIT compiler",
            "C\n"
            + "Hệ điều hành (Linux, Windows kernel)\n"
            + "\n"
            + "Driver phần cứng\n"
            + "\n"
            + "Hệ thống nhúng (IoT, vi điều khiển)\n"
            + "\n"
            + "Các thư viện hiệu suất cao",
            "Các ngôn ngữ khác\n"
            + "Java: Ứng dụng doanh nghiệp, Android\n"
            + "\n"
            + "Python: Khoa học dữ liệu, AI, scripting, web backend\n"
            + "\n"
            + "JavaScript: Web frontend (React, Angular), Node.js\n"
            + "\n"
            + "C++: Game development, hệ thống hiệu suất cao",
            "C",
            "Java",
            "Python",
            "JavaScript",
            "C phù hợp cho lập trình hệ thống, nơi cần hiệu suất cao và kiểm soát phần cứng\n"
            + "\n"
            + "C++ kết hợp sức mạnh của C với OOP, phù hợp cho game, ứng dụng hiệu suất cao\n"
            + "\n"
            + "Java/Python/JavaScript phù hợp cho ứng dụng cấp cao, phát triển nhanh\n"
            + "\n"
            + "Lựa chọn ngôn ngữ phụ thuộc vào yêu cầu dự án: hiệu suất, thời gian phát triển, nền tảng mục tiêu"
        });

        Content_MAP.put("Ứng dụng của C trong lập trình hệ thống", new String[]{
            "C là ngôn ngữ chính để phát triển hệ điều hành do khả năng truy cập trực tiếp vào phần cứng và hiệu suất cao.",
            "Nội dung:\n"
            + "\n"
            + "Unix và các hệ điều hành giống Unix (Linux, macOS) được viết chủ yếu bằng C\n"
            + "\n"
            + "Cung cấp khả năng kiểm soát bộ nhớ và tài nguyên hệ thống\n"
            + "\n"
            + "Cho phép tương tác trực tiếp với kernel và driver",
            "Code mẫu: Tạo tiến trình con bằng fork()",
            "Nội dung:\n"
            + "\n"
            + "C cho phép truy cập trực tiếp vào thanh ghi phần cứng\n"
            + "\n"
            + "Có thể quản lý ngắt (interrupt) và DMA\n"
            + "\n"
            + "Tương tác với phần cứng ở mức thấp",
            "Code mẫu: Driver đơn giản cho GPIO",
            "Nội dung:\n"
            + "\n"
            + "C được sử dụng rộng rãi trong lập trình vi điều khiển\n"
            + "\n"
            + "Hiệu quả về tài nguyên và tốc độ thực thi\n"
            + "\n"
            + "Có thể tương tác trực tiếp với phần cứng mà không cần hệ điều hành",
            "Code mẫu: Điều khiển LED trên vi điều khiển AVR",
            "Nội dung:\n"
            + "\n"
            + "C được dùng để phát triển giao thức mạng và stack mạng\n"
            + "\n"
            + "Hiệu suất cao trong xử lý packet\n"
            + "\n"
            + "Có thể làm việc với socket ở mức thấp",
            "Code mẫu: TCP Server đơn giản",
            "Nội dung:\n"
            + "\n"
            + "C được dùng để phát triển các công cụ hệ thống như shell, trình biên dịch, debugger\n"
            + "\n"
            + "Cung cấp khả năng kiểm soát tiến trình và tài nguyên hệ thống\n"
            + "\n"
            + "Hiệu suất cao trong xử lý file và I/O",
            "Code mẫu: Lệnh ls đơn giản",
            "Nội dung:\n"
            + "\n"
            + "Phát triển các công cụ bảo mật như firewall, IDS/IPS\n"
            + "\n"
            + "Làm việc với các cơ chế bảo mật của hệ điều hành\n"
            + "\n"
            + "Phân tích và xử lý các lỗ hổng hệ thống",
            "Code mẫu: Kiểm tra quyền root",
            "Nội dung:\n"
            + "\n"
            + "Phát triển hệ thống file và các công cụ quản lý file\n"
            + "\n"
            + "Làm việc với các thao tác I/O mức thấp\n"
            + "\n"
            + "Quản lý metadata và cấu trúc file system",
            "Code mẫu: Đọc thông tin inode",
            "Nội dung:\n"
            + "\n"
            + "Phát triển hypervisor và các công cụ ảo hóa\n"
            + "\n"
            + "Quản lý tài nguyên ảo hóa\n"
            + "\n"
            + "Tương tác với phần cứng ảo hóa",
            "Code mẫu: Kiểm tra ảo hóa bằng CPUID",
            "Ngôn ngữ C tiếp tục là lựa chọn hàng đầu cho lập trình hệ thống nhờ:\n"
            + "\n"
            + "Hiệu suất gần với ngôn ngữ assembly\n"
            + "\n"
            + "Khả năng kiểm soát phần cứng\n"
            + "\n"
            + "Tính di động và ổn định\n"
            + "\n"
            + "Thư viện hệ thống phong phú\n"
            + "\n"
            + "Cộng đồng hỗ trợ mạnh mẽ"
        });

        Content_MAP.put("C trong phát triển phần mềm nhúng", new String[]{
            "Ngôn ngữ C là ngôn ngữ lập trình phổ biến nhất trong phát triển phần mềm nhúng do:\n"
            + "\n"
            + "Hiệu suất cao, gần với phần cứng\n"
            + "\n"
            + "Tiêu thụ tài nguyên thấp (bộ nhớ, CPU)\n"
            + "\n"
            + "Khả năng kiểm soát trực tiếp phần cứng\n"
            + "\n"
            + "Tính di động cao giữa các kiến trúc vi điều khiển",
            "2.1. Kiểu dữ liệu và kích thước\n"
            + "Trong hệ thống nhúng, việc hiểu rõ kích thước kiểu dữ liệu là quan trọng:",
            "2.2. Bit manipulation\n"
            + "Thao tác bit là kỹ thuật quan trọng để điều khiển phần cứng:",
            "3.1. Truy cập thanh ghi phần cứng\n"
            + "Cách truy cập thanh ghi phần cứng thông qua con trỏ:",
            "3.2. Ngắt (Interrupts)\n"
            + "Xử lý ngắt trong hệ thống nhúng:",
            "4.1. Bộ nhớ tĩnh và stack",
            "4.2. Quản lý heap (hạn chế sử dụng trong hệ thống nhúng)",
            "5.1. UART Communication",
            "5.2. SPI Communication",
            "6.1. Tạo task cơ bản (FreeRTOS example)",
            "6.2. Semaphore và Queue",
            "7.1. Sử dụng inline và macro",
            "7.2. Tối ưu vòng lặp",
            "8.1. Sử dụng assert",
            "8.2. Logging trong hệ thống nhúng",
            "9.1. Coding style",
            "9.2. Xử lý lỗi",
            "Ngôn ngữ C tiếp tục là lựa chọn hàng đầu cho phát triển phần mềm nhúng do:\n"
            + "\n"
            + "Hiệu suất cao và kiểm soát trực tiếp phần cứng\n"
            + "\n"
            + "Tiêu thụ tài nguyên thấp\n"
            + "\n"
            + "Hỗ trợ rộng rãi từ các nhà sản xuất vi điều khiển\n"
            + "\n"
            + "Cộng đồng phát triển mạnh mẽ"
        });

        Content_MAP.put("Cấu trúc tổng quát", new String[]{
            "Chứa các khai báo thư viện cần thiết cho chương trình.",
            "Định nghĩa các hằng số sẽ được sử dụng trong chương trình.",
            "Khai báo các hàm sẽ được sử dụng trong chương trình.",
            "Các biến có thể được truy cập từ mọi nơi trong chương trình.",
            "Hàm chính, điểm bắt đầu của chương trình.",
            "Triển khai chi tiết các hàm đã được khai báo.",
            "Thư viện: Chứa các file header cần thiết cho chương trình\n"
            + "\n"
            + "Hằng số: Định nghĩa các giá trị không đổi trong chương trình\n"
            + "\n"
            + "Nguyên mẫu hàm: Khai báo các hàm trước khi sử dụng\n"
            + "\n"
            + "Biến toàn cục: Có thể truy cập từ mọi hàm trong chương trình\n"
            + "\n"
            + "Hàm main: Điểm bắt đầu thực thi chương trình\n"
            + "\n"
            + "Định nghĩa hàm: Triển khai chi tiết các hàm đã khai báo"
        });

        Content_MAP.put("Khai báo biến", new String[]{
            "Biến trong C là tên gọi của một vùng nhớ được sử dụng để lưu trữ dữ liệu trong chương trình. Mỗi biến có một kiểu dữ liệu xác định và có thể thay đổi giá trị trong quá trình thực thi chương trình.",
            "Cú pháp cơ bản để khai báo biến trong C:",
            "a. Kiểu số nguyên",
            "b. Kiểu số thực",
            "c. Kiểu ký tự",
            "d. Kiểu boolean (C99 trở lên)",
            "Biến static giữ nguyên giá trị giữa các lần gọi hàm:",
            "File1.c:",
            "File2.c:",
            "Tên biến chỉ có thể chứa chữ cái, số và dấu gạch dưới\n"
            + "\n"
            + "Tên biến phải bắt đầu bằng chữ cái hoặc dấu gạch dưới\n"
            + "\n"
            + "Tên biến phân biệt hoa thường\n"
            + "\n"
            + "Không được trùng với từ khóa của C",
            "Ví dụ tên biến hợp lệ:",
            "Biến cục bộ: Chỉ có tác dụng trong khối lệnh hoặc hàm chứa nó\n"
            + "\n"
            + "Biến toàn cục: Có tác dụng trong toàn chương trình\n"
            + "\n"
            + "Biến tham số hàm: Có tác dụng trong hàm chứa nó\n"
            + "\n"
            + "Ví dụ:"
        });

        Content_MAP.put("Hàm main", new String[]{
            "1. Kiểu trả về\n"
            + "Hàm main thường có kiểu trả về int để báo cáo trạng thái thoát của chương trình cho hệ điều hành:\n"
            + "\n"
            + "0: Thành công\n"
            + "\n"
            + "Khác 0: Lỗi (thường là 1)",
            "2. Tham số\n"
            + "Hàm main có thể nhận các tham số từ dòng lệnh:\n"
            + "\n"
            + "argc (argument count): Số lượng tham số\n"
            + "\n"
            + "argv (argument vector): Mảng các chuỗi tham số",
            "3. Nội dung hàm\n"
            + "Phần thân hàm chứa các lệnh sẽ được thực thi khi chương trình chạy.",
            "1. Không tham số",
            "2. Có tham số dòng lệnh",
            "3. Sử dụng tham số môi trường (ít phổ biến hơn)",
            "Phần khai báo: Bao gồm các thư viện cần thiết\n"
            + "\n"
            + "Hàm phụ trợ: factorial() để tính giai thừa\n"
            + "\n"
            + "Kiểm tra tham số: Đảm bảo người dùng nhập đúng định dạng\n"
            + "\n"
            + "Xử lý lỗi: Thông báo lỗi và trả về mã lỗi khi cần\n"
            + "\n"
            + "Xử lý chính: Chuyển đổi tham số và tính toán kết quả\n"
            + "\n"
            + "Trả về kết quả: In ra màn hình và trả về mã thành công",
            "Luôn trả về giá trị từ hàm main (thường là 0 cho thành công)\n"
            + "\n"
            + "Kiểm tra số lượng và kiểu tham số khi sử dụng tham số dòng lệnh\n"
            + "\n"
            + "Trong C99 và C11, return 0; có thể được bỏ qua (compiler sẽ tự thêm)\n"
            + "\n"
            + "void trong main(void) là cách rõ ràng để chỉ ra không có tham số\n"
            + "\n"
            + "Hàm main là nơi bắt đầu và kết thúc luồng thực thi của chương trình C, vì vậy việc thiết kế hàm main rõ ràng, xử lý lỗi tốt là rất quan trọng."
        });

        Content_MAP.put("Các bước biên dịch", new String[]{
            "Trong giai đoạn này, trình tiền xử lý (preprocessor) sẽ xử lý các chỉ thị tiền xử lý (bắt đầu bằng #) trong mã nguồn.",
            "Các công việc chính:\n"
            + "\n"
            + "Bao gồm các file header (#include)\n"
            + "\n"
            + "Xử lý các macro (#define)\n"
            + "\n"
            + "Xử lý điều kiện biên dịch (#ifdef, #ifndef, #endif)\n"
            + "\n"
            + "Bỏ các comment trong mã nguồn",
            "Ví dụ:",
            "Sau khi tiền xử lý (có thể xem bằng gcc -E sample.c):",
            "Trình biên dịch (compiler) sẽ chuyển mã nguồn đã qua tiền xử lý thành mã assembly tương ứng với kiến trúc máy đích.",
            "Công việc chính:\n"
            + "\n"
            + "Kiểm tra cú pháp và ngữ nghĩa\n"
            + "\n"
            + "Phân tích mã nguồn và tạo mã assembly\n"
            + "\n"
            + "Tối ưu hóa code (nếu được bật)",
            "Ví dụ mã assembly (xem bằng gcc -S sample.c):",
            "Trình dịch hợp ngữ (assembler) sẽ chuyển mã assembly thành mã máy (object code) và tạo ra file object (.o hoặc .obj).",
            "Công việc chính:\n"
            + "\n"
            + "Dịch lệnh assembly sang mã máy\n"
            + "\n"
            + "Tạo các bảng tham chiếu (symbol table)\n"
            + "\n"
            + "Đóng gói thành file object",
            "Ví dụ (tạo file object bằng gcc -c sample.c sẽ tạo ra sample.o)",
            "Trình liên kết (linker) sẽ kết hợp các file object và thư viện để tạo ra file thực thi cuối cùng.",
            "Công việc chính:\n"
            + "\n"
            + "Giải quyết các tham chiếu chéo giữa các file object\n"
            + "\n"
            + "Liên kết với các thư viện (libc, ...)\n"
            + "\n"
            + "Phân bổ bộ nhớ cho chương trình\n"
            + "\n"
            + "Tạo file thực thi (executable)",
            "Ví dụ (tạo file thực thi bằng gcc sample.c -o sample)",
            "Chương trình chia thành nhiều file:",
            "Quá trình biên dịch từng bước:",
            "Tiền xử lý từng file:",
            "Biên dịch sang assembly:",
            "Dịch sang ngôn ngữ máy:",
            "Liên kết các file object:",
            "Chạy chương trình:",
            "Kết quả:"
        });

        Content_MAP.put("Quá trình thực thi", new String[]{
            "Nội dung: Đây là bước đầu tiên, lập trình viên viết mã nguồn bằng ngôn ngữ C theo cú pháp của ngôn ngữ.",
            "Code mẫu:",
            "Nội dung: Trình tiền xử lý (preprocessor) xử lý các chỉ thị bắt đầu bằng #:\n"
            + "\n"
            + "Bao gồm các file header (#include)\n"
            + "\n"
            + "Thay thế macro (#define)\n"
            + "\n"
            + "Xử lý điều kiện biên dịch (#ifdef, #ifndef)",
            "Kết quả sau tiền xử lý (có thể xem bằng gcc -E hello.c):",
            "Nội dung: Trình biên dịch (compiler) chuyển mã nguồn đã tiền xử lý thành mã assembly tương ứng với kiến trúc CPU.",
            "Lệnh biên dịch:",
            "Mã assembly mẫu (hello.s):",
            "Nội dung: Trình dịch hợp ngữ (assembler) chuyển mã assembly thành mã máy (object code) dạng nhị phân.",
            "Lệnh tạo file object:",
            "Nội dung: Trình liên kết (linker) kết hợp các file object và thư viện để tạo ra file thực thi hoàn chỉnh:\n"
            + "\n"
            + "Giải quyết các tham chiếu chéo giữa các file object\n"
            + "\n"
            + "Liên kết với các thư viện chuẩn (như thư viện C - libc)",
            "Lệnh liên kết:",
            "Nội dung: Hệ điều hành nạp chương trình vào bộ nhớ để thực thi:\n"
            + "\n"
            + "Đọc file thực thi\n"
            + "\n"
            + "Cấp phát bộ nhớ\n"
            + "\n"
            + "Nạp các thư viện động (nếu có)\n"
            + "\n"
            + "Thiết lập môi trường thực thi",
            "Nội dung: CPU thực thi các lệnh máy của chương trình:\n"
            + "\n"
            + "Thực thi từ hàm main()\n"
            + "\n"
            + "Quản lý bộ nhớ stack và heap\n"
            + "\n"
            + "Xử lý các lời gọi hàm và hệ thống",
            "Dưới đây là một chương trình C đầy đủ hơn minh họa các khái niệm:",
            "Tiền xử lý:",
            "Biên dịch sang assembly:",
            "Dịch sang ngôn ngữ máy:",
            "Liên kết:",
            "Thực thi:",
            "Kết quả khi chạy chương trình:",
            "File .c: Mã nguồn C\n"
            + "\n"
            + "File .i: Mã nguồn đã qua tiền xử lý\n"
            + "\n"
            + "File .s: Mã assembly\n"
            + "\n"
            + "File .o: Mã máy (object file)\n"
            + "\n"
            + "File thực thi (hoặc .exe trên Windows): Chương trình hoàn chỉnh"
        });

        Content_MAP.put("Trình biên dịch và trình liên kết", new String[]{
            "Trình biên dịch trong C là chương trình chuyển đổi mã nguồn (source code) viết bằng ngôn ngữ C thành mã máy (machine code) hoặc mã trung gian. Quá trình biên dịch bao gồm các giai đoạn chính:",
            "Tiền xử lý (Preprocessing): Xử lý các chỉ thị tiền xử lý như #include, #define, #ifdef...\n"
            + "\n"
            + "Biên dịch (Compilation): Chuyển mã nguồn đã qua tiền xử lý thành mã assembly\n"
            + "\n"
            + "Dịch assembly (Assembly): Chuyển mã assembly thành mã máy (tạo file object .o hoặc .obj)\n"
            + "\n"
            + "Liên kết (Linking): Kết hợp các file object và thư viện để tạo file thực thi\n"
            + "\n"
            + "Trình biên dịch C phổ biến nhất là GCC (GNU Compiler Collection).",
            "Code mẫu:",
            "Biên dịch với GCC:",
            "Trình liên kết có nhiệm vụ kết hợp các file object (.o hoặc .obj) được tạo ra bởi trình biên dịch và các thư viện (libraries) để tạo ra file thực thi cuối cùng. Công việc chính của linker:",
            "Liên kết các file object: Kết hợp mã máy từ nhiều file nguồn khác nhau\n"
            + "\n"
            + "Giải quyết các tham chiếu: Tìm và kết nối các hàm, biến được khai báo nhưng định nghĩa ở file khác\n"
            + "\n"
            + "Liên kết thư viện: Thêm các hàm từ thư viện chuẩn hoặc thư viện bên ngoài\n"
            + "\n"
            + "Phân bổ bộ nhớ: Sắp xếp các đoạn mã và dữ liệu vào các vùng nhớ phù hợp",
            "Có 2 loại liên kết chính:\n"
            + "\n"
            + "Liên kết tĩnh (Static linking): Code từ thư viện được nhúng trực tiếp vào file thực thi\n"
            + "\n"
            + "Liên kết động (Dynamic linking): File thực thi chỉ chứa tham chiếu đến thư viện, thư viện được nạp khi chạy chương trình",
            "Code mẫu liên kết nhiều file:\n"
            + "File 1: main.c",
            "File 2: math.c",
            "Biên dịch và liên kết:",
            "Chi tiết các bước:\n"
            + "Viết mã nguồn: Tạo các file .c và .h\n"
            + "\n"
            + "Tiền xử lý:\n"
            + "\n"
            + "Mở rộng #include\n"
            + "\n"
            + "Xử lý macro (#define)\n"
            + "\n"
            + "Điều kiện biên dịch (#ifdef, #ifndef)\n"
            + "\n"
            + "Biên dịch:\n"
            + "\n"
            + "Phân tích cú pháp (parsing)\n"
            + "\n"
            + "Kiểm tra kiểu\n"
            + "\n"
            + "Tối ưu hóa mã\n"
            + "\n"
            + "Tạo mã assembly\n"
            + "\n"
            + "Dịch assembly:\n"
            + "\n"
            + "Chuyển assembly thành mã máy\n"
            + "\n"
            + "Tạo file object (.o)\n"
            + "\n"
            + "Liên kết:\n"
            + "\n"
            + "Kết hợp các file object\n"
            + "\n"
            + "Giải quyết các tham chiếu\n"
            + "\n"
            + "Thêm code từ thư viện\n"
            + "\n"
            + "Tạo file thực thi",
            "Ví dụ đầy đủ với nhiều file:\n"
            + "File: utils.h",
            "File: utils.c",
            "File: app.c",
            "Biên dịch và liên kết:",
            "-o: Chỉ định tên file đầu ra",
            "-c: Chỉ biên dịch thành file object, không liên kết",
            "-I: Thêm thư mục tìm kiếm header file",
            "-L và -l: Liên kết với thư viện",
            "-g: Thêm thông tin debug",
            "-O: Tối ưu hóa mã",
            "-Wall: Bật tất cả cảnh báo"
        });

        Content_MAP.put("Câu lệnh if", new String[]{
            "Câu lệnh if trong C là một cấu trúc điều khiển cơ bản cho phép thực hiện các hành động khác nhau dựa trên các điều kiện khác nhau.",
            "Ví dụ:",
            "Khi muốn xử lý cả trường hợp điều kiện sai (false):",
            "Ví dụ:",
            "Khi có nhiều điều kiện cần kiểm tra:",
            "Ví dụ:",
            "Có thể lồng các câu lệnh if bên trong nhau:",
            "Ví dụ:",
            "Có thể sử dụng các toán tử logic (&&, ||, !) để kết hợp nhiều điều kiện:",
            "Ví dụ:",
            "Trong C, có thể kết hợp phép gán và so sánh trong điều kiện if:",
            "Ví dụ:",
            "Lưu ý: Cần cẩn thận khi sử dụng phép gán trong điều kiện if để tránh nhầm lẫn với phép so sánh (==)."
        });

        Content_MAP.put("Câu lệnh if-else", new String[]{
            "Câu lệnh if-else trong C là một cấu trúc điều khiển cơ bản cho phép thực hiện các khối lệnh khác nhau dựa trên điều kiện đúng hoặc sai.",
            "2.1. Câu lệnh if đơn giản",
            "2.2. Câu lệnh if-else",
            "2.3. Câu lệnh if-else if-else (nhiều điều kiện)",
            "2.4. Câu lệnh if lồng nhau",
            "3.1. Ví dụ if đơn giản",
            "3.2. Ví dụ if-else",
            "3.3. Ví dụ if-else if-else",
            "3.4. Ví dụ if lồng nhau",
            "Điều kiện trong if phải là biểu thức trả về giá trị boolean (0 là false, khác 0 là true)\n"
            + "\n"
            + "Có thể bỏ qua dấu ngoặc nhọn {} nếu khối lệnh chỉ có 1 câu lệnh\n"
            + "\n"
            + "Nên sử dụng dấu ngoặc nhọn {} ngay cả khi chỉ có 1 câu lệnh để tránh nhầm lẫn\n"
            + "\n"
            + "Có thể sử dụng các toán tử logic (&&, ||, !) để kết hợp nhiều điều kiện"
        });

        Content_MAP.put("Câu lệnh switch-case", new String[]{
            "Câu lệnh switch-case trong C là một cấu trúc điều khiển cho phép thực hiện nhiều nhánh khác nhau dựa trên giá trị của một biểu thức. Nó thường được sử dụng thay thế cho chuỗi các câu lệnh if-else khi cần kiểm tra nhiều giá trị khác nhau của cùng một biến.",
            "a. Biểu thức trong switch\n"
            + "Biểu thức phải trả về giá trị kiểu số nguyên (int, char, enum)\n"
            + "\n"
            + "Không thể sử dụng kiểu float, double hoặc chuỗi",
            "b. Các case\n"
            + "Mỗi case theo sau là một giá trị cụ thể để so sánh\n"
            + "\n"
            + "Giá trị trong case phải là hằng số (không thể là biến)\n"
            + "\n"
            + "Các giá trị case phải là duy nhất (không trùng lặp)",
            "c. Câu lệnh break\n"
            + "break dùng để thoát khỏi khối switch\n"
            + "\n"
            + "Nếu không có break, chương trình sẽ tiếp tục thực hiện các case tiếp theo (hiện tượng \"fall through\")",
            "d. Default case\n"
            + "Là trường hợp mặc định khi không có case nào khớp\n"
            + "\n"
            + "Không bắt buộc phải có, nhưng nên sử dụng để xử lý các trường hợp không mong muốn",
            "Ví dụ 1: Đánh giá điểm số",
            "Ví dụ 2: Tính toán đơn giản",
            "Ví dụ 3: Sử dụng fall through có chủ đích",
            "Biểu thức trong switch phải có kiểu nguyên (int, char, enum)\n"
            + "\n"
            + "Các case phải là giá trị hằng số, không thể là biến\n"
            + "\n"
            + "Luôn sử dụng break trừ khi có lý do cụ thể để fall through\n"
            + "\n"
            + "Nên sử dụng default case để xử lý các trường hợp không mong muốn\n"
            + "\n"
            + "Switch-case thường hiệu quả hơn chuỗi if-else dài khi so sánh cùng một biến"
        });

        Content_MAP.put("Vòng lặp for", new String[]{
            "Vòng lặp for trong C gồm 3 phần chính:",
            "1. Phần khởi tạo (Initialization)\n"
            + "Được thực hiện một lần duy nhất khi bắt đầu vòng lặp\n"
            + "\n"
            + "Thường dùng để khởi tạo biến đếm\n"
            + "\n"
            + "Có thể khai báo nhiều biến cách nhau bằng dấu phẩy\n"
            + "\n"
            + "Phần này có thể để trống nếu biến đếm đã được khởi tạo trước đó",
            "2. Phần điều kiện (Condition)\n"
            + "Được kiểm tra trước mỗi lần lặp\n"
            + "\n"
            + "Nếu điều kiện trả về true (khác 0), khối lệnh sẽ được thực thi\n"
            + "\n"
            + "Nếu điều kiện trả về false (0), vòng lặp kết thúc\n"
            + "\n"
            + "Nếu để trống, điều kiện mặc định là true (lặp vô hạn)",
            "3. Phần cập nhật (Update)\n"
            + "Được thực hiện sau mỗi lần lặp\n"
            + "\n"
            + "Thường dùng để thay đổi giá trị biến đếm (tăng/giảm)\n"
            + "\n"
            + "Có thể thực hiện nhiều phép toán cách nhau bằng dấu phẩy\n"
            + "\n"
            + "Có thể để trống nếu việc cập nhật được thực hiện trong thân vòng lặp",
            "Ví dụ 1: Vòng lặp for cơ bản",
            "Kết quả: 1 2 3 4 5",
            "Ví dụ 2: Vòng lặp for với nhiều biến",
            "Kết quả:",
            "Ví dụ 3: Vòng lặp for với phần khởi tạo để trống",
            "Kết quả:",
            "Ví dụ 4: Vòng lặp for vô hạn",
            "Ví dụ 5: Vòng lặp for lồng nhau",
            "Khi biết trước số lần lặp\n"
            + "\n"
            + "Khi cần truy cập các phần tử mảng/tập hợp theo chỉ số\n"
            + "\n"
            + "Khi cần thực hiện một công việc với biến đếm thay đổi theo quy luật"
        });

        Content_MAP.put("Vòng lặp while", new String[]{
            "Vòng lặp while là một cấu trúc điều khiển trong ngôn ngữ C cho phép thực hiện lặp đi lặp lại một khối lệnh khi một điều kiện nhất định vẫn còn đúng.",
            "1. Điều kiện (condition)\n"
            + "Là biểu thức logic được đánh giá trước mỗi lần lặp\n"
            + "\n"
            + "Nếu điều kiện trả về giá trị true (khác 0), khối lệnh sẽ được thực thi\n"
            + "\n"
            + "Nếu điều kiện trả về false (0), vòng lặp kết thúc\n"
            + "\n"
            + "Điều kiện phải được đặt trong cặp ngoặc đơn ()",
            "2. Khối lệnh (body)\n"
            + "Là tập hợp các câu lệnh được thực thi khi điều kiện đúng\n"
            + "\n"
            + "Được bao bởi cặp ngoặc nhọn {}\n"
            + "\n"
            + "Nếu chỉ có 1 câu lệnh, có thể bỏ qua ngoặc nhọn nhưng không khuyến khích",
            "3. Đặc điểm quan trọng\n"
            + "Vòng lặp while kiểm tra điều kiện trước khi thực hiện khối lệnh\n"
            + "\n"
            + "Có thể không thực hiện lần nào nếu điều kiện sai ngay từ đầu\n"
            + "\n"
            + "Cần có cơ chế thay đổi điều kiện trong khối lệnh để tránh lặp vô hạn",
            "Ví dụ 1: In các số từ 1 đến 5",
            "Kết quả: 1 2 3 4 5",
            "Ví dụ 2: Tính tổng các số từ 1 đến n",
            "Ví dụ 3: Vòng lặp while vô hạn (cần phải tránh)",
            "Ví dụ 4: Đọc dữ liệu đến khi gặp điều kiện dừng",
            "Luôn đảm bảo điều kiện sẽ sai tại một thời điểm để tránh lặp vô hạn\n"
            + "\n"
            + "Khởi tạo biến điều kiện trước khi vào vòng lặp\n"
            + "\n"
            + "Có cơ chế thay đổi biến điều kiện trong thân vòng lặp\n"
            + "\n"
            + "Sử dụng break để thoát vòng lặp khi cần thiết\n"
            + "\n"
            + "Có thể sử dụng continue để bỏ qua phần còn lại của vòng lặp và kiểm tra điều kiện lại"
        });

        Content_MAP.put("Vòng lặp do-while", new String[]{
            "Vòng lặp do-while là một cấu trúc điều khiển trong ngôn ngữ C cho phép thực hiện một khối lệnh lặp đi lặp lại cho đến khi một điều kiện nhất định không còn đúng nữa. Điểm khác biệt chính giữa do-while và while là do-while đảm bảo khối lệnh được thực hiện ít nhất một lần, ngay cả khi điều kiện ban đầu là sai.",
            "1. Từ khóa do\n"
            + "Đánh dấu điểm bắt đầu của vòng lặp\n"
            + "\n"
            + "Bắt buộc phải có để xác định đây là vòng lặp do-while\n"
            + "\n"
            + "Theo sau bởi một khối lệnh trong cặp dấu ngoặc nhọn {}",
            "2. Khối lệnh\n"
            + "Chứa các câu lệnh sẽ được thực thi trong mỗi lần lặp\n"
            + "\n"
            + "Có thể chứa một hoặc nhiều câu lệnh\n"
            + "\n"
            + "Được thực thi ít nhất một lần, ngay cả khi điều kiện là false",
            "3. Từ khóa while và điều kiện\n"
            + "Điều kiện được kiểm tra sau mỗi lần thực thi khối lệnh\n"
            + "\n"
            + "Nếu điều kiện trả về true (khác 0), vòng lặp tiếp tục\n"
            + "\n"
            + "Nếu điều kiện trả về false (0), vòng lặp kết thúc\n"
            + "\n"
            + "Điều kiện phải được đặt trong cặp dấu ngoặc đơn ()\n"
            + "\n"
            + "Kết thúc bằng dấu chấm phẩy ; (khác với vòng lặp while thông thường)",
            "Ví dụ 1: In các số từ 1 đến 5",
            "Kết quả: 1 2 3 4 5",
            "Ví dụ 2: Nhập số dương từ người dùng",
            "Giải thích: Chương trình yêu cầu người dùng nhập số cho đến khi nhập một số dương.",
            "Ví dụ 3: Tính tổng các số từ 1 đến n",
            "Vòng lặp do-while luôn thực hiện khối lệnh ít nhất một lần\n"
            + "\n"
            + "Đảm bảo có cơ chế thay đổi điều kiện trong khối lệnh để tránh lặp vô hạn\n"
            + "\n"
            + "Dấu chấm phẩy sau while(điều_kiện) là bắt buộc\n"
            + "\n"
            + "Thích hợp cho các tình huống cần thực hiện trước, kiểm tra sau như menu, nhập dữ liệu"
        });

        Content_MAP.put("Khai báo mảng một chiều", new String[]{
            "Mảng một chiều (1D array) trong C là một cấu trúc dữ liệu lưu trữ một tập hợp các phần tử cùng kiểu dữ liệu theo một dãy liên tiếp trong bộ nhớ. Dưới đây là các phần chi tiết về khai báo mảng một chiều trong C:",
            "Cú pháp cơ bản để khai báo mảng một chiều:",
            "Trong đó:\n"
            + "\n"
            + "kiểu_dữ_liệu: Kiểu dữ liệu của các phần tử trong mảng (int, float, char,...)\n"
            + "\n"
            + "tên_mảng: Tên biến của mảng, tuân theo quy tắc đặt tên biến trong C\n"
            + "\n"
            + "kích_thước: Số lượng phần tử tối đa mảng có thể chứa (phải là hằng số nguyên)",
            "Có 2 cách khởi tạo mảng:",
            "a. Khai báo trước, khởi tạo sau",
            "b. Khai báo và khởi tạo cùng lúc",
            "Phần tử mảng được truy cập thông qua chỉ số (index) bắt đầu từ 0:",
            "Có thể xác định kích thước mảng (số phần tử) bằng toán tử sizeof:",
            "Chỉ số mảng bắt đầu từ 0 đến (kích_thước - 1)\n"
            + "\n"
            + "Truy cập ngoài phạm vi mảng sẽ gây lỗi không xác định\n"
            + "\n"
            + "Kích thước mảng phải là hằng số tại thời điểm biên dịch (trừ khi dùng malloc)\n"
            + "\n"
            + "Mảng không kiểm tra giới hạn tự động\n"
            + "\n"
            + "Tên mảng là con trỏ hằng trỏ đến phần tử đầu tiên"
        });

        Content_MAP.put("Truy cập và thao tác với phần tử trong mảng", new String[]{
            "Mảng là một tập hợp các phần tử có cùng kiểu dữ liệu được lưu trữ liên tiếp trong bộ nhớ. Mỗi phần tử trong mảng được truy cập thông qua chỉ số (index).",
            "Các phần tử mảng được truy cập thông qua chỉ số, bắt đầu từ 0.",
            "Lưu ý: Trong C, khi truyền mảng vào hàm, thực chất là truyền địa chỉ của phần tử đầu tiên, do đó hàm có thể thay đổi giá trị của mảng gốc."
        });

        Content_MAP.put("Khai báo mảng hai chiều", new String[]{
            "Mảng 2 chiều trong C là một cấu trúc dữ liệu cho phép lưu trữ dữ liệu dưới dạng bảng (hàng và cột). Dưới đây là giải thích chi tiết về từng phần khi khai báo mảng 2 chiều:",
            "kiểu_dữ_liệu: Xác định kiểu của các phần tử trong mảng (int, float, char,...)\n"
            + "\n"
            + "tên_mảng: Tên biến đại diện cho mảng\n"
            + "\n"
            + "số_hàng: Số lượng hàng trong mảng\n"
            + "\n"
            + "số_cột: Số lượng cột trong mảng",
            "Có 3 cách khởi tạo mảng 2 chiều:",
            "a. Khởi tạo không chỉ định kích thước",
            "b. Khởi tạo chỉ định kích thước",
            "c. Khởi tạo dạng phẳng",
            "Khai báo không khởi tạo:\n"
            + "\n"
            + "int matrix1[3][4]: Tạo mảng 3x4 chưa có giá trị khởi tạo\n"
            + "\n"
            + "Các phần tử sẽ chứa giá trị rác (không xác định)",
            "Khai báo với khởi tạo đầy đủ:\n"
            + "\n"
            + "Mỗi hàng được bao bởi cặp ngoặc nhọn {}\n"
            + "\n"
            + "Dễ đọc và kiểm soát cấu trúc dữ liệu",
            "Khai báo không chỉ định số hàng:\n"
            + "\n"
            + "Compiler tự động tính số hàng dựa trên số bộ giá trị khởi tạo\n"
            + "\n"
            + "Phải chỉ định số cột",
            "Khởi tạo dạng phẳng:\n"
            + "\n"
            + "Các giá trị được liệt kê liên tiếp\n"
            + "\n"
            + "Được gán theo thứ tự từ trái sang phải, từ trên xuống dưới",
            "Truy xuất phần tử:\n"
            + "\n"
            + "Sử dụng cú pháp tên_mảng[chỉ_số_hàng][chỉ_số_cột]\n"
            + "\n"
            + "Chỉ số bắt đầu từ 0",
            "Duyệt mảng:\n"
            + "\n"
            + "Sử dụng 2 vòng lặp lồng nhau\n"
            + "\n"
            + "Vòng lặp ngoài duyệt hàng\n"
            + "\n"
            + "Vòng lặp trong duyệt cột",
            "Tất cả mảng trong C có chỉ số bắt đầu từ 0\n"
            + "\n"
            + "Kích thước mảng tĩnh phải là hằng số tại thời điểm biên dịch\n"
            + "\n"
            + "Bộ nhớ của mảng 2 chiều được cấp phát liên tiếp trong bộ nhớ\n"
            + "\n"
            + "Có thể sử dụng con trỏ để truy cập mảng 2 chiều\n"
            + "\n"
            + "Khi truyền mảng 2 chiều vào hàm, phải chỉ định kích thước cột"
        });

        Content_MAP.put("Truy cập và thao tác với phần tử", new String[]{
            "Mảng 2 chiều (ma trận) trong C là một cấu trúc dữ liệu chứa các phần tử được sắp xếp theo hàng và cột. Mỗi phần tử trong mảng được xác định bởi chỉ số hàng và chỉ số cột.",
            "Đặc điểm:\n"
            + "\n"
            + "Có dạng hình chữ nhật (số phần tử các hàng bằng nhau)\n"
            + "\n"
            + "Kích thước được xác định bởi số hàng và số cột\n"
            + "\n"
            + "Phần tử đầu tiên có chỉ số [0][0]",
            "Có 2 cách khai báo mảng 2 chiều:",
            "a. Khai báo tĩnh",
            "b. Khai báo động (sử dụng con trỏ)",
            "Để truy cập phần tử tại hàng i cột j, sử dụng cú pháp:",
            "Ví dụ:",
            "a. Nhập và xuất mảng 2 chiều",
            "b. Tính tổng các phần tử",
            "c. Tìm phần tử lớn nhất/nhỏ nhất",
            "a. Tổng đường chéo chính",
            "b. Chuyển vị ma trận",
            "c. Nhân hai ma trận",
            "Có 2 cách chính để truyền mảng 2 chiều vào hàm:",
            "a. Truyền với kích thước cố định",
            "b. Truyền với kích thước động (sử dụng con trỏ)",
            "Kiểm tra giới hạn mảng: Luôn đảm bảo không truy cập vượt quá kích thước mảng\n"
            + "\n"
            + "Quản lý bộ nhớ: Với mảng động, luôn giải phóng bộ nhớ khi không dùng nữa\n"
            + "\n"
            + "Hiệu suất: Truy cập theo hàng thường nhanh hơn theo cột do cách bố trí bộ nhớ\n"
            + "\n"
            + "Truyền vào hàm: Khi truyền mảng tĩnh vào hàm, cần chỉ rõ kích thước cột\n"
            + "\n"
            + "Khởi tạo giá trị: Luôn khởi tạo giá trị cho mảng trước khi sử dụng"
        });

        Content_MAP.put("Khai báo chuỗi", new String[]{
            "Trong ngôn ngữ C, chuỗi (string) là một mảng các ký tự kết thúc bằng ký tự null ('\\0').",
            "a. Khai báo mảng ký tự",
            "Giải thích:\n"
            + "\n"
            + "char: Kiểu dữ liệu ký tự\n"
            + "\n"
            + "str1: Tên biến mảng\n"
            + "\n"
            + "[10]: Kích thước mảng (chứa tối đa 9 ký tự + 1 ký tự null)\n"
            + "\n"
            + "\"Hello\": Giá trị khởi tạo (tự động thêm '\\0' ở cuối)",
            "b. Khai báo không chỉ định kích thước",
            "Giải thích:\n"
            + "\n"
            + "[]: Kích thước mảng tự động xác định dựa trên chuỗi khởi tạo\n"
            + "\n"
            + "\"World\" có 5 ký tự + 1 ký tự null = 6 phần tử",
            "c. Khai báo con trỏ ký tự",
            "Giải thích:\n"
            + "\n"
            + "*str3: Con trỏ kiểu char\n"
            + "\n"
            + "\"Programming\" là chuỗi hằng được lưu trong segment văn bản (read-only)\n"
            + "\n"
            + "Con trỏ trỏ tới địa chỉ đầu của chuỗi",
            "Giải thích:\n"
            + "\n"
            + "Mảng chưa được khởi tạo, chứa giá trị rác\n"
            + "\n"
            + "Cần gán giá trị trước khi sử dụng",
            "Giải thích:\n"
            + "\n"
            + "Mảng 2 chiều gồm 7 chuỗi\n"
            + "\n"
            + "Mỗi chuỗi có tối đa 9 ký tự + 1 ký tự null",
            "Kết quả chạy chương trình:",
            "Ký tự null: Mọi chuỗi trong C phải kết thúc bằng '\\0'\n"
            + "\n"
            + "Phân biệt:\n"
            + "\n"
            + "char str[] = \"text\": Mảng có thể thay đổi nội dung\n"
            + "\n"
            + "char *str = \"text\": Chuỗi hằng, không thể thay đổi nội dung\n"
            + "\n"
            + "Kích thước: Luôn khai báo đủ lớn để chứa cả ký tự null\n"
            + "\n"
            + "Thư viện: Sử dụng #include <string.h> cho các hàm xử lý chuỗi"
        });

        Content_MAP.put("Các hàm xử lý chuỗi", new String[]{
            "Ngôn ngữ C cung cấp nhiều hàm để xử lý chuỗi (mảng ký tự kết thúc bằng '\\0') thông qua thư viện <string.h>.",
            "a. strlen() - Độ dài chuỗi\n"
            + "Mô tả: Tính độ dài của chuỗi (không bao gồm ký tự kết thúc '\\0').",
            "b. strcpy() - Sao chép chuỗi\n"
            + "Mô tả: Sao chép nội dung từ chuỗi nguồn sang chuỗi đích.",
            "c. strcat() - Nối chuỗi\n"
            + "Mô tả: Nối chuỗi nguồn vào cuối chuỗi đích.",
            "a. strcmp() - So sánh chuỗi\n"
            + "Mô tả: So sánh hai chuỗi theo thứ tự từ điển.",
            "b. strncmp() - So sánh n ký tự đầu\n"
            + "Mô tả: So sánh n ký tự đầu tiên của hai chuỗi.",
            "a. strchr() - Tìm ký tự trong chuỗi\n"
            + "Mô tả: Tìm vị trí đầu tiên của ký tự trong chuỗi.",
            "b. strstr() - Tìm chuỗi con\n"
            + "Mô tả: Tìm vị trí đầu tiên của chuỗi con trong chuỗi.",
            "a. strtok() - Tách chuỗi\n"
            + "Mô tả: Tách chuỗi thành các token dựa trên delimiter.",
            "b. strrev() - Đảo ngược chuỗi\n"
            + "Lưu ý: Không phải là hàm chuẩn trong thư viện C, nhưng có trong một số trình biên dịch.",
            "c. strlwr() và strupr() - Chuyển đổi chữ hoa/thường\n"
            + "Lưu ý: Không phải là hàm chuẩn trong ANSI C, nhưng có trong nhiều trình biên dịch.",
            "a. strcpy_s() - Sao chép chuỗi an toàn\n"
            + "Mô tả: Phiên bản an toàn của strcpy với kiểm tra kích thước buffer.",
            "b. strcat_s() - Nối chuỗi an toàn\n"
            + "Mô tả: Phiên bản an toàn của strcat.",
            "Các hàm xử lý chuỗi trong C cung cấp nhiều tiện ích cho việc thao tác với dữ liệu văn bản. Khi sử dụng cần lưu ý:\n"
            + "\n"
            + "Luôn đảm bảo chuỗi đích có đủ không gian\n"
            + "\n"
            + "Kiểm tra giá trị NULL khi làm việc với con trỏ\n"
            + "\n"
            + "Ưu tiên sử dụng các hàm an toàn (_s) khi có thể\n"
            + "\n"
            + "Nhớ include thư viện <string.h>"
        });

        Content_MAP.put("So sánh và nối chuỗi", new String[]{
            "Trong ngôn ngữ C, không thể so sánh chuỗi trực tiếp bằng các toán tử so sánh (==, !=, >, <) vì chúng chỉ so sánh địa chỉ của chuỗi chứ không phải nội dung. Để so sánh nội dung chuỗi, ta sử dụng hàm strcmp() từ thư viện string.h.",
            "Hàm strcmp() có nguyên mẫu:",
            "Giá trị trả về:\n"
            + "\n"
            + "0 nếu hai chuỗi bằng nhau\n"
            + "\n"
            + "<0 nếu str1 nhỏ hơn str2 (theo thứ tự từ điển)\n"
            + "\n"
            + "0 nếu str1 lớn hơn str2 (theo thứ tự từ điển)",
            "Code mẫu:",
            "Nội dung:\n"
            + "Để nối chuỗi trong C, ta sử dụng hàm strcat() từ thư viện string.h. Hàm này sẽ nối chuỗi nguồn vào cuối chuỗi đích.\n"
            + "\n"
            + "Hàm strcat() có nguyên mẫu:",
            "Lưu ý:\n"
            + "\n"
            + "Chuỗi đích phải có đủ không gian để chứa cả nội dung ban đầu và chuỗi được nối thêm\n"
            + "\n"
            + "Chuỗi đích phải là mảng ký tự hoặc con trỏ trỏ tới vùng nhớ đủ lớn, không thể là chuỗi hằng",
            "Code mẫu:",
            "Nội dung:\n"
            + "Ngoài strcmp() và strcat(), thư viện string.h còn cung cấp nhiều hàm hữu ích khác cho việc xử lý chuỗi:\n"
            + "\n"
            + "strncmp(): So sánh n ký tự đầu tiên của 2 chuỗi\n"
            + "\n"
            + "strncat(): Nối n ký tự đầu tiên của chuỗi nguồn vào chuỗi đích\n"
            + "\n"
            + "strcpy(): Sao chép chuỗi\n"
            + "\n"
            + "strlen(): Lấy độ dài chuỗi",
            "Code mẫu:",
            "Lưu ý khi làm việc với chuỗi trong C:\n"
            + "\n"
            + "Luôn đảm bảo đủ bộ nhớ cho các thao tác\n"
            + "\n"
            + "Các hàm xử lý chuỗi trong C không tự động kiểm tra giới hạn bộ nhớ\n"
            + "\n"
            + "Kết thúc chuỗi phải có ký tự '\\0'"
        });

        Content_MAP.put("Khái niệm về con trỏ", new String[]{
            "Con trỏ là một trong những khái niệm quan trọng và mạnh mẽ nhất trong ngôn ngữ C. Nó cho phép bạn làm việc trực tiếp với bộ nhớ của máy tính.",
            "Con trỏ là một biến đặc biệt dùng để lưu trữ địa chỉ của một biến khác trong bộ nhớ. Thay vì lưu trữ giá trị dữ liệu trực tiếp, con trỏ lưu trữ vị trí (địa chỉ) nơi dữ liệu được lưu trữ.",
            "Cú pháp khai báo con trỏ:",
            "Ví dụ:",
            "Toán tử địa chỉ (&): Trả về địa chỉ bộ nhớ của một biến\n"
            + "\n"
            + "Toán tử dereference (*): Truy cập giá trị tại địa chỉ mà con trỏ đang trỏ đến",
            "Con trỏ và mảng có mối quan hệ chặt chẽ trong C. Tên mảng thực chất là một con trỏ hằng trỏ đến phần tử đầu tiên của mảng.",
            "Con trỏ cho phép truyền địa chỉ của biến vào hàm, cho phép hàm thay đổi giá trị của biến gốc.",
            "Là con trỏ lưu địa chỉ của một con trỏ khác.",
            "Con trỏ NULL là con trỏ không trỏ đến bất kỳ địa chỉ nào. Nó được sử dụng để kiểm tra và tránh truy cập vào vùng nhớ không hợp lệ.",
            "Con trỏ có thể trỏ đến hàm, cho phép gọi hàm thông qua con trỏ.",
            "Con trỏ thường được sử dụng với các hàm cấp phát động như malloc, calloc, realloc và free.",
            "Con trỏ void có thể trỏ đến bất kỳ kiểu dữ liệu nào, nhưng cần ép kiểu trước khi sử dụng.",
            "Con trỏ là công cụ mạnh mẽ nhưng cũng dễ gây lỗi nếu không sử dụng cẩn thận. Hiểu rõ cách hoạt động của con trỏ sẽ giúp bạn viết mã C hiệu quả và linh hoạt hơn."
        });

        Content_MAP.put("Khai báo con trỏ", new String[]{
            "Con trỏ (pointer) là một biến đặc biệt trong C, nó lưu trữ địa chỉ bộ nhớ của một biến khác thay vì giá trị trực tiếp.",
            "1. Kiểu dữ liệu của con trỏ\n"
            + "Xác định kiểu dữ liệu của biến mà con trỏ sẽ trỏ tới\n"
            + "\n"
            + "Ví dụ: int* (con trỏ tới số nguyên), float* (con trỏ tới số thực), char* (con trỏ tới ký tự)",
            "2. Toán tử con trỏ (*)\n"
            + "Dấu hoa thị (*) được sử dụng để khai báo một biến là con trỏ\n"
            + "\n"
            + "Cũng được sử dụng để truy cập giá trị tại địa chỉ mà con trỏ trỏ tới (dereference)",
            "3. Tên con trỏ\n"
            + "Đặt theo quy tắc đặt tên biến trong C\n"
            + "\n"
            + "Thường có tiền tố p hoặc ptr để dễ nhận biết (ví dụ: pNumber, ptrName)",
            "4. Toán tử địa chỉ (&)\n"
            + "Dấu và (&) được sử dụng để lấy địa chỉ của một biến\n"
            + "\n"
            + "Thường dùng khi gán giá trị cho con trỏ",
            "Khai báo biến thông thường: Tạo các biến với các kiểu dữ liệu khác nhau\n"
            + "\n"
            + "Khai báo con trỏ: Sử dụng dấu * để khai báo các con trỏ tương ứng\n"
            + "\n"
            + "Gán địa chỉ: Sử dụng toán tử & để lấy địa chỉ của biến và gán cho con trỏ\n"
            + "\n"
            + "In giá trị: Minh họa cách truy cập giá trị trực tiếp và thông qua con trỏ\n"
            + "\n"
            + "Thay đổi giá trị: Cho thấy có thể thay đổi giá trị biến gốc thông qua con trỏ\n"
            + "\n"
            + "Con trỏ NULL: Minh họa con trỏ không trỏ tới địa chỉ hợp lệ"
        });

        Content_MAP.put("Toán tử con trỏ", new String[]{
            "Nội dung: Toán tử địa chỉ (&) trả về địa chỉ bộ nhớ của một biến.\n"
            + "\n"
            + "Được sử dụng để lấy địa chỉ của biến trong bộ nhớ\n"
            + "\n"
            + "Kết quả trả về là một con trỏ trỏ tới biến đó\n"
            + "\n"
            + "Không thể áp dụng cho hằng số hoặc biểu thức",
            "Nội dung: Toán tử dereference (*) truy cập giá trị tại địa chỉ mà con trỏ đang trỏ tới.\n"
            + "\n"
            + "Còn được gọi là toán tử \"gián tiếp\"\n"
            + "\n"
            + "Cho phép đọc hoặc ghi giá trị tại vị trí con trỏ trỏ tới\n"
            + "\n"
            + "Nếu con trỏ chưa được khởi tạo, việc dereference có thể gây lỗi",
            "Nội dung: Gán địa chỉ cho con trỏ.\n"
            + "\n"
            + "Con trỏ phải được khai báo cùng kiểu với biến mà nó trỏ tới\n"
            + "\n"
            + "Có thể gán giá trị NULL cho con trỏ để biểu thị nó không trỏ đến đâu\n"
            + "\n"
            + "Có thể gán giữa các con trỏ cùng kiểu",
            "Nội dung: Các phép toán số học trên con trỏ bao gồm cộng, trừ, tăng, giảm.\n"
            + "\n"
            + "Khi thực hiện phép toán, kích thước kiểu dữ liệu được tự động tính toán\n"
            + "\n"
            + "Chỉ có ý nghĩa khi con trỏ trỏ tới phần tử của mảng\n"
            + "\n"
            + "Bao gồm: ++, --, +, -, +=, -=",
            "Nội dung: So sánh giữa các con trỏ.\n"
            + "\n"
            + "Có thể so sánh bằng (==), không bằng (!=), lớn hơn (>), nhỏ hơn (<)\n"
            + "\n"
            + "Chỉ có ý nghĩa khi các con trỏ cùng trỏ tới các phần tử của cùng một mảng\n"
            + "\n"
            + "Con trỏ NULL có thể so sánh với bất kỳ con trỏ nào",
            "Nội dung: Sử dụng toán tử * nhiều lần để truy cập các cấp con trỏ lồng nhau.\n"
            + "\n"
            + "Mỗi dấu * tương ứng với một cấp dereference\n"
            + "\n"
            + "Thường dùng cho mảng 2 chiều hoặc khi cần thay đổi con trỏ trong hàm",
            "Nội dung: Toán tử -> dùng để truy cập thành phần của cấu trúc thông qua con trỏ.\n"
            + "\n"
            + "Là cách viết tắt của (*ptr).member\n"
            + "\n"
            + "Chỉ dùng với con trỏ trỏ tới cấu trúc\n"
            + "\n"
            + "Giúp code ngắn gọn và dễ đọc hơn"
        });

        Content_MAP.put("Cú pháp định nghĩa hàm", new String[]{
            "Xác định kiểu dữ liệu mà hàm sẽ trả về sau khi thực thi\n"
            + "\n"
            + "Nếu hàm không trả về giá trị nào, sử dụng void",
            "Định danh duy nhất cho hàm\n"
            + "\n"
            + "Theo quy tắc đặt tên trong C (bắt đầu bằng chữ hoặc _, không chứa khoảng trắng)",
            "Danh sách các biến đầu vào, đặt trong cặp ngoặc đơn\n"
            + "\n"
            + "Mỗi tham số gồm kiểu dữ liệu và tên biến\n"
            + "\n"
            + "Có thể để trống nếu hàm không nhận tham số",
            "Khối lệnh được đặt trong cặp ngoặc nhọn {}\n"
            + "\n"
            + "Chứa các câu lệnh thực thi\n"
            + "\n"
            + "Có thể có câu lệnh return để trả về giá trị (nếu hàm có kiểu trả về khác void)",
            "Giải thích ví dụ:\n"
            + "\n"
            + "Hàm sum():\n"
            + "\n"
            + "Kiểu trả về: int\n"
            + "\n"
            + "Tên hàm: sum\n"
            + "\n"
            + "Tham số: 2 tham số kiểu int là a và b\n"
            + "\n"
            + "Thân hàm: tính tổng a + b và trả về kết quả\n"
            + "\n"
            + "Hàm printHello():\n"
            + "\n"
            + "Kiểu trả về: void (không trả về giá trị)\n"
            + "\n"
            + "Tên hàm: printHello\n"
            + "\n"
            + "Không có tham số\n"
            + "\n"
            + "Thân hàm: in ra chuỗi \"Hello World!\"\n"
            + "\n"
            + "Hàm main() là hàm đặc biệt, điểm bắt đầu chương trình"
        });

        Content_MAP.put("Gọi hàm", new String[]{
            "1. Tên hàm\n"
            + "Là định danh của hàm được gọi\n"
            + "\n"
            + "Phải khớp chính xác với tên hàm đã được định nghĩa\n"
            + "\n"
            + "Phân biệt chữ hoa chữ thường trong C",
            "2. Danh sách đối số (arguments)\n"
            + "Các giá trị được truyền vào hàm\n"
            + "\n"
            + "Được đặt trong cặp dấu ngoặc đơn ()\n"
            + "\n"
            + "Các đối số cách nhau bởi dấu phẩy\n"
            + "\n"
            + "Kiểu dữ liệu của đối số phải khớp với tham số trong khai báo hàm",
            "3. Dấu chấm phẩy kết thúc\n"
            + "Mọi lời gọi hàm trong C phải kết thúc bằng dấu chấm phẩy (;)",
            "Khai báo hàm:\n"
            + "\n"
            + "int tinhTong(int a, int b) là khai báo hàm có kiểu trả về int, tên hàm tinhTong, nhận 2 tham số int\n"
            + "\n"
            + "Gọi hàm:\n"
            + "\n"
            + "tinhTong(5, 3) là lời gọi hàm với:\n"
            + "\n"
            + "Tên hàm: tinhTong\n"
            + "\n"
            + "Đối số: 5 và 3\n"
            + "\n"
            + "Kết quả được gán cho biến ketQua\n"
            + "\n"
            + "Hàm không có tham số:\n"
            + "\n"
            + "inThongBao() là lời gọi hàm không cần đối số\n"
            + "\n"
            + "Gọi hàm trong biểu thức:\n"
            + "\n"
            + "tinhTong(10, 20) được gọi trực tiếp trong lệnh printf\n"
            + "\n"
            + "Hàm thư viện:\n"
            + "\n"
            + "printf() là hàm từ thư viện chuẩn, được gọi với các đối số khác nhau"
        });

        Content_MAP.put("Hàm trả về giá trị", new String[]{
            "1. Kiểu trả về (Return type)\n"
            + "Là kiểu dữ liệu của giá trị mà hàm sẽ trả về\n"
            + "\n"
            + "Có thể là bất kỳ kiểu dữ liệu nào: int, float, char, double, con trỏ hoặc thậm chí kiểu void*\n"
            + "\n"
            + "Được khai báo ngay trước tên hàm",
            "2. Tên hàm (Function name)\n"
            + "Là định danh của hàm, tuân theo quy tắc đặt tên trong C\n"
            + "\n"
            + "Nên đặt tên có ý nghĩa, phản ánh chức năng của hàm",
            "3. Tham số (Parameters)\n"
            + "Danh sách các tham số đầu vào (nếu có) được đặt trong cặp ngoặc đơn\n"
            + "\n"
            + "Mỗi tham số gồm kiểu dữ liệu và tên tham số\n"
            + "\n"
            + "Các tham số cách nhau bằng dấu phẩy",
            "4. Thân hàm (Function body)\n"
            + "Chứa các câu lệnh thực hiện chức năng của hàm\n"
            + "\n"
            + "Được bao bọc bởi cặp ngoặc nhọn {}\n"
            + "\n"
            + "Phải có ít nhất một câu lệnh return để trả về giá trị",
            "5. Câu lệnh return\n"
            + "Dùng để trả về giá trị từ hàm\n"
            + "\n"
            + "Giá trị sau return phải cùng kiểu hoặc có thể chuyển đổi ngầm định về kiểu trả về của hàm\n"
            + "\n"
            + "Khi gặp return, hàm sẽ kết thúc ngay lập tức",
            "Hàm tinhTong:\n"
            + "\n"
            + "Kiểu trả về: int\n"
            + "\n"
            + "Tham số: 2 số nguyên a và b\n"
            + "\n"
            + "Thân hàm: tính tổng 2 số và lưu vào biến tong\n"
            + "\n"
            + "Return: trả về giá trị tong\n"
            + "\n"
            + "Hàm laSoChan:\n"
            + "\n"
            + "Kiểu trả về: int (0 hoặc 1 như kiểu boolean)\n"
            + "\n"
            + "Tham số: 1 số nguyên num\n"
            + "\n"
            + "Thân hàm: kiểm tra số chẵn bằng phép chia dư\n"
            + "\n"
            + "Return: có 2 điểm return tùy điều kiện\n"
            + "\n"
            + "Hàm timMax:\n"
            + "\n"
            + "Kiểu trả về: float\n"
            + "\n"
            + "Tham số: 3 số thực x, y, z\n"
            + "\n"
            + "Thân hàm: tìm số lớn nhất bằng cách so sánh\n"
            + "\n"
            + "Return: trả về giá trị lớn nhất tìm được"
        });

        Content_MAP.put("Truyền tham số theo giá trị", new String[]{
            "Truyền tham số theo giá trị (pass by value) là cách truyền tham số phổ biến trong ngôn ngữ C, trong đó giá trị của biến được sao chép vào tham số của hàm. Khi hàm được gọi, nó làm việc với bản sao của giá trị chứ không phải với biến gốc, do đó mọi thay đổi trên tham số trong hàm sẽ không ảnh hưởng đến biến gốc.",
            "Tạo bản sao: Giá trị của biến được sao chép vào tham số hàm\n"
            + "\n"
            + "Độc lập bộ nhớ: Tham số hàm và biến gốc có vùng nhớ riêng biệt\n"
            + "\n"
            + "Không ảnh hưởng: Thay đổi tham số trong hàm không làm thay đổi biến gốc\n"
            + "\n"
            + "Hiệu quả với kiểu dữ liệu nhỏ: Phù hợp cho các kiểu dữ liệu đơn giản như int, float, char...",
            "Giá trị của x và y được sao chép vào a và b trong hàm swapByValue\n"
            + "\n"
            + "Hàm swapByValue hoán đổi giá trị của a và b thành công (in ra 10 và 5)\n"
            + "\n"
            + "Tuy nhiên, giá trị gốc của x và y trong hàm main không bị thay đổi\n"
            + "\n"
            + "Điều này chứng tỏ hàm làm việc với bản sao của giá trị chứ không phải biến gốc",
            "Ưu điểm:\n"
            + "\n"
            + "Đơn giản, dễ hiểu\n"
            + "\n"
            + "Đảm bảo giá trị biến gốc không bị thay đổi ngoài ý muốn\n"
            + "\n"
            + "Phù hợp khi chỉ cần sử dụng giá trị mà không cần thay đổi biến gốc",
            "Nhược điểm:\n"
            + "\n"
            + "Tốn bộ nhớ khi làm việc với kiểu dữ liệu lớn do phải sao chép toàn bộ giá trị\n"
            + "\n"
            + "Không thể thay đổi giá trị biến gốc từ bên trong hàm\n"
            + "\n"
            + "Không phù hợp khi cần trả về nhiều giá trị sau khi xử lý"
        });

        Content_MAP.put("Truyền tham số theo tham chiếu", new String[]{
            "Truyền tham số theo tham chiếu (pass by reference) là phương pháp truyền địa chỉ của biến vào hàm thay vì giá trị của biến. Khi đó, hàm có thể thay đổi trực tiếp giá trị của biến gốc thông qua địa chỉ này.\n"
            + "\n"
            + "Trong C, không có khái niệm tham chiếu như C++, nhưng chúng ta có thể mô phỏng bằng cách sử dụng con trỏ (pointer).",
            "Truyền địa chỉ của biến vào hàm\n"
            + "\n"
            + "Hàm có thể thay đổi giá trị của biến gốc\n"
            + "\n"
            + "Tiết kiệm bộ nhớ khi làm việc với cấu trúc dữ liệu lớn\n"
            + "\n"
            + "Thường dùng khi cần thay đổi nhiều giá trị hoặc làm việc với mảng, chuỗi",
            "Đặc điểm	Truyền tham trị	Truyền tham chiếu (dùng con trỏ)\n"
            + "Truyền vào hàm	Giá trị của biến	Địa chỉ của biến\n"
            + "Thay đổi giá trị	Không ảnh hưởng biến gốc	Ảnh hưởng trực tiếp biến gốc\n"
            + "Bộ nhớ	Tạo bản sao	Chỉ truyền địa chỉ\n"
            + "Hiệu suất	Kém hơn với dữ liệu lớn	Tốt hơn với dữ liệu lớn",
            "Ví dụ 1: Hoán đổi 2 số",
            "Ví dụ 2: Thay đổi giá trị biến",
            "Ví dụ 3: Làm việc với mảng",
            "Truyền tham số theo tham chiếu trong C được thực hiện thông qua con trỏ, cho phép hàm thay đổi giá trị của biến gốc. Phương pháp này đặc biệt hữu ích khi:\n"
            + "\n"
            + "Cần thay đổi nhiều giá trị trong hàm\n"
            + "\n"
            + "Làm việc với dữ liệu lớn để tránh sao chép\n"
            + "\n"
            + "Thao tác với mảng và chuỗi\n"
            + "\n"
            + "Cần trả về nhiều giá trị từ hàm"
        });

        Content_MAP.put("Sử dụng con trỏ để truyền tham số", new String[]{
            "Truyền tham số bằng con trỏ trong C là phương pháp truyền địa chỉ của biến thay vì giá trị của biến vào hàm. Điều này cho phép hàm có thể thay đổi trực tiếp giá trị của biến gốc.",
            "Ưu điểm:\n"
            + "\n"
            + "Cho phép hàm thay đổi giá trị của biến gốc\n"
            + "\n"
            + "Tiết kiệm bộ nhớ khi làm việc với cấu trúc dữ liệu lớn\n"
            + "\n"
            + "Cho phép trả về nhiều giá trị thông qua tham số",
            "Khi truyền tham số bằng con trỏ:\n"
            + "\n"
            + "Hàm gọi truyền địa chỉ của biến (sử dụng toán tử &)\n"
            + "\n"
            + "Hàm nhận nhận tham số là con trỏ (khai báo với *)\n"
            + "\n"
            + "Hàm nhận có thể truy cập và thay đổi giá trị tại địa chỉ đó",
            "Ví dụ 1: Hàm hoán đổi giá trị",
            "Ví dụ 2: Thay đổi giá trị biến gốc",
            "Ví dụ 3: Làm việc với mảng",
            "Luôn kiểm tra con trỏ NULL trước khi sử dụng\n"
            + "\n"
            + "Cẩn thận với con trỏ \"dangling\" (trỏ đến vùng nhớ không hợp lệ)\n"
            + "\n"
            + "Sử dụng const với con trỏ khi không muốn thay đổi giá trị\n"
            + "\n"
            + "Phân biệt rõ giữa truyền giá trị và truyền tham chiếu (con trỏ)",
            "Sử dụng const để đảm bảo hàm không thay đổi giá trị:",
            "Truyền tham số bằng con trỏ là một kỹ thuật mạnh mẽ trong C, giúp tối ưu hiệu suất và linh hoạt trong việc thao tác với dữ liệu."
        });

        Content_MAP.put("Khái niệm hàm đệ quy", new String[]{
            "Hàm đệ quy (recursive function) trong ngôn ngữ C là hàm có khả năng gọi lại chính nó trong thân hàm. Mỗi lần gọi đệ quy, hàm sẽ giải quyết một phần nhỏ của vấn đề, sau đó tiếp tục gọi chính nó để giải quyết phần còn lại cho đến khi đạt được điều kiện dừng.",
            "Đặc điểm chính:\n"
            + "\n"
            + "Hàm tự gọi chính nó\n"
            + "\n"
            + "Phải có điều kiện dừng (base case)\n"
            + "\n"
            + "Mỗi lần gọi đệ quy phải tiến gần hơn đến điều kiện dừng",
            "a. Điều kiện dừng (Base case)\n"
            + "Là điều kiện để kết thúc quá trình đệ quy, ngăn chặn việc gọi hàm vô hạn. Nếu không có điều kiện dừng, chương trình sẽ bị tràn bộ nhớ stack (stack overflow).",
            "b. Phần đệ quy (Recursive case)\n"
            + "Là phần mà hàm gọi lại chính nó với tham số thay đổi, thường là tiến gần hơn đến điều kiện dừng.",
            "Ưu điểm:\n"
            + "Giúp code ngắn gọn, dễ đọc, dễ hiểu với các bài toán có tính chất đệ quy\n"
            + "\n"
            + "Phù hợp giải quyết các vấn đề như: duyệt cây, phân chia bài toán (divide and conquer), quay lui (backtracking)",
            "Nhược điểm:\n"
            + "Tốn bộ nhớ do phải lưu trữ các lần gọi hàm trong stack\n"
            + "\n"
            + "Có thể chậm hơn cách giải bằng vòng lặp do overhead của việc gọi hàm\n"
            + "\n"
            + "Dễ gây stack overflow nếu đệ quy quá sâu",
            "a. Đệ quy trực tiếp (Direct recursion)\n"
            + "Hàm gọi trực tiếp chính nó.",
            "b. Đệ quy gián tiếp (Indirect recursion)\n"
            + "Hàm A gọi hàm B, hàm B lại gọi hàm A, tạo thành vòng đệ quy.",
            "c. Đệ quy đuôi (Tail recursion)\n"
            + "Là trường hợp đặc biệt khi lời gọi đệ quy là thao tác cuối cùng của hàm. Có thể được tối ưu bởi trình biên dịch.",
            "a. Tính giai thừa (đệ quy trực tiếp)",
            "b. Dãy Fibonacci (đệ quy nhị phân)",
            "c. Đệ quy đuôi (tính tổng các số từ 1 đến n)",
            "d. Đệ quy gián tiếp (ví dụ kiểm tra số chẵn/lẻ)",
            "Luôn đảm bảo có điều kiện dừng hợp lý\n"
            + "\n"
            + "Đảm bảo mỗi lần gọi đệ quy tiến gần đến điều kiện dừng\n"
            + "\n"
            + "Hạn chế sử dụng đệ quy với bài toán có độ phức tạp lớn\n"
            + "\n"
            + "Cân nhắc sử dụng vòng lặp thay thế nếu có thể\n"
            + "\n"
            + "Chú ý đến giới hạn stack của chương trình"
        });

        Content_MAP.put("Cách hoạt động của hàm đệ quy", new String[]{
            "Đệ quy là một kỹ thuật lập trình trong đó một hàm gọi lại chính nó để giải quyết vấn đề. Một hàm đệ quy cần có:\n"
            + "\n"
            + "Điều kiện dừng (base case): Điểm dừng của đệ quy\n"
            + "\n"
            + "Phần đệ quy (recursive case): Phần gọi lại chính hàm đó với tham số thay đổi",
            "Khi một hàm đệ quy được gọi:\n"
            + "\n"
            + "Hàm kiểm tra điều kiện dừng\n"
            + "\n"
            + "Nếu chưa thỏa điều kiện dừng, hàm gọi lại chính nó với tham số mới\n"
            + "\n"
            + "Quá trình này lặp lại cho đến khi đạt điều kiện dừng\n"
            + "\n"
            + "Các lời gọi hàm được giải quyết theo thứ tự ngược lại (từ cuối về đầu)",
            "Ưu điểm:\n"
            + "\n"
            + "Code ngắn gọn, dễ hiểu cho các bài toán có tính chất đệ quy\n"
            + "\n"
            + "Dễ dàng biểu diễn các giải thuật chia để trị",
            "Nhược điểm:\n"
            + "\n"
            + "Tốn bộ nhớ do phải lưu trữ nhiều ngăn xếp (stack frames)\n"
            + "\n"
            + "Có thể gây tràn bộ nhớ stack (stack overflow) nếu đệ quy quá sâu\n"
            + "\n"
            + "Hiệu suất thường kém hơn vòng lặp",
            "a. Tính giai thừa",
            "b. Dãy Fibonacci",
            "c. Đệ quy đuôi (Tail recursion)",
            "Luôn xác định rõ điều kiện dừng\n"
            + "\n"
            + "Đảm bảo các lời gọi đệ quy tiến dần về điều kiện dừng\n"
            + "\n"
            + "Hạn chế sử dụng đệ quy cho các bài toán có độ phức tạp lớn\n"
            + "\n"
            + "Cân nhắc sử dụng vòng lặp thay thế khi có thể\n"
            + "\n"
            + "Đối với đệ quy đuôi, một số trình biên dịch có thể tối ưu thành vòng lặp"
        });

        Content_MAP.put("Ví dụ về hàm đệ quy", new String[]{
            "Dưới đây là ví dụ về hàm đệ quy tính giai thừa trong C:",
            "Điều kiện dừng: Khi n = 0 hoặc n = 1, hàm trả về 1 vì 0! và 1! đều bằng 1",
            "Phần đệ quy: Với n > 1, hàm trả về n * factorial(n-1), tức là nó gọi lại chính nó với giá trị nhỏ hơn",
            "Quá trình thực thi:\n"
            + "\n"
            + "factorial(5) = 5 * factorial(4)\n"
            + "\n"
            + "factorial(4) = 4 * factorial(3)\n"
            + "\n"
            + "factorial(3) = 3 * factorial(2)\n"
            + "\n"
            + "factorial(2) = 2 * factorial(1)\n"
            + "\n"
            + "factorial(1) = 1 (điều kiện dừng)",
            "Ưu điểm:\n"
            + "\n"
            + "Code ngắn gọn, dễ hiểu\n"
            + "\n"
            + "Phù hợp với các bài toán có tính chất đệ quy tự nhiên",
            "Nhược điểm:\n"
            + "\n"
            + "Tốn bộ nhớ stack do mỗi lần gọi đệ quy cần lưu trữ thông tin\n"
            + "\n"
            + "Có thể gây tràn stack với đầu vào lớn\n"
            + "\n"
            + "Hiệu suất thường kém hơn vòng lặp"
        });

        Content_MAP.put("Cấu trúc dữ liệu cơ bản", new String[]{
            "Mảng là tập hợp các phần tử có cùng kiểu dữ liệu, được lưu trữ liên tiếp trong bộ nhớ.",
            "Đặc điểm:\n"
            + "\n"
            + "Kích thước cố định khi khai báo\n"
            + "\n"
            + "Truy cập phần tử qua chỉ số\n"
            + "\n"
            + "Hiệu quả khi cần truy cập ngẫu nhiên",
            "Code mẫu:",
            "Trong C, chuỗi là mảng các ký tự kết thúc bằng ký tự null ('\\0').",
            "Đặc điểm:\n"
            + "\n"
            + "Là mảng một chiều của các ký tự\n"
            + "\n"
            + "Kết thúc bằng ký tự null\n"
            + "\n"
            + "Có thể khởi tạo bằng chuỗi ký tự trong dấu nháy kép",
            "Code mẫu:",
            "Struct cho phép nhóm các biến có kiểu dữ liệu khác nhau dưới một tên duy nhất.",
            "Đặc điểm:\n"
            + "\n"
            + "Có thể chứa nhiều kiểu dữ liệu khác nhau\n"
            + "\n"
            + "Tương tự như class nhưng không có phương thức\n"
            + "\n"
            + "Kích thước bằng tổng kích thước các thành viên (có thể có padding)",
            "Code mẫu:",
            "Union cho phép lưu trữ nhiều kiểu dữ liệu khác nhau trong cùng một vùng nhớ.",
            "Đặc điểm:\n"
            + "\n"
            + "Chỉ lưu trữ một thành viên tại một thời điểm\n"
            + "\n"
            + "Kích thước bằng kích thước của thành viên lớn nhất\n"
            + "\n"
            + "Tiết kiệm bộ nhớ khi chỉ cần một trong các kiểu dữ liệu",
            "Code mẫu:",
            "Enum là kiểu dữ liệu cho phép định nghĩa một tập hợp các hằng số có tên.",
            "Đặc điểm:\n"
            + "\n"
            + "Giúp code dễ đọc và bảo trì hơn\n"
            + "\n"
            + "Mỗi phần tử enum có giá trị nguyên bắt đầu từ 0\n"
            + "\n"
            + "Có thể gán giá trị cụ thể cho các phần tử",
            "Code mẫu:",
            "Con trỏ là biến lưu trữ địa chỉ bộ nhớ của biến khác.",
            "Đặc điểm:\n"
            + "\n"
            + "Cho phép truy cập và thao tác trực tiếp với bộ nhớ\n"
            + "\n"
            + "Dùng để cấp phát động, truyền tham chiếu, làm việc với mảng\n"
            + "\n"
            + "Có thể có con trỏ trỏ đến con trỏ",
            "Code mẫu:",
            "Danh sách liên kết là cấu trúc dữ liệu động gồm các node liên kết với nhau.",
            "Đặc điểm:\n"
            + "\n"
            + "Kích thước có thể thay đổi trong khi chạy chương trình\n"
            + "\n"
            + "Mỗi node chứa dữ liệu và con trỏ đến node tiếp theo\n"
            + "\n"
            + "Có thể thêm/xóa node mà không cần dịch chuyển các phần tử khác",
            "Code mẫu:"
        });

        Content_MAP.put("File I/O trong C", new String[]{
            "File I/O trong C được thực hiện thông qua các hàm trong thư viện stdio.h. Có hai loại file chính:\n"
            + "\n"
            + "Text files: Chứa dữ liệu văn bản\n"
            + "\n"
            + "Binary files: Chứa dữ liệu nhị phân",
            "a. Mở file - fopen()",
            "Các chế độ mở file (mode):\n"
            + "\n"
            + "\"r\": Mở để đọc (file phải tồn tại)\n"
            + "\n"
            + "\"w\": Mở để ghi (tạo mới hoặc ghi đè)\n"
            + "\n"
            + "\"a\": Mở để ghi tiếp vào cuối file\n"
            + "\n"
            + "\"r+\": Mở để đọc và ghi\n"
            + "\n"
            + "\"w+\": Mở để đọc và ghi (tạo mới hoặc ghi đè)\n"
            + "\n"
            + "\"a+\": Mở để đọc và ghi tiếp vào cuối file\n"
            + "\n"
            + "Thêm \"b\" cho file nhị phân (ví dụ: \"rb\", \"wb\")",
            "Ví dụ:",
            "b. Đóng file - fclose()",
            "Ví dụ:",
            "a. Ghi file\n"
            + "Các hàm ghi file phổ biến:\n"
            + "\n"
            + "fprintf(): Ghi định dạng\n"
            + "\n"
            + "fputs(): Ghi chuỗi\n"
            + "\n"
            + "fputc(): Ghi ký tự",
            "Ví dụ:",
            "b. Đọc file\n"
            + "Các hàm đọc file phổ biến:\n"
            + "\n"
            + "fscanf(): Đọc định dạng\n"
            + "\n"
            + "fgets(): Đọc chuỗi\n"
            + "\n"
            + "fgetc(): Đọc ký tự",
            "Ví dụ:",
            "a. Ghi file nhị phân\n"
            + "Sử dụng fwrite():",
            "Ví dụ:",
            "b. Đọc file nhị phân\n"
            + "Sử dụng fread():",
            "Ví dụ:",
            "fseek(): Di chuyển con trỏ file\n"
            + "\n"
            + "ftell(): Trả về vị trí hiện tại\n"
            + "\n"
            + "rewind(): Đặt con trỏ về đầu file",
            "Ví dụ:",
            "feof(): Kiểm tra end-of-file\n"
            + "\n"
            + "ferror(): Kiểm tra lỗi",
            "Ví dụ:",
            "Chương trình quản lý sinh viên đơn giản:"
        });

        Content_MAP.put("Các hàm file I/O", new String[]{
            "fopen()\n"
            + "Mục đích: Mở một file",
            "filename: Tên file cần mở\n"
            + "\n"
            + "mode: Chế độ mở file:\n"
            + "\n"
            + "\"r\": Đọc (file phải tồn tại)\n"
            + "\n"
            + "\"w\": Ghi (tạo file mới hoặc ghi đè)\n"
            + "\n"
            + "\"a\": Ghi tiếp vào cuối file\n"
            + "\n"
            + "\"r+\": Đọc và ghi (file phải tồn tại)\n"
            + "\n"
            + "\"w+\": Đọc và ghi (tạo file mới hoặc ghi đè)\n"
            + "\n"
            + "\"a+\": Đọc và ghi tiếp vào cuối file",
            "Ví dụ:",
            "fclose()\n"
            + "Mục đích: Đóng file đã mở",
            "Trả về 0 nếu thành công, EOF nếu thất bại",
            "Ví dụ:",
            "fprintf()\n"
            + "Mục đích: Ghi dữ liệu có định dạng vào file (tương tự printf)",
            "Ví dụ:",
            "fputs()\n"
            + "Mục đích: Ghi một chuỗi vào file",
            "Ví dụ:",
            "fputc()\n"
            + "Mục đích: Ghi một ký tự vào file",
            "Ví dụ:",
            "fwrite()\n"
            + "Mục đích: Ghi dữ liệu nhị phân vào file",
            "ptr: Con trỏ tới dữ liệu cần ghi\n"
            + "\n"
            + "size: Kích thước mỗi phần tử\n"
            + "\n"
            + "nmemb: Số lượng phần tử",
            "fscanf()\n"
            + "Mục đích: Đọc dữ liệu có định dạng từ file (tương tự scanf)",
            "Ví dụ:",
            "fgets()\n"
            + "Mục đích: Đọc một dòng từ file",
            "str: Buffer để lưu dữ liệu đọc được\n"
            + "\n"
            + "n: Số ký tự tối đa đọc",
            "Ví dụ:",
            "fgetc()\n"
            + "Mục đích: Đọc một ký tự từ file",
            "Ví dụ:",
            "fread()\n"
            + "Mục đích: Đọc dữ liệu nhị phân từ file",
            "Ví dụ:",
            "feof()\n"
            + "Mục đích: Kiểm tra đã đến cuối file chưa",
            "Trả về giá trị khác 0 nếu đã đến cuối file",
            "Ví dụ:",
            "ferror()\n"
            + "Mục đích: Kiểm tra lỗi khi thao tác với file",
            "Trả về giá trị khác 0 nếu có lỗi",
            "Ví dụ:",
            "fseek()\n"
            + "Mục đích: Di chuyển con trỏ file đến vị trí mong muốn",
            "offset: Số byte di chuyển\n"
            + "\n"
            + "whence: Vị trí bắt đầu:\n"
            + "\n"
            + "SEEK_SET: Đầu file\n"
            + "\n"
            + "SEEK_CUR: Vị trí hiện tại\n"
            + "\n"
            + "SEEK_END: Cuối file",
            "Ví dụ:",
            "ftell()\n"
            + "Mục đích: Lấy vị trí hiện tại của con trỏ file",
            "Ví dụ:",
            "rewind()\n"
            + "Mục đích: Đặt con trỏ file về đầu file",
            "Ví dụ:",
            "Ví dụ hoàn chỉnh"
        });

        Content_MAP.put("", new String[]{});

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

        //C
        Code_MAP.put("C là gì?", new String[]{
            "#include <stdio.h> // Phần tiền xử lý (Preprocessor)\n"
            + "\n"
            + "// Khai báo hàm (Function declaration)\n"
            + "int add(int a, int b);\n"
            + "\n"
            + "// Hàm main - điểm bắt đầu chương trình\n"
            + "int main() {\n"
            + "    // Khai báo biến\n"
            + "    int x = 5, y = 10;\n"
            + "    int result;\n"
            + "    \n"
            + "    // Gọi hàm\n"
            + "    result = add(x, y);\n"
            + "    \n"
            + "    // In kết quả\n"
            + "    printf(\"Tổng là: %d\\n\", result);\n"
            + "    \n"
            + "    return 0; // Kết thúc chương trình\n"
            + "}\n"
            + "\n"
            + "// Định nghĩa hàm\n"
            + "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "int age = 25;\n"
            + "float salary = 2500.50;\n"
            + "char grade = 'A';\n"
            + "double pi = 3.1415926535;",
            "#define PI 3.14159\n"
            + "const int MAX = 100;\n"
            + "\n"
            + "int main() {\n"
            + "    int count = 0;          // Biến\n"
            + "    float radius = 5.5;\n"
            + "    float area = PI * radius * radius;\n"
            + "    \n"
            + "    printf(\"Diện tích: %.2f\\n\", area);\n"
            + "    return 0;\n"
            + "}",
            "int a = 10, b = 20;\n"
            + "int sum = a + b;\n"
            + "int mod = a % 3;\n"
            + "\n"
            + "if (a > 5 && b < 30) {\n"
            + "    a += 5;\n"
            + "}",
            "if (điều_kiện) {\n"
            + "    // code\n"
            + "} else if (điều_kiện) {\n"
            + "    // code\n"
            + "} else {\n"
            + "    // code\n"
            + "}",
            "for (khởi_tạo; điều_kiện; tăng/giảm) {\n"
            + "    // code\n"
            + "}",
            "while (điều_kiện) {\n"
            + "    // code\n"
            + "}",
            "do {\n"
            + "    // code\n"
            + "} while (điều_kiện);",
            "switch (biểu_thức) {\n"
            + "    case giá_trị_1:\n"
            + "        // code\n"
            + "        break;\n"
            + "    case giá_trị_2:\n"
            + "        // code\n"
            + "        break;\n"
            + "    default:\n"
            + "        // code\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // if-else\n"
            + "    int age = 18;\n"
            + "    if (age >= 18) {\n"
            + "        printf(\"Bạn đã trưởng thành\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Bạn chưa trưởng thành\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // for loop\n"
            + "    for (int i = 1; i <= 5; i++) {\n"
            + "        printf(\"%d \", i);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "    \n"
            + "    // switch\n"
            + "    char grade = 'B';\n"
            + "    switch (grade) {\n"
            + "        case 'A':\n"
            + "            printf(\"Xuất sắc!\\n\");\n"
            + "            break;\n"
            + "        case 'B':\n"
            + "            printf(\"Tốt\\n\");\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Cần cố gắng\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "kiểu_trả_về tên_hàm(tham_số) {\n"
            + "    // thân hàm\n"
            + "    return giá_trị; // nếu kiểu trả về khác void\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Khai báo hàm\n"
            + "int max(int a, int b);\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 10, y = 20;\n"
            + "    int m = max(x, y);\n"
            + "    printf(\"Số lớn nhất là: %d\\n\", m);\n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "// Định nghĩa hàm\n"
            + "int max(int a, int b) {\n"
            + "    if (a > b) {\n"
            + "        return a;\n"
            + "    } else {\n"
            + "        return b;\n"
            + "    }\n"
            + "}",
            "// Khai báo mảng\n"
            + "int numbers[5] = {1, 2, 3, 4, 5};\n"
            + "\n"
            + "// Truy cập phần tử\n"
            + "int first = numbers[0];\n"
            + "numbers[2] = 10;",
            "char name[20] = \"Nguyen Van A\";\n"
            + "printf(\"Xin chào %s\\n\", name);\n"
            + "\n"
            + "// Nhập chuỗi từ bàn phím\n"
            + "char input[50];\n"
            + "printf(\"Nhập tên của bạn: \");\n"
            + "scanf(\"%s\", input);\n"
            + "printf(\"Tên bạn đã nhập: %s\\n\", input);",
            "int var = 10;\n"
            + "int *ptr = &var; // ptr trỏ đến var\n"
            + "\n"
            + "printf(\"Giá trị của var: %d\\n\", var);\n"
            + "printf(\"Địa chỉ của var: %p\\n\", &var);\n"
            + "printf(\"Giá trị qua con trỏ: %d\\n\", *ptr);",
            "struct SinhVien {\n"
            + "    char hoTen[50];\n"
            + "    int tuoi;\n"
            + "    float diemTB;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    struct SinhVien sv1;\n"
            + "    strcpy(sv1.hoTen, \"Nguyen Van A\");\n"
            + "    sv1.tuoi = 20;\n"
            + "    sv1.diemTB = 8.5;\n"
            + "    \n"
            + "    printf(\"Thông tin sinh viên:\\n\");\n"
            + "    printf(\"Họ tên: %s\\n\", sv1.hoTen);\n"
            + "    printf(\"Tuổi: %d\\n\", sv1.tuoi);\n"
            + "    printf(\"Điểm TB: %.2f\\n\", sv1.diemTB);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file;\n"
            + "    char data[100];\n"
            + "    \n"
            + "    // Ghi file\n"
            + "    file = fopen(\"test.txt\", \"w\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    fprintf(file, \"Xin chào thế giới!\\n\");\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // Đọc file\n"
            + "    file = fopen(\"test.txt\", \"r\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    while (fgets(data, sizeof(data), file) != NULL) {\n"
            + "        printf(\"%s\", data);\n"
            + "    }\n"
            + "    fclose(file);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int id;\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "void printStudent(struct Student s) {\n"
            + "    printf(\"ID: %d, Tên: %s, GPA: %.2f\\n\", s.id, s.name, s.gpa);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    struct Student students[3];\n"
            + "    int i;\n"
            + "    \n"
            + "    // Nhập thông tin sinh viên\n"
            + "    for (i = 0; i < 3; i++) {\n"
            + "        printf(\"Nhập thông tin sinh viên %d:\\n\", i+1);\n"
            + "        printf(\"Tên: \");\n"
            + "        scanf(\"%s\", students[i].name);\n"
            + "        printf(\"ID: \");\n"
            + "        scanf(\"%d\", &students[i].id);\n"
            + "        printf(\"GPA: \");\n"
            + "        scanf(\"%f\", &students[i].gpa);\n"
            + "    }\n"
            + "    \n"
            + "    // Hiển thị thông tin\n"
            + "    printf(\"\\nDanh sách sinh viên:\\n\");\n"
            + "    for (i = 0; i < 3; i++) {\n"
            + "        printStudent(students[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Tìm sinh viên có GPA cao nhất\n"
            + "    int maxIndex = 0;\n"
            + "    for (i = 1; i < 3; i++) {\n"
            + "        if (students[i].gpa > students[maxIndex].gpa) {\n"
            + "            maxIndex = i;\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"\\nSinh viên có GPA cao nhất:\\n\");\n"
            + "    printStudent(students[maxIndex]);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Tại sao nên học C?", new String[]{
            "// C\n"
            + "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Hello, World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "# Python\n"
            + "print(\"Hello, World!\")",
            "// Java\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        System.out.println(\"Hello, World!\");\n"
            + "    }\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *ptr = (int*) malloc(5 * sizeof(int)); // Cấp phát bộ nhớ động\n"
            + "    \n"
            + "    if (ptr == NULL) {\n"
            + "        printf(\"Memory allocation failed!\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    for (int i = 0; i < 5; i++) {\n"
            + "        ptr[i] = i * 2;\n"
            + "    }\n"
            + "    \n"
            + "    for (int i = 0; i < 5; i++) {\n"
            + "        printf(\"%d \", ptr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    free(ptr); // Giải phóng bộ nhớ\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <unistd.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Process ID: %d\\n\", getpid());\n"
            + "    printf(\"Parent Process ID: %d\\n\", getppid());\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "struct Node {\n"
            + "    int data;\n"
            + "    struct Node* next;\n"
            + "};\n"
            + "\n"
            + "void printList(struct Node* n) {\n"
            + "    while (n != NULL) {\n"
            + "        printf(\"%d \", n->data);\n"
            + "        n = n->next;\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    struct Node* head = NULL;\n"
            + "    struct Node* second = NULL;\n"
            + "    struct Node* third = NULL;\n"
            + "    \n"
            + "    head = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    second = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    third = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    \n"
            + "    head->data = 1;\n"
            + "    head->next = second;\n"
            + "    \n"
            + "    second->data = 2;\n"
            + "    second->next = third;\n"
            + "    \n"
            + "    third->data = 3;\n"
            + "    third->next = NULL;\n"
            + "    \n"
            + "    printList(head);\n"
            + "    \n"
            + "    free(head);\n"
            + "    free(second);\n"
            + "    free(third);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <errno.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *file;\n"
            + "    \n"
            + "    file = fopen(\"nonexistent.txt\", \"r\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Error opening file: %s\\n\", strerror(errno));\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Xử lý file\n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}\n"
            + "\n"
            + "int subtract(int a, int b) {\n"
            + "    return a - b;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int (*operation)(int, int);\n"
            + "    \n"
            + "    operation = add;\n"
            + "    printf(\"5 + 3 = %d\\n\", operation(5, 3));\n"
            + "    \n"
            + "    operation = subtract;\n"
            + "    printf(\"5 - 3 = %d\\n\", operation(5, 3));\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Các đặc điểm nổi bật của C", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Truy cập bộ nhớ cấp thấp bằng con trỏ\n"
            + "    int x = 10;\n"
            + "    int *ptr = &x;\n"
            + "    printf(\"Giá trị của x: %d\\n\", *ptr);\n"
            + "    \n"
            + "    // Tính năng cấp cao như hàm\n"
            + "    printf(\"Tổng của 5 và 3 là: %d\\n\", sum(5, 3));\n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "int sum(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm kiểm tra số nguyên tố\n"
            + "int isPrime(int num) {\n"
            + "    if (num <= 1) return 0;\n"
            + "    for (int i = 2; i*i <= num; i++) {\n"
            + "        if (num % i == 0) return 0;\n"
            + "    }\n"
            + "    return 1;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int n = 7;\n"
            + "    \n"
            + "    // Cấu trúc điều kiện\n"
            + "    if (isPrime(n)) {\n"
            + "        printf(\"%d là số nguyên tố\\n\", n);\n"
            + "    } else {\n"
            + "        printf(\"%d không là số nguyên tố\\n\", n);\n"
            + "    }\n"
            + "    \n"
            + "    // Cấu trúc vòng lặp\n"
            + "    printf(\"Các số nguyên tố từ 1 đến 20: \");\n"
            + "    for (int i = 1; i <= 20; i++) {\n"
            + "        if (isPrime(i)) {\n"
            + "            printf(\"%d \", i);\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Code này có thể chạy trên Windows, Linux, Mac...\n"
            + "    printf(\"Chương trình này chạy được trên nhiều nền tảng!\\n\");\n"
            + "    \n"
            + "    // Kiểm tra kích thước kiểu dữ liệu (có thể khác nhau giữa các nền tảng)\n"
            + "    printf(\"Kích thước của int: %lu bytes\\n\", sizeof(int));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 20;\n"
            + "    int *ptr = &var;\n"
            + "    \n"
            + "    printf(\"Giá trị của var: %d\\n\", var);\n"
            + "    printf(\"Địa chỉ của var: %p\\n\", &var);\n"
            + "    printf(\"Giá trị qua con trỏ ptr: %d\\n\", *ptr);\n"
            + "    \n"
            + "    // Thay đổi giá trị thông qua con trỏ\n"
            + "    *ptr = 30;\n"
            + "    printf(\"Giá trị mới của var: %d\\n\", var);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *arr;\n"
            + "    int n = 5;\n"
            + "    \n"
            + "    // Cấp phát bộ nhớ động\n"
            + "    arr = (int*)malloc(n * sizeof(int));\n"
            + "    \n"
            + "    if (arr == NULL) {\n"
            + "        printf(\"Không đủ bộ nhớ!\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng bộ nhộ đã cấp phát\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        arr[i] = i * 10;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Mảng động: \");\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    free(arr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <time.h>\n"
            + "\n"
            + "// Hàm tính giai thừa\n"
            + "unsigned long long factorial(int n) {\n"
            + "    if (n == 0) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    clock_t start, end;\n"
            + "    double cpu_time_used;\n"
            + "    \n"
            + "    start = clock();\n"
            + "    \n"
            + "    // Thực hiện tính toán tốn nhiều CPU\n"
            + "    unsigned long long result = factorial(20);\n"
            + "    printf(\"20! = %llu\\n\", result);\n"
            + "    \n"
            + "    end = clock();\n"
            + "    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;\n"
            + "    \n"
            + "    printf(\"Thời gian thực thi: %f giây\\n\", cpu_time_used);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "#include <math.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Thư viện stdio.h\n"
            + "    printf(\"Hello World!\\n\");\n"
            + "    \n"
            + "    // Thư viện string.h\n"
            + "    char str1[20] = \"Hello\";\n"
            + "    char str2[20] = \"World\";\n"
            + "    strcat(str1, str2);\n"
            + "    printf(\"Chuỗi sau khi nối: %s\\n\", str1);\n"
            + "    \n"
            + "    // Thư viện math.h\n"
            + "    printf(\"Căn bậc hai của 16 là: %f\\n\", sqrt(16));\n"
            + "    \n"
            + "    // Thư viện stdlib.h\n"
            + "    int random_num = rand() % 100;\n"
            + "    printf(\"Số ngẫu nhiên: %d\\n\", random_num);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Chương trình đơn giản minh họa tính đơn giản của C\n"
            + "int main() {\n"
            + "    int a = 5, b = 10;\n"
            + "    int sum = a + b;\n"
            + "    \n"
            + "    printf(\"Tổng của %d và %d là %d\\n\", a, b, sum);\n"
            + "    \n"
            + "    // Toán tử điều kiện đơn giản\n"
            + "    int max = (a > b) ? a : b;\n"
            + "    printf(\"Số lớn hơn là: %d\\n\", max);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <fcntl.h>\n"
            + "#include <unistd.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Mở file ở mức hệ thống\n"
            + "    int fd = open(\"test.txt\", O_WRONLY | O_CREAT, 0644);\n"
            + "    \n"
            + "    if (fd == -1) {\n"
            + "        perror(\"Lỗi khi mở file\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Ghi dữ liệu vào file\n"
            + "    char *text = \"Ví dụ lập trình hệ thống với C\\n\";\n"
            + "    write(fd, text, strlen(text));\n"
            + "    \n"
            + "    // Đóng file\n"
            + "    close(fd);\n"
            + "    \n"
            + "    printf(\"Đã ghi dữ liệu vào file thành công!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm original\n"
            + "void greet() {\n"
            + "    printf(\"Xin chào!\\n\");\n"
            + "}\n"
            + "\n"
            + "// Mở rộng chức năng bằng hàm mới\n"
            + "void greetByName(char name[]) {\n"
            + "    printf(\"Xin chào, %s!\\n\", name);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    greet(); // Gọi hàm gốc\n"
            + "    greetByName(\"Nguyễn Văn A\"); // Gọi hàm mở rộng\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Nguồn gốc của C", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Hello, World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int number = 10;\n"
            + "    \n"
            + "    // If-else\n"
            + "    if (number > 0) {\n"
            + "        printf(\"Number is positive\\n\");\n"
            + "    } else if (number < 0) {\n"
            + "        printf(\"Number is negative\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Number is zero\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // For loop\n"
            + "    for (int i = 0; i < 5; i++) {\n"
            + "        printf(\"%d \", i);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Khai báo hàm\n"
            + "int add(int a, int b);\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 3;\n"
            + "    int sum = add(x, y);\n"
            + "    \n"
            + "    printf(\"Sum of %d and %d is %d\\n\", x, y, sum);\n"
            + "    \n"
            + "    // Con trỏ\n"
            + "    int *ptr = &x;\n"
            + "    printf(\"Value of x: %d, Address of x: %p\\n\", x, (void*)ptr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "// Định nghĩa hàm\n"
            + "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "// Định nghĩa struct\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int age;\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo và khởi tạo struct\n"
            + "    struct Student student1;\n"
            + "    strcpy(student1.name, \"Nguyen Van A\");\n"
            + "    student1.age = 20;\n"
            + "    student1.gpa = 3.5;\n"
            + "    \n"
            + "    // In thông tin\n"
            + "    printf(\"Student Information:\\n\");\n"
            + "    printf(\"Name: %s\\n\", student1.name);\n"
            + "    printf(\"Age: %d\\n\", student1.age);\n"
            + "    printf(\"GPA: %.2f\\n\", student1.gpa);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *arr;\n"
            + "    int n = 5;\n"
            + "    \n"
            + "    // Cấp phát bộ nhớ động\n"
            + "    arr = (int*)malloc(n * sizeof(int));\n"
            + "    \n"
            + "    if (arr == NULL) {\n"
            + "        printf(\"Memory allocation failed\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Gán giá trị\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        arr[i] = i * 10;\n"
            + "    }\n"
            + "    \n"
            + "    // In giá trị\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    free(arr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Các phiên bản của C", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "/* Khai báo hàm kiểu K&R */\n"
            + "power(base, n)\n"
            + "int base, n;\n"
            + "{\n"
            + "    int p;\n"
            + "    \n"
            + "    for (p = 1; n > 0; --n)\n"
            + "        p = p * base;\n"
            + "    return p;\n"
            + "}\n"
            + "\n"
            + "main()\n"
            + "{\n"
            + "    int i;\n"
            + "    \n"
            + "    for (i = 0; i < 10; ++i)\n"
            + "        printf(\"%d %d %d\\n\", i, power(2,i), power(-3,i));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "/* Prototype hàm */\n"
            + "int power(int base, int n);\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    int i;\n"
            + "    \n"
            + "    for (i = 0; i < 10; ++i) {\n"
            + "        printf(\"%d %d %d\\n\", i, power(2,i), power(-3,i));\n"
            + "    }\n"
            + "    \n"
            + "    // Comment kiểu mới\n"
            + "    return EXIT_SUCCESS;\n"
            + "}\n"
            + "\n"
            + "int power(int base, int n)\n"
            + "{\n"
            + "    int p = 1;\n"
            + "    \n"
            + "    for (; n > 0; --n) {\n"
            + "        p = p * base;\n"
            + "    }\n"
            + "    return p;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdbool.h>\n"
            + "\n"
            + "// Hàm với số lượng đối số thay đổi\n"
            + "#define print(...) printf(__VA_ARGS__)\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    // Khai báo biến trong for\n"
            + "    for (int i = 0; i < 10; i++) {\n"
            + "        print(\"i = %d\\n\", i);\n"
            + "    }\n"
            + "    \n"
            + "    // Mảng kích thước thay đổi\n"
            + "    int n = 5;\n"
            + "    float arr[n];\n"
            + "    \n"
            + "    // Kiểu bool\n"
            + "    bool flag = true;\n"
            + "    \n"
            + "    // Số phức\n"
            + "    double complex z = 1.0 + 2.0 * I;\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <threads.h>\n"
            + "#include <stdalign.h>\n"
            + "\n"
            + "_Thread_local int tls_var = 10;\n"
            + "\n"
            + "void print_type(int x) {\n"
            + "    _Generic(x,\n"
            + "        int: printf(\"int\\n\"),\n"
            + "        float: printf(\"float\\n\"),\n"
            + "        default: printf(\"other\\n\")\n"
            + "    );\n"
            + "}\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    // Kiểm tra align\n"
            + "    alignas(16) int aligned_arr[4];\n"
            + "    \n"
            + "    // Generic selection\n"
            + "    print_type(0);\n"
            + "    print_type(0.0f);\n"
            + "    \n"
            + "    // Static assert\n"
            + "    static_assert(sizeof(int) >= 2, \"int must be at least 16 bits\");\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stddef.h>\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    // Tính năng từ C11 vẫn hoạt động\n"
            + "    auto x = 3.14;\n"
            + "    \n"
            + "    // __STDC_VERSION__ cho biết phiên bản\n"
            + "    printf(\"C standard version: %ld\\n\", __STDC_VERSION__);\n"
            + "    \n"
            + "    // C17 không thêm cú pháp mới đáng kể\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "[[deprecated(\"Use new_function instead\")]]\n"
            + "void old_function() {\n"
            + "    printf(\"This is old function\\n\");\n"
            + "}\n"
            + "\n"
            + "int main(void)\n"
            + "{\n"
            + "    // Thuộc tính mới\n"
            + "    [[maybe_unused]] int x = 42;\n"
            + "    \n"
            + "    // Unicode hỗ trợ tốt hơn\n"
            + "    char8_t utf8_str[] = u8\"UTF-8 string\";\n"
            + "    \n"
            + "    // old_function(); // Cảnh báo deprecated\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("C và các ngôn ngữ lập trình khác", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Hello, World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "public class HelloWorld {\n"
            + "    public static void main(String[] args) {\n"
            + "        System.out.println(\"Hello, World!\");\n"
            + "    }\n"
            + "}",
            "print(\"Hello, World!\")",
            "console.log(\"Hello, World!\");",
            "#include <iostream>\n"
            + "\n"
            + "int main() {\n"
            + "    std::cout << \"Hello, World!\" << std::endl;\n"
            + "    return 0;\n"
            + "}",
            "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *arr = (int*)malloc(5 * sizeof(int)); // Cấp phát\n"
            + "    if (arr == NULL) {\n"
            + "        // Xử lý lỗi\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng mảng\n"
            + "    for (int i = 0; i < 5; i++) {\n"
            + "        arr[i] = i * 2;\n"
            + "    }\n"
            + "    \n"
            + "    free(arr); // Giải phóng bộ nhớ\n"
            + "    return 0;\n"
            + "}",
            "public class MemoryExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        int[] arr = new int[5]; // Tự động quản lý bộ nhớ\n"
            + "        \n"
            + "        for (int i = 0; i < arr.length; i++) {\n"
            + "            arr[i] = i * 2;\n"
            + "        }\n"
            + "        \n"
            + "        // Không cần giải phóng bộ nhớ\n"
            + "    }\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "// Mô phỏng lớp\n"
            + "typedef struct {\n"
            + "    int x;\n"
            + "    void (*print)(int);\n"
            + "} Number;\n"
            + "\n"
            + "void printNumber(int num) {\n"
            + "    printf(\"Number: %d\\n\", num);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    Number n;\n"
            + "    n.x = 10;\n"
            + "    n.print = printNumber;\n"
            + "    \n"
            + "    n.print(n.x); // Gọi phương thức\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <iostream>\n"
            + "\n"
            + "class Number {\n"
            + "private:\n"
            + "    int x;\n"
            + "public:\n"
            + "    Number(int val) : x(val) {}\n"
            + "    void print() {\n"
            + "        std::cout << \"Number: \" << x << std::endl;\n"
            + "    }\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    Number n(10);\n"
            + "    n.print();\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int factorial(int n) {\n"
            + "    if (n == 0) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 5;\n"
            + "    printf(\"Factorial of %d is %d\\n\", num, factorial(num));\n"
            + "    return 0;\n"
            + "}",
            "public class Factorial {\n"
            + "    static int factorial(int n) {\n"
            + "        if (n == 0) return 1;\n"
            + "        return n * factorial(n - 1);\n"
            + "    }\n"
            + "    \n"
            + "    public static void main(String[] args) {\n"
            + "        int num = 5;\n"
            + "        System.out.println(\"Factorial of \" + num + \" is \" + factorial(num));\n"
            + "    }\n"
            + "}",
            "def factorial(n):\n"
            + "    return 1 if n == 0 else n * factorial(n - 1)\n"
            + "\n"
            + "num = 5\n"
            + "print(f\"Factorial of {num} is {factorial(num)}\")",
            "function factorial(n) {\n"
            + "    return n === 0 ? 1 : n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "const num = 5;\n"
            + "console.log(`Factorial of ${num} is ${factorial(num)}`);"
        });

        Code_MAP.put("Ứng dụng của C trong lập trình hệ thống", new String[]{
            "#include <stdio.h>\n"
            + "#include <unistd.h>\n"
            + "#include <sys/types.h>\n"
            + "\n"
            + "int main() {\n"
            + "    pid_t pid = fork();\n"
            + "    \n"
            + "    if (pid == 0) {\n"
            + "        // Code executed by child process\n"
            + "        printf(\"Child Process - PID: %d\\n\", getpid());\n"
            + "    } else if (pid > 0) {\n"
            + "        // Code executed by parent process\n"
            + "        printf(\"Parent Process - PID: %d, Child PID: %d\\n\", getpid(), pid);\n"
            + "    } else {\n"
            + "        // Fork failed\n"
            + "        perror(\"fork failed\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <linux/module.h>\n"
            + "#include <linux/fs.h>\n"
            + "#include <linux/uaccess.h>\n"
            + "\n"
            + "#define DEVICE_NAME \"simple_gpio\"\n"
            + "\n"
            + "static int Major;\n"
            + "static int gpio_state = 0;\n"
            + "\n"
            + "static int device_open(struct inode *inode, struct file *file) {\n"
            + "    printk(KERN_INFO \"GPIO device opened\\n\");\n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "static ssize_t device_read(struct file *filp, char *buffer, size_t length, loff_t *offset) {\n"
            + "    copy_to_user(buffer, &gpio_state, sizeof(gpio_state));\n"
            + "    return sizeof(gpio_state);\n"
            + "}\n"
            + "\n"
            + "static ssize_t device_write(struct file *filp, const char *buf, size_t len, loff_t *off) {\n"
            + "    copy_from_user(&gpio_state, buf, sizeof(gpio_state));\n"
            + "    printk(KERN_INFO \"GPIO state changed to %d\\n\", gpio_state);\n"
            + "    return len;\n"
            + "}\n"
            + "\n"
            + "static struct file_operations fops = {\n"
            + "    .read = device_read,\n"
            + "    .write = device_write,\n"
            + "    .open = device_open,\n"
            + "};\n"
            + "\n"
            + "int init_module(void) {\n"
            + "    Major = register_chrdev(0, DEVICE_NAME, &fops);\n"
            + "    if (Major < 0) {\n"
            + "        printk(KERN_ALERT \"Registering char device failed with %d\\n\", Major);\n"
            + "        return Major;\n"
            + "    }\n"
            + "    printk(KERN_INFO \"GPIO driver registered with major number %d\\n\", Major);\n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "void cleanup_module(void) {\n"
            + "    unregister_chrdev(Major, DEVICE_NAME);\n"
            + "    printk(KERN_INFO \"GPIO driver unregistered\\n\");\n"
            + "}\n"
            + "\n"
            + "MODULE_LICENSE(\"GPL\");",
            "#include <avr/io.h>\n"
            + "#include <util/delay.h>\n"
            + "\n"
            + "#define LED_PIN PB0\n"
            + "#define DELAY_MS 500\n"
            + "\n"
            + "int main(void) {\n"
            + "    // Set LED pin as output\n"
            + "    DDRB |= (1 << LED_PIN);\n"
            + "    \n"
            + "    while(1) {\n"
            + "        // Toggle LED\n"
            + "        PORTB ^= (1 << LED_PIN);\n"
            + "        _delay_ms(DELAY_MS);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <string.h>\n"
            + "#include <unistd.h>\n"
            + "#include <sys/socket.h>\n"
            + "#include <netinet/in.h>\n"
            + "\n"
            + "#define PORT 8080\n"
            + "#define BUFFER_SIZE 1024\n"
            + "\n"
            + "int main() {\n"
            + "    int server_fd, new_socket;\n"
            + "    struct sockaddr_in address;\n"
            + "    int opt = 1;\n"
            + "    int addrlen = sizeof(address);\n"
            + "    char buffer[BUFFER_SIZE] = {0};\n"
            + "    \n"
            + "    // Creating socket file descriptor\n"
            + "    if ((server_fd = socket(AF_INET, SOCK_STREAM, 0)) == 0) {\n"
            + "        perror(\"socket failed\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    // Forcefully attaching socket to the port 8080\n"
            + "    if (setsockopt(server_fd, SOL_SOCKET, SO_REUSEADDR | SO_REUSEPORT, &opt, sizeof(opt))) {\n"
            + "        perror(\"setsockopt\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    address.sin_family = AF_INET;\n"
            + "    address.sin_addr.s_addr = INADDR_ANY;\n"
            + "    address.sin_port = htons(PORT);\n"
            + "    \n"
            + "    // Bind the socket to the port\n"
            + "    if (bind(server_fd, (struct sockaddr *)&address, sizeof(address)) < 0) {\n"
            + "        perror(\"bind failed\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    if (listen(server_fd, 3) < 0) {\n"
            + "        perror(\"listen\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    if ((new_socket = accept(server_fd, (struct sockaddr *)&address, (socklen_t*)&addrlen)) < 0) {\n"
            + "        perror(\"accept\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    // Read and echo back the message\n"
            + "    read(new_socket, buffer, BUFFER_SIZE);\n"
            + "    printf(\"Message from client: %s\\n\", buffer);\n"
            + "    send(new_socket, buffer, strlen(buffer), 0);\n"
            + "    printf(\"Echo message sent\\n\");\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <dirent.h>\n"
            + "\n"
            + "int main(int argc, char **argv) {\n"
            + "    DIR *dir;\n"
            + "    struct dirent *entry;\n"
            + "    char *path = argc > 1 ? argv[1] : \".\";\n"
            + "    \n"
            + "    if ((dir = opendir(path)) == NULL) {\n"
            + "        perror(\"opendir\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    while ((entry = readdir(dir)) != NULL) {\n"
            + "        printf(\"%s\\n\", entry->d_name);\n"
            + "    }\n"
            + "    \n"
            + "    closedir(dir);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <unistd.h>\n"
            + "\n"
            + "int main() {\n"
            + "    if (geteuid() != 0) {\n"
            + "        fprintf(stderr, \"This program requires root privileges\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Running with root privileges\\n\");\n"
            + "    // Thực hiện các thao tác yêu cầu quyền root ở đây\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <sys/stat.h>\n"
            + "#include <time.h>\n"
            + "\n"
            + "int main(int argc, char *argv[]) {\n"
            + "    if (argc != 2) {\n"
            + "        fprintf(stderr, \"Usage: %s <filename>\\n\", argv[0]);\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    struct stat file_info;\n"
            + "    \n"
            + "    if (stat(argv[1], &file_info) == -1) {\n"
            + "        perror(\"stat\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"File: %s\\n\", argv[1]);\n"
            + "    printf(\"Size: %ld bytes\\n\", file_info.st_size);\n"
            + "    printf(\"Inode: %ld\\n\", file_info.st_ino);\n"
            + "    printf(\"Last access: %s\", ctime(&file_info.st_atime));\n"
            + "    printf(\"Last modification: %s\", ctime(&file_info.st_mtime));\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "void check_virtualization() {\n"
            + "    unsigned int hypervisor_bit;\n"
            + "    \n"
            + "    asm volatile (\n"
            + "        \"mov $1, %%eax\\n\"\n"
            + "        \"cpuid\\n\"\n"
            + "        \"bt $31, %%ecx\\n\"\n"
            + "        \"setc %0\\n\"\n"
            + "        : \"=r\" (hypervisor_bit)\n"
            + "        :\n"
            + "        : \"%eax\", \"%ebx\", \"%ecx\", \"%edx\"\n"
            + "    );\n"
            + "    \n"
            + "    if (hypervisor_bit) {\n"
            + "        printf(\"Running in a virtualized environment\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Not running in a virtualized environment\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    check_virtualization();\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("C trong phát triển phần mềm nhúng", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Hello Embedded World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdint.h>\n"
            + "\n"
            + "int main() {\n"
            + "    uint8_t small = 255;      // 1 byte (0-255)\n"
            + "    uint16_t medium = 65535;  // 2 bytes (0-65535)\n"
            + "    uint32_t large = 4294967295; // 4 bytes\n"
            + "    float fp_number = 3.14159;\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#define LED_ON (1 << 5)  // Bit 5\n"
            + "\n"
            + "int main() {\n"
            + "    uint8_t port = 0x00;\n"
            + "    \n"
            + "    // Bật LED\n"
            + "    port |= LED_ON;\n"
            + "    \n"
            + "    // Tắt LED\n"
            + "    port &= ~LED_ON;\n"
            + "    \n"
            + "    // Đảo trạng thái LED\n"
            + "    port ^= LED_ON;\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "// Giả sử địa chỉ thanh ghi GPIO là 0x40021000\n"
            + "#define GPIO_BASE ((volatile uint32_t*)0x40021000)\n"
            + "\n"
            + "typedef struct {\n"
            + "    volatile uint32_t MODER;   // GPIO port mode register\n"
            + "    volatile uint32_t OTYPER;  // GPIO port output type register\n"
            + "    volatile uint32_t OSPEEDR; // GPIO port output speed register\n"
            + "    volatile uint32_t PUPDR;   // GPIO port pull-up/pull-down register\n"
            + "    volatile uint32_t IDR;     // GPIO port input data register\n"
            + "    volatile uint32_t ODR;     // GPIO port output data register\n"
            + "} GPIO_TypeDef;\n"
            + "\n"
            + "#define GPIOA ((GPIO_TypeDef*)GPIO_BASE)\n"
            + "\n"
            + "void configure_led() {\n"
            + "    // Cấu hình chân PA5 là output\n"
            + "    GPIOA->MODER &= ~(0x3 << (5 * 2));  // Clear bits\n"
            + "    GPIOA->MODER |= (0x1 << (5 * 2));   // Set output mode\n"
            + "}\n"
            + "\n"
            + "void toggle_led() {\n"
            + "    GPIOA->ODR ^= (1 << 5);  // Đảo trạng thái LED\n"
            + "}",
            "#include <stdint.h>\n"
            + "\n"
            + "// Prototype hàm xử lý ngắt\n"
            + "void EXTI0_IRQHandler(void) __attribute__((interrupt));\n"
            + "\n"
            + "void EXTI0_IRQHandler(void) {\n"
            + "    // Xử lý ngắt\n"
            + "    if (EXTI->PR & (1 << 0)) {\n"
            + "        // Xóa cờ ngắt\n"
            + "        EXTI->PR = (1 << 0);\n"
            + "        \n"
            + "        // Thực hiện hành động khi ngắt xảy ra\n"
            + "        toggle_led();\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "void configure_interrupt() {\n"
            + "    // Cấu hình ngắt ngoài cho chân PA0\n"
            + "    RCC->APB2ENR |= RCC_APB2ENR_AFIOEN;  // Bật clock cho AFIO\n"
            + "    AFIO->EXTICR[0] |= AFIO_EXTICR1_EXTI0_PA;  // PA0 cho EXTI0\n"
            + "    \n"
            + "    EXTI->IMR |= EXTI_IMR_MR0;  // Bật mask ngắt cho EXTI0\n"
            + "    EXTI->RTSR |= EXTI_RTSR_TR0; // Bật ngắt cạnh lên\n"
            + "    \n"
            + "    NVIC_EnableIRQ(EXTI0_IRQn);  // Bật ngắt trong NVIC\n"
            + "    NVIC_SetPriority(EXTI0_IRQn, 0);  // Đặt độ ưu tiên\n"
            + "}",
            "#define BUFFER_SIZE 128\n"
            + "\n"
            + "// Biến toàn cục - lưu trong data/bss segment\n"
            + "static uint8_t global_buffer[BUFFER_SIZE];\n"
            + "\n"
            + "void process_data() {\n"
            + "    // Biến cục bộ - lưu trên stack\n"
            + "    uint8_t local_buffer[BUFFER_SIZE];\n"
            + "    \n"
            + "    // Sử dụng bộ nhớ tĩnh\n"
            + "    static uint8_t persistent_var = 0;\n"
            + "    persistent_var++;\n"
            + "}",
            "#include <stdlib.h>\n"
            + "\n"
            + "void use_heap_memory() {\n"
            + "    // Cấp phát động - tránh dùng trong hệ thống nhúng thời gian thực\n"
            + "    uint8_t *dynamic_buffer = malloc(BUFFER_SIZE);\n"
            + "    \n"
            + "    if (dynamic_buffer != NULL) {\n"
            + "        // Sử dụng bộ nhớ\n"
            + "        dynamic_buffer[0] = 0xAB;\n"
            + "        \n"
            + "        // Giải phóng bộ nhớ\n"
            + "        free(dynamic_buffer);\n"
            + "    }\n"
            + "}",
            "typedef struct {\n"
            + "    volatile uint32_t SR;   // Status register\n"
            + "    volatile uint32_t DR;   // Data register\n"
            + "    volatile uint32_t BRR;  // Baud rate register\n"
            + "    volatile uint32_t CR1;  // Control register 1\n"
            + "} USART_TypeDef;\n"
            + "\n"
            + "#define USART1 ((USART_TypeDef*)0x40013800)\n"
            + "\n"
            + "void uart_init(uint32_t baudrate) {\n"
            + "    // Bật clock cho USART1 và GPIO\n"
            + "    RCC->APB2ENR |= RCC_APB2ENR_USART1EN | RCC_APB2ENR_IOPAEN;\n"
            + "    \n"
            + "    // Cấu hình chân PA9 (TX) và PA10 (RX)\n"
            + "    GPIOA->CRH &= ~(GPIO_CRH_CNF9 | GPIO_CRH_MODE9);\n"
            + "    GPIOA->CRH |= GPIO_CRH_CNF9_1 | GPIO_CRH_MODE9;\n"
            + "    \n"
            + "    // Cấu hình baud rate\n"
            + "    USART1->BRR = SystemCoreClock / baudrate;\n"
            + "    \n"
            + "    // Bật USART, TX, RX\n"
            + "    USART1->CR1 = USART_CR1_UE | USART_CR1_TE | USART_CR1_RE;\n"
            + "}\n"
            + "\n"
            + "void uart_send_char(char c) {\n"
            + "    while (!(USART1->SR & USART_SR_TXE));  // Chờ đến khi bộ đệm trống\n"
            + "    USART1->DR = c;\n"
            + "}\n"
            + "\n"
            + "char uart_receive_char() {\n"
            + "    while (!(USART1->SR & USART_SR_RXNE));  // Chờ đến khi có dữ liệu\n"
            + "    return USART1->DR;\n"
            + "}",
            "typedef struct {\n"
            + "    volatile uint32_t CR1;     // Control register 1\n"
            + "    volatile uint32_t CR2;     // Control register 2\n"
            + "    volatile uint32_t SR;      // Status register\n"
            + "    volatile uint32_t DR;      // Data register\n"
            + "    volatile uint32_t CRCPR;   // CRC polynomial register\n"
            + "    volatile uint32_t RXCRCR;  // RX CRC register\n"
            + "    volatile uint32_t TXCRCR;  // TX CRC register\n"
            + "} SPI_TypeDef;\n"
            + "\n"
            + "#define SPI1 ((SPI_TypeDef*)0x40013000)\n"
            + "\n"
            + "void spi_init() {\n"
            + "    // Bật clock SPI và GPIO\n"
            + "    RCC->APB2ENR |= RCC_APB2ENR_SPI1EN | RCC_APB2ENR_IOPAEN;\n"
            + "    \n"
            + "    // Cấu hình chân SPI (PA5-SCK, PA6-MISO, PA7-MOSI)\n"
            + "    GPIOA->CRL &= ~(GPIO_CRL_CNF5 | GPIO_CRL_MODE5 | \n"
            + "                    GPIO_CRL_CNF6 | GPIO_CRL_MODE6 | \n"
            + "                    GPIO_CRL_CNF7 | GPIO_CRL_MODE7);\n"
            + "    GPIOA->CRL |= GPIO_CRL_CNF5_1 | GPIO_CRL_MODE5 |\n"
            + "                  GPIO_CRL_CNF6_1 | GPIO_CRL_MODE6 |\n"
            + "                  GPIO_CRL_CNF7_1 | GPIO_CRL_MODE7;\n"
            + "    \n"
            + "    // Cấu hình SPI: Master, clock polarity/phase, prescaler\n"
            + "    SPI1->CR1 = SPI_CR1_MSTR | SPI_CR1_BR_0 | SPI_CR1_SPE;\n"
            + "}\n"
            + "\n"
            + "uint8_t spi_transfer(uint8_t data) {\n"
            + "    while (!(SPI1->SR & SPI_SR_TXE));  // Chờ bộ đệm truyền trống\n"
            + "    SPI1->DR = data;\n"
            + "    \n"
            + "    while (!(SPI1->SR & SPI_SR_RXNE)); // Chờ nhận dữ liệu\n"
            + "    return SPI1->DR;\n"
            + "}",
            "#include \"FreeRTOS.h\"\n"
            + "#include \"task.h\"\n"
            + "\n"
            + "void vTask1(void *pvParameters) {\n"
            + "    while (1) {\n"
            + "        // Thực hiện công việc của task 1\n"
            + "        toggle_led();\n"
            + "        vTaskDelay(pdMS_TO_TICKS(500));  // Delay 500ms\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "void vTask2(void *pvParameters) {\n"
            + "    while (1) {\n"
            + "        // Thực hiện công việc của task 2\n"
            + "        process_sensor_data();\n"
            + "        vTaskDelay(pdMS_TO_TICKS(1000)); // Delay 1s\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Tạo các task\n"
            + "    xTaskCreate(vTask1, \"Task1\", configMINIMAL_STACK_SIZE, NULL, 1, NULL);\n"
            + "    xTaskCreate(vTask2, \"Task2\", configMINIMAL_STACK_SIZE, NULL, 2, NULL);\n"
            + "    \n"
            + "    // Khởi động scheduler\n"
            + "    vTaskStartScheduler();\n"
            + "    \n"
            + "    // Không bao giờ đến đây\n"
            + "    while (1);\n"
            + "}",
            "#include \"FreeRTOS.h\"\n"
            + "#include \"queue.h\"\n"
            + "#include \"semphr.h\"\n"
            + "\n"
            + "// Tạo queue và semaphore\n"
            + "QueueHandle_t xQueue = NULL;\n"
            + "SemaphoreHandle_t xSemaphore = NULL;\n"
            + "\n"
            + "void producer_task(void *pvParameters) {\n"
            + "    uint8_t data = 0;\n"
            + "    while (1) {\n"
            + "        data = read_sensor();\n"
            + "        \n"
            + "        // Gửi dữ liệu qua queue\n"
            + "        xQueueSend(xQueue, &data, portMAX_DELAY);\n"
            + "        \n"
            + "        // Cho semaphore\n"
            + "        xSemaphoreGive(xSemaphore);\n"
            + "        \n"
            + "        vTaskDelay(pdMS_TO_TICKS(200));\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "void consumer_task(void *pvParameters) {\n"
            + "    uint8_t received_data;\n"
            + "    while (1) {\n"
            + "        // Chờ semaphore\n"
            + "        xSemaphoreTake(xSemaphore, portMAX_DELAY);\n"
            + "        \n"
            + "        // Nhận dữ liệu từ queue\n"
            + "        xQueueReceive(xQueue, &received_data, portMAX_DELAY);\n"
            + "        \n"
            + "        process_data(received_data);\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Tạo queue và semaphore\n"
            + "    xQueue = xQueueCreate(10, sizeof(uint8_t));\n"
            + "    xSemaphore = xSemaphoreCreateBinary();\n"
            + "    \n"
            + "    // Tạo các task\n"
            + "    xTaskCreate(producer_task, \"Producer\", configMINIMAL_STACK_SIZE, NULL, 2, NULL);\n"
            + "    xTaskCreate(consumer_task, \"Consumer\", configMINIMAL_STACK_SIZE, NULL, 1, NULL);\n"
            + "    \n"
            + "    vTaskStartScheduler();\n"
            + "    \n"
            + "    while (1);\n"
            + "}",
            "// Macro để đọc thanh ghi nhanh\n"
            + "#define READ_REG(addr) (*(volatile uint32_t*)(addr))\n"
            + "\n"
            + "// Hàm inline để tối ưu hiệu suất\n"
            + "static inline void delay_us(uint32_t us) {\n"
            + "    uint32_t count = us * (SystemCoreClock / 1000000) / 5;\n"
            + "    while (count--);\n"
            + "}\n"
            + "\n"
            + "// Sử dụng\n"
            + "void example_optimization() {\n"
            + "    uint32_t reg_value = READ_REG(0x40021000);\n"
            + "    delay_us(100);  // Delay 100 micro giây\n"
            + "}",
            "// Không tối ưu\n"
            + "void slow_loop() {\n"
            + "    for (int i = 0; i < 100; i++) {\n"
            + "        do_something(i);\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "// Tối ưu hơn\n"
            + "void fast_loop() {\n"
            + "    int i = 100;\n"
            + "    while (i--) {\n"
            + "        do_something(100 - i - 1);\n"
            + "    }\n"
            + "}",
            "#include <assert.h>\n"
            + "\n"
            + "#define ASSERT_PORT(port) assert((port) >= GPIOA && (port) <= GPIOC)\n"
            + "\n"
            + "void set_pin(GPIO_TypeDef *port, uint8_t pin) {\n"
            + "    ASSERT_PORT(port);\n"
            + "    assert(pin < 16);\n"
            + "    \n"
            + "    port->BSRR = (1 << pin);  // Set pin\n"
            + "}",
            "// Log levels\n"
            + "typedef enum {\n"
            + "    LOG_ERROR,\n"
            + "    LOG_WARNING,\n"
            + "    LOG_INFO,\n"
            + "    LOG_DEBUG\n"
            + "} log_level_t;\n"
            + "\n"
            + "void log_message(log_level_t level, const char *message) {\n"
            + "    const char *level_str[] = {\"ERROR\", \"WARNING\", \"INFO\", \"DEBUG\"};\n"
            + "    \n"
            + "    if (level <= CURRENT_LOG_LEVEL) {\n"
            + "        uart_send_string(\"[\");\n"
            + "        uart_send_string(level_str[level]);\n"
            + "        uart_send_string(\"] \");\n"
            + "        uart_send_string(message);\n"
            + "        uart_send_string(\"\\r\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "// Sử dụng\n"
            + "log_message(LOG_ERROR, \"System initialization failed\");\n"
            + "log_message(LOG_INFO, \"Starting main loop\");",
            "// Đặt tên có ý nghĩa\n"
            + "#define MAX_SENSOR_READINGS  32\n"
            + "typedef enum {\n"
            + "    SENSOR_STATE_IDLE,\n"
            + "    SENSOR_STATE_READING,\n"
            + "    SENSOR_STATE_ERROR\n"
            + "} sensor_state_t;\n"
            + "\n"
            + "// Sử dụng static cho hàm cục bộ\n"
            + "static uint32_t calculate_checksum(const uint8_t *data, size_t length) {\n"
            + "    uint32_t sum = 0;\n"
            + "    for (size_t i = 0; i < length; i++) {\n"
            + "        sum += data[i];\n"
            + "    }\n"
            + "    return sum;\n"
            + "}\n"
            + "\n"
            + "// Cấu trúc code rõ ràng\n"
            + "typedef struct {\n"
            + "    uint8_t id;\n"
            + "    uint16_t value;\n"
            + "    uint32_t timestamp;\n"
            + "} sensor_data_t;\n"
            + "\n"
            + "void process_sensor_data(const sensor_data_t *data) {\n"
            + "    if (data == NULL) return;\n"
            + "    \n"
            + "    // Xử lý dữ liệu\n"
            + "}",
            "typedef enum {\n"
            + "    ERROR_NONE = 0,\n"
            + "    ERROR_INVALID_PARAM,\n"
            + "    ERROR_TIMEOUT,\n"
            + "    ERROR_HARDWARE\n"
            + "} error_code_t;\n"
            + "\n"
            + "error_code_t initialize_peripheral(void) {\n"
            + "    if (!check_hardware()) {\n"
            + "        return ERROR_HARDWARE;\n"
            + "    }\n"
            + "    \n"
            + "    if (configure() != 0) {\n"
            + "        return ERROR_INVALID_PARAM;\n"
            + "    }\n"
            + "    \n"
            + "    return ERROR_NONE;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    error_code_t err = initialize_peripheral();\n"
            + "    if (err != ERROR_NONE) {\n"
            + "        handle_error(err);\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Ứng dụng chính\n"
            + "    while (1) {\n"
            + "        run_application();\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Cấu trúc tổng quát", new String[]{
            "#include <stdio.h>   // Thư viện nhập xuất chuẩn\n"
            + "#include <stdlib.h>  // Thư viện các hàm tiện ích\n"
            + "#include <math.h>    // Thư viện toán học\n"
            + "#include <string.h>  // Thư viện xử lý chuỗi",
            "#define PI 3.14159265359\n"
            + "#define MAX_SIZE 100\n"
            + "#define GREETING \"Xin chao ban!\"",
            "// Nguyên mẫu hàm tính tổng hai số\n"
            + "int sum(int a, int b);\n"
            + "\n"
            + "// Nguyên mẫu hàm kiểm tra số nguyên tố\n"
            + "int isPrime(int n);\n"
            + "\n"
            + "// Nguyên mẫu hàm in mảng\n"
            + "void printArray(int arr[], int size);",
            "int globalCounter = 0;       // Biến đếm toàn cục\n"
            + "const float TAX_RATE = 0.1;  // Hằng số thuế",
            "int main() {\n"
            + "    // Khai báo biến cục bộ\n"
            + "    int a = 5, b = 10;\n"
            + "    int result;\n"
            + "    \n"
            + "    // Gọi hàm tính tổng\n"
            + "    result = sum(a, b);\n"
            + "    printf(\"Tong cua %d va %d la %d\\n\", a, b, result);\n"
            + "    \n"
            + "    // Kiểm tra số nguyên tố\n"
            + "    if (isPrime(7)) {\n"
            + "        printf(\"7 la so nguyen to\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng biến toàn cục\n"
            + "    globalCounter++;\n"
            + "    printf(\"Gia tri counter: %d\\n\", globalCounter);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "// Hàm tính tổng hai số\n"
            + "int sum(int a, int b) {\n"
            + "    return a + b;\n"
            + "}\n"
            + "\n"
            + "// Hàm kiểm tra số nguyên tố\n"
            + "int isPrime(int n) {\n"
            + "    if (n <= 1) return 0;\n"
            + "    for (int i = 2; i <= sqrt(n); i++) {\n"
            + "        if (n % i == 0) return 0;\n"
            + "    }\n"
            + "    return 1;\n"
            + "}\n"
            + "\n"
            + "// Hàm in mảng\n"
            + "void printArray(int arr[], int size) {\n"
            + "    for (int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <math.h>\n"
            + "\n"
            + "#define PI 3.14159265359\n"
            + "#define MAX_SIZE 100\n"
            + "\n"
            + "// Function prototypes\n"
            + "double calculateCircleArea(double radius);\n"
            + "void printFibonacci(int n);\n"
            + "int factorial(int n);\n"
            + "\n"
            + "// Global variables\n"
            + "int globalCounter = 0;\n"
            + "\n"
            + "int main() {\n"
            + "    double radius = 5.0;\n"
            + "    printf(\"Dien tich hinh tron ban kinh %.2f la: %.2f\\n\", \n"
            + "           radius, calculateCircleArea(radius));\n"
            + "    \n"
            + "    printf(\"Day Fibonacci 10 so dau: \");\n"
            + "    printFibonacci(10);\n"
            + "    \n"
            + "    printf(\"Giai thua cua 5 la: %d\\n\", factorial(5));\n"
            + "    \n"
            + "    globalCounter = 10;\n"
            + "    printf(\"Gia tri counter: %d\\n\", globalCounter);\n"
            + "    \n"
            + "    return 0;\n"
            + "}\n"
            + "\n"
            + "// Calculate area of a circle\n"
            + "double calculateCircleArea(double radius) {\n"
            + "    return PI * radius * radius;\n"
            + "}\n"
            + "\n"
            + "// Print Fibonacci sequence\n"
            + "void printFibonacci(int n) {\n"
            + "    int a = 0, b = 1, c;\n"
            + "    for (int i = 1; i <= n; i++) {\n"
            + "        printf(\"%d \", a);\n"
            + "        c = a + b;\n"
            + "        a = b;\n"
            + "        b = c;\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}\n"
            + "\n"
            + "// Calculate factorial\n"
            + "int factorial(int n) {\n"
            + "    if (n == 0) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}"
        });

        Code_MAP.put("Khai báo biến", new String[]{
            "kiểu_dữ_liệu tên_biến [= giá_trị_khởi_tạo];",
            "int a = 10;          // Số nguyên (thường 4 byte)\n"
            + "short b = 20;        // Số nguyên ngắn (2 byte)\n"
            + "long c = 100000L;    // Số nguyên dài (4 hoặc 8 byte)\n"
            + "long long d = 123456789LL; // Số nguyên rất dài (8 byte)\n"
            + "unsigned int e = 50;  // Số nguyên không dấu",
            "float f = 3.14f;      // Số thực độ chính xác đơn (4 byte)\n"
            + "double g = 3.141592;  // Số thực độ chính xác kép (8 byte)\n"
            + "long double h = 3.1415926535L; // Số thực độ chính xác mở rộng",
            "char ch1 = 'A';       // Ký tự đơn (1 byte)\n"
            + "char ch2 = 65;        // Cũng là 'A' (theo bảng ASCII)",
            "#include <stdbool.h>\n"
            + "bool isActive = true; // Kiểu logic (true/false)",
            "int x = 1, y = 2, z = 3;\n"
            + "float f1 = 1.1, f2 = 2.2;\n"
            + "char c1 = 'a', c2 = 'b', c3 = 'c';",
            "void counter() {\n"
            + "    static int count = 0; // Chỉ khởi tạo một lần\n"
            + "    count++;\n"
            + "    printf(\"Count: %d\\n\", count);\n"
            + "}",
            "register int fastVar = 0;",
            "volatile int hardwareRegister;",
            "const float PI = 3.14159;\n"
            + "const int MAX_SIZE = 100;",
            "int globalVar = 42;",
            "extern int globalVar; // Sử dụng biến globalVar từ File1.c",
            "#include <stdio.h>\n"
            + "#include <stdbool.h>\n"
            + "\n"
            + "// Biến toàn cục\n"
            + "int globalCount = 0;\n"
            + "\n"
            + "// Hằng số\n"
            + "const double TAX_RATE = 0.1;\n"
            + "\n"
            + "void exampleFunction() {\n"
            + "    // Biến cục bộ\n"
            + "    int localVar = 10;\n"
            + "    \n"
            + "    // Biến static\n"
            + "    static int staticVar = 5;\n"
            + "    \n"
            + "    printf(\"Local: %d, Static: %d\\n\", localVar, staticVar);\n"
            + "    localVar++;\n"
            + "    staticVar++;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo các kiểu biến khác nhau\n"
            + "    int age = 25;\n"
            + "    float weight = 68.5f;\n"
            + "    char grade = 'A';\n"
            + "    bool isStudent = true;\n"
            + "    \n"
            + "    // Khai báo nhiều biến cùng kiểu\n"
            + "    double x = 1.1, y = 2.2, z = 3.3;\n"
            + "    \n"
            + "    // Biến register\n"
            + "    register int counter;\n"
            + "    \n"
            + "    // Biến volatile\n"
            + "    volatile int hardwareData;\n"
            + "    \n"
            + "    // Biến const\n"
            + "    const int MAX_USERS = 100;\n"
            + "    \n"
            + "    printf(\"Age: %d, Weight: %.1f, Grade: %c\\n\", age, weight, grade);\n"
            + "    printf(\"Is student: %s\\n\", isStudent ? \"true\" : \"false\");\n"
            + "    \n"
            + "    // Gọi hàm nhiều lần để thấy sự khác biệt giữa biến cục bộ và static\n"
            + "    exampleFunction(); // Local: 10, Static: 5\n"
            + "    exampleFunction(); // Local: 10, Static: 6\n"
            + "    exampleFunction(); // Local: 10, Static: 7\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "int _count;\n"
            + "float averageScore;\n"
            + "double taxRate2023;",
            "#include <stdio.h>\n"
            + "\n"
            + "int globalVar = 10; // Biến toàn cục\n"
            + "\n"
            + "void testFunction(int param) { // param là biến tham số\n"
            + "    int localVar = 20; // Biến cục bộ\n"
            + "    printf(\"Global: %d, Param: %d, Local: %d\\n\", globalVar, param, localVar);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    testFunction(15);\n"
            + "    // printf(\"%d\", localVar); // Lỗi: localVar không tồn tại ở đây\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Hàm main", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main(void) {\n"
            + "    printf(\"Hello, World!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main(int argc, char *argv[]) {\n"
            + "    printf(\"Chương trình: %s\\n\", argv[0]);\n"
            + "    printf(\"Số tham số: %d\\n\", argc - 1);\n"
            + "    \n"
            + "    for (int i = 1; i < argc; i++) {\n"
            + "        printf(\"Tham số %d: %s\\n\", i, argv[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main(int argc, char *argv[], char *envp[]) {\n"
            + "    printf(\"Tham số môi trường:\\n\");\n"
            + "    \n"
            + "    for (int i = 0; envp[i] != NULL; i++) {\n"
            + "        printf(\"%s\\n\", envp[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h> // cho hàm atoi()\n"
            + "\n"
            + "// Hàm tính giai thừa\n"
            + "int factorial(int n) {\n"
            + "    if (n <= 1) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main(int argc, char *argv[]) {\n"
            + "    // Kiểm tra số lượng tham số\n"
            + "    if (argc != 2) {\n"
            + "        printf(\"Usage: %s <number>\\n\", argv[0]);\n"
            + "        return 1; // Trả về mã lỗi\n"
            + "    }\n"
            + "    \n"
            + "    // Chuyển tham số thành số\n"
            + "    int num = atoi(argv[1]);\n"
            + "    \n"
            + "    // Kiểm tra số hợp lệ\n"
            + "    if (num < 0) {\n"
            + "        printf(\"Error: Number must be non-negative.\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Tính và in kết quả\n"
            + "    printf(\"Factorial of %d is %d\\n\", num, factorial(num));\n"
            + "    \n"
            + "    return 0; // Thành công\n"
            + "}"
        });

        Code_MAP.put("Các bước biên dịch", new String[]{
            "// sample.c\n"
            + "#include <stdio.h>\n"
            + "#define PI 3.14159\n"
            + "\n"
            + "int main() {\n"
            + "    // Tính diện tích hình tròn\n"
            + "    float radius = 5.0;\n"
            + "    float area = PI * radius * radius;\n"
            + "    printf(\"Diện tích hình tròn: %.2f\\n\", area);\n"
            + "    return 0;\n"
            + "}",
            "// Nội dung từ stdio.h được chèn vào đây\n"
            + "// Macro PI được thay thế bằng 3.14159\n"
            + "// Comment đã bị xóa\n"
            + "\n"
            + "int main() {\n"
            + "    float radius = 5.0;\n"
            + "    float area = 3.14159 * radius * radius;\n"
            + "    printf(\"Diện tích hình tròn: %.2f\\n\", area);\n"
            + "    return 0;\n"
            + "}",
            "	.file	\"sample.c\"\n"
            + "	.text\n"
            + "	.section	.rodata\n"
            + ".LC1:\n"
            + "	.string	\"Di\\341\\273\\207n t\\303\\255ch h\\303\\254nh tr\\303\\262n: %.2f\\n\"\n"
            + "	.text\n"
            + "	.globl	main\n"
            + "	.type	main, @function\n"
            + "main:\n"
            + ".LFB0:\n"
            + "	.cfi_startproc\n"
            + "	pushq	%rbp\n"
            + "	.cfi_def_cfa_offset 16\n"
            + "	.cfi_offset 6, -16\n"
            + "	movq	%rsp, %rbp\n"
            + "	.cfi_def_cfa_register 6\n"
            + "	subq	$16, %rsp\n"
            + "	movss	.LC0(%rip), %xmm0\n"
            + "	movss	%xmm0, -8(%rbp)\n"
            + "	...",
            "// circle.h\n"
            + "#ifndef CIRCLE_H\n"
            + "#define CIRCLE_H\n"
            + "\n"
            + "#define PI 3.14159\n"
            + "\n"
            + "float calculate_area(float radius);\n"
            + "\n"
            + "#endif",
            "// circle.c\n"
            + "#include \"circle.h\"\n"
            + "\n"
            + "float calculate_area(float radius) {\n"
            + "    return PI * radius * radius;\n"
            + "}",
            "// main.c\n"
            + "#include <stdio.h>\n"
            + "#include \"circle.h\"\n"
            + "\n"
            + "int main() {\n"
            + "    float radius = 5.0;\n"
            + "    float area = calculate_area(radius);\n"
            + "    printf(\"Diện tích hình tròn: %.2f\\n\", area);\n"
            + "    return 0;\n"
            + "}",
            "gcc -E circle.c -o circle.i\n"
            + "gcc -E main.c -o main.i",
            "gcc -S circle.i -o circle.s\n"
            + "gcc -S main.i -o main.s",
            "gcc -c circle.s -o circle.o\n"
            + "gcc -c main.s -o main.o",
            "gcc circle.o main.o -o circle_program",
            "./circle_program",
            "Diện tích hình tròn: 78.54"
        });

        Code_MAP.put("Trình biên dịch và trình liên kết", new String[]{
            "// File: hello.c\n"
            + "#include <stdio.h>\n"
            + "\n"
            + "#define GREETING \"Hello, World!\"\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"%s\\n\", GREETING);\n"
            + "    return 0;\n"
            + "}",
            "gcc hello.c -o hello",
            "#include <stdio.h>\n"
            + "\n"
            + "// Khai báo hàm được định nghĩa ở file khác\n"
            + "extern int add(int a, int b);\n"
            + "\n"
            + "int main() {\n"
            + "    int result = add(5, 3);\n"
            + "    printf(\"Result: %d\\n\", result);\n"
            + "    return 0;\n"
            + "}",
            "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "gcc -c main.c        # Tạo main.o\n"
            + "gcc -c math.c        # Tạo math.o\n"
            + "gcc main.o math.o -o calculator  # Liên kết thành file thực thi",
            "#ifndef UTILS_H\n"
            + "#define UTILS_H\n"
            + "\n"
            + "int multiply(int a, int b);\n"
            + "void print_message(const char* msg);\n"
            + "\n"
            + "#endif",
            "#include <stdio.h>\n"
            + "#include \"utils.h\"\n"
            + "\n"
            + "int multiply(int a, int b) {\n"
            + "    return a * b;\n"
            + "}\n"
            + "\n"
            + "void print_message(const char* msg) {\n"
            + "    printf(\"Message: %s\\n\", msg);\n"
            + "}",
            "#include \"utils.h\"\n"
            + "\n"
            + "int main() {\n"
            + "    int product = multiply(4, 5);\n"
            + "    print_message(\"Product calculated\");\n"
            + "    printf(\"Product: %d\\n\", product);\n"
            + "    return 0;\n"
            + "}",
            "gcc -c utils.c       # Tạo utils.o\n"
            + "gcc -c app.c         # Tạo app.o\n"
            + "gcc utils.o app.o -o myapp  # Liên kết thành myapp",
            "gcc input.c -o output",
            "gcc -c file.c",
            "gcc -Iinclude/ source.c",
            "gcc main.c -Llib -lmylib",
            "gcc -g program.c -o program",
            "gcc -O2 program.c -o program",
            "gcc -Wall program.c -o program"
        });

        Code_MAP.put("Quá trình thực thi", new String[]{
            "// hello.c - Chương trình C đơn giản\n"
            + "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Xin chào thế giới!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "// Nội dung từ stdio.h được chèn vào đây\n"
            + "...\n"
            + "\n"
            + "int main() {\n"
            + "    printf(\"Xin chào thế giới!\\n\");\n"
            + "    return 0;\n"
            + "}",
            "gcc -S hello.c  # Tạo file hello.s",
            ".section	__TEXT,__text,regular,pure_instructions\n"
            + "	.build_version macos, 10, 15	sdk_version 10, 15\n"
            + "	.globl	_main                   ## -- Begin function main\n"
            + "_main:\n"
            + "	pushq	%rbp\n"
            + "	movq	%rsp, %rbp\n"
            + "	subq	$16, %rsp\n"
            + "	leaq	L_.str(%rip), %rdi\n"
            + "	movb	$0, %al\n"
            + "	callq	_printf\n"
            + "	xorl	%eax, %eax\n"
            + "	addq	$16, %rsp\n"
            + "	popq	%rbp\n"
            + "	retq\n"
            + "	.section	__TEXT,__cstring,cstring_literals\n"
            + "L_.str:                                 ## @.str\n"
            + "	.asciz	\"Xin chào thế giới!\\n\"",
            "gcc -c hello.c  # Tạo file hello.o",
            "gcc hello.o -o hello  # Tạo file thực thi hello",
            "// sample.c - Chương trình mẫu minh họa quá trình biên dịch\n"
            + "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "// Macro định nghĩa\n"
            + "#define GREETING \"Xin chào\"\n"
            + "\n"
            + "// Hàm tính giai thừa\n"
            + "int factorial(int n) {\n"
            + "    if (n <= 1) return 1;\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Biến cục bộ\n"
            + "    int number = 5;\n"
            + "    \n"
            + "    // Gọi hàm và sử dụng macro\n"
            + "    printf(\"%s! Giai thừa của %d là %d\\n\", GREETING, number, factorial(number));\n"
            + "    \n"
            + "    // Cấp phát động\n"
            + "    int *arr = (int*)malloc(number * sizeof(int));\n"
            + "    if (arr == NULL) {\n"
            + "        perror(\"Lỗi cấp phát bộ nhớ\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng bộ nhớ đã cấp phát\n"
            + "    for (int i = 0; i < number; i++) {\n"
            + "        arr[i] = i * 10;\n"
            + "    }\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    free(arr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "gcc -E sample.c -o sample.i",
            "gcc -S sample.c -o sample.s",
            "gcc -c sample.c -o sample.o",
            "gcc sample.o -o sample",
            "./sample",
            "Xin chào! Giai thừa của 5 là 120"
        });

        Code_MAP.put("Câu lệnh if", new String[]{
            "if (điều_kiện) {\n"
            + "    // Khối lệnh được thực thi nếu điều kiện đúng (true)\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int age = 20;\n"
            + "    \n"
            + "    if (age >= 18) {\n"
            + "        printf(\"Bạn đã đủ tuổi bầu cử.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if (điều_kiện) {\n"
            + "    // Khối lệnh nếu điều kiện đúng\n"
            + "} else {\n"
            + "    // Khối lệnh nếu điều kiện sai\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int number = 10;\n"
            + "    \n"
            + "    if (number % 2 == 0) {\n"
            + "        printf(\"%d là số chẵn.\\n\", number);\n"
            + "    } else {\n"
            + "        printf(\"%d là số lẻ.\\n\", number);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if (điều_kiện_1) {\n"
            + "    // Khối lệnh nếu điều_kiện_1 đúng\n"
            + "} else if (điều_kiện_2) {\n"
            + "    // Khối lệnh nếu điều_kiện_2 đúng\n"
            + "} else if (điều_kiện_3) {\n"
            + "    // Khối lệnh nếu điều_kiện_3 đúng\n"
            + "} else {\n"
            + "    // Khối lệnh nếu tất cả điều kiện trên sai\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int score = 85;\n"
            + "    \n"
            + "    if (score >= 90) {\n"
            + "        printf(\"Xếp loại A\\n\");\n"
            + "    } else if (score >= 80) {\n"
            + "        printf(\"Xếp loại B\\n\");\n"
            + "    } else if (score >= 70) {\n"
            + "        printf(\"Xếp loại C\\n\");\n"
            + "    } else if (score >= 60) {\n"
            + "        printf(\"Xếp loại D\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Xếp loại F\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if (điều_kiện_1) {\n"
            + "    if (điều_kiện_2) {\n"
            + "        // Khối lệnh nếu cả 2 điều kiện đều đúng\n"
            + "    }\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 15;\n"
            + "    \n"
            + "    if (num > 0) {\n"
            + "        printf(\"Số dương\\n\");\n"
            + "        \n"
            + "        if (num % 2 == 0) {\n"
            + "            printf(\"và là số chẵn\\n\");\n"
            + "        } else {\n"
            + "            printf(\"và là số lẻ\\n\");\n"
            + "        }\n"
            + "    } else if (num < 0) {\n"
            + "        printf(\"Số âm\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Số 0\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if (điều_kiện_1 && điều_kiện_2) {\n"
            + "    // Khối lệnh nếu cả 2 điều kiện đều đúng\n"
            + "}\n"
            + "\n"
            + "if (điều_kiện_1 || điều_kiện_2) {\n"
            + "    // Khối lệnh nếu 1 trong 2 điều kiện đúng\n"
            + "}\n"
            + "\n"
            + "if (!điều_kiện) {\n"
            + "    // Khối lệnh nếu điều kiện sai\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int age = 25;\n"
            + "    int hasLicense = 1; // 1 = true, 0 = false\n"
            + "    \n"
            + "    if (age >= 18 && hasLicense) {\n"
            + "        printf(\"Bạn được phép lái xe.\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Bạn không được phép lái xe.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "if ((biến = giá_trị) == giá_trị_so_sánh) {\n"
            + "    // Khối lệnh\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int x;\n"
            + "    \n"
            + "    if ((x = 10) == 10) {\n"
            + "        printf(\"x được gán giá trị 10 và kiểm tra thành công\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Câu lệnh if-else", new String[]{
            "if (điều_kiện) {\n"
            + "    // Khối lệnh thực hiện nếu điều kiện đúng (true)\n"
            + "}",
            "if (điều_kiện) {\n"
            + "    // Khối lệnh thực hiện nếu điều kiện đúng (true)\n"
            + "} else {\n"
            + "    // Khối lệnh thực hiện nếu điều kiện sai (false)\n"
            + "}",
            "if (điều_kiện_1) {\n"
            + "    // Khối lệnh thực hiện nếu điều_kiện_1 đúng\n"
            + "} else if (điều_kiện_2) {\n"
            + "    // Khối lệnh thực hiện nếu điều_kiện_2 đúng\n"
            + "} else if (điều_kiện_3) {\n"
            + "    // Khối lệnh thực hiện nếu điều_kiện_3 đúng\n"
            + "} else {\n"
            + "    // Khối lệnh thực hiện nếu tất cả điều kiện trên sai\n"
            + "}",
            "if (điều_kiện_1) {\n"
            + "    // Khối lệnh thực hiện nếu điều_kiện_1 đúng\n"
            + "    \n"
            + "    if (điều_kiện_2) {\n"
            + "        // Khối lệnh thực hiện nếu cả điều_kiện_1 và điều_kiện_2 đều đúng\n"
            + "    }\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int age = 20;\n"
            + "    \n"
            + "    if (age >= 18) {\n"
            + "        printf(\"Bạn đã đủ tuổi bầu cử.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int number = 10;\n"
            + "    \n"
            + "    if (number % 2 == 0) {\n"
            + "        printf(\"%d là số chẵn.\\n\", number);\n"
            + "    } else {\n"
            + "        printf(\"%d là số lẻ.\\n\", number);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int score = 85;\n"
            + "    \n"
            + "    if (score >= 90) {\n"
            + "        printf(\"Xếp loại A\\n\");\n"
            + "    } else if (score >= 80) {\n"
            + "        printf(\"Xếp loại B\\n\");\n"
            + "    } else if (score >= 70) {\n"
            + "        printf(\"Xếp loại C\\n\");\n"
            + "    } else if (score >= 60) {\n"
            + "        printf(\"Xếp loại D\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Xếp loại F\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 100, b = 20, c = 30;\n"
            + "    \n"
            + "    if (a > b) {\n"
            + "        if (a > c) {\n"
            + "            printf(\"a là số lớn nhất.\\n\");\n"
            + "        } else {\n"
            + "            printf(\"c là số lớn nhất.\\n\");\n"
            + "        }\n"
            + "    } else {\n"
            + "        if (b > c) {\n"
            + "            printf(\"b là số lớn nhất.\\n\");\n"
            + "        } else {\n"
            + "            printf(\"c là số lớn nhất.\\n\");\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int age = 25;\n"
            + "    char gender = 'M';\n"
            + "    \n"
            + "    if (age >= 18 && gender == 'M') {\n"
            + "        printf(\"Nam đã đủ tuổi nghĩa vụ quân sự.\\n\");\n"
            + "    } else if (age >= 18 || gender == 'F') {\n"
            + "        printf(\"Đã đủ tuổi bầu cử hoặc là nữ.\\n\");\n"
            + "    } else {\n"
            + "        printf(\"Chưa đủ tuổi bầu cử.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Câu lệnh switch-case", new String[]{
            "switch (biểu_thức) {\n"
            + "    case giá_trị_1:\n"
            + "        // Khối lệnh thực thi nếu biểu_thức == giá_trị_1\n"
            + "        break;\n"
            + "    case giá_trị_2:\n"
            + "        // Khối lệnh thực thi nếu biểu_thức == giá_trị_2\n"
            + "        break;\n"
            + "    ...\n"
            + "    case giá_trị_n:\n"
            + "        // Khối lệnh thực thi nếu biểu_thức == giá_trị_n\n"
            + "        break;\n"
            + "    default:\n"
            + "        // Khối lệnh thực thi nếu không có case nào khớp\n"
            + "        break;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char grade;\n"
            + "    printf(\"Nhập điểm (A-F): \");\n"
            + "    scanf(\"%c\", &grade);\n"
            + "    \n"
            + "    switch (grade) {\n"
            + "        case 'A':\n"
            + "            printf(\"Xuất sắc!\\n\");\n"
            + "            break;\n"
            + "        case 'B':\n"
            + "            printf(\"Tốt!\\n\");\n"
            + "            break;\n"
            + "        case 'C':\n"
            + "            printf(\"Trung bình.\\n\");\n"
            + "            break;\n"
            + "        case 'D':\n"
            + "            printf(\"Yếu, cần cố gắng.\\n\");\n"
            + "            break;\n"
            + "        case 'F':\n"
            + "            printf(\"Trượt!\\n\");\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Điểm không hợp lệ.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 10, b = 5, result;\n"
            + "    char op;\n"
            + "    printf(\"Nhập phép tính (+, -, *, /): \");\n"
            + "    scanf(\"%c\", &op);\n"
            + "    \n"
            + "    switch (op) {\n"
            + "        case '+':\n"
            + "            result = a + b;\n"
            + "            printf(\"Kết quả: %d\\n\", result);\n"
            + "            break;\n"
            + "        case '-':\n"
            + "            result = a - b;\n"
            + "            printf(\"Kết quả: %d\\n\", result);\n"
            + "            break;\n"
            + "        case '*':\n"
            + "            result = a * b;\n"
            + "            printf(\"Kết quả: %d\\n\", result);\n"
            + "            break;\n"
            + "        case '/':\n"
            + "            if (b != 0) {\n"
            + "                result = a / b;\n"
            + "                printf(\"Kết quả: %d\\n\", result);\n"
            + "            } else {\n"
            + "                printf(\"Lỗi: chia cho 0!\\n\");\n"
            + "            }\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Phép tính không hợp lệ!\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int month;\n"
            + "    printf(\"Nhập tháng (1-12): \");\n"
            + "    scanf(\"%d\", &month);\n"
            + "    \n"
            + "    switch (month) {\n"
            + "        case 1: case 3: case 5: case 7: case 8: case 10: case 12:\n"
            + "            printf(\"Tháng %d có 31 ngày.\\n\", month);\n"
            + "            break;\n"
            + "        case 4: case 6: case 9: case 11:\n"
            + "            printf(\"Tháng %d có 30 ngày.\\n\", month);\n"
            + "            break;\n"
            + "        case 2:\n"
            + "            printf(\"Tháng 2 có 28 hoặc 29 ngày.\\n\");\n"
            + "            break;\n"
            + "        default:\n"
            + "            printf(\"Tháng không hợp lệ!\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Vòng lặp for", new String[]{
            "for (khởi_tạo; điều_kiện; cập_nhật) {\n"
            + "    // Khối lệnh được thực thi\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // In ra các số từ 1 đến 5\n"
            + "    for (int i = 1; i <= 5; i++) {\n"
            + "        printf(\"%d \", i);\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    for (int i = 0, j = 10; i < j; i++, j--) {\n"
            + "        printf(\"i = %d, j = %d\\n\", i, j);\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "i = 0, j = 10\n"
            + "i = 1, j = 9\n"
            + "i = 2, j = 8\n"
            + "i = 3, j = 7\n"
            + "i = 4, j = 6",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int i = 0;\n"
            + "    for (; i < 3; i++) {\n"
            + "        printf(\"Hello %d\\n\", i);\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "Hello 0\n"
            + "Hello 1\n"
            + "Hello 2",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    for (;;) {\n"
            + "        printf(\"Vòng lặp vô hạn\\n\");\n"
            + "        // Thêm điều kiện break để thoát\n"
            + "        break; // Chỉ chạy 1 lần để demo\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // In bảng cửu chương\n"
            + "    for (int i = 1; i <= 10; i++) {\n"
            + "        for (int j = 1; j <= 10; j++) {\n"
            + "            printf(\"%4d\", i * j);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Vòng lặp while", new String[]{
            "while (điều_kiện) {\n"
            + "    // Khối lệnh được thực hiện khi điều kiện đúng\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int i = 1;\n"
            + "    \n"
            + "    while (i <= 5) {\n"
            + "        printf(\"%d \", i);\n"
            + "        i++; // Tăng giá trị i lên 1\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int n, sum = 0, i = 1;\n"
            + "    \n"
            + "    printf(\"Nhập số nguyên dương n: \");\n"
            + "    scanf(\"%d\", &n);\n"
            + "    \n"
            + "    while (i <= n) {\n"
            + "        sum += i;\n"
            + "        i++;\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Tổng từ 1 đến %d là: %d\\n\", n, sum);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    while (1) { // Điều kiện luôn đúng\n"
            + "        printf(\"Vòng lặp vô hạn!\\n\");\n"
            + "        // Nếu không có break, chương trình sẽ chạy mãi\n"
            + "        break; // Thêm break để thoát khỏi vòng lặp\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int num;\n"
            + "    \n"
            + "    printf(\"Nhập các số (nhập 0 để dừng):\\n\");\n"
            + "    scanf(\"%d\", &num);\n"
            + "    \n"
            + "    while (num != 0) {\n"
            + "        printf(\"Bạn đã nhập: %d\\n\", num);\n"
            + "        scanf(\"%d\", &num);\n"
            + "    }\n"
            + "    \n"
            + "    printf(\"Kết thúc chương trình.\\n\");\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Vòng lặp do-while", new String[]{
            "do {\n"
            + "    // Khối lệnh được thực thi\n"
            + "} while (điều_kiện);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int i = 1;\n"
            + "    \n"
            + "    do {\n"
            + "        printf(\"%d \", i);\n"
            + "        i++;\n"
            + "    } while (i <= 5);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int number;\n"
            + "    \n"
            + "    do {\n"
            + "        printf(\"Nhập một số dương: \");\n"
            + "        scanf(\"%d\", &number);\n"
            + "    } while (number <= 0);\n"
            + "    \n"
            + "    printf(\"Bạn đã nhập số dương: %d\\n\", number);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int n, sum = 0, i = 1;\n"
            + "    \n"
            + "    printf(\"Nhập n: \");\n"
            + "    scanf(\"%d\", &n);\n"
            + "    \n"
            + "    do {\n"
            + "        sum += i;\n"
            + "        i++;\n"
            + "    } while (i <= n);\n"
            + "    \n"
            + "    printf(\"Tổng từ 1 đến %d là: %d\\n\", n, sum);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khai báo mảng một chiều", new String[]{
            "kiểu_dữ_liệu tên_mảng[kích_thước];",
            "int numbers[5]; // Khai báo mảng\n"
            + "numbers[0] = 10; // Khởi tạo từng phần tử\n"
            + "numbers[1] = 20;\n"
            + "// ...",
            "int numbers[5] = {10, 20, 30, 40, 50}; // Khởi tạo đầy đủ\n"
            + "int numbers[] = {10, 20, 30}; // Kích thước tự động xác định\n"
            + "int numbers[5] = {0}; // Tất cả phần tử = 0\n"
            + "int numbers[5] = {10, 20}; // 2 phần tử đầu được khởi tạo, các phần tử còn lại = 0",
            "int value = numbers[2]; // Truy cập phần tử thứ 3\n"
            + "numbers[3] = 100; // Gán giá trị cho phần tử thứ 4",
            "int size = sizeof(numbers) / sizeof(numbers[0]);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Khai báo và khởi tạo mảng\n"
            + "    int numbers[5] = {10, 20, 30, 40, 50};\n"
            + "    \n"
            + "    // 2. Tính kích thước mảng\n"
            + "    int size = sizeof(numbers) / sizeof(numbers[0]);\n"
            + "    printf(\"Kich thuoc mang: %d\\n\", size);\n"
            + "    \n"
            + "    // 3. Truy cập và in các phần tử\n"
            + "    printf(\"Cac phan tu cua mang:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"numbers[%d] = %d\\n\", i, numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // 4. Thay đổi giá trị phần tử\n"
            + "    numbers[2] = 100;\n"
            + "    printf(\"\\nSau khi thay doi:\\n\");\n"
            + "    printf(\"numbers[2] = %d\\n\", numbers[2]);\n"
            + "    \n"
            + "    // 5. Nhập giá trị từ bàn phím\n"
            + "    printf(\"\\nNhap 5 so nguyen:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"numbers[%d] = \", i);\n"
            + "        scanf(\"%d\", &numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // In lại mảng sau khi nhập\n"
            + "    printf(\"\\nMang sau khi nhap:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Truy cập và thao tác với phần tử trong mảng", new String[]{
            "// Khai báo mảng kiểu int với 5 phần tử\n"
            + "int numbers[5];\n"
            + "\n"
            + "// Khai báo và khởi tạo mảng\n"
            + "float temperatures[] = {23.5, 24.0, 22.8, 25.2};",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[5] = {10, 20, 30, 40, 50};\n"
            + "    \n"
            + "    // Truy cập phần tử đầu tiên (index 0)\n"
            + "    printf(\"Phan tu thu nhat: %d\\n\", arr[0]);\n"
            + "    \n"
            + "    // Truy cập phần tử thứ ba (index 2)\n"
            + "    printf(\"Phan tu thu ba: %d\\n\", arr[2]);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int numbers[3] = {5, 10, 15};\n"
            + "    \n"
            + "    printf(\"Truoc khi thay doi: %d\\n\", numbers[1]); // 10\n"
            + "    \n"
            + "    // Thay đổi giá trị phần tử thứ 2\n"
            + "    numbers[1] = 100;\n"
            + "    \n"
            + "    printf(\"Sau khi thay doi: %d\\n\", numbers[1]); // 100\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[] = {1, 2, 3, 4, 5};\n"
            + "    int length = sizeof(arr) / sizeof(arr[0]);\n"
            + "    \n"
            + "    // Duyệt mảng bằng for\n"
            + "    printf(\"Duyet mang bang for:\\n\");\n"
            + "    for(int i = 0; i < length; i++) {\n"
            + "        printf(\"arr[%d] = %d\\n\", i, arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Duyệt mảng bằng while\n"
            + "    printf(\"\\nDuyet mang bang while:\\n\");\n"
            + "    int j = 0;\n"
            + "    while(j < length) {\n"
            + "        printf(\"arr[%d] = %d\\n\", j, arr[j]);\n"
            + "        j++;\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "#define SIZE 5\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[SIZE];\n"
            + "    \n"
            + "    // Nhập mảng từ bàn phím\n"
            + "    printf(\"Nhap %d phan tu:\\n\", SIZE);\n"
            + "    for(int i = 0; i < SIZE; i++) {\n"
            + "        printf(\"arr[%d] = \", i);\n"
            + "        scanf(\"%d\", &arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Xuất mảng ra màn hình\n"
            + "    printf(\"\\nMang vua nhap:\\n\");\n"
            + "    for(int i = 0; i < SIZE; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo mảng 2 chiều 3x3\n"
            + "    int matrix[3][3] = {\n"
            + "        {1, 2, 3},\n"
            + "        {4, 5, 6},\n"
            + "        {7, 8, 9}\n"
            + "    };\n"
            + "    \n"
            + "    // Truy cập phần tử mảng 2 chiều\n"
            + "    printf(\"Phan tu [1][2]: %d\\n\", matrix[1][2]); // 6\n"
            + "    \n"
            + "    // Duyệt mảng 2 chiều\n"
            + "    printf(\"\\nToan bo mang:\\n\");\n"
            + "    for(int i = 0; i < 3; i++) {\n"
            + "        for(int j = 0; j < 3; j++) {\n"
            + "            printf(\"%d \", matrix[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[] = {10, 20, 30, 40, 50};\n"
            + "    \n"
            + "    // Truy cập mảng thông qua con trỏ\n"
            + "    int *ptr = arr;\n"
            + "    \n"
            + "    printf(\"Phan tu thu 2: %d\\n\", *(ptr + 1)); // 20\n"
            + "    \n"
            + "    // Duyệt mảng bằng con trỏ\n"
            + "    printf(\"\\nDuyet mang bang con tro:\\n\");\n"
            + "    for(int i = 0; i < 5; i++) {\n"
            + "        printf(\"arr[%d] = %d\\n\", i, *(ptr + i));\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "#define SIZE 5\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[SIZE] = {5, 2, 8, 1, 9};\n"
            + "    \n"
            + "    // Tìm giá trị lớn nhất\n"
            + "    int max = arr[0];\n"
            + "    for(int i = 1; i < SIZE; i++) {\n"
            + "        if(arr[i] > max) {\n"
            + "            max = arr[i];\n"
            + "        }\n"
            + "    }\n"
            + "    printf(\"Gia tri lon nhat: %d\\n\", max);\n"
            + "    \n"
            + "    // Tính tổng mảng\n"
            + "    int sum = 0;\n"
            + "    for(int i = 0; i < SIZE; i++) {\n"
            + "        sum += arr[i];\n"
            + "    }\n"
            + "    printf(\"Tong cac phan tu: %d\\n\", sum);\n"
            + "    \n"
            + "    // Đảo ngược mảng\n"
            + "    printf(\"Mang dao nguoc: \");\n"
            + "    for(int i = SIZE - 1; i >= 0; i--) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm nhận mảng và kích thước làm tham số\n"
            + "void printArray(int arr[], int size) {\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", arr[i]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}\n"
            + "\n"
            + "// Hàm thay đổi giá trị mảng\n"
            + "void modifyArray(int arr[], int size) {\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        arr[i] *= 2; // Nhân đôi mỗi phần tử\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int numbers[] = {1, 2, 3, 4, 5};\n"
            + "    int length = sizeof(numbers) / sizeof(numbers[0]);\n"
            + "    \n"
            + "    printf(\"Mang ban dau: \");\n"
            + "    printArray(numbers, length);\n"
            + "    \n"
            + "    modifyArray(numbers, length);\n"
            + "    \n"
            + "    printf(\"Mang sau khi thay doi: \");\n"
            + "    printArray(numbers, length);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khai báo mảng hai chiều", new String[]{
            "kiểu_dữ_liệu tên_mảng[số_hàng][số_cột];",
            "kiểu_dữ_liệu tên_mảng[][số_cột] = {\n"
            + "    {giá_trị11, giá_trị12, ...},\n"
            + "    {giá_trị21, giá_trị22, ...},\n"
            + "    ...\n"
            + "};",
            "kiểu_dữ_liệu tên_mảng[số_hàng][số_cột] = {\n"
            + "    {giá_trị11, giá_trị12, ...},\n"
            + "    {giá_trị21, giá_trị22, ...},\n"
            + "    ...\n"
            + "};",
            "kiểu_dữ_liệu tên_mảng[số_hàng][số_cột] = {giá_trị1, giá_trị2, giá_trị3, ...};",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Khai báo mảng 2 chiều không khởi tạo\n"
            + "    int matrix1[3][4]; // Mảng 3 hàng 4 cột chưa được khởi tạo giá trị\n"
            + "    \n"
            + "    // 2. Khai báo và khởi tạo mảng 2 chiều (chỉ định kích thước)\n"
            + "    int matrix2[2][3] = {\n"
            + "        {1, 2, 3},  // Hàng 0\n"
            + "        {4, 5, 6}   // Hàng 1\n"
            + "    };\n"
            + "    \n"
            + "    // 3. Khai báo và khởi tạo mảng 2 chiều (không chỉ định số hàng)\n"
            + "    int matrix3[][4] = {\n"
            + "        {1, 2, 3, 4},\n"
            + "        {5, 6, 7, 8},\n"
            + "        {9, 10, 11, 12}\n"
            + "    }; // Compiler tự tính số hàng là 3\n"
            + "    \n"
            + "    // 4. Khai báo và khởi tạo dạng phẳng\n"
            + "    float matrix4[2][2] = {1.1, 2.2, 3.3, 4.4};\n"
            + "    \n"
            + "    // Truy xuất và in các phần tử của mảng\n"
            + "    printf(\"Phần tử matrix2[1][2]: %d\\n\", matrix2[1][2]); // Output: 6\n"
            + "    \n"
            + "    // Duyệt và in toàn bộ mảng\n"
            + "    printf(\"Mảng matrix3:\\n\");\n"
            + "    for(int i = 0; i < 3; i++) {\n"
            + "        for(int j = 0; j < 4; j++) {\n"
            + "            printf(\"%d \", matrix3[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Truy cập và thao tác với phần tử", new String[]{
            "// Khai báo mảng 2 chiều 3 hàng 4 cột\n"
            + "int matrix[3][4]; \n"
            + "\n"
            + "// Khai báo và khởi tạo giá trị\n"
            + "int matrix2[2][3] = {\n"
            + "    {1, 2, 3},\n"
            + "    {4, 5, 6}\n"
            + "};",
            "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int rows = 3, cols = 4;\n"
            + "    int **matrix = (int **)malloc(rows * sizeof(int *));\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        matrix[i] = (int *)malloc(cols * sizeof(int));\n"
            + "    }\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ khi không dùng nữa\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        free(matrix[i]);\n"
            + "    }\n"
            + "    free(matrix);\n"
            + "    return 0;\n"
            + "}",
            "matrix[i][j]",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};\n"
            + "    \n"
            + "    // Truy cập phần tử hàng 1 cột 2\n"
            + "    printf(\"Phan tu [1][2]: %d\\n\", matrix[1][2]); // Output: 6\n"
            + "    \n"
            + "    // Thay đổi giá trị phần tử\n"
            + "    matrix[0][1] = 10;\n"
            + "    printf(\"Phan tu [0][1] sau khi thay doi: %d\\n\", matrix[0][1]); // Output: 10\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "#define ROWS 3\n"
            + "#define COLS 3\n"
            + "\n"
            + "int main() {\n"
            + "    int matrix[ROWS][COLS];\n"
            + "    \n"
            + "    // Nhập mảng\n"
            + "    printf(\"Nhap cac phan tu cua mang:\\n\");\n"
            + "    for (int i = 0; i < ROWS; i++) {\n"
            + "        for (int j = 0; j < COLS; j++) {\n"
            + "            printf(\"matrix[%d][%d] = \", i, j);\n"
            + "            scanf(\"%d\", &matrix[i][j]);\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    // Xuất mảng\n"
            + "    printf(\"\\nMang vua nhap:\\n\");\n"
            + "    for (int i = 0; i < ROWS; i++) {\n"
            + "        for (int j = 0; j < COLS; j++) {\n"
            + "            printf(\"%d\\t\", matrix[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "int sum = 0;\n"
            + "for (int i = 0; i < ROWS; i++) {\n"
            + "    for (int j = 0; j < COLS; j++) {\n"
            + "        sum += matrix[i][j];\n"
            + "    }\n"
            + "}\n"
            + "printf(\"Tong cac phan tu: %d\\n\", sum);",
            "int max = matrix[0][0];\n"
            + "int min = matrix[0][0];\n"
            + "\n"
            + "for (int i = 0; i < ROWS; i++) {\n"
            + "    for (int j = 0; j < COLS; j++) {\n"
            + "        if (matrix[i][j] > max) {\n"
            + "            max = matrix[i][j];\n"
            + "        }\n"
            + "        if (matrix[i][j] < min) {\n"
            + "            min = matrix[i][j];\n"
            + "        }\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "printf(\"Phan tu lon nhat: %d\\n\", max);\n"
            + "printf(\"Phan tu nho nhat: %d\\n\", min);",
            "int diagonalSum = 0;\n"
            + "for (int i = 0; i < ROWS; i++) {\n"
            + "    diagonalSum += matrix[i][i];\n"
            + "}\n"
            + "printf(\"Tong duong cheo chinh: %d\\n\", diagonalSum);",
            "int transpose[COLS][ROWS];\n"
            + "for (int i = 0; i < ROWS; i++) {\n"
            + "    for (int j = 0; j < COLS; j++) {\n"
            + "        transpose[j][i] = matrix[i][j];\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "// In ma trận chuyển vị\n"
            + "printf(\"Ma tran chuyen vi:\\n\");\n"
            + "for (int i = 0; i < COLS; i++) {\n"
            + "    for (int j = 0; j < ROWS; j++) {\n"
            + "        printf(\"%d\\t\", transpose[i][j]);\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "#define ROWS1 2\n"
            + "#define COLS1 3\n"
            + "#define ROWS2 3\n"
            + "#define COLS2 2\n"
            + "\n"
            + "int main() {\n"
            + "    int mat1[ROWS1][COLS1] = {{1, 2, 3}, {4, 5, 6}};\n"
            + "    int mat2[ROWS2][COLS2] = {{7, 8}, {9, 10}, {11, 12}};\n"
            + "    int result[ROWS1][COLS2] = {0};\n"
            + "    \n"
            + "    // Kiểm tra điều kiện nhân ma trận\n"
            + "    if (COLS1 != ROWS2) {\n"
            + "        printf(\"Khong the nhan hai ma tran nay!\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Thực hiện phép nhân\n"
            + "    for (int i = 0; i < ROWS1; i++) {\n"
            + "        for (int j = 0; j < COLS2; j++) {\n"
            + "            for (int k = 0; k < COLS1; k++) {\n"
            + "                result[i][j] += mat1[i][k] * mat2[k][j];\n"
            + "            }\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    // In kết quả\n"
            + "    printf(\"Ket qua nhan ma tran:\\n\");\n"
            + "    for (int i = 0; i < ROWS1; i++) {\n"
            + "        for (int j = 0; j < COLS2; j++) {\n"
            + "            printf(\"%d\\t\", result[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "void printMatrix(int mat[][3], int rows) {\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        for (int j = 0; j < 3; j++) {\n"
            + "            printf(\"%d\\t\", mat[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};\n"
            + "    printMatrix(matrix, 2);\n"
            + "    return 0;\n"
            + "}",
            "void printDynamicMatrix(int **mat, int rows, int cols) {\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        for (int j = 0; j < cols; j++) {\n"
            + "            printf(\"%d\\t\", mat[i][j]);\n"
            + "        }\n"
            + "        printf(\"\\n\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int rows = 2, cols = 3;\n"
            + "    int **matrix = (int **)malloc(rows * sizeof(int *));\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        matrix[i] = (int *)malloc(cols * sizeof(int));\n"
            + "        for (int j = 0; j < cols; j++) {\n"
            + "            matrix[i][j] = i * cols + j + 1;\n"
            + "        }\n"
            + "    }\n"
            + "    \n"
            + "    printDynamicMatrix(matrix, rows, cols);\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    for (int i = 0; i < rows; i++) {\n"
            + "        free(matrix[i]);\n"
            + "    }\n"
            + "    free(matrix);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khai báo chuỗi", new String[]{
            "char str1[10] = \"Hello\";  // Khai báo mảng 10 phần tử, khởi tạo với \"Hello\"",
            "char str2[] = \"World\";  // Kích thước tự động xác định (6 phần tử)",
            "char *str3 = \"Programming\";  // Con trỏ trỏ tới chuỗi hằng",
            "char str4[20];  // Khai báo mảng 20 ký tự chưa khởi tạo",
            "char days[7][10] = {\"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\", \"Sunday\"};",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Khai báo mảng ký tự\n"
            + "    char str1[10] = \"Hello\";\n"
            + "    printf(\"str1: %s, Length: %lu\\n\", str1, strlen(str1));\n"
            + "    \n"
            + "    // 2. Khai báo không chỉ định kích thước\n"
            + "    char str2[] = \"World\";\n"
            + "    printf(\"str2: %s, Size of array: %lu\\n\", str2, sizeof(str2));\n"
            + "    \n"
            + "    // 3. Khai báo con trỏ ký tự\n"
            + "    char *str3 = \"Programming\";\n"
            + "    printf(\"str3: %s, First character: %c\\n\", str3, *str3);\n"
            + "    \n"
            + "    // 4. Khai báo không khởi tạo\n"
            + "    char str4[20];\n"
            + "    strcpy(str4, \"C Language\");\n"
            + "    printf(\"str4: %s\\n\", str4);\n"
            + "    \n"
            + "    // 5. Khai báo nhiều chuỗi\n"
            + "    char days[7][10] = {\n"
            + "        \"Monday\", \"Tuesday\", \"Wednesday\", \n"
            + "        \"Thursday\", \"Friday\", \"Saturday\", \"Sunday\"\n"
            + "    };\n"
            + "    \n"
            + "    printf(\"\\nDays of week:\\n\");\n"
            + "    for(int i = 0; i < 7; i++) {\n"
            + "        printf(\"%d. %s\\n\", i+1, days[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "str1: Hello, Length: 5\n"
            + "str2: World, Size of array: 6\n"
            + "str3: Programming, First character: P\n"
            + "str4: C Language\n"
            + "\n"
            + "Days of week:\n"
            + "1. Monday\n"
            + "2. Tuesday\n"
            + "3. Wednesday\n"
            + "4. Thursday\n"
            + "5. Friday\n"
            + "6. Saturday\n"
            + "7. Sunday"
        });

        Code_MAP.put("Các hàm xử lý chuỗi", new String[]{
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello World\";\n"
            + "    printf(\"Độ dài chuỗi: %lu\\n\", strlen(str)); // 11\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char src[] = \"Hello\";\n"
            + "    char dest[20];\n"
            + "    \n"
            + "    strcpy(dest, src);\n"
            + "    printf(\"Chuỗi đích: %s\\n\", dest); // Hello\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[20] = \"Hello\";\n"
            + "    char str2[] = \" World\";\n"
            + "    \n"
            + "    strcat(str1, str2);\n"
            + "    printf(\"Chuỗi sau khi nối: %s\\n\", str1); // Hello World\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[] = \"apple\";\n"
            + "    char str2[] = \"banana\";\n"
            + "    \n"
            + "    int result = strcmp(str1, str2);\n"
            + "    if (result < 0) printf(\"'%s' nhỏ hơn '%s'\\n\", str1, str2);\n"
            + "    else if (result > 0) printf(\"'%s' lớn hơn '%s'\\n\", str1, str2);\n"
            + "    else printf(\"Hai chuỗi bằng nhau\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[] = \"apple\";\n"
            + "    char str2[] = \"appetizer\";\n"
            + "    \n"
            + "    int result = strncmp(str1, str2, 3);\n"
            + "    if (result == 0) printf(\"3 ký tự đầu giống nhau\\n\");\n"
            + "    else printf(\"3 ký tự đầu khác nhau\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello World\";\n"
            + "    char *ptr = strchr(str, 'o');\n"
            + "    \n"
            + "    if (ptr != NULL)\n"
            + "        printf(\"Tìm thấy 'o' tại vị trí: %ld\\n\", ptr - str); // 4\n"
            + "    else\n"
            + "        printf(\"Không tìm thấy\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello World\";\n"
            + "    char *ptr = strstr(str, \"World\");\n"
            + "    \n"
            + "    if (ptr != NULL)\n"
            + "        printf(\"Tìm thấy 'World' tại vị trí: %ld\\n\", ptr - str); // 6\n"
            + "    else\n"
            + "        printf(\"Không tìm thấy\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello,World,C,Programming\";\n"
            + "    char *token = strtok(str, \",\");\n"
            + "    \n"
            + "    while (token != NULL) {\n"
            + "        printf(\"%s\\n\", token);\n"
            + "        token = strtok(NULL, \",\");\n"
            + "    }\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello\";\n"
            + "    printf(\"Chuỗi đảo ngược: %s\\n\", strrev(str)); // olleH\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str[] = \"Hello World\";\n"
            + "    \n"
            + "    printf(\"Chuỗi chữ thường: %s\\n\", strlwr(str)); // hello world\n"
            + "    printf(\"Chuỗi chữ hoa: %s\\n\", strupr(str)); // HELLO WORLD\n"
            + "    return 0;\n"
            + "}",
            "#define __STDC_WANT_LIB_EXT1__ 1\n"
            + "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char src[] = \"Safe copy\";\n"
            + "    char dest[20];\n"
            + "    \n"
            + "    if (strcpy_s(dest, sizeof(dest), src) == 0)\n"
            + "        printf(\"Sao chép thành công: %s\\n\", dest);\n"
            + "    else\n"
            + "        printf(\"Lỗi sao chép\\n\");\n"
            + "    return 0;\n"
            + "}",
            "#define __STDC_WANT_LIB_EXT1__ 1\n"
            + "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[20] = \"Hello\";\n"
            + "    char str2[] = \" World\";\n"
            + "    \n"
            + "    if (strcat_s(str1, sizeof(str1), str2) == 0)\n"
            + "        printf(\"Nối thành công: %s\\n\", str1);\n"
            + "    else\n"
            + "        printf(\"Lỗi nối chuỗi\\n\");\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("So sánh và nối chuỗi", new String[]{
            "int strcmp(const char *str1, const char *str2);",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char str1[] = \"Hello\";\n"
            + "    char str2[] = \"World\";\n"
            + "    char str3[] = \"Hello\";\n"
            + "    \n"
            + "    // So sánh str1 và str2\n"
            + "    int result = strcmp(str1, str2);\n"
            + "    if (result == 0) {\n"
            + "        printf(\"str1 và str2 giống nhau\\n\");\n"
            + "    } else if (result < 0) {\n"
            + "        printf(\"str1 nhỏ hơn str2\\n\");\n"
            + "    } else {\n"
            + "        printf(\"str1 lớn hơn str2\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // So sánh str1 và str3\n"
            + "    result = strcmp(str1, str3);\n"
            + "    if (result == 0) {\n"
            + "        printf(\"str1 và str3 giống nhau\\n\");\n"
            + "    } else {\n"
            + "        printf(\"str1 và str3 khác nhau\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "char *strcat(char *dest, const char *src);",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char dest[50] = \"Xin chào \";\n"
            + "    char src[] = \"thế giới!\";\n"
            + "    \n"
            + "    // Nối chuỗi src vào dest\n"
            + "    strcat(dest, src);\n"
            + "    \n"
            + "    printf(\"Chuỗi sau khi nối: %s\\n\", dest);\n"
            + "    \n"
            + "    // Nối thêm một chuỗi nữa\n"
            + "    strcat(dest, \" Chào mừng bạn đến với C.\");\n"
            + "    printf(\"Chuỗi sau khi nối lần 2: %s\\n\", dest);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    char s1[20] = \"Hello\";\n"
            + "    char s2[] = \"Hello World\";\n"
            + "    char s3[50];\n"
            + "    \n"
            + "    // So sánh 5 ký tự đầu\n"
            + "    if (strncmp(s1, s2, 5) == 0) {\n"
            + "        printf(\"5 ký tự đầu giống nhau\\n\");\n"
            + "    } else {\n"
            + "        printf(\"5 ký tự đầu khác nhau\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // Nối 3 ký tự đầu của s2 vào s1\n"
            + "    strncat(s1, s2, 3);\n"
            + "    printf(\"s1 sau khi nối: %s\\n\", s1);\n"
            + "    \n"
            + "    // Sao chép chuỗi\n"
            + "    strcpy(s3, s1);\n"
            + "    printf(\"s3 sau khi sao chép: %s\\n\", s3);\n"
            + "    \n"
            + "    // Độ dài chuỗi\n"
            + "    printf(\"Độ dài s3: %lu\\n\", strlen(s3));\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khái niệm về con trỏ", new String[]{
            "int var = 10;    // Biến bình thường\n"
            + "int *ptr = &var; // Con trỏ ptr lưu địa chỉ của var",
            "kiểu_dữ_liệu *tên_con_trỏ;",
            "int *intPtr;    // Con trỏ đến kiểu int\n"
            + "float *floatPtr; // Con trỏ đến kiểu float\n"
            + "char *charPtr;  // Con trỏ đến kiểu char",
            "int num = 5;\n"
            + "int *ptr = &num; // ptr lưu địa chỉ của num\n"
            + "\n"
            + "printf(\"Địa chỉ của num: %p\\n\", &num);\n"
            + "printf(\"Giá trị của ptr: %p\\n\", ptr);\n"
            + "printf(\"Giá trị tại địa chỉ ptr trỏ đến: %d\\n\", *ptr);",
            "int arr[5] = {1, 2, 3, 4, 5};\n"
            + "int *ptr = arr; // ptr trỏ đến phần tử đầu tiên của mảng\n"
            + "\n"
            + "for(int i = 0; i < 5; i++) {\n"
            + "    printf(\"arr[%d] = %d\\n\", i, *(ptr + i));\n"
            + "}",
            "void tangGiaTri(int *n) {\n"
            + "    (*n)++;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 10;\n"
            + "    printf(\"Trước: %d\\n\", a); // 10\n"
            + "    tangGiaTri(&a);\n"
            + "    printf(\"Sau: %d\\n\", a);   // 11\n"
            + "    return 0;\n"
            + "}",
            "int value = 100;\n"
            + "int *ptr = &value;\n"
            + "int **ptrToPtr = &ptr;\n"
            + "\n"
            + "printf(\"Giá trị value: %d\\n\", value);\n"
            + "printf(\"Giá trị qua ptr: %d\\n\", *ptr);\n"
            + "printf(\"Giá trị qua ptrToPtr: %d\\n\", **ptrToPtr);",
            "int *ptr = NULL;\n"
            + "\n"
            + "if (ptr == NULL) {\n"
            + "    printf(\"Con trỏ không trỏ đến đâu cả\\n\");\n"
            + "} else {\n"
            + "    printf(\"Giá trị tại con trỏ: %d\\n\", *ptr);\n"
            + "}",
            "int cong(int a, int b) {\n"
            + "    return a + b;\n"
            + "}\n"
            + "\n"
            + "int tru(int a, int b) {\n"
            + "    return a - b;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int (*phepToan)(int, int); // Khai báo con trỏ hàm\n"
            + "    \n"
            + "    phepToan = cong;\n"
            + "    printf(\"5 + 3 = %d\\n\", phepToan(5, 3));\n"
            + "    \n"
            + "    phepToan = tru;\n"
            + "    printf(\"5 - 3 = %d\\n\", phepToan(5, 3));\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int *arr;\n"
            + "    int n = 5;\n"
            + "    \n"
            + "    // Cấp phát bộ nhớ động\n"
            + "    arr = (int*)malloc(n * sizeof(int));\n"
            + "    \n"
            + "    if (arr == NULL) {\n"
            + "        printf(\"Không đủ bộ nhớ\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    // Sử dụng mảng\n"
            + "    for(int i = 0; i < n; i++) {\n"
            + "        arr[i] = i * 10;\n"
            + "    }\n"
            + "    \n"
            + "    // Giải phóng bộ nhớ\n"
            + "    free(arr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "int num = 10;\n"
            + "float f = 3.14;\n"
            + "char c = 'A';\n"
            + "\n"
            + "void *ptr;\n"
            + "\n"
            + "ptr = &num;\n"
            + "printf(\"Giá trị int: %d\\n\", *(int*)ptr);\n"
            + "\n"
            + "ptr = &f;\n"
            + "printf(\"Giá trị float: %.2f\\n\", *(float*)ptr);\n"
            + "\n"
            + "ptr = &c;\n"
            + "printf(\"Giá trị char: %c\\n\", *(char*)ptr);"
        });

        Code_MAP.put("Khai báo con trỏ", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Khai báo biến thông thường\n"
            + "    int number = 10;\n"
            + "    float price = 25.5;\n"
            + "    char letter = 'A';\n"
            + "    \n"
            + "    // 2. Khai báo các con trỏ\n"
            + "    int *pNumber;    // Con trỏ tới số nguyên\n"
            + "    float *pPrice;   // Con trỏ tới số thực\n"
            + "    char *pLetter;   // Con trỏ tới ký tự\n"
            + "    \n"
            + "    // 3. Gán địa chỉ của biến cho con trỏ\n"
            + "    pNumber = &number;\n"
            + "    pPrice = &price;\n"
            + "    pLetter = &letter;\n"
            + "    \n"
            + "    // 4. In giá trị và địa chỉ\n"
            + "    printf(\"Giá trị của number: %d\\n\", number);\n"
            + "    printf(\"Địa chỉ của number: %p\\n\", (void*)&number);\n"
            + "    printf(\"Giá trị pNumber trỏ tới: %d\\n\", *pNumber);\n"
            + "    printf(\"Địa chỉ lưu trong pNumber: %p\\n\", (void*)pNumber);\n"
            + "    \n"
            + "    printf(\"\\nGiá trị của price: %.2f\\n\", price);\n"
            + "    printf(\"Địa chỉ của price: %p\\n\", (void*)&price);\n"
            + "    printf(\"Giá trị pPrice trỏ tới: %.2f\\n\", *pPrice);\n"
            + "    printf(\"Địa chỉ lưu trong pPrice: %p\\n\", (void*)pPrice);\n"
            + "    \n"
            + "    printf(\"\\nGiá trị của letter: %c\\n\", letter);\n"
            + "    printf(\"Địa chỉ của letter: %p\\n\", (void*)&letter);\n"
            + "    printf(\"Giá trị pLetter trỏ tới: %c\\n\", *pLetter);\n"
            + "    printf(\"Địa chỉ lưu trong pLetter: %p\\n\", (void*)pLetter);\n"
            + "    \n"
            + "    // 5. Thay đổi giá trị thông qua con trỏ\n"
            + "    *pNumber = 20;\n"
            + "    *pPrice = 30.75;\n"
            + "    *pLetter = 'B';\n"
            + "    \n"
            + "    printf(\"\\nSau khi thay đổi qua con trỏ:\\n\");\n"
            + "    printf(\"number = %d, price = %.2f, letter = %c\\n\", number, price, letter);\n"
            + "    \n"
            + "    // 6. Con trỏ NULL\n"
            + "    int *pNull = NULL; // Con trỏ không trỏ tới đâu\n"
            + "    if (pNull == NULL) {\n"
            + "        printf(\"\\nCon trỏ pNull là NULL, không trỏ tới địa chỉ hợp lệ\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Toán tử con trỏ", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 10;\n"
            + "    printf(\"Giá trị của var: %d\\n\", var);\n"
            + "    printf(\"Địa chỉ của var: %p\\n\", (void*)&var);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 20;\n"
            + "    int *ptr = &var;\n"
            + "    \n"
            + "    printf(\"Giá trị của var: %d\\n\", var);\n"
            + "    printf(\"Địa chỉ lưu trong ptr: %p\\n\", (void*)ptr);\n"
            + "    printf(\"Giá trị tại địa chỉ ptr trỏ tới: %d\\n\", *ptr);\n"
            + "    \n"
            + "    // Thay đổi giá trị thông qua con trỏ\n"
            + "    *ptr = 30;\n"
            + "    printf(\"Giá trị mới của var: %d\\n\", var);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 5, b = 10;\n"
            + "    int *ptr1, *ptr2;\n"
            + "    \n"
            + "    ptr1 = &a;  // ptr1 trỏ tới a\n"
            + "    ptr2 = &b;  // ptr2 trỏ tới b\n"
            + "    \n"
            + "    printf(\"Giá trị tại ptr1: %d\\n\", *ptr1);\n"
            + "    printf(\"Giá trị tại ptr2: %d\\n\", *ptr2);\n"
            + "    \n"
            + "    ptr2 = ptr1;  // ptr2 giờ cũng trỏ tới a\n"
            + "    printf(\"Giá trị tại ptr2 sau khi gán: %d\\n\", *ptr2);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[] = {10, 20, 30, 40, 50};\n"
            + "    int *ptr = arr;  // ptr trỏ tới phần tử đầu tiên\n"
            + "    \n"
            + "    printf(\"Phần tử đầu tiên: %d\\n\", *ptr);\n"
            + "    \n"
            + "    ptr++;  // Di chuyển tới phần tử tiếp theo\n"
            + "    printf(\"Phần tử thứ hai: %d\\n\", *ptr);\n"
            + "    \n"
            + "    ptr += 2;  // Nhảy qua 2 phần tử\n"
            + "    printf(\"Phần tử thứ tư: %d\\n\", *ptr);\n"
            + "    \n"
            + "    ptr--;  // Lùi lại 1 phần tử\n"
            + "    printf(\"Phần tử thứ ba: %d\\n\", *ptr);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int arr[] = {10, 20, 30, 40, 50};\n"
            + "    int *ptr1 = &arr[1];\n"
            + "    int *ptr2 = &arr[3];\n"
            + "    \n"
            + "    if (ptr1 < ptr2) {\n"
            + "        printf(\"ptr1 trỏ tới phần tử đứng trước ptr2 trong mảng\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    if (ptr1 != NULL) {\n"
            + "        printf(\"ptr1 không phải là con trỏ NULL\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // So sánh sau khi thay đổi\n"
            + "    ptr1 += 2;\n"
            + "    if (ptr1 == ptr2) {\n"
            + "        printf(\"ptr1 và ptr2 giờ trỏ tới cùng một phần tử\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 100;\n"
            + "    int *ptr = &var;\n"
            + "    int **pptr = &ptr;\n"
            + "    \n"
            + "    printf(\"Giá trị của var: %d\\n\", var);\n"
            + "    printf(\"Giá trị thông qua ptr: %d\\n\", *ptr);\n"
            + "    printf(\"Giá trị thông qua pptr: %d\\n\", **pptr);\n"
            + "    \n"
            + "    // Thay đổi giá trị thông qua con trỏ cấp 2\n"
            + "    **pptr = 200;\n"
            + "    printf(\"Giá trị mới của var: %d\\n\", var);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "typedef struct {\n"
            + "    int id;\n"
            + "    char name[50];\n"
            + "} Employee;\n"
            + "\n"
            + "int main() {\n"
            + "    Employee emp = {1, \"Nguyen Van A\"};\n"
            + "    Employee *ptr = &emp;\n"
            + "    \n"
            + "    // Truy cập bằng toán tử arrow\n"
            + "    printf(\"ID: %d, Name: %s\\n\", ptr->id, ptr->name);\n"
            + "    \n"
            + "    // Tương đương với\n"
            + "    printf(\"ID: %d, Name: %s\\n\", (*ptr).id, (*ptr).name);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Cú pháp định nghĩa hàm", new String[]{
            "return_type function_name(parameter1_type parameter1_name, parameter2_type parameter2_name, ...) {\n"
            + "    // Function body\n"
            + "    // Các câu lệnh thực thi\n"
            + "    [return value;] // Nếu có kiểu trả về khác void\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng 2 số nguyên\n"
            + "int sum(int a, int b) {          // int: kiểu trả về\n"
            + "                                 // sum: tên hàm\n"
            + "                                 // (int a, int b): tham số\n"
            + "    int result = a + b;          // Thân hàm\n"
            + "    return result;               // Trả về giá trị\n"
            + "}\n"
            + "\n"
            + "// Hàm không trả về giá trị, không tham số\n"
            + "void printHello() {              // void: không trả về giá trị\n"
            + "                                // printHello: tên hàm\n"
            + "                                // (): không có tham số\n"
            + "    printf(\"Hello World!\\n\");   // Thân hàm\n"
            + "                                // Không có return\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 3;\n"
            + "    int total = sum(x, y);      // Gọi hàm sum\n"
            + "    printf(\"Sum: %d\\n\", total);\n"
            + "    \n"
            + "    printHello();               // Gọi hàm printHello\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Gọi hàm", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng 2 số\n"
            + "int tinhTong(int a, int b) {\n"
            + "    return a + b;\n"
            + "}\n"
            + "\n"
            + "// Hàm không có tham số\n"
            + "void inThongBao() {\n"
            + "    printf(\"Xin chao ban!\\n\");\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // 1. Gọi hàm có trả về giá trị\n"
            + "    int ketQua = tinhTong(5, 3); // tinhTong là tên hàm, 5 và 3 là đối số\n"
            + "    printf(\"Tong la: %d\\n\", ketQua);\n"
            + "    \n"
            + "    // 2. Gọi hàm không có tham số\n"
            + "    inThongBao(); // inThongBao là tên hàm, không có đối số\n"
            + "    \n"
            + "    // 3. Gọi hàm và sử dụng kết quả trực tiếp\n"
            + "    printf(\"Tong cua 10 va 20 la: %d\\n\", tinhTong(10, 20));\n"
            + "    \n"
            + "    // 4. Gọi hàm từ thư viện chuẩn\n"
            + "    printf(\"Hien thi thong diep\\n\"); // printf là hàm từ thư viện stdio.h\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Hàm trả về giá trị", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng 2 số nguyên - trả về kiểu int\n"
            + "int tinhTong(int a, int b) {\n"
            + "    int tong = a + b;  // Thân hàm - tính toán giá trị\n"
            + "    return tong;       // Trả về giá trị tổng\n"
            + "}\n"
            + "\n"
            + "// Hàm kiểm tra số chẵn - trả về kiểu int (0 hoặc 1)\n"
            + "int laSoChan(int num) {\n"
            + "    if(num % 2 == 0) {\n"
            + "        return 1;  // Là số chẵn - trả về 1\n"
            + "    }\n"
            + "    return 0;      // Không phải số chẵn - trả về 0\n"
            + "}\n"
            + "\n"
            + "// Hàm tìm số lớn nhất trong 3 số - trả về kiểu float\n"
            + "float timMax(float x, float y, float z) {\n"
            + "    float max = x;\n"
            + "    if(y > max) max = y;\n"
            + "    if(z > max) max = z;\n"
            + "    return max;  // Trả về giá trị lớn nhất\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    // Gọi hàm tinhTong\n"
            + "    int ketQua = tinhTong(5, 7);\n"
            + "    printf(\"Tong la: %d\\n\", ketQua);\n"
            + "    \n"
            + "    // Gọi hàm laSoChan\n"
            + "    int so = 10;\n"
            + "    if(laSoChan(so)) {\n"
            + "        printf(\"%d la so chan\\n\", so);\n"
            + "    } else {\n"
            + "        printf(\"%d khong phai so chan\\n\", so);\n"
            + "    }\n"
            + "    \n"
            + "    // Gọi hàm timMax\n"
            + "    float max = timMax(3.2, 5.4, 4.1);\n"
            + "    printf(\"So lon nhat la: %.2f\\n\", max);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Truyền tham số theo giá trị", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm hoán đổi giá trị sử dụng truyền tham số theo giá trị\n"
            + "void swapByValue(int a, int b) {\n"
            + "    int temp = a;\n"
            + "    a = b;\n"
            + "    b = temp;\n"
            + "    printf(\"Trong hàm swapByValue: a = %d, b = %d\\n\", a, b);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 10;\n"
            + "    \n"
            + "    printf(\"Trước khi gọi hàm swapByValue: x = %d, y = %d\\n\", x, y);\n"
            + "    \n"
            + "    // Gọi hàm và truyền giá trị của x và y\n"
            + "    swapByValue(x, y);\n"
            + "    \n"
            + "    printf(\"Sau khi gọi hàm swapByValue: x = %d, y = %d\\n\", x, y);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "Trước khi gọi hàm swapByValue: x = 5, y = 10\n"
            + "Trong hàm swapByValue: a = 10, b = 5\n"
            + "Sau khi gọi hàm swapByValue: x = 5, y = 10"
        });

        Code_MAP.put("Truyền tham số theo tham chiếu", new String[]{
            "void tenHam(kieuDuLieu *tenThamSo) {\n"
            + "    // Thao tác với *tenThamSo để thay đổi giá trị gốc\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm hoán đổi sử dụng truyền tham chiếu (con trỏ)\n"
            + "void swap(int *a, int *b) {\n"
            + "    int temp = *a;\n"
            + "    *a = *b;\n"
            + "    *b = temp;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 10;\n"
            + "    \n"
            + "    printf(\"Truoc khi swap: x = %d, y = %d\\n\", x, y);\n"
            + "    swap(&x, &y); // Truyền địa chỉ của x và y\n"
            + "    printf(\"Sau khi swap: x = %d, y = %d\\n\", x, y);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "void tangGiaTri(int *n) {\n"
            + "    (*n)++; // Tăng giá trị tại địa chỉ n lên 1\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int a = 10;\n"
            + "    \n"
            + "    printf(\"Truoc khi goi ham: a = %d\\n\", a);\n"
            + "    tangGiaTri(&a); // Truyền địa chỉ của a\n"
            + "    printf(\"Sau khi goi ham: a = %d\\n\", a);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm nhân đôi các phần tử mảng (truyền mảng là truyền tham chiếu)\n"
            + "void nhanDoiMang(int arr[], int size) {\n"
            + "    for (int i = 0; i < size; i++) {\n"
            + "        arr[i] *= 2; // Thay đổi trực tiếp mảng gốc\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int mang[] = {1, 2, 3, 4, 5};\n"
            + "    int n = sizeof(mang) / sizeof(mang[0]);\n"
            + "    \n"
            + "    printf(\"Mang truoc khi thay doi: \");\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        printf(\"%d \", mang[i]);\n"
            + "    }\n"
            + "    \n"
            + "    nhanDoiMang(mang, n); // Mảng luôn được truyền theo tham chiếu\n"
            + "    \n"
            + "    printf(\"\\nMang sau khi thay doi: \");\n"
            + "    for (int i = 0; i < n; i++) {\n"
            + "        printf(\"%d \", mang[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Sử dụng con trỏ để truyền tham số", new String[]{
            "// Khai báo hàm với tham số con trỏ\n"
            + "void tenHam(kieuDuLieu *tenConTro) {\n"
            + "    // Thao tác với giá trị tại địa chỉ con trỏ\n"
            + "    *tenConTro = giaTriMoi;\n"
            + "}\n"
            + "\n"
            + "// Gọi hàm và truyền địa chỉ\n"
            + "tenHam(&bienGoc);",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm hoán đổi giá trị sử dụng con trỏ\n"
            + "void swap(int *a, int *b) {\n"
            + "    int temp = *a;\n"
            + "    *a = *b;\n"
            + "    *b = temp;\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int x = 5, y = 10;\n"
            + "    \n"
            + "    printf(\"Truoc khi swap: x = %d, y = %d\\n\", x, y);\n"
            + "    swap(&x, &y); // Truyền địa chỉ của x và y\n"
            + "    printf(\"Sau khi swap: x = %d, y = %d\\n\", x, y);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tăng giá trị lên 1\n"
            + "void increment(int *num) {\n"
            + "    (*num)++; // Tăng giá trị tại địa chỉ num lên 1\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int value = 5;\n"
            + "    \n"
            + "    printf(\"Truoc khi increment: %d\\n\", value);\n"
            + "    increment(&value);\n"
            + "    printf(\"Sau khi increment: %d\\n\", value);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm nhân đôi các phần tử mảng\n"
            + "void doubleArray(int *arr, int size) {\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        *(arr + i) *= 2; // arr[i] *= 2;\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int numbers[] = {1, 2, 3, 4, 5};\n"
            + "    int size = sizeof(numbers)/sizeof(numbers[0]);\n"
            + "    \n"
            + "    printf(\"Mang truoc khi doi:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    doubleArray(numbers, size); // numbers là con trỏ đến phần tử đầu tiên\n"
            + "    \n"
            + "    printf(\"\\nMang sau khi doi:\\n\");\n"
            + "    for(int i = 0; i < size; i++) {\n"
            + "        printf(\"%d \", numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm chỉ đọc giá trị, không thay đổi\n"
            + "void printValue(const int *ptr) {\n"
            + "    printf(\"Gia tri: %d\\n\", *ptr);\n"
            + "    // *ptr = 10; // Lỗi biên dịch vì ptr là const\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 5;\n"
            + "    printValue(&num);\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Khái niệm hàm đệ quy", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính giai thừa sử dụng đệ quy\n"
            + "unsigned long long factorial(int n) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0 || n == 1)\n"
            + "        return 1;\n"
            + "    // Phần đệ quy\n"
            + "    else\n"
            + "        return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 5;\n"
            + "    printf(\"Giai thừa của %d là %llu\\n\", num, factorial(num));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính số Fibonacci sử dụng đệ quy\n"
            + "int fibonacci(int n) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0)\n"
            + "        return 0;\n"
            + "    else if (n == 1)\n"
            + "        return 1;\n"
            + "    // Phần đệ quy (gọi đệ quy 2 lần)\n"
            + "    else\n"
            + "        return fibonacci(n - 1) + fibonacci(n - 2);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int n = 6;\n"
            + "    printf(\"Số Fibonacci thứ %d là %d\\n\", n, fibonacci(n));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng sử dụng đệ quy đuôi\n"
            + "int sum(int n, int accumulator) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0)\n"
            + "        return accumulator;\n"
            + "    // Phần đệ quy (đệ quy đuôi)\n"
            + "    else\n"
            + "        return sum(n - 1, accumulator + n);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 100;\n"
            + "    printf(\"Tổng các số từ 1 đến %d là %d\\n\", num, sum(num, 0));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Khai báo nguyên mẫu hàm\n"
            + "int isOdd(int n);\n"
            + "\n"
            + "// Hàm kiểm tra số chẵn\n"
            + "int isEven(int n) {\n"
            + "    if (n == 0)\n"
            + "        return 1; // true\n"
            + "    else\n"
            + "        return isOdd(n - 1); // Gọi hàm khác\n"
            + "}\n"
            + "\n"
            + "// Hàm kiểm tra số lẻ\n"
            + "int isOdd(int n) {\n"
            + "    if (n == 0)\n"
            + "        return 0; // false\n"
            + "    else\n"
            + "        return isEven(n - 1); // Gọi hàm khác\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 7;\n"
            + "    if (isEven(num))\n"
            + "        printf(\"%d là số chẵn\\n\", num);\n"
            + "    else\n"
            + "        printf(\"%d là số lẻ\\n\", num);\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Cách hoạt động của hàm đệ quy", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính giai thừa bằng đệ quy\n"
            + "int factorial(int n) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0 || n == 1) {\n"
            + "        return 1;\n"
            + "    }\n"
            + "    // Phần đệ quy\n"
            + "    return n * factorial(n - 1);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 5;\n"
            + "    printf(\"Giai thừa của %d là %d\\n\", num, factorial(num));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính số Fibonacci bằng đệ quy\n"
            + "int fibonacci(int n) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0) return 0;\n"
            + "    if (n == 1) return 1;\n"
            + "    \n"
            + "    // Phần đệ quy\n"
            + "    return fibonacci(n - 1) + fibonacci(n - 2);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int n = 10;\n"
            + "    printf(\"Số Fibonacci thứ %d là %d\\n\", n, fibonacci(n));\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm tính tổng từ 1 đến n bằng đệ quy đuôi\n"
            + "int sum(int n, int accumulator) {\n"
            + "    // Điều kiện dừng\n"
            + "    if (n == 0) return accumulator;\n"
            + "    \n"
            + "    // Phần đệ quy đuôi\n"
            + "    return sum(n - 1, accumulator + n);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int num = 100;\n"
            + "    printf(\"Tổng từ 1 đến %d là %d\\n\", num, sum(num, 0));\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Ví dụ về hàm đệ quy", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "// Hàm đệ quy tính giai thừa\n"
            + "unsigned long long factorial(int n) {\n"
            + "    // 1. Điều kiện dừng\n"
            + "    if (n == 0 || n == 1) {\n"
            + "        return 1;\n"
            + "    }\n"
            + "    // 2. Phần đệ quy\n"
            + "    else {\n"
            + "        return n * factorial(n - 1);\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int number;\n"
            + "    printf(\"Nhập một số nguyên dương: \");\n"
            + "    scanf(\"%d\", &number);\n"
            + "    \n"
            + "    // Kiểm tra số nhập vào có hợp lệ không\n"
            + "    if (number < 0) {\n"
            + "        printf(\"Lỗi: Giai thừa chỉ tính được cho số nguyên dương.\\n\");\n"
            + "    } else {\n"
            + "        unsigned long long result = factorial(number);\n"
            + "        printf(\"Giai thừa của %d là %llu\\n\", number, result);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Cấu trúc dữ liệu cơ bản", new String[]{
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo mảng 5 phần tử kiểu int\n"
            + "    int numbers[5] = {10, 20, 30, 40, 50};\n"
            + "    \n"
            + "    // Truy cập và in các phần tử\n"
            + "    for(int i = 0; i < 5; i++) {\n"
            + "        printf(\"numbers[%d] = %d\\n\", i, numbers[i]);\n"
            + "    }\n"
            + "    \n"
            + "    // Thay đổi giá trị phần tử\n"
            + "    numbers[2] = 35;\n"
            + "    printf(\"\\nAfter modification:\\n\");\n"
            + "    printf(\"numbers[2] = %d\\n\", numbers[2]);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo chuỗi\n"
            + "    char greeting1[] = \"Hello\"; // Tự động thêm '\\0'\n"
            + "    char greeting2[6] = {'H', 'e', 'l', 'l', 'o', '\\0'};\n"
            + "    \n"
            + "    printf(\"greeting1: %s\\n\", greeting1);\n"
            + "    printf(\"greeting2: %s\\n\", greeting2);\n"
            + "    \n"
            + "    // Sử dụng hàm thư viện string.h\n"
            + "    printf(\"Length of greeting1: %lu\\n\", strlen(greeting1));\n"
            + "    \n"
            + "    // Nối chuỗi\n"
            + "    strcat(greeting1, \" World!\");\n"
            + "    printf(\"After concatenation: %s\\n\", greeting1);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "// Định nghĩa struct\n"
            + "struct Student {\n"
            + "    int id;\n"
            + "    char name[50];\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    // Khai báo biến struct\n"
            + "    struct Student student1;\n"
            + "    \n"
            + "    // Gán giá trị\n"
            + "    student1.id = 101;\n"
            + "    strcpy(student1.name, \"Nguyen Van A\");\n"
            + "    student1.gpa = 3.75;\n"
            + "    \n"
            + "    // Khai báo và khởi tạo cùng lúc\n"
            + "    struct Student student2 = {102, \"Tran Thi B\", 3.9};\n"
            + "    \n"
            + "    // Truy cập thành viên\n"
            + "    printf(\"Student 1:\\n\");\n"
            + "    printf(\"ID: %d\\nName: %s\\nGPA: %.2f\\n\", \n"
            + "           student1.id, student1.name, student1.gpa);\n"
            + "    \n"
            + "    printf(\"\\nStudent 2:\\n\");\n"
            + "    printf(\"ID: %d\\nName: %s\\nGPA: %.2f\\n\", \n"
            + "           student2.id, student2.name, student2.gpa);\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "union Data {\n"
            + "    int i;\n"
            + "    float f;\n"
            + "    char str[20];\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    union Data data;\n"
            + "    \n"
            + "    data.i = 10;\n"
            + "    printf(\"data.i: %d\\n\", data.i);\n"
            + "    \n"
            + "    data.f = 3.14;\n"
            + "    printf(\"data.f: %.2f\\n\", data.f);\n"
            + "    \n"
            + "    strcpy(data.str, \"C Programming\");\n"
            + "    printf(\"data.str: %s\\n\", data.str);\n"
            + "    \n"
            + "    // Kích thước union\n"
            + "    printf(\"Size of union Data: %lu bytes\\n\", sizeof(union Data));\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "// Định nghĩa enum\n"
            + "enum Days {\n"
            + "    Sunday,    // 0\n"
            + "    Monday,    // 1\n"
            + "    Tuesday,   // 2\n"
            + "    Wednesday, // 3\n"
            + "    Thursday,  // 4\n"
            + "    Friday,    // 5\n"
            + "    Saturday   // 6\n"
            + "};\n"
            + "\n"
            + "enum Status {\n"
            + "    Active = 1,\n"
            + "    Inactive = 0,\n"
            + "    Pending = 2\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    enum Days today = Wednesday;\n"
            + "    printf(\"Today is %d (Wednesday)\\n\", today);\n"
            + "    \n"
            + "    enum Status userStatus = Active;\n"
            + "    printf(\"User status: %d\\n\", userStatus);\n"
            + "    \n"
            + "    // Duyệt qua các giá trị enum\n"
            + "    for(int day = Sunday; day <= Saturday; day++) {\n"
            + "        printf(\"Day %d\\n\", day);\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    int var = 20;\n"
            + "    int *ptr;  // Khai báo con trỏ\n"
            + "    \n"
            + "    ptr = &var; // Lưu địa chỉ của var vào ptr\n"
            + "    \n"
            + "    printf(\"Address of var: %p\\n\", &var);\n"
            + "    printf(\"Value stored in ptr: %p\\n\", ptr);\n"
            + "    printf(\"Value pointed by ptr: %d\\n\", *ptr);\n"
            + "    \n"
            + "    // Thay đổi giá trị thông qua con trỏ\n"
            + "    *ptr = 30;\n"
            + "    printf(\"New value of var: %d\\n\", var);\n"
            + "    \n"
            + "    // Con trỏ và mảng\n"
            + "    int arr[3] = {10, 20, 30};\n"
            + "    int *arrPtr = arr; // arrPtr trỏ đến phần tử đầu tiên\n"
            + "    \n"
            + "    for(int i = 0; i < 3; i++) {\n"
            + "        printf(\"arr[%d] = %d\\n\", i, *(arrPtr + i));\n"
            + "    }\n"
            + "    \n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "// Định nghĩa node\n"
            + "struct Node {\n"
            + "    int data;\n"
            + "    struct Node* next;\n"
            + "};\n"
            + "\n"
            + "// Hàm thêm node vào đầu danh sách\n"
            + "void push(struct Node** head_ref, int new_data) {\n"
            + "    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));\n"
            + "    new_node->data = new_data;\n"
            + "    new_node->next = (*head_ref);\n"
            + "    (*head_ref) = new_node;\n"
            + "}\n"
            + "\n"
            + "// Hàm in danh sách\n"
            + "void printList(struct Node* node) {\n"
            + "    while (node != NULL) {\n"
            + "        printf(\"%d \", node->data);\n"
            + "        node = node->next;\n"
            + "    }\n"
            + "    printf(\"\\n\");\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    struct Node* head = NULL;\n"
            + "    \n"
            + "    push(&head, 3);\n"
            + "    push(&head, 2);\n"
            + "    push(&head, 1);\n"
            + "    \n"
            + "    printf(\"Linked list: \");\n"
            + "    printList(head);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("File I/O trong C", new String[]{
            "FILE *fopen(const char *filename, const char *mode);",
            "FILE *fptr;\n"
            + "fptr = fopen(\"file.txt\", \"w\");\n"
            + "if (fptr == NULL) {\n"
            + "    printf(\"Khong the mo file.\\n\");\n"
            + "    exit(1);\n"
            + "}",
            "int fclose(FILE *stream);",
            "fclose(fptr);",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    fptr = fopen(\"example.txt\", \"w\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    fprintf(fptr, \"Xin chao the gioi!\\n\");\n"
            + "    fputs(\"Day la dong thu hai.\\n\", fptr);\n"
            + "    fputc('A', fptr);\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    char buffer[255];\n"
            + "    \n"
            + "    fptr = fopen(\"example.txt\", \"r\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    // Đọc từng dòng\n"
            + "    while (fgets(buffer, 255, fptr) != NULL) {\n"
            + "        printf(\"%s\", buffer);\n"
            + "    }\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "size_t fwrite(const void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int age;\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    struct Student s1 = {\"Nguyen Van A\", 20, 3.5};\n"
            + "    \n"
            + "    fptr = fopen(\"student.dat\", \"wb\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    fwrite(&s1, sizeof(struct Student), 1, fptr);\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "struct Student {\n"
            + "    char name[50];\n"
            + "    int age;\n"
            + "    float gpa;\n"
            + "};\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    struct Student s;\n"
            + "    \n"
            + "    fptr = fopen(\"student.dat\", \"rb\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    fread(&s, sizeof(struct Student), 1, fptr);\n"
            + "    \n"
            + "    printf(\"Ten: %s\\nTuoi: %d\\nGPA: %.2f\\n\", s.name, s.age, s.gpa);\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    fptr = fopen(\"example.txt\", \"r+\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        printf(\"Loi khi mo file!\");\n"
            + "        exit(1);\n"
            + "    }\n"
            + "    \n"
            + "    // Di chuyển đến byte thứ 10\n"
            + "    fseek(fptr, 10, SEEK_SET);\n"
            + "    \n"
            + "    // Lấy vị trí hiện tại\n"
            + "    long pos = ftell(fptr);\n"
            + "    printf(\"Vi tri hien tai: %ld\\n\", pos);\n"
            + "    \n"
            + "    // Quay về đầu file\n"
            + "    rewind(fptr);\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "\n"
            + "int main() {\n"
            + "    FILE *fptr;\n"
            + "    int c;\n"
            + "    \n"
            + "    fptr = fopen(\"example.txt\", \"r\");\n"
            + "    \n"
            + "    if (fptr == NULL) {\n"
            + "        perror(\"Loi khi mo file\");\n"
            + "        exit(EXIT_FAILURE);\n"
            + "    }\n"
            + "    \n"
            + "    while ((c = fgetc(fptr)) != EOF) {\n"
            + "        putchar(c);\n"
            + "    }\n"
            + "    \n"
            + "    if (feof(fptr)) {\n"
            + "        printf(\"\\nDa den cuoi file.\\n\");\n"
            + "    } else if (ferror(fptr)) {\n"
            + "        printf(\"\\nCo loi khi doc file.\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "    return 0;\n"
            + "}",
            "#include <stdio.h>\n"
            + "#include <stdlib.h>\n"
            + "#include <string.h>\n"
            + "\n"
            + "typedef struct {\n"
            + "    char id[10];\n"
            + "    char name[50];\n"
            + "    float score;\n"
            + "} Student;\n"
            + "\n"
            + "void addStudent() {\n"
            + "    FILE *fptr = fopen(\"students.dat\", \"ab\");\n"
            + "    if (fptr == NULL) {\n"
            + "        perror(\"Loi mo file\");\n"
            + "        return;\n"
            + "    }\n"
            + "    \n"
            + "    Student s;\n"
            + "    printf(\"Nhap ma SV: \"); scanf(\"%s\", s.id);\n"
            + "    printf(\"Nhap ten SV: \"); scanf(\" %[^\\n]\", s.name);\n"
            + "    printf(\"Nhap diem: \"); scanf(\"%f\", &s.score);\n"
            + "    \n"
            + "    fwrite(&s, sizeof(Student), 1, fptr);\n"
            + "    fclose(fptr);\n"
            + "}\n"
            + "\n"
            + "void displayStudents() {\n"
            + "    FILE *fptr = fopen(\"students.dat\", \"rb\");\n"
            + "    if (fptr == NULL) {\n"
            + "        perror(\"Loi mo file\");\n"
            + "        return;\n"
            + "    }\n"
            + "    \n"
            + "    Student s;\n"
            + "    printf(\"\\n%-10s %-20s %-10s\\n\", \"Ma SV\", \"Ten SV\", \"Diem\");\n"
            + "    printf(\"----------------------------------------\\n\");\n"
            + "    \n"
            + "    while (fread(&s, sizeof(Student), 1, fptr) == 1) {\n"
            + "        printf(\"%-10s %-20s %-10.2f\\n\", s.id, s.name, s.score);\n"
            + "    }\n"
            + "    \n"
            + "    fclose(fptr);\n"
            + "}\n"
            + "\n"
            + "int main() {\n"
            + "    int choice;\n"
            + "    \n"
            + "    do {\n"
            + "        printf(\"\\n1. Them sinh vien\");\n"
            + "        printf(\"\\n2. Hien thi danh sach\");\n"
            + "        printf(\"\\n0. Thoat\");\n"
            + "        printf(\"\\nLua chon cua ban: \");\n"
            + "        scanf(\"%d\", &choice);\n"
            + "        \n"
            + "        switch(choice) {\n"
            + "            case 1:\n"
            + "                addStudent();\n"
            + "                break;\n"
            + "            case 2:\n"
            + "                displayStudents();\n"
            + "                break;\n"
            + "            case 0:\n"
            + "                printf(\"Thoat chuong trinh.\\n\");\n"
            + "                break;\n"
            + "            default:\n"
            + "                printf(\"Lua chon khong hop le.\\n\");\n"
            + "        }\n"
            + "    } while (choice != 0);\n"
            + "    \n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("Các hàm file I/O", new String[]{
            "FILE *fopen(const char *filename, const char *mode);",
            "FILE *file = fopen(\"example.txt\", \"w\");\n"
            + "if (file == NULL) {\n"
            + "    printf(\"Không thể mở file\\n\");\n"
            + "    return 1;\n"
            + "}",
            "int fclose(FILE *stream);",
            "fclose(file);",
            "int fprintf(FILE *stream, const char *format, ...);",
            "fprintf(file, \"Hello, World!\\n\");\n"
            + "fprintf(file, \"Giá trị: %d\\n\", 42);",
            "int fputs(const char *str, FILE *stream);",
            "fputs(\"This is a string.\\n\", file);",
            "int fputc(int char, FILE *stream);",
            "fputc('A', file);",
            "size_t fwrite(const void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "int data[5] = {1, 2, 3, 4, 5};\n"
            + "fwrite(data, sizeof(int), 5, file);",
            "int fscanf(FILE *stream, const char *format, ...);",
            "int num;\n"
            + "fscanf(file, \"%d\", &num);",
            "char *fgets(char *str, int n, FILE *stream);",
            "char buffer[100];\n"
            + "fgets(buffer, 100, file);",
            "int fgetc(FILE *stream);",
            "char c = fgetc(file);",
            "size_t fread(void *ptr, size_t size, size_t nmemb, FILE *stream);",
            "int data[5];\n"
            + "fread(data, sizeof(int), 5, file);",
            "int feof(FILE *stream);",
            "while (!feof(file)) {\n"
            + "    // Đọc dữ liệu\n"
            + "}",
            "int ferror(FILE *stream);",
            "if (ferror(file)) {\n"
            + "    printf(\"Lỗi khi đọc file\\n\");\n"
            + "}",
            "int fseek(FILE *stream, long int offset, int whence);",
            "fseek(file, 0, SEEK_SET); // Di chuyển về đầu file",
            "long int ftell(FILE *stream);",
            "long pos = ftell(file);",
            "void rewind(FILE *stream);",
            "rewind(file);",
            "#include <stdio.h>\n"
            + "\n"
            + "int main() {\n"
            + "    // Ghi file\n"
            + "    FILE *file = fopen(\"example.txt\", \"w\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file để ghi\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    fprintf(file, \"Đây là dòng đầu tiên\\n\");\n"
            + "    fputs(\"Đây là dòng thứ hai\\n\", file);\n"
            + "    fputc('A', file);\n"
            + "    fputc('\\n', file);\n"
            + "    \n"
            + "    int data[5] = {1, 2, 3, 4, 5};\n"
            + "    fwrite(data, sizeof(int), 5, file);\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    \n"
            + "    // Đọc file\n"
            + "    file = fopen(\"example.txt\", \"r\");\n"
            + "    if (file == NULL) {\n"
            + "        printf(\"Không thể mở file để đọc\\n\");\n"
            + "        return 1;\n"
            + "    }\n"
            + "    \n"
            + "    char buffer[100];\n"
            + "    printf(\"Nội dung file:\\n\");\n"
            + "    \n"
            + "    // Đọc từng dòng\n"
            + "    while (fgets(buffer, 100, file) != NULL) {\n"
            + "        printf(\"%s\", buffer);\n"
            + "    }\n"
            + "    \n"
            + "    // Kiểm tra lỗi\n"
            + "    if (ferror(file)) {\n"
            + "        printf(\"Lỗi khi đọc file\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    // Kiểm tra cuối file\n"
            + "    if (feof(file)) {\n"
            + "        printf(\"\\nĐã đọc hết file\\n\");\n"
            + "    }\n"
            + "    \n"
            + "    fclose(file);\n"
            + "    return 0;\n"
            + "}"
        });

        Code_MAP.put("", new String[]{});

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
