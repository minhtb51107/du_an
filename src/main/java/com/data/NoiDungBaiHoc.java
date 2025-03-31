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
