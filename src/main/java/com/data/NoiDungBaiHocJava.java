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
public class NoiDungBaiHocJava {
    private static final Map<String, int[]> Index_MAP = new HashMap<>();

    static {

        //Java
        //1
        Index_MAP.put("Java là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Lịch sử phát triển của Java", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Lý do chọn Java", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Ứng dụng của Java", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1
        });
        //2
        Index_MAP.put("Cấu trúc cơ bản của một chương trình Java", new int[]{
            0, 1, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Cài đặt JDK", new int[]{
            0, 1, 0, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1
        });
        Index_MAP.put("IDE phổ biến để lập trình Java", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Viết và chạy chương trình Java đầu tiên", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Biến và kiểu dữ liệu", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Toán tử trong Java", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Xuất dữ liệu ra màn hình", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Nhập dữ liệu từ bàn phím", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Cấu trúc điều kiện", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Vòng lặp trong Java", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 0, 1, 2, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Mảng trong Java", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Xử lý chuỗi trong Java", new int[]{
            0, 1, 0, 1, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 1, 2, 0, 2, 0, 1
        });
        Index_MAP.put("Lập trình đa luồng là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Tạo luồng trong Java", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Đồng bộ hóa luồng", new int[]{
            0, 1, 0, 1, 2, 0, 1, 0, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Xử lý sự kiện trong Java", new int[]{
            0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Giới thiệu về lập trình mạng trong Java", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 0, 1, 0, 1
        });
        Index_MAP.put("Lập trình Socket với TCP/IP", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Lập trình UDP trong Java", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("JDBC là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Kết nối MySQL với Java", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Thực hiện CRUD", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Servlet là gì?", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Tạo Servlet cơ bản", new int[]{
            0, 1, 0, 2, 0, 1, 0, 1, 2, 1, 2, 1, 0, 1, 0, 1
        });
        Index_MAP.put("JSP là gì?", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Mô hình MVC trong Java", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Lập trình hướng đối tượng là gì?", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1
        });
        Index_MAP.put("Lớp và đối tượng", new int[]{
            0, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Constructor", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Phương thức (Method)", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Đóng gói (Encapsulation)", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 0, 1
        });
        Index_MAP.put("Kế thừa (Inheritance)", new int[]{
            0, 1, 0, 1, 2, 1, 2, 0, 1, 0, 1
        });
        Index_MAP.put("Đa hình (Polymorphism)", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("Interface và Abstract Class", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 0, 1
        });
        Index_MAP.put("Xử lý ngoại lệ (Exception Handling)", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Đọc và ghi file trong Java", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 2, 1, 0, 1
        });
        Index_MAP.put("Giới thiệu Collection Framework", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1
        });
        Index_MAP.put("ArrayList", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1
        });
        Index_MAP.put("LinkedList", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1
        });
        Index_MAP.put("HashMap", new int[]{
            0, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 0, 1
        });
        Index_MAP.put("Giới thiệu JavaFX", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Cấu trúc ứng dụng JavaFX", new int[]{
            0, 1, 2, 1
        });
        Index_MAP.put("Giới thiệu Spring Boot", new int[]{
            0, 1, 0, 1, 0, 1, 2, 1
        });
        Index_MAP.put("Tạo REST API với Spring Boot", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1
        });
        Index_MAP.put("Kết nối cơ sở dữ liệu MySQL với Spring Boot", new int[]{
            0, 1, 0, 1, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 1
        });
        Index_MAP.put("Giới thiệu về Microservices", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 0, 1
        });
        Index_MAP.put("Xây dựng Microservice với Spring Boot", new int[]{
            0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 2, 0, 2, 1, 0, 1, 0, 2, 0, 2, 0, 2, 1, 0, 1, 0, 2, 0, 2, 1, 0, 1
        });
        Index_MAP.put("Bảo mật với Spring Security", new int[]{
            0, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Xác thực bằng JWT", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 1, 0, 1, 2, 1, 2, 1, 2, 0, 1, 2, 1, 0, 2, 1, 0, 1, 2, 1, 0, 1
        });
        Index_MAP.put("Kiểm thử với JUnit và Mockito", new int[]{
            0, 1, 0, 1, 2, 0, 1, 2, 1, 2, 1, 0, 1, 2, 1, 2, 1, 0, 1, 0, 1
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
    
            TITLE_MAP.put("Java là gì?", new String[]{
            "Java là gì?",
            "Đặc điểm chính của Java",
            "Ứng dụng của Java",
            "Kết luận"
        });

        TITLE_MAP.put("Lịch sử phát triển của Java", new String[]{
            "Lịch sử phát triển của Java",
            "1. Năm 1991: Khởi đầu dự án Java",
            "2. Năm 1995: Java 1.0 chính thức ra đời",
            "3. Những năm 2000: Java trở thành nền tảng chính trong lập trình doanh nghiệp",
            "4. Năm 2006: Sun Microsystems phát hành OpenJDK",
            "5. Năm 2010: Oracle mua lại Sun Microsystems",
            "6. Hiện nay: Java tiếp tục phát triển mạnh mẽ",
            "Kết luận"
        });
        TITLE_MAP.put("Lý do chọn Java", new String[]{
            "Lý do chọn Java",
            "1. Đa nền tảng – Viết một lần, chạy mọi nơi",
            "2. Hướng đối tượng – Mã nguồn dễ quản lý và tái sử dụng",
            "3. Bảo mật cao – Giảm thiểu rủi ro bảo mật",
            "4. Cộng đồng lớn – Hỗ trợ tài liệu phong phú và thư viện đa dạng",
            "5. Ứng dụng rộng rãi – Phù hợp với nhiều lĩnh vực công nghệ",
            "Kết luận"
        });
        TITLE_MAP.put("Ứng dụng của Java", new String[]{
            "Ứng dụng của Java",
            "1. Phát triển ứng dụng Desktop",
            "2. Phát triển ứng dụng Web",
            "3. Lập trình Android",
            "4. Ứng dụng trong Big Data, AI và Tài chính",
            "Kết luận"
        });

        TITLE_MAP.put("Cấu trúc cơ bản của một chương trình Java", new String[]{
            "Cấu trúc cơ bản của một chương trình Java",
            "1. Định nghĩa lớp (Class Definition)",
            "2. Phương thức main() – Điểm bắt đầu của chương trình",
            "3. Xuất nội dung ra màn hình",
            "4. Chạy chương trình Java",
            "Kết luận"
        });
        TITLE_MAP.put("Cài đặt JDK", new String[]{
            "Hướng dẫn cài đặt JDK (Java Development Kit)",
            "1. Tải JDK từ trang chủ",
            "2. Cài đặt JDK",
            "3. Thiết lập biến môi trường JAVA_HOME",
            "4. Kiểm tra cài đặt"
        });
        TITLE_MAP.put("IDE phổ biến để lập trình Java", new String[]{
            "IDE phổ biến để lập trình Java",
            "1. IntelliJ IDEA",
            "2. Eclipse",
            "3. NetBeans",
            "4. Visual Studio Code (VS Code)",
            "So sánh các IDE phổ biến cho lập trình Java"
        });
        TITLE_MAP.put("Viết và chạy chương trình Java đầu tiên", new String[]{
            "Viết và chạy chương trình Java đầu tiên",
            "Cách 1: Viết và chạy chương trình bằng terminal (Command Prompt)"
            + "Bước 1: Viết mã nguồn Java",
            "Bước 2: Biên dịch chương trình Java",
            "Bước 3: Chạy chương trình",
            "Cách 2: Viết và chạy chương trình bằng IDE",
            "Kết luận"
        });
        TITLE_MAP.put("Biến và kiểu dữ liệu", new String[]{
            "Biến và kiểu dữ liệu trong Java",
            "1. Kiểu dữ liệu nguyên thủy (Primitive Data Types)",
            "2. Kiểu dữ liệu tham chiếu (Reference Data Types)",
            "3. Khai báo biến trong Java",
            "4. Ép kiểu dữ liệu (Type Casting)",
            "Kết luận"
        });
        TITLE_MAP.put("Toán tử trong Java", new String[]{
            "Toán tử trong Java",
            "1. Toán tử số học (Arithmetic Operators)",
            "2. Toán tử so sánh (Comparison Operators)",
            "3. Toán tử logic (Logical Operators)",
            "4. Toán tử gán (Assignment Operators)",
            "5. Toán tử điều kiện (Ternary Operator - ? :)",
            "Kết luận"
        });
        TITLE_MAP.put("Xuất dữ liệu ra màn hình", new String[]{
            "Xuất dữ liệu ra màn hình trong Java",
            "1. System.out.println()",
            "2. System.out.print()",
            "3. System.out.printf()",
            "Tóm tắt"
        });
        TITLE_MAP.put("Nhập dữ liệu từ bàn phím", new String[]{
            "Nhập dữ liệu từ bàn phím trong Java",
            "1. Cách sử dụng Scanner để nhập dữ liệu",
            "2. Các phương thức nhập dữ liệu phổ biến của Scanner",
            "3. Ví dụ nhập nhiều kiểu dữ liệu",
            "4. Lưu ý khi sử dụng Scanner",
            "Tóm tắt"
        });
        TITLE_MAP.put("Cấu trúc điều kiện", new String[]{
            "Cấu trúc điều kiện trong Java",
            "1. Cấu trúc if-else đơn giản",
            "2. Cấu trúc if-else if-else",
            "3. Cấu trúc if lồng nhau (Nested if)",
            "4. Cấu trúc switch-case (Thay thế nhiều if-else if)",
            "Tóm tắt"
        });
        TITLE_MAP.put("Vòng lặp trong Java", new String[]{
            "Vòng lặp trong Java",
            "1. Vòng lặp for",
            "2. Vòng lặp while",
            "3. Vòng lặp do-while",
            "4. Vòng lặp for-each (Dùng với mảng, danh sách)",
            "5. Dừng vòng lặp (break) và bỏ qua vòng lặp (continue)",
            "Tóm tắt",});
        TITLE_MAP.put("Mảng trong Java", new String[]{
            "Mảng trong Java",
            "1. Khai báo và khởi tạo mảng",
            "2. Truy cập phần tử trong mảng",
            "3. Duyệt mảng bằng vòng lặp",
            "4. Mảng nhiều chiều (Mảng 2D, 3D, …)",
            "5. Sắp xếp và tìm kiếm trong mảng",
            "Tóm tắt",});
        TITLE_MAP.put("Xử lý chuỗi trong Java", new String[]{
            "Xử lý chuỗi trong Java",
            "1. Khai báo chuỗi trong Java",
            "2. Một số phương thức xử lý chuỗi phổ biến"
            + "/n" + " 2.1. Lấy độ dài chuỗi",
            "2.2. Chuyển đổi chữ hoa và chữ thường",
            "2.3. Kiểm tra chuỗi bắt đầu hoặc kết thúc với một chuỗi con",
            "2.4. Tìm vị trí của một chuỗi con",
            "2.5. Lấy một phần của chuỗi (substring)",
            "2.6. Thay thế chuỗi con",
            "2.7. So sánh chuỗi (equals và equalsIgnoreCase)",
            "2.8. Loại bỏ khoảng trắng thừa (trim)",
            "3. Nối chuỗi (concat và +)",
            "4. Chia chuỗi thành mảng (split)",
            "5. Kiểm tra chuỗi rỗng hoặc null",
            "Tóm tắt",});
        TITLE_MAP.put("Lập trình đa luồng là gì?", new String[]{
            "Lập trình đa luồng là gì?",
            "1 Lợi ích của đa luồng",
            "2 Ứng dụng của đa luồng",
            "3 Đa luồng hoạt động như thế nào?",
            "Tóm tắt"
        });
        TITLE_MAP.put("Tạo luồng trong Java", new String[]{
            "Tạo luồng trong Java",
            "1. Kế thừa lớp Thread",
            "2. Triển khai giao diện Runnable",
            "3. So sánh hai cách tạo luồng",
            "4. Khi nào nên dùng cách nào?"
        });
        TITLE_MAP.put("Đồng bộ hóa luồng", new String[]{
            "Đồng bộ hóa luồng trong Java/n"
            + "1. Xung đột dữ liệu trong đa luồng",
            "2. Cách sử dụng từ khóa synchronized",
            "3. Giải thích cách hoạt động của synchronized",
            "4. Sử dụng synchronized cho khối lệnh thay vì phương thức",
            "5. Khi nào nên sử dụng synchronized?"
        });
        TITLE_MAP.put("Xử lý sự kiện trong Java", new String[]{
            "Xử lý sự kiện trong Java",
            "1. Mô hình xử lý sự kiện trong Java",
            "2. Ví dụ xử lý sự kiện nút bấm với ActionListener",
            "3. Giải thích chương trình",
            "4. Xử lý sự kiện bằng Lambda Expression (Java 8+)",
            "5. Khi nào cần sử dụng xử lý sự kiện?"
        });
        TITLE_MAP.put("Giới thiệu về lập trình mạng trong Java", new String[]{
            "Giới thiệu về Lập trình Mạng trong Java",
            "1. Các giao thức mạng trong Java",
            "2. Các thành phần chính trong lập trình mạng Java",
            "3. Ví dụ lập trình mạng đơn giản với Socket và ServerSocket",
            "4. Giải thích chương trình",
            "5. Ứng dụng của lập trình mạng trong Java"
        });
        TITLE_MAP.put("Lập trình Socket với TCP/IP", new String[]{
            "Lập trình Socket với TCP/IP trong Java",
            "1. Nguyên lý hoạt động của TCP Socket",
            "2. Cấu trúc chương trình TCP Socket trong Java",
            "3. Giải thích chương trình",
            "4. Cách chạy chương trình",
            "5. Ứng dụng thực tế của TCP Socket trong Java"
        });
        TITLE_MAP.put("Lập trình UDP trong Java", new String[]{
            "1. Nguyên lý hoạt động của UDP",
            "2. Chương trình UDP trong Java",
            "3. Giải thích chương trình",
            "4. Cách chạy chương trình",
            "5. Ứng dụng thực tế của UDP"
        });

        TITLE_MAP.put("JDBC là gì?", new String[]{
            "JDBC là gì?",
            "1. Chức năng chính của JDBC",
            "2. Các thành phần chính của JDBC",
            "3. Cách sử dụng JDBC trong Java",
            "4. Các thao tác cơ bản với JDBC",
            "5. Ứng dụng thực tế của JDBC"
        });
        TITLE_MAP.put("Kết nối MySQL với Java", new String[]{
            "Kết nối MySQL với Java",
            "1. Cài đặt MySQL Connector/J",
            "2. Mã nguồn kết nối MySQL với Java",
            "3. Cấu hình MySQL",
            "4. Kiểm tra kết nối",
            "5. Ứng dụng thực tế"
        });
        TITLE_MAP.put("Thực hiện CRUD", new String[]{
            "Thực hiện CRUD với MySQL trong Java",
            "1. Kết nối Cơ sở dữ liệu",
            "2. Thêm dữ liệu (CREATE)",
            "3. Đọc dữ liệu (READ)",
            "4. Cập nhật dữ liệu (UPDATE)",
            "5. Xóa dữ liệu (DELETE)",
            "Tóm tắt",});
        TITLE_MAP.put("Servlet là gì?", new String[]{
            "Servlet là gì?",
            "1. Đặc điểm của Servlet",
            "2. Cách hoạt động của Servlet",
            "3. Ví dụ về Servlet",
            "4. Ứng dụng của Servlet",
            "Tóm tắt"
        });
        TITLE_MAP.put("Tạo Servlet cơ bản", new String[]{
            "Tạo Servlet Cơ Bản trong Java",
            "1. Cấu trúc một Servlet cơ bản",
            "2. Giải thích mã nguồn",
            "3. Cách chạy Servlet",
            "4. Ứng dụng của Servlet",
            "Tóm tắt"
        });
        TITLE_MAP.put("JSP là gì?", new String[]{
            "Giới thiệu về JSP (JavaServer Pages)/n"
            + "1. JSP là gì?",
            "2. Ví dụ JSP đơn giản",
            "3. Giải thích mã JSP",
            "4. JSP so với Servlet",
            "5. Ứng dụng của JSP",
            "Kết luận"
        });
        TITLE_MAP.put("Mô hình MVC trong Java", new String[]{
            "Mô hình MVC trong Java/n"
            + "1. MVC là gì?",
            "2. Cách hoạt động của MVC",
            "3. Ví dụ MVC đơn giản",
            "4. Kết luận"
        });
        TITLE_MAP.put("Lập trình hướng đối tượng là gì?", new String[]{
            "Lập trình hướng đối tượng (OOP) trong Java/n"
            + "1. Lập trình hướng đối tượng là gì?",
            "2. Bốn tính chất của OOP/n"
            + "1️⃣ Tính đóng gói (Encapsulation)",
            "Tính kế thừa (Inheritance)",
            "Tính đa hình (Polymorphism)",
            "Tính trừu tượng (Abstraction)",
            "Kết luận"
        });
        TITLE_MAP.put("Lớp và đối tượng", new String[]{
            "Lớp và Đối tượng trong Java/n"
            + "1. Lớp (Class) là gì?",
            "2. Đối tượng (Object) là gì?",
            "Tóm tắt",});
        TITLE_MAP.put("Constructor", new String[]{
            "Constructor trong Java/n"
            + "1. Constructor là gì?",
            "2. Ví dụ về Constructor",
            "3. Các loại Constructor trong Java",
            "Tóm tắt",});
        TITLE_MAP.put("Phương thức (Method)", new String[]{
            "Phương thức (Method) trong Java/n"
            + "1. Phương thức là gì?",
            "2. Ví dụ về phương thức",
            "3. Các loại phương thức trong Java",
            "Tóm tắt",});
        TITLE_MAP.put("Đóng gói (Encapsulation)", new String[]{
            "Đóng gói (Encapsulation) trong Java/n"
            + "1. Đóng gói là gì?",
            "2. Ví dụ về đóng gói",
            "3. Lợi ích của đóng gói",
            "Tóm tắt"
        });
        TITLE_MAP.put("Kế thừa (Inheritance)", new String[]{
            "Kế thừa (Inheritance) trong Java/n"
            + "1. Kế thừa là gì?",
            "2. Ví dụ về kế thừa",
            "3. Các loại kế thừa trong Java",
            "Tóm tắt"
        });
        TITLE_MAP.put("Đa hình (Polymorphism)", new String[]{
            "Đa hình (Polymorphism) trong Java/n"
            + "1. Đa hình là gì?",
            "2. Loại đa hình trong Java",
            "3. Ví dụ về đa hình",
            "Tóm tắt"
        });
        TITLE_MAP.put("Interface và Abstract Class", new String[]{
            "Interface và Abstract Class trong Java/n"
            + "1. Interface là gì?",
            "2. Abstract Class là gì?",
            "3. So sánh Interface và Abstract Class",
            "Tóm tắt"
        });
        TITLE_MAP.put("Xử lý ngoại lệ (Exception Handling)", new String[]{
            "Xử lý ngoại lệ (Exception Handling) trong Java",
            "1. Thành phần xử lý ngoại lệ",
            "2. Ví dụ về xử lý ngoại lệ",
            "3. Phân loại ngoại lệ",
            "Kết luận"
        });
        TITLE_MAP.put("Đọc và ghi file trong Java", new String[]{
            "Đọc và ghi file trong Java",
            "1. Ghi file với FileWriter",
            "2. Đọc file với FileReader",
            "3. Đọc file bằng BufferedReader (Hiệu suất cao hơn)",
            "Kết luận"
        });
        TITLE_MAP.put("Giới thiệu Collection Framework", new String[]{
            "Giới thiệu Collection Framework trong Java" + "/n" + "1. Collection Framework là gì?",
            "2. Các thành phần chính trong Collection Framework",
            "3. Lợi ích của Collection Framework",});
        TITLE_MAP.put("ArrayList", new String[]{
            "ArrayList trong Java" + "/n" + "1. ArrayList là gì?",
            "2. Cách sử dụng ArrayList",
            "3. Một số phương thức phổ biến của ArrayList",
            "4. Ưu điểm và Nhược điểm của ArrayList",});
        TITLE_MAP.put("LinkedList", new String[]{
            "LinkedList trong Java" + "/n" + "1. LinkedList là gì?",
            "2. Cách sử dụng LinkedList",
            "3. Một số phương thức phổ biến của LinkedList",
            "4. Ưu điểm và Nhược điểm của LinkedList",});
        TITLE_MAP.put("HashMap", new String[]{
            "HashMap trong Java" + "/n" + "1. HashMap là gì?",
            "2. Cách sử dụng HashMap",
            "3. Một số phương thức phổ biến của HashMap",
            "4. Ưu điểm và Nhược điểm của HashMap",});
        TITLE_MAP.put("Giới thiệu JavaFX", new String[]{
            "Giới thiệu JavaFX/n"
            + "/n"
            + "1. JavaFX là gì?",
            "2. Cấu trúc cơ bản của một ứng dụng JavaFX",
            "3. Ví dụ ứng dụng JavaFX đơn giản",
            "4. Một số thành phần giao diện phổ biến trong JavaFX",
            "5. Ưu điểm và Nhược điểm của JavaFX",});
        TITLE_MAP.put("Cấu trúc ứng dụng JavaFX", new String[]{
            "Ứng dụng JavaFX cơ bản bao gồm ba thành phần chính:",});
        TITLE_MAP.put("Giới thiệu Spring Boot", new String[]{
            "Giới thiệu Spring Boot",
            "Ưu điểm của Spring Boot",
            "Ví dụ ứng dụng Spring Boot đơn giản",});
        TITLE_MAP.put("Tạo REST API với Spring Boot", new String[]{
            "Tạo REST API với Spring Boot",
            "Ví dụ REST API đơn giản",
            "Ví dụ CRUD API với Spring Boot",});
        TITLE_MAP.put("Kết nối cơ sở dữ liệu MySQL với Spring Boot", new String[]{
            "Kết nối cơ sở dữ liệu MySQL với Spring Boot",
            "1. Cấu hình cơ sở dữ liệu",
            "2. Tạo Entity (Bảng User)",
            "3. Tạo Repository (Giao tiếp với CSDL)",
            "4. Tạo Controller để thao tác với User",
            "5. Chạy ứng dụng"
        });
        TITLE_MAP.put("Giới thiệu về Microservices", new String[]{
            "Giới thiệu về Microservices",
            "Đặc điểm của Microservices",
            "So sánh Monolithic vs Microservices",
            "Công nghệ phổ biến trong Microservices",
            "Ví dụ về Microservices",});
        TITLE_MAP.put("Xây dựng Microservice với Spring Boot", new String[]{
            "Xây dựng Microservice với Spring Boot",
            "Các thành phần chính trong hệ thống Microservices",
            "Cấu hình Eureka Server (Service Discovery)",
            "Tạo dự án Spring Boot Eureka Server",
            "Tạo class EurekaServerApplication.java",
            "Cấu hình application.yml",
            "Cấu hình Microservice đăng ký với Eureka",
            "Thêm dependency vào pom.xml",
            "Cấu hình application.yml",
            "Tạo UserServiceApplication.java",
            "Xây dựng API Gateway để điều hướng request",
            "Thêm dependency vào pom.xml",
            "Cấu hình application.yml cho API Gateway",
            "Kết luận",});
        TITLE_MAP.put("Bảo mật với Spring Security", new String[]{
            "Bảo mật với Spring Security",
            "Cài đặt Spring Security",
            "Cấu hình bảo mật với SecurityConfig",
            "Tạo tài khoản đăng nhập",
            "Kết hợp Spring Security với JWT",
            "Kết luận"
        });
        TITLE_MAP.put("Xác thực bằng JWT", new String[]{
            "Xác thực API bằng JWT trong Spring Boot",
            "Cài đặt thư viện JWT",
            "Tạo class JwtUtil để xử lý JWT",
            "Tạo API đăng nhập trả về JWT",
            "Xác thực JWT trong Request",
            "Áp dụng Filter vào SecurityConfig",
            "Test API với JWT",
            "Kết luận",});
        TITLE_MAP.put("Kiểm thử với JUnit và Mockito", new String[]{
            "Kiểm thử trong Java với JUnit và Mockito",
            "Cài đặt JUnit & Mockito",
            "Kiểm thử đơn vị với JUnit",
            "Giả lập dữ liệu với Mockito",
            "Chạy Test & Kiểm Tra Kết Quả",
            "Tổng kết"
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
        //Java
        Content_MAP.put("Java là gì?", new String[]{
            "Java là một ngôn ngữ lập trình bậc cao, hướng đối tượng, được phát triển bởi Sun Microsystems (nay thuộc Oracle) vào năm 1995. Java nổi bật với nguyên tắc \"Viết một lần, chạy mọi nơi\" (Write Once, Run Anywhere - WORA), cho phép mã nguồn Java chỉ cần viết một lần nhưng có thể chạy trên nhiều hệ điều hành khác nhau thông qua Máy ảo Java (Java Virtual Machine - JVM).\n"
            + "\n"
            + "Java được thiết kế để dễ học, dễ sử dụng, bảo mật cao và có hiệu suất tốt. Ngôn ngữ này có cú pháp tương tự C++, nhưng loại bỏ các tính năng phức tạp như con trỏ và đa kế thừa, giúp lập trình viên giảm thiểu lỗi và dễ dàng bảo trì mã nguồn.",
            "1. Đa nền tảng (Platform Independence)\n"
            + "Một trong những ưu điểm lớn nhất của Java là khả năng chạy trên nhiều hệ điều hành mà không cần chỉnh sửa mã nguồn. Khi chương trình Java được biên dịch, nó sẽ tạo ra mã bytecode (.class) thay vì mã máy (machine code) như các ngôn ngữ khác. Mã bytecode này có thể được thực thi trên bất kỳ hệ thống nào có JVM mà không cần biên dịch lại, đảm bảo tính tương thích cao giữa các nền tảng như Windows, macOS, Linux và cả các thiết bị di động.\n"
            + "\n"
            + "2. Lập trình hướng đối tượng (Object-Oriented Programming - OOP)\n"
            + "Java là một ngôn ngữ lập trình hoàn toàn hướng đối tượng, nghĩa là mọi thành phần trong Java đều được biểu diễn dưới dạng đối tượng. Các đặc tính chính của lập trình hướng đối tượng trong Java bao gồm:\n"
            + "\n"
            + "Đóng gói (Encapsulation): Giúp bảo vệ dữ liệu và hạn chế truy cập trực tiếp từ bên ngoài.\n"
            + "\n"
            + "Kế thừa (Inheritance): Cho phép một lớp con tái sử dụng các thuộc tính và phương thức của lớp cha.\n"
            + "\n"
            + "Đa hình (Polymorphism): Giúp các phương thức có thể hoạt động theo nhiều cách khác nhau.\n"
            + "\n"
            + "Trừu tượng (Abstraction): Cho phép ẩn đi các chi tiết không cần thiết và chỉ hiển thị những gì quan trọng.\n"
            + "\n"
            + "Nhờ vào mô hình OOP, Java giúp việc phát triển phần mềm trở nên dễ dàng hơn, mã nguồn có tính tái sử dụng cao và dễ dàng mở rộng.\n"
            + "\n"
            + "3. Bảo mật cao (Security)\n"
            + "Java được thiết kế để đảm bảo tính bảo mật, hạn chế các lỗ hổng bảo mật có thể bị khai thác trong hệ thống:\n"
            + "\n"
            + "Không sử dụng con trỏ: Giúp tránh lỗi truy cập bộ nhớ trái phép và hạn chế nguy cơ tấn công từ mã độc.\n"
            + "\n"
            + "Máy ảo Java (JVM) kiểm tra mã bytecode trước khi thực thi, giúp phát hiện các đoạn mã độc hại.\n"
            + "\n"
            + "Mô hình cấp quyền (Security Manager) giúp kiểm soát quyền truy cập tài nguyên như hệ thống tập tin, mạng hoặc bộ nhớ.\n"
            + "\n"
            + "Cơ chế mã hóa và xác thực giúp đảm bảo an toàn trong các ứng dụng web và hệ thống doanh nghiệp.\n"
            + "\n"
            + "4. Quản lý bộ nhớ tự động (Garbage Collection - GC)\n"
            + "Java có hệ thống Garbage Collection (GC) giúp tự động thu hồi bộ nhớ không sử dụng, giảm nguy cơ rò rỉ bộ nhớ và giúp lập trình viên không cần phải quản lý bộ nhớ thủ công như trong C/C++. Điều này giúp Java trở thành một ngôn ngữ thân thiện với lập trình viên hơn.\n"
            + "\n"
            + "5. Hỗ trợ đa luồng (Multithreading)\n"
            + "Java cho phép thực thi nhiều luồng (thread) cùng lúc, giúp tối ưu hóa hiệu suất của các ứng dụng, đặc biệt là trong các hệ thống lớn hoặc xử lý dữ liệu song song. Các ứng dụng như trò chơi, trình duyệt web và hệ thống ngân hàng đều tận dụng khả năng này để hoạt động hiệu quả hơn.\n"
            + "\n"
            + "6. Hệ sinh thái phong phú và cộng đồng lớn\n"
            + "Java có một hệ sinh thái mạnh mẽ với hàng nghìn thư viện hỗ trợ nhiều lĩnh vực khác nhau như lập trình web, khoa học dữ liệu, trí tuệ nhân tạo và phát triển ứng dụng di động. Ngoài ra, cộng đồng Java rất lớn, giúp lập trình viên dễ dàng tìm kiếm tài liệu, hỗ trợ và cập nhật công nghệ mới nhất.",
            "Java là một trong những ngôn ngữ lập trình phổ biến nhất thế giới và được sử dụng trong nhiều lĩnh vực khác nhau:\n"
            + "\n"
            + "Phát triển ứng dụng web:\n"
            + "\n"
            + "Các công nghệ như Spring Boot, Jakarta EE, Hibernate giúp Java trở thành lựa chọn hàng đầu trong lập trình web.\n"
            + "\n"
            + "Nhiều trang web lớn như LinkedIn, Amazon, eBay sử dụng Java làm ngôn ngữ chính.\n"
            + "\n"
            + "Phát triển ứng dụng di động:\n"
            + "\n"
            + "Java là ngôn ngữ chính của Android, hệ điều hành di động phổ biến nhất hiện nay.\n"
            + "\n"
            + "Các ứng dụng Android được viết bằng Java sử dụng bộ công cụ Android SDK để phát triển.\n"
            + "\n"
            + "Ứng dụng trong doanh nghiệp:\n"
            + "\n"
            + "Nhiều hệ thống ngân hàng, tài chính và thương mại điện tử được phát triển bằng Java do tính bảo mật cao và khả năng mở rộng tốt.\n"
            + "\n"
            + "Các nền tảng quản lý doanh nghiệp như ERP, CRM cũng sử dụng Java để xây dựng các hệ thống phức tạp.\n"
            + "\n"
            + "Khoa học dữ liệu và trí tuệ nhân tạo:\n"
            + "\n"
            + "Java hỗ trợ các thư viện AI như Deeplearning4j để xây dựng các ứng dụng học máy và phân tích dữ liệu.\n"
            + "\n"
            + "Lập trình hệ thống nhúng và IoT:\n"
            + "\n"
            + "Java có thể được sử dụng để phát triển phần mềm nhúng cho các thiết bị như TV thông minh, thiết bị IoT và hệ thống nhúng trong xe hơi.\n"
            + "\n"
            + "Phát triển trò chơi (Game Development):\n"
            + "\n"
            + "Trò chơi nổi tiếng Minecraft được viết bằng Java.\n"
            + "\n"
            + "Các game engine như LibGDX, jMonkeyEngine hỗ trợ phát triển trò chơi với Java.",
            "Java là một trong những ngôn ngữ lập trình mạnh mẽ, linh hoạt và phổ biến nhất hiện nay. Nhờ vào tính đa nền tảng, bảo mật cao, hỗ trợ lập trình hướng đối tượng, quản lý bộ nhớ tự động và hệ sinh thái phong phú, Java là lựa chọn hàng đầu cho các ứng dụng web, di động, doanh nghiệp và trí tuệ nhân tạo. Với cộng đồng lớn và sự hỗ trợ mạnh mẽ từ Oracle, Java tiếp tục phát triển và duy trì vị trí quan trọng trong ngành công nghệ phần mềm."
        });
        Content_MAP.put("Lịch sử phát triển của Java", new String[]{
            "Java là một trong những ngôn ngữ lập trình phổ biến nhất thế giới, với lịch sử phát triển lâu dài và liên tục cải tiến để phù hợp với nhu cầu công nghệ hiện đại. Dưới đây là các mốc quan trọng trong quá trình phát triển của Java từ khi ra đời đến nay.",
            "Vào đầu những năm 1990, James Gosling, cùng với một nhóm kỹ sư tại Sun Microsystems, bắt đầu nghiên cứu và phát triển một ngôn ngữ lập trình mới với mục tiêu tạo ra một nền tảng có thể chạy trên nhiều thiết bị khác nhau. Nhóm này được gọi là Green Team.\n"
            + "\n"
            + "Ban đầu, họ thiết kế một ngôn ngữ có tên Oak, nhằm lập trình cho các thiết bị điện tử thông minh như TV, đầu thu kỹ thuật số và thiết bị gia dụng. Tuy nhiên, vì tên Oak đã được đăng ký bản quyền, họ đổi tên thành Java, lấy cảm hứng từ loại cà phê Java nổi tiếng của Indonesia.",
            "Vào ngày 23 tháng 5 năm 1995, Sun Microsystems chính thức ra mắt Java 1.0, kèm theo khẩu hiệu \"Viết một lần, chạy mọi nơi\" (Write Once, Run Anywhere - WORA). Điểm nổi bật của Java là nó chạy trên Máy ảo Java (JVM - Java Virtual Machine), cho phép phần mềm có thể hoạt động trên nhiều hệ điều hành khác nhau mà không cần thay đổi mã nguồn.\n"
            + "\n"
            + "Ban đầu, Java được sử dụng chủ yếu trong lập trình các thiết bị điện tử. Tuy nhiên, với khả năng đa nền tảng, bảo mật cao và mô hình hướng đối tượng, Java nhanh chóng được áp dụng trong nhiều lĩnh vực, đặc biệt là phát triển ứng dụng web. Các trình duyệt như Netscape Navigator đã tích hợp hỗ trợ Java Applets, giúp Java ngày càng phổ biến.",
            "Với sự ra mắt của Java 2 Platform, Enterprise Edition (J2EE), Java dần trở thành lựa chọn hàng đầu cho lập trình doanh nghiệp. J2EE cung cấp các công nghệ mạnh mẽ như Servlets, JSP, EJB (Enterprise JavaBeans), giúp xây dựng các ứng dụng web và hệ thống quản lý doanh nghiệp phức tạp.\n"
            + "\n"
            + "Trong giai đoạn này, nhiều tập đoàn lớn như IBM, Oracle, SAP đã sử dụng Java để phát triển các hệ thống phần mềm doanh nghiệp, giúp ngôn ngữ này ngày càng khẳng định vị thế của mình. Đồng thời, J2SE (Java 2 Standard Edition) và J2ME (Java 2 Micro Edition) cũng được phát triển, giúp Java mở rộng ra cả ứng dụng desktop và thiết bị di động.",
            "Nhận thấy sự phát triển mạnh mẽ của cộng đồng mã nguồn mở, Sun Microsystems quyết định mở mã nguồn Java bằng cách ra mắt OpenJDK (Open Java Development Kit) vào năm 2006. Đây là một bước tiến quan trọng, giúp lập trình viên trên toàn thế giới có thể đóng góp vào sự phát triển của Java.\n"
            + "\n"
            + "Việc phát hành OpenJDK cũng giúp Java trở thành nền tảng mở, cạnh tranh tốt hơn với các công nghệ khác như .NET của Microsoft.",
            "Năm 2010, Oracle Corporation mua lại Sun Microsystems với giá 7.4 tỷ USD, chính thức tiếp quản Java và các công nghệ liên quan như MySQL, Solaris.\n"
            + "\n"
            + "Dưới sự quản lý của Oracle, Java tiếp tục được phát triển và cập nhật mạnh mẽ, với nhiều cải tiến quan trọng:\n"
            + "\n"
            + "Java 7 (2011): Bổ sung try-with-resources, hỗ trợ nhiều cải tiến về hiệu suất và bảo mật.\n"
            + "\n"
            + "Java 8 (2014): Giới thiệu Lambda Expressions, Stream API, nâng cao hiệu suất lập trình hướng chức năng.\n"
            + "\n"
            + "Java 9 (2017): Ra mắt Java Platform Module System (JPMS), giúp tối ưu hóa hiệu suất và quản lý mã nguồn tốt hơn.\n"
            + "\n"
            + "Tuy nhiên, việc Oracle thay đổi mô hình cấp phép của Java từ phiên bản Java 11 (2018) khiến nhiều doanh nghiệp chuyển sang sử dụng các phiên bản Java miễn phí như OpenJDK, Amazon Corretto, AdoptOpenJDK.",
            "Từ năm 2021, Oracle chuyển sang mô hình phát hành phiên bản Java mới mỗi 6 tháng, giúp cập nhật tính năng và cải tiến hiệu suất nhanh hơn. Các phiên bản Java mới nhất bao gồm:\n"
            + "\n"
            + "Java 17 (2021): Là phiên bản LTS (Long-Term Support), với nhiều cải tiến về hiệu suất và bảo mật.\n"
            + "\n"
            + "Java 21 (2023): Tiếp tục cải thiện về hiệu suất, hỗ trợ các tính năng mới như Virtual Threads, Pattern Matching.\n"
            + "\n"
            + "Hiện tại, Java vẫn là một trong những ngôn ngữ lập trình phổ biến nhất, được sử dụng rộng rãi trong phát triển ứng dụng web, di động (Android), hệ thống doanh nghiệp, trí tuệ nhân tạo và IoT.",
            "Từ một dự án nghiên cứu nội bộ vào năm 1991, Java đã trở thành một trong những ngôn ngữ lập trình quan trọng nhất trong ngành công nghệ phần mềm. Với khả năng đa nền tảng, bảo mật cao, hướng đối tượng và cộng đồng lớn mạnh, Java tiếp tục đóng vai trò quan trọng trong thế giới lập trình hiện đại."
        });

        Content_MAP.put("Lý do chọn Java", new String[]{
            "Java là một trong những ngôn ngữ lập trình phổ biến và mạnh mẽ nhất hiện nay. Dưới đây là những lý do khiến Java trở thành lựa chọn hàng đầu cho nhiều lập trình viên và doanh nghiệp.",
            "Java được thiết kế với nguyên tắc \"Write Once, Run Anywhere\" (Viết một lần, chạy mọi nơi). Điều này có nghĩa là mã nguồn Java chỉ cần viết một lần và có thể chạy trên bất kỳ hệ điều hành nào có Máy ảo Java (JVM - Java Virtual Machine).\n"
            + "\n"
            + "Nhờ vào cơ chế biên dịch thành bytecode, Java có thể chạy trên Windows, macOS, Linux, Unix, thậm chí trên thiết bị di động và nhúng mà không cần biên dịch lại. Điều này giúp Java trở thành một lựa chọn lý tưởng cho các dự án cần tính tương thích cao giữa nhiều nền tảng khác nhau.",
            "Java là một ngôn ngữ lập trình hoàn toàn hướng đối tượng (OOP - Object-Oriented Programming), nghĩa là toàn bộ chương trình Java được tổ chức dựa trên các lớp (class) và đối tượng (object).\n"
            + "\n"
            + "Những lợi ích của lập trình hướng đối tượng trong Java bao gồm:\n"
            + "\n"
            + "Dễ bảo trì và mở rộng: Chương trình được tổ chức theo mô-đun, dễ dàng chỉnh sửa và nâng cấp.\n"
            + "\n"
            + "Tái sử dụng mã nguồn: Các lớp có thể được sử dụng lại trong nhiều dự án khác nhau, giúp tiết kiệm thời gian phát triển.\n"
            + "\n"
            + "Dễ hiểu và dễ phát triển: Nhờ vào các tính năng như đóng gói (Encapsulation), kế thừa (Inheritance), đa hình (Polymorphism), Java giúp lập trình viên xây dựng các ứng dụng phức tạp một cách dễ dàng và có tổ chức.\n"
            + "\n"
            + "Nhờ mô hình OOP mạnh mẽ, Java là một lựa chọn tuyệt vời cho phát triển phần mềm doanh nghiệp, ứng dụng lớn và hệ thống phức tạp.",
            "Java được thiết kế với nhiều tính năng bảo mật để hạn chế lỗi lập trình và các cuộc tấn công mạng. Một số cơ chế bảo mật nổi bật trong Java bao gồm:\n"
            + "\n"
            + "Không sử dụng con trỏ trực tiếp: Giúp tránh lỗi truy cập bộ nhớ và các cuộc tấn công từ mã độc.\n"
            + "\n"
            + "Quản lý bộ nhớ tự động: Hệ thống Garbage Collection (GC) giúp thu hồi bộ nhớ không sử dụng, ngăn chặn lỗi tràn bộ nhớ (memory leak).\n"
            + "\n"
            + "Mô hình bảo mật Java (Security Manager): Kiểm soát quyền truy cập tài nguyên hệ thống như tập tin, mạng và bộ nhớ.\n"
            + "\n"
            + "Mã hóa mạnh mẽ: Java hỗ trợ nhiều thư viện mã hóa như Java Cryptography Architecture (JCA), giúp bảo vệ dữ liệu và giao tiếp an toàn.\n"
            + "\n"
            + "Nhờ tính bảo mật cao, Java thường được sử dụng trong các hệ thống quan trọng như ngân hàng, tài chính, thương mại điện tử và chính phủ.",
            "Java có một cộng đồng lập trình viên vô cùng lớn mạnh, với hàng triệu người sử dụng trên toàn thế giới. Điều này mang lại nhiều lợi ích cho lập trình viên khi chọn Java:\n"
            + "\n"
            + "Tài liệu phong phú: Có hàng ngàn tài liệu, khóa học và diễn đàn hỗ trợ học tập và giải quyết vấn đề.\n"
            + "\n"
            + "Thư viện mã nguồn mở: Java có kho thư viện khổng lồ như Spring, Hibernate, Apache Commons, giúp lập trình viên tiết kiệm thời gian phát triển.\n"
            + "\n"
            + "Hỗ trợ từ doanh nghiệp lớn: Các công ty công nghệ như Oracle, Google, IBM, Amazon đều sử dụng và đóng góp vào hệ sinh thái Java.\n"
            + "\n"
            + "Nhờ cộng đồng lớn và nguồn tài nguyên phong phú, Java là một lựa chọn lý tưởng cho cả người mới bắt đầu và lập trình viên chuyên nghiệp.",
            "Java không chỉ giới hạn trong lập trình web hay ứng dụng desktop, mà còn được sử dụng rộng rãi trong nhiều lĩnh vực khác nhau:\n"
            + "\n"
            + "Phát triển ứng dụng web:\n"
            + "\n"
            + "Các framework như Spring Boot, Jakarta EE giúp Java trở thành nền tảng chính trong phát triển web doanh nghiệp.\n"
            + "\n"
            + "Nhiều trang web lớn như LinkedIn, eBay, Amazon được xây dựng bằng Java.\n"
            + "\n"
            + "Phát triển ứng dụng di động:\n"
            + "\n"
            + "Java là ngôn ngữ chính của Android, hệ điều hành di động phổ biến nhất hiện nay.\n"
            + "\n"
            + "Hàng triệu ứng dụng Android được phát triển bằng Java với bộ công cụ Android SDK.\n"
            + "\n"
            + "Ứng dụng trong doanh nghiệp:\n"
            + "\n"
            + "Java là lựa chọn hàng đầu trong các hệ thống ERP, CRM, tài chính, ngân hàng nhờ vào tính ổn định và bảo mật cao.\n"
            + "\n"
            + "Trí tuệ nhân tạo và khoa học dữ liệu:\n"
            + "\n"
            + "Java hỗ trợ các thư viện AI và dữ liệu lớn như Deeplearning4j, Apache Spark, giúp phát triển ứng dụng AI mạnh mẽ.\n"
            + "\n"
            + "Lập trình hệ thống nhúng và IoT:\n"
            + "\n"
            + "Java có thể chạy trên thiết bị IoT, TV thông minh, hệ thống nhúng trong xe hơi và nhiều thiết bị khác.\n"
            + "\n"
            + "Phát triển trò chơi:\n"
            + "\n"
            + "Các game engine như LibGDX, jMonkeyEngine hỗ trợ phát triển trò chơi bằng Java.\n"
            + "\n"
            + "Trò chơi nổi tiếng Minecraft được viết bằng Java.",
            "Với các ưu điểm như đa nền tảng, bảo mật cao, hỗ trợ lập trình hướng đối tượng, cộng đồng lớn mạnh và ứng dụng rộng rãi, Java vẫn là một trong những ngôn ngữ lập trình đáng học và đáng sử dụng nhất hiện nay. Nếu bạn đang tìm kiếm một ngôn ngữ mạnh mẽ để phát triển phần mềm, Java chắc chắn là một lựa chọn không thể bỏ qua!",});
        Content_MAP.put("Ứng dụng của Java", new String[]{
            "Java là một trong những ngôn ngữ lập trình phổ biến nhất thế giới, được sử dụng trong nhiều lĩnh vực công nghệ khác nhau. Dưới đây là các ứng dụng chính của Java trong thực tế.",
            "Java hỗ trợ xây dựng ứng dụng desktop đa nền tảng, có thể chạy trên Windows, macOS và Linux mà không cần thay đổi mã nguồn.\n"
            + "\n"
            + "🔹 Công nghệ phổ biến:\n"
            + "\n"
            + "JavaFX: Framework hiện đại, hỗ trợ giao diện đồ họa đẹp mắt với hiệu ứng động và khả năng tích hợp web.\n"
            + "\n"
            + "Swing: Thư viện GUI truyền thống của Java, giúp xây dựng ứng dụng desktop với các thành phần như nút bấm, cửa sổ, bảng điều khiển.\n"
            + "\n"
            + "🔹 Ứng dụng thực tế:\n"
            + "\n"
            + "Phần mềm quản lý bán hàng, kế toán.\n"
            + "\n"
            + "Ứng dụng hỗ trợ doanh nghiệp như Eclipse IDE, IntelliJ IDEA, NetBeans (các IDE viết bằng Java).\n"
            + "\n"
            + "Công cụ thiết kế và chỉnh sửa đồ họa.",
            "Java là một trong những nền tảng phổ biến nhất để xây dựng ứng dụng web nhờ vào khả năng bảo mật cao, hiệu suất mạnh mẽ và hỗ trợ nhiều framework.\n"
            + "\n"
            + "🔹 Công nghệ phổ biến:\n"
            + "\n"
            + "Spring Boot: Framework hiện đại giúp phát triển ứng dụng web nhanh chóng, hỗ trợ REST API, Microservices.\n"
            + "\n"
            + "Jakarta EE (trước đây là Java EE): Nền tảng tiêu chuẩn cho ứng dụng web doanh nghiệp, hỗ trợ Servlet, JSP, EJB.\n"
            + "\n"
            + "Hibernate: Thư viện ORM giúp quản lý cơ sở dữ liệu hiệu quả.\n"
            + "\n"
            + "🔹 Ứng dụng thực tế:\n"
            + "\n"
            + "Trang web thương mại điện tử (Amazon, eBay sử dụng Java).\n"
            + "\n"
            + "Hệ thống quản lý doanh nghiệp (ERP, CRM).\n"
            + "\n"
            + "Cổng thanh toán trực tuyến, ngân hàng số.",
            "Java là ngôn ngữ chính trong phát triển ứng dụng Android trước khi Kotlin ra đời. Hiện nay, Java và Kotlin là hai lựa chọn phổ biến nhất để lập trình Android.\n"
            + "\n"
            + "🔹 Công nghệ phổ biến:\n"
            + "\n"
            + "Android SDK: Bộ công cụ phát triển ứng dụng Android bằng Java.\n"
            + "\n"
            + "Android Studio: Môi trường phát triển tích hợp (IDE) chính thức của Google.\n"
            + "\n"
            + "🔹 Ứng dụng thực tế:\n"
            + "\n"
            + "Ứng dụng di động như Facebook, Instagram, TikTok đều có phần backend viết bằng Java.\n"
            + "\n"
            + "Game mobile trên nền tảng Android.",
            "Java không chỉ giới hạn ở ứng dụng doanh nghiệp hay web, mà còn có mặt trong các lĩnh vực như dữ liệu lớn, trí tuệ nhân tạo và tài chính.\n"
            + "\n"
            + "🔹 Big Data & Xử lý dữ liệu lớn:\n"
            + "\n"
            + "Apache Hadoop: Hệ thống xử lý dữ liệu lớn phổ biến nhất, chạy trên Java.\n"
            + "\n"
            + "Apache Spark: Nền tảng xử lý dữ liệu nhanh, hỗ trợ AI và Machine Learning.\n"
            + "\n"
            + "🔹 Trí tuệ nhân tạo (AI) và Học máy:\n"
            + "\n"
            + "Deeplearning4j: Framework học sâu hỗ trợ AI trên Java.\n"
            + "\n"
            + "Weka: Công cụ phân tích dữ liệu và AI viết bằng Java.\n"
            + "\n"
            + "🔹 Ứng dụng trong tài chính:\n"
            + "\n"
            + "Java được sử dụng trong các ngân hàng lớn như Goldman Sachs, Citigroup, JPMorgan.\n"
            + "\n"
            + "Các nền tảng giao dịch chứng khoán, hệ thống thanh toán đều dựa trên Java do tính bảo mật cao.",
            "Java là một ngôn ngữ lập trình đa năng, có thể sử dụng để phát triển ứng dụng desktop, web, di động, xử lý dữ liệu lớn, AI và tài chính. Với cộng đồng mạnh mẽ và hệ sinh thái phong phú, Java vẫn là một trong những lựa chọn hàng đầu cho lập trình viên trên toàn thế giới.",});
        //2
        //
        //
        //
        Content_MAP.put("Cấu trúc cơ bản của một chương trình Java", new String[]{
            "Dưới đây là ví dụ về một chương trình Java đơn giản:",
            "Chương trình này in ra màn hình dòng chữ \"Hello, World!\". Dưới đây là giải thích chi tiết về từng thành phần:",
            "public: Từ khóa này xác định phạm vi truy cập (access modifier), cho phép lớp có thể được truy cập từ bất kỳ đâu.\n"
            + "\n"
            + "class: Từ khóa dùng để khai báo một lớp trong Java.\n"
            + "\n"
            + "HelloWorld: Tên của lớp. Theo quy tắc đặt tên, tên lớp trong Java phải bắt đầu bằng chữ in hoa và tuân theo quy tắc CamelCase.\n"
            + "\n"
            + "Trong Java, mọi chương trình đều phải nằm trong một lớp, vì Java là ngôn ngữ lập trình hướng đối tượng (OOP).",
            "public: Phương thức có thể được truy cập từ bất kỳ đâu.\n"
            + "\n"
            + "static: Phương thức main có thể chạy mà không cần tạo đối tượng của lớp HelloWorld.\n"
            + "\n"
            + "void: Phương thức không trả về giá trị nào.\n"
            + "\n"
            + "main: Đây là tên phương thức đặc biệt mà JVM sẽ tìm kiếm để bắt đầu thực thi chương trình.\n"
            + "\n"
            + "String[] args: Đối số của phương thức main, dùng để nhận dữ liệu từ dòng lệnh khi chạy chương trình.\n"
            + "\n"
            + "💡 Lưu ý: Nếu không có phương thức main(), chương trình Java sẽ không thể chạy được.",
            "System.out.println(): Lệnh này dùng để in nội dung ra màn hình console.\n"
            + "\n"
            + "System: Lớp có sẵn trong Java, chứa các thành phần hỗ trợ nhập/xuất dữ liệu.\n"
            + "\n"
            + "out: Biến đối tượng của lớp System, đại diện cho luồng xuất chuẩn (standard output stream).\n"
            + "\n"
            + "println(): Phương thức in nội dung ra màn hình và tự động xuống dòng.\n"
            + "\n"
            + "💡 Lưu ý: Nếu dùng System.out.print() (không có ln), nội dung sẽ được in ra mà không xuống dòng.",
            "Để chạy chương trình Java, thực hiện các bước sau:\n"
            + "\n"
            + "1️⃣ Biên dịch mã nguồn\n"
            + "Mở terminal hoặc command prompt và chạy lệnh sau:",
            "Lệnh này sẽ biên dịch tập tin HelloWorld.java thành file HelloWorld.class.\n"
            + "\n"
            + "2️⃣ Chạy chương trình",
            "Sau khi chạy, màn hình sẽ hiển thị:",
            "Chương trình Java cơ bản gồm:\n"
            + "✅ Một lớp chứa phương thức main() để JVM có thể chạy chương trình.\n"
            + "✅ Lệnh System.out.println() để hiển thị nội dung ra màn hình.\n"
            + "✅ Cấu trúc chặt chẽ và rõ ràng, giúp lập trình viên dễ dàng viết và quản lý mã nguồn.\n"
            + "\n"
            + "⏩ Từ đây, bạn có thể mở rộng kiến thức với các khái niệm như biến, kiểu dữ liệu, vòng lặp, điều kiện, và lập trình hướng đối tượng trong Java! 🚀",});
        Content_MAP.put("Cài đặt JDK", new String[]{
            "JDK (Java Development Kit) là bộ công cụ cần thiết để biên dịch và chạy chương trình Java. Dưới đây là các bước cài đặt JDK và kiểm tra sau khi cài đặt.",
            "Có hai lựa chọn phổ biến để tải JDK:\n"
            + "\n"
            + "Oracle JDK: Phiên bản chính thức do Oracle phát triển.\n"
            + "\n"
            + "Trang tải về: https://www.oracle.com/java/technologies/javase-downloads.html\n"
            + "\n"
            + "OpenJDK: Phiên bản mã nguồn mở, miễn phí.\n"
            + "\n"
            + "Trang tải về: https://openjdk.org/install/\n"
            + "\n"
            + "Nếu dùng Windows, có thể tải OpenJDK từ Adoptium Temurin hoặc Amazon Corretto.\n"
            + "\n"
            + "📌 Lưu ý:\n"
            + "\n"
            + "Chọn phiên bản JDK phù hợp với hệ điều hành (Windows, macOS, Linux).\n"
            + "\n"
            + "Nếu không cần dùng phiên bản mới nhất, nên cài JDK LTS (phiên bản hỗ trợ dài hạn), như JDK 17 hoặc JDK 21.",
            "🔹 Windows:\n"
            + "\n"
            + "Chạy file cài đặt (.exe) và làm theo hướng dẫn.\n"
            + "\n"
            + "Chọn thư mục cài đặt (mặc định là C:\\Program Files\\Java\\jdk-XX).\n"
            + "\n"
            + "Nhấn Next và hoàn tất quá trình cài đặt.\n"
            + "\n"
            + "🔹 macOS:\n"
            + "\n"
            + "Mở file .dmg và kéo thả JDK vào thư mục Applications.\n"
            + "\n"
            + "🔹 Linux (Ubuntu/Debian):\n"
            + "Mở terminal và chạy lệnh:",
            "Sau khi cài đặt, cần cấu hình biến môi trường JAVA_HOME để hệ thống nhận diện JDK.\n"
            + "\n"
            + "🔹 Windows:\n"
            + "\n"
            + "Mở Control Panel → System → Advanced system settings → Environment Variables.\n"
            + "\n"
            + "Trong System variables, nhấn New và nhập:\n"
            + "\n"
            + "Variable name: JAVA_HOME\n"
            + "\n"
            + "Variable value: C:\\Program Files\\Java\\jdk-XX (đường dẫn JDK)\n"
            + "\n"
            + "Tìm biến Path, nhấn Edit, thêm dòng:",
            "Nhấn OK để lưu cài đặt.\n"
            + "\n"
            + "🔹 macOS & Linux:\n"
            + "Thêm dòng sau vào file ~/.bashrc hoặc ~/.zshrc:",
            "Sau đó, áp dụng thay đổi:",
            "Mở Command Prompt (Windows) hoặc Terminal (macOS/Linux) và chạy:",
            "Nếu hiển thị:",
            "👉 Nghĩa là Java đã được cài đặt thành công! 🎉\n"
            + "\n"
            + "Tiếp theo, kiểm tra trình biên dịch Java (javac):",
            "Nếu hiển thị:",
            "👉 Bạn đã sẵn sàng để lập trình Java! 🚀",});
        Content_MAP.put("IDE phổ biến để lập trình Java", new String[]{
            "IDE (Integrated Development Environment) là môi trường tích hợp giúp lập trình viên viết, biên dịch, gỡ lỗi và chạy chương trình Java một cách hiệu quả. Dưới đây là những IDE phổ biến nhất dành cho Java.",
            "🛠 Nhà phát triển: JetBrains\n"
            + "💰 Phiên bản:\n"
            + "\n"
            + "Community Edition (miễn phí): Dành cho Java cơ bản.\n"
            + "\n"
            + "Ultimate Edition (trả phí): Hỗ trợ đầy đủ cho lập trình web, doanh nghiệp.\n"
            + "\n"
            + "🔹 Ưu điểm:\n"
            + "✅ Hiệu suất cao, hỗ trợ tự động hoàn thành thông minh.\n"
            + "✅ Tích hợp sẵn các công cụ như Maven, Gradle, Git, Docker.\n"
            + "✅ Hỗ trợ Spring Boot, Hibernate, JavaFX tốt.\n"
            + "✅ Giao diện đẹp, dễ sử dụng.\n"
            + "\n"
            + "🔹 Nhược điểm:\n"
            + "❌ Phiên bản Ultimate trả phí khá cao.\n"
            + "❌ Nặng hơn so với một số IDE khác.\n"
            + "\n"
            + "📌 Phù hợp cho: Lập trình viên chuyên nghiệp, phát triển ứng dụng doanh nghiệp.\n"
            + "\n"
            + "🔗 Tải về: https://www.jetbrains.com/idea/",
            "🛠 Nhà phát triển: Eclipse Foundation\n"
            + "💰 Miễn phí & Mã nguồn mở\n"
            + "\n"
            + "🔹 Ưu điểm:\n"
            + "✅ Mã nguồn mở, hoàn toàn miễn phí.\n"
            + "✅ Hỗ trợ nhiều plugin mở rộng.\n"
            + "✅ Hỗ trợ Java EE, JavaFX, Spring Boot, Android.\n"
            + "\n"
            + "🔹 Nhược điểm:\n"
            + "❌ Giao diện cũ, chưa thân thiện bằng IntelliJ IDEA.\n"
            + "❌ Có thể bị chậm nếu cài nhiều plugin.\n"
            + "\n"
            + "📌 Phù hợp cho: Sinh viên, lập trình viên muốn sử dụng công cụ miễn phí mạnh mẽ.\n"
            + "\n"
            + "🔗 Tải về: https://www.eclipse.org/",
            "🛠 Nhà phát triển: Apache Software Foundation\n"
            + "💰 Miễn phí & Mã nguồn mở\n"
            + "\n"
            + "🔹 Ưu điểm:\n"
            + "✅ Giao diện trực quan, dễ sử dụng.\n"
            + "✅ Hỗ trợ kéo thả để thiết kế giao diện GUI.\n"
            + "✅ Tích hợp sẵn trình biên dịch, không cần cấu hình thêm.\n"
            + "\n"
            + "🔹 Nhược điểm:\n"
            + "❌ Chậm hơn so với IntelliJ IDEA và Eclipse.\n"
            + "❌ Không có nhiều plugin mở rộng.\n"
            + "\n"
            + "📌 Phù hợp cho: Người mới học Java, lập trình viên phát triển ứng dụng desktop.\n"
            + "\n"
            + "🔗 Tải về: https://netbeans.apache.org/",
            "🛠 Nhà phát triển: Microsoft\n"
            + "💰 Miễn phí & Mã nguồn mở\n"
            + "\n"
            + "🔹 Ưu điểm:\n"
            + "✅ Gọn nhẹ, chạy nhanh.\n"
            + "✅ Hỗ trợ nhiều ngôn ngữ ngoài Java.\n"
            + "✅ Có thể mở rộng tính năng với các extension như Java Extension Pack.\n"
            + "✅ Tích hợp Git, hỗ trợ debug tốt.\n"
            + "\n"
            + "🔹 Nhược điểm:\n"
            + "❌ Cần cài thêm Java Extension Pack để lập trình Java.\n"
            + "❌ Không mạnh bằng IntelliJ hoặc Eclipse cho dự án lớn.\n"
            + "\n"
            + "📌 Phù hợp cho: Lập trình viên thích IDE nhẹ, làm việc với nhiều ngôn ngữ khác nhau.\n"
            + "\n"
            + "🔗 Tải về: https://code.visualstudio.com/",
            "So sánh các IDE phổ biến cho lập trình Java\n"
            + "Dưới đây là đánh giá tổng quan về bốn IDE phổ biến nhất cho Java:\n"
            + "\n"
            + "IntelliJ IDEA\n"
            + "\n"
            + "Ưu điểm: Thông minh, hỗ trợ tự động hoàn thành mã, tích hợp nhiều công cụ phát triển như Maven, Gradle, Spring Boot.\n"
            + "\n"
            + "Nhược điểm: Phiên bản Ultimate có phí, bản miễn phí bị giới hạn một số tính năng, nặng hơn so với các IDE khác.\n"
            + "\n"
            + "Phù hợp với: Lập trình viên chuyên nghiệp, các dự án lớn, doanh nghiệp.\n"
            + "\n"
            + "Eclipse\n"
            + "\n"
            + "Ưu điểm: Miễn phí, mã nguồn mở, hỗ trợ nhiều plugin, phù hợp cho lập trình Java EE và các ứng dụng lớn.\n"
            + "\n"
            + "Nhược điểm: Giao diện hơi cũ, có thể chạy chậm nếu cài quá nhiều plugin.\n"
            + "\n"
            + "Phù hợp với: Sinh viên, lập trình viên phát triển ứng dụng doanh nghiệp, những người thích công cụ miễn phí.\n"
            + "\n"
            + "NetBeans\n"
            + "\n"
            + "Ưu điểm: Dễ sử dụng, tích hợp sẵn trình biên dịch và công cụ thiết kế giao diện GUI, hỗ trợ kéo thả.\n"
            + "\n"
            + "Nhược điểm: Chạy chậm hơn so với IntelliJ và Eclipse, ít plugin hỗ trợ mở rộng.\n"
            + "\n"
            + "Phù hợp với: Người mới học lập trình Java, phát triển ứng dụng desktop.\n"
            + "\n"
            + "Visual Studio Code (VS Code)\n"
            + "\n"
            + "Ưu điểm: Nhẹ, hỗ trợ nhiều ngôn ngữ lập trình, có thể mở rộng với các extension như Java Extension Pack.\n"
            + "\n"
            + "Nhược điểm: Không mạnh bằng IntelliJ hoặc Eclipse cho các dự án Java lớn, cần cài thêm plugin để hỗ trợ Java đầy đủ.\n"
            + "\n"
            + "Phù hợp với: Lập trình viên thích trình soạn thảo nhẹ, làm việc với nhiều ngôn ngữ ngoài Java.\n"
            + "\n"
            + "📌 Lời khuyên:\n"
            + "\n"
            + "Nếu bạn là người mới học, hãy chọn NetBeans hoặc Eclipse.\n"
            + "\n"
            + "Nếu bạn cần một IDE mạnh mẽ, hãy dùng IntelliJ IDEA.\n"
            + "\n"
            + "Nếu bạn cần trình soạn thảo nhẹ, linh hoạt, hãy thử VS Code. 🚀",});
        Content_MAP.put("Viết và chạy chương trình Java đầu tiên", new String[]{
            "Để chạy một chương trình Java, bạn có thể làm theo hai cách: sử dụng terminal (hoặc command prompt) hoặc sử dụng một IDE.",
            "Mở Notepad (hoặc bất kỳ trình soạn thảo nào như VS Code, Sublime Text) và nhập đoạn code sau:",
            "Lưu lại file với tên HelloWorld.java.\n"
            + "\n"
            + "📌 Lưu ý: Tên file phải trùng với tên lớp (HelloWorld).",
            "Mở Command Prompt (Windows) hoặc Terminal (macOS/Linux), điều hướng đến thư mục chứa file HelloWorld.java.",
            "Lệnh này sẽ tạo ra một file HelloWorld.class, đây là file bytecode có thể chạy trên JVM.",
            "Sau khi biên dịch thành công, chạy chương trình bằng lệnh:",
            "Màn hình sẽ hiển thị:",
            "🎉 Chương trình Java đầu tiên đã chạy thành công!",
            "Nếu sử dụng IntelliJ IDEA, Eclipse, NetBeans hoặc VS Code, bạn có thể tạo project và chạy chương trình trực tiếp:\n"
            + "\n"
            + "Tạo một Project Java mới (chọn Java Application).\n"
            + "\n"
            + "Tạo một file Java và đặt tên là HelloWorld.java.\n"
            + "\n"
            + "Nhập đoạn code trên vào file Java.\n"
            + "\n"
            + "Nhấn \"Run\" hoặc \"Compile\" để chạy chương trình.\n"
            + "\n"
            + "📌 Ưu điểm khi dùng IDE:\n"
            + "✅ Không cần biên dịch thủ công bằng javac.\n"
            + "✅ Hỗ trợ debug, tự động hoàn thành mã, gợi ý lỗi.",
            "Nếu bạn mới học Java, hãy thử chạy bằng terminal để hiểu cách hoạt động của javac và java.\n"
            + "\n"
            + "Nếu bạn lập trình lâu dài, IDE sẽ giúp bạn viết và quản lý code nhanh hơn. 🚀",});
        Content_MAP.put("Biến và kiểu dữ liệu", new String[]{
            "Trong Java, mỗi biến phải có kiểu dữ liệu xác định để xác định loại giá trị mà biến đó có thể lưu trữ. Java hỗ trợ hai nhóm kiểu dữ liệu chính: kiểu dữ liệu nguyên thủy và kiểu dữ liệu tham chiếu.",
            "Java cung cấp 8 kiểu dữ liệu nguyên thủy, bao gồm số nguyên, số thực, ký tự và giá trị boolean.\n"
            + "\n"
            + "byte có kích thước 1 byte, giá trị mặc định là 0. Đây là kiểu số nguyên nhỏ, có phạm vi từ -128 đến 127.\n"
            + "\n"
            + "short có kích thước 2 byte, giá trị mặc định là 0. Nó được sử dụng cho các số nguyên trung bình.\n"
            + "\n"
            + "int có kích thước 4 byte, giá trị mặc định là 0. Đây là kiểu số nguyên phổ biến nhất.\n"
            + "\n"
            + "long có kích thước 8 byte, giá trị mặc định là 0L. Nó dùng để lưu trữ các số nguyên lớn.\n"
            + "\n"
            + "float có kích thước 4 byte, giá trị mặc định là 0.0f. Kiểu này được sử dụng để lưu trữ số thực (dấu chấm động).\n"
            + "\n"
            + "double có kích thước 8 byte, giá trị mặc định là 0.0. Đây là kiểu số thực có độ chính xác cao hơn float.\n"
            + "\n"
            + "boolean có kích thước 1 bit, giá trị mặc định là false. Nó chỉ nhận hai giá trị true hoặc false.\n"
            + "\n"
            + "char có kích thước 2 byte, giá trị mặc định là '\\u0000'. Nó dùng để lưu trữ một ký tự Unicode.\n"
            + "\n"
            + "📌 Lưu ý:\n"
            + "\n"
            + "int là kiểu số nguyên được sử dụng phổ biến nhất trong lập trình.\n"
            + "\n"
            + "double là kiểu số thực mặc định khi làm việc với số dấu chấm động.\n"
            + "\n"
            + "boolean chỉ có hai giá trị true hoặc false.\n"
            + "\n"
            + "char có thể lưu trữ bất kỳ ký tự Unicode nào.",
            "Các kiểu dữ liệu tham chiếu được sử dụng để lưu trữ địa chỉ của đối tượng thay vì giá trị trực tiếp. Chúng bao gồm String, Arrays, Classes, Interfaces.\n"
            + "\n"
            + "Ví dụ về kiểu dữ liệu tham chiếu:",
            "📌 Lưu ý:\n"
            + "\n"
            + "Kiểu tham chiếu không lưu trữ trực tiếp giá trị, mà lưu địa chỉ của đối tượng trong bộ nhớ.\n"
            + "\n"
            + "Mặc định, kiểu tham chiếu có giá trị là null.",
            "Để khai báo một biến trong Java, sử dụng cú pháp sau:",
            "Ví dụ về khai báo biến:",
            "Ép kiểu tự động (Widening Casting)\n"
            + "Chuyển đổi từ kiểu nhỏ sang kiểu lớn (an toàn, không mất dữ liệu):",
            "Ép kiểu tường minh (Narrowing Casting)\n"
            + "Chuyển đổi từ kiểu lớn về kiểu nhỏ (cần cẩn thận vì có thể mất dữ liệu):",
            "Java có 8 kiểu dữ liệu nguyên thủy và các kiểu dữ liệu tham chiếu như String, Array, Class.\n"
            + "\n"
            + "Biến phải được khai báo với kiểu dữ liệu xác định.\n"
            + "\n"
            + "Java hỗ trợ ép kiểu tự động và ép kiểu tường minh để chuyển đổi dữ liệu khi cần thiết.\n"
            + "\n"
            + "🚀 Ghi nhớ: Chọn kiểu dữ liệu phù hợp giúp chương trình tối ưu hơn về hiệu suất và bộ nhớ.",});
        Content_MAP.put("Toán tử trong Java", new String[]{
            "Trong Java, toán tử là các ký hiệu dùng để thực hiện các phép toán trên biến và giá trị. Java hỗ trợ nhiều loại toán tử khác nhau, bao gồm toán tử số học, so sánh, logic, gán và điều kiện.",
            "Toán tử số học trong Java được sử dụng để thực hiện các phép toán như cộng, trừ, nhân, chia và lấy dư.\n"
            + "\n"
            + "+ (Cộng): Dùng để cộng hai số lại với nhau. Ví dụ: a + b\n"
            + "\n"
            + "- (Trừ): Dùng để trừ số thứ hai khỏi số thứ nhất. Ví dụ: a - b\n"
            + "\n"
            + "* (Nhân): Dùng để nhân hai số. Ví dụ: a * b\n"
            + "\n"
            + "/ (Chia): Dùng để chia số thứ nhất cho số thứ hai. Ví dụ: a / b\n"
            + "\n"
            + "% (Chia lấy dư): Dùng để lấy phần dư của phép chia. Ví dụ: a % b\n"
            + "\n"
            + "📌 Ví dụ:",
            "Dùng để so sánh hai giá trị, kết quả trả về kiểu boolean (true hoặc false).\n"
            + "\n"
            + "== (Bằng): Trả về true nếu hai giá trị bằng nhau. Ví dụ: a == b\n"
            + "\n"
            + "!= (Khác): Trả về true nếu hai giá trị khác nhau. Ví dụ: a != b\n"
            + "\n"
            + "> (Lớn hơn): Trả về true nếu giá trị thứ nhất lớn hơn giá trị thứ hai. Ví dụ: a > b\n"
            + "\n"
            + "< (Nhỏ hơn): Trả về true nếu giá trị thứ nhất nhỏ hơn giá trị thứ hai. Ví dụ: a < b\n"
            + "\n"
            + ">= (Lớn hơn hoặc bằng): Trả về true nếu giá trị thứ nhất lớn hơn hoặc bằng giá trị thứ hai. Ví dụ: a >= b\n"
            + "\n"
            + "<= (Nhỏ hơn hoặc bằng): Trả về true nếu giá trị thứ nhất nhỏ hơn hoặc bằng giá trị thứ hai. Ví dụ: a <= b\n"
            + "\n"
            + "📌 Ví dụ:",
            "Dùng để kết hợp các biểu thức điều kiện và trả về true hoặc false.\n"
            + "\n"
            + "&& (AND): Trả về true nếu cả hai biểu thức đều đúng. Ví dụ: (a > 5) && (b < 10)\n"
            + "\n"
            + "|| (OR): Trả về true nếu ít nhất một trong hai biểu thức đúng. Ví dụ: (a > 5) || (b < 10)\n"
            + "\n"
            + "! (NOT): Đảo ngược giá trị boolean. Ví dụ: !(a > 5)\n"
            + "\n"
            + "📌 Ví dụ:",
            "Dùng để gán giá trị cho biến và hỗ trợ các phép toán gán kết hợp.\n"
            + "\n"
            + "= (Gán): Gán giá trị cho biến. Ví dụ: a = b\n"
            + "\n"
            + "+= (Cộng rồi gán): a += b tương đương với a = a + b\n"
            + "\n"
            + "-= (Trừ rồi gán): a -= b tương đương với a = a - b\n"
            + "\n"
            + "*= (Nhân rồi gán): a *= b tương đương với a = a * b\n"
            + "\n"
            + "/= (Chia rồi gán): a /= b tương đương với a = a / b\n"
            + "\n"
            + "📌 Ví dụ:",
            "Dùng để viết gọn câu lệnh if-else.\n"
            + "\n"
            + "📌 Cú pháp:",
            "📌 Ví dụ:",
            "Toán tử giúp thực hiện các phép toán và điều kiện trong Java.\n"
            + "\n"
            + "Hiểu rõ cách sử dụng toán tử giúp tối ưu mã nguồn và logic lập trình.\n"
            + "\n"
            + "Toán tử điều kiện ? : giúp viết gọn thay thế cho if-else.\n"
            + "\n"
            + "🚀 Lưu ý: Trong các chương trình thực tế, việc sử dụng toán tử hợp lý sẽ giúp mã nguồn ngắn gọn, dễ đọc và hiệu quả hơn.",});
        Content_MAP.put("Xuất dữ liệu ra màn hình", new String[]{
            "Trong Java, để hiển thị dữ liệu ra màn hình, ta sử dụng các phương thức sau của lớp System.out:",
            "Phương thức println() được dùng để in nội dung ra màn hình và tự động xuống dòng sau khi in.\n"
            + "\n"
            + "📌 Ví dụ:",
            "📌 Kết quả:",
            "Phương thức print() cũng được dùng để in dữ liệu ra màn hình, nhưng không xuống dòng sau khi in.\n"
            + "\n"
            + "📌 Ví dụ:",
            "📌 Kết quả:",
            "(Vì print() không xuống dòng, nên dòng thứ hai sẽ tiếp tục ngay sau dòng thứ nhất.)",
            "Phương thức printf() được sử dụng khi cần in dữ liệu theo định dạng cụ thể.\n"
            + "\n"
            + "📌 Ví dụ:",
            "📌 Kết quả:",
            "Các ký tự định dạng thường dùng trong printf()\n"
            + "%d : Hiển thị số nguyên (Integer).\n"
            + "\n"
            + "%f : Hiển thị số thực (Float, Double).\n"
            + "\n"
            + "%s : Hiển thị chuỗi (String).\n"
            + "\n"
            + "%c : Hiển thị ký tự (Character).\n"
            + "\n"
            + "%n : Xuống dòng (thay thế cho \\n).\n"
            + "\n"
            + "📌 Ví dụ sử dụng nhiều định dạng trong printf():",
            "📌 Kết quả:",
            "(Ký tự %n giúp xuống dòng tương tự println().)",
            "println(): In nội dung và xuống dòng.\n"
            + "\n"
            + "print(): In nội dung nhưng không xuống dòng.\n"
            + "\n"
            + "printf() : In theo định dạng.\n"
            + "\n"
            + "👉 Lựa chọn phương thức phù hợp giúp mã nguồn dễ đọc và hiệu quả hơn! 🚀",});
        Content_MAP.put("Nhập dữ liệu từ bàn phím", new String[]{
            "Trong Java, để lấy dữ liệu từ bàn phím, ta sử dụng lớp Scanner từ thư viện java.util.",
            "Lớp Scanner cho phép nhập nhiều loại dữ liệu như chuỗi, số nguyên, số thực, ký tự, v.v.\n"
            + "\n"
            + "📌 Ví dụ nhập tên từ bàn phím:",
            "📌 Kết quả (ví dụ nhập từ bàn phím):",
            "Lớp Scanner trong Java cung cấp nhiều phương thức để nhập dữ liệu từ bàn phím. Dưới đây là một số phương thức phổ biến:\n"
            + "\n"
            + "nextLine() – Dùng để nhập một dòng văn bản (chuỗi String). Phương thức này đọc toàn bộ dòng nhập vào, kể cả dấu cách.\n"
            + "📌 Ví dụ:",
            "nextInt() – Dùng để nhập một số nguyên (int).\n"
            + "📌 Ví dụ:",
            "nextDouble() – Dùng để nhập một số thực (double).\n"
            + "📌 Ví dụ:",
            "nextFloat() – Dùng để nhập một số thực với độ chính xác thấp hơn (float).\n"
            + "📌 Ví dụ:",
            "nextBoolean() – Dùng để nhập một giá trị true hoặc false (boolean).\n"
            + "📌 Ví dụ:",
            "next().charAt(0) – Dùng để nhập một ký tự (char). Vì Scanner không có phương thức nextChar(), ta có thể dùng next() để lấy một chuỗi rồi lấy ký tự đầu tiên.\n"
            + "📌 Ví dụ:",
            "Mỗi phương thức trên đều giúp nhập dữ liệu với kiểu tương ứng, giúp chương trình linh hoạt hơn trong việc xử lý thông tin từ người dùng. 🚀",
            "📌 Chương trình nhập thông tin người dùng:",
            "📌 Kết quả (ví dụ nhập từ bàn phím):",
            "Nếu nhập số (nextInt(), nextDouble(), ...) rồi tiếp tục nhập chuỗi (nextLine()), cần thêm scanner.nextLine(); để bỏ dòng trống còn lại.\n"
            + "\n"
            + "Luôn đóng Scanner sau khi sử dụng bằng scanner.close(); để tránh lãng phí tài nguyên.\n"
            + "\n"
            + "📌 Ví dụ lỗi thường gặp:",
            "📌 Cách khắc phục:",
            "Scanner là cách phổ biến để nhập dữ liệu từ bàn phím trong Java.\n"
            + "\n"
            + "Sử dụng các phương thức như nextLine(), nextInt(), nextDouble(), ... để nhập dữ liệu theo kiểu mong muốn.\n"
            + "\n"
            + "Chú ý lỗi nhập chuỗi sau khi nhập số và luôn đóng Scanner sau khi sử dụng.\n"
            + "\n"
            + "👉 Sử dụng Scanner đúng cách giúp chương trình xử lý dữ liệu nhập vào linh hoạt và hiệu quả hơn! 🚀",});
        Content_MAP.put("Cấu trúc điều kiện", new String[]{
            "Trong Java, cấu trúc điều kiện (if, if-else, if-else if-else, và switch-case) được sử dụng để kiểm tra một điều kiện và thực thi mã tương ứng.",
            "Câu lệnh if kiểm tra điều kiện, nếu đúng (true), khối lệnh bên trong sẽ được thực thi. Nếu sai (false), chương trình sẽ bỏ qua hoặc thực hiện khối else (nếu có).\n"
            + "\n"
            + "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "Nếu a > b, chương trình in \"a lớn hơn b\".\n"
            + "\n"
            + "Ngược lại, chương trình in \"a không lớn hơn b\".",
            "Dùng khi cần kiểm tra nhiều điều kiện khác nhau.\n"
            + "\n"
            + "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "Nếu a > b, in \"a lớn hơn b\".\n"
            + "\n"
            + "Nếu a == b, in \"a bằng b\".\n"
            + "\n"
            + "Nếu cả hai điều kiện trên sai, in \"a nhỏ hơn b\".",
            "Khi một điều kiện phụ thuộc vào điều kiện khác, ta có thể sử dụng if lồng nhau.\n"
            + "\n"
            + "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "Nếu a > 0, kiểm tra tiếp a là số chẵn hay lẻ.\n"
            + "\n"
            + "Nếu a <= 0, in \"a không phải số dương\".",
            "Sử dụng khi có nhiều trường hợp cụ thể.\n"
            + "\n"
            + "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "Nếu day == 3, in \"Thứ Ba\".\n"
            + "\n"
            + "Nếu không có giá trị phù hợp, default sẽ thực thi.",
            "if-else: Kiểm tra điều kiện đơn giản.\n"
            + "\n"
            + "if-else if-else: Khi có nhiều điều kiện cần kiểm tra.\n"
            + "\n"
            + "if lồng nhau: Khi một điều kiện nằm trong một điều kiện khác.\n"
            + "\n"
            + "switch-case: Khi có nhiều trường hợp cụ thể (thường dùng với số nguyên hoặc chuỗi).\n"
            + "\n"
            + "👉 Sử dụng cấu trúc điều kiện đúng cách giúp chương trình linh hoạt và dễ đọc hơn! 🚀",});
        Content_MAP.put("Vòng lặp trong Java", new String[]{
            "Vòng lặp giúp thực thi một đoạn mã nhiều lần khi một điều kiện còn đúng (true). Java hỗ trợ ba loại vòng lặp chính: for, while, và do-while.",
            "Dùng khi biết trước số lần lặp.\n"
            + "\n"
            + "📌 Cú pháp:",
            "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "int i = 0: Bắt đầu với i = 0.\n"
            + "\n"
            + "i < 5: Lặp khi i nhỏ hơn 5.\n"
            + "\n"
            + "i++: Tăng i sau mỗi vòng lặp.\n"
            + "\n"
            + "Kết quả:",
            "2. Vòng lặp while\n"
            + "Dùng khi chưa biết trước số lần lặp, chỉ lặp khi điều kiện còn đúng (true).\n"
            + "\n"
            + "📌 Cú pháp:",
            "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "while kiểm tra điều kiện i < 5, nếu đúng thì chạy khối lệnh.\n"
            + "\n"
            + "Sau mỗi lần lặp, i tăng lên 1.\n"
            + "\n"
            + "Dừng khi i >= 5.",
            "Luôn thực thi ít nhất một lần, sau đó kiểm tra điều kiện.\n"
            + "\n"
            + "📌 Cú pháp:",
            "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "Khối lệnh luôn chạy ít nhất một lần, ngay cả khi i không thỏa điều kiện.",
            "Dùng để duyệt qua các phần tử trong mảng hoặc collection.\n"
            + "\n"
            + "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "Duyệt qua từng phần tử trong mảng numbers.",
            "break: Dừng hẳn vòng lặp.\n"
            + "\n"
            + "continue: Bỏ qua vòng lặp hiện tại, tiếp tục vòng tiếp theo.\n"
            + "\n"
            + "📌 Ví dụ break:",
            "📌 Kết quả:",
            "📌 Ví dụ continue:",
            "📌 Kết quả:",
            "(Số 2 bị bỏ qua do continue).",
            "for: Dùng khi biết trước số lần lặp.\n"
            + "\n"
            + "while: Dùng khi chưa biết trước số lần lặp.\n"
            + "\n"
            + "do-while: Luôn chạy ít nhất một lần.\n"
            + "\n"
            + "for-each: Dùng để duyệt mảng hoặc danh sách.\n"
            + "\n"
            + "break: Dừng vòng lặp.\n"
            + "\n"
            + "continue: Bỏ qua lần lặp hiện tại.\n"
            + "\n"
            + "👉 Vòng lặp giúp chương trình chạy hiệu quả và giảm lặp mã không cần thiết! 🚀",});
        Content_MAP.put("Mảng trong Java", new String[]{
            "Mảng (Array) trong Java là một cấu trúc dữ liệu lưu trữ nhiều phần tử có cùng kiểu dữ liệu trong một danh sách cố định.",
            "Có thể khai báo và khởi tạo mảng theo hai cách:\n"
            + "\n"
            + "📌 Cách 1: Khai báo trước, khởi tạo sau",
            "📌 Cách 2: Khai báo và khởi tạo trực tiếp",
            "📌 Ví dụ:",
            "📌 Giải thích:\n"
            + "\n"
            + "numbers[0]: Lấy phần tử đầu tiên.\n"
            + "\n"
            + "numbers.length - 1: Lấy phần tử cuối cùng.",
            "📌 Duyệt mảng bằng for",
            "📌 Duyệt mảng bằng for-each",
            "Mảng nhiều chiều là mảng chứa mảng con bên trong.\n"
            + "\n"
            + "📌 Ví dụ mảng 2 chiều (int[][])",
            "📌 Duyệt mảng 2 chiều:",
            "📌 Sắp xếp mảng tăng dần bằng Arrays.sort()",
            "Mảng trong Java có kích thước cố định và lưu trữ nhiều phần tử cùng kiểu.\n"
            + "\n"
            + "Truy cập phần tử bằng chỉ số (index), chỉ số bắt đầu từ 0.\n"
            + "\n"
            + "Duyệt mảng bằng vòng lặp for hoặc for-each.\n"
            + "\n"
            + "Mảng nhiều chiều giúp lưu trữ dữ liệu dạng bảng.\n"
            + "\n"
            + "Sắp xếp và tìm kiếm bằng thư viện Arrays.\n"
            + "\n"
            + "👉 Mảng giúp quản lý dữ liệu hiệu quả trong Java! 🚀",});
        Content_MAP.put("Xử lý chuỗi trong Java", new String[]{
            "Chuỗi (String) trong Java là một đối tượng bất biến, tức là một khi đã tạo thì nội dung của chuỗi không thể thay đổi. Java cung cấp nhiều phương thức để thao tác với chuỗi.",
            "📌 Có hai cách để khai báo chuỗi:",
            "📌 Kết quả:",
            "✔ Lấy độ dài: length()\n"
            + "✔ Chuyển đổi chữ hoa/thường: toUpperCase(), toLowerCase()\n"
            + "✔ Tìm kiếm chuỗi con: indexOf(), startsWith(), endsWith()\n"
            + "✔ Cắt chuỗi: substring()\n"
            + "✔ Thay thế: replace()\n"
            + "✔ So sánh chuỗi: equals(), equalsIgnoreCase()\n"
            + "✔ Loại bỏ khoảng trắng: trim()\n"
            + "✔ Nối chuỗi: +, concat()\n"
            + "✔ Chia chuỗi thành mảng: split()\n"
            + "✔ Kiểm tra chuỗi rỗng: isEmpty()\n"
            + "\n"
            + "👉 Xử lý chuỗi rất quan trọng trong lập trình Java! 🚀",});
        Content_MAP.put("Lập trình đa luồng là gì?", new String[]{
            "Lập trình đa luồng (Multithreading) trong Java là kỹ thuật cho phép chương trình thực hiện nhiều công việc cùng lúc thay vì chạy tuần tự. Mỗi luồng (Thread) là một tiến trình nhỏ, chạy độc lập nhưng chia sẻ chung tài nguyên với các luồng khác trong chương trình.",
            "✔ Tăng hiệu suất: Tận dụng tối đa tài nguyên CPU.\n"
            + "✔ Cải thiện trải nghiệm người dùng: Giúp ứng dụng không bị treo khi xử lý tác vụ nặng.\n"
            + "✔ Hỗ trợ đa nhiệm: Ứng dụng có thể thực hiện nhiều công việc đồng thời.\n"
            + "✔ Tiết kiệm tài nguyên: Tạo luồng nhẹ hơn so với tạo nhiều tiến trình riêng biệt.",
            "Lập trình đa luồng được dùng trong:\n"
            + "\n"
            + "Trình duyệt web: Tải trang trong khi nhập địa chỉ.\n"
            + "\n"
            + "Ứng dụng ngân hàng: Xử lý nhiều giao dịch cùng lúc.\n"
            + "\n"
            + "Game, đồ họa: Xử lý hình ảnh, âm thanh và điều khiển nhân vật đồng thời.\n"
            + "\n"
            + "Big Data, AI: Chạy nhiều tác vụ phân tích dữ liệu cùng lúc.",
            "Hệ điều hành phân chia thời gian CPU cho từng luồng, tạo hiệu ứng chạy song song giữa các tác vụ. Java hỗ trợ nhiều cách tạo luồng như kế thừa Thread, triển khai Runnable, hoặc quản lý bằng ExecutorService để tối ưu hiệu suất.\n"
            + "\n"
            + "Ví dụ, nếu một ứng dụng có một luồng duy nhất, khi tải dữ liệu từ internet, toàn bộ chương trình sẽ bị chặn. Nhưng với đa luồng, chương trình vẫn có thể tiếp tục thực hiện các tác vụ khác.",
            "✅ Lập trình đa luồng giúp chương trình chạy nhanh hơn, mượt hơn, hỗ trợ đa nhiệm tốt hơn.\n"
            + "✅ Ứng dụng rộng rãi trong trình duyệt, game, AI, Big Data, tài chính.\n"
            + "✅ Java hỗ trợ đa luồng dễ dàng, giúp phát triển các ứng dụng mạnh mẽ. 🚀",});
        Content_MAP.put("Tạo luồng trong Java", new String[]{
            "Trong Java, để thực hiện đa luồng (multithreading), ta có thể sử dụng hai cách chính:\n"
            + "\n"
            + "Kế thừa lớp Thread\n"
            + "\n"
            + "Triển khai giao diện Runnable\n"
            + "\n"
            + "Mỗi cách đều có ưu nhược điểm riêng, tùy vào nhu cầu mà ta lựa chọn cách phù hợp.",
            "Cách này sử dụng lớp Thread có sẵn của Java và ghi đè phương thức run() để định nghĩa hành vi của luồng.\n"
            + "\n"
            + "Ví dụ minh họa:",
            "Giải thích:\n"
            + "Lớp MyThread kế thừa từ Thread và ghi đè phương thức run().\n"
            + "\n"
            + "Phương thức run() chứa công việc mà luồng sẽ thực hiện.\n"
            + "\n"
            + "Phương thức start() giúp kích hoạt luồng, từ đó JVM sẽ tự động gọi run().\n"
            + "\n"
            + "⏩ Lưu ý: Không nên gọi run() trực tiếp vì nó sẽ thực thi như một phương thức bình thường, không phải luồng riêng biệt.",
            "Cách này sử dụng giao diện Runnable, giúp linh hoạt hơn vì Java hỗ trợ đa kế thừa giao diện.\n"
            + "\n"
            + "Ví dụ minh họa:",
            "Giải thích:\n"
            + "Lớp MyRunnable triển khai giao diện Runnable và định nghĩa phương thức run().\n"
            + "\n"
            + "Để chạy luồng, ta cần tạo một đối tượng Thread, truyền vào một đối tượng Runnable.\n"
            + "\n"
            + "Phương thức start() được gọi để khởi chạy luồng.\n"
            + "\n"
            + "⏩ Lưu ý: Không thể gọi start() trực tiếp từ MyRunnable, vì Runnable chỉ định nghĩa công việc, không phải luồng thực sự.",
            "Dùng Thread nếu lớp không cần kế thừa lớp khác và muốn tạo luồng nhanh chóng.\n"
            + "\n"
            + "Dùng Runnable nếu lớp đã kế thừa một lớp khác hoặc cần tái sử dụng code tốt hơn.\n"
            + "\n"
            + "🔹 Tóm lại: Runnable thường được khuyến khích hơn vì hỗ trợ đa kế thừa và giúp mã nguồn linh hoạt hơn! 🚀",});
        Content_MAP.put("Đồng bộ hóa luồng", new String[]{
            "Trong lập trình đa luồng (Multithreading), nhiều luồng có thể cùng truy cập và sửa đổi một tài nguyên chung, điều này có thể dẫn đến xung đột dữ liệu (data inconsistency). Khi nhiều luồng cùng thay đổi một biến, giá trị cuối cùng có thể không chính xác.\n"
            + "\n"
            + "Ví dụ, nếu một biến count được cả hai luồng tăng lên cùng lúc, kết quả có thể bị sai vì một luồng có thể ghi đè lên giá trị của luồng khác.\n"
            + "\n"
            + "🔹 Giải pháp: Sử dụng từ khóa synchronized để đảm bảo chỉ có một luồng truy cập tài nguyên tại một thời điểm, giúp tránh lỗi đồng thời.",
            "Ví dụ về đồng bộ hóa phương thức",
            "synchronized đảm bảo an toàn khi truy cập tài nguyên chung\n"
            + "\n"
            + "Khi một luồng gọi increment(), nó sẽ khóa (lock) đối tượng Counter và ngăn chặn luồng khác truy cập vào phương thức này cho đến khi luồng hiện tại hoàn thành công việc.\n"
            + "\n"
            + "Nhờ vậy, hai luồng không thể cùng lúc thay đổi biến count, giúp dữ liệu luôn chính xác.\n"
            + "\n"
            + "Sử dụng join() để đảm bảo chương trình chạy đúng\n"
            + "\n"
            + "t1.join(); t2.join(); đảm bảo chương trình chỉ kết thúc khi cả hai luồng đã hoàn thành công việc.",
            "Trong một số trường hợp, bạn không muốn đồng bộ hóa toàn bộ phương thức mà chỉ một phần nhỏ bên trong. Khi đó, có thể dùng khối synchronized, giúp tăng hiệu suất bằng cách chỉ khóa đoạn code cần thiết.\n"
            + "\n"
            + "Ví dụ:",
            "✔ Khi có nhiều luồng cùng đọc/ghi dữ liệu trên cùng một biến hoặc đối tượng.\n"
            + "✔ Khi cần đảm bảo dữ liệu nhất quán và không bị ghi đè sai lệch.\n"
            + "✔ Khi muốn đồng bộ hóa một tài nguyên quan trọng để tránh lỗi logic trong chương trình.\n"
            + "\n"
            + "⏩ Lưu ý: Sử dụng quá nhiều synchronized có thể làm giảm hiệu suất, vì các luồng phải chờ nhau hoàn thành trước khi tiếp tục.\n"
            + "\n"
            + "🚀 Tóm lại: synchronized là một công cụ hữu ích giúp lập trình đa luồng an toàn, nhưng cần sử dụng hợp lý để tối ưu hiệu suất!",});
        Content_MAP.put("Xử lý sự kiện trong Java", new String[]{
            "Trong Java, sự kiện (event) là hành động của người dùng như nhấn nút, di chuyển chuột, nhập văn bản, v.v. Để xử lý các sự kiện này, Java sử dụng mô hình xử lý sự kiện (Event Handling Model) dựa trên các giao diện như ActionListener.",
            "Thành phần chính:\n"
            + "🔹 Nguồn sự kiện (Event Source): Là đối tượng phát sinh sự kiện (ví dụ: nút bấm JButton).\n"
            + "🔹 Bộ lắng nghe sự kiện (Event Listener): Định nghĩa hành động khi sự kiện xảy ra (ví dụ: ActionListener).\n"
            + "🔹 Đối tượng sự kiện (Event Object): Chứa thông tin về sự kiện vừa xảy ra (ví dụ: ActionEvent).",
            "Dưới đây là chương trình Java đơn giản sử dụng JButton để lắng nghe sự kiện nhấn nút.",
            "1️⃣ Tạo cửa sổ JFrame:\n"
            + "\n"
            + "JFrame frame = new JFrame(\"Xử lý sự kiện Java\"); tạo một cửa sổ giao diện.\n"
            + "\n"
            + "2️⃣ Tạo nút bấm JButton:\n"
            + "\n"
            + "JButton button = new JButton(\"Nhấn tôi\"); tạo một nút bấm.\n"
            + "\n"
            + "3️⃣ Gắn ActionListener để xử lý sự kiện:\n"
            + "\n"
            + "button.addActionListener(new ActionListener() {...}) lắng nghe sự kiện nhấn nút.\n"
            + "\n"
            + "Khi người dùng nhấn nút, phương thức actionPerformed(ActionEvent e) sẽ thực thi và hiển thị \"Nút đã được nhấn!\".\n"
            + "\n"
            + "4️⃣ Thêm nút vào cửa sổ và hiển thị:\n"
            + "\n"
            + "frame.add(button); thêm nút vào cửa sổ.\n"
            + "\n"
            + "frame.setVisible(true); hiển thị giao diện.\n"
            + "",
            "Java 8 cho phép viết gọn ActionListener bằng biểu thức lambda:",
            "✔ Ưu điểm: Giúp mã nguồn ngắn gọn và dễ đọc hơn.",
            "✔ Khi cần tương tác với người dùng, chẳng hạn như:\n"
            + "\n"
            + "Nhấn nút, chọn checkbox, nhập văn bản.\n"
            + "\n"
            + "Kéo thả chuột, cuộn trang, di chuyển chuột.\n"
            + "\n"
            + "✔ Khi xây dựng giao diện đồ họa (GUI) trong Java với Swing, JavaFX.\n"
            + "\n"
            + "📌 Tóm lại: Xử lý sự kiện giúp ứng dụng trở nên linh hoạt và phản hồi tốt hơn với hành động của người dùng! 🚀",});
        Content_MAP.put("Giới thiệu về lập trình mạng trong Java", new String[]{
            "Lập trình mạng trong Java giúp các ứng dụng giao tiếp với nhau thông qua Internet hoặc mạng nội bộ (LAN). Java cung cấp các API mạnh mẽ để làm việc với mạng, trong đó Socket và ServerSocket là hai thành phần quan trọng để truyền dữ liệu giữa máy khách (Client) và máy chủ (Server).",
            "🔹 TCP (Transmission Control Protocol) – Kết nối ổn định, đảm bảo dữ liệu truyền nhận đầy đủ và theo đúng thứ tự.\n"
            + "🔹 UDP (User Datagram Protocol) – Truyền dữ liệu nhanh, không đảm bảo toàn vẹn dữ liệu nhưng hiệu suất cao hơn.",
            "🔹 Socket: Đại diện cho điểm cuối của kết nối mạng (Client).\n"
            + "🔹 ServerSocket: Dùng để lắng nghe kết nối từ Client (Server).\n"
            + "🔹 InetAddress: Xử lý địa chỉ IP của máy tính.\n"
            + "🔹 URL & HttpURLConnection: Làm việc với giao thức HTTP.",
            "Dưới đây là ví dụ về ứng dụng Client-Server đơn giản trong Java sử dụng TCP Socket.\n"
            + "\n"
            + "🔹 Máy chủ (Server)",
            "🔹 Máy khách (Client)",
            "✔ Máy chủ (Server):\n"
            + "\n"
            + "Tạo ServerSocket trên cổng 1234 và chờ kết nối từ Client.\n"
            + "\n"
            + "Khi có Client kết nối, nhận dữ liệu từ Client và gửi phản hồi.\n"
            + "\n"
            + "✔ Máy khách (Client):\n"
            + "\n"
            + "Kết nối đến Server qua localhost:1234.\n"
            + "\n"
            + "Gửi tin nhắn đến Server và nhận phản hồi.",
            "✔ Xây dựng hệ thống Chat, Tin nhắn (Messenger, WhatsApp).\n"
            + "✔ Phát triển dịch vụ Web, API RESTful.\n"
            + "✔ Ứng dụng IoT, truyền nhận dữ liệu từ cảm biến.\n"
            + "✔ Tạo máy chủ trò chơi trực tuyến (Game Server).\n"
            + "\n"
            + "📌 Tóm lại: Java hỗ trợ lập trình mạng mạnh mẽ với Socket, ServerSocket, giúp xây dựng các ứng dụng giao tiếp qua mạng dễ dàng! 🚀",});
        Content_MAP.put("Lập trình Socket với TCP/IP", new String[]{
            "Lập trình Socket với TCP/IP cho phép các ứng dụng giao tiếp qua mạng bằng cách thiết lập kết nối giữa Máy khách (Client) và Máy chủ (Server).",
            "📌 Máy chủ (Server):\n"
            + "\n"
            + "Lắng nghe kết nối từ Client thông qua ServerSocket.\n"
            + "\n"
            + "Khi có Client kết nối, Server nhận dữ liệu từ Client.\n"
            + "\n"
            + "📌 Máy khách (Client):\n"
            + "\n"
            + "Kết nối đến Server thông qua Socket.\n"
            + "\n"
            + "Gửi dữ liệu đến Server.\n"
            + "",
            " Mã nguồn Máy chủ (Server)",
            "Mã nguồn Máy khách (Client)",
            "✔ Máy chủ (Server):\n"
            + "\n"
            + "Bước 1: Khởi tạo ServerSocket trên cổng 5000.\n"
            + "\n"
            + "Bước 2: Chờ Client kết nối (accept()).\n"
            + "\n"
            + "Bước 3: Khi có kết nối, nhận dữ liệu từ Client bằng BufferedReader.\n"
            + "\n"
            + "Bước 4: Hiển thị tin nhắn của Client và đóng kết nối.\n"
            + "\n"
            + "✔ Máy khách (Client):\n"
            + "\n"
            + "Bước 1: Tạo Socket kết nối đến Server (localhost, cổng 5000).\n"
            + "\n"
            + "Bước 2: Gửi tin nhắn đến Server bằng PrintWriter.\n"
            + "\n"
            + "Bước 3: Đóng kết nối sau khi gửi tin nhắn.\n"
            + "",
            "1️⃣ Chạy chương trình Server trước để lắng nghe kết nối.\n"
            + "2️⃣ Chạy chương trình Client để kết nối và gửi tin nhắn.\n"
            + "3️⃣ Quan sát kết quả trên Console của Server.",
            "✅ Xây dựng hệ thống chat Client-Server.\n"
            + "✅ Phát triển các ứng dụng truyền dữ liệu giữa các thiết bị.\n"
            + "✅ Giao tiếp giữa các dịch vụ trong hệ thống phân tán.\n"
            + "\n"
            + "📌 Tóm lại: Lập trình Socket với TCP/IP giúp các ứng dụng Java kết nối và trao đổi dữ liệu dễ dàng!",});
        Content_MAP.put("Lập trình UDP trong Java", new String[]{
            "UDP (User Datagram Protocol) là giao thức truyền dữ liệu không kết nối, tốc độ nhanh nhưng không đảm bảo dữ liệu đến đúng thứ tự hoặc không bị mất gói tin. UDP thường được sử dụng trong các ứng dụng truyền phát video, game online, VoIP hoặc các hệ thống yêu cầu tốc độ cao mà không quá quan trọng về độ chính xác tuyệt đối.",
            "📌 Máy chủ (Server):\n"
            + "\n"
            + "Mở DatagramSocket để lắng nghe dữ liệu.\n"
            + "\n"
            + "Nhận gói tin từ Client bằng DatagramPacket.\n"
            + "\n"
            + "📌 Máy khách (Client):\n"
            + "\n"
            + "Tạo DatagramSocket để gửi dữ liệu.\n"
            + "\n"
            + "Đóng gói dữ liệu vào DatagramPacket và gửi đến Server.",
            "🔹 Mã nguồn Máy chủ UDP (UDP Server)",
            "🔹 Mã nguồn Máy khách UDP (UDP Client)",
            "✔ Máy chủ (Server):\n"
            + "\n"
            + "Bước 1: Tạo DatagramSocket trên cổng 9876.\n"
            + "\n"
            + "Bước 2: Tạo bộ đệm byte[] để nhận dữ liệu.\n"
            + "\n"
            + "Bước 3: Chờ Client gửi dữ liệu và đọc gói tin bằng DatagramPacket.\n"
            + "\n"
            + "Bước 4: Chuyển dữ liệu nhận được thành chuỗi và hiển thị.\n"
            + "\n"
            + "✔ Máy khách (Client):\n"
            + "\n"
            + "Bước 1: Tạo DatagramSocket để gửi dữ liệu.\n"
            + "\n"
            + "Bước 2: Xác định địa chỉ Server (localhost) và cổng 9876.\n"
            + "\n"
            + "Bước 3: Đóng gói dữ liệu vào DatagramPacket và gửi đi.\n"
            + "\n"
            + "Bước 4: Đóng kết nối sau khi gửi dữ liệu.",
            "1️⃣ Chạy chương trình Server trước để lắng nghe dữ liệu.\n"
            + "2️⃣ Chạy chương trình Client để gửi dữ liệu đến Server.\n"
            + "3️⃣ Quan sát kết quả trên Console của Server.\n"
            + "\n"
            + "📌 Lưu ý:\n"
            + "\n"
            + "UDP không đảm bảo dữ liệu sẽ đến hoặc đến theo đúng thứ tự.\n"
            + "\n"
            + "Không có cơ chế kiểm tra lại nếu dữ liệu bị mất trên đường truyền.",
            "✅ Streaming video/audio (YouTube, Netflix, Zoom, Skype).\n"
            + "✅ Truyền dữ liệu trong game online (chuyển động nhân vật, bắn súng).\n"
            + "✅ Giao thức DNS (Domain Name System).\n"
            + "✅ IoT (Internet of Things), điều khiển thiết bị từ xa.\n"
            + "\n"
            + "📌 Tóm lại: Lập trình UDP trong Java giúp truyền dữ liệu nhanh mà không cần kết nối liên tục, phù hợp với các ứng dụng real-time! 🚀",});
        Content_MAP.put("JDBC là gì?", new String[]{
            "JDBC (Java Database Connectivity) là một API trong Java giúp kết nối và làm việc với các cơ sở dữ liệu như MySQL, PostgreSQL, SQL Server, Oracle,... JDBC cung cấp các phương thức để thực hiện truy vấn, cập nhật, thêm, xóa dữ liệu một cách dễ dàng.",
            "✔ Kết nối với cơ sở dữ liệu thông qua Driver JDBC.\n"
            + "✔ Gửi truy vấn SQL và nhận kết quả.\n"
            + "✔ Thao tác với dữ liệu: thêm, sửa, xóa, tìm kiếm.\n"
            + "✔ Hỗ trợ giao dịch (Transaction) để đảm bảo tính toàn vẹn dữ liệu.",
            "1️⃣ Driver JDBC: Cầu nối giữa Java và hệ quản trị cơ sở dữ liệu (DBMS).\n"
            + "2️⃣ Connection: Mở kết nối đến cơ sở dữ liệu.\n"
            + "3️⃣ Statement / PreparedStatement: Thực hiện truy vấn SQL.\n"
            + "4️⃣ ResultSet: Lấy kết quả từ cơ sở dữ liệu.\n"
            + "5️⃣ Transaction Management: Kiểm soát các giao dịch.",
            "🔹 Bước 1: Thêm thư viện JDBC\n"
            + "Nếu dùng MySQL, cần tải thư viện MySQL Connector/J và thêm vào dự án.\n"
            + "\n"
            + "🔹 Bước 2: Kết nối đến CSDL",
            "✔ Class.forName(): Nạp driver JDBC.\n"
            + "✔ DriverManager.getConnection(): Kết nối đến cơ sở dữ liệu.",
            "🔹 Thực hiện truy vấn SELECT",
            "🔹 Thêm dữ liệu (INSERT)",
            "🔹 Sử dụng PreparedStatement (tốt hơn Statement)",
            "✔ PreparedStatement giúp tránh lỗi SQL Injection.",
            "✅ Viết ứng dụng quản lý sinh viên, nhân viên, sản phẩm.\n"
            + "✅ Tích hợp hệ thống đăng nhập bằng tài khoản từ database.\n"
            + "✅ Phát triển ứng dụng web và desktop kết nối cơ sở dữ liệu.\n"
            + "\n"
            + "📌 Tóm lại: JDBC là API quan trọng giúp Java kết nối và làm việc với cơ sở dữ liệu một cách hiệu quả.",});
        Content_MAP.put("Kết nối MySQL với Java", new String[]{
            "Để kết nối Java với MySQL, ta sử dụng JDBC (Java Database Connectivity). Dưới đây là hướng dẫn chi tiết.",
            "Trước khi kết nối, bạn cần tải MySQL Connector/J, là thư viện giúp Java giao tiếp với MySQL.\n"
            + "\n"
            + "✔ Nếu dùng Maven, thêm vào pom.xml:",
            "✔ Nếu không dùng Maven, tải mysql-connector-java.jar, sau đó thêm vào classpath của dự án.",
            "Dưới đây là chương trình Java để kiểm tra kết nối MySQL:",
            "🔹 DriverManager.getConnection(url, user, password): Kết nối đến MySQL.\n"
            + "🔹 try-with-resources giúp tự động đóng kết nối khi xong việc.\n"
            + "🔹 Xử lý lỗi khi không kết nối được đến database.",
            "📌 Đảm bảo MySQL đang chạy và bạn có tài khoản hợp lệ.\n"
            + "📌 Cấu trúc URL kết nối MySQL:",
            "localhost:3306 → Máy chủ MySQL cục bộ, cổng 3306.\n"
            + "\n"
            + "testdb → Tên cơ sở dữ liệu.\n"
            + "\n"
            + "useSSL=false → Không sử dụng SSL để kết nối.\n"
            + "\n"
            + "serverTimezone=UTC → Tránh lỗi múi giờ.",
            "✔ Nếu kết nối thành công, chương trình sẽ in:",
            "✔ Nếu thất bại, kiểm tra user/password, MySQL server, firewall.",
            "✅ Kết nối web/app desktop với cơ sở dữ liệu MySQL.\n"
            + "✅ Xây dựng hệ thống quản lý sinh viên, nhân viên, sản phẩm.\n"
            + "✅ Kết hợp với JDBC, Hibernate, Spring Boot để phát triển phần mềm.\n"
            + "\n"
            + "🚀 Chúc bạn thành công trong lập trình Java với MySQL!",});
        Content_MAP.put("Thực hiện CRUD", new String[]{
            "CRUD (Create, Read, Update, Delete) là các thao tác cơ bản khi làm việc với cơ sở dữ liệu. Dưới đây là cách thực hiện CRUD trong Java sử dụng JDBC.",
            "Trước tiên, ta cần kết nối Java với MySQL:",
            "🔹 getConnection() giúp kết nối đến MySQL dễ dàng.",
            "Chèn dữ liệu vào bảng users:",
            "🔹 PreparedStatement giúp bảo vệ khỏi SQL Injection.\n"
            + "🔹 Dữ liệu truyền vào bằng ?, đảm bảo an toàn.\n"
            + "\n"
            + "📌 Gọi hàm thêm dữ liệu:",
            "Lấy danh sách tất cả người dùng:",
            "📌 Gọi hàm đọc dữ liệu:",
            "Sửa tuổi của một người dùng:",
            "📌 Gọi hàm cập nhật:",
            "Xóa người dùng theo tên:",
            "📌 Gọi hàm xóa dữ liệu:",
            "✔ Kết nối MySQL với Java bằng JDBC.\n"
            + "✔ CRUD:\n"
            + "\n"
            + "Thêm dữ liệu: insertUser(\"Quân\", 20);\n"
            + "\n"
            + "Đọc dữ liệu: getUsers();\n"
            + "\n"
            + "Cập nhật dữ liệu: updateUserAge(\"Quân\", 25);\n"
            + "\n"
            + "Xóa dữ liệu: deleteUser(\"Quân\");\n"
            + "\n"
            + "💡 Ứng dụng thực tế:\n"
            + "✅ Dùng trong quản lý sinh viên, nhân viên, sản phẩm.\n"
            + "✅ Kết hợp với JavaFX, Servlet, Spring Boot để xây dựng hệ thống web/app.\n"
            + "\n"
            + "🚀 Chúc bạn thành công với JDBC trong Java!",});
        Content_MAP.put("Servlet là gì?", new String[]{
            "Servlet là một lớp Java chạy trên máy chủ (server-side), được sử dụng để xử lý các yêu cầu HTTP và tạo phản hồi động cho ứng dụng web. Nó đóng vai trò trung gian giữa trình duyệt và máy chủ, giúp xây dựng các ứng dụng web mạnh mẽ bằng Java.",
            "✔ Chạy trên máy chủ web: Được triển khai trên các máy chủ như Apache Tomcat, GlassFish.\n"
            + "✔ Xử lý yêu cầu HTTP: Hỗ trợ các phương thức như GET, POST.\n"
            + "✔ Tạo nội dung động: Khác với HTML tĩnh, Servlet có thể tạo trang web động dựa trên dữ liệu đầu vào.\n"
            + "✔ Tương tác với CSDL: Có thể truy xuất dữ liệu từ MySQL, PostgreSQL thông qua JDBC.",
            "📌 Khi một trình duyệt gửi yêu cầu HTTP đến máy chủ, quá trình xử lý diễn ra như sau:\n"
            + "1️⃣ Máy chủ nhận yêu cầu và chuyển đến Servlet tương ứng.\n"
            + "2️⃣ Servlet xử lý yêu cầu (ví dụ: lấy dữ liệu từ CSDL, xử lý biểu mẫu).\n"
            + "3️⃣ Servlet tạo phản hồi và gửi về trình duyệt dưới dạng HTML, JSON hoặc XML.\n"
            + "\n"
            + "🖥 Minh họa hoạt động:\n"
            + "📤 Client (Browser) → HTTP Request → Server (Servlet) → HTTP Response → Client (Browser)",
            "Tạo Servlet xử lý yêu cầu HTTP",
            "Giải thích\n"
            + "✔ @WebServlet(\"/hello\"): Servlet sẽ được gọi khi truy cập đường dẫn /hello.\n"
            + "✔ doGet(): Xử lý yêu cầu HTTP GET.\n"
            + "✔ response.setContentType(\"text/html\"): Trả về nội dung HTML.\n"
            + "✔ PrintWriter out = response.getWriter();: Gửi dữ liệu về trình duyệt.\n"
            + "\n"
            + "📌 Truy cập: Mở trình duyệt và nhập http://localhost:8080/yourApp/hello.",
            "💡 Servlet được sử dụng trong:\n"
            + "✅ Xử lý biểu mẫu (đăng nhập, đăng ký, tìm kiếm).\n"
            + "✅ Kết nối cơ sở dữ liệu để lấy dữ liệu động.\n"
            + "✅ Tạo API RESTful (trả về JSON/XML cho frontend).\n"
            + "✅ Xây dựng ứng dụng web động với JSP và Spring Boot.",
            "✔ Servlet là một Java class chạy trên máy chủ, xử lý yêu cầu HTTP.\n"
            + "✔ Được sử dụng để xây dựng ứng dụng web động, kết nối cơ sở dữ liệu, tạo API.\n"
            + "✔ Có thể triển khai trên máy chủ Tomcat, GlassFish...\n"
            + "\n"
            + "🚀 Tiếp theo: Tích hợp Servlet với JSP để xây dựng ứng dụng web hoàn chỉnh!",});
        Content_MAP.put("Tạo Servlet cơ bản", new String[]{
            "Servlet là thành phần quan trọng trong lập trình web với Java, giúp xử lý yêu cầu HTTP từ trình duyệt và phản hồi kết quả. Dưới đây là cách tạo một Servlet đơn giản.",
            "✔ @WebServlet(\"/hello\")\n"
            + "Định nghĩa URL mapping cho Servlet. Khi truy cập http://localhost:8080/app/hello, Servlet này sẽ được gọi.\n"
            + "\n"
            + "✔ extends HttpServlet\n"
            + "Kế thừa từ HttpServlet, giúp Servlet có thể xử lý yêu cầu HTTP.\n"
            + "\n"
            + "✔ doGet(HttpServletRequest request, HttpServletResponse response)\n"
            + "Xử lý yêu cầu HTTP GET từ trình duyệt.\n"
            + "\n"
            + "✔ response.setContentType(\"text/html\")\n"
            + "Định dạng nội dung phản hồi là HTML.\n"
            + "\n"
            + "✔ response.getWriter().println(\"<h1>Hello từ Servlet!</h1>\");\n"
            + "Gửi phản hồi HTML về trình duyệt.",
            "Bước 1: Cấu hình Tomcat\n"
            + "Đảm bảo bạn có Apache Tomcat cài đặt trong IDE (Eclipse, IntelliJ).\n"
            + "\n"
            + "Thêm Servlet vào web.xml (nếu không dùng @WebServlet):",
            "Bước 2: Chạy trên Tomcat\n"
            + "Deploy ứng dụng lên Tomcat.\n"
            + "\n"
            + "Mở trình duyệt và nhập:",
            "Kết quả: \"Hello từ Servlet!\" hiển thị trên trình duyệt.",
            "💡 Servlet có thể dùng để:\n"
            + "✅ Xử lý biểu mẫu (đăng nhập, đăng ký, tìm kiếm).\n"
            + "✅ Kết nối với cơ sở dữ liệu để lấy dữ liệu động.\n"
            + "✅ Xây dựng API RESTful (trả về JSON/XML cho frontend).\n"
            + "✅ Tích hợp với JSP để tạo ứng dụng web hoàn chỉnh.",
            "✔ Servlet là một Java class chạy trên máy chủ, xử lý yêu cầu HTTP.\n"
            + "✔ Servlet cơ bản có thể được tạo bằng cách kế thừa HttpServlet và sử dụng @WebServlet.\n"
            + "✔ Có thể chạy Servlet trên Tomcat và truy cập qua trình duyệt.\n"
            + "\n"
            + "🚀 Tiếp theo: Tích hợp Servlet với JSP để xây dựng ứng dụng web hoàn chỉnh!",});
        Content_MAP.put("JSP là gì?", new String[]{
            "JSP (JavaServer Pages) là công nghệ giúp nhúng mã Java vào HTML để tạo các trang web động. Nó cho phép xử lý dữ liệu từ người dùng, tương tác với cơ sở dữ liệu và hiển thị nội dung động trên trình duyệt.",
            "Dưới đây là một trang JSP nhận tham số name từ URL và hiển thị lên màn hình:",
            "📌 Cách chạy:\n"
            + "\n"
            + "Mở trình duyệt và truy cập:",
            "Kết quả:",
            "✔ <%@ page language=\"java\" %>\n"
            + "\n"
            + "Khai báo đây là một trang JSP.\n"
            + "\n"
            + "✔ <%= request.getParameter(\"name\") %>\n"
            + "\n"
            + "Lấy giá trị tham số name từ URL và hiển thị lên trang.\n"
            + "\n"
            + "✔ contentType=\"text/html; charset=UTF-8\"\n"
            + "\n"
            + "Định dạng trang web là HTML với mã hóa UTF-8.\n"
            + "",
            "Cú pháp:\n"
            + "\n"
            + "JSP có cú pháp gần giống HTML, giúp viết giao diện dễ dàng hơn.\n"
            + "\n"
            + "Servlet yêu cầu nhiều mã Java để xử lý yêu cầu và phản hồi, phức tạp hơn JSP.\n"
            + "\n"
            + "Mục đích sử dụng:\n"
            + "\n"
            + "JSP chủ yếu dùng để hiển thị nội dung động trên giao diện web.\n"
            + "\n"
            + "Servlet được sử dụng để xử lý logic phía backend, quản lý yêu cầu từ người dùng.\n"
            + "\n"
            + "Hiệu suất:\n"
            + "\n"
            + "JSP thường chậm hơn một chút do cần được dịch sang Servlet trước khi chạy.\n"
            + "\n"
            + "Servlet chạy nhanh hơn vì không cần chuyển đổi mà thực thi trực tiếp mã Java.\n"
            + "\n"
            + "Ứng dụng thực tế:\n"
            + "\n"
            + "JSP thích hợp để xây dựng giao diện trang web, hiển thị dữ liệu.\n"
            + "\n"
            + "Servlet được dùng để xử lý yêu cầu HTTP, tương tác với cơ sở dữ liệu và quản lý luồng dữ liệu.\n"
            + "\n"
            + "💡 Tóm lại: JSP giúp viết giao diện động dễ dàng hơn, còn Servlet phù hợp để xử lý logic phía server.",
            "✅ Tạo trang web động.\n"
            + "✅ Hiển thị dữ liệu từ cơ sở dữ liệu.\n"
            + "✅ Xử lý form đăng nhập, đăng ký.\n"
            + "✅ Tích hợp với Servlet để xây dựng ứng dụng web hoàn chỉnh.",
            "JSP giúp nhúng mã Java vào HTML để tạo trang web động.\n"
            + "\n"
            + "Dễ sử dụng hơn Servlet khi làm giao diện.\n"
            + "\n"
            + "Thường kết hợp với Servlet và JDBC để xây dựng ứng dụng web.\n"
            + "\n"
            + "🚀 Tiếp theo: JSP với cơ sở dữ liệu MySQL!",});
        Content_MAP.put("Mô hình MVC trong Java", new String[]{
            "MVC (Model-View-Controller) là mô hình kiến trúc phần mềm giúp tách biệt logic, giao diện và luồng điều khiển trong ứng dụng Java Web.\n"
            + "\n"
            + "🔹 Model (M): Quản lý dữ liệu, thường tương tác với cơ sở dữ liệu.\n"
            + "🔹 View (V): Giao diện người dùng, thường sử dụng JSP.\n"
            + "🔹 Controller (C): Xử lý luồng dữ liệu, thường là Servlet.",
            "1️⃣ Người dùng gửi yêu cầu (request) từ trình duyệt đến Controller (Servlet).\n"
            + "2️⃣ Controller xử lý yêu cầu, truy vấn Model (Cơ sở dữ liệu).\n"
            + "3️⃣ Model trả dữ liệu về Controller.\n"
            + "4️⃣ Controller gửi dữ liệu đến View (JSP) để hiển thị lên trình duyệt.\n"
            + "\n"
            + "💡 Ưu điểm của MVC:\n"
            + "✅ Dễ bảo trì và mở rộng.\n"
            + "✅ Phân tách rõ ràng giữa giao diện và logic xử lý.\n"
            + "✅ Tái sử dụng mã nguồn tốt hơn.",
            "🔹 Model (User.java) - Quản lý dữ liệu",
            "🔹 Controller (UserServlet.java) - Xử lý yêu cầu",
            "🔹 View (user.jsp) - Hiển thị dữ liệu",
            "MVC giúp tổ chức mã nguồn khoa học hơn.\n"
            + "\n"
            + "Tách biệt logic, giao diện và điều hướng giúp dễ dàng bảo trì.\n"
            + "\n"
            + "Được sử dụng rộng rãi trong Java Web với Servlet và JSP.\n"
            + "\n"
            + "🚀 Tiếp theo: Tích hợp MVC với cơ sở dữ liệu MySQL!",});
        Content_MAP.put("Lập trình hướng đối tượng là gì?", new String[]{
            "Lập trình hướng đối tượng (OOP - Object-Oriented Programming) là một mô hình lập trình tổ chức chương trình thành các đối tượng (objects).\n"
            + "\n"
            + "🔹 Đối tượng là thực thể trong thế giới thực, có thuộc tính (state) và hành vi (behavior).\n"
            + "🔹 Lớp (Class) là khuôn mẫu để tạo ra các đối tượng.\n"
            + "\n"
            + "💡 Ví dụ:\n"
            + "👉 Một \"Xe hơi\" có thuộc tính: màu sắc, hãng xe, vận tốc.\n"
            + "👉 Một \"Xe hơi\" có hành vi: chạy, dừng, tăng tốc.",
            "1️⃣ Tính đóng gói (Encapsulation)\n"
            + "Định nghĩa: Ẩn thông tin bên trong đối tượng, chỉ cho phép truy cập thông qua phương thức cụ thể.\n"
            + "\n"
            + "Ví dụ: Sử dụng private để giới hạn quyền truy cập.",
            "Định nghĩa: Cho phép một lớp con kế thừa thuộc tính và phương thức từ lớp cha.\n"
            + "\n"
            + "Ví dụ: Lớp ElectricCar kế thừa từ Car.",
            "Định nghĩa: Cho phép một phương thức có thể có nhiều cách thực hiện khác nhau.\n"
            + "\n"
            + "Ví dụ: Ghi đè phương thức (@Override).",
            "Định nghĩa: Chỉ tập trung vào những đặc điểm quan trọng, che giấu chi tiết triển khai.\n"
            + "\n"
            + "Ví dụ: Dùng abstract class hoặc interface.",
            "🔹 OOP giúp dễ bảo trì, mở rộng và tái sử dụng mã nguồn.\n"
            + "🔹 Java là ngôn ngữ hỗ trợ mạnh mẽ lập trình hướng đối tượng.\n"
            + "🔹 Tiếp theo: Tạo và sử dụng đối tượng trong Java! 🚀",});
        Content_MAP.put("Lớp và đối tượng", new String[]{
            "🔹 Lớp (Class) là một khuôn mẫu để tạo ra các đối tượng (Object).\n"
            + "🔹 Lớp chứa thuộc tính (biến) và phương thức (hành vi) của đối tượng.\n"
            + "\n"
            + "💡 Ví dụ:\n"
            + "Lớp Student mô tả sinh viên với thuộc tính (name, age) và hành vi (display() để hiển thị thông tin).",
            "🔹 Đối tượng (Object) là một thể hiện cụ thể của lớp.\n"
            + "🔹 Đối tượng được tạo bằng từ khóa new.\n"
            + "\n"
            + "💡 Ví dụ:\n"
            + "Tạo đối tượng s1 từ lớp Student, gán giá trị cho name và age, rồi gọi phương thức display().",
            "👉 Kết quả:",
            "✔ Lớp là khuôn mẫu, đối tượng là thể hiện của lớp.\n"
            + "✔ Java cho phép tạo và sử dụng đối tượng để thao tác với dữ liệu.\n"
            + "✔ Tiếp theo: Tìm hiểu về constructor (hàm khởi tạo)! 🚀",});
        Content_MAP.put("Constructor", new String[]{
            "🔹 Constructor là một phương thức đặc biệt được gọi tự động khi đối tượng được tạo.\n"
            + "🔹 Dùng để khởi tạo giá trị ban đầu cho đối tượng.\n"
            + "🔹 Constructor không có kiểu trả về, tên của nó trùng với tên lớp.",
            "Trong ví dụ dưới đây, constructor Student(String name, int age) giúp khởi tạo giá trị cho name và age.",
            "👉 Kết quả:",
            "1️⃣ Constructor mặc định (Default Constructor)\n"
            + "\n"
            + "Không có tham số, gán giá trị mặc định cho thuộc tính.",
            "2️⃣ Constructor có tham số (Parameterized Constructor)\n"
            + "\n"
            + "Nhận tham số và gán giá trị cho thuộc tính.",
            "✔ Constructor giúp khởi tạo đối tượng khi nó được tạo.\n"
            + "✔ Có constructor mặc định và constructor có tham số.\n"
            + "✔ Không có kiểu trả về, tên trùng với tên lớp.\n"
            + "✔ Tiếp theo: Tìm hiểu về Overloading Constructor! 🚀",});
        Content_MAP.put("Phương thức (Method)", new String[]{
            "🔹 Phương thức (Method) là các hành động mà một đối tượng có thể thực hiện.\n"
            + "🔹 Dùng để định nghĩa hành vi của một lớp.\n"
            + "🔹 Có thể nhận tham số và trả về giá trị.",
            "Dưới đây là một phương thức add() trong lớp Calculator, dùng để cộng hai số.",
            "👉 Kết quả:",
            "1️⃣ Phương thức có trả về giá trị\n"
            + "\n"
            + "Trả về một giá trị cụ thể.",
            "2️⃣ Phương thức không trả về giá trị (void)\n"
            + "\n"
            + "Chỉ thực hiện hành động mà không trả về dữ liệu.",
            "3️⃣ Phương thức có tham số\n"
            + "\n"
            + "Nhận giá trị đầu vào để xử lý.",
            "4️⃣ Phương thức không có tham số\n"
            + "\n"
            + "Không nhận tham số, thực hiện hành động có sẵn.",
            "✔ Phương thức giúp định nghĩa hành vi của đối tượng.\n"
            + "✔ Có thể có hoặc không có tham số và giá trị trả về.\n"
            + "✔ Gọi phương thức bằng cách sử dụng đối tượng.\n"
            + "✔ Tiếp theo: Tìm hiểu về Method Overloading! 🚀",});
        Content_MAP.put("Đóng gói (Encapsulation)", new String[]{
            "🔹 Đóng gói (Encapsulation) là kỹ thuật che giấu dữ liệu bên trong một lớp, chỉ cho phép truy cập thông qua các phương thức cụ thể.\n"
            + "🔹 Giúp bảo vệ dữ liệu và ngăn chặn việc thay đổi trực tiếp từ bên ngoài.\n"
            + "🔹 Sử dụng các phạm vi truy cập như private, public, protected.",
            "Dưới đây là một lớp Person với thuộc tính name được đóng gói bằng private.",
            "👉 Kết quả:",
            "✔ Bảo vệ dữ liệu khỏi truy cập trái phép.\n"
            + "✔ Kiểm soát quyền truy cập bằng getter và setter.\n"
            + "✔ Tăng tính bảo trì và mở rộng dễ dàng hơn.\n"
            + "✔ Giúp kiểm soát dữ liệu đầu vào (VD: kiểm tra giá trị trước khi gán).\n"
            + "",
            "✔ Đóng gói giúp bảo vệ dữ liệu trong lớp bằng cách sử dụng private.\n"
            + "✔ Truy cập dữ liệu thông qua phương thức getter và setter.\n"
            + "✔ Tăng tính bảo mật, bảo trì và kiểm soát dữ liệu.\n"
            + "✔ Tiếp theo: Tìm hiểu về Kế thừa (Inheritance)! 🚀",});
        Content_MAP.put("Kế thừa (Inheritance)", new String[]{
            "🔹 Kế thừa (Inheritance) là một cơ chế trong lập trình hướng đối tượng giúp một lớp con (child class) có thể sử dụng lại thuộc tính và phương thức của lớp cha (parent class).\n"
            + "🔹 Giúp tái sử dụng mã nguồn, giảm trùng lặp và tổ chức mã tốt hơn.\n"
            + "🔹 Sử dụng từ khóa extends để thực hiện kế thừa.",
            "Dưới đây là một lớp Animal (lớp cha) có phương thức eat(), và lớp Dog (lớp con) kế thừa từ Animal và có thêm phương thức bark().",
            "👉 Kết quả:",
            "✅ Kế thừa đơn: Một lớp con kế thừa một lớp cha.\n"
            + "✅ Kế thừa đa cấp: Một lớp kế thừa từ một lớp đã kế thừa lớp khác.\n"
            + "✅ Kế thừa thứ bậc: Một lớp cha có nhiều lớp con.\n"
            + "\n"
            + "🔴 Java không hỗ trợ đa kế thừa (một lớp con kế thừa nhiều lớp cha) để tránh xung đột dữ liệu.",
            "✔ Kế thừa giúp tái sử dụng mã và tổ chức chương trình tốt hơn.\n"
            + "✔ Lớp con có thể mở rộng hoặc ghi đè (override) phương thức của lớp cha.\n"
            + "✔ Sử dụng từ khóa extends để kế thừa.\n"
            + "✔ Tiếp theo: Tìm hiểu về Ghi đè phương thức (Method Overriding)! 🚀",});
        Content_MAP.put("Đa hình (Polymorphism)", new String[]{
            "🔹 Đa hình (Polymorphism) là tính chất cho phép một phương thức có thể có nhiều cách triển khai khác nhau, tùy thuộc vào đối tượng sử dụng.\n"
            + "🔹 Giúp viết mã linh hoạt hơn, dễ bảo trì và mở rộng.",
            "✅ Đa hình tại thời điểm biên dịch (Compile-time polymorphism): Sử dụng nạp chồng phương thức (Method Overloading).\n"
            + "✅ Đa hình tại thời điểm chạy (Runtime polymorphism): Sử dụng ghi đè phương thức (Method Overriding).",
            "🔹 Nạp chồng phương thức (Method Overloading)\n"
            + "➡ Khi nhiều phương thức có cùng tên nhưng khác số lượng hoặc kiểu tham số.",
            "🔹 Ghi đè phương thức (Method Overriding)\n"
            + "➡ Khi lớp con thay đổi cách triển khai của phương thức đã có trong lớp cha.",
            "✔ Nạp chồng phương thức (Overloading) xảy ra khi có nhiều phương thức cùng tên nhưng khác tham số.\n"
            + "✔ Ghi đè phương thức (Overriding) xảy ra khi lớp con thay đổi cách triển khai của phương thức lớp cha.\n"
            + "✔ Đa hình giúp viết mã linh hoạt hơn, dễ bảo trì và mở rộng.\n"
            + "\n"
            + "👉 Tiếp theo: Tìm hiểu về Lớp trừu tượng (Abstract Class)! 🚀",});
        Content_MAP.put("Interface và Abstract Class", new String[]{
            "✅ Interface là một dạng hợp đồng (contract) trong Java. Nó chỉ chứa các phương thức trừu tượng (không có phần triển khai) và hằng số.\n"
            + "\n"
            + "🔹 Đặc điểm của Interface\n"
            + "\n"
            + "Không thể tạo đối tượng trực tiếp từ Interface.\n"
            + "\n"
            + "Các phương thức trong Interface mặc định là public và abstract.\n"
            + "\n"
            + "Một lớp có thể implements nhiều interface.\n"
            + "\n"
            + "🔹 Ví dụ về Interface",
            "✅ Abstract Class (Lớp trừu tượng) là lớp chứa cả phương thức trừu tượng (chưa có phần triển khai) và phương thức thông thường (có sẵn phần triển khai).\n"
            + "\n"
            + "🔹 Đặc điểm của Abstract Class\n"
            + "\n"
            + "Không thể tạo đối tượng trực tiếp từ Abstract Class.\n"
            + "\n"
            + "Có thể chứa biến, phương thức có sẵn phần triển khai.\n"
            + "\n"
            + "Lớp con phải kế thừa (extends) và cung cấp triển khai cho các phương thức trừu tượng.\n"
            + "\n"
            + "🔹 Ví dụ về Abstract Class",
            "1️⃣ Phương thức\n"
            + "\n"
            + "Interface: Chỉ chứa phương thức trừu tượng (mặc định là public abstract), không có phần triển khai.\n"
            + "\n"
            + "Abstract Class: Có thể chứa cả phương thức trừu tượng và phương thức có phần triển khai sẵn.\n"
            + "\n"
            + "2️⃣ Biến\n"
            + "\n"
            + "Interface: Chỉ chứa hằng số (mặc định là public static final).\n"
            + "\n"
            + "Abstract Class: Có thể chứa cả biến thông thường và hằng số.\n"
            + "\n"
            + "3️⃣ Tính kế thừa\n"
            + "\n"
            + "Interface: Một lớp có thể implements nhiều interface cùng lúc.\n"
            + "\n"
            + "Abstract Class: Một lớp chỉ có thể kế thừa (extends) một abstract class.\n"
            + "\n"
            + "4️⃣ Dùng khi nào?\n"
            + "\n"
            + "Interface: Khi muốn định nghĩa một tập hợp các phương thức chung, giúp nhiều lớp có thể sử dụng mà không cần chia sẻ code.\n"
            + "\n"
            + "Abstract Class: Khi muốn cung cấp một phần cài đặt sẵn và cho phép lớp con mở rộng.\n"
            + "\n"
            + "🔹 Tóm lại, nếu cần một bản thiết kế chung, dùng Interface. Nếu cần một lớp có một phần cài đặt sẵn, dùng Abstract Class. 🚀",
            "✔ Interface: Dùng khi các lớp con chỉ cần có chung một số hành vi mà không cần chia sẻ code.\n"
            + "✔ Abstract Class: Dùng khi cần chia sẻ một số phương thức có sẵn và vẫn cho phép mở rộng.\n"
            + "\n"
            + "👉 Tiếp theo: Tìm hiểu về Exception Handling (Xử lý ngoại lệ) trong Java! 🚀",});
        Content_MAP.put("Xử lý ngoại lệ (Exception Handling)", new String[]{
            "Ngoại lệ là lỗi xảy ra trong quá trình thực thi chương trình, có thể làm gián đoạn luồng hoạt động bình thường. Java cung cấp cơ chế xử lý ngoại lệ để giúp chương trình tiếp tục chạy thay vì bị dừng đột ngột.",
            "try: Chứa đoạn mã có thể gây ra ngoại lệ.\n"
            + "\n"
            + "catch: Bắt và xử lý ngoại lệ.\n"
            + "\n"
            + "finally: Luôn được thực thi, dùng để dọn dẹp tài nguyên.\n"
            + "\n"
            + "throw: Ném ngoại lệ thủ công.\n"
            + "\n"
            + "throws: Khai báo ngoại lệ có thể xảy ra trong phương thức.",
            "2.1. Xử lý ngoại lệ với try-catch",
            "🔹 Nếu có ngoại lệ, chương trình không bị dừng mà hiển thị thông báo lỗi.\n"
            + "\n"
            + "2.2. Sử dụng finally",
            "🔹 finally luôn chạy, dù có lỗi hay không.\n"
            + "\n"
            + "2.3. Ném ngoại lệ thủ công với throw",
            "🔹 Dùng throw để kiểm soát ngoại lệ theo logic riêng.\n"
            + "\n"
            + "2.4. Khai báo ngoại lệ với throws",
            "🔹 throws cho biết phương thức có thể phát sinh ngoại lệ.",
            "Checked Exception: Kiểm tra khi biên dịch (VD: IOException, SQLException).\n"
            + "\n"
            + "Unchecked Exception: Xảy ra khi chạy (VD: ArithmeticException, NullPointerException).\n"
            + "\n"
            + "Error: Lỗi nghiêm trọng về hệ thống (VD: OutOfMemoryError).",
            "Xử lý ngoại lệ giúp chương trình ổn định hơn, tránh bị dừng đột ngột và bảo vệ dữ liệu quan trọng. 🚀",});
        Content_MAP.put("Đọc và ghi file trong Java", new String[]{
            "Trong Java, có thể sử dụng các lớp trong gói java.io để thao tác với tệp tin.",
            "Để ghi dữ liệu vào tệp, ta sử dụng FileWriter.",
            "🔹 Nếu tệp chưa tồn tại, nó sẽ được tạo mới.",
            "Để đọc nội dung từ tệp, ta sử dụng FileReader.",
            "🔹 Mỗi ký tự được đọc tuần tự cho đến khi hết tệp.",
            "🔹 BufferedReader giúp đọc file nhanh hơn, đặc biệt khi làm việc với file lớn.",
            "FileWriter và FileReader giúp ghi và đọc file ký tự.\n"
            + "\n"
            + "BufferedReader cải thiện tốc độ đọc file lớn.\n"
            + "\n"
            + "Cần xử lý ngoại lệ để tránh lỗi khi thao tác với file. 🚀",});
        Content_MAP.put("Giới thiệu Collection Framework", new String[]{
            "Collection Framework trong Java là một tập hợp các lớp và giao diện giúp quản lý và thao tác với nhóm đối tượng một cách hiệu quả. Nó cung cấp các cấu trúc dữ liệu như List, Set, Map, giúp lưu trữ, tìm kiếm, sắp xếp và xử lý dữ liệu thuận tiện hơn.",
            "Collection Framework gồm ba nhóm chính:\n"
            + "\n"
            + "List - Danh sách có thứ tự, cho phép phần tử trùng lặp.\n"
            + "\n"
            + "Các lớp phổ biến: ArrayList, LinkedList, Vector.\n"
            + "\n"
            + "Ví dụ:",
            "Set - Tập hợp không chứa phần tử trùng lặp.\n"
            + "\n"
            + "Các lớp phổ biến: HashSet, LinkedHashSet, TreeSet.\n"
            + "\n"
            + "Ví dụ:",
            "Map - Cấu trúc lưu trữ theo cặp key-value, không cho phép trùng khóa.\n"
            + "\n"
            + "Các lớp phổ biến: HashMap, TreeMap, LinkedHashMap.\n"
            + "\n"
            + "Ví dụ:",
            "✅ Cung cấp các cấu trúc dữ liệu mạnh mẽ.\n"
            + "✅ Giảm thiểu lỗi khi thao tác với dữ liệu.\n"
            + "✅ Tối ưu hiệu suất khi xử lý danh sách lớn.\n"
            + "\n"
            + "Collection Framework giúp lập trình Java trở nên dễ dàng và hiệu quả hơn! 🚀",});
        Content_MAP.put("ArrayList", new String[]{
            "ArrayList là một mảng động trong Java, có khả năng tự động thay đổi kích thước khi thêm hoặc xóa phần tử. Không giống như mảng thông thường (Array), ArrayList không yêu cầu khai báo kích thước cố định trước.",
            "Để sử dụng ArrayList, cần import thư viện:",
            "Tạo một ArrayList và thêm phần tử",
            "📌 Output:",
            "add(element): Thêm phần tử vào danh sách.\n"
            + "\n"
            + "get(index): Lấy phần tử tại vị trí index.\n"
            + "\n"
            + "set(index, element): Cập nhật giá trị tại vị trí index.\n"
            + "\n"
            + "remove(index): Xóa phần tử tại vị trí index.\n"
            + "\n"
            + "size(): Lấy số lượng phần tử.\n"
            + "\n"
            + "Ví dụ sử dụng các phương thức phổ biến",
            "✅ Ưu điểm:\n"
            + "✔ Kích thước linh hoạt.\n"
            + "✔ Cung cấp nhiều phương thức hỗ trợ.\n"
            + "✔ Dễ dàng thao tác với dữ liệu.\n"
            + "\n"
            + "❌ Nhược điểm:\n"
            + "✖ Hiệu suất chậm hơn LinkedList khi chèn/xóa giữa danh sách.\n"
            + "✖ Tốn bộ nhớ hơn mảng tĩnh do cần lưu thông tin kích thước.\n"
            + "\n"
            + "💡 Khi nào nên dùng ArrayList?\n"
            + "👉 Khi cần truy xuất phần tử nhanh và không quan tâm nhiều đến việc thêm/xóa giữa danh sách. 🚀",});
        Content_MAP.put("LinkedList", new String[]{
            "LinkedList là một cấu trúc dữ liệu sử dụng danh sách liên kết để lưu trữ các phần tử. Không giống như ArrayList sử dụng mảng động, LinkedList có thể dễ dàng thêm, xóa phần tử mà không cần dịch chuyển các phần tử khác.",
            "Để sử dụng LinkedList, cần import thư viện:",
            "Tạo một LinkedList và thêm phần tử",
            "📌 Output:",
            "addFirst(element): Thêm phần tử vào đầu danh sách.\n"
            + "\n"
            + "addLast(element): Thêm phần tử vào cuối danh sách.\n"
            + "\n"
            + "removeFirst(): Xóa phần tử đầu tiên.\n"
            + "\n"
            + "removeLast(): Xóa phần tử cuối cùng.\n"
            + "\n"
            + "getFirst(): Lấy phần tử đầu tiên.\n"
            + "\n"
            + "getLast(): Lấy phần tử cuối cùng.\n"
            + "\n"
            + "Ví dụ sử dụng các phương thức phổ biến",
            "✅ Ưu điểm:\n"
            + "✔ Thêm, xóa phần tử ở giữa danh sách nhanh hơn ArrayList.\n"
            + "✔ Không cần cấp phát lại bộ nhớ khi danh sách mở rộng.\n"
            + "\n"
            + "❌ Nhược điểm:\n"
            + "✖ Truy xuất phần tử chậm hơn ArrayList vì phải duyệt qua từng node.\n"
            + "✖ Tốn bộ nhớ hơn do phải lưu thêm liên kết giữa các phần tử.\n"
            + "\n"
            + "💡 Khi nào nên dùng LinkedList?\n"
            + "👉 Khi cần chèn/xóa phần tử thường xuyên hơn là truy xuất ngẫu nhiên. 🚀",});
        Content_MAP.put("HashMap", new String[]{
            "HashMap là một cấu trúc dữ liệu trong Java lưu trữ dữ liệu dưới dạng cặp key-value. Mỗi key là duy nhất và ánh xạ đến một value tương ứng.\n"
            + "\n"
            + "📌 Đặc điểm của HashMap:\n"
            + "\n"
            + "Truy xuất nhanh: Dựa trên kỹ thuật băm (hashing).\n"
            + "\n"
            + "Không bảo đảm thứ tự: Các phần tử có thể không theo thứ tự chèn vào.\n"
            + "\n"
            + "Cho phép giá trị null: Key có thể là null, và value có thể chứa nhiều null.",
            "Import thư viện:",
            "Tạo một HashMap và thêm dữ liệu",
            "📌 Output:",
            "put(key, value): Thêm hoặc cập nhật giá trị cho key.\n"
            + "\n"
            + "get(key): Lấy giá trị của một key.\n"
            + "\n"
            + "remove(key): Xóa một cặp key-value.\n"
            + "\n"
            + "containsKey(key): Kiểm tra key có tồn tại không.\n"
            + "\n"
            + "containsValue(value): Kiểm tra giá trị có tồn tại không.\n"
            + "\n"
            + "size(): Trả về số lượng cặp key-value trong HashMap.\n"
            + "\n"
            + "keySet(): Lấy danh sách tất cả các key.\n"
            + "\n"
            + "values(): Lấy danh sách tất cả các value.\n"
            + "\n"
            + "Ví dụ sử dụng các phương thức trên",
            "✅ Ưu điểm:\n"
            + "✔ Tốc độ truy xuất nhanh với thời gian trung bình O(1).\n"
            + "✔ Linh hoạt khi lưu trữ và quản lý dữ liệu bằng key-value.\n"
            + "\n"
            + "❌ Nhược điểm:\n"
            + "✖ Không bảo toàn thứ tự chèn.\n"
            + "✖ Tốn bộ nhớ hơn do sử dụng bảng băm.\n"
            + "\n"
            + "💡 Khi nào nên dùng HashMap?\n"
            + "👉 Khi cần truy xuất dữ liệu nhanh dựa trên key thay vì duyệt tuần tự. 🚀",});
        Content_MAP.put("Giới thiệu JavaFX", new String[]{
            "JavaFX là một nền tảng để phát triển ứng dụng giao diện đồ họa (GUI - Graphical User Interface) trong Java. Đây là công nghệ thay thế Swing và AWT, cung cấp hiệu ứng đồ họa mạnh mẽ, hỗ trợ CSS, FXML, và có thể tạo ứng dụng đa nền tảng.\n"
            + "\n"
            + "📌 Đặc điểm của JavaFX:\n"
            + "\n"
            + "Tùy biến giao diện với CSS.\n"
            + "\n"
            + "Tách biệt logic và giao diện bằng FXML.\n"
            + "\n"
            + "Hỗ trợ đồ họa 2D/3D, hoạt ảnh, và đa phương tiện.\n"
            + "\n"
            + "Dễ dàng mở rộng với Scene Builder.\n"
            + "",
            "Ứng dụng JavaFX thường có ba phần chính:\n"
            + "\n"
            + "Stage (Sân khấu): Cửa sổ chính của ứng dụng.\n"
            + "\n"
            + "Scene (Cảnh): Chứa các thành phần giao diện.\n"
            + "\n"
            + "Nodes (Nút): Các thành phần UI như nút bấm, văn bản, bảng...",
            "🔹 Chương trình hiển thị một nút bấm và xử lý sự kiện",
            "📌 Giải thích:\n"
            + "✅ Application là lớp cha của mọi ứng dụng JavaFX.\n"
            + "✅ start(Stage primaryStage) là phương thức chính để thiết lập giao diện.\n"
            + "✅ Scene chứa các thành phần UI.\n"
            + "✅ StackPane giúp bố trí các thành phần UI theo chiều dọc.\n"
            + "✅ Button là một nút bấm có sự kiện khi click.",
            "Label: Hiển thị văn bản.\n"
            + "\n"
            + "TextField: Ô nhập dữ liệu.\n"
            + "\n"
            + "Button: Nút bấm tương tác.\n"
            + "\n"
            + "TableView: Bảng dữ liệu.\n"
            + "\n"
            + "ListView: Danh sách dữ liệu.\n"
            + "\n"
            + "VBox/HBox/GridPane: Các cách bố trí giao diện linh hoạt.",
            "✅ Ưu điểm:\n"
            + "✔ Hiệu suất cao hơn Swing.\n"
            + "✔ Giao diện đẹp, hỗ trợ CSS, FXML.\n"
            + "✔ Hỗ trợ đa phương tiện và hoạt ảnh.\n"
            + "✔ Dễ mở rộng và phát triển ứng dụng trên desktop, mobile.\n"
            + "\n"
            + "❌ Nhược điểm:\n"
            + "✖ Không phổ biến như Swing.\n"
            + "✖ Không hỗ trợ trực tiếp trên Android (dùng JavaFXPorts để chạy trên mobile).\n"
            + "\n"
            + "💡 Khi nào nên dùng JavaFX?\n"
            + "👉 Khi cần giao diện đồ họa đẹp, linh hoạt, hiệu suất cao cho ứng dụng desktop. 🚀",});
        Content_MAP.put("Cấu trúc ứng dụng JavaFX", new String[]{
            "Stage (Sân khấu): Là cửa sổ chính của ứng dụng JavaFX.\n"
            + "\n"
            + "Scene (Cảnh): Chứa các Node – các thành phần giao diện như Button, Label, TextField.\n"
            + "\n"
            + "Node (Nút): Các thành phần giao diện cụ thể, được sắp xếp trong Scene.\n"
            + "\n"
            + "Dưới đây là ví dụ một ứng dụng JavaFX đơn giản:",
            "Application là lớp cha cho mọi ứng dụng JavaFX.\n"
            + "\n"
            + "start(Stage primaryStage) là phương thức chính để thiết lập giao diện.\n"
            + "\n"
            + "Scene chứa các thành phần giao diện.\n"
            + "\n"
            + "StackPane giúp bố trí các thành phần UI theo chiều dọc.\n"
            + "\n"
            + "Button là một nút bấm, khi nhấn sẽ hiển thị thông báo trong console.\n"
            + "\n"
            + "Ứng dụng này sẽ hiển thị một cửa sổ có chứa nút \"Nhấn tôi\", khi bấm vào nút sẽ xuất hiện dòng chữ \"Chào mừng đến với JavaFX!\" trên console. 🚀",});
        Content_MAP.put("Giới thiệu Spring Boot", new String[]{
            "Spring Boot là một framework giúp phát triển ứng dụng Java nhanh chóng, đặc biệt là các ứng dụng web. Nó mở rộng từ Spring Framework, cung cấp cấu hình tự động (auto-configuration) và máy chủ nhúng (embedded server) giúp giảm bớt công việc cấu hình phức tạp.",
            "✅ Cấu hình tự động: Giảm thiểu cấu hình thủ công nhờ Spring Boot Starter và Spring Boot AutoConfiguration.\n"
            + "✅ Máy chủ nhúng: Hỗ trợ Tomcat, Jetty, Undertow giúp chạy ứng dụng mà không cần triển khai file WAR.\n"
            + "✅ Tích hợp dễ dàng: Làm việc tốt với các công nghệ như JPA, Hibernate, Spring Security, REST API.\n"
            + "✅ Quản lý phụ thuộc đơn giản: Sử dụng Maven hoặc Gradle với Spring Boot Starter giúp quản lý thư viện dễ dàng.",
            "Bước 1: Tạo ứng dụng Spring Boot\n"
            + "Dùng Spring Initializr (start.spring.io) để tạo dự án với các dependencies như Spring Web.\n"
            + "\n"
            + "Bước 2: Tạo Controller",
            "Bước 3: Chạy ứng dụng\n"
            + "Sau khi chạy, mở trình duyệt và truy cập:\n"
            + "🔗 http://localhost:8080/api/hello\n"
            + "📌 Ứng dụng sẽ trả về: \"Xin chào từ Spring Boot!\" 🚀",});
        Content_MAP.put("Tạo REST API với Spring Boot", new String[]{
            "Spring Boot giúp xây dựng REST API nhanh chóng bằng cách sử dụng @RestController và các annotation như @GetMapping, @PostMapping, @PutMapping, @DeleteMapping để xử lý các phương thức HTTP.",
            "Bước 1: Cấu hình Spring Boot\n"
            + "Dùng Spring Initializr (start.spring.io) để tạo project với Spring Web.\n"
            + "\n"
            + "Bước 2: Tạo Controller",
            "📌 Giải thích:\n"
            + "\n"
            + "@RestController: Đánh dấu lớp này là một REST API Controller.\n"
            + "\n"
            + "@RequestMapping(\"/api\"): Định nghĩa đường dẫn chung cho API.\n"
            + "\n"
            + "@GetMapping(\"/hello\"): Xử lý yêu cầu GET từ http://localhost:8080/api/hello.",
            "Dưới đây là API quản lý User với các chức năng Thêm, Lấy danh sách, Xóa.\n"
            + "\n"
            + "Bước 3: Tạo Model",
            "Bước 4: Tạo Controller với CRUD",
            "📌 Các chức năng API:\n"
            + "✅ Thêm user: POST /api/users/add?id=1&name=Quân\n"
            + "✅ Lấy danh sách: GET /api/users/list\n"
            + "✅ Xóa user: DELETE /api/users/delete/1\n"
            + "\n"
            + "📌 Chạy ứng dụng và kiểm tra bằng Postman hoặc trình duyệt. 🚀",});
        Content_MAP.put("Kết nối cơ sở dữ liệu MySQL với Spring Boot", new String[]{
            "Spring Boot hỗ trợ kết nối MySQL thông qua Spring Data JPA (Hibernate), giúp thao tác cơ sở dữ liệu dễ dàng hơn.",
            "Trong file application.properties, thêm thông tin kết nối MySQL:",
            "📌 Giải thích:\n"
            + "\n"
            + "spring.datasource.url → Đường dẫn kết nối đến MySQL.\n"
            + "\n"
            + "spring.datasource.username & spring.datasource.password → Thông tin đăng nhập.\n"
            + "\n"
            + "spring.jpa.hibernate.ddl-auto=update → Tự động cập nhật cấu trúc bảng.\n"
            + "\n"
            + "spring.jpa.show-sql=true → Hiển thị câu lệnh SQL trong console.",
            "📌 Giải thích:\n"
            + "\n"
            + "@Entity → Đánh dấu đây là một bảng trong CSDL.\n"
            + "\n"
            + "@Id → Định danh (Primary Key).\n"
            + "\n"
            + "@GeneratedValue(strategy = GenerationType.IDENTITY) → Tự động tăng giá trị ID.",
            "📌 Giải thích:\n"
            + "\n"
            + "JpaRepository<User, Long> giúp CRUD dễ dàng, không cần viết SQL.",
            "📌 Các API:\n"
            + "✅ Thêm user: POST /users/add?name=Quân\n"
            + "✅ Lấy danh sách: GET /users/list",
            "Start MySQL Server và tạo database mydb.\n"
            + "\n"
            + "Chạy ứng dụng Spring Boot (main() của SpringBootApplication).\n"
            + "\n"
            + "Dùng Postman hoặc trình duyệt kiểm tra API. 🚀",});
        Content_MAP.put("Giới thiệu về Microservices", new String[]{
            "Microservices là một kiến trúc phần mềm trong đó ứng dụng được chia thành nhiều dịch vụ nhỏ, mỗi dịch vụ thực hiện một chức năng riêng biệt và hoạt động độc lập.",
            "✅ Tách biệt và độc lập: Mỗi dịch vụ có cơ sở dữ liệu và logic riêng.\n"
            + "✅ Dễ mở rộng (Scalability): Có thể mở rộng từng dịch vụ một cách linh hoạt.\n"
            + "✅ Dễ bảo trì: Thay đổi một dịch vụ mà không ảnh hưởng toàn bộ hệ thống.\n"
            + "✅ Giao tiếp qua API: Các dịch vụ giao tiếp với nhau bằng REST API hoặc gRPC.\n"
            + "✅ Triển khai độc lập: Mỗi dịch vụ có thể được triển khai riêng, không ảnh hưởng dịch vụ khác.",
            "Về cấu trúc:\n"
            + "\n"
            + "Monolithic: Tất cả các chức năng của ứng dụng được gói gọn trong một ứng dụng duy nhất.\n"
            + "\n"
            + "Microservices: Ứng dụng được chia thành nhiều dịch vụ nhỏ, mỗi dịch vụ đảm nhận một chức năng riêng biệt.\n"
            + "\n"
            + "Về triển khai:\n"
            + "\n"
            + "Monolithic: Khi triển khai, toàn bộ ứng dụng được đưa lên server cùng một lúc.\n"
            + "\n"
            + "Microservices: Mỗi dịch vụ có thể được triển khai riêng biệt mà không ảnh hưởng đến các dịch vụ khác.\n"
            + "\n"
            + "Về bảo trì:\n"
            + "\n"
            + "Monolithic: Việc sửa lỗi hoặc nâng cấp một phần của ứng dụng có thể ảnh hưởng đến toàn bộ hệ thống, khiến việc bảo trì trở nên khó khăn.\n"
            + "\n"
            + "Microservices: Mỗi dịch vụ hoạt động độc lập, giúp việc bảo trì dễ dàng hơn vì chỉ cần thay đổi dịch vụ liên quan mà không ảnh hưởng đến toàn hệ thống.\n"
            + "\n"
            + "Về hiệu suất:\n"
            + "\n"
            + "Monolithic: Khó mở rộng từng thành phần trong hệ thống, nếu cần mở rộng thì phải nâng cấp toàn bộ ứng dụng.\n"
            + "\n"
            + "Microservices: Có thể dễ dàng mở rộng từng dịch vụ riêng lẻ theo nhu cầu mà không làm ảnh hưởng đến các dịch vụ khác.\n"
            + "\n"
            + "Về công nghệ:\n"
            + "\n"
            + "Monolithic: Thường bị giới hạn trong một ngôn ngữ lập trình duy nhất và một công nghệ cố định.\n"
            + "\n"
            + "Microservices: Có thể sử dụng nhiều ngôn ngữ lập trình và công nghệ khác nhau cho từng dịch vụ, giúp tận dụng ưu điểm của từng công nghệ.",
            "🔹 Công nghệ phổ biến trong Microservices\n"
            + "Spring Boot (Java) – Phát triển các dịch vụ nhỏ.\n"
            + "\n"
            + "Spring Cloud – Quản lý giao tiếp, cấu hình, service discovery.\n"
            + "\n"
            + "Docker, Kubernetes – Triển khai và quản lý dịch vụ.\n"
            + "\n"
            + "API Gateway (Netflix Zuul, Spring Cloud Gateway) – Điều phối request giữa các dịch vụ.\n"
            + "\n"
            + "RabbitMQ, Kafka – Giao tiếp bất đồng bộ giữa các dịch vụ.",
            "Giả sử một hệ thống thương mại điện tử có 3 dịch vụ:\n"
            + "1️⃣ User Service → Quản lý người dùng.\n"
            + "2️⃣ Order Service → Xử lý đơn hàng.\n"
            + "3️⃣ Product Service → Quản lý sản phẩm.\n"
            + "\n"
            + "Các dịch vụ này hoạt động độc lập và giao tiếp với nhau qua API. 🚀\n"
            + "\n"
            + "📌 Microservices giúp hệ thống linh hoạt, dễ bảo trì và mở rộng hơn!",});
        Content_MAP.put("Xây dựng Microservice với Spring Boot", new String[]{
            "Spring Boot kết hợp với Spring Cloud giúp xây dựng kiến trúc Microservices một cách hiệu quả.",
            "✅ Eureka Server (Service Discovery) – Định danh và quản lý các dịch vụ.\n"
            + "✅ API Gateway – Điều hướng request đến các microservices.\n"
            + "✅ Config Server – Quản lý cấu hình tập trung.\n"
            + "✅ Microservices riêng lẻ – Các dịch vụ nghiệp vụ như User Service, Order Service, Product Service.",
            "Eureka Server giúp các microservices đăng ký và tìm kiếm nhau mà không cần chỉ định địa chỉ cụ thể.",
            "Thêm dependency vào pom.xml:",
            "📌 Chạy ứng dụng và truy cập http://localhost:8761 để xem Eureka Dashboard.",
            "Ví dụ: User Service đăng ký vào Eureka.",
            "📌 Chạy ứng dụng, User Service sẽ hiển thị trên Eureka Dashboard.",
            "API Gateway giúp điều phối request đến đúng microservice.",
            "📌 Giờ API Gateway sẽ tự động điều hướng request từ http://localhost:8080/users/ đến User Service. 🚀",
            "🔹 Eureka Server giúp quản lý service discovery.\n"
            + "🔹 API Gateway giúp điều hướng request.\n"
            + "🔹 Các microservices như User Service có thể hoạt động độc lập.\n"
            + "\n"
            + "🔥 Đây là cách Spring Boot + Spring Cloud giúp triển khai Microservices một cách dễ dàng và linh hoạt! 🚀",});
        Content_MAP.put("Bảo mật với Spring Security", new String[]{
            "Spring Security là một framework mạnh mẽ giúp bảo vệ ứng dụng thông qua các cơ chế xác thực (authentication) và phân quyền (authorization).",
            "Thêm dependency vào pom.xml:",
            "📌 Sau khi thêm, Spring Boot sẽ tự động kích hoạt bảo mật.\n"
            + "🔐 Khi chạy ứng dụng, bạn cần đăng nhập với username = \"user\" và mật khẩu được log trong console.",
            "Tạo class SecurityConfig.java để tùy chỉnh bảo mật:",
            "📌 Giải thích:\n"
            + "🔹 /public/** – Không yêu cầu đăng nhập.\n"
            + "🔹 /admin/** – Chỉ tài khoản có ROLE_ADMIN mới truy cập.\n"
            + "🔹 Các request khác yêu cầu xác thực.",
            "Tạo user/password trong SecurityConfig:",
            "📌 Giờ có 2 tài khoản:\n"
            + "\n"
            + "User: user/password\n"
            + "\n"
            + "Admin: admin/admin123 (chỉ admin mới truy cập /admin/**)",
            "Spring Security có thể xác thực bằng JWT thay vì Basic Auth.\n"
            + "\n"
            + "Thêm dependency JWT vào pom.xml:",
            "📌 Sau đó có thể tạo, xác thực JWT trong ứng dụng API.",
            "🔹 Spring Security giúp bảo mật API dễ dàng.\n"
            + "🔹 Có thể cấu hình phân quyền, xác thực người dùng, JWT.\n"
            + "🔹 Cấu hình cơ bản: Dùng Basic Auth, bảo vệ URL.\n"
            + "🔹 Cấu hình nâng cao: Dùng JWT thay vì Basic Auth.\n"
            + "\n"
            + "🚀 Bạn muốn tích hợp JWT không? 😃",});
        Content_MAP.put("Xác thực bằng JWT", new String[]{
            "JWT (JSON Web Token) là phương thức xác thực không trạng thái, giúp bảo mật API mà không cần lưu phiên đăng nhập trên server.",
            "Thêm dependency vào pom.xml:",
            "✔️ Tạo JWT khi user đăng nhập:",
            "📌 Giải thích:\n"
            + "🔹 setSubject(username): Token chứa username.\n"
            + "🔹 setExpiration(...): Token hết hạn sau 1 ngày.\n"
            + "🔹 signWith(...): Dùng thuật toán HS256 để ký JWT.\n"
            + "",
            "✔️ Người dùng gửi username/password → Trả về JWT nếu đúng thông tin.",
            "📌 Giải thích:\n"
            + "🔹 Nếu username = \"admin\" & password = \"admin123\", API trả về JWT.\n"
            + "🔹 Nếu sai thông tin, báo lỗi.\n"
            + "\n"
            + "📌 Test API bằng Postman:\n"
            + "POST /auth/login",
            "📌 Response:",
            "✔️ Khi client gọi API, cần kèm theo JWT trong Header:",
            "📌 Giải thích:\n"
            + "🔹 Lấy token từ Header (Authorization: Bearer <JWT>).\n"
            + "🔹 Kiểm tra token có hợp lệ không.\n"
            + "🔹 Nếu hợp lệ, lưu username vào request để xử lý tiếp.\n"
            + "",
            "📌 Giải thích:\n"
            + "🔹 /auth/login – Không cần xác thực.\n"
            + "🔹 Các API khác – Bắt buộc có JWT.\n"
            + "🔹 Filter JwtFilter để kiểm tra token.",
            "1️⃣ Đăng nhập /auth/login để lấy JWT.\n"
            + "2️⃣ Gửi request có Header:",
            "3️⃣ Nếu JWT hợp lệ, API trả về dữ liệu.\n"
            + "4️⃣ Nếu JWT sai hoặc hết hạn, trả lỗi 401 Unauthorized.",
            "✅ Spring Security + JWT giúp xác thực API an toàn.\n"
            + "✅ Không cần lưu session, ứng dụng có thể mở rộng dễ dàng.\n"
            + "✅ Bạn muốn triển khai role-based authorization không? 🚀",});
        Content_MAP.put("Kiểm thử với JUnit và Mockito", new String[]{
            "JUnit là framework kiểm thử phổ biến, giúp kiểm thử đơn vị (Unit Test), còn Mockito hỗ trợ giả lập (mocking) dữ liệu và hành vi.",
            "Thêm dependencies vào pom.xml:",
            "✅ Viết class Calculator:",
            "✅ Viết test case với JUnit:",
            "📌 Giải thích:\n"
            + "🔹 @Test – Đánh dấu đây là một test case.\n"
            + "🔹 assertEquals(expected, actual) – Kiểm tra kết quả mong đợi có bằng kết quả thực tế không.",
            "Giả sử có UserService lấy dữ liệu từ database, ta muốn kiểm thử mà không truy vấn thật.\n"
            + "\n"
            + "✅ Tạo class UserService và UserRepository:",
            "✅ Viết test với Mockito:",
            "📌 Giải thích:\n"
            + "🔹 mock(UserRepository.class) – Tạo giả lập (mock) thay vì gọi database thật.\n"
            + "🔹 when(...).thenReturn(...) – Định nghĩa kết quả mong muốn.\n"
            + "🔹 assertEquals(...) – Kiểm tra kết quả mong đợi.",
            "🔹 Trong IntelliJ IDEA hoặc Eclipse, chuột phải vào test → Run.\n"
            + "🔹 Nếu tất cả test ✅ Passed, nghĩa là code đúng.\n"
            + "🔹 Nếu test ❌ Failed, cần kiểm tra lại logic code.",
            "✅ JUnit giúp kiểm thử đơn vị (Unit Test).\n"
            + "✅ Mockito giúp giả lập dữ liệu để test mà không cần database.\n"
            + "✅ Giúp phát hiện lỗi sớm & cải thiện chất lượng code.\n"
            + "\n"
            + "🚀 Bạn muốn kiểm thử Spring Boot với JUnit & Mockito không?",});

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
        //Java
        Code_MAP.put("Cấu trúc cơ bản của một chương trình Java", new String[]{
            "public class HelloWorld {\n"
            + "    public static void main(String[] args) {\n"
            + "        System.out.println(\"Hello, World!\");\n"
            + "    }\n"
            + "}",
            "public class HelloWorld {}",
            "public static void main(String[] args) {}",
            "System.out.println(\"Hello, World!\");",
            "javac HelloWorld.java",
            "java HelloWorld",
            "Hello, World!"
        });

        Code_MAP.put("Cài đặt JDK", new String[]{
            "sudo apt update\n"
            + "sudo apt install openjdk-17-jdk",
            "%JAVA_HOME%\\bin",
            "export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-XX/Contents/Home\n"
            + "export PATH=$JAVA_HOME/bin:$PATH",
            "source ~/.bashrc",
            "java -version",
            "java version \"17.0.1\" 2023-10-17 LTS\n"
            + "Java(TM) SE Runtime Environment (build 17.0.1+12)\n"
            + "Java HotSpot(TM) 64-Bit Server VM (build 17.0.1+12, mixed mode)",
            "javac -version",
            "javac 17.0.1",});

        Code_MAP.put("Viết và chạy chương trình Java đầu tiên", new String[]{
            "public class HelloWorld {\n"
            + "    public static void main(String[] args) {\n"
            + "        System.out.println(\"Hello, World!\");\n"
            + "    }\n"
            + "}",
            "javac HelloWorld.java",
            "java HelloWorld",
            "Hello, World!",});
        Code_MAP.put("Biến và kiểu dữ liệu", new String[]{
            "String name = \"Java\";  // Kiểu String\n"
            + "int[] numbers = {1, 2, 3};  // Kiểu mảng",
            "<kiểu dữ liệu> <tên biến> = <giá trị>;",
            "int age = 25;       // Biến kiểu int\n"
            + "double price = 99.99; // Biến kiểu double\n"
            + "boolean isJavaFun = true; // Biến kiểu boolean\n"
            + "char grade = 'A';   // Biến kiểu char",
            "int num = 10;\n"
            + "double newNum = num; // int -> double (tự động)",
            "double price = 9.99;\n"
            + "int newPrice = (int) price; // double -> int (mất phần thập phân)",});
        Code_MAP.put("Toán tử trong Java", new String[]{
            "int a = 10, b = 3;\n"
            + "System.out.println(a + b); // 13\n"
            + "System.out.println(a - b); // 7\n"
            + "System.out.println(a * b); // 30\n"
            + "System.out.println(a / b); // 3 (vì cả hai là số nguyên)\n"
            + "System.out.println(a % b); // 1 (phần dư của 10 / 3)",
            "int x = 5, y = 10;\n"
            + "System.out.println(x == y); // false\n"
            + "System.out.println(x != y); // true\n"
            + "System.out.println(x > y);  // false\n"
            + "System.out.println(x < y);  // true\n"
            + "System.out.println(x >= y); // false\n"
            + "System.out.println(x <= y); // true",
            "boolean p = true, q = false;\n"
            + "System.out.println(p && q); // false\n"
            + "System.out.println(p || q); // true\n"
            + "System.out.println(!p);     // false",
            "int num = 10;\n"
            + "num += 5;  // num = num + 5 => 15\n"
            + "num -= 3;  // num = num - 3 => 12\n"
            + "num *= 2;  // num = num * 2 => 24\n"
            + "num /= 4;  // num = num / 4 => 6\n"
            + "System.out.println(num);",
            "biến = (điều kiện) ? giá_trị_đúng : giá_trị_sai;",
            "int a = 10, b = 20;\n"
            + "int min = (a < b) ? a : b;\n"
            + "System.out.println(\"Giá trị nhỏ nhất: \" + min);",});
        Code_MAP.put("Xuất dữ liệu ra màn hình", new String[]{
            "System.out.println(\"Hello Java\");\n"
            + "System.out.println(\"Chào mừng bạn đến với Java!\");",
            "Hello Java\n"
            + "Chào mừng bạn đến với Java!",
            "System.out.print(\"Hello \");\n"
            + "System.out.print(\"Java\");",
            "Hello Java",
            "System.out.printf(\"%d + %d = %d\", 5, 3, 5 + 3);",
            "5 + 3 = 8",
            "System.out.printf(\"Tên: %s, Tuổi: %d, Chiều cao: %.2f m%n\", \"Minh\", 25, 1.75);",
            "Tên: Minh, Tuổi: 25, Chiều cao: 1.75 m",});
        Code_MAP.put("Nhập dữ liệu từ bàn phím", new String[]{
            "import java.util.Scanner;\n"
            + "\n"
            + "public class InputExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner\n"
            + "\n"
            + "        System.out.print(\"Nhập tên: \");\n"
            + "        String name = scanner.nextLine(); // Nhập chuỗi từ bàn phím\n"
            + "\n"
            + "        System.out.println(\"Chào \" + name); // Hiển thị kết quả\n"
            + "\n"
            + "        scanner.close(); // Đóng Scanner để giải phóng tài nguyên\n"
            + "    }\n"
            + "}",
            "Nhập tên: Minh\n"
            + "Chào Minh",
            "String name = scanner.nextLine();",
            "int age = scanner.nextInt();",
            "double height = scanner.nextDouble();",
            "float weight = scanner.nextFloat();",
            "boolean isStudent = scanner.nextBoolean();",
            "import java.util.Scanner;\n"
            + "\n"
            + "public class UserInputExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        Scanner scanner = new Scanner(System.in);\n"
            + "\n"
            + "        System.out.print(\"Nhập tên: \");\n"
            + "        String name = scanner.nextLine();\n"
            + "\n"
            + "        System.out.print(\"Nhập tuổi: \");\n"
            + "        int age = scanner.nextInt();\n"
            + "\n"
            + "        System.out.print(\"Nhập chiều cao (m): \");\n"
            + "        double height = scanner.nextDouble();\n"
            + "\n"
            + "        System.out.println(\"\\nThông tin vừa nhập:\");\n"
            + "        System.out.println(\"Tên: \" + name);\n"
            + "        System.out.println(\"Tuổi: \" + age);\n"
            + "        System.out.println(\"Chiều cao: \" + height + \" m\");\n"
            + "\n"
            + "        scanner.close();\n"
            + "    }\n"
            + "}",
            "Nhập tên: Nam\n"
            + "Nhập tuổi: 25\n"
            + "Nhập chiều cao (m): 1.75\n"
            + "\n"
            + "Thông tin vừa nhập:\n"
            + "Tên: Nam\n"
            + "Tuổi: 25\n"
            + "Chiều cao: 1.75 m",
            "System.out.print(\"Nhập tuổi: \");\n"
            + "int age = scanner.nextInt();\n"
            + "System.out.print(\"Nhập tên: \");\n"
            + "String name = scanner.nextLine(); // Không nhận được đầu vào!",
            "System.out.print(\"Nhập tuổi: \");\n"
            + "int age = scanner.nextInt();\n"
            + "scanner.nextLine(); // Đọc bỏ dòng trống còn lại\n"
            + "System.out.print(\"Nhập tên: \");\n"
            + "String name = scanner.nextLine();",});
        Code_MAP.put("Cấu trúc điều kiện", new String[]{
            "if (a > b) {\n"
            + "    System.out.println(\"a lớn hơn b\");\n"
            + "} else {\n"
            + "    System.out.println(\"a không lớn hơn b\");\n"
            + "}",
            "if (a > b) {\n"
            + "    System.out.println(\"a lớn hơn b\");\n"
            + "} else if (a == b) {\n"
            + "    System.out.println(\"a bằng b\");\n"
            + "} else {\n"
            + "    System.out.println(\"a nhỏ hơn b\");\n"
            + "}",
            "if (a > 0) {\n"
            + "    if (a % 2 == 0) {\n"
            + "        System.out.println(\"a là số dương và chẵn\");\n"
            + "    } else {\n"
            + "        System.out.println(\"a là số dương và lẻ\");\n"
            + "    }\n"
            + "} else {\n"
            + "    System.out.println(\"a không phải số dương\");\n"
            + "}",
            "int day = 3;\n"
            + "switch (day) {\n"
            + "    case 1:\n"
            + "        System.out.println(\"Chủ nhật\");\n"
            + "        break;\n"
            + "    case 2:\n"
            + "        System.out.println(\"Thứ Hai\");\n"
            + "        break;\n"
            + "    case 3:\n"
            + "        System.out.println(\"Thứ Ba\");\n"
            + "        break;\n"
            + "    default:\n"
            + "        System.out.println(\"Ngày không hợp lệ\");\n"
            + "}",});
        Code_MAP.put("Vòng lặp trong Java", new String[]{
            "for (khởi_tạo; điều_kiện; cập_nhật) {\n"
            + "    // Khối lệnh cần thực thi\n"
            + "}",
            "for (int i = 0; i < 5; i++) {\n"
            + "    System.out.println(\"i = \" + i);\n"
            + "}",
            "i = 0\n"
            + "i = 1\n"
            + "i = 2\n"
            + "i = 3\n"
            + "i = 4",
            "while (điều_kiện) {\n"
            + "    // Khối lệnh cần thực thi\n"
            + "}",
            "int i = 0;\n"
            + "while (i < 5) {\n"
            + "    System.out.println(\"i = \" + i);\n"
            + "    i++;\n"
            + "}",
            "do {\n"
            + "    // Khối lệnh cần thực thi\n"
            + "} while (điều_kiện);",
            "int i = 0;\n"
            + "do {\n"
            + "    System.out.println(\"i = \" + i);\n"
            + "    i++;\n"
            + "} while (i < 5);",
            "int[] numbers = {1, 2, 3, 4, 5};\n"
            + "for (int num : numbers) {\n"
            + "    System.out.println(\"Số: \" + num);\n"
            + "}",
            "for (int i = 0; i < 10; i++) {\n"
            + "    if (i == 5) {\n"
            + "        break; // Dừng vòng lặp khi i = 5\n"
            + "    }\n"
            + "    System.out.println(\"i = \" + i);\n"
            + "}",
            "i = 0\n"
            + "i = 1\n"
            + "i = 2\n"
            + "i = 3\n"
            + "i = 4",
            "for (int i = 0; i < 5; i++) {\n"
            + "    if (i == 2) {\n"
            + "        continue; // Bỏ qua i = 2\n"
            + "    }\n"
            + "    System.out.println(\"i = \" + i);\n"
            + "}",
            "i = 0\n"
            + "i = 1\n"
            + "i = 3\n"
            + "i = 4",});
        Code_MAP.put("Mảng trong Java", new String[]{
            "int[] numbers; // Khai báo mảng\n"
            + "numbers = new int[5]; // Cấp phát bộ nhớ cho 5 phần tử",
            "int[] numbers = {1, 2, 3, 4, 5}; // Mảng gồm 5 phần tử",
            "int[] numbers = {1, 2, 3, 4, 5};\n"
            + "System.out.println(\"Phần tử đầu tiên: \" + numbers[0]); // Kết quả: 1\n"
            + "System.out.println(\"Phần tử cuối cùng: \" + numbers[numbers.length - 1]); // Kết quả: 5",
            "int[] numbers = {1, 2, 3, 4, 5};\n"
            + "for (int i = 0; i < numbers.length; i++) {\n"
            + "    System.out.println(\"Phần tử thứ \" + i + \": \" + numbers[i]);\n"
            + "}",
            "for (int num : numbers) {\n"
            + "    System.out.println(\"Giá trị: \" + num);\n"
            + "}",
            "int[][] matrix = {\n"
            + "    {1, 2, 3},\n"
            + "    {4, 5, 6},\n"
            + "    {7, 8, 9}\n"
            + "};\n"
            + "System.out.println(\"Giá trị tại [1][2]: \" + matrix[1][2]); // Kết quả: 6",
            "for (int i = 0; i < matrix.length; i++) {\n"
            + "    for (int j = 0; j < matrix[i].length; j++) {\n"
            + "        System.out.print(matrix[i][j] + \" \");\n"
            + "    }\n"
            + "    System.out.println();\n"
            + "}",
            "import java.util.Arrays;\n"
            + "int[] numbers = {5, 2, 8, 1, 3};\n"
            + "Arrays.sort(numbers); // Mảng sau khi sắp xếp: [1, 2, 3, 5, 8]",
            "int index = Arrays.binarySearch(numbers, 3);\n"
            + "System.out.println(\"Vị trí của số 3: \" + index);",});
        Code_MAP.put("Xử lý chuỗi trong Java", new String[]{
            "// Cách 1: Dùng dấu ngoặc kép (Tạo đối tượng trong String Pool)\n"
            + "String str1 = \"Hello Java\";\n"
            + "\n"
            + "// Cách 2: Dùng từ khóa new (Tạo đối tượng mới trong bộ nhớ Heap)\n"
            + "String str2 = new String(\"Hello Java\");",
            "String str = \"Hello Java\";\n"
            + "System.out.println(\"Độ dài chuỗi: \" + str.length()); // Kết quả: 10",
            "System.out.println(\"Chữ hoa: \" + str.toUpperCase()); // \"HELLO JAVA\"\n"
            + "System.out.println(\"Chữ thường: \" + str.toLowerCase()); // \"hello java\"",
            "System.out.println(\"Bắt đầu bằng 'Hello': \" + str.startsWith(\"Hello\")); // true\n"
            + "System.out.println(\"Kết thúc bằng 'Java': \" + str.endsWith(\"Java\")); // true",
            "System.out.println(\"Vị trí của 'Java': \" + str.indexOf(\"Java\")); // 6",
            "System.out.println(\"Cắt chuỗi từ vị trí 6: \" + str.substring(6)); // \"Java\"\n"
            + "System.out.println(\"Cắt từ 0 đến 5: \" + str.substring(0, 5)); // \"Hello\"",
            "System.out.println(\"Thay 'Java' bằng 'World': \" + str.replace(\"Java\", \"World\"));\n"
            + "// Kết quả: \"Hello World\"",
            "String s1 = \"Java\";\n"
            + "String s2 = \"java\";\n"
            + "System.out.println(s1.equals(s2)); // false (phân biệt chữ hoa, chữ thường)\n"
            + "System.out.println(s1.equalsIgnoreCase(s2)); // true (không phân biệt)",
            "String s = \"   Java   \";\n"
            + "System.out.println(\"Sau khi trim: '\" + s.trim() + \"'\"); // \"Java\"",
            "String first = \"Hello\";\n"
            + "String second = \" Java\";\n"
            + "System.out.println(first + second); // \"Hello Java\"\n"
            + "System.out.println(first.concat(second)); // \"Hello Java\"",
            "String names = \"Alice,Bob,Charlie\";\n"
            + "String[] arr = names.split(\",\");\n"
            + "for (String name : arr) {\n"
            + "    System.out.println(name);\n"
            + "}",
            "Alice\n"
            + "Bob\n"
            + "Charlie",
            "String emptyStr = \"\";\n"
            + "String nullStr = null;\n"
            + "System.out.println(emptyStr.isEmpty()); // true\n"
            + "System.out.println(nullStr == null); // true",});
        Code_MAP.put("Tạo luồng trong Java", new String[]{
            "class MyThread extends Thread {\n"
            + "    public void run() {\n"
            + "        System.out.println(\"Luồng đang chạy...\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        MyThread t = new MyThread(); // Tạo một đối tượng của lớp MyThread\n"
            + "        t.start(); // Kích hoạt luồng\n"
            + "    }\n"
            + "}",
            "class MyRunnable implements Runnable {\n"
            + "    public void run() {\n"
            + "        System.out.println(\"Luồng đang chạy...\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        Thread t = new Thread(new MyRunnable()); // Tạo luồng từ Runnable\n"
            + "        t.start(); // Chạy luồng\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Đồng bộ hóa luồng", new String[]{
            "class Counter {\n"
            + "    private int count = 0;\n"
            + "\n"
            + "    // Phương thức này được đồng bộ hóa (synchronized)\n"
            + "    public synchronized void increment() {\n"
            + "        count++;\n"
            + "    }\n"
            + "\n"
            + "    public int getCount() {\n"
            + "        return count;\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        Counter counter = new Counter();\n"
            + "\n"
            + "        // Tạo hai luồng cùng tăng biến count\n"
            + "        Thread t1 = new Thread(() -> {\n"
            + "            for (int i = 0; i < 1000; i++) {\n"
            + "                counter.increment();\n"
            + "            }\n"
            + "        });\n"
            + "\n"
            + "        Thread t2 = new Thread(() -> {\n"
            + "            for (int i = 0; i < 1000; i++) {\n"
            + "                counter.increment();\n"
            + "            }\n"
            + "        });\n"
            + "\n"
            + "        // Chạy hai luồng\n"
            + "        t1.start();\n"
            + "        t2.start();\n"
            + "\n"
            + "        // Chờ hai luồng hoàn thành\n"
            + "        try {\n"
            + "            t1.join();\n"
            + "            t2.join();\n"
            + "        } catch (InterruptedException e) {\n"
            + "            e.printStackTrace();\n"
            + "        }\n"
            + "\n"
            + "        // Kết quả cuối cùng luôn đúng (2000)\n"
            + "        System.out.println(\"Giá trị cuối cùng của count: \" + counter.getCount());\n"
            + "    }\n"
            + "}",
            "class Counter {\n"
            + "    private int count = 0;\n"
            + "\n"
            + "    public void increment() {\n"
            + "        synchronized (this) {  // Chỉ khóa đoạn code quan trọng\n"
            + "            count++;\n"
            + "        }\n"
            + "    }\n"
            + "\n"
            + "    public int getCount() {\n"
            + "        return count;\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Xử lý sự kiện trong Java", new String[]{
            "import javax.swing.*;\n"
            + "import java.awt.event.*;\n"
            + "\n"
            + "public class EventExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        // Tạo cửa sổ JFrame\n"
            + "        JFrame frame = new JFrame(\"Xử lý sự kiện Java\");\n"
            + "\n"
            + "        // Tạo nút bấm JButton\n"
            + "        JButton button = new JButton(\"Nhấn tôi\");\n"
            + "\n"
            + "        // Gắn ActionListener vào nút bấm\n"
            + "        button.addActionListener(new ActionListener() {\n"
            + "            public void actionPerformed(ActionEvent e) {\n"
            + "                System.out.println(\"Nút đã được nhấn!\");\n"
            + "            }\n"
            + "        });\n"
            + "\n"
            + "        // Thêm nút vào frame\n"
            + "        frame.add(button);\n"
            + "        frame.setSize(300, 200);\n"
            + "        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n"
            + "        frame.setVisible(true);\n"
            + "    }\n"
            + "}",
            "button.addActionListener(e -> System.out.println(\"Nút đã được nhấn!\"));",});
        Code_MAP.put("Giới thiệu về lập trình mạng trong Java", new String[]{
            "import java.io.*;\n"
            + "import java.net.*;\n"
            + "\n"
            + "public class Server {\n"
            + "    public static void main(String[] args) {\n"
            + "        try {\n"
            + "            ServerSocket serverSocket = new ServerSocket(1234);\n"
            + "            System.out.println(\"Máy chủ đang chờ kết nối...\");\n"
            + "\n"
            + "            Socket socket = serverSocket.accept();\n"
            + "            System.out.println(\"Kết nối thành công!\");\n"
            + "\n"
            + "            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));\n"
            + "            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);\n"
            + "\n"
            + "            String message = input.readLine();\n"
            + "            System.out.println(\"Client: \" + message);\n"
            + "\n"
            + "            output.println(\"Chào Client, tôi là Server!\");\n"
            + "            \n"
            + "            socket.close();\n"
            + "            serverSocket.close();\n"
            + "        } catch (IOException e) {\n"
            + "            e.printStackTrace();\n"
            + "        }\n"
            + "    }\n"
            + "}",
            "import java.io.*;\n"
            + "import java.net.*;\n"
            + "\n"
            + "public class Client {\n"
            + "    public static void main(String[] args) {\n"
            + "        try {\n"
            + "            Socket socket = new Socket(\"localhost\", 1234);\n"
            + "            System.out.println(\"Đã kết nối đến Server!\");\n"
            + "\n"
            + "            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));\n"
            + "            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);\n"
            + "\n"
            + "            output.println(\"Xin chào Server!\");\n"
            + "            String response = input.readLine();\n"
            + "            System.out.println(\"Server: \" + response);\n"
            + "\n"
            + "            socket.close();\n"
            + "        } catch (IOException e) {\n"
            + "            e.printStackTrace();\n"
            + "        }\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Lập trình Socket với TCP/IP", new String[]{
            "import java.io.*;\n"
            + "import java.net.*;\n"
            + "\n"
            + "public class Server {\n"
            + "    public static void main(String[] args) throws IOException {\n"
            + "        ServerSocket server = new ServerSocket(5000);\n"
            + "        System.out.println(\"Máy chủ đang chờ kết nối...\");\n"
            + "\n"
            + "        // Chờ Client kết nối\n"
            + "        Socket socket = server.accept();\n"
            + "        System.out.println(\"Client đã kết nối!\");\n"
            + "\n"
            + "        // Nhận dữ liệu từ Client\n"
            + "        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));\n"
            + "        String message = in.readLine();\n"
            + "        System.out.println(\"Client nói: \" + message);\n"
            + "\n"
            + "        // Đóng kết nối\n"
            + "        socket.close();\n"
            + "        server.close();\n"
            + "    }\n"
            + "}",
            "import java.io.*;\n"
            + "import java.net.*;\n"
            + "\n"
            + "public class Client {\n"
            + "    public static void main(String[] args) throws IOException {\n"
            + "        // Kết nối đến Server tại localhost, cổng 5000\n"
            + "        Socket socket = new Socket(\"localhost\", 5000);\n"
            + "        System.out.println(\"Đã kết nối đến Server!\");\n"
            + "\n"
            + "        // Gửi dữ liệu đến Server\n"
            + "        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);\n"
            + "        out.println(\"Xin chào Server!\");\n"
            + "\n"
            + "        // Đóng kết nối\n"
            + "        socket.close();\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Lập trình UDP trong Java", new String[]{
            "import java.net.*;\n"
            + "\n"
            + "public class UDPServer {\n"
            + "    public static void main(String[] args) throws Exception {\n"
            + "        DatagramSocket serverSocket = new DatagramSocket(9876); // Tạo socket UDP trên cổng 9876\n"
            + "        byte[] receiveData = new byte[1024]; // Bộ đệm nhận dữ liệu\n"
            + "\n"
            + "        System.out.println(\"Máy chủ đang chờ dữ liệu...\");\n"
            + "\n"
            + "        // Nhận dữ liệu từ Client\n"
            + "        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);\n"
            + "        serverSocket.receive(receivePacket); // Chờ nhận dữ liệu\n"
            + "\n"
            + "        // Chuyển dữ liệu nhận được thành chuỗi\n"
            + "        String message = new String(receivePacket.getData(), 0, receivePacket.getLength());\n"
            + "        System.out.println(\"Nhận được: \" + message);\n"
            + "\n"
            + "        // Đóng socket\n"
            + "        serverSocket.close();\n"
            + "    }\n"
            + "}",
            "import java.net.*;\n"
            + "\n"
            + "public class UDPClient {\n"
            + "    public static void main(String[] args) throws Exception {\n"
            + "        DatagramSocket clientSocket = new DatagramSocket(); // Tạo socket UDP Client\n"
            + "        InetAddress IPAddress = InetAddress.getByName(\"localhost\"); // Địa chỉ Server\n"
            + "\n"
            + "        // Chuẩn bị dữ liệu gửi\n"
            + "        byte[] sendData = \"Hello Server\".getBytes();\n"
            + "        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);\n"
            + "\n"
            + "        // Gửi dữ liệu đến Server\n"
            + "        clientSocket.send(sendPacket);\n"
            + "        System.out.println(\"Đã gửi tin nhắn đến Server!\");\n"
            + "\n"
            + "        // Đóng socket\n"
            + "        clientSocket.close();\n"
            + "    }\n"
            + "}",});

        Code_MAP.put("JDBC là gì?", new String[]{
            "import java.sql.*;\n"
            + "\n"
            + "public class JDBCExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        String url = \"jdbc:mysql://localhost:3306/your_database\";\n"
            + "        String user = \"root\";\n"
            + "        String password = \"password\";\n"
            + "\n"
            + "        try {\n"
            + "            // Tải driver\n"
            + "            Class.forName(\"com.mysql.cj.jdbc.Driver\");\n"
            + "\n"
            + "            // Tạo kết nối\n"
            + "            Connection conn = DriverManager.getConnection(url, user, password);\n"
            + "            System.out.println(\"Kết nối thành công!\");\n"
            + "\n"
            + "            // Đóng kết nối\n"
            + "            conn.close();\n"
            + "        } catch (Exception e) {\n"
            + "            e.printStackTrace();\n"
            + "        }\n"
            + "    }\n"
            + "}",
            "Statement stmt = conn.createStatement();\n"
            + "ResultSet rs = stmt.executeQuery(\"SELECT * FROM users\");\n"
            + "\n"
            + "while (rs.next()) {\n"
            + "    System.out.println(\"User: \" + rs.getString(\"username\"));\n"
            + "}",
            "String sql = \"INSERT INTO users (username, email) VALUES ('John', 'john@example.com')\";\n"
            + "stmt.executeUpdate(sql);",
            "String sql = \"INSERT INTO users (username, email) VALUES (?, ?)\";\n"
            + "PreparedStatement pstmt = conn.prepareStatement(sql);\n"
            + "pstmt.setString(1, \"Alice\");\n"
            + "pstmt.setString(2, \"alice@example.com\");\n"
            + "pstmt.executeUpdate();",});

        Code_MAP.put("Kết nối MySQL với Java", new String[]{
            "<dependency>\n"
            + "    <groupId>mysql</groupId>\n"
            + "    <artifactId>mysql-connector-java</artifactId>\n"
            + "    <version>8.0.33</version>\n"
            + "</dependency>",
            "import java.sql.*;\n"
            + "\n"
            + "public class DatabaseConnection {\n"
            + "    public static void main(String[] args) {\n"
            + "        // Thông tin kết nối\n"
            + "        String url = \"jdbc:mysql://localhost:3306/testdb\";\n"
            + "        String user = \"root\";\n"
            + "        String password = \"password\";\n"
            + "\n"
            + "        // Thực hiện kết nối\n"
            + "        try (Connection conn = DriverManager.getConnection(url, user, password)) {\n"
            + "            System.out.println(\"Kết nối thành công!\");\n"
            + "        } catch (SQLException e) {\n"
            + "            System.out.println(\"Lỗi kết nối: \" + e.getMessage());\n"
            + "        }\n"
            + "    }\n"
            + "}",
            "jdbc:mysql://<địa chỉ máy chủ>:<cổng>/<tên database>?useSSL=false&serverTimezone=UTC",
            "Kết nối thành công!",});
        Code_MAP.put("Thực hiện CRUD", new String[]{
            "import java.sql.*;\n"
            + "\n"
            + "public class DatabaseManager {\n"
            + "    private static final String URL = \"jdbc:mysql://localhost:3306/testdb\";\n"
            + "    private static final String USER = \"root\";\n"
            + "    private static final String PASSWORD = \"password\";\n"
            + "\n"
            + "    public static Connection getConnection() throws SQLException {\n"
            + "        return DriverManager.getConnection(URL, USER, PASSWORD);\n"
            + "    }\n"
            + "}",
            "public static void insertUser(String name, int age) {\n"
            + "    String query = \"INSERT INTO users (name, age) VALUES (?, ?)\";\n"
            + "    try (Connection conn = DatabaseManager.getConnection();\n"
            + "         PreparedStatement pstmt = conn.prepareStatement(query)) {\n"
            + "        pstmt.setString(1, name);\n"
            + "        pstmt.setInt(2, age);\n"
            + "        pstmt.executeUpdate();\n"
            + "        System.out.println(\"Thêm thành công!\");\n"
            + "    } catch (SQLException e) {\n"
            + "        e.printStackTrace();\n"
            + "    }\n"
            + "}",
            "insertUser(\"Quân\", 20);",
            "public static void getUsers() {\n"
            + "    String query = \"SELECT * FROM users\";\n"
            + "    try (Connection conn = DatabaseManager.getConnection();\n"
            + "         Statement stmt = conn.createStatement();\n"
            + "         ResultSet rs = stmt.executeQuery(query)) {\n"
            + "        while (rs.next()) {\n"
            + "            System.out.println(rs.getString(\"name\") + \" - \" + rs.getInt(\"age\"));\n"
            + "        }\n"
            + "    } catch (SQLException e) {\n"
            + "        e.printStackTrace();\n"
            + "    }\n"
            + "}",
            "getUsers();",
            "public static void updateUserAge(String name, int newAge) {\n"
            + "    String query = \"UPDATE users SET age = ? WHERE name = ?\";\n"
            + "    try (Connection conn = DatabaseManager.getConnection();\n"
            + "         PreparedStatement pstmt = conn.prepareStatement(query)) {\n"
            + "        pstmt.setInt(1, newAge);\n"
            + "        pstmt.setString(2, name);\n"
            + "        pstmt.executeUpdate();\n"
            + "        System.out.println(\"Cập nhật thành công!\");\n"
            + "    } catch (SQLException e) {\n"
            + "        e.printStackTrace();\n"
            + "    }\n"
            + "}",
            "updateUserAge(\"Quân\", 25);",
            "public static void deleteUser(String name) {\n"
            + "    String query = \"DELETE FROM users WHERE name = ?\";\n"
            + "    try (Connection conn = DatabaseManager.getConnection();\n"
            + "         PreparedStatement pstmt = conn.prepareStatement(query)) {\n"
            + "        pstmt.setString(1, name);\n"
            + "        pstmt.executeUpdate();\n"
            + "        System.out.println(\"Xóa thành công!\");\n"
            + "    } catch (SQLException e) {\n"
            + "        e.printStackTrace();\n"
            + "    }\n"
            + "}",
            "deleteUser(\"Quân\");",});
        Code_MAP.put("Servlet là gì?", new String[]{
            "import java.io.IOException;\n"
            + "import java.io.PrintWriter;\n"
            + "import javax.servlet.ServletException;\n"
            + "import javax.servlet.annotation.WebServlet;\n"
            + "import javax.servlet.http.HttpServlet;\n"
            + "import javax.servlet.http.HttpServletRequest;\n"
            + "import javax.servlet.http.HttpServletResponse;\n"
            + "\n"
            + "@WebServlet(\"/hello\")\n"
            + "public class HelloServlet extends HttpServlet {\n"
            + "    protected void doGet(HttpServletRequest request, HttpServletResponse response) \n"
            + "            throws ServletException, IOException {\n"
            + "        response.setContentType(\"text/html\");\n"
            + "        PrintWriter out = response.getWriter();\n"
            + "        out.println(\"<h1>Xin chào từ Servlet!</h1>\");\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Tạo Servlet cơ bản", new String[]{
            "import java.io.IOException;\n"
            + "import javax.servlet.ServletException;\n"
            + "import javax.servlet.annotation.WebServlet;\n"
            + "import javax.servlet.http.HttpServlet;\n"
            + "import javax.servlet.http.HttpServletRequest;\n"
            + "import javax.servlet.http.HttpServletResponse;\n"
            + "\n"
            + "@WebServlet(\"/hello\")\n"
            + "public class HelloServlet extends HttpServlet {\n"
            + "    protected void doGet(HttpServletRequest request, HttpServletResponse response) \n"
            + "            throws ServletException, IOException {\n"
            + "        response.setContentType(\"text/html\");\n"
            + "        response.getWriter().println(\"<h1>Hello từ Servlet!</h1>\");\n"
            + "    }\n"
            + "}",
            "<servlet>\n"
            + "    <servlet-name>HelloServlet</servlet-name>\n"
            + "    <servlet-class>HelloServlet</servlet-class>\n"
            + "</servlet>\n"
            + "<servlet-mapping>\n"
            + "    <servlet-name>HelloServlet</servlet-name>\n"
            + "    <url-pattern>/hello</url-pattern>\n"
            + "</servlet-mapping>",
            "http://localhost:8080/app/hello",});
        Code_MAP.put("JSP là gì?", new String[]{
            "<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\" %>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <title>Trang JSP Đầu Tiên</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <h1>Chào <%= request.getParameter(\"name\") %></h1>\n"
            + "</body>\n"
            + "</html>",
            "http://localhost:8080/app/hello.jsp?name=Quân",
            "Chào Quân",});
        Code_MAP.put("Mô hình MVC trong Java", new String[]{
            "public class User {\n"
            + "    private String name;\n"
            + "    \n"
            + "    public User(String name) {\n"
            + "        this.name = name;\n"
            + "    }\n"
            + "\n"
            + "    public String getName() {\n"
            + "        return name;\n"
            + "    }\n"
            + "}",
            "import java.io.IOException;\n"
            + "import javax.servlet.ServletException;\n"
            + "import javax.servlet.annotation.WebServlet;\n"
            + "import javax.servlet.http.HttpServlet;\n"
            + "import javax.servlet.http.HttpServletRequest;\n"
            + "import javax.servlet.http.HttpServletResponse;\n"
            + "\n"
            + "@WebServlet(\"/user\")\n"
            + "public class UserServlet extends HttpServlet {\n"
            + "    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {\n"
            + "        // Tạo một user\n"
            + "        User user = new User(\"Quân\");\n"
            + "\n"
            + "        // Gửi dữ liệu đến View (JSP)\n"
            + "        request.setAttribute(\"user\", user);\n"
            + "        request.getRequestDispatcher(\"user.jsp\").forward(request, response);\n"
            + "    }\n"
            + "}",
            "<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\"%>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <title>Thông tin người dùng</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <h1>Chào, <%= ((User) request.getAttribute(\"user\")).getName() %>!</h1>\n"
            + "</body>\n"
            + "</html>",});
        Code_MAP.put("Lập trình hướng đối tượng là gì?", new String[]{
            "public class Car {\n"
            + "    private String brand;\n"
            + "    \n"
            + "    public Car(String brand) {\n"
            + "        this.brand = brand;\n"
            + "    }\n"
            + "\n"
            + "    public String getBrand() {\n"
            + "        return brand;\n"
            + "    }\n"
            + "}",
            "public class ElectricCar extends Car {\n"
            + "    private int batteryCapacity;\n"
            + "\n"
            + "    public ElectricCar(String brand, int batteryCapacity) {\n"
            + "        super(brand);\n"
            + "        this.batteryCapacity = batteryCapacity;\n"
            + "    }\n"
            + "}",
            "class Animal {\n"
            + "    void makeSound() {\n"
            + "        System.out.println(\"Animal makes a sound\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "class Dog extends Animal {\n"
            + "    @Override\n"
            + "    void makeSound() {\n"
            + "        System.out.println(\"Dog barks\");\n"
            + "    }\n"
            + "}",
            "abstract class Vehicle {\n"
            + "    abstract void move();\n"
            + "}\n"
            + "\n"
            + "class Car extends Vehicle {\n"
            + "    void move() {\n"
            + "        System.out.println(\"Car is moving\");\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Lớp và đối tượng", new String[]{
            "class Student {\n"
            + "    String name;\n"
            + "    int age;\n"
            + "\n"
            + "    void display() {\n"
            + "        System.out.println(\"Tên: \" + name + \", Tuổi: \" + age);\n"
            + "    }\n"
            + "}",
            "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        Student s1 = new Student();\n"
            + "        s1.name = \"Quân\";\n"
            + "        s1.age = 17;\n"
            + "        s1.display();\n"
            + "    }\n"
            + "}",
            "Tên: Quân, Tuổi: 17",});
        Code_MAP.put("Constructor", new String[]{
            "class Student {\n"
            + "    String name;\n"
            + "    int age;\n"
            + "\n"
            + "    // Constructor\n"
            + "    Student(String name, int age) {\n"
            + "        this.name = name;\n"
            + "        this.age = age;\n"
            + "    }\n"
            + "\n"
            + "    void display() {\n"
            + "        System.out.println(\"Tên: \" + name + \", Tuổi: \" + age);\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        // Tạo đối tượng và truyền giá trị khởi tạo\n"
            + "        Student s1 = new Student(\"Quân\", 17);\n"
            + "        s1.display();\n"
            + "    }\n"
            + "}",
            "Tên: Quân, Tuổi: 17",
            "class Student {\n"
            + "    String name;\n"
            + "    int age;\n"
            + "\n"
            + "    // Constructor mặc định\n"
            + "    Student() {\n"
            + "        name = \"Không xác định\";\n"
            + "        age = 0;\n"
            + "    }\n"
            + "\n"
            + "    void display() {\n"
            + "        System.out.println(\"Tên: \" + name + \", Tuổi: \" + age);\n"
            + "    }\n"
            + "}",
            "Student(String name, int age) {\n"
            + "    this.name = name;\n"
            + "    this.age = age;\n"
            + "}",});
        Code_MAP.put("Phương thức (Method)", new String[]{
            "class Calculator {\n"
            + "    // Phương thức cộng hai số\n"
            + "    int add(int a, int b) {\n"
            + "        return a + b;\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        // Tạo đối tượng\n"
            + "        Calculator calc = new Calculator();\n"
            + "        // Gọi phương thức và in kết quả\n"
            + "        System.out.println(\"Tổng: \" + calc.add(5, 3));\n"
            + "    }\n"
            + "}",
            "Tổng: 8",
            "int add(int a, int b) {\n"
            + "    return a + b;\n"
            + "}",
            "void sayHello() {\n"
            + "    System.out.println(\"Xin chào!\");\n"
            + "}",
            "void greet(String name) {\n"
            + "    System.out.println(\"Chào \" + name);\n"
            + "}",
            "void showMessage() {\n"
            + "    System.out.println(\"Đây là Java!\");\n"
            + "}",});
        Code_MAP.put("Đóng gói (Encapsulation)", new String[]{
            "class Person {\n"
            + "    // Thuộc tính private, không thể truy cập trực tiếp\n"
            + "    private String name;\n"
            + "\n"
            + "    // Phương thức setter để gán giá trị\n"
            + "    public void setName(String name) {\n"
            + "        this.name = name;\n"
            + "    }\n"
            + "\n"
            + "    // Phương thức getter để lấy giá trị\n"
            + "    public String getName() {\n"
            + "        return name;\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        Person p = new Person();\n"
            + "        p.setName(\"Quân\"); // Gán giá trị thông qua setter\n"
            + "        System.out.println(\"Tên: \" + p.getName()); // Lấy giá trị qua getter\n"
            + "    }\n"
            + "}",
            "Tên: Quân",});
        Code_MAP.put("Kế thừa (Inheritance)", new String[]{
            "// Lớp cha (Super Class)\n"
            + "class Animal {\n"
            + "    void eat() {\n"
            + "        System.out.println(\"Động vật đang ăn...\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "// Lớp con (Subclass) kế thừa từ Animal\n"
            + "class Dog extends Animal {\n"
            + "    void bark() {\n"
            + "        System.out.println(\"Gâu gâu!\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "// Chương trình chính\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        Dog d = new Dog();\n"
            + "        d.eat(); // Kế thừa từ Animal\n"
            + "        d.bark(); // Phương thức riêng của Dog\n"
            + "    }\n"
            + "}",
            "Động vật đang ăn...\n"
            + "Gâu gâu!",});
        Code_MAP.put("Đa hình (Polymorphism)", new String[]{
            "class MathUtil {\n"
            + "    // Phương thức cộng 2 số nguyên\n"
            + "    int add(int a, int b) {\n"
            + "        return a + b;\n"
            + "    }\n"
            + "\n"
            + "    // Phương thức cộng 3 số nguyên\n"
            + "    int add(int a, int b, int c) {\n"
            + "        return a + b + c;\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        MathUtil math = new MathUtil();\n"
            + "        System.out.println(math.add(5, 3));      // Kết quả: 8\n"
            + "        System.out.println(math.add(5, 3, 2));  // Kết quả: 10\n"
            + "    }\n"
            + "}",
            "class Animal {\n"
            + "    void makeSound() {\n"
            + "        System.out.println(\"Âm thanh của động vật\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "class Dog extends Animal {\n"
            + "    @Override\n"
            + "    void makeSound() {\n"
            + "        System.out.println(\"Gâu gâu!\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        Animal myDog = new Dog();\n"
            + "        myDog.makeSound(); // Kết quả: Gâu gâu!\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Interface và Abstract Class", new String[]{
            "interface Animal {\n"
            + "    void makeSound(); // Phương thức trừu tượng (không có phần triển khai)\n"
            + "}\n"
            + "\n"
            + "class Dog implements Animal {\n"
            + "    public void makeSound() {\n"
            + "        System.out.println(\"Gâu gâu!\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        Animal myDog = new Dog();\n"
            + "        myDog.makeSound(); // Kết quả: Gâu gâu!\n"
            + "    }\n"
            + "}",
            "abstract class Animal {\n"
            + "    abstract void makeSound(); // Phương thức trừu tượng\n"
            + "\n"
            + "    void sleep() { // Phương thức có sẵn phần triển khai\n"
            + "        System.out.println(\"Đang ngủ...\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "class Dog extends Animal {\n"
            + "    void makeSound() {\n"
            + "        System.out.println(\"Gâu gâu!\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        Dog myDog = new Dog();\n"
            + "        myDog.makeSound(); // Kết quả: Gâu gâu!\n"
            + "        myDog.sleep();     // Kết quả: Đang ngủ...\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Xử lý ngoại lệ (Exception Handling)", new String[]{
            "try {\n"
            + "    int result = 10 / 0;\n"
            + "} catch (ArithmeticException e) {\n"
            + "    System.out.println(\"Lỗi: Không thể chia cho 0\");\n"
            + "}",
            "try {\n"
            + "    int[] arr = {1, 2, 3};\n"
            + "    System.out.println(arr[5]); \n"
            + "} catch (ArrayIndexOutOfBoundsException e) {\n"
            + "    System.out.println(\"Lỗi: Chỉ số mảng không hợp lệ\");\n"
            + "} finally {\n"
            + "    System.out.println(\"Khối finally luôn được thực thi\");\n"
            + "}",
            "void checkAge(int age) {\n"
            + "    if (age < 18) {\n"
            + "        throw new ArithmeticException(\"Tuổi phải >= 18\");\n"
            + "    }\n"
            + "}",
            "void readFile() throws IOException {\n"
            + "    FileReader file = new FileReader(\"data.txt\");\n"
            + "}",});
        Code_MAP.put("Đọc và ghi file trong Java", new String[]{
            "import java.io.*;\n"
            + "\n"
            + "public class WriteFileExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        try {\n"
            + "            FileWriter writer = new FileWriter(\"output.txt\");\n"
            + "            writer.write(\"Hello Java!\");\n"
            + "            writer.close();\n"
            + "            System.out.println(\"Ghi file thành công\");\n"
            + "        } catch (IOException e) {\n"
            + "            System.out.println(\"Lỗi khi ghi file: \" + e.getMessage());\n"
            + "        }\n"
            + "    }\n"
            + "}",
            "import java.io.*;\n"
            + "\n"
            + "public class ReadFileExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        try {\n"
            + "            FileReader reader = new FileReader(\"output.txt\");\n"
            + "            int ch;\n"
            + "            while ((ch = reader.read()) != -1) {\n"
            + "                System.out.print((char) ch);\n"
            + "            }\n"
            + "            reader.close();\n"
            + "        } catch (IOException e) {\n"
            + "            System.out.println(\"Lỗi khi đọc file: \" + e.getMessage());\n"
            + "        }\n"
            + "    }\n"
            + "}",
            "import java.io.*;\n"
            + "\n"
            + "public class BufferedReadExample {\n"
            + "    public static void main(String[] args) {\n"
            + "        try (BufferedReader reader = new BufferedReader(new FileReader(\"output.txt\"))) {\n"
            + "            String line;\n"
            + "            while ((line = reader.readLine()) != null) {\n"
            + "                System.out.println(line);\n"
            + "            }\n"
            + "        } catch (IOException e) {\n"
            + "            System.out.println(\"Lỗi khi đọc file: \" + e.getMessage());\n"
            + "        }\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Giới thiệu Collection Framework", new String[]{
            "List<String> list = new ArrayList<>();\n"
            + "list.add(\"Java\");\n"
            + "list.add(\"Python\");\n"
            + "System.out.println(list);",
            "Set<Integer> set = new HashSet<>();\n"
            + "set.add(10);\n"
            + "set.add(20);\n"
            + "set.add(10);\n"
            + "System.out.println(set); // Chỉ in 10 và 20",
            "Map<String, Integer> map = new HashMap<>();\n"
            + "map.put(\"Alice\", 25);\n"
            + "map.put(\"Bob\", 30);\n"
            + "System.out.println(map.get(\"Alice\")); // 25",});
        Code_MAP.put("ArrayList", new String[]{
            "import java.util.ArrayList;",
            "import java.util.ArrayList;\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        ArrayList<String> list = new ArrayList<>(); // Tạo ArrayList\n"
            + "        list.add(\"Java\");  // Thêm phần tử\n"
            + "        list.add(\"Python\");\n"
            + "        System.out.println(list); // In danh sách\n"
            + "    }\n"
            + "}",
            "[Java, Python]",
            "ArrayList<Integer> numbers = new ArrayList<>();\n"
            + "numbers.add(10);\n"
            + "numbers.add(20);\n"
            + "numbers.add(30);\n"
            + "System.out.println(numbers.get(1));  // Lấy phần tử thứ 2 (20)\n"
            + "numbers.set(1, 25);  // Cập nhật phần tử thứ 2 thành 25\n"
            + "numbers.remove(0);  // Xóa phần tử đầu tiên\n"
            + "System.out.println(numbers.size());  // In số phần tử còn lại",});
        Code_MAP.put("LinkedList", new String[]{
            "import java.util.LinkedList;",
            "import java.util.LinkedList;\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        LinkedList<Integer> list = new LinkedList<>(); // Tạo danh sách liên kết\n"
            + "        list.add(10);  // Thêm phần tử\n"
            + "        list.add(20);\n"
            + "        System.out.println(list); // In danh sách\n"
            + "    }\n"
            + "}",
            "[10, 20]",
            "LinkedList<String> names = new LinkedList<>();\n"
            + "names.add(\"Alice\");\n"
            + "names.addFirst(\"Bob\");  // Thêm Bob vào đầu danh sách\n"
            + "names.addLast(\"Charlie\"); // Thêm Charlie vào cuối danh sách\n"
            + "names.removeFirst(); // Xóa phần tử đầu tiên (Bob)\n"
            + "System.out.println(names.getLast()); // In phần tử cuối cùng (Charlie)",});
        Code_MAP.put("HashMap", new String[]{
            "import java.util.HashMap;",
            "import java.util.HashMap;\n"
            + "public class Main {\n"
            + "    public static void main(String[] args) {\n"
            + "        HashMap<String, Integer> map = new HashMap<>(); // Tạo HashMap\n"
            + "        map.put(\"Quân\", 17);  // Thêm cặp key-value\n"
            + "        map.put(\"Lan\", 20);\n"
            + "        System.out.println(map); // In HashMap\n"
            + "    }\n"
            + "}",
            "{Quân=17, Lan=20}",
            "HashMap<String, Integer> studentAges = new HashMap<>();\n"
            + "studentAges.put(\"An\", 18);\n"
            + "studentAges.put(\"Bình\", 19);\n"
            + "System.out.println(\"Tuổi của An: \" + studentAges.get(\"An\")); // Lấy giá trị theo key\n"
            + "studentAges.remove(\"Bình\"); // Xóa key \"Bình\"\n"
            + "System.out.println(\"Danh sách key: \" + studentAges.keySet()); // Lấy tất cả key\n"
            + "System.out.println(\"Danh sách value: \" + studentAges.values()); // Lấy tất cả value",});
        Code_MAP.put("Giới thiệu JavaFX", new String[]{
            "import javafx.application.Application;\n"
            + "import javafx.scene.Scene;\n"
            + "import javafx.scene.control.Button;\n"
            + "import javafx.scene.layout.StackPane;\n"
            + "import javafx.stage.Stage;\n"
            + "\n"
            + "public class HelloJavaFX extends Application {\n"
            + "    @Override\n"
            + "    public void start(Stage primaryStage) {\n"
            + "        Button btn = new Button(\"Nhấn tôi\");\n"
            + "        btn.setOnAction(e -> System.out.println(\"Chào mừng đến với JavaFX!\"));\n"
            + "\n"
            + "        StackPane root = new StackPane();\n"
            + "        root.getChildren().add(btn);\n"
            + "\n"
            + "        Scene scene = new Scene(root, 300, 200);\n"
            + "        primaryStage.setTitle(\"JavaFX Demo\");\n"
            + "        primaryStage.setScene(scene);\n"
            + "        primaryStage.show();\n"
            + "    }\n"
            + "\n"
            + "    public static void main(String[] args) {\n"
            + "        launch(args);\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Cấu trúc ứng dụng JavaFX", new String[]{
            "import javafx.application.Application;\n"
            + "import javafx.scene.Scene;\n"
            + "import javafx.scene.control.Button;\n"
            + "import javafx.scene.layout.StackPane;\n"
            + "import javafx.stage.Stage;\n"
            + "\n"
            + "public class JavaFXExample extends Application {\n"
            + "    @Override\n"
            + "    public void start(Stage primaryStage) {\n"
            + "        // Tạo nút bấm\n"
            + "        Button btn = new Button(\"Nhấn tôi\");\n"
            + "        btn.setOnAction(e -> System.out.println(\"Chào mừng đến với JavaFX!\"));\n"
            + "\n"
            + "        // Tạo bố cục giao diện\n"
            + "        StackPane root = new StackPane();\n"
            + "        root.getChildren().add(btn);\n"
            + "\n"
            + "        // Thiết lập Scene\n"
            + "        Scene scene = new Scene(root, 300, 250);\n"
            + "        primaryStage.setTitle(\"Ứng dụng JavaFX\");\n"
            + "        primaryStage.setScene(scene);\n"
            + "        primaryStage.show();\n"
            + "    }\n"
            + "\n"
            + "    public static void main(String[] args) {\n"
            + "        launch(args);\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Giới thiệu Spring Boot", new String[]{
            "import org.springframework.web.bind.annotation.GetMapping;\n"
            + "import org.springframework.web.bind.annotation.RequestMapping;\n"
            + "import org.springframework.web.bind.annotation.RestController;\n"
            + "\n"
            + "@RestController\n"
            + "@RequestMapping(\"/api\")\n"
            + "public class HelloController {\n"
            + "    @GetMapping(\"/hello\")\n"
            + "    public String sayHello() {\n"
            + "        return \"Xin chào từ Spring Boot!\";\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Tạo REST API với Spring Boot", new String[]{
            "import org.springframework.web.bind.annotation.*;\n"
            + "\n"
            + "@RestController\n"
            + "@RequestMapping(\"/api\")\n"
            + "public class HelloController {\n"
            + "\n"
            + "    @GetMapping(\"/hello\")\n"
            + "    public String sayHello() {\n"
            + "        return \"Xin chào từ Spring Boot!\";\n"
            + "    }\n"
            + "}",
            "public class User {\n"
            + "    private int id;\n"
            + "    private String name;\n"
            + "\n"
            + "    public User(int id, String name) {\n"
            + "        this.id = id;\n"
            + "        this.name = name;\n"
            + "    }\n"
            + "\n"
            + "    public int getId() { return id; }\n"
            + "    public String getName() { return name; }\n"
            + "}",
            "import org.springframework.web.bind.annotation.*;\n"
            + "import java.util.*;\n"
            + "\n"
            + "@RestController\n"
            + "@RequestMapping(\"/api/users\")\n"
            + "public class UserController {\n"
            + "    private List<User> users = new ArrayList<>();\n"
            + "\n"
            + "    @PostMapping(\"/add\")\n"
            + "    public String addUser(@RequestParam int id, @RequestParam String name) {\n"
            + "        users.add(new User(id, name));\n"
            + "        return \"Thêm người dùng thành công!\";\n"
            + "    }\n"
            + "\n"
            + "    @GetMapping(\"/list\")\n"
            + "    public List<User> getUsers() {\n"
            + "        return users;\n"
            + "    }\n"
            + "\n"
            + "    @DeleteMapping(\"/delete/{id}\")\n"
            + "    public String deleteUser(@PathVariable int id) {\n"
            + "        users.removeIf(user -> user.getId() == id);\n"
            + "        return \"Xóa người dùng thành công!\";\n"
            + "    }\n"
            + "}",
            "",});
        Code_MAP.put("Kết nối cơ sở dữ liệu MySQL với Spring Boot", new String[]{
            "spring.datasource.url=jdbc:mysql://localhost:3306/mydb\n"
            + "spring.datasource.username=root\n"
            + "spring.datasource.password=root\n"
            + "spring.jpa.hibernate.ddl-auto=update\n"
            + "spring.jpa.show-sql=true\n"
            + "spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect",
            "import javax.persistence.*;\n"
            + "\n"
            + "@Entity\n"
            + "public class User {\n"
            + "    @Id\n"
            + "    @GeneratedValue(strategy = GenerationType.IDENTITY)\n"
            + "    private Long id;\n"
            + "    private String name;\n"
            + "\n"
            + "    public Long getId() { return id; }\n"
            + "    public void setId(Long id) { this.id = id; }\n"
            + "\n"
            + "    public String getName() { return name; }\n"
            + "    public void setName(String name) { this.name = name; }\n"
            + "}",
            "import org.springframework.data.jpa.repository.JpaRepository;\n"
            + "\n"
            + "public interface UserRepository extends JpaRepository<User, Long> {}",
            "import org.springframework.web.bind.annotation.*;\n"
            + "import java.util.List;\n"
            + "\n"
            + "@RestController\n"
            + "@RequestMapping(\"/users\")\n"
            + "public class UserController {\n"
            + "    private final UserRepository userRepository;\n"
            + "\n"
            + "    public UserController(UserRepository userRepository) {\n"
            + "        this.userRepository = userRepository;\n"
            + "    }\n"
            + "\n"
            + "    @PostMapping(\"/add\")\n"
            + "    public User addUser(@RequestParam String name) {\n"
            + "        return userRepository.save(new User(null, name));\n"
            + "    }\n"
            + "\n"
            + "    @GetMapping(\"/list\")\n"
            + "    public List<User> getAllUsers() {\n"
            + "        return userRepository.findAll();\n"
            + "    }\n"
            + "}",});
        Code_MAP.put("Xây dựng Microservice với Spring Boot", new String[]{
            "<dependency>\n"
            + "    <groupId>org.springframework.cloud</groupId>\n"
            + "    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>\n"
            + "</dependency>",
            "import org.springframework.boot.SpringApplication;\n"
            + "import org.springframework.boot.autoconfigure.SpringBootApplication;\n"
            + "import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;\n"
            + "\n"
            + "@SpringBootApplication\n"
            + "@EnableEurekaServer\n"
            + "public class EurekaServerApplication {\n"
            + "    public static void main(String[] args) {\n"
            + "        SpringApplication.run(EurekaServerApplication.class, args);\n"
            + "    }\n"
            + "}",
            "server:\n"
            + "  port: 8761\n"
            + "\n"
            + "spring:\n"
            + "  application:\n"
            + "    name: eureka-server\n"
            + "\n"
            + "eureka:\n"
            + "  client:\n"
            + "    register-with-eureka: false\n"
            + "    fetch-registry: false",
            "<dependency>\n"
            + "    <groupId>org.springframework.cloud</groupId>\n"
            + "    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>\n"
            + "</dependency>",
            "server:\n"
            + "  port: 8081\n"
            + "\n"
            + "spring:\n"
            + "  application:\n"
            + "    name: user-service\n"
            + "\n"
            + "eureka:\n"
            + "  client:\n"
            + "    service-url:\n"
            + "      defaultZone: http://localhost:8761/eureka/",
            "import org.springframework.boot.SpringApplication;\n"
            + "import org.springframework.boot.autoconfigure.SpringBootApplication;\n"
            + "import org.springframework.cloud.client.discovery.EnableDiscoveryClient;\n"
            + "\n"
            + "@SpringBootApplication\n"
            + "@EnableDiscoveryClient\n"
            + "public class UserServiceApplication {\n"
            + "    public static void main(String[] args) {\n"
            + "        SpringApplication.run(UserServiceApplication.class, args);\n"
            + "    }\n"
            + "}",
            "<dependency>\n"
            + "    <groupId>org.springframework.cloud</groupId>\n"
            + "    <artifactId>spring-cloud-starter-gateway</artifactId>\n"
            + "</dependency>",
            "server:\n"
            + "  port: 8080\n"
            + "\n"
            + "spring:\n"
            + "  application:\n"
            + "    name: api-gateway\n"
            + "\n"
            + "eureka:\n"
            + "  client:\n"
            + "    service-url:\n"
            + "      defaultZone: http://localhost:8761/eureka/\n"
            + "\n"
            + "spring:\n"
            + "  cloud:\n"
            + "    gateway:\n"
            + "      routes:\n"
            + "        - id: user-service\n"
            + "          uri: lb://user-service\n"
            + "          predicates:\n"
            + "            - Path=/users/**",});
        Code_MAP.put("Bảo mật với Spring Security", new String[]{
            "<dependency>\n"
            + "    <groupId>org.springframework.boot</groupId>\n"
            + "    <artifactId>spring-boot-starter-security</artifactId>\n"
            + "</dependency>",
            "import org.springframework.context.annotation.Configuration;\n"
            + "import org.springframework.security.config.annotation.web.builders.HttpSecurity;\n"
            + "import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;\n"
            + "import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;\n"
            + "\n"
            + "@Configuration\n"
            + "@EnableWebSecurity\n"
            + "public class SecurityConfig extends WebSecurityConfigurerAdapter {\n"
            + "    @Override\n"
            + "    protected void configure(HttpSecurity http) throws Exception {\n"
            + "        http.authorizeRequests()\n"
            + "            .antMatchers(\"/public/**\").permitAll()  // Không yêu cầu đăng nhập\n"
            + "            .antMatchers(\"/admin/**\").hasRole(\"ADMIN\") // Chỉ ADMIN truy cập\n"
            + "            .anyRequest().authenticated() // Các URL khác yêu cầu đăng nhập\n"
            + "            .and()\n"
            + "            .httpBasic(); // Sử dụng Basic Authentication\n"
            + "    }\n"
            + "}",
            "import org.springframework.context.annotation.Bean;\n"
            + "import org.springframework.context.annotation.Configuration;\n"
            + "import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;\n"
            + "import org.springframework.security.core.userdetails.User;\n"
            + "import org.springframework.security.core.userdetails.UserDetails;\n"
            + "import org.springframework.security.core.userdetails.UserDetailsService;\n"
            + "import org.springframework.security.provisioning.InMemoryUserDetailsManager;\n"
            + "\n"
            + "@Configuration\n"
            + "public class SecurityConfig {\n"
            + "    @Bean\n"
            + "    public UserDetailsService userDetailsService() {\n"
            + "        UserDetails user = User.withDefaultPasswordEncoder()\n"
            + "            .username(\"user\")\n"
            + "            .password(\"password\")\n"
            + "            .roles(\"USER\")\n"
            + "            .build();\n"
            + "\n"
            + "        UserDetails admin = User.withDefaultPasswordEncoder()\n"
            + "            .username(\"admin\")\n"
            + "            .password(\"admin123\")\n"
            + "            .roles(\"ADMIN\")\n"
            + "            .build();\n"
            + "\n"
            + "        return new InMemoryUserDetailsManager(user, admin);\n"
            + "    }\n"
            + "}",
            "<dependency>\n"
            + "    <groupId>io.jsonwebtoken</groupId>\n"
            + "    <artifactId>jjwt</artifactId>\n"
            + "    <version>0.11.5</version>\n"
            + "</dependency>",});
        Code_MAP.put("Xác thực bằng JWT", new String[]{
            "<dependency>\n"
            + "    <groupId>io.jsonwebtoken</groupId>\n"
            + "    <artifactId>jjwt</artifactId>\n"
            + "    <version>0.11.5</version>\n"
            + "</dependency>",
            "import io.jsonwebtoken.Jwts;\n"
            + "import io.jsonwebtoken.SignatureAlgorithm;\n"
            + "import java.util.Date;\n"
            + "\n"
            + "public class JwtUtil {\n"
            + "    private static final String SECRET_KEY = \"mySecretKey\"; // Thay đổi trong thực tế\n"
            + "\n"
            + "    public static String generateToken(String username) {\n"
            + "        return Jwts.builder()\n"
            + "                .setSubject(username)\n"
            + "                .setIssuedAt(new Date())\n"
            + "                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // Hết hạn sau 1 ngày\n"
            + "                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)\n"
            + "                .compact();\n"
            + "    }\n"
            + "}",
            "import org.springframework.web.bind.annotation.*;\n"
            + "import java.util.Map;\n"
            + "\n"
            + "@RestController\n"
            + "@RequestMapping(\"/auth\")\n"
            + "public class AuthController {\n"
            + "    @PostMapping(\"/login\")\n"
            + "    public String login(@RequestBody Map<String, String> credentials) {\n"
            + "        String username = credentials.get(\"username\");\n"
            + "        String password = credentials.get(\"password\");\n"
            + "\n"
            + "        if (\"admin\".equals(username) && \"admin123\".equals(password)) {\n"
            + "            return JwtUtil.generateToken(username); // Trả về JWT\n"
            + "        }\n"
            + "        return \"Sai thông tin đăng nhập!\";\n"
            + "    }\n"
            + "}",
            "{\n"
            + "  \"username\": \"admin\",\n"
            + "  \"password\": \"admin123\"\n"
            + "}",
            "\"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY5NzQ5NTIyMiwiZXhwIjoxNjk3NTgxNjIyfQ.wPz_dlj4MqNh3FP8...\"",
            "import io.jsonwebtoken.Claims;\n"
            + "import io.jsonwebtoken.Jwts;\n"
            + "import io.jsonwebtoken.SignatureException;\n"
            + "import org.springframework.web.filter.OncePerRequestFilter;\n"
            + "import javax.servlet.FilterChain;\n"
            + "import javax.servlet.ServletException;\n"
            + "import javax.servlet.http.HttpServletRequest;\n"
            + "import javax.servlet.http.HttpServletResponse;\n"
            + "import java.io.IOException;\n"
            + "\n"
            + "public class JwtFilter extends OncePerRequestFilter {\n"
            + "    private static final String SECRET_KEY = \"mySecretKey\";\n"
            + "\n"
            + "    @Override\n"
            + "    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)\n"
            + "            throws ServletException, IOException {\n"
            + "        String token = request.getHeader(\"Authorization\");\n"
            + "\n"
            + "        if (token != null && token.startsWith(\"Bearer \")) {\n"
            + "            try {\n"
            + "                token = token.substring(7);\n"
            + "                Claims claims = Jwts.parser()\n"
            + "                        .setSigningKey(SECRET_KEY)\n"
            + "                        .parseClaimsJws(token)\n"
            + "                        .getBody();\n"
            + "                request.setAttribute(\"username\", claims.getSubject()); // Lưu username vào request\n"
            + "            } catch (SignatureException e) {\n"
            + "                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, \"Token không hợp lệ\");\n"
            + "                return;\n"
            + "            }\n"
            + "        }\n"
            + "        chain.doFilter(request, response);\n"
            + "    }\n"
            + "}",
            "import org.springframework.context.annotation.Configuration;\n"
            + "import org.springframework.security.config.annotation.web.builders.HttpSecurity;\n"
            + "import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;\n"
            + "import org.springframework.security.config.http.SessionCreationPolicy;\n"
            + "import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;\n"
            + "import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;\n"
            + "\n"
            + "@Configuration\n"
            + "@EnableWebSecurity\n"
            + "public class SecurityConfig extends WebSecurityConfigurerAdapter {\n"
            + "    @Override\n"
            + "    protected void configure(HttpSecurity http) throws Exception {\n"
            + "        http.csrf().disable()\n"
            + "            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)\n"
            + "            .and()\n"
            + "            .authorizeRequests()\n"
            + "            .antMatchers(\"/auth/login\").permitAll()  // Không cần token khi login\n"
            + "            .anyRequest().authenticated() // Các API khác cần JWT\n"
            + "            .and()\n"
            + "            .addFilterBefore(new JwtFilter(), UsernamePasswordAuthenticationFilter.class);\n"
            + "    }\n"
            + "}",
            "Authorization: Bearer <JWT>",});
        Code_MAP.put("Kiểm thử với JUnit và Mockito", new String[]{
            "<dependency>\n"
            + "    <groupId>org.junit.jupiter</groupId>\n"
            + "    <artifactId>junit-jupiter-api</artifactId>\n"
            + "    <version>5.9.3</version>\n"
            + "    <scope>test</scope>\n"
            + "</dependency>\n"
            + "\n"
            + "<dependency>\n"
            + "    <groupId>org.mockito</groupId>\n"
            + "    <artifactId>mockito-core</artifactId>\n"
            + "    <version>4.11.0</version>\n"
            + "    <scope>test</scope>\n"
            + "</dependency>",
            "public class Calculator {\n"
            + "    public int add(int a, int b) {\n"
            + "        return a + b;\n"
            + "    }\n"
            + "}",
            "import org.junit.jupiter.api.Test;\n"
            + "import static org.junit.jupiter.api.Assertions.*;\n"
            + "\n"
            + "public class CalculatorTest {\n"
            + "    @Test\n"
            + "    void testAddition() {\n"
            + "        Calculator calc = new Calculator();\n"
            + "        assertEquals(5, calc.add(2, 3));  // Kiểm tra 2 + 3 có bằng 5 không?\n"
            + "    }\n"
            + "}",
            "import java.util.Optional;\n"
            + "\n"
            + "public class UserService {\n"
            + "    private final UserRepository userRepository;\n"
            + "\n"
            + "    public UserService(UserRepository userRepository) {\n"
            + "        this.userRepository = userRepository;\n"
            + "    }\n"
            + "\n"
            + "    public String getUserNameById(Long id) {\n"
            + "        return userRepository.findById(id).orElse(\"Không tìm thấy\");\n"
            + "    }\n"
            + "}\n"
            + "\n"
            + "interface UserRepository {\n"
            + "    Optional<String> findById(Long id);\n"
            + "}",
            "import org.junit.jupiter.api.Test;\n"
            + "import org.mockito.Mockito;\n"
            + "import static org.junit.jupiter.api.Assertions.*;\n"
            + "import static org.mockito.Mockito.*;\n"
            + "\n"
            + "import java.util.Optional;\n"
            + "\n"
            + "public class UserServiceTest {\n"
            + "    @Test\n"
            + "    void testGetUserNameById() {\n"
            + "        // Tạo mock UserRepository\n"
            + "        UserRepository mockRepo = mock(UserRepository.class);\n"
            + "\n"
            + "        // Giả lập khi gọi findById(1L) thì trả về \"Quân\"\n"
            + "        when(mockRepo.findById(1L)).thenReturn(Optional.of(\"Quân\"));\n"
            + "\n"
            + "        UserService userService = new UserService(mockRepo);\n"
            + "\n"
            + "        // Kiểm tra kết quả có đúng không?\n"
            + "        assertEquals(\"Quân\", userService.getUserNameById(1L));\n"
            + "        assertEquals(\"Không tìm thấy\", userService.getUserNameById(2L));\n"
            + "    }\n"
            + "}",});
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
