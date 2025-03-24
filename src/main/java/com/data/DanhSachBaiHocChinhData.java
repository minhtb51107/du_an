/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PC
 */
public class DanhSachBaiHocChinhData {

    private static final Map<String, String[]> TITLE_MAP = new HashMap<>();

    static {
        TITLE_MAP.put("Java", new String[]{
            "Java Cơ Bản",
            "Java Nâng Cao",
            "Java Chuyên Nghiệp",
            "Java Ứng Dụng Thực Tế"
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
            "JavaScript Cơ Bản",
            "JavaScript Nâng Cao",
            "JavaScript Chuyên Nghiệp",
            "Ứng Dụng Thực Tế"
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

        TITLE_MAP.put("SQL", new String[]{
            "SQL cơ bản",
            "SQL trung bình",
            "SQL nâng cao",
            "SQL chuyên nghiệp"
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
            "Cơ bản \n"
            + "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java.\n"
            + "Cấu trúc chương trình Java, cài đặt JDK, IDE.. \n"
            + "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu. \n"
            + "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi.",
            
            " Nâng cao (Lập trình đa luồng, mạng, JDBC, Web) \n"
            + "Lập trình đa luồng, xử lý sự kiện. \n"
            + "Lập trình mạng (Socket, TCP/IP, UDP). \n"
            + "JDBC: Kết nối cơ sở dữ liệu, CRUD. \n"
            + "Lập trình Web: Servlet, JSP, MVC.",
             
            "Chuyên nghiệp (OOP và các kỹ thuật quan trọng) \n"
            + "Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức. \n"
            + "Đóng gói, kế thừa, đa hình, interface, abstract class. \n"
            + "Xử lý ngoại lệ, làm việc với tập tin. \n"
            + "Collection Framework: ArrayList, LinkedList, HashMap,... \n",
            
            "Ứng dụng thực tế \n"
            + "JavaFX: Xây dựng giao diện đồ họa. \n"
            + "Spring Boot: REST API, kết nối cơ sở dữ liệu. \n"
            + "Microservices với Spring Cloud. \n"
            + "Bảo mật (Spring Security, OAuth2, JWT)."
            + "Hiệu năng & tối ưu hóa, kiểm thử với JUnit, Mockito. \n",
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
            "JavaScript Cơ Bản\n"
                    + "Giới thiệu Javascript\n"
                    + "Biến và kiểu dữ liệu\n"
                    + "Toán tử và Cấu trúc điều kiện\n",
            "JavaScript Nâng Cao\n"
                    + "Vòng lặp và Hàm\n"
                    + "Lập trình hướng đối tượng (OOP)\n",
            "JavaScript Chuyên Nghiệp\n"
                    + "Lập trình bất đồng bồ (Asynchronous)\n"
                    + "Làm việc với API\n"
                    + "DOM và Xử lý sự kiện\n",
            "Ứng Dụng Thực Tế\n"
                    + "JavaScript Trong Dự Án Web\n"
                    + "Framework JavaScript (React, Vue, Node.js"
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

        DESCRIPTION_MAP.put("SQL", new String[]{
            "Giới thiệu SQL \n"
            + "Các lệnh truy vấn dữ liệu cơ bản \n"
            + "Kiểu dữ liệu và toán tử \n"
            + "Các hàm SQL cơ bản \n"
            + "Ràng buộc SQL(Constraints)",
            
            "Quản lý cơ sở dữ liệu \n"
            + "Quản lý bảng \n"
            + "Kết hợp dữ liệu \n"
            + "Nhóm và tính toán dữ liệu \n"
            + "Xử lý chuỗi và dữ liệu",
            
            "Xử lý dữ liệu \n"
            + "Thủ tục lưu trữ \n"
            + "Bảo mật SQL \n"
            + "Quản lý dữ liệu quy mô lớn \n",
            
            "Quản lý truy vấn phức tạp \n"
            + "SQL trong các hệ quản trị CSDL \n"
            + "Các công cụ hỗ trợ SQL \n",});
        
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
//
//    public static void main(String[] args) {
//        System.out.println(getDescription("Java", 2)); // "Các khái niệm class, object, kế thừa, đa hình và đóng gói."
//        System.out.println(getDescription("SQL", 5));  // "Lập trình với Stored Procedure, Trigger, Function."
//    }
}
