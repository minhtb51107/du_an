package com.data;

import java.util.Arrays;
import java.util.List;

public class DataPanelA1 {

    // Mảng chứa các tiêu đề
    private static final String[] TITLES = {
        "Ngôn ngữ JAVA",
        "HTML & CSS",
        "JAVASCRIPT",
        "Ngôn ngữ PYTHON",
        "Ngôn ngữ C",
        "Cơ sở dữ liệu SQL"
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getTitle(int index) {
        if (index >= 0 && index < TITLES.length) {
            return TITLES[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllTitles() {
        return Arrays.asList(TITLES);
    }

    private static final String[] Description = {
        "🔹 Hướng đối tượng (OOP - Object-Oriented Programming)\n"
        + "Java tuân theo các nguyên tắc lập trình hướng đối tượng như đóng gói (Encapsulation), kế thừa (Inheritance), đa hình (Polymorphism) và trừu tượng (Abstraction), giúp mã nguồn dễ bảo trì và mở rộng.\n"
        + "\n"
        + "🔹 Đa nền tảng (Platform Independent)\n"
        + "Java biên dịch mã nguồn thành bytecode, có thể chạy trên bất kỳ hệ điều hành nào có JVM, bao gồm Windows, macOS, Linux và cả thiết bị di động.\n"
        + "\n"
        + "🔹 Quản lý bộ nhớ tự động\n"
        + "Java sử dụng Garbage Collector để tự động thu hồi bộ nhớ không sử dụng, giảm rủi ro rò rỉ bộ nhớ.\n"
        + "\n"
        + "🔹 Bảo mật cao\n"
        + "Java có cơ chế quản lý bộ nhớ an toàn, hạn chế lỗi tràn bộ đệm, cùng với mô hình bảo mật chặt chẽ thông qua Security Manager.\n"
        +"🔹 Đa luồng (Multithreading)\n" +
"Java hỗ trợ lập trình đa luồng giúp thực thi nhiều tác vụ cùng lúc, cải thiện hiệu suất của ứng dụng.",
        
        "Đặc điểm của HTML:\n"
        + "Ngôn ngữ đánh dấu: Sử dụng các thẻ (tags) để định nghĩa các thành phần như tiêu đề, đoạn văn, hình ảnh, liên kết.\n"
        + "\n"
        + "Định dạng trang web: Xây dựng khung sườn và bố cục của trang web.\n"
        + "\n"
        + "Hỗ trợ đa nền tảng: Hiển thị trên mọi trình duyệt web.\n"
        + "\n"
        + "Có thể mở rộng: Kết hợp với CSS và JavaScript để tạo trang web động.\n"
        + "\n"
        + "Đặc điểm của CSS:\n"
        + "Tách biệt nội dung và thiết kế: Giúp mã nguồn gọn gàng và dễ bảo trì hơn.\n"
        + "\n"
        + "Thiết kế linh hoạt: Tùy chỉnh màu sắc, kiểu chữ, bố cục và hiệu ứng.\n"
        + "\n"
        + "Hỗ trợ responsive: Giúp trang web hiển thị tốt trên nhiều thiết bị (PC, tablet, điện thoại).\n"
        + "\n"
        + "Tăng hiệu suất tải trang: CSS tối ưu giúp trang web tải nhanh hơn so với sử dụng nhiều thuộc tính nội tuyến trong HTML.",
        
        "Linh hoạt và dễ học: Cú pháp JavaScript tương đối đơn giản và dễ tiếp cận với người mới bắt đầu.\n"
        + "\n"
        + "Chạy trên trình duyệt (Client-side): JavaScript có thể tương tác với HTML và CSS để tạo ra các hiệu ứng động như hiển thị thông báo, thay đổi giao diện hoặc xử lý sự kiện người dùng.\n"
        + "\n"
        + "Chạy trên máy chủ (Server-side): Với Node.js, JavaScript có thể xử lý dữ liệu, kết nối cơ sở dữ liệu và xây dựng các API backend.\n"
        + "\n"
        + "Lập trình hướng đối tượng (OOP): JavaScript hỗ trợ lập trình hướng đối tượng, giúp tổ chức mã nguồn hiệu quả hơn.\n"
        + "\n"
        + "Lập trình bất đồng bộ (Asynchronous Programming): JavaScript cho phép thực thi nhiều tác vụ mà không làm chậm hiệu suất ứng dụng.\n"
        + "\n"
        + "Đa nền tảng: JavaScript có thể chạy trên trình duyệt web, máy chủ, ứng dụng di động và thậm chí trong các thiết bị IoT.",
        
        "Cú pháp đơn giản, dễ đọc: Python có cú pháp gần gũi với ngôn ngữ tự nhiên, giúp người mới bắt đầu dễ học và tiếp cận.\n" +
"\n" +
"Đa nền tảng: Python có thể chạy trên nhiều hệ điều hành khác nhau mà không cần thay đổi mã nguồn.\n" +
"\n" +
"Hỗ trợ lập trình hướng đối tượng (OOP): Python cho phép tổ chức mã nguồn hiệu quả bằng cách sử dụng các lớp và đối tượng.\n" +
"\n" +
"Thư viện phong phú: Python có hàng nghìn thư viện hỗ trợ cho nhiều lĩnh vực như trí tuệ nhân tạo, khoa học dữ liệu, xử lý ảnh, lập trình web và tự động hóa.\n" +
"\n" +
"Lập trình ngắn gọn, hiệu quả: Python giúp giảm thiểu số dòng lệnh so với các ngôn ngữ khác mà vẫn đảm bảo hiệu suất cao.\n" +
"\n" +
"Cộng đồng mạnh mẽ: Python có một cộng đồng lập trình viên lớn, hỗ trợ tài liệu phong phú và liên tục phát triển.",
        
        "Hiệu suất cao: C là một ngôn ngữ biên dịch, tức là mã nguồn C sẽ được biên dịch trực tiếp thành mã máy (machine code), giúp tối ưu hiệu suất khi chạy.\n" +
"\n" +
"Cấu trúc đơn giản: Ngôn ngữ C có cú pháp đơn giản, dễ hiểu, nhưng lại mạnh mẽ trong việc xây dựng các chương trình phức tạp.\n" +
"\n" +
"Quản lý bộ nhớ thủ công: C cho phép lập trình viên quản lý bộ nhớ bằng tay, điều này giúp tối ưu hóa tài nguyên hệ thống, mặc dù cũng đòi hỏi lập trình viên phải cẩn trọng trong việc cấp phát và giải phóng bộ nhớ.\n" +
"\n" +
"Khả năng tương tác với phần cứng: C cho phép lập trình viên làm việc trực tiếp với phần cứng của máy tính, điều này làm cho ngôn ngữ này trở thành lựa chọn lý tưởng cho phát triển hệ điều hành, phần mềm nhúng và các ứng dụng yêu cầu thao tác với phần cứng.\n" +
"\n" +
"Ngôn ngữ biên dịch: C là ngôn ngữ biên dịch, tức là mã nguồn sẽ được chuyển đổi thành mã máy để máy tính có thể thực thi trực tiếp. Điều này làm cho các ứng dụng C có hiệu suất rất cao.\n",
        
        "Cấu trúc đơn giản và dễ học: Cú pháp của SQL rất dễ hiểu và gần gũi với ngôn ngữ tự nhiên, giúp người dùng dễ dàng tạo và thao tác với các bảng dữ liệu.\n" +
"\n" +
"Ngôn ngữ khai báo (Declarative): Trong SQL, bạn chỉ cần mô tả những gì mình muốn làm (ví dụ: lấy dữ liệu, cập nhật dữ liệu) mà không cần phải chỉ ra các bước cụ thể để thực hiện. Hệ quản trị cơ sở dữ liệu sẽ tự động thực hiện các bước cần thiết.\n" +
"\n" +
"Quản lý dữ liệu quan hệ: SQL được thiết kế để làm việc với cơ sở dữ liệu quan hệ, nơi dữ liệu được tổ chức trong các bảng với các mối quan hệ giữa chúng.\n" +
"\n" +
"Tính linh hoạt cao: SQL có thể thực hiện nhiều thao tác phức tạp, từ việc truy vấn đơn giản cho đến các phép toán phức tạp, giúp người dùng dễ dàng phân tích và xử lý dữ liệu.\n" +
"\n" +
"Chuẩn hóa: SQL được chuẩn hóa và hỗ trợ bởi hầu hết các hệ quản trị cơ sở dữ liệu phổ biến, giúp người dùng dễ dàng chuyển đổi giữa các hệ thống cơ sở dữ liệu mà không gặp khó khăn lớn."
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getDescription(int index) {
        if (index >= 0 && index < Description.length) {
            return Description[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllDescription() {
        return Arrays.asList(Description);
    }

    private static final String[] Introduce = {
        "Java là một ngôn ngữ lập trình được sử dụng rộng rãi để viết mã cho các ứng dụng web. "
            + "Ngôn ngữ này là lựa chọn phổ biến của các nhà phát triển trong hơn 2 thập niên. "
            + "Hiện nay có hàng triệu ứng dụng Java đang được sử dụng. Java là một ngôn ngữ đa "
            + "nền tảng, hướng đến đối tượng, lấy mạng làm trung tâm và có thể được sử dụng như "
            + "một nền tảng. Đây là một ngôn ngữ lập trình nhanh, bảo mật, đáng tin cậy dùng để "
            + "viết mã cho mọi thứ từ ứng dụng di động, phần mềm doanh nghiệp cho đến các ứng "
            + "dụng dữ liệu lớn và công nghệ phía máy chủ.",
        
        "HTML (HyperText Markup Language) và CSS (Cascading Style Sheets) là hai công "
        + "nghệ cốt lõi trong phát triển web. HTML được sử dụng để tạo cấu trúc nội "
        + "dung, trong khi CSS giúp định dạng và thiết kế giao diện trang web.\n"
        + "\n"
        + "HTML sử dụng các thẻ (tags) để xác định các phần tử như tiêu đề, đoạn văn, "
        + "hình ảnh, liên kết và danh sách. Cấu trúc HTML có thể kết hợp với CSS "
        + "để cải thiện tính thẩm mỹ và trải nghiệm người dùng.",
        "JavaScript là một ngôn ngữ lập trình kịch bản (scripting language) chạy trên "
        + "trình duyệt, giúp thay đổi nội dung trang web theo thời gian thực mà không "
        + "cần tải lại trang. Ban đầu, JavaScript chỉ hoạt động trên trình duyệt, nhưng "
        + "với sự ra đời của Node.js, nó đã mở rộng khả năng để chạy trên máy chủ và "
        + "thực hiện nhiều tác vụ khác nhau.\n"
        + "\n"
        + "JavaScript là một ngôn ngữ lập trình mạnh mẽ, linh hoạt và quan trọng trong thế "
        + "giới công nghệ hiện nay. Nhờ khả năng chạy trên cả trình duyệt và máy chủ, "
        + "JavaScript tiếp tục là một trong những công nghệ hàng đầu trong lập trình hiện đại.",
        
        "Python là một ngôn ngữ lập trình bậc cao, đa năng và dễ học, được sử dụng rộng rãi trong "
        + "nhiều lĩnh vực như phát triển phần mềm, khoa học dữ liệu, trí tuệ nhân tạo, tự động hóa "
        + "và phát triển web. Với cú pháp đơn giản, dễ đọc và thư viện phong phú, Python trở thành "
        + "một trong những ngôn ngữ lập trình phổ biến nhất trên thế giới.\n"
        + "\n"
        +"Python là một ngôn ngữ lập trình thông dịch (interpreted language), có thể chạy trên nhiều "
            + "nền tảng như Windows, macOS và Linux mà không cần biên dịch. Python hỗ trợ lập trình "
            + "hướng đối tượng, lập trình hàm và lập trình thủ tục, giúp lập trình viên có nhiều lựa "
            + "chọn để phát triển ứng dụng.",
        
        "Ngôn ngữ lập trình C là một trong những ngôn ngữ lập trình cổ điển và ảnh hưởng sâu rộng trong "
            + "ngành công nghiệp phần mềm. Được phát triển vào đầu những năm 1970 bởi Dennis Ritchie tại "
            + "AT&T Bell Labs, C đã trở thành nền tảng của nhiều ngôn ngữ lập trình khác, bao gồm C++, C#, "
            + "Java, và nhiều ngôn ngữ hiện đại khác. Với tính đơn giản, hiệu quả và khả năng kiểm soát phần "
            + "cứng, C vẫn giữ được sự phổ biến và ứng dụng rộng rãi trong nhiều lĩnh vực.",
        
        "SQL (Structured Query Language) là một ngôn ngữ lập trình chuyên dụng được sử dụng để quản lý và thao "
            + "tác với cơ sở dữ liệu quan hệ. SQL giúp người dùng có thể truy vấn, cập nhật, chèn, xóa và quản "
            + "lý dữ liệu trong các hệ quản trị cơ sở dữ liệu (DBMS) như MySQL, PostgreSQL, Microsoft SQL Server, "
            + "Oracle, và SQLite. SQL là ngôn ngữ cơ bản và cực kỳ quan trọng trong việc làm việc với các hệ thống "
            + "cơ sở dữ liệu."
    };

    // Lấy tiêu đề theo chỉ số (index)
    public static String getIntroduce(int index) {
        if (index >= 0 && index < Introduce.length) {
            return Introduce[index];
        }
        return "Tiêu đề không hợp lệ!";
    }

    // Trả về danh sách tất cả tiêu đề
    public static List<String> getAllIntroduce() {
        return Arrays.asList(Introduce);
    }
}
