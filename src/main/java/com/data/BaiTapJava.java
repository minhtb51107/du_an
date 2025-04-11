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
public class BaiTapJava {
    
    private static final Map<String, int[]> Index_MAP = new HashMap<>();

    static {
        Index_MAP.put("Java là gì?", new int[]{
            10
        });
        Index_MAP.put("Lịch sử phát triển của Java", new int[]{
            10
        });
        Index_MAP.put("Lý do chọn Java", new int[]{
            10
        });
        Index_MAP.put("Ứng dụng của Java", new int[]{
            10
        });
        Index_MAP.put("Cấu trúc cơ bản của một chương trình Java", new int[]{
            10
        });
        Index_MAP.put("Cài đặt JDK", new int[]{
            10
        });
        Index_MAP.put("IDE phổ biến để lập trình Java", new int[]{
            10
        });
        Index_MAP.put("Viết và chạy chương trình Java đầu tiên", new int[]{
            10
        });
        Index_MAP.put("Biến và kiểu dữ liệu", new int[]{
            10
        });
        Index_MAP.put("Toán tử trong Java", new int[]{
            10
        });
        Index_MAP.put("Xuất dữ liệu ra màn hình", new int[]{
            10
        });
        Index_MAP.put("Nhập dữ liệu từ bàn phím", new int[]{
            10
        });
        Index_MAP.put("Cấu trúc điều kiện", new int[]{
            10
        });
        Index_MAP.put("Vòng lặp trong Java", new int[]{
            10
        });
        Index_MAP.put("Mảng trong Java", new int[]{
            10
        });
        Index_MAP.put("Xử lý chuỗi trong Java", new int[]{
            10
        });
        Index_MAP.put("Lập trình đa luồng là gì?", new int[]{
            10
        });
        Index_MAP.put("Tạo luồng trong Java", new int[]{
            10
        });
        Index_MAP.put("Đồng bộ hóa luồng", new int[]{
            10
        });
        Index_MAP.put("Xử lý sự kiện trong Java", new int[]{
            10
        });
        Index_MAP.put("Giới thiệu về lập trình mạng trong Java", new int[]{
            10
        });
        Index_MAP.put("Lập trình Socket với TCP/IP", new int[]{
            10
        });
        Index_MAP.put("Lập trình UDP trong Java", new int[]{
            10
        });
        Index_MAP.put("JDBC là gì?", new int[]{
            10
        });
        Index_MAP.put("Kết nối MySQL với Java", new int[]{
            10
        });
        Index_MAP.put("Thực hiện CRUD", new int[]{
            10
        });
        Index_MAP.put("Servlet là gì?", new int[]{
            10
        });
        Index_MAP.put("Tạo Servlet cơ bản", new int[]{
            10
        });
        Index_MAP.put("JSP là gì?", new int[]{
            10
        });
        Index_MAP.put("Mô hình MVC trong Java", new int[]{
            10
        });
        Index_MAP.put("Lập trình hướng đối tượng là gì?", new int[]{
            10
        });
        Index_MAP.put("Lớp và đối tượng", new int[]{
            10
        });
        Index_MAP.put("Constructor", new int[]{
            10
        });
        Index_MAP.put("Phương thức (Method)", new int[]{
            10
        });
        Index_MAP.put("Đóng gói (Encapsulation)", new int[]{
            10
        });
        Index_MAP.put("Kế thừa (Inheritance)", new int[]{
            10
        });
        Index_MAP.put("Đa hình (Polymorphism)", new int[]{
            10
        });
        Index_MAP.put("Interface và Abstract Class", new int[]{
            10
        });
        Index_MAP.put("Xử lý ngoại lệ (Exception Handling)", new int[]{
            10
        });
        Index_MAP.put("Đọc và ghi file trong Java", new int[]{
            10
        });
        Index_MAP.put("Giới thiệu Collection Framework", new int[]{
            10
        });
        Index_MAP.put("ArrayList", new int[]{
            10
        });
        Index_MAP.put("LinkedList", new int[]{
            10
        });
        Index_MAP.put("HashMap", new int[]{
            10
        });
        Index_MAP.put("Giới thiệu JavaFX", new int[]{
            10
        });
        Index_MAP.put("Cấu trúc ứng dụng JavaFX", new int[]{
            10
        });
        Index_MAP.put("Giới thiệu Spring Boot", new int[]{
            10
        });
        Index_MAP.put("Tạo REST API với Spring Boot", new int[]{
            10
        });
        Index_MAP.put("Kết nối cơ sở dữ liệu MySQL với Spring Boot", new int[]{
            10
        });
        Index_MAP.put("Giới thiệu về Microservices", new int[]{
            10
        });
        Index_MAP.put("Xây dựng Microservice với Spring Boot", new int[]{
            10
        });
        Index_MAP.put("Bảo mật với Spring Security", new int[]{
            10
        });
        Index_MAP.put("Xác thực bằng JWT", new int[]{
            10
        });
        Index_MAP.put("Kiểm thử với JUnit và Mockito", new int[]{
            10
        });
        
        Index_MAP.put("Giới thiệu SQL", new int[]{
            5
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
            "Java được phát triển bởi công ty nào?\n"
            + "A. Microsoft\n"
            + "B. Sun Microsystems\n"
            + "C. Apple\n"
            + "D. IBM",
            "Java là ngôn ngữ lập trình gì?\n"
            + "A. Thủ tục\n"
            + "B. Hướng đối tượng\n"
            + "C. Hướng chức năng\n"
            + "D. Hướng mô hình",
            "Câu slogan nổi tiếng của Java là gì?\n"
            + "A. Write once, compile anywhere\n"
            + "B. Write many, run anywhere\n"
            + "C. Write once, run anywhere\n"
            + "D. Write everywhere, run anywhere",
            "Mã nguồn Java được biên dịch thành gì?\n"
            + "A. Mã máy\n"
            + "B. Bytecode\n"
            + "C. Assembly\n"
            + "D. Script",
            "Chương trình Java chạy trên nền tảng nào?\n"
            + "A. Hệ điều hành\n"
            + "B. Máy ảo Java (JVM)\n"
            + "C. Phần cứng\n"
            + "D. Trình duyệt",
            "Ưu điểm lớn của Java là gì?\n"
            + "A. Hiệu suất cực cao\n"
            + "B. Tính di động cao\n"
            + "C. Tối ưu hóa phần cứng\n"
            + "D. Độ trễ thấp",
            "Tập tin nguồn Java có phần mở rộng gì?\n"
            + "A. .class\n"
            + "B. .java\n"
            + "C. .jar\n"
            + "D. .exe",
            "Sau khi biên dịch, tập tin `.class` sẽ chứa gì?\n"
            + "A. Mã nguồn\n"
            + "B. Bytecode\n"
            + "C. File cấu hình\n"
            + "D. File tài nguyên",
            "JVM có vai trò gì trong Java?\n"
            + "A. Biên dịch mã nguồn\n"
            + "B. Chạy mã Bytecode\n"
            + "C. Soạn thảo chương trình\n"
            + "D. Quản lý cơ sở dữ liệu",
            "Đặc tính nào sau đây không phải của Java?\n"
            + "A. Đa luồng\n"
            + "B. Phân tán\n"
            + "C. Hướng sự kiện\n"
            + "D. Bảo mật thấp"
        });

        TITLE_MAP.put("Lịch sử phát triển của Java", new String[]{
            "Java được phát triển bởi công ty nào?\n"
            + "A. Microsoft\n"
            + "B. Sun Microsystems\n"
            + "C. Google\n"
            + "D. Apple",
            "Dự án khởi nguồn cho Java có tên là gì?\n"
            + "A. Green Project\n"
            + "B. Blue Project\n"
            + "C. Yellow Project\n"
            + "D. Red Project",
            "Ai là người đứng đầu nhóm phát triển ngôn ngữ Java?\n"
            + "A. Bill Gates\n"
            + "B. James Gosling\n"
            + "C. Mark Zuckerberg\n"
            + "D. Steve Jobs",
            "Java ban đầu được thiết kế cho thiết bị nào?\n"
            + "A. Máy tính để bàn\n"
            + "B. Máy chủ\n"
            + "C. Thiết bị điện tử gia dụng\n"
            + "D. Điện thoại thông minh",
            "Ban đầu, Java được gọi bằng cái tên nào?\n"
            + "A. Java\n"
            + "B. Oak\n"
            + "C. Coffee\n"
            + "D. Tree",
            "Năm nào phiên bản đầu tiên của Java được phát hành?\n"
            + "A. 1991\n"
            + "B. 1995\n"
            + "C. 1998\n"
            + "D. 2000",
            "Phiên bản Java 2 (J2SE) được phát hành vào năm nào?\n"
            + "A. 1996\n"
            + "B. 1998\n"
            + "C. 1999\n"
            + "D. 2002",
            "Năm 2010, Sun Microsystems được công ty nào mua lại?\n"
            + "A. Microsoft\n"
            + "B. Oracle\n"
            + "C. IBM\n"
            + "D. Google",
            "Java được thiết kế để chạy trên nền tảng nào?\n"
            + "A. Một hệ điều hành nhất định\n"
            + "B. Bất kỳ nền tảng nào có máy ảo Java (JVM)\n"
            + "C. Chỉ hệ điều hành Windows\n"
            + "D. Chỉ hệ điều hành Linux",
            "Khẩu hiệu nổi tiếng gắn liền với Java là gì?\n"
            + "A. Just Do It\n"
            + "B. Write Once, Run Anywhere\n"
            + "C. Think Different\n"
            + "D. Connecting People"
        });

        TITLE_MAP.put("Lý do chọn Java", new String[]{
            "Tại sao Java được xem là ngôn ngữ lập trình phổ biến?\n"
            + "A. Dễ học, dễ sử dụng\n"
            + "B. Hỗ trợ đa nền tảng\n"
            + "C. Cộng đồng lớn mạnh\n"
            + "D. Tất cả các đáp án trên",
            "Khả năng 'Write Once, Run Anywhere' của Java nghĩa là gì?\n"
            + "A. Viết một lần, chạy ở mọi nền tảng có trình biên dịch Java\n"
            + "B. Viết một lần, chỉ chạy trên Windows\n"
            + "C. Viết nhiều lần cho từng nền tảng riêng biệt\n"
            + "D. Chạy được mà không cần máy ảo Java",
            "Điểm mạnh nào sau đây của Java làm cho nó phù hợp với các hệ thống lớn?\n"
            + "A. Quản lý bộ nhớ tự động (Garbage Collection)\n"
            + "B. Không cần internet để chạy\n"
            + "C. Giao diện đẹp\n"
            + "D. Không cần lập trình hướng đối tượng",
            "Java phù hợp cho phát triển ứng dụng doanh nghiệp nhờ tính năng nào?\n"
            + "A. Bảo mật cao\n"
            + "B. Khả năng mở rộng tốt\n"
            + "C. Hiệu suất ổn định\n"
            + "D. Tất cả các đáp án trên",
            "Lý do nào khiến Java có tuổi thọ lâu dài và vẫn được ưa chuộng?\n"
            + "A. Luôn cập nhật công nghệ mới\n"
            + "B. Được các công ty lớn hỗ trợ\n"
            + "C. Có lượng thư viện phong phú\n"
            + "D. Tất cả các đáp án trên",
            "Java có dễ dàng tích hợp với các công nghệ khác không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Tùy trường hợp\n"
            + "D. Chỉ tích hợp với công nghệ cũ",
            "Điểm nào sau đây KHÔNG phải là lợi thế của Java?\n"
            + "A. Khả năng bảo mật tốt\n"
            + "B. Hỗ trợ đa nền tảng\n"
            + "C. Khả năng xử lý đồ họa mạnh hơn Photoshop\n"
            + "D. Cộng đồng hỗ trợ đông đảo",
            "Java hỗ trợ lập trình đa luồng (multithreading) có ý nghĩa gì?\n"
            + "A. Tăng tốc độ xử lý ứng dụng\n"
            + "B. Làm cho chương trình chạy được nhiều tiến trình cùng lúc\n"
            + "C. Giúp tiết kiệm tài nguyên hệ thống\n"
            + "D. Tất cả các đáp án trên",
            "Java có ưu điểm nào về mặt phát triển phần mềm lâu dài?\n"
            + "A. Dễ bảo trì\n"
            + "B. Dễ mở rộng\n"
            + "C. Dễ tái sử dụng mã nguồn\n"
            + "D. Tất cả các đáp án trên",
            "Ngôn ngữ Java phù hợp nhất với đối tượng nào?\n"
            + "A. Người mới học lập trình\n"
            + "B. Nhà phát triển ứng dụng doanh nghiệp\n"
            + "C. Nhà phát triển ứng dụng Android\n"
            + "D. Tất cả các đối tượng trên"
        });

        TITLE_MAP.put("Ứng dụng của Java", new String[]{
            "Java thường được sử dụng trong lĩnh vực nào sau đây?\n"
            + "A. Phát triển ứng dụng web\n"
            + "B. Phát triển ứng dụng di động\n"
            + "C. Phát triển hệ thống doanh nghiệp\n"
            + "D. Tất cả các đáp án trên",
            "Hệ điều hành Android sử dụng ngôn ngữ lập trình nào làm nền tảng?\n"
            + "A. C++\n"
            + "B. Python\n"
            + "C. Java\n"
            + "D. Kotlin",
            "Java có vai trò gì trong lĩnh vực tài chính – ngân hàng?\n"
            + "A. Phát triển hệ thống giao dịch điện tử\n"
            + "B. Xây dựng các ứng dụng quản lý tài chính\n"
            + "C. Hệ thống bảo mật giao dịch\n"
            + "D. Tất cả các đáp án trên",
            "Ứng dụng web nào sau đây có thể được xây dựng bằng Java?\n"
            + "A. Trang thương mại điện tử\n"
            + "B. Cổng thông tin điện tử\n"
            + "C. Mạng xã hội\n"
            + "D. Tất cả các đáp án trên",
            "Java có thể được sử dụng trong lĩnh vực nhúng (embedded systems) không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ sử dụng cho hệ thống lớn\n"
            + "D. Chỉ sử dụng cho ứng dụng web",
            "Java hỗ trợ phát triển trò chơi điện tử không?\n"
            + "A. Có, nhưng không phổ biến như một số ngôn ngữ khác\n"
            + "B. Không\n"
            + "C. Chỉ hỗ trợ game 2D\n"
            + "D. Chỉ hỗ trợ game trên Android",
            "Ứng dụng Java nào sau đây phù hợp cho doanh nghiệp lớn?\n"
            + "A. Quản lý quan hệ khách hàng (CRM)\n"
            + "B. Quản lý nguồn nhân lực (HRM)\n"
            + "C. Hệ thống hoạch định tài nguyên doanh nghiệp (ERP)\n"
            + "D. Tất cả các đáp án trên",
            "Java được sử dụng trong công nghệ đám mây (cloud computing) như thế nào?\n"
            + "A. Xây dựng ứng dụng dịch vụ\n"
            + "B. Triển khai các nền tảng đám mây\n"
            + "C. Phát triển hệ thống lưu trữ đám mây\n"
            + "D. Tất cả các đáp án trên",
            "Trong lĩnh vực Big Data, Java thường được dùng để:\n"
            + "A. Xây dựng hệ thống xử lý dữ liệu lớn\n"
            + "B. Phát triển các công cụ phân tích dữ liệu\n"
            + "C. Tích hợp hệ thống phân tán\n"
            + "D. Tất cả các đáp án trên",
            "Ứng dụng Internet of Things (IoT) có thể phát triển bằng Java không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ dành cho thiết bị di động\n"
            + "D. Chỉ dành cho máy chủ"
        });

        TITLE_MAP.put("Cấu trúc cơ bản của một chương trình Java", new String[]{
            "Một chương trình Java tối thiểu phải có thành phần nào sau đây?\n"
            + "A. Lớp (class)\n"
            + "B. Phương thức main\n"
            + "C. Cả A và B\n"
            + "D. Không cần lớp và phương thức main",
            "Phương thức nào là điểm bắt đầu thực thi của một chương trình Java?\n"
            + "A. start()\n"
            + "B. run()\n"
            + "C. main()\n"
            + "D. init()",
            "Từ khóa nào được dùng để khai báo một lớp trong Java?\n"
            + "A. class\n"
            + "B. define\n"
            + "C. structure\n"
            + "D. module",
            "Trong khai báo phương thức main, từ khóa nào chỉ ra rằng phương thức có thể được gọi mà không cần tạo đối tượng?\n"
            + "A. public\n"
            + "B. static\n"
            + "C. void\n"
            + "D. main",
            "Kiểu trả về của phương thức main trong Java là gì?\n"
            + "A. int\n"
            + "B. String\n"
            + "C. void\n"
            + "D. boolean",
            "Đâu là cú pháp chính xác để khai báo phương thức main trong Java?\n"
            + "A. public void main(String[] args)\n"
            + "B. public static void Main(String args[])\n"
            + "C. public static void main(String[] args)\n"
            + "D. static public void Main(String args[])",
            "Tên tập tin Java phải trùng với điều gì?\n"
            + "A. Tên package\n"
            + "B. Tên lớp chứa phương thức main\n"
            + "C. Tên phương thức main\n"
            + "D. Không cần trùng với bất kỳ tên nào",
            "Để biên dịch chương trình Java từ file nguồn, sử dụng lệnh nào?\n"
            + "A. java tên_file.java\n"
            + "B. javac tên_file.java\n"
            + "C. compile tên_file.java\n"
            + "D. run tên_file.java",
            "Sau khi biên dịch thành công file Java, ta nhận được file có phần mở rộng là gì?\n"
            + "A. .class\n"
            + "B. .java\n"
            + "C. .exe\n"
            + "D. .obj",
            "Để chạy chương trình Java đã biên dịch, ta sử dụng lệnh nào?\n"
            + "A. javac TênLớp\n"
            + "B. run TênLớp\n"
            + "C. java TênLớp\n"
            + "D. execute TênLớp"
        });

        TITLE_MAP.put("Cài đặt JDK", new String[]{
            "JDK là viết tắt của cụm từ nào sau đây?\n"
            + "A. Java Deployment Kit\n"
            + "B. Java Development Kit\n"
            + "C. Java Design Kit\n"
            + "D. Java Debugging Kit",
            "JDK bao gồm những thành phần chính nào?\n"
            + "A. Trình biên dịch (javac)\n"
            + "B. Máy ảo Java (JVM)\n"
            + "C. Thư viện Java (API)\n"
            + "D. Tất cả các thành phần trên",
            "Để lập trình Java, cần cài đặt phần mềm nào sau đây trước tiên?\n"
            + "A. JDK\n"
            + "B. JRE\n"
            + "C. JVM\n"
            + "D. SDK",
            "Sau khi cài đặt JDK, cần thiết lập biến môi trường nào để sử dụng lệnh javac ở mọi thư mục?\n"
            + "A. JAVA_HOME\n"
            + "B. PATH\n"
            + "C. CLASSPATH\n"
            + "D. HOME_PATH",
            "Để kiểm tra đã cài đặt JDK thành công trên máy tính Windows, sử dụng lệnh nào trong Command Prompt?\n"
            + "A. java -check\n"
            + "B. java -v\n"
            + "C. java -version\n"
            + "D. javac -setup",
            "Nếu chưa thiết lập biến PATH cho JDK, khi gõ lệnh javac sẽ xảy ra điều gì?\n"
            + "A. Máy tính tự động tìm và biên dịch\n"
            + "B. Lỗi 'javac is not recognized as an internal or external command'\n"
            + "C. Máy tính treo máy\n"
            + "D. Chạy bình thường",
            "Biến môi trường JAVA_HOME thường được trỏ tới đâu?\n"
            + "A. Thư mục chứa file javac.exe\n"
            + "B. Thư mục cài đặt JDK\n"
            + "C. Thư mục chứa file .java\n"
            + "D. Thư mục dự án",
            "Phần mềm nào sau đây hỗ trợ cài đặt và quản lý nhiều phiên bản JDK dễ dàng?\n"
            + "A. Eclipse\n"
            + "B. NetBeans\n"
            + "C. SDKMAN\n"
            + "D. IntelliJ IDEA",
            "Câu lệnh nào sau đây dùng để kiểm tra vị trí cài đặt JDK trên hệ điều hành Linux?\n"
            + "A. whereis java\n"
            + "B. find java\n"
            + "C. locate java\n"
            + "D. which java",
            "Muốn cập nhật biến PATH sau khi cài JDK mới, ta cần?\n"
            + "A. Khởi động lại máy\n"
            + "B. Khởi động lại Command Prompt\n"
            + "C. Khởi động lại Java\n"
            + "D. Không cần làm gì"
        });

        TITLE_MAP.put("IDE phổ biến để lập trình Java", new String[]{
            "IDE là viết tắt của cụm từ nào sau đây?\n"
            + "A. Integrated Development Environment\n"
            + "B. Internet Development Environment\n"
            + "C. Internal Development Engine\n"
            + "D. Integrated Deployment Engine",
            "IDE phổ biến nhất cho lập trình Java hiện nay là?\n"
            + "A. Visual Studio Code\n"
            + "B. Eclipse\n"
            + "C. Xcode\n"
            + "D. Atom",
            "IDE Eclipse được phát triển bởi tổ chức nào?\n"
            + "A. Apache\n"
            + "B. Eclipse Foundation\n"
            + "C. Oracle\n"
            + "D. Microsoft",
            "IDE nào nổi tiếng với tính năng hỗ trợ lập trình Java mạnh mẽ và tích hợp nhiều công cụ phát triển?\n"
            + "A. NetBeans\n"
            + "B. Visual Studio\n"
            + "C. Sublime Text\n"
            + "D. Brackets",
            "IntelliJ IDEA có hai phiên bản là gì?\n"
            + "A. Free và Paid\n"
            + "B. Community và Ultimate\n"
            + "C. Basic và Pro\n"
            + "D. Standard và Premium",
            "NetBeans IDE được phát triển bởi công ty nào trước khi thuộc về Apache Foundation?\n"
            + "A. Sun Microsystems\n"
            + "B. Oracle\n"
            + "C. Microsoft\n"
            + "D. IBM",
            "Phiên bản IntelliJ IDEA miễn phí dành cho cộng đồng có tên là gì?\n"
            + "A. Ultimate Edition\n"
            + "B. Community Edition\n"
            + "C. Free Edition\n"
            + "D. Public Edition",
            "Một tính năng nổi bật của IntelliJ IDEA là gì?\n"
            + "A. Tự động hoàn thiện mã (Code Completion)\n"
            + "B. Không cần cài plugin\n"
            + "C. Không cần biên dịch thủ công\n"
            + "D. Hỗ trợ mọi ngôn ngữ lập trình",
            "IDE nào cho phép kéo thả giao diện khi lập trình JavaFX?\n"
            + "A. Eclipse\n"
            + "B. NetBeans\n"
            + "C. IntelliJ IDEA\n"
            + "D. Visual Studio Code",
            "Để cài thêm plugin hỗ trợ Java cho Visual Studio Code, cần cài extension nào?\n"
            + "A. Java Support\n"
            + "B. Java Extension Pack\n"
            + "C. Java Helper\n"
            + "D. Java Developer Kit"
        });

        TITLE_MAP.put("Viết và chạy chương trình Java đầu tiên", new String[]{
            "Để khai báo một lớp trong Java, từ khóa nào được sử dụng?\n"
            + "A. class\n"
            + "B. public\n"
            + "C. static\n"
            + "D. void",
            "Phương thức nào trong Java được dùng làm điểm khởi đầu khi chạy chương trình?\n"
            + "A. start()\n"
            + "B. init()\n"
            + "C. main()\n"
            + "D. run()",
            "Câu lệnh nào dùng để in ra màn hình trong Java?\n"
            + "A. print.out()\n"
            + "B. output.println()\n"
            + "C. console.print()\n"
            + "D. System.out.println()",
            "Khi biên dịch file Java tên là HelloWorld.java, lệnh nào đúng?\n"
            + "A. javac HelloWorld\n"
            + "B. java HelloWorld\n"
            + "C. javac HelloWorld.java\n"
            + "D. java HelloWorld.java",
            "Để chạy chương trình Java sau khi biên dịch, lệnh nào đúng?\n"
            + "A. java HelloWorld\n"
            + "B. javac HelloWorld.class\n"
            + "C. java HelloWorld.java\n"
            + "D. run HelloWorld",
            "Khi khai báo phương thức main trong Java, khai báo nào đúng?\n"
            + "A. void main(String args)\n"
            + "B. public static void main(String[] args)\n"
            + "C. static void main(String args[])\n"
            + "D. public void main(String[] args)",
            "File .class trong Java là gì?\n"
            + "A. File mã nguồn\n"
            + "B. File biên dịch chứa bytecode\n"
            + "C. File chạy trực tiếp\n"
            + "D. File chứa tài liệu",
            "Khi viết tên file Java, quy tắc nào đúng?\n"
            + "A. Tên file có thể khác tên lớp public\n"
            + "B. Tên file phải trùng với tên lớp public\n"
            + "C. Tên file luôn viết thường\n"
            + "D. Tên file không quan trọng",
            "Kết quả của đoạn lệnh sau là gì?\nSystem.out.println(\"Hello World\");\n"
            + "A. HelloWorld\n"
            + "B. Hello World\n"
            + "C. System.out.println\n"
            + "D. HelloWorld();",
            "Đuôi mở rộng của file Java là gì?\n"
            + "A. .jav\n"
            + "B. .java\n"
            + "C. .class\n"
            + "D. .exe"
        });

        TITLE_MAP.put("Biến và kiểu dữ liệu", new String[]{
            "Trong Java, từ khóa nào được dùng để khai báo biến?\n"
            + "A. define\n"
            + "B. declare\n"
            + "C. var\n"
            + "D. let",
            "Kiểu dữ liệu nào trong Java dùng để lưu trữ số nguyên?\n"
            + "A. float\n"
            + "B. double\n"
            + "C. int\n"
            + "D. boolean",
            "Kiểu dữ liệu nào dùng để lưu trữ giá trị đúng hoặc sai trong Java?\n"
            + "A. byte\n"
            + "B. boolean\n"
            + "C. char\n"
            + "D. short",
            "Giá trị mặc định của biến kiểu int trong Java là gì?\n"
            + "A. 1\n"
            + "B. -1\n"
            + "C. 0\n"
            + "D. null",
            "Kiểu dữ liệu nào có kích thước bộ nhớ nhỏ nhất trong Java?\n"
            + "A. byte\n"
            + "B. short\n"
            + "C. int\n"
            + "D. long",
            "Câu lệnh nào sau đây là khai báo biến hợp lệ trong Java?\n"
            + "A. int number = 5;\n"
            + "B. number int = 5;\n"
            + "C. 5 = int number;\n"
            + "D. int = 5 number;",
            "Để lưu trữ ký tự đơn lẻ trong Java, sử dụng kiểu dữ liệu nào?\n"
            + "A. String\n"
            + "B. char\n"
            + "C. character\n"
            + "D. text",
            "Kết quả của biểu thức sau là gì?\n5 + 3 * 2\n"
            + "A. 11\n"
            + "B. 16\n"
            + "C. 13\n"
            + "D. 10",
            "Để lưu trữ số thực chính xác cao, kiểu dữ liệu nào nên dùng?\n"
            + "A. float\n"
            + "B. double\n"
            + "C. int\n"
            + "D. long",
            "Trong Java, kiểu dữ liệu String thuộc loại nào?\n"
            + "A. Kiểu nguyên thủy (primitive)\n"
            + "B. Kiểu tham chiếu (reference)\n"
            + "C. Kiểu số\n"
            + "D. Kiểu boolean"
        });

        TITLE_MAP.put("Toán tử trong Java", new String[]{
            "Toán tử nào sau đây là toán tử so sánh bằng trong Java?\n"
            + "A. =\n"
            + "B. ==\n"
            + "C. !=\n"
            + "D. >=",
            "Kết quả của biểu thức sau là gì?\n10 % 3\n"
            + "A. 1\n"
            + "B. 3\n"
            + "C. 0\n"
            + "D. 2",
            "Toán tử nào được sử dụng để tăng giá trị biến lên 1 đơn vị trong Java?\n"
            + "A. += 1\n"
            + "B. ++\n"
            + "C. --\n"
            + "D. -= 1",
            "Toán tử logic nào trả về true nếu cả hai điều kiện đều đúng?\n"
            + "A. ||\n"
            + "B. &&\n"
            + "C. !\n"
            + "D. ^",
            "Kết quả của biểu thức sau là gì?\n!(5 > 3)\n"
            + "A. true\n"
            + "B. false\n"
            + "C. 5\n"
            + "D. 3",
            "Toán tử nào sau đây là toán tử gán trong Java?\n"
            + "A. ==\n"
            + "B. !=\n"
            + "C. =\n"
            + "D. >",
            "Kết quả của biểu thức sau là gì?\n5 + 2 * 3\n"
            + "A. 21\n"
            + "B. 11\n"
            + "C. 15\n"
            + "D. 7",
            "Toán tử nào dùng để kiểm tra hai điều kiện và chỉ cần một điều kiện đúng?\n"
            + "A. &&\n"
            + "B. ||\n"
            + "C. !\n"
            + "D. ==",
            "Trong Java, toán tử nào được sử dụng để phủ định điều kiện?\n"
            + "A. &&\n"
            + "B. ||\n"
            + "C. !\n"
            + "D. ==",
            "Toán tử nào sau đây thực hiện phép nhân trong Java?\n"
            + "A. +\n"
            + "B. -\n"
            + "C. *\n"
            + "D. /"
        });

        TITLE_MAP.put("Xuất dữ liệu ra màn hình", new String[]{
            "Trong Java, phương thức nào dùng để in dòng chữ ra màn hình mà không xuống dòng?\n"
            + "A. System.out.print()\n"
            + "B. System.out.println()\n"
            + "C. System.out.write()\n"
            + "D. System.out.printf()",
            "Phương thức nào sẽ in ra dữ liệu và tự động xuống dòng trong Java?\n"
            + "A. System.out.print()\n"
            + "B. System.out.println()\n"
            + "C. System.out.write()\n"
            + "D. System.out.read()",
            "Kết quả của đoạn code sau là gì?\nSystem.out.print(\"Hello\"); System.out.print(\"World\");\n"
            + "A. Hello\nWorld\n"
            + "B. Hello World\n"
            + "C. HelloWorld\n"
            + "D. Error",
            "Để in một chuỗi định dạng trong Java, phương thức nào được sử dụng?\n"
            + "A. System.out.print()\n"
            + "B. System.out.println()\n"
            + "C. System.out.printf()\n"
            + "D. System.out.write()",
            "Câu lệnh nào sau đây in ra: \"Xin chào Java\" và xuống dòng?\n"
            + "A. System.out.print(\"Xin chào Java\");\n"
            + "B. System.out.println(\"Xin chào Java\");\n"
            + "C. System.out.printf(\"Xin chào Java\");\n"
            + "D. System.out.write(\"Xin chào Java\");",
            "Muốn in giá trị của biến int x = 5 ra màn hình, lệnh nào đúng?\n"
            + "A. System.out.println(x);\n"
            + "B. System.out.println(\"x\");\n"
            + "C. System.out.println('x');\n"
            + "D. System.out.println(x.toString());",
            "Trong System.out.printf(), ký tự %d dùng để in ra kiểu dữ liệu nào?\n"
            + "A. String\n"
            + "B. Float\n"
            + "C. Double\n"
            + "D. Integer",
            "System.out.printf(\"%s\", \"Java\") sẽ in ra gì?\n"
            + "A. %s Java\n"
            + "B. Java\n"
            + "C. %s\n"
            + "D. Lỗi biên dịch",
            "System.out.println(10 + 20) sẽ in ra kết quả gì?\n"
            + "A. 30\n"
            + "B. 1020\n"
            + "C. 10 + 20\n"
            + "D. Error",
            "Muốn in ra một dấu nháy kép (\"), cú pháp đúng là gì?\n"
            + "A. System.out.println(\\\");\n"
            + "B. System.out.println(\"\\\"\");\n"
            + "C. System.out.println(\"\\\");\n"
            + "D. System.out.println(\"\\\"\\\");"
        });

        TITLE_MAP.put("Nhập dữ liệu từ bàn phím", new String[]{
            "Để nhập dữ liệu từ bàn phím trong Java, chúng ta thường sử dụng lớp nào?\n"
            + "A. Scanner\n"
            + "B. InputStream\n"
            + "C. BufferedReader\n"
            + "D. System.in",
            "Phương thức nào của lớp Scanner được dùng để đọc một chuỗi?\n"
            + "A. nextLine()\n"
            + "B. nextInt()\n"
            + "C. nextDouble()\n"
            + "D. next()",
            "Để đọc một số nguyên từ bàn phím bằng Scanner, ta dùng phương thức nào?\n"
            + "A. next()\n"
            + "B. nextLine()\n"
            + "C. nextInt()\n"
            + "D. nextDouble()",
            "Câu lệnh nào khởi tạo đúng đối tượng Scanner để nhập dữ liệu từ bàn phím?\n"
            + "A. Scanner sc = new Scanner();\n"
            + "B. Scanner sc = new Scanner(System.in);\n"
            + "C. Scanner sc = new Scanner(System.out);\n"
            + "D. Scanner sc = new Scanner(InputStreamReader);",
            "Sau khi sử dụng đối tượng Scanner, chúng ta nên làm gì?\n"
            + "A. Gán null\n"
            + "B. Đóng đối tượng bằng close()\n"
            + "C. Không cần làm gì\n"
            + "D. Gọi reset()",
            "Phương thức nào dùng để đọc một số thực (float) từ bàn phím bằng Scanner?\n"
            + "A. nextInt()\n"
            + "B. nextFloat()\n"
            + "C. nextDouble()\n"
            + "D. nextLong()",
            "Nếu nhập một chuỗi chứa dấu cách bằng phương thức next(), Scanner sẽ đọc gì?\n"
            + "A. Toàn bộ chuỗi\n"
            + "B. Chỉ từ đầu tiên trước dấu cách\n"
            + "C. Báo lỗi\n"
            + "D. Không đọc gì",
            "Để đọc dữ liệu kiểu boolean từ bàn phím, Scanner dùng phương thức nào?\n"
            + "A. next()\n"
            + "B. nextBoolean()\n"
            + "C. nextByte()\n"
            + "D. nextChar()",
            "Nếu người dùng nhập '123' nhưng ta dùng nextLine() để đọc, kết quả sẽ là gì?\n"
            + "A. 123 (kiểu int)\n"
            + "B. 123 (kiểu String)\n"
            + "C. Error\n"
            + "D. null",
            "Muốn nhập nhiều giá trị từ bàn phím trong cùng một dòng, ta cần làm gì?\n"
            + "A. Sử dụng nhiều đối tượng Scanner\n"
            + "B. Gọi nhiều lần next() hoặc nextInt()\n"
            + "C. Gọi nextLine() nhiều lần\n"
            + "D. Không thể thực hiện"
        });

        TITLE_MAP.put("Cấu trúc điều kiện", new String[]{
            "Trong Java, câu lệnh nào được sử dụng để kiểm tra điều kiện?\n"
            + "A. for\n"
            + "B. if\n"
            + "C. switch\n"
            + "D. while",
            "Cú pháp đúng của câu lệnh if trong Java là gì?\n"
            + "A. if condition { }\n"
            + "B. if (condition) { }\n"
            + "C. if {condition} ( )\n"
            + "D. if [condition] { }",
            "Câu lệnh nào được dùng để lựa chọn giữa nhiều trường hợp giá trị cụ thể?\n"
            + "A. if\n"
            + "B. for\n"
            + "C. switch\n"
            + "D. while",
            "Trong cấu trúc if-else, khối else sẽ được thực hiện khi nào?\n"
            + "A. Khi điều kiện đúng\n"
            + "B. Khi điều kiện sai\n"
            + "C. Luôn luôn thực hiện\n"
            + "D. Không bao giờ thực hiện",
            "Trong switch-case, từ khóa nào dùng để kết thúc một case?\n"
            + "A. stop\n"
            + "B. end\n"
            + "C. break\n"
            + "D. exit",
            "Nếu thiếu từ khóa break trong switch-case, điều gì sẽ xảy ra?\n"
            + "A. Báo lỗi biên dịch\n"
            + "B. Chỉ thực hiện 1 case\n"
            + "C. Chạy liên tiếp các case tiếp theo\n"
            + "D. Không thực hiện case nào",
            "Câu lệnh if-else lồng nhau (nested if) là gì?\n"
            + "A. if nằm ngoài else\n"
            + "B. if nằm trong một else hoặc if khác\n"
            + "C. Nhiều if tách biệt\n"
            + "D. if viết sau switch",
            "Trong Java, phép so sánh bằng giữa hai giá trị dùng toán tử nào?\n"
            + "A. =\n"
            + "B. ==\n"
            + "C. ===\n"
            + "D. equals",
            "Có thể dùng switch-case với kiểu dữ liệu nào sau đây?\n"
            + "A. int\n"
            + "B. char\n"
            + "C. String (Java 7 trở lên)\n"
            + "D. Tất cả đều đúng",
            "Câu lệnh điều kiện ba ngôi (ternary operator) trong Java có dạng nào?\n"
            + "A. condition ? expression1 : expression2\n"
            + "B. condition : expression1 ? expression2\n"
            + "C. expression1 ? expression2 : condition\n"
            + "D. expression1 : condition ? expression2"
        });

        TITLE_MAP.put("Vòng lặp trong Java", new String[]{
            "Trong Java, vòng lặp nào được sử dụng khi biết trước số lần lặp?\n"
            + "A. while\n"
            + "B. do-while\n"
            + "C. for\n"
            + "D. if",
            "Cú pháp đúng của vòng lặp for trong Java là gì?\n"
            + "A. for (khởi tạo; điều kiện; cập nhật) { }\n"
            + "B. for (điều kiện; khởi tạo; cập nhật) { }\n"
            + "C. for (cập nhật; điều kiện; khởi tạo) { }\n"
            + "D. for (khởi tạo; cập nhật; điều kiện) { }",
            "Trong vòng lặp while, điều kiện được kiểm tra khi nào?\n"
            + "A. Trước khi thực hiện vòng lặp\n"
            + "B. Sau khi thực hiện vòng lặp\n"
            + "C. Trong khi thực hiện vòng lặp\n"
            + "D. Không kiểm tra điều kiện",
            "Sự khác biệt chính giữa while và do-while là gì?\n"
            + "A. while kiểm tra sau, do-while kiểm tra trước\n"
            + "B. do-while kiểm tra trước, while kiểm tra sau\n"
            + "C. while có thể không chạy lần nào, do-while chạy ít nhất một lần\n"
            + "D. Cả hai đều giống nhau",
            "Từ khóa nào dùng để thoát khỏi vòng lặp ngay lập tức trong Java?\n"
            + "A. continue\n"
            + "B. break\n"
            + "C. exit\n"
            + "D. return",
            "Từ khóa nào dùng để bỏ qua phần còn lại của vòng lặp và sang lần lặp tiếp theo?\n"
            + "A. break\n"
            + "B. continue\n"
            + "C. exit\n"
            + "D. stop",
            "Vòng lặp for-each được sử dụng chủ yếu với kiểu dữ liệu nào?\n"
            + "A. Biến đơn lẻ\n"
            + "B. Mảng hoặc Collection\n"
            + "C. Biến số nguyên\n"
            + "D. Kiểu dữ liệu boolean",
            "Trong vòng lặp for, phần nào có thể bỏ trống?\n"
            + "A. Chỉ phần cập nhật\n"
            + "B. Chỉ phần điều kiện\n"
            + "C. Chỉ phần khởi tạo\n"
            + "D. Cả khởi tạo, điều kiện và cập nhật đều có thể bỏ trống",
            "Điều gì xảy ra nếu điều kiện trong vòng lặp while luôn đúng?\n"
            + "A. Vòng lặp không chạy\n"
            + "B. Vòng lặp chạy 1 lần\n"
            + "C. Vòng lặp chạy vô hạn\n"
            + "D. Chương trình bị lỗi biên dịch",
            "Câu lệnh nào sẽ thực hiện vòng lặp ít nhất một lần dù điều kiện sai?\n"
            + "A. for\n"
            + "B. while\n"
            + "C. do-while\n"
            + "D. Không có vòng lặp nào"
        });

        TITLE_MAP.put("Mảng trong Java", new String[]{
            "Mảng trong Java là gì?\n"
            + "A. Một biến chứa nhiều giá trị cùng kiểu\n"
            + "B. Một kiểu dữ liệu cơ bản\n"
            + "C. Một loại vòng lặp đặc biệt\n"
            + "D. Một kiểu dữ liệu động",
            "Chỉ số (index) của mảng trong Java bắt đầu từ số nào?\n"
            + "A. -1\n"
            + "B. 0\n"
            + "C. 1\n"
            + "D. 2",
            "Cách khai báo mảng một chiều đúng trong Java là?\n"
            + "A. int arr[];\n"
            + "B. arr int[];\n"
            + "C. array int[];\n"
            + "D. int[] array;",
            "Cách khởi tạo mảng một chiều với 5 phần tử kiểu int là?\n"
            + "A. int arr = new int[5];\n"
            + "B. int arr[] = new int(5);\n"
            + "C. int arr[] = new int[5];\n"
            + "D. int[5] arr = new int;",
            "Khi truy cập phần tử ngoài phạm vi mảng trong Java sẽ xảy ra điều gì?\n"
            + "A. Không có lỗi\n"
            + "B. Báo lỗi biên dịch\n"
            + "C. Ném ngoại lệ ArrayIndexOutOfBoundsException\n"
            + "D. Phần tử đó được tự động tạo ra",
            "Cách gán giá trị cho phần tử thứ 2 của mảng arr là?\n"
            + "A. arr(1) = 10;\n"
            + "B. arr[2] = 10;\n"
            + "C. arr[1] = 10;\n"
            + "D. arr{1} = 10;",
            "Để lấy độ dài (số phần tử) của mảng trong Java, ta dùng?\n"
            + "A. arr.length();\n"
            + "B. arr.size();\n"
            + "C. arr.length;\n"
            + "D. arr.getLength();",
            "Cách duyệt tất cả phần tử của mảng bằng for-each là?\n"
            + "A. for (int i : arr)\n"
            + "B. for (int i = 0; i < arr; i++)\n"
            + "C. foreach (int i in arr)\n"
            + "D. for each (int i : arr)",
            "Mảng trong Java có thể chứa các kiểu dữ liệu nào?\n"
            + "A. Chỉ kiểu int\n"
            + "B. Chỉ kiểu tham chiếu\n"
            + "C. Chỉ kiểu nguyên thủy\n"
            + "D. Bất kỳ kiểu dữ liệu nào",
            "Mảng hai chiều trong Java có thể được hiểu là?\n"
            + "A. Mảng của mảng\n"
            + "B. Mảng của chuỗi\n"
            + "C. Mảng động\n"
            + "D. Mảng một chiều nâng cấp"
        });

        TITLE_MAP.put("Xử lý chuỗi trong Java", new String[]{
            "Chuỗi (String) trong Java là kiểu dữ liệu gì?\n"
            + "A. Kiểu dữ liệu nguyên thủy\n"
            + "B. Một đối tượng\n"
            + "C. Một mảng ký tự\n"
            + "D. Một loại mảng đặc biệt",
            "Phương thức nào dùng để lấy độ dài chuỗi trong Java?\n"
            + "A. size()\n"
            + "B. length()\n"
            + "C. getSize()\n"
            + "D. getLength()",
            "Phương thức nào nối hai chuỗi lại với nhau trong Java?\n"
            + "A. append()\n"
            + "B. concat()\n"
            + "C. join()\n"
            + "D. add()",
            "Toán tử nào cũng có thể dùng để nối chuỗi trong Java?\n"
            + "A. *\n"
            + "B. +\n"
            + "C. &\n"
            + "D. &&",
            "Phương thức nào để lấy ký tự tại vị trí bất kỳ trong chuỗi?\n"
            + "A. charAt(index)\n"
            + "B. getChar(index)\n"
            + "C. indexOf(char)\n"
            + "D. substring(index)",
            "Phương thức nào để so sánh hai chuỗi về mặt nội dung?\n"
            + "A. ==\n"
            + "B. equals()\n"
            + "C. compareTo()\n"
            + "D. compare()",
            "Phương thức nào để kiểm tra một chuỗi có bắt đầu bằng chuỗi con cho trước không?\n"
            + "A. startsWith()\n"
            + "B. beginsWith()\n"
            + "C. hasPrefix()\n"
            + "D. matchStart()",
            "Phương thức nào để chuyển tất cả ký tự trong chuỗi thành chữ hoa?\n"
            + "A. upperCase()\n"
            + "B. toUpperCase()\n"
            + "C. toCaps()\n"
            + "D. makeUpper()",
            "Phương thức nào cắt bỏ khoảng trắng ở đầu và cuối chuỗi trong Java?\n"
            + "A. removeSpace()\n"
            + "B. strip()\n"
            + "C. trim()\n"
            + "D. cleanSpace()",
            "Để tách chuỗi thành mảng các chuỗi con dựa trên ký tự phân tách, dùng phương thức nào?\n"
            + "A. split()\n"
            + "B. divide()\n"
            + "C. cut()\n"
            + "D. separate()"
        });

        TITLE_MAP.put("Lập trình đa luồng là gì?", new String[]{
            "Lập trình đa luồng (Multithreading) trong Java là gì?\n"
            + "A. Chạy nhiều chương trình Java cùng lúc\n"
            + "B. Chia nhỏ một chương trình thành nhiều tiến trình độc lập\n"
            + "C. Chạy nhiều luồng thực thi đồng thời trong một chương trình\n"
            + "D. Sử dụng nhiều CPU để chạy chương trình nhanh hơn",
            "Trong Java, lớp nào được sử dụng để tạo luồng?\n"
            + "A. Thread\n"
            + "B. Runnable\n"
            + "C. Executor\n"
            + "D. Timer",
            "Phương thức nào bắt đầu thực thi một luồng trong Java?\n"
            + "A. run()\n"
            + "B. execute()\n"
            + "C. start()\n"
            + "D. launch()",
            "Để tạo một luồng bằng cách hiện thực (implement) giao diện Runnable, cần override phương thức nào?\n"
            + "A. run()\n"
            + "B. start()\n"
            + "C. execute()\n"
            + "D. launch()",
            "Khi một luồng gọi phương thức sleep(), điều gì xảy ra?\n"
            + "A. Luồng kết thúc\n"
            + "B. Luồng tạm ngưng trong một khoảng thời gian\n"
            + "C. Luồng chuyển sang trạng thái chạy\n"
            + "D. Luồng được ưu tiên cao hơn",
            "Khi hai hay nhiều luồng truy cập đồng thời vào một tài nguyên dùng chung, hiện tượng gì có thể xảy ra?\n"
            + "A. Deadlock\n"
            + "B. Starvation\n"
            + "C. Race condition\n"
            + "D. Blockage",
            "Phương thức nào dùng để chờ một luồng kết thúc trước khi tiếp tục thực thi?\n"
            + "A. wait()\n"
            + "B. join()\n"
            + "C. notify()\n"
            + "D. end()",
            "Từ khóa nào trong Java dùng để đồng bộ hóa truy cập tài nguyên giữa các luồng?\n"
            + "A. synchronize\n"
            + "B. synchronized\n"
            + "C. sync\n"
            + "D. threadSafe",
            "ExecutorService trong Java dùng để làm gì?\n"
            + "A. Tạo luồng mới thủ công\n"
            + "B. Quản lý và điều phối thực thi các luồng\n"
            + "C. Tạm ngưng luồng\n"
            + "D. Kết thúc luồng lập tức",
            "Ưu điểm chính của lập trình đa luồng là gì?\n"
            + "A. Giảm tốc độ xử lý\n"
            + "B. Tiêu tốn nhiều tài nguyên hơn\n"
            + "C. Tăng hiệu suất và tận dụng tối đa CPU\n"
            + "D. Làm cho chương trình đơn giản hơn"
        });

        TITLE_MAP.put("Tạo luồng trong Java", new String[]{
            "Cách nào sau đây KHÔNG phải là cách tạo luồng trong Java?\n"
            + "A. Kế thừa lớp Thread\n"
            + "B. Hiện thực giao diện Runnable\n"
            + "C. Sử dụng TimerTask\n"
            + "D. Kế thừa lớp Executor",
            "Khi kế thừa lớp Thread để tạo luồng, cần override phương thức nào?\n"
            + "A. run()\n"
            + "B. start()\n"
            + "C. execute()\n"
            + "D. initialize()",
            "Khi hiện thực giao diện Runnable, bạn cần thực hiện hành động nào?\n"
            + "A. Override phương thức start()\n"
            + "B. Override phương thức run()\n"
            + "C. Kế thừa lớp Thread\n"
            + "D. Gọi phương thức stop() trong run()",
            "Để chạy một đối tượng Runnable, cần thực hiện bước nào sau đây?\n"
            + "A. Gọi trực tiếp run()\n"
            + "B. Tạo Thread và truyền Runnable vào constructor, sau đó gọi start()\n"
            + "C. Gọi start() từ đối tượng Runnable\n"
            + "D. Gọi sleep() trước khi start()",
            "Cách nào sau đây đúng để tạo và khởi chạy luồng sử dụng lớp Thread?\n"
            + "A. Thread t = new Thread(); t.run();\n"
            + "B. Thread t = new Thread(); t.start();\n"
            + "C. Thread t = new Thread(); t.execute();\n"
            + "D. Thread t = new Thread(); t.sleep();",
            "Ưu điểm của việc tạo luồng bằng giao diện Runnable so với kế thừa Thread là gì?\n"
            + "A. Runnable dễ bảo trì hơn\n"
            + "B. Có thể kế thừa lớp khác\n"
            + "C. Runnable tiết kiệm bộ nhớ hơn\n"
            + "D. Cả A và B đều đúng",
            "Sử dụng ExecutorService để tạo và quản lý luồng mang lại lợi ích gì?\n"
            + "A. Tạo luồng linh hoạt và quản lý pool dễ dàng\n"
            + "B. Không cần quản lý shutdown luồng\n"
            + "C. Không cần thực hiện Runnable\n"
            + "D. Giúp chương trình đơn luồng",
            "Cách shutdown ExecutorService sau khi hoàn thành các nhiệm vụ là?\n"
            + "A. call() ExecutorService\n"
            + "B. terminate() ExecutorService\n"
            + "C. shutdown() ExecutorService\n"
            + "D. exit() ExecutorService",
            "Để tạo một thread bằng lambda expression (Java 8 trở lên), cách nào sau đây đúng?\n"
            + "A. new Thread(() -> { /* code */ }).start();\n"
            + "B. new Thread(new Runnable() { }).start();\n"
            + "C. new Thread(lambda() { }).start();\n"
            + "D. Thread.create(() -> { /* code */ });",
            "Khi một luồng được tạo nhưng không gọi start(), điều gì xảy ra?\n"
            + "A. Luồng tự động bắt đầu\n"
            + "B. Không có gì xảy ra\n"
            + "C. Luồng bị huỷ bỏ\n"
            + "D. Gây ra ngoại lệ"
        });

        TITLE_MAP.put("Đồng bộ hóa luồng", new String[]{
            "Mục đích chính của việc đồng bộ hóa luồng là gì?\n"
            + "A. Tăng tốc độ thực thi luồng\n"
            + "B. Đảm bảo an toàn dữ liệu khi nhiều luồng truy cập\n"
            + "C. Làm chương trình chạy một luồng duy nhất\n"
            + "D. Ngăn luồng chết (deadlock)",
            "Từ khóa nào trong Java được sử dụng để đồng bộ hóa?\n"
            + "A. synchronize\n"
            + "B. synchronized\n"
            + "C. synchronization\n"
            + "D. syncing",
            "Khi một phương thức được khai báo synchronized, điều gì xảy ra?\n"
            + "A. Nhiều luồng có thể thực hiện đồng thời\n"
            + "B. Chỉ một luồng được phép thực hiện tại một thời điểm\n"
            + "C. Phương thức tự động bị chặn lại\n"
            + "D. Các luồng bị huỷ khi gọi phương thức",
            "Đồng bộ hóa trên đối tượng nào để khóa toàn bộ phương thức static synchronized?\n"
            + "A. Đối tượng this\n"
            + "B. Đối tượng class\n"
            + "C. Đối tượng method\n"
            + "D. Đối tượng instance",
            "Câu lệnh nào đúng để đồng bộ hóa một block code trong Java?\n"
            + "A. synchronized(object) { /* code */ }\n"
            + "B. synchronize(object) { /* code */ }\n"
            + "C. sync(object) { /* code */ }\n"
            + "D. sync_block(object) { /* code */ }",
            "Hiện tượng deadlock trong đa luồng là gì?\n"
            + "A. Các luồng kết thúc ngay lập tức\n"
            + "B. Các luồng chờ nhau vô thời hạn vì tranh chấp tài nguyên\n"
            + "C. Các luồng đồng thời thực hiện công việc\n"
            + "D. Các luồng không bao giờ được tạo ra",
            "Để tránh deadlock, cách nào sau đây là hợp lý?\n"
            + "A. Sử dụng nhiều khóa cùng lúc\n"
            + "B. Tránh khóa chéo tài nguyên\n"
            + "C. Luôn đồng bộ hóa tất cả các phương thức\n"
            + "D. Không dùng synchronized",
            "ReentrantLock trong Java khác synchronized như thế nào?\n"
            + "A. ReentrantLock linh hoạt hơn và có thể unlock thủ công\n"
            + "B. synchronized nhanh hơn\n"
            + "C. ReentrantLock không cần khóa\n"
            + "D. Không có sự khác biệt nào",
            "Phương thức nào sau đây của ReentrantLock được dùng để mở khóa?\n"
            + "A. open()\n"
            + "B. unlock()\n"
            + "C. release()\n"
            + "D. stopLock()",
            "Khi một luồng giữ một khóa, các luồng khác muốn vào khối synchronized sẽ thế nào?\n"
            + "A. Tiếp tục thực thi bình thường\n"
            + "B. Bị chặn cho đến khi khóa được nhả\n"
            + "C. Tạo khóa mới\n"
            + "D. Tự động bỏ qua synchronized"
        });

        TITLE_MAP.put("Xử lý sự kiện trong Java", new String[]{
            "Trong Java, xử lý sự kiện chủ yếu được sử dụng trong thành phần nào?\n"
            + "A. Cấu trúc dữ liệu\n"
            + "B. Lập trình giao diện người dùng (GUI)\n"
            + "C. Lập trình đa luồng\n"
            + "D. Lập trình mạng",
            "Lớp nào trong Java được sử dụng để xử lý sự kiện hành động (ActionEvent)?\n"
            + "A. ActionListener\n"
            + "B. EventListener\n"
            + "C. MouseListener\n"
            + "D. KeyListener",
            "Phương thức nào cần được override khi triển khai interface ActionListener?\n"
            + "A. keyPressed(KeyEvent e)\n"
            + "B. actionPerformed(ActionEvent e)\n"
            + "C. mouseClicked(MouseEvent e)\n"
            + "D. windowClosing(WindowEvent e)",
            "Sự kiện nào được tạo ra khi người dùng nhấn một nút trong Java Swing?\n"
            + "A. KeyEvent\n"
            + "B. MouseEvent\n"
            + "C. ActionEvent\n"
            + "D. WindowEvent",
            "Để đăng ký lắng nghe sự kiện cho một nút JButton, phương thức nào được sử dụng?\n"
            + "A. addMouseListener()\n"
            + "B. addActionListener()\n"
            + "C. addKeyListener()\n"
            + "D. addWindowListener()",
            "Đối tượng nào chịu trách nhiệm phát sinh sự kiện trong mô hình xử lý sự kiện Java?\n"
            + "A. Listener\n"
            + "B. Source\n"
            + "C. Handler\n"
            + "D. Dispatcher",
            "Để xử lý sự kiện bàn phím (keyboard) trong Java, interface nào được sử dụng?\n"
            + "A. KeyListener\n"
            + "B. ActionListener\n"
            + "C. MouseListener\n"
            + "D. FocusListener",
            "Sự kiện WindowEvent thường liên quan đến hành động nào?\n"
            + "A. Gõ phím\n"
            + "B. Đóng hoặc mở cửa sổ\n"
            + "C. Click chuột\n"
            + "D. Kéo thả chuột",
            "Interface nào lắng nghe các sự kiện liên quan đến chuột như click, enter, exit?\n"
            + "A. ActionListener\n"
            + "B. MouseListener\n"
            + "C. KeyListener\n"
            + "D. WindowListener",
            "Khi triển khai nhiều loại Listener cho cùng một đối tượng, cần lưu ý điều gì?\n"
            + "A. Không cần làm gì đặc biệt\n"
            + "B. Phải đăng ký từng listener riêng biệt\n"
            + "C. Chỉ dùng được một listener\n"
            + "D. Java tự động quản lý"
        });

        TITLE_MAP.put("Giới thiệu về lập trình mạng trong Java", new String[]{
            "Trong Java, gói (package) nào được sử dụng để lập trình mạng?\n"
            + "A. java.net\n"
            + "B. java.io\n"
            + "C. java.util\n"
            + "D. java.awt",
            "Lớp nào trong Java đại diện cho một địa chỉ IP?\n"
            + "A. URL\n"
            + "B. InetAddress\n"
            + "C. ServerSocket\n"
            + "D. Socket",
            "Đối tượng Socket trong Java được sử dụng cho mục đích gì?\n"
            + "A. Lưu trữ dữ liệu\n"
            + "B. Quản lý giao diện người dùng\n"
            + "C. Kết nối và giao tiếp giữa client và server\n"
            + "D. Quản lý bộ nhớ",
            "Lớp nào được dùng để lắng nghe kết nối từ client trong mô hình lập trình mạng Java?\n"
            + "A. Socket\n"
            + "B. ServerSocket\n"
            + "C. DatagramPacket\n"
            + "D. URLConnection",
            "Phương thức nào của lớp ServerSocket dùng để chấp nhận kết nối từ client?\n"
            + "A. connect()\n"
            + "B. listen()\n"
            + "C. accept()\n"
            + "D. open()",
            "Để thiết lập kết nối tới server từ client, chúng ta cần khởi tạo đối tượng nào?\n"
            + "A. ServerSocket\n"
            + "B. URL\n"
            + "C. Socket\n"
            + "D. InputStream",
            "Giao thức nào được sử dụng phổ biến trong lập trình mạng Java cho kết nối tin cậy?\n"
            + "A. UDP\n"
            + "B. FTP\n"
            + "C. TCP\n"
            + "D. HTTP",
            "Đối với giao thức UDP trong Java, lớp nào được sử dụng để gửi dữ liệu?\n"
            + "A. DatagramSocket\n"
            + "B. ServerSocket\n"
            + "C. Socket\n"
            + "D. URLConnection",
            "Lớp URL trong Java thường được dùng cho mục đích gì?\n"
            + "A. Gửi và nhận email\n"
            + "B. Truy cập tài nguyên qua Internet\n"
            + "C. Thiết lập kết nối TCP\n"
            + "D. Mã hóa dữ liệu",
            "Khi một kết nối mạng Java bị lỗi, ngoại lệ nào thường được ném ra?\n"
            + "A. IOException\n"
            + "B. SQLException\n"
            + "C. NullPointerException\n"
            + "D. ClassNotFoundException"
        });

        TITLE_MAP.put("Lập trình Socket với TCP/IP", new String[]{
            "Lớp nào trong Java được sử dụng để tạo client socket trong lập trình TCP/IP?\n"
            + "A. ServerSocket\n"
            + "B. Socket\n"
            + "C. DatagramSocket\n"
            + "D. URLConnection",
            "Để tạo server TCP trong Java, chúng ta sử dụng lớp nào?\n"
            + "A. Socket\n"
            + "B. ServerSocket\n"
            + "C. DatagramSocket\n"
            + "D. URL",
            "Phương thức nào của lớp Socket dùng để lấy luồng đầu vào để đọc dữ liệu?\n"
            + "A. getOutputStream()\n"
            + "B. getInputStream()\n"
            + "C. read()\n"
            + "D. write()",
            "Phương thức accept() của lớp ServerSocket trả về đối tượng gì?\n"
            + "A. Socket\n"
            + "B. ServerSocket\n"
            + "C. DatagramPacket\n"
            + "D. URLConnection",
            "Để gửi dữ liệu tới server trong lập trình TCP client, ta sử dụng đối tượng nào?\n"
            + "A. InputStream\n"
            + "B. OutputStream\n"
            + "C. DataInputStream\n"
            + "D. Reader",
            "Câu lệnh nào tạo một ServerSocket lắng nghe trên cổng 1234?\n"
            + "A. new ServerSocket(1234);\n"
            + "B. new Socket(1234);\n"
            + "C. ServerSocket.listen(1234);\n"
            + "D. ServerSocket.connect(1234);",
            "Phương thức nào được sử dụng để đóng kết nối Socket trong Java?\n"
            + "A. end()\n"
            + "B. close()\n"
            + "C. shutdown()\n"
            + "D. terminate()",
            "Trong lập trình TCP/IP, luồng OutputStream thường được sử dụng để làm gì?\n"
            + "A. Nhận dữ liệu từ server\n"
            + "B. Gửi dữ liệu tới server\n"
            + "C. Đóng kết nối\n"
            + "D. Chấp nhận kết nối",
            "Đối tượng ServerSocket thường thực hiện thao tác nào sau đây?\n"
            + "A. Kết nối tới server khác\n"
            + "B. Lắng nghe yêu cầu kết nối từ client\n"
            + "C. Đóng luồng dữ liệu\n"
            + "D. Gửi dữ liệu tới client",
            "Khi một client kết nối thành công tới server qua TCP/IP, server sẽ tạo ra đối tượng gì để giao tiếp?\n"
            + "A. DatagramSocket\n"
            + "B. Socket\n"
            + "C. ServerSocket\n"
            + "D. URL"
        });

        TITLE_MAP.put("Lập trình UDP trong Java", new String[]{
            "Lớp nào trong Java được sử dụng để gửi và nhận gói tin UDP?\n"
            + "A. Socket\n"
            + "B. ServerSocket\n"
            + "C. DatagramSocket\n"
            + "D. URLConnection",
            "Gói tin UDP trong Java được đại diện bởi lớp nào?\n"
            + "A. DatagramPacket\n"
            + "B. SocketPacket\n"
            + "C. UDPPacket\n"
            + "D. PacketData",
            "Khi gửi dữ liệu bằng UDP, chúng ta cần chỉ định gì?\n"
            + "A. Địa chỉ IP và cổng đích\n"
            + "B. Chỉ địa chỉ IP\n"
            + "C. Chỉ cổng đích\n"
            + "D. Không cần chỉ định gì",
            "Phương thức nào của DatagramSocket dùng để gửi dữ liệu?\n"
            + "A. sendPacket()\n"
            + "B. transmit()\n"
            + "C. send()\n"
            + "D. deliver()",
            "Phương thức nào của DatagramSocket được sử dụng để nhận dữ liệu?\n"
            + "A. receive()\n"
            + "B. get()\n"
            + "C. fetch()\n"
            + "D. read()",
            "Khi tạo đối tượng DatagramPacket để gửi, tham số cần thiết là gì?\n"
            + "A. Dữ liệu, độ dài dữ liệu, địa chỉ IP, cổng\n"
            + "B. Dữ liệu và độ dài dữ liệu\n"
            + "C. Chỉ dữ liệu\n"
            + "D. Chỉ địa chỉ IP và cổng",
            "Ưu điểm lớn nhất của UDP so với TCP là gì?\n"
            + "A. Độ tin cậy cao hơn\n"
            + "B. Tốc độ truyền nhanh hơn\n"
            + "C. Bảo mật tốt hơn\n"
            + "D. Hỗ trợ nhiều kết nối đồng thời hơn",
            "UDP có đảm bảo thứ tự gói tin khi truyền không?\n"
            + "A. Có\n"
            + "B. Không",
            "Trong UDP, khi nhận dữ liệu, nếu kích thước gói tin vượt quá bộ đệm, điều gì xảy ra?\n"
            + "A. Gói tin bị chia nhỏ\n"
            + "B. Gói tin bị loại bỏ\n"
            + "C. Dữ liệu dư bị cắt bỏ\n"
            + "D. Dữ liệu tự động thêm vào bộ đệm",
            "Phương thức nào được dùng để đóng kết nối DatagramSocket?\n"
            + "A. end()\n"
            + "B. shutdown()\n"
            + "C. close()\n"
            + "D. terminate()"
        });

        TITLE_MAP.put("JDBC là gì?", new String[]{
            "JDBC viết tắt của cụm từ nào?\n"
            + "A. Java Database Connectivity\n"
            + "B. Java Data Collection\n"
            + "C. Java Development Connector\n"
            + "D. Java Data Communication",
            "Mục đích chính của JDBC là gì?\n"
            + "A. Kết nối Java với các dịch vụ web\n"
            + "B. Kết nối Java với cơ sở dữ liệu\n"
            + "C. Kết nối Java với API bên ngoài\n"
            + "D. Kết nối Java với các ứng dụng desktop",
            "Thành phần nào cung cấp giao tiếp giữa Java và cơ sở dữ liệu trong JDBC?\n"
            + "A. JDBC Driver\n"
            + "B. JDBC API\n"
            + "C. JDBC Manager\n"
            + "D. JDBC Server",
            "Lớp nào trong JDBC được sử dụng để thực thi câu lệnh SQL?\n"
            + "A. Statement\n"
            + "B. Query\n"
            + "C. SQLExecutor\n"
            + "D. SQLCommand",
            "Giao diện nào trong JDBC dùng để duyệt kết quả của truy vấn SELECT?\n"
            + "A. Statement\n"
            + "B. ResultSet\n"
            + "C. Connection\n"
            + "D. PreparedStatement",
            "Để thực hiện kết nối với cơ sở dữ liệu, chúng ta cần đối tượng nào trong JDBC?\n"
            + "A. ResultSet\n"
            + "B. Connection\n"
            + "C. Statement\n"
            + "D. Driver",
            "Để đóng kết nối JDBC, phương thức nào được sử dụng?\n"
            + "A. shutdown()\n"
            + "B. disconnect()\n"
            + "C. close()\n"
            + "D. end()",
            "DriverManager trong JDBC có vai trò gì?\n"
            + "A. Quản lý các kết nối đến cơ sở dữ liệu\n"
            + "B. Thực thi các câu lệnh SQL\n"
            + "C. Lưu trữ dữ liệu tạm thời\n"
            + "D. Xử lý lỗi cơ sở dữ liệu",
            "Phương thức nào của Connection dùng để tạo đối tượng Statement?\n"
            + "A. createStatement()\n"
            + "B. createQuery()\n"
            + "C. buildStatement()\n"
            + "D. newStatement()",
            "Khi sử dụng JDBC, điều gì xảy ra nếu không đóng kết nối sau khi sử dụng?\n"
            + "A. Không ảnh hưởng gì\n"
            + "B. Bộ nhớ sẽ bị rò rỉ\n"
            + "C. Chương trình sẽ tự động đóng kết nối\n"
            + "D. Câu lệnh SQL sẽ không được thực thi"
        });

        TITLE_MAP.put("Kết nối MySQL với Java", new String[]{
            "Để kết nối Java với MySQL, cần sử dụng loại driver nào?\n"
            + "A. JDBC-ODBC Driver\n"
            + "B. MySQL Connector/J\n"
            + "C. OLE DB Driver\n"
            + "D. SQLite JDBC Driver",
            "Câu lệnh nào dùng để nạp driver MySQL trong Java?\n"
            + "A. Class.forName(\"com.mysql.cj.jdbc.Driver\")\n"
            + "B. Driver.load(\"mysql.driver\")\n"
            + "C. LoadDriver(\"com.mysql.jdbc.Driver\")\n"
            + "D. new Driver(\"mysql\")",
            "Chuỗi kết nối (URL) để kết nối đến MySQL thường bắt đầu bằng?\n"
            + "A. jdbc:oracle:\n"
            + "B. jdbc:mysql:\n"
            + "C. jdbc:sqlserver:\n"
            + "D. jdbc:postgresql:",
            "Thông tin nào KHÔNG cần thiết để kết nối MySQL từ Java?\n"
            + "A. Tên database\n"
            + "B. Địa chỉ IP server\n"
            + "C. Username và Password\n"
            + "D. Phiên bản hệ điều hành server",
            "Câu lệnh nào tạo kết nối đến cơ sở dữ liệu MySQL trong Java?\n"
            + "A. Connection conn = DriverManager.openConnection(url);\n"
            + "B. Connection conn = DriverManager.connect(url);\n"
            + "C. Connection conn = DriverManager.getConnection(url, user, password);\n"
            + "D. Connection conn = DriverManager.newConnection(url);",
            "Sau khi kết nối thành công, đối tượng nào dùng để thực thi câu lệnh SQL?\n"
            + "A. Connection\n"
            + "B. Statement\n"
            + "C. DriverManager\n"
            + "D. ResultSet",
            "Phương thức nào của Statement dùng để thực thi lệnh INSERT, UPDATE hoặc DELETE?\n"
            + "A. executeQuery()\n"
            + "B. executeUpdate()\n"
            + "C. executeInsert()\n"
            + "D. executeModify()",
            "Nếu muốn truy vấn dữ liệu (SELECT), phương thức nào được dùng trong Statement?\n"
            + "A. executeUpdate()\n"
            + "B. executeInsert()\n"
            + "C. executeQuery()\n"
            + "D. executeModify()",
            "Khi sử dụng MySQL Connector/J, cần thêm thư viện nào vào dự án Java?\n"
            + "A. mysql-connector-java.jar\n"
            + "B. mysql-driver.jar\n"
            + "C. jdbc-mysql.jar\n"
            + "D. java-mysql-connector.jar",
            "Nếu kết nối thất bại, ngoại lệ nào thường được ném ra?\n"
            + "A. IOException\n"
            + "B. SQLException\n"
            + "C. ConnectException\n"
            + "D. DatabaseException"
        });

        TITLE_MAP.put("Thực hiện CRUD", new String[]{
            "Trong CRUD, chữ C đại diện cho thao tác nào?\n"
            + "A. Create\n"
            + "B. Copy\n"
            + "C. Connect\n"
            + "D. Calculate",
            "Trong thao tác CRUD, lệnh SQL nào dùng để tạo mới dữ liệu?\n"
            + "A. SELECT\n"
            + "B. INSERT\n"
            + "C. UPDATE\n"
            + "D. DELETE",
            "Để đọc dữ liệu từ database, câu lệnh SQL nào được dùng?\n"
            + "A. SELECT\n"
            + "B. INSERT\n"
            + "C. UPDATE\n"
            + "D. DELETE",
            "Trong CRUD, thao tác Update dùng để làm gì?\n"
            + "A. Xóa dữ liệu\n"
            + "B. Thêm dữ liệu mới\n"
            + "C. Cập nhật dữ liệu hiện có\n"
            + "D. Sao chép dữ liệu",
            "Lệnh SQL nào dùng để xóa dữ liệu trong CRUD?\n"
            + "A. UPDATE\n"
            + "B. DROP\n"
            + "C. DELETE\n"
            + "D. REMOVE",
            "Trong Java, đối tượng nào dùng để thực thi lệnh SQL dạng CRUD?\n"
            + "A. Connection\n"
            + "B. Statement\n"
            + "C. DriverManager\n"
            + "D. ResultSet",
            "Khi thực hiện INSERT, UPDATE, DELETE trong Java, phương thức nào được sử dụng?\n"
            + "A. executeQuery()\n"
            + "B. executeUpdate()\n"
            + "C. executeInsert()\n"
            + "D. executeModify()",
            "Kết quả trả về của phương thức executeUpdate() là gì?\n"
            + "A. Đối tượng Connection\n"
            + "B. Đối tượng Statement\n"
            + "C. Số dòng bị ảnh hưởng\n"
            + "D. Đối tượng ResultSet",
            "Khi thực hiện lệnh SELECT trong Java, kết quả trả về là đối tượng nào?\n"
            + "A. Connection\n"
            + "B. Statement\n"
            + "C. ResultSet\n"
            + "D. PreparedStatement",
            "Cách tốt nhất để bảo vệ lệnh SQL khỏi lỗi SQL Injection trong Java là gì?\n"
            + "A. Dùng Statement\n"
            + "B. Dùng DriverManager\n"
            + "C. Dùng Connection trực tiếp\n"
            + "D. Dùng PreparedStatement"
        });

        TITLE_MAP.put("Servlet là gì?", new String[]{
            "Servlet trong Java dùng để làm gì?\n"
            + "A. Tạo giao diện đồ họa\n"
            + "B. Xử lý yêu cầu từ client và tạo phản hồi\n"
            + "C. Lưu trữ dữ liệu\n"
            + "D. Quản lý kết nối cơ sở dữ liệu",
            "Servlet hoạt động chủ yếu ở đâu?\n"
            + "A. Trình duyệt web\n"
            + "B. Máy chủ (Server)\n"
            + "C. Thiết bị di động\n"
            + "D. Ứng dụng desktop",
            "Servlet được quản lý bởi thành phần nào?\n"
            + "A. Trình duyệt\n"
            + "B. Máy ảo Java\n"
            + "C. Container (Servlet Container)\n"
            + "D. JDBC Driver",
            "Để tạo một Servlet, lớp Java cần kế thừa lớp nào?\n"
            + "A. HttpServlet\n"
            + "B. JFrame\n"
            + "C. Thread\n"
            + "D. ActionListener",
            "Phương thức nào trong Servlet được gọi đầu tiên khi khởi tạo?\n"
            + "A. doGet()\n"
            + "B. doPost()\n"
            + "C. init()\n"
            + "D. destroy()",
            "Phương thức doGet() trong Servlet xử lý yêu cầu theo giao thức nào?\n"
            + "A. POST\n"
            + "B. GET\n"
            + "C. PUT\n"
            + "D. DELETE",
            "Để gửi dữ liệu từ client theo phương thức POST, Servlet sử dụng phương thức nào?\n"
            + "A. doPost()\n"
            + "B. doGet()\n"
            + "C. init()\n"
            + "D. destroy()",
            "Khi nào phương thức destroy() của Servlet được gọi?\n"
            + "A. Khi servlet khởi tạo\n"
            + "B. Khi servlet đang xử lý yêu cầu\n"
            + "C. Khi servlet bị gỡ bỏ hoặc server shutdown\n"
            + "D. Khi servlet nhận yêu cầu GET",
            "Để định nghĩa Servlet trong file cấu hình web.xml, thẻ nào được sử dụng?\n"
            + "A. <servlet>\n"
            + "B. <listener>\n"
            + "C. <context-param>\n"
            + "D. <filter>",
            "Ưu điểm chính của Servlet so với CGI là gì?\n"
            + "A. Tốc độ xử lý chậm hơn\n"
            + "B. Khả năng đa nền tảng\n"
            + "C. Mỗi yêu cầu tạo một tiến trình mới\n"
            + "D. Không hỗ trợ giao tiếp mạng"
        });

        TITLE_MAP.put("Tạo Servlet cơ bản", new String[]{
            "Để tạo một Servlet cơ bản trong Java, lớp cần kế thừa lớp nào?\n"
            + "A. HttpServlet\n"
            + "B. ServletRequest\n"
            + "C. ServletResponse\n"
            + "D. GenericServlet",
            "Phương thức nào thường được ghi đè khi viết Servlet để xử lý yêu cầu GET?\n"
            + "A. doPost()\n"
            + "B. doGet()\n"
            + "C. init()\n"
            + "D. destroy()",
            "Trong Servlet, để gửi dữ liệu trả về client, chúng ta sử dụng đối tượng nào?\n"
            + "A. HttpServletRequest\n"
            + "B. HttpSession\n"
            + "C. HttpServletResponse\n"
            + "D. ServletConfig",
            "Để lấy tham số gửi từ client trong Servlet, phương thức nào được dùng?\n"
            + "A. getParameter()\n"
            + "B. getAttribute()\n"
            + "C. setParameter()\n"
            + "D. setAttribute()",
            "Annotation nào trong Java dùng để khai báo một Servlet thay cho cấu hình trong web.xml?\n"
            + "A. @WebService\n"
            + "B. @WebServlet\n"
            + "C. @ServletMapping\n"
            + "D. @HttpServlet",
            "Phương thức init() trong Servlet dùng để làm gì?\n"
            + "A. Xử lý yêu cầu client\n"
            + "B. Khởi tạo servlet khi được load lần đầu\n"
            + "C. Gửi phản hồi về client\n"
            + "D. Kết thúc servlet",
            "Để ghi nội dung HTML vào phản hồi trong Servlet, chúng ta dùng đối tượng nào từ response?\n"
            + "A. PrintWriter\n"
            + "B. BufferedReader\n"
            + "C. OutputStream\n"
            + "D. Scanner",
            "Khi viết Servlet, để xác định URL cho Servlet, chúng ta sử dụng thuộc tính nào của @WebServlet?\n"
            + "A. name\n"
            + "B. urlPatterns\n"
            + "C. value\n"
            + "D. description",
            "Để triển khai và chạy Servlet, cần phải deploy lên đâu?\n"
            + "A. Trình duyệt\n"
            + "B. Database\n"
            + "C. Web Server (ví dụ: Apache Tomcat)\n"
            + "D. File System",
            "Trong phương thức doGet() của Servlet, để thiết lập kiểu nội dung trả về là HTML, chúng ta dùng lệnh nào?\n"
            + "A. response.setContentType(\"text/plain\")\n"
            + "B. response.setContentType(\"text/html\")\n"
            + "C. response.setHeader(\"Content-Type\", \"application/json\")\n"
            + "D. response.setType(\"text/html\")"
        });

        TITLE_MAP.put("JSP là gì?", new String[]{
            "JSP là viết tắt của cụm từ nào?\n"
            + "A. Java Servlet Page\n"
            + "B. Java Server Page\n"
            + "C. Java Service Program\n"
            + "D. Java Servlet Program",
            "JSP chủ yếu được sử dụng để làm gì?\n"
            + "A. Xây dựng giao diện người dùng web động\n"
            + "B. Quản lý cơ sở dữ liệu\n"
            + "C. Phát triển ứng dụng desktop\n"
            + "D. Xử lý đa luồng",
            "Khi trình duyệt gửi yêu cầu đến một trang JSP, JSP sẽ được biên dịch thành gì?\n"
            + "A. File HTML\n"
            + "B. Servlet\n"
            + "C. File CSS\n"
            + "D. File JavaScript",
            "Trong JSP, để nhúng mã Java vào trang HTML, ta dùng cặp ký hiệu nào?\n"
            + "A. <% %>\n"
            + "B. {{ }}\n"
            + "C. <!-- -->\n"
            + "D. [[ ]] ",
            "JSP chạy trên môi trường nào?\n"
            + "A. Web Server\n"
            + "B. Application Server\n"
            + "C. Database Server\n"
            + "D. File Server",
            "Ưu điểm của JSP so với Servlet là gì?\n"
            + "A. Dễ dàng viết mã Java thuần\n"
            + "B. Dễ dàng viết giao diện người dùng\n"
            + "C. Không cần trình biên dịch\n"
            + "D. Không cần máy chủ",
            "File JSP có phần mở rộng đuôi là gì?\n"
            + "A. .java\n"
            + "B. .html\n"
            + "C. .jsp\n"
            + "D. .xml",
            "Thành phần nào trong JSP cho phép định nghĩa biến hoặc phương thức được sử dụng cho toàn bộ trang?\n"
            + "A. Declaration\n"
            + "B. Scriptlet\n"
            + "C. Expression\n"
            + "D. Directive",
            "Để in dữ liệu ra trang HTML từ JSP, ta dùng cú pháp nào?\n"
            + "A. <%= %>\n"
            + "B. <% %>\n"
            + "C. <%! %>\n"
            + "D. <%@ %>",
            "JSP được sử dụng phổ biến trong mô hình nào?\n"
            + "A. MVC\n"
            + "B. MVVM\n"
            + "C. MVP\n"
            + "D. MVU"
        });

        TITLE_MAP.put("Mô hình MVC trong Java", new String[]{
            "Trong mô hình MVC, 'M' đại diện cho thành phần nào?\n"
            + "A. Main\n"
            + "B. Method\n"
            + "C. Model\n"
            + "D. Module",
            "Chức năng chính của Model trong mô hình MVC là gì?\n"
            + "A. Xử lý giao diện người dùng\n"
            + "B. Xử lý dữ liệu và logic nghiệp vụ\n"
            + "C. Hiển thị dữ liệu\n"
            + "D. Điều hướng yêu cầu",
            "Trong MVC, thành phần nào chịu trách nhiệm tương tác với người dùng?\n"
            + "A. Model\n"
            + "B. View\n"
            + "C. Controller\n"
            + "D. Service",
            "Vai trò của Controller trong mô hình MVC là gì?\n"
            + "A. Lưu trữ dữ liệu\n"
            + "B. Hiển thị dữ liệu\n"
            + "C. Nhận và xử lý yêu cầu từ người dùng\n"
            + "D. Tạo cơ sở dữ liệu",
            "Mối quan hệ giữa View và Model trong MVC là gì?\n"
            + "A. View chủ động cập nhật Model\n"
            + "B. Model chủ động cập nhật View\n"
            + "C. View lấy dữ liệu từ Model để hiển thị\n"
            + "D. Model và View không liên quan nhau",
            "Trong ứng dụng web Java, thành phần nào thường đóng vai trò Controller?\n"
            + "A. JSP\n"
            + "B. Servlet\n"
            + "C. HTML\n"
            + "D. Database",
            "Trong ứng dụng MVC, dữ liệu được lưu trữ chủ yếu ở đâu?\n"
            + "A. View\n"
            + "B. Controller\n"
            + "C. Model\n"
            + "D. Servlet",
            "MVC giúp ứng dụng đạt được lợi ích nào sau đây?\n"
            + "A. Tăng tính phức tạp\n"
            + "B. Giảm hiệu suất\n"
            + "C. Tách biệt giao diện và xử lý logic\n"
            + "D. Khó bảo trì",
            "Trong Java Web MVC, JSP thường được sử dụng làm thành phần nào?\n"
            + "A. Model\n"
            + "B. Controller\n"
            + "C. View\n"
            + "D. Service",
            "Lợi ích của việc sử dụng mô hình MVC là gì?\n"
            + "A. Phát triển nhanh nhưng khó bảo trì\n"
            + "B. Dễ dàng bảo trì, nâng cấp và mở rộng\n"
            + "C. Tăng độ trễ hệ thống\n"
            + "D. Làm ứng dụng đơn giản hóa tối đa"
        });

        TITLE_MAP.put("Lập trình hướng đối tượng là gì?", new String[]{
            "Lập trình hướng đối tượng (OOP) tập trung vào điều gì?\n"
            + "A. Các thuật toán\n"
            + "B. Các đối tượng\n"
            + "C. Các thủ tục\n"
            + "D. Các biến toàn cục",
            "Đặc điểm nào sau đây KHÔNG phải là đặc trưng của lập trình hướng đối tượng?\n"
            + "A. Tính kế thừa\n"
            + "B. Tính đóng gói\n"
            + "C. Tính trừu tượng\n"
            + "D. Tính tuần tự",
            "Khái niệm 'đóng gói' trong OOP nghĩa là gì?\n"
            + "A. Gộp nhiều lớp thành một\n"
            + "B. Giấu thông tin và chỉ cho phép truy cập thông qua các phương thức công khai\n"
            + "C. Mở rộng thuộc tính của đối tượng\n"
            + "D. Thực hiện nhiều hành động cùng lúc",
            "Trong lập trình hướng đối tượng, 'kế thừa' cho phép:\n"
            + "A. Lớp con sao chép toàn bộ dữ liệu từ lớp cha\n"
            + "B. Lớp con sử dụng lại thuộc tính và phương thức của lớp cha\n"
            + "C. Hai lớp gộp thành một lớp mới\n"
            + "D. Thêm nhiều đối tượng trong một lớp",
            "Tính đa hình trong OOP có nghĩa là:\n"
            + "A. Một đối tượng có thể có nhiều hình thức thể hiện\n"
            + "B. Một lớp chỉ có một phương thức duy nhất\n"
            + "C. Các lớp không thể kế thừa nhau\n"
            + "D. Một biến có thể lưu nhiều kiểu dữ liệu",
            "Trong Java, từ khóa nào được dùng để tạo một lớp mới kế thừa từ lớp khác?\n"
            + "A. implements\n"
            + "B. extends\n"
            + "C. inherit\n"
            + "D. override",
            "Phát biểu nào đúng về tính trừu tượng trong lập trình hướng đối tượng?\n"
            + "A. Che giấu chi tiết và chỉ thể hiện những gì cần thiết\n"
            + "B. Gộp nhiều lớp thành một lớp lớn hơn\n"
            + "C. Cố định hành vi của tất cả đối tượng\n"
            + "D. Không cho phép kế thừa",
            "Lớp (class) trong Java là gì?\n"
            + "A. Một phương thức xử lý dữ liệu\n"
            + "B. Một kiểu dữ liệu cơ bản\n"
            + "C. Một khuôn mẫu để tạo ra đối tượng\n"
            + "D. Một hàm tính toán",
            "Đối tượng (object) trong OOP là gì?\n"
            + "A. Một biến chứa dữ liệu đơn giản\n"
            + "B. Một instance cụ thể của một lớp\n"
            + "C. Một chương trình độc lập\n"
            + "D. Một phương thức trừu tượng",
            "Mục tiêu chính của lập trình hướng đối tượng là gì?\n"
            + "A. Làm chương trình chạy nhanh hơn\n"
            + "B. Giảm bớt việc lập trình thủ công\n"
            + "C. Tăng khả năng tổ chức, mở rộng và bảo trì chương trình\n"
            + "D. Tăng độ phức tạp của chương trình"
        });

        TITLE_MAP.put("Lớp và đối tượng", new String[]{
            "Trong Java, 'class' được dùng để:\n"
            + "A. Khởi tạo một biến mới\n"
            + "B. Định nghĩa khuôn mẫu cho đối tượng\n"
            + "C. Tạo ra một hàm xử lý dữ liệu\n"
            + "D. Khai báo hằng số",
            "Một đối tượng (object) là:\n"
            + "A. Một hàm xử lý logic\n"
            + "B. Một instance cụ thể của một lớp\n"
            + "C. Một biến lưu trữ địa chỉ bộ nhớ\n"
            + "D. Một loại dữ liệu cơ bản",
            "Từ khóa nào được sử dụng để tạo đối tượng từ lớp trong Java?\n"
            + "A. class\n"
            + "B. new\n"
            + "C. object\n"
            + "D. instance",
            "Để truy cập thuộc tính hoặc phương thức của đối tượng, ta sử dụng:\n"
            + "A. Dấu chấm '.'\n"
            + "B. Dấu hai chấm '::'\n"
            + "C. Dấu mũi tên '->'\n"
            + "D. Dấu bằng '='",
            "Thuộc tính (attribute) trong một lớp là gì?\n"
            + "A. Một hàm thực thi hành động\n"
            + "B. Một biến đại diện cho đặc điểm của đối tượng\n"
            + "C. Một đối tượng mới\n"
            + "D. Một từ khóa đặc biệt",
            "Phương thức (method) trong lớp dùng để:\n"
            + "A. Định nghĩa dữ liệu\n"
            + "B. Xử lý hành vi của đối tượng\n"
            + "C. Khai báo hằng số\n"
            + "D. Lưu trữ tên lớp",
            "Tên lớp trong Java nên được đặt theo quy tắc nào?\n"
            + "A. Chữ thường toàn bộ\n"
            + "B. Chữ in hoa toàn bộ\n"
            + "C. Chữ cái đầu mỗi từ viết hoa (PascalCase)\n"
            + "D. Viết cách nhau bằng dấu gạch dưới",
            "Một lớp có thể chứa những thành phần nào?\n"
            + "A. Chỉ phương thức\n"
            + "B. Chỉ thuộc tính\n"
            + "C. Thuộc tính và phương thức\n"
            + "D. Không chứa gì cả",
            "Khi tạo nhiều đối tượng từ cùng một lớp, các đối tượng:\n"
            + "A. Chia sẻ chung toàn bộ dữ liệu\n"
            + "B. Có dữ liệu riêng biệt\n"
            + "C. Không thể cùng tồn tại\n"
            + "D. Gộp lại thành một đối tượng lớn hơn",
            "Constructor trong Java là gì?\n"
            + "A. Một phương thức đặc biệt dùng để khởi tạo đối tượng\n"
            + "B. Một hàm kiểm tra lỗi\n"
            + "C. Một biến lưu địa chỉ đối tượng\n"
            + "D. Một từ khóa dùng để xóa đối tượng"
        });

        TITLE_MAP.put("Constructor", new String[]{
            "Constructor là gì trong Java?\n"
            + "A. Một biến toàn cục\n"
            + "B. Một phương thức dùng để khởi tạo đối tượng\n"
            + "C. Một lớp con của lớp cha\n"
            + "D. Một loại dữ liệu đặc biệt",
            "Constructor có tên giống với:\n"
            + "A. Một biến bất kỳ\n"
            + "B. Một từ khóa đặc biệt\n"
            + "C. Tên của lớp\n"
            + "D. Tên của gói (package)",
            "Khi nào constructor được gọi?\n"
            + "A. Khi chương trình bắt đầu\n"
            + "B. Khi đối tượng được tạo bằng từ khóa 'new'\n"
            + "C. Khi chương trình kết thúc\n"
            + "D. Khi nạp lớp vào bộ nhớ",
            "Nếu không khai báo constructor, Java sẽ:\n"
            + "A. Báo lỗi\n"
            + "B. Tự động sinh ra một constructor mặc định\n"
            + "C. Tự động tạo một lớp mới\n"
            + "D. Không cho phép tạo đối tượng",
            "Constructor có thể có tham số hay không?\n"
            + "A. Không, luôn không có tham số\n"
            + "B. Có, tùy lập trình viên định nghĩa\n"
            + "C. Chỉ khi khai báo lớp kế thừa\n"
            + "D. Chỉ dùng cho lớp trừu tượng",
            "Constructor có giá trị trả về không?\n"
            + "A. Có, trả về kiểu int\n"
            + "B. Có, trả về kiểu void\n"
            + "C. Không có giá trị trả về\n"
            + "D. Có, trả về đối tượng",
            "Constructor overloading nghĩa là:\n"
            + "A. Ghi đè constructor trong lớp con\n"
            + "B. Tạo nhiều constructor cùng tên nhưng khác tham số\n"
            + "C. Tạo constructor giống nhau trong nhiều lớp\n"
            + "D. Thay đổi tên constructor",
            "Muốn gọi constructor khác trong cùng lớp, dùng từ khóa nào?\n"
            + "A. super()\n"
            + "B. this()\n"
            + "C. class()\n"
            + "D. object()",
            "Constructor mặc định là constructor:\n"
            + "A. Không có tham số\n"
            + "B. Có một tham số bắt buộc\n"
            + "C. Phải khai báo rõ ràng\n"
            + "D. Được đặt trong file config",
            "Từ khóa 'super()' trong constructor dùng để:\n"
            + "A. Gọi constructor của lớp cha\n"
            + "B. Gọi constructor của cùng lớp\n"
            + "C. Khởi tạo biến toàn cục\n"
            + "D. Thoát khỏi constructor"
        });

        TITLE_MAP.put("Phương thức (Method)", new String[]{
            "Phương thức (method) trong Java là gì?\n"
            + "A. Một biến lưu giá trị\n"
            + "B. Một lớp con của lớp cha\n"
            + "C. Một tập hợp các câu lệnh thực hiện một chức năng nhất định\n"
            + "D. Một kiểu dữ liệu đặc biệt",
            "Khai báo phương thức gồm những thành phần nào?\n"
            + "A. Kiểu dữ liệu, tên phương thức, tham số (nếu có), khối lệnh\n"
            + "B. Chỉ cần tên phương thức\n"
            + "C. Chỉ cần kiểu dữ liệu\n"
            + "D. Chỉ cần khối lệnh",
            "Từ khóa nào dùng để định nghĩa một phương thức trong Java?\n"
            + "A. class\n"
            + "B. void\n"
            + "C. method\n"
            + "D. function",
            "Khi nào một phương thức được thực thi?\n"
            + "A. Khi lớp được nạp\n"
            + "B. Khi đối tượng được tạo\n"
            + "C. Khi phương thức được gọi\n"
            + "D. Khi chương trình kết thúc",
            "Phương thức có thể trả về:\n"
            + "A. Không trả về giá trị nào\n"
            + "B. Một giá trị đơn\n"
            + "C. Nhiều giá trị bằng cách gói trong đối tượng hoặc mảng\n"
            + "D. Tất cả các đáp án trên",
            "Một phương thức không trả về giá trị có kiểu trả về là:\n"
            + "A. int\n"
            + "B. float\n"
            + "C. void\n"
            + "D. return",
            "Phương thức có thể có bao nhiêu tham số?\n"
            + "A. Tối đa 1 tham số\n"
            + "B. Không có giới hạn cụ thể\n"
            + "C. Tối đa 5 tham số\n"
            + "D. Tối đa 10 tham số",
            "Từ khóa 'return' trong phương thức dùng để:\n"
            + "A. Khai báo biến mới\n"
            + "B. Trả về giá trị và kết thúc phương thức\n"
            + "C. Gọi phương thức khác\n"
            + "D. Dừng chương trình",
            "Overloading phương thức là gì?\n"
            + "A. Ghi đè phương thức ở lớp con\n"
            + "B. Tạo nhiều phương thức cùng tên nhưng khác tham số\n"
            + "C. Thay đổi tên phương thức\n"
            + "D. Tạo phương thức giống nhau trong nhiều lớp",
            "Một phương thức có thể nằm trong:\n"
            + "A. Bên ngoài lớp\n"
            + "B. Bên trong lớp\n"
            + "C. Trong file riêng biệt\n"
            + "D. Trong file XML"
        });

        TITLE_MAP.put("Đóng gói (Encapsulation)", new String[]{
            "Đóng gói (encapsulation) trong lập trình hướng đối tượng là gì?\n"
            + "A. Giấu dữ liệu và chỉ cho phép truy cập thông qua các phương thức công khai\n"
            + "B. Sao chép dữ liệu giữa các lớp\n"
            + "C. Xóa dữ liệu sau mỗi lần sử dụng\n"
            + "D. Gửi dữ liệu từ lớp cha sang lớp con",
            "Lợi ích chính của đóng gói là gì?\n"
            + "A. Tăng hiệu suất chương trình\n"
            + "B. Bảo vệ dữ liệu, kiểm soát quyền truy cập\n"
            + "C. Giảm kích thước chương trình\n"
            + "D. Tăng số lượng lớp trong chương trình",
            "Để thực hiện đóng gói trong Java, bạn cần:\n"
            + "A. Khai báo các biến là public\n"
            + "B. Khai báo các biến là private và cung cấp phương thức getter/setter\n"
            + "C. Không cần phương thức getter/setter\n"
            + "D. Chỉ cần khai báo biến là protected",
            "Getter là gì trong Java?\n"
            + "A. Phương thức để cập nhật giá trị biến\n"
            + "B. Phương thức để xóa biến\n"
            + "C. Phương thức để lấy giá trị biến\n"
            + "D. Phương thức để tạo biến mới",
            "Setter là gì trong Java?\n"
            + "A. Phương thức để lấy giá trị biến\n"
            + "B. Phương thức để thiết lập giá trị biến\n"
            + "C. Phương thức để xóa biến\n"
            + "D. Phương thức để ghi đè biến",
            "Một biến được đóng gói thường có mức truy cập nào?\n"
            + "A. public\n"
            + "B. private\n"
            + "C. protected\n"
            + "D. default",
            "Tại sao nên sử dụng phương thức getter và setter thay vì truy cập trực tiếp biến?\n"
            + "A. Để dễ dàng chỉnh sửa logic truy cập dữ liệu sau này\n"
            + "B. Để chương trình chạy nhanh hơn\n"
            + "C. Để giảm kích thước lớp\n"
            + "D. Để tránh lỗi biên dịch",
            "Khi khai báo biến là private, lớp khác có thể truy cập trực tiếp biến đó không?\n"
            + "A. Có thể\n"
            + "B. Không thể\n"
            + "C. Chỉ khi dùng static\n"
            + "D. Chỉ khi dùng final",
            "Đóng gói giúp tăng tính gì cho chương trình?\n"
            + "A. Bảo mật và tính toàn vẹn dữ liệu\n"
            + "B. Tính kế thừa\n"
            + "C. Tính đa hình\n"
            + "D. Tính lặp lại mã nguồn",
            "Một lớp chỉ có phương thức getter mà không có setter có ý nghĩa gì?\n"
            + "A. Biến có thể thay đổi được\n"
            + "B. Biến chỉ đọc, không thể thay đổi giá trị từ bên ngoài\n"
            + "C. Biến không tồn tại\n"
            + "D. Biến sẽ tự động cập nhật theo thời gian"
        });

        TITLE_MAP.put("Kế thừa (Inheritance)", new String[]{
            "Kế thừa trong lập trình hướng đối tượng là gì?\n"
            + "A. Tạo ra đối tượng mới từ phương thức cũ\n"
            + "B. Lớp con kế thừa thuộc tính và phương thức từ lớp cha\n"
            + "C. Lưu trữ dữ liệu trong biến toàn cục\n"
            + "D. Tăng tốc độ xử lý dữ liệu",
            "Từ khóa nào trong Java được dùng để kế thừa lớp?\n"
            + "A. implements\n"
            + "B. inherit\n"
            + "C. extends\n"
            + "D. override",
            "Khi một lớp kế thừa lớp khác, nó có thể:\n"
            + "A. Thêm thuộc tính và phương thức mới\n"
            + "B. Không thể thay đổi gì\n"
            + "C. Chỉ sử dụng được phương thức public của lớp cha\n"
            + "D. Tạo lại toàn bộ phương thức từ lớp cha",
            "Phương thức nào cho phép lớp con thay đổi cách hoạt động của phương thức lớp cha?\n"
            + "A. Overloading\n"
            + "B. Overriding\n"
            + "C. Extending\n"
            + "D. Importing",
            "Một lớp trong Java chỉ được kế thừa bao nhiêu lớp cha trực tiếp?\n"
            + "A. Một lớp cha\n"
            + "B. Hai lớp cha\n"
            + "C. Ba lớp cha\n"
            + "D. Không giới hạn",
            "Khi lớp con kế thừa lớp cha, quyền truy cập vào biến private của lớp cha là:\n"
            + "A. Được phép truy cập trực tiếp\n"
            + "B. Không thể truy cập trực tiếp\n"
            + "C. Có thể truy cập nếu dùng từ khóa protected\n"
            + "D. Có thể truy cập nếu dùng static",
            "Từ khóa 'super' trong Java dùng để:\n"
            + "A. Tạo đối tượng mới\n"
            + "B. Gọi constructor hoặc phương thức của lớp cha\n"
            + "C. Xóa phương thức lớp cha\n"
            + "D. Thay đổi lớp cha",
            "Phương thức khởi tạo (constructor) của lớp cha có thể được gọi từ lớp con bằng:\n"
            + "A. this()\n"
            + "B. super()\n"
            + "C. extends()\n"
            + "D. inherit()",
            "Nếu lớp A kế thừa lớp B, và lớp B kế thừa lớp C, thì A có thể sử dụng:\n"
            + "A. Chỉ các thành phần của B\n"
            + "B. Các thành phần của B và C\n"
            + "C. Chỉ các thành phần của A\n"
            + "D. Không sử dụng thành phần nào",
            "Tính chất nào thể hiện khả năng lớp con sử dụng lại mã nguồn của lớp cha?\n"
            + "A. Đóng gói\n"
            + "B. Kế thừa\n"
            + "C. Đa hình\n"
            + "D. Trừu tượng"
        });

        TITLE_MAP.put("Đa hình (Polymorphism)", new String[]{
            "Đa hình trong lập trình hướng đối tượng là gì?\n"
            + "A. Một đối tượng có nhiều hình dạng\n"
            + "B. Một lớp chỉ có một dạng duy nhất\n"
            + "C. Nhiều lớp hợp nhất thành một lớp\n"
            + "D. Thay đổi tên lớp trong chương trình",
            "Có mấy loại đa hình chính trong Java?\n"
            + "A. 1\n"
            + "B. 2\n"
            + "C. 3\n"
            + "D. 4",
            "Đa hình tại thời điểm biên dịch (compile time) còn gọi là gì?\n"
            + "A. Static Polymorphism\n"
            + "B. Dynamic Polymorphism\n"
            + "C. Runtime Polymorphism\n"
            + "D. Abstract Polymorphism",
            "Đa hình tại thời điểm thực thi (runtime) còn gọi là gì?\n"
            + "A. Static Polymorphism\n"
            + "B. Dynamic Polymorphism\n"
            + "C. Early Binding\n"
            + "D. Compile Time Polymorphism",
            "Trong Java, cơ chế nào sau đây thể hiện đa hình tại thời điểm biên dịch?\n"
            + "A. Overriding\n"
            + "B. Overloading\n"
            + "C. Inheritance\n"
            + "D. Interface",
            "Trong Java, cơ chế nào sau đây thể hiện đa hình tại thời điểm thực thi?\n"
            + "A. Overloading\n"
            + "B. Overriding\n"
            + "C. Inheritance\n"
            + "D. Constructor",
            "Phương thức overloading nghĩa là:\n"
            + "A. Ghi đè phương thức lớp cha trong lớp con\n"
            + "B. Có nhiều phương thức cùng tên nhưng khác tham số trong cùng một lớp\n"
            + "C. Gọi phương thức từ lớp cha\n"
            + "D. Thay đổi tên phương thức",
            "Phương thức overriding nghĩa là:\n"
            + "A. Tạo mới phương thức trong lớp con khác hoàn toàn lớp cha\n"
            + "B. Ghi đè phương thức lớp cha với cùng tên và tham số trong lớp con\n"
            + "C. Thêm thuộc tính mới vào phương thức\n"
            + "D. Xóa phương thức lớp cha",
            "Để override một phương thức trong Java, lớp con phải:\n"
            + "A. Dùng từ khóa new\n"
            + "B. Viết lại phương thức với cùng tên, tham số, kiểu trả về\n"
            + "C. Thay đổi số lượng tham số\n"
            + "D. Đổi kiểu trả về",
            "Đa hình giúp cho chương trình:\n"
            + "A. Phức tạp hơn\n"
            + "B. Cố định hơn\n"
            + "C. Linh hoạt và dễ mở rộng\n"
            + "D. Khó bảo trì hơn"
        });

        TITLE_MAP.put("Interface và Abstract Class", new String[]{
            "Abstract class trong Java là gì?\n"
            + "A. Một lớp bình thường\n"
            + "B. Một lớp có thể chứa phương thức trừu tượng và phương thức thường\n"
            + "C. Một lớp không thể có phương thức nào\n"
            + "D. Một lớp chỉ chứa thuộc tính",
            "Interface trong Java là gì?\n"
            + "A. Một kiểu dữ liệu lưu trữ\n"
            + "B. Một lớp có thể chứa cả phương thức có thân và không có thân\n"
            + "C. Một tập hợp các phương thức trừu tượng (không có thân)\n"
            + "D. Một lớp chứa toàn bộ các biến",
            "Một lớp abstract có thể chứa:\n"
            + "A. Chỉ phương thức trừu tượng\n"
            + "B. Chỉ phương thức thông thường\n"
            + "C. Cả phương thức trừu tượng và phương thức thường\n"
            + "D. Chỉ biến",
            "Một interface trong Java có thể chứa thành phần nào?\n"
            + "A. Phương thức có thân\n"
            + "B. Các hằng số và phương thức trừu tượng\n"
            + "C. Các biến thông thường\n"
            + "D. Các constructor",
            "Từ khóa nào dùng để khai báo một abstract class trong Java?\n"
            + "A. interface\n"
            + "B. abstract\n"
            + "C. extends\n"
            + "D. implements",
            "Từ khóa nào dùng để khai báo một interface trong Java?\n"
            + "A. abstract\n"
            + "B. class\n"
            + "C. interface\n"
            + "D. implements",
            "Một lớp có thể kế thừa từ bao nhiêu abstract class?\n"
            + "A. Một\n"
            + "B. Nhiều\n"
            + "C. Không giới hạn\n"
            + "D. Không thể kế thừa",
            "Một lớp có thể implement bao nhiêu interface?\n"
            + "A. Một\n"
            + "B. Hai\n"
            + "C. Nhiều\n"
            + "D. Không thể implement interface",
            "Phương thức trong interface mặc định có tính chất gì?\n"
            + "A. public và abstract\n"
            + "B. private và static\n"
            + "C. protected và final\n"
            + "D. default và abstract",
            "Sự khác nhau chính giữa abstract class và interface là gì?\n"
            + "A. Abstract class chỉ chứa hằng số, interface thì không\n"
            + "B. Interface không thể chứa phương thức mặc định (default method)\n"
            + "C. Abstract class có thể chứa cả phương thức có thân, interface thì chủ yếu chứa phương thức trừu tượng\n"
            + "D. Interface hỗ trợ kế thừa từ nhiều lớp, abstract class thì không"
        });

        TITLE_MAP.put("Xử lý ngoại lệ (Exception Handling)", new String[]{
            "Ngoại lệ (Exception) trong Java là gì?\n"
            + "A. Một lỗi xảy ra khi biên dịch\n"
            + "B. Một lỗi xảy ra khi chạy chương trình\n"
            + "C. Một lỗi phần cứng\n"
            + "D. Một loại cảnh báo của IDE",
            "Từ khóa nào được sử dụng để xử lý ngoại lệ trong Java?\n"
            + "A. throw và catch\n"
            + "B. try và catch\n"
            + "C. throws và return\n"
            + "D. try và throw",
            "Khối finally trong Java dùng để làm gì?\n"
            + "A. Bắt ngoại lệ\n"
            + "B. Thực hiện các lệnh sau khi try-catch, bất kể có ngoại lệ hay không\n"
            + "C. Gây ra ngoại lệ\n"
            + "D. Kết thúc chương trình",
            "Từ khóa nào dùng để ném ra một ngoại lệ?\n"
            + "A. catch\n"
            + "B. throws\n"
            + "C. throw\n"
            + "D. try",
            "Từ khóa nào được dùng để khai báo rằng phương thức có thể ném ngoại lệ?\n"
            + "A. throw\n"
            + "B. throws\n"
            + "C. catch\n"
            + "D. finally",
            "Ngoại lệ nào xảy ra khi chia một số cho 0 trong Java?\n"
            + "A. NullPointerException\n"
            + "B. ArithmeticException\n"
            + "C. NumberFormatException\n"
            + "D. ArrayIndexOutOfBoundsException",
            "Lệnh nào bắt buộc phải đi kèm với try khi xử lý ngoại lệ?\n"
            + "A. catch hoặc finally\n"
            + "B. catch\n"
            + "C. throw\n"
            + "D. throws",
            "Checked Exception là gì?\n"
            + "A. Ngoại lệ không bắt buộc phải xử lý\n"
            + "B. Ngoại lệ cần được xử lý tại thời điểm biên dịch\n"
            + "C. Ngoại lệ xảy ra trong quá trình runtime\n"
            + "D. Một loại lỗi logic trong chương trình",
            "Unchecked Exception là gì?\n"
            + "A. Ngoại lệ cần được xử lý trong mã nguồn\n"
            + "B. Ngoại lệ xảy ra tại runtime và không bắt buộc phải xử lý\n"
            + "C. Ngoại lệ xảy ra tại thời điểm biên dịch\n"
            + "D. Một loại lỗi file hệ thống",
            "Câu lệnh nào dùng để bắt nhiều ngoại lệ trong cùng một khối try?\n"
            + "A. Một khối catch\n"
            + "B. Nhiều khối catch nối tiếp\n"
            + "C. Một khối finally\n"
            + "D. Một khối throws"
        });

        TITLE_MAP.put("Đọc và ghi file trong Java", new String[]{
            "Lớp nào trong Java dùng để đọc dữ liệu từ file dạng text?\n"
            + "A. FileOutputStream\n"
            + "B. FileReader\n"
            + "C. FileWriter\n"
            + "D. Scanner",
            "Lớp nào dùng để ghi dữ liệu dạng text vào file?\n"
            + "A. FileReader\n"
            + "B. FileInputStream\n"
            + "C. FileWriter\n"
            + "D. BufferedReader",
            "Để đọc file theo từng dòng, lớp nào thường được dùng kết hợp với FileReader?\n"
            + "A. FileWriter\n"
            + "B. BufferedReader\n"
            + "C. PrintWriter\n"
            + "D. Scanner",
            "Để ghi file hiệu quả (ghi nhiều dòng), nên kết hợp FileWriter với lớp nào?\n"
            + "A. BufferedWriter\n"
            + "B. BufferedReader\n"
            + "C. Scanner\n"
            + "D. FileInputStream",
            "Phương thức nào của lớp FileReader dùng để đọc một ký tự?\n"
            + "A. readChar()\n"
            + "B. read()\n"
            + "C. readLine()\n"
            + "D. next()",
            "Lớp Scanner có thể được dùng để đọc file không?\n"
            + "A. Không, chỉ dùng để đọc từ bàn phím\n"
            + "B. Có, bằng cách truyền đối tượng File vào Scanner\n"
            + "C. Không, Scanner chỉ dành cho chuỗi\n"
            + "D. Chỉ dùng cho kết nối mạng",
            "Khi làm việc với file nhị phân (binary), nên sử dụng lớp nào để đọc file?\n"
            + "A. FileReader\n"
            + "B. FileInputStream\n"
            + "C. FileWriter\n"
            + "D. BufferedReader",
            "Lớp nào hỗ trợ ghi dữ liệu dạng nhị phân vào file?\n"
            + "A. FileOutputStream\n"
            + "B. FileWriter\n"
            + "C. FileReader\n"
            + "D. BufferedReader",
            "Điều gì nên làm sau khi đọc hoặc ghi file?\n"
            + "A. Đóng file bằng phương thức close()\n"
            + "B. Xóa file\n"
            + "C. Mở lại file\n"
            + "D. Không cần làm gì",
            "Khi đọc hoặc ghi file, ta nên đặt mã lệnh trong khối nào để tránh lỗi?\n"
            + "A. try-catch\n"
            + "B. if-else\n"
            + "C. switch-case\n"
            + "D. for-while"
        });

        TITLE_MAP.put("Giới thiệu Collection Framework", new String[]{
            "Collection Framework trong Java dùng để làm gì?\n"
            + "A. Quản lý kết nối mạng\n"
            + "B. Lưu trữ và xử lý tập hợp các đối tượng\n"
            + "C. Giao tiếp với cơ sở dữ liệu\n"
            + "D. Thiết kế giao diện người dùng",
            "Giao diện (interface) gốc của Collection Framework là gì?\n"
            + "A. List\n"
            + "B. Set\n"
            + "C. Collection\n"
            + "D. Map",
            "Giao diện nào cho phép các phần tử trùng lặp trong Collection Framework?\n"
            + "A. Set\n"
            + "B. Map\n"
            + "C. List\n"
            + "D. Queue",
            "Giao diện nào không cho phép phần tử trùng lặp?\n"
            + "A. List\n"
            + "B. Set\n"
            + "C. Queue\n"
            + "D. Collection",
            "Lớp nào sau đây triển khai giao diện List?\n"
            + "A. HashSet\n"
            + "B. HashMap\n"
            + "C. ArrayList\n"
            + "D. TreeSet",
            "Lớp nào sau đây triển khai giao diện Set?\n"
            + "A. LinkedList\n"
            + "B. ArrayList\n"
            + "C. HashSet\n"
            + "D. PriorityQueue",
            "Để lưu trữ dữ liệu dưới dạng cặp key-value, ta dùng interface nào?\n"
            + "A. List\n"
            + "B. Set\n"
            + "C. Map\n"
            + "D. Collection",
            "Lớp nào sau đây là một triển khai phổ biến của Map?\n"
            + "A. HashMap\n"
            + "B. HashSet\n"
            + "C. ArrayList\n"
            + "D. TreeSet",
            "Iterator trong Collection Framework dùng để làm gì?\n"
            + "A. Thêm phần tử\n"
            + "B. Xóa phần tử\n"
            + "C. Duyệt qua các phần tử\n"
            + "D. Sắp xếp các phần tử",
            "Phương thức nào trong Iterator được dùng để kiểm tra còn phần tử tiếp theo không?\n"
            + "A. next()\n"
            + "B. hasNext()\n"
            + "C. remove()\n"
            + "D. peek()"
        });

        TITLE_MAP.put("ArrayList", new String[]{
            "ArrayList thuộc gói nào trong Java?\n"
            + "A. java.io\n"
            + "B. java.util\n"
            + "C. java.lang\n"
            + "D. java.net",
            "ArrayList có thể lưu trữ loại dữ liệu nào?\n"
            + "A. Chỉ số nguyên\n"
            + "B. Chỉ số thực\n"
            + "C. Bất kỳ đối tượng nào\n"
            + "D. Chỉ kiểu String",
            "ArrayList có kích thước cố định hay thay đổi?\n"
            + "A. Cố định\n"
            + "B. Thay đổi được\n"
            + "C. Không lưu trữ phần tử\n"
            + "D. Phải xác định kích thước khi khai báo",
            "Phương thức nào dùng để thêm phần tử vào ArrayList?\n"
            + "A. put()\n"
            + "B. add()\n"
            + "C. insert()\n"
            + "D. append()",
            "Phương thức nào dùng để lấy phần tử tại vị trí chỉ định trong ArrayList?\n"
            + "A. get()\n"
            + "B. set()\n"
            + "C. fetch()\n"
            + "D. retrieve()",
            "Phương thức nào dùng để cập nhật phần tử trong ArrayList?\n"
            + "A. update()\n"
            + "B. change()\n"
            + "C. set()\n"
            + "D. modify()",
            "Phương thức nào trả về số lượng phần tử hiện tại trong ArrayList?\n"
            + "A. length()\n"
            + "B. size()\n"
            + "C. count()\n"
            + "D. total()",
            "Để xóa một phần tử trong ArrayList theo chỉ số, ta dùng phương thức nào?\n"
            + "A. delete()\n"
            + "B. remove()\n"
            + "C. clear()\n"
            + "D. erase()",
            "ArrayList có cho phép lưu các phần tử trùng lặp không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Tùy cấu hình\n"
            + "D. Chỉ với kiểu String",
            "Phương thức nào xóa toàn bộ phần tử trong ArrayList?\n"
            + "A. removeAll()\n"
            + "B. clear()\n"
            + "C. deleteAll()\n"
            + "D. reset()"
        });

        TITLE_MAP.put("LinkedList", new String[]{
            "LinkedList thuộc gói nào trong Java?\n"
            + "A. java.io\n"
            + "B. java.util\n"
            + "C. java.lang\n"
            + "D. java.net",
            "LinkedList lưu trữ các phần tử như thế nào?\n"
            + "A. Mảng liên tiếp\n"
            + "B. Danh sách các nút liên kết\n"
            + "C. Cây nhị phân\n"
            + "D. Bảng băm",
            "LinkedList có thể lưu trữ loại dữ liệu nào?\n"
            + "A. Chỉ kiểu String\n"
            + "B. Chỉ kiểu Integer\n"
            + "C. Bất kỳ đối tượng nào\n"
            + "D. Chỉ kiểu Double",
            "Phương thức nào dùng để thêm phần tử vào cuối LinkedList?\n"
            + "A. addLast()\n"
            + "B. append()\n"
            + "C. push()\n"
            + "D. insertEnd()",
            "Phương thức nào dùng để thêm phần tử vào đầu LinkedList?\n"
            + "A. addStart()\n"
            + "B. push()\n"
            + "C. addFirst()\n"
            + "D. insertFront()",
            "Phương thức nào dùng để lấy phần tử đầu tiên trong LinkedList mà không xóa nó?\n"
            + "A. getFirst()\n"
            + "B. peekFirst()\n"
            + "C. first()\n"
            + "D. retrieveFirst()",
            "Để xóa phần tử đầu tiên trong LinkedList, ta dùng phương thức nào?\n"
            + "A. removeFirst()\n"
            + "B. deleteFirst()\n"
            + "C. popFirst()\n"
            + "D. eraseFirst()",
            "LinkedList có hỗ trợ truy cập ngẫu nhiên hiệu quả không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Tùy vào số lượng phần tử\n"
            + "D. Chỉ với dữ liệu nhỏ",
            "LinkedList cho phép lưu trữ các phần tử trùng lặp không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Tùy cấu hình\n"
            + "D. Chỉ với kiểu số",
            "Ưu điểm chính của LinkedList so với ArrayList là gì?\n"
            + "A. Truy cập nhanh hơn\n"
            + "B. Thêm và xóa phần tử nhanh hơn\n"
            + "C. Tiết kiệm bộ nhớ\n"
            + "D. Dễ duyệt hơn"
        });

        TITLE_MAP.put("HashMap", new String[]{
            "HashMap thuộc gói nào trong Java?\n"
            + "A. java.io\n"
            + "B. java.lang\n"
            + "C. java.util\n"
            + "D. java.net",
            "HashMap lưu trữ dữ liệu theo dạng nào?\n"
            + "A. Danh sách liên kết\n"
            + "B. Cặp key-value\n"
            + "C. Mảng tuyến tính\n"
            + "D. Cây nhị phân",
            "Key trong HashMap có được phép trùng lặp không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Tùy theo kiểu dữ liệu\n"
            + "D. Chỉ trùng nếu là kiểu Integer",
            "Value trong HashMap có được phép trùng lặp không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Tùy theo cài đặt\n"
            + "D. Chỉ với kiểu String",
            "Phương thức nào được dùng để thêm cặp key-value vào HashMap?\n"
            + "A. add()\n"
            + "B. put()\n"
            + "C. insert()\n"
            + "D. append()",
            "Phương thức nào dùng để lấy value dựa trên key trong HashMap?\n"
            + "A. get()\n"
            + "B. find()\n"
            + "C. retrieve()\n"
            + "D. search()",
            "Nếu thêm một key đã tồn tại vào HashMap, chuyện gì sẽ xảy ra?\n"
            + "A. Tạo thêm key mới\n"
            + "B. Ném ngoại lệ\n"
            + "C. Ghi đè giá trị cũ\n"
            + "D. Không thay đổi gì",
            "Phương thức nào để xóa một phần tử khỏi HashMap?\n"
            + "A. delete()\n"
            + "B. remove()\n"
            + "C. erase()\n"
            + "D. clearItem()",
            "Phương thức nào xóa toàn bộ các cặp key-value trong HashMap?\n"
            + "A. removeAll()\n"
            + "B. deleteAll()\n"
            + "C. clear()\n"
            + "D. eraseAll()",
            "HashMap có đảm bảo thứ tự lưu trữ các phần tử không?\n"
            + "A. Có\n"
            + "B. Không\n"
            + "C. Chỉ khi dùng LinkedHashMap\n"
            + "D. Chỉ với kiểu dữ liệu nguyên thủy"
        });

        TITLE_MAP.put("Giới thiệu JavaFX", new String[]{
            "JavaFX là gì?\n"
            + "A. Thư viện lập trình web\n"
            + "B. Thư viện lập trình đồ họa giao diện người dùng\n"
            + "C. Công cụ quản lý cơ sở dữ liệu\n"
            + "D. Bộ công cụ lập trình mạng",
            "JavaFX thay thế cho công nghệ nào trước đây của Java?\n"
            + "A. AWT\n"
            + "B. Swing\n"
            + "C. Applet\n"
            + "D. Servlet",
            "Ngôn ngữ đánh dấu nào được JavaFX hỗ trợ để mô tả giao diện?\n"
            + "A. XML\n"
            + "B. FXML\n"
            + "C. HTML\n"
            + "D. YAML",
            "Thành phần cơ bản nhất trong JavaFX là gì?\n"
            + "A. Stage\n"
            + "B. Scene\n"
            + "C. Node\n"
            + "D. Layout",
            "Để bắt đầu một ứng dụng JavaFX, lớp cần kế thừa lớp nào?\n"
            + "A. Application\n"
            + "B. JFrame\n"
            + "C. FXApp\n"
            + "D. JavaFXBase",
            "Phương thức nào bắt buộc phải override khi tạo lớp JavaFX Application?\n"
            + "A. run()\n"
            + "B. start()\n"
            + "C. main()\n"
            + "D. initialize()",
            "Đối tượng Stage trong JavaFX đại diện cho điều gì?\n"
            + "A. Một cửa sổ giao diện\n"
            + "B. Một thành phần điều khiển\n"
            + "C. Một nút nhấn\n"
            + "D. Một sự kiện",
            "Scene trong JavaFX dùng để làm gì?\n"
            + "A. Lưu trữ dữ liệu\n"
            + "B. Chứa các thành phần giao diện\n"
            + "C. Xử lý logic chương trình\n"
            + "D. Quản lý kết nối mạng",
            "Thành phần nào sau đây là loại Node hợp lệ trong JavaFX?\n"
            + "A. Button\n"
            + "B. Socket\n"
            + "C. Statement\n"
            + "D. Thread",
            "Để khởi chạy ứng dụng JavaFX, cần gọi phương thức nào trong hàm main?\n"
            + "A. start()\n"
            + "B. run()\n"
            + "C. launch()\n"
            + "D. init()"
        });

        TITLE_MAP.put("Cấu trúc ứng dụng JavaFX", new String[]{
            "Trong JavaFX, lớp chính của ứng dụng phải kế thừa lớp nào?\n"
            + "A. Application\n"
            + "B. JFrame\n"
            + "C. MainClass\n"
            + "D. FXApp",
            "Phương thức nào được gọi khi ứng dụng JavaFX bắt đầu chạy?\n"
            + "A. main()\n"
            + "B. init()\n"
            + "C. start()\n"
            + "D. launch()",
            "Phương thức nào được sử dụng để thiết lập giao diện người dùng trong JavaFX?\n"
            + "A. start(Stage primaryStage)\n"
            + "B. run(Stage primaryStage)\n"
            + "C. launch(Stage primaryStage)\n"
            + "D. init(Stage primaryStage)",
            "Để khởi chạy một ứng dụng JavaFX, phương thức nào cần được gọi trong hàm main?\n"
            + "A. run(args)\n"
            + "B. init(args)\n"
            + "C. launch(args)\n"
            + "D. start(args)",
            "Đối tượng nào trong JavaFX đại diện cho cửa sổ chính của ứng dụng?\n"
            + "A. Scene\n"
            + "B. Stage\n"
            + "C. Node\n"
            + "D. Group",
            "Để đặt các thành phần giao diện vào cửa sổ, bạn cần tạo đối tượng nào?\n"
            + "A. Scene\n"
            + "B. Layout\n"
            + "C. Controller\n"
            + "D. Pane",
            "Thành phần Scene chứa tập hợp các đối tượng nào?\n"
            + "A. Stage\n"
            + "B. Layout\n"
            + "C. Node\n"
            + "D. Application",
            "Phương thức setScene(Scene scene) được gọi trên đối tượng nào?\n"
            + "A. Application\n"
            + "B. Node\n"
            + "C. Stage\n"
            + "D. Layout",
            "Để hiển thị cửa sổ trong JavaFX, cần gọi phương thức nào?\n"
            + "A. show()\n"
            + "B. visible()\n"
            + "C. open()\n"
            + "D. render()",
            "Trình tự thực thi của một ứng dụng JavaFX gồm các bước nào?\n"
            + "A. main() → start() → launch()\n"
            + "B. main() → launch() → start()\n"
            + "C. start() → main() → launch()\n"
            + "D. launch() → start() → main()"
        });

        TITLE_MAP.put("Giới thiệu Spring Boot", new String[]{
            "Spring Boot là một phần mở rộng của framework nào?\n"
            + "A. Hibernate\n"
            + "B. Spring Framework\n"
            + "C. Struts\n"
            + "D. JSF",
            "Mục tiêu chính của Spring Boot là gì?\n"
            + "A. Quản lý cơ sở dữ liệu\n"
            + "B. Đơn giản hóa việc cấu hình và triển khai ứng dụng Spring\n"
            + "C. Tối ưu hóa giao diện người dùng\n"
            + "D. Bảo mật mạng nội bộ",
            "Tập tin cấu hình chính của Spring Boot thường có phần mở rộng nào?\n"
            + "A. .xml\n"
            + "B. .yml hoặc .properties\n"
            + "C. .json\n"
            + "D. .conf",
            "Spring Boot Starter là gì?\n"
            + "A. Công cụ biên dịch mã nguồn\n"
            + "B. Tập hợp các thư viện và cấu hình cần thiết\n"
            + "C. Công cụ tạo giao diện người dùng\n"
            + "D. Phần mềm quản lý cơ sở dữ liệu",
            "Ứng dụng Spring Boot có thể chạy độc lập mà không cần gì?\n"
            + "A. Maven\n"
            + "B. Gradle\n"
            + "C. Máy chủ ứng dụng bên ngoài (external server)\n"
            + "D. Bộ nhớ RAM",
            "Phương pháp nào Spring Boot sử dụng để cấu hình tự động?\n"
            + "A. Manual Configuration\n"
            + "B. Auto Configuration\n"
            + "C. User Configuration\n"
            + "D. Custom Configuration",
            "Annotation nào dùng để định nghĩa lớp ứng dụng Spring Boot?\n"
            + "A. @EnableBoot\n"
            + "B. @SpringBootApplication\n"
            + "C. @ConfigurationBoot\n"
            + "D. @BootApplication",
            "Lệnh nào dùng để khởi tạo một project Spring Boot mới nhanh chóng?\n"
            + "A. spring boot new\n"
            + "B. start.spring.io\n"
            + "C. boot.create\n"
            + "D. spring init",
            "Khi sử dụng Spring Boot, bạn có thể nhúng máy chủ nào?\n"
            + "A. Tomcat\n"
            + "B. Apache\n"
            + "C. IIS\n"
            + "D. Nginx",
            "Spring Boot giúp giảm thiểu cấu hình nào sau đây?\n"
            + "A. Cấu hình XML phức tạp\n"
            + "B. Cấu hình HTML\n"
            + "C. Cấu hình CSS\n"
            + "D. Cấu hình JavaScript"
        });

        TITLE_MAP.put("Tạo REST API với Spring Boot", new String[]{
            "REST API là gì trong ngữ cảnh của Spring Boot?\n"
            + "A. Giao diện đồ họa\n"
            + "B. Một giao thức gửi email\n"
            + "C. Giao diện lập trình ứng dụng dựa trên HTTP\n"
            + "D. Một loại cơ sở dữ liệu",
            "Annotation nào dùng để tạo REST Controller trong Spring Boot?\n"
            + "A. @Controller\n"
            + "B. @RestController\n"
            + "C. @Service\n"
            + "D. @Repository",
            "Phương thức HTTP nào dùng để lấy dữ liệu từ server?\n"
            + "A. POST\n"
            + "B. PUT\n"
            + "C. GET\n"
            + "D. DELETE",
            "Annotation nào dùng để ánh xạ yêu cầu HTTP GET đến một phương thức trong Spring Boot?\n"
            + "A. @GetData\n"
            + "B. @RequestMapping\n"
            + "C. @GetMapping\n"
            + "D. @FetchMapping",
            "Để nhận dữ liệu từ client (body request) vào một object, bạn dùng annotation nào?\n"
            + "A. @ResponseBody\n"
            + "B. @RequestBody\n"
            + "C. @RequestParam\n"
            + "D. @PathVariable",
            "Để ánh xạ biến từ đường dẫn URL vào phương thức controller, dùng annotation nào?\n"
            + "A. @RequestParam\n"
            + "B. @PathVariable\n"
            + "C. @RequestMapping\n"
            + "D. @ResponseBody",
            "Phương thức HTTP nào thường được dùng để tạo mới tài nguyên?\n"
            + "A. PUT\n"
            + "B. GET\n"
            + "C. POST\n"
            + "D. DELETE",
            "Để cập nhật một đối tượng có sẵn, phương thức HTTP nào thường được sử dụng?\n"
            + "A. GET\n"
            + "B. DELETE\n"
            + "C. POST\n"
            + "D. PUT",
            "Để xóa tài nguyên, phương thức HTTP nào được dùng?\n"
            + "A. DELETE\n"
            + "B. GET\n"
            + "C. POST\n"
            + "D. PATCH",
            "Khi trả về dữ liệu từ REST API, Spring Boot mặc định định dạng dữ liệu trả về là gì?\n"
            + "A. XML\n"
            + "B. CSV\n"
            + "C. JSON\n"
            + "D. HTML"
        });

        TITLE_MAP.put("Kết nối cơ sở dữ liệu MySQL với Spring Boot", new String[]{
            "Cấu hình cơ sở dữ liệu trong Spring Boot chủ yếu nằm trong file nào?\n"
            + "A. pom.xml\n"
            + "B. application.properties\n"
            + "C. build.gradle\n"
            + "D. settings.gradle",
            "Để kết nối MySQL, cần thêm dependency nào trong pom.xml?\n"
            + "A. spring-boot-starter-data-mongodb\n"
            + "B. spring-boot-starter-web\n"
            + "C. mysql-connector-java\n"
            + "D. spring-boot-starter-security",
            "Thuộc tính nào dùng để khai báo URL kết nối cơ sở dữ liệu trong application.properties?\n"
            + "A. spring.datasource.username\n"
            + "B. spring.datasource.password\n"
            + "C. spring.datasource.url\n"
            + "D. spring.jpa.hibernate.ddl-auto",
            "Để Hibernate tự động tạo bảng trong cơ sở dữ liệu, dùng thuộc tính nào?\n"
            + "A. spring.datasource.driver-class-name\n"
            + "B. spring.jpa.hibernate.ddl-auto\n"
            + "C. spring.jpa.show-sql\n"
            + "D. spring.jpa.properties.hibernate.format_sql",
            "Giá trị nào của 'spring.jpa.hibernate.ddl-auto' sẽ tự động tạo bảng mới mỗi lần chạy?\n"
            + "A. validate\n"
            + "B. update\n"
            + "C. create\n"
            + "D. none",
            "Annotation nào dùng để đánh dấu một lớp là Entity (bảng dữ liệu)?\n"
            + "A. @Entity\n"
            + "B. @Table\n"
            + "C. @Repository\n"
            + "D. @Component",
            "Thuộc tính nào dùng để bật log câu lệnh SQL trong Spring Boot?\n"
            + "A. spring.datasource.logging\n"
            + "B. spring.jpa.show-sql\n"
            + "C. spring.jpa.logging\n"
            + "D. spring.datasource.show-sql",
            "Annotation nào dùng để chỉ định primary key trong Entity class?\n"
            + "A. @Column\n"
            + "B. @Id\n"
            + "C. @PrimaryKey\n"
            + "D. @GeneratedValue",
            "Để tự động sinh giá trị ID trong database, dùng thêm annotation nào?\n"
            + "A. @AutoId\n"
            + "B. @GeneratedValue\n"
            + "C. @AutoIncrement\n"
            + "D. @SequenceGenerator",
            "Giao diện nào trong Spring Data JPA hỗ trợ thao tác CRUD tự động?\n"
            + "A. JpaRepository\n"
            + "B. CrudService\n"
            + "C. DataRepository\n"
            + "D. HibernateManager"
        });

        TITLE_MAP.put("Giới thiệu về Microservices", new String[]{
            "Microservices là gì?\n"
            + "A. Kiến trúc đơn khối (Monolithic)\n"
            + "B. Tập hợp nhiều dịch vụ nhỏ, độc lập\n"
            + "C. Một framework của Java\n"
            + "D. Một loại cơ sở dữ liệu",
            "Điểm đặc trưng của Microservices là gì?\n"
            + "A. Tất cả tính năng nằm chung một ứng dụng\n"
            + "B. Các dịch vụ phụ thuộc chặt chẽ vào nhau\n"
            + "C. Các dịch vụ phát triển và triển khai độc lập\n"
            + "D. Tất cả dịch vụ chia sẻ cùng một cơ sở dữ liệu",
            "Ưu điểm chính của Microservices là gì?\n"
            + "A. Khó mở rộng\n"
            + "B. Khả năng triển khai linh hoạt và mở rộng dễ dàng\n"
            + "C. Khó bảo trì\n"
            + "D. Tăng độ phức tạp hệ thống",
            "Microservices thường giao tiếp với nhau qua giao thức nào?\n"
            + "A. HTTP/REST\n"
            + "B. SMTP\n"
            + "C. FTP\n"
            + "D. SSH",
            "Trong kiến trúc Microservices, mỗi dịch vụ nên có gì riêng?\n"
            + "A. Một cơ sở dữ liệu riêng\n"
            + "B. Một server riêng\n"
            + "C. Một hệ điều hành riêng\n"
            + "D. Một máy ảo riêng",
            "Một thách thức phổ biến khi sử dụng Microservices là gì?\n"
            + "A. Giao tiếp giữa các dịch vụ phức tạp\n"
            + "B. Tăng hiệu suất xử lý\n"
            + "C. Giảm chi phí hạ tầng\n"
            + "D. Giảm yêu cầu bảo mật",
            "Mẫu thiết kế nào thường dùng để phát hiện dịch vụ trong Microservices?\n"
            + "A. Singleton Pattern\n"
            + "B. Service Discovery Pattern\n"
            + "C. Observer Pattern\n"
            + "D. Factory Pattern",
            "Công nghệ nào thường dùng để quản lý dịch vụ Microservices?\n"
            + "A. Docker\n"
            + "B. FTP\n"
            + "C. SMTP\n"
            + "D. JSON",
            "Trong Microservices, API Gateway có vai trò gì?\n"
            + "A. Lưu trữ dữ liệu\n"
            + "B. Cung cấp điểm truy cập duy nhất cho client\n"
            + "C. Cài đặt hệ điều hành\n"
            + "D. Mã hóa cơ sở dữ liệu",
            "Công cụ nào hỗ trợ triển khai Microservices trên nền tảng container?\n"
            + "A. Kubernetes\n"
            + "B. Photoshop\n"
            + "C. Notepad++\n"
            + "D. WordPress"
        });

        TITLE_MAP.put("Xây dựng Microservice với Spring Boot", new String[]{
            "Để xây dựng Microservice với Spring Boot, bạn nên bắt đầu bằng việc gì?\n"
            + "A. Tạo một project Spring Boot\n"
            + "B. Cài đặt game\n"
            + "C. Mua server vật lý\n"
            + "D. Viết tài liệu API trước khi lập trình",
            "Spring Boot Starter nào thường được dùng để xây dựng REST API cho Microservice?\n"
            + "A. spring-boot-starter-web\n"
            + "B. spring-boot-starter-data-jpa\n"
            + "C. spring-boot-starter-test\n"
            + "D. spring-boot-starter-security",
            "Annotation nào trong Spring Boot dùng để đánh dấu lớp xử lý yêu cầu HTTP?\n"
            + "A. @Service\n"
            + "B. @Repository\n"
            + "C. @RestController\n"
            + "D. @Entity",
            "Để định nghĩa đường dẫn API trong Spring Boot, bạn sử dụng annotation nào?\n"
            + "A. @PostMapping\n"
            + "B. @RequestMapping\n"
            + "C. @Autowired\n"
            + "D. @Component",
            "Trong Microservice, để kết nối với cơ sở dữ liệu, bạn thường dùng thư viện nào trong Spring Boot?\n"
            + "A. Spring Data JPA\n"
            + "B. Spring Security\n"
            + "C. Spring MVC\n"
            + "D. Spring AOP",
            "Khi xây dựng Microservice với Spring Boot, mỗi service nên có gì?\n"
            + "A. Một project riêng biệt\n"
            + "B. Cùng chia sẻ mã nguồn\n"
            + "C. Cùng một cơ sở dữ liệu\n"
            + "D. Không cần giao tiếp qua API",
            "Để giao tiếp giữa các Microservices, bạn có thể dùng gì?\n"
            + "A. RESTful API\n"
            + "B. Direct SQL Query\n"
            + "C. HTML Template\n"
            + "D. CSS Styling",
            "Thư viện nào hỗ trợ gọi API giữa các Microservices trong Spring Boot dễ dàng?\n"
            + "A. Feign Client\n"
            + "B. JDBC\n"
            + "C. JPA\n"
            + "D. JSP",
            "Khi phát triển Microservices, điều gì cần đặc biệt chú ý?\n"
            + "A. Giao tiếp giữa các service\n"
            + "B. Thiết kế giao diện đẹp\n"
            + "C. Tối ưu CSS\n"
            + "D. Cài đặt nhiều plugin",
            "Công cụ nào hỗ trợ triển khai và quản lý nhiều Microservices hiệu quả?\n"
            + "A. Kubernetes\n"
            + "B. Excel\n"
            + "C. PowerPoint\n"
            + "D. WordPad"
        });

        TITLE_MAP.put("Bảo mật với Spring Security", new String[]{
            "Spring Security là gì?\n"
            + "A. Một framework để bảo mật ứng dụng Java\n"
            + "B. Một công cụ tối ưu tốc độ\n"
            + "C. Một phần mềm thiết kế giao diện\n"
            + "D. Một trình biên dịch Java",
            "Spring Security chủ yếu giúp bảo vệ điều gì?\n"
            + "A. Truy cập tài nguyên\n"
            + "B. Tốc độ thực thi\n"
            + "C. Bố cục giao diện\n"
            + "D. Quản lý bộ nhớ",
            "Annotation nào dùng để chỉ định phương thức yêu cầu phải đăng nhập mới được truy cập?\n"
            + "A. @Secured\n"
            + "B. @RequestMapping\n"
            + "C. @Autowired\n"
            + "D. @Entity",
            "Cơ chế xác thực (authentication) trong Spring Security là gì?\n"
            + "A. Xác nhận người dùng là ai\n"
            + "B. Cấp quyền cho người dùng\n"
            + "C. Xóa dữ liệu người dùng\n"
            + "D. Tạo mới tài khoản",
            "Cơ chế phân quyền (authorization) trong Spring Security là gì?\n"
            + "A. Kiểm tra quyền truy cập\n"
            + "B. Gửi thông báo cho người dùng\n"
            + "C. Thay đổi mật khẩu\n"
            + "D. Tăng tốc độ kết nối",
            "Lớp nào quản lý quá trình xác thực trong Spring Security?\n"
            + "A. AuthenticationManager\n"
            + "B. DispatcherServlet\n"
            + "C. EntityManager\n"
            + "D. RestController",
            "Thành phần nào dùng để mã hóa mật khẩu trong Spring Security?\n"
            + "A. PasswordEncoder\n"
            + "B. StringBuilder\n"
            + "C. FileWriter\n"
            + "D. JsonParser",
            "Để cấu hình Spring Security, bạn thường tạo lớp nào?\n"
            + "A. SecurityConfig\n"
            + "B. MainApplication\n"
            + "C. UserController\n"
            + "D. DatabaseConfig",
            "Trong Spring Security, để bảo vệ URL cụ thể, bạn dùng phương pháp nào?\n"
            + "A. HTTP Security Configuration\n"
            + "B. Session Management\n"
            + "C. Database Migration\n"
            + "D. HTML Template Setup",
            "Loại tấn công nào Spring Security giúp phòng chống?\n"
            + "A. CSRF (Cross-Site Request Forgery)\n"
            + "B. DDoS (Distributed Denial of Service)\n"
            + "C. Phishing qua email\n"
            + "D. Spam tin nhắn SMS"
        });

        TITLE_MAP.put("Xác thực bằng JWT", new String[]{
            "JWT là viết tắt của từ gì?\n"
            + "A. Java Web Token\n"
            + "B. JSON Web Token\n"
            + "C. JavaScript Web Token\n"
            + "D. Java With Token",
            "JWT thường dùng để làm gì?\n"
            + "A. Lưu trữ ảnh\n"
            + "B. Xác thực và truyền thông tin an toàn\n"
            + "C. Tăng tốc xử lý dữ liệu\n"
            + "D. Mã hóa cơ sở dữ liệu",
            "Một JWT bao gồm mấy phần chính?\n"
            + "A. 2\n"
            + "B. 3\n"
            + "C. 4\n"
            + "D. 5",
            "Ba phần chính của JWT là gì?\n"
            + "A. Header, Payload, Signature\n"
            + "B. Head, Body, Foot\n"
            + "C. Meta, Data, Hash\n"
            + "D. Title, Content, Sign",
            "Trong JWT, Payload chứa gì?\n"
            + "A. Thông tin người dùng và claims\n"
            + "B. Mã hóa mật khẩu\n"
            + "C. Mã nguồn ứng dụng\n"
            + "D. File đính kèm",
            "Signature trong JWT dùng để làm gì?\n"
            + "A. Giao diện đẹp hơn\n"
            + "B. Kiểm tra tính toàn vẹn của token\n"
            + "C. Tăng dung lượng file\n"
            + "D. Tạo đường dẫn mạng",
            "Khi sử dụng JWT, Token thường được lưu ở đâu?\n"
            + "A. LocalStorage hoặc HttpOnly Cookie\n"
            + "B. URL Parameters\n"
            + "C. CSS File\n"
            + "D. Java Class File",
            "Để tạo JWT trong Spring Boot, bạn cần thư viện nào?\n"
            + "A. jjwt (Java JWT)\n"
            + "B. Hibernate\n"
            + "C. Thymeleaf\n"
            + "D. JUnit",
            "Khi người dùng đăng nhập thành công, server sẽ làm gì với JWT?\n"
            + "A. Trả JWT về client\n"
            + "B. Lưu JWT vào database\n"
            + "C. Xóa JWT ngay lập tức\n"
            + "D. Gửi JWT cho các server khác",
            "Để xác thực yêu cầu (request) với JWT, server cần làm gì?\n"
            + "A. Giải mã và xác thực chữ ký JWT\n"
            + "B. Tải lại toàn bộ session\n"
            + "C. Chạy lại quá trình đăng ký\n"
            + "D. Gửi email xác nhận"
        });

        TITLE_MAP.put("Kiểm thử với JUnit và Mockito", new String[]{
            "JUnit là gì?\n"
            + "A. Một framework để xây dựng giao diện\n"
            + "B. Một framework kiểm thử đơn vị trong Java\n"
            + "C. Một công cụ quản lý cơ sở dữ liệu\n"
            + "D. Một trình biên dịch Java",
            "Phiên bản phổ biến hiện nay của JUnit là gì?\n"
            + "A. JUnit 3\n"
            + "B. JUnit 4\n"
            + "C. JUnit 5\n"
            + "D. JUnit 6",
            "Annotation nào dùng để đánh dấu một phương thức kiểm thử trong JUnit?\n"
            + "A. @Check\n"
            + "B. @Test\n"
            + "C. @Run\n"
            + "D. @Verify",
            "Mockito được dùng để làm gì trong kiểm thử?\n"
            + "A. Tạo database giả lập\n"
            + "B. Tạo các đối tượng giả (mock) để kiểm thử độc lập\n"
            + "C. Tối ưu hóa mã nguồn\n"
            + "D. Triển khai ứng dụng nhanh hơn",
            "Phương pháp kiểm thử nào giúp kiểm thử từng thành phần nhỏ nhất của ứng dụng?\n"
            + "A. Kiểm thử tích hợp\n"
            + "B. Kiểm thử hệ thống\n"
            + "C. Kiểm thử đơn vị (Unit Testing)\n"
            + "D. Kiểm thử chấp nhận",
            "Trong Mockito, annotation @Mock dùng để làm gì?\n"
            + "A. Tạo một đối tượng thật\n"
            + "B. Tạo một đối tượng giả\n"
            + "C. Tạo một database\n"
            + "D. Tạo một thread mới",
            "Phương thức nào trong JUnit dùng để kiểm tra điều kiện đúng?\n"
            + "A. assertTrue()\n"
            + "B. assertEquals()\n"
            + "C. assertFalse()\n"
            + "D. assertNull()",
            "Khi muốn thực thi một phương thức trước mỗi test, dùng annotation nào trong JUnit?\n"
            + "A. @BeforeAll\n"
            + "B. @BeforeEach\n"
            + "C. @AfterEach\n"
            + "D. @AfterAll",
            "Trong Mockito, phương thức when(...).thenReturn(...) dùng để?\n"
            + "A. Khởi tạo đối tượng\n"
            + "B. Định nghĩa hành vi giả lập của phương thức\n"
            + "C. Chạy test case\n"
            + "D. Tạo ngoại lệ kiểm thử",
            "Để chạy kiểm thử với JUnit và Mockito, bạn cần thêm dependency nào vào Maven?\n"
            + "A. spring-boot-starter-web\n"
            + "B. junit-jupiter và mockito-core\n"
            + "C. hibernate-validator\n"
            + "D. lombok-api"
        });

        TITLE_MAP.put("Giới thiệu SQL", new String[]{
            "Câu 1: SQL là viết tắt của gì?\n"
            + "A. Structured Query Language\n"
            + "B. System Query Language\n"
            + "C. Simple Query Language\n"
            + "D. Standard Query Language",
            "Câu 2: Câu lệnh SQL nào được sử dụng để truy vấn dữ liệu từ một bảng?\n"
            + "A. GET\n"
            + "B. SELECT\n"
            + "C. FETCH\n"
            + "D. QUERY",
            "Câu 3: Để thêm dữ liệu vào một bảng trong SQL, ta sử dụng câu lệnh nào?\n"
            + "A. ADD\n"
            + "B. INSERT INTO\n"
            + "C. APPEND\n"
            + "D. UPDATE",
            "Câu 4: Lệnh nào dùng để xóa toàn bộ dữ liệu trong một bảng mà vẫn giữ nguyên cấu trúc bảng?\n"
            + "A. DELETE\n"
            + "B. REMOVE\n"
            + "C. DROP\n"
            + "D. TRUNCATE",
            "Câu 5: Lệnh nào dùng để cập nhật dữ liệu trong bảng?\n"
            + "A. MODIFY\n"
            + "B. UPDATE\n"
            + "C. CHANGE\n"
            + "D. SET"
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
