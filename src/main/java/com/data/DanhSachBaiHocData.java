
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
        //HTML Cơ Bản
        TITLE_MAP.put("HTML là gì?", new String[]{
            "Giới Thiệu HTML",
            "Lịch Sử Phát Triển Của HTML",
            "Cách HTML Hoạt Động"
        });
        TITLE_MAP.put("CẤU TRÚC CƠ BẢN CỦA HTML", new String[]{
            "Các Phần Của Tài Liệu HTML",
            "Mô Tả Chi Tiết Các Thẻ Quan Trọng"
        });
        TITLE_MAP.put("Cách viết file HTML và hiển thị trên trình duyệt", new String[]{
            "Tạo File HTML",
            "Chạy File HTML Trên Trình Duyệt",
            "Kiểm Tra Và Chỉnh Sửa HTML Bằng Developer Tools"
        });
        TITLE_MAP.put("Tiêu đề (<h1> đến <h6>)", new String[]{
            "Ý Nghĩa Của Các Mức Tiêu Đề",
            "Lỗi Thường Gặp"
        });
        TITLE_MAP.put("Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)", new String[]{
            "Đoạn Văn (<p>)",
            "Xuống Dòng (<br>)",
            "Đường Ngang (<hr>)"
        });
        TITLE_MAP.put("Định dạng văn bản (<b>, <i>, <u>, <strong>, <em>, <mark>, <small>)", new String[]{
            "Các Thẻ Định Dạng Phổ Biến",
            "Ví Dụ Về Định Dạng Văn Bản"
        });
        TITLE_MAP.put("Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)", new String[]{
            "Danh sách là gì?",
            "Danh Sách Có Thứ Tự (<ol>)",
            "Danh Sách Không Thứ Tự (<ul>)",
            "Danh Sách Mô Tả (<dl>)"
        });
        TITLE_MAP.put("Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)", new String[]{
            "Chèn Ảnh (<img>)",
            "Chèn Video (<video>)",
            "Chèn Âm Thanh (<audio>)"
        });
        TITLE_MAP.put("Tạo liên kết (<a>) và điều hướng trang web", new String[]{
            "Cấu Trúc Cơ Bản Của Liên Kết",
            "Liên Kết Tới Các Đoạn Văn Trong Cùng Một Trang",
            "Các Thuộc Tính Thường Dùng Của Thẻ <a>",
            "Liên Kết Hình Ảnh"
        });
        TITLE_MAP.put("Nhúng iframe (<iframe>)", new String[]{
            "Cấu Trúc Thẻ <iframe>",
            "Tại Sao Sử Dụng Iframe?",
            "Lưu Ý Khi Sử Dụng Iframe"
        });
        TITLE_MAP.put("Bảng (<table>, <tr>, <td>, <th>)", new String[]{
            "Cấu Trúc Cơ Bản Của Bảng",
            "Các Thuộc Tính Của Bảng",
            "Bảng Nâng Cao"
        });
        TITLE_MAP.put("Biểu mẫu (<form>, <input>, <textarea>, <select>)", new String[]{
            "Cấu Trúc Cơ Bản Của Biểu Mẫu",
            "Các Loại Trường Nhập",
            "Các Thuộc Tính Khác Của Thẻ <form>"
        });

        //HTML Nâng Cao
        TITLE_MAP.put("Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", new String[]{
            "HTML semantic là gì?",
            "<header>",
            "<footer>",
            "<nav>",
            "<article>",
            "<section>"
        });
        TITLE_MAP.put("Ứng dụng Semantic HTML để tối ưu SEO", new String[]{
            "Semantic HTML là gì",
            "Giúp công cụ tìm kiếm hiểu rõ cấu trúc và nội dung trang",
            "Tăng khả năng lập chỉ mục chính xác và thân thiện với người dùng",
            "Hỗ trợ tối ưu hóa cho tìm kiếm bằng giọng nói và thiết bị di động"
        });
        TITLE_MAP.put("Sử dụng <meta> để tối ưu công cụ tìm kiếm", new String[]{
            "Các thẻ <meta> quan trọng trong HTML",
            "Meta Title và Meta Description",
            "Meta Robots và Meta Viewport",
            "Meta Charset"
        });
        TITLE_MAP.put("Open Graph, Twitter Card", new String[]{
            "Giới thiệu Open Graph và Twitter Card",
            "Open Graph",
            "Twitter Card"
        });
        TITLE_MAP.put("Favicon, Sitemap, robots.txt", new String[]{
            "Favicon",
            "Sitemap",
            "robots.txt"
        });
        TITLE_MAP.put("Local Storage & Session Storage", new String[]{
            "Local Storage",
            "Session Storage"
        });
        TITLE_MAP.put("Geolocation API (Xác định vị trí người dùng)", new String[]{
            "Geolocation API là",
            "Tính năng của Geolocation API",
            "Lợi ích SEO gián tiếp"
        });
        TITLE_MAP.put("Drag & Drop API", new String[]{
            "Drag & Drop API là gì",
            "Tính năng của Drag & Drop API",
            "Lợi ích đối với SEO"
        });

        //CSS Cơ Bản
        TITLE_MAP.put("Inline CSS, Internal CSS, External CSS", new String[]{
            "Inline CSS",
            "Internal CSS",
            "External CSS"
        });
        TITLE_MAP.put("Cú pháp CSS cơ bản", new String[]{
            "CSS sử dụng cú pháp gì?",
            "Cấu trúc cơ bản của một quy tắc CSS",
            "Các kiểu Selector trong CSS"
        });
        TITLE_MAP.put("Selectors cơ bản: class, id, tag, attribute", new String[]{
            "Tag Selector",
            "Class Selector",
            "ID Selector",
            "Attribute Selector"
        });
        TITLE_MAP.put("Đơn vị đo lường trong CSS: px, %, em, rem, vw, vh", new String[]{
            "Đơn vị tuyệt đối",
            "Đơn vị tương đối"
        });
        TITLE_MAP.put("Margin, Border, Padding, Content – CSS Box Model", new String[]{
            "Cấu trúc Box Model"
        });
        TITLE_MAP.put("Các thuộc tính width, height, max-width, min-height", new String[]{
            "Width và Height",
            "max-width và min-width"
        });
        TITLE_MAP.put("Positioning (static, relative, absolute, fixed, sticky)", new String[]{
            "Các loại position chính",
            "Sự khác biệt giữa các kiểu positioning",
            "Ứng dụng thực tế của từng loại"
        });
        TITLE_MAP.put("Màu HEX, RGB, HSL", new String[]{
            "Hệ màu HEX",
            "Hệ màu RGB",
            "Hệ màu HSL"
        });
        TITLE_MAP.put("Font-family, font-size, font-weight", new String[]{
            "Font-family",
            "Font-size",
            "Font-weight"
        });
        TITLE_MAP.put("Line-height, Letter-spacing", new String[]{
            "Line-height",
            "Letter-spacing",
            "Ứng dụng thực tế"
        });
        TITLE_MAP.put("display: block, inline, inline-block, flex, grid", new String[]{
            "Display: block",
            "Display: inline",
            "Display: inline-block",
            "Display: flex",
            "Display: grid"
        });
        TITLE_MAP.put("Viewport meta tag", new String[]{
            "Viewport là gì",
            "Cú pháp chuẩn của thẻ Viewport",
            "Các thuộc tính quan trọng",
            "Vai trò của Viewport meta tag"
        });

        //CSS Nâng Cao
        TITLE_MAP.put("display: flex", new String[]{
            "display: flex là gì?",
            "Các thuộc tính chính của Flexbox"
        });
        TITLE_MAP.put("Căn chỉnh bằng justify-content, align-items, align-self", new String[]{
            "justify-content",
            "align-items",
            "align-self"
        });
        TITLE_MAP.put("flex-wrap, flex-direction", new String[]{
            "flex-wrap",
            "flex-direction"
        });
        TITLE_MAP.put("display: grid", new String[]{
            "display: grid là gì?",
            "Các thuộc tính chính của CSS Grid"
        });
        TITLE_MAP.put("grid-template-columns, grid-template-rows, gap, align-items, justify-content", new String[]{
            "Khái Niệm về CSS Grid Layout",
            "Các Thuộc Tính Chính trong CSS Grid",
            "Chi Tiết về Các Thuộc Tính"
        });
        TITLE_MAP.put("Media Queries (@media)", new String[]{
            "Khái Niệm",
            "Cách Sử Dụng Media Queries",
            "Tại Sao Media Queries Quan Trọng?"
        });
        TITLE_MAP.put("Mobile-first vs. Desktop-first", new String[]{
            "Mobile-first",
            "Desktop-first",
            "So Sánh Mobile-first và Desktop-first"
        });
        TITLE_MAP.put("CSS Container Queries", new String[]{
            "CSS Container Queries"
        });
        TITLE_MAP.put("transition, animation, keyframes", new String[]{
            "Transition",
            "Animation",
            "Keyframes"
        });
        TITLE_MAP.put("Hover effect nâng cao", new String[]{
            "Hover effect nâng cao"
        });
        TITLE_MAP.put(":nth-child(), :not(), :focus-within", new String[]{
            ":nth-child(n) - Chọn Phần Tử Theo Thứ Tự",
            ":not() - Loại Trừ Một Phần Tử",
            ":focus-within - Chọn Phần Tử Khi Có Focus Bên Trong"
        });
        TITLE_MAP.put("Pseudo-elements (::before, ::after)", new String[]{
            "Pseudo-elements (::before, ::after)"
        });

        //CSS Chuyên Nghiệp
        TITLE_MAP.put("BEM (Block Element Modifier)", new String[]{
            "BEM (Block Element Modifier)"
        });
        TITLE_MAP.put("OOCSS (Object-Oriented CSS)", new String[]{
            "OOCSS (Object-Oriented CSS)"
        });
        TITLE_MAP.put("SMACSS (Scalable and Modular Architecture for CSS)", new String[]{
            "SMACSS"
        });
        TITLE_MAP.put("Biến trong CSS (--main-color)", new String[]{
            "Biến trong CSS (--main-color)"
        });
        TITLE_MAP.put("Nested Rules, Mixins, Functions", new String[]{
            "Nested Rules",
            "Mixins – Định nghĩa một nhóm CSS tái sử dụng",
            "Functions – Xử lý logic trong SCSS"
        });
        TITLE_MAP.put("Tối ưu hóa mã CSS với SCSS", new String[]{
            "Tối ưu hóa mã CSS với SCSS"
        });
        TITLE_MAP.put("Minify CSS", new String[]{
            "Minify CSS"
        });
        TITLE_MAP.put("Load Font Tối ưu", new String[]{
            "Load Font Tối ưu"
        });
        TITLE_MAP.put("Critical CSS & Lazy Loading", new String[]{
            "Critical CSS – Tải trước những phần CSS quan trọng",
            "Lazy Loading – Tải tài nguyên khi cần thiết"
        });
        TITLE_MAP.put("Bootstrap", new String[]{
            "Bootstrap"
        });
        TITLE_MAP.put("Tailwind CSS", new String[]{
            "Tailwind CSS"
        });
        TITLE_MAP.put("ARIA Roles", new String[]{
            "ARIA Roles"
        });
        TITLE_MAP.put("Keyboard Navigation", new String[]{
            "Keyboard Navigation"
        });
        TITLE_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new String[]{
            "Dark Mode hỗ trợ người dùng khiếm thị"
        });
        TITLE_MAP.put("Tạo hình ảnh, animations phức tạp bằng CSS", new String[]{
            "Tạo hình ảnh bằng CSS",
            "Tạo Animations (Hoạt ảnh) Phức Tạp"
        });
        TITLE_MAP.put("CSS Art & Pure CSS Illustrations", new String[]{
            "CSS Art",
            "Pure CSS Illustrations"
        });

        //Ứng Dụng & Dự Án Thực Tế
        TITLE_MAP.put("Blog cá nhân", new String[]{
            "Một Blog cá nhân là gì?",
            "Các yếu tố quan trọng của blog cá nhân"
        });
        TITLE_MAP.put("Landing Page sản phẩm", new String[]{
            "Landing page sản phẩm là gì?",
            "Các yếu tố quan trọng của landing page sản phẩm"
        });
        TITLE_MAP.put("Web bán hàng cơ bản", new String[]{
            "Web bán hàng cơ bản là gì?",
            "Các yếu tố quan trọng của web bán hàng cơ bản"
        });
        TITLE_MAP.put("Hiệu ứng scroll, parallax", new String[]{
            "Hiệu ứng scroll",
            "Parallax",
            "Ứng dụng trong thiết kế"
        });
        TITLE_MAP.put("Dark Mode", new String[]{
            "Dark Mode (chế độ tối) là gì?",
            "Các yếu tố quan trọng của Dark Mode",
            "Cách thức triển khai Dark Mode"
        });
        TITLE_MAP.put("Animation nâng cao", new String[]{
            "Animation nâng cao là gì?",
            "Các yếu tố quan trọng của animation nâng cao",
            "Lợi ích của animation nâng cao"
        });
        TITLE_MAP.put("Tạo manifest.json", new String[]{
            "Manifest.json là gì?",
            "Các yếu tố quan trọng của manifest.json"
        });
        TITLE_MAP.put("Service Worker & Caching", new String[]{
            "Service Worker là gì?",
            "Các yếu tố quan trọng về Service Worker",
            "Caching trong Service Worker",
            "Các lợi ích của Service Worker & Caching",
        });
        TITLE_MAP.put("Offline Mode & Push Notifications", new String[]{
            "Offline Mode (Chế độ ngoại tuyến) là gì?",
            "Các yếu tố quan trọng của Offline Mode",
            "Push Notifications (Thông báo đẩy) là gì?",
            "Các yếu tố quan trọng của Push Notifications"
        });
        
        // JavaScript Cơ bản 
        TITLE_MAP.put("Giới thiệu Javascript", new String[]{
            "JavaScript là gì?",
            "Lý do nên học JavaScript",
            "Cách nhúng JavaScript vào trang web",
            "Các công cụ hỗ trợ",
            "Bài tập"
        });
        TITLE_MAP.put("Cách nhúng JavaScript vào HTML", new String[]{
            "Giới thiệu cách nhúng",
            "Viết trực tiếp trong thẻ <script>",
            "Nhúng JavaScript vào thuộc tính của thẻ HTML",
            "Nhúng JavaScript từ tệp bên ngoài",
            "Bài tập thực hành"
        });
        TITLE_MAP.put("Biến và Kiểu dữ liệu trong JavaScript", new String[]{
            "Biến trong JavaScript",
            "Các kiểu dữ liệu trong JavaScript",
            "Ép kiểu dữ liệu",
            "Kiểm tra kiểu dữ liệu",
            "Bài tập thực hành"
        });
        TITLE_MAP.put("Toán tử và Cấu trúc điều kiện trong JavaScript", new String[]{
            "Giới thiệu toán tử và cấu trúc điều kiện",
            "Toán tử trong JavaScript",
            "Cấu trúc điều kiện",
            "Bài tập thực hành"
        });
        TITLE_MAP.put("Vòng lặp và Mảng trong JavaScript", new String[]{
            "Giới thiệu vòng lặp và mảng",
            "Vòng lặp trong JavaScript",
            "Mảng trong JavaScript",
            "Bài tập thực hành"
        });
        TITLE_MAP.put("Hàm và Phạm vi biến trong JavaScript", new String[]{
            "Giới thiệu hàm và phạm vi hàm",
            "Định nghĩa hàm",
            "Phạm vi biến",
            "Bài tập thực hành"
        });
        TITLE_MAP.put("Thực hành: Xây dựng trò chơi nhỏ", new String[]{
            "Giới thiệu trò chơi",
            "Lập kế hoạch và chuẩn bị",
            "Viết mã JavaScript cho trò chơi",
            "Bài tập thực hành"
        });

        // JavaScript Nâng Cao 
        TITLE_MAP.put("Vòng lặp và Hàm", new String[]{
            "Vòng Lặp và hàm trong JavaScript",
            "Hàm trong JavaScript"
        });
        TITLE_MAP.put("Lập trình hướng đối tượng (OOP)", new String[]{
            "Giới thiệu về OOP trong JavaScript",
            "Đối tượng và Lớp (Object & Class)",
            "Tính kế thừa (Inheritance)",
            "Đóng gói (Encapsulation)",
            "Đa hình (Polymorphism)",
            "Tính trừu tượng (Abstraction)",});
        TITLE_MAP.put("Closure và Hoisting", new String[]{
            "Closure trong JavaScript",
            "Hoisting trong JavaScript"
        });
        TITLE_MAP.put("ES6+ và Các tính năng mới", new String[]{
            "Giới thiệu về ES6+",
            "Các Tính Năng Mới Trong ES6+",});
        TITLE_MAP.put("Xử lý lỗi và Debugging", new String[]{
            "Giới thiệu về Xử Lý Lỗi",
            "Cách Bắt Lỗi với try...catch",
            "Sử Dụng throw Để Tạo Lỗi Tùy Chỉnh",
            "Debugging Với console.log() và console.error()",
            "Debugging Bằng Developer Tools"
        });
        TITLE_MAP.put("Thực hành: Xây dựng ứng dụng To-Do List", new String[]{
            "Giới thiệu Xây dựng ứng dụng To-Do List",
            "Xây dựng giao diện HTML",
            "Viết mã JavaScript",
            "Cải tiến - Lưu công việc vào LocalStorage"
        });
        // JavaScript Chuyên Nghiệp 
        TITLE_MAP.put("Lập trình bất đồng bộ (Asynchronous)", new String[]{
            "Giới thiệu Lập trình bất đồng bộ",
            "setTimeout và setInterval",
            "Callback Function",
            "Promise – Giải pháp thay thế Callback",
            "Async/Await – Cách Viết Promise Dễ Hiểu Hơn"
        });
        TITLE_MAP.put("Làm việc với API", new String[]{
            "Giới thiệu Làm việc với API",
            "Sử dụng fetch() để gọi API",
            "Gửi Dữ Liệu Lên API với fetch()",
            "Xử Lý Lỗi Khi Gọi API",});
        TITLE_MAP.put("DOM và Xử lý sự kiện", new String[]{
            "Giới Thiệu DOM và Xử lý sự kiện",
            "Truy Xuất Phần Tử DOM",
            "Thay Đổi Nội Dung và Kiểu Dáng",
            "Lắng Nghe và Xử Lý Sự Kiện",});
        TITLE_MAP.put("LocalStorage và SessionStorage", new String[]{
            "Giới Thiệu LocalStorage và SessionStorage",
            "Sự Khác Biệt Giữa Local Storage và SessionStorage",
            "Cách Sử Dụng Local Storage",
            "Cách Sử Dụng SessionStorage",
            "Ứng Dụng Thực Tế"
        });
        TITLE_MAP.put("Web Workers và Hiệu suất JavaScript", new String[]{
            "Giới Thiệu Web Workers và Hiệu suất JavaScript",
            "Web Workers là gì?",
            "Cách Tạo Web Worker",
            "Kết Thúc Web Worker",
            "Truyền Dữ Liệu Giữa Main Thread và Worker",
            "Ứng Dụng Thực Tế"
        });
        TITLE_MAP.put("Thực hành: Xây dựng ứng dụng thời tiết", new String[]{
            "Giới Thiệu Xây dựng ứng dụng thời tiết",
            "Yêu Cầu Công Nghệ",
            "Xây Dựng Giao Diện",
            "Xử lý dữ liệu với JavaScript",
            "Cải Tiến Giao Diện"
        });
        // JavaScript - Ứng dung thực tế
        TITLE_MAP.put("JavaScript trong dự án Web", new String[]{
            "Giới thiệu JavaScript trong dự án Web",
            "Cấu trúc một dự án Web sử dụng JavaScript",
            "Thêm JavaScript vào trang Web",
            "Tương tác với HTML và CSS bằng JavaScript"
        });
        TITLE_MAP.put("Framework JavaScript (React, Vue, Node.js)", new String[]{
            "Giới thiệu Framework JavaScript (React, Vue, Node.js",
            "React.js - Xây dựng giao diện động",
            "Vue.js - Framework dễ học và mạnh mẽ",
            "Node.js - Xây dựng Backend với Express.js"
        });
        TITLE_MAP.put("Webpack và tối ưu hiệu suất", new String[]{
            "Giới thiệu về Webpack",
            "Cài đặt Webpack",
            "Loaders và Plugins",
            "Tối ưu hóa hiệu suất với Webpack"
        });
        TITLE_MAP.put("Viết Unit Test với Jest", new String[]{
            "Giới thiệu về Jest",
            "Cài đặt Jest",
            "Viết bài kiểm thử đơn giản",
            "Kiểm thử bất đồng bộ với Jest",
            "Kiểm thử với Mock Functions"
        });
        TITLE_MAP.put("Thực hành: Xây dựng ứng dụng Chat thời gian thực", new String[]{
            "Giới thiệu Xây dựng ứng dụng Chat thời gian thực",
            "Cài đặt môi trường",
            "Xây dựng Backend",
            "Xây dựng Frontend",
            "Chạy ứng dụng"
        });
        TITLE_MAP.put("Giới thiệu về ngôn ngữ C", new String[]{
            "C là gì?",
            "Tại sao nên học C?",
            "Các đặc điểm nổi bật của C"
        });

        TITLE_MAP.put("Lịch sử và sự phát triển của ngôn ngữ C", new String[]{
            "Nguồn gốc của C",
            "Các phiên bản của C",
            "C và các ngôn ngữ lập trình khác"
        });

        TITLE_MAP.put("Đặc điểm và ứng dụng của C", new String[]{
            "Ứng dụng của C trong lập trình hệ thống",
            "C trong phát triển phần mềm nhúng"
        });

        TITLE_MAP.put("Cấu trúc cơ bản của một chương trình C", new String[]{
            "Cấu trúc tổng quát",
            "Khai báo biến",
            "Hàm main"
        });

        TITLE_MAP.put("Quá trình biên dịch và thực thi chương trình C", new String[]{
            "Các bước biên dịch",
            "Trình biên dịch và trình liên kết",
            "Quá trình thực thi"
        });

        TITLE_MAP.put("Các câu lệnh điều kiện (if, if-else, switch-case)", new String[]{
            "Câu lệnh if",
            "Câu lệnh if-else",
            "Câu lệnh switch-case"
        });

        TITLE_MAP.put("Các vòng lặp (for, while, do-while)", new String[]{
            "Vòng lặp for",
            "Vòng lặp while",
            "Vòng lặp do-while"
        });

        TITLE_MAP.put("Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", new String[]{
            "Khai báo mảng một chiều",
            "Truy cập và thao tác với phần tử trong mảng"
        });

        TITLE_MAP.put("Mảng hai chiều: Ứng dụng và thao tác", new String[]{
            "Khai báo mảng hai chiều",
            "Truy cập và thao tác với phần tử"
        });

        TITLE_MAP.put("Xử lý chuỗi trong C (thư viện string.h)", new String[]{
            "Khai báo chuỗi",
            "Các hàm xử lý chuỗi",
            "So sánh và nối chuỗi"
        });

        TITLE_MAP.put("Con trỏ: Khái niệm, khai báo, toán tử con trỏ", new String[]{
            "Khái niệm về con trỏ",
            "Khai báo con trỏ",
            "Toán tử con trỏ"
        });

        TITLE_MAP.put("Định nghĩa và sử dụng hàm", new String[]{
            "Cú pháp định nghĩa hàm",
            "Gọi hàm",
            "Hàm trả về giá trị"
        });

        TITLE_MAP.put("Truyền tham số vào hàm", new String[]{
            "Truyền tham số theo giá trị",
            "Truyền tham số theo tham chiếu",
            "Sử dụng con trỏ để truyền tham số"
        });

        TITLE_MAP.put("Hàm đệ quy", new String[]{
            "Khái niệm hàm đệ quy",
            "Cách hoạt động của hàm đệ quy",
            "Ví dụ về hàm đệ quy"
        });

        TITLE_MAP.put("Cấu trúc dữ liệu & file I/O", new String[]{
            "Cấu trúc dữ liệu cơ bản",
            "File I/O trong C",
            "Các hàm file I/O"
        });

        TITLE_MAP.put("Kiểu dữ liệu struct và union", new String[]{
            "Khái niệm về struct",
            "Khái niệm về union",
            "Sự khác biệt giữa struct và union"
        });

        TITLE_MAP.put("Danh sách liên kết, ngăn xếp, hàng đợi", new String[]{
            "Danh sách liên kết",
            "Ngăn xếp",
            "Hàng đợi"
        });

        TITLE_MAP.put("Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", new String[]{
            "Mở và đóng tệp tin",
            "Đọc và ghi tệp tin",
            "Các hàm xử lý tệp tin"
        });

//SQL
        TITLE_MAP.put("Giới thiệu SQL", new String[]{
            "Giới thiệu SQL",
            "Khái niệm",
            "Kiểu dữ liệu, toán tử, biểu thức"

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
            "PARTITIONING, HASH PARTITIONING",
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

        //Python
        TITLE_MAP.put("Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", new String[]{
            "Giới thiệu về Python",
            "Lịch sử phát triển",
            "Lý do chọn Python"
        });

        TITLE_MAP.put("Cấu trúc chương trình Python, cài đặt môi trường và IDE.", new String[]{
            "Cấu trúc chương trình Python",
            "Cài đặt môi trường và IDE"
        });

        TITLE_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", new String[]{
            "Biến",
            "Kiểu dữ liệu",
            "Toán tử",
            "Nhập xuất dữ liệu"
        });

        TITLE_MAP.put("Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", new String[]{
            "Cấu trúc điều kiện",
            "Vòng lặp",
            "Danh sách",
            "Tuple",
            "Dictionary"
        });

        TITLE_MAP.put("Lập trình hướng đối tượng (OOP) trong Python.", new String[]{
            "OOP"
        });

        TITLE_MAP.put("Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", new String[]{
            "Đọc/ghi file CSV",
            "JSON",
            "XML"
        });

        TITLE_MAP.put("Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", new String[]{
            "Try-except",
            "Finally",
            "Tạo ngoại lệ tùy chỉnh"
        });

        TITLE_MAP.put("Lập trình đa luồng và bất đồng bộ (async, threading).", new String[]{
            "Lập trình đa luồng",
            "Bất đồng bộ"
        });

        TITLE_MAP.put("Làm việc với API: requests, BeautifulSoup, Selenium.", new String[]{
            "Requests",
            "BeautifulSoup",
            "Selenium"

        });

        TITLE_MAP.put("Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", new String[]{
            "SQLite",
            "MySQL",
            "PostgreSQL",
            "ORM với SQLAlchemy"
        });

        TITLE_MAP.put("Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", new String[]{
            "Pandas",
            "Numpy",
            "Matplotlib"
        });

        TITLE_MAP.put("Lập trình mạng: socket, giao thức TCP/IP, UDP.", new String[]{
            "Socket",
            "Giao thức TCP/IP",
            "UDP"
        });

        TITLE_MAP.put("Xây dựng ứng dụng Web với Flask/Django.", new String[]{
            "Xây dựng ứng dụng Web với Flask/Django"
        });

        TITLE_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch.", new String[]{
            "Machine Learning với scikit-learn, TensorFlow, PyTorch"
        });

        TITLE_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            "Tự động hóa với Selenium, bot Telegram/Discord."
        });

        TITLE_MAP.put("Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", new String[]{
            "Bảo mật, tối ưu hiệu năng",
            "kiểm thử với pytest, unittest"
        });

        //Java
        TITLE_MAP.put("Java", new String[]{
            "Java là gì?",
            "Lịch sử phát triển của Java",
            "Lý do chọn Java",
            "Ứng dụng của Java"
        });

        TITLE_MAP.put("Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", new String[]{
            "Java là gì?",
            "Lịch sử phát triển của Java",
            "Lý do chọn Java",
            "Ứng dụng của Java"
        });

        TITLE_MAP.put("Cấu trúc chương trình Java, cài đặt JDK, IDE", new String[]{
            "Cấu trúc cơ bản của một chương trình Java",
            "Cài đặt JDK",
            "IDE phổ biến để lập trình Java",
            "Viết và chạy chương trình Java đầu tiên"
        });

        TITLE_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", new String[]{
            "Biến và kiểu dữ liệu",
            "Toán tử trong Java",
            "Xuất dữ liệu ra màn hình",
            "Nhập dữ liệu từ bàn phím"
        });

        TITLE_MAP.put("Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", new String[]{
            "Cấu trúc điều kiện",
            "Vòng lặp trong Java",
            "Mảng trong Java",
            "Xử lý chuỗi trong Java"
        });
        //nang cao
        TITLE_MAP.put("Lập trình đa luồng, xử lý sự kiện", new String[]{
            "Lập trình đa luồng là gì?",
            "Tạo luồng trong Java",
            "Đồng bộ hóa luồng",
            "Xử lý sự kiện trong Java"
        });

        TITLE_MAP.put("Lập trình mạng (Socket, TCP/IP, UDP)", new String[]{
            "Giới thiệu về lập trình mạng trong Java",
            "Lập trình Socket với TCP/IP",
            "Lập trình UDP trong Java"
        });

        TITLE_MAP.put("JDBC: Kết nối cơ sở dữ liệu, CRUD", new String[]{
            "JDBC là gì?",
            "Kết nối MySQL với Java",
            "Thực hiện CRUD"
        });

        TITLE_MAP.put("Lập trình Web: Servlet, JSP, MVC", new String[]{
            "Servlet là gì?",
            "Tạo Servlet cơ bản",
            "JSP là gì?",
            "Mô hình MVC trong Java"
        });

        //javachuyennghiep
        TITLE_MAP.put("Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức", new String[]{
            "Lập trình hướng đối tượng là gì?",
            "Lớp và đối tượng",
            "Constructor",
            "Phương thức (Method)"
        });

        TITLE_MAP.put("Đóng gói, kế thừa, đa hình, interface, abstract class", new String[]{
            "Đóng gói (Encapsulation)",
            "Kế thừa (Inheritance)",
            "Đa hình (Polymorphism)",
            "Interface và Abstract Class"
        });

        TITLE_MAP.put("Xử lý ngoại lệ, làm việc với tập tin", new String[]{
            "Xử lý ngoại lệ (Exception Handling)",
            "Đọc và ghi file trong Java"
        });

        TITLE_MAP.put("Collection Framework: ArrayList, LinkedList, HashMap", new String[]{
            "Giới thiệu Collection Framework",
            "ArrayList",
            "LinkedList",
            "HashMap"
        });

        //java ung dung thuc te
        TITLE_MAP.put("JavaFX: Xây dựng giao diện đồ họa", new String[]{
            "Giới thiệu JavaFX",
            "Cấu trúc ứng dụng JavaFX"
        });

        TITLE_MAP.put("Spring Boot: REST API, kết nối cơ sở dữ liệu", new String[]{
            "Giới thiệu Spring Boot",
            "Tạo REST API với Spring Boot",
            "Kết nối cơ sở dữ liệu MySQL với Spring Boot"
        });

        TITLE_MAP.put("Microservices với Spring Cloud", new String[]{
            "Giới thiệu về Microservices",
            "Xây dựng Microservice với Spring Boot",
            "Kết nối cơ sở dữ liệu MySQL với Spring Boot"
        });

        TITLE_MAP.put("Bảo mật (Spring Security, OAuth2, JWT), Hiệu năng & Kiểm thử", new String[]{
            "Bảo mật với Spring Security",
            "Xác thực bằng JWT",
            "Kiểm thử với JUnit và Mockito"
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
        //Html Cơ Bản
        DESCRIPTION_MAP.put("HTML là gì?", new String[]{
            "HTML (HyperText Markup Language) là ngôn ngữ đánh dấu siêu văn bản, được sử dụng để xây dựng các trang web và ứng dụng web",
            "HTML lần đầu tiên được giới thiệu vào năm 1993, và kể từ đó, ngôn ngữ này đã trải qua nhiều lần cập nhật để trở nên mạnh mẽ và linh hoạt hơn",
            "HTML hoạt động như một bộ khung cơ bản mà trình duyệt sử dụng để hiển thị trang web"
        });
        DESCRIPTION_MAP.put("CẤU TRÚC CƠ BẢN CỦA HTML", new String[]{
            "Một tài liệu HTML cơ bản có cấu trúc đơn giản gồm ba phần chính: <!DOCTYPE>, <html>, và <head> cùng với <body>",
            "<title>, <meta charset=\"UTF-8\">, <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">, <body>"
        });
        DESCRIPTION_MAP.put("Cách viết file HTML và hiển thị trên trình duyệt", new String[]{
            "Để viết một tệp HTML, bạn cần làm theo các bước cơ bản sau:",
            "Sau khi bạn đã tạo file HTML, bạn có thể hiển thị nó trên trình duyệt bằng một trong các cách sau",
            "Khi phát triển web, bạn sẽ cần phải kiểm tra mã HTML và kiểm tra cách nó hiển thị trên trình duyệt"
        });
        DESCRIPTION_MAP.put("Tiêu đề (<h1> đến <h6>)", new String[]{
            "Trong HTML, các thẻ tiêu đề từ <h1> đến <h6> được sử dụng để xác định mức độ quan trọng của các tiêu đề trên trang web",
            "Sử dụng quá nhiều <h1>, Bỏ qua thứ tự tiêu đề"
        });
        DESCRIPTION_MAP.put("Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)", new String[]{
            "Thẻ <p> là một trong những thẻ cơ bản và quan trọng nhất trong HTML",
            "Thẻ <br> là viết tắt của từ \"break\", được sử dụng để ngắt dòng trong văn bản mà không cần phải tạo một đoạn văn mới",
            "Thẻ <hr> dùng để tạo một đường ngang phân cách giữa các phần nội dung trên trang web"
        });
        DESCRIPTION_MAP.put("Định dạng văn bản (<b>, <i>, <u>, <strong>, <em>, <mark>, <small>)", new String[]{
            "HTML cung cấp nhiều thẻ để định dạng văn bản giúp nội dung dễ đọc và sinh động hơn",
            "<p><b>Chữ đậm</b>, <i>Chữ nghiêng</i>, <u>Chữ gạch chân</u>, <mark>Chữ đánh dấu</mark></p>"
        });
        DESCRIPTION_MAP.put("Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)", new String[]{
            "Danh sách là một trong những công cụ hữu ích để tổ chức nội dung trang web theo dạng có thứ tự hoặc không thứ tự",
            "Danh sách có thứ tự được sử dụng khi bạn cần sắp xếp các mục theo một trình tự nhất định, như một danh sách các bước trong hướng dẫn",
            "Danh sách không thứ tự được sử dụng khi bạn chỉ cần liệt kê các mục mà không cần sắp xếp chúng theo một trình tự cụ thể",
            "Danh sách mô tả khác biệt so với các loại danh sách thông thường ở chỗ nó dùng để mô tả các thuật ngữ và định nghĩa"
        });
        DESCRIPTION_MAP.put("Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)", new String[]{
            "Thẻ <img> trong HTML được sử dụng để nhúng hình ảnh vào trang web",
            "HTML5 cung cấp thẻ <video> để nhúng video vào trang web",
            "Thẻ <audio> trong HTML5 cho phép bạn nhúng các tệp âm thanh vào trang web"
        });
        DESCRIPTION_MAP.put("Tạo liên kết (<a>) và điều hướng trang web", new String[]{
            "Để tạo một liên kết, bạn sử dụng thẻ <a> với thuộc tính href",
            "Bạn có thể tạo liên kết đến một phần cụ thể trong cùng một trang web",
            "title: Cung cấp thông tin bổ sung về liên kết khi người dùng di chuột lên đó.",
            "Thẻ <a> cũng có thể bao quanh hình ảnh để tạo ra liên kết hình ảnh"
        });
        DESCRIPTION_MAP.put("Nhúng iframe (<iframe>)", new String[]{
            "Thẻ <iframe> dùng để nhúng một tài liệu hoặc trang web bên ngoài vào trang HTML hiện tại",
            "Nhúng video: Ví dụ, bạn có thể nhúng video từ YouTube hoặc",
            "Bảo mật: Khi nhúng iframe từ các trang web bên ngoài, bạn cần cẩn trọng với các vấn đề bảo mật"
        });
        DESCRIPTION_MAP.put("Bảng (<table>, <tr>, <td>, <th>)", new String[]{
            "Một bảng cơ bản bao gồm ba phần chính: các tiêu đề cột, các hàng dữ liệu, và cột dữ liệu",
            "border: Thuộc tính này xác định độ dày của viền bảng",
            "Bảng có thể được sử dụng với các thuộc tính và kỹ thuật CSS để tạo kiểu đẹp mắt và dễ sử dụng"
        });
        DESCRIPTION_MAP.put("Biểu mẫu (<form>, <input>, <textarea>, <select>)", new String[]{
            "Biểu mẫu thường bao gồm các thẻ như <input>, <textarea>, <button>, và <select>",
            "<input>: Thẻ này có nhiều kiểu dữ liệu khác nhau như text, password, email, number, v.v",
            "enctype: Thuộc tính này xác định cách mã hóa dữ liệu khi gửi"
        });

        //Html Nâng Cao
        DESCRIPTION_MAP.put("Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", new String[]{
            "HTML semantic là cách viết mã HTML để tăng tính dễ hiểu và dễ truy cập của trang web",
            "Thẻ <header> không chỉ chứa thông tin tiêu đề, mà còn là một phần quan trọng của trang web",
            "Thẻ <footer> là phần cuối cùng của trang, chứa các thông tin quan trọng nhưng không phải là phần nội dung chính",
            "Thẻ <nav> đóng vai trò là khu vực nhóm các liên kết điều hướng chính của trang web",
            "Thẻ <article> thường được dùng để nhóm các phần nội dung có thể tái sử dụng và độc lập",
            "Thẻ <section> được sử dụng để chia nhỏ nội dung thành các phần có liên quan"
        });
        DESCRIPTION_MAP.put("Ứng dụng Semantic HTML để tối ưu SEO", new String[]{
            "Semantic HTML là việc sử dụng các thẻ HTML có ý nghĩa rõ ràng, giúp công cụ tìm kiếm và trình duyệt hiểu rõ hơn",
            "Hỗ trợ công cụ tìm kiếm hiểu rõ cấu trúc và nội dung của trang web",
            "Nâng cao độ chính xác trong lập chỉ mục và cải thiện trải nghiệm người dùng",
            "Tối ưu hóa cho tìm kiếm bằng giọng nói và trải nghiệm trên thiết bị di động"
        });
        DESCRIPTION_MAP.put("Sử dụng <meta> để tối ưu công cụ tìm kiếm", new String[]{
            "Khai báo bảng mã ký tự (charset)",
            "Meta Title chính là tiêu đề xuất hiện trên tab trình duyệt và trong kết quả tìm kiếm Google.",
            "Thẻ Meta Robots chỉ dẫn cho công cụ tìm kiếm (Google, Bing...) cách xử lý trang web của bạn",
            "Thẻ Meta Charset dùng để xác định bộ mã ký tự của trang web."
        });
        DESCRIPTION_MAP.put("Open Graph, Twitter Card", new String[]{
            "Open Graph và Twitter Card là các thẻ <meta> đặc biệt giúp cải thiện cách thức chia sẻ nội dung của trang web",
            "Open Graph là giao thức được Facebook phát triển để giúp các trang web hiển thị nội dung",
            "Twitter Card hoạt động tương tự như Open Graph nhưng dành riêng cho Twitter"
        });
        DESCRIPTION_MAP.put("Favicon, Sitemap, robots.txt", new String[]{
            "Favicon là biểu tượng nhỏ hiển thị trên thanh tiêu đề của trình duyệt, trong tab của cửa sổ trình duyệt",
            "Sitemap (sơ đồ trang web) là một tệp XML chứa danh sách tất cả các trang quan trọng trên website của bạn",
            "Tệp robots.txt giúp bạn kiểm soát các bot của công cụ tìm kiếm về những trang nào có thể"
        });
        DESCRIPTION_MAP.put("Local Storage & Session Storage", new String[]{
            "Local Storage cung cấp không gian lưu trữ không giới hạn (tùy thuộc vào trình duyệt)",
            "Session Storage là một loại lưu trữ tạm thời, chỉ lưu trữ dữ liệu trong suốt phiên duyệt web"
        });
        DESCRIPTION_MAP.put("Geolocation API (Xác định vị trí người dùng)", new String[]{
            "Geolocation API là một công nghệ mạnh mẽ trong HTML5 cho phép các trang web xác định vị trí của người dùng thông qua GPS",
            "Geolocation API cho phép truy xuất thông tin về vị trí của người dùng, bao gồm vĩ độ, kinh độ và đôi khi là độ cao và độ chính xác của vị trí",
            "SEO gián tiếp là những tác động hoặc hoạt động không trực tiếp liên quan đến việc tối ưu hóa nội dung hay từ khóa"
        });
        DESCRIPTION_MAP.put("Drag & Drop API", new String[]{
            "Drag & Drop API là một tính năng mạnh mẽ trong JavaScript cho phép người dùng kéo và thả các phần tử trực tiếp trên trang web",
            "Drag & Drop API cung cấp các sự kiện và phương thức để người dùng có thể kéo các phần tử",
            "Mặc dù Drag & Drop API không ảnh hưởng trực tiếp đến SEO, nhưng việc cung cấp trải nghiệm người dùng mượt mà và dễ dàng sẽ gián tiếp cải thiện SEO"
        });

        //CSS Cơ Bản
        DESCRIPTION_MAP.put("Inline CSS, Internal CSS, External CSS", new String[]{
            "Là cách thêm CSS trực tiếp vào thẻ HTML bằng thuộc tính style.",
            "CSS được viết bên trong file HTML, trong thẻ <style> trong phần <head>",
            "CSS được viết trong một file .css riêng biệt, sau đó liên kết với HTML bằng thẻ "
        });
        DESCRIPTION_MAP.put("Cú pháp CSS cơ bản", new String[]{
            "CSS sử dụng cú pháp dạng selector { property: value; } để áp dụng kiểu dáng cho các phần tử HTML",
            "Một quy tắc CSS bao gồm ba phần chính:",
            "CSS cung cấp nhiều cách để chọn phần tử:"
        });
        DESCRIPTION_MAP.put("Selectors cơ bản: class, id, tag, attribute", new String[]{
            "Chọn tất cả các phần tử có cùng loại thẻ.",
            "Chọn phần tử theo class.",
            "Chọn phần tử theo id.",
            "Chọn phần tử theo thuộc tính"
        });
        DESCRIPTION_MAP.put("Đơn vị đo lường trong CSS: px, %, em, rem, vw, vh", new String[]{
            "Các đơn vị này có giá trị cố định, không phụ thuộc vào phần tử cha hoặc viewport",
            "Các đơn vị này phụ thuộc vào phần tử cha hoặc kích thước viewport."
        });
        DESCRIPTION_MAP.put("Margin, Border, Padding, Content – CSS Box Model", new String[]{
            "Mỗi phần tử HTML có thể được coi như một hộp gồm 4 thành phần chính"
        });
        DESCRIPTION_MAP.put("Các thuộc tính width, height, max-width, min-height", new String[]{
            "width → Chiều rộng phần tử",
            "max-width → Giới hạn chiều rộng tối đa."
        });
        DESCRIPTION_MAP.put("Positioning (static, relative, absolute, fixed, sticky)", new String[]{
            "static (mặc định): Phần tử xuất hiện theo thứ tự tự nhiên trong tài liệu",
            "Mô tả: Đây là giá trị mặc định của thuộc tính position trong CSS. Khi phần tử có position: static",
            "Hiển thị trên kết quả tìm kiếm: Meta Title là tiêu đề chính của trang web bạn. Nó xuất hiện trong kết quả tìm kiếm Google và trong tab trình duyệt."
        });
        DESCRIPTION_MAP.put("Màu HEX, RGB, HSL", new String[]{
            "HEX là hệ màu cơ bản nhất, được sử dụng rộng rãi vì ngắn gọn và dễ sử dụng",
            "RGB hoạt động dựa trên ánh sáng, thích hợp cho thiết kế màn hình điện tử.",
            "HSL được dHệ màu HSLùng nhiều trong thiết kế vì trực quan hơn HEX và RGB."
        });
        DESCRIPTION_MAP.put("Font-family, font-size, font-weight", new String[]{
            "CSS hỗ trợ 2 loại font chính:",
            "Đơn vị phổ biến: px, em, rem, %",
            "100 = Mỏng nhất"
        });
        DESCRIPTION_MAP.put("Line-height, letter-spacing", new String[]{
            "Mặc định là 1.2 hoặc 1.4, có thể tùy chỉnh theo nhu cầu.",
            "Giá trị dương làm giãn chữ, tạo khoảng cách rộng giữa các ký tự.",
            "Line-height có thể được sử dụng để cải thiện khả năng đọc của đoạn văn bản, đặc biệt là khi văn bản dài."
        });
        DESCRIPTION_MAP.put("display: block, inline, inline-block, flex, grid", new String[]{
            "Một phần tử block luôn chiếm toàn bộ chiều ngang của vùng chứa nó.",
            "Phần tử inline chỉ chiếm không gian đúng bằng nội dung bên trong nó.",
            "Kết hợp đặc tính của block và inline.",
            "Flexbox giúp căn chỉnh nội dung linh hoạt theo hàng hoặc cột",
            "Grid giúp tạo layout phức tạp dễ dàng hơn so với flexbox."
        });
        DESCRIPTION_MAP.put("Viewport meta tag", new String[]{
            "Viewport là vùng hiển thị của trang web trên trình duyệt. Trên máy tính, thường rộng hơn 1000px, nhưng trên điện thoại có thể nhỏ hơn 400px.",
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">",
            "width=device-width: Đảm bảo trang web vừa với mọi kích thước màn hình",
            "Viewport meta tag là một thẻ quan trọng trong việc tối ưu hóa trang web cho thiết bị di động, giúp trang web của bạn hiển thị tốt trên các màn hình có kích thước khác nhau."
        });

        //CSS Nâng Cao
        DESCRIPTION_MAP.put("display: flex", new String[]{
            "display: flex là thuộc tính trong CSS giúp tạo ra một mô hình bố cục linh hoạt cho các phần tử con của một thẻ cha",
            "flex-direction: Xác định hướng của các phần tử con, có thể là row (ngang), column (dọc), row-reverse hoặc column-reverse."
        });
        DESCRIPTION_MAP.put("Căn chỉnh bằng justify-content, align-items, align-self", new String[]{
            "justify-content điều chỉnh sự phân bổ không gian theo chiều ngang (trục chính) của các phần tử con trong một container flex.",
            "align-items điều chỉnh cách các phần tử con được căn chỉnh theo chiều dọc (trục phụ) trong một container flex",
            "align-self là một thuộc tính của các phần tử con trong một container flex, cho phép bạn ghi đè giá trị của align-items cho từng phần tử con riêng biệt."
        });
        DESCRIPTION_MAP.put("flex-wrap, flex-direction", new String[]{
            "Trong Flexbox, thuộc tính flex-wrap quyết định liệu các phần tử trong container có nên gói lại (wrap) khi không đủ không gian trong một dòng hay không.",
            "flex-direction xác định chiều của trục chính trong container Flexbox. Trục chính là hướng mà các phần tử sẽ được sắp xếp, có thể là chiều ngang hoặc chiều dọc."
        });
        DESCRIPTION_MAP.put("display: grid", new String[]{
            "display: grid là một kỹ thuật CSS tiên tiến giúp tạo ra các bố cục 2 chiều (2D). Khác với Flexbox, vốn chủ yếu xử lý bố cục theo chiều một chiều (hàng hoặc cột)",
            "grid-template-columns: Thuộc tính này cho phép bạn xác định số lượng và kích thước của các cột trong lưới. Bạn có thể sử dụng các đơn vị như px, fr, %, v.v."
        });
        DESCRIPTION_MAP.put("grid-template-columns, grid-template-rows, gap, align-items, justify-content", new String[]{
            "CSS Grid Layout là một hệ thống bố cục mạnh mẽ trong CSS, cho phép bạn dễ dàng tạo ra các bố cục phức tạp và linh hoạt trên trang web",
            "grid-template-columns: Xác định số lượng và kích thước của các cột trong lưới",
            "Thuộc tính này giúp bạn định nghĩa chiều rộng của từng cột trong lưới."
        });
        DESCRIPTION_MAP.put("Media Queries (@media)", new String[]{
            "Media Queries là một kỹ thuật trong CSS cho phép bạn áp dụng các kiểu dáng khác nhau dựa trên các đặc điểm của thiết bị hoặc cửa sổ trình duyệt",
            "Một media query được viết dưới dạng @media với điều kiện xác định trong dấu ngoặc đơn, và các kiểu CSS được áp dụng khi điều kiện đó thỏa mãn.",
            "Responsive Web Design (RWD): Media queries là yếu tố quan trọng trong thiết kế web đáp ứng, giúp trang web tự động điều chỉnh giao diện phù hợp với từng loại thiết bị"
        });
        DESCRIPTION_MAP.put("Mobile-first vs. Desktop-first", new String[]{
            "Mobile-first là một cách tiếp cận trong thiết kế web, nơi mà bạn bắt đầu xây dựng giao diện cho các thiết bị di động trước (nhỏ nhất)",
            "Desktop-first là một phương pháp thiết kế ngược lại với mobile-first, nơi bạn bắt đầu thiết kế cho màn hình lớn trước",
            "Mobile-first ưu tiên khả năng sử dụng trên thiết bị di động và giúp tối ưu hóa cho thiết bị di động từ đầu"
        });
        DESCRIPTION_MAP.put("CSS Container Queries", new String[]{
            "CSS Container Queries là một tính năng mới trong CSS cho phép bạn áp dụng các quy tắc CSS dựa trên kích thước của phần tử cha (container) thay vì toàn bộ viewport (như Media Queries)"
        });
        DESCRIPTION_MAP.put("transition, animation, keyframes", new String[]{
            "Trong HTML/CSS, transition là một thuộc tính trong CSS giúp tạo hiệu ứng chuyển đổi mượt mà giữa các trạng thái khác nhau của một phần tử khi một thuộc tính CSS thay đổi.",
            "animation là một thuộc tính CSS dùng để tạo ra chuỗi chuyển động có nhiều bước, được kiểm soát qua keyframes (khung hình chính).",
            "@keyframes dùng để định nghĩa từng bước chuyển động trong một animation."
        });
        DESCRIPTION_MAP.put("Hover effect nâng cao", new String[]{
            "Hover Effect (hiệu ứng di chuột) là kỹ thuật thay đổi giao diện của một phần tử khi người dùng di chuột vào nó."
        });
        DESCRIPTION_MAP.put(":nth-child(), :not(), :focus-within", new String[]{
            ":nth-child(n) giúp chọn một phần tử con dựa trên vị trí của nó.",
            ":not() giúp bạn loại trừ một phần tử khỏi CSS rule.",
            ":focus-within giúp bạn chọn một phần tử cha nếu có một phần tử con bên trong được focus."
        });
        DESCRIPTION_MAP.put("Pseudo-elements (::before, ::after)", new String[]{
            "Pseudo-elements trong CSS cho phép bạn chèn nội dung vào trước hoặc sau một phần tử mà không cần thay đổi HTML"
        });

        //CSS Chuyên Nghiệp
        DESCRIPTION_MAP.put("BEM (Block Element Modifier)", new String[]{
            "Đây là một phương pháp đặt tên class CSS để chia nhỏ giao diện thành các khối độc lập, giúp dễ tái sử dụng, dễ đọc và tránh trùng lặp class."
        });
        DESCRIPTION_MAP.put("OOCSS (Object-Oriented CSS)", new String[]{
            "OOCSS (Object-Oriented CSS) là một phương pháp giúp tổ chức CSS theo cách hướng đối tượng, giúp tăng khả năng tái sử dụng code."
        });
        DESCRIPTION_MAP.put("SMACSS (Scalable and Modular Architecture for CSS)", new String[]{
            "Nếu không có hệ thống quản lý CSS rõ ràng, bạn sẽ gặp phải"
        });
        DESCRIPTION_MAP.put("Biến trong CSS (--main-color)", new String[]{
            "Dễ thay đổi: Chỉ cần thay đổi giá trị một lần là toàn bộ trang web cập nhật theo"
        });
        DESCRIPTION_MAP.put("Nested Rules, Mixins, Functions", new String[]{
            "Khi viết CSS thuần, bạn phải lặp lại nhiều class giống nhau",
            "Một số thuộc tính CSS thường xuyên được sử dụng, như border-radius, box-shadow, flexbox",
            "Function trong SCSS giúp xử lý các phép toán hoặc tạo giá trị CSS động"
        });
        DESCRIPTION_MAP.put("Tối ưu hóa mã CSS với SCSS", new String[]{
            "Nếu trang web của bạn có nhiều màu sắc giống nhau, việc sử dụng biến giúp bạn thay đổi dễ dàng hơn"
        });
        DESCRIPTION_MAP.put("Minify CSS", new String[]{
            "Minify CSS là quá trình loại bỏ tất cả các ký tự không cần thiết trong mã CSS mà không làm thay đổi cách mà mã đó hoạt động."
        });
        DESCRIPTION_MAP.put("Load Font Tối ưu", new String[]{
            "Tải font không cần thiết: Tải tất cả các font gia đình và các kiểu chữ mà bạn không sử dụng sẽ làm trang web nặng hơn"
        });
        DESCRIPTION_MAP.put("Critical CSS & Lazy Loading", new String[]{
            "Critical CSS là kỹ thuật giúp tải trước các phần CSS quan trọng để đảm bảo rằng nội dung hiển thị một cách nhanh chóng",
            "Lazy loading là một kỹ thuật tối ưu hóa giúp trì hoãn việc tải các tài nguyên không cần thiết (như hình ảnh, video, và các file CSS hoặc JavaScript không phải quan trọng ngay lập tức)"
        });
        DESCRIPTION_MAP.put("Bootstrap", new String[]{
            "Bootstrap là một thư viện mã nguồn mở phổ biến được sử dụng để phát triển giao diện người dùng (UI) cho web"
        });
        DESCRIPTION_MAP.put("Tailwind CSS", new String[]{
            "Tailwind CSS là một framework CSS tiện lợi và mạnh mẽ, nhưng khác biệt với các framework truyền thống như Bootstrap"
        });
        DESCRIPTION_MAP.put("ARIA Roles", new String[]{
            "ARIA (Accessible Rich Internet Applications) là gì?  là một bộ tiêu chuẩn giúp cải thiện truy cập và hỗ trợ người khuyết tật trên các ứng dụng web và các trang web động"
        });
        DESCRIPTION_MAP.put("Keyboard Navigation", new String[]{
            "Keyboard Navigation là một kỹ thuật quan trọng trong việc thiết kế web để đảm bảo tính khả dụng và truy cập cho tất cả người dùng"
        });
        DESCRIPTION_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new String[]{
            "Dark Mode (chế độ tối) là một tính năng giao diện người dùng phổ biến hiện nay, cho phép người dùng chuyển từ giao diện sáng sang giao diện tối",
            "Giảm mỏi mắt và căng thẳng thị giác",
            "Cho phép người dùng lựa chọn chế độ tối"
        });
        DESCRIPTION_MAP.put("Tạo hình ảnh, animations phức tạp bằng CSS", new String[]{
            "Sử dụng Shapes (Hình học)",
            "CSS cung cấp transitions và animations giúp tạo ra các hiệu ứng chuyển động mượt mà và động cho các phần tử khi thay đổi trạng thái."});
        DESCRIPTION_MAP.put("CSS Art & Pure CSS Illustrations", new String[]{
            "CSS Art là một kỹ thuật thú vị mà các nhà phát triển sử dụng CSS để tạo ra các hình ảnh và minh họa mà không cần sử dụng hình ảnh tĩnh",
            "Pure CSS Illustrations"
        });

        //Ứng Dụng & Dự Án Thực Tế
        DESCRIPTION_MAP.put("Blog cá nhân", new String[]{
            "Blog cá nhân là một dạng website hoặc nền tảng trực tuyến mà người viết có thể chia sẻ các bài viết, suy nghĩ, kinh nghiệm cá nhân",
            "Chủ đề và nội dung: Một blog cá nhân thường xoay quanh một hoặc nhiều chủ đề mà người viết cảm thấy đam mê."
        });
        DESCRIPTION_MAP.put("Landing Page sản phẩm", new String[]{
            "Landing page sản phẩm là một loại trang web thiết kế để khuyến khích người dùng thực hiện một hành động cụ thể",
            "Tiêu đề hấp dẫn: Tiêu đề là phần đầu tiên mà người truy cập nhìn thấy, và nó cần phải gây ấn tượng ngay lập tức"
        });
        DESCRIPTION_MAP.put("Web bán hàng cơ bản", new String[]{
            "Web bán hàng cơ bản là một trang web được thiết kế với mục đích chính là bán sản phẩm hoặc dịch vụ trực tuyến.",
            "Danh mục sản phẩm: Website bán hàng cần có danh mục sản phẩm rõ ràng, giúp khách hàng dễ dàng tìm kiếm và lựa chọn sản phẩm mình muốn mua"
        });
        DESCRIPTION_MAP.put("Hiệu ứng scroll, parallax", new String[]{
            "Hiệu ứng scroll là khi một yếu tố trên trang web thay đổi hoặc di chuyển khi người dùng cuộn trang xuống.",
            "Parallax là một kỹ thuật thiết kế web trong đó các phần tử trên trang di chuyển với tốc độ khác nhau khi người dùng cuộn trang xuống",
            "Trang chủ của các website giới thiệu: Parallax và hiệu ứng scroll có thể được sử dụng để tạo ra một trang chủ ấn tượng cho các website của công ty"
        });
        DESCRIPTION_MAP.put("Dark Mode", new String[]{
            "Dark Mode (chế độ tối) là một tính năng giao diện người dùng giúp thay đổi màu sắc nền của các ứng dụng hoặc trang web từ màu sáng sang màu tối",
            "Giảm căng thẳng mắt: Một trong những lý do chính mà người dùng yêu thích Dark Mode là nó giúp giảm bớt ánh sáng xanh và độ chói của màn hình",
            "CSS (Cascading Style Sheets): Trong phát triển web, chế độ tối có thể được triển khai thông qua CSS bằng cách sử dụng các thuộc tính như @media"
        });
        DESCRIPTION_MAP.put("Animation nâng cao", new String[]{
            "Animation nâng cao là trong phát triển web là việc sử dụng các kỹ thuật động (animation) phức tạp để tạo ra hiệu ứng trực quan thú vị và tương tác mượt mà.",
            "CSS Animations: Các animation cơ bản có thể được tạo ra chỉ bằng CSS. Bạn có thể sử dụng thuộc tính @keyframes",
            "Thu hút sự chú ý: Các animation có thể giúp làm nổi bật các phần tử quan trọng trên trang web, chẳng hạn như nút CTA (Call-to-Action), các sản phẩm hoặc dịch vụ nổi bật"
        });
        DESCRIPTION_MAP.put("Tạo manifest.json", new String[]{
            "Manifest.json là một tệp cấu hình quan trọng trong phát triển web, đặc biệt là trong việc xây dựng PWA (Progressive Web App)",
            "Tên ứng dụng (name): Đây là tên chính của ứng dụng hoặc trang web khi được hiển thị trên màn hình chính của người dùng hoặc trong danh sách ứng dụng"
        });
        DESCRIPTION_MAP.put("Service Worker & Caching", new String[]{
            "Service Worker là một kỹ thuật trong Progressive Web Apps (PWA), cho phép ứng dụng web của bạn hoạt động offline hoặc trên các mạng không ổn định.",
            "Service Worker là gì?",
            "Caching giúp ứng dụng hoạt động offline: Service Worker có thể lưu trữ các tệp tĩnh (HTML, CSS, JavaScript, hình ảnh) trong cache",
            "Hoạt động offline: Khi mạng không có sẵn, ứng dụng vẫn có thể phục vụ các tài nguyên đã được cache trước đó"
        });
        DESCRIPTION_MAP.put("Offline Mode & Push Notifications", new String[]{
            "Offline Mode là tính năng giúp người dùng tiếp tục sử dụng ứng dụng web ngay cả khi không có kết nối internet.",
            "Cung cấp trải nghiệm offline: Khi mạng không có sẵn hoặc không ổn định, Service Worker và Caching (được đề cập ở mục trước) giúp lưu trữ các tài nguyên tĩnh ",
            "Push Notifications là một phương thức truyền thông mà qua đó ứng dụng web hoặc di động có thể gửi thông báo cho người dùng ngay cả khi họ không mở ứng dụng.",
            "Gửi thông báo ngay cả khi ứng dụng không mở: Push notifications giúp gửi thông báo trực tiếp đến thiết bị của người dùng"
        });
        
        // JavaScript Cơ Bản
        DESCRIPTION_MAP.put("Giới thiệu Javascript", new String[]{
            "JavaScript là một ngôn ngữ lập trình phổ biến dùng để tạo hiệu ứng động cho trang web. Đây là một trong ba công nghệ cốt lõi của lập trình web cùng với HTML và CSS.",
            "JavaScript là một trong những ngôn ngữ lập trình phổ biến nhất thế giới, được hỗ trợ rộng rãi bởi các trình duyệt web. Việc học JavaScript giúp bạn phát triển các trang web tương tác, ứng dụng web và thậm chí cả ứng dụng di động.",
            "Có nhiều cách để nhúng JavaScript vào trang web, bao gồm viết trực tiếp trong thẻ `<script>` trong HTML hoặc sử dụng file `.js` bên ngoài để giúp mã nguồn gọn gàng hơn.",
            "Một số công cụ phổ biến giúp lập trình JavaScript dễ dàng hơn bao gồm trình duyệt với DevTools, các trình soạn thảo code như VS Code, và các thư viện hỗ trợ như jQuery, React, hoặc Vue.js.",
            "Luyện tập với các bài tập đơn giản như hiển thị thông báo bằng `alert()`, thay đổi nội dung HTML bằng JavaScript, và xử lý sự kiện click chuột để làm quen với ngôn ngữ này."
        });
        DESCRIPTION_MAP.put("Cách nhúng JavaScript vào HTML", new String[]{
            "Có nhiều cách để nhúng JavaScript vào trang HTML, mỗi cách có ưu điểm riêng và phù hợp với từng tình huống cụ thể.",
            "Bạn có thể viết JavaScript trực tiếp trong thẻ `<script>` trong HTML để thực hiện các đoạn mã nhỏ.",
            "Sử dụng JavaScript trong các thuộc tính HTML như `onclick` giúp tạo ra các tương tác đơn giản mà không cần viết nhiều mã.",
            "Cách nhúng tốt nhất là sử dụng file `.js` bên ngoài để giúp mã nguồn HTML sạch hơn, dễ bảo trì và tái sử dụng.",
            "Bạn sẽ thực hành với các ví dụ cụ thể để hiểu rõ hơn về cách nhúng JavaScript vào HTML."
        });

        DESCRIPTION_MAP.put("Biến và Kiểu dữ liệu trong JavaScript", new String[]{
            "Biến là một phần quan trọng trong lập trình JavaScript, giúp lưu trữ dữ liệu để sử dụng trong chương trình.",
            "JavaScript hỗ trợ nhiều kiểu dữ liệu như `number`, `string`, `boolean`, `object`, `array` và `null`.",
            "Ép kiểu dữ liệu giúp chuyển đổi giữa các loại dữ liệu khác nhau để đảm bảo chương trình hoạt động chính xác.",
            "Có nhiều cách kiểm tra kiểu dữ liệu trong JavaScript như `typeof`, `instanceof`, giúp lập trình viên xử lý dữ liệu linh hoạt hơn.",
            "Bạn sẽ thực hành khai báo biến, sử dụng các kiểu dữ liệu khác nhau và kiểm tra kiểu dữ liệu trong JavaScript."
        });

        DESCRIPTION_MAP.put("Toán tử và Cấu trúc điều kiện trong JavaScript", new String[]{
            "Toán tử giúp thực hiện các phép toán trên dữ liệu, bao gồm toán tử số học, so sánh, logic, gán, và toán tử đặc biệt như `typeof`, `instanceof`.",
            "Cấu trúc điều kiện như `if`, `else if`, `else`, `switch-case` giúp kiểm soát luồng chương trình dựa trên các điều kiện cụ thể.",
            "Toán tử logic như `&&`, `||`, `!` thường được kết hợp với câu lệnh điều kiện để xử lý nhiều trường hợp khác nhau.",
            "Bạn sẽ thực hành sử dụng toán tử và cấu trúc điều kiện để tạo ra các chương trình linh hoạt, có khả năng xử lý nhiều tình huống thực tế."
        });

        DESCRIPTION_MAP.put("Vòng lặp và Mảng trong JavaScript", new String[]{
            "Vòng lặp giúp thực hiện một đoạn mã nhiều lần, giúp tiết kiệm thời gian và làm cho mã ngắn gọn hơn.",
            "JavaScript có các vòng lặp phổ biến như `for`, `while`, `do...while`, `for...of`, và `forEach` để duyệt qua danh sách dữ liệu.",
            "Mảng là một kiểu dữ liệu quan trọng, giúp lưu trữ nhiều giá trị trong một biến duy nhất.",
            "Bạn sẽ tìm hiểu cách khai báo, truy cập phần tử, thêm, sửa, xóa phần tử trong mảng.",
            "Bài tập thực hành sẽ giúp bạn làm quen với vòng lặp và cách làm việc với mảng trong JavaScript."
        });

        DESCRIPTION_MAP.put("Hàm và Phạm vi biến trong JavaScript", new String[]{
            "Hàm giúp tổ chức mã nguồn một cách khoa học, giúp tái sử dụng và quản lý chương trình dễ dàng hơn.",
            "Có nhiều cách khai báo hàm trong JavaScript như `function declaration`, `function expression`, và `arrow function`.",
            "Phạm vi biến xác định nơi biến có thể được truy cập, gồm `global scope`, `function scope`, và `block scope`.",
            "Hiểu về `hoisting` và `closure` sẽ giúp bạn viết mã JavaScript hiệu quả hơn.",
            "Bạn sẽ thực hành định nghĩa hàm, truyền tham số, trả về giá trị và làm việc với phạm vi biến."
        });

        DESCRIPTION_MAP.put("Thực hành: Xây dựng trò chơi nhỏ", new String[]{
            "Dự án thực hành giúp bạn áp dụng các kiến thức đã học để tạo ra một trò chơi nhỏ bằng JavaScript.",
            "Bạn sẽ sử dụng các biến, kiểu dữ liệu, toán tử, vòng lặp, mảng và hàm để xây dựng trò chơi đơn giản.",
            "Trò chơi sẽ có các yếu tố tương tác như xử lý sự kiện bàn phím, chuột, cập nhật nội dung trang web theo thời gian thực.",
            "Việc làm dự án giúp bạn hiểu rõ cách JavaScript hoạt động trong môi trường thực tế.",
            "Sau bài này, bạn sẽ có một sản phẩm hoàn chỉnh, có thể cải tiến thêm để nâng cao kỹ năng lập trình."
        });

// JavaScript Nâng Cao
        DESCRIPTION_MAP.put("Vòng lặp và Hàm", new String[]{
            "Vòng lặp là một công cụ quan trọng giúp thực hiện các thao tác lặp đi lặp lại trên tập hợp dữ liệu. JavaScript hỗ trợ các vòng lặp như `for`, `while`, `do...while` và `forEach`.",
            "Hàm trong JavaScript giúp chia chương trình thành các phần nhỏ, dễ quản lý hơn. Có hai cách khai báo hàm: Function Declaration và Function Expression. Ngoài ra, ES6 giới thiệu Arrow Function giúp viết hàm ngắn gọn hơn."
        });

        DESCRIPTION_MAP.put("Lập trình hướng đối tượng (OOP)", new String[]{
            "OOP là một mô hình lập trình dựa trên các đối tượng, giúp tổ chức code tốt hơn, dễ bảo trì và mở rộng.",
            "Đối tượng và Lớp (Object & Class): JavaScript sử dụng prototype để tạo đối tượng, ES6 bổ sung từ khóa class giúp định nghĩa lớp dễ dàng hơn.",
            "Tính kế thừa (Inheritance): Cho phép một lớp kế thừa các thuộc tính và phương thức của lớp khác.",
            "Đóng gói (Encapsulation): Bảo vệ dữ liệu của đối tượng bằng cách giới hạn quyền truy cập.",
            "Đa hình (Polymorphism): Cho phép ghi đè phương thức của lớp cha trong lớp con.",
            "Tính trừu tượng (Abstraction): Giúp ẩn bớt chi tiết không cần thiết và chỉ hiển thị các phần quan trọng."
        });

        DESCRIPTION_MAP.put("Closure và Hoisting", new String[]{
            "Closure là một hàm có thể truy cập các biến trong phạm vi của nó ngay cả khi phạm vi đó đã kết thúc. Điều này giúp tạo ra các hàm có trạng thái riêng.",
            "Hoisting là cơ chế giúp JavaScript di chuyển khai báo biến (`var`, `let`, `const`) và hàm (`function`) lên đầu phạm vi trước khi thực thi code, tránh lỗi khi sử dụng biến hoặc hàm trước khi khai báo."
        });

        DESCRIPTION_MAP.put("ES6+ và Các tính năng mới", new String[]{
            "ES6+ (ECMAScript 2015 trở lên) mang đến nhiều cải tiến giúp JavaScript hiện đại và dễ đọc hơn.",
            "Một số tính năng mới bao gồm: `let` và `const` thay thế `var`, template literals giúp nối chuỗi dễ dàng hơn, destructuring assignment giúp trích xuất giá trị từ mảng và đối tượng nhanh hơn."
        });

        DESCRIPTION_MAP.put("Xử lý lỗi và Debugging", new String[]{
            "Xử lý lỗi là một phần quan trọng trong lập trình giúp ứng dụng hoạt động ổn định và dễ bảo trì.",
            "Cách bắt lỗi với `try...catch`: Cho phép xử lý lỗi một cách an toàn mà không làm gián đoạn chương trình.",
            "Sử dụng `throw` để tạo lỗi tùy chỉnh giúp kiểm soát lỗi theo cách riêng.",
            "Debugging với `console.log()` và `console.error()` giúp kiểm tra dữ liệu trong quá trình chạy chương trình.",
            "Debugging bằng Developer Tools trong trình duyệt giúp kiểm tra code trực tiếp, đặt breakpoint, xem biến và theo dõi luồng thực thi của chương trình."
        });

        DESCRIPTION_MAP.put("Thực hành: Xây dựng ứng dụng To-Do List", new String[]{
            "Giới thiệu: To-Do List là một ứng dụng giúp người dùng quản lý danh sách công việc cần làm. Bài thực hành này sẽ giúp bạn rèn luyện các kỹ năng JavaScript cơ bản và nâng cao.",
            "Xây dựng giao diện HTML: Tạo một trang web đơn giản với danh sách công việc, ô nhập liệu và các nút chức năng.",
            "Viết mã JavaScript: Thêm chức năng cho ứng dụng, bao gồm thêm, xóa, đánh dấu hoàn thành công việc.",
            "Cải tiến - Lưu công việc vào LocalStorage: Giúp danh sách công việc không bị mất khi tải lại trang bằng cách lưu trữ dữ liệu trên trình duyệt."
        });

// JavaScript Chuyên Nghiệp
        DESCRIPTION_MAP.put("Lập trình bất đồng bộ (Asynchronous)", new String[]{
            "Lập trình bất đồng bộ giúp JavaScript thực thi các tác vụ không đồng bộ như gọi API, đọc tệp, hoặc xử lý dữ liệu mà không chặn chương trình.",
            "`setTimeout` và `setInterval` là hai hàm giúp trì hoãn và lặp lại một tác vụ sau một khoảng thời gian nhất định.",
            "Callback Function là một kỹ thuật phổ biến để xử lý bất đồng bộ, tuy nhiên có thể dẫn đến Callback Hell khi lồng nhiều hàm.",
            "`Promise` là một giải pháp thay thế cho Callback giúp xử lý bất đồng bộ dễ dàng hơn bằng cách cung cấp trạng thái Pending, Fulfilled, và Rejected.",
            "`Async/Await` giúp viết Promise dễ hiểu hơn bằng cách sử dụng cú pháp đồng bộ, làm cho mã sạch hơn và dễ bảo trì hơn."
        });

        DESCRIPTION_MAP.put("Làm việc với API", new String[]{
            "API (Application Programming Interface) giúp ứng dụng giao tiếp với các dịch vụ bên ngoài, chẳng hạn như lấy dữ liệu từ máy chủ.",
            "`fetch()` là phương thức hiện đại giúp gửi yêu cầu HTTP đến API và nhận dữ liệu về dưới dạng JSON hoặc text.",
            "Gửi dữ liệu lên API bằng `fetch()` với phương thức POST, PUT hoặc DELETE để thêm, sửa, hoặc xóa dữ liệu từ máy chủ.",
            "Xử lý lỗi khi gọi API bằng cách sử dụng `try...catch`, kiểm tra mã trạng thái HTTP, và hiển thị thông báo lỗi cho người dùng."
        });

        DESCRIPTION_MAP.put("DOM và Xử lý sự kiện", new String[]{
            "DOM (Document Object Model) là mô hình cây của trang web, giúp JavaScript truy cập và thay đổi nội dung HTML.",
            "Truy xuất phần tử DOM bằng các phương thức như `getElementById`, `querySelector`, và `getElementsByClassName`.",
            "Thay đổi nội dung và kiểu dáng của phần tử bằng cách chỉnh sửa thuộc tính `innerHTML`, `textContent`, và `style`.",
            "Lắng nghe và xử lý sự kiện như click, nhập liệu bằng `addEventListener`, giúp trang web phản hồi theo hành động của người dùng."
        });

        DESCRIPTION_MAP.put("LocalStorage và SessionStorage", new String[]{
            "LocalStorage và SessionStorage là các API giúp lưu trữ dữ liệu trên trình duyệt mà không cần máy chủ.",
            "Sự khác biệt giữa LocalStorage và SessionStorage: LocalStorage lưu trữ dữ liệu vĩnh viễn, còn SessionStorage chỉ tồn tại trong một phiên làm việc.",
            "Cách sử dụng LocalStorage để lưu trữ dữ liệu lâu dài với `setItem`, `getItem`, và `removeItem`.",
            "Cách sử dụng SessionStorage tương tự LocalStorage nhưng dữ liệu sẽ bị xóa khi đóng trình duyệt.",
            "Ứng dụng thực tế: Lưu thông tin đăng nhập, giỏ hàng, hoặc trạng thái giao diện của trang web."
        });

        DESCRIPTION_MAP.put("Web Workers và Hiệu suất JavaScript", new String[]{
            "Web Workers giúp JavaScript chạy các tác vụ nặng trong nền mà không làm chậm giao diện người dùng.",
            "Web Workers là gì? Đây là các luồng độc lập có thể thực thi mã mà không ảnh hưởng đến luồng chính (main thread).",
            "Cách tạo Web Worker bằng cách sử dụng đối tượng `Worker` và truyền file JavaScript xử lý công việc.",
            "Kết thúc Web Worker bằng phương thức `terminate()` để giải phóng tài nguyên khi không còn cần thiết.",
            "Truyền dữ liệu giữa Main Thread và Worker bằng `postMessage()` và lắng nghe sự kiện `onmessage`.",
            "Ứng dụng thực tế: Xử lý dữ liệu lớn, tải tài nguyên nền, và các tác vụ đòi hỏi nhiều tài nguyên."
        });

        DESCRIPTION_MAP.put("Thực hành: Xây dựng ứng dụng thời tiết", new String[]{
            "Giới thiệu: Ứng dụng thời tiết sẽ hiển thị thông tin thời tiết theo vị trí của người dùng bằng cách gọi API.",
            "Yêu cầu công nghệ: Sử dụng HTML, CSS và JavaScript để xây dựng giao diện và xử lý dữ liệu.",
            "Sử dụng API thời tiết (như OpenWeather API) để lấy dữ liệu thời tiết theo vị trí của người dùng.",
            "Xây dựng giao diện: Thiết kế khung giao diện đẹp mắt với các thành phần như ô tìm kiếm, hiển thị nhiệt độ, độ ẩm, và điều kiện thời tiết.",
            "Xử lý dữ liệu với JavaScript: Gọi API, lấy dữ liệu JSON, xử lý thông tin và hiển thị trên giao diện.",
            "Cải tiến giao diện: Thêm hiệu ứng động, đổi giao diện theo thời gian thực, và tối ưu trải nghiệm người dùng."
        });

// JavaScript - Ứng dụng thực tế
        DESCRIPTION_MAP.put("JavaScript trong dự án Web", new String[]{
            "Giới thiệu về cách JavaScript được sử dụng trong các dự án web hiện đại để tạo ra trải nghiệm tương tác và động.",
            "Cấu trúc một dự án web chuẩn, cách tổ chức file HTML, CSS, JavaScript, và thư mục để tối ưu bảo trì.",
            "Cách nhúng JavaScript vào trang web bằng các phương pháp khác nhau: inline, internal và external script.",
            "Tương tác với HTML và CSS bằng JavaScript để thay đổi nội dung, cập nhật giao diện động mà không cần tải lại trang."
        });

        DESCRIPTION_MAP.put("Framework JavaScript (React, Vue, Node.js)", new String[]{
            "Giới thiệu về các framework phổ biến như React.js, Vue.js và Node.js, giúp tăng hiệu suất và khả năng mở rộng của ứng dụng web.",
            "React.js là thư viện front-end mạnh mẽ do Facebook phát triển, giúp xây dựng giao diện người dùng bằng cách sử dụng component-based architecture.",
            "Vue.js là một framework linh hoạt, dễ học và có cú pháp trực quan, giúp phát triển nhanh các ứng dụng web hiện đại.",
            "Node.js cho phép chạy JavaScript trên server, kết hợp với Express.js để xây dựng API mạnh mẽ và xử lý backend."
        });

        DESCRIPTION_MAP.put("Webpack và tối ưu hiệu suất", new String[]{
            "Webpack là một module bundler giúp gộp các tệp JavaScript, CSS, hình ảnh vào một file duy nhất để tối ưu hiệu suất tải trang.",
            "Cách cài đặt Webpack từ đầu, thiết lập cấu hình cơ bản và tạo file `webpack.config.js`.",
            "Loaders giúp xử lý các tệp như CSS, SCSS, hình ảnh, TypeScript, trong khi Plugins mở rộng chức năng của Webpack.",
            "Tối ưu hiệu suất bằng cách nén file, chia nhỏ bundle (code splitting) và lazy loading để cải thiện tốc độ tải trang."
        });

        DESCRIPTION_MAP.put("Viết Unit Test với Jest", new String[]{
            "Jest là một framework kiểm thử JavaScript phổ biến do Facebook phát triển, giúp kiểm thử ứng dụng hiệu quả.",
            "Cách cài đặt Jest trong dự án bằng npm/yarn và thiết lập môi trường kiểm thử.",
            "Viết bài kiểm thử đơn giản với Jest để đảm bảo các hàm JavaScript hoạt động chính xác.",
            "Kiểm thử bất đồng bộ với Jest bằng cách sử dụng `async/await`, `done()` và `mock promises`.",
            "Kiểm thử với Mock Functions để giả lập các hàm API hoặc các module phức tạp trong ứng dụng."
        });

        DESCRIPTION_MAP.put("Thực hành: Xây dựng ứng dụng Chat thời gian thực", new String[]{
            "Giới thiệu về ứng dụng chat thời gian thực sử dụng WebSocket để trao đổi tin nhắn giữa các người dùng.",
            "Cài đặt môi trường với Node.js, Express.js và WebSocket để xử lý truyền dữ liệu thời gian thực.",
            "Xây dựng Backend sử dụng Express.js và Socket.io để quản lý kết nối người dùng và lưu trữ tin nhắn.",
            "Xây dựng Frontend với HTML, CSS, JavaScript để hiển thị danh sách tin nhắn và hỗ trợ gửi tin nhắn.",
            "Chạy ứng dụng và kiểm thử chức năng chat, đồng thời cải thiện giao diện bằng CSS hoặc framework UI."
        });

        //java co ban
        DESCRIPTION_MAP.put("Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", new String[]{
            "Java là một ngôn ngữ lập trình hướng đối tượng, mạnh mẽ, bảo mật và đa nền tảng.",
            "Ra đời năm 1995 bởi Sun Microsystems, Java nhanh chóng trở thành một trong những ngôn ngữ phổ biến nhất.",
            "Java hoạt động trên mô hình 'Viết một lần, chạy mọi nơi' nhờ máy ảo Java (JVM).",
            "Được sử dụng rộng rãi trong phát triển ứng dụng web, di động, doanh nghiệp và hệ thống nhúng."
        });

        DESCRIPTION_MAP.put("Cấu trúc chương trình Java, cài đặt JDK, IDE", new String[]{
            "Chương trình Java bao gồm các thành phần chính như package, class, method và câu lệnh.",
            "JDK (Java Development Kit) là bộ công cụ cần thiết để biên dịch và chạy mã Java.",
            "IDE (Integrated Development Environment) như IntelliJ IDEA, Eclipse, NetBeans hỗ trợ lập trình Java hiệu quả.",
            "Quá trình cài đặt JDK và IDE giúp thiết lập môi trường phát triển Java hoàn chỉnh."
        });

        DESCRIPTION_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", new String[]{
            "Tìm hiểu về biến, phạm vi của biến và cách khai báo biến trong Java.",
            "Các kiểu dữ liệu cơ bản (int, float, double, char, boolean) và kiểu dữ liệu tham chiếu.",
            "Các toán tử số học, quan hệ, logic, gán, bitwise và toán tử điều kiện trong Java.",
            "Cách nhập dữ liệu từ bàn phím bằng Scanner và xuất dữ liệu ra màn hình bằng System.out."
        });

        DESCRIPTION_MAP.put("Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", new String[]{
            "Sử dụng các cấu trúc điều kiện như if-else, switch-case để điều khiển luồng chương trình.",
            "Các vòng lặp for, while, do-while để lặp qua dữ liệu và thực hiện các tác vụ lặp lại.",
            "Làm việc với mảng một chiều, mảng hai chiều và cách duyệt mảng trong Java.",
            "Xử lý chuỗi với lớp String, các phương thức thao tác chuỗi như nối chuỗi, cắt chuỗi, tìm kiếm ký tự."
        });

        DESCRIPTION_MAP.put("Giới thiệu về ngôn ngữ C", new String[]{
            "Ngôn ngữ C là một ngôn ngữ lập trình bậc cao được phát triển vào những năm 1970.",
            "C là ngôn ngữ nền tảng cho nhiều ngôn ngữ lập trình hiện đại và được sử dụng rộng rãi trong phát triển phần mềm.",
            "C có tính linh hoạt, hiệu suất cao và khả năng truy cập phần cứng."
        });

        DESCRIPTION_MAP.put("Lịch sử và sự phát triển của ngôn ngữ C", new String[]{
            "Ngôn ngữ C được phát triển bởi Dennis Ritchie tại Bell Labs vào năm 1972.",
            "C đã trải qua nhiều phiên bản, từ C89, C99 đến C11 và C18.",
            "C đã ảnh hưởng đến nhiều ngôn ngữ lập trình khác như C++, Java, và C#."
        });

        DESCRIPTION_MAP.put("Đặc điểm và ứng dụng của C", new String[]{
            "C thường được sử dụng để phát triển hệ điều hành, trình biên dịch và phần mềm hệ thống.",
            "C cũng được sử dụng trong lập trình nhúng và phát triển ứng dụng."
        });

        DESCRIPTION_MAP.put("Cấu trúc cơ bản của một chương trình C", new String[]{
            "Một chương trình C cơ bản bao gồm các phần khai báo thư viện, khai báo biến và hàm main.",
            "Biến được khai báo trước khi sử dụng và có thể có nhiều kiểu dữ liệu khác nhau.",
            "Hàm main là điểm bắt đầu của chương trình."
        });

        DESCRIPTION_MAP.put("Quá trình biên dịch và thực thi chương trình C", new String[]{
            "Quá trình biên dịch bao gồm tiền xử lý, biên dịch, liên kết và thực thi.",
            "Trình biên dịch chuyển đổi mã nguồn thành mã máy, trong khi trình liên kết kết hợp các tệp đối tượng.",
            "Sau khi biên dịch, chương trình có thể được thực thi trên máy tính."
        });

        DESCRIPTION_MAP.put("Các câu lệnh điều kiện (if, if-else, switch-case)", new String[]{
            "Câu lệnh if cho phép thực hiện một khối mã nếu điều kiện đúng.",
            "Câu lệnh if-else cho phép thực hiện một khối mã khác nếu điều kiện sai.",
            "Câu lệnh switch-case cho phép kiểm tra nhiều điều kiện khác nhau."
        });

        DESCRIPTION_MAP.put("Các vòng lặp (for, while, do-while)", new String[]{
            "Vòng lặp for thường được sử dụng khi số lần lặp đã biết trước.",
            "Vòng lặp while lặp lại cho đến khi điều kiện sai.",
            "Vòng lặp do-while đảm bảo rằng khối mã được thực thi ít nhất một lần."
        });

        DESCRIPTION_MAP.put("Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", new String[]{
            "Mảng một chiều là một tập hợp các phần tử cùng kiểu dữ liệu, được lưu trữ liên tiếp trong bộ nhớ.",
            "Để khởi tạo mảng, bạn có thể sử dụng cú pháp: `type arrayName[size] = {value1, value2, ...};`, ví dụ: `int arr[5] = {1, 2, 3, 4, 5};`. Truy cập phần tử trong mảng được thực hiện bằng cách sử dụng chỉ số, ví dụ: `arr[0]` để truy cập phần tử đầu tiên."
        });

        DESCRIPTION_MAP.put("Mảng hai chiều: Ứng dụng và thao tác", new String[]{
            "Mảng hai chiều là một mảng có hai chỉ số, thường được sử dụng để lưu trữ dữ liệu dạng bảng.",
            "Có thể truy cập và thao tác với các phần tử của mảng hai chiều bằng cách sử dụng chỉ số hàng và cột."
        });

        DESCRIPTION_MAP.put("Xử lý chuỗi trong C (thư viện string.h)", new String[]{
            "Chuỗi trong C được khai báo như một mảng ký tự và kết thúc bằng ký tự null ('\\0').",
            "Thư viện string.h cung cấp nhiều hàm hữu ích như strlen, strcpy, strcat, và strcmp để xử lý chuỗi.",
            "Có thể so sánh và nối chuỗi bằng các hàm có sẵn trong thư viện string.h."
        });

        DESCRIPTION_MAP.put("Con trỏ: Khái niệm, khai báo, toán tử con trỏ", new String[]{
            "Con trỏ là một biến lưu trữ địa chỉ của một biến khác trong bộ nhớ.",
            "Con trỏ được khai báo bằng cách sử dụng ký hiệu '*' trước tên biến.",
            "Toán tử '&' được sử dụng để lấy địa chỉ của một biến, trong khi toán tử '*' được sử dụng để truy cập giá trị tại địa chỉ mà con trỏ trỏ tới."
        });

        DESCRIPTION_MAP.put("Định nghĩa và sử dụng hàm", new String[]{
            "Hàm được định nghĩa bằng cách chỉ định kiểu trả về, tên hàm và danh sách tham số.",
            "Hàm có thể được gọi từ bất kỳ đâu trong chương trình, miễn là nó đã được định nghĩa trước đó.",
            "Hàm có thể trả về giá trị hoặc không trả về giá trị (void)."
        });

        DESCRIPTION_MAP.put("Truyền tham số vào hàm", new String[]{
            "Tham số có thể được truyền vào hàm theo giá trị, nghĩa là một bản sao của giá trị được gửi đến hàm.",
            "Tham số cũng có thể được truyền theo tham chiếu, cho phép hàm thay đổi giá trị của biến gốc.",
            "Sử dụng con trỏ để truyền tham số cho phép hàm truy cập và thay đổi giá trị của biến bên ngoài."
        });

        DESCRIPTION_MAP.put("Hàm đệ quy", new String[]{
            "Hàm đệ quy là hàm gọi chính nó trong quá trình thực thi.",
            "Hàm đệ quy thường bao gồm một điều kiện dừng để tránh việc gọi vô hạn.",
            "Ví dụ điển hình của hàm đệ quy là tính giai thừa của một số."
        });

        DESCRIPTION_MAP.put("Cấu trúc dữ liệu & file I/O", new String[]{
            "Cấu trúc dữ liệu là cách tổ chức và lưu trữ dữ liệu để có thể sử dụng hiệu quả.",
            "File I/O cho phép chương trình đọc và ghi dữ liệu từ và vào tệp tin.",
            "Các hàm file I/O như fopen, fclose, fread, fwrite, fprintf, và fscanf được sử dụng để thao tác với tệp tin."
        });

        DESCRIPTION_MAP.put("Kiểu dữ liệu struct và union", new String[]{
            "Struct là một kiểu dữ liệu cho phép nhóm nhiều biến khác nhau thành một đơn vị duy nhất.",
            "Union cũng cho phép nhóm nhiều biến, nhưng chỉ một biến có thể được lưu trữ tại một thời điểm.",
            "Sự khác biệt chính giữa struct và union là struct chiếm bộ nhớ cho tất cả các thành viên, trong khi union chỉ chiếm bộ nhớ cho thành viên lớn nhất."
        });

        DESCRIPTION_MAP.put("Danh sách liên kết, ngăn xếp, hàng đợi", new String[]{
            "Danh sách liên kết là một cấu trúc dữ liệu cho phép lưu trữ các phần tử không liên tiếp trong bộ nhớ.",
            "Ngăn xếp là một cấu trúc dữ liệu theo nguyên tắc LIFO (Last In, First Out), cho phép thêm và xóa phần tử từ đầu danh sách.",
            "Hàng đợi là một cấu trúc dữ liệu theo nguyên tắc FIFO (First In, First Out), cho phép thêm phần tử ở cuối và xóa phần tử ở đầu."
        });

        DESCRIPTION_MAP.put("Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", new String[]{
            "Hàm fopen được sử dụng để mở tệp tin và trả về con trỏ đến tệp tin đó.",
            "Hàm fclose được sử dụng để đóng tệp tin đã mở, giải phóng tài nguyên.",
            "Các hàm fread và fwrite được sử dụng để đọc và ghi dữ liệu từ và vào tệp tin, trong khi fprintf và fscanf được sử dụng để định dạng và xử lý dữ liệu."
        });

        //SQL
        DESCRIPTION_MAP.put("Giới thiệu SQL", new String[]{
            "SQL là gì?, lịch sử và ứng dụng của SQL, Các hệ quản trị cơ sở dữ liệu phổ biến",
            "Các khái niệm RDBMS, DATABASE là gì?, cú pháp SQL cơ bản",
            "Kiểu dữ liệu, toán tử, biểu thức(EXPRESSION)"
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
            "Phân vùng dữ liệu, phân vùng theo danh sách giá trị cụ thể, phân vùng theo hàm băm",
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

        //Python
        DESCRIPTION_MAP.put("Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", new String[]{
            "Python là một ngôn ngữ lập trình bậc cao, thông dịch, mạnh mẽ và dễ học",
            "1989 đến nay",
            "Python có cú pháp gần với ngôn ngữ tự nhiên, giúp người mới học dễ tiếp cận hơn so với các ngôn ngữ lập trình khác như C++ hay Java."
        });

        DESCRIPTION_MAP.put("Cấu trúc chương trình Python, cài đặt môi trường và IDE.", new String[]{
            "Cấu trúc",
            "Cài đặt môi trường Python và Cài đặt IDE để lập trình Python"
        });

        DESCRIPTION_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", new String[]{
            "Biến là tên đại diện cho một giá trị trong bộ nhớ. Python không yêu cầu khai báo kiểu dữ liệu trước khi sử dụng biến.",
            "Kiểu dữ liệu số (Numeric Types), Kiểu dữ liệu chuỗi (Text Type), Kiểu dữ liệu chuỗi (Sequence Types), Kiểu dữ liệu ánh xạ (Mapping Type), Kiểu dữ liệu tập hợp (Set Types), Kiểu dữ liệu Boolean (Boolean Type), Kiểu dữ liệu nhị phân (Binary Types), Kiểu dữ liệu None (None Type)",
            "Toán tử số học (Arithmetic Operators), Toán tử so sánh (Comparison Operators), Toán tử gán (Assignment Operators), Toán tử logic (Logical Operators), Toán tử bitwise (Bitwise Operators), Toán tử thành viên (Membership Operators), Toán tử nhận dạng (Identity Operators)",
            "Xuất dữ liệu (Output), Nhập dữ liệu (Input), Đọc/Ghi file (File I/O)"
        });

        DESCRIPTION_MAP.put("Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", new String[]{
            "Cấu trúc điều kiện giúp kiểm tra điều kiện và thực thi các khối lệnh khác nhau tùy vào kết quả kiểm tra.",
            "Vòng lặp giúp thực thi một khối lệnh nhiều lần.",
            "Danh sách là một cấu trúc dữ liệu có thể chứa nhiều phần tử.",
            "Tuple tương tự List nhưng không thể thay đổi giá trị sau khi khởi tạo.",
            "Dictionary lưu dữ liệu dưới dạng cặp key-value."
        });

        DESCRIPTION_MAP.put("Lập trình hướng đối tượng (OOP) trong Python.", new String[]{
            "Lập trình hướng đối tượng (OOP) là một phương pháp lập trình dựa trên việc sử dụng các đối tượng để tổ chức và quản lý mã nguồn."
        });

        DESCRIPTION_MAP.put("Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", new String[]{
            "CSV (Comma-Separated Values) là định dạng phổ biến để lưu trữ dữ liệu dạng bảng.",
            "JSON (JavaScript Object Notation) là định dạng lưu trữ phổ biến, dễ đọc và trao đổi dữ liệu.",
            "XML (Extensible Markup Language) được sử dụng để trao đổi dữ liệu có cấu trúc."
        });

        DESCRIPTION_MAP.put("Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", new String[]{
            "Câu lệnh try-except giúp bắt lỗi và ngăn chặn chương trình bị dừng đột ngột.",
            "Khối finally luôn được thực thi dù có lỗi hay không, giúp thực hiện các thao tác dọn dẹp tài nguyên.",
            "Python cho phép bạn định nghĩa ngoại lệ riêng bằng cách kế thừa từ lớp Exception."
        });

        DESCRIPTION_MAP.put("Lập trình đa luồng và bất đồng bộ (async, threading).", new String[]{
            "Thư viện threading trong Python giúp chạy nhiều luồng đồng thời để tối ưu hiệu suất.",
            "Thư viện asyncio giúp thực thi tác vụ bất đồng bộ mà không cần tạo luồng mới."
        });

        DESCRIPTION_MAP.put("Làm việc với API: requests, BeautifulSoup, Selenium.", new String[]{
            "Thư viện requests giúp gửi các yêu cầu HTTP GET, POST đến API.",
            "BeautifulSoup giúp trích xuất dữ liệu từ trang web bằng HTML.",
            "Selenium giúp thao tác với trình duyệt, tự động nhập dữ liệu và bấm nút."
        });

        DESCRIPTION_MAP.put("Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", new String[]{
            "SQLite là một CSDL nhẹ, dễ sử dụng.",
            "MySQL là một hệ quản trị CSDL phổ biến, được sử dụng trong nhiều ứng dụng thực tế.",
            "PostgreSQL là một hệ quản trị CSDL mạnh mẽ, hỗ trợ nhiều tính năng nâng cao.",
            "SQLAlchemy giúp làm việc với CSDL dễ dàng hơn bằng cách sử dụng ORM (Object-Relational Mapping).",});

        DESCRIPTION_MAP.put("Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", new String[]{
            "pandas là một thư viện mạnh mẽ để thao tác dữ liệu có cấu trúc như bảng và chuỗi thời gian.",
            "numpy là một thư viện hỗ trợ tính toán khoa học và xử lý mảng lớn.",
            "matplotlib là thư viện phổ biến để vẽ biểu đồ và trực quan hóa dữ liệu."
        });

        DESCRIPTION_MAP.put("Lập trình mạng: socket, giao thức TCP/IP, UDP.", new String[]{
            "socket là một giao diện lập trình cho phép giao tiếp giữa các tiến trình qua mạng.",
            "Giao thức TCP/IP trong Python là cách sử dụng thư viện Python để lập trình mạng dựa trên bộ giao thức TCP/IP (Transmission Control Protocol/Internet Protocol) – nền tảng của mọi kết nối Internet. ",
            "UDP không đảm bảo dữ liệu đến đúng thứ tự hoặc không bị mất, nhưng nhanh hơn TCP."
        });

        DESCRIPTION_MAP.put("Xây dựng ứng dụng Web với Flask/Django.", new String[]{
            "Xây dựng ứng dụng web là một trong những ứng dụng phổ biến nhất của Python. Hai framework mạnh mẽ giúp phát triển web nhanh chóng là Flask (nhẹ, linh hoạt) và Django (mạnh mẽ, đầy đủ tính năng)."
        });

        DESCRIPTION_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch.", new String[]{
            "Machine Learning (ML) là một lĩnh vực quan trọng trong khoa học máy tính, giúp máy tính học từ dữ liệu và đưa ra dự đoán. Python là một ngôn ngữ phổ biến để triển khai ML với nhiều thư viện mạnh mẽ như scikit-learn, TensorFlow, PyTorch."
        });

        DESCRIPTION_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            "Tự động hóa là một trong những ứng dụng mạnh mẽ của Python, giúp tiết kiệm thời gian và tăng hiệu suất công việc. Trong bài học này, chúng ta sẽ tìm hiểu cách sử dụng Selenium để tự động hóa trình duyệt web và cách tạo bot Telegram/Discord."
        });

        DESCRIPTION_MAP.put("Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", new String[]{
            "Bảo mật, tối ưu hiệu năng trong Python",
            "Kiểm thử giúp đảm bảo chất lượng mã nguồn. Python có hai thư viện phổ biến là unittest (tích hợp sẵn) và pytest (mạnh mẽ hơn)."
        });

        //Java
        DESCRIPTION_MAP.put("Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", new String[]{
            "Java là một ngôn ngữ lập trình hướng đối tượng, mạnh mẽ, bảo mật và đa nền tảng.",
            "Ra đời năm 1995 bởi Sun Microsystems, Java nhanh chóng trở thành một trong những ngôn ngữ phổ biến nhất.",
            "Java hoạt động trên mô hình 'Viết một lần, chạy mọi nơi' nhờ máy ảo Java (JVM).",
            "Được sử dụng rộng rãi trong phát triển ứng dụng web, di động, doanh nghiệp và hệ thống nhúng."
        });

        DESCRIPTION_MAP.put("Cấu trúc chương trình Java, cài đặt JDK, IDE", new String[]{
            "Chương trình Java bao gồm các thành phần chính như package, class, method và câu lệnh.",
            "JDK (Java Development Kit) là bộ công cụ cần thiết để biên dịch và chạy mã Java.",
            "IDE (Integrated Development Environment) như IntelliJ IDEA, Eclipse, NetBeans hỗ trợ lập trình Java hiệu quả.",
            "Quá trình cài đặt JDK và IDE giúp thiết lập môi trường phát triển Java hoàn chỉnh."
        });

        DESCRIPTION_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", new String[]{
            "Tìm hiểu về biến, phạm vi của biến và cách khai báo biến trong Java.",
            "Các kiểu dữ liệu cơ bản (int, float, double, char, boolean) và kiểu dữ liệu tham chiếu.",
            "Các toán tử số học, quan hệ, logic, gán, bitwise và toán tử điều kiện trong Java.",
            "Cách nhập dữ liệu từ bàn phím bằng Scanner và xuất dữ liệu ra màn hình bằng System.out."
        });

        DESCRIPTION_MAP.put("Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", new String[]{
            "Sử dụng các cấu trúc điều kiện như if-else, switch-case để điều khiển luồng chương trình.",
            "Các vòng lặp for, while, do-while để lặp qua dữ liệu và thực hiện các tác vụ lặp lại.",
            "Làm việc với mảng một chiều, mảng hai chiều và cách duyệt mảng trong Java.",
            "Xử lý chuỗi với lớp String, các phương thức thao tác chuỗi như nối chuỗi, cắt chuỗi, tìm kiếm ký tự."
        });

        //java nang cao
        DESCRIPTION_MAP.put("Lập trình đa luồng, xử lý sự kiện", new String[]{
            "Lập trình đa luồng (Multithreading) giúp chương trình thực thi nhiều tác vụ đồng thời, nâng cao hiệu suất.",
            "Java cung cấp Thread và Runnable để tạo và quản lý luồng.",
            "Đồng bộ hóa (Synchronization) giúp tránh xung đột dữ liệu giữa các luồng.",
            "Xử lý sự kiện trong Java sử dụng các Listener và Event để tương tác với người dùng."
        });

        DESCRIPTION_MAP.put("Lập trình mạng (Socket, TCP/IP, UDP)", new String[]{
            "Lập trình mạng trong Java giúp giao tiếp giữa các thiết bị thông qua các giao thức mạng.",
            "Socket TCP/IP hỗ trợ kết nối đáng tin cậy giữa client và server.",
            "Giao thức UDP cung cấp cách truyền dữ liệu nhanh nhưng không đảm bảo độ tin cậy."
        });

        DESCRIPTION_MAP.put("JDBC: Kết nối cơ sở dữ liệu, CRUD", new String[]{
            "JDBC (Java Database Connectivity) là API để kết nối và thao tác với cơ sở dữ liệu.",
            "Java hỗ trợ kết nối với MySQL, PostgreSQL, SQL Server thông qua JDBC Driver.",
            "CRUD (Create, Read, Update, Delete) là các thao tác chính với dữ liệu trong Java."
        });

        DESCRIPTION_MAP.put("Lập trình Web: Servlet, JSP, MVC", new String[]{
            "Servlet là một thành phần trong Java EE giúp xử lý yêu cầu từ client và tạo phản hồi động.",
            "JSP (JavaServer Pages) cho phép nhúng mã Java vào HTML để tạo trang web linh hoạt.",
            "Mô hình MVC (Model-View-Controller) giúp tổ chức mã nguồn rõ ràng, dễ bảo trì và mở rộng.",
            "Servlet và JSP kết hợp giúp xây dựng ứng dụng web mạnh mẽ, tối ưu hiệu suất và bảo mật."
        });

        //java chuyen nghiep
        DESCRIPTION_MAP.put("Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức", new String[]{
            "Lập trình hướng đối tượng (OOP) là mô hình lập trình dựa trên đối tượng và lớp.",
            "Lớp (Class) là khuôn mẫu để tạo ra các đối tượng, chứa thuộc tính và phương thức.",
            "Constructor là phương thức đặc biệt được gọi khi tạo đối tượng.",
            "Phương thức (Method) giúp thao tác và xử lý dữ liệu trong đối tượng."
        });

        DESCRIPTION_MAP.put("Đóng gói, kế thừa, đa hình, interface, abstract class", new String[]{
            "Đóng gói (Encapsulation) bảo vệ dữ liệu bằng cách sử dụng phạm vi truy cập.",
            "Kế thừa (Inheritance) cho phép một lớp kế thừa đặc điểm của lớp khác.",
            "Đa hình (Polymorphism) giúp một phương thức có thể hoạt động theo nhiều cách khác nhau.",
            "Interface và Abstract Class giúp xây dựng kiến trúc linh hoạt và mở rộng trong Java."
        });

        DESCRIPTION_MAP.put("Xử lý ngoại lệ, làm việc với tập tin", new String[]{
            "Xử lý ngoại lệ (Exception Handling) giúp quản lý lỗi và tránh sự cố khi chạy chương trình.",
            "Java hỗ trợ xử lý ngoại lệ với try-catch-finally và throw-throws.",
            "Làm việc với tập tin (File Handling) trong Java sử dụng các lớp như File, FileReader, FileWriter để đọc và ghi dữ liệu."
        });

        DESCRIPTION_MAP.put("Collection Framework: ArrayList, LinkedList, HashMap", new String[]{
            "Collection Framework trong Java cung cấp các cấu trúc dữ liệu mạnh mẽ để quản lý dữ liệu.",
            "ArrayList là danh sách động cho phép truy cập nhanh các phần tử.",
            "LinkedList cung cấp danh sách liên kết hỗ trợ chèn và xóa phần tử hiệu quả.",
            "HashMap lưu trữ dữ liệu dưới dạng cặp key-value, giúp tra cứu nhanh chóng."
        });

        //java ung dung thuc te
        DESCRIPTION_MAP.put("JavaFX: Xây dựng giao diện đồ họa", new String[]{
            "JavaFX là framework để phát triển giao diện đồ họa trong Java.",
            "Cấu trúc ứng dụng JavaFX bao gồm Scene, Stage, Node."
        });

        DESCRIPTION_MAP.put("Spring Boot: REST API, kết nối cơ sở dữ liệu", new String[]{
            "Spring Boot giúp phát triển ứng dụng nhanh chóng với cấu hình tối thiểu.",
            "REST API cho phép giao tiếp giữa các hệ thống.",
            "Spring Boot hỗ trợ kết nối cơ sở dữ liệu với JPA/Hibernate."
        });

        DESCRIPTION_MAP.put("Microservices với Spring Cloud", new String[]{
            "Microservices là kiến trúc chia nhỏ ứng dụng thành nhiều dịch vụ độc lập.",
            "Spring Boot giúp xây dựng Microservices nhanh chóng.",
            "CRUD (Create, Read, Update, Delete) trong Microservices."
        });

        DESCRIPTION_MAP.put("Bảo mật (Spring Security, OAuth2, JWT), Hiệu năng & Kiểm thử", new String[]{
            "Spring Security cung cấp giải pháp bảo mật cho ứng dụng Java.",
            "JWT giúp xác thực và phân quyền người dùng.",
            "JUnit và Mockito hỗ trợ kiểm thử phần mềm."
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

        // JavaScript Cơ Bản
        ICON_MAP.put("Giới thiệu Javascript", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Cách nhúng JavaScript vào HTML", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Biến và Kiểu dữ liệu trong JavaScript", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Toán tử và Cấu trúc điều kiện trong JavaScript", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Vòng lặp và Mảng trong JavaScript", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Hàm và Phạm vi biến trong JavaScript", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Thực hành: Xây dựng trò chơi nhỏ", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        // JavaScript Nâng Cao
        ICON_MAP.put("Vòng lặp và Hàm", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Lập trình hướng đối tượng (OOP)", new String[]{
            "",
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Closure và Hoisting", new String[]{
            "",
            ""
        });
        ICON_MAP.put("ES6+ và Các tính năng mới", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Xử lý lỗi và Debugging", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Thực hành: Xây dựng ứng dụng To-Do List", new String[]{
            "",
            "",
            "",
            ""
        });
        //JavaScript Chuyên Nghiệp
        ICON_MAP.put("Lập trình bất đồng bộ (Asynchronous)", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Làm việc với API", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("DOM và Xử lý sự kiện", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("LocalStorage và SessionStorage", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Web Workers và Hiệu suất JavaScript", new String[]{
            "",
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Thực hành: Xây dựng ứng dụng thời tiết", new String[]{
            "",
            "",
            "",
            "",
            "",
            ""
        });
        // JavaScript - Ứng dụng thực tế
        ICON_MAP.put("JavaScript trong dự án Web", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Framework JavaScript (React, Vue, Node.js)", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Webpack và tối ưu hiệu suất", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Viết Unit Test với Jest", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Thực hành: Xây dựng ứng dụng Chat thời gian thực", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Giới thiệu về ngôn ngữ C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Lịch sử và sự phát triển của ngôn ngữ C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Đặc điểm và ứng dụng của C", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc cơ bản của một chương trình C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Quá trình biên dịch và thực thi chương trình C", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Các câu lệnh điều kiện (if, if-else, switch-case)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Các vòng lặp (for, while, do-while)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Mảng một chiều: Khai báo, khởi tạo, truy cập phần tử", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Mảng hai chiều: Ứng dụng và thao tác", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Xử lý chuỗi trong C (thư viện string.h)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Con trỏ: Khái niệm, khai báo, toán tử con trỏ", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Định nghĩa và sử dụng hàm", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Truyền tham số vào hàm", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Hàm đệ quy", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc dữ liệu & file I/O", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Kiểu dữ liệu struct và union", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Danh sách liên kết, ngăn xếp, hàng đợi", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý tệp tin (File I/O): fopen, fclose, fread, fwrite, fprintf, fscanf", new String[]{
            "",
            "",
            ""
        });

        //SQL
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

        //Python 
        ICON_MAP.put("Giới thiệu về Python, lịch sử phát triển, lý do chọn Python.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc chương trình Python, cài đặt môi trường và IDE.", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu.", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc điều kiện, vòng lặp, danh sách, tuple, dictionary.", new String[]{
            "",
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Lập trình hướng đối tượng (OOP) trong Python.", new String[]{
            "",});

        ICON_MAP.put("Xử lý tập tin: đọc/ghi file CSV, JSON, XML.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý ngoại lệ: try-except, finally, tạo ngoại lệ tùy chỉnh.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Lập trình đa luồng và bất đồng bộ (async, threading).", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Làm việc với API: requests, BeautifulSoup, Selenium.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Cơ sở dữ liệu: SQLite, MySQL, PostgreSQL, ORM với SQLAlchemy.", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý dữ liệu lớn: pandas, numpy, matplotlib.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Lập trình mạng: socket, giao thức TCP/IP, UDP.", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Xây dựng ứng dụng Web với Flask/Django.", new String[]{
            ""
        });

        ICON_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch.", new String[]{
            ""
        });

        ICON_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            ""
        });

        ICON_MAP.put("Bảo mật, tối ưu hiệu năng và kiểm thử với pytest, unittest.", new String[]{
            "",
            ""
        });

        //Java
        //co ban
        ICON_MAP.put("Giới thiệu về Java, lịch sử phát triển, lý do chọn Java", new String[]{
            "/com/img/java.png",
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc chương trình Java, cài đặt JDK, IDE", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Biến, kiểu dữ liệu, toán tử, nhập xuất dữ liệu", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Cấu trúc điều kiện, vòng lặp, mảng và xử lý chuỗi", new String[]{
            "",
            "",
            "",
            ""
        });
        //nang cao
        ICON_MAP.put("Lập trình đa luồng, xử lý sự kiện", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Lập trình mạng (Socket, TCP/IP, UDP)", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("JDBC: Kết nối cơ sở dữ liệu, CRUD", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Lập trình Web: Servlet, JSP, MVC", new String[]{
            "",
            "",
            "",
            ""
        });
        //chuyennghiep
        ICON_MAP.put("Lập trình hướng đối tượng: lớp, đối tượng, constructor, phương thức", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Đóng gói, kế thừa, đa hình, interface, abstract class", new String[]{
            "",
            "",
            "",
            ""
        });

        ICON_MAP.put("Xử lý ngoại lệ, làm việc với tập tin", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Collection Framework: ArrayList, LinkedList, HashMap", new String[]{
            "",
            "",
            "",
            ""
        });
        //ungdung thuc te
        ICON_MAP.put("JavaFX: Xây dựng giao diện đồ họa", new String[]{
            "",
            ""
        });

        ICON_MAP.put("Spring Boot: REST API, kết nối cơ sở dữ liệu", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Microservices với Spring Cloud", new String[]{
            "",
            "",
            ""
        });

        ICON_MAP.put("Bảo mật (Spring Security, OAuth2, JWT), Hiệu năng & Kiểm thử", new String[]{
            "",
            "",
            ""
        });
        
        //HTML Cơ Bản
        ICON_MAP.put("HTML là gì?", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("CẤU TRÚC CƠ BẢN CỦA HTML", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Cách viết file HTML và hiển thị trên trình duyệt", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Tiêu đề (<h1> đến <h6>)", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Đoạn văn (<p>), Xuống dòng (<br>), Đường ngang (<hr>)", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Định dạng văn bản (<b>, <i>, <u>, <strong>, <em>, <mark>, <small>)", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Danh sách: có thứ tự (<ol>), không thứ tự (<ul>), mô tả (<dl>)", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Chèn ảnh (<img>), video (<video>), âm thanh (<audio>)", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Tạo liên kết (<a>) và điều hướng trang web", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Nhúng iframe (<iframe>)", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Bảng (<table>, <tr>, <td>, <th>)", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Biểu mẫu (<form>, <input>, <textarea>, <select>)", new String[]{
            "",
            "",
            ""
        });

        //HTML Nâng Cao
        ICON_MAP.put("Các thẻ Semantic (<header>, <footer>, <nav>, <article>, <section>)", new String[]{
            "",
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Ứng dụng Semantic HTML để tối ưu SEO", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Sử dụng <meta> để tối ưu công cụ tìm kiếm", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Open Graph, Twitter Card", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Favicon, Sitemap, robots.txt", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Local Storage & Session Storage", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Geolocation API (Xác định vị trí người dùng)", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Drag & Drop API", new String[]{
            "",
            "",
            ""
        });

        // CSS Cơ Bản
        ICON_MAP.put("Inline CSS, Internal CSS, External CSS", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Cú pháp CSS cơ bản", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Selectors cơ bản: class, id, tag, attribute", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Đơn vị đo lường trong CSS: px, %, em, rem, vw, vh", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Margin, Border, Padding, Content – CSS Box Model", new String[]{
            ""
        });
        ICON_MAP.put("Các thuộc tính width, height, max-width, min-height", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Positioning (static, relative, absolute, fixed, sticky)", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Màu HEX, RGB, HSL", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Font-family, font-size, font-weight", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Line-height, Letter-spacing", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("display: block, inline, inline-block, flex, grid", new String[]{
            "",
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Viewport meta tag", new String[]{
            "",
            "",
            "",
            ""
        });

        // CSS Nâng Cao
        ICON_MAP.put("display: flex", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Căn chỉnh bằng justify-content, align-items, align-self", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("flex-wrap, flex-direction", new String[]{
            "",
            ""
        });
        ICON_MAP.put("display: grid", new String[]{
            "",
            ""
        });
        ICON_MAP.put("grid-template-columns, grid-template-rows, gap, align-items, justify-content", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Media Queries (@media)", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Mobile-first vs. Desktop-first", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("CSS Container Queries", new String[]{
            ""
        });
        ICON_MAP.put("transition, animation, keyframes", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Hover effect nâng cao", new String[]{
            ""
        });
        ICON_MAP.put(":nth-child(), :not(), :focus-within", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Pseudo-elements (::before, ::after)", new String[]{
            ""
        });

        // CSS Chuyên Nghiệp
        ICON_MAP.put("BEM (Block Element Modifier)", new String[]{
            ""
        });
        ICON_MAP.put("OOCSS (Object-Oriented CSS)", new String[]{
            ""
        });
        ICON_MAP.put("SMACSS (Scalable and Modular Architecture for CSS)", new String[]{
            ""
        });
        ICON_MAP.put("Biến trong CSS (--main-color)", new String[]{
            ""
        });
        ICON_MAP.put("Nested Rules, Mixins, Functions", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Tối ưu hóa mã CSS với SCSS", new String[]{
            ""
        });
        ICON_MAP.put("Minify CSS", new String[]{
            ""
        });
        ICON_MAP.put("Load Font Tối ưu", new String[]{
            ""
        });
        ICON_MAP.put("Critical CSS & Lazy Loading", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Bootstrap", new String[]{
            ""
        });
        ICON_MAP.put("Tailwind CSS", new String[]{
            ""
        });
        ICON_MAP.put("ARIA Roles", new String[]{
            ""
        });
        ICON_MAP.put("Keyboard Navigation", new String[]{
            ""
        });
        ICON_MAP.put("Dark Mode hỗ trợ người dùng khiếm thị", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Tạo hình ảnh, animations phức tạp bằng CSS", new String[]{
            "",
            ""
        });
        ICON_MAP.put("CSS Art & Pure CSS Illustrations", new String[]{
            "",
            ""
        });
        // Ứng Dụng & Dự Án Thực Tế
        ICON_MAP.put("Blog cá nhân", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Landing Page sản phẩm", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Web bán hàng cơ bản", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Hiệu ứng scroll, parallax", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Dark Mode", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Animation nâng cao", new String[]{
            "",
            "",
            ""
        });
        ICON_MAP.put("Tạo manifest.json", new String[]{
            "",
            ""
        });
        ICON_MAP.put("Service Worker & Caching", new String[]{
            "",
            "",
            "",
            ""
        });
        ICON_MAP.put("Offline Mode & Push Notifications", new String[]{
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