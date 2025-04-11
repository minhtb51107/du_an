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
public class BaiTapHTML_CSS {
    
    private static final Map<String, int[]> Index_MAP = new HashMap<>();

    static {
        //HTML Cơ Bản
        Index_MAP.put("Giới Thiệu HTML", new int[]{10});
        Index_MAP.put("Lịch Sử Phát Triển Của HTML", new int[]{10});
        Index_MAP.put("Cách HTML Hoạt Động", new int[]{10});
        Index_MAP.put("Các Phần Của Tài Liệu HTML", new int[]{10});
        Index_MAP.put("Mô Tả Chi Tiết Các Thẻ Quan Trọng", new int[]{10});
        Index_MAP.put("Tạo File HTML", new int[]{10});
        Index_MAP.put("Chạy File HTML Trên Trình Duyệt", new int[]{10});
        Index_MAP.put("Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools", new int[]{10});
        Index_MAP.put("Ý Nghĩa Của Các Mức Tiêu Đề", new int[]{10});
        Index_MAP.put("Lỗi Thường Gặp", new int[]{10});
        Index_MAP.put("Đoạn Văn (<p>)", new int[]{10});
        Index_MAP.put("Xuống Dòng (<br>)", new int[]{10});
        Index_MAP.put("Đường Ngang (<hr>)", new int[]{10});
        Index_MAP.put("Các Thẻ Định Dạng Phổ Biến", new int[]{10});
        Index_MAP.put("Ví Dụ Về Định Dạng Văn Bản", new int[]{10});
        Index_MAP.put("Danh sách là gì?", new int[]{10});
        Index_MAP.put("Danh Sách Có Thứ Tự (<ol>)", new int[]{10});
        Index_MAP.put("Danh Sách Không Thứ Tự (<ul>)", new int[]{10});
        Index_MAP.put("Danh Sách Mô Tả (<dl>)", new int[]{10});
        Index_MAP.put("Chèn Ảnh (<img>)", new int[]{10});
        Index_MAP.put("Chèn Video (<video>)", new int[]{10});
        Index_MAP.put("Chèn Âm Thanh (<audio>)", new int[]{10});
        Index_MAP.put("Cấu Trúc Cơ Bản Của Liên Kết", new int[]{10});
        Index_MAP.put("Liên Kết Tới Các Đoạn Văn Trong Cùng Một Trang", new int[]{10});
        Index_MAP.put("Các Thuộc Tính Thường Dùng Của Thẻ <a>", new int[]{10});
        Index_MAP.put("Liên Kết Hình Ảnh", new int[]{10});
        Index_MAP.put("Cấu Trúc Thẻ <iframe>", new int[]{10});
        Index_MAP.put("Tại Sao Sử Dụng Iframe?", new int[]{10});
        Index_MAP.put("Lưu Ý Khi Sử Dụng Iframe", new int[]{10});
        Index_MAP.put("Cấu Trúc Cơ Bản Của Bảng", new int[]{10});
        Index_MAP.put("Các Thuộc Tính Của Bảng", new int[]{10});
        Index_MAP.put("Bảng Nâng Cao", new int[]{10});
        Index_MAP.put("Cấu Trúc Cơ Bản Của Biểu Mẫu", new int[]{10});
        Index_MAP.put("Các Loại Trường Nhập", new int[]{10});
        Index_MAP.put("Các Thuộc Tính Khác Của Thẻ <form>", new int[]{10});
        //HTML Nâng Cao
        Index_MAP.put("HTML semantic là gì?", new int[]{10});
        Index_MAP.put("<header>", new int[]{10});
        Index_MAP.put("<footer>", new int[]{10});
        Index_MAP.put("<nav>", new int[]{10});
        Index_MAP.put("<article>", new int[]{10});
        Index_MAP.put("<section>", new int[]{10});
        Index_MAP.put("Semantic HTML là gì", new int[]{10});
        Index_MAP.put("Giúp công cụ tìm kiếm hiểu rõ cấu trúc và nội dung trang", new int[]{10});
        Index_MAP.put("Tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng", new int[]{10});
        Index_MAP.put("Hỗ trợ tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động", new int[]{10});
        Index_MAP.put("Các thẻ <meta> quan trọng trong HTML", new int[]{10});
        Index_MAP.put("Meta Title và Meta Description", new int[]{10});
        Index_MAP.put("Meta Robots và Meta Viewport", new int[]{10});
        Index_MAP.put("Meta Charset", new int[]{10});
        Index_MAP.put("Giới thiệu Open Graph và Twitter Card", new int[]{10});
        Index_MAP.put("Open Graph", new int[]{10});
        Index_MAP.put("Twitter Card", new int[]{10});
        Index_MAP.put("Favicon", new int[]{10});
        Index_MAP.put("Sitemap", new int[]{10});
        Index_MAP.put("robots.txt", new int[]{10});
        Index_MAP.put("Local Storage", new int[]{10});
        Index_MAP.put("Session Storage", new int[]{10});
        Index_MAP.put("Geolocation API là", new int[]{10});
        Index_MAP.put("Tính năng của Geolocation API", new int[]{10});
        Index_MAP.put("Lợi ích SEO gián tiếp", new int[]{10});
        Index_MAP.put("Drag & Drop API là gì", new int[]{10});
        Index_MAP.put("Tính năng của Drag & Drop API", new int[]{10});
        Index_MAP.put("Lợi ích đối với SEO", new int[]{10});
        //CSS Cơ Bản
        Index_MAP.put("Inline CSS", new int[]{10});
        Index_MAP.put("Internal CSS", new int[]{10});
        Index_MAP.put("External CSS", new int[]{10});
        Index_MAP.put("CSS sử dụng cú pháp gì?", new int[]{10});
        Index_MAP.put("Cấu trúc cơ bản của một quy tắc CSS", new int[]{10});
        Index_MAP.put("Các kiểu Selector trong CSS", new int[]{10});
        Index_MAP.put("Tag Selector", new int[]{10});
        Index_MAP.put("Class Selector", new int[]{10});
        Index_MAP.put("ID Selector", new int[]{10});
        Index_MAP.put("Attribute Selector", new int[]{10});
        Index_MAP.put("Đơn vị tuyệt đối", new int[]{10});
        Index_MAP.put("Đơn vị tương đối", new int[]{10});
        Index_MAP.put("Cấu trúc Box Model", new int[]{10});
        Index_MAP.put("Width và Height", new int[]{10});
        Index_MAP.put("max-width và min-width", new int[]{10});
        Index_MAP.put("Các loại position chính", new int[]{10});
        Index_MAP.put("Sự khác biệt giữa các kiểu positioning", new int[]{10});
        Index_MAP.put("Ứng dụng thực tế của từng loại", new int[]{10});
        Index_MAP.put("Hệ màu HEX", new int[]{10});
        Index_MAP.put("Hệ màu RGB", new int[]{10});
        Index_MAP.put("Hệ màu HSL", new int[]{10});
        Index_MAP.put("Font-family", new int[]{10});
        Index_MAP.put("Font-size", new int[]{10});
        Index_MAP.put("Font-weight", new int[]{10});
        Index_MAP.put("Line-height", new int[]{10});
        Index_MAP.put("Letter-spacing", new int[]{10});
        Index_MAP.put("Ứng dụng thực tế", new int[]{10});
        Index_MAP.put("Display: block", new int[]{10});
        Index_MAP.put("Display: inline", new int[]{10});
        Index_MAP.put("Display: inline-block", new int[]{10});
        Index_MAP.put("Display: flex", new int[]{10});
        Index_MAP.put("Display: grid", new int[]{10});
        Index_MAP.put("Viewport là gì", new int[]{10});
        Index_MAP.put("Cú pháp chuẩn của thẻ Viewport", new int[]{10});
        Index_MAP.put("Các thuộc tính quan trọng", new int[]{10});
        Index_MAP.put("Vai trò của Viewport meta tag", new int[]{10});
        //CSS Nâng Cao
        Index_MAP.put("display: flex là gì?", new int[]{10});
        Index_MAP.put("Các thuộc tính chính của Flexbox", new int[]{10});
        Index_MAP.put("justify-content", new int[]{10});
        Index_MAP.put("align-items", new int[]{10});
        Index_MAP.put("align-self", new int[]{10});
        Index_MAP.put("flex-wrap", new int[]{10});
        Index_MAP.put("flex-direction", new int[]{10});
        Index_MAP.put("display: grid là gì?", new int[]{10});
        Index_MAP.put("Các thuộc tính chính của CSS Grid", new int[]{10});
        Index_MAP.put("Khái Niệm về CSS Grid Layout", new int[]{10});
        Index_MAP.put("Các Thuộc Tính Chính trong CSS Grid", new int[]{10});
        Index_MAP.put("Chi Tiết về Các Thuộc Tính", new int[]{10});
        Index_MAP.put("Khái Niệm", new int[]{10});
        Index_MAP.put("Cách Sử Dụng Media Queries", new int[]{10});
        Index_MAP.put("Tại Sao Media Queries Quan Trọng?", new int[]{10});
        Index_MAP.put("Mobile-first", new int[]{10});
        Index_MAP.put("Desktop-first", new int[]{10});
        Index_MAP.put("So Sánh Mobile-first và Desktop-first", new int[]{10});
        Index_MAP.put("CSS Container Queries", new int[]{10});
        Index_MAP.put("Transition", new int[]{10});
        Index_MAP.put("Animation", new int[]{10});
        Index_MAP.put("Keyframes", new int[]{10});
        Index_MAP.put("Hover effect nâng cao", new int[]{10});
        Index_MAP.put(":nth-child(n) - Chọn Phần Tử Theo Thứ Tự", new int[]{10});
        Index_MAP.put(":not() - Loại Trừ Một Phần Tử", new int[]{10});
        Index_MAP.put(":focus-within - Chọn Phần Tử Khi Có Focus Bên Trong", new int[]{10});
        Index_MAP.put("Pseudo-elements (::before, ::after)", new int[]{10});
        //CSS Chuyên Nghiệp
        Index_MAP.put("BEM (Block Element Modifier)", new int[]{10});
        Index_MAP.put("OOCSS (Object-Oriented CSS)", new int[]{10});
        Index_MAP.put("SMACSS", new int[]{10});
        Index_MAP.put("Biến trong CSS (--main-color)", new int[]{10});
        Index_MAP.put("Nested Rules", new int[]{10});
        Index_MAP.put("Mixins – Định nghĩa một nhóm CSS tái sử dụng", new int[]{10});
        Index_MAP.put("Functions – Xử lý logic trong SCSS", new int[]{10});
        Index_MAP.put("Tối ưu hóa mã CSS với SCSS", new int[]{10});
        Index_MAP.put("Minify CSS", new int[]{10});
        Index_MAP.put("Load Font Tối ưu", new int[]{10});
        Index_MAP.put("Critical CSS – Tải trước những phần CSS quan trọng", new int[]{10});
        Index_MAP.put("Lazy Loading – Tải tài nguyên khi cần thiết", new int[]{10});
        Index_MAP.put("Bootstrap", new int[]{10});
        Index_MAP.put("Tailwind CSS", new int[]{10});
        Index_MAP.put("ARIA Roles", new int[]{10});
        Index_MAP.put("Keyboard Navigation", new int[]{10});
        Index_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new int[]{10});
        Index_MAP.put("Tạo hình ảnh bằng CSS", new int[]{10});
        Index_MAP.put("Tạo Animations (Hoạt ảnh) Phức Tạp", new int[]{10});
        Index_MAP.put("CSS Art", new int[]{10});
        Index_MAP.put("Pure CSS Illustrations", new int[]{10});
        //Ứng Dụng & Dự Án Thực Tế
        Index_MAP.put("Một Blog cá nhân là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng của blog cá nhân", new int[]{10});
        Index_MAP.put("Landing page sản phẩm là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng của landing page sản phẩm", new int[]{10});
        Index_MAP.put("Web bán hàng cơ bản là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng của web bán hàng cơ bản", new int[]{10});
        Index_MAP.put("Hiệu ứng scroll", new int[]{10});
        Index_MAP.put("Parallax", new int[]{10});
        Index_MAP.put("Ứng dụng trong thiết kế", new int[]{10});
        Index_MAP.put("Dark Mode (chế độ tối) là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng của Dark Mode", new int[]{10});
        Index_MAP.put("Cách thức triển khai Dark Mode", new int[]{10});
        Index_MAP.put("Animation nâng cao là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng của animation nâng cao", new int[]{10});
        Index_MAP.put("Lợi ích của animation nâng cao", new int[]{10});
        Index_MAP.put("Manifest.json là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng của manifest.json", new int[]{10});
        Index_MAP.put("Service Worker là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng về Service Worker", new int[]{10});
        Index_MAP.put("Caching trong Service Worker", new int[]{10});
        Index_MAP.put("Các lợi ích của Service Worker & Caching", new int[]{10});
        Index_MAP.put("Offline Mode (Chế độ ngoại tuyến) là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng của Offline Mode", new int[]{10});
        Index_MAP.put("Push Notifications (Thông báo đẩy) là gì?", new int[]{10});
        Index_MAP.put("Các yếu tố quan trọng của Push Notifications", new int[]{10});
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
//        TITLE_MAP.put("JavaScript là gì?", new String[]{
//            
//        });
        TITLE_MAP.put("Giới Thiệu HTML", new String[]{
            "HTML là viết tắt của cụm từ nào?\n"
            + "\n"
            + "A. Hyper Text Markup Language.\n"
            + "B. High Tech Machine Learning.\n"
            + "C. Home Tool Markup Language.\n"
            + "D. Hyperlink and Text Management Language.",
            "Mục đích chính của HTML là gì?\n"
            + "\n"
            + "A. Lập trình ứng dụng desktop.\n"
            + "B. Tạo cấu trúc cho trang web.\n"
            + "C. Xử lý dữ liệu trên máy chủ.\n"
            + "D. Thiết kế đồ họa 3D.",
            "Phiên bản HTML hiện tại là gì?\n"
            + "\n"
            + "A. HTML 3.\n"
            + "B. HTML 4.\n"
            + "C. HTML 5.\n"
            + "D. HTML 6.",
            "Thẻ HTML nào được sử dụng để tạo tiêu đề lớn nhất?\n"
            + "\n"
            + "A. <h1>.\n"
            + "B. <h2>.\n"
            + "C. <h3>.\n"
            + "D. <h4>.",
            "Thẻ HTML nào được sử dụng để tạo đoạn văn bản?\n"
            + "\n"
            + "A. <p>.\n"
            + "B. <div>.\n"
            + "C. <span>.\n"
            + "D. <br>.",
            "Thẻ HTML nào được sử dụng để chèn hình ảnh?\n"
            + "\n"
            + "A. <video>.\n"
            + "B. <audio>.\n"
            + "C. <img>.\n"
            + "D. <iframe>.",
            "Thuộc tính nào của thẻ <a> được sử dụng để chỉ định URL của liên kết?\n"
            + "\n"
            + "A. src.\n"
            + "B. href.\n"
            + "C. alt.\n"
            + "D. target.",
            "Thẻ HTML nào được sử dụng để tạo danh sách không có thứ tự?\n"
            + "\n"
            + "A. <ol>.\n"
            + "B. <ul>.\n"
            + "C. <dl>.\n"
            + "D. <li>.",
            "Thẻ HTML nào được sử dụng để tạo bảng?\n"
            + "\n"
            + "A. <form>.\n"
            + "B. <div>.\n"
            + "C. <table>.\n"
            + "D. <ul>.",
            "Thẻ HTML nào được sử dụng để tạo trường nhập văn bản trong biểu mẫu?\n"
            + "\n"
            + "A. <select>.\n"
            + "B. <textarea>.\n"
            + "C. <input type=\"text\">.\n"
            + "D. <button>."
        });

        TITLE_MAP.put("Lịch Sử Phát Triển Của HTML", new String[]{
            "HTML được phát triển bởi ai?\n"
            + "\n"
            + "A. Tim Berners-Lee.\n"
            + "B. Bill Gates.\n"
            + "C. Steve Jobs.\n"
            + "D. Mark Zuckerberg.",
            "Năm nào HTML được giới thiệu lần đầu tiên?\n"
            + "\n"
            + "A. 1985.\n"
            + "B. 1990.\n"
            + "C. 1995.\n"
            + "D. 2000.",
            "Phiên bản HTML đầu tiên được gọi là gì?\n"
            + "\n"
            + "A. HTML 1.0.\n"
            + "B. HTML 2.0.\n"
            + "C. HTML 3.0.\n"
            + "D. HTML Alpha.",
            "Tổ chức nào chịu trách nhiệm tiêu chuẩn hóa HTML?\n"
            + "\n"
            + "A. Microsoft.\n"
            + "B. Google.\n"
            + "C. W3C (World Wide Web Consortium).\n"
            + "D. Apple.",
            "HTML5 được giới thiệu vào năm nào?\n"
            + "\n"
            + "A. 2004.\n"
            + "B. 2008.\n"
            + "C. 2014.\n"
            + "D. 2018.",
            "HTML5 mang lại cải tiến chính nào?\n"
            + "\n"
            + "A. Hỗ trợ đa phương tiện tốt hơn.\n"
            + "B. Khả năng lập trình ứng dụng desktop.\n"
            + "C. Tốc độ xử lý dữ liệu nhanh hơn.\n"
            + "D. Thiết kế đồ họa 3D tiên tiến.",
            "HTML5 giới thiệu các thẻ mới nào?\n"
            + "\n"
            + "A. <video>, <audio>, <canvas>.\n"
            + "B. <table>, <form>, <input>.\n"
            + "C. <h1>, <p>, <a>.\n"
            + "D. <div>, <span>, <ul>.",
            "HTML4 chủ yếu tập trung vào điều gì?\n"
            + "\n"
            + "A. Đa phương tiện.\n"
            + "B. Cấu trúc và trình bày.\n"
            + "C. Lập trình server-side.\n"
            + "D. Thiết kế đồ họa.",
            "HTML được phát triển dựa trên ngôn ngữ nào?\n"
            + "\n"
            + "A. C++.\n"
            + "B. Java.\n"
            + "C. SGML (Standard Generalized Markup Language).\n"
            + "D. Python.",
            "Mục tiêu ban đầu của HTML là gì?\n"
            + "\n"
            + "A. Tạo ứng dụng web tương tác.\n"
            + "B. Chia sẻ tài liệu khoa học.\n"
            + "C. Phát triển game online.\n"
            + "D. Xây dựng mạng xã hội."
        });

        TITLE_MAP.put("Cách HTML Hoạt Động", new String[]{
            "HTML hoạt động dựa trên cơ chế nào?\n"
            + "\n"
            + "A. Biên dịch mã.\n"
            + "B. Thông dịch mã.\n"
            + "C. Chạy trên máy ảo.\n"
            + "D. Chạy trực tiếp trên phần cứng.",
            "Trình duyệt web đóng vai trò gì trong việc xử lý HTML?\n"
            + "\n"
            + "A. Biên dịch mã HTML.\n"
            + "B. Hiển thị nội dung HTML.\n"
            + "C. Lưu trữ dữ liệu HTML.\n"
            + "D. Chỉnh sửa mã HTML.",
            "HTML sử dụng thẻ (tag) để làm gì?\n"
            + "\n"
            + "A. Thực hiện tính toán.\n"
            + "B. Định dạng và cấu trúc nội dung.\n"
            + "C. Quản lý cơ sở dữ liệu.\n"
            + "D. Thiết kế giao diện đồ họa.",
            "Thuộc tính (attribute) trong thẻ HTML dùng để làm gì?\n"
            + "\n"
            + "A. Xác định kiểu dữ liệu.\n"
            + "B. Cung cấp thông tin bổ sung cho thẻ.\n"
            + "C. Thực hiện các phép toán logic.\n"
            + "D. Tạo hiệu ứng động.",
            "DOM (Document Object Model) là gì?\n"
            + "\n"
            + "A. Mô hình cơ sở dữ liệu.\n"
            + "B. Mô hình đối tượng tài liệu HTML.\n"
            + "C. Mô hình thiết kế giao diện.\n"
            + "D. Mô hình lập trình mạng.",
            "CSS (Cascading Style Sheets) được dùng để làm gì trong HTML?\n"
            + "\n"
            + "A. Xử lý dữ liệu trên máy chủ.\n"
            + "B. Định dạng giao diện trang web.\n"
            + "C. Lập trình logic ứng dụng.\n"
            + "D. Quản lý cơ sở dữ liệu.",
            "JavaScript được dùng để làm gì trong HTML?\n"
            + "\n"
            + "A. Định dạng cấu trúc trang web.\n"
            + "B. Tạo hiệu ứng động và tương tác.\n"
            + "C. Xử lý dữ liệu tĩnh.\n"
            + "D. Thiết kế đồ họa 3D.",
            "URL (Uniform Resource Locator) dùng để làm gì trong HTML?\n"
            + "\n"
            + "A. Lưu trữ dữ liệu cục bộ.\n"
            + "B. Xác định vị trí tài nguyên trên web.\n"
            + "C. Mã hóa dữ liệu truyền tải.\n"
            + "D. Thiết kế giao diện người dùng.",
            "HTML được lưu trữ dưới dạng file có đuôi mở rộng nào?\n"
            + "\n"
            + "A. .txt.\n"
            + "B. .html hoặc .htm.\n"
            + "C. .css.\n"
            + "D. .js.",
            "HTML có thể hoạt động trên nền tảng nào?\n"
            + "\n"
            + "A. Chỉ trên Windows.\n"
            + "B. Chỉ trên Linux.\n"
            + "C. Tất cả các nền tảng có trình duyệt web.\n"
            + "D. Chỉ trên thiết bị di động."
        });
        TITLE_MAP.put("Các Phần Của Tài Liệu HTML", new String[]{
            "Phần nào của tài liệu HTML chứa thông tin về trang web?\n"
            + "\n"
            + "A. <body>.\n"
            + "B. <head>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của tài liệu HTML chứa nội dung hiển thị trên trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <meta>.",
            "Thẻ nào là thẻ gốc của tài liệu HTML?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Thẻ nào được dùng để xác định tiêu đề của trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Thẻ nào được dùng để khai báo loại tài liệu HTML?\n"
            + "\n"
            + "A. <doctype html>.\n"
            + "B. <html>.\n"
            + "C. <head>.\n"
            + "D. <body>.",
            "Thẻ nào được dùng để nhúng CSS vào tài liệu HTML?\n"
            + "\n"
            + "A. <script>.\n"
            + "B. <link>.\n"
            + "C. <img>.\n"
            + "D. <iframe>.",
            "Thẻ nào được dùng để nhúng JavaScript vào tài liệu HTML?\n"
            + "\n"
            + "A. <link>.\n"
            + "B. <script>.\n"
            + "C. <img>.\n"
            + "D. <iframe>.",
            "Thẻ nào được dùng để xác định các thông tin meta của trang web?\n"
            + "\n"
            + "A. <title>.\n"
            + "B. <meta>.\n"
            + "C. <body>.\n"
            + "D. <html>.",
            "Thẻ nào được dùng để tạo cấu trúc phân cấp cho nội dung?\n"
            + "\n"
            + "A. <p>.\n"
            + "B. <div>.\n"
            + "C. <span>.\n"
            + "D. <a>.",
            "Thẻ nào được dùng để tạo liên kết đến các tài nguyên bên ngoài?\n"
            + "\n"
            + "A. <p>.\n"
            + "B. <div>.\n"
            + "C. <span>.\n"
            + "D. <a>."
        });

        TITLE_MAP.put("Mô Tả Chi Tiết Các Thẻ Quan Trọng", new String[]{
            "Thẻ <h1> đến <h6> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo đoạn văn bản.\n"
            + "B. Tạo tiêu đề.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <p> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đoạn văn bản.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <a> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo hình ảnh.\n"
            + "B. Tạo liên kết.\n"
            + "C. Tạo video.\n"
            + "D. Tạo âm thanh.",
            "Thẻ <img> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo liên kết.\n"
            + "B. Tạo hình ảnh.\n"
            + "C. Tạo video.\n"
            + "D. Tạo âm thanh.",
            "Thẻ <ul> và <ol> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo danh sách.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <li> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo mục trong danh sách.\n"
            + "B. Tạo bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <table> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <tr>, <th>, và <td> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo các phần tử trong bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <form> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo biểu mẫu.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <input>, <select>, và <textarea> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo các trường nhập liệu trong biểu mẫu.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề."
        });

        TITLE_MAP.put("Tạo File HTML", new String[]{
            "Đuôi mở rộng nào được dùng cho file HTML?\n"
            + "\n"
            + "A. .txt.\n"
            + "B. .html hoặc .htm.\n"
            + "C. .css.\n"
            + "D. .js.",
            "Bạn có thể dùng phần mềm nào để tạo file HTML?\n"
            + "\n"
            + "A. Notepad.\n"
            + "B. Visual Studio Code.\n"
            + "C. Sublime Text.\n"
            + "D. Tất cả các phương án trên.",
            "Cấu trúc cơ bản của một file HTML bao gồm những phần nào?\n"
            + "\n"
            + "A. <head> và <body>.\n"
            + "B. <html>, <head>, và <body>.\n"
            + "C. <html> và <body>.\n"
            + "D. Chỉ có <body>.",
            "Thẻ nào được dùng để khai báo loại tài liệu HTML5?\n"
            + "\n"
            + "A. <doctype html>.\n"
            + "B. <html>.\n"
            + "C. <head>.\n"
            + "D. <body>.",
            "Thẻ nào được dùng để xác định tiêu đề của trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của file HTML chứa các thông tin meta?\n"
            + "\n"
            + "A. <body>.\n"
            + "B. <head>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của file HTML chứa nội dung hiển thị trên trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <meta>.",
            "Làm thế nào để lưu file HTML?\n"
            + "\n"
            + "A. Lưu với đuôi .txt.\n"
            + "B. Lưu với đuôi .html hoặc .htm.\n"
            + "C. Lưu với đuôi .css.\n"
            + "D. Lưu với đuôi .js.",
            "Bạn có thể mở file HTML bằng phần mềm nào?\n"
            + "\n"
            + "A. Trình duyệt web.\n"
            + "B. Notepad.\n"
            + "C. Visual Studio Code.\n"
            + "D. Tất cả các phương án trên.",
            "Thẻ nào được dùng để tạo liên kết đến file CSS bên ngoài?\n"
            + "\n"
            + "A. <script>.\n"
            + "B. <link>.\n"
            + "C. <img>.\n"
            + "D. <iframe>."
        });

        TITLE_MAP.put("Chạy File HTML Trên Trình Duyệt", new String[]{
            "Bạn có thể chạy file HTML bằng cách nào?\n"
            + "\n"
            + "A. Nhấp đúp vào file HTML.\n"
            + "B. Kéo và thả file HTML vào trình duyệt.\n"
            + "C. Nhập đường dẫn file HTML vào thanh địa chỉ của trình duyệt.\n"
            + "D. Tất cả các phương án trên.",
            "Trình duyệt web nào có thể dùng để chạy file HTML?\n"
            + "\n"
            + "A. Google Chrome.\n"
            + "B. Mozilla Firefox.\n"
            + "C. Microsoft Edge.\n"
            + "D. Tất cả các phương án trên.",
            "Khi chạy file HTML, trình duyệt sẽ làm gì?\n"
            + "\n"
            + "A. Biên dịch mã HTML.\n"
            + "B. Hiển thị nội dung HTML.\n"
            + "C. Lưu trữ dữ liệu HTML.\n"
            + "D. Chỉnh sửa mã HTML.",
            "Làm thế nào để xem mã nguồn HTML của một trang web?\n"
            + "\n"
            + "A. Nhấp chuột phải vào trang web và chọn \"Xem mã nguồn trang\".\n"
            + "B. Nhấn phím F12.\n"
            + "C. Nhấn tổ hợp phím Ctrl + U.\n"
            + "D. Tất cả các phương án trên.",
            "Công cụ nào của trình duyệt được dùng để kiểm tra và gỡ lỗi HTML?\n"
            + "\n"
            + "A. Console.\n"
            + "B. Elements.\n"
            + "C. Network.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tải lại trang web trong trình duyệt?\n"
            + "\n"
            + "A. Nhấp vào nút tải lại.\n"
            + "B. Nhấn phím F5.\n"
            + "C. Nhấn tổ hợp phím Ctrl + R.\n"
            + "D. Tất cả các phương án trên.",
            "Trình duyệt web nào hỗ trợ tốt nhất các tính năng HTML5?\n"
            + "\n"
            + "A. Internet Explorer.\n"
            + "B. Google Chrome.\n"
            + "C. Trình duyệt mặc định của hệ điều hành.\n"
            + "D. Tất cả các trình duyệt đều hỗ trợ như nhau.",
            "Làm thế nào để kiểm tra xem trình duyệt có hỗ trợ một tính năng HTML5 cụ thể hay không?\n"
            + "\n"
            + "A. Xem tài liệu của trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra tính năng trên web.\n"
            + "C. Dùng JavaScript để kiểm tra.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để mở file HTML trên thiết bị di động?\n"
            + "\n"
            + "A. Dùng trình duyệt web trên di động.\n"
            + "B. Dùng ứng dụng đọc file HTML.\n"
            + "C. Tải file HTML lên một máy chủ web và truy cập qua URL.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để xem file HTML trên nhiều trình duyệt khác nhau?\n"
            + "\n"
            + "A. Mở file HTML trên từng trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra tương thích trình duyệt.\n"
            + "C. Dùng máy ảo để chạy các trình duyệt khác nhau.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools", new String[]{
            "Developer Tools là gì?\n"
            + "\n"
            + "A. Công cụ để thiết kế đồ họa.\n"
            + "B. Công cụ để kiểm tra và gỡ lỗi web.\n"
            + "C. Công cụ để quản lý cơ sở dữ liệu.\n"
            + "D. Công cụ để lập trình server-side.",
            "Làm thế nào để mở Developer Tools?\n"
            + "\n"
            + "A. Nhấn phím F12.\n"
            + "B. Nhấp chuột phải vào trang web và chọn \"Kiểm tra\".\n"
            + "C. Nhấn tổ hợp phím Ctrl + Shift + I.\n"
            + "D. Tất cả các phương án trên.",
            "Tab nào trong Developer Tools dùng để kiểm tra mã HTML và CSS?\n"
            + "\n"
            + "A. Console.\n"
            + "B. Elements.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Tab nào trong Developer Tools dùng để xem các lỗi JavaScript?\n"
            + "\n"
            + "A. Elements.\n"
            + "B. Console.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Tab nào trong Developer Tools dùng để xem các yêu cầu mạng?\n"
            + "\n"
            + "A. Elements.\n"
            + "B. Console.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Bạn có thể làm gì với mã HTML trong tab Elements?\n"
            + "\n"
            + "A. Chỉnh sửa mã HTML trực tiếp.\n"
            + "B. Xem các thuộc tính CSS.\n"
            + "C. Thêm hoặc xóa các phần tử HTML.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với CSS trong tab Elements?\n"
            + "\n"
            + "A. Chỉnh sửa các giá trị CSS.\n"
            + "B. Xem các quy tắc CSS áp dụng cho một phần tử.\n"
            + "C. Thêm hoặc xóa các quy tắc CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với JavaScript trong tab Console?\n"
            + "\n"
            + "A. Xem các lỗi và cảnh báo JavaScript.\n"
            + "B. Chạy mã JavaScript trực tiếp.\n"
            + "C. Xem các giá trị biến JavaScript.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với các yêu cầu mạng trong tab Network?\n"
            + "\n"
            + "A. Xem các yêu cầu HTTP.\n"
            + "B. Xem thời gian tải các tài nguyên.\n"
            + "C. Xem các tiêu đề HTTP.\n"
            + "D. Tất cả các phương án trên.",
            "Developer Tools giúp ích gì trong việc phát triển web?\n"
            + "\n"
            + "A. Gỡ lỗi HTML, CSS và JavaScript.\n"
            + "B. Kiểm tra hiệu suất trang web.\n"
            + "C. Chỉnh sửa trang web trực tiếp.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Ý Nghĩa Của Các Mức Tiêu Đề", new String[]{
            "Thẻ <h1> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề phụ.\n"
            + "B. Tạo tiêu đề chính.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <h2> đến <h6> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề chính.\n"
            + "B. Tạo tiêu đề phụ.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <h1> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tiêu đề quan trọng nhất trên trang.\n"
            + "B. Tiêu đề ít quan trọng nhất trên trang.\n"
            + "C. Đoạn văn bản quan trọng nhất trên trang.\n"
            + "D. Đoạn văn bản ít quan trọng nhất trên trang.",
            "Thẻ <h6> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tiêu đề quan trọng nhất trên trang.\n"
            + "B. Tiêu đề ít quan trọng nhất trên trang.\n"
            + "C. Đoạn văn bản quan trọng nhất trên trang.\n"
            + "D. Đoạn văn bản ít quan trọng nhất trên trang.",
            "Tại sao cần sử dụng các mức tiêu đề khác nhau?\n"
            + "\n"
            + "A. Để tạo cấu trúc phân cấp cho nội dung.\n"
            + "B. Để tăng khả năng tiếp cận của trang web.\n"
            + "C. Để cải thiện SEO.\n"
            + "D. Tất cả các phương án trên.",
            "Mức tiêu đề nào nên được dùng cho tiêu đề chính của trang?\n"
            + "\n"
            + "A. <h1>.\n"
            + "B. <h2>.\n"
            + "C. <h3>.\n"
            + "D. <h4>.",
            "Mức tiêu đề nào nên được dùng cho các tiêu đề phụ?\n"
            + "\n"
            + "A. <h1>.\n"
            + "B. <h2> đến <h6>.\n"
            + "C. <p>.\n"
            + "D. <li>.",
            "Điều gì xảy ra nếu bạn không sử dụng các mức tiêu đề đúng cách?\n"
            + "\n"
            + "A. Trang web sẽ không hiển thị đúng cách.\n"
            + "B. Trang web sẽ khó tiếp cận hơn.\n"
            + "C. SEO của trang web sẽ bị ảnh hưởng.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể sử dụng bao nhiêu thẻ <h1> trên một trang?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Một.\n"
            + "C. Hai.\n"
            + "D. Ba.",
            "Bạn có thể sử dụng bao nhiêu thẻ <h2> đến <h6> trên một trang?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Một.\n"
            + "C. Hai.\n"
            + "D. Ba."
        });

        TITLE_MAP.put("Lỗi Thường Gặp", new String[]{
            "Lỗi nào xảy ra khi bạn quên đóng thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn viết sai tên thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai thuộc tính của thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai đường dẫn đến file hình ảnh hoặc CSS?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai cấu trúc HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Làm thế nào để kiểm tra lỗi HTML?\n"
            + "\n"
            + "A. Dùng Developer Tools của trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra lỗi HTML trên web.\n"
            + "C. Xem mã nguồn HTML.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để sửa lỗi HTML?\n"
            + "\n"
            + "A. Sửa mã HTML trực tiếp.\n"
            + "B. Dùng các công cụ sửa lỗi HTML trên web.\n"
            + "C. Tìm kiếm trên internet để tìm giải pháp.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <img>?\n"
            + "\n"
            + "A. Quên thuộc tính alt.\n"
            + "B. Dùng sai đường dẫn đến file hình ảnh.\n"
            + "C. Dùng sai định dạng file hình ảnh.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <a>?\n"
            + "\n"
            + "A. Dùng sai thuộc tính href.\n"
            + "B. Quên đóng thẻ <a>.\n"
            + "C. Dùng sai cấu trúc thẻ <a>.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <form>?\n"
            + "\n"
            + "A. Quên thuộc tính action.\n"
            + "B. Dùng sai thuộc tính method.\n"
            + "C. Dùng sai cấu trúc thẻ <form>.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Đoạn Văn (<p>)", new String[]{
            "Thẻ <p> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đoạn văn bản.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <p> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một đoạn văn bản mới.\n"
            + "B. Tạo một dòng mới.\n"
            + "C. Tạo một đường kẻ ngang.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <p> để tạo bao nhiêu đoạn văn bản?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <p>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một dòng mới trong đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng đoạn văn bản?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <p>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để căn chỉnh đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <p>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo một đoạn văn bản có thụt đầu dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính text-indent của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo một đoạn văn bản có khoảng cách dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính line-height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Xuống Dòng (<br>)", new String[]{
            "Thẻ <br> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo dòng mới.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <br> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một dòng mới trong đoạn văn bản.\n"
            + "B. Tạo một đoạn văn bản mới.\n"
            + "C. Tạo một đường kẻ ngang.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <br> để tạo bao nhiêu dòng mới?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một dòng mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng dòng mới?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <br>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể định dạng dòng mới.",
            "Làm thế nào để căn chỉnh dòng mới?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <br>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể căn chỉnh dòng mới.",
            "Làm thế nào để tạo một dòng mới có khoảng cách dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính line-height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo dòng mới có khoảng cách dòng.",
            "Làm thế nào để tạo một dòng mới có thụt đầu dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính text-indent của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo dòng mới có thụt đầu dòng."
        });

        TITLE_MAP.put("Đường Ngang (<hr>)", new String[]{
            "Thẻ <hr> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đường kẻ ngang.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <hr> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một dòng mới trong đoạn văn bản.\n"
            + "B. Tạo một đoạn văn bản mới.\n"
            + "C. Tạo một đường kẻ ngang để phân chia nội dung.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <hr> để tạo bao nhiêu đường kẻ ngang?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một đường kẻ ngang trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <hr>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng đường kẻ ngang?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <hr>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể định dạng đường kẻ ngang.",
            "Làm thế nào để căn chỉnh đường kẻ ngang?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <hr>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể căn chỉnh đường kẻ ngang.",
            "Làm thế nào để tạo một đường kẻ ngang có độ dày?\n"
            + "\n"
            + "A. Dùng thuộc tính height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo đường kẻ ngang có độ dày.",
            "Làm thế nào để tạo một đường kẻ ngang có màu sắc?\n"
            + "\n"
            + "A. Dùng thuộc tính color của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo đường kẻ ngang có màu sắc."
        });
        TITLE_MAP.put("Các Phần Của Tài Liệu HTML", new String[]{
            "Phần nào của tài liệu HTML chứa thông tin về trang web?\n"
            + "\n"
            + "A. <body>.\n"
            + "B. <head>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của tài liệu HTML chứa nội dung hiển thị trên trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <meta>.",
            "Thẻ nào là thẻ gốc của tài liệu HTML?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Thẻ nào được dùng để xác định tiêu đề của trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Thẻ nào được dùng để khai báo loại tài liệu HTML?\n"
            + "\n"
            + "A. <doctype html>.\n"
            + "B. <html>.\n"
            + "C. <head>.\n"
            + "D. <body>.",
            "Thẻ nào được dùng để nhúng CSS vào tài liệu HTML?\n"
            + "\n"
            + "A. <script>.\n"
            + "B. <link>.\n"
            + "C. <img>.\n"
            + "D. <iframe>.",
            "Thẻ nào được dùng để nhúng JavaScript vào tài liệu HTML?\n"
            + "\n"
            + "A. <link>.\n"
            + "B. <script>.\n"
            + "C. <img>.\n"
            + "D. <iframe>.",
            "Thẻ nào được dùng để xác định các thông tin meta của trang web?\n"
            + "\n"
            + "A. <title>.\n"
            + "B. <meta>.\n"
            + "C. <body>.\n"
            + "D. <html>.",
            "Thẻ nào được dùng để tạo cấu trúc phân cấp cho nội dung?\n"
            + "\n"
            + "A. <p>.\n"
            + "B. <div>.\n"
            + "C. <span>.\n"
            + "D. <a>.",
            "Thẻ nào được dùng để tạo liên kết đến các tài nguyên bên ngoài?\n"
            + "\n"
            + "A. <p>.\n"
            + "B. <div>.\n"
            + "C. <span>.\n"
            + "D. <a>."
        });

        TITLE_MAP.put("Mô Tả Chi Tiết Các Thẻ Quan Trọng", new String[]{
            "Thẻ <h1> đến <h6> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo đoạn văn bản.\n"
            + "B. Tạo tiêu đề.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <p> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đoạn văn bản.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <a> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo hình ảnh.\n"
            + "B. Tạo liên kết.\n"
            + "C. Tạo video.\n"
            + "D. Tạo âm thanh.",
            "Thẻ <img> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo liên kết.\n"
            + "B. Tạo hình ảnh.\n"
            + "C. Tạo video.\n"
            + "D. Tạo âm thanh.",
            "Thẻ <ul> và <ol> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo danh sách.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <li> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo mục trong danh sách.\n"
            + "B. Tạo bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <table> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <tr>, <th>, và <td> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo các phần tử trong bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <form> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo biểu mẫu.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <input>, <select>, và <textarea> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo các trường nhập liệu trong biểu mẫu.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề."
        });

        TITLE_MAP.put("Tạo File HTML", new String[]{
            "Đuôi mở rộng nào được dùng cho file HTML?\n"
            + "\n"
            + "A. .txt.\n"
            + "B. .html hoặc .htm.\n"
            + "C. .css.\n"
            + "D. .js.",
            "Bạn có thể dùng phần mềm nào để tạo file HTML?\n"
            + "\n"
            + "A. Notepad.\n"
            + "B. Visual Studio Code.\n"
            + "C. Sublime Text.\n"
            + "D. Tất cả các phương án trên.",
            "Cấu trúc cơ bản của một file HTML bao gồm những phần nào?\n"
            + "\n"
            + "A. <head> và <body>.\n"
            + "B. <html>, <head>, và <body>.\n"
            + "C. <html> và <body>.\n"
            + "D. Chỉ có <body>.",
            "Thẻ nào được dùng để khai báo loại tài liệu HTML5?\n"
            + "\n"
            + "A. <doctype html>.\n"
            + "B. <html>.\n"
            + "C. <head>.\n"
            + "D. <body>.",
            "Thẻ nào được dùng để xác định tiêu đề của trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của file HTML chứa các thông tin meta?\n"
            + "\n"
            + "A. <body>.\n"
            + "B. <head>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của file HTML chứa nội dung hiển thị trên trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <meta>.",
            "Làm thế nào để lưu file HTML?\n"
            + "\n"
            + "A. Lưu với đuôi .txt.\n"
            + "B. Lưu với đuôi .html hoặc .htm.\n"
            + "C. Lưu với đuôi .css.\n"
            + "D. Lưu với đuôi .js.",
            "Bạn có thể mở file HTML bằng phần mềm nào?\n"
            + "\n"
            + "A. Trình duyệt web.\n"
            + "B. Notepad.\n"
            + "C. Visual Studio Code.\n"
            + "D. Tất cả các phương án trên.",
            "Thẻ nào được dùng để tạo liên kết đến file CSS bên ngoài?\n"
            + "\n"
            + "A. <script>.\n"
            + "B. <link>.\n"
            + "C. <img>.\n"
            + "D. <iframe>."
        });

        TITLE_MAP.put("Chạy File HTML Trên Trình Duyệt", new String[]{
            "Bạn có thể chạy file HTML bằng cách nào?\n"
            + "\n"
            + "A. Nhấp đúp vào file HTML.\n"
            + "B. Kéo và thả file HTML vào trình duyệt.\n"
            + "C. Nhập đường dẫn file HTML vào thanh địa chỉ của trình duyệt.\n"
            + "D. Tất cả các phương án trên.",
            "Trình duyệt web nào có thể dùng để chạy file HTML?\n"
            + "\n"
            + "A. Google Chrome.\n"
            + "B. Mozilla Firefox.\n"
            + "C. Microsoft Edge.\n"
            + "D. Tất cả các phương án trên.",
            "Khi chạy file HTML, trình duyệt sẽ làm gì?\n"
            + "\n"
            + "A. Biên dịch mã HTML.\n"
            + "B. Hiển thị nội dung HTML.\n"
            + "C. Lưu trữ dữ liệu HTML.\n"
            + "D. Chỉnh sửa mã HTML.",
            "Làm thế nào để xem mã nguồn HTML của một trang web?\n"
            + "\n"
            + "A. Nhấp chuột phải vào trang web và chọn \"Xem mã nguồn trang\".\n"
            + "B. Nhấn phím F12.\n"
            + "C. Nhấn tổ hợp phím Ctrl + U.\n"
            + "D. Tất cả các phương án trên.",
            "Công cụ nào của trình duyệt được dùng để kiểm tra và gỡ lỗi HTML?\n"
            + "\n"
            + "A. Console.\n"
            + "B. Elements.\n"
            + "C. Network.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tải lại trang web trong trình duyệt?\n"
            + "\n"
            + "A. Nhấp vào nút tải lại.\n"
            + "B. Nhấn phím F5.\n"
            + "C. Nhấn tổ hợp phím Ctrl + R.\n"
            + "D. Tất cả các phương án trên.",
            "Trình duyệt web nào hỗ trợ tốt nhất các tính năng HTML5?\n"
            + "\n"
            + "A. Internet Explorer.\n"
            + "B. Google Chrome.\n"
            + "C. Trình duyệt mặc định của hệ điều hành.\n"
            + "D. Tất cả các trình duyệt đều hỗ trợ như nhau.",
            "Làm thế nào để kiểm tra xem trình duyệt có hỗ trợ một tính năng HTML5 cụ thể hay không?\n"
            + "\n"
            + "A. Xem tài liệu của trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra tính năng trên web.\n"
            + "C. Dùng JavaScript để kiểm tra.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để mở file HTML trên thiết bị di động?\n"
            + "\n"
            + "A. Dùng trình duyệt web trên di động.\n"
            + "B. Dùng ứng dụng đọc file HTML.\n"
            + "C. Tải file HTML lên một máy chủ web và truy cập qua URL.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để xem file HTML trên nhiều trình duyệt khác nhau?\n"
            + "\n"
            + "A. Mở file HTML trên từng trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra tương thích trình duyệt.\n"
            + "C. Dùng máy ảo để chạy các trình duyệt khác nhau.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools", new String[]{
            "Developer Tools là gì?\n"
            + "\n"
            + "A. Công cụ để thiết kế đồ họa.\n"
            + "B. Công cụ để kiểm tra và gỡ lỗi web.\n"
            + "C. Công cụ để quản lý cơ sở dữ liệu.\n"
            + "D. Công cụ để lập trình server-side.",
            "Làm thế nào để mở Developer Tools?\n"
            + "\n"
            + "A. Nhấn phím F12.\n"
            + "B. Nhấp chuột phải vào trang web và chọn \"Kiểm tra\".\n"
            + "C. Nhấn tổ hợp phím Ctrl + Shift + I.\n"
            + "D. Tất cả các phương án trên.",
            "Tab nào trong Developer Tools dùng để kiểm tra mã HTML và CSS?\n"
            + "\n"
            + "A. Console.\n"
            + "B. Elements.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Tab nào trong Developer Tools dùng để xem các lỗi JavaScript?\n"
            + "\n"
            + "A. Elements.\n"
            + "B. Console.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Tab nào trong Developer Tools dùng để xem các yêu cầu mạng?\n"
            + "\n"
            + "A. Elements.\n"
            + "B. Console.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Bạn có thể làm gì với mã HTML trong tab Elements?\n"
            + "\n"
            + "A. Chỉnh sửa mã HTML trực tiếp.\n"
            + "B. Xem các thuộc tính CSS.\n"
            + "C. Thêm hoặc xóa các phần tử HTML.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với CSS trong tab Elements?\n"
            + "\n"
            + "A. Chỉnh sửa các giá trị CSS.\n"
            + "B. Xem các quy tắc CSS áp dụng cho một phần tử.\n"
            + "C. Thêm hoặc xóa các quy tắc CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với JavaScript trong tab Console?\n"
            + "\n"
            + "A. Xem các lỗi và cảnh báo JavaScript.\n"
            + "B. Chạy mã JavaScript trực tiếp.\n"
            + "C. Xem các giá trị biến JavaScript.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với các yêu cầu mạng trong tab Network?\n"
            + "\n"
            + "A. Xem các yêu cầu HTTP.\n"
            + "B. Xem thời gian tải các tài nguyên.\n"
            + "C. Xem các tiêu đề HTTP.\n"
            + "D. Tất cả các phương án trên.",
            "Developer Tools giúp ích gì trong việc phát triển web?\n"
            + "\n"
            + "A. Gỡ lỗi HTML, CSS và JavaScript.\n"
            + "B. Kiểm tra hiệu suất trang web.\n"
            + "C. Chỉnh sửa trang web trực tiếp.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Ý Nghĩa Của Các Mức Tiêu Đề", new String[]{
            "Thẻ <h1> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề phụ.\n"
            + "B. Tạo tiêu đề chính.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <h2> đến <h6> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề chính.\n"
            + "B. Tạo tiêu đề phụ.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <h1> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tiêu đề quan trọng nhất trên trang.\n"
            + "B. Tiêu đề ít quan trọng nhất trên trang.\n"
            + "C. Đoạn văn bản quan trọng nhất trên trang.\n"
            + "D. Đoạn văn bản ít quan trọng nhất trên trang.",
            "Thẻ <h6> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tiêu đề quan trọng nhất trên trang.\n"
            + "B. Tiêu đề ít quan trọng nhất trên trang.\n"
            + "C. Đoạn văn bản quan trọng nhất trên trang.\n"
            + "D. Đoạn văn bản ít quan trọng nhất trên trang.",
            "Tại sao cần sử dụng các mức tiêu đề khác nhau?\n"
            + "\n"
            + "A. Để tạo cấu trúc phân cấp cho nội dung.\n"
            + "B. Để tăng khả năng tiếp cận của trang web.\n"
            + "C. Để cải thiện SEO.\n"
            + "D. Tất cả các phương án trên.",
            "Mức tiêu đề nào nên được dùng cho tiêu đề chính của trang?\n"
            + "\n"
            + "A. <h1>.\n"
            + "B. <h2>.\n"
            + "C. <h3>.\n"
            + "D. <h4>.",
            "Mức tiêu đề nào nên được dùng cho các tiêu đề phụ?\n"
            + "\n"
            + "A. <h1>.\n"
            + "B. <h2> đến <h6>.\n"
            + "C. <p>.\n"
            + "D. <li>.",
            "Điều gì xảy ra nếu bạn không sử dụng các mức tiêu đề đúng cách?\n"
            + "\n"
            + "A. Trang web sẽ không hiển thị đúng cách.\n"
            + "B. Trang web sẽ khó tiếp cận hơn.\n"
            + "C. SEO của trang web sẽ bị ảnh hưởng.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể sử dụng bao nhiêu thẻ <h1> trên một trang?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Một.\n"
            + "C. Hai.\n"
            + "D. Ba.",
            "Bạn có thể sử dụng bao nhiêu thẻ <h2> đến <h6> trên một trang?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Một.\n"
            + "C. Hai.\n"
            + "D. Ba."
        });

        TITLE_MAP.put("Lỗi Thường Gặp", new String[]{
            "Lỗi nào xảy ra khi bạn quên đóng thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn viết sai tên thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai thuộc tính của thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai đường dẫn đến file hình ảnh hoặc CSS?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai cấu trúc HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Làm thế nào để kiểm tra lỗi HTML?\n"
            + "\n"
            + "A. Dùng Developer Tools của trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra lỗi HTML trên web.\n"
            + "C. Xem mã nguồn HTML.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để sửa lỗi HTML?\n"
            + "\n"
            + "A. Sửa mã HTML trực tiếp.\n"
            + "B. Dùng các công cụ sửa lỗi HTML trên web.\n"
            + "C. Tìm kiếm trên internet để tìm giải pháp.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <img>?\n"
            + "\n"
            + "A. Quên thuộc tính alt.\n"
            + "B. Dùng sai đường dẫn đến file hình ảnh.\n"
            + "C. Dùng sai định dạng file hình ảnh.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <a>?\n"
            + "\n"
            + "A. Dùng sai thuộc tính href.\n"
            + "B. Quên đóng thẻ <a>.\n"
            + "C. Dùng sai cấu trúc thẻ <a>.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <form>?\n"
            + "\n"
            + "A. Quên thuộc tính action.\n"
            + "B. Dùng sai thuộc tính method.\n"
            + "C. Dùng sai cấu trúc thẻ <form>.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Đoạn Văn (<p>)", new String[]{
            "Thẻ <p> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đoạn văn bản.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <p> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một đoạn văn bản mới.\n"
            + "B. Tạo một dòng mới.\n"
            + "C. Tạo một đường kẻ ngang.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <p> để tạo bao nhiêu đoạn văn bản?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <p>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một dòng mới trong đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng đoạn văn bản?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <p>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để căn chỉnh đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <p>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo một đoạn văn bản có thụt đầu dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính text-indent của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo một đoạn văn bản có khoảng cách dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính line-height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Xuống Dòng (<br>)", new String[]{
            "Thẻ <br> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo dòng mới.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <br> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một dòng mới trong đoạn văn bản.\n"
            + "B. Tạo một đoạn văn bản mới.\n"
            + "C. Tạo một đường kẻ ngang.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <br> để tạo bao nhiêu dòng mới?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một dòng mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng dòng mới?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <br>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể định dạng dòng mới.",
            "Làm thế nào để căn chỉnh dòng mới?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <br>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể căn chỉnh dòng mới.",
            "Làm thế nào để tạo một dòng mới có khoảng cách dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính line-height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo dòng mới có khoảng cách dòng.",
            "Làm thế nào để tạo một dòng mới có thụt đầu dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính text-indent của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo dòng mới có thụt đầu dòng."
        });

        TITLE_MAP.put("Đường Ngang (<hr>)", new String[]{
            "Thẻ <hr> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đường kẻ ngang.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <hr> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một dòng mới trong đoạn văn bản.\n"
            + "B. Tạo một đoạn văn bản mới.\n"
            + "C. Tạo một đường kẻ ngang để phân chia nội dung.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <hr> để tạo bao nhiêu đường kẻ ngang?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một đường kẻ ngang trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <hr>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng đường kẻ ngang?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <hr>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể định dạng đường kẻ ngang.",
            "Làm thế nào để căn chỉnh đường kẻ ngang?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <hr>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể căn chỉnh đường kẻ ngang.",
            "Làm thế nào để tạo một đường kẻ ngang có độ dày?\n"
            + "\n"
            + "A. Dùng thuộc tính height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo đường kẻ ngang có độ dày.",
            "Làm thế nào để tạo một đường kẻ ngang có màu sắc?\n"
            + "\n"
            + "A. Dùng thuộc tính color của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo đường kẻ ngang có màu sắc."
        });
        TITLE_MAP.put("Các Phần Của Tài Liệu HTML", new String[]{
            "Phần nào của tài liệu HTML chứa thông tin về trang web?\n"
            + "\n"
            + "A. <body>.\n"
            + "B. <head>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của tài liệu HTML chứa nội dung hiển thị trên trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <meta>.",
            "Thẻ nào là thẻ gốc của tài liệu HTML?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Thẻ nào được dùng để xác định tiêu đề của trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Thẻ nào được dùng để khai báo loại tài liệu HTML?\n"
            + "\n"
            + "A. <doctype html>.\n"
            + "B. <html>.\n"
            + "C. <head>.\n"
            + "D. <body>.",
            "Thẻ nào được dùng để nhúng CSS vào tài liệu HTML?\n"
            + "\n"
            + "A. <script>.\n"
            + "B. <link>.\n"
            + "C. <img>.\n"
            + "D. <iframe>.",
            "Thẻ nào được dùng để nhúng JavaScript vào tài liệu HTML?\n"
            + "\n"
            + "A. <link>.\n"
            + "B. <script>.\n"
            + "C. <img>.\n"
            + "D. <iframe>.",
            "Thẻ nào được dùng để xác định các thông tin meta của trang web?\n"
            + "\n"
            + "A. <title>.\n"
            + "B. <meta>.\n"
            + "C. <body>.\n"
            + "D. <html>.",
            "Thẻ nào được dùng để tạo cấu trúc phân cấp cho nội dung?\n"
            + "\n"
            + "A. <p>.\n"
            + "B. <div>.\n"
            + "C. <span>.\n"
            + "D. <a>.",
            "Thẻ nào được dùng để tạo liên kết đến các tài nguyên bên ngoài?\n"
            + "\n"
            + "A. <p>.\n"
            + "B. <div>.\n"
            + "C. <span>.\n"
            + "D. <a>."
        });

        TITLE_MAP.put("Mô Tả Chi Tiết Các Thẻ Quan Trọng", new String[]{
            "Thẻ <h1> đến <h6> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo đoạn văn bản.\n"
            + "B. Tạo tiêu đề.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <p> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đoạn văn bản.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <a> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo hình ảnh.\n"
            + "B. Tạo liên kết.\n"
            + "C. Tạo video.\n"
            + "D. Tạo âm thanh.",
            "Thẻ <img> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo liên kết.\n"
            + "B. Tạo hình ảnh.\n"
            + "C. Tạo video.\n"
            + "D. Tạo âm thanh.",
            "Thẻ <ul> và <ol> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo danh sách.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <li> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo mục trong danh sách.\n"
            + "B. Tạo bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <table> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <tr>, <th>, và <td> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo các phần tử trong bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <form> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo biểu mẫu.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <input>, <select>, và <textarea> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo các trường nhập liệu trong biểu mẫu.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề."
        });

        TITLE_MAP.put("Tạo File HTML", new String[]{
            "Đuôi mở rộng nào được dùng cho file HTML?\n"
            + "\n"
            + "A. .txt.\n"
            + "B. .html hoặc .htm.\n"
            + "C. .css.\n"
            + "D. .js.",
            "Bạn có thể dùng phần mềm nào để tạo file HTML?\n"
            + "\n"
            + "A. Notepad.\n"
            + "B. Visual Studio Code.\n"
            + "C. Sublime Text.\n"
            + "D. Tất cả các phương án trên.",
            "Cấu trúc cơ bản của một file HTML bao gồm những phần nào?\n"
            + "\n"
            + "A. <head> và <body>.\n"
            + "B. <html>, <head>, và <body>.\n"
            + "C. <html> và <body>.\n"
            + "D. Chỉ có <body>.",
            "Thẻ nào được dùng để khai báo loại tài liệu HTML5?\n"
            + "\n"
            + "A. <doctype html>.\n"
            + "B. <html>.\n"
            + "C. <head>.\n"
            + "D. <body>.",
            "Thẻ nào được dùng để xác định tiêu đề của trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của file HTML chứa các thông tin meta?\n"
            + "\n"
            + "A. <body>.\n"
            + "B. <head>.\n"
            + "C. <html>.\n"
            + "D. <title>.",
            "Phần nào của file HTML chứa nội dung hiển thị trên trang web?\n"
            + "\n"
            + "A. <head>.\n"
            + "B. <body>.\n"
            + "C. <html>.\n"
            + "D. <meta>.",
            "Làm thế nào để lưu file HTML?\n"
            + "\n"
            + "A. Lưu với đuôi .txt.\n"
            + "B. Lưu với đuôi .html hoặc .htm.\n"
            + "C. Lưu với đuôi .css.\n"
            + "D. Lưu với đuôi .js.",
            "Bạn có thể mở file HTML bằng phần mềm nào?\n"
            + "\n"
            + "A. Trình duyệt web.\n"
            + "B. Notepad.\n"
            + "C. Visual Studio Code.\n"
            + "D. Tất cả các phương án trên.",
            "Thẻ nào được dùng để tạo liên kết đến file CSS bên ngoài?\n"
            + "\n"
            + "A. <script>.\n"
            + "B. <link>.\n"
            + "C. <img>.\n"
            + "D. <iframe>."
        });

        TITLE_MAP.put("Chạy File HTML Trên Trình Duyệt", new String[]{
            "Bạn có thể chạy file HTML bằng cách nào?\n"
            + "\n"
            + "A. Nhấp đúp vào file HTML.\n"
            + "B. Kéo và thả file HTML vào trình duyệt.\n"
            + "C. Nhập đường dẫn file HTML vào thanh địa chỉ của trình duyệt.\n"
            + "D. Tất cả các phương án trên.",
            "Trình duyệt web nào có thể dùng để chạy file HTML?\n"
            + "\n"
            + "A. Google Chrome.\n"
            + "B. Mozilla Firefox.\n"
            + "C. Microsoft Edge.\n"
            + "D. Tất cả các phương án trên.",
            "Khi chạy file HTML, trình duyệt sẽ làm gì?\n"
            + "\n"
            + "A. Biên dịch mã HTML.\n"
            + "B. Hiển thị nội dung HTML.\n"
            + "C. Lưu trữ dữ liệu HTML.\n"
            + "D. Chỉnh sửa mã HTML.",
            "Làm thế nào để xem mã nguồn HTML của một trang web?\n"
            + "\n"
            + "A. Nhấp chuột phải vào trang web và chọn \"Xem mã nguồn trang\".\n"
            + "B. Nhấn phím F12.\n"
            + "C. Nhấn tổ hợp phím Ctrl + U.\n"
            + "D. Tất cả các phương án trên.",
            "Công cụ nào của trình duyệt được dùng để kiểm tra và gỡ lỗi HTML?\n"
            + "\n"
            + "A. Console.\n"
            + "B. Elements.\n"
            + "C. Network.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tải lại trang web trong trình duyệt?\n"
            + "\n"
            + "A. Nhấp vào nút tải lại.\n"
            + "B. Nhấn phím F5.\n"
            + "C. Nhấn tổ hợp phím Ctrl + R.\n"
            + "D. Tất cả các phương án trên.",
            "Trình duyệt web nào hỗ trợ tốt nhất các tính năng HTML5?\n"
            + "\n"
            + "A. Internet Explorer.\n"
            + "B. Google Chrome.\n"
            + "C. Trình duyệt mặc định của hệ điều hành.\n"
            + "D. Tất cả các trình duyệt đều hỗ trợ như nhau.",
            "Làm thế nào để kiểm tra xem trình duyệt có hỗ trợ một tính năng HTML5 cụ thể hay không?\n"
            + "\n"
            + "A. Xem tài liệu của trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra tính năng trên web.\n"
            + "C. Dùng JavaScript để kiểm tra.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để mở file HTML trên thiết bị di động?\n"
            + "\n"
            + "A. Dùng trình duyệt web trên di động.\n"
            + "B. Dùng ứng dụng đọc file HTML.\n"
            + "C. Tải file HTML lên một máy chủ web và truy cập qua URL.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để xem file HTML trên nhiều trình duyệt khác nhau?\n"
            + "\n"
            + "A. Mở file HTML trên từng trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra tương thích trình duyệt.\n"
            + "C. Dùng máy ảo để chạy các trình duyệt khác nhau.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools", new String[]{
            "Developer Tools là gì?\n"
            + "\n"
            + "A. Công cụ để thiết kế đồ họa.\n"
            + "B. Công cụ để kiểm tra và gỡ lỗi web.\n"
            + "C. Công cụ để quản lý cơ sở dữ liệu.\n"
            + "D. Công cụ để lập trình server-side.",
            "Làm thế nào để mở Developer Tools?\n"
            + "\n"
            + "A. Nhấn phím F12.\n"
            + "B. Nhấp chuột phải vào trang web và chọn \"Kiểm tra\".\n"
            + "C. Nhấn tổ hợp phím Ctrl + Shift + I.\n"
            + "D. Tất cả các phương án trên.",
            "Tab nào trong Developer Tools dùng để kiểm tra mã HTML và CSS?\n"
            + "\n"
            + "A. Console.\n"
            + "B. Elements.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Tab nào trong Developer Tools dùng để xem các lỗi JavaScript?\n"
            + "\n"
            + "A. Elements.\n"
            + "B. Console.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Tab nào trong Developer Tools dùng để xem các yêu cầu mạng?\n"
            + "\n"
            + "A. Elements.\n"
            + "B. Console.\n"
            + "C. Network.\n"
            + "D. Sources.",
            "Bạn có thể làm gì với mã HTML trong tab Elements?\n"
            + "\n"
            + "A. Chỉnh sửa mã HTML trực tiếp.\n"
            + "B. Xem các thuộc tính CSS.\n"
            + "C. Thêm hoặc xóa các phần tử HTML.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với CSS trong tab Elements?\n"
            + "\n"
            + "A. Chỉnh sửa các giá trị CSS.\n"
            + "B. Xem các quy tắc CSS áp dụng cho một phần tử.\n"
            + "C. Thêm hoặc xóa các quy tắc CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với JavaScript trong tab Console?\n"
            + "\n"
            + "A. Xem các lỗi và cảnh báo JavaScript.\n"
            + "B. Chạy mã JavaScript trực tiếp.\n"
            + "C. Xem các giá trị biến JavaScript.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể làm gì với các yêu cầu mạng trong tab Network?\n"
            + "\n"
            + "A. Xem các yêu cầu HTTP.\n"
            + "B. Xem thời gian tải các tài nguyên.\n"
            + "C. Xem các tiêu đề HTTP.\n"
            + "D. Tất cả các phương án trên.",
            "Developer Tools giúp ích gì trong việc phát triển web?\n"
            + "\n"
            + "A. Gỡ lỗi HTML, CSS và JavaScript.\n"
            + "B. Kiểm tra hiệu suất trang web.\n"
            + "C. Chỉnh sửa trang web trực tiếp.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Ý Nghĩa Của Các Mức Tiêu Đề", new String[]{
            "Thẻ <h1> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề phụ.\n"
            + "B. Tạo tiêu đề chính.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <h2> đến <h6> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề chính.\n"
            + "B. Tạo tiêu đề phụ.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <h1> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tiêu đề quan trọng nhất trên trang.\n"
            + "B. Tiêu đề ít quan trọng nhất trên trang.\n"
            + "C. Đoạn văn bản quan trọng nhất trên trang.\n"
            + "D. Đoạn văn bản ít quan trọng nhất trên trang.",
            "Thẻ <h6> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tiêu đề quan trọng nhất trên trang.\n"
            + "B. Tiêu đề ít quan trọng nhất trên trang.\n"
            + "C. Đoạn văn bản quan trọng nhất trên trang.\n"
            + "D. Đoạn văn bản ít quan trọng nhất trên trang.",
            "Tại sao cần sử dụng các mức tiêu đề khác nhau?\n"
            + "\n"
            + "A. Để tạo cấu trúc phân cấp cho nội dung.\n"
            + "B. Để tăng khả năng tiếp cận của trang web.\n"
            + "C. Để cải thiện SEO.\n"
            + "D. Tất cả các phương án trên.",
            "Mức tiêu đề nào nên được dùng cho tiêu đề chính của trang?\n"
            + "\n"
            + "A. <h1>.\n"
            + "B. <h2>.\n"
            + "C. <h3>.\n"
            + "D. <h4>.",
            "Mức tiêu đề nào nên được dùng cho các tiêu đề phụ?\n"
            + "\n"
            + "A. <h1>.\n"
            + "B. <h2> đến <h6>.\n"
            + "C. <p>.\n"
            + "D. <li>.",
            "Điều gì xảy ra nếu bạn không sử dụng các mức tiêu đề đúng cách?\n"
            + "\n"
            + "A. Trang web sẽ không hiển thị đúng cách.\n"
            + "B. Trang web sẽ khó tiếp cận hơn.\n"
            + "C. SEO của trang web sẽ bị ảnh hưởng.\n"
            + "D. Tất cả các phương án trên.",
            "Bạn có thể sử dụng bao nhiêu thẻ <h1> trên một trang?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Một.\n"
            + "C. Hai.\n"
            + "D. Ba.",
            "Bạn có thể sử dụng bao nhiêu thẻ <h2> đến <h6> trên một trang?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Một.\n"
            + "C. Hai.\n"
            + "D. Ba."
        });

        TITLE_MAP.put("Lỗi Thường Gặp", new String[]{
            "Lỗi nào xảy ra khi bạn quên đóng thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn viết sai tên thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai thuộc tính của thẻ HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai đường dẫn đến file hình ảnh hoặc CSS?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Lỗi nào xảy ra khi bạn dùng sai cấu trúc HTML?\n"
            + "\n"
            + "A. Lỗi cú pháp.\n"
            + "B. Lỗi hiển thị.\n"
            + "C. Lỗi logic.\n"
            + "D. Lỗi mạng.",
            "Làm thế nào để kiểm tra lỗi HTML?\n"
            + "\n"
            + "A. Dùng Developer Tools của trình duyệt.\n"
            + "B. Dùng các công cụ kiểm tra lỗi HTML trên web.\n"
            + "C. Xem mã nguồn HTML.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để sửa lỗi HTML?\n"
            + "\n"
            + "A. Sửa mã HTML trực tiếp.\n"
            + "B. Dùng các công cụ sửa lỗi HTML trên web.\n"
            + "C. Tìm kiếm trên internet để tìm giải pháp.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <img>?\n"
            + "\n"
            + "A. Quên thuộc tính alt.\n"
            + "B. Dùng sai đường dẫn đến file hình ảnh.\n"
            + "C. Dùng sai định dạng file hình ảnh.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <a>?\n"
            + "\n"
            + "A. Dùng sai thuộc tính href.\n"
            + "B. Quên đóng thẻ <a>.\n"
            + "C. Dùng sai cấu trúc thẻ <a>.\n"
            + "D. Tất cả các phương án trên.",
            "Lỗi nào thường gặp khi dùng thẻ <form>?\n"
            + "\n"
            + "A. Quên thuộc tính action.\n"
            + "B. Dùng sai thuộc tính method.\n"
            + "C. Dùng sai cấu trúc thẻ <form>.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Đoạn Văn (<p>)", new String[]{
            "Thẻ <p> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đoạn văn bản.\n"
            + "C. Tạo danh sách.\n"
            + "D. Tạo bảng.",
            "Thẻ <p> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một đoạn văn bản mới.\n"
            + "B. Tạo một dòng mới.\n"
            + "C. Tạo một đường kẻ ngang.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <p> để tạo bao nhiêu đoạn văn bản?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <p>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một dòng mới trong đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng đoạn văn bản?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <p>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để căn chỉnh đoạn văn bản?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <p>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo một đoạn văn bản có thụt đầu dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính text-indent của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo một đoạn văn bản có khoảng cách dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính line-height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Xuống Dòng (<br>)", new String[]{
            "Thẻ <br> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo dòng mới.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <br> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một dòng mới trong đoạn văn bản.\n"
            + "B. Tạo một đoạn văn bản mới.\n"
            + "C. Tạo một đường kẻ ngang.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <br> để tạo bao nhiêu dòng mới?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một dòng mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng dòng mới?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <br>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể định dạng dòng mới.",
            "Làm thế nào để căn chỉnh dòng mới?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <br>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể căn chỉnh dòng mới.",
            "Làm thế nào để tạo một dòng mới có khoảng cách dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính line-height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo dòng mới có khoảng cách dòng.",
            "Làm thế nào để tạo một dòng mới có thụt đầu dòng?\n"
            + "\n"
            + "A. Dùng thuộc tính text-indent của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo dòng mới có thụt đầu dòng."
        });

        TITLE_MAP.put("Đường Ngang (<hr>)", new String[]{
            "Thẻ <hr> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề.\n"
            + "B. Tạo đường kẻ ngang.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo danh sách.",
            "Thẻ <hr> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo một dòng mới trong đoạn văn bản.\n"
            + "B. Tạo một đoạn văn bản mới.\n"
            + "C. Tạo một đường kẻ ngang để phân chia nội dung.\n"
            + "D. Tạo một khoảng trắng.",
            "Bạn có thể dùng thẻ <hr> để tạo bao nhiêu đường kẻ ngang?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một đường kẻ ngang trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <h1>.\n"
            + "B. Dùng thẻ <hr>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một đoạn văn bản mới trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ <span>.",
            "Làm thế nào để tạo một khoảng trắng trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <p>.\n"
            + "B. Dùng thẻ <br>.\n"
            + "C. Dùng thẻ <hr>.\n"
            + "D. Dùng thẻ &nbsp;.",
            "Làm thế nào để định dạng đường kẻ ngang?\n"
            + "\n"
            + "A. Dùng CSS.\n"
            + "B. Dùng các thuộc tính của thẻ <hr>.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể định dạng đường kẻ ngang.",
            "Làm thế nào để căn chỉnh đường kẻ ngang?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <hr>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể căn chỉnh đường kẻ ngang.",
            "Làm thế nào để tạo một đường kẻ ngang có độ dày?\n"
            + "\n"
            + "A. Dùng thuộc tính height của CSS.\n"
            + "B. Dùng thuộc tính padding của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo đường kẻ ngang có độ dày.",
            "Làm thế nào để tạo một đường kẻ ngang có màu sắc?\n"
            + "\n"
            + "A. Dùng thuộc tính color của CSS.\n"
            + "B. Dùng thuộc tính margin của CSS.\n"
            + "C. Dùng các thẻ định dạng văn bản.\n"
            + "D. Không thể tạo đường kẻ ngang có màu sắc."
        });
        TITLE_MAP.put("Các Thẻ Định Dạng Phổ Biến", new String[]{
            "Thẻ <b> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng.\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ gạch ngang.",
            "Thẻ <i> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng.\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ gạch ngang.",
            "Thẻ <u> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng.\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ gạch ngang.",
            "Thẻ <s> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng.\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ gạch ngang.",
            "Thẻ <strong> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng.\n"
            + "B. Tạo chữ in đậm (nhấn mạnh).\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ gạch ngang.",
            "Thẻ <em> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng (nhấn mạnh).\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ gạch ngang.",
            "Thẻ <mark> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng.\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ được đánh dấu.",
            "Thẻ <small> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ có kích thước nhỏ.\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ gạch ngang.",
            "Thẻ <del> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng.\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ gạch chân.\n"
            + "D. Tạo chữ bị xóa (gạch ngang).",
            "Thẻ <ins> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo chữ in nghiêng.\n"
            + "B. Tạo chữ in đậm.\n"
            + "C. Tạo chữ được thêm vào (gạch chân).\n"
            + "D. Tạo chữ gạch ngang."
        });

        TITLE_MAP.put("Ví Dụ Về Định Dạng Văn Bản", new String[]{
            "Làm thế nào để tạo chữ in đậm trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <i>.\n"
            + "B. Dùng thẻ <b> hoặc <strong>.\n"
            + "C. Dùng thẻ <u>.\n"
            + "D. Dùng thẻ <s>.",
            "Làm thế nào để tạo chữ in nghiêng trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <b>.\n"
            + "B. Dùng thẻ <i> hoặc <em>.\n"
            + "C. Dùng thẻ <u>.\n"
            + "D. Dùng thẻ <s>.",
            "Làm thế nào để tạo chữ gạch chân trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <b>.\n"
            + "B. Dùng thẻ <i>.\n"
            + "C. Dùng thẻ <u> hoặc <ins>.\n"
            + "D. Dùng thẻ <s>.",
            "Làm thế nào để tạo chữ gạch ngang trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <b>.\n"
            + "B. Dùng thẻ <i>.\n"
            + "C. Dùng thẻ <u>.\n"
            + "D. Dùng thẻ <s> hoặc <del>.",
            "Làm thế nào để tạo chữ được đánh dấu trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <mark>.\n"
            + "B. Dùng thẻ <b>.\n"
            + "C. Dùng thẻ <i>.\n"
            + "D. Dùng thẻ <u>.",
            "Làm thế nào để tạo chữ có kích thước nhỏ trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <small>.\n"
            + "B. Dùng thẻ <b>.\n"
            + "C. Dùng thẻ <i>.\n"
            + "D. Dùng thẻ <u>.",
            "Làm thế nào để kết hợp nhiều định dạng văn bản trong HTML?\n"
            + "\n"
            + "A. Dùng nhiều thẻ định dạng lồng nhau.\n"
            + "B. Dùng nhiều thuộc tính CSS.\n"
            + "C. Dùng nhiều thẻ định dạng cạnh nhau.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để định dạng màu sắc cho văn bản trong HTML?\n"
            + "\n"
            + "A. Dùng thuộc tính color của CSS.\n"
            + "B. Dùng các thẻ định dạng văn bản.\n"
            + "C. Dùng thuộc tính background-color của CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để định dạng phông chữ cho văn bản trong HTML?\n"
            + "\n"
            + "A. Dùng thuộc tính font-family của CSS.\n"
            + "B. Dùng các thẻ định dạng văn bản.\n"
            + "C. Dùng thuộc tính font-size của CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để định dạng kích thước văn bản trong HTML?\n"
            + "\n"
            + "A. Dùng thuộc tính font-size của CSS.\n"
            + "B. Dùng các thẻ định dạng văn bản.\n"
            + "C. Dùng thuộc tính font-weight của CSS.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Danh sách là gì?", new String[]{
            "Danh sách trong HTML được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo danh sách các mục.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "HTML hỗ trợ các loại danh sách nào?\n"
            + "\n"
            + "A. Danh sách có thứ tự và danh sách không có thứ tự.\n"
            + "B. Danh sách có thứ tự và danh sách mô tả.\n"
            + "C. Danh sách không có thứ tự và danh sách mô tả.\n"
            + "D. Tất cả các phương án trên.",
            "Danh sách có thứ tự (ordered list) là gì?\n"
            + "\n"
            + "A. Danh sách các mục được đánh số.\n"
            + "B. Danh sách các mục không được đánh số.\n"
            + "C. Danh sách các mục được mô tả.\n"
            + "D. Danh sách các mục được liên kết.",
            "Danh sách không có thứ tự (unordered list) là gì?\n"
            + "\n"
            + "A. Danh sách các mục được đánh số.\n"
            + "B. Danh sách các mục không được đánh số.\n"
            + "C. Danh sách các mục được mô tả.\n"
            + "D. Danh sách các mục được liên kết.",
            "Danh sách mô tả (description list) là gì?\n"
            + "\n"
            + "A. Danh sách các mục được đánh số.\n"
            + "B. Danh sách các mục không được đánh số.\n"
            + "C. Danh sách các mục được mô tả bằng các thuật ngữ và định nghĩa.\n"
            + "D. Danh sách các mục được liên kết.",
            "Thẻ nào được dùng để tạo danh sách có thứ tự?\n"
            + "\n"
            + "A. <ul>.\n"
            + "B. <ol>.\n"
            + "C. <dl>.\n"
            + "D. <li>.",
            "Thẻ nào được dùng để tạo danh sách không có thứ tự?\n"
            + "\n"
            + "A. <ol>.\n"
            + "B. <ul>.\n"
            + "C. <dl>.\n"
            + "D. <li>.",
            "Thẻ nào được dùng để tạo danh sách mô tả?\n"
            + "\n"
            + "A. <ol>.\n"
            + "B. <ul>.\n"
            + "C. <dl>.\n"
            + "D. <li>.",
            "Thẻ nào được dùng để tạo các mục trong danh sách?\n"
            + "\n"
            + "A. <ol>.\n"
            + "B. <ul>.\n"
            + "C. <dl>.\n"
            + "D. <li>.",
            "Thẻ nào được dùng để tạo thuật ngữ trong danh sách mô tả?\n"
            + "\n"
            + "A. <dt>.\n"
            + "B. <dd>.\n"
            + "C. <li>.\n"
            + "D. <p>."
        });

        TITLE_MAP.put("Danh Sách Có Thứ Tự (<ol>)", new String[]{
            "Thẻ <ol> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo danh sách các mục có thứ tự.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <ol> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo danh sách các mục được đánh số.\n"
            + "B. Tạo danh sách các mục không được đánh số.\n"
            + "C. Tạo danh sách các mục được mô tả.\n"
            + "D. Tạo danh sách các mục được liên kết.",
            "Bạn có thể dùng thẻ <ol> để tạo bao nhiêu mục?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một danh sách có thứ tự trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <ul>.\n"
            + "B. Dùng thẻ <ol>.\n"
            + "C. Dùng thẻ <dl>.\n"
            + "D. Dùng thẻ <li>.",
            "Làm thế nào để tạo các mục trong danh sách có thứ tự?\n"
            + "\n"
            + "A. Dùng thẻ <ul>.\n"
            + "B. Dùng thẻ <ol>.\n"
            + "C. Dùng thẻ <dl>.\n"
            + "D. Dùng thẻ <li>.",
            "Làm thế nào để thay đổi kiểu đánh số trong danh sách có thứ tự?\n"
            + "\n"
            + "A. Dùng thuộc tính type của thẻ <ol>.\n"
            + "B. Dùng thuộc tính list-style-type của CSS.\n"
            + "C. Dùng thuộc tính start của thẻ <ol>.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để thay đổi số bắt đầu trong danh sách có thứ tự?\n"
            + "\n"
            + "A. Dùng thuộc tính type của thẻ <ol>.\n"
            + "B. Dùng thuộc tính list-style-type của CSS.\n"
            + "C. Dùng thuộc tính start của thẻ <ol>.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo danh sách có thứ tự lồng nhau?\n"
            + "\n"
            + "A. Dùng thẻ <ul> lồng trong thẻ <ol>.\n"
            + "B. Dùng thẻ <ol> lồng trong thẻ <ol>.\n"
            + "C. Dùng thẻ <dl> lồng trong thẻ <ol>.\n"
            + "D. Dùng thẻ <li> lồng trong thẻ <ol>.",
            "Làm thế nào để định dạng danh sách có thứ tự?\n"
            + "\n"
            + "A. Dùng thuộc tính list-style-type của CSS.\n"
            + "B. Dùng thuộc tính list-style-position của CSS.\n"
            + "C. Dùng thuộc tính list-style-image của CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để căn chỉnh danh sách có thứ tự?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <ol>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng thuộc tính margin của CSS.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Danh Sách Không Thứ Tự (<ul>)", new String[]{
            "Thẻ <ul> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo danh sách các mục không có thứ tự.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <ul> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo danh sách các mục được đánh số.\n"
            + "B. Tạo danh sách các mục không được đánh số.\n"
            + "C. Tạo danh sách các mục được mô tả.\n"
            + "D. Tạo danh sách các mục được liên kết.",
            "Bạn có thể dùng thẻ <ul> để tạo bao nhiêu mục?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một danh sách không có thứ tự trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <ol>.\n"
            + "B. Dùng thẻ <ul>.\n"
            + "C. Dùng thẻ <dl>.\n"
            + "D. Dùng thẻ <li>.",
            "Làm thế nào để tạo các mục trong danh sách không có thứ tự?\n"
            + "\n"
            + "A. Dùng thẻ <ol>.\n"
            + "B. Dùng thẻ <ul>.\n"
            + "C. Dùng thẻ <dl>.\n"
            + "D. Dùng thẻ <li>.",
            "Làm thế nào để thay đổi kiểu đánh dấu trong danh sách không có thứ tự?\n"
            + "\n"
            + "A. Dùng thuộc tính type của thẻ <ul>.\n"
            + "B. Dùng thuộc tính list-style-type của CSS.\n"
            + "C. Dùng thuộc tính start của thẻ <ul>.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo danh sách không có thứ tự lồng nhau?\n"
            + "\n"
            + "A. Dùng thẻ <ol> lồng trong thẻ <ul>.\n"
            + "B. Dùng thẻ <ul> lồng trong thẻ <ul>.\n"
            + "C. Dùng thẻ <dl> lồng trong thẻ <ul>.\n"
            + "D. Dùng thẻ <li> lồng trong thẻ <ul>.",
            "Làm thế nào để định dạng danh sách không có thứ tự?\n"
            + "\n"
            + "A. Dùng thuộc tính list-style-type của CSS.\n"
            + "B. Dùng thuộc tính list-style-position của CSS.\n"
            + "C. Dùng thuộc tính list-style-image của CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để căn chỉnh danh sách không có thứ tự?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <ul>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng thuộc tính margin của CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo danh sách không có thứ tự với các biểu tượng tùy chỉnh?\n"
            + "\n"
            + "A. Dùng thuộc tính list-style-type của CSS.\n"
            + "B. Dùng thuộc tính list-style-image của CSS.\n"
            + "C. Dùng thuộc tính content của CSS.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Danh Sách Mô Tả (<dl>)", new String[]{
            "Thẻ <dl> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo bảng.\n"
            + "B. Tạo danh sách các mục được mô tả.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <dl> có ý nghĩa gì?\n"
            + "\n"
            + "A. Tạo danh sách các mục được đánh số.\n"
            + "B. Tạo danh sách các mục không được đánh số.\n"
            + "C. Tạo danh sách các mục được mô tả bằng các thuật ngữ và định nghĩa.\n"
            + "D. Tạo danh sách các mục được liên kết.",
            "Bạn có thể dùng thẻ <dl> để tạo bao nhiêu mục?\n"
            + "\n"
            + "A. Một.\n"
            + "B. Hai.\n"
            + "C. Ba.\n"
            + "D. Không giới hạn.",
            "Làm thế nào để tạo một danh sách mô tả trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <ol>.\n"
            + "B. Dùng thẻ <ul>.\n"
            + "C. Dùng thẻ <dl>.\n"
            + "D. Dùng thẻ <li>.",
            "Làm thế nào để tạo thuật ngữ trong danh sách mô tả?\n"
            + "\n"
            + "A. Dùng thẻ <dt>.\n"
            + "B. Dùng thẻ <dd>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <p>.",
            "Làm thế nào để tạo định nghĩa cho thuật ngữ trong danh sách mô tả?\n"
            + "\n"
            + "A. Dùng thẻ <dt>.\n"
            + "B. Dùng thẻ <dd>.\n"
            + "C. Dùng thẻ <li>.\n"
            + "D. Dùng thẻ <p>.",
            "Làm thế nào để tạo nhiều định nghĩa cho một thuật ngữ trong danh sách mô tả?\n"
            + "\n"
            + "A. Dùng nhiều thẻ <dt> cho cùng một thuật ngữ.\n"
            + "B. Dùng nhiều thẻ <dd> cho cùng một thuật ngữ.\n"
            + "C. Dùng thẻ <li> lồng trong thẻ <dd>.\n"
            + "D. Dùng thẻ <p> lồng trong thẻ <dd>.",
            "Làm thế nào để tạo danh sách mô tả lồng nhau?\n"
            + "\n"
            + "A. Dùng thẻ <ol> lồng trong thẻ <dl>.\n"
            + "B. Dùng thẻ <ul> lồng trong thẻ <dl>.\n"
            + "C. Dùng thẻ <dl> lồng trong thẻ <dl>.\n"
            + "D. Dùng thẻ <li> lồng trong thẻ <dl>.",
            "Làm thế nào để định dạng danh sách mô tả?\n"
            + "\n"
            + "A. Dùng thuộc tính list-style-type của CSS.\n"
            + "B. Dùng thuộc tính list-style-position của CSS.\n"
            + "C. Dùng thuộc tính list-style-image của CSS.\n"
            + "D. Dùng các thuộc tính CSS cho thẻ <dt> và <dd>.",
            "Làm thế nào để căn chỉnh danh sách mô tả?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <dl>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng thuộc tính margin của CSS.\n"
            + "D. Dùng các thuộc tính CSS cho thẻ <dt> và <dd>."
        });

        TITLE_MAP.put("Chèn Ảnh (<img>)", new String[]{
            "Thẻ <img> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo liên kết.\n"
            + "B. Chèn hình ảnh.\n"
            + "C. Chèn video.\n"
            + "D. Chèn âm thanh.",
            "Thuộc tính nào của thẻ <img> dùng để chỉ định đường dẫn đến hình ảnh?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <img> dùng để cung cấp văn bản thay thế cho hình ảnh?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <img> dùng để chỉ định chiều rộng của hình ảnh?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <img> dùng để chỉ định chiều cao của hình ảnh?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. height.",
            "Bạn có thể dùng các định dạng hình ảnh nào cho thẻ <img>?\n"
            + "\n"
            + "A. JPG, PNG, GIF.\n"
            + "B. MP4, AVI, MOV.\n"
            + "C. MP3, WAV, OGG.\n"
            + "D. HTML, CSS, JavaScript.",
            "Làm thế nào để chèn hình ảnh vào trang web?\n"
            + "\n"
            + "A. Dùng thẻ <a>.\n"
            + "B. Dùng thẻ <img>.\n"
            + "C. Dùng thẻ <video>.\n"
            + "D. Dùng thẻ <audio>.",
            "Làm thế nào để căn chỉnh hình ảnh trong trang web?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <img>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng thuộc tính margin của CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo hình ảnh có liên kết?\n"
            + "\n"
            + "A. Dùng thẻ <a> lồng trong thẻ <img>.\n"
            + "B. Dùng thẻ <img> lồng trong thẻ <a>.\n"
            + "C. Dùng thuộc tính href của thẻ <img>.\n"
            + "D. Dùng thuộc tính src của thẻ <a>.",
            "Làm thế nào để tạo hình ảnh có chú thích?\n"
            + "\n"
            + "A. Dùng thẻ <figcaption> lồng trong thẻ <img>.\n"
            + "B. Dùng thẻ <img> lồng trong thẻ <figcaption>.\n"
            + "C. Dùng thẻ <figure> bao quanh thẻ <img> và <figcaption>.\n"
            + "D. Dùng thuộc tính title của thẻ <img>."
        });

        TITLE_MAP.put("Chèn Video (<video>)", new String[]{
            "Thẻ <video> được dùng để làm gì?\n"
            + "\n"
            + "A. Chèn hình ảnh.\n"
            + "B. Chèn video.\n"
            + "C. Chèn âm thanh.\n"
            + "D. Tạo liên kết.",
            "Thuộc tính nào của thẻ <video> dùng để chỉ định đường dẫn đến video?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <video> dùng để hiển thị các nút điều khiển video?\n"
            + "\n"
            + "A. controls.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <video> dùng để tự động phát video?\n"
            + "\n"
            + "A. controls.\n"
            + "B. src.\n"
            + "C. autoplay.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <video> dùng để phát lặp lại video?\n"
            + "\n"
            + "A. controls.\n"
            + "B. src.\n"
            + "C. loop.\n"
            + "D. width.",
            "Bạn có thể dùng các định dạng video nào cho thẻ <video>?\n"
            + "\n"
            + "A. MP4, WebM, Ogg.\n"
            + "B. JPG, PNG, GIF.\n"
            + "C. MP3, WAV, OGG.\n"
            + "D. HTML, CSS, JavaScript.",
            "Làm thế nào để chèn video vào trang web?\n"
            + "\n"
            + "A. Dùng thẻ <img>.\n"
            + "B. Dùng thẻ <video>.\n"
            + "C. Dùng thẻ <audio>.\n"
            + "D. Dùng thẻ <a>.",
            "Làm thế nào để căn chỉnh video trong trang web?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <video>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng thuộc tính margin của CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo video có chú thích?\n"
            + "\n"
            + "A. Dùng thẻ <figcaption> lồng trong thẻ <video>.\n"
            + "B. Dùng thẻ <video> lồng trong thẻ <figcaption>.\n"
            + "C. Dùng thẻ <figure> bao quanh thẻ <video> và <figcaption>.\n"
            + "D. Dùng thuộc tính title của thẻ <video>.",
            "Làm thế nào để tạo video có poster (hình ảnh hiển thị trước khi phát)?\n"
            + "\n"
            + "A. Dùng thuộc tính poster của thẻ <video>.\n"
            + "B. Dùng thẻ <img> lồng trong thẻ <video>.\n"
            + "C. Dùng thuộc tính background-image của CSS.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Chèn Âm Thanh (<audio>)", new String[]{
            "Thẻ <audio> được dùng để làm gì?\n"
            + "\n"
            + "A. Chèn hình ảnh.\n"
            + "B. Chèn video.\n"
            + "C. Chèn âm thanh.\n"
            + "D. Tạo liên kết.",
            "Thuộc tính nào của thẻ <audio> dùng để chỉ định đường dẫn đến âm thanh?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <audio> dùng để hiển thị các nút điều khiển âm thanh?\n"
            + "\n"
            + "A. controls.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <audio> dùng để tự động phát âm thanh?\n"
            + "\n"
            + "A. controls.\n"
            + "B. src.\n"
            + "C. autoplay.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <audio> dùng để phát lặp lại âm thanh?\n"
            + "\n"
            + "A. controls.\n"
            + "B. src.\n"
            + "C. loop.\n"
            + "D. width.",
            "Bạn có thể dùng các định dạng âm thanh nào cho thẻ <audio>?\n"
            + "\n"
            + "A. MP3, WAV, Ogg.\n"
            + "B. JPG, PNG, GIF.\n"
            + "C. MP4, WebM, Ogg.\n"
            + "D. HTML, CSS, JavaScript.",
            "Làm thế nào để chèn âm thanh vào trang web?\n"
            + "\n"
            + "A. Dùng thẻ <img>.\n"
            + "B. Dùng thẻ <video>.\n"
            + "C. Dùng thẻ <audio>.\n"
            + "D. Dùng thẻ <a>.",
            "Làm thế nào để căn chỉnh âm thanh trong trang web?\n"
            + "\n"
            + "A. Dùng thuộc tính align của thẻ <audio>.\n"
            + "B. Dùng thuộc tính text-align của CSS.\n"
            + "C. Dùng thuộc tính margin của CSS.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo âm thanh có chú thích?\n"
            + "\n"
            + "A. Dùng thẻ <figcaption> lồng trong thẻ <audio>.\n"
            + "B. Dùng thẻ <audio> lồng trong thẻ <figcaption>.\n"
            + "C. Dùng thẻ <figure> bao quanh thẻ <audio> và <figcaption>.\n"
            + "D. Dùng thuộc tính title của thẻ <audio>.",
            "Làm thế nào để tạo âm thanh có poster (hình ảnh hiển thị trước khi phát)?\n"
            + "\n"
            + "A. Dùng thuộc tính poster của thẻ <audio>.\n"
            + "B. Dùng thẻ <img> lồng trong thẻ <audio>.\n"
            + "C. Dùng thuộc tính background-image của CSS.\n"
            + "D. Không thể tạo âm thanh có poster."
        });
        TITLE_MAP.put("Cấu Trúc Cơ Bản Của Liên Kết", new String[]{
            "Thẻ <a> được dùng để làm gì?\n"
            + "\n"
            + "A. Chèn hình ảnh.\n"
            + "B. Tạo liên kết.\n"
            + "C. Chèn video.\n"
            + "D. Chèn âm thanh.",
            "Thuộc tính nào của thẻ <a> dùng để chỉ định URL của liên kết?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <a> dùng để chỉ định cách mở liên kết?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. target.",
            "Giá trị nào của thuộc tính target dùng để mở liên kết trong tab mới?\n"
            + "\n"
            + "A. _self.\n"
            + "B. _blank.\n"
            + "C. _parent.\n"
            + "D. _top.",
            "Giá trị nào của thuộc tính target dùng để mở liên kết trong cùng khung?\n"
            + "\n"
            + "A. _self.\n"
            + "B. _blank.\n"
            + "C. _parent.\n"
            + "D. _top.",
            "Làm thế nào để tạo một liên kết đến một trang web khác?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là URL của trang web đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là URL của trang web đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là URL của trang web đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là URL của trang web đó.",
            "Làm thế nào để tạo một liên kết đến một phần tử trong cùng trang?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là ID của phần tử đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là ID của phần tử đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là ID của phần tử đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là ID của phần tử đó.",
            "Làm thế nào để tạo một liên kết đến một địa chỉ email?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là địa chỉ email đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là địa chỉ email đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là địa chỉ email đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là địa chỉ email đó.",
            "Làm thế nào để tạo một liên kết đến một file tải xuống?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là đường dẫn đến file đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là đường dẫn đến file đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là đường dẫn đến file đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là đường dẫn đến file đó.",
            "Làm thế nào để tạo một liên kết có chú thích?\n"
            + "\n"
            + "A. Dùng thuộc tính title của thẻ <a>.\n"
            + "B. Dùng thẻ <figcaption> lồng trong thẻ <a>.\n"
            + "C. Dùng thẻ <a> lồng trong thẻ <figcaption>.\n"
            + "D. Dùng thẻ <figure> bao quanh thẻ <a> và <figcaption>."
        });

        TITLE_MAP.put("Liên Kết Tới Các Đoạn Văn Trong Cùng Một Trang", new String[]{
            "Làm thế nào để tạo một liên kết đến một đoạn văn trong cùng trang?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là ID của đoạn văn đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là ID của đoạn văn đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là ID của đoạn văn đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là ID của đoạn văn đó.",
            "Làm thế nào để tạo một ID cho đoạn văn?\n"
            + "\n"
            + "A. Dùng thuộc tính id của thẻ <p>.\n"
            + "B. Dùng thuộc tính class của thẻ <p>.\n"
            + "C. Dùng thuộc tính name của thẻ <p>.\n"
            + "D. Dùng thuộc tính href của thẻ <p>.",
            "Làm thế nào để tạo một liên kết đến ID của đoạn văn?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là ID của đoạn văn đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là ID của đoạn văn đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là ID của đoạn văn đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là ID của đoạn văn đó.",
            "Làm thế nào để tạo một liên kết đến đầu trang?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là #top.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là #top.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là #top.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là #top.",
            "Làm thế nào để tạo một liên kết đến cuối trang?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là #bottom.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là #bottom.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là #bottom.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là #bottom.",
            "Làm thế nào để tạo một liên kết đến một phần tử cụ thể trong trang?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là ID của phần tử đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là ID của phần tử đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là ID của phần tử đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là ID của phần tử đó.",
            "Làm thế nào để tạo một liên kết đến một phần tử có class cụ thể trong trang?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là class của phần tử đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là class của phần tử đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là class của phần tử đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là class của phần tử đó.",
            "Làm thế nào để tạo một liên kết đến một phần tử có name cụ thể trong trang?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là name của phần tử đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là name của phần tử đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là name của phần tử đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là name của phần tử đó.",
            "Làm thế nào để tạo một liên kết đến một phần tử có ID cụ thể trong một khung?\n"
            + "\n"
            + "A. Dùng thuộc tính target của thẻ <a> để chỉ định khung đó.\n"
            + "B. Dùng thuộc tính src của thẻ <a> để chỉ định khung đó.\n"
            + "C. Dùng thuộc tính name của thẻ <a> để chỉ định khung đó.\n"
            + "D. Dùng thuộc tính class của thẻ <a> để chỉ định khung đó.",
            "Làm thế nào để tạo một liên kết đến một phần tử có ID cụ thể trong một trang khác?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là URL của trang đó và ID của phần tử đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là URL của trang đó và ID của phần tử đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là URL của trang đó và ID của phần tử đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là URL của trang đó và ID của phần tử đó."
        });

        TITLE_MAP.put("Các Thuộc Tính Thường Dùng Của Thẻ <a>", new String[]{
            "Thuộc tính nào của thẻ <a> dùng để chỉ định URL của liên kết?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <a> dùng để chỉ định cách mở liên kết?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. target.",
            "Giá trị nào của thuộc tính target dùng để mở liên kết trong tab mới?\n"
            + "\n"
            + "A. _self.\n"
            + "B. _blank.\n"
            + "C. _parent.\n"
            + "D. _top.",
            "Giá trị nào của thuộc tính target dùng để mở liên kết trong cùng khung?\n"
            + "\n"
            + "A. _self.\n"
            + "B. _blank.\n"
            + "C. _parent.\n"
            + "D. _top.",
            "Thuộc tính nào của thẻ <a> dùng để chỉ định tiêu đề của liên kết?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. title.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <a> dùng để chỉ định loại liên kết?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. rel.\n"
            + "D. width.",
            "Giá trị nào của thuộc tính rel dùng để chỉ định liên kết đến trang chủ?\n"
            + "\n"
            + "A. alternate.\n"
            + "B. author.\n"
            + "C. help.\n"
            + "D. home.",
            "Giá trị nào của thuộc tính rel dùng để chỉ định liên kết đến trang trước?\n"
            + "\n"
            + "A. prev.\n"
            + "B. next.\n"
            + "C. first.\n"
            + "D. last.",
            "Giá trị nào của thuộc tính rel dùng để chỉ định liên kết đến trang tiếp theo?\n"
            + "\n"
            + "A. prev.\n"
            + "B. next.\n"
            + "C. first.\n"
            + "D. last.",
            "Giá trị nào của thuộc tính rel dùng để chỉ định liên kết đến trang đầu tiên?\n"
            + "\n"
            + "A. prev.\n"
            + "B. next.\n"
            + "C. first.\n"
            + "D. last."
        });

        TITLE_MAP.put("Liên Kết Hình Ảnh", new String[]{
            "Làm thế nào để tạo một liên kết hình ảnh?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là URL của trang web đó và thẻ <img> bên trong.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là URL của trang web đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là URL của trang web đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là URL của trang web đó.",
            "Làm thế nào để tạo một liên kết hình ảnh có chú thích?\n"
            + "\n"
            + "A. Dùng thuộc tính title của thẻ <a>.\n"
            + "B. Dùng thẻ <figcaption> lồng trong thẻ <a> và thẻ <img>.\n"
            + "C. Dùng thẻ <a> lồng trong thẻ <figcaption> và thẻ <img>.\n"
            + "D. Dùng thẻ <figure> bao quanh thẻ <a>, thẻ <img> và thẻ <figcaption>.",
            "Làm thế nào để tạo một liên kết hình ảnh mở trong tab mới?\n"
            + "\n"
            + "A. Dùng thuộc tính target của thẻ <a> với giá trị là _blank.\n"
            + "B. Dùng thuộc tính src của thẻ <a> với giá trị là _blank.\n"
            + "C. Dùng thuộc tính alt của thẻ <a> với giá trị là _blank.\n"
            + "D. Dùng thuộc tính width của thẻ <a> với giá trị là _blank.",
            "Làm thế nào để tạo một liên kết hình ảnh mở trong cùng khung?\n"
            + "\n"
            + "A. Dùng thuộc tính target của thẻ <a> với giá trị là _self.\n"
            + "B. Dùng thuộc tính src của thẻ <a> với giá trị là _self.\n"
            + "C. Dùng thuộc tính alt của thẻ <a> với giá trị là _self.\n"
            + "D. Dùng thuộc tính width của thẻ <a> với giá trị là _self.",
            "Làm thế nào để tạo một liên kết hình ảnh đến một phần tử trong cùng trang?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là ID của phần tử đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là ID của phần tử đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là ID của phần tử đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là ID của phần tử đó.",
            "Làm thế nào để tạo một liên kết hình ảnh đến một địa chỉ email?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là địa chỉ email đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là địa chỉ email đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là địa chỉ email đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là địa chỉ email đó.",
            "Làm thế nào để tạo một liên kết hình ảnh đến một file tải xuống?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là đường dẫn đến file đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là đường dẫn đến file đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là đường dẫn đến file đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là đường dẫn đến file đó.",
            "Làm thế nào để tạo một liên kết hình ảnh có hiệu ứng hover?\n"
            + "\n"
            + "A. Dùng thuộc tính :hover của CSS.\n"
            + "B. Dùng thuộc tính onmouseover của thẻ <a>.\n"
            + "C. Dùng thuộc tính onmouseout của thẻ <a>.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo một liên kết hình ảnh có hiệu ứng chuyển động?\n"
            + "\n"
            + "A. Dùng thuộc tính transition của CSS.\n"
            + "B. Dùng thuộc tính animation của CSS.\n"
            + "C. Dùng JavaScript.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để tạo một liên kết hình ảnh có hiệu ứng phóng to?\n"
            + "\n"
            + "A. Dùng thuộc tính transform: scale() của CSS.\n"
            + "B. Dùng thuộc tính width của CSS.\n"
            + "C. Dùng thuộc tính height của CSS.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Cấu Trúc Thẻ <iframe>", new String[]{
            "Thẻ <iframe> được dùng để làm gì?\n"
            + "\n"
            + "A. Chèn hình ảnh.\n"
            + "B. Chèn video.\n"
            + "C. Chèn một trang web khác vào trang web hiện tại.\n"
            + "D. Chèn âm thanh.",
            "Thuộc tính nào của thẻ <iframe> dùng để chỉ định URL của trang web được chèn?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <iframe> dùng để chỉ định chiều rộng của khung chèn?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <iframe> dùng để chỉ định chiều cao của khung chèn?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. height.",
            "Thuộc tính nào của thẻ <iframe> dùng để chỉ định tên của khung chèn?\n"
            + "\n"
            + "A. href.\n"
            + "B. src.\n"
            + "C. name.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <iframe> dùng để chỉ định khung chèn có đường viền hay không?\n"
            + "\n"
            + "A. frameborder.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Thuộc tính nào của thẻ <iframe> dùng để chỉ định khung chèn có thanh cuộn hay không?\n"
            + "\n"
            + "A. scrolling.\n"
            + "B. src.\n"
            + "C. alt.\n"
            + "D. width.",
            "Làm thế nào để chèn một trang web khác vào trang web hiện tại?\n"
            + "\n"
            + "A. Dùng thẻ <iframe>.\n"
            + "B. Dùng thẻ <img>.\n"
            + "C. Dùng thẻ <video>.\n"
            + "D. Dùng thẻ <audio>.",
            "Làm thế nào để tạo một liên kết đến một phần tử trong khung chèn?\n"
            + "\n"
            + "A. Dùng thuộc tính target của thẻ <a> để chỉ định khung đó.\n"
            + "B. Dùng thuộc tính src của thẻ <a> để chỉ định khung đó.\n"
            + "C. Dùng thuộc tính name của thẻ <a> để chỉ định khung đó.\n"
            + "D. Dùng thuộc tính class của thẻ <a> để chỉ định khung đó.",
            "Làm thế nào để tạo một liên kết đến một phần tử trong một trang khác trong khung chèn?\n"
            + "\n"
            + "A. Dùng thẻ <a> với thuộc tính href là URL của trang đó và ID của phần tử đó.\n"
            + "B. Dùng thẻ <img> với thuộc tính src là URL của trang đó và ID của phần tử đó.\n"
            + "C. Dùng thẻ <video> với thuộc tính src là URL của trang đó và ID của phần tử đó.\n"
            + "D. Dùng thẻ <audio> với thuộc tính src là URL của trang đó và ID của phần tử đó."
        });

        TITLE_MAP.put("Tại Sao Sử Dụng Iframe?", new String[]{
            "Tại sao nên sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Để chèn nội dung từ một trang web khác vào trang web hiện tại.\n"
            + "B. Để tạo một khung riêng biệt cho nội dung.\n"
            + "C. Để nhúng các ứng dụng web.\n"
            + "D. Tất cả các phương án trên.",
            "Lợi ích nào của việc sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Tách biệt nội dung từ các nguồn khác nhau.\n"
            + "B. Dễ dàng nhúng các ứng dụng web.\n"
            + "C. Tăng tính tương tác cho trang web.\n"
            + "D. Tất cả các phương án trên.",
            "Khi nào nên sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Khi muốn nhúng video từ YouTube.\n"
            + "B. Khi muốn nhúng bản đồ từ Google Maps.\n"
            + "C. Khi muốn nhúng một biểu mẫu từ một trang web khác.\n"
            + "D. Tất cả các phương án trên.",
            "Thẻ <iframe> có thể được dùng để làm gì?\n"
            + "\n"
            + "A. Nhúng quảng cáo.\n"
            + "B. Nhúng các ứng dụng web tương tác.\n"
            + "C. Nhúng các tài liệu từ các nguồn khác nhau.\n"
            + "D. Tất cả các phương án trên.",
            "Thẻ <iframe> giúp cải thiện điều gì cho trang web?\n"
            + "\n"
            + "A. Tính tương tác.\n"
            + "B. Tính độc lập của nội dung.\n"
            + "C. Tính bảo mật.\n"
            + "D. Tất cả các phương án trên.",
            "Tại sao thẻ <iframe> được dùng để nhúng video từ YouTube?\n"
            + "\n"
            + "A. Vì YouTube cung cấp mã nhúng <iframe>.\n"
            + "B. Vì <iframe> là cách duy nhất để nhúng video.\n"
            + "C. Vì <iframe> giúp video chạy mượt mà hơn.\n"
            + "D. Vì <iframe> giúp video tương thích với nhiều trình duyệt hơn.",
            "Tại sao thẻ <iframe> được dùng để nhúng bản đồ từ Google Maps?\n"
            + "\n"
            + "A. Vì Google Maps cung cấp mã nhúng <iframe>.\n"
            + "B. Vì <iframe> là cách duy nhất để nhúng bản đồ.\n"
            + "C. Vì <iframe> giúp bản đồ tải nhanh hơn.\n"
            + "D. Vì <iframe> giúp bản đồ tương thích với nhiều trình duyệt hơn.",
            "Tại sao thẻ <iframe> được dùng để nhúng biểu mẫu từ một trang web khác?\n"
            + "\n"
            + "A. Vì <iframe> giúp tách biệt biểu mẫu khỏi trang web hiện tại.\n"
            + "B. Vì <iframe> là cách duy nhất để nhúng biểu mẫu.\n"
            + "C. Vì <iframe> giúp biểu mẫu tải nhanh hơn.\n"
            + "D. Vì <iframe> giúp biểu mẫu tương thích với nhiều trình duyệt hơn.",
            "Tại sao thẻ <iframe> được dùng để nhúng quảng cáo?\n"
            + "\n"
            + "A. Vì <iframe> giúp tách biệt quảng cáo khỏi nội dung chính.\n"
            + "B. Vì <iframe> là cách duy nhất để nhúng quảng cáo.\n"
            + "C. Vì <iframe> giúp quảng cáo tải nhanh hơn.\n"
            + "D. Vì <iframe> giúp quảng cáo tương thích với nhiều trình duyệt hơn.",
            "Tại sao thẻ <iframe> được dùng để nhúng các ứng dụng web tương tác?\n"
            + "\n"
            + "A. Vì <iframe> giúp tách biệt ứng dụng khỏi trang web hiện tại.\n"
            + "B. Vì <iframe> là cách duy nhất để nhúng ứng dụng.\n"
            + "C. Vì <iframe> giúp ứng dụng tải nhanh hơn.\n"
            + "D. Vì <iframe> giúp ứng dụng tương thích với nhiều trình duyệt hơn."
        });

        TITLE_MAP.put("Lưu Ý Khi Sử Dụng Iframe", new String[]{
            "Điều gì cần lưu ý khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Vấn đề bảo mật.\n"
            + "B. Hiệu suất trang web.\n"
            + "C. Khả năng tương thích với các thiết bị di động.\n"
            + "D. Tất cả các phương án trên.",
            "Tại sao cần lưu ý vấn đề bảo mật khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Vì <iframe> có thể chứa mã độc.\n"
            + "B. Vì <iframe> có thể bị tấn công XSS.\n"
            + "C. Vì <iframe> có thể bị tấn công clickjacking.\n"
            + "D. Tất cả các phương án trên.",
            "Tại sao cần lưu ý hiệu suất trang web khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Vì <iframe> có thể làm chậm tải trang.\n"
            + "B. Vì <iframe> có thể làm tăng dung lượng trang.\n"
            + "C. Vì <iframe> có thể làm giảm trải nghiệm người dùng.\n"
            + "D. Tất cả các phương án trên.",
            "Tại sao cần lưu ý khả năng tương thích với các thiết bị di động khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Vì <iframe> có thể không hiển thị đúng cách trên di động.\n"
            + "B. Vì <iframe> có thể làm giảm hiệu suất trên di động.\n"
            + "C. Vì <iframe> có thể làm giảm trải nghiệm người dùng trên di động.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để cải thiện bảo mật khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Chỉ nhúng nội dung từ các nguồn đáng tin cậy.\n"
            + "B. Sử dụng thuộc tính sandbox của thẻ <iframe>.\n"
            + "C. Sử dụng thuộc tính referrerpolicy của thẻ <iframe>.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để cải thiện hiệu suất trang web khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Chỉ nhúng nội dung cần thiết.\n"
            + "B. Sử dụng thuộc tính loading của thẻ <iframe>.\n"
            + "C. Sử dụng thuộc tính lazyload của thẻ <iframe>.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để cải thiện khả năng tương thích với các thiết bị di động khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Sử dụng CSS để điều chỉnh kích thước <iframe>.\n"
            + "B. Sử dụng thuộc tính media của CSS.\n"
            + "C. Sử dụng JavaScript để điều chỉnh kích thước <iframe>.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để kiểm tra xem <iframe> có chứa mã độc hay không?\n"
            + "\n"
            + "A. Xem mã nguồn của trang web được nhúng.\n"
            + "B. Sử dụng các công cụ kiểm tra mã độc trực tuyến.\n"
            + "C. Sử dụng các công cụ kiểm tra bảo mật web.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để ngăn chặn tấn công XSS khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Sử dụng Content Security Policy (CSP).\n"
            + "B. Chỉ nhúng nội dung từ các nguồn đáng tin cậy.\n"
            + "C. Sử dụng thuộc tính sandbox của thẻ <iframe>.\n"
            + "D. Tất cả các phương án trên.",
            "Làm thế nào để ngăn chặn tấn công clickjacking khi sử dụng thẻ <iframe>?\n"
            + "\n"
            + "A. Sử dụng X-Frame-Options header.\n"
            + "B. Sử dụng JavaScript để kiểm tra xem trang web có được nhúng hay không.\n"
            + "C. Sử dụng CSS để ẩn <iframe>.\n"
            + "D. Tất cả các phương án trên."
        });

        TITLE_MAP.put("Cấu Trúc Cơ Bản Của Bảng", new String[]{
            "Thẻ <table> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo danh sách.\n"
            + "B. Tạo bảng.\n"
            + "C. Tạo đoạn văn bản.\n"
            + "D. Tạo tiêu đề.",
            "Thẻ <tr> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề bảng.\n"
            + "B. Tạo hàng trong bảng.\n"
            + "C. Tạo cột trong bảng.\n"
            + "D. Tạo ô trong bảng.",
            "Thẻ <th> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề bảng.\n"
            + "B. Tạo hàng trong bảng.\n"
            + "C. Tạo cột trong bảng.\n"
            + "D. Tạo ô trong bảng.",
            "Thẻ <td> được dùng để làm gì?\n"
            + "\n"
            + "A. Tạo tiêu đề bảng.\n"
            + "B. Tạo hàng trong bảng.\n"
            + "C. Tạo cột trong bảng.\n"
            + "D. Tạo ô trong bảng.",
            "Làm thế nào để tạo một bảng trong HTML?\n"
            + "\n"
            + "A. Dùng thẻ <ul>.\n"
            + "B. Dùng thẻ <table>.\n"
            + "C. Dùng thẻ <p>.\n"
            + "D. Dùng thẻ <h1>.",
            "Làm thế nào để tạo một hàng trong bảng?\n"
            + "\n"
            + "A. Dùng thẻ <th>.\n"
            + "B. Dùng thẻ <tr>.\n"
            + "C. Dùng thẻ <td>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một tiêu đề bảng?\n"
            + "\n"
            + "A. Dùng thẻ <th>.\n"
            + "B. Dùng thẻ <tr>.\n"
            + "C. Dùng thẻ <td>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một ô trong bảng?\n"
            + "\n"
            + "A. Dùng thẻ <th>.\n"
            + "B. Dùng thẻ <tr>.\n"
            + "C. Dùng thẻ <td>.\n"
            + "D. Dùng thẻ <table>.",
            "Làm thế nào để tạo một tiêu đề bảng trải dài nhiều cột?\n"
            + "\n"
            + "A. Dùng thuộc tính colspan của thẻ <th>.\n"
            + "B. Dùng thuộc tính rowspan của thẻ <th>.\n"
            + "C. Dùng thuộc tính width của thẻ <th>.\n"
            + "D. Dùng thuộc tính height của thẻ <th>.",
            "Làm thế nào để tạo một tiêu đề bảng trải dài nhiều hàng?\n"
            + "\n"
            + "A. Dùng thuộc tính colspan của thẻ <th>.\n"
            + "B. Dùng thuộc tính rowspan của thẻ <th>.\n"
            + "C. Dùng thuộc tính width của thẻ <th>.\n"
            + "D. Dùng thuộc tính height của thẻ <th>."
        });
        TITLE_MAP.put("Các Thuộc Tính Của Bảng", new String[]{
            "Thuộc tính nào của thẻ <table> dùng để chỉ định đường viền của bảng?\n"
            + "\n"
            + "A. border.\n"
            + "B. width.\n"
            + "C. height.\n"
            + "D. align.",
            "Thuộc tính nào của thẻ <table> dùng để chỉ định chiều rộng của bảng?\n"
            + "\n"
            + "A. border.\n"
            + "B. width.\n"
            + "C. height.\n"
            + "D. align.",
            "Thuộc tính nào của thẻ <table> dùng để chỉ định chiều cao của bảng?\n"
            + "\n"
            + "A. border.\n"
            + "B. width.\n"
            + "C. height.\n"
            + "D. align.",
            "Thuộc tính nào của thẻ <table> dùng để căn chỉnh bảng?\n"
            + "\n"
            + "A. border.\n"
            + "B. width.\n"
            + "C. height.\n"
            + "D. align.",
            "Thuộc tính nào của thẻ <td> dùng để chỉ định ô trải dài nhiều cột?\n"
            + "\n"
            + "A. colspan.\n"
            + "B. rowspan.\n"
            + "C. width.\n"
            + "D. height.",
            "Thuộc tính nào của thẻ <td> dùng để căn chỉnh nội dung trong ô?\n"
            + "\n"
            + "A. align.\n"
            + "B. valign.\n"
            + "C. width.\n"
            + "D. height.",
            "Thuộc tính nào của thẻ <td> dùng để căn chỉnh nội dung theo chiều dọc trong ô?\n"
            + "\n"
            + "A. align.\n"
            + "B. valign.\n"
            + "C. width.\n"
            + "D. height.",
            "Làm thế nào để tạo một đường viền cho bảng?\n"
            + "\n"
            + "A. Dùng thuộc tính border của thẻ <table>.\n"
            + "B. Dùng thuộc tính width của thẻ <table>.\n"
            + "C. Dùng thuộc tính height của thẻ <table>.\n"
            + "D. Dùng thuộc tính align của thẻ <table>.",
            "Làm thế nào để tạo một ô trải dài nhiều cột?\n"
            + "\n"
            + "A. Dùng thuộc tính colspan của thẻ <td>.\n"
            + "B. Dùng thuộc tính rowspan của thẻ <td>.\n"
            + "C. Dùng thuộc tính width của thẻ <td>.\n"
            + "D. Dùng thuộc tính height của thẻ <td>.",
            "Làm thế nào để tạo một ô trải dài nhiều hàng?\n"
            + "\n"
            + "A. Dùng thuộc tính colspan của thẻ <td>.\n"
            + "B. Dùng thuộc tính rowspan của thẻ <td>.\n"
            + "C. Dùng thuộc tính width của thẻ <td>.\n"
            + "D. Dùng thuộc tính height của thẻ <td>."
        });
        TITLE_MAP.put("Bảng Nâng Cao", new String[]{
            "Thuộc tính nào dùng để gộp nhiều cột trong bảng HTML?\n"
            + "\n"
            + "A. rowspan.\n"
            + "B. colspan.\n"
            + "C. merge.\n"
            + "D. join.",
            "Thuộc tính nào dùng để gộp nhiều dòng trong bảng HTML?\n"
            + "\n"
            + "A. colspan.\n"
            + "B. rowspan.\n"
            + "C. joinrow.\n"
            + "D. mergedown.",
            "Thẻ nào dùng để định nghĩa tiêu đề của bảng?\n"
            + "\n"
            + "A. <thead>.\n"
            + "B. <tbody>.\n"
            + "C. <tfoot>.\n"
            + "D. <th>.",
            "Thuộc tính nào xác định đường viền của bảng?\n"
            + "\n"
            + "A. width.\n"
            + "B. border.\n"
            + "C. cellspacing.\n"
            + "D. padding.",
            "Thẻ nào dùng để nhóm nội dung phần thân của bảng?\n"
            + "\n"
            + "A. <thead>.\n"
            + "B. <tbody>.\n"
            + "C. <tfoot>.\n"
            + "D. <th>.",
            "Thuộc tính nào điều chỉnh khoảng cách giữa các ô bảng?\n"
            + "\n"
            + "A. cellpadding.\n"
            + "B. cellspacing.\n"
            + "C. margin.\n"
            + "D. padding.",
            "Thuộc tính nào điều chỉnh khoảng cách bên trong ô bảng?\n"
            + "\n"
            + "A. margin.\n"
            + "B. padding.\n"
            + "C. cellpadding.\n"
            + "D. cellspacing.",
            "Thẻ nào dùng để định nghĩa phần chân bảng?\n"
            + "\n"
            + "A. <thead>.\n"
            + "B. <tbody>.\n"
            + "C. <tfoot>.\n"
            + "D. <tfootnote>.",
            "Thuộc tính nào xác định chiều rộng bảng?\n"
            + "\n"
            + "A. height.\n"
            + "B. width.\n"
            + "C. size.\n"
            + "D. scale.",
            "Để làm bảng gọn gàng và dễ đọc, nên sử dụng thẻ nào để nhóm dữ liệu liên quan?\n"
            + "\n"
            + "A. <thead>, <tbody>, <tfoot>.\n"
            + "B. <header>, <main>, <footer>.\n"
            + "C. <section>, <article>, <aside>.\n"
            + "D. <div>, <span>, <p>.",});
        TITLE_MAP.put("Cấu Trúc Cơ Bản Của Biểu Mẫu", new String[]{
            "Thẻ HTML nào được dùng để tạo biểu mẫu?\n"
            + "\n"
            + "A. <div>.\n"
            + "B. <form>.\n"
            + "C. <input>.\n"
            + "D. <section>.",
            "Thuộc tính nào của thẻ <form> xác định địa chỉ gửi dữ liệu?\n"
            + "\n"
            + "A. method.\n"
            + "B. action.\n"
            + "C. enctype.\n"
            + "D. target.",
            "Thuộc tính nào của thẻ <form> xác định phương thức gửi dữ liệu?\n"
            + "\n"
            + "A. action.\n"
            + "B. method.\n"
            + "C. enctype.\n"
            + "D. target.",
            "Thuộc tính method có giá trị phổ biến nào?\n"
            + "\n"
            + "A. GET và POST.\n"
            + "B. PUT và DELETE.\n"
            + "C. SEND và RECEIVE.\n"
            + "D. FETCH và PUSH.",
            "Khi muốn gửi file qua biểu mẫu, phải dùng thuộc tính enctype với giá trị nào?\n"
            + "\n"
            + "A. text/plain.\n"
            + "B. application/json.\n"
            + "C. multipart/form-data.\n"
            + "D. application/x-www-form-urlencoded.",
            "Thẻ nào dùng để tạo nút gửi dữ liệu trong biểu mẫu?\n"
            + "\n"
            + "A. <button type=\"submit\">.\n"
            + "B. <input type=\"reset\">.\n"
            + "C. <select>.\n"
            + "D. <label>.",
            "Thuộc tính nào của form để mở kết quả trong cửa sổ mới?\n"
            + "\n"
            + "A. method=\"new\".\n"
            + "B. action=\"_blank\".\n"
            + "C. target=\"_blank\".\n"
            + "D. enctype=\"blank\".",
            "Thẻ nào dùng để nhóm nhiều trường nhập liệu lại với nhau?\n"
            + "\n"
            + "A. <div>.\n"
            + "B. <fieldset>.\n"
            + "C. <section>.\n"
            + "D. <legend>.",
            "Thẻ <legend> dùng để làm gì trong biểu mẫu?\n"
            + "\n"
            + "A. Mô tả ý nghĩa của một nhóm trường.\n"
            + "B. Tạo đường viền cho form.\n"
            + "C. Định dạng font chữ.\n"
            + "D. Tạo tiêu đề trang web.",
            "Khi khai báo <input>, thuộc tính name có vai trò gì?\n"
            + "\n"
            + "A. Đặt giá trị mặc định.\n"
            + "B. Xác định tên trường gửi về server.\n"
            + "C. Xác định loại dữ liệu nhập.\n"
            + "D. Xác định kiểu hiển thị.",});
        TITLE_MAP.put("Các Loại Trường Nhập", new String[]{
            "Loại trường nhập nào dùng cho văn bản ngắn?\n"
            + "\n"
            + "A. <input type=\"text\">.\n"
            + "B. <input type=\"password\">.\n"
            + "C. <textarea>.\n"
            + "D. <input type=\"checkbox\">.",
            "Loại trường nhập nào dùng để nhập mật khẩu?\n"
            + "\n"
            + "A. <input type=\"email\">.\n"
            + "B. <input type=\"text\">.\n"
            + "C. <input type=\"password\">.\n"
            + "D. <input type=\"number\">.",
            "Trường nhập nào cho phép chọn nhiều mục cùng lúc?\n"
            + "\n"
            + "A. <select> với multiple.\n"
            + "B. <input type=\"radio\">.\n"
            + "C. <input type=\"text\">.\n"
            + "D. <button>.",
            "Trường nhập nào phù hợp chọn một giá trị trong nhiều tùy chọn?\n"
            + "\n"
            + "A. Checkbox.\n"
            + "B. Radio button.\n"
            + "C. Textarea.\n"
            + "D. Password.",
            "Loại trường nào cho phép chọn file từ máy tính?\n"
            + "\n"
            + "A. <input type=\"file\">.\n"
            + "B. <input type=\"text\">.\n"
            + "C. <input type=\"url\">.\n"
            + "D. <input type=\"checkbox\">.",
            "Trường nhập nào dùng để chọn ngày?\n"
            + "\n"
            + "A. <input type=\"time\">.\n"
            + "B. <input type=\"date\">.\n"
            + "C. <input type=\"week\">.\n"
            + "D. <input type=\"month\">.",
            "Trường nhập nào phù hợp để nhập email?\n"
            + "\n"
            + "A. <input type=\"url\">.\n"
            + "B. <input type=\"text\">.\n"
            + "C. <input type=\"email\">.\n"
            + "D. <input type=\"search\">.",
            "Loại trường nào cho phép nhập số?\n"
            + "\n"
            + "A. <input type=\"text\">.\n"
            + "B. <input type=\"number\">.\n"
            + "C. <input type=\"password\">.\n"
            + "D. <input type=\"file\">.",
            "Loại trường nào phù hợp cho tìm kiếm?\n"
            + "\n"
            + "A. <input type=\"search\">.\n"
            + "B. <input type=\"text\">.\n"
            + "C. <input type=\"email\">.\n"
            + "D. <input type=\"checkbox\">.",
            "Loại trường nhập nào dùng để nhập URL trang web?\n"
            + "\n"
            + "A. <input type=\"file\">.\n"
            + "B. <input type=\"email\">.\n"
            + "C. <input type=\"url\">.\n"
            + "D. <input type=\"checkbox\">.",});
        TITLE_MAP.put("Các Thuộc Tính Khác Của Thẻ <form>", new String[]{
            "Thuộc tính autocomplete của <form> dùng để làm gì?\n"
            + "\n"
            + "A. Cho phép trình duyệt lưu trữ và tự động điền dữ liệu.\n"
            + "B. Tạo hiệu ứng động cho form.\n"
            + "C. Bắt buộc người dùng nhập dữ liệu.\n"
            + "D. Tự động gửi dữ liệu sau khi nhập.",
            "Thuộc tính novalidate trong <form> có chức năng gì?\n"
            + "\n"
            + "A. Ngăn không cho gửi biểu mẫu.\n"
            + "B. Bỏ qua kiểm tra tính hợp lệ trước khi gửi.\n"
            + "C. Kiểm tra lỗi chính tả.\n"
            + "D. Xác thực tài khoản người dùng.",
            "Thuộc tính target=\"_blank\" có ý nghĩa gì?\n"
            + "\n"
            + "A. Gửi biểu mẫu ẩn.\n"
            + "B. Mở kết quả gửi ở tab mới.\n"
            + "C. Tải lại trang hiện tại.\n"
            + "D. Hiển thị thông báo popup.",
            "Thuộc tính enctype mặc định của <form> là gì?\n"
            + "\n"
            + "A. multipart/form-data.\n"
            + "B. application/json.\n"
            + "C. text/plain.\n"
            + "D. application/x-www-form-urlencoded.",
            "Thuộc tính method=\"post\" khác method=\"get\" ở điểm nào?\n"
            + "\n"
            + "A. Dữ liệu hiển thị trên URL.\n"
            + "B. Dữ liệu gửi ngầm, không hiển thị.\n"
            + "C. Không gửi được file.\n"
            + "D. Không cho phép nhập liệu.",
            "Thuộc tính required được dùng cho mục đích nào?\n"
            + "\n"
            + "A. Bắt buộc nhập liệu.\n"
            + "B. Tự động hoàn thành.\n"
            + "C. Giới hạn độ dài ký tự.\n"
            + "D. Đặt giá trị mặc định.",
            "Thuộc tính readonly có ý nghĩa gì?\n"
            + "\n"
            + "A. Cho phép nhập và chỉnh sửa.\n"
            + "B. Chỉ cho đọc, không cho sửa.\n"
            + "C. Bắt buộc phải nhập dữ liệu.\n"
            + "D. Tự động gửi dữ liệu.",
            "Thuộc tính disabled có tác dụng gì với các trường nhập?\n"
            + "\n"
            + "A. Trường nhập sẽ ẩn đi.\n"
            + "B. Trường nhập sẽ bị khóa, không chỉnh sửa được.\n"
            + "C. Trường nhập sẽ bắt buộc nhập.\n"
            + "D. Trường nhập sẽ được tự động hoàn thành.",
            "Thuộc tính placeholder dùng để làm gì?\n"
            + "\n"
            + "A. Hiển thị văn bản mẫu bên trong trường nhập.\n"
            + "B. Xác định kiểu dữ liệu nhập.\n"
            + "C. Tự động kiểm tra lỗi nhập.\n"
            + "D. Tạo nhãn cho form.",
            "Thuộc tính maxlength quy định điều gì?\n"
            + "\n"
            + "A. Số ký tự tối đa được nhập.\n"
            + "B. Số ký tự tối thiểu.\n"
            + "C. Chiều rộng của trường nhập.\n"
            + "D. Số lần gửi form tối đa.",});
        //HTML Nâng Cao
        TITLE_MAP.put("HTML Semantic", new String[]{
            "HTML semantic là gì?\n\n"
            + "A. Cách viết CSS hiệu quả.\n"
            + "B. Cấu trúc HTML có ý nghĩa mô tả nội dung.\n"
            + "C. Công nghệ mới trong JavaScript.\n"
            + "D. Phương pháp tối ưu hóa hình ảnh.",
            "Thẻ <header> thường chứa nội dung nào?\n\n"
            + "A. Chân trang.\n"
            + "B. Menu điều hướng và tiêu đề.\n"
            + "C. Nội dung bài viết.\n"
            + "D. Các liên kết ngoài.",
            "Thẻ <footer> dùng để làm gì?\n\n"
            + "A. Tạo banner quảng cáo.\n"
            + "B. Hiển thị phần cuối trang như bản quyền.\n"
            + "C. Chứa tiêu đề bài viết.\n"
            + "D. Tạo bảng dữ liệu.",
            "Thẻ <nav> trong HTML có chức năng gì?\n\n"
            + "A. Tạo danh sách bài viết.\n"
            + "B. Xác định khu vực điều hướng.\n"
            + "C. Chứa nội dung quảng cáo.\n"
            + "D. Hiển thị ảnh nền.",
            "Thẻ <article> phù hợp cho nội dung nào?\n\n"
            + "A. Một phần nhỏ trong footer.\n"
            + "B. Một bài viết độc lập.\n"
            + "C. Một biểu mẫu đăng ký.\n"
            + "D. Một thẻ hình ảnh.",
            "Thẻ <section> nên dùng khi nào?\n\n"
            + "A. Để chia nhóm nội dung có liên quan.\n"
            + "B. Để tạo bảng dữ liệu.\n"
            + "C. Để nhúng video.\n"
            + "D. Để định nghĩa nút bấm.",
            "Semantic HTML giúp ích gì cho SEO?\n\n"
            + "A. Làm trang tải chậm hơn.\n"
            + "B. Giúp công cụ tìm kiếm hiểu nội dung rõ hơn.\n"
            + "C. Giảm chất lượng hiển thị trang.\n"
            + "D. Giảm chi phí hosting.",
            "Việc sử dụng semantic HTML có lợi gì với người dùng?\n\n"
            + "A. Trang web khó đọc hơn.\n"
            + "B. Tăng khả năng lập chỉ mục và thân thiện người dùng.\n"
            + "C. Làm trang dễ bị lỗi.\n"
            + "D. Ẩn bớt nội dung không cần thiết.",
            "Tại sao semantic HTML hỗ trợ tìm kiếm bằng giọng nói tốt hơn?\n\n"
            + "A. Vì tải trang nhanh hơn.\n"
            + "B. Vì cấu trúc nội dung rõ ràng cho máy học.\n"
            + "C. Vì nén dữ liệu tốt hơn.\n"
            + "D. Vì dùng ít thẻ hơn.",
            "Thẻ nào sau đây KHÔNG phải là thẻ semantic HTML?\n\n"
            + "A. <div>.\n"
            + "B. <section>.\n"
            + "C. <article>.\n"
            + "D. <header>.",});
        TITLE_MAP.put("<header>", new String[]{
            "Thẻ <header> thường được sử dụng để làm gì?",
            "A. Chứa phần đầu trang web\n"
            + "B. Chứa chân trang web\n"
            + "C. Chứa nội dung chính\n"
            + "D. Chứa menu điều hướng",
            "Một trang web có thể có bao nhiêu thẻ <header>?",
            "A. Chỉ 1\n"
            + "B. Tối đa 3\n"
            + "C. Không giới hạn\n"
            + "D. Phụ thuộc vào trình duyệt",
            "Nội dung nào thường KHÔNG đặt trong <header>?",
            "A. Logo website\n"
            + "B. Thanh tìm kiếm\n"
            + "C. Thông tin bản quyền\n"
            + "D. Tiêu đề bài viết",
            "Thẻ <header> khác gì so với <head>?",
            "A. <header> hiển thị trên trang, <head> không hiển thị\n"
            + "B. <head> chứa metadata, <header> chứa nội dung\n"
            + "C. Cả A và B\n"
            + "D. Không có khác biệt",
            "Có thể đặt <header> trong <article> không?",
            "A. Không thể\n"
            + "B. Có thể\n"
            + "C. Chỉ khi dùng thêm CSS\n"
            + "D. Chỉ trên HTML5",
            "Thuộc tính ARIA nào phù hợp với <header>?",
            "A. role=\"header\"\n"
            + "B. role=\"banner\"\n"
            + "C. role=\"navigation\"\n"
            + "D. role=\"main\"",
            "Phần tử nào thường được đặt trong <header>?",
            "A. <nav>\n"
            + "B. <footer>\n"
            + "C. <article>\n"
            + "D. <aside>",
            "Thẻ <header> có thể chứa các heading (<h1>-<h6>) không?",
            "A. Không thể\n"
            + "B. Có thể\n"
            + "C. Chỉ chứa <h1>\n"
            + "D. Chỉ chứa <h6>",
            "Lợi ích chính của việc dùng <header> là gì?",
            "A. Cải thiện SEO\n"
            + "B. Tăng tốc độ trang\n"
            + "C. Dễ dàng styling với CSS\n"
            + "D. Cả A và C",
            "Trường hợp nào KHÔNG nên dùng <header>?",
            "A. Khi cần nhóm các tiêu đề\n"
            + "B. Khi cần tạo chân trang\n"
            + "C. Khi cần tạo phần giới thiệu\n"
            + "D. Khi cần tạo menu"
        });
        TITLE_MAP.put("<footer>", new String[]{
            "Thẻ <footer> thường chứa nội dung gì?",
            "A. Thông tin bản quyền\n"
            + "B. Liên kết liên quan\n"
            + "C. Thông tin tác giả\n"
            + "D. Tất cả các đáp án trên",
            "Một trang có thể có bao nhiêu thẻ <footer>?",
            "A. Chỉ 1\n"
            + "B. Tối đa 2\n"
            + "C. Không giới hạn\n"
            + "D. Phụ thuộc vào số section",
            "Có thể đặt <footer> trong <article> không?",
            "A. Không thể\n"
            + "B. Có thể\n"
            + "C. Chỉ khi dùng HTML5\n"
            + "D. Chỉ khi có JavaScript",
            "Thuộc tính ARIA nào phù hợp với <footer>?",
            "A. role=\"footer\"\n"
            + "B. role=\"contentinfo\"\n"
            + "C. role=\"navigation\"\n"
            + "D. role=\"complementary\"",
            "Phần tử nào thường KHÔNG đặt trong <footer>?",
            "A. Địa chỉ liên hệ\n"
            + "B. Menu chính\n"
            + "C. Biểu mẫu đăng ký\n"
            + "D. Tiêu đề bài viết",
            "Thẻ <footer> có thể chứa các heading (<h1>-<h6>) không?",
            "A. Không thể\n"
            + "B. Có thể\n"
            + "C. Chỉ chứa <h6>\n"
            + "D. Chỉ chứa heading khi có <section>",
            "Lợi ích chính của <footer> là gì?",
            "A. Cấu trúc HTML rõ ràng\n"
            + "B. Cải thiện trải nghiệm người dùng\n"
            + "C. Tốt cho accessibility\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên dùng nhiều thẻ <footer>?",
            "A. Khi có nhiều section/article\n"
            + "B. Khi trang quá dài\n"
            + "C. Khi cần nhiều thông tin\n"
            + "D. Không nên dùng nhiều",
            "Thẻ <footer> có thể đặt ở đâu?",
            "A. Cuối <body>\n"
            + "B. Trong <article>\n"
            + "C. Trong <section>\n"
            + "D. Tất cả các vị trí trên",
            "CSS nào thường áp dụng cho <footer>?",
            "A. margin-top\n"
            + "B. background-color\n"
            + "C. padding\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("<nav>", new String[]{
            "Thẻ <nav> dùng để làm gì?",
            "A. Chứa các liên kết điều hướng\n"
            + "B. Chứa nội dung phụ\n"
            + "C. Chứa bài viết\n"
            + "D. Chứa chân trang",
            "Mọi nhóm liên kết đều cần đặt trong <nav> không?",
            "A. Đúng\n"
            + "B. Sai, chỉ nhóm liên kết chính\n"
            + "C. Chỉ khi có nhiều hơn 3 liên kết\n"
            + "D. Chỉ khi dùng trên mobile",
            "Vị trí nào thường đặt thẻ <nav>?",
            "A. Trong <header>\n"
            + "B. Trong <footer>\n"
            + "C. Cả A và B\n"
            + "D. Chỉ ở đầu trang",
            "Thuộc tính ARIA nào phù hợp với <nav>?",
            "A. role=\"menu\"\n"
            + "B. role=\"navigation\"\n"
            + "C. role=\"link\"\n"
            + "D. role=\"banner\"",
            "Phần tử nào thường đặt trong <nav>?",
            "A. <ul> hoặc <ol>\n"
            + "B. <div>\n"
            + "C. <p>\n"
            + "D. <article>",
            "Một trang có thể có bao nhiêu thẻ <nav>?",
            "A. Chỉ 1\n"
            + "B. Tối đa 3\n"
            + "C. Không giới hạn\n"
            + "D. Phụ thuộc vào số menu",
            "Thẻ <nav> có thể đặt ở đâu?",
            "A. Trong <header>\n"
            + "B. Trong <footer>\n"
            + "C. Trong <aside>\n"
            + "D. Tất cả các vị trí trên",
            "Lợi ích chính của <nav> là gì?",
            "A. Giúp trình đọc màn hình nhận biết\n"
            + "B. Dễ styling với CSS\n"
            + "C. Cải thiện SEO\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào KHÔNG cần dùng <nav>?",
            "A. Nhóm liên kết trong footer\n"
            + "B. Menu chính\n"
            + "C. Breadcrumb\n"
            + "D. Pagination",
            "CSS nào thường áp dụng cho <nav>?",
            "A. display: flex\n"
            + "B. background-color\n"
            + "C. padding/margin\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("<article>", new String[]{
            "Thẻ <article> dùng để làm gì?",
            "A. Chứa nội dung độc lập\n"
            + "B. Chứa nội dung phụ\n"
            + "C. Chứa menu điều hướng\n"
            + "D. Chứa thông tin tác giả",
            "Nội dung nào phù hợp với <article>?",
            "A. Bài báo\n"
            + "B. Bài đăng blog\n"
            + "C. Bình luận\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ <article> có thể lồng trong <article> không?",
            "A. Không thể\n"
            + "B. Có thể\n"
            + "C. Chỉ khi có cùng tác giả\n"
            + "D. Chỉ trên trình duyệt mới",
            "Thuộc tính ARIA nào phù hợp với <article>?",
            "A. role=\"content\"\n"
            + "B. role=\"article\"\n"
            + "C. role=\"main\"\n"
            + "D. role=\"section\"",
            "Phần tử nào thường có trong <article>?",
            "A. <header>\n"
            + "B. <footer>\n"
            + "C. <section>\n"
            + "D. Tất cả các đáp án trên",
            "Sự khác biệt giữa <article> và <section>?",
            "A. <article> độc lập, <section> phụ thuộc ngữ cảnh\n"
            + "B. <section> quan trọng hơn\n"
            + "C. <article> chỉ dùng cho tin tức\n"
            + "D. Không có khác biệt",
            "Một trang có thể có bao nhiêu thẻ <article>?",
            "A. Chỉ 1\n"
            + "B. Tối đa 3\n"
            + "C. Không giới hạn\n"
            + "D. Phụ thuộc vào nội dung",
            "Lợi ích chính của <article> là gì?",
            "A. Cải thiện SEO\n"
            + "B. Tăng khả năng accessibility\n"
            + "C. Dễ quản lý nội dung\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào KHÔNG nên dùng <article>?",
            "A. Nội dung không độc lập\n"
            + "B. Nội dung ngắn\n"
            + "C. Phần giới thiệu\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào thường dùng với <article>?",
            "A. id\n"
            + "B. class\n"
            + "C. aria-labelledby\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("<section>", new String[]{
            "Thẻ <section> dùng để làm gì?",
            "A. Nhóm các nội dung liên quan\n"
            + "B. Tạo phần chứa độc lập\n"
            + "C. Đánh dấu phần phụ\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên dùng <section> thay vì <div>?",
            "A. Khi cần ngữ nghĩa rõ ràng\n"
            + "B. Khi cần styling\n"
            + "C. Khi dùng JavaScript\n"
            + "D. Khi làm animation",
            "<section> khác <article> ở điểm nào?",
            "A. <section> không độc lập\n"
            + "B. <article> có thể chứa <section>\n"
            + "C. <section> dùng cho nhóm nội dung\n"
            + "D. Tất cả các đáp án trên",
            "Một <section> nên có:",
            "A. Tiêu đề (heading)\n"
            + "B. Nội dung liên quan\n"
            + "C. Cả A và B\n"
            + "D. Không cần yêu cầu gì",
            "Có thể lồng <section> trong <section> không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi có ID\n"
            + "D. Chỉ tối đa 3 cấp",
            "Thuộc tính ARIA phù hợp cho <section>?",
            "A. role=\"section\"\n"
            + "B. role=\"region\"\n"
            + "C. role=\"group\"\n"
            + "D. role=\"content\"",
            "<section> thường KHÔNG dùng để:",
            "A. Nhóm widget\n"
            + "B. Tạo layout\n"
            + "C. Chứa nội dung độc lập\n"
            + "D. Đánh dấu phần chính",
            "Lợi ích chính của <section>?",
            "A. Cải thiện SEO\n"
            + "B. Tăng accessibility\n"
            + "C. Dễ quản lý code\n"
            + "D. Tất cả các đáp án trên",
            "Số lượng <section> trên 1 trang nên:",
            "A. Ít hơn 5\n"
            + "B. Tùy nội dung\n"
            + "C. Bằng số heading\n"
            + "D. Luôn là số chẵn",
            "CSS nào thường dùng với <section>?",
            "A. margin/padding\n"
            + "B. background\n"
            + "C. border\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Semantic HTML là gì", new String[]{
            "Semantic HTML là:",
            "A. HTML sử dụng thẻ có ý nghĩa\n"
            + "B. HTML chỉ dùng div/span\n"
            + "C. HTML với nhiều class\n"
            + "D. HTML không dùng CSS",
            "Lợi ích chính của Semantic HTML?",
            "A. Máy tính hiểu nội dung\n"
            + "B. Code dễ đọc hơn\n"
            + "C. Tăng accessibility\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào KHÔNG phải semantic?",
            "A. <article>\n"
            + "B. <section>\n"
            + "C. <div>\n"
            + "D. <nav>",
            "Semantic HTML quan trọng với:",
            "A. Trình đọc màn hình\n"
            + "B. Công cụ tìm kiếm\n"
            + "C. Developer\n"
            + "D. Tất cả các đáp án trên",
            "Ví dụ về semantic element?",
            "A. <header>\n"
            + "B. <footer>\n"
            + "C. <time>\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ semantic cho hình ảnh?",
            "A. <img>\n"
            + "B. <picture>\n"
            + "C. <figure>\n"
            + "D. Tất cả các đáp án trên",
            "Semantic HTML giúp:",
            "A. Giảm code\n"
            + "B. Tăng tốc độ trang\n"
            + "C. Dễ bảo trì\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào semantic cho bảng?",
            "A. <table>\n"
            + "B. <ul>\n"
            + "C. <div>\n"
            + "D. <data>",
            "Cải thiện SEO bằng semantic HTML cách nào?",
            "A. Dùng thẻ heading đúng\n"
            + "B. Dùng thẻ section/article\n"
            + "C. Dùng alt cho ảnh\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào KHÔNG nên dùng thay thế semantic element?",
            "A. <div>\n"
            + "B. <span>\n"
            + "C. Cả A và B\n"
            + "D. Không có đáp án đúng"
        });
        TITLE_MAP.put("Giúp công cụ tìm kiếm hiểu rõ cấu trúc và nội dung trang", new String[]{
            "Cách tốt nhất để giúp bot hiểu cấu trúc trang?",
            "A. Dùng semantic HTML\n"
            + "B. Viết comment nhiều\n"
            + "C. Dùng nhiều div\n"
            + "D. Viết JS phức tạp",
            "Thẻ nào quan trọng nhất với SEO?",
            "A. <title>\n"
            + "B. <h1>\n"
            + "C. <main>\n"
            + "D. Tất cả các đáp án trên",
            "Công cụ tìm kiếm ưu tiên nội dung trong thẻ nào?",
            "A. <article>\n"
            + "B. <section>\n"
            + "C. <div>\n"
            + "D. Cả A và B",
            "Cách đánh dấu dữ liệu quan trọng?",
            "A. Schema.org\n"
            + "B. Microdata\n"
            + "C. JSON-LD\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào quan trọng với ảnh?",
            "A. alt\n"
            + "B. title\n"
            + "C. loading\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào giúp phân biệt nội dung chính/phụ?",
            "A. <main>\n"
            + "B. <aside>\n"
            + "C. Cả A và B\n"
            + "D. <div>",
            "Cải thiện khả năng crawl bằng cách nào?",
            "A. Sitemap.xml\n"
            + "B. Internal linking\n"
            + "C. Cấu trúc URL rõ ràng\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào giúp xác định tác giả?",
            "A. <author>\n"
            + "B. <meta author>\n"
            + "C. <address>\n"
            + "D. Không có thẻ riêng",
            "Công cụ tìm kiếm đánh giá cao:",
            "A. Nội dung có cấu trúc rõ\n"
            + "B. Code sạch\n"
            + "C. Tốc độ load\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào KHÔNG giúp SEO?",
            "A. <marquee>\n"
            + "B. <article>\n"
            + "C. <header>\n"
            + "D. <section>"
        });
        TITLE_MAP.put("Tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng", new String[]{
            "Cách tăng độ chính xác khi index?",
            "A. Dùng từ khóa phù hợp\n"
            + "B. Cấu trúc nội dung rõ\n"
            + "C. Meta description tốt\n"
            + "D. Tất cả các đáp án trên",
            "Yếu tố nào quan trọng với người dùng?",
            "A. Tốc độ tải\n"
            + "B. Giao diện rõ ràng\n"
            + "C. Nội dung chất lượng\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào giúp cải thiện trải nghiệm mobile?",
            "A. <meta viewport>\n"
            + "B. <picture>\n"
            + "C. <input type='tel'>\n"
            + "D. Tất cả các đáp án trên",
            "Cách tốt nhất để tăng tính thân thiện?",
            "A. Thiết kế responsive\n"
            + "B. Dùng semantic HTML\n"
            + "C. Tối ưu hình ảnh\n"
            + "D. Tất cả các đáp án trên",
            "Công cụ nào đánh giá tính thân thiện?",
            "A. Lighthouse\n"
            + "B. PageSpeed Insights\n"
            + "C. Cả A và B\n"
            + "D. W3C Validator",
            "Yếu tố nào ảnh hưởng đến chỉ mục?",
            "A. Internal linking\n"
            + "B. URL structure\n"
            + "C. Content freshness\n"
            + "D. Tất cả các đáp án trên",
            "Cách giúp bot hiểu nội dung tốt hơn?",
            "A. Dùng heading hợp lý\n"
            + "B. Structured data\n"
            + "C. Breadcrumbs\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào giúp tăng accessibility?",
            "A. <nav>\n"
            + "B. <header>\n"
            + "C. <main>\n"
            + "D. Tất cả các đáp án trên",
            "Tính năng nào thân thiện với người dùng?",
            "A. Dark mode\n"
            + "B. Font size điều chỉnh\n"
            + "C. Bàn phím điều hướng\n"
            + "D. Tất cả các đáp án trên",
            "Cách tăng độ chính xác khi index nội dung động?",
            "A. SSR\n"
            + "B. Dynamic rendering\n"
            + "C. Pre-rendering\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Hỗ trợ tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động", new String[]{
            "Cách tối ưu cho tìm kiếm giọng nói là gì?",
            "A. Sử dụng ngôn ngữ tự nhiên\n"
            + "B. Tối ưu tốc độ tải trang\n"
            + "C. Tối ưu cho thiết bị di động\n"
            + "D. Tất cả các đáp án trên",
            "Điều gì quan trọng khi tối ưu tìm kiếm bằng giọng nói?",
            "A. Câu trả lời ngắn gọn\n"
            + "B. Câu hỏi thường gặp (FAQ)\n"
            + "C. Từ khóa dạng hội thoại\n"
            + "D. Tất cả các đáp án trên",
            "Cách tối ưu tốt nhất cho thiết bị di động?",
            "A. Dùng AMP\n"
            + "B. Mobile-first design\n"
            + "C. Nén hình ảnh\n"
            + "D. Tất cả các đáp án trên",
            "Yếu tố nào giúp cải thiện tìm kiếm giọng nói?",
            "A. Schema Markup\n"
            + "B. Nội dung ngắn gọn\n"
            + "C. Câu hỏi tự nhiên\n"
            + "D. Tất cả các đáp án trên",
            "Cách tối ưu tốc độ tải trang?",
            "A. Giảm dung lượng ảnh\n"
            + "B. Sử dụng CDN\n"
            + "C. Tối ưu mã nguồn\n"
            + "D. Tất cả các đáp án trên",
            "Từ khóa nào phù hợp cho giọng nói?",
            "A. Câu hỏi tự nhiên\n"
            + "B. Câu trả lời ngắn\n"
            + "C. Từ khóa đuôi dài\n"
            + "D. Tất cả các đáp án trên",
            "Công cụ hỗ trợ tối ưu thiết bị di động?",
            "A. Google Mobile-Friendly Test\n"
            + "B. PageSpeed Insights\n"
            + "C. Lighthouse\n"
            + "D. Tất cả các đáp án trên",
            "Schema nào hỗ trợ giọng nói?",
            "A. FAQ Schema\n"
            + "B. How-to Schema\n"
            + "C. Local Business Schema\n"
            + "D. Tất cả các đáp án trên",
            "Đặc điểm nội dung tốt cho tìm kiếm giọng nói?",
            "A. Ngắn gọn, súc tích\n"
            + "B. Câu trả lời trực tiếp\n"
            + "C. Ngôn ngữ tự nhiên\n"
            + "D. Tất cả các đáp án trên",
            "Cách cải thiện trải nghiệm người dùng trên mobile?",
            "A. Thiết kế responsive\n"
            + "B. Font chữ dễ đọc\n"
            + "C. Nút bấm lớn, dễ thao tác\n"
            + "D. Tất cả các đáp án trên"
        });

        TITLE_MAP.put("Các thẻ <meta> quan trọng trong HTML", new String[]{
            "Thẻ meta nào xác định charset?",
            "A. <meta charset>\n"
            + "B. <meta name>\n"
            + "C. <meta http-equiv>\n"
            + "D. <meta viewport>",
            "Thẻ meta viewport dùng để làm gì?",
            "A. Thiết lập charset\n"
            + "B. Cấu hình giao diện mobile\n"
            + "C. Khai báo quyền tác giả\n"
            + "D. Định nghĩa từ khóa",
            "Thẻ meta description quan trọng vì?",
            "A. Hiển thị trên Google\n"
            + "B. Cải thiện CTR\n"
            + "C. Tóm tắt nội dung trang\n"
            + "D. Tất cả các đáp án trên",
            "Meta robots điều khiển điều gì?",
            "A. Indexing\n"
            + "B. Follow liên kết\n"
            + "C. Cả A và B\n"
            + "D. Giao diện hiển thị",
            "Thuộc tính nào phổ biến trong meta robots?",
            "A. noindex\n"
            + "B. nofollow\n"
            + "C. none\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ meta nào giúp mobile friendly?",
            "A. <meta name='viewport'>\n"
            + "B. <meta charset>\n"
            + "C. <meta description>\n"
            + "D. <meta robots>",
            "Meta tag nào liên quan SEO nhiều nhất?",
            "A. Meta title\n"
            + "B. Meta description\n"
            + "C. Meta robots\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ meta http-equiv dùng trong?",
            "A. Tự động chuyển trang\n"
            + "B. Đặt cookie\n"
            + "C. Định nghĩa ngôn ngữ\n"
            + "D. Tất cả các đáp án trên",
            "Tác dụng của meta name=author?",
            "A. Ghi tên tác giả\n"
            + "B. Ghi từ khóa\n"
            + "C. Ghi mô tả\n"
            + "D. Không có tác dụng",
            "Định nghĩa viewport phù hợp nhất?",
            "A. width=device-width\n"
            + "B. initial-scale=1.0\n"
            + "C. maximum-scale=1.0\n"
            + "D. Tất cả các đáp án trên"
        });

        TITLE_MAP.put("Meta Title và Meta Description", new String[]{
            "Meta title ảnh hưởng SEO thế nào?",
            "A. Tăng CTR\n"
            + "B. Xếp hạng từ khóa\n"
            + "C. Hiển thị rõ tiêu đề\n"
            + "D. Tất cả các đáp án trên",
            "Meta description tác động gì?",
            "A. Tăng CTR\n"
            + "B. Hiển thị snippet\n"
            + "C. Gợi ý nội dung\n"
            + "D. Tất cả các đáp án trên",
            "Chiều dài tối ưu meta title?",
            "A. 50-60 ký tự\n"
            + "B. 70-80 ký tự\n"
            + "C. 90-100 ký tự\n"
            + "D. Không giới hạn",
            "Chiều dài tối ưu meta description?",
            "A. 120-150 ký tự\n"
            + "B. 150-160 ký tự\n"
            + "C. 160-170 ký tự\n"
            + "D. 180-200 ký tự",
            "Meta title cần chứa gì?",
            "A. Từ khóa chính\n"
            + "B. Tên thương hiệu\n"
            + "C. Nội dung hấp dẫn\n"
            + "D. Tất cả các đáp án trên",
            "Meta description cần làm gì?",
            "A. Gây tò mò\n"
            + "B. Gợi ý nội dung\n"
            + "C. Kêu gọi hành động\n"
            + "D. Tất cả các đáp án trên",
            "Meta title trùng lặp gây gì?",
            "A. Giảm SEO\n"
            + "B. Khó index\n"
            + "C. CTR thấp\n"
            + "D. Tất cả các đáp án trên",
            "Đâu là đặc điểm meta description tốt?",
            "A. Ngắn gọn\n"
            + "B. Rõ ràng\n"
            + "C. Hấp dẫn\n"
            + "D. Tất cả các đáp án trên",
            "Thẻ nào ưu tiên hiển thị trên Google?",
            "A. Meta title\n"
            + "B. Meta description\n"
            + "C. URL\n"
            + "D. Heading",
            "Meta description không có thì sao?",
            "A. Google tự sinh\n"
            + "B. Bị lỗi SEO\n"
            + "C. Không index\n"
            + "D. Không ảnh hưởng"
        });

        TITLE_MAP.put("Meta Robots và Meta Viewport", new String[]{
            "Meta robots 'noindex' nghĩa là gì?",
            "A. Không cho index\n"
            + "B. Cấm follow link\n"
            + "C. Cho phép index\n"
            + "D. Tăng thứ hạng",
            "Meta robots 'nofollow' nghĩa là gì?",
            "A. Không truyền link juice\n"
            + "B. Không index\n"
            + "C. Cấm crawl\n"
            + "D. Tăng CTR",
            "Tác dụng chính của meta viewport?",
            "A. Tối ưu mobile\n"
            + "B. Tăng tốc độ tải\n"
            + "C. Tối ưu hình ảnh\n"
            + "D. Cải thiện content",
            "Viewport width=device-width nghĩa là?",
            "A. Bằng chiều rộng thiết bị\n"
            + "B. 100% desktop width\n"
            + "C. Cố định 800px\n"
            + "D. Không thay đổi",
            "Thuộc tính 'initial-scale=1' làm gì?",
            "A. Zoom 100% ban đầu\n"
            + "B. Zoom 200% ban đầu\n"
            + "C. Thu nhỏ trang\n"
            + "D. Phóng to trang",
            "Khi nào dùng meta robots noarchive?",
            "A. Cấm lưu cache\n"
            + "B. Cấm follow link\n"
            + "C. Cho phép index\n"
            + "D. Bắt buộc index",
            "Tối ưu viewport giúp gì?",
            "A. Trải nghiệm mobile\n"
            + "B. SEO tốt hơn\n"
            + "C. Hiển thị đẹp hơn\n"
            + "D. Tất cả các đáp án trên",
            "Không có viewport gây hậu quả gì?",
            "A. Trang bị lỗi trên mobile\n"
            + "B. Trang quá to hoặc nhỏ\n"
            + "C. Trải nghiệm xấu\n"
            + "D. Tất cả các đáp án trên",
            "Meta robots index, follow nghĩa là?",
            "A. Cho index và follow link\n"
            + "B. Cấm index nhưng follow\n"
            + "C. Cấm follow nhưng index\n"
            + "D. Cấm cả hai",
            "Viewport phù hợp với mobile-first là?",
            "A. width=device-width\n"
            + "B. initial-scale=1.0\n"
            + "C. user-scalable=no\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Meta Charset", new String[]{
            "Thẻ meta charset dùng để làm gì?",
            "A. Xác định bảng mã ký tự\n"
            + "B. Tăng tốc độ tải trang\n"
            + "C. Cải thiện SEO\n"
            + "D. B và C đúng",
            "Bảng mã phổ biến nhất hiện nay?",
            "A. UTF-8\n"
            + "B. ISO-8859-1\n"
            + "C. ASCII\n"
            + "D. Unicode",
            "Meta charset nên đặt ở đâu trong HTML?",
            "A. Cuối head\n"
            + "B. Đầu head\n"
            + "C. Cuối body\n"
            + "D. Đầu body",
            "Lợi ích của việc dùng UTF-8?",
            "A. Hỗ trợ đa ngôn ngữ\n"
            + "B. Tối ưu hóa tải trang\n"
            + "C. Giảm lỗi hiển thị ký tự\n"
            + "D. Tất cả các đáp án trên",
            "Khi thiếu meta charset có thể dẫn đến?",
            "A. Hiển thị sai chữ\n"
            + "B. Lỗi font\n"
            + "C. Trang bị chậm\n"
            + "D. A và B đúng",
            "Cách viết đúng cho meta charset?",
            "A. <meta charset='UTF-8'>\n"
            + "B. <charset meta='UTF-8'>\n"
            + "C. <meta UTF-8='charset'>\n"
            + "D. Cả ba đều đúng",
            "Meta charset có cần thiết cho SEO không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi dùng tiếng Anh\n"
            + "D. Chỉ khi dùng Unicode",
            "Meta charset có ảnh hưởng đến tốc độ tải trang?",
            "A. Có, nếu thiếu\n"
            + "B. Không\n"
            + "C. Chỉ với các ngôn ngữ đặc biệt\n"
            + "D. Cả A và C đúng",
            "Charset nào cũ nhưng vẫn còn dùng?",
            "A. ASCII\n"
            + "B. ISO-8859-1\n"
            + "C. UTF-16\n"
            + "D. Unicode",
            "Trình duyệt xử lý meta charset như thế nào?",
            "A. Khi đọc thẻ đầu tiên\n"
            + "B. Khi tải xong body\n"
            + "C. Sau khi load CSS\n"
            + "D. Sau khi load JavaScript"
        });

        TITLE_MAP.put("Giới thiệu Open Graph và Twitter Card", new String[]{
            "Open Graph dùng để làm gì?",
            "A. Mô tả nội dung web\n"
            + "B. Hiển thị đẹp trên mạng xã hội\n"
            + "C. Cải thiện SEO\n"
            + "D. Tất cả các đáp án trên",
            "Twitter Card là gì?",
            "A. Công cụ phân tích web\n"
            + "B. Thẻ meta đặc biệt cho Twitter\n"
            + "C. Plugin chia sẻ\n"
            + "D. Công cụ quảng cáo",
            "Thẻ nào là bắt buộc trong Open Graph?",
            "A. og:title\n"
            + "B. og:description\n"
            + "C. og:image\n"
            + "D. Tất cả đều quan trọng",
            "Lợi ích của Twitter Card?",
            "A. Hiển thị ảnh lớn\n"
            + "B. Thêm mô tả chi tiết\n"
            + "C. Tăng tỷ lệ click\n"
            + "D. Tất cả các đáp án trên",
            "Yếu tố nào KHÔNG phải của Open Graph?",
            "A. og:title\n"
            + "B. og:link\n"
            + "C. og:image\n"
            + "D. og:description",
            "Twitter hỗ trợ bao nhiêu loại Card chính?",
            "A. 2\n"
            + "B. 3\n"
            + "C. 4\n"
            + "D. 5",
            "Cách khai báo Open Graph trong HTML?",
            "A. Dùng thẻ <og>\n"
            + "B. Dùng meta property\n"
            + "C. Dùng link rel\n"
            + "D. Dùng script",
            "Twitter Card type phổ biến nhất?",
            "A. Summary Card\n"
            + "B. Large Image Summary\n"
            + "C. App Card\n"
            + "D. Player Card",
            "Open Graph được Facebook phát triển năm nào?",
            "A. 2005\n"
            + "B. 2008\n"
            + "C. 2010\n"
            + "D. 2012",
            "Có thể dùng cả Open Graph và Twitter Card cùng lúc?",
            "A. Đúng\n"
            + "B. Sai\n"
            + "C. Chỉ 1 cái thôi\n"
            + "D. Phụ thuộc CMS"
        });

        TITLE_MAP.put("Open Graph", new String[]{
            "Thẻ nào bắt buộc cho Open Graph?",
            "A. og:title\n"
            + "B. og:type\n"
            + "C. og:image\n"
            + "D. Tất cả các đáp án trên",
            "og:type dùng để làm gì?",
            "A. Định nghĩa loại nội dung\n"
            + "B. Định nghĩa mô tả\n"
            + "C. Tăng tốc độ web\n"
            + "D. Hiển thị logo",
            "og:url phải là gì?",
            "A. URL chính xác của trang\n"
            + "B. URL bất kỳ\n"
            + "C. URL ảnh\n"
            + "D. URL thẻ meta",
            "og:image yêu cầu gì?",
            "A. Độ phân giải cao\n"
            + "B. Tỷ lệ 1.91:1\n"
            + "C. File nhỏ hơn 5MB\n"
            + "D. Tất cả các đáp án trên",
            "Nếu thiếu og:title thì sao?",
            "A. Lấy tiêu đề mặc định\n"
            + "B. Không hiển thị\n"
            + "C. Lỗi render\n"
            + "D. Cả A và B đúng",
            "Thẻ og:description giới hạn bao nhiêu ký tự?",
            "A. 100\n"
            + "B. 200\n"
            + "C. 300\n"
            + "D. 500",
            "og:locale dùng để làm gì?",
            "A. Chỉ định ngôn ngữ\n"
            + "B. Chỉ định quốc gia\n"
            + "C. Chỉ định múi giờ\n"
            + "D. Cả A và B đúng",
            "og:site_name là gì?",
            "A. Tên trang web\n"
            + "B. URL chính\n"
            + "C. Link ảnh\n"
            + "D. Mô tả trang",
            "Thẻ Open Graph hỗ trợ SEO như thế nào?",
            "A. Tăng hiển thị mạng xã hội\n"
            + "B. Tăng chỉ số DA\n"
            + "C. Tăng ranking Google\n"
            + "D. Tăng load speed",
            "Platform nào KHÔNG hỗ trợ Open Graph?",
            "A. Facebook\n"
            + "B. LinkedIn\n"
            + "C. Twitter\n"
            + "D. TikTok"
        });

        TITLE_MAP.put("Twitter Card", new String[]{
            "Twitter Card là gì?",
            "A. Thẻ meta đặc biệt\n"
            + "B. Công cụ chia sẻ link\n"
            + "C. Công cụ quảng cáo\n"
            + "D. A và B đúng",
            "Summary Card hiển thị gì?",
            "A. Tiêu đề + mô tả + hình nhỏ\n"
            + "B. Chỉ tiêu đề\n"
            + "C. Chỉ hình ảnh\n"
            + "D. Chỉ mô tả",
            "Summary Card with Large Image khác gì?",
            "A. Ảnh lớn hơn\n"
            + "B. Mô tả ngắn hơn\n"
            + "C. Không có link\n"
            + "D. Cả A và B đúng",
            "App Card dùng để?",
            "A. Chia sẻ ứng dụng\n"
            + "B. Chia sẻ video\n"
            + "C. Chia sẻ tin tức\n"
            + "D. Chia sẻ hình ảnh",
            "Player Card dùng khi nào?",
            "A. Khi có video hoặc audio\n"
            + "B. Khi có hình ảnh lớn\n"
            + "C. Khi có nhiều bài viết\n"
            + "D. Khi có sự kiện",
            "Twitter yêu cầu thẻ meta nào?",
            "A. twitter:card\n"
            + "B. twitter:title\n"
            + "C. twitter:description\n"
            + "D. Tất cả các đáp án trên",
            "Card Validator dùng để làm gì?",
            "A. Kiểm tra lỗi Card\n"
            + "B. Kiểm tra tốc độ web\n"
            + "C. Kiểm tra nội dung bài viết\n"
            + "D. Cả A và B đúng",
            "Twitter Card ảnh hưởng SEO không?",
            "A. Có, gián tiếp\n"
            + "B. Không\n"
            + "C. Ảnh hưởng mạnh\n"
            + "D. Chỉ khi tối ưu tốt",
            "Twitter Card yêu cầu tối thiểu mấy thẻ?",
            "A. 1\n"
            + "B. 2\n"
            + "C. 3\n"
            + "D. 4",
            "Sai lầm thường gặp khi dùng Twitter Card?",
            "A. Thiếu thẻ\n"
            + "B. Ảnh quá nhỏ\n"
            + "C. Nội dung không hấp dẫn\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Favicon", new String[]{
            "Favicon dùng để làm gì?",
            "A. Hiển thị biểu tượng trên tab\n"
            + "B. Tăng tốc độ web\n"
            + "C. SEO nhanh hơn\n"
            + "D. Không ảnh hưởng",
            "Định dạng phổ biến của favicon là gì?",
            "A. .ico\n"
            + "B. .jpg\n"
            + "C. .png\n"
            + "D. Tất cả các định dạng trên",
            "Kích thước chuẩn của favicon?",
            "A. 16x16\n"
            + "B. 32x32\n"
            + "C. 48x48\n"
            + "D. Tất cả các kích thước trên",
            "Thẻ HTML nào để chèn favicon?",
            "A. <link rel='icon'>\n"
            + "B. <meta>\n"
            + "C. <script>\n"
            + "D. <img>",
            "Favicon ảnh hưởng đến?",
            "A. Thương hiệu\n"
            + "B. Trải nghiệm người dùng\n"
            + "C. Sự nhận diện website\n"
            + "D. Tất cả các đáp án trên",
            "Favicon nằm ở đâu trong website?",
            "A. Trong thư mục gốc\n"
            + "B. Trong thư mục images\n"
            + "C. Trong CSS\n"
            + "D. Trong file JS",
            "Trình duyệt nào hỗ trợ favicon đầu tiên?",
            "A. Internet Explorer\n"
            + "B. Chrome\n"
            + "C. Firefox\n"
            + "D. Safari",
            "Favicon ảnh hưởng đến SEO không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Một phần nhỏ\n"
            + "D. Không rõ",
            "Khi đổi favicon, cần làm gì?",
            "A. Clear cache\n"
            + "B. Đổi domain\n"
            + "C. Xóa cookies\n"
            + "D. Restart server",
            "Favicon nên tối ưu yếu tố nào?",
            "A. Kích thước nhỏ gọn\n"
            + "B. Thiết kế dễ nhìn\n"
            + "C. Phù hợp thương hiệu\n"
            + "D. Tất cả các đáp án trên"
        });

        TITLE_MAP.put("Sitemap", new String[]{
            "Sitemap là gì?",
            "A. Sơ đồ trang web\n"
            + "B. Bản đồ du lịch\n"
            + "C. Ảnh nền website\n"
            + "D. Tài liệu hướng dẫn",
            "Sitemap giúp ích gì?",
            "A. Hỗ trợ bot crawl web\n"
            + "B. Tăng tốc tải trang\n"
            + "C. Giảm chi phí hosting\n"
            + "D. Thay đổi theme website",
            "Sitemap XML khác gì HTML?",
            "A. XML cho máy đọc\n"
            + "B. HTML cho người dùng\n"
            + "C. Cả A và B\n"
            + "D. Không khác gì nhau",
            "Cách khai báo sitemap với Google?",
            "A. Search Console\n"
            + "B. Google Ads\n"
            + "C. Gmail\n"
            + "D. Google Docs",
            "Sitemap nên cập nhật khi nào?",
            "A. Khi có thay đổi nội dung\n"
            + "B. Hằng ngày\n"
            + "C. Hằng tháng\n"
            + "D. Không cần cập nhật",
            "File sitemap có đuôi gì?",
            "A. .xml\n"
            + "B. .html\n"
            + "C. .json\n"
            + "D. .txt",
            "Số lượng URL tối đa trong sitemap?",
            "A. 10,000\n"
            + "B. 50,000\n"
            + "C. 100,000\n"
            + "D. 500,000",
            "Nên đặt sitemap ở đâu?",
            "A. /sitemap.xml\n"
            + "B. /robots.txt\n"
            + "C. /sitemap.html\n"
            + "D. /sitemap.php",
            "Sitemap giúp cải thiện gì?",
            "A. Indexing\n"
            + "B. PageSpeed\n"
            + "C. Bounce rate\n"
            + "D. Conversion rate",
            "Sitemap có thể nén lại bằng?",
            "A. gzip\n"
            + "B. zip\n"
            + "C. rar\n"
            + "D. Không cần nén"
        });

        TITLE_MAP.put("robots.txt", new String[]{
            "robots.txt là gì?",
            "A. File hướng dẫn bot\n"
            + "B. Tập tin theme\n"
            + "C. Plugin\n"
            + "D. Cấu hình database",
            "Vai trò chính của robots.txt?",
            "A. Chặn bot truy cập\n"
            + "B. Xóa website\n"
            + "C. Tạo sitemap\n"
            + "D. Nâng cấp hosting",
            "Câu lệnh Allow dùng để?",
            "A. Cho phép truy cập\n"
            + "B. Cấm truy cập\n"
            + "C. Redirect URL\n"
            + "D. Tạo file mới",
            "Câu lệnh Disallow dùng để?",
            "A. Ngăn bot vào đường dẫn\n"
            + "B. Tăng SEO\n"
            + "C. Lưu trữ dữ liệu\n"
            + "D. Tạo blog",
            "robots.txt nên đặt ở đâu?",
            "A. Thư mục gốc website\n"
            + "B. Folder images\n"
            + "C. CSS folder\n"
            + "D. JS folder",
            "Tệp robots.txt có định dạng gì?",
            "A. Văn bản thuần\n"
            + "B. HTML\n"
            + "C. XML\n"
            + "D. JSON",
            "User-agent trong robots.txt là gì?",
            "A. Bot cụ thể\n"
            + "B. Địa chỉ IP\n"
            + "C. URL\n"
            + "D. Tên miền",
            "Sitemap có thể khai báo trong robots.txt?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Một phần\n"
            + "D. Tùy server",
            "Lỗi trong robots.txt gây ra gì?",
            "A. Bot không index đúng\n"
            + "B. Website offline\n"
            + "C. Mất theme\n"
            + "D. Sập server",
            "Kiểm tra robots.txt bằng gì?",
            "A. Search Console\n"
            + "B. Gmail\n"
            + "C. Google Docs\n"
            + "D. Google Maps"
        });

        TITLE_MAP.put("Local Storage", new String[]{
            "Local Storage là gì?",
            "A. Lưu trữ dữ liệu trình duyệt\n"
            + "B. Lưu database\n"
            + "C. Tăng tốc hosting\n"
            + "D. Đổi màu website",
            "Dung lượng Local Storage tối đa?",
            "A. 5MB\n"
            + "B. 10MB\n"
            + "C. 50MB\n"
            + "D. 100MB",
            "Local Storage khác Session Storage thế nào?",
            "A. Local lưu lâu dài\n"
            + "B. Session mất khi đóng tab\n"
            + "C. Cả A và B\n"
            + "D. Không khác nhau",
            "Cách ghi dữ liệu vào Local Storage?",
            "A. localStorage.setItem()\n"
            + "B. localStorage.getItem()\n"
            + "C. localStorage.removeItem()\n"
            + "D. localStorage.clear()",
            "Local Storage có an toàn không?",
            "A. Không nên lưu thông tin nhạy cảm\n"
            + "B. Lưu mật khẩu\n"
            + "C. Lưu database\n"
            + "D. Lưu server log",
            "Trình duyệt nào hỗ trợ Local Storage?",
            "A. Chrome\n"
            + "B. Firefox\n"
            + "C. Safari\n"
            + "D. Tất cả các trình duyệt chính",
            "Local Storage được truy cập bằng gì?",
            "A. JavaScript\n"
            + "B. PHP\n"
            + "C. SQL\n"
            + "D. Python",
            "Khi xóa Local Storage thì sao?",
            "A. Dữ liệu mất\n"
            + "B. Hosting lỗi\n"
            + "C. IP bị đổi\n"
            + "D. Web load nhanh hơn",
            "Local Storage lưu dữ liệu dưới dạng gì?",
            "A. Key-value\n"
            + "B. Array\n"
            + "C. Object\n"
            + "D. XML",
            "Lệnh nào xóa tất cả Local Storage?",
            "A. localStorage.clear()\n"
            + "B. localStorage.deleteAll()\n"
            + "C. localStorage.removeAll()\n"
            + "D. localStorage.reset()"
        });
        TITLE_MAP.put("Session Storage", new String[]{
            "Session Storage dùng để làm gì?",
            "A. Lưu dữ liệu trong một phiên duyệt.",
            "B. Lưu vĩnh viễn dữ liệu.",
            "C. Lưu trên server.",
            "D. Lưu vào cookie.",
            "Session Storage khác gì Local Storage?",
            "A. Tồn tại ngắn hơn.",
            "B. Tồn tại lâu hơn.",
            "C. Lưu được nhiều hơn.",
            "D. Không có sự khác biệt.",
            "Session Storage xóa khi nào?",
            "A. Khi tab đóng.",
            "B. Khi đổi URL.",
            "C. Khi clear cache.",
            "D. Khi tắt máy tính.",
            "Session Storage dung lượng tối đa khoảng?",
            "A. 2MB.",
            "B. 5MB.",
            "C. 10MB.",
            "D. 50MB.",
            "Session Storage lưu dạng dữ liệu nào?",
            "A. Văn bản thuần (text).",
            "B. JSON object.",
            "C. Binary data.",
            "D. File image.",
            "Session Storage có chia sẻ giữa tab được không?",
            "A. Có.",
            "B. Không.",
            "C. Tùy trình duyệt.",
            "D. Tùy phiên bản hệ điều hành.",
            "Phương thức nào lưu dữ liệu vào Session Storage?",
            "A. saveItem().",
            "B. storeItem().",
            "C. setItem().",
            "D. putItem().",
            "Cách lấy dữ liệu từ Session Storage?",
            "A. getItem(key).",
            "B. retrieveItem(key).",
            "C. fetchItem(key).",
            "D. pullItem(key).",
            "Session Storage có cần kết nối mạng không?",
            "A. Có.",
            "B. Không.",
            "C. Tùy nền tảng.",
            "D. Tùy loại dữ liệu.",
            "Ứng dụng phổ biến của Session Storage?",
            "A. Lưu trạng thái form.",
            "B. Lưu video stream.",
            "C. Lưu mật khẩu đăng nhập.",
            "D. Lưu cache trang."
        });
        TITLE_MAP.put("Geolocation API là", new String[]{
            "Geolocation API dùng để làm gì?",
            "A. Xác định vị trí người dùng.",
            "B. Xác định IP người dùng.",
            "C. Xác định thiết bị người dùng.",
            "D. Xác định trình duyệt người dùng.",
            "Phương thức lấy vị trí hiện tại?",
            "A. navigator.geolocation.getCurrentPosition()",
            "B. navigator.location.getCurrent()",
            "C. window.getLocation()",
            "D. window.position.getCurrent()",
            "Geolocation API có cần quyền truy cập không?",
            "A. Có.",
            "B. Không.",
            "C. Chỉ trên thiết bị di động.",
            "D. Chỉ trên desktop.",
            "Thông tin nào Geolocation API cung cấp?",
            "A. Vĩ độ, kinh độ.",
            "B. Độ cao.",
            "C. Hướng di chuyển.",
            "D. Tất cả các đáp án trên.",
            "Geolocation API có thể dùng cho?",
            "A. Ứng dụng giao đồ ăn.",
            "B. Ứng dụng bản đồ.",
            "C. Ứng dụng tìm cửa hàng gần nhất.",
            "D. Tất cả các đáp án trên.",
            "Sự kiện lỗi khi không lấy được vị trí?",
            "A. error.PERMISSION_DENIED.",
            "B. error.POSITION_UNAVAILABLE.",
            "C. error.TIMEOUT.",
            "D. Tất cả các lỗi trên.",
            "Độ chính xác của Geolocation API phụ thuộc vào?",
            "A. GPS.",
            "B. Wi-Fi.",
            "C. Dữ liệu mạng di động.",
            "D. Tất cả các yếu tố trên.",
            "Geolocation API thường dùng với?",
            "A. JavaScript.",
            "B. CSS.",
            "C. HTML.",
            "D. SQL.",
            "Phương thức theo dõi thay đổi vị trí?",
            "A. watchLocation().",
            "B. watchCurrentPosition().",
            "C. watchPosition().",
            "D. followPosition().",
            "Làm thế nào để dừng theo dõi vị trí?",
            "A. navigator.geolocation.clearWatch().",
            "B. navigator.geolocation.stop().",
            "C. navigator.stopLocation().",
            "D. window.clearGeoWatch()."
        });
        TITLE_MAP.put("Tính năng của Geolocation API", new String[]{
            "Tính năng chính của Geolocation API là?",
            "A. Xác định vị trí người dùng.",
            "B. Xác định loại trình duyệt.",
            "C. Xác định lịch sử duyệt web.",
            "D. Xác định mạng Internet.",
            "Có thể theo dõi liên tục vị trí không?",
            "A. Có với watchPosition().",
            "B. Không thể.",
            "C. Chỉ khi có GPS.",
            "D. Chỉ với Wi-Fi.",
            "Lỗi phổ biến của Geolocation API?",
            "A. User từ chối cấp quyền.",
            "B. Thiết bị không hỗ trợ.",
            "C. Mạng yếu.",
            "D. Tất cả các lỗi trên.",
            "Geolocation API trả về đơn vị đo gì?",
            "A. Feet.",
            "B. Mét.",
            "C. Inch.",
            "D. Yard.",
            "Hàm success callback nhận gì?",
            "A. object Position.",
            "B. object Location.",
            "C. string Coordinates.",
            "D. string Position.",
            "Thuộc tính latitude là gì?",
            "A. Vĩ độ.",
            "B. Kinh độ.",
            "C. Độ cao.",
            "D. Khoảng cách.",
            "Thuộc tính accuracy là gì?",
            "A. Độ chính xác vị trí.",
            "B. Tốc độ mạng.",
            "C. Thời gian cập nhật.",
            "D. Khoảng cách đến server.",
            "Hàm getCurrentPosition cần gì?",
            "A. 1 callback.",
            "B. 2 callback.",
            "C. 3 callback.",
            "D. Không cần callback.",
            "watchPosition trả về gì?",
            "A. ID số.",
            "B. Vị trí hiện tại.",
            "C. Chuỗi JSON.",
            "D. Kinh độ.",
            "clearWatch nhận tham số gì?",
            "A. Vị trí hiện tại.",
            "B. ID từ watchPosition.",
            "C. Tên trình duyệt.",
            "D. Địa chỉ IP."
        });
        TITLE_MAP.put("Lợi ích SEO gián tiếp", new String[]{
            "Geolocation API có lợi ích SEO nào?",
            "A. Tối ưu tìm kiếm địa phương.",
            "B. Tăng tốc độ tải trang.",
            "C. Giảm bounce rate.",
            "D. Tất cả các đáp án trên.",
            "Dùng vị trí người dùng giúp gì cho SEO?",
            "A. Nội dung phù hợp địa phương.",
            "B. Quảng cáo chính xác hơn.",
            "C. Trải nghiệm người dùng tốt hơn.",
            "D. Tất cả các đáp án trên.",
            "Vị trí giúp cải thiện trải nghiệm như thế nào?",
            "A. Hiển thị cửa hàng gần nhất.",
            "B. Dự báo thời tiết địa phương.",
            "C. Bản đồ chỉ đường.",
            "D. Tất cả các đáp án trên.",
            "Tối ưu nội dung địa phương tốt cho?",
            "A. Local SEO.",
            "B. International SEO.",
            "C. Technical SEO.",
            "D. None SEO.",
            "Bounce rate thấp giúp gì cho SEO?",
            "A. Tăng thứ hạng tìm kiếm.",
            "B. Giảm thứ hạng tìm kiếm.",
            "C. Không ảnh hưởng.",
            "D. Giảm tốc độ tải trang.",
            "Tối ưu tìm kiếm địa phương tăng gì?",
            "A. Lượng truy cập.",
            "B. Tỷ lệ chuyển đổi.",
            "C. Doanh số bán hàng.",
            "D. Tất cả các đáp án trên.",
            "Hiển thị nội dung theo vị trí giúp?",
            "A. Giao diện đẹp hơn.",
            "B. Trải nghiệm cá nhân hóa.",
            "C. Tăng thời gian trên site.",
            "D. Tất cả các đáp án trên.",
            "Local SEO cần yếu tố nào?",
            "A. Địa chỉ chính xác.",
            "B. Google My Business.",
            "C. Đánh giá tích cực.",
            "D. Tất cả các đáp án trên.",
            "Tối ưu tốc độ trang ảnh hưởng gì?",
            "A. Xếp hạng SEO.",
            "B. Tỷ lệ giữ chân người dùng.",
            "C. Tỷ lệ chuyển đổi.",
            "D. Tất cả các đáp án trên.",
            "Tối ưu mobile impact gì đến SEO?",
            "A. Cải thiện xếp hạng tìm kiếm.",
            "B. Giảm thời gian tải trang.",
            "C. Tăng trải nghiệm người dùng.",
            "D. Tất cả các đáp án trên."
        });
        TITLE_MAP.put("Drag & Drop API là gì", new String[]{
            "Drag & Drop API cho phép làm gì?",
            "A. Kéo thả phần tử.",
            "B. Phóng to hình ảnh.",
            "C. Tự động lưu dữ liệu.",
            "D. Chạy animation.",
            "Sự kiện nào kích hoạt khi bắt đầu kéo?",
            "A. dragstart.",
            "B. dragover.",
            "C. drop.",
            "D. dragend.",
            "Thuộc tính nào cho phép phần tử được kéo?",
            "A. draggable.",
            "B. moveable.",
            "C. transferable.",
            "D. clickable.",
            "Drag & Drop API hỗ trợ chính trên nền tảng nào?",
            "A. Trình duyệt web.",
            "B. Ứng dụng desktop.",
            "C. Ứng dụng mobile native.",
            "D. TV app.",
            "Sự kiện nào xảy ra khi thả đối tượng?",
            "A. drop.",
            "B. dragleave.",
            "C. dragstart.",
            "D. dragover.",
            "Để cho phép thả vào một vùng, cần ngăn sự kiện nào?",
            "A. dragover.",
            "B. dragstart.",
            "C. drop.",
            "D. dragleave.",
            "Phương thức nào dùng để truyền dữ liệu khi kéo?",
            "A. setData().",
            "B. getData().",
            "C. sendData().",
            "D. pushData().",
            "Khi kéo phần tử, dữ liệu được lưu ở đâu?",
            "A. dataTransfer object.",
            "B. localStorage.",
            "C. sessionStorage.",
            "D. clipboard.",
            "Drag & Drop hoạt động dựa trên API nào?",
            "A. HTML5 API.",
            "B. CSS3 API.",
            "C. WebRTC API.",
            "D. Canvas API.",
            "Sự kiện nào được kích hoạt khi kéo đối tượng ra khỏi vùng?",
            "A. dragleave.",
            "B. dragover.",
            "C. drop.",
            "D. dragstart."
        });
        TITLE_MAP.put("Tính năng của Drag & Drop API", new String[]{
            "Drag & Drop giúp cải thiện UX bằng cách nào?",
            "A. Trực quan hơn.",
            "B. Khó hiểu hơn.",
            "C. Chậm hơn.",
            "D. Ít tương tác hơn.",
            "Drag & Drop API cho phép?",
            "A. Kéo dữ liệu.",
            "B. Thả file upload.",
            "C. Tương tác mượt mà.",
            "D. Tất cả các đáp án trên.",
            "Sự kiện nào thường dùng với dragover?",
            "A. preventDefault().",
            "B. stopPropagation().",
            "C. stopImmediatePropagation().",
            "D. dispatchEvent().",
            "Drag & Drop có thể áp dụng vào?",
            "A. Quản lý file.",
            "B. Kéo sản phẩm vào giỏ hàng.",
            "C. Xếp lịch biểu.",
            "D. Tất cả các đáp án trên.",
            "Drag & Drop có hỗ trợ di chuyển nhiều phần tử cùng lúc?",
            "A. Có.",
            "B. Không.",
            "C. Tùy trình duyệt.",
            "D. Tùy thiết kế.",
            "API này hỗ trợ thao tác trên đối tượng nào?",
            "A. DOM Element.",
            "B. Canvas.",
            "C. WebGL.",
            "D. JSON.",
            "Drag & Drop hỗ trợ truyền?",
            "A. Text.",
            "B. File.",
            "C. HTML.",
            "D. Tất cả các đáp án trên.",
            "Khi kéo file từ máy vào trình duyệt, dùng sự kiện nào?",
            "A. drop.",
            "B. dragstart.",
            "C. dragover.",
            "D. dragleave.",
            "API này có hỗ trợ kéo file giữa các tab trình duyệt không?",
            "A. Có.",
            "B. Không.",
            "C. Chỉ một số trình duyệt.",
            "D. Tùy hệ điều hành.",
            "Có thể custom hình ảnh kéo thả bằng thuộc tính nào?",
            "A. setDragImage().",
            "B. setImage().",
            "C. setTransferImage().",
            "D. dragImage()."
        });
        TITLE_MAP.put("Lợi ích đối với SEO", new String[]{
            "Drag & Drop ảnh hưởng SEO bằng cách nào?",
            "A. Tăng tương tác.",
            "B. Giảm bounce rate.",
            "C. Cải thiện trải nghiệm.",
            "D. Tất cả các đáp án trên.",
            "Kéo thả sản phẩm giúp?",
            "A. Tăng tỉ lệ chuyển đổi.",
            "B. Giảm tốc độ load.",
            "C. Gây lỗi SEO.",
            "D. Không ảnh hưởng.",
            "Tối ưu Drag & Drop cần chú ý?",
            "A. Accessibility.",
            "B. SEO Metadata.",
            "C. Nội dung động.",
            "D. Tất cả các đáp án trên.",
            "Để hỗ trợ SEO khi dùng Drag & Drop cần thêm gì?",
            "A. ARIA attributes.",
            "B. JavaScript variables.",
            "C. Canvas attributes.",
            "D. None.",
            "Drag & Drop cần làm gì để tối ưu tốc độ load?",
            "A. Giảm tài nguyên tải về.",
            "B. Tối ưu hình ảnh.",
            "C. Giảm script nặng.",
            "D. Tất cả các đáp án trên.",
            "Vì sao trải nghiệm kéo thả tốt lại giúp SEO?",
            "A. Giữ chân người dùng.",
            "B. Giảm bounce rate.",
            "C. Tăng tỉ lệ chuyển đổi.",
            "D. Tất cả các đáp án trên.",
            "Drag & Drop ảnh hưởng Accessibility thế nào?",
            "A. Cần hỗ trợ bàn phím.",
            "B. Cần hỗ trợ screen reader.",
            "C. Cần hỗ trợ focus rõ ràng.",
            "D. Tất cả các đáp án trên.",
            "Drag & Drop tốt nên kèm theo?",
            "A. Label rõ ràng.",
            "B. Hướng dẫn thao tác.",
            "C. Animation nhẹ nhàng.",
            "D. Tất cả các đáp án trên.",
            "SEO-friendly Drag & Drop cần tránh gì?",
            "A. Code lỗi JavaScript.",
            "B. Nội dung không thể đọc được.",
            "C. Cả A và B.",
            "D. Không cần tránh gì.",
            "Kéo thả gây hại SEO khi?",
            "A. Không có nội dung thay thế.",
            "B. Ảnh không có alt.",
            "C. Kéo thả nhưng không ghi nhận sự kiện.",
            "D. Tất cả các đáp án trên."
        });

        //CSS Cơ Bản
        TITLE_MAP.put("Inline CSS", new String[]{
            "Inline CSS được áp dụng trực tiếp vào phần tử HTML thông qua thuộc tính nào?",
            "A. class\n"
            + "B. id\n"
            + "C. style\n"
            + "D. css",
            "Inline CSS có độ ưu tiên như thế nào so với Internal và External CSS?",
            "A. Thấp nhất\n"
            + "B. Bằng nhau\n"
            + "C. Cao nhất\n"
            + "D. Không xác định",
            "Nhược điểm lớn nhất của Inline CSS là gì?",
            "A. Khó bảo trì\n"
            + "B. Không hỗ trợ animation\n"
            + "C. Tăng thời gian load trang\n"
            + "D. Giới hạn số lượng thuộc tính",
            "Inline CSS phù hợp nhất cho trường hợp nào?",
            "A. Áp dụng kiểu duy nhất cho một phần tử\n"
            + "B. Thiết kế toàn bộ trang web\n"
            + "C. Tạo hiệu ứng phức tạp\n"
            + "D. Quản lý nhiều trang cùng lúc",
            "Lệnh Inline CSS nào sau đây là đúng?",
            "A. `<p style=\"color: red;\">Text</p>`\n"
            + "B. `<p css=\"color: red;\">Text</p>`\n"
            + "C. `<p class=\"color: red;\">Text</p>`\n"
            + "D. `<p inline=\"color: red;\">Text</p>`",
            "Inline CSS có thể sử dụng đơn vị nào sau đây?",
            "A. px, em, rem\n"
            + "B. Chỉ px\n"
            + "C. Chỉ %\n"
            + "D. Không sử dụng đơn vị",
            "Khi nào nên tránh dùng Inline CSS?",
            "A. Khi cần tái sử dụng kiểu\n"
            + "B. Khi cần độ ưu tiên cao\n"
            + "C. Khi làm việc với JavaScript\n"
            + "D. Khi dùng thẻ <div>",
            "Inline CSS có thể ghi đè (override) kiểu từ Internal CSS không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Tùy trình duyệt\n"
            + "D. Chỉ khi dùng !important",
            "Thuộc tính nào không thể dùng trong Inline CSS?",
            "A. color\n"
            + "B. font-size\n"
            + "C. @media queries\n"
            + "D. margin",
            "Inline CSS ảnh hưởng thế nào đến SEO?",
            "A. Không ảnh hưởng\n"
            + "B. Làm giảm thứ hạng\n"
            + "C. Tăng tốc độ index\n"
            + "D. Chỉ ảnh hưởng nếu dùng quá nhiều"
        });
        TITLE_MAP.put("Internal CSS", new String[]{
            "Internal CSS được đặt trong thẻ nào của HTML?",
            "A. <script>\n"
            + "B. <style>\n"
            + "C. <link>\n"
            + "D. <meta>",
            "Internal CSS có thể đặt ở đâu trong tài liệu HTML?",
            "A. Chỉ trong <head>\n"
            + "B. Chỉ trong <body>\n"
            + "C. Cả <head> và <body>\n"
            + "D. Trong file riêng",
            "Internal CSS phù hợp cho dự án nào?",
            "A. Trang web nhỏ, ít kiểu\n"
            + "B. Ứng dụng di động\n"
            + "C. Hệ thống nhiều trang\n"
            + "D. Thiết kế đồ họa",
            "Lợi thế của Internal CSS so với Inline CSS?",
            "A. Dễ quản lý hơn\n"
            + "B. Độ ưu tiên cao hơn\n"
            + "C. Tốc độ load nhanh hơn\n"
            + "D. Hỗ trợ JavaScript",
            "Internal CSS có thể dùng selector nào?",
            "A. Chỉ tag selector\n"
            + "B. Class, ID, tag\n"
            + "C. Chỉ pseudo-class\n"
            + "D. Không dùng selector",
            "Lệnh Internal CSS nào đúng?",
            "A. `<style> p { color: red; } </style>`\n"
            + "B. `<css> p { color: red; } </css>`\n"
            + "C. `<style css=\"p { color: red; }\">`\n"
            + "D. `<internal> p { color: red; } </internal>`",
            "Internal CSS có thể import file CSS khác không?",
            "A. Có, dùng @import\n"
            + "B. Không\n"
            + "C. Chỉ khi dùng JavaScript\n"
            + "D. Chỉ trong <body>",
            "Internal CSS có ưu tiên cao hơn External CSS không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Tùy vị trí đặt\n"
            + "D. Chỉ khi dùng !important",
            "Nhược điểm của Internal CSS?",
            "A. Không tái sử dụng được cho trang khác\n"
            + "B. Khó viết\n"
            + "C. Không hỗ trợ màu sắc\n"
            + "D. Làm chậm trình duyệt",
            "Có thể dùng bao nhiêu thẻ <style> trong một trang HTML?",
            "A. 1\n"
            + "B. 2\n"
            + "C. Không giới hạn\n"
            + "D. Tùy trình duyệt"
        });
        TITLE_MAP.put("External CSS", new String[]{
            "External CSS được liên kết với HTML bằng thẻ nào?",
            "A. <script>\n"
            + "B. <link>\n"
            + "C. <style>\n"
            + "D. <a>",
            "Thuộc tính bắt buộc của thẻ <link> để liên kết CSS là gì?",
            "A. href và rel\n"
            + "B. src và type\n"
            + "C. css và file\n"
            + "D. style và media",
            "Ưu điểm lớn nhất của External CSS?",
            "A. Tái sử dụng cho nhiều trang\n"
            + "B. Độ ưu tiên cao\n"
            + "C. Dễ viết hơn Inline\n"
            + "D. Không cần tải file",
            "External CSS nên đặt ở đâu trong HTML?",
            "A. Trong <head>\n"
            + "B. Trong <body>\n"
            + "C. Cuối trang\n"
            + "D. Trong thẻ <div>",
            "Lệnh nào liên kết đúng file CSS?",
            "A. `<link rel=\"stylesheet\" href=\"style.css\">`\n"
            + "B. `<style src=\"style.css\"></style>`\n"
            + "C. `<css file=\"style.css\">`\n"
            + "D. `<import css=\"style.css\">`",
            "External CSS có thể chứa gì?",
            "A. Chỉ các selector đơn giản\n"
            + "B. Mọi quy tắc CSS (animation, media query)\n"
            + "C. Chỉ thuộc tính font\n"
            + "D. Không chứa comment",
            "Khi nào External CSS không được tải?",
            "A. Đường dẫn sai\n"
            + "B. Dùng sai thẻ <script>\n"
            + "C. Thiếu thẻ <meta>\n"
            + "D. Trang có quá nhiều HTML",
            "External CSS giúp cải thiện hiệu suất bằng cách nào?",
            "A. Cache file CSS cho các lần truy cập sau\n"
            + "B. Giảm số lượng thẻ HTML\n"
            + "C. Tự động nén ảnh\n"
            + "D. Tắt JavaScript",
            "Có thể dùng nhiều file External CSS trong một trang không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ 2 file\n"
            + "D. Tùy trình duyệt",
            "External CSS có độ ưu tiên thấp hơn Inline CSS?",
            "A. Đúng\n"
            + "B. Sai\n"
            + "C. Bằng nhau\n"
            + "D. Chỉ khi dùng @import"
        });
        TITLE_MAP.put("CSS sử dụng cú pháp gì?", new String[]{
            "Cú pháp CSS cơ bản bao gồm những thành phần nào?",
            "A. Selector { property: value; }\n"
            + "B. <style> property: value </style>\n"
            + "C. [attribute=value]\n"
            + "D. @keyframes name",
            "Dấu nào được sử dụng để kết thúc một khai báo CSS?",
            "A. Dấu phẩy (,)\n"
            + "B. Dấu chấm phẩy (;)\n"
            + "C. Dấu hai chấm (:)\n"
            + "D. Dấu chấm (.)",
            "Phần nào trong cú pháp CSS xác định phần tử HTML sẽ được áp dụng kiểu?",
            "A. Property\n"
            + "B. Value\n"
            + "C. Selector\n"
            + "D. Declaration",
            "Cách viết comment nào đúng trong CSS?",
            "A. // Comment //\n"
            + "B. /* Comment */\n"
            + "C. <!-- Comment -->\n"
            + "D. # Comment",
            "Làm cách nào để nhóm nhiều selector cùng áp dụng một kiểu?",
            "A. Phân cách bằng dấu phẩy: h1, h2 { }\n"
            + "B. Dùng dấu chấm: h1.h2 { }\n"
            + "C. Viết trên cùng dòng: h1 h2 { }\n"
            + "D. Dùng dấu +: h1 + h2 { }",
            "Cú pháp nào sau đây là đúng để định nghĩa animation trong CSS?",
            "A. @animation { }\n"
            + "B. #keyframes { }\n"
            + "C. @keyframes { }\n"
            + "D. animation: { }",
            "Thuộc tính nào sau đây KHÔNG phải là CSS tiêu chuẩn?",
            "A. font-size\n"
            + "B. margin\n"
            + "C. text-color\n"
            + "D. border-radius",
            "Làm thế nào để tham chiếu đến một phần tử có id là 'header'?",
            "A. .header { }\n"
            + "B. #header { }\n"
            + "C. header { }\n"
            + "D. &header { }",
            "Cú pháp nào đúng để thay đổi màu chữ?",
            "A. text-color: red;\n"
            + "B. font-color: red;\n"
            + "C. color: red;\n"
            + "D. text-style: red;",
            "Cú pháp media query bắt đầu bằng gì?",
            "A. @media\n"
            + "B. #media\n"
            + "C. media:\n"
            + "D. <media>"
        });
        TITLE_MAP.put("Cấu trúc cơ bản của một quy tắc CSS", new String[]{
            "Một quy tắc CSS hoàn chỉnh bao gồm những phần nào?",
            "A. Selector và Declaration\n"
            + "B. Tag và Attribute\n"
            + "C. Class và ID\n"
            + "D. Property và Value",
            "Phần Declaration trong CSS chứa gì?",
            "A. Tên phần tử HTML\n"
            + "B. Thuộc tính và giá trị\n"
            + "C. Chỉ tên class\n"
            + "D. Chỉ tên id",
            "Cú pháp nào đúng cho một quy tắc CSS?",
            "A. selector { property-value }\n"
            + "B. selector { property: value }\n"
            + "C. selector ( property: value )\n"
            + "D. selector [ property: value ]",
            "Một khối Declaration có thể chứa bao nhiêu cặp property-value?",
            "A. Chỉ 1\n"
            + "B. Tối đa 3\n"
            + "C. Không giới hạn\n"
            + "D. Tùy thuộc vào trình duyệt",
            "Dấu nào ngăn cách giữa property và value?",
            "A. Dấu phẩy (,)\n"
            + "B. Dấu bằng (=)\n"
            + "C. Dấu hai chấm (:)\n"
            + "D. Dấu chấm phẩy (;)",
            "Có thể viết nhiều selector cho cùng một khối declaration không?",
            "A. Không thể\n"
            + "B. Có, phân cách bằng dấu phẩy\n"
            + "C. Có, phân cách bằng dấu chấm\n"
            + "D. Có, phân cách bằng dấu cách",
            "Quy tắc CSS nào sau đây là hợp lệ?",
            "A. p { color: red; font-size: 16px; }\n"
            + "B. p { color: red, font-size: 16px }\n"
            + "C. p ( color: red; font-size: 16px; )\n"
            + "D. p [ color: red; font-size: 16px; ]",
            "Có thể bỏ qua dấu chấm phẩy cuối cùng trong khối declaration không?",
            "A. Luôn luôn phải có\n"
            + "B. Có thể bỏ qua nếu chỉ có 1 declaration\n"
            + "C. Có thể bỏ qua nếu là declaration cuối cùng\n"
            + "D. Câu B và C đều đúng",
            "Ký tự nào được dùng để bắt đầu một comment trong CSS?",
            "A. //\n"
            + "B. /*\n"
            + "C. <!--\n"
            + "D. #",
            "Cú pháp nào sau đây là đúng để import font?",
            "A. @import url('...');\n"
            + "B. import font('...');\n"
            + "C. font-import: url('...');\n"
            + "D. <import>url('...')</import>"
        });
        TITLE_MAP.put("Các kiểu Selector trong CSS", new String[]{
            "Selector nào sau đây chọn tất cả các phần tử <p>?",
            "A. #p\n"
            + "B. .p\n"
            + "C. p\n"
            + "D. *p",
            "Selector nào chọn phần tử có class là 'menu'?",
            "A. menu\n"
            + "B. #menu\n"
            + "C. .menu\n"
            + "D. :menu",
            "Selector nào chọn phần tử có id là 'header'?",
            "A. header\n"
            + "B. #header\n"
            + "C. .header\n"
            + "D. :header",
            "Selector nào chọn tất cả các phần tử?",
            "A. #\n"
            + "B. .\n"
            + "C. *\n"
            + "D. all",
            "Selector [type='text'] chọn phần tử nào?",
            "A. Phần tử có class là 'text'\n"
            + "B. Phần tử có id là 'text'\n"
            + "C. Phần tử có thuộc tính type='text'\n"
            + "D. Tất cả phần tử <text>",
            "Selector nào chọn tất cả các thẻ <a> khi hover?",
            "A. a.hover\n"
            + "B. a:hover\n"
            + "C. a::hover\n"
            + "D. a > hover",
            "Selector nào chọn phần tử <li> là con trực tiếp của <ul>?",
            "A. ul li\n"
            + "B. ul > li\n"
            + "C. ul + li\n"
            + "D. ul ~ li",
            "Selector nào chọn phần tử đứng ngay sau một phần tử khác?",
            "A. A + B\n"
            + "B. A > B\n"
            + "C. A ~ B\n"
            + "D. A B",
            "Selector :nth-child(2) chọn gì?",
            "A. Con thứ 2 của phần tử cha\n"
            + "B. Tất cả các con từ thứ 2 trở đi\n"
            + "C. Chỉ các con chẵn\n"
            + "D. Chỉ các con lẻ",
            "Selector ::before tạo ra gì?",
            "A. Nội dung sau phần tử\n"
            + "B. Nội dung trước phần tử\n"
            + "C. Border trước phần tử\n"
            + "D. Shadow trước phần tử"
        });
        TITLE_MAP.put("Tag Selector", new String[]{
            "Tag selector được bắt đầu bằng ký tự gì?",
            "A. Dấu chấm (.)\n"
            + "B. Dấu thăng (#)\n"
            + "C. Không có ký tự đặc biệt\n"
            + "D. Dấu hai chấm (:)",
            "Làm cách nào để chọn tất cả các thẻ <h1>?",
            "A. .h1\n"
            + "B. #h1\n"
            + "C. h1\n"
            + "D. *h1",
            "Tag selector có độ ưu tiên như thế nào so với class selector?",
            "A. Cao hơn\n"
            + "B. Bằng nhau\n"
            + "C. Thấp hơn\n"
            + "D. Không thể so sánh",
            "Có thể kết hợp nhiều tag selector trong cùng một rule không?",
            "A. Không thể\n"
            + "B. Có, phân cách bằng dấu phẩy\n"
            + "C. Có, phân cách bằng dấu chấm\n"
            + "D. Có, phân cách bằng dấu cách",
            "Tag selector nào chọn thẻ <input> có type là 'submit'?",
            "A. input[type='submit']\n"
            + "B. input.submit\n"
            + "C. input#submit\n"
            + "D. input:submit",
            "Tag selector áp dụng cho bao nhiêu phần tử trong trang?",
            "A. Chỉ 1 phần tử\n"
            + "B. Tất cả phần tử cùng loại\n"
            + "C. Chỉ phần tử đầu tiên\n"
            + "D. Tùy thuộc vào trình duyệt",
            "Tag selector nào sau đây là hợp lệ?",
            "A. <p>\n"
            + "B. p\n"
            + "C. (p)\n"
            + "D. [p]",
            "Làm cách nào để chọn cả thẻ <h1> và <h2>?",
            "A. h1 h2\n"
            + "B. h1 + h2\n"
            + "C. h1, h2\n"
            + "D. h1.h2",
            "Tag selector có thể kết hợp với class selector không?",
            "A. Không thể\n"
            + "B. Có, ví dụ: p.special\n"
            + "C. Chỉ khi dùng JavaScript\n"
            + "D. Chỉ trong trường hợp đặc biệt",
            "Tag selector nào chọn thẻ <a> có href bắt đầu bằng 'https'?",
            "A. a[href='https']\n"
            + "B. a[href^='https']\n"
            + "C. a[href*='https']\n"
            + "D. a[href~='https']"
        });
        TITLE_MAP.put("Class Selector", new String[]{
            "Class selector trong CSS được bắt đầu bằng ký tự nào?",
            "A. Dấu chấm (.)\n"
            + "B. Dấu thăng (#)\n"
            + "C. Dấu hai chấm (:)\n"
            + "D. Không có ký tự đặc biệt",
            "Làm cách nào để chọn tất cả phần tử có class là 'menu'?",
            "A. #menu\n"
            + "B. menu\n"
            + "C. .menu\n"
            + "D. :menu",
            "Một phần tử HTML có thể có bao nhiêu class?",
            "A. Chỉ 1\n"
            + "B. Tối đa 3\n"
            + "C. Không giới hạn\n"
            + "D. Tùy thuộc vào trình duyệt",
            "Cú pháp nào chọn phần tử có cả class 'active' và 'highlight'?",
            "A. .active.highlight\n"
            + "B. .active, .highlight\n"
            + "C. .active > .highlight\n"
            + "D. .active + .highlight",
            "Class selector có độ ưu tiên như thế nào so với tag selector?",
            "A. Thấp hơn\n"
            + "B. Bằng nhau\n"
            + "C. Cao hơn\n"
            + "D. Không thể so sánh",
            "Cú pháp nào chọn phần tử <p> có class 'intro'?",
            "A. p#intro\n"
            + "B. p.intro\n"
            + "C. p > intro\n"
            + "D. p: intro",
            "Class selector thường được dùng khi nào?",
            "A. Khi cần chọn duy nhất 1 phần tử\n"
            + "B. Khi cần áp dụng kiểu cho nhiều phần tử\n"
            + "C. Chỉ dùng cho JavaScript\n"
            + "D. Khi cần chọn phần tử con",
            "Có thể dùng số để bắt đầu tên class không?",
            "A. Có thể\n"
            + "B. Không thể\n"
            + "C. Chỉ số 0\n"
            + "D. Tùy trình duyệt",
            "Cú pháp nào chọn phần tử có class chứa từ 'btn'?",
            "A. .btn\n"
            + "B. .*btn*\n"
            + "C. [class~='btn']\n"
            + "D. .class:btn",
            "Class selector có thể kết hợp với pseudo-class không?",
            "A. Không thể\n"
            + "B. Có, ví dụ: .btn:hover\n"
            + "C. Chỉ khi dùng JavaScript\n"
            + "D. Chỉ với một số pseudo-class đặc biệt"
        });
        TITLE_MAP.put("ID Selector", new String[]{
            "ID selector trong CSS được bắt đầu bằng ký tự nào?",
            "A. Dấu chấm (.)\n"
            + "B. Dấu thăng (#)\n"
            + "C. Dấu hai chấm (:)\n"
            + "D. Dấu sao (*)",
            "Theo quy ước, một trang HTML nên có bao nhiêu phần tử cùng ID?",
            "A. Chỉ 1\n"
            + "B. Tối đa 3\n"
            + "C. Không giới hạn\n"
            + "D. Tùy thuộc vào DOCTYPE",
            "ID selector có độ ưu tiên như thế nào so với class selector?",
            "A. Thấp hơn\n"
            + "B. Bằng nhau\n"
            + "C. Cao hơn\n"
            + "D. Không thể so sánh",
            "Cú pháp nào chọn phần tử có ID là 'header'?",
            "A. .header\n"
            + "B. #header\n"
            + "C. header\n"
            + "D. :header",
            "Tại sao nên tránh dùng ID selector trong CSS?",
            "A. Vì khó viết\n"
            + "B. Vì không thể tái sử dụng\n"
            + "C. Vì không hoạt động trên mobile\n"
            + "D. Vì làm chậm trình duyệt",
            "Có thể dùng số để bắt đầu tên ID không?",
            "A. Có thể\n"
            + "B. Không thể\n"
            + "C. Chỉ số 0\n"
            + "D. Tùy trình duyệt",
            "ID selector thường được dùng khi nào?",
            "A. Khi cần chọn nhiều phần tử cùng lúc\n"
            + "B. Khi cần chọn duy nhất 1 phần tử đặc biệt\n"
            + "C. Khi cần áp dụng kiểu cho toàn bộ trang\n"
            + "D. Khi làm việc với pseudo-element",
            "Cú pháp nào chọn phần tử có ID kết thúc bằng 'container'?",
            "A. #*container\n"
            + "B. #$container\n"
            + "C. [id$='container']\n"
            + "D. #id:container",
            "ID selector có thể kết hợp với tag selector không?",
            "A. Không thể\n"
            + "B. Có, ví dụ: div#main\n"
            + "C. Chỉ khi dùng JavaScript\n"
            + "D. Chỉ với một số tag đặc biệt",
            "Thuộc tính nào có độ ưu tiên cao hơn ID selector?",
            "A. Class selector\n"
            + "B. Tag selector\n"
            + "C. Inline style\n"
            + "D. Pseudo-class"
        });
        TITLE_MAP.put("Attribute Selector", new String[]{
            "Cú pháp nào chọn phần tử có thuộc tính 'target'?",
            "A. [target]\n"
            + "B. .target\n"
            + "C. #target\n"
            + "D. :target",
            "Cú pháp nào chọn phần tử có thuộc tính type='text'?",
            "A. [type:text]\n"
            + "B. [type=text]\n"
            + "C. [type~text]\n"
            + "D. [type*text]",
            "Cú pháp [class~='btn'] chọn phần tử nào?",
            "A. Class chứa chính xác từ 'btn'\n"
            + "B. Class bắt đầu bằng 'btn'\n"
            + "C. Class kết thúc bằng 'btn'\n"
            + "D. Class chứa chuỗi 'btn'",
            "Attribute selector có độ ưu tiên như thế nào so với class selector?",
            "A. Thấp hơn\n"
            + "B. Bằng nhau\n"
            + "C. Cao hơn\n"
            + "D. Không thể so sánh",
            "Cú pháp nào chọn phần tử có thuộc tính href bắt đầu bằng 'https'?",
            "A. [href='https']\n"
            + "B. [href^='https']\n"
            + "C. [href*='https']\n"
            + "D. [href~='https']",
            "Cú pháp [lang|='en'] chọn phần tử nào?",
            "A. Lang chứa 'en'\n"
            + "B. Lang bắt đầu bằng 'en' hoặc 'en-'\n"
            + "C. Lang kết thúc bằng 'en'\n"
            + "D. Lang khác 'en'",
            "Có thể kết hợp nhiều attribute selector không?",
            "A. Không thể\n"
            + "B. Có, ví dụ: [type='text'][required]\n"
            + "C. Chỉ khi dùng JavaScript\n"
            + "D. Chỉ với một số thuộc tính đặc biệt",
            "Cú pháp nào chọn phần tử có thuộc tính title chứa chuỗi 'css'?",
            "A. [title='css']\n"
            + "B. [title^='css']\n"
            + "C. [title*='css']\n"
            + "D. [title~='css']",
            "Attribute selector thường dùng với thẻ nào nhất?",
            "A. <div>\n"
            + "B. <a>\n"
            + "C. <span>\n"
            + "D. <p>",
            "Cú pháp nào chọn input không được disabled?",
            "A. input[!disabled]\n"
            + "B. input:not([disabled])\n"
            + "C. input[disabled=false]\n"
            + "D. input[enabled]"
        });
        TITLE_MAP.put("Đơn vị tuyệt đối", new String[]{
            "Đơn vị nào sau đây là đơn vị tuyệt đối?",
            "A. em\n"
            + "B. rem\n"
            + "C. px\n"
            + "D. %",
            "1 inch bằng bao nhiêu pixel (trên màn hình 96dpi)?",
            "A. 72px\n"
            + "B. 96px\n"
            + "C. 100px\n"
            + "D. 120px",
            "Đơn vị nào nhỏ nhất trong các đơn vị sau?",
            "A. 1cm\n"
            + "B. 10mm\n"
            + "C. 0.5in\n"
            + "D. 50px",
            "Đơn vị pt (point) thường dùng cho mục đích gì?",
            "A. Thiết kế web responsive\n"
            + "B. In ấn\n"
            + "C. Animation\n"
            + "D. Border radius",
            "1pc (pica) bằng bao nhiêu pt (point)?",
            "A. 6pt\n"
            + "B. 12pt\n"
            + "C. 16pt\n"
            + "D. 20pt",
            "Đơn vị nào KHÔNG phải là đơn vị tuyệt đối?",
            "A. cm\n"
            + "B. mm\n"
            + "C. vw\n"
            + "D. in",
            "Khi nào nên dùng đơn vị tuyệt đối?",
            "A. Khi cần thiết kế responsive\n"
            + "B. Khi cần kích thước không đổi\n"
            + "C. Khi làm việc với font chữ\n"
            + "D. Khi cần tính toán bằng JavaScript",
            "Đơn vị nào phù hợp nhất để xác định kích thước border?",
            "A. em\n"
            + "B. rem\n"
            + "C. px\n"
            + "D. %",
            "12pt tương đương với bao nhiêu px?",
            "A. 12px\n"
            + "B. 16px\n"
            + "C. 20px\n"
            + "D. 24px",
            "Đơn vị tuyệt đối nào sau đây ít dùng nhất trong web?",
            "A. px\n"
            + "B. cm\n"
            + "C. mm\n"
            + "D. pc"
        });
        TITLE_MAP.put("Đơn vị tương đối", new String[]{
            "Đơn vị nào sau đây là đơn vị tương đối?",
            "A. px\n"
            + "B. em\n"
            + "C. pt\n"
            + "D. in",
            "1em bằng bao nhiêu pixel?",
            "A. 10px\n"
            + "B. 12px\n"
            + "C. 16px\n"
            + "D. Phụ thuộc vào font-size của phần tử",
            "Đơn vị rem dựa trên font-size của phần tử nào?",
            "A. Phần tử hiện tại\n"
            + "B. Phần tử cha\n"
            + "C. Phần tử gốc (html)\n"
            + "D. Phần tử body",
            "Đơn vị vw (viewport width) bằng bao nhiêu phần trăm chiều rộng viewport?",
            "A. 1/10\n"
            + "B. 1/100\n"
            + "C. 1/1000\n"
            + "D. 1/10000",
            "Khi nào nên sử dụng đơn vị %?",
            "A. Khi cần giá trị tuyệt đối\n"
            + "B. Khi cần giá trị tương đối so với phần tử cha\n"
            + "C. Khi làm việc với font chữ\n"
            + "D. Khi cần đơn vị cố định",
            "Đơn vị nào thích hợp nhất cho responsive design?",
            "A. px\n"
            + "B. em\n"
            + "C. rem\n"
            + "D. Cả B và C",
            "Giá trị 50vh tương đương với bao nhiêu?",
            "A. 50% chiều rộng viewport\n"
            + "B. 50% chiều cao viewport\n"
            + "C. 50px\n"
            + "D. 50% font-size",
            "Đơn vị nào sau đây KHÔNG phải là đơn vị tương đối?",
            "A. %\n"
            + "B. vmin\n"
            + "C. ch\n"
            + "D. cm",
            "1vmin bằng giá trị nào sau đây?",
            "A. 1% chiều rộng viewport\n"
            + "B. 1% chiều cao viewport\n"
            + "C. Giá trị nhỏ hơn giữa 1vw và 1vh\n"
            + "D. Giá trị lớn hơn giữa 1vw và 1vh",
            "Đơn vị ex dựa trên chiều cao của ký tự nào trong font chữ?",
            "A. Ký tự 'A'\n"
            + "B. Ký tự 'M'\n"
            + "C. Ký tự 'x'\n"
            + "D. Ký tự 'g'"
        });
        TITLE_MAP.put("Cấu trúc Box Model", new String[]{
            "Box Model trong CSS gồm những phần nào?",
            "A. Content, Border, Shadow, Margin\n"
            + "B. Content, Padding, Border, Margin\n"
            + "C. Width, Height, Depth, Shadow\n"
            + "D. Text, Image, Link, Background",
            "Thuộc tính nào thay đổi khoảng cách giữa content và border?",
            "A. margin\n"
            + "B. padding\n"
            + "C. spacing\n"
            + "D. gap",
            "Thuộc tính box-sizing: border-box có tác dụng gì?",
            "A. Bao gồm padding và border trong width/height\n"
            + "B. Loại bỏ margin\n"
            + "C. Ẩn border\n"
            + "D. Chỉ tính content",
            "Làm cách nào để căn giữa một phần tử theo chiều ngang?",
            "A. margin: auto;\n"
            + "B. padding: center;\n"
            + "C. align: middle;\n"
            + "D. position: center;",
            "Thuộc tính nào KHÔNG thuộc Box Model?",
            "A. box-shadow\n"
            + "B. margin\n"
            + "C. outline\n"
            + "D. z-index",
            "Giá trị nào đặt margin cho 4 hướng (top, right, bottom, left)?",
            "A. margin: 10px;\n"
            + "B. margin: 10px 20px;\n"
            + "C. margin: 10px 20px 15px;\n"
            + "D. margin: 10px 20px 15px 5px;",
            "Đơn vị nào KHÔNG dùng cho Box Model?",
            "A. px\n"
            + "B. em\n"
            + "C. %\n"
            + "D. mph",
            "Thuộc tính nào thay đổi khoảng cách giữa các phần tử?",
            "A. padding\n"
            + "B. margin\n"
            + "C. border\n"
            + "D. content",
            "Làm cách nào để loại bỏ margin collapse?",
            "A. Thêm padding\n"
            + "B. Thêm border\n"
            + "C. Thêm outline\n"
            + "D. Sử dụng flexbox",
            "Thuộc tính nào thêm đường viền nét đứt?",
            "A. border-style: solid;\n"
            + "B. border-style: dashed;\n"
            + "C. border-style: dotted;\n"
            + "D. border-style: double;"
        });
        TITLE_MAP.put("Width và Height", new String[]{
            "Thuộc tính width: 100% sẽ làm gì?",
            "A. Bằng 100% chiều rộng viewport\n"
            + "B. Bằng 100% chiều rộng phần tử cha\n"
            + "C. Cố định 100px\n"
            + "D. Bằng 100% chiều cao phần tử",
            "Thuộc tính nào đặt chiều cao tối thiểu?",
            "A. height\n"
            + "B. min-height\n"
            + "C. max-height\n"
            + "D. min-width",
            "Giá trị nào KHÔNG hợp lệ cho thuộc tính width?",
            "A. 100px\n"
            + "B. 50%\n"
            + "C. auto\n"
            + "D. 100vh",
            "Thuộc tính height: 100vh có nghĩa là gì?",
            "A. 100% chiều rộng viewport\n"
            + "B. 100% chiều cao viewport\n"
            + "C. 100% chiều cao phần tử cha\n"
            + "D. 100px",
            "Làm cách nào để phần tử luôn là hình vuông (tỉ lệ 1:1)?",
            "A. width: 100%; height: 100%;\n"
            + "B. width: 100px; height: 100px;\n"
            + "C. width: 100%; padding-top: 100%;\n"
            + "D. width: auto; height: auto;",
            "Thuộc tính box-sizing ảnh hưởng thế nào đến width/height?",
            "A. Không ảnh hưởng\n"
            + "B. Bao gồm padding và border\n"
            + "C. Chỉ bao gồm margin\n"
            + "D. Chỉ ảnh hưởng khi dùng %",
            "Thuộc tính nào KHÔNG ảnh hưởng đến kích thước thực tế của phần tử?",
            "A. width\n"
            + "B. height\n"
            + "C. box-sizing\n"
            + "D. display",
            "Khi nào nên sử dụng max-width thay cho width?",
            "A. Khi cần phần tử co giãn nhưng không vượt quá giá trị\n"
            + "B. Khi cần giá trị tuyệt đối\n"
            + "C. Khi làm việc với table\n"
            + "D. Khi cần ẩn phần tử",
            "Thuộc tính nào đặt chiều cao bằng chiều rộng?",
            "A. height: width;\n"
            + "B. height: 100%;\n"
            + "C. height: auto;\n"
            + "D. Không có thuộc tính trực tiếp",
            "Giá trị nào sau đây là đúng cho aspect-ratio?",
            "A. 1/1\n"
            + "B. 16:9\n"
            + "C. 4x3\n"
            + "D. 100%"
        });
        TITLE_MAP.put("max-width và min-width", new String[]{
            "Thuộc tính max-width: 1200px có nghĩa là gì?",
            "A. Phần tử luôn rộng 1200px\n"
            + "B. Phần tử không vượt quá 1200px\n"
            + "C. Phần tử có chiều rộng tối thiểu 1200px\n"
            + "D. Phần tử sẽ co giãn từ 0 đến 1200px",
            "Khi nào nên sử dụng min-width?",
            "A. Khi cần giới hạn kích thước tối đa\n"
            + "B. Khi cần đảm bảo phần tử không nhỏ hơn giá trị\n"
            + "C. Khi cần giá trị tuyệt đối\n"
            + "D. Khi làm việc với font chữ",
            "Có thể kết hợp max-width và width không?",
            "A. Không thể\n"
            + "B. Có, width sẽ ưu tiên hơn\n"
            + "C. Có, max-width sẽ giới hạn width\n"
            + "D. Chỉ khi dùng !important",
            "Giá trị nào KHÔNG hợp lệ cho max-width?",
            "A. 100%\n"
            + "B. 100px\n"
            + "C. none\n"
            + "D. auto",
            "Thuộc tính min-width: 300px áp dụng khi nào?",
            "A. Luôn luôn\n"
            + "B. Khi viewport rộng hơn 300px\n"
            + "C. Khi phần tử có nguy cơ nhỏ hơn 300px\n"
            + "D. Khi dùng media query",
            "Làm cách nào để tạo phần tử co giãn từ 300px đến 800px?",
            "A. width: 300px; max-width: 800px;\n"
            + "B. min-width: 300px; max-width: 800px;\n"
            + "C. width: 800px; min-width: 300px;\n"
            + "D. width: 50%; min: 300px; max: 800px;",
            "Thuộc tính nào quan trọng cho responsive images?",
            "A. width\n"
            + "B. max-width\n"
            + "C. min-width\n"
            + "D. height",
            "Giá trị nào đúng cho min-width trong mobile-first design?",
            "A. min-width: 320px\n"
            + "B. min-width: 1200px\n"
            + "C. min-width: 100%\n"
            + "D. min-width: auto",
            "Thuộc tính max-width: none có tác dụng gì?",
            "A. Xóa giới hạn max-width\n"
            + "B. Đặt max-width bằng width\n"
            + "C. Ẩn phần tử\n"
            + "D. Không có tác dụng",
            "Kết hợp nào sau đây là đúng cho responsive container?",
            "A. width: 100%; max-width: 1200px;\n"
            + "B. width: 1200px; min-width: 100%;\n"
            + "C. max-width: 100%; width: 1200px;\n"
            + "D. min-width: 1200px; width: 100%;"
        });
        TITLE_MAP.put("Các loại position chính", new String[]{
            "Giá trị nào của thuộc tính position KHÔNG phải là giá trị chính?",
            "A. static\n"
            + "B. relative\n"
            + "C. fixed\n"
            + "D. center",
            "Giá trị mặc định của thuộc tính position là gì?",
            "A. absolute\n"
            + "B. relative\n"
            + "C. static\n"
            + "D. fixed",
            "Position nào sẽ định vị phần tử theo viewport?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Position nào thường được dùng làm điểm chuẩn cho phần tử absolute?",
            "A. static\n"
            + "B. relative\n"
            + "C. fixed\n"
            + "D. sticky",
            "Position nào là sự kết hợp giữa relative và fixed?",
            "A. static\n"
            + "B. absolute\n"
            + "C. sticky\n"
            + "D. inherit",
            "Thuộc tính nào cần thiết khi sử dụng position: absolute?",
            "A. display\n"
            + "B. float\n"
            + "C. top/right/bottom/left\n"
            + "D. margin",
            "Position nào KHÔNG làm phần tử thoát khỏi flow thông thường?",
            "A. static\n"
            + "B. absolute\n"
            + "C. fixed\n"
            + "D. sticky",
            "Position nào phù hợp để tạo menu cố định ở đầu trang?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Position nào cần chỉ định ngưỡng kích hoạt (threshold)?",
            "A. sticky\n"
            + "B. absolute\n"
            + "C. relative\n"
            + "D. static",
            "Position nào thường dùng để tạo tooltip?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed"
        });
        TITLE_MAP.put("Sự khác biệt giữa các kiểu positioning", new String[]{
            "Sự khác biệt chính giữa position: relative và absolute?",
            "A. Relative định vị theo cha, absolute theo viewport\n"
            + "B. Relative giữ vị trí ban đầu, absolute thoát khỏi flow\n"
            + "C. Relative dùng z-index, absolute không dùng\n"
            + "D. Không có khác biệt",
            "Position nào KHÔNG ảnh hưởng đến vị trí các phần tử khác?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Phần tử fixed sẽ định vị theo đâu khi có transform trên phần tử cha?",
            "A. Theo viewport\n"
            + "B. Theo phần tử cha\n"
            + "C. Theo phần tử gốc\n"
            + "D. Theo vị trí ban đầu",
            "Điểm khác biệt giữa fixed và sticky là gì?",
            "A. Fixed luôn cố định, sticky chỉ cố định khi đạt ngưỡng\n"
            + "B. Fixed dùng %, sticky dùng px\n"
            + "C. Fixed có z-index cao hơn\n"
            + "D. Không có khác biệt",
            "Position nào KHÔNG thể sử dụng z-index?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Khi nào position: absolute sẽ định vị theo viewport?",
            "A. Khi không có phần tử cha nào có position khác static\n"
            + "B. Luôn luôn\n"
            + "C. Khi phần tử cha có display: flex\n"
            + "D. Khi sử dụng float",
            "Sự khác biệt về không gian chiếm giữ giữa absolute và fixed?",
            "A. Absolute chiếm không gian, fixed không\n"
            + "B. Fixed chiếm không gian, absolute không\n"
            + "C. Cả hai đều không chiếm không gian\n"
            + "D. Cả hai đều chiếm không gian",
            "Position nào thay đổi vị trí nhưng vẫn giữ không gian ban đầu?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Thuộc tính nào ảnh hưởng đến stacking context?",
            "A. position với giá trị khác static + z-index\n"
            + "B. Chỉ position: absolute\n"
            + "C. Chỉ position: fixed\n"
            + "D. Tất cả các position",
            "Position nào phù hợp nhất cho layout phức tạp với các lớp chồng nhau?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed"
        });
        TITLE_MAP.put("Ứng dụng thực tế của từng loại", new String[]{
            "Position nào phù hợp nhất để tạo header cố định khi cuộn trang?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Khi nào nên sử dụng position: sticky?",
            "A. Khi cần phần tử dính khi cuộn đến vị trí nhất định\n"
            + "B. Khi cần phần tử luôn ở góc màn hình\n"
            + "C. Khi cần phần tử di chuyển theo chuột\n"
            + "D. Khi cần ẩn phần tử",
            "Position nào thích hợp để tạo tooltip xuất hiện khi hover?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Ứng dụng phổ biến nhất của position: relative là gì?",
            "A. Làm container cho phần tử absolute\n"
            + "B. Tạo hiệu ứng parallax\n"
            + "C. Xây dựng layout lưới\n"
            + "D. Tạo animation",
            "Position nào thường dùng cho modal dialog?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Khi nào nên dùng position: absolute thay vì fixed?",
            "A. Khi cần phần tử định vị theo một container cụ thể\n"
            + "B. Khi cần phần tử luôn hiển thị trên màn hình\n"
            + "C. Khi làm menu di động\n"
            + "D. Khi làm carousel",
            "Position nào phù hợp để tạo breadcrumb navigation?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. fixed",
            "Position nào thích hợp nhất cho các thành phần trong slideshow?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. sticky",
            "Kỹ thuật nào thường dùng position: relative và absolute kết hợp?",
            "A. CSS Grid\n"
            + "B. Custom checkbox/radio\n"
            + "C. Flexbox layout\n"
            + "D. Media queries",
            "Position nào ít được sử dụng nhất trong thực tế?",
            "A. static\n"
            + "B. relative\n"
            + "C. absolute\n"
            + "D. sticky"
        });
        TITLE_MAP.put("Hệ màu HEX", new String[]{
            "Hệ màu HEX biểu diễn bằng bao nhiêu ký tự?",
            "A. 3 hoặc 6\n"
            + "B. Chỉ 3\n"
            + "C. Chỉ 6\n"
            + "D. 2 hoặc 4",
            "Mã HEX nào biểu diễn màu trắng?",
            "A. #000000\n"
            + "B. #FFFFFF\n"
            + "C. #111111\n"
            + "D. #999999",
            "Trong mã HEX #FF0000, thành phần nào có giá trị cao nhất?",
            "A. Đỏ\n"
            + "B. Xanh lá\n"
            + "C. Xanh dương\n"
            + "D. Alpha",
            "Mã HEX rút gọn nào tương đương với #336699?",
            "A. #369\n"
            + "B. #396\n"
            + "C. #639\n"
            + "D. #693",
            "Ký tự nào KHÔNG có trong hệ màu HEX?",
            "A. A\n"
            + "B. F\n"
            + "C. G\n"
            + "D. 9",
            "Mã HEX nào biểu diễn màu xanh lá cây thuần?",
            "A. #00FF00\n"
            + "B. #0000FF\n"
            + "C. #FF0000\n"
            + "D. #FFFF00",
            "Giá trị HEX nào có độ sáng cao nhất?",
            "A. #010101\n"
            + "B. #505050\n"
            + "C. #A0A0A0\n"
            + "D. #F0F0F0",
            "Mã HEX 8 ký tự có thêm thông tin gì so với 6 ký tự?",
            "A. Độ trong suốt (alpha)\n"
            + "B. Màu phụ\n"
            + "C. Độ bão hòa\n"
            + "D. Màu đệm",
            "Cách viết nào đúng cho màu HEX có alpha 50%?",
            "A. #FF000050\n"
            + "B. #FF0000.5\n"
            + "C. #FF0000 50%\n"
            + "D. #FF0000/50",
            "Mã HEX nào tương đương với rgb(255, 165, 0)?",
            "A. #FFA500\n"
            + "B. #FA0500\n"
            + "C. #F5A000\n"
            + "D. #FF0A50"
        });
        TITLE_MAP.put("Hệ màu RGB", new String[]{
            "Hệ màu RGB là viết tắt của gì?",
            "A. Red, Gray, Blue\n"
            + "B. Red, Green, Black\n"
            + "C. Red, Green, Blue\n"
            + "D. Red, Gold, Blue",
            "Giá trị RGB nào biểu diễn màu đỏ thuần?",
            "A. rgb(0, 0, 0)\n"
            + "B. rgb(255, 0, 0)\n"
            + "C. rgb(0, 255, 0)\n"
            + "D. rgb(0, 0, 255)",
            "Giá trị RGB cho màu trắng là gì?",
            "A. rgb(0, 0, 0)\n"
            + "B. rgb(255, 255, 255)\n"
            + "C. rgb(128, 128, 128)\n"
            + "D. rgb(255, 0, 255)",
            "Cú pháp nào đúng cho màu RGB với độ trong suốt?",
            "A. rgb(255,0,0,0.5)\n"
            + "B. rgba(255,0,0,0.5)\n"
            + "C. rgb(255,0,0,50%)\n"
            + "D. rgb(255,0,0)/0.5",
            "Giá trị nào KHÔNG hợp lệ trong hệ màu RGB?",
            "A. 0\n"
            + "B. 255\n"
            + "C. 100%\n"
            + "D. 256",
            "Màu vàng thuần được biểu diễn bằng RGB nào?",
            "A. rgb(255, 255, 0)\n"
            + "B. rgb(0, 255, 255)\n"
            + "C. rgb(255, 0, 255)\n"
            + "D. rgb(255, 255, 255)",
            "Giá trị alpha trong rgba() nằm trong khoảng nào?",
            "A. 0-100\n"
            + "B. 0-255\n"
            + "C. 0.0-1.0\n"
            + "D. 0%-100%",
            "rgb(128, 128, 128) cho màu gì?",
            "A. Đỏ\n"
            + "B. Xám\n"
            + "C. Xanh lá\n"
            + "D. Trắng",
            "Cách viết nào tương đương với #FF0000?",
            "A. rgb(255, 0, 0)\n"
            + "B. rgb(100%, 0%, 0%)\n"
            + "C. Cả A và B\n"
            + "D. Không có đáp án đúng",
            "Hệ màu RGB có bao nhiêu màu cơ bản?",
            "A. 1\n"
            + "B. 2\n"
            + "C. 3\n"
            + "D. 4"
        });
        TITLE_MAP.put("Hệ màu HSL", new String[]{
            "HSL là viết tắt của gì?",
            "A. Hue, Saturation, Lightness\n"
            + "B. Hue, Saturation, Luminance\n"
            + "C. Hue, Shade, Lightness\n"
            + "D. Hue, Saturation, Level",
            "Giá trị Hue trong HSL nằm trong khoảng nào?",
            "A. 0-100\n"
            + "B. 0-255\n"
            + "C. 0-360\n"
            + "D. 0.0-1.0",
            "Giá trị nào biểu diễn màu đỏ thuần trong HSL?",
            "A. hsl(0, 100%, 50%)\n"
            + "B. hsl(120, 100%, 50%)\n"
            + "C. hsl(240, 100%, 50%)\n"
            + "D. hsl(360, 0%, 100%)",
            "Giá trị Saturation 0% trong HSL cho màu gì?",
            "A. Màu thuần khiết\n"
            + "B. Màu xám\n"
            + "C. Màu trắng\n"
            + "D. Màu đen",
            "Lightness 100% trong HSL cho màu gì?",
            "A. Màu thuần khiết\n"
            + "B. Màu xám\n"
            + "C. Màu trắng\n"
            + "D. Màu đen",
            "Cú pháp nào đúng cho HSL với độ trong suốt?",
            "A. hsl(120,100%,50%,0.5)\n"
            + "B. hsla(120,100%,50%,0.5)\n"
            + "C. hsl(120,100%,50%,50%)\n"
            + "D. hsl(120,100%,50%)/0.5",
            "Màu hsl(120, 100%, 50%) là màu gì?",
            "A. Đỏ\n"
            + "B. Xanh lá\n"
            + "C. Xanh dương\n"
            + "D. Vàng",
            "Giá trị nào KHÔNG hợp lệ trong hệ màu HSL?",
            "A. Hue: 370\n"
            + "B. Saturation: 110%\n"
            + "C. Lightness: -10%\n"
            + "D. Tất cả các đáp án trên",
            "Ưu điểm chính của HSL so với RGB là gì?",
            "A. Dễ dàng điều chỉnh màu sắc\n"
            + "B. Hỗ trợ nhiều trình duyệt hơn\n"
            + "C. Tiết kiệm bộ nhớ hơn\n"
            + "D. Không có ưu điểm",
            "hsl(0, 0%, 0%) cho màu gì?",
            "A. Trắng\n"
            + "B. Đỏ\n"
            + "C. Đen\n"
            + "D. Xám"
        });
        TITLE_MAP.put("Font-family", new String[]{
            "Thuộc tính font-family dùng để làm gì?",
            "A. Đặt kích thước chữ\n"
            + "B. Đặt kiểu chữ\n"
            + "C. Đặt độ đậm chữ\n"
            + "D. Đặt màu chữ",
            "Cú pháp nào đúng để chỉ định nhiều font dự phòng?",
            "A. font-family: Arial, sans-serif;\n"
            + "B. font-family: Arial; sans-serif;\n"
            + "C. font-family: Arial + sans-serif;\n"
            + "D. font-family: Arial > sans-serif;",
            "Font nào sau đây là web-safe font?",
            "A. Arial\n"
            + "B. CustomFont\n"
            + "C. Google Sans\n"
            + "D. SF Pro",
            "Tại sao nên chỉ định font generic family cuối cùng?",
            "A. Để trình duyệt chọn font tương tự khi không có font chính\n"
            + "B. Để tiết kiệm bộ nhớ\n"
            + "C. Để tăng tốc độ load trang\n"
            + "D. Để hỗ trợ in ấn",
            "Giá trị nào KHÔNG phải là generic family?",
            "A. serif\n"
            + "B. sans-serif\n"
            + "C. monospace\n"
            + "D. times",
            "Cú pháp nào đúng cho font có khoảng trắng trong tên?",
            "A. font-family: Times New Roman;\n"
            + "B. font-family: 'Times New Roman';\n"
            + "C. font-family: Times-New-Roman;\n"
            + "D. font-family: Times+New+Roman;",
            "Làm cách nào để sử dụng font từ Google Fonts?",
            "A. Chỉ cần khai báo trong CSS\n"
            + "B. Import link trong HTML rồi dùng trong CSS\n"
            + "C. Tải font về máy\n"
            + "D. Chỉ hoạt động trên Chrome",
            "Thuộc tính @font-face dùng để làm gì?",
            "A. Nhúng font tùy chỉnh\n"
            + "B. Thay đổi kích thước font\n"
            + "C. Đặt màu cho font\n"
            + "D. Tạo hiệu ứng cho font",
            "Font stack là gì?",
            "A. Danh sách các font dự phòng\n"
            + "B. Cách xếp chồng các font\n"
            + "C. Hiệu ứng đổ bóng cho font\n"
            + "D. Công cụ đo kích thước font",
            "Lý do nên sử dụng system-ui trong font-family?",
            "A. Sử dụng font mặc định của hệ điều hành\n"
            + "B. Font này đẹp nhất\n"
            + "C. Hỗ trợ mọi ngôn ngữ\n"
            + "D. Tải nhanh hơn"
        });
        TITLE_MAP.put("Font-size", new String[]{
            "Đơn vị nào KHÔNG dùng cho font-size?",
            "A. px\n"
            + "B. em\n"
            + "C. rem\n"
            + "D. mph",
            "Giá trị mặc định của font-size trong hầu hết trình duyệt là bao nhiêu?",
            "A. 10px\n"
            + "B. 12px\n"
            + "C. 16px\n"
            + "D. 20px",
            "1em bằng bao nhiêu pixel?",
            "A. 10px\n"
            + "B. 12px\n"
            + "C. Bằng font-size hiện tại\n"
            + "D. Bằng font-size của phần tử gốc",
            "Sự khác biệt giữa em và rem là gì?",
            "A. em phụ thuộc vào phần tử cha, rem vào phần tử gốc\n"
            + "B. em lớn hơn rem\n"
            + "C. rem chỉ dùng cho media queries\n"
            + "D. Không có khác biệt",
            "Tại sao nên dùng đơn vị tương đối cho font-size?",
            "A. Để dễ dàng thay đổi kích thước trên các thiết bị\n"
            + "B. Để font hiển thị giống nhau trên mọi trình duyệt\n"
            + "C. Để tiết kiệm bộ nhớ\n"
            + "D. Để tăng tốc độ load trang",
            "Giá trị nào đặt font-size lớn hơn 20% so với font-size hiện tại?",
            "A. font-size: 1.2em;\n"
            + "B. font-size: 120%;\n"
            + "C. Cả A và B\n"
            + "D. font-size: +20;",
            "Thuộc tính font-size: smaller sẽ làm gì?",
            "A. Giảm kích thước so với phần tử cha\n"
            + "B. Đặt kích thước nhỏ nhất có thể\n"
            + "C. Giảm 1px so với kích thước hiện tại\n"
            + "D. Không có tác dụng",
            "Làm cách nào để đặt font-size cho toàn bộ trang?",
            "A. body { font-size: ... }\n"
            + "B. html { font-size: ... }\n"
            + "C. * { font-size: ... }\n"
            + "D. document { font-size: ... }",
            "Đơn vị vw trong font-size có nghĩa là gì?",
            "A. 1% chiều rộng viewport\n"
            + "B. 1% chiều cao viewport\n"
            + "C. 1px\n"
            + "D. 1em",
            "Khi nào nên sử dụng px cho font-size?",
            "A. Khi cần kích thước chính xác\n"
            + "B. Khi làm layout responsive\n"
            + "C. Khi muốn font co giãn theo thiết bị\n"
            + "D. Không nên dùng px"
        });
        TITLE_MAP.put("Font-weight", new String[]{
            "Thuộc tính font-weight dùng để làm gì?",
            "A. Thay đổi kiểu font\n"
            + "B. Thay đổi độ đậm của font\n"
            + "C. Thay đổi màu sắc font\n"
            + "D. Thay đổi khoảng cách giữa các chữ",
            "Giá trị nào KHÔNG phải là giá trị hợp lệ của font-weight?",
            "A. normal\n"
            + "B. bold\n"
            + "C. 500\n"
            + "D. italic",
            "Giá trị font-weight tương đương với bold là gì?",
            "A. 400\n"
            + "B. 500\n"
            + "C. 600\n"
            + "D. 700",
            "Giá trị mặc định của font-weight là gì?",
            "A. 100\n"
            + "B. 400 (normal)\n"
            + "C. 700 (bold)\n"
            + "D. 900",
            "Có bao nhiêu mức độ font-weight từ 100-900?",
            "A. 5\n"
            + "B. 7\n"
            + "C. 9\n"
            + "D. 11",
            "Làm cách nào để làm chữ mỏng hơn bình thường?",
            "A. font-weight: thin;\n"
            + "B. font-weight: lighter;\n"
            + "C. font-weight: 100;\n"
            + "D. Cả B và C",
            "Tại sao font-weight: 500 có thể không hiển thị khác 400?",
            "A. Vì font không hỗ trợ nhiều mức độ đậm\n"
            + "B. Vì trình duyệt không hỗ trợ\n"
            + "C. Vì cần thêm thuộc tính font-style\n"
            + "D. Vì giá trị này không tồn tại",
            "Thuộc tính nào liên quan mật thiết đến font-weight?",
            "A. font-family\n"
            + "B. font-size\n"
            + "C. font-stretch\n"
            + "D. font-variant",
            "Làm cách nào để kiểm tra font có hỗ trợ nhiều mức độ đậm?",
            "A. Dùng @font-face với các mức độ khác nhau\n"
            + "B. Thử các giá trị từ 100-900\n"
            + "C. Kiểm tra tài liệu font\n"
            + "D. Tất cả các cách trên",
            "Giá trị nào làm chữ đậm hơn bold?",
            "A. bolder\n"
            + "B. 800\n"
            + "C. 900\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Line-height", new String[]{
            "Thuộc tính line-height dùng để làm gì?",
            "A. Đặt khoảng cách giữa các dòng\n"
            + "B. Đặt khoảng cách giữa các chữ\n"
            + "C. Đặt độ cao của font\n"
            + "D. Đặt khoảng cách giữa các đoạn",
            "Giá trị nào là giá trị mặc định của line-height?",
            "A. 0\n"
            + "B. 1\n"
            + "C. normal\n"
            + "D. 16px",
            "Cú pháp nào đặt line-height gấp 1.5 lần font-size?",
            "A. line-height: 1.5;\n"
            + "B. line-height: 150%;\n"
            + "C. line-height: 1.5em;\n"
            + "D. Tất cả các đáp án trên",
            "Tại sao nên dùng giá trị không đơn vị cho line-height?",
            "A. Để kế thừa theo font-size\n"
            + "B. Để tiết kiệm bộ nhớ\n"
            + "C. Để tăng tốc độ render\n"
            + "D. Để hỗ trợ trình đọc màn hình",
            "Giá trị line-height nào KHÔNG hợp lệ?",
            "A. 1.2\n"
            + "B. 120%\n"
            + "C. 20px\n"
            + "D. normal\n"
            + "E. Tất cả đều hợp lệ",
            "Làm cách nào để căn giữa văn bản theo chiều dọc trong một phần tử?",
            "A. line-height = height\n"
            + "B. vertical-align: middle\n"
            + "C. align-items: center\n"
            + "D. text-align: center",
            "Giá trị line-height nào phù hợp cho đoạn văn bản dễ đọc?",
            "A. 0.8\n"
            + "B. 1\n"
            + "C. 1.5\n"
            + "D. 3",
            "Sự khác biệt giữa line-height: 24px và line-height: 1.5em khi font-size: 16px?",
            "A. 24px: cố định, 1.5em: thay đổi theo font-size con\n"
            + "B. 1.5em: cố định, 24px: thay đổi\n"
            + "C. Không có khác biệt\n"
            + "D. 1.5em chỉ dùng cho phần tử gốc",
            "Thuộc tính nào ảnh hưởng đến hiệu quả của line-height?",
            "A. font-family\n"
            + "B. font-size\n"
            + "C. vertical-align\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên dùng giá trị px cho line-height?",
            "A. Khi cần chính xác pixel\n"
            + "B. Khi làm việc với ảnh\n"
            + "C. Khi font-size cố định\n"
            + "D. Không nên dùng px"
        });
        TITLE_MAP.put("Letter-spacing", new String[]{
            "Thuộc tính letter-spacing dùng để làm gì?",
            "A. Đặt khoảng cách giữa các dòng\n"
            + "B. Đặt khoảng cách giữa các chữ cái\n"
            + "C. Đặt khoảng cách giữa các từ\n"
            + "D. Đặt độ rộng của font",
            "Giá trị mặc định của letter-spacing là gì?",
            "A. 0\n"
            + "B. 1px\n"
            + "C. normal\n"
            + "D. auto",
            "Giá trị nào làm tăng khoảng cách giữa các chữ cái?",
            "A. -1px\n"
            + "B. 0\n"
            + "C. 1px\n"
            + "D. normal",
            "Đơn vị nào KHÔNG dùng được với letter-spacing?",
            "A. px\n"
            + "B. em\n"
            + "C. %\n"
            + "D. rem",
            "Khi nào nên sử dụng letter-spacing âm?",
            "A. Khi cần chữ sát nhau hơn\n"
            + "B. Khi làm hiệu ứng đặc biệt\n"
            + "C. Khi dùng font có khoảng cách rộng\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào liên quan đến letter-spacing?",
            "A. word-spacing\n"
            + "B. text-transform\n"
            + "C. font-kerning\n"
            + "D. Tất cả các đáp án trên",
            "Giá trị letter-spacing nào phù hợp cho tiêu đề in hoa?",
            "A. -0.5px\n"
            + "B. 0\n"
            + "C. 1-2px\n"
            + "D. 10px",
            "Làm cách nào để reset letter-spacing về mặc định?",
            "A. letter-spacing: 0;\n"
            + "B. letter-spacing: normal;\n"
            + "C. letter-spacing: initial;\n"
            + "D. Tất cả các đáp án trên",
            "Hiệu ứng tracking trong typography tương đương với thuộc tính nào?",
            "A. line-height\n"
            + "B. letter-spacing\n"
            + "C. word-spacing\n"
            + "D. text-indent",
            "Khi nào letter-spacing không có tác dụng?",
            "A. Khi font là monospace\n"
            + "B. Khi dùng giá trị 0\n"
            + "C. Khi text-align: justify\n"
            + "D. Luôn có tác dụng"
        });
        TITLE_MAP.put("Ứng dụng thực tế", new String[]{
            "Khi nào nên tăng letter-spacing?",
            "A. Tiêu đề in hoa\n"
            + "B. Văn bản nhỏ\n"
            + "C. Font có độ dày lớn\n"
            + "D. Tất cả các đáp án trên",
            "Làm cách nào để cải thiện khả năng đọc cho văn bản dài?",
            "A. Tăng line-height\n"
            + "B. Chọn font phù hợp\n"
            + "C. Đặt màu tương phản tốt\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên dùng font-weight: bold cho nút bấm?",
            "A. Luôn luôn\n"
            + "B. Khi cần nhấn mạnh hành động\n"
            + "C. Khi nút là màu sáng\n"
            + "D. Khi dùng font sans-serif",
            "Cách tốt nhất để căn giữa văn bản theo chiều dọc trong một button?",
            "A. line-height = height\n"
            + "B. padding top và bottom bằng nhau\n"
            + "C. flexbox với align-items: center\n"
            + "D. Tất cả các cách trên",
            "Khi nào nên giảm letter-spacing?",
            "A. Khi dùng font có khoảng cách rộng\n"
            + "B. Khi text quá dài\n"
            + "C. Khi làm logo\n"
            + "D. Khi cần tiết kiệm không gian",
            "Làm cách nào để tạo hiệu ứng typography đẹp cho tiêu đề?",
            "A. Kết hợp font-weight và letter-spacing\n"
            + "B. Dùng text-transform: uppercase\n"
            + "C. Thêm text-shadow phù hợp\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên dùng đơn vị em cho line-height?",
            "A. Khi cần kế thừa theo font-size\n"
            + "B. Khi làm responsive design\n"
            + "C. Khi dùng media queries\n"
            + "D. Tất cả các đáp án trên",
            "Cách tốt nhất để xử lý khoảng cách chữ trong mobile?",
            "A. Giảm letter-spacing\n"
            + "B. Tăng line-height\n"
            + "C. Dùng media queries điều chỉnh\n"
            + "D. Không cần thay đổi",
            "Làm cách nào để kiểm tra sự kết hợp typography?",
            "A. Xem trên nhiều thiết bị\n"
            + "B. In thử ra giấy\n"
            + "C. Nhờ người khác đọc thử\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên dùng font-weight khác 400/700?",
            "A. Khi thiết kế hệ thống typography phức tạp\n"
            + "B. Khi cần các mức độ nhấn mạnh khác nhau\n"
            + "C. Khi dùng font có nhiều mức độ đậm\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Display: block", new String[]{
            "Thuộc tính CSS `display: block;` có tác dụng gì?\n"
            + "\n"
            + "A. Hiển thị phần tử như một phần tử nội tuyến.\n"
            + "B. Hiển thị phần tử như một phần tử khối, chiếm toàn bộ chiều rộng.\n"
            + "C. Hiển thị phần tử như một phần tử nội tuyến khối.\n"
            + "D. Ẩn phần tử.",
            "Phần tử HTML nào mặc định có `display: block;`?\n"
            + "\n"
            + "A. <span>.\n"
            + "B. <a>.\n"
            + "C. <p>.\n"
            + "D. <img>.",
            "Điều gì xảy ra khi bạn đặt `width` và `height` cho phần tử có `display: block;`?\n"
            + "\n"
            + "A. Các thuộc tính này bị bỏ qua.\n"
            + "B. Các thuộc tính này được áp dụng.\n"
            + "C. Chiều rộng và chiều cao được tính toán tự động.\n"
            + "D. Chỉ chiều rộng được áp dụng.",
            "Thuộc tính `margin` và `padding` ảnh hưởng đến phần tử `display: block;` như thế nào?\n"
            + "\n"
            + "A. Không ảnh hưởng.\n"
            + "B. Chỉ ảnh hưởng đến `margin`.\n"
            + "C. Chỉ ảnh hưởng đến `padding`.\n"
            + "D. Ảnh hưởng đầy đủ đến cả `margin` và `padding`.",
            "Phần tử `display: block;` có thể chứa phần tử nội tuyến không?\n"
            + "\n"
            + "A. Không thể.\n"
            + "B. Chỉ có thể chứa phần tử khối khác.\n"
            + "C. Có thể.\n"
            + "D. Chỉ có thể chứa văn bản.",
            "Phần tử `display: block;` thường được sử dụng cho mục đích gì?\n"
            + "\n"
            + "A. Tạo liên kết văn bản.\n"
            + "B. Tạo cấu trúc trang web, như tiêu đề, đoạn văn, và div.\n"
            + "C. Hiển thị hình ảnh trong dòng văn bản.\n"
            + "D. Tạo hiệu ứng động.",
            "Phần tử `display: block;` có thể nằm cạnh phần tử khác trên cùng dòng không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi sử dụng float.\n"
            + "D. Chỉ khi sử dụng flexbox.",
            "Thuộc tính nào có thể được sử dụng để thay đổi hướng của phần tử `display: block;`?\n"
            + "\n"
            + "A. `direction`.\n"
            + "B. `align-items`.\n"
            + "C. `float` hoặc `flexbox`.\n"
            + "D. `vertical-align`.",
            "Phần tử `display: block;` chiếm bao nhiêu không gian theo chiều ngang?\n"
            + "\n"
            + "A. Chiều rộng của nội dung.\n"
            + "B. Chiều rộng của cửa sổ trình duyệt.\n"
            + "C. Toàn bộ chiều rộng có sẵn.\n"
            + "D. Một nửa chiều rộng có sẵn.",
            "Lợi ích chính của việc sử dụng `display: block;` là gì?\n"
            + "\n"
            + "A. Cho phép sắp xếp các phần tử trên cùng một dòng.\n"
            + "B. Cho phép kiểm soát đầy đủ kích thước và khoảng cách của phần tử.\n"
            + "C. Cho phép tạo các hiệu ứng động.\n"
            + "D. Cho phép ẩn phần tử."
        });

        TITLE_MAP.put("Display: inline", new String[]{
            "Thuộc tính CSS `display: inline;` có tác dụng gì?\n"
            + "\n"
            + "A. Hiển thị phần tử như một phần tử khối.\n"
            + "B. Hiển thị phần tử như một phần tử nội tuyến.\n"
            + "C. Hiển thị phần tử như một phần tử khối nội tuyến.\n"
            + "D. Ẩn phần tử.",
            "Phần tử HTML nào mặc định có `display: inline;`?\n"
            + "\n"
            + "A. <p>.\n"
            + "B. <div>.\n"
            + "C. <span>.\n"
            + "D. <h1>.",
            "Điều gì xảy ra khi bạn đặt `width` và `height` cho phần tử có `display: inline;`?\n"
            + "\n"
            + "A. Các thuộc tính này được áp dụng.\n"
            + "B. Các thuộc tính này bị bỏ qua.\n"
            + "C. Chỉ chiều rộng được áp dụng.\n"
            + "D. Chiều rộng và chiều cao được tính toán tự động.",
            "Thuộc tính `margin` và `padding` ảnh hưởng đến phần tử `display: inline;` như thế nào?\n"
            + "\n"
            + "A. Không ảnh hưởng.\n"
            + "B. Chỉ ảnh hưởng đến `margin` ngang.\n"
            + "C. Chỉ ảnh hưởng đến `padding` ngang.\n"
            + "D. Ảnh hưởng đầy đủ đến cả `margin` và `padding`.",
            "Phần tử `display: inline;` có thể chứa phần tử khối không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ có thể chứa phần tử nội tuyến khác.\n"
            + "D. Chỉ có thể chứa văn bản.",
            "Phần tử `display: inline;` thường được sử dụng cho mục đích gì?\n"
            + "\n"
            + "A. Tạo cấu trúc trang web.\n"
            + "B. Tạo các liên kết văn bản và các phần tử nhỏ trong dòng văn bản.\n"
            + "C. Hiển thị hình ảnh toàn màn hình.\n"
            + "D. Tạo hiệu ứng động.",
            "Phần tử `display: inline;` có thể nằm cạnh phần tử khác trên cùng dòng không?\n"
            + "\n"
            + "A. Không.\n"
            + "B. Có.\n"
            + "C. Chỉ khi sử dụng float.\n"
            + "D. Chỉ khi sử dụng flexbox.",
            "Thuộc tính nào có thể được sử dụng để căn chỉnh dọc cho phần tử `display: inline;`?\n"
            + "\n"
            + "A. `direction`.\n"
            + "B. `align-items`.\n"
            + "C. `float`.\n"
            + "D. `vertical-align`.",
            "Phần tử `display: inline;` chiếm bao nhiêu không gian theo chiều ngang?\n"
            + "\n"
            + "A. Toàn bộ chiều rộng có sẵn.\n"
            + "B. Chiều rộng của cửa sổ trình duyệt.\n"
            + "C. Chiều rộng của nội dung.\n"
            + "D. Một nửa chiều rộng có sẵn.",
            "Lợi ích chính của việc sử dụng `display: inline;` là gì?\n"
            + "\n"
            + "A. Cho phép kiểm soát đầy đủ kích thước và khoảng cách của phần tử.\n"
            + "B. Cho phép sắp xếp các phần tử trên cùng một dòng.\n"
            + "C. Cho phép tạo các hiệu ứng động.\n"
            + "D. Cho phép ẩn phần tử."
        });

        TITLE_MAP.put("Display: inline-block", new String[]{
            "Thuộc tính CSS `display: inline-block;` có tác dụng gì?\n"
            + "\n"
            + "A. Hiển thị phần tử như một phần tử khối.\n"
            + "B. Hiển thị phần tử như một phần tử nội tuyến.\n"
            + "C. Hiển thị phần tử như một phần tử nội tuyến khối.\n"
            + "D. Ẩn phần tử.",
            "Phần tử nào có thể sử dụng `display: inline-block;` để giữ nguyên thuộc tính khối và nội tuyến?\n"
            + "\n"
            + "A. <span>.\n"
            + "B. <p>.\n"
            + "C. <div>.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra khi bạn đặt `width` và `height` cho phần tử có `display: inline-block;`?\n"
            + "\n"
            + "A. Các thuộc tính này bị bỏ qua.\n"
            + "B. Các thuộc tính này được áp dụng.\n"
            + "C. Chỉ chiều rộng được áp dụng.\n"
            + "D. Chiều rộng và chiều cao được tính toán tự động.",
            "Thuộc tính `margin` và `padding` ảnh hưởng đến phần tử `display: inline-block;` như thế nào?\n"
            + "\n"
            + "A. Không ảnh hưởng.\n"
            + "B. Chỉ ảnh hưởng đến `margin` ngang.\n"
            + "C. Chỉ ảnh hưởng đến `padding` ngang.\n"
            + "D. Ảnh hưởng đầy đủ đến cả `margin` và `padding`.",
            "Phần tử `display: inline-block;` có thể chứa phần tử khối và nội tuyến không?\n"
            + "\n"
            + "A. Chỉ có thể chứa phần tử khối.\n"
            + "B. Chỉ có thể chứa phần tử nội tuyến.\n"
            + "C. Có thể chứa cả hai.\n"
            + "D. Không thể chứa cả hai.",
            "Phần tử `display: inline-block;` thường được sử dụng cho mục đích gì?\n"
            + "\n"
            + "A. Tạo cấu trúc trang web.\n"
            + "B. Tạo các phần tử có thể đặt cạnh nhau và có kích thước cụ thể.\n"
            + "C. Hiển thị hình ảnh toàn màn hình.\n"
            + "D. Tạo hiệu ứng động.",
            "Phần tử `display: inline-block;` có thể nằm cạnh phần tử khác trên cùng dòng không?\n"
            + "\n"
            + "A. Không.\n"
            + "B. Có.\n"
            + "C. Chỉ khi sử dụng float.\n"
            + "D. Chỉ khi sử dụng flexbox.",
            "Thuộc tính nào có thể được sử dụng để căn chỉnh dọc cho phần tử `display: inline-block;`?\n"
            + "\n"
            + "A. `direction`.\n"
            + "B. `align-items`.\n"
            + "C. `float`.\n"
            + "D. `vertical-align`.",
            "Phần tử `display: inline-block;` chiếm bao nhiêu không gian theo chiều ngang?\n"
            + "\n"
            + "A. Toàn bộ chiều rộng có sẵn.\n"
            + "B. Chiều rộng của cửa sổ trình duyệt.\n"
            + "C. Chiều rộng của nội dung.\n"
            + "D. Một nửa chiều rộng có sẵn.",
            "Lợi ích chính của việc sử dụng `display: inline-block;` là gì?\n"
            + "\n"
            + "A. Cho phép kiểm soát đầy đủ kích thước và sắp xếp các phần tử trên cùng một dòng.\n"
            + "B. Cho phép tạo các hiệu ứng động.\n"
            + "C. Cho phép ẩn phần tử.\n"
            + "D. Cho phép tạo cấu trúc trang web phức tạp."
        });

        TITLE_MAP.put("Display: flex", new String[]{
            "Thuộc tính CSS `display: flex;` có tác dụng gì?\n"
            + "\n"
            + "A. Hiển thị phần tử như một phần tử khối.\n"
            + "B. Hiển thị phần tử như một phần tử nội tuyến.\n"
            + "C. Hiển thị phần tử như một phần tử nội tuyến khối.\n"
            + "D. Tạo một container linh hoạt để sắp xếp các phần tử con.",
            "Thuộc tính `flex-direction` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Căn chỉnh các phần tử con theo chiều ngang.\n"
            + "B. Căn chỉnh các phần tử con theo chiều dọc.\n"
            + "C. Xác định hướng sắp xếp các phần tử con trong container flex.\n"
            + "D. Xác định kích thước của các phần tử con.",
            "Thuộc tính `justify-content` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Căn chỉnh các phần tử con theo chiều ngang.\n"
            + "B. Căn chỉnh các phần tử con theo chiều dọc.\n"
            + "C. Xác định khoảng cách giữa các phần tử con.\n"
            + "D. Xác định kích thước của các phần tử con.",
            "Thuộc tính `align-items` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Căn chỉnh các phần tử con theo chiều ngang.\n"
            + "B. Căn chỉnh các phần tử con theo chiều dọc.\n"
            + "C. Xác định khoảng cách giữa các phần tử con.\n"
            + "D. Xác định kích thước của các phần tử con.",
            "Thuộc tính `flex-wrap` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Căn chỉnh các phần tử con theo chiều ngang.\n"
            + "B. Căn chỉnh các phần tử con theo chiều dọc.\n"
            + "C. Cho phép các phần tử con tự động xuống dòng khi không đủ không gian.\n"
            + "D. Xác định kích thước của các phần tử con.",
            "Lợi ích chính của việc sử dụng `display: flex;` là gì?\n"
            + "\n"
            + "A. Cho phép tạo cấu trúc trang web phức tạp và linh hoạt.\n"
            + "B. Cho phép tạo các hiệu ứng động.\n"
            + "C. Cho phép ẩn phần tử.\n"
            + "D. Cho phép tạo các hiệu ứng chuyển động.",
            "Thuộc tính nào được sử dụng để xác định thứ tự hiển thị của các phần tử con trong container flex?\n"
            + "\n"
            + "A. `flex-direction`.\n"
            + "B. `justify-content`.\n"
            + "C. `align-items`.\n"
            + "D. `order`.",
            "Thuộc tính nào được sử dụng để xác định tỷ lệ co giãn của các phần tử con trong container flex?\n"
            + "\n"
            + "A. `flex-grow`.\n"
            + "B. `flex-shrink`.\n"
            + "C. `flex-basis`.\n"
            + "D. Tất cả các đáp án trên.",
            "Thuộc tính `align-content` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Căn chỉnh các phần tử con theo chiều ngang.\n"
            + "B. Căn chỉnh các phần tử con theo chiều dọc khi có nhiều dòng.\n"
            + "C. Xác định khoảng cách giữa các phần tử con.\n"
            + "D. Xác định kích thước của các phần tử con.",
            "Thuộc tính `flex-flow` là viết tắt của thuộc tính nào?\n"
            + "\n"
            + "A. `flex-direction`.\n"
            + "B. `flex-wrap`.\n"
            + "C. `flex-direction` và `flex-wrap`.\n"
            + "D. `justify-content` và `align-items`."
        });

        TITLE_MAP.put("Display: grid", new String[]{
            "Thuộc tính CSS `display: grid;` có tác dụng gì?\n"
            + "\n"
            + "A. Hiển thị phần tử như một phần tử khối.\n"
            + "B. Hiển thị phần tử như một phần tử nội tuyến.\n"
            + "C. Hiển thị phần tử như một phần tử nội tuyến khối.\n"
            + "D. Tạo một lưới hai chiều để sắp xếp các phần tử con.",
            "Thuộc tính `grid-template-columns` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định số lượng và kích thước của các hàng trong lưới.\n"
            + "B. Xác định số lượng và kích thước của các cột trong lưới.\n"
            + "C. Xác định khoảng cách giữa các hàng và cột.\n"
            + "D. Xác định vị trí của các phần tử con trong lưới.",
            "Thuộc tính `grid-template-rows` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định số lượng và kích thước của các hàng trong lưới.\n"
            + "B. Xác định số lượng và kích thước của các cột trong lưới.\n"
            + "C. Xác định khoảng cách giữa các hàng và cột.\n"
            + "D. Xác định vị trí của các phần tử con trong lưới.",
            "Thuộc tính `grid-gap` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định số lượng và kích thước của các hàng trong lưới.\n"
            + "B. Xác định số lượng và kích thước của các cột trong lưới.\n"
            + "C. Xác định khoảng cách giữa các hàng và cột.\n"
            + "D. Xác định vị trí của các phần tử con trong lưới.",
            "Thuộc tính `grid-area` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định số lượng và kích thước của các hàng trong lưới.\n"
            + "B. Xác định số lượng và kích thước của các cột trong lưới.\n"
            + "C. Xác định khoảng cách giữa các hàng và cột.\n"
            + "D. Xác định vị trí của các phần tử con trong lưới.",
            "Lợi ích chính của việc sử dụng `display: grid;` là gì?\n"
            + "\n"
            + "A. Cho phép tạo cấu trúc trang web phức tạp và linh hoạt với lưới hai chiều.\n"
            + "B. Cho phép tạo các hiệu ứng động.\n"
            + "C. Cho phép ẩn phần tử.\n"
            + "D. Cho phép tạo các hiệu ứng chuyển động.",
            "Thuộc tính nào được sử dụng để xác định số lượng và kích thước của các đường lưới ẩn?\n"
            + "\n"
            + "A. `grid-template-areas`.\n"
            + "B. `grid-auto-rows`.\n"
            + "C. `grid-auto-columns`.\n"
            + "D. `grid-auto-flow`.",
            "Thuộc tính nào được sử dụng để xác định cách các phần tử con được sắp xếp tự động trong lưới?\n"
            + "\n"
            + "A. `grid-template-areas`.\n"
            + "B. `grid-auto-rows`.\n"
            + "C. `grid-auto-columns`.\n"
            + "D. `grid-auto-flow`.",
            "Thuộc tính `grid-template-areas` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định số lượng và kích thước của các hàng trong lưới.\n"
            + "B. Xác định số lượng và kích thước của các cột trong lưới.\n"
            + "C. Xác định khoảng cách giữa các hàng và cột.\n"
            + "D. Xác định vị trí của các phần tử con trong lưới bằng cách sử dụng tên các vùng lưới.",
            "Thuộc tính `justify-items` và `align-items` được sử dụng để làm gì?\n"
            + "\n"
            + "A. Căn chỉnh các phần tử con trong lưới theo chiều ngang và chiều dọc.\n"
            + "B. Xác định số lượng và kích thước của các hàng và cột trong lưới.\n"
            + "C. Xác định khoảng cách giữa các hàng và cột.\n"
            + "D. Xác định vị trí của các phần tử con trong lưới."
        });

        TITLE_MAP.put("Viewport là gì", new String[]{
            "Viewport là gì?\n"
            + "\n"
            + "A. Một loại thẻ meta trong HTML.\n"
            + "B. Vùng hiển thị nội dung trang web trên thiết bị người dùng.\n"
            + "C. Một thuộc tính CSS để căn chỉnh nội dung.\n"
            + "D. Một API JavaScript để lấy vị trí địa lý.",
            "Tại sao viewport lại quan trọng?\n"
            + "\n"
            + "A. Giúp trang web hiển thị đẹp hơn trên máy tính.\n"
            + "B. Giúp trang web hiển thị tốt trên mọi thiết bị, đặc biệt là thiết bị di động.\n"
            + "C. Tăng tốc độ tải trang.\n"
            + "D. Giúp công cụ tìm kiếm hiểu rõ nội dung trang web.",
            "Thẻ meta viewport thường được đặt ở đâu trong mã HTML?\n"
            + "\n"
            + "A. Trong thẻ <body>.\n"
            + "B. Trong thẻ <head>.\n"
            + "C. Trong thẻ <footer>.\n"
            + "D. Trong tệp CSS.",
            "Thuộc tính nào của thẻ meta viewport được sử dụng để kiểm soát tỷ lệ thu phóng ban đầu của trang web?\n"
            + "\n"
            + "A. width.\n"
            + "B. height.\n"
            + "C. initial-scale.\n"
            + "D. user-scalable.",
            "Thuộc tính nào của thẻ meta viewport được sử dụng để ngăn người dùng thu phóng trang web?\n"
            + "\n"
            + "A. width.\n"
            + "B. height.\n"
            + "C. initial-scale.\n"
            + "D. user-scalable.",
            "Thuộc tính `width=device-width` có nghĩa là gì?\n"
            + "\n"
            + "A. Chiều rộng của trang web được cố định.\n"
            + "B. Chiều rộng của trang web được đặt bằng chiều rộng của thiết bị.\n"
            + "C. Chiều rộng của trang web được đặt bằng chiều rộng của trình duyệt.\n"
            + "D. Chiều rộng của trang web được đặt bằng chiều rộng của nội dung.",
            "Thuộc tính `initial-scale=1.0` có nghĩa là gì?\n"
            + "\n"
            + "A. Tỷ lệ thu phóng ban đầu của trang web là 100%.\n"
            + "B. Tỷ lệ thu phóng ban đầu của trang web là 10%.\n"
            + "C. Tỷ lệ thu phóng ban đầu của trang web là 1000%.\n"
            + "D. Tỷ lệ thu phóng ban đầu của trang web được đặt tự động.",
            "Tại sao nên sử dụng `initial-scale=1.0`?\n"
            + "\n"
            + "A. Giúp trang web hiển thị đẹp hơn trên máy tính.\n"
            + "B. Ngăn người dùng thu phóng trang web.\n"
            + "C. Đảm bảo trang web hiển thị đúng kích thước trên mọi thiết bị.\n"
            + "D. Tăng tốc độ tải trang.",
            "Thuộc tính `user-scalable=no` có nghĩa là gì?\n"
            + "\n"
            + "A. Người dùng có thể thu phóng trang web.\n"
            + "B. Người dùng không thể thu phóng trang web.\n"
            + "C. Người dùng chỉ có thể thu phóng trang web theo chiều ngang.\n"
            + "D. Người dùng chỉ có thể thu phóng trang web theo chiều dọc.",
            "Tại sao nên sử dụng `user-scalable=no`?\n"
            + "\n"
            + "A. Giúp trang web hiển thị đẹp hơn trên máy tính.\n"
            + "B. Ngăn người dùng thu phóng trang web để đảm bảo trải nghiệm người dùng tốt hơn.\n"
            + "C. Tăng tốc độ tải trang.\n"
            + "D. Giúp công cụ tìm kiếm hiểu rõ nội dung trang web."
        });

        TITLE_MAP.put("Cú pháp chuẩn của thẻ Viewport", new String[]{
            "Cú pháp chuẩn của thẻ meta viewport là gì?\n"
            + "\n"
            + "A. <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">.\n"
            + "B. <meta viewport=\"width=device-width, initial-scale=1.0\">.\n"
            + "C. <meta name=\"viewport\" value=\"width=device-width, initial-scale=1.0\">.\n"
            + "D. <viewport name=\"meta\" content=\"width=device-width, initial-scale=1.0\">.",
            "Thẻ meta viewport thường được đặt ở đâu trong mã HTML?\n"
            + "\n"
            + "A. Trong thẻ <body>.\n"
            + "B. Trong thẻ <head>.\n"
            + "C. Trong thẻ <footer>.\n"
            + "D. Trong tệp CSS.",
            "Thuộc tính `width` trong thẻ meta viewport được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định chiều cao của trang web.\n"
            + "B. Xác định chiều rộng của trang web.\n"
            + "C. Xác định tỷ lệ thu phóng ban đầu của trang web.\n"
            + "D. Ngăn người dùng thu phóng trang web.",
            "Giá trị `device-width` của thuộc tính `width` có nghĩa là gì?\n"
            + "\n"
            + "A. Chiều rộng của trang web được cố định.\n"
            + "B. Chiều rộng của trang web được đặt bằng chiều rộng của thiết bị.\n"
            + "C. Chiều rộng của trang web được đặt bằng chiều rộng của trình duyệt.\n"
            + "D. Chiều rộng của trang web được đặt bằng chiều rộng của nội dung.",
            "Thuộc tính `initial-scale` trong thẻ meta viewport được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định chiều cao của trang web.\n"
            + "B. Xác định chiều rộng của trang web.\n"
            + "C. Xác định tỷ lệ thu phóng ban đầu của trang web.\n"
            + "D. Ngăn người dùng thu phóng trang web.",
            "Giá trị `1.0` của thuộc tính `initial-scale` có nghĩa là gì?\n"
            + "\n"
            + "A. Tỷ lệ thu phóng ban đầu của trang web là 100%.\n"
            + "B. Tỷ lệ thu phóng ban đầu của trang web là 10%.\n"
            + "C. Tỷ lệ thu phóng ban đầu của trang web là 1000%.\n"
            + "D. Tỷ lệ thu phóng ban đầu của trang web được đặt tự động.",
            "Thuộc tính `user-scalable` trong thẻ meta viewport được sử dụng để làm gì?\n"
            + "\n"
            + "A. Xác định chiều cao của trang web.\n"
            + "B. Xác định chiều rộng của trang web.\n"
            + "C. Xác định tỷ lệ thu phóng ban đầu của trang web.\n"
            + "D. Cho phép hoặc ngăn người dùng thu phóng trang web.",
            "Giá trị `no` của thuộc tính `user-scalable` có nghĩa là gì?\n"
            + "\n"
            + "A. Người dùng có thể thu phóng trang web.\n"
            + "B. Người dùng không thể thu phóng trang web.\n"
            + "C. Người dùng chỉ có thể thu phóng trang web theo chiều ngang.\n"
            + "D. Người dùng chỉ có thể thu phóng trang web theo chiều dọc.",
            "Tại sao nên sử dụng cú pháp chuẩn của thẻ meta viewport?\n"
            + "\n"
            + "A. Giúp trang web hiển thị đẹp hơn trên máy tính.\n"
            + "B. Đảm bảo trang web hiển thị đúng kích thước và tỷ lệ trên mọi thiết bị.\n"
            + "C. Tăng tốc độ tải trang.\n"
            + "D. Giúp công cụ tìm kiếm hiểu rõ nội dung trang web.",
            "Điều gì xảy ra nếu bạn không sử dụng thẻ meta viewport hoặc sử dụng sai cú pháp?\n"
            + "\n"
            + "A. Trang web sẽ hiển thị sai kích thước và tỷ lệ trên thiết bị di động.\n"
            + "B. Trang web sẽ tải chậm hơn.\n"
            + "C. Trang web sẽ không được lập chỉ mục bởi công cụ tìm kiếm.\n"
            + "D. Trang web sẽ bị lỗi JavaScript."
        });
        TITLE_MAP.put("Các thuộc tính quan trọng", new String[]{
            "Thuộc tính nào quan trọng nhất để thiết lập responsive design?",
            "A. display\n"
            + "B. position\n"
            + "C. viewport meta tag\n"
            + "D. font-size",
            "Thuộc tính nào kiểm soát tỷ lệ hiển thị ban đầu của trang web trên mobile?",
            "A. initial-scale\n"
            + "B. user-scalable\n"
            + "C. width=device-width\n"
            + "D. minimum-scale",
            "Thuộc tính viewport nào ngăn người dùng phóng to/thu nhỏ trang?",
            "A. user-scalable=no\n"
            + "B. initial-scale=1.0\n"
            + "C. minimum-scale=1.0\n"
            + "D. maximum-scale=1.0",
            "Thuộc tính nào KHÔNG phải là thuộc tính viewport hợp lệ?",
            "A. width\n"
            + "B. height\n"
            + "C. device-height\n"
            + "D. target-densitydpi",
            "Giá trị nào của width sẽ làm trang web co giãn theo chiều rộng thiết bị?",
            "A. width=500\n"
            + "B. width=100%\n"
            + "C. width=device-width\n"
            + "D. width=auto",
            "Thuộc tính nào xác định tỷ lệ phóng to tối đa?",
            "A. initial-scale\n"
            + "B. maximum-scale\n"
            + "C. user-scale\n"
            + "D. zoom-level",
            "Kết hợp thuộc tính viewport nào là tốt nhất cho mobile?",
            "A. width=device-width, initial-scale=1.0\n"
            + "B. width=980px, user-scalable=no\n"
            + "C. initial-scale=0.5, maximum-scale=2.0\n"
            + "D. width=auto, height=device-height",
            "Thuộc tính nào đã lỗi thời và không nên dùng?",
            "A. target-densitydpi\n"
            + "B. initial-scale\n"
            + "C. user-scalable\n"
            + "D. width",
            "Thuộc tính viewport nên đặt ở đâu trong HTML?",
            "A. Trong thẻ <body>\n"
            + "B. Trong thẻ <head>\n"
            + "C. Cuối trang trước </html>\n"
            + "D. Trong file CSS",
            "Thuộc tính nào ảnh hưởng đến cách hiển thị trên tablet?",
            "A. viewport\n"
            + "B. screen-orientation\n"
            + "C. device-pixel-ratio\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Vai trò của Viewport meta tag", new String[]{
            "Viewport meta tag quan trọng vì lý do gì?",
            "A. Giúp trang web hiển thị đúng trên mobile\n"
            + "B. Tăng tốc độ load trang\n"
            + "C. Cải thiện SEO\n"
            + "D. Thêm hiệu ứng đẹp",
            "Không có viewport meta tag, trang web trên mobile sẽ thế nào?",
            "A. Hiển thị thu nhỏ như trên desktop\n"
            + "B. Không hiển thị được\n"
            + "C. Tự động co giãn vừa màn hình\n"
            + "D. Chỉ hiển thị nửa màn hình",
            "Viewport meta tag ảnh hưởng đến điều gì?",
            "A. Kích thước và tỷ lệ hiển thị\n"
            + "B. Màu sắc trang web\n"
            + "C. Tốc độ load hình ảnh\n"
            + "D. Khả năng tương tác touch",
            "Tại sao nên đặt initial-scale=1.0?",
            "A. Để không bị zoom khi load trang\n"
            + "B. Để tăng tốc độ render\n"
            + "C. Để hỗ trợ landscape mode\n"
            + "D. Để tiết kiệm bộ nhớ",
            "Viewport meta tag có ảnh hưởng đến desktop không?",
            "A. Có, luôn luôn\n"
            + "B. Không bao giờ\n"
            + "C. Chỉ khi trình duyệt mô phỏng mobile\n"
            + "D. Chỉ trên trình duyệt Chrome",
            "Tại sao nên tránh user-scalable=no?",
            "A. Vì hạn chế khả năng truy cập\n"
            + "B. Vì làm chậm trang web\n"
            + "C. Vì không hoạt động trên iOS\n"
            + "D. Vì ảnh hưởng đến SEO",
            "Viewport meta tag giúp giải quyết vấn đề gì?",
            "A. Text quá nhỏ trên mobile\n"
            + "B. Layout bị vỡ trên mobile\n"
            + "C. Horizontal scrolling\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào viewport meta tag là không cần thiết?",
            "A. Trang web chỉ dành cho desktop\n"
            + "B. Khi dùng iframe\n"
            + "C. Khi dùng AMP\n"
            + "D. Không có trường hợp nào",
            "Viewport meta tag có thể được điều chỉnh bằng JavaScript không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ trên Android\n"
            + "D. Chỉ khi dùng jQuery",
            "Tại sao viewport meta tag quan trọng cho SEO?",
            "A. Vì Google ưu tiên trang mobile-friendly\n"
            + "B. Vì giúp index nội dung tốt hơn\n"
            + "C. Vì tăng thời gian onsite\n"
            + "D. Tất cả các đáp án trên"
        });
        //CSS Nâng Cao
        TITLE_MAP.put("display: flex là gì?", new String[]{
            "Thuộc tính display: flex dùng để làm gì?",
            "A. Tạo layout dạng linh hoạt.",
            "B. Tạo hiệu ứng animation.",
            "C. Tạo bảng dữ liệu.",
            "D. Tạo đường viền trang trí.",
            "Khi dùng display: flex, các phần tử con được gọi là gì?",
            "A. Flex items.",
            "B. Grid items.",
            "C. Block items.",
            "D. Inline items.",
            "Trục chính (main axis) trong flexbox là?",
            "A. Theo chiều row hoặc column.",
            "B. Luôn từ trên xuống.",
            "C. Luôn từ trái qua phải.",
            "D. Theo hướng mặc định của trình duyệt.",
            "Thuộc tính display: flex áp dụng cho?",
            "A. Phần tử cha.",
            "B. Phần tử con.",
            "C. Cả cha và con.",
            "D. Không áp dụng cụ thể.",
            "display: flex mặc định sắp xếp các phần tử theo hướng nào?",
            "A. Theo chiều ngang (row).",
            "B. Theo chiều dọc (column).",
            "C. Theo hình lưới.",
            "D. Theo random.",
            "Flex container là?",
            "A. Phần tử có display: flex.",
            "B. Phần tử con của flex.",
            "C. Một loại block element.",
            "D. Một dạng form.",
            "display: flex có giúp căn chỉnh dọc không?",
            "A. Có.",
            "B. Không.",
            "C. Chỉ với JavaScript.",
            "D. Phụ thuộc browser.",
            "Để các phần tử co giãn đều nhau, dùng thuộc tính gì?",
            "A. flex-grow.",
            "B. flex-shrink.",
            "C. flex-basis.",
            "D. flex-wrap.",
            "Nếu muốn flex items xuống dòng khi thiếu chỗ, dùng?",
            "A. flex-wrap: wrap.",
            "B. flex-direction: column.",
            "C. justify-content: center.",
            "D. align-items: stretch.",
            "Flexbox hỗ trợ mấy trục chính?",
            "A. 2.",
            "B. 1.",
            "C. 3.",
            "D. Không xác định."
        });
        TITLE_MAP.put("Các thuộc tính chính của Flexbox", new String[]{
            "Thuộc tính nào xác định hướng trục chính?",
            "A. flex-direction.",
            "B. justify-content.",
            "C. align-items.",
            "D. flex-wrap.",
            "Thuộc tính nào căn chỉnh item theo trục chính?",
            "A. justify-content.",
            "B. align-items.",
            "C. flex-basis.",
            "D. flex-grow.",
            "Thuộc tính nào căn chỉnh theo trục vuông góc?",
            "A. align-items.",
            "B. justify-content.",
            "C. flex-direction.",
            "D. flex-wrap.",
            "Thuộc tính nào cho phép item co dãn theo nhu cầu?",
            "A. flex-grow.",
            "B. flex-shrink.",
            "C. flex-basis.",
            "D. align-self.",
            "Thuộc tính nào giúp chỉ định kích thước cơ bản của item?",
            "A. flex-basis.",
            "B. flex-grow.",
            "C. flex-shrink.",
            "D. order.",
            "Thuộc tính order dùng để làm gì?",
            "A. Sắp xếp thứ tự các item.",
            "B. Tăng độ rộng của item.",
            "C. Cố định kích thước item.",
            "D. Căn giữa item.",
            "flex-wrap: nowrap có ý nghĩa gì?",
            "A. Không cho xuống dòng.",
            "B. Cho phép xuống dòng.",
            "C. Căn giữa item.",
            "D. Tạo khoảng cách giữa item.",
            "flex-shrink ảnh hưởng khi nào?",
            "A. Khi thiếu chỗ.",
            "B. Khi thừa chỗ.",
            "C. Khi cố định chiều cao.",
            "D. Khi item bị ẩn.",
            "align-content dùng cho khi nào?",
            "A. Khi có nhiều dòng flex.",
            "B. Khi chỉ có một dòng flex.",
            "C. Khi cần căn giữa dọc.",
            "D. Khi cần thay đổi chiều rộng.",
            "Thuộc tính nào dùng để căn chỉnh riêng một item?",
            "A. align-self.",
            "B. align-items.",
            "C. justify-content.",
            "D. flex-wrap."
        });
        TITLE_MAP.put("justify-content", new String[]{
            "justify-content dùng để làm gì?",
            "A. Căn chỉnh theo trục chính.",
            "B. Căn chỉnh theo trục phụ.",
            "C. Xác định hướng các phần tử.",
            "D. Thay đổi độ rộng phần tử.",
            "Giá trị justify-content: center sẽ?",
            "A. Căn giữa các item.",
            "B. Đẩy item về đầu.",
            "C. Đẩy item về cuối.",
            "D. Dàn đều khoảng cách.",
            "justify-content: space-between sẽ?",
            "A. Các item đều có khoảng cách giữa.",
            "B. Các item dồn về giữa.",
            "C. Các item dồn về 2 bên.",
            "D. Không có khoảng cách giữa các item.",
            "justify-content: flex-end sẽ?",
            "A. Đẩy các item về cuối trục.",
            "B. Đẩy item về đầu trục.",
            "C. Căn giữa item.",
            "D. Giãn đều item.",
            "justify-content có thể nhận giá trị nào?",
            "A. flex-start.",
            "B. center.",
            "C. space-around.",
            "D. Tất cả các đáp án trên.",
            "justify-content: space-around sẽ?",
            "A. Khoảng cách đều hai bên item.",
            "B. Khoảng cách đều giữa các item nhưng không đều hai bên.",
            "C. Các item chồng lên nhau.",
            "D. Các item co về giữa.",
            "Thuộc tính justify-content áp dụng cho?",
            "A. Flex container.",
            "B. Flex item.",
            "C. Block element.",
            "D. Inline element.",
            "justify-content ảnh hưởng trục nào?",
            "A. Main axis.",
            "B. Cross axis.",
            "C. Grid axis.",
            "D. Baseline axis.",
            "justify-content: space-evenly sẽ?",
            "A. Chia đều khoảng cách các item, kể cả 2 bên ngoài.",
            "B. Khoảng cách hai đầu nhỏ hơn giữa các item.",
            "C. Các item sát nhau.",
            "D. Các item xếp dọc.",
            "Khi flex-direction: column, justify-content sẽ căn chỉnh theo?",
            "A. Chiều dọc.",
            "B. Chiều ngang.",
            "C. Cả hai.",
            "D. Không căn chỉnh."
        });
        TITLE_MAP.put("align-items", new String[]{
            "align-items dùng để làm gì?",
            "A. Căn chỉnh theo trục phụ (cross axis).",
            "B. Căn chỉnh theo trục chính (main axis).",
            "C. Cố định kích thước item.",
            "D. Thay đổi hướng layout.",
            "align-items: center sẽ?",
            "A. Căn giữa các item theo chiều dọc.",
            "B. Căn giữa item theo chiều ngang.",
            "C. Đẩy item về đầu.",
            "D. Đẩy item về cuối.",
            "align-items: flex-start sẽ?",
            "A. Đẩy các item về đầu trục phụ.",
            "B. Đẩy item về cuối trục phụ.",
            "C. Căn giữa item.",
            "D. Kéo giãn item.",
            "align-items: flex-end sẽ?",
            "A. Đẩy item về cuối trục phụ.",
            "B. Đẩy item về đầu trục phụ.",
            "C. Căn giữa item.",
            "D. Co nhỏ item lại.",
            "align-items: stretch sẽ?",
            "A. Giãn các item để đầy chiều cross axis.",
            "B. Căn giữa item.",
            "C. Co lại item.",
            "D. Ẩn các item.",
            "align-items: baseline sẽ?",
            "A. Căn theo đường cơ sở chữ.",
            "B. Căn theo chiều cao lớn nhất.",
            "C. Giãn đầy vùng chứa.",
            "D. Co nhỏ chiều cao.",
            "Thuộc tính align-items áp dụng cho?",
            "A. Flex container.",
            "B. Flex item.",
            "C. Inline element.",
            "D. Block element.",
            "align-items ảnh hưởng trục nào?",
            "A. Cross axis.",
            "B. Main axis.",
            "C. Grid axis.",
            "D. Baseline axis.",
            "Muốn mỗi item căn chỉnh khác nhau dùng gì?",
            "A. align-self.",
            "B. align-items.",
            "C. justify-content.",
            "D. flex-grow.",
            "align-items được áp dụng khi flex container có?",
            "A. display: flex.",
            "B. position: absolute.",
            "C. display: grid.",
            "D. display: block."
        });
        TITLE_MAP.put("align-self", new String[]{
            "Thuộc tính align-self dùng để làm gì?",
            "A. Căn chỉnh riêng lẻ một item",
            "B. Thay đổi kích thước container",
            "C. Thiết lập hướng flex",
            "D. Xóa margin của item",
            "Giá trị 'center' trong align-self có ý nghĩa gì?",
            "A. Căn giữa theo cross axis",
            "B. Căn phải theo main axis",
            "C. Đưa item ra ngoài container",
            "D. Tăng kích thước item",
            "Nếu không khai báo align-self, item sẽ?",
            "A. Theo align-items của container",
            "B. Tự căn trái",
            "C. Tự căn giữa",
            "D. Không hiển thị",
            "Giá trị 'stretch' trong align-self sẽ làm gì?",
            "A. Kéo giãn item để vừa container",
            "B. Cố định kích thước item",
            "C. Giấu item",
            "D. Di chuyển item ra ngoài",
            "Thuộc tính align-self ghi đè thuộc tính nào?",
            "A. align-items",
            "B. justify-content",
            "C. flex-wrap",
            "D. flex-direction",
            "align-self có áp dụng cho container không?",
            "A. Không, chỉ áp dụng cho item",
            "B. Có, nhưng cần thêm prefix",
            "C. Có, mặc định luôn bật",
            "D. Phụ thuộc vào trình duyệt",
            "Cách set align-self cho phần tử?",
            "A. CSS trực tiếp vào phần tử",
            "B. Thay đổi container",
            "C. Sửa file HTML",
            "D. Dùng JavaScript",
            "Khi nào cần dùng align-self thay vì align-items?",
            "A. Khi chỉ một item cần căn khác",
            "B. Khi muốn thay đổi toàn bộ layout",
            "C. Khi cần đổi chiều main axis",
            "D. Khi cần tăng padding",
            "Giá trị 'baseline' của align-self nghĩa là?",
            "A. Căn item theo dòng chữ",
            "B. Kéo item về đầu container",
            "C. Căn giữa item",
            "D. Đưa item xuống cuối",
            "align-self hoạt động trên axis nào?",
            "A. Cross axis",
            "B. Main axis",
            "C. Cả hai axis",
            "D. Không axis nào"
        });

        TITLE_MAP.put("flex-wrap", new String[]{
            "Thuộc tính flex-wrap dùng để làm gì?",
            "A. Cho phép item xuống hàng",
            "B. Ghép các item lại",
            "C. Cố định chiều rộng container",
            "D. Xóa margin các item",
            "Giá trị 'nowrap' trong flex-wrap nghĩa là gì?",
            "A. Không cho xuống hàng",
            "B. Xuống hàng tự động",
            "C. Giữ nguyên tỉ lệ",
            "D. Chia đều các item",
            "Giá trị 'wrap' trong flex-wrap có tác dụng gì?",
            "A. Các item tự động xuống hàng khi thiếu chỗ",
            "B. Các item thu nhỏ kích thước",
            "C. Item tràn ra ngoài container",
            "D. Cố định số lượng item",
            "Khi thiết lập flex-wrap: wrap-reverse, điều gì xảy ra?",
            "A. Các hàng mới xuất hiện phía trên",
            "B. Các hàng mới xuất hiện phía dưới",
            "C. Item xếp theo cột",
            "D. Item đổi màu",
            "flex-wrap ảnh hưởng đến?",
            "A. Main axis",
            "B. Cross axis",
            "C. Cả 2 axis",
            "D. Không ảnh hưởng axis nào",
            "flex-wrap cần đi kèm với thuộc tính nào để bố cục tốt?",
            "A. flex-direction",
            "B. align-items",
            "C. order",
            "D. z-index",
            "Khi nào nên dùng flex-wrap?",
            "A. Khi số lượng item thay đổi",
            "B. Khi container luôn cố định",
            "C. Khi chỉ có 1 item",
            "D. Khi cần giữ nguyên kích thước item",
            "flex-wrap có thể giúp tăng trải nghiệm người dùng bằng cách?",
            "A. Không để item tràn ra ngoài",
            "B. Ẩn bớt item",
            "C. Xoay item",
            "D. Tăng chiều cao container",
            "Giá trị mặc định của flex-wrap là gì?",
            "A. nowrap",
            "B. wrap",
            "C. wrap-reverse",
            "D. inherit",
            "flex-wrap thường kết hợp với thuộc tính nào để layout đẹp hơn?",
            "A. justify-content",
            "B. font-size",
            "C. color",
            "D. opacity"
        });

        TITLE_MAP.put("flex-direction", new String[]{
            "Thuộc tính flex-direction xác định?",
            "A. Hướng dòng chính (main axis)",
            "B. Khoảng cách giữa item",
            "C. Độ nghiêng của item",
            "D. Border của container",
            "Giá trị 'row' trong flex-direction là?",
            "A. Xếp item theo hàng ngang",
            "B. Xếp item theo cột dọc",
            "C. Item từ dưới lên",
            "D. Item chồng lên nhau",
            "Giá trị 'column' trong flex-direction là?",
            "A. Xếp item theo cột từ trên xuống",
            "B. Xếp item theo hàng ngang",
            "C. Xếp item từ dưới lên",
            "D. Đổi màu item",
            "flex-direction: row-reverse sẽ làm gì?",
            "A. Item xếp hàng ngang nhưng đảo ngược",
            "B. Item xếp thành 2 cột",
            "C. Item xoay 90 độ",
            "D. Item ẩn đi",
            "flex-direction: column-reverse nghĩa là?",
            "A. Xếp item dọc nhưng đảo ngược",
            "B. Chia container thành 2 hàng",
            "C. Tăng khoảng cách giữa item",
            "D. Tự động wrap item",
            "flex-direction hoạt động chủ yếu trên?",
            "A. Main axis",
            "B. Cross axis",
            "C. Cả 2 axis",
            "D. Không axis nào",
            "Thuộc tính nào đi kèm tốt với flex-direction?",
            "A. justify-content",
            "B. font-weight",
            "C. visibility",
            "D. position",
            "flex-direction có ảnh hưởng đến kích thước item không?",
            "A. Không",
            "B. Có, thay đổi chiều dài",
            "C. Có, thay đổi chiều cao",
            "D. Có, thay đổi margin",
            "flex-direction có thể thay đổi layout trang?",
            "A. Có",
            "B. Không",
            "C. Chỉ trên desktop",
            "D. Chỉ trên mobile",
            "Khi cần thiết kế cột trên mobile, nên dùng giá trị nào cho flex-direction?",
            "A. column",
            "B. row",
            "C. row-reverse",
            "D. unset"
        });

        TITLE_MAP.put("display: grid là gì?", new String[]{
            "Thuộc tính display: grid dùng để làm gì?",
            "A. Tạo bố cục dạng lưới",
            "B. Xếp item thành hàng ngang",
            "C. Gộp tất cả item lại",
            "D. Xóa khoảng cách giữa item",
            "display: grid áp dụng cho?",
            "A. Container chứa các item",
            "B. Từng item riêng lẻ",
            "C. Chỉ phần tử inline",
            "D. Chỉ phần tử block",
            "Cách khai báo số cột trong grid?",
            "A. grid-template-columns",
            "B. justify-content",
            "C. align-items",
            "D. flex-direction",
            "Cách thiết lập khoảng cách giữa các ô trong grid?",
            "A. gap",
            "B. margin",
            "C. padding",
            "D. border-spacing",
            "display: grid khác flexbox ở điểm nào?",
            "A. Quản lý bố cục 2 chiều",
            "B. Không hỗ trợ responsive",
            "C. Chỉ hỗ trợ cột",
            "D. Không hỗ trợ CSS",
            "grid-template-rows để làm gì?",
            "A. Thiết lập số hàng",
            "B. Thiết lập số cột",
            "C. Cố định kích thước ô",
            "D. Gộp nhiều ô",
            "Chức năng của grid-auto-flow?",
            "A. Xác định hướng điền item",
            "B. Chia đều item",
            "C. Đặt khoảng cách item",
            "D. Tăng kích thước item",
            "display: grid hỗ trợ tự động layout không?",
            "A. Có, với auto-fill và auto-fit",
            "B. Không, phải code tay",
            "C. Chỉ hỗ trợ với flexbox",
            "D. Chỉ hỗ trợ trên Firefox",
            "Thuộc tính nào thiết lập kích thước lưới tự động?",
            "A. minmax",
            "B. padding",
            "C. margin",
            "D. align-content",
            "Grid layout phù hợp khi nào?",
            "A. Khi cần chia bố cục nhiều hàng/cột",
            "B. Khi chỉ có 1 hàng",
            "C. Khi không cần responsive",
            "D. Khi chỉ cần căn chỉnh margin"
        });
        TITLE_MAP.put("Các thuộc tính chính của CSS Grid", new String[]{
            "Thuộc tính nào xác định số cột trong Grid?",
            "A. grid-template-columns\n"
            + "B. grid-template-rows\n"
            + "C. grid-gap\n"
            + "D. justify-items",
            "Thuộc tính nào xác định khoảng cách giữa các ô?",
            "A. grid-gap\n"
            + "B. grid-column-gap\n"
            + "C. grid-row-gap\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào dùng để xác định khu vực trong Grid?",
            "A. grid-area\n"
            + "B. grid-template-areas\n"
            + "C. grid-auto-flow\n"
            + "D. grid-template-columns",
            "Để căn chỉnh nội dung trong các ô Grid, dùng thuộc tính nào?",
            "A. justify-items\n"
            + "B. align-items\n"
            + "C. place-items\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào xác định hướng tự động xếp các phần tử?",
            "A. grid-auto-flow\n"
            + "B. grid-auto-columns\n"
            + "C. grid-auto-rows\n"
            + "D. grid-template-areas",
            "Thuộc tính nào giúp gộp nhiều cột hoặc hàng?",
            "A. grid-column\n"
            + "B. grid-row\n"
            + "C. grid-area\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào cho phép xác định số hàng?",
            "A. grid-template-rows\n"
            + "B. grid-template-columns\n"
            + "C. grid-gap\n"
            + "D. grid-auto-flow",
            "Thuộc tính nào thiết lập template cho nhiều khu vực?",
            "A. grid-template-areas\n"
            + "B. grid-auto-flow\n"
            + "C. grid-template-columns\n"
            + "D. grid-template-rows",
            "Thuộc tính nào giúp đặt các item vào lưới tự động?",
            "A. grid-auto-rows\n"
            + "B. grid-auto-columns\n"
            + "C. grid-auto-flow\n"
            + "D. grid-template-areas",
            "Khi muốn tùy chỉnh vị trí item trong Grid, ta dùng?",
            "A. justify-self\n"
            + "B. align-self\n"
            + "C. place-self\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Khái Niệm về CSS Grid Layout", new String[]{
            "CSS Grid Layout chủ yếu dùng để làm gì?",
            "A. Bố trí nội dung dạng lưới\n"
            + "B. Tăng tốc độ tải trang\n"
            + "C. Trang trí giao diện\n"
            + "D. Lưu trữ dữ liệu",
            "CSS Grid hoạt động dựa trên?",
            "A. Các dòng và cột\n"
            + "B. Các thẻ div\n"
            + "C. Các lớp CSS\n"
            + "D. Các phần tử JavaScript",
            "CSS Grid hỗ trợ tạo layout?",
            "A. 1 chiều\n"
            + "B. 2 chiều\n"
            + "C. 3 chiều\n"
            + "D. 4 chiều",
            "Khi nào nên dùng CSS Grid thay vì Flexbox?",
            "A. Khi bố cục phức tạp nhiều hàng và cột\n"
            + "B. Khi chỉ cần căn chỉnh 1 chiều\n"
            + "C. Khi không cần responsive\n"
            + "D. Khi dùng Bootstrap",
            "CSS Grid Layout được chính thức hỗ trợ bởi các trình duyệt từ năm nào?",
            "A. 2015\n"
            + "B. 2016\n"
            + "C. 2017\n"
            + "D. 2018",
            "Để tạo vùng lưới, phần tử cần có thuộc tính nào?",
            "A. display: grid\n"
            + "B. position: relative\n"
            + "C. float: left\n"
            + "D. flex: 1",
            "CSS Grid có thể kết hợp với Flexbox không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ trên mobile\n"
            + "D. Chỉ trên desktop",
            "CSS Grid giúp cải thiện điều gì?",
            "A. Dễ quản lý bố cục\n"
            + "B. Tăng tốc độ server\n"
            + "C. Bảo mật trang web\n"
            + "D. Tạo hiệu ứng animation",
            "Thuật ngữ 'grid container' trong CSS Grid ám chỉ gì?",
            "A. Phần tử cha chứa các item\n"
            + "B. Phần tử con\n"
            + "C. Các class CSS\n"
            + "D. Các animation",
            "Thuật ngữ 'grid item' chỉ?",
            "A. Các phần tử con trong container\n"
            + "B. Các layout mẫu\n"
            + "C. Các file CSS\n"
            + "D. Các file HTML"
        });
        TITLE_MAP.put("Các Thuộc Tính Chính trong CSS Grid", new String[]{
            "Thuộc tính nào xác định số lượng cột lưới?",
            "A. grid-template-columns\n"
            + "B. grid-template-rows\n"
            + "C. grid-auto-columns\n"
            + "D. grid-area",
            "Thuộc tính nào giúp căn chỉnh nội dung theo chiều ngang?",
            "A. justify-items\n"
            + "B. align-items\n"
            + "C. grid-gap\n"
            + "D. grid-template-areas",
            "Thuộc tính nào xác định khu vực lưới?",
            "A. grid-area\n"
            + "B. grid-column-start\n"
            + "C. grid-row-end\n"
            + "D. place-items",
            "Thuộc tính nào quy định khoảng cách giữa các ô?",
            "A. grid-gap\n"
            + "B. column-gap\n"
            + "C. row-gap\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào giúp lưới tự động sinh thêm dòng/cột khi thiếu?",
            "A. grid-auto-flow\n"
            + "B. grid-template-areas\n"
            + "C. place-content\n"
            + "D. justify-content",
            "Thuộc tính nào định nghĩa vùng giao nhau giữa dòng và cột?",
            "A. grid-area\n"
            + "B. grid-template-columns\n"
            + "C. grid-auto-rows\n"
            + "D. justify-items",
            "Thuộc tính nào giúp canh chỉnh toàn bộ grid container?",
            "A. justify-content\n"
            + "B. align-content\n"
            + "C. place-content\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào giúp sắp xếp item theo dòng/cột cụ thể?",
            "A. grid-column\n"
            + "B. grid-row\n"
            + "C. grid-line\n"
            + "D. grid-gap",
            "Thuộc tính nào dùng để tạo lưới theo vùng đặt trước?",
            "A. grid-template-areas\n"
            + "B. grid-auto-flow\n"
            + "C. place-self\n"
            + "D. justify-items",
            "Thuộc tính nào dùng để điều chỉnh vị trí item trong ô?",
            "A. justify-self\n"
            + "B. align-self\n"
            + "C. place-self\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Chi Tiết về Các Thuộc Tính", new String[]{
            "Thuộc tính grid-template-columns nhận giá trị nào?",
            "A. px, %, fr\n"
            + "B. rem, em\n"
            + "C. vh, vw\n"
            + "D. tất cả các đơn vị",
            "Grid gap có thể chỉ định riêng khoảng cách giữa dòng và cột không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ trên Chrome\n"
            + "D. Chỉ khi responsive",
            "Thuộc tính place-items là kết hợp của?",
            "A. justify-items và align-items\n"
            + "B. grid-gap và grid-area\n"
            + "C. justify-content và align-content\n"
            + "D. grid-template-areas và grid-auto-flow",
            "Thuộc tính grid-auto-rows có tác dụng gì?",
            "A. Đặt chiều cao mặc định cho hàng tự động\n"
            + "B. Đặt chiều rộng mặc định cho cột\n"
            + "C. Xác định khoảng cách giữa hàng\n"
            + "D. Thiết lập layout lưới",
            "Nếu không đủ chỗ chứa item trong grid container, ta cần?",
            "A. Dùng grid-auto-flow\n"
            + "B. Dùng overflow: auto\n"
            + "C. Dùng minmax()\n"
            + "D. Dùng justify-items",
            "Giá trị 'dense' trong grid-auto-flow dùng để?",
            "A. Lấp đầy khoảng trống\n"
            + "B. Tạo lưới ngẫu nhiên\n"
            + "C. Giảm khoảng cách các dòng\n"
            + "D. Tạo responsive nhanh",
            "Chọn đúng về grid-template-areas?",
            "A. Định nghĩa layout theo tên vùng\n"
            + "B. Chỉ dùng cho 1 hàng\n"
            + "C. Bắt buộc phải có flex\n"
            + "D. Không thể dùng responsive",
            "Thuộc tính align-content căn chỉnh theo hướng nào?",
            "A. Dọc\n"
            + "B. Ngang\n"
            + "C. Cả hai hướng\n"
            + "D. Không căn chỉnh",
            "Thuộc tính justify-content căn chỉnh theo hướng nào?",
            "A. Ngang\n"
            + "B. Dọc\n"
            + "C. Cả hai hướng\n"
            + "D. Không căn chỉnh",
            "Để căn chỉnh một item đơn lẻ, ta dùng?",
            "A. justify-self và align-self\n"
            + "B. justify-content và align-content\n"
            + "C. grid-gap và grid-area\n"
            + "D. grid-auto-flow và grid-template-areas"
        });
        TITLE_MAP.put("Khái Niệm", new String[]{
            "Media Queries dùng để làm gì?",
            "A. Thay đổi style dựa trên thiết bị",
            "B. Tạo nội dung động",
            "C. Tối ưu hình ảnh",
            "D. Tăng tốc website",
            "Thuộc tính nào dùng trong Media Queries?",
            "A. max-width",
            "B. min-height",
            "C. orientation",
            "D. Tất cả các đáp án trên",
            "Media Queries hoạt động như thế nào?",
            "A. Theo kích thước màn hình",
            "B. Theo độ phân giải",
            "C. Theo loại thiết bị",
            "D. Tất cả các đáp án trên",
            "CSS nào áp dụng khi max-width: 600px?",
            "A. Cho điện thoại",
            "B. Cho desktop",
            "C. Cho máy in",
            "D. Cho TV",
            "Media Queries thuộc loại gì?",
            "A. HTML",
            "B. CSS",
            "C. JavaScript",
            "D. PHP",
            "Cách viết media query cho tablet?",
            "A. max-width: 768px",
            "B. min-width: 1024px",
            "C. max-height: 600px",
            "D. min-height: 900px",
            "Media Queries kiểm tra yếu tố nào?",
            "A. Loại thiết bị",
            "B. Kích thước màn hình",
            "C. Độ phân giải",
            "D. Tất cả các đáp án trên",
            "Media Queries có thể kết hợp với gì?",
            "A. Flexbox",
            "B. Grid",
            "C. Animation",
            "D. Tất cả các đáp án trên",
            "Ưu điểm lớn nhất của Media Queries?",
            "A. Responsive",
            "B. Tiết kiệm băng thông",
            "C. Cải thiện SEO",
            "D. Tăng trải nghiệm người dùng",
            "Media Queries giúp gì trong SEO?",
            "A. Tăng trải nghiệm người dùng",
            "B. Tối ưu mobile",
            "C. Tăng tốc độ tải",
            "D. Tất cả các đáp án trên"
        });

        TITLE_MAP.put("Cách Sử Dụng Media Queries", new String[]{
            "Cách bắt đầu một media query là gì?",
            "A. @media",
            "B. media-query",
            "C. @query",
            "D. CSS media",
            "Khi nào dùng max-width?",
            "A. Khi muốn áp dụng style nhỏ hơn kích thước",
            "B. Khi muốn cho thiết bị lớn",
            "C. Khi không cần responsive",
            "D. Khi dùng Flexbox",
            "Thuộc tính nào dùng điều kiện độ phân giải?",
            "A. resolution",
            "B. density",
            "C. ratio",
            "D. dpi",
            "Media feature cho chế độ ngang là gì?",
            "A. landscape",
            "B. portrait",
            "C. square",
            "D. zoom",
            "Cú pháp đúng cho media query desktop?",
            "A. min-width: 1024px",
            "B. max-width: 600px",
            "C. min-height: 300px",
            "D. max-height: 800px",
            "@media only screen nghĩa là gì?",
            "A. Chỉ áp dụng cho màn hình",
            "B. Chỉ áp dụng cho máy in",
            "C. Áp dụng cho mọi thiết bị",
            "D. Không áp dụng",
            "Breakpoint phổ biến cho điện thoại?",
            "A. 480px",
            "B. 768px",
            "C. 1024px",
            "D. 1440px",
            "Có thể lồng nhiều điều kiện trong Media Queries?",
            "A. Có",
            "B. Không",
            "C. Tùy trình duyệt",
            "D. Không chắc",
            "Media Queries nên đặt ở đâu trong CSS?",
            "A. Cuối cùng",
            "B. Đầu tiên",
            "C. Xen kẽ",
            "D. Không có quy định",
            "Dùng Media Queries như thế nào cho mobile first?",
            "A. Style chung trước, override sau",
            "B. Style riêng từng device",
            "C. Dùng nhiều file CSS",
            "D. Không cần Media Queries"
        });

        TITLE_MAP.put("Tại Sao Media Queries Quan Trọng?", new String[]{
            "Tại sao cần Media Queries?",
            "A. Đáp ứng đa thiết bị",
            "B. Tăng UX",
            "C. Hỗ trợ SEO",
            "D. Tất cả các đáp án trên",
            "Media Queries cải thiện gì?",
            "A. Responsive",
            "B. Load nhanh hơn",
            "C. Bố cục rõ hơn",
            "D. Tất cả các đáp án trên",
            "Media Queries có giúp tiết kiệm tài nguyên?",
            "A. Có",
            "B. Không",
            "C. Tùy cách dùng",
            "D. Chỉ cho desktop",
            "Với Mobile-first, Media Queries như thế nào?",
            "A. Style mobile mặc định",
            "B. Style desktop mặc định",
            "C. Không cần style",
            "D. Không dùng CSS",
            "Media Queries có ảnh hưởng đến ranking?",
            "A. Có",
            "B. Không",
            "C. Chỉ mobile",
            "D. Chỉ desktop",
            "Media Queries phù hợp với ai?",
            "A. Developer",
            "B. Designer",
            "C. SEOer",
            "D. Tất cả các đáp án trên",
            "Điểm mạnh lớn nhất của Media Queries?",
            "A. Thích nghi thiết bị",
            "B. Tăng tốc web",
            "C. Giảm băng thông",
            "D. Bảo mật cao",
            "Tại sao Media Queries cần thiết trong e-commerce?",
            "A. Nhiều người dùng mobile",
            "B. Tối ưu trải nghiệm",
            "C. Tăng chuyển đổi",
            "D. Tất cả các đáp án trên",
            "Media Queries tác động như thế nào tới UI/UX?",
            "A. Cải thiện lớn",
            "B. Không ảnh hưởng",
            "C. Giảm UX",
            "D. Làm nặng UI",
            "Không dùng Media Queries dẫn đến?",
            "A. Website kém responsive",
            "B. Giảm lượng người dùng",
            "C. SEO thấp",
            "D. Tất cả các đáp án trên"
        });

        TITLE_MAP.put("Mobile-first", new String[]{
            "Mobile-first là gì?",
            "A. Thiết kế cho mobile trước",
            "B. Thiết kế cho desktop trước",
            "C. Thiết kế cho máy in",
            "D. Không thiết kế",
            "Ưu điểm của Mobile-first?",
            "A. Tối ưu tốc độ",
            "B. Tối ưu UX",
            "C. Tối ưu SEO",
            "D. Tất cả các đáp án trên",
            "Chiến lược Mobile-first bắt đầu từ đâu?",
            "A. Layout mobile",
            "B. Layout desktop",
            "C. Layout tablet",
            "D. Layout TV",
            "Cách xử lý responsive trong Mobile-first?",
            "A. Dùng min-width",
            "B. Dùng max-width",
            "C. Dùng height",
            "D. Không dùng media queries",
            "Mobile-first phù hợp cho ai?",
            "A. Website thương mại",
            "B. Blog cá nhân",
            "C. Web app",
            "D. Tất cả các đáp án trên",
            "Mobile-first giúp tăng thứ hạng Google như thế nào?",
            "A. Mobile indexing",
            "B. Tăng tốc độ tải",
            "C. Tối ưu UX",
            "D. Tất cả các đáp án trên",
            "Chỉ số quan trọng trong Mobile-first?",
            "A. Largest Contentful Paint",
            "B. First Input Delay",
            "C. Cumulative Layout Shift",
            "D. Tất cả các chỉ số trên",
            "Mobile-first yêu cầu gì trong thiết kế?",
            "A. Ưu tiên nội dung chính",
            "B. Tối ưu hình ảnh",
            "C. Navigation rõ ràng",
            "D. Tất cả các đáp án trên",
            "Lợi ích SEO của Mobile-first?",
            "A. Tăng traffic",
            "B. Tăng time-on-site",
            "C. Giảm bounce rate",
            "D. Tất cả các đáp án trên",
            "Yếu tố nào cần ưu tiên trong Mobile-first?",
            "A. Tốc độ tải",
            "B. Trải nghiệm UX",
            "C. Nội dung ưu tiên",
            "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Desktop-first", new String[]{
            "Desktop-first là gì?",
            "A. Thiết kế giao diện ưu tiên desktop",
            "B. Thiết kế giao diện ưu tiên mobile",
            "C. Chỉ thiết kế cho tablet",
            "D. Không thiết kế giao diện",
            "Ưu điểm của Desktop-first?",
            "A. Phù hợp với website phức tạp",
            "B. Tải nhanh hơn",
            "C. Code đơn giản hơn",
            "D. Không có ưu điểm",
            "Nhược điểm của Desktop-first?",
            "A. Khó tối ưu mobile",
            "B. Giao diện desktop xấu",
            "C. Code nhanh hơn",
            "D. Tối ưu hóa dễ dàng",
            "Khi nào nên dùng Desktop-first?",
            "A. Website chủ yếu cho desktop",
            "B. Website chỉ cho mobile",
            "C. Không dùng bao giờ",
            "D. Khi code thử nghiệm",
            "Cách viết Media Query cho Desktop-first?",
            "A. Sử dụng max-width",
            "B. Sử dụng min-width",
            "C. Không dùng Media Query",
            "D. Chỉ dùng inline CSS",
            "Desktop-first khác Mobile-first thế nào?",
            "A. Bắt đầu từ desktop",
            "B. Bắt đầu từ mobile",
            "C. Không có sự khác biệt",
            "D. Cả hai đều giống nhau",
            "Điểm yếu lớn nhất của Desktop-first?",
            "A. Không thân thiện mobile",
            "B. Khó maintain",
            "C. Quá tối ưu",
            "D. Không tối ưu desktop",
            "Desktop-first ảnh hưởng SEO ra sao?",
            "A. Ảnh hưởng nếu mobile yếu",
            "B. Không ảnh hưởng",
            "C. Cải thiện SEO",
            "D. Không liên quan",
            "Desktop-first phù hợp loại dự án nào?",
            "A. Web app doanh nghiệp",
            "B. Blog cá nhân",
            "C. Landing page",
            "D. Không phù hợp với dự án nào",
            "Thách thức lớn nhất khi dùng Desktop-first?",
            "A. Responsive cho mobile",
            "B. Tối ưu hóa desktop",
            "C. Chỉnh sửa HTML",
            "D. Viết nhiều CSS hơn"
        });

        TITLE_MAP.put("So Sánh Mobile-first và Desktop-first", new String[]{
            "Mobile-first là gì?",
            "A. Ưu tiên thiết kế cho mobile",
            "B. Ưu tiên thiết kế cho desktop",
            "C. Thiết kế cho tablet",
            "D. Không thiết kế mobile",
            "Desktop-first là gì?",
            "A. Ưu tiên thiết kế cho desktop",
            "B. Ưu tiên thiết kế cho mobile",
            "C. Thiết kế cho cả hai cùng lúc",
            "D. Không thiết kế responsive",
            "Ưu điểm của Mobile-first?",
            "A. Tối ưu SEO mobile",
            "B. Load nhanh hơn",
            "C. Trải nghiệm người dùng tốt hơn",
            "D. Tất cả các đáp án trên",
            "Nhược điểm của Mobile-first?",
            "A. Khó phát triển giao diện desktop",
            "B. Giao diện mobile không đẹp",
            "C. Tốn tài nguyên",
            "D. Không có nhược điểm",
            "Ưu điểm của Desktop-first?",
            "A. Thiết kế dễ dàng hơn cho desktop",
            "B. Responsive tốt hơn",
            "C. Mobile load nhanh hơn",
            "D. SEO tốt hơn",
            "Nhược điểm của Desktop-first?",
            "A. Khó tối ưu mobile",
            "B. Giao diện mobile yếu",
            "C. SEO kém hơn",
            "D. Tất cả các đáp án trên",
            "Khi nào dùng Mobile-first?",
            "A. Khi người dùng chủ yếu trên mobile",
            "B. Khi traffic desktop nhiều hơn",
            "C. Khi không cần responsive",
            "D. Khi làm nội bộ",
            "Khi nào dùng Desktop-first?",
            "A. Website cho môi trường doanh nghiệp",
            "B. Website blog cá nhân",
            "C. Website thương mại mobile",
            "D. Web bán hàng nhỏ",
            "Ảnh hưởng SEO của Mobile-first?",
            "A. Cải thiện SEO mobile",
            "B. Không ảnh hưởng",
            "C. Giảm SEO desktop",
            "D. Không liên quan",
            "Ảnh hưởng SEO của Desktop-first?",
            "A. Nếu mobile yếu, SEO bị giảm",
            "B. SEO tăng cao",
            "C. Không có ảnh hưởng",
            "D. Chỉ ảnh hưởng desktop"
        });

        TITLE_MAP.put("CSS Container Queries", new String[]{
            "Container Queries là gì?",
            "A. Media Query dựa trên container",
            "B. Media Query dựa trên viewport",
            "C. Media Query dựa trên thiết bị",
            "D. Không liên quan Media Query",
            "Điểm khác Container và Media Query?",
            "A. Container Query phụ thuộc kích thước container",
            "B. Media Query phụ thuộc thiết bị",
            "C. Cả hai đúng",
            "D. Cả hai sai",
            "Khi nào dùng Container Query?",
            "A. Khi thiết kế component",
            "B. Khi thiết kế layout toàn trang",
            "C. Khi viết JavaScript",
            "D. Khi thiết kế hình ảnh",
            "Lợi ích của Container Queries?",
            "A. Giao diện linh hoạt",
            "B. Dễ maintain",
            "C. Giảm lỗi responsive",
            "D. Tất cả các đáp án trên",
            "Cú pháp khai báo Container Queries?",
            "A. @container",
            "B. @media",
            "C. @query",
            "D. @responsive",
            "Container Queries hỗ trợ những thuộc tính nào?",
            "A. width, height",
            "B. aspect-ratio",
            "C. inline-size",
            "D. Tất cả các đáp án trên",
            "Container Queries có nhược điểm gì?",
            "A. Hỗ trợ trình duyệt hạn chế",
            "B. Code phức tạp",
            "C. Tăng thời gian tải",
            "D. Cả A và B",
            "Trình duyệt nào hỗ trợ Container Queries?",
            "A. Chrome",
            "B. Firefox",
            "C. Safari",
            "D. Tất cả các đáp án trên",
            "Container Queries giúp tối ưu gì?",
            "A. Component responsive",
            "B. SEO",
            "C. API performance",
            "D. Database access",
            "CSS Property nào kích hoạt Container?",
            "A. container-type",
            "B. query-type",
            "C. display-type",
            "D. box-type"
        });

        TITLE_MAP.put("Transition", new String[]{
            "Transition trong CSS là gì?",
            "A. Hiệu ứng chuyển đổi giữa các trạng thái",
            "B. Hiệu ứng màu sắc",
            "C. Animation vòng lặp",
            "D. Không có trong CSS",
            "Thuộc tính nào liên quan Transition?",
            "A. transition-property",
            "B. transition-duration",
            "C. transition-timing-function",
            "D. Tất cả các đáp án trên",
            "transition-property dùng để làm gì?",
            "A. Xác định thuộc tính sẽ thay đổi",
            "B. Xác định thời gian",
            "C. Xác định độ trễ",
            "D. Xác định độ sáng",
            "transition-duration là gì?",
            "A. Thời gian thực hiện chuyển đổi",
            "B. Độ sáng tăng",
            "C. Kích thước giảm",
            "D. Không liên quan",
            "transition-timing-function là gì?",
            "A. Xác định tốc độ chuyển đổi",
            "B. Xác định vị trí",
            "C. Xác định màu sắc",
            "D. Xác định số lần lặp",
            "Giá trị của transition-timing-function?",
            "A. ease",
            "B. linear",
            "C. ease-in-out",
            "D. Tất cả các đáp án trên",
            "transition-delay là gì?",
            "A. Độ trễ bắt đầu hiệu ứng",
            "B. Tốc độ tăng",
            "C. Kích thước giảm",
            "D. Không liên quan",
            "Cách viết shorthand cho Transition?",
            "A. property duration timing-function delay",
            "B. duration property delay timing-function",
            "C. timing-function delay property duration",
            "D. property timing-function duration delay",
            "Transition có thể dùng với những thuộc tính nào?",
            "A. color",
            "B. background-color",
            "C. width",
            "D. Tất cả các đáp án trên",
            "Transition ảnh hưởng SEO không?",
            "A. Không",
            "B. Có",
            "C. Làm tăng tốc độ load",
            "D. Tối ưu hóa hình ảnh"
        });
        TITLE_MAP.put("Animation", new String[]{
            "Animation trong CSS cho phép gì?",
            "A. Thay đổi giá trị CSS theo thời gian\n"
            + "B. Thêm hiệu ứng chuyển động\n"
            + "C. Cải thiện trải nghiệm người dùng\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào xác định tên animation?",
            "A. animation-name\n"
            + "B. animation-duration\n"
            + "C. animation-delay\n"
            + "D. animation-iteration-count",
            "Thuộc tính nào quy định thời gian diễn ra animation?",
            "A. animation-timing-function\n"
            + "B. animation-fill-mode\n"
            + "C. animation-duration\n"
            + "D. animation-name",
            "Animation được áp dụng bằng cách nào?",
            "A. Thêm vào class\n"
            + "B. Thêm vào id\n"
            + "C. Thêm vào thẻ trực tiếp\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào điều khiển số lần lặp lại animation?",
            "A. animation-delay\n"
            + "B. animation-iteration-count\n"
            + "C. animation-play-state\n"
            + "D. animation-direction",
            "animation-timing-function điều chỉnh gì?",
            "A. Tốc độ thay đổi\n"
            + "B. Màu sắc\n"
            + "C. Kích thước\n"
            + "D. Độ mờ",
            "Thuộc tính animation-delay dùng để làm gì?",
            "A. Trì hoãn bắt đầu animation\n"
            + "B. Ngừng animation\n"
            + "C. Lặp lại animation\n"
            + "D. Đổi màu animation",
            "animation-fill-mode giúp gì?",
            "A. Xác định trạng thái sau animation\n"
            + "B. Thay đổi màu nền\n"
            + "C. Tạo border động\n"
            + "D. Làm tròn góc",
            "Kết hợp animation với media queries nhằm mục đích gì?",
            "A. Responsive animation\n"
            + "B. Tăng tốc độ website\n"
            + "C. Giảm tải server\n"
            + "D. Cố định layout",
            "Animation nào sẽ lặp vô hạn?",
            "A. animation-iteration-count: 1\n"
            + "B. animation-iteration-count: infinite\n"
            + "C. animation-iteration-count: 0\n"
            + "D. animation-iteration-count: auto"
        });

        TITLE_MAP.put("Keyframes", new String[]{
            "Keyframes được dùng để làm gì?",
            "A. Xác định các trạng thái animation\n"
            + "B. Đổi màu chữ\n"
            + "C. Tăng tốc website\n"
            + "D. Xác định grid layout",
            "Từ khóa nào định nghĩa keyframes?",
            "A. @animation\n"
            + "B. @media\n"
            + "C. @keyframes\n"
            + "D. @transition",
            "Keyframes hoạt động như thế nào?",
            "A. Chuyển đổi giữa các mốc thời gian\n"
            + "B. Tạo layout\n"
            + "C. Điều chỉnh màu sắc\n"
            + "D. Thay đổi tốc độ load",
            "0% trong keyframes biểu thị điều gì?",
            "A. Bắt đầu animation\n"
            + "B. Kết thúc animation\n"
            + "C. Giữa animation\n"
            + "D. Sau animation",
            "100% trong keyframes biểu thị điều gì?",
            "A. Kết thúc animation\n"
            + "B. Bắt đầu animation\n"
            + "C. Lặp lại animation\n"
            + "D. Xóa animation",
            "Có thể định nghĩa nhiều keyframes cho 1 element không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Tùy trình duyệt\n"
            + "D. Chỉ với JavaScript",
            "Keyframe có thể đặt mốc thời gian bao nhiêu %?",
            "A. 0%, 50%, 100%\n"
            + "B. 0%, 100%\n"
            + "C. 25%, 50%, 75%\n"
            + "D. Bất kỳ % nào",
            "Làm sao để gọi 1 keyframe?",
            "A. animation-name\n"
            + "B. keyframe-name\n"
            + "C. @keyframes\n"
            + "D. animation-call",
            "Keyframe có thể dùng để thay đổi thuộc tính nào?",
            "A. Color\n"
            + "B. Transform\n"
            + "C. Opacity\n"
            + "D. Tất cả các đáp án trên",
            "Cú pháp @keyframes cần gì?",
            "A. Tên keyframes\n"
            + "B. Các mốc thời gian\n"
            + "C. Các thay đổi thuộc tính\n"
            + "D. Tất cả các đáp án trên"
        });

        TITLE_MAP.put("Hover effect nâng cao", new String[]{
            "Hover effect nâng cao là gì?",
            "A. Hiệu ứng khi di chuột vào phần tử\n"
            + "B. Hiệu ứng khi click chuột\n"
            + "C. Hiệu ứng khi scroll\n"
            + "D. Hiệu ứng khi tải trang",
            "Kỹ thuật hover nào làm animation mượt hơn?",
            "A. Transition\n"
            + "B. Transform\n"
            + "C. Animation\n"
            + "D. Tất cả các đáp án trên",
            "Hover effect phổ biến nào?",
            "A. Đổi màu nền\n"
            + "B. Scale to lên\n"
            + "C. Thêm bóng đổ\n"
            + "D. Tất cả các đáp án trên",
            "Hover effect có thể áp dụng cho element nào?",
            "A. button\n"
            + "B. a\n"
            + "C. div\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào dùng nhiều cho hover?",
            "A. transition\n"
            + "B. opacity\n"
            + "C. transform\n"
            + "D. Tất cả các đáp án trên",
            "Thêm delay khi hover bằng thuộc tính nào?",
            "A. transition-delay\n"
            + "B. animation-delay\n"
            + "C. hover-delay\n"
            + "D. effect-delay",
            "Hover effect làm nặng website không?",
            "A. Nếu tối ưu thì không\n"
            + "B. Luôn luôn làm nặng\n"
            + "C. Tùy trình duyệt\n"
            + "D. Không bao giờ làm nặng",
            "Hover kết hợp với media queries để làm gì?",
            "A. Tắt hover trên mobile\n"
            + "B. Tăng hover trên desktop\n"
            + "C. Thêm hover trên tablet\n"
            + "D. Tất cả các đáp án trên",
            "Nên dùng hover ở đâu?",
            "A. Button\n"
            + "B. Card\n"
            + "C. Link\n"
            + "D. Tất cả các đáp án trên",
            "Hiệu ứng hover nào chuyên nghiệp?",
            "A. Nhẹ, tự nhiên\n"
            + "B. Sặc sỡ, giật mạnh\n"
            + "C. Flashing liên tục\n"
            + "D. Nhấp nháy gắt"
        });

        TITLE_MAP.put(":nth-child(n) - Chọn Phần Tử Theo Thứ Tự", new String[]{
            "nth-child dùng để làm gì?",
            "A. Chọn phần tử theo vị trí\n"
            + "B. Chọn phần tử theo id\n"
            + "C. Chọn phần tử theo class\n"
            + "D. Chọn toàn bộ phần tử",
            "nth-child(2) chọn phần tử nào?",
            "A. Phần tử thứ 2\n"
            + "B. Phần tử đầu tiên\n"
            + "C. Phần tử cuối cùng\n"
            + "D. Tất cả phần tử chẵn",
            "nth-child(even) chọn phần tử nào?",
            "A. Phần tử số chẵn\n"
            + "B. Phần tử số lẻ\n"
            + "C. Tất cả các phần tử\n"
            + "D. Không phần tử nào",
            "nth-child(odd) chọn phần tử nào?",
            "A. Phần tử số lẻ\n"
            + "B. Phần tử số chẵn\n"
            + "C. Phần tử đầu tiên\n"
            + "D. Phần tử cuối cùng",
            "nth-child(n+3) có nghĩa gì?",
            "A. Bắt đầu từ phần tử thứ 3 trở đi\n"
            + "B. Chỉ phần tử thứ 3\n"
            + "C. Từ phần tử thứ 2\n"
            + "D. Không chọn phần tử nào",
            "nth-child(3n) chọn phần tử nào?",
            "A. Mỗi 3 phần tử 1 lần\n"
            + "B. 3 phần tử đầu tiên\n"
            + "C. Phần tử cuối cùng\n"
            + "D. Không chọn phần tử nào",
            "nth-child formula (an+b) nghĩa là gì?",
            "A. Pattern chọn theo công thức\n"
            + "B. Cố định 1 phần tử\n"
            + "C. Xoá phần tử\n"
            + "D. Không có nghĩa",
            "nth-child(-n+3) chọn phần tử nào?",
            "A. Phần tử từ 1 đến 3\n"
            + "B. Phần tử 3 trở đi\n"
            + "C. Phần tử số lẻ\n"
            + "D. Phần tử số chẵn",
            "nth-child áp dụng cho element nào?",
            "A. Bất kỳ element nào\n"
            + "B. Chỉ thẻ div\n"
            + "C. Chỉ thẻ span\n"
            + "D. Chỉ thẻ input",
            "nth-child khác nth-of-type thế nào?",
            "A. nth-child chọn theo vị trí bất kỳ\n"
            + "B. nth-of-type chọn theo loại\n"
            + "C. nth-child chọn mọi thẻ\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put(":not() - Loại Trừ Một Phần Tử", new String[]{
            ":not() dùng để làm gì?",
            "A. Loại trừ phần tử nhất định.\n"
            + "B. Chọn toàn bộ phần tử.\n"
            + "C. Thêm class mới.\n"
            + "D. Xóa class.",
            ":not(div) sẽ chọn phần tử nào?",
            "A. Tất cả phần tử không phải div.\n"
            + "B. Chỉ phần tử div.\n"
            + "C. Chỉ phần tử span.\n"
            + "D. Không chọn phần tử nào.",
            ":not() có thể kết hợp nhiều selector không?",
            "A. Có thể.\n"
            + "B. Không thể.\n"
            + "C. Chỉ dùng với class.\n"
            + "D. Chỉ dùng với id.",
            "Cú pháp nào đúng khi dùng :not()?",
            "A. div:not(.active).\n"
            + "B. :not-div.active.\n"
            + "C. div.active:not.\n"
            + "D. div:notactive.",
            ":not(.a, .b) sẽ loại trừ phần tử nào?",
            "A. Cả class .a và .b.\n"
            + "B. Chỉ class .a.\n"
            + "C. Chỉ class .b.\n"
            + "D. Không loại trừ phần tử nào.",
            ":not() có hỗ trợ lồng nhau không?",
            "A. Có thể lồng.\n"
            + "B. Không thể lồng.\n"
            + "C. Chỉ lồng được 1 lần.\n"
            + "D. Chỉ hỗ trợ trên Firefox.",
            ":not(*) có nghĩa là gì?",
            "A. Không chọn phần tử nào.\n"
            + "B. Chọn tất cả phần tử.\n"
            + "C. Chọn phần tử body.\n"
            + "D. Chọn phần tử div.",
            ":not() hữu ích trong trường hợp nào?",
            "A. Khi cần loại trừ nhóm phần tử nhất định.\n"
            + "B. Khi cần chọn mọi phần tử.\n"
            + "C. Khi thêm sự kiện click.\n"
            + "D. Khi load trang.",
            "Có thể kết hợp :not() với pseudo-class khác không?",
            "A. Có thể.\n"
            + "B. Không thể.\n"
            + "C. Chỉ kết hợp được với hover.\n"
            + "D. Chỉ kết hợp được với focus.",
            ":not(:first-child) sẽ làm gì?",
            "A. Chọn tất cả trừ phần tử đầu tiên.\n"
            + "B. Chỉ chọn phần tử đầu tiên.\n"
            + "C. Chọn phần tử cuối cùng.\n"
            + "D. Không chọn phần tử nào."
        });
        TITLE_MAP.put(":focus-within - Chọn Phần Tử Khi Có Focus Bên Trong", new String[]{
            ":focus-within nghĩa là gì?",
            "A. Khi có phần tử bên trong được focus.\n"
            + "B. Khi thẻ cha được hover.\n"
            + "C. Khi API response thành công.\n"
            + "D. Khi click vào div.",
            ":focus-within thường dùng cho thẻ nào?",
            "A. Form, div bao bọc input.\n"
            + "B. Thẻ img.\n"
            + "C. Thẻ script.\n"
            + "D. Thẻ style.",
            "Input bên trong div focus, div có :focus-within không?",
            "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi thêm tabindex.\n"
            + "D. Chỉ khi div có hover.",
            "Cách viết đúng với :focus-within?",
            "A. div:focus-within {}\n"
            + "B. div focus-within {}\n"
            + "C. div.focus-within {}\n"
            + "D. div:focus {}",
            ":focus-within có thể dùng để tạo hiệu ứng gì?",
            "A. Highlight viền form.\n"
            + "B. Zoom ảnh.\n"
            + "C. Load video.\n"
            + "D. Tải trang web mới.",
            ":focus-within xuất hiện từ CSS phiên bản nào?",
            "A. CSS3.\n"
            + "B. CSS2.\n"
            + "C. CSS1.\n"
            + "D. HTML5.",
            "Có thể kết hợp :focus-within và :hover không?",
            "A. Có thể.\n"
            + "B. Không thể.\n"
            + "C. Chỉ trên Firefox.\n"
            + "D. Chỉ trên Safari.",
            "Focus vào input bên trong fieldset, fieldset có focus-within không?",
            "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi fieldset có tabindex.\n"
            + "D. Chỉ khi fieldset disabled.",
            "Tab vào input, div cha có thể đổi màu bằng :focus-within không?",
            "A. Có.\n"
            + "B. Không.\n"
            + "C. Phải dùng JS mới được.\n"
            + "D. Phải dùng hover.",
            "Điều kiện nào để :focus-within được kích hoạt?",
            "A. Bất kỳ phần tử con nào focus.\n"
            + "B. Chỉ thẻ cha focus.\n"
            + "C. Cần sự kiện click.\n"
            + "D. Cần mouseover."
        });
        TITLE_MAP.put("Pseudo-elements (::before, ::after)", new String[]{
            "Pseudo-elements nào chèn nội dung trước phần tử?",
            "A. ::before.\n"
            + "B. ::after.\n"
            + "C. ::first-letter.\n"
            + "D. ::selection.",
            "Pseudo-elements nào chèn nội dung sau phần tử?",
            "A. ::after.\n"
            + "B. ::before.\n"
            + "C. ::first-line.\n"
            + "D. ::placeholder.",
            "::before yêu cầu thuộc tính gì để hiển thị?",
            "A. content.\n"
            + "B. width.\n"
            + "C. height.\n"
            + "D. color.",
            "::after thường dùng để làm gì?",
            "A. Thêm biểu tượng, dấu trang trí.\n"
            + "B. Đổi background.\n"
            + "C. Zoom ảnh.\n"
            + "D. Load script.",
            "Có thể dùng cả ::before và ::after cùng lúc không?",
            "A. Có thể.\n"
            + "B. Không thể.\n"
            + "C. Phải chọn một.\n"
            + "D. Chỉ dùng cho input.",
            "Cú pháp đúng khi dùng ::before?",
            "A. .element::before {}\n"
            + "B. .element:before {}\n"
            + "C. element-before {}\n"
            + "D. element.before {}",
            "Có thể gán background cho ::after không?",
            "A. Có thể.\n"
            + "B. Không thể.\n"
            + "C. Chỉ khi dùng border.\n"
            + "D. Chỉ khi dùng JavaScript.",
            "::first-letter áp dụng cho phần nào?",
            "A. Chữ cái đầu tiên.\n"
            + "B. Dòng đầu tiên.\n"
            + "C. Tất cả chữ.\n"
            + "D. Toàn bộ div.",
            "::first-line áp dụng cho phần nào?",
            "A. Dòng đầu tiên của văn bản.\n"
            + "B. Chữ cái đầu tiên.\n"
            + "C. Các hình ảnh.\n"
            + "D. Các thẻ input.",
            "Khi nào nên dùng pseudo-elements?",
            "A. Khi muốn chèn thêm nội dung mà không thay đổi HTML.\n"
            + "B. Khi cần gửi form.\n"
            + "C. Khi đổi theme.\n"
            + "D. Khi load dữ liệu từ server."
        });
        //CSS Chuyên Nghiệp
        TITLE_MAP.put("BEM (Block Element Modifier)", new String[]{
            "BEM là viết tắt của gì?",
            "A. Block Element Modifier.\n"
            + "B. Basic Easy Module.\n"
            + "C. Block Easy Management.\n"
            + "D. Base Element Management.",
            "BEM giúp ích gì trong việc đặt tên class?",
            "A. Rõ ràng và dễ bảo trì.\n"
            + "B. Ngắn gọn tối đa.\n"
            + "C. Tự động hóa đặt tên.\n"
            + "D. Tối ưu tốc độ trình duyệt.",
            "Trong BEM, dấu __ dùng để làm gì?",
            "A. Phân tách Block và Element.\n"
            + "B. Phân tách Block và Modifier.\n"
            + "C. Phân tách 2 Block khác nhau.\n"
            + "D. Tách riêng các file CSS.",
            "Dấu -- trong BEM có ý nghĩa gì?",
            "A. Đánh dấu Modifier của một Block hoặc Element.\n"
            + "B. Kết thúc tên class.\n"
            + "C. Khởi tạo biến mới.\n"
            + "D. Thêm một Block phụ.",
            "Ví dụ đúng về BEM là gì?",
            "A. button__icon--small.\n"
            + "B. button-icon-small.\n"
            + "C. button.icon.small.\n"
            + "D. button-iconSmall.",
            "Block trong BEM là gì?",
            "A. Thành phần chính, độc lập.\n"
            + "B. Một thuộc tính CSS.\n"
            + "C. Một file JavaScript.\n"
            + "D. Một loại database.",
            "Element trong BEM là gì?",
            "A. Phần con của Block.\n"
            + "B. Một hàm JavaScript.\n"
            + "C. Một file HTML riêng.\n"
            + "D. Một API endpoint.",
            "Modifier trong BEM dùng để làm gì?",
            "A. Thay đổi giao diện hoặc trạng thái.\n"
            + "B. Thay đổi cấu trúc DOM.\n"
            + "C. Gọi API mới.\n"
            + "D. Thay đổi server response.",
            "Điểm mạnh lớn nhất của BEM là gì?",
            "A. Dễ mở rộng và tránh xung đột class.\n"
            + "B. Giảm dung lượng file CSS.\n"
            + "C. Tăng tốc độ load hình ảnh.\n"
            + "D. Tăng bảo mật hệ thống.",
            "Trong tên BEM, chữ cái nên được viết như thế nào?",
            "A. Viết thường, nối bằng dấu gạch ngang.\n"
            + "B. Viết hoa tất cả.\n"
            + "C. Viết hoa chữ cái đầu.\n"
            + "D. Viết liền không dấu cách."
        });
        TITLE_MAP.put("OOCSS (Object-Oriented CSS)", new String[]{
            "OOCSS là viết tắt của gì?",
            "A. Object-Oriented CSS.\n"
            + "B. Open-Optimized CSS.\n"
            + "C. Organized-Order CSS.\n"
            + "D. Operation-Output CSS.",
            "Mục tiêu chính của OOCSS là gì?",
            "A. Tái sử dụng code và giảm trùng lặp.\n"
            + "B. Viết CSS ngắn gọn nhất có thể.\n"
            + "C. Tối ưu tốc độ API.\n"
            + "D. Tăng khả năng bảo mật web.",
            "OOCSS chia nhỏ CSS dựa trên?",
            "A. Cấu trúc và giao diện.\n"
            + "B. Server và client.\n"
            + "C. API và Database.\n"
            + "D. HTML và JavaScript.",
            "OOCSS khuyến khích viết class như thế nào?",
            "A. Phân tách rõ ràng giữa style và content.\n"
            + "B. Gom toàn bộ style vào một class.\n"
            + "C. Dùng inline style.\n"
            + "D. Không dùng class, chỉ dùng id.",
            "Một lợi ích của OOCSS là?",
            "A. Dễ dàng bảo trì và mở rộng.\n"
            + "B. Rút ngắn thời gian tải server.\n"
            + "C. Tối ưu tốc độ database.\n"
            + "D. Giảm số lượng thẻ HTML.",
            "Trong OOCSS, 'object' thường được hiểu là?",
            "A. Một module giao diện có thể tái sử dụng.\n"
            + "B. Một đoạn script.\n"
            + "C. Một file ảnh.\n"
            + "D. Một file server.",
            "Điều nào sau đây KHÔNG phải là nguyên tắc của OOCSS?",
            "A. Tách riêng cấu trúc và giao diện.\n"
            + "B. Tái sử dụng tối đa các class.\n"
            + "C. Gộp tất cả style vào một file.\n"
            + "D. Viết CSS dựa trên object.",
            "Một ví dụ đúng về OOCSS là?",
            "A. .media .media-title.\n"
            + "B. #mainHeaderTitle.\n"
            + "C. .btnBigPrimary.\n"
            + "D. .container-fluid-row.",
            "OOCSS giúp ích như thế nào trong dự án lớn?",
            "A. Code CSS gọn gàng và dễ quản lý.\n"
            + "B. Viết code server nhanh hơn.\n"
            + "C. Quản lý API đơn giản hơn.\n"
            + "D. Giảm lỗi logic trong backend.",
            "OOCSS phù hợp với loại dự án nào?",
            "A. Dự án lớn hoặc cần maintain lâu dài.\n"
            + "B. Các dự án backend server.\n"
            + "C. Dự án không cần responsive.\n"
            + "D. Ứng dụng desktop offline."
        });
        TITLE_MAP.put("SMACSS", new String[]{
            "SMACSS là viết tắt của gì?",
            "A. Scalable and Modular Architecture for CSS\n"
            + "B. Simple Modular and Component CSS\n"
            + "C. Style Management and CSS Structure\n"
            + "D. Standardized Modular Approach to CSS",
            "SMACSS phân loại CSS rules thành mấy nhóm chính?",
            "A. 3\n"
            + "B. 4\n"
            + "C. 5\n"
            + "D. 6",
            "Nhóm nào KHÔNG phải là phân loại trong SMACSS?",
            "A. Base\n"
            + "B. Layout\n"
            + "C. Component\n"
            + "D. Utility",
            "Quy tắc Base trong SMACSS thường áp dụng cho?",
            "A. Thẻ HTML (html, body, a)\n"
            + "B. Lớp CSS (.btn, .card)\n"
            + "C. ID (#header, #footer)\n"
            + "D. Thành phần layout",
            "Tiền tố nào thường dùng cho Layout rules?",
            "A. .l-\n"
            + "B. .layout-\n"
            + "C. .lyt-\n"
            + "D. Không cần tiền tố",
            "Module trong SMACSS tương đương với?",
            "A. Component\n"
            + "B. Utility\n"
            + "C. State\n"
            + "D. Base",
            "State rules trong SMACSS thường dùng tiền tố gì?",
            "A. .s-\n"
            + "B. .is-\n"
            + "C. .state-\n"
            + "D. .st-",
            "Theme rules trong SMACSS dùng để làm gì?",
            "A. Thay đổi giao diện theo theme\n"
            + "B. Định nghĩa animation\n"
            + "C. Tạo layout\n"
            + "D. Reset CSS",
            "Ưu điểm chính của SMACSS là gì?",
            "A. Dễ bảo trì\n"
            + "B. Khả năng mở rộng\n"
            + "C. Tái sử dụng code\n"
            + "D. Tất cả các đáp án trên",
            "SMACSS khuyến khích viết CSS selector như thế nào?",
            "A. Specificity thấp\n"
            + "B. Dùng nhiều ID\n"
            + "C. Dùng !important\n"
            + "D. Nesting sâu"
        });
        TITLE_MAP.put("Biến trong CSS (--main-color)", new String[]{
            "Cú pháp khai báo biến CSS là?",
            "A. $main-color: red;\n"
            + "B. --main-color: red;\n"
            + "C. var(--main-color): red;\n"
            + "D. @main-color: red;",
            "Cách sử dụng biến CSS đã khai báo?",
            "A. color: $main-color;\n"
            + "B. color: var(--main-color);\n"
            + "C. color: @main-color;\n"
            + "D. color: main-color;",
            "Nên khai báo biến CSS ở đâu để dùng toàn cục?",
            "A. Trong selector html\n"
            + "B. Trong selector :root\n"
            + "C. Trong body\n"
            + "D. Trong file JavaScript",
            "Biến CSS có thể chứa giá trị nào?",
            "A. Màu sắc\n"
            + "B. Kích thước\n"
            + "C. Chuỗi text\n"
            + "D. Tất cả các đáp án trên",
            "Làm cách nào để đặt giá trị dự phòng cho biến CSS?",
            "A. var(--color, red)\n"
            + "B. var(--color || red)\n"
            + "C. var(--color ? red)\n"
            + "D. var(--color: red)",
            "Ưu điểm chính của biến CSS là gì?",
            "A. Dễ thay đổi giá trị hàng loạt\n"
            + "B. Tăng hiệu suất trình duyệt\n"
            + "C. Giảm kích thước file CSS\n"
            + "D. Thay thế hoàn toàn SASS",
            "Có thể thay đổi giá trị biến CSS bằng JavaScript không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với biến toàn cục\n"
            + "D. Chỉ với biến local",
            "Biến CSS custom properties hỗ trợ từ phiên bản CSS nào?",
            "A. CSS2\n"
            + "B. CSS3\n"
            + "C. CSS Variables Module Level 1\n"
            + "D. CSS4",
            "Có thể dùng biến CSS trong media query không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với biến toàn cục\n"
            + "D. Chỉ trên trình duyệt mới",
            "Cách nào sau đây là đúng để cập nhật biến CSS bằng JS?",
            "A. document.styleSheets[0].setProperty('--color', 'red')\n"
            + "B. document.body.cssVar('--color', 'red')\n"
            + "C. document.variables.set('--color', 'red')\n"
            + "D. document.updateVar('--color', 'red')"
        });
        TITLE_MAP.put("Nested Rules", new String[]{
            "Nested Rules là tính năng của?",
            "A. CSS thuần\n"
            + "B. CSS preprocessor\n"
            + "C. CSS framework\n"
            + "D. CSS in JS",
            "Preprocessor nào hỗ trợ nested rules?",
            "A. SASS\n"
            + "B. LESS\n"
            + "C. Stylus\n"
            + "D. Tất cả các đáp án trên",
            "Khi nested selector & đại diện cho gì?",
            "A. Parent selector\n"
            + "B. Child selector\n"
            + "C. Root selector\n"
            + "D. Global selector",
            "Lợi ích chính của nested rules là gì?",
            "A. Code ngắn gọn hơn\n"
            + "B. Dễ đọc và bảo trì\n"
            + "C. Tránh lặp selector\n"
            + "D. Tất cả các đáp án trên",
            "Nested rules quá sâu có thể dẫn đến?",
            "A. Selector quá cụ thể\n"
            + "B. Khó override style\n"
            + "C. Tăng kích thước file CSS\n"
            + "D. Tất cả các đáp án trên",
            "Cú pháp nested nào sau đây là đúng?",
            "A. .parent { .child { color: red } }\n"
            + "B. .parent > .child { color: red }\n"
            + "C. Cả A và B\n"
            + "D. Không có đáp án đúng",
            "Có thể nest media query trong selector không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với SASS\n"
            + "D. Chỉ với LESS",
            "Nested property là gì?",
            "A. Nhóm thuộc tính có cùng tiền tố\n"
            + "B. Thuộc tính lồng trong selector\n"
            + "C. Thuộc tính kế thừa\n"
            + "D. Thuộc tính global",
            "Ví dụ nào sau đây là nested property?",
            "A. font: { size: 16px; weight: bold }\n"
            + "B. .parent { .child { color: red } }\n"
            + "C. @media (min-width: 768px) { ... }\n"
            + "D. $color: red;",
            "Độ sâu nested tối ưu nên là bao nhiêu?",
            "A. 1-2 cấp\n"
            + "B. 3-4 cấp\n"
            + "C. 5-6 cấp\n"
            + "D. Không giới hạn"
        });
        TITLE_MAP.put("Mixins – Định nghĩa một nhóm CSS tái sử dụng", new String[]{
            "Mixins là tính năng của?",
            "A. CSS thuần\n"
            + "B. CSS preprocessor\n"
            + "C. CSS framework\n"
            + "D. CSS in JS",
            "Cú pháp khai báo mixin trong SASS?",
            "A. @mixin name { ... }\n"
            + "B. .mixin name { ... }\n"
            + "C. mixin name { ... }\n"
            + "D. #mixin name { ... }",
            "Cách sử dụng mixin đã khai báo?",
            "A. @include name;\n"
            + "B. @use name;\n"
            + "C. @apply name;\n"
            + "D. @mixin name;",
            "Mixins có thể nhận tham số không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với SASS\n"
            + "D. Chỉ với LESS",
            "Ưu điểm chính của mixins là gì?",
            "A. Tái sử dụng code\n"
            + "B. Giảm lặp code\n"
            + "C. Dễ bảo trì\n"
            + "D. Tất cả các đáp án trên",
            "Ví dụ nào sau đây là mixin có tham số?",
            "A. @mixin size($w, $h) { width: $w; height: $h }\n"
            + "B. .size { width: 100px; height: 100px }\n"
            + "C. $size: 100px;\n"
            + "D. @function size() { ... }",
            "Có thể đặt giá trị mặc định cho tham số mixin không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với SASS\n"
            + "D. Chỉ với Stylus",
            "Mixins khác functions ở điểm nào?",
            "A. Mixins trả về CSS rules\n"
            + "B. Functions trả về giá trị\n"
            + "C. Cả A và B\n"
            + "D. Không có khác biệt",
            "Khi nào nên dùng mixin thay cho extend?",
            "A. Khi cần truyền tham số\n"
            + "B. Khi cần tạo code linh hoạt\n"
            + "C. Cả A và B\n"
            + "D. Luôn dùng extend thay cho mixin",
            "Có thể dùng mixin để tạo responsive helpers không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với media query\n"
            + "D. Chỉ với CSS thuần"
        });
        TITLE_MAP.put("Functions - Xử lý logic trong SCSS", new String[]{
            "Functions trong SCSS khác Mixins ở điểm nào?",
            "A. Functions trả về giá trị\n"
            + "B. Mixins trả về CSS rules\n"
            + "C. Cả A và B\n"
            + "D. Không có khác biệt",
            "Cú pháp khai báo function trong SCSS?",
            "A. @function name() { ... }\n"
            + "B. function name() { ... }\n"
            + "C. .function name() { ... }\n"
            + "D. #function name() { ... }",
            "Lệnh nào dùng để trả về giá trị từ function?",
            "A. return\n"
            + "B. @return\n"
            + "C. yield\n"
            + "D. output",
            "Function trong SCSS có thể dùng để làm gì?",
            "A. Tính toán giá trị\n"
            + "B. Chuyển đổi đơn vị\n"
            + "C. Xử lý màu sắc\n"
            + "D. Tất cả các đáp án trên",
            "Hàm nào sau đây là built-in function của SCSS?",
            "A. darken()\n"
            + "B. lighten()\n"
            + "C. mix()\n"
            + "D. Tất cả các đáp án trên",
            "Có thể dùng function để tạo dynamic classes không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với @extend\n"
            + "D. Chỉ với mixins",
            "Function có thể nhận bao nhiêu tham số?",
            "A. 1\n"
            + "B. 2\n"
            + "C. Không giới hạn\n"
            + "D. Tối đa 5",
            "Làm cách nào để gọi function đã định nghĩa?",
            "A. function-name()\n"
            + "B. call(function-name)\n"
            + "C. @function-name\n"
            + "D. use(function-name)",
            "Function nào sau đây chuyển đổi pixel sang rem?",
            "A. @function px-to-rem($px) { @return $px / 16 + rem }\n"
            + "B. function px2rem($px) { return $px/16rem }\n"
            + "C. @mixin px-to-rem($px) { ... }\n"
            + "D. $px-to-rem: $px / 16;",
            "Khi nào nên dùng function thay cho mixin?",
            "A. Khi cần tính toán giá trị\n"
            + "B. Khi cần tạo CSS rules\n"
            + "C. Khi cần media queries\n"
            + "D. Khi cần extend styles"
        });
        TITLE_MAP.put("Tối ưu hóa mã CSS với SCSS", new String[]{
            "SCSS giúp tối ưu CSS bằng cách nào?",
            "A. Sử dụng variables\n"
            + "B. Sử dụng nesting\n"
            + "C. Sử dụng mixins/functions\n"
            + "D. Tất cả các đáp án trên",
            "Kỹ thuật nào giảm lặp code trong SCSS?",
            "A. @extend\n"
            + "B. @mixin\n"
            + "C. Placeholder selectors\n"
            + "D. Tất cả các đáp án trên",
            "Tại sao nên hạn chế nesting sâu trong SCSS?",
            "A. Tạo selector quá cụ thể\n"
            + "B. Khó bảo trì\n"
            + "C. Tăng kích thước file CSS\n"
            + "D. Tất cả các đáp án trên",
            "Partial files trong SCSS dùng để làm gì?",
            "A. Chia nhỏ code thành các module\n"
            + "B. Tăng tốc độ compile\n"
            + "C. Dễ quản lý code\n"
            + "D. Tất cả các đáp án trên",
            "Ký tự nào đặt trước tên file SCSS để tạo partial?",
            "A. _\n"
            + "B. -\n"
            + "C. @\n"
            + "D. !",
            "Lệnh nào import partial file trong SCSS?",
            "A. @import 'filename' (không cần _ và .scss)\n"
            + "B. include 'filename'\n"
            + "C. use 'filename'\n"
            + "D. require 'filename'",
            "Placeholder selector trong SCSS bắt đầu bằng ký tự nào?",
            "A. %\n"
            + "B. .\n"
            + "C. &\n"
            + "D. _",
            "Ưu điểm của placeholder selector?",
            "A. Chỉ compile khi được @extend\n"
            + "B. Giảm code trùng lặp\n"
            + "C. Cả A và B\n"
            + "D. Không có ưu điểm",
            "Khi nào nên dùng @extend thay cho @mixin?",
            "A. Khi cần nhóm các selector\n"
            + "B. Khi không cần tham số\n"
            + "C. Khi muốn code gọn hơn\n"
            + "D. Tất cả các đáp án trên",
            "Công cụ nào compile SCSS sang CSS?",
            "A. node-sass\n"
            + "B. dart-sass\n"
            + "C. libsass\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Minify CSS", new String[]{
            "Minify CSS là gì?",
            "A. Loại bỏ khoảng trắng, comments\n"
            + "B. Rút gọn tên biến\n"
            + "C. Tối ưu cú pháp CSS\n"
            + "D. Tất cả các đáp án trên",
            "Lợi ích chính của minify CSS?",
            "A. Giảm kích thước file\n"
            + "B. Tăng tốc độ tải trang\n"
            + "C. Cả A và B\n"
            + "D. Không có lợi ích",
            "Công cụ nào minify CSS?",
            "A. cssnano\n"
            + "B. clean-css\n"
            + "C. UglifyCSS\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên minify CSS?",
            "A. Môi trường production\n"
            + "B. Môi trường development\n"
            + "C. Cả hai môi trường\n"
            + "D. Không cần minify",
            "Minify CSS có ảnh hưởng đến hiệu suất render không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ trên mobile\n"
            + "D. Chỉ với trình duyệt cũ",
            "Có thể tự đảo ngược (reverse) file CSS đã minify không?",
            "A. Có, bằng công cụ beautify\n"
            + "B. Không thể hoàn toàn\n"
            + "C. Chỉ khi có source map\n"
            + "D. Chỉ với CSS gốc đơn giản",
            "Source maps trong minify CSS dùng để làm gì?",
            "A. Debug code đã minify\n"
            + "B. Theo dõi changes\n"
            + "C. Cả A và B\n"
            + "D. Không có tác dụng",
            "Định dạng nào thường dùng cho CSS minified?",
            "A. .min.css\n"
            + "B. .cssmin\n"
            + "C. .css.min\n"
            + "D. .cssm",
            "Thuộc tính CSS nào thường được tối ưu khi minify?",
            "A. margin: 10px 10px 10px 10px → margin: 10px\n"
            + "B. color: #ffffff → color: #fff\n"
            + "C. font-weight: bold → font-weight: 700\n"
            + "D. Tất cả các đáp án trên",
            "Minify CSS có ảnh hưởng đến SEO không?",
            "A. Có, gián tiếp qua tốc độ tải trang\n"
            + "B. Không\n"
            + "C. Chỉ ảnh hưởng nếu minify sai cách\n"
            + "D. Chỉ ảnh hưởng trên mobile"
        });
        TITLE_MAP.put("Load Font Tối ưu", new String[]{
            "Kỹ thuật nào tải font nhanh nhất?",
            "A. font-display: swap\n"
            + "B. Preload font\n"
            + "C. Sử dụng system font\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính font-display: swap có tác dụng gì?",
            "A. Hiển thị text ngay với font dự phòng\n"
            + "B. Swap font khi tải xong\n"
            + "C. Tránh FOIT (Flash of Invisible Text)\n"
            + "D. Tất cả các đáp án trên",
            "Làm cách nào preload font trong HTML?",
            "A. <link rel=\"preload\" href=\"font.woff2\" as=\"font\">\n"
            + "B. <font src=\"font.woff2\" preload>\n"
            + "C. @font-face { preload: true }\n"
            + "D. Tất cả đều sai",
            "Định dạng font nào nên ưu tiên sử dụng?",
            "A. woff2\n"
            + "B. woff\n"
            + "C. ttf\n"
            + "D. eot",
            "Tại sao nên subset font?",
            "A. Giảm kích thước file font\n"
            + "B. Chỉ tải ký tự cần dùng\n"
            + "C. Cả A và B\n"
            + "D. Không có lợi ích",
            "Kỹ thuật FOUT là gì?",
            "A. Flash of Unstyled Text\n"
            + "B. Hiển thị text ngay với font dự phòng\n"
            + "C. Cả A và B\n"
            + "D. Lỗi không tải được font",
            "Làm cách nào để giảm CLS khi load font?",
            "A. Đặt kích thước container cố định\n"
            + "B. Sử dụng font-display: optional\n"
            + "C. Cả A và B\n"
            + "D. Không thể giảm CLS",
            "Thuộc tính nào trong @font-face chỉ định font local?",
            "A. local()\n"
            + "B. src: local(\"Font Name\")\n"
            + "C. font-local: true\n"
            + "D. use-local: yes",
            "Công cụ nào giúp tạo font subset?",
            "A. Google Web Fonts helper\n"
            + "B. Font Squirrel\n"
            + "C. Glyphhanger\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên sử dụng data URI cho font?",
            "A. Font nhỏ (dưới 10KB)\n"
            + "B. Font quan trọng cần tải ngay\n"
            + "C. Cả A và B\n"
            + "D. Không nên dùng data URI"
        });
        TITLE_MAP.put("Critical CSS - Tải trước những phần CSS quan trọng", new String[]{
            "Critical CSS là gì?",
            "A. CSS cần thiết để hiển thị phần đầu tiên trên màn hình\n"
            + "B. Toàn bộ CSS của trang\n"
            + "C. CSS của các component quan trọng\n"
            + "D. CSS của các animation",
            "Lợi ích chính của Critical CSS?",
            "A. Giảm thời gian render ban đầu\n"
            + "B. Cải thiện điểm FCP (First Contentful Paint)\n"
            + "C. Cả A và B\n"
            + "D. Không có lợi ích rõ rệt",
            "Cách triển khai Critical CSS hiệu quả nhất?",
            "A. Nhúng trực tiếp trong thẻ <head>\n"
            + "B. Load async từ file riêng\n"
            + "C. Cả A và B\n"
            + "D. Chỉ cần preload CSS",
            "Công cụ nào giúp extract Critical CSS?",
            "A. Penthouse\n"
            + "B. Critical\n"
            + "C. webpack-critical\n"
            + "D. Tất cả các đáp án trên",
            "Critical CSS thường chiếm bao nhiêu phần trăm tổng CSS?",
            "A. 10-30%\n"
            + "B. 50-60%\n"
            + "C. 80-90%\n"
            + "D. 100%",
            "Kỹ thuật nào load phần CSS không quan trọng sau?",
            "A. Preload\n"
            + "B. Async loading\n"
            + "C. Lazy load\n"
            + "D. Tất cả các đáp án trên",
            "Critical CSS ảnh hưởng thế nào đến SEO?",
            "A. Cải thiện điểm Core Web Vitals\n"
            + "B. Giúp bot Google index nhanh hơn\n"
            + "C. Cả A và B\n"
            + "D. Không ảnh hưởng",
            "Khi nào không cần dùng Critical CSS?",
            "A. Trang có ít CSS\n"
            + "B. Trang single page application\n"
            + "C. Cả A và B\n"
            + "D. Luôn luôn cần dùng",
            "Cách xác định CSS nào là critical?",
            "A. Dùng DevTools Coverage\n"
            + "B. Phân tích FCP\n"
            + "C. Cả A và B\n"
            + "D. Đoán các selector quan trọng",
            "Preload CSS khác Critical CSS thế nào?",
            "A. Critical CSS là subset, preload là toàn bộ file\n"
            + "B. Preload chỉ đánh dấu ưu tiên tải\n"
            + "C. Cả A và B\n"
            + "D. Không có khác biệt"
        });
        TITLE_MAP.put("Lazy Loading - Tải tài nguyên khi cần thiết", new String[]{
            "Lazy loading là gì?",
            "A. Chỉ tải resource khi cần\n"
            + "B. Tải resource theo thứ tự ưu tiên\n"
            + "C. Tải resource sau khi trang load xong\n"
            + "D. Tất cả các đáp án trên",
            "Tài nguyên nào thường được lazy load?",
            "A. Ảnh\n"
            + "B. Iframe\n"
            + "C. Video\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính HTML nào hỗ trợ lazy load ảnh?",
            "A. loading=\"lazy\"\n"
            + "B. data-src\n"
            + "C. lazy=\"true\"\n"
            + "D. Tất cả đều đúng",
            "Lợi ích chính của lazy loading?",
            "A. Giảm data tải ban đầu\n"
            + "B. Cải thiện tốc độ load trang\n"
            + "C. Giảm request không cần thiết\n"
            + "D. Tất cả các đáp án trên",
            "Cách triển khai lazy loading cho ảnh?",
            "A. <img loading=\"lazy\">\n"
            + "B. Intersection Observer API\n"
            + "C. Thư viện lazysizes\n"
            + "D. Tất cả các đáp án trên",
            "Lazy loading có thể áp dụng cho CSS không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với media queries\n"
            + "D. Chỉ với print styles",
            "Khi nào không nên dùng lazy loading?",
            "A. Ảnh trên đầu trang\n"
            + "B. Ảnh quan trọng\n"
            + "C. Cả A và B\n"
            + "D. Luôn luôn nên dùng",
            "Lazy loading ảnh hưởng thế nào đến SEO?",
            "A. Googlebot hỗ trợ lazy loading\n"
            + "B. Cải thiện Core Web Vitals\n"
            + "C. Cả A và B\n"
            + "D. Ảnh hưởng tiêu cực",
            "Cách test lazy loading hoạt động?",
            "A. DevTools Network tab\n"
            + "B. Scroll trang và quan sát request\n"
            + "C. Cả A và B\n"
            + "D. Không thể test",
            "Native lazy loading hỗ trợ từ phiên bản nào?",
            "A. Chrome 76+\n"
            + "B. Firefox 75+\n"
            + "C. Edge 79+\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Bootstrap", new String[]{
            "Bootstrap là gì?",
            "A. CSS framework\n"
            + "B. Thư viện JavaScript\n"
            + "C. Cả A và B\n"
            + "D. Programming language",
            "Phiên bản mới nhất của Bootstrap?",
            "A. Bootstrap 4\n"
            + "B. Bootstrap 5\n"
            + "C. Bootstrap 6\n"
            + "D. Bootstrap 3",
            "Hệ thống lưới của Bootstrap chia màn hình thành bao nhiêu cột?",
            "A. 10\n"
            + "B. 12\n"
            + "C. 16\n"
            + "D. 24",
            "Lớp nào tạo button màu xanh trong Bootstrap?",
            "A. btn-primary\n"
            + "B. btn-blue\n"
            + "C. btn-success\n"
            + "D. btn-info",
            "Breakpoint mặc định của Bootstrap KHÔNG bao gồm?",
            "A. sm (576px)\n"
            + "B. md (768px)\n"
            + "C. lg (992px)\n"
            + "D. tv (1200px)",
            "Cách sử dụng Bootstrap chỉ với CSS?",
            "A. Link file bootstrap.min.css\n"
            + "B. Cài đặt qua npm\n"
            + "C. Import trong JavaScript\n"
            + "D. Không thể dùng riêng CSS",
            "Component nào KHÔNG có trong Bootstrap?",
            "A. Navbar\n"
            + "B. Modal\n"
            + "C. Accordion\n"
            + "D. Datepicker",
            "Lớp nào căn giữa theo chiều ngang trong Bootstrap?",
            "A. text-center\n"
            + "B. center-block\n"
            + "C. justify-center\n"
            + "D. align-middle",
            "Bootstrap 5 có gì mới so với Bootstrap 4?",
            "A. Bỏ jQuery\n"
            + "B. Thêm utility API\n"
            + "C. Cải tiến form controls\n"
            + "D. Tất cả các đáp án trên",
            "Cách tùy chỉnh theme Bootstrap?",
            "A. SASS variables\n"
            + "B. CSS custom properties\n"
            + "C. Build tool\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Tailwind CSS", new String[]{
            "Tailwind CSS là gì?",
            "A. Utility-first CSS framework\n"
            + "B. Component library\n"
            + "C. CSS preprocessor\n"
            + "D. JavaScript framework",
            "Điểm khác biệt chính của Tailwind so với Bootstrap?",
            "A. Không có component có sẵn\n"
            + "B. Dùng utility classes\n"
            + "C. Cả A và B\n"
            + "D. Không có khác biệt",
            "Lớp Tailwind nào đặt width 100%?",
            "A. w-full\n"
            + "B. w-100\n"
            + "C. width-full\n"
            + "D. w-max",
            "Cách tùy chỉnh màu sắc trong Tailwind?",
            "A. File tailwind.config.js\n"
            + "B. SASS variables\n"
            + "C. CSS custom properties\n"
            + "D. Tất cả đều sai",
            "PurgeCSS trong Tailwind dùng để làm gì?",
            "A. Loại bỏ CSS không dùng\n"
            + "B. Nén CSS\n"
            + "C. Tối ưu selector\n"
            + "D. Tất cả các đáp án trên",
            "Lớp nào tạo flex container trong Tailwind?",
            "A. flex\n"
            + "B. flexbox\n"
            + "C. display-flex\n"
            + "D. box-flex",
            "JIT (Just-in-Time) mode của Tailwind là gì?",
            "A. Tạo CSS khi cần\n"
            + "B. Giảm thời gian build\n"
            + "C. Cả A và B\n"
            + "D. Chế độ debug",
            "Cách tạo responsive design trong Tailwind?",
            "A. Thêm prefix (md:, lg:)\n"
            + "B. Dùng @apply trong CSS\n"
            + "C. Media queries thủ công\n"
            + "D. Không hỗ trợ responsive",
            "Ưu điểm chính của Tailwind?",
            "A. Tốc độ phát triển nhanh\n"
            + "B. Kích thước CSS nhỏ\n"
            + "C. Dễ tùy chỉnh\n"
            + "D. Tất cả các đáp án trên",
            "Cách tạo component trong Tailwind?",
            "A. @apply trong CSS\n"
            + "B. Kế thừa trong config\n"
            + "C. Tạo template HTML\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("ARIA Roles", new String[]{
            "ARIA là viết tắt của gì?",
            "A. Accessible Rich Internet Applications\n"
            + "B. Advanced Responsive Internet Attributes\n"
            + "C. Automated Responsive Interface Access\n"
            + "D. Applied Responsive Internet Applications",
            "Role nào dùng cho phần tử điều hướng chính?",
            "A. role=\"navigation\"\n"
            + "B. role=\"menu\"\n"
            + "C. role=\"main\"\n"
            + "D. role=\"header\"",
            "Khi nào nên sử dụng ARIA roles?",
            "A. Khi HTML semantic không đủ\n"
            + "B. Khi cần cải thiện accessibility\n"
            + "C. Khi làm component phức tạp\n"
            + "D. Tất cả các đáp án trên",
            "Role nào KHÔNG phải là landmark role?",
            "A. banner\n"
            + "B. main\n"
            + "C. button\n"
            + "D. search",
            "Thuộc tính ARIA nào chỉ định trạng thái hiện tại?",
            "A. aria-checked\n"
            + "B. aria-disabled\n"
            + "C. aria-selected\n"
            + "D. Tất cả các đáp án trên",
            "Role nào phù hợp cho popup modal?",
            "A. role=\"dialog\"\n"
            + "B. role=\"alert\"\n"
            + "C. role=\"tooltip\"\n"
            + "D. role=\"popup\"",
            "Có thể sử dụng nhiều role cho 1 phần tử không?",
            "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ với một số role cụ thể\n"
            + "D. Chỉ trên trình duyệt mới",
            "Role nào dùng cho phần tử chứa nội dung động?",
            "A. role=\"alert\"\n"
            + "B. role=\"status\"\n"
            + "C. Cả A và B\n"
            + "D. role=\"update\"",
            "Khi nào KHÔNG nên dùng ARIA?",
            "A. Khi HTML semantic đã đủ\n"
            + "B. Khi không hiểu rõ cách dùng\n"
            + "C. Cả A và B\n"
            + "D. Luôn luôn nên dùng ARIA",
            "Thuộc tính nào bắt buộc khi dùng role=\"button\"?",
            "A. tabindex=\"0\"\n"
            + "B. aria-pressed\n"
            + "C. aria-label\n"
            + "D. Không có bắt buộc"
        });
        TITLE_MAP.put("Keyboard Navigation", new String[]{
            "Tại sao keyboard navigation quan trọng?",
            "A. Hỗ trợ người dùng không dùng chuột\n"
            + "B. Yêu cầu accessibility\n"
            + "C. Cải thiện trải nghiệm người dùng\n"
            + "D. Tất cả các đáp án trên",
            "Phím nào thường dùng để điều hướng giữa các phần tử?",
            "A. Tab\n"
            + "B. Arrow keys\n"
            + "C. Cả A và B\n"
            + "D. Spacebar",
            "Thuộc tính nào kiểm soát thứ tự tab?",
            "A. tabindex\n"
            + "B. taborder\n"
            + "C. keyboard-nav\n"
            + "D. focus-order",
            "Giá trị tabindex=\"-1\" có ý nghĩa gì?",
            "A. Loại bỏ khỏi thứ tự tab\n"
            + "B. Vẫn focus được bằng JavaScript\n"
            + "C. Cả A và B\n"
            + "D. Focus đầu tiên",
            "Làm cách nào để bẫy focus trong modal?",
            "A. focus()/blur() bằng JavaScript\n"
            + "B. Thêm tabindex=\"-1\" cho background\n"
            + "C. Dùng aria-modal=\"true\"\n"
            + "D. Tất cả các đáp án trên",
            "Phần tử nào nên có tabindex=\"0\"?",
            "A. Các phần tử tương tác\n"
            + "B. Các phần tử có thể focus\n"
            + "C. Cả A và B\n"
            + "D. Tất cả các phần tử",
            "Khi nào nên dùng tabindex lớn hơn 0?",
            "A. Không nên dùng\n"
            + "B. Khi cần thay đổi thứ tự tab\n"
            + "C. Khi có nhiều form control\n"
            + "D. Khi làm single page app",
            "Làm cách nào style phần tử đang focus?",
            "A. :focus pseudo-class\n"
            + "B. :focus-visible\n"
            + "C. Cả A và B\n"
            + "D. [tabindex] selector",
            "Thẻ HTML nào mặc định có thể focus?",
            "A. <a>\n"
            + "B. <button>\n"
            + "C. <input>\n"
            + "D. Tất cả các đáp án trên",
            "Cách test keyboard navigation?",
            "A. Chỉ dùng tab/shift+tab\n"
            + "B. Kiểm tra tất cả phím tắt\n"
            + "C. Dùng trình đọc màn hình\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new String[]{
            "Lợi ích chính của dark mode?",
            "A. Giảm mỏi mắt\n"
            + "B. Tiết kiệm pin\n"
            + "C. Hỗ trợ người nhạy cảm ánh sáng\n"
            + "D. Tất cả các đáp án trên",
            "Media query nào phát hiện dark mode?",
            "A. @media (prefers-color-scheme: dark)\n"
            + "B. @media (dark-mode: enabled)\n"
            + "C. @media (color-scheme: dark)\n"
            + "D. @media (theme: dark)",
            "Thuộc tính CSS nào hỗ trợ dark mode tốt nhất?",
            "A. color-scheme\n"
            + "B. prefers-color-scheme\n"
            + "C. theme-color\n"
            + "D. dark-mode",
            "Màu nào nên tránh trong dark mode?",
            "A. Màu trắng sáng hoàn toàn (#fff)\n"
            + "B. Màu đen hoàn toàn (#000)\n"
            + "C. Cả A và B\n"
            + "D. Màu pastel",
            "Cách triển khai dark mode linh hoạt?",
            "A. CSS variables\n"
            + "B. SASS/LESS mixins\n"
            + "C. Theme classes\n"
            + "D. Tất cả các đáp án trên",
            "Độ tương phản tối thiểu WCAG khuyến nghị?",
            "A. 4.5:1\n"
            + "B. 3:1\n"
            + "C. 2:1\n"
            + "D. 5:1",
            "Làm cách nào để toggle dark mode bằng JavaScript?",
            "A. document.documentElement.classList.toggle('dark')\n"
            + "B. localStorage.setItem('theme', 'dark')\n"
            + "C. Cả A và B\n"
            + "D. Không thể thay đổi bằng JS",
            "Dark mode có ảnh hưởng đến ảnh/video không?",
            "A. Có, nên điều chỉnh opacity\n"
            + "B. Có, nên thêm filter\n"
            + "C. Không ảnh hưởng\n"
            + "D. Chỉ ảnh hưởng ảnh PNG",
            "Làm cách nào để test dark mode?",
            "A. DevTools Rendering panel\n"
            + "B. Hệ điều hành settings\n"
            + "C. Cả A và B\n"
            + "D. Không thể test",
            "Dark mode có bắt buộc cho accessibility không?",
            "A. Không, nhưng khuyến khích\n"
            + "B. Có, theo WCAG\n"
            + "C. Chỉ bắt buộc cho web app\n"
            + "D. Chỉ bắt buộc khi dùng video"
        });
        TITLE_MAP.put("Tạo hình ảnh bằng CSS", new String[]{
            "Kỹ thuật nào tạo hình tam giác bằng CSS?",
            "A. border trick\n"
            + "B. clip-path\n"
            + "C. SVG background\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào tạo hình tròn?",
            "A. border-radius: 50%\n"
            + "B. shape: circle\n"
            + "C. circle()\n"
            + "D. Tất cả đều đúng",
            "Cách tạo hình ảnh phức tạp nhất bằng CSS?",
            "A. Kết hợp multiple box-shadow\n"
            + "B. Dùng pseudo-elements\n"
            + "C. Sử dụng gradient\n"
            + "D. Tất cả các đáp án trên",
            "Ưu điểm của CSS art so với hình ảnh thông thường?",
            "A. Không cần request HTTP\n"
            + "B. Có thể animate dễ dàng\n"
            + "C. Responsive tự động\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào tạo hiệu ứng 3D bằng CSS?",
            "A. transform\n"
            + "B. perspective\n"
            + "C. Cả A và B\n"
            + "D. box-shadow",
            "Kỹ thuật nào KHÔNG dùng để tạo hình ảnh?",
            "A. background-color\n"
            + "B. font-icons\n"
            + "C. z-index\n"
            + "D. display: inline",
            "Pseudo-element nào có thể dùng cho CSS art?",
            "A. ::before\n"
            + "B. ::after\n"
            + "C. Cả A và B\n"
            + "D. ::first-letter",
            "Thuộc tính nào tạo pattern phức tạp?",
            "A. repeating-linear-gradient\n"
            + "B. background-blend-mode\n"
            + "C. Cả A và B\n"
            + "D. border-image",
            "Khi nào nên dùng CSS thay cho hình ảnh?",
            "A. Icon đơn giản\n"
            + "B. Hình học cơ bản\n"
            + "C. Hiệu ứng nhỏ\n"
            + "D. Tất cả các đáp án trên",
            "Nhược điểm chính của CSS art?",
            "A. Khó bảo trì\n"
            + "B. Hiệu suất kém với hình phức tạp\n"
            + "C. Không hỗ trợ trình duyệt cũ\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Tạo Animations (Hoạt ảnh) Phức Tạp", new String[]{
            "Thuộc tính CSS nào là cốt lõi để tạo animation?",
            "A. animation và @keyframes\n"
            + "B. transition\n"
            + "C. transform\n"
            + "D. Tất cả các đáp án trên",
            "Cú pháp đúng để khai báo animation?",
            "A. animation: name duration timing-function delay iteration-count direction;\n"
            + "B. animation-name: name; animation-duration: duration;\n"
            + "C. Cả A và B\n"
            + "D. @keyframes name { ... }",
            "Giá trị nào điều khiển số lần chạy animation?",
            "A. animation-iteration-count\n"
            + "B. animation-repeat\n"
            + "C. animation-count\n"
            + "D. animation-loop",
            "Làm cách nào để tạo animation mượt mà?",
            "A. Dùng hardware-accelerated properties\n"
            + "B. Sử dụng will-change\n"
            + "C. Tránh animating layout properties\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào KHÔNG nên animate để tránh repaint?",
            "A. opacity\n"
            + "B. width/height\n"
            + "C. transform\n"
            + "D. filter",
            "Cách nào tạm dừng animation?",
            "A. animation-play-state: paused\n"
            + "B. animation: none\n"
            + "C. Cả A và B\n"
            + "D. animation-pause: true",
            "Giá trị nào làm animation chạy ngược lại?",
            "A. animation-direction: reverse\n"
            + "B. animation-direction: alternate\n"
            + "C. Cả A và B\n"
            + "D. animation-reverse: true",
            "Làm cách nào kết hợp nhiều animation?",
            "A. Dùng dấu phẩy trong animation property\n"
            + "B. Nested @keyframes\n"
            + "C. Cả A và B\n"
            + "D. Không thể kết hợp",
            "Cách tối ưu performance cho animation?",
            "A. Dùng transform và opacity\n"
            + "B. Giảm số lượng keyframes\n"
            + "C. Tránh animating nhiều phần tử\n"
            + "D. Tất cả các đáp án trên",
            "Làm cách nào trigger animation bằng scroll?",
            "A. Intersection Observer API\n"
            + "B. Scroll event listener\n"
            + "C. CSS scroll-timeline\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("CSS Art", new String[]{
            "CSS Art là gì?",
            "A. Tạo hình ảnh bằng pure CSS\n"
            + "B. Nghệ thuật sắp đặt CSS\n"
            + "C. Cách viết CSS sáng tạo\n"
            + "D. Tất cả các đáp án trên",
            "Kỹ thuật nào thường dùng cho CSS Art?",
            "A. Box-shadow\n"
            + "B. Pseudo-elements\n"
            + "C. Gradients\n"
            + "D. Tất cả các đáp án trên",
            "Thuộc tính nào tạo hiệu ứng 3D trong CSS Art?",
            "A. transform-style: preserve-3d\n"
            + "B. perspective\n"
            + "C. Cả A và B\n"
            + "D. z-index",
            "Làm cách nào tạo hình phức tạp bằng CSS?",
            "A. Kết hợp nhiều phần tử\n"
            + "B. Dùng clip-path\n"
            + "C. Sử dụng SVG với CSS\n"
            + "D. Tất cả các đáp án trên",
            "Pseudo-element nào KHÔNG tồn tại?",
            "A. ::before\n"
            + "B. ::after\n"
            + "C. ::middle\n"
            + "D. ::first-letter",
            "Công cụ nào hỗ trợ tạo CSS Art?",
            "A. CSS Doodle\n"
            + "B. Sass/SCSS\n"
            + "C. Các generator online\n"
            + "D. Tất cả các đáp án trên",
            "Nhược điểm của CSS Art?",
            "A. Khó bảo trì\n"
            + "B. Hiệu suất kém\n"
            + "C. Không semantic\n"
            + "D. Tất cả các đáp án trên",
            "Làm cách nào tạo responsive CSS Art?",
            "A. Dùng đơn vị viewport (vw, vh)\n"
            + "B. Media queries\n"
            + "C. Cả A và B\n"
            + "D. Không thể responsive",
            "Kỹ thuật nào tạo hiệu ứng mờ trong CSS Art?",
            "A. filter: blur()\n"
            + "B. box-shadow với spread\n"
            + "C. opacity\n"
            + "D. Tất cả các đáp án trên",
            "CSS Art có ứng dụng thực tế nào?",
            "A. Loader/Spinner\n"
            + "B. Icon đơn giản\n"
            + "C. Hiệu ứng UI nhỏ\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Pure CSS Illustrations", new String[]{
            "Pure CSS Illustration là gì?",
            "A. Minh họa bằng CSS không dùng hình ảnh\n"
            + "B. Nghệ thuật CSS nâng cao\n"
            + "C. Cả A và B\n"
            + "D. Vẽ bằng CSS và JavaScript",
            "Kỹ thuật nào KHÔNG dùng trong Pure CSS Illustration?",
            "A. Canvas API\n"
            + "B. Box model\n"
            + "C. Pseudo-elements\n"
            + "D. Gradients",
            "Thuộc tính nào tạo đường cong mượt?",
            "A. border-radius\n"
            + "B. clip-path\n"
            + "C. Cả A và B\n"
            + "D. line-curve",
            "Làm cách nào tạo hình động (animated illustration)?",
            "A. Kết hợp @keyframes\n"
            + "B. Dùng CSS variables\n"
            + "C. JavaScript control\n"
            + "D. Tất cả các đáp án trên",
            "Đơn vị nào linh hoạt nhất cho CSS Illustration?",
            "A. em/rem\n"
            + "B. px\n"
            + "C. vw/vh\n"
            + "D. Tất cả đều có ưu điểm",
            "Cách nào tạo bóng đổ tự nhiên?",
            "A. Multiple box-shadows\n"
            + "B. filter: drop-shadow()\n"
            + "C. Cả A và B\n"
            + "D. text-shadow",
            "Làm cách nào giảm số lượng HTML element?",
            "A. Dùng pseudo-elements\n"
            + "B. Kết hợp multiple box-shadows\n"
            + "C. Sử dụng data-attributes\n"
            + "D. Tất cả các đáp án trên",
            "Cách tối ưu performance cho complex illustration?",
            "A. Giảm số lượng element\n"
            + "B. Hạn chế complex selectors\n"
            + "C. Sử dụng will-change\n"
            + "D. Tất cả các đáp án trên",
            "Pure CSS Illustration có ưu điểm gì so với SVG?",
            "A. Không cần file riêng\n"
            + "B. Có thể animate dễ dàng\n"
            + "C. Nhẹ hơn\n"
            + "D. Tất cả các đáp án trên",
            "Khi nào nên dùng SVG thay cho Pure CSS?",
            "A. Hình phức tạp\n"
            + "B. Cần chỉnh sửa dễ dàng\n"
            + "C. Cần hỗ trợ trình duyệt cũ\n"
            + "D. Tất cả các đáp án trên"
        });
        //Ứng Dụng & Dự Án Thực Tế
        TITLE_MAP.put("Một Blog cá nhân là gì?", new String[]{
            "Blog cá nhân là gì?",
            "A. Trang web chia sẻ quan điểm cá nhân\n"
            + "B. Nền tảng xuất bản nội dung định kỳ\n"
            + "C. Cả A và B\n"
            + "D. Chỉ là nhật ký trực tuyến",
            "Đặc điểm chính của blog cá nhân?",
            "A. Giọng văn chủ quan\n"
            + "B. Nội dung đa dạng\n"
            + "C. Cập nhật thường xuyên\n"
            + "D. Tất cả các đáp án trên",
            "Khác biệt giữa blog cá nhân và website công ty?",
            "A. Tính cá nhân hóa\n"
            + "B. Mục đích phi thương mại\n"
            + "C. Cấu trúc linh hoạt\n"
            + "D. Tất cả các đáp án trên",
            "Lợi ích chính của blog cá nhân?",
            "A. Xây dựng thương hiệu cá nhân\n"
            + "B. Chia sẻ kiến thức\n"
            + "C. Kết nối cộng đồng\n"
            + "D. Tất cả các đáp án trên",
            "Nền tảng nào phổ biến để tạo blog cá nhân?",
            "A. WordPress\n"
            + "B. Blogger\n"
            + "C. Wix\n"
            + "D. Tất cả các đáp án trên",
            "Tần suất đăng bài lý tưởng cho blog cá nhân?",
            "A. 1-2 bài/tuần\n"
            + "B. 1 bài/tháng\n"
            + "C. Tùy khả năng và chất lượng\n"
            + "D. Mỗi ngày 1 bài",
            "Yếu tố quan trọng nhất trong blog cá nhân?",
            "A. Tính chân thực\n"
            + "B. Hình ảnh đẹp\n"
            + "C. SEO tốt\n"
            + "D. Quảng cáo nhiều",
            "Có nên kiếm tiền từ blog cá nhân không?",
            "A. Có, nhưng không ảnh hưởng chất lượng\n"
            + "B. Không nên\n"
            + "C. Chỉ khi có nhiều lượt xem\n"
            + "D. Tùy mục đích ban đầu",
            "Cách xây dựng phong cách riêng cho blog?",
            "A. Giọng văn độc đáo\n"
            + "B. Thiết kế đặc trưng\n"
            + "C. Chủ đề tập trung\n"
            + "D. Tất cả các đáp án trên",
            "Blog cá nhân khác gì với mạng xã hội?",
            "A. Kiểm soát nội dung tốt hơn\n"
            + "B. Thể hiện chiều sâu nội dung\n"
            + "C. Xây dựng thương hiệu lâu dài\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của blog cá nhân", new String[]{
            "Yếu tố quan trọng nhất về nội dung blog?",
            "A. Chất lượng bài viết\n"
            + "B. Tính chân thực\n"
            + "C. Giá trị với độc giả\n"
            + "D. Tất cả các đáp án trên",
            "Thiết kế blog cá nhân cần chú ý gì?",
            "A. Đơn giản, dễ đọc\n"
            + "B. Phản ánh cá tính\n"
            + "C. Responsive\n"
            + "D. Tất cả các đáp án trên",
            "Tại sao cần có trang 'Giới thiệu'?",
            "A. Xây dựng kết nối với độc giả\n"
            + "B. Giới thiệu bản thân\n"
            + "C. Tăng độ tin cậy\n"
            + "D. Tất cả các đáp án trên",
            "Chức năng nào không thể thiếu?",
            "A. Tìm kiếm\n"
            + "B. Phân loại chuyên mục\n"
            + "C. Đăng ký nhận bài mới\n"
            + "D. Tất cả các đáp án trên",
            "Cách tốt nhất để xây dựng cộng đồng?",
            "A. Bình luận tương tác\n"
            + "B. Mạng xã hội đi kèm\n"
            + "C. Newsletter\n"
            + "D. Tất cả các đáp án trên",
            "Tần suất đăng bài lý tưởng là?",
            "A. 1-2 bài/tuần\n"
            + "B. Đều đặn theo lịch\n"
            + "C. Tùy chất lượng\n"
            + "D. Cả A và B",
            "SEO quan trọng thế nào với blog?",
            "A. Giúp độc giả tìm thấy blog\n"
            + "B. Không quan trọng bằng nội dung\n"
            + "C. Chỉ cần thiết khi kiếm tiền\n"
            + "D. Quan trọng nhất",
            "Cách thể hiện cá tính trong blog?",
            "A. Giọng văn riêng\n"
            + "B. Hình ảnh cá nhân\n"
            + "C. Câu chuyện cá nhân\n"
            + "D. Tất cả các đáp án trên",
            "Yếu tố nào giữ chân độc giả?",
            "A. Nội dung chất lượng\n"
            + "B. Giao diện thân thiện\n"
            + "C. Tương tác tốt\n"
            + "D. Tất cả các đáp án trên",
            "Có nên chuyên môn hóa blog?",
            "A. Có, để xây dựng thương hiệu\n"
            + "B. Không, nên đa dạng\n"
            + "C. Tùy mục tiêu cá nhân\n"
            + "D. Cả A và C"
        });
        TITLE_MAP.put("Landing page sản phẩm là gì?", new String[]{
            "Landing page là gì?",
            "A. Trang đích cho chiến dịch marketing\n"
            + "B. Trang giới thiệu sản phẩm\n"
            + "C. Cả A và B\n"
            + "D. Trang chủ website",
            "Mục đích chính của landing page?",
            "A. Chuyển đổi khách hàng\n"
            + "B. Giới thiệu công ty\n"
            + "C. Hiển thị nhiều sản phẩm\n"
            + "D. Tất cả các đáp án trên",
            "Khác biệt giữa landing page và website?",
            "A. Tập trung vào 1 mục tiêu\n"
            + "B. Ít navigation\n"
            + "C. Có CTA rõ ràng\n"
            + "D. Tất cả các đáp án trên",
            "Landing page hiệu quả cần gì?",
            "A. Tiêu đề hấp dẫn\n"
            + "B. Thiết kế tập trung\n"
            + "C. Form đăng ký đơn giản\n"
            + "D. Tất cả các đáp án trên",
            "Loại landing page phổ biến nhất?",
            "A. Lead generation\n"
            + "B. Click-through\n"
            + "C. Sales\n"
            + "D. Tất cả các đáp án trên",
            "Yếu tố quan trọng nhất trên landing page?",
            "A. Call-to-action rõ ràng\n"
            + "B. Social proof\n"
            + "C. Thiết kế đẹp\n"
            + "D. Nội dung dài",
            "Tại sao cần A/B testing landing page?",
            "A. Tối ưu tỷ lệ chuyển đổi\n"
            + "B. Hiểu hành vi khách hàng\n"
            + "C. Cả A và B\n"
            + "D. Không cần thiết",
            "Thời gian tải trang lý tưởng?",
            "A. Dưới 3 giây\n"
            + "B. Dưới 1 giây\n"
            + "C. Dưới 5 giây\n"
            + "D. Không quan trọng",
            "Có nên đặt nhiều CTA trên landing page?",
            "A. Không, chỉ 1 CTA chính\n"
            + "B. Có, nhiều CTA khác nhau\n"
            + "C. Tùy loại landing page\n"
            + "D. Cả A và C",
            "Công cụ nào hỗ trợ tạo landing page?",
            "A. Unbounce\n"
            + "B. Leadpages\n"
            + "C. Instapage\n"
            + "D. Tất cả các đáp án trên"
        });
        TITLE_MAP.put("Các yếu tố quan trọng của landing page sản phẩm", new String[]{
            "Yếu tố quan trọng nhất trên landing page?",
            "A. Tiêu đề hấp dẫn\n"
            + "B. Call-to-action rõ ràng\n"
            + "C. Social proof\n"
            + "D. Tất cả đều quan trọng",
            "CTA hiệu quả cần có gì?",
            "A. Văn bản hành động\n"
            + "B. Màu sắc nổi bật\n"
            + "C. Vị trí dễ thấy\n"
            + "D. Tất cả các đáp án trên",
            "Loại social proof hiệu quả nhất?",
            "A. Đánh giá khách hàng\n"
            + "B. Số lượng người dùng\n"
            + "C. Logo khách hàng\n"
            + "D. Tất cả các đáp án trên",
            "Cách trình bày lợi ích sản phẩm tốt nhất?",
            "A. Bullet points ngắn gọn\n"
            + "B. Video demo\n"
            + "C. Hình ảnh minh họa\n"
            + "D. Tất cả các đáp án trên",
            "Form đăng ký nên có bao nhiêu field?",
            "A. Càng ít càng tốt\n"
            + "B. 3-5 field\n"
            + "C. Tùy giá trị cung cấp\n"
            + "D. Cả A và C",
            "Màu sắc CTA nên như thế nào?",
            "A. Tương phản với nền\n"
            + "B. Phù hợp thương hiệu\n"
            + "C. Đã được A/B test\n"
            + "D. Tất cả các đáp án trên",
            "Tại sao cần mobile optimized?",
            "A. Đa số truy cập từ mobile\n"
            + "B. Ảnh hưởng đến ranking\n"
            + "C. Cả A và B\n"
            + "D. Google yêu cầu",
            "Yếu tố nào tăng độ tin cậy?",
            "A. Chứng chỉ bảo mật\n"
            + "B. Đảm bảo hoàn tiền\n"
            + "C. Thông tin liên hệ\n"
            + "D. Tất cả các đáp án trên",
            "Cách giảm tỷ lệ thoát trang?",
            "A. Nội dung phù hợp quảng cáo\n"
            + "B. Tải trang nhanh\n"
            + "C. Thiết kế hấp dẫn\n"
            + "D. Tất cả các đáp án trên",
            "Số lượng hình ảnh nên dùng?",
            "A. 1-3 hình chất lượng\n"
            + "B. Càng nhiều càng tốt\n"
            + "C. Không dùng hình ảnh\n"
            + "D. Tùy loại sản phẩm"
        });
        TITLE_MAP.put("Web bán hàng cơ bản là gì?", new String[]{
            "Web bán hàng cơ bản là gì?",
            "A. Một trang web giới thiệu công ty.\n"
            + "B. Một trang web cho phép mua bán sản phẩm trực tuyến.\n"
            + "C. Một blog cá nhân.\n"
            + "D. Một mạng xã hội.",
            "Web bán hàng cần yếu tố nào sau đây?",
            "A. Giỏ hàng.\n"
            + "B. Trang liên hệ.\n"
            + "C. Portfolio.\n"
            + "D. Forum.",
            "Tính năng nào giúp khách hàng thanh toán trực tuyến?",
            "A. Payment gateway.\n"
            + "B. Live chat.\n"
            + "C. Blog.\n"
            + "D. FAQ.",
            "Web bán hàng cơ bản thường không cần gì?",
            "A. Giỏ hàng.\n"
            + "B. Trang sản phẩm.\n"
            + "C. Trang tin tức cá nhân.\n"
            + "D. Trang thanh toán.",
            "Giao diện web bán hàng cần đảm bảo điều gì?",
            "A. Tốc độ tải nhanh.\n"
            + "B. Hiệu ứng nhiều.\n"
            + "C. Chèn nhiều video nền.\n"
            + "D. Popup liên tục.",
            "Tính năng tìm kiếm sản phẩm quan trọng vì?",
            "A. Giúp khách hàng tìm sản phẩm nhanh.\n"
            + "B. Làm đẹp giao diện.\n"
            + "C. Giảm giá hosting.\n"
            + "D. Tăng bảo mật.",
            "Điều nào dưới đây giúp tăng trải nghiệm mua sắm?",
            "A. Giao diện thân thiện mobile.\n"
            + "B. Popup quảng cáo nhiều.\n"
            + "C. Tải trang chậm.\n"
            + "D. Nhiều link out.",
            "Trang web cần có gì để người mua liên hệ nhanh chóng?",
            "A. Form liên hệ.\n"
            + "B. Ảnh nền đẹp.\n"
            + "C. Menu đa cấp sâu.\n"
            + "D. Bài viết blog.",
            "Hệ thống quản lý đơn hàng giúp gì cho chủ web?",
            "A. Quản lý giao dịch dễ dàng.\n"
            + "B. Tăng tốc website.\n"
            + "C. Tăng lượng bài viết.\n"
            + "D. Giảm dung lượng ảnh.",
            "Một web bán hàng cơ bản nên có bao nhiêu bước để hoàn tất đơn hàng?",
            "A. Càng ít càng tốt.\n"
            + "B. Càng nhiều càng tốt.\n"
            + "C. Ít nhất 10 bước.\n"
            + "D. Không giới hạn."
        });

        TITLE_MAP.put("Các yếu tố quan trọng của web bán hàng cơ bản", new String[]{
            "Yếu tố nào dưới đây là bắt buộc cho web bán hàng?",
            "A. Trang sản phẩm.\n"
            + "B. Bài viết blog.\n"
            + "C. Trang tuyển dụng.\n"
            + "D. Thư viện ảnh.",
            "Hệ thống lọc sản phẩm giúp gì?",
            "A. Giúp khách tìm sản phẩm nhanh hơn.\n"
            + "B. Làm chậm web.\n"
            + "C. Giảm số lượng sản phẩm.\n"
            + "D. Thêm nhiều quảng cáo.",
            "Tại sao giao diện thân thiện mobile lại quan trọng?",
            "A. Vì đa số người dùng duyệt web bằng điện thoại.\n"
            + "B. Để tăng chi phí hosting.\n"
            + "C. Để dễ dàng spam quảng cáo.\n"
            + "D. Để giới thiệu blog cá nhân.",
            "Chức năng giỏ hàng cho phép người dùng làm gì?",
            "A. Lưu sản phẩm muốn mua.\n"
            + "B. Đăng tin rao vặt.\n"
            + "C. Tải ảnh lên.\n"
            + "D. Tham gia diễn đàn.",
            "Công cụ nào giúp khách hàng thanh toán dễ dàng?",
            "A. Cổng thanh toán điện tử.\n"
            + "B. Hệ thống bình luận.\n"
            + "C. Hệ thống chat nội bộ.\n"
            + "D. Trình phát nhạc.",
            "Lý do cần có đánh giá sản phẩm?",
            "A. Tăng độ tin cậy.\n"
            + "B. Tăng thời gian tải trang.\n"
            + "C. Giảm lượt mua.\n"
            + "D. Tăng dung lượng web.",
            "Tại sao cần tối ưu SEO cho web bán hàng?",
            "A. Tăng cơ hội tìm thấy qua Google.\n"
            + "B. Để có nhiều popup.\n"
            + "C. Để tăng chi phí server.\n"
            + "D. Để giảm tốc độ tải.",
            "Yếu tố nào dưới đây giúp tăng độ uy tín của web?",
            "A. Chứng chỉ SSL (https).\n"
            + "B. Popup quảng cáo.\n"
            + "C. Giao diện sặc sỡ.\n"
            + "D. Tải file exe.",
            "Lý do web cần có bộ lọc sản phẩm theo giá?",
            "A. Giúp người dùng tìm sản phẩm phù hợp ngân sách.\n"
            + "B. Làm đẹp trang chủ.\n"
            + "C. Làm tăng dung lượng web.\n"
            + "D. Tăng thời gian tải.",
            "Giao diện giỏ hàng cần đảm bảo điều gì?",
            "A. Dễ xem và chỉnh sửa.\n"
            + "B. Khó tìm kiếm.\n"
            + "C. Nhiều quảng cáo.\n"
            + "D. Tải file exe."
        });
        TITLE_MAP.put("Hiệu ứng scroll", new String[]{
            "Hiệu ứng scroll là gì?\n",
            "A. Hiệu ứng khi trang được cuộn.\n"
            + "B. Hiệu ứng khi bấm nút.\n"
            + "C. Hiệu ứng khi hover.\n"
            + "D. Hiệu ứng khi load trang.",
            "Scroll event trong JavaScript lắng nghe gì?\n",
            "A. Khi người dùng cuộn trang.\n"
            + "B. Khi người dùng click.\n"
            + "C. Khi người dùng nhập form.\n"
            + "D. Khi tải xong trang.",
            "Thư viện hỗ trợ scroll animation phổ biến?\n",
            "A. AOS.\n"
            + "B. Bootstrap.\n"
            + "C. jQuery UI.\n"
            + "D. Vue.js.",
            "Thao tác nào KHÔNG kích hoạt hiệu ứng scroll?\n",
            "A. Kéo chuột xuống.\n"
            + "B. Dùng nút spacebar.\n"
            + "C. Refresh trang.\n"
            + "D. Sử dụng thanh cuộn.",
            "Intersection Observer API dùng để làm gì?\n",
            "A. Theo dõi phần tử xuất hiện khi cuộn.\n"
            + "B. Tạo hiệu ứng hover.\n"
            + "C. Kiểm soát request API.\n"
            + "D. Tăng tốc độ website.",
            "Scroll hiệu quả cần lưu ý gì?\n",
            "A. Giảm số lượng DOM event.\n"
            + "B. Thêm nhiều event listener.\n"
            + "C. Load tất cả ảnh ngay lập tức.\n"
            + "D. Scroll không cần tối ưu.",
            "Scroll throttling có tác dụng gì?\n",
            "A. Giảm tần suất xử lý event.\n"
            + "B. Tăng tốc độ render.\n"
            + "C. Tạo nhiều scroll event hơn.\n"
            + "D. Ngăn chặn scroll.",
            "Lazy loading ảnh liên quan gì đến scroll?\n",
            "A. Tải ảnh khi gần đến viewport.\n"
            + "B. Tải tất cả ảnh ngay từ đầu.\n"
            + "C. Không liên quan.\n"
            + "D. Chặn ảnh tải về.",
            "Scroll snapping có chức năng gì?\n",
            "A. Cố định vị trí khi scroll.\n"
            + "B. Tự động scroll xuống cuối trang.\n"
            + "C. Bật tắt scroll.\n"
            + "D. Xóa hiệu ứng scroll.",
            "Hiệu ứng scroll nên sử dụng thế nào cho trải nghiệm người dùng?\n",
            "A. Vừa phải, hợp lý.\n"
            + "B. Càng nhiều càng tốt.\n"
            + "C. Chỉ dùng ở trang chủ.\n"
            + "D. Không cần hiệu ứng scroll."
        });
        TITLE_MAP.put("Parallax", new String[]{
            "Hiệu ứng parallax là gì?\n",
            "A. Nền và nội dung cuộn với tốc độ khác nhau.\n"
            + "B. Nội dung cố định khi cuộn.\n"
            + "C. Ảnh nền thay đổi màu.\n"
            + "D. Scroll ngang trang web.",
            "Parallax tạo cảm giác gì?\n",
            "A. Chiều sâu cho trang web.\n"
            + "B. Tăng độ sáng trang.\n"
            + "C. Làm trang nặng hơn.\n"
            + "D. Làm mất hiệu ứng shadow.",
            "Parallax phù hợp dùng ở đâu?\n",
            "A. Trang landing page.\n"
            + "B. Trang login.\n"
            + "C. Trang 404.\n"
            + "D. Trang contact.",
            "Kỹ thuật nào đơn giản nhất để tạo parallax?\n",
            "A. Background-attachment: fixed.\n"
            + "B. Transform: scale.\n"
            + "C. Opacity.\n"
            + "D. Animation keyframes.",
            "Điều cần lưu ý khi dùng parallax?\n",
            "A. Tối ưu hiệu suất.\n"
            + "B. Càng nhiều lớp càng tốt.\n"
            + "C. Chỉ dùng cho mobile.\n"
            + "D. Ẩn toàn bộ nội dung khác.",
            "Parallax ảnh hưởng hiệu suất ra sao?\n",
            "A. Nếu không tối ưu sẽ làm trang lag.\n"
            + "B. Luôn làm trang nhanh hơn.\n"
            + "C. Không ảnh hưởng.\n"
            + "D. Giúp tăng bộ nhớ RAM.",
            "Một thư viện hỗ trợ parallax nổi tiếng là gì?\n",
            "A. Rellax.js.\n"
            + "B. React.js.\n"
            + "C. jQuery.\n"
            + "D. Sass.",
            "Tốc độ nền trong parallax nên như thế nào?\n",
            "A. Chậm hơn nội dung.\n"
            + "B. Nhanh hơn nội dung.\n"
            + "C. Bằng tốc độ nội dung.\n"
            + "D. Không di chuyển.",
            "Parallax scrolling là kỹ thuật của?\n",
            "A. Front-end.\n"
            + "B. Back-end.\n"
            + "C. DevOps.\n"
            + "D. Database.",
            "Parallax KHÔNG nên sử dụng khi nào?\n",
            "A. Trên thiết bị di động yếu.\n"
            + "B. Trên màn hình lớn.\n"
            + "C. Ở phần header.\n"
            + "D. Trên trang giới thiệu sản phẩm."
        });
        TITLE_MAP.put("Ứng dụng trong thiết kế", new String[]{
            "Ứng dụng trong thiết kế web là gì?\n",
            "A. Áp dụng các kỹ thuật vào thực tế.\n"
            + "B. Chỉ thiết kế file ảnh.\n"
            + "C. Vẽ tay wireframe.\n"
            + "D. Tạo database.",
            "Thiết kế responsive nghĩa là gì?\n",
            "A. Tương thích nhiều kích thước màn hình.\n"
            + "B. Chỉ dùng trên desktop.\n"
            + "C. Chỉ thiết kế giao diện.\n"
            + "D. Không cần quan tâm kích thước.",
            "Wireframe là gì trong thiết kế web?\n",
            "A. Bản phác thảo giao diện.\n"
            + "B. Hình ảnh cuối cùng.\n"
            + "C. Cấu trúc server.\n"
            + "D. Bảng CSS.",
            "Nguyên tắc thiết kế UX cơ bản?\n",
            "A. Dễ sử dụng, trực quan.\n"
            + "B. Càng phức tạp càng tốt.\n"
            + "C. Màu sắc sặc sỡ.\n"
            + "D. Chỉ cần đẹp mắt.",
            "Hệ thống lưới (grid system) giúp gì?\n",
            "A. Căn chỉnh bố cục hợp lý.\n"
            + "B. Làm trang web nặng hơn.\n"
            + "C. Tăng số lượng ảnh nền.\n"
            + "D. Chạy nhanh hơn server.",
            "Mục tiêu chính của thiết kế UI là gì?\n",
            "A. Tạo trải nghiệm đẹp và dễ dùng.\n"
            + "B. Tạo hiệu ứng đẹp.\n"
            + "C. Tối ưu server.\n"
            + "D. Thêm nhiều tính năng.",
            "Prototype trong thiết kế web là gì?\n",
            "A. Bản mẫu tương tác.\n"
            + "B. Mã backend.\n"
            + "C. API server.\n"
            + "D. Database schema.",
            "Công cụ nào hỗ trợ thiết kế UI phổ biến?\n",
            "A. Figma.\n"
            + "B. Word.\n"
            + "C. Excel.\n"
            + "D. Outlook.",
            "Thiết kế web cần đảm bảo tính?\n",
            "A. Dễ truy cập (accessibility).\n"
            + "B. Nhiều hiệu ứng.\n"
            + "C. Quá tải thông tin.\n"
            + "D. Nhiều hình ảnh động.",
            "Một ưu điểm của thiết kế minimalistic là?\n",
            "A. Tập trung vào nội dung.\n"
            + "B. Thêm nhiều chi tiết.\n"
            + "C. Tối ưu SEO.\n"
            + "D. Nặng hơn trang web."
        });
        TITLE_MAP.put("Dark Mode (chế độ tối) là gì?", new String[]{
            "Dark Mode là gì?\n",
            "A. Giao diện nền tối.\n"
            + "B. Giao diện sáng.\n"
            + "C. Tối ưu SEO.\n"
            + "D. Tăng kích thước font.",
            "Mục đích chính của Dark Mode?\n",
            "A. Giảm mỏi mắt trong môi trường thiếu sáng.\n"
            + "B. Tăng sáng màn hình.\n"
            + "C. Giảm tốc độ website.\n"
            + "D. Giảm độ phân giải.",
            "Dark Mode tiết kiệm pin trên thiết bị nào?\n",
            "A. Thiết bị dùng màn AMOLED.\n"
            + "B. Laptop gaming.\n"
            + "C. Máy in.\n"
            + "D. Server room.",
            "Một đặc điểm của Dark Mode?\n",
            "A. Nền tối, chữ sáng.\n"
            + "B. Nền sáng, chữ tối.\n"
            + "C. Tăng số lượng ảnh.\n"
            + "D. Không đổi gì cả.",
            "Dark Mode phù hợp nhất khi nào?\n",
            "A. Ban đêm.\n"
            + "B. Ban ngày.\n"
            + "C. Ngoài trời nắng.\n"
            + "D. Trên máy in.",
            "Thiết kế Dark Mode cần lưu ý gì?\n",
            "A. Đảm bảo độ tương phản tốt.\n"
            + "B. Tối ưu tốc độ tải trang.\n"
            + "C. Chèn nhiều hình ảnh.\n"
            + "D. Tăng kích thước server.",
            "Cách nào thường dùng để kích hoạt Dark Mode?\n",
            "A. Toggle switch.\n"
            + "B. Hover chuột.\n"
            + "C. Double click.\n"
            + "D. Scroll chuột.",
            "CSS thuộc tính hỗ trợ Dark Mode tự động?\n",
            "A. @media (prefers-color-scheme).\n"
            + "B. @import.\n"
            + "C. @keyframes.\n"
            + "D. @font-face.",
            "Dark Mode có ảnh hưởng SEO không?\n",
            "A. Không ảnh hưởng nhiều.\n"
            + "B. Tăng đáng kể SEO.\n"
            + "C. Làm giảm thứ hạng SEO.\n"
            + "D. Bị Google cấm.",
            "Nội dung trong Dark Mode cần?\n",
            "A. Rõ ràng, dễ đọc.\n"
            + "B. Phức tạp hơn.\n"
            + "C. Ẩn một phần chữ.\n"
            + "D. Tăng độ bóng vật thể."
        });
        TITLE_MAP.put("Các yếu tố quan trọng của Dark Mode", new String[]{
            "Yếu tố cần thiết cho Dark Mode tốt?\n",
            "A. Độ tương phản hợp lý.\n"
            + "B. Nền đen tuyệt đối.\n"
            + "C. Phông nền nhiều chi tiết.\n"
            + "D. Chữ màu neon.",
            "Màu nền nên chọn cho Dark Mode?\n",
            "A. Màu xám đậm.\n"
            + "B. Màu trắng.\n"
            + "C. Màu đỏ.\n"
            + "D. Màu vàng sáng.",
            "Màu chữ phù hợp với nền tối?\n",
            "A. Màu sáng, nhẹ nhàng.\n"
            + "B. Màu đen đậm.\n"
            + "C. Màu đỏ tươi.\n"
            + "D. Màu xanh lá cây sáng.",
            "Để tránh gây khó chịu khi dùng Dark Mode?\n",
            "A. Không dùng màu sắc quá chói.\n"
            + "B. Chèn nhiều animation.\n"
            + "C. Thêm nhạc nền.\n"
            + "D. Tăng độ tương phản tối đa.",
            "Dark Mode cần hỗ trợ accessibility thế nào?\n",
            "A. Text lớn dễ đọc.\n"
            + "B. Text nhỏ, mờ.\n"
            + "C. Ẩn bớt nội dung.\n"
            + "D. Không cần hỗ trợ.",
            "Yếu tố UX cần chú ý trong Dark Mode?\n",
            "A. Dễ nhìn, dễ thao tác.\n"
            + "B. Chỉ cần đẹp mắt.\n"
            + "C. Làm phức tạp giao diện.\n"
            + "D. Tăng thời gian tải.",
            "Background image trong Dark Mode nên thế nào?\n",
            "A. Giản lược, tránh rối.\n"
            + "B. Càng nhiều chi tiết càng tốt.\n"
            + "C. Thêm nhiều màu sáng.\n"
            + "D. Xóa hết background.",
            "Dark Mode hiệu quả khi kết hợp với?\n",
            "A. Các điểm nhấn sáng nhẹ.\n"
            + "B. Các màu neon chói.\n"
            + "C. Nền gradient rực rỡ.\n"
            + "D. Phông chữ đậm.",
            "Việc chuyển đổi giữa Dark và Light Mode cần?\n",
            "A. Mượt mà, tự nhiên.\n"
            + "B. Hiệu ứng giật mạnh.\n"
            + "C. Ẩn hẳn nội dung.\n"
            + "D. Thay đổi server.",
            "Dark Mode giúp cải thiện điều gì?\n",
            "A. Trải nghiệm người dùng trong môi trường tối.\n"
            + "B. Tăng tốc độ CPU.\n"
            + "C. Thay đổi giao diện máy chủ.\n"
            + "D. Giảm hiệu suất web."
        });
        TITLE_MAP.put("Cách thức triển khai Dark Mode", new String[]{
            "Cách cơ bản nhất để tạo Dark Mode trên web?\n",
            "A. Dùng CSS class thêm nền tối, chữ sáng.\n"
            + "B. Thay đổi server location.\n"
            + "C. Thêm nhiều ảnh động.\n"
            + "D. Dùng nhiều plugin nặng.",
            "Để tự động phát hiện Dark Mode hệ điều hành, dùng?\n",
            "A. @media (prefers-color-scheme).\n"
            + "B. @font-face.\n"
            + "C. @keyframes.\n"
            + "D. @import.",
            "Người dùng nên có quyền?\n",
            "A. Chuyển đổi giữa Light và Dark Mode.\n"
            + "B. Không thay đổi được.\n"
            + "C. Tắt toàn bộ giao diện.\n"
            + "D. Tạo Dark Mode riêng.",
            "Toggle chuyển đổi Dark Mode thường được đặt ở đâu?\n",
            "A. Header hoặc menu chính.\n"
            + "B. Footer cuối cùng.\n"
            + "C. Trang lỗi.\n"
            + "D. Ẩn sâu trong cài đặt.",
            "JavaScript có thể dùng để?\n",
            "A. Lưu trạng thái Dark Mode.\n"
            + "B. Xóa toàn bộ CSS.\n"
            + "C. Tăng dung lượng ảnh.\n"
            + "D. Ẩn hết nội dung web.",
            "LocalStorage dùng để?\n",
            "A. Lưu lựa chọn Dark Mode của người dùng.\n"
            + "B. Tạo server mới.\n"
            + "C. Kết nối API.\n"
            + "D. Nén hình ảnh.",
            "Framework nào hỗ trợ sẵn Dark Mode?\n",
            "A. Tailwind CSS.\n"
            + "B. Excel.\n"
            + "C. WordPress không cần plugin.\n"
            + "D. Adobe Illustrator.",
            "Vì sao nên tối ưu ảnh nền cho Dark Mode?\n",
            "A. Tránh chói mắt, nhẹ tải trang.\n"
            + "B. Tăng độ sáng tối đa.\n"
            + "C. Thêm nhiều màu neon.\n"
            + "D. Chạy animation liên tục.",
            "Thuộc tính CSS nào có thể điều chỉnh theme theo Dark/Light?\n",
            "A. Variables (biến CSS).\n"
            + "B. Position.\n"
            + "C. Z-index.\n"
            + "D. Overflow.",
            "Điều quan trọng khi thiết kế Dark Mode?\n",
            "A. Cân bằng trải nghiệm giữa hai chế độ.\n"
            + "B. Chỉ tập trung vào Dark Mode.\n"
            + "C. Chỉ đẹp ở chế độ sáng.\n"
            + "D. Không cần kiểm tra trải nghiệm."
        });
        TITLE_MAP.put("Animation nâng cao là gì?", new String[]{
            "Animation nâng cao là gì?\n",
            "A. Kỹ thuật tạo chuyển động mượt và phức tạp.\n"
            + "B. Chỉ thêm hiệu ứng hover đơn giản.\n"
            + "C. Tăng kích thước ảnh.\n"
            + "D. Tạo slideshow tự động.",
            "Animation nâng cao thường dùng cho?\n",
            "A. Trải nghiệm người dùng (UX).\n"
            + "B. Lưu trữ dữ liệu.\n"
            + "C. Viết server.\n"
            + "D. Phân tích dữ liệu.",
            "Công cụ nào hỗ trợ tạo animation nâng cao?\n",
            "A. GSAP.\n"
            + "B. PHP.\n"
            + "C. SQL.\n"
            + "D. Python.",
            "Thuộc tính CSS nào điều chỉnh tốc độ animation?\n",
            "A. animation-duration.\n"
            + "B. font-size.\n"
            + "C. z-index.\n"
            + "D. padding.",
            "Animation nâng cao thường được kết hợp với?\n",
            "A. Scroll, click, hover.\n"
            + "B. Tạo bảng tính.\n"
            + "C. Viết blog.\n"
            + "D. Backup dữ liệu.",
            "Để tối ưu performance animation cần?\n",
            "A. Sử dụng transform và opacity.\n"
            + "B. Resize liên tục.\n"
            + "C. Load lại trang mỗi frame.\n"
            + "D. Dùng ảnh động GIF nặng.",
            "Chuyển động tự nhiên cần chú ý?\n",
            "A. Timing function (ease-in-out).\n"
            + "B. Border-radius.\n"
            + "C. Text-align.\n"
            + "D. Z-index.",
            "JavaScript animation khác CSS animation ở điểm nào?\n",
            "A. Linh hoạt hơn, nhiều tương tác hơn.\n"
            + "B. Giảm tốc độ tải trang.\n"
            + "C. Ít hiệu ứng hơn.\n"
            + "D. Chỉ dùng cho server.",
            "Library animation nào phổ biến?\n",
            "A. Anime.js.\n"
            + "B. MySQL.\n"
            + "C. WordPress.\n"
            + "D. Figma.",
            "Animation nâng cao cần đảm bảo?\n",
            "A. Mượt, tối ưu, tự nhiên.\n"
            + "B. Càng phức tạp càng tốt.\n"
            + "C. Màu mè nhiều nhất.\n"
            + "D. Nặng càng hay."
        });
        TITLE_MAP.put("Các yếu tố quan trọng của animation nâng cao", new String[]{
            "Yếu tố quan trọng đầu tiên của animation nâng cao?\n",
            "A. Mượt mà.\n"
            + "B. Màu sắc ngẫu nhiên.\n"
            + "C. Kích thước lớn.\n"
            + "D. Load chậm.",
            "Timing function giúp animation?\n",
            "A. Chuyển động tự nhiên.\n"
            + "B. Tăng kích thước font.\n"
            + "C. Tạo border mới.\n"
            + "D. Xoá phần tử.",
            "Thời lượng animation nên?\n",
            "A. Vừa phải, không quá nhanh hay chậm.\n"
            + "B. Càng dài càng tốt.\n"
            + "C. Càng ngắn càng tốt.\n"
            + "D. Không cần quan tâm.",
            "Thao tác nào ảnh hưởng tới animation nhất?\n",
            "A. Scroll.\n"
            + "B. Đổi màu chữ.\n"
            + "C. Upload file.\n"
            + "D. Chỉnh sửa cơ sở dữ liệu.",
            "Performance của animation ảnh hưởng đến?\n",
            "A. Trải nghiệm người dùng.\n"
            + "B. Server response time.\n"
            + "C. SEO website.\n"
            + "D. Ảnh nền.",
            "Hiệu ứng easing phổ biến là?\n",
            "A. ease-in-out.\n"
            + "B. border-ease.\n"
            + "C. text-in.\n"
            + "D. color-out.",
            "Thuật ngữ 'Stagger' trong animation là?\n",
            "A. Delay giữa các phần tử.\n"
            + "B. Xoá tất cả animation.\n"
            + "C. Làm animation nhanh gấp đôi.\n"
            + "D. Làm ảnh mờ đi.",
            "Animation responsive cần?\n",
            "A. Tương thích trên mọi màn hình.\n"
            + "B. Chỉ chạy trên desktop.\n"
            + "C. Chạy riêng mobile.\n"
            + "D. Dùng ảnh nền lớn.",
            "Các bước xây dựng animation tốt?\n",
            "A. Kế hoạch - Thiết kế - Thực hiện.\n"
            + "B. Upload ảnh trước.\n"
            + "C. Code thẳng không test.\n"
            + "D. Làm xong rồi nghĩ tiếp.",
            "CSS property nào dễ gây lag nếu dùng sai?\n",
            "A. Top, left.\n"
            + "B. Color.\n"
            + "C. Font-weight.\n"
            + "D. Display."
        });
        TITLE_MAP.put("Lợi ích của animation nâng cao", new String[]{
            "Animation nâng cao giúp?\n",
            "A. Tăng trải nghiệm người dùng.\n"
            + "B. Giảm bảo mật web.\n"
            + "C. Gây nhiễu tín hiệu.\n"
            + "D. Làm database lỗi.",
            "Animation nâng cao có thể?\n",
            "A. Hướng dẫn người dùng tốt hơn.\n"
            + "B. Thêm quảng cáo spam.\n"
            + "C. Chặn API.\n"
            + "D. Xóa cookies.",
            "Animation nâng cao tác động tới cảm nhận?\n",
            "A. Làm web sống động hơn.\n"
            + "B. Làm web chậm hơn.\n"
            + "C. Làm web trống rỗng.\n"
            + "D. Xóa server.",
            "Animation giúp giữ chân người dùng bằng cách?\n",
            "A. Làm trang hấp dẫn, thú vị.\n"
            + "B. Tăng số lượng pop-up.\n"
            + "C. Dùng hình ảnh to.\n"
            + "D. Phát video tự động.",
            "Animation tối ưu tốt sẽ?\n",
            "A. Giảm thời gian cảm nhận tải trang.\n"
            + "B. Tăng số lượng lỗi.\n"
            + "C. Làm mất dữ liệu.\n"
            + "D. Đẩy người dùng rời web.",
            "Animation nâng cao còn giúp?\n",
            "A. Định hướng luồng đọc nội dung.\n"
            + "B. Ngắt kết nối mạng.\n"
            + "C. Làm server treo.\n"
            + "D. Ẩn toàn bộ text.",
            "Animation thích hợp sẽ?\n",
            "A. Làm UX mượt mà hơn.\n"
            + "B. Làm load chậm hơn.\n"
            + "C. Làm crash trình duyệt.\n"
            + "D. Tăng kích thước file CSS.",
            "Một lợi ích lớn của animation UX?\n",
            "A. Thể hiện hành động kế tiếp rõ ràng.\n"
            + "B. Giảm trải nghiệm.\n"
            + "C. Xóa user session.\n"
            + "D. Mở popup liên tục.",
            "Animation tốt sẽ?\n",
            "A. Làm web chuyên nghiệp hơn.\n"
            + "B. Giảm độ tin cậy.\n"
            + "C. Tăng lỗi giao diện.\n"
            + "D. Chặn truy cập.",
            "Lợi ích ẩn của animation tối ưu là?\n",
            "A. Cải thiện SEO gián tiếp.\n"
            + "B. Làm nặng hosting.\n"
            + "C. Xóa index web.\n"
            + "D. Giảm tốc độ CDN."
        });
        TITLE_MAP.put("Manifest.json là gì?", new String[]{
            "Manifest.json là file gì?\n",
            "A. Mô tả thông tin web app.\n"
            + "B. File ảnh.\n"
            + "C. File video.\n"
            + "D. File database.",
            "Manifest.json thường dùng trong?\n",
            "A. Progressive Web App (PWA).\n"
            + "B. Server SQL.\n"
            + "C. Excel bảng tính.\n"
            + "D. Photoshop.",
            "Manifest.json chứa thông tin gì?\n",
            "A. Tên app, icon, theme.\n"
            + "B. Mật khẩu admin.\n"
            + "C. Dữ liệu backup.\n"
            + "D. Video giới thiệu.",
            "File manifest.json nên đặt ở đâu?\n",
            "A. Root directory.\n"
            + "B. Thư mục private.\n"
            + "C. Server backup.\n"
            + "D. Thư mục temp.",
            "Thuộc tính 'start_url' trong manifest để?\n",
            "A. Xác định trang mở đầu khi app launch.\n"
            + "B. Lưu cache.\n"
            + "C. Xóa cookies.\n"
            + "D. Kết nối database.",
            "Thuộc tính 'display' có giá trị gì phổ biến?\n",
            "A. standalone.\n"
            + "B. database.\n"
            + "C. iframe.\n"
            + "D. server-mode.",
            "Manifest.json giúp app?\n",
            "A. Chạy như native app.\n"
            + "B. Tăng tốc server.\n"
            + "C. Nén hình ảnh.\n"
            + "D. Thêm hiệu ứng hover.",
            "Mục 'icons' trong manifest dùng để?\n",
            "A. Chỉ định các biểu tượng app.\n"
            + "B. Tăng font size.\n"
            + "C. Kết nối API.\n"
            + "D. Thêm video background.",
            "Manifest.json có hỗ trợ Dark Mode không?\n",
            "A. Có, qua theme_color.\n"
            + "B. Không, chỉ dùng CSS.\n"
            + "C. Không liên quan.\n"
            + "D. Phải viết riêng bằng PHP.",
            "Có thể validate manifest.json ở đâu?\n",
            "A. Tools như Lighthouse.\n"
            + "B. Photoshop.\n"
            + "C. SQL server.\n"
            + "D. WordPress plugin."
        });
        TITLE_MAP.put("Các yếu tố quan trọng của manifest.json", new String[]{
            "manifest.json dùng để làm gì?\n"
            + "A. Xác định metadata cho web app.\n"
            + "B. Tăng tốc độ mạng.\n"
            + "C. Tạo database.\n"
            + "D. Tạo server mới.",
            "Thuộc tính 'name' trong manifest.json có vai trò gì?\n"
            + "A. Tên ứng dụng.\n"
            + "B. Màu nền.\n"
            + "C. Font chữ.\n"
            + "D. Hình ảnh nền.",
            "Thuộc tính 'icons' trong manifest.json là gì?\n"
            + "A. Định nghĩa biểu tượng ứng dụng.\n"
            + "B. Tạo bộ nhớ cache.\n"
            + "C. Chạy animation.\n"
            + "D. Tạo API.",
            "Mục 'start_url' chỉ định điều gì?\n"
            + "A. URL bắt đầu khi mở app.\n"
            + "B. API endpoint.\n"
            + "C. Đường dẫn database.\n"
            + "D. Server backup.",
            "Manifest hỗ trợ loại giao diện nào?\n"
            + "A. Fullscreen, standalone.\n"
            + "B. Only fullscreen.\n"
            + "C. Only responsive.\n"
            + "D. Static only.",
            "Thuộc tính 'background_color' dùng để?\n"
            + "A. Màu nền khi loading.\n"
            + "B. Màu nút bấm.\n"
            + "C. Màu chữ.\n"
            + "D. Màu API.",
            "Manifest ảnh hưởng tới?\n"
            + "A. Trải nghiệm người dùng.\n"
            + "B. Database.\n"
            + "C. Server load.\n"
            + "D. Backup plan.",
            "Khi nào trình duyệt dùng manifest.json?\n"
            + "A. Khi add to home screen.\n"
            + "B. Khi load ảnh.\n"
            + "C. Khi fetch API.\n"
            + "D. Khi backup dữ liệu.",
            "Manifest.json định nghĩa những gì?\n"
            + "A. Icons, name, start_url.\n"
            + "B. API keys.\n"
            + "C. Database fields.\n"
            + "D. Server config.",
            "Có thể tùy chỉnh theme_color trong manifest.json không?\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi dùng JavaScript.\n"
            + "D. Chỉ trong server."
        });

        TITLE_MAP.put("Service Worker là gì?", new String[]{
            "Service Worker dùng để làm gì?\n"
            + "A. Quản lý request và cache.\n"
            + "B. Tạo database.\n"
            + "C. Thiết kế giao diện.\n"
            + "D. Xử lý animation.",
            "Service Worker hoạt động ở đâu?\n"
            + "A. Background (nền).\n"
            + "B. Trên UI chính.\n"
            + "C. Server.\n"
            + "D. Database.",
            "Service Worker can thiệp vào request như thế nào?\n"
            + "A. Intercept và tùy chỉnh.\n"
            + "B. Xóa request.\n"
            + "C. Chặn API.\n"
            + "D. Xóa bộ nhớ.",
            "Điều kiện nào để Service Worker hoạt động?\n"
            + "A. HTTPS hoặc localhost.\n"
            + "B. HTTP bất kỳ.\n"
            + "C. FTP.\n"
            + "D. Telnet.",
            "Service Worker được kích hoạt khi nào?\n"
            + "A. Sau khi đăng ký và cài đặt.\n"
            + "B. Khi mở tab mới.\n"
            + "C. Khi refresh.\n"
            + "D. Khi xóa cache.",
            "Service Worker có quyền truy cập vào DOM không?\n"
            + "A. Không.\n"
            + "B. Có.\n"
            + "C. Chỉ 1 phần.\n"
            + "D. Tùy hệ điều hành.",
            "Service Worker có thể push notification không?\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trên Android.\n"
            + "D. Chỉ trên iOS.",
            "Service Worker lưu trữ dữ liệu bằng gì?\n"
            + "A. Cache API.\n"
            + "B. Local Storage.\n"
            + "C. Session Storage.\n"
            + "D. SQL Server.",
            "Service Worker giúp web hoạt động khi nào?\n"
            + "A. Khi offline.\n"
            + "B. Khi không có CSS.\n"
            + "C. Khi không có database.\n"
            + "D. Khi server hỏng.",
            "Cách đăng ký Service Worker?\n"
            + "A. navigator.serviceWorker.register().\n"
            + "B. fetchServiceWorker().\n"
            + "C. new ServiceWorker().\n"
            + "D. document.serviceWorker()."
        });

        TITLE_MAP.put("Các yếu tố quan trọng về Service Worker", new String[]{
            "Lifecycle của Service Worker gồm những giai đoạn nào?\n"
            + "A. Install, Activate, Fetch.\n"
            + "B. Start, Stop, Delete.\n"
            + "C. Fetch, Store, Load.\n"
            + "D. Begin, End, Restart.",
            "Sự kiện nào kích hoạt sau install?\n"
            + "A. Activate.\n"
            + "B. Fetch.\n"
            + "C. Load.\n"
            + "D. Init.",
            "Service Worker có thể intercept request không?\n"
            + "A. Có thể.\n"
            + "B. Không thể.\n"
            + "C. Tùy thuộc trình duyệt.\n"
            + "D. Chỉ khi online.",
            "Service Worker hoạt động khi nào?\n"
            + "A. Khi website đã đăng ký SW.\n"
            + "B. Khi click nút login.\n"
            + "C. Khi mở console.\n"
            + "D. Khi fetch data.",
            "Có thể kiểm soát cache trong Service Worker không?\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong local.\n"
            + "D. Chỉ khi online.",
            "Cần xử lý gì khi activate Service Worker mới?\n"
            + "A. Clear cache cũ.\n"
            + "B. Reload API.\n"
            + "C. Update database.\n"
            + "D. Refresh trình duyệt.",
            "Khi nào cần skipWaiting()?\n"
            + "A. Khi muốn Service Worker mới hoạt động ngay.\n"
            + "B. Khi cache đầy.\n"
            + "C. Khi fetch thất bại.\n"
            + "D. Khi push notification lỗi.",
            "Service Worker fetch event làm gì?\n"
            + "A. Bắt các request ra ngoài.\n"
            + "B. Tạo UI mới.\n"
            + "C. Update database.\n"
            + "D. Render animation.",
            "Service Worker có thể quản lý nhiều cache không?\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ 1 cache.\n"
            + "D. Chỉ cache CSS.",
            "Service Worker cần cập nhật như thế nào?\n"
            + "A. Thay đổi file hoặc clear cache.\n"
            + "B. Xóa database.\n"
            + "C. Tăng số lượng API.\n"
            + "D. Reload server."
        });

        TITLE_MAP.put("Caching trong Service Worker", new String[]{
            "Caching trong Service Worker để làm gì?\n"
            + "A. Lưu tài nguyên để load nhanh hơn.\n"
            + "B. Tạo tài khoản người dùng.\n"
            + "C. Update database.\n"
            + "D. Chạy animation.",
            "Chiến lược cache phổ biến là gì?\n"
            + "A. Cache First.\n"
            + "B. Server First.\n"
            + "C. CSS First.\n"
            + "D. HTML First.",
            "Cache First hoạt động như thế nào?\n"
            + "A. Load từ cache trước, nếu không có thì fetch.\n"
            + "B. Luôn fetch mới từ server.\n"
            + "C. Luôn dùng dữ liệu cũ.\n"
            + "D. Load từ database.",
            "Network First hoạt động thế nào?\n"
            + "A. Fetch từ mạng trước, fallback cache.\n"
            + "B. Chỉ lấy cache.\n"
            + "C. Chỉ lấy server.\n"
            + "D. Load từ localStorage.",
            "Cache Only nghĩa là gì?\n"
            + "A. Chỉ dùng cache, không fetch mạng.\n"
            + "B. Chỉ dùng server.\n"
            + "C. Luôn fetch mới.\n"
            + "D. Chỉ fetch hình ảnh.",
            "Network Only nghĩa là gì?\n"
            + "A. Chỉ fetch từ mạng.\n"
            + "B. Chỉ lấy từ cache.\n"
            + "C. Chỉ load UI.\n"
            + "D. Chỉ lưu dữ liệu.",
            "Stale While Revalidate nghĩa là gì?\n"
            + "A. Load cache cũ trước, cập nhật nền.\n"
            + "B. Luôn fetch server trước.\n"
            + "C. Chỉ fetch server.\n"
            + "D. Chỉ dùng offline.",
            "API nào để làm việc với cache?\n"
            + "A. Cache API.\n"
            + "B. DOM API.\n"
            + "C. Storage API.\n"
            + "D. Session API.",
            "Khi nào cần xóa cache cũ?\n"
            + "A. Khi update Service Worker.\n"
            + "B. Khi API lỗi.\n"
            + "C. Khi thêm CSS.\n"
            + "D. Khi click nút đăng ký.",
            "Cache storage có giới hạn không?\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ Android.\n"
            + "D. Chỉ iOS."
        });
        TITLE_MAP.put("Các lợi ích của Service Worker & Caching", new String[]{
            "Service Worker giúp web hoạt động như thế nào?\n"
            + "A. Nhanh hơn và offline được.\n"
            + "B. Chỉ load nhanh hơn.\n"
            + "C. Giảm độ phân giải.\n"
            + "D. Tăng số lượng API.",
            "Caching giúp tiết kiệm gì?\n"
            + "A. Băng thông mạng.\n"
            + "B. Bộ nhớ RAM.\n"
            + "C. Dung lượng máy chủ.\n"
            + "D. Điện thoại.",
            "Khi offline, Service Worker có thể?\n"
            + "A. Phục vụ dữ liệu đã cache.\n"
            + "B. Tạo API mới.\n"
            + "C. Reset server.\n"
            + "D. Update UI tự động.",
            "Caching giúp cải thiện?\n"
            + "A. Thời gian tải trang.\n"
            + "B. Giao diện đẹp hơn.\n"
            + "C. Màu sắc website.\n"
            + "D. Kích thước ảnh.",
            "Service Worker giúp website chịu tải cao hơn bằng cách?\n"
            + "A. Giảm request mạng.\n"
            + "B. Tăng server.\n"
            + "C. Tăng RAM client.\n"
            + "D. Tối ưu HTML.",
            "Tài nguyên nào nên được cache?\n"
            + "A. CSS, JS, hình ảnh.\n"
            + "B. Các file tạm.\n"
            + "C. Dữ liệu RAM.\n"
            + "D. Database server.",
            "Ưu điểm chính của caching là gì?\n"
            + "A. Tải nhanh và tiết kiệm dữ liệu.\n"
            + "B. Thêm hiệu ứng chuyển cảnh.\n"
            + "C. Tạo nhiều API hơn.\n"
            + "D. Tăng dung lượng tải.",
            "Khi người dùng offline, cache giúp gì?\n"
            + "A. Duy trì trải nghiệm người dùng.\n"
            + "B. Tạo user mới.\n"
            + "C. Reset server.\n"
            + "D. Xóa bộ nhớ máy.",
            "Service Worker giảm tải server bằng cách nào?\n"
            + "A. Phục vụ tài nguyên từ cache.\n"
            + "B. Tăng request API.\n"
            + "C. Tạo server mới.\n"
            + "D. Sửa lỗi HTML.",
            "Ưu điểm của pre-caching là gì?\n"
            + "A. Có sẵn tài nguyên trước khi người dùng cần.\n"
            + "B. Giảm số lượng user.\n"
            + "C. Tăng độ trễ tải trang.\n"
            + "D. Tạo lỗi network."
        });
        TITLE_MAP.put("Offline Mode (Chế độ ngoại tuyến) là gì?", new String[]{
            "Offline Mode nghĩa là gì?\n"
            + "A. Ứng dụng hoạt động không cần mạng.\n"
            + "B. Ứng dụng tắt khi mất mạng.\n"
            + "C. Ứng dụng tự xóa dữ liệu.\n"
            + "D. Ứng dụng reset password.",
            "Offline Mode hoạt động nhờ gì?\n"
            + "A. Service Worker và Cache.\n"
            + "B. Database server.\n"
            + "C. Session cookie.\n"
            + "D. CSS và HTML.",
            "Offline Mode phục vụ dữ liệu từ đâu?\n"
            + "A. Cache.\n"
            + "B. RAM.\n"
            + "C. Server.\n"
            + "D. LocalStorage.",
            "Offline Mode có thể áp dụng cho?\n"
            + "A. Website và Progressive Web App.\n"
            + "B. Chỉ website.\n"
            + "C. Chỉ Android App.\n"
            + "D. Chỉ server app.",
            "Ứng dụng offline cần lưu trữ gì?\n"
            + "A. Nội dung cần thiết cho hoạt động.\n"
            + "B. Toàn bộ server.\n"
            + "C. RAM client.\n"
            + "D. Mạng WiFi.",
            "Offline Mode giúp tăng?\n"
            + "A. Trải nghiệm người dùng.\n"
            + "B. Kích thước file tải về.\n"
            + "C. Thời gian downtime.\n"
            + "D. Băng thông tiêu thụ.",
            "Thiết kế offline cần chú ý gì?\n"
            + "A. Nội dung khả dụng và đồng bộ sau online.\n"
            + "B. Tắt giao diện.\n"
            + "C. Reset user session.\n"
            + "D. Khóa ứng dụng.",
            "Offline Mode nên kết hợp với kỹ thuật gì?\n"
            + "A. Background Sync.\n"
            + "B. Session Timeout.\n"
            + "C. Page Reload.\n"
            + "D. Cookie Storage.",
            "Offline Mode sử dụng chiến lược cache nào?\n"
            + "A. Cache First hoặc Stale While Revalidate.\n"
            + "B. Network Only.\n"
            + "C. Database Only.\n"
            + "D. Session Storage.",
            "Khi quay lại online, cần làm gì?\n"
            + "A. Đồng bộ dữ liệu mới.\n"
            + "B. Xóa toàn bộ cache.\n"
            + "C. Tắt app.\n"
            + "D. Reset password."
        });
        TITLE_MAP.put("Các yếu tố quan trọng của Offline Mode", new String[]{
            "Yếu tố nào là nền tảng của Offline Mode?\n"
            + "A. Service Worker.\n"
            + "B. Database.\n"
            + "C. CSS.\n"
            + "D. Cookie.",
            "Tài nguyên nào nên pre-cache?\n"
            + "A. Trang chủ, CSS, JS.\n"
            + "B. Ảnh profile.\n"
            + "C. Video.\n"
            + "D. File debug.",
            "Kiểu dữ liệu nào nên đồng bộ khi online lại?\n"
            + "A. Các thay đổi từ người dùng.\n"
            + "B. Các file CSS.\n"
            + "C. Ảnh động.\n"
            + "D. Video.",
            "Chiến lược cache nào phù hợp cho nội dung tĩnh?\n"
            + "A. Cache First.\n"
            + "B. Network First.\n"
            + "C. Database Only.\n"
            + "D. API First.",
            "Offline Mode cần đảm bảo gì?\n"
            + "A. Giao diện không lỗi.\n"
            + "B. RAM tối ưu.\n"
            + "C. CPU hoạt động tối đa.\n"
            + "D. Bộ nhớ luôn trống.",
            "Notification nào cần hiển thị khi offline?\n"
            + "A. Cảnh báo offline.\n"
            + "B. Cảnh báo lỗi server.\n"
            + "C. Update phần mềm.\n"
            + "D. Xóa tài khoản.",
            "Khi người dùng gửi dữ liệu offline, cần?\n"
            + "A. Lưu tạm và sync sau.\n"
            + "B. Báo lỗi ngay.\n"
            + "C. Xóa request.\n"
            + "D. Reset máy.",
            "Kiểm tra trạng thái mạng bằng API nào?\n"
            + "A. Navigator.onLine.\n"
            + "B. Window.status.\n"
            + "C. Document.ready.\n"
            + "D. Fetch.online.",
            "Cách hiển thị dữ liệu khi offline?\n"
            + "A. Sử dụng dữ liệu đã cache.\n"
            + "B. Load lại server.\n"
            + "C. Hiển thị lỗi.\n"
            + "D. Reset UI.",
            "Để đồng bộ dữ liệu offline, cần kỹ thuật gì?\n"
            + "A. Background Sync.\n"
            + "B. Fetch API.\n"
            + "C. WebSocket.\n"
            + "D. DOM Sync."
        });
        TITLE_MAP.put("Push Notifications (Thông báo đẩy) là gì?", new String[]{
            "Push Notification là gì?\n"
            + "A. Thông báo gửi từ server đến người dùng.\n"
            + "B. Email marketing.\n"
            + "C. Tin nhắn SMS.\n"
            + "D. Quảng cáo TV.",
            "Push Notifications hoạt động qua?\n"
            + "A. Service Worker.\n"
            + "B. LocalStorage.\n"
            + "C. Cookie.\n"
            + "D. WebSocket.",
            "Để nhận push, client cần?\n"
            + "A. Đăng ký subscription.\n"
            + "B. Đăng nhập server.\n"
            + "C. Mở nhiều tab.\n"
            + "D. Reset máy.",
            "Push Notifications hỗ trợ ở trình duyệt nào?\n"
            + "A. Chrome, Firefox, Edge, Safari (một số).\n"
            + "B. Chỉ Chrome.\n"
            + "C. Chỉ Firefox.\n"
            + "D. Chỉ Safari.",
            "Push server gửi gì cho client?\n"
            + "A. Payload thông báo.\n"
            + "B. Ảnh động.\n"
            + "C. Video.\n"
            + "D. HTML page.",
            "Push Notifications có thể kích hoạt khi?\n"
            + "A. Ứng dụng đang đóng.\n"
            + "B. Ứng dụng đang mở.\n"
            + "C. Chỉ khi mở app.\n"
            + "D. Khi user reset máy.",
            "Notification API nào dùng để hiển thị thông báo?\n"
            + "A. showNotification().\n"
            + "B. alert().\n"
            + "C. window.show().\n"
            + "D. fetchNotification().",
            "Push Notification cần permission gì?\n"
            + "A. Notification.\n"
            + "B. Location.\n"
            + "C. Camera.\n"
            + "D. Storage.",
            "Giao thức bảo mật trong push notification là?\n"
            + "A. HTTPS.\n"
            + "B. FTP.\n"
            + "C. HTTP.\n"
            + "D. Telnet.",
            "Push Notifications giúp gì cho website?\n"
            + "A. Tăng tương tác người dùng.\n"
            + "B. Giảm traffic.\n"
            + "C. Giảm nội dung.\n"
            + "D. Tăng downtime."
        });
        TITLE_MAP.put("Các yếu tố quan trọng của Push Notifications", new String[]{
            "Push Notifications nên được gửi vào thời điểm nào?",
            "A. Khi người dùng hoạt động.\n"
            + "B. Lúc nửa đêm.\n"
            + "C. Ngẫu nhiên bất kỳ lúc nào.\n"
            + "D. Khi server restart.",
            "Điều gì làm cho một Push Notification hiệu quả?",
            "A. Nội dung ngắn gọn và hấp dẫn.\n"
            + "B. Gửi thật nhiều cùng lúc.\n"
            + "C. Không cần cá nhân hóa.\n"
            + "D. Gửi toàn bộ nội dung website.",
            "Cần lưu ý gì về tần suất gửi Push Notifications?",
            "A. Gửi vừa đủ, tránh làm phiền.\n"
            + "B. Càng nhiều càng tốt.\n"
            + "C. Chỉ gửi vào ngày lễ.\n"
            + "D. Không cần quan tâm.",
            "Push Notifications nên có gì để tăng tỷ lệ mở?",
            "A. Tiêu đề hấp dẫn.\n"
            + "B. Nội dung dài dòng.\n"
            + "C. Hình ảnh nền lớn.\n"
            + "D. Link đến nhiều trang.",
            "Push Notifications có thể được cá nhân hóa như thế nào?",
            "A. Dùng tên người dùng.\n"
            + "B. Nội dung ngẫu nhiên.\n"
            + "C. Nội dung chung chung.\n"
            + "D. Nội dung lấy từ đối thủ.",
            "Tại sao cần xin phép trước khi gửi Push Notifications?",
            "A. Để tôn trọng quyền riêng tư.\n"
            + "B. Để gửi ngay lập tức.\n"
            + "C. Để lưu cookie.\n"
            + "D. Để ghi đè trình duyệt.",
            "Push Notifications cần tương thích với nền tảng nào?",
            "A. Web và Mobile.\n"
            + "B. Chỉ Mobile.\n"
            + "C. Chỉ Desktop.\n"
            + "D. Chỉ Android.",
            "Thông báo đẩy nên được kiểm tra như thế nào?",
            "A. Test trên nhiều trình duyệt.\n"
            + "B. Test 1 lần duy nhất.\n"
            + "C. Không cần kiểm tra.\n"
            + "D. Test trên máy tính bảng thôi.",
            "Thành phần nào nên có trong nội dung Push Notification?",
            "A. CTA (Call To Action).\n"
            + "B. Một đoạn code.\n"
            + "C. Video dài.\n"
            + "D. File tải về.",
            "Yếu tố quan trọng nhất của Push Notification là gì?",
            "A. Đúng người, đúng thời điểm.\n"
            + "B. Thiết kế đẹp.\n"
            + "C. Giá rẻ.\n"
            + "D. Code ngắn."
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
}
