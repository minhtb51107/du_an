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
            "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java.",
            "Cấu trúc chương trình Java, cài đặt JDK, IDE.",
            "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.",
            "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi."
        });

        TITLE_MAP.put("Java Cơ Bản", new String[]{
            "Giới thiệu về Java, lịch sử phát triển, lý do chọn Java.",
            "Cấu trúc chương trình Java, cài đặt JDK, IDE.",
            "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.",
            "Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi."
        });

        TITLE_MAP.put("Java Nâng Cao", new String[]{
            "Lập trình đa luồng, xử lý sự kiện.",
            "Lập trình mạng (Socket, TCP/IP, UDP).",
            "JDBC: Kết nối cơ sở dữ liệu, CRUD.",
            "Lập trình Web: Servlet, JSP, MVC."
        });

        TITLE_MAP.put("Java Chuyên Nghiệp", new String[]{
            "Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức.",
            "Đóng gói, kế thừa, đa hình, interface, abstract class.",
            "Xử lý ngoại lệ, làm việc với tập tin.",
            "Collection Framework: ArrayList, LinkedList, HashMap,..."
        });

        TITLE_MAP.put("Java Ứng Dụng Thực Tế", new String[]{
            "JavaFX: Xây dựng giao diện đồ họa.",
            "Spring Boot: REST API, kết nối cơ sở dữ liệu.",
            "Microservices với Spring Cloud.",
            "Bảo mật (Spring Security, OAuth2, JWT).",
            "Hiệu năng & tối ưu hóa, kiểm thử với JUnit, Mockito."
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
        TITLE_MAP.put("Python Cơ Bản", new String[]{
            "Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.",
            "Cấu trúc chương trình Python, cài đặt môi trường và IDE.",
            "Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.",
            "Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary."
        });

        TITLE_MAP.put("Python Nâng Cao", new String[]{
            "Lập trình hướng đối tượng (OOP) trong Python.",
            "Xử lý tập tin: đọc/ghi file CSV, JSON, XML.",
            "Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.",
            "Lập trình đa luồng và bất đồng bộ (async, threading)."
        });

        TITLE_MAP.put("Python Chuyên Nghiệp", new String[]{
            "Làm việc với API: requests, BeautifulSoup, Selenium.",
            "Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.",
            "Xử lý dữ liệu lớn: pandas, numpy, matplotlib.",
            "Lập trình mạng: socket, giao thức TCP/IP, UDP."
        });

        TITLE_MAP.put("Python Ứng Dụng Thực Tế", new String[]{
            "Xây dựng ứng dụng Web với Flask/Django.",
            "Machine Learning với scikit-learn, TensorFlow, PyTorch.",
            "Tự động hóa với Selenium, bot Telegram/Discord.",
            "Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest."
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
        TITLE_MAP.put("HTML Cơ Bản", new String[]{
            "HTML là gì?",
            "CẤU TRÚC CƠ BẢN CỦA HTML",
            "Cách viết file HTML và hiển thị trên trình duyệt",
            "Tiêu đề (<h1> đến <h6>)",
            "Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)",
            "Định dạng văn bản (<b>, <i>, <u>, <strong>, <em>, <mark>, <small>)",
            "Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)",
            "Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)",
            "Tạo liên kết (<a>) và điều hướng trang web",
            "Nhúng iframe (<iframe>)",
            "Bảng (<table>, <tr>, <td>, <th>)",
            "Biểu mẫu (<form>, <input>, <textarea>, <select>)"
        });

        TITLE_MAP.put("HTML Nâng Cao", new String[]{
            "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)",
            "Ứng dụng Semantic HTML để tối ưu SEO",
            "Sử dụng <meta> để tối ưu công cụ tìm kiếm",
            "Open Graph, Twitter Card",
            "Favicon, Sitemap, robots.txt",
            "Local Storage & Session Storage",
            "Geolocation API (Xác định vị trí người dùng)",
            "Drag & Drop API"
        });

        TITLE_MAP.put("CSS Cơ Bản", new String[]{
            "Inline CSS, Internal CSS, External CSS",
            "Cú pháp CSS cơ bản",
            "Selectors cơ bản: class, id, tag, attribute",
            "Đơn vị đo lường: px, %, em, rem, vw, vh",
            "Margin, Border, Padding, Content",
            "Các thuộc tính width, height, max-width, min-height",
            "Positioning (static, relative, absolute, fixed, sticky)",
            "Màu HEX, RGB, HSL",
            "Font-family, font-size, font-weight",
            "Line-height, letter-spacing",
            "display: block, inline, inline-block, flex, grid",
            "Viewport meta tag"
        });

        TITLE_MAP.put("CSS Nâng Cao", new String[]{
            "display: flex",
            "Căn chỉnh bằng justify-content, align-items, align-self",
            "flex-wrap, flex-direction",
            "display: grid",
            "grid-template-columns, grid-template-rows, gap, align-items, justify-content",
            "Media Queries (@media)",
            "Mobile-first vs. Desktop-first",
            "CSS Container Queries",
            "transition, animation, keyframes",
            "Hover effect nâng cao",
            ":nth-child(), :not(), :focus-within",
            "Pseudo-elements (::before, ::after)"
        });

        TITLE_MAP.put("CSS Chuyên Nghiệp", new String[]{
            "BEM (Block Element Modifier)",
            "OOCSS (Object-Oriented CSS)",
            "SMACSS (Scalable and Modular Architecture for CSS)",
            "Biến trong CSS (--main-color)",
            "Nested Rules, Mixins, Functions",
            "Tối ưu hóa mã CSS với SCSS",
            "Minify CSS",
            "Load font tối ưu",
            "Critical CSS & Lazy Loading",
            "Bootstrap",
            "Tailwind CSS",
            "ARIA Roles",
            "Keyboard Navigation",
            "Dark Mode hỗ trợ người dùng khiếm thị",
            "Tạo hình ảnh, animations phức tạp bằng CSS",
            "CSS Art & Pure CSS Illustrations"
        });

        TITLE_MAP.put("Ứng Dụng & Dự Án Thực Tế", new String[]{
            "Blog cá nhân",
            "Landing Page sản phẩm",
            "Web bán hàng cơ bản",
            "Hiệu ứng scroll, parallax",
            "Dark Mode",
            "Animation nâng cao",
            "Tạo manifest.json",
            "Service Worker & Caching",
            "Offline Mode & Push Notifications"
        });

        TITLE_MAP.put("JAVASCRIPT", new String[]{
            "Giới thiệu JavaScript",
            "Biến và Kiểu dữ liệu",
            "Toán tử và Cấu trúc điều kiện"
        });

        TITLE_MAP.put("JavaScript Cơ Bản", new String[]{
            "Giới thiệu JavaScript",
            "Cách nhúng JavaScript vào HTML",
            "Biến và Kiểu dữ liệu",
            "Toán tử và Cấu trúc điều kiện",
            "Vòng lặp và Mảng",
            "Hàm và Phạm vi biến",
            "Thực hành: Xây dựng trò chơi nhỏ"
        });

        TITLE_MAP.put("JavaScript Nâng Cao", new String[]{
            "Vòng lặp và Hàm",
            "Lập trình hướng đối tượng (OOP)",
            "Closure và Hoisting",
            "ES6+ và Các tính năng mới",
            "Xử lý lỗi và Debugging",
            "Thực hành: Xây dựng ứng dụng To-Do List"
        });

        TITLE_MAP.put("JavaScript Chuyên Nghiệp", new String[]{
            "Lập trình bất đồng bộ (Asynchronous)",
            "Làm việc với API",
            "DOM và Xử lý sự kiện",
            "LocalStorage và SessionStorage",
            "Web Workers và Hiệu suất JavaScript",
            "Thực hành: Xây dựng ứng dụng thời tiết"
        });

        TITLE_MAP.put("Ứng Dụng Thực Tế", new String[]{
            "JavaScript trong dự án Web",
            "Framework JavaScript (React, Vue, Node.js)",
            "Webpack và tối ưu hiệu suất",
            "Viết Unit Test với Jest",
            "Thực hành: Xây dựng ứng dụng Chat thời gian thực"
        });
        TITLE_MAP.put("C cơ bản", new String[]{
            "Giới thiệu về ngôn ngữ C",
            "Lịch sử và sự phát triển của ngôn ngữ C",
            "Đặc điểm và ứng dụng của C",
            "Cấu trúc cơ bản của một chương trình C",
            "Quá trình biên dịch và thực thi chương trình C",
            "Các câu lệnh điều kiện (if, if-else, switch-case)",
            "Các vòng lặp (for, while, do-while)\n"
        });

        TITLE_MAP.put("C trung bình", new String[]{
            "Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử",
            "Mảng hai chiều: Ứng dụng và thao tác",
            "Xử lý chuỗi trong C (thư viện string.h)",
            "Con trỏ: Khái niệm, khai báo, toán tử con trỏ",
            "Định nghĩa và sử dụng hàm",
            "Truyền tham số vào hàm",
            "Hàm đệ quy"
        });

        TITLE_MAP.put("C nâng cao", new String[]{
            "Cấu trúc dữ liệu & file I/O",
            "Kiểu dữ liệu struct và union",
            "Danh sách liên kết, ngăn xếp, hàng đợi",
            "Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf"
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
            "Giới thiệu về Java: Lịch sử, đặc điểm, và lý do chọn Java.",
            "Cấu trúc chương trình Java: Cài đặt JDK, IDE, cách biên dịch và chạy chương trình.",
            "Biến, kiểu dữ liệu, toán tử: Khai báo, sử dụng biến, hằng, toán tử số học và logic.",
            "Cấu trúc điều kiện, vòng lặp: If-else, switch-case, for, while, do-while.",
            "Mảng và xử lý chuỗi: Mảng một chiều, hai chiều, String, StringBuilder, StringBuffer."
        });

        DESCRIPTION_MAP.put("Java Cơ Bản", new String[]{
            "Giới thiệu về Java: Lịch sử, đặc điểm, và lý do chọn Java.",
            "Cấu trúc chương trình Java: Cài đặt JDK, IDE, cách biên dịch và chạy chương trình.",
            "Biến, kiểu dữ liệu, toán tử: Khai báo, sử dụng biến, hằng, toán tử số học và logic.",
            "Cấu trúc điều kiện, vòng lặp: If-else, switch-case, for, while, do-while.",
            "Mảng và xử lý chuỗi: Mảng một chiều, hai chiều, String, StringBuilder, StringBuffer."
        });

        DESCRIPTION_MAP.put("Java Nâng Cao", new String[]{
            "Lập trình đa luồng: Thread, Runnable, đồng bộ hóa.",
            "Xử lý sự kiện: ActionListener, MouseListener, KeyListener.",
            "Lập trình mạng: Giao tiếp TCP/IP, UDP bằng Socket.",
            "JDBC: Kết nối cơ sở dữ liệu, thực hiện CRUD.",
            "Lập trình Web: Servlet, JSP, MVC, kết nối DB."
        });

        DESCRIPTION_MAP.put("Java Chuyên Nghiệp", new String[]{
            "Lập trình hướng đối tượng: Lớp, đối tượng, phương thức, constructor.",
            "Đóng gói, kế thừa, đa hình: Các tính chất OOP và phạm vi truy cập.",
            "Interface, abstract class: So sánh, cách triển khai trong Java.",
            "Xử lý ngoại lệ, tập tin: Try-catch-finally, đọc/ghi file, ném ngoại lệ.",
            "Collection Framework: ArrayList, LinkedList, HashSet, HashMap."
        });

        DESCRIPTION_MAP.put("Java Ứng Dụng Thực Tế", new String[]{
            "JavaFX: Tạo giao diện đồ họa với JavaFX.",
            "Spring Boot: REST API, Spring Data JPA.",
            "Microservices: Kiến trúc Microservices, Eureka, Zuul.",
            "Bảo mật: Spring Security, OAuth2, JWT.",
            "Hiệu năng & kiểm thử: Tối ưu Java, kiểm thử với JUnit, Mockito."
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
        DESCRIPTION_MAP.put("Python Cơ Bản", new String[]{
            "Giới thiệu về Python: Lịch sử, đặc điểm, và lý do chọn Python.",
            "Cấu trúc chương trình Python: Cài đặt Python, cách viết và chạy chương trình.",
            "Biến, kiểu dữ liệu, toán tử: Khai báo, sử dụng biến, kiểu dữ liệu phổ biến, toán tử số học và logic.",
            "Cấu trúc điều kiện, vòng lặp: If-else, for, while, break, continue.",
            "Danh sách, tuple, dictionary: Cách khai báo, truy xuất, vòng lặp trên danh sách."
        });

        DESCRIPTION_MAP.put("Python Nâng Cao", new String[]{
            "Lập trình hướng đối tượng (OOP): Lớp, đối tượng, kế thừa, đa hình.",
            "Xử lý tập tin: Đọc/ghi file CSV, JSON, XML.",
            "Xử lý ngoại lệ: Try-except-finally, ngoại lệ tùy chỉnh.",
            "Lập trình đa luồng và bất đồng bộ: Threading, multiprocessing, async/await."
        });

        DESCRIPTION_MAP.put("Python Chuyên Nghiệp", new String[]{
            "Làm việc với API: Gửi request, xử lý JSON/XML, BeautifulSoup, Selenium.",
            "Cơ sở dữ liệu: Kết nối SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.",
            "Xử lý dữ liệu lớn: pandas để thao tác dữ liệu, numpy cho tính toán khoa học, vẽ biểu đồ với matplotlib.",
            "Lập trình mạng: Xây dựng ứng dụng mạng với socket, giao tiếp TCP/IP, UDP."
        });

        DESCRIPTION_MAP.put("Python Ứng Dụng Thực Tế", new String[]{
            "Xây dựng ứng dụng Web: Flask, Django, REST API, ORM.",
            "Machine Learning: Giới thiệu ML, sử dụng scikit-learn, TensorFlow, PyTorch.",
            "Tự động hóa: Selenium để thao tác trình duyệt, bot Telegram/Discord bằng Python.",
            "Bảo mật & kiểm thử: Tối ưu hiệu năng, unittest, pytest, bảo mật API."
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
        DESCRIPTION_MAP.put("HTML Cơ Bản", new String[]{
            "HTML (HyperText Markup Language) là ngôn ngữ đánh dấu tiêu chuẩn để tạo và thiết kế các trang web. Nó sử dụng các thẻ (tags) để định nghĩa cấu trúc và nội dung của trang web, bao gồm văn bản, hình ảnh, liên kết, bảng biểu, và các yếu tố khác.",
            "<!DOCTYPE html>, <head>, <html>, <body>",
            "Tạo một file với đuôi .html, Mở file bằng trình soạn thảo văn bản, Viết mã HTML vào file, Lưu file và mở bằng trình duyệt",
            "Các thẻ tiêu đề từ <h1> đến <h6> dùng để định nghĩa các cấp độ tiêu đề, trong đó <h1> là lớn nhất và <h6> là nhỏ nhất.",
            "<p>: Định nghĩa một đoạn văn bản, <br>: Xuống dòng trong văn bản, <hr>: Tạo một đường ngang phân cách",
            "<b>: In đậm văn bản, <i>: In nghiêng văn bản, <u>: Gạch chân văn bản, <strong>: Nhấn mạnh văn bản (in đậm, có ý nghĩa ngữ nghĩa), <em>: Nhấn mạnh văn bản (in nghiêng, có ý nghĩa ngữ nghĩa),<mark>: Đánh dấu văn bản, <small>: Làm nhỏ văn bản",
            "<ol>: Danh sách có thứ tự (đánh số), <ul>: Danh sách không thứ tự (gạch đầu dòng), <dl>: Danh sách mô tả (kết hợp <dt> và <dd>)",
            "<img>: Chèn hình ảnh, <video>: Chèn video, <audio>: Chèn âm thanh",
            "Thẻ <a> dùng để tạo liên kết đến các trang web khác hoặc các phần trong cùng trang",
            "Thẻ <iframe> dùng để nhúng một trang web hoặc nội dung từ nguồn khác vào trang hiện tại",
            "<table>: Tạo bảng, <tr>: Tạo hàng, <td>: Tạo ô dữ liệu, <th>: Tạo ô tiêu đề",
            "<form>: Tạo biểu mẫu để thu thập dữ liệu, <input>: Tạo các trường nhập liệu (text, password, checkbox, radio, v.v.), <textarea>: Tạo vùng nhập văn bản nhiều dòng, <select>: Tạo danh sách thả xuống"
        });

        DESCRIPTION_MAP.put("HTML Nâng Cao", new String[]{
            "Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>) giúp cải thiện cấu trúc và ý nghĩa của trang web.",
            "Ứng dụng Semantic HTML để tối ưu SEO giúp công cụ tìm kiếm hiểu nội dung trang web dễ dàng hơn.",
            "Sử dụng <meta> để tối ưu công cụ tìm kiếm giúp kiểm soát cách trang web hiển thị trên Google.",
            "Open Graph, Twitter Card giúp tối ưu hiển thị khi chia sẻ nội dung lên mạng xã hội.",
            "Favicon, Sitemap, robots.txt giúp điều hướng bot tìm kiếm và cải thiện trải nghiệm người dùng.",
            "Local Storage & Session Storage giúp lưu trữ dữ liệu trên trình duyệt mà không cần máy chủ.",
            "Geolocation API giúp lấy vị trí của người dùng để cá nhân hóa trải nghiệm.",
            "Drag & Drop API cho phép kéo thả phần tử trực tiếp trong trình duyệt một cách dễ dàng.",});

        DESCRIPTION_MAP.put("CSS Cơ Bản", new String[]{
            "Inline CSS, Internal CSS, External CSS là ba cách để áp dụng CSS vào trang web.",
            "Cú pháp CSS cơ bản bao gồm selectors, thuộc tính và giá trị để định dạng nội dung.",
            "Selectors cơ bản giúp chọn phần tử HTML theo class, id, tag hoặc attribute.",
            "Đơn vị đo lường trong CSS như px, %, em, rem, vw, vh giúp kiểm soát kích thước linh hoạt.",
            "Margin, Border, Padding, Content là các phần tạo nên mô hình hộp (box model) trong CSS.",
            "Các thuộc tính width, height, max-width, min-height giúp kiểm soát kích thước phần tử.",
            "Positioning xác định cách phần tử được sắp xếp trên trang: static, relative, absolute, fixed, sticky.",
            "Màu sắc trong CSS có thể được định dạng bằng HEX, RGB hoặc HSL để tạo giao diện đẹp mắt.",
            "Font-family, font-size, font-weight giúp tùy chỉnh kiểu chữ và kích thước văn bản.",
            "Line-height, letter-spacing giúp điều chỉnh khoảng cách giữa các dòng và chữ cái.",
            "Thuộc tính display xác định cách phần tử hiển thị: block, inline, inline-block, flex, grid.",
            "Viewport meta tag giúp tối ưu trang web trên thiết bị di động và màn hình nhỏ.",});

        DESCRIPTION_MAP.put("CSS Nâng Cao", new String[]{
            "display: flex giúp tạo layout linh hoạt với các phần tử con sắp xếp theo hàng hoặc cột.",
            "Căn chỉnh bằng justify-content, align-items, align-self giúp bố cục dễ dàng và linh hoạt hơn.",
            "flex-wrap, flex-direction điều chỉnh hướng và cách các phần tử flex-box phân bố.",
            "display: grid tạo layout dạng lưới mạnh mẽ và dễ kiểm soát hơn so với flexbox.",
            "grid-template-columns, grid-template-rows, gap, align-items, justify-content giúp thiết lập lưới chi tiết.",
            "Media Queries (@media) giúp tạo thiết kế responsive phù hợp với từng kích thước màn hình.",
            "Mobile-first vs. Desktop-first là hai cách tiếp cận khi viết CSS responsive.",
            "CSS Container Queries giúp áp dụng kiểu dựa trên kích thước container thay vì viewport.",
            "transition, animation, keyframes giúp tạo hiệu ứng mượt mà và sinh động cho website.",
            "Hover effect nâng cao giúp cải thiện trải nghiệm tương tác với người dùng.",
            ":nth-child(), :not(), :focus-within giúp chọn phần tử theo điều kiện đặc biệt.",
            "Pseudo-elements (::before, ::after) giúp thêm nội dung ảo mà không cần HTML.",});

        DESCRIPTION_MAP.put("CSS Chuyên Nghiệp", new String[]{
            "BEM giúp tổ chức mã CSS rõ ràng, dễ bảo trì với quy tắc đặt tên có cấu trúc.",
            "OOCSS tách biệt cấu trúc và ngoại hình, giúp tái sử dụng mã CSS hiệu quả hơn.",
            "SMACSS cung cấp nguyên tắc tổ chức CSS theo mô-đun, giúp duy trì và mở rộng dễ dàng.",
            "Biến trong CSS (--main-color) giúp quản lý màu sắc, kích thước dễ dàng và linh hoạt hơn.",
            "Nested Rules, Mixins, Functions trong SCSS giúp viết CSS gọn gàng, tái sử dụng tốt hơn.",
            "Tối ưu hóa mã CSS với SCSS giúp giảm trùng lặp, viết code dễ hiểu và dễ bảo trì.",
            "Minify CSS giúp giảm dung lượng file, tăng tốc độ tải trang.",
            "Load font tối ưu giúp cải thiện hiệu suất và trải nghiệm người dùng.",
            "Critical CSS & Lazy Loading giúp hiển thị nội dung quan trọng trước, tăng tốc load trang.",
            "Bootstrap là framework CSS phổ biến giúp tạo giao diện responsive nhanh chóng.",
            "Tailwind CSS là utility-first framework giúp viết CSS nhanh hơn, linh hoạt hơn.",
            "ARIA Roles giúp cải thiện khả năng truy cập cho người dùng có nhu cầu đặc biệt.",
            "Keyboard Navigation giúp trang web hỗ trợ điều hướng bằng bàn phím tốt hơn.",
            "Dark Mode hỗ trợ người dùng khiếm thị bằng cách giảm ánh sáng chói, dễ đọc hơn.",
            "Tạo hình ảnh, animations phức tạp bằng CSS giúp website sinh động, thu hút hơn.",
            "CSS Art & Pure CSS Illustrations giúp tạo hình ảnh sáng tạo mà không cần dùng ảnh."
        });

        DESCRIPTION_MAP.put("Ứng Dụng & Dự Án Thực Tế", new String[]{
            "Xây dựng trang web cá nhân để chia sẻ kiến thức, kinh nghiệm hoặc portfolio.",
            "Thu hút khách hàng tiềm năng và chuyển đổi thành đơn hàng/đăng ký.",
            "Trang danh sách sản phẩm với bộ lọc (giá, danh mục), Giỏ hàng và thanh toán online (tích hợp VNPay, PayPal), Quản lý đơn hàng và thông báo trạng thái qua email Hệ thống đăng nhập/đăng ký tài khoản.",
            " Tăng trải nghiệm tương tác và tính thẩm mỹ khi cuộn trang.",
            "Sử dụng CSS Variables để định nghĩa chủ đề sáng/tối, Toggle class hoặc sử dụng prefers-color-scheme để tự động theo hệ thống.",
            "Chuyển động phức tạp với @keyframes và animation-timeline, Scroll-triggered animation: Kích hoạt hiệu ứng khi cuộn đến một section, SVG animation: Vẽ đường path hoặc hiệu ứng morphing.",
            "Biến website thành Progressive Web App (PWA) có thể cài đặt trên thiết bị.",
            "Giúp web hoạt động offline và tải nhanh hơn.",
            "Hiển thị trang Bạn đang offline khi mất kết nối, Lưu trữ dữ liệu tạm thời bằng IndexedDB."
        });
        DESCRIPTION_MAP.put("JAVASCRIPT", new String[]{
            "Tìm hiểu tổng quan về JavaScript, cách nhúng vào HTML và vai trò của nó trong lập trình web.",
            "Giải thích về biến, kiểu dữ liệu trong JavaScript và cách khai báo bằng var, let, const.",
            "Tìm hiểu về các toán tử, cấu trúc điều kiện (if-else, switch-case) giúp xử lý logic trong chương trình."
        });

        DESCRIPTION_MAP.put("JavaScript Cơ Bản", new String[]{
            "Tìm hiểu tổng quan về JavaScript, cách nhúng vào HTML và vai trò của nó trong lập trình web.",
            "Cách nhúng JavaScript vào HTML: sử dụng thẻ `<script>` và cách viết code nội tuyến hoặc file ngoài.",
            "Giải thích về biến, kiểu dữ liệu trong JavaScript và cách khai báo bằng var, let, const.",
            "Tìm hiểu về các toán tử, cấu trúc điều kiện (if-else, switch-case) giúp xử lý logic trong chương trình.",
            "Giới thiệu về vòng lặp (for, while, do-while) và cách sử dụng để tối ưu hóa chương trình.",
            "Tìm hiểu về hàm trong JavaScript, cách khai báo và gọi hàm, cũng như phạm vi biến (scope).",
            "Thực hành: Xây dựng trò chơi đoán số ngẫu nhiên sử dụng JavaScript."
        });

        DESCRIPTION_MAP.put("JavaScript Nâng Cao", new String[]{
            "Khám phá vòng lặp for, while, do-while và cách sử dụng chúng để tối ưu hóa chương trình.",
            "Hiểu về khái niệm hàm, cách tạo hàm trong JavaScript, và sử dụng hàm để tổ chức code.",
            "Lập trình hướng đối tượng (OOP) trong JavaScript: Class, Object, Constructor, Prototype và cách ứng dụng.",
            "Tìm hiểu Closure và Hoisting trong JavaScript, cách sử dụng để tối ưu hóa code.",
            "Giới thiệu các tính năng mới trong ES6+: Arrow function, Spread, Destructuring, Template literals, Modules.",
            "Xử lý lỗi và Debugging: Sử dụng try-catch, console.log và các công cụ trình duyệt để gỡ lỗi.",
            "Thực hành: Xây dựng ứng dụng To-Do List sử dụng JavaScript thuần."
        });

        DESCRIPTION_MAP.put("JavaScript Chuyên Nghiệp", new String[]{
            "Giới thiệu về lập trình bất đồng bộ trong JavaScript, cách sử dụng Callback, Promise và Async/Await.",
            "Làm việc với API: Gửi yêu cầu HTTP bằng Fetch, xử lý dữ liệu JSON từ server, và quản lý lỗi.",
            "Tìm hiểu về Document Object Model (DOM), cách thao tác với các phần tử HTML và xử lý sự kiện.",
            "LocalStorage và SessionStorage: Lưu trữ dữ liệu trên trình duyệt và cách sử dụng.",
            "Tối ưu hiệu suất JavaScript với Web Workers, cách xử lý tác vụ nền.",
            "Thực hành: Xây dựng ứng dụng thời tiết hiển thị thông tin theo vị trí người dùng."
        });

        DESCRIPTION_MAP.put("Ứng Dụng Thực Tế", new String[]{
            "Ứng dụng JavaScript trong dự án web: Xử lý form, tạo hiệu ứng động, tối ưu hiệu suất.",
            "Giới thiệu về các framework phổ biến như React, Vue.js và Node.js giúp xây dựng ứng dụng web hiện đại.",
            "Sử dụng Webpack để tối ưu hiệu suất JavaScript và cải thiện tốc độ tải trang.",
            "Viết Unit Test với Jest để đảm bảo chất lượng code và kiểm tra lỗi.",
            "Thực hành: Xây dựng ứng dụng Chat thời gian thực sử dụng WebSocket và JavaScript."
        });

        DESCRIPTION_MAP.put("C cơ bản", new String[]{
            "C là một ngôn ngữ lập trình bậc trung, mạnh mẽ, linh hoạt, và hiệu suất cao, thường được dùng trong hệ điều hành, lập trình nhúng, và ứng dụng hiệu năng cao.",
            "Ra đời năm 1972 bởi Dennis Ritchie tại Bell Labs, C đã trở thành nền tảng cho nhiều ngôn ngữ hiện đại và hệ điều hành như Unix/Linux.",
            "Ngôn ngữ C có cú pháp tối giản, truy cập bộ nhớ cấp thấp, tốc độ thực thi nhanh, được ứng dụng rộng rãi từ hệ thống đến ứng dụng.",
            "Một chương trình C cơ bản gồm: thư viện, hàm main(), khai báo biến, các câu lệnh xử lý và cấu trúc điều khiển.",
            "Quá trình biên dịch C gồm 4 giai đoạn: tiền xử lý, biên dịch, assembly và liên kết, tạo ra file thực thi từ mã nguồn.",
            "Các cấu trúc điều kiện if, if-else và switch-case giúp kiểm soát luồng chương trình dựa trên các điều kiện logic.",
            "Vòng lặp for, while và do-while cho phép thực hiện lặp lại các khối lệnh với điều kiện xác định, tối ưu hóa xử lý."
        });

        DESCRIPTION_MAP.put("C trung bình", new String[]{
            "Mảng một chiều là cấu trúc lưu trữ tuần tự các phần tử cùng kiểu, được truy cập qua chỉ số, giúp quản lý dữ liệu hiệu quả.",
            "Mảng hai chiều (ma trận) là công cụ mạnh để xử lý dữ liệu dạng bảng, ứng dụng trong đồ họa, xử lý ảnh và tính toán ma trận.",
            "Thư viện string.h cung cấp các hàm xử lý chuỗi cơ bản như sao chép, nối, so sánh và tìm kiếm trong chuỗi ký tự.",
            "Con trỏ là biến lưu địa chỉ bộ nhớ, cho phép truy cập trực tiếp vào dữ liệu và quản lý bộ nhớ động một cách linh hoạt.",
            "Hàm trong C giúp chia chương trình thành các module độc lập, tái sử dụng code và tổ chức chương trình khoa học hơn.",
            "Truyền tham số vào hàm có hai dạng: tham trị (truyền giá trị) và tham chiếu (truyền con trỏ), ảnh hưởng đến cách dữ liệu được xử lý.",
            "Hàm đệ quy là hàm gọi lại chính nó, thích hợp giải quyết các bài toán có tính chất lặp lại như giai thừa, Fibonacci."
        });

        DESCRIPTION_MAP.put("C nâng cao", new String[]{
            "Cấu trúc dữ liệu và file I/O là nền tảng để xây dựng ứng dụng phức tạp, cho phép lưu trữ và truy xuất dữ liệu lâu dài.",
            "Struct nhóm các biến khác kiểu thành một kiểu dữ liệu mới, trong khi union cho phép nhiều biến chia sẻ cùng vùng nhớ.",
            "Danh sách liên kết, ngăn xếp và hàng đợi là các cấu trúc dữ liệu động quan trọng, giúp quản lý dữ liệu linh hoạt hơn mảng.",
            "File I/O trong C bao gồm các thao tác mở/đóng file, đọc/ghi dữ liệu dạng text hoặc binary, quản lý con trỏ file."
        });

        DESCRIPTION_MAP.put("C chuyên nghiệp", new String[]{
            "Tối ưu mã nguồn C bao gồm các kỹ thuật giảm thời gian chạy, tối ưu bộ nhớ, sử dụng inline functions và macro hiệu quả.",
            "Lập trình hệ thống với C liên quan đến làm việc trực tiếp với hệ điều hành: quản lý tiến trình, bộ nhớ, file system và mạng.",
            "Dự án thực tế tổng hợp tất cả kiến thức đã học để xây dựng ứng dụng hoàn chỉnh, từ thiết kế đến triển khai và kiểm thử."
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
            ""
        });

        ICON_MAP.put("Java Cơ Bản", new String[]{
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Java Nâng Cao", new String[]{
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Java Chuyên Nghiệp", new String[]{
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Java Ứng Dụng Thực Tế", new String[]{
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
        ICON_MAP.put("Python Cơ Bản", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Python Nâng Cao", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Python Chuyên Nghiệp", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Python Ứng Dụng Thực Tế", new String[]{
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
        ICON_MAP.put("HTML Cơ Bản", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("HTML Nâng Cao", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("CSS Cơ Bản", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("CSS Nâng Cao", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("CSS Chuyên Nghiệp", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Ứng Dụng & Dự Án Thực Tế", new String[]{
            "",
            "",
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
            ""
        });
        ICON_MAP.put("JavaScript Cơ Bản", new String[]{
            "/com/img/1.png",
            "/com/img/2.png",
            "/com/img/3.png",
            "/com/img/4.png",
            "/com/img/5.png",
            "/com/img/6.png",
            "/com/img/7.png"
        });
        ICON_MAP.put("JavaScript Nâng Cao", new String[]{
            "/com/img/8.png",
            "/com/img/9.png",
            "/com/img/10.png",
            "/com/img/11.png",
            "/com/img/12.png",
            "/com/img/13.png",
            "/com/img/14.png"
        });
        ICON_MAP.put("JavaScript Chuyên Nghiệp", new String[]{
            "/com/img/15.png",
            "/com/img/16.png",
            "/com/img/17.png",
            "/com/img/18.png",
            "/com/img/19.png",
            "/com/img/20.png"
        });
        ICON_MAP.put("Ứng Dụng Thực Tế", new String[]{
            "/com/img/21.png",
            "/com/img/22.png",
            "/com/img/23.png",
            "/com/img/24.png",
            "/com/img/25.png"
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
        ICON_MAP.put("C cơ bản", new String[]{
            "/com/img/c.png",
            "/com/img/vitamin-c.png",
            "/com/img/c (1).png",
            "/com/img/c.png",
            "/com/img/c (2).png",
            "/com/img/what-if.png",
            "/com/img/loop.png"
        });
        ICON_MAP.put("C trung bình", new String[]{
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("C nâng cao", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("C chuyên nghiệp", new String[]{
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
            "/com/img/sql-server.png",
            "/com/img/database.png",
            "/com/img/kieudulieu&toantu.png",
            "/com/img/sql.png",
            "/com/img/rangbuoc.png"
        });

        ICON_MAP.put("SQL trung bình", new String[]{
            "/com/img/csdl.png",
            "/com/img/bang.png",
            "/com/img/join.png",
            "/com/img/group by.png",
            "/com/img/dulieu.png"

        });

        ICON_MAP.put("SQL nâng cao", new String[]{
            "/com/img/select.png",
            "/com/img/procedure.png",
            "/com/img/sql-injection.png",
            "/com/img/big-data.png"

        });

        ICON_MAP.put("SQL chuyên nghiệp", new String[]{
            "/com/img/planning.png",
            "/com/img/csdlquantri.png",
            "/com/img/ide.png"
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
