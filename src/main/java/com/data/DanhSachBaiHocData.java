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
public class DanhSachBaiHocData {

    private static final Map<String, String[]> TITLE_MAP = new HashMap<>();

    static {
        TITLE_MAP.put("Giới thiệu SQL", new String[]{
            "SQL là gì?",
            "Lịch sử và ứng dụng của SQL",
            "Các hệ quản trị cơ sở dữ liệu phổ biến"
        });

        TITLE_MAP.put("Các lệnh truy vấn dữ liệu cơ bản", new String[]{
            "SELECT",
            "INSERT",
            "UPDATE",
            "DELETE"
        });

        TITLE_MAP.put("Kiểu dữ liệu và toán tử", new String[]{
            "Kiểu dữ liệu số, chuỗi, ngày tháng",
            "Toán tử số học, so sánh, logic"
        });

        TITLE_MAP.put("Các hàm SQL cơ bản", new String[]{
            "Hàm tổng hợp",
            "Hàm xử lý chuỗi",
            "Hàm xử lý ngày tháng"
        });

        TITLE_MAP.put("Ràng buộc SQL(Constraints)", new String[]{
            "PRIMARY KEY, FOREIGN KEY",
            "UNIQUE, CHECK, NOT NULL",
            "DEFAULT"
        });

        TITLE_MAP.put("Quản lý cơ sở dữ liệu", new String[]{
            "Tạo, xóa cơ sở dữ liệu",
            "Sao lưu và phục hồi",
            "Quản lý quyền truy cập"
        });

        TITLE_MAP.put("Quản lý bảng", new String[]{
            "Tạo, xóa, sửa bảng",
            "Tăng giá trị tự động",
            "Tạo, xóa VIEW"
        });

        TITLE_MAP.put("Kết hợp dữ liệu", new String[]{
            "JOIN",
            "SELF JOIN",
            "UNION"
        });

        TITLE_MAP.put("Nhóm và tính toán dữ liệu", new String[]{
            "GROUP BY",
            "Hàm tổng hợp",
            "HAVING"
        });

        TITLE_MAP.put("Xử lý chuỗi và dữ liệu", new String[]{
            "UPPER, LOWER",
            "SUBSTRING",
            "ROUND",
            "NOW, DATE_FORMAT"
        });

        TITLE_MAP.put("Xử lý dữ liệu", new String[]{
            "SELECT INTO",
            "INSERT INTO SELECT",
            "CASE"
        });

        TITLE_MAP.put("Thủ tục lưu trữ", new String[]{
            "Tạo và sử dụng PROCEDURE",
            "Truyền tham số vào PROCEDURE",
            "Lợi ích và ứng dụng thực tế"
        });

        TITLE_MAP.put("Bảo mật SQL", new String[]{
            "Phòng chống SQL Injection",
            "Nguyên tắc Least Privilege"
        });

        TITLE_MAP.put("Quản lý dữ liệu quy mô lớn", new String[]{
            "PARTITIONING",
            "HASH PARTITIONING",
            "SHARDING",
            "BATCH PROCESSING"
        });

        TITLE_MAP.put("Quản lý truy vấn phức tạp", new String[]{
            "RECURSIVE QUERIES",
            "Biểu thức CTE",
            "WINDOW FUNCTIONS",
            "Dynamic SQL"
        });

        TITLE_MAP.put("SQL trong các hệ quản trị cơ sở dữ liệu", new String[]{
            "MySQL",
            "SQL Server",
            "PostgreSQL",
            "Oracle"
        });

        TITLE_MAP.put("Các công cụ hỗ trợ SQL", new String[]{
            "IDE cho SQL",
            "Công cụ GUI",
            "ORM",
            "Công cụ tối ưu hiệu suất"
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

    private static final Map<String, String[]> DESCRIPTION_MAP = new HashMap<>();

    static {
        DESCRIPTION_MAP.put("Giới thiệu SQL", new String[]{
            "SQL (Structured Query Language) là ngôn ngữ tiêu chuẩn để quản lý và thao tác với cơ sở dữ liệu quan hệ (RDBMS).",
            "SQL (Structured Query Language) là ngôn ngữ truy vấn có cấu trúc được sử dụng để tương tác với cơ sở dữ liệu quan hệ (RDBMS - Relational Database Management System).",
            "MySQL, PostgreSQL, SQL Server, Oracle"
        });

        DESCRIPTION_MAP.put("Các lệnh truy vấn dữ liệu cơ bản", new String[]{
            "Lấy dữ liệu từ bảng",
            "Thêm dữ liệu vào bảng",
            "Cập nhật dữ liệu",
            "Xóa dữ liệu"
        });

        DESCRIPTION_MAP.put("Kiểu dữ liệu và toán tử", new String[]{
            "Kiểu dữ liệu số, kiểu dữ liệu chuỗi, kiểu dữ liệu ngày tháng",
            "Toán tử số học, toán tử so sánh, toán tử logic"
        });

        DESCRIPTION_MAP.put("Các hàm SQL cơ bản", new String[]{
            "COUNT, SUM, AVG, MIN, MAX",
            "CONCAT, SUBSTRING, UPPER, LOWER",
            "NOW, DATE_FORMAT"
        });

        DESCRIPTION_MAP.put("Ràng buộc SQL(Constraints)", new String[]{
            "Khóa chính, Khóa ngoại",
            "Giá trị duy nhất, kiểm tra điều kiện dữ liệu, không cho phép giá trị NULL",
            "Giá trị mặc định"
        });

        DESCRIPTION_MAP.put("Quản lý cơ sở dữ liệu", new String[]{
            "CREATE DATABASE, DROP DATABASE",
            "BACKUP DATABASE(cơ sở dữ liệu, MySQL Dump, SQL server), RESTORE DATABASE(cơ sở dữ liệu, MySQL, SQL server) ",
            "User Permissions Management: tạo người dùng mới, cấp quyền cho người dùng, thu hồi quyền(REVOKE), xóa người dùng"
        });

        DESCRIPTION_MAP.put("Quản lý bảng", new String[]{
            "CREATE TABLE, DROP TABLE, ALTER TABLE",
            "AUTO_INCREMENT",
            "CREATE VIEW, DROP VIEW"
        });

        DESCRIPTION_MAP.put("Kết hợp dữ liệu", new String[]{
            "Kết hợp bảng, các loại JOIN phổ biến: INNER JOIN, LEFT JOIN, RIGHT JOIN, FULL JOIN",
            "Kết hợp bảng với chính nó",
            "Kết hợp nhiều tập dữ liệu"
        });

        DESCRIPTION_MAP.put("Nhóm và tính toán dữ liệu", new String[]{
            "Gom nhóm dữ liệu",
            "COUNT, SUM, AVG",
            "Lọc dữ liệu sau GROUP BY"
        });

        DESCRIPTION_MAP.put("Xử lý chuỗi và dữ liệu", new String[]{
            "Chuyển đổi chữ hoa/thường",
            "Trích xuất chuỗi",
            "Làm tròn số",
            "Xử lý ngày tháng"
        });

        DESCRIPTION_MAP.put("Xử lý dữ liệu", new String[]{
            "Tạo bản sao dữ liệu",
            "Sao chép dữ liệu giữa bảng",
            "Cấu trúc điều kiện trong SQL"
        });

        DESCRIPTION_MAP.put("Thủ tục lưu trữ", new String[]{
            "Tạo và sử dụng PROCEDURE",
            "Truyền tham số",
            "Lợi ích(tăng hiệu suất, bảo mật tốt hơn, tái sử dụng) và ứng dụng thực tế(tự động hóa báo cáo hàng tháng, xử lý đăng nhập/kiểm tra tài khoản, xử lý đơn hàng/cập nhật tồn kho"
        });

        DESCRIPTION_MAP.put("Bảo mật SQL", new String[]{
            "SQL Injection là một dạng tấn công bảo mật trong đó kẻ tấn công chèn mã SQL độc hại vào các truy vấn để lấy cắp dữ liệu hoặc làm hỏng hệ thống.",
            "Least Privilege là nguyên tắc bảo mật yêu cầu mỗi người dùng chỉ có quyền tối thiểu cần thiết để thực hiện công việc của họ."
        });

        DESCRIPTION_MAP.put("Quản lý dữ liệu quy mô lớn", new String[]{
            "Phân vùng dữ liệu, phân vùng theo danh sách giá trị cụ thể",
            "Phân vùng theo hàm băm",
            "Chia nhỏ dữ liệu",
            "Xử lý hàng loạt"
        });

        DESCRIPTION_MAP.put("Quản lý truy vấn phức tạp", new String[]{
            "Truy vấn đệ quy",
            "Common Table Expressions",
            "Hàm cửa sổ",
            "SQL động"
        });

        DESCRIPTION_MAP.put("SQL trong các hệ quản trị cơ sở dữ liệu", new String[]{
            "MySQL - Đặc điểm và cú pháp riêng",
            "SQL Server - Tích hợp với Microsoft",
            "PostgreSQL - Tính năng mạnh mẽ",
            "Oracle - Doanh nghiệp và bảo mật"
        });

        DESCRIPTION_MAP.put("Các công cụ hỗ trợ SQL", new String[]{
            "MySQL Workbench, DBeaver",
            "pgAdmin, SQL Server Management Studio",
            "Hibernate, SQLAlchemy",
            "EXPLAIN, Query Profiler"
        });
    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getDescription(String language, int index) {
        if (DESCRIPTION_MAP.containsKey(language)) {
            String[] descriptions = DESCRIPTION_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getDescriptions(String language) {
        return DESCRIPTION_MAP.getOrDefault(language, new String[]{"Không có mô tả nào."});
    }

    private static final Map<String, String[]> ICON_MAP = new HashMap<>();

    static {
        ICON_MAP.put("Giới thiệu SQL", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Các lệnh truy vấn dữ liệu cơ bản", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Kiểu dữ liệu và toán tử", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Các hàm SQL cơ bản", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Ràng buộc SQL(Constraints)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Quản lý cơ sở dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Quản lý bảng", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Kết hợp dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Nhóm và tính toán dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý chuỗi và dữ liệu", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Thủ tục lưu trữ", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Bảo mật SQL", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Quản lý dữ liệu quy mô lớn", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Quản lý truy vấn phức tạp", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("SQL trong các hệ quản trị cơ sở dữ liệu", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Các công cụ hỗ trợ SQL", new String[]{
            "",
            "",
            "",
            ""
        });
    }

    // Lấy mô tả của bài học dựa vào ngôn ngữ và chỉ số tiêu đề
    public static String getIcon(String language, int index) {
        if (ICON_MAP.containsKey(language)) {
            String[] descriptions = ICON_MAP.get(language);
            if (index >= 0 && index < descriptions.length) {
                return descriptions[index];
            }
        }
        return "Không có mô tả cho bài học này.";
    }

    // Lấy toàn bộ danh sách mô tả của một ngôn ngữ
    public static String[] getIcons(String language) {
        return ICON_MAP.getOrDefault(language, new String[]{"Không có mô tả nào."});
    }
}
