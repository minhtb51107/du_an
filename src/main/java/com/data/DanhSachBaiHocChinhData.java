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
            "Python Cơ Bản",
            "Python Nâng Cao",
            "Python Chuyên Nghiệp",
            "Python Ứng Dụng Thực Tế"
        });

        TITLE_MAP.put("HTML & CSS", new String[]{
             "HTML Cơ B  ản",
             "HTML Nâng Cao",
             "CSS Cơ Bản",
             "CSS Nâng Cao",
             "CSS Chuyên Nghiệp",
             "Ứng Dụng & Dự Án Thực Tế"
        });

        TITLE_MAP.put("JAVASCRIPT", new String[]{
            "JavaScript Cơ Bản",
            "JavaScript Nâng Cao",
            "JavaScript Chuyên Nghiệp",
            "Ứng Dụng Thực Tế"
        });

        TITLE_MAP.put("C", new String[]{
            "GIỚI THIỆU VỀ NGÔN NGỮ C",
            "CẤU TRÚC ĐIỀU KHIỂN & VÒNG LẶP",
            "MẢNG, CHUỖI & CON TRỎ",
            "HÀM & QUẢN LÝ BỘ NHỚ",
            "CẤU TRÚC DỮ LIỆU & FILE I/O",
            "LẬP TRÌNH HƯỚNG DẪN HIỆU NĂNG & ỨNG DỤNG"
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
            "Python Cơ Bản\n"
            + "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java.\n"
            + "Cấu trúc chương trình Java, cài đặt JDK, IDE.. \n"
            + "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu. \n"
            + "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi.",
            "Python Nâng Cao\n"
            + "Lập trình đa luồng, xử lý sự kiện. \n"
            + "Lập trình mạng (Socket, TCP/IP, UDP). \n"
            + "JDBC: Kết nối cơ sở dữ liệu, CRUD. \n"
            + "Lập trình Web: Servlet, JSP, MVC.",
            "Python Chuyên nghiệp\n"
            + "Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức. \n"
            + "Đóng gói, kế thừa, đa hình, interface, abstract class. \n"
            + "Xử lý ngoại lệ, làm việc với tập tin. \n"
            + "Collection Framework: ArrayList, LinkedList, HashMap,... \n",
            "Python Ứng dụng thực tế\n"
            + "JavaFX: Xây dựng giao diện đồ họa. \n"
            + "Spring Boot: REST API, kết nối cơ sở dữ liệu. \n"
            + "Microservices với Spring Cloud. \n"
            + "Bảo mật (Spring Security, OAuth2, JWT)."
            + "Hiệu năng & tối ưu hóa, kiểm thử với JUnit, Mockito. \n",});

        DESCRIPTION_MAP.put("PYTHON", new String[]{
            "Cơ bản \n"
            + "Giới thiệu về Python, lịch sử phát triển, lý do chọn Python\n"
            + "Cài đặt Python, sử dụng IDE (VS Code, PyCharm).\n"
            + "Biến, kiểu dữ liệu, toán tử và nhập xuất dữ liệu.\n"
            + "Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.",
            "Nâng cao (Lập trình hướng đối tượng, xử lý tập tin, ngoại lệ)\n"
            + "Lập trình hướng đối tượng (OOP): lớp, đối tượng, kế thừa, đa hình.\n"
            + "Xử lý tập tin: đọc/ghi file CSV, JSON.\n"
            + "Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.\n"
            + "Các thư viện tiêu chuẩn: datetime, os, sys, random.",
            "Chuyên nghiệp (Lập trình bất đồng bộ, API, cơ sở dữ liệu)\n"
            + "Lập trình bất đồng bộ: async, await, threading, multiprocessing.\n"
            + "Làm việc với API: requests, BeautifulSoup, Selenium.\n"
            + "Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, SQLAlchemy.\n"
            + "Xử lý dữ liệu lớn: pandas, numpy, matplotlib.",
            "Ứng dụng thực tế\n"
            + "Xây dựng ứng dụng Web với Flask/Django.\n"
            + "Machine Learning với scikit-learn, TensorFlow, PyTorch.\n"
            + "Tự động hóa với Selenium, bot Telegram/Discord.\n"
            + "Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.\n"
        });

        DESCRIPTION_MAP.put("HTML & CSS", new String[]{
             "Giới thiệu HTML \n"
                     + "Các thẻ HTML quan trọng \n"
                     + "Hình ảnh, liên kết & điều hướng \n"
                     + "Bảng và biểu mẫu",
             "Semantic HTML \n"
                     + "Metadata & SEO \n"
                     + "HTML5 API",
             "Cú pháp và cách nhúng CSS \n"
                     + "Selectors & Units \n"
                     + "Box Model & Positioning \n"
                     + "Màu sắc & Typography \n"
                     + " Display & Responsive cơ bản",
             "Flexbox \n"
                     + "Grid Layout \n"
                     + "Responsive Design \n"
                     + "Animation & Transition \n"
                     + "Advanced Selectors",
             "CSS Architecture & Best Practices \n"
                     + "Preprocessors: SCSS & LESS \n"
                     + "Tối ưu hiệu suất CSS \n"
                     + "CSS Frameworks \n"
                     + "Accessibility (A11Y) \n"
                     + "CSS Generative Art & Creative Coding",
             "Xây dựng website hoàn chỉnh \n"
                     + "Tích hợp CSS với JavaScript \n"
                         + "Progressive Web Apps (PWA)"
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
            "GIỚI THIỆU NGÔN NGỮ C\n"
            + "Giới thiệu ngôn ngữ C\n"
            + "Cấu trúc chương trình C\n"
            + "Biến, kiểu dữ liệu và toán tử\n",
            "CẤU TRÚC ĐIỀU KHIỂN & VÒNG LẶP\n"
            + "Câu lệnh điều kiện\n"
            + "Vòng lặp\n",
            "MẢNG, CHUỖI & CON TRỎ\n"
            + "Mảng một chiều và hai chiều\n"
            + "Xử lý  chuỗi và con trỏ\n",
            "HÀM & QUẢN LÝ BỘ NHỚ\n"
            + "Hàm và đệ quy\n"
            + "Cấp phát bộ nhớ động\n",
            "CẤU TRÚC DỮ LIỆU & FILE I/O\n"
            + "Cấu trúc dữ liệu\n"
            + "File I/O",
            "LẬP TRÌNH HƯỚNG DẪN HIỆU NĂNG & ỨNG DỤNG\n"
            + "Dự án cuối khóa\n",});

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
            + "Các công cụ hỗ trợ SQL \n",}
        );

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
