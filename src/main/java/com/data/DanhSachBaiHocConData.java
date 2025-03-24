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
public class DanhSachBaiHocConData {

    private static final Map<String, String[]> TITLE_MAP = new HashMap<>();

    static {
        TITLE_MAP.put("Java", new String[]{
            "GIỚI THIỆU VỀ JAVA",
            "CƠ BẢN VỀ JAVA",
            "LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG (OOP)",
            "XỬ LÝ NGOẠI LỆ, TẬP TIN, VÀ COLLECTION",
            "LẬP TRÌNH ĐA LUỒNG VÀ MẠNG",
            "CÁC CHỦ ĐỀ NÂNG CAO",
            "JDBC VÀ LẬP TRÌNH WEB"
        });

        TITLE_MAP.put("PYTHON", new String[]{
            "GIỚI THIỆU VỀ PYTHON",
            "BIẾN VÀ KIỂU DỮ LIỆU",
            "CẤU TRÚC ĐIỀU KHIỂN",
            "HÀM VÀ MODULE",
            "XỬ LÝ NGOẠI LỆ VÀ FILE",
            "LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG TRONG PYTHON",
            "PYTHON CHO PHÂN TÍCH DỮ LIỆU"
        });

        TITLE_MAP.put("HTML & CSS", new String[]{
            "GIỚI THIỆU VỀ HTML & CSS",
            "CẤU TRÚC CƠ BẢN CỦA HTML",
            "CÁC THẺ HTML QUAN TRỌNG",
            "CSS CƠ BẢN VÀ CÁCH ÁP DỤNG",
            "LAYOUT VỚI FLEXBOX & GRID",
            "THIẾT KẾ GIAO DIỆN RESPONSIVE",
            "ANIMATION VÀ HIỆU ỨNG VỚI CSS"
        });

        TITLE_MAP.put("JAVASCRIPT", new String[]{
            "GIỚI THIỆU VỀ JAVASCRIPT",
            "BIẾN, KIỂU DỮ LIỆU VÀ TOÁN TỬ",
            "CẤU TRÚC ĐIỀU KHIỂN TRONG JS",
            "HÀM VÀ CÁC PHƯƠNG THỨC",
            "DOM VÀ EVENT HANDLING",
            "ASYNCHRONOUS JAVASCRIPT: CALLBACKS, PROMISES, ASYNC/AWAIT",
            "LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG TRONG JS"
        });

        TITLE_MAP.put("C", new String[]{
            "GIỚI THIỆU VỀ NGÔN NGỮ C",
            "CẤU TRÚC CHƯƠNG TRÌNH C",
            "BIẾN, TOÁN TỬ VÀ KIỂU DỮ LIỆU",
            "CẤU TRÚC ĐIỀU KHIỂN VÀ HÀM",
            "CON TRỎ VÀ QUẢN LÝ BỘ NHỚ",
            "XỬ LÝ FILE TRONG C",
            "LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG VỚI C (OOP)"
        });

        TITLE_MAP.put("SQL cơ bản", new String[]{
            "Giới thiệu SQL",
            "Các lệnh truy vấn dữ liệu cơ bản",
            "Kiểu dữ liệu và toán tử",
            "Các hàm SQL cơ bản",
            "Ràng buộc SQL(Constraints)"
        });

        TITLE_MAP.put("SQL trung bình", new String[]{
            "Quản lý cơ sở dữ liệu",
            "Quản lý bảng",
            "Kết hợp dữ liệu",
            "Nhóm và tính toán dữ liệu",
            "Xử lý chuỗi và dữ liệu"
        });

        TITLE_MAP.put("SQL nâng cao", new String[]{
            "Xử lý dữ liệu",
            "Thủ tục lưu trữ",
            "Bảo mật SQL",
            "Quản lý dữ liệu quy mô lớn"
        });

        TITLE_MAP.put("SQL chuyên nghiệp", new String[]{
            "Quản lý truy vấn phức tạp",
            "SQL trong các hệ quản trị cơ sở dữ liệu",
            "Các công cụ hỗ trợ SQL"
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
        DESCRIPTION_MAP.put("Java", new String[]{
            "Tổng quan về Java, lịch sử phát triển và cách cài đặt môi trường.",
            "Các kiểu dữ liệu, biến, toán tử và cấu trúc điều khiển trong Java.",
            "Các khái niệm class, object, kế thừa, đa hình và đóng gói.",
            "Xử lý ngoại lệ, làm việc với tập tin và quản lý dữ liệu bằng Collection Framework.",
            "Tạo và quản lý luồng (Thread), lập trình mạng với Socket và HTTP.",
            "Các chủ đề nâng cao như JavaFX, Lambda Expression, và Reflection.",
            "Kết nối cơ sở dữ liệu bằng JDBC, lập trình Web với Servlet và JSP."
        });

        DESCRIPTION_MAP.put("PYTHON", new String[]{
            "Giới thiệu về Python, cài đặt và sử dụng cơ bản.",
            "Tìm hiểu các kiểu dữ liệu phổ biến như số, chuỗi, danh sách, từ điển.",
            "Câu lệnh điều kiện, vòng lặp for và while trong Python.",
            "Định nghĩa và sử dụng hàm, import module và tạo package.",
            "Xử lý lỗi với try-except, đọc và ghi file trong Python.",
            "Lập trình hướng đối tượng: class, object, kế thừa và đa hình.",
            "Ứng dụng Python trong phân tích dữ liệu với Pandas, Numpy và Matplotlib."
        });

        DESCRIPTION_MAP.put("HTML & CSS", new String[]{
            "Tổng quan về HTML & CSS, cách hoạt động của trình duyệt.",
            "Cấu trúc cơ bản của một trang HTML, cách tổ chức nội dung.",
            "Các thẻ quan trọng như div, span, form, table, và list.",
            "Cách áp dụng CSS để định dạng văn bản, hình ảnh và bố cục.",
            "Sử dụng Flexbox và CSS Grid để tạo giao diện hiện đại.",
            "Thiết kế giao diện responsive cho nhiều loại màn hình khác nhau.",
            "Tạo hiệu ứng động và animation với CSS."
        });

        DESCRIPTION_MAP.put("JAVASCRIPT", new String[]{
            "Giới thiệu về JavaScript, cách nhúng vào HTML.",
            "Khai báo biến, kiểu dữ liệu, toán tử và cách sử dụng.",
            "Cấu trúc điều khiển: if-else, switch-case, vòng lặp for và while.",
            "Định nghĩa và sử dụng hàm, các phương thức trong object.",
            "Tương tác với DOM, bắt sự kiện và thao tác với HTML.",
            "Lập trình bất đồng bộ: Callbacks, Promises, Async/Await.",
            "Ứng dụng lập trình hướng đối tượng trong JavaScript."
        });

        DESCRIPTION_MAP.put("C", new String[]{
            "Giới thiệu về ngôn ngữ C, ứng dụng và môi trường lập trình.",
            "Cấu trúc chương trình C, cách viết code cơ bản.",
            "Khai báo biến, toán tử và kiểu dữ liệu trong C.",
            "Sử dụng if-else, vòng lặp và hàm để điều khiển chương trình.",
            "Làm việc với con trỏ, quản lý bộ nhớ động trong C.",
            "Cách đọc và ghi dữ liệu vào file bằng C.",
            "Giới thiệu về lập trình hướng đối tượng trong C."
        });

        DESCRIPTION_MAP.put("SQL cơ bản", new String[]{
            "SQL (Structured Query Language) là ngôn ngữ tiêu chuẩn để quản lý và thao tác với cơ sở dữ liệu quan hệ (RDBMS).",
            "SELECT, INSERT, UPDATE, DELETE",
            "Kiểu dữ liệu Số, chuỗi, ngày tháng và toán tử số học, so sánh, logic",
            "Hàm tổng hợp, xử lý chuỗi, ngày tháng",
            "PRIMARY KEY, FOREIGN KEY, UNIQUE, CHECK, NOT NULL, DEFAULT"
        });

        DESCRIPTION_MAP.put("SQL trung bình", new String[]{
            "Tạo, xóa cơ sở dữ liệu, sao lưu & phục hồi, quản lý quyền truy cập",
            "Tạo, xóa, sửa bảng, tăng giá trị, tạo views",
            "JOIN, SELF JOIN, UNION",
            "Group by: thường kết hợp(COUNT, SUM, AVG), Having: lọc nhóm dữ liệu(dùng sau Group by)",
            "UCASE()/LCASE(), MID()/SUBSTRING(), ROUND(), NOW()/GETDATE(), FORMAT()"
        });

        DESCRIPTION_MAP.put("SQL nâng cao", new String[]{
            "SELECT INTO, INSERT, INTO, SELECT, CASE",
            "STORED PROCEDURES",
            "Phòng chống SQL Injection, Least Privilege",
            "Partitioning, Sharding, Batch Processing"
        });

        DESCRIPTION_MAP.put("SQL chuyên nghiệp", new String[]{
            "Recursive Queries, CTE, Window Functions, Dynamic SQL",
            "My SQL, SQL Server, PostgreSQL, Oracle",
            "IDE, GUI Tools, ORM, Perfrmance Tools"
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
        ICON_MAP.put("Java", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("PYTHON", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("HTML & CSS", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("JAVASCRIPT", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("C", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("SQL", new String[]{
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("SQL cơ bản", new String[]{
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("SQL trung bình", new String[]{
            "",
            "",
            "",
            "", 
            ""

        });

        ICON_MAP.put("SQL nâng cao", new String[]{
            "",
            "",
            "",
            ""

        });

        ICON_MAP.put("SQL chuyên nghiệp", new String[]{
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
