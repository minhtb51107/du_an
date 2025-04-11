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
public class BaiTapPythonData {

    private static final Map<String, int[]> Index_MAP = new HashMap<>();
    static {
         //Python
        Index_MAP.put("Giới thiệu về Python", new int[]{
            10
        });

        Index_MAP.put("Lịch sử phát triển", new int[]{
            10
        });

        Index_MAP.put("Lý do chọn Python", new int[]{
            10
        });

        Index_MAP.put("Cấu trúc chương trình Python", new int[]{
            10
        });

        Index_MAP.put("Cài đặt môi trường và IDE", new int[]{
            10
        });

        Index_MAP.put("Biến", new int[]{
            10
        });

        Index_MAP.put("Kiểu dữ liệu", new int[]{
            10
        });

        Index_MAP.put("Toán tử", new int[]{
            10
        });

        Index_MAP.put("Nhập xuất dữ liệu", new int[]{
            10
        });

        Index_MAP.put("Cấu trúc điều kiện", new int[]{
            10
        });

        Index_MAP.put("Vòng lặp", new int[]{
            10
        });

        Index_MAP.put("Danh sách", new int[]{
            10
        });

        Index_MAP.put("Tuple", new int[]{
            10
        });

        Index_MAP.put("Dictionary", new int[]{
            10
        });

        Index_MAP.put("OOP", new int[]{
            10
        });

        Index_MAP.put("Đọc/ghi file CSV", new int[]{
            10
        });

        Index_MAP.put("JSON", new int[]{
            10
        });

        Index_MAP.put("XML", new int[]{
            10
        });

        Index_MAP.put("Try-except", new int[]{
            10
        });

        Index_MAP.put("Finally", new int[]{
            10
        });

        Index_MAP.put("Tạo ngoại lệ tùy chỉnh", new int[]{
            10
        });

        Index_MAP.put("Lập trình đa luồng", new int[]{
            10
        });

        Index_MAP.put("Bất đồng bộ", new int[]{
            10
        });

        Index_MAP.put("Requests", new int[]{
            10
        });

        Index_MAP.put("BeautifulSoup", new int[]{
            10
        });

        Index_MAP.put("Selenium", new int[]{
            10
        });

        Index_MAP.put("SQLite", new int[]{
            10
        });

        Index_MAP.put("MySQL", new int[]{
            10
        });

        Index_MAP.put("PostgreSQL", new int[]{
            10
        });

        Index_MAP.put("ORM với SQLAlchemy", new int[]{
            10
        });

        Index_MAP.put("Pandas", new int[]{
            10
        });

        Index_MAP.put("Numpy", new int[]{
            10
        });

        Index_MAP.put("Matplotlib", new int[]{
            10
        });

        Index_MAP.put("Socket", new int[]{
            10
        });

        Index_MAP.put("Giao thức TCP/IP", new int[]{
            10
        });

        Index_MAP.put("UDP", new int[]{
            10
        });

        Index_MAP.put("Xây dựng ứng dụng Web với Flask/Django", new int[]{
            10
        });

        Index_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch", new int[]{
            10
        });

        Index_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new int[]{
            10
        });

        Index_MAP.put("Bảo mật, tối ưu hiệu năng", new int[]{
            10
        });

        Index_MAP.put("kiểm thử với pytest, unittest", new int[]{
            10
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
        //Python
        TITLE_MAP.put("Giới thiệu về Python", new String[]{
            "Python là ngôn ngữ lập trình thuộc loại nào?\n"
            + "\n"
            + "A. Biên dịch.\n"
            + "B. Thông dịch.\n"
            + "C. Cả biên dịch và thông dịch.\n"
            + "D. Không phải biên dịch cũng không phải thông dịch.",
            "Ai là người tạo ra ngôn ngữ Python?\n"
            + "\n"
            + "A. James Gosling.\n"
            + "B. Guido van Rossum.\n"
            + "C. Bjarne Stroustrup.\n"
            + "D. Dennis Ritchie.",
            "Python được phát hành lần đầu tiên vào năm nào?\n"
            + "\n"
            + "A. 1989.\n"
            + "B. 1991.\n"
            + "C. 1995.\n"
            + "D. 2000.",
            "Python được đặt tên theo chương trình truyền hình nào?\n"
            + "\n"
            + "A. Monty Python's Flying Circus.\n"
            + "B. Fawlty Towers.\n"
            + "C. Blackadder.\n"
            + "D. Doctor Who.",
            "Python được sử dụng rộng rãi trong lĩnh vực nào?\n"
            + "\n"
            + "A. Phát triển web.\n"
            + "B. Khoa học dữ liệu.\n"
            + "C. Trí tuệ nhân tạo.\n"
            + "D. Tất cả các đáp án trên.",
            "Python có hỗ trợ lập trình hướng đối tượng không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ hỗ trợ một phần.\n"
            + "D. Không liên quan.",
            "Python có hỗ trợ lập trình hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ hỗ trợ một phần.\n"
            + "D. Không liên quan.",
            "Python có hỗ trợ lập trình thủ tục không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ hỗ trợ một phần.\n"
            + "D. Không liên quan.",
            "Python có hỗ trợ lập trình module không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ hỗ trợ một phần.\n"
            + "D. Không liên quan.",
            "Python có hỗ trợ lập trình hướng khía cạnh không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ hỗ trợ một phần.\n"
            + "D. Không liên quan.",});

        TITLE_MAP.put("Lịch sử phát triển", new String[]{
            "Python được phát triển ban đầu tại tổ chức nào?\n"
            + "\n"
            + "A. Google.\n"
            + "B. Microsoft.\n"
            + "C. CWI (Centrum Wiskunde & Informatica).\n"
            + "D. Apple.",
            "Phiên bản Python 2.0 được phát hành vào năm nào?\n"
            + "\n"
            + "A. 1995.\n"
            + "B. 2000.\n"
            + "C. 2005.\n"
            + "D. 2010.",
            "Phiên bản Python 3.0 được phát hành vào năm nào?\n"
            + "\n"
            + "A. 2000.\n"
            + "B. 2005.\n"
            + "C. 2008.\n"
            + "D. 2012.",
            "Python 2.7 là phiên bản cuối cùng của dòng Python 2.x và được hỗ trợ đến năm nào?\n"
            + "\n"
            + "A. 2015.\n"
            + "B. 2020.\n"
            + "C. 2025.\n"
            + "D. 2030.",
            "PEP (Python Enhancement Proposal) là gì?\n"
            + "\n"
            + "A. Một loại lỗi trong Python.\n"
            + "B. Một thư viện chuẩn của Python.\n"
            + "C. Một tài liệu thiết kế cung cấp thông tin cho cộng đồng Python.\n"
            + "D. Một trình biên dịch Python.",
            "Python Software Foundation (PSF) được thành lập vào năm nào?\n"
            + "\n"
            + "A. 1998.\n"
            + "B. 2001.\n"
            + "C. 2005.\n"
            + "D. 2010.",
            "Python có bao nhiêu phiên bản chính đang được hỗ trợ tính đến hiện tại?\n"
            + "\n"
            + "A. 1.\n"
            + "B. 2.\n"
            + "C. 3.\n"
            + "D. 4.",
            "Python có phải là ngôn ngữ lập trình đa nền tảng không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số nền tảng.\n"
            + "D. Không liên quan.",
            "Python có phải là ngôn ngữ lập trình mã nguồn mở không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số phần.\n"
            + "D. Không liên quan.",
            "Python có phải là ngôn ngữ lập trình hướng đối tượng không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số phần.\n"
            + "D. Không liên quan.",});

        TITLE_MAP.put("Lý do chọn Python", new String[]{
            "Lý do nào sau đây không phải là lý do chọn Python?\n"
            + "\n"
            + "A. Cú pháp đơn giản, dễ học.\n"
            + "B. Cộng đồng hỗ trợ lớn mạnh.\n"
            + "C. Thư viện chuẩn phong phú.\n"
            + "D. Hiệu suất cao hơn C++.",
            "Python có thể được sử dụng để phát triển loại ứng dụng nào?\n"
            + "\n"
            + "A. Ứng dụng web.\n"
            + "B. Ứng dụng desktop.\n"
            + "C. Ứng dụng di động.\n"
            + "D. Tất cả các đáp án trên.",
            "Python có hỗ trợ lập trình hướng đối tượng không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số phần.\n"
            + "D. Không liên quan.",
            "Python có hỗ trợ lập trình hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số phần.\n"
            + "D. Không liên quan.",
            "Python có hỗ trợ lập trình thủ tục không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số phần.\n"
            + "D. Không liên quan.",
            "Python có thư viện nào được sử dụng để phân tích dữ liệu?\n"
            + "\n"
            + "A. NumPy.\n"
            + "B. Pandas.\n"
            + "C. Matplotlib.\n"
            + "D. Tất cả các đáp án trên.",
            "Python có thư viện nào được sử dụng để phát triển web?\n"
            + "\n"
            + "A. Django.\n"
            + "B. Flask.\n"
            + "C. Pyramid.\n"
            + "D. Tất cả các đáp án trên.",
            "Python có thư viện nào được sử dụng để học máy?\n"
            + "\n"
            + "A. Scikit-learn.\n"
            + "B. TensorFlow.\n"
            + "C. PyTorch.\n"
            + "D. Tất cả các đáp án trên.",
            "Python có thư viện nào được sử dụng để tự động hóa?\n"
            + "\n"
            + "A. Selenium.\n"
            + "B. PyAutoGUI.\n"
            + "C. Requests.\n"
            + "D. Tất cả các đáp án trên.",
            "Python có phải là ngôn ngữ lập trình được sử dụng rộng rãi nhất không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số lĩnh vực.\n"
            + "D. Không liên quan.",});

        TITLE_MAP.put("Cấu trúc chương trình Python", new String[]{
            "Đơn vị cơ bản của một chương trình Python là gì?\n"
            + "\n"
            + "A. Hàm.\n"
            + "B. Lớp.\n"
            + "C. Mô-đun.\n"
            + "D. Câu lệnh.",
            "Cấu trúc nào được sử dụng để lặp lại một khối mã trong Python?\n"
            + "\n"
            + "A. If-else.\n"
            + "B. Vòng lặp for.\n"
            + "C. Vòng lặp while.\n"
            + "D. Cả B và C.",
            "Cấu trúc nào được sử dụng để định nghĩa một hàm trong Python?\n"
            + "\n"
            + "A. Class.\n"
            + "B. Def.\n"
            + "C. Module.\n"
            + "D. Import.",
            "Cấu trúc nào được sử dụng để định nghĩa một lớp trong Python?\n"
            + "\n"
            + "A. Class.\n"
            + "B. Def.\n"
            + "C. Module.\n"
            + "D. Import.",
            "Cấu trúc nào được sử dụng để nhập một mô-đun vào chương trình Python?\n"
            + "\n"
            + "A. Class.\n"
            + "B. Def.\n"
            + "C. Module.\n"
            + "D. Import.",
            "Cấu trúc nào được sử dụng để xử lý ngoại lệ trong Python?\n"
            + "\n"
            + "A. Try-except.\n"
            + "B. If-else.\n"
            + "C. Vòng lặp for.\n"
            + "D. Vòng lặp while.",
            "Cấu trúc nào được sử dụng để tạo một danh sách trong Python?\n"
            + "\n"
            + "A. ().\n"
            + "B. [].\n"
            + "C. {}.\n"
            + "D. \'\'.",
            "Cấu trúc nào được sử dụng để tạo một tuple trong Python?\n"
            + "\n"
            + "A. ().\n"
            + "B. [].\n"
            + "C. {}.\n"
            + "D. \'\'.",
            "Cấu trúc nào được sử dụng để tạo một dictionary trong Python?\n"
            + "\n"
            + "A. ().\n"
            + "B. [].\n"
            + "C. {}.\n"
            + "D. \'\'.",
            "Cấu trúc nào được sử dụng để tạo một chuỗi trong Python?\n"
            + "\n"
            + "A. ().\n"
            + "B. [].\n"
            + "C. {}.\n"
            + "D. \'\'.",});

        TITLE_MAP.put("Cài đặt môi trường và IDE", new String[]{
            "Công cụ nào sau đây không được sử dụng để cài đặt Python?\n"
            + "\n"
            + "A. Anaconda.\n"
            + "B. Pip.\n"
            + "C. Visual Studio Code.\n"
            + "D. Python.org.",
            "IDE nào sau đây không được sử dụng để lập trình Python?\n"
            + "\n"
            + "A. PyCharm.\n"
            + "B. Visual Studio Code.\n"
            + "C. Eclipse.\n"
            + "D. Notepad.",
            "Công cụ nào được sử dụng để quản lý các gói Python?\n"
            + "\n"
            + "A. Anaconda.\n"
            + "B. Pip.\n"
            + "C. Virtualenv.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để tạo môi trường ảo Python?\n"
            + "\n"
            + "A. Anaconda.\n"
            + "B. Pip.\n"
            + "C. Virtualenv.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để gỡ lỗi mã Python?\n"
            + "\n"
            + "A. PDB.\n"
            + "B. PyCharm debugger.\n"
            + "C. Visual Studio Code debugger.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để kiểm tra mã Python?\n"
            + "\n"
            + "A. PyLint.\n"
            + "B. Flake8.\n"
            + "C. MyPy.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để định dạng mã Python?\n"
            + "\n"
            + "A. Black.\n"
            + "B. YAPF.\n"
            + "C. Autopep8.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để tạo tài liệu mã Python?\n"
            + "\n"
            + "A. Sphinx.\n"
            + "B. MkDocs.\n"
            + "C. Read the Docs.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để đóng gói mã Python?\n"
            + "\n"
            + "A. Setuptools.\n"
            + "B. Distutils.\n"
            + "C. Poetry.\n"
            + "D. Tất cả các đáp án trên.",
            "Công cụ nào được sử dụng để triển khai mã Python?\n"
            + "\n"
            + "A. Docker.\n"
            + "B. Heroku.\n"
            + "C. AWS Lambda.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Biến", new String[]{
            "Biến trong Python được khai báo như thế nào?\n"
            + "\n"
            + "A. Sử dụng từ khóa var.\n"
            + "B. Sử dụng từ khóa let.\n"
            + "C. Không cần khai báo, gán giá trị trực tiếp.\n"
            + "D. Sử dụng từ khóa declare.",
            "Loại biến nào sau đây không tồn tại trong Python?\n"
            + "\n"
            + "A. Số nguyên.\n"
            + "B. Số thực.\n"
            + "C. Ký tự.\n"
            + "D. Chuỗi.",
            "Biến nào sau đây có tên không hợp lệ trong Python?\n"
            + "\n"
            + "A. my_variable.\n"
            + "B. MyVariable.\n"
            + "C. 1myvariable.\n"
            + "D. myVariable1.",
            "Biến nào sau đây có phạm vi toàn cục trong Python?\n"
            + "\n"
            + "A. Biến được khai báo bên trong hàm.\n"
            + "B. Biến được khai báo bên ngoài hàm.\n"
            + "C. Biến được khai báo bên trong lớp.\n"
            + "D. Biến được khai báo bên trong mô-đun.",
            "Biến nào sau đây có phạm vi cục bộ trong Python?\n"
            + "\n"
            + "A. Biến được khai báo bên trong hàm.\n"
            + "B. Biến được khai báo bên ngoài hàm.\n"
            + "C. Biến được khai báo bên trong lớp.\n"
            + "D. Biến được khai báo bên trong mô-đun.",
            "Biến nào sau đây có phạm vi lớp trong Python?\n"
            + "\n"
            + "A. Biến được khai báo bên trong hàm.\n"
            + "B. Biến được khai báo bên ngoài hàm.\n"
            + "C. Biến được khai báo bên trong lớp.\n"
            + "D. Biến được khai báo bên trong mô-đun.",
            "Biến nào sau đây có phạm vi mô-đun trong Python?\n"
            + "\n"
            + "A. Biến được khai báo bên trong hàm.\n"
            + "B. Biến được khai báo bên ngoài hàm.\n"
            + "C. Biến được khai báo bên trong lớp.\n"
            + "D. Biến được khai báo bên trong mô-đun.",
            "Biến nào sau đây có thể được thay đổi giá trị trong Python?\n"
            + "\n"
            + "A. Biến số nguyên.\n"
            + "B. Biến số thực.\n"
            + "C. Biến chuỗi.\n"
            + "D. Tất cả các đáp án trên.",
            "Biến nào sau đây không thể được thay đổi giá trị trong Python?\n"
            + "\n"
            + "A. Biến số nguyên.\n"
            + "B. Biến số thực.\n"
            + "C. Biến chuỗi.\n"
            + "D. Không có đáp án nào đúng.",
            "Biến nào sau đây được sử dụng để lưu trữ nhiều giá trị trong Python?\n"
            + "\n"
            + "A. Danh sách.\n"
            + "B. Tuple.\n"
            + "C. Dictionary.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Kiểu dữ liệu", new String[]{
            "Kiểu dữ liệu nào sau đây không tồn tại trong Python?\n"
            + "\n"
            + "A. Số nguyên.\n"
            + "B. Số thực.\n"
            + "C. Ký tự.\n"
            + "D. Chuỗi.",
            "Kiểu dữ liệu nào sau đây được sử dụng để lưu trữ số nguyên trong Python?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. str.\n"
            + "D. bool.",
            "Kiểu dữ liệu nào sau đây được sử dụng để lưu trữ số thực trong Python?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. str.\n"
            + "D. bool.",
            "Kiểu dữ liệu nào sau đây được sử dụng để lưu trữ chuỗi trong Python?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. str.\n"
            + "D. bool.",
            "Kiểu dữ liệu nào sau đây được sử dụng để lưu trữ giá trị logic trong Python?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. str.\n"
            + "D. bool.",
            "Kiểu dữ liệu nào sau đây được sử dụng để lưu trữ một tập hợp các giá trị không trùng lặp trong Python?\n"
            + "\n"
            + "A. List.\n"
            + "B. Tuple.\n"
            + "C. Set.\n"
            + "D. Dictionary.",
            "Kiểu dữ liệu nào sau đây được sử dụng để lưu trữ một tập hợp các giá trị có thứ tự trong Python?\n"
            + "\n"
            + "A. List.\n"
            + "B. Tuple.\n"
            + "C. Set.\n"
            + "D. Dictionary.",
            "Kiểu dữ liệu nào sau đây được sử dụng để lưu trữ một tập hợp các cặp key-value trong Python?\n"
            + "\n"
            + "A. List.\n"
            + "B. Tuple.\n"
            + "C. Set.\n"
            + "D. Dictionary.",
            "Kiểu dữ liệu nào sau đây không thể được thay đổi giá trị trong Python?\n"
            + "\n"
            + "A. List.\n"
            + "B. Tuple.\n"
            + "C. Set.\n"
            + "D. Dictionary.",
            "Kiểu dữ liệu nào sau đây có thể được thay đổi giá trị trong Python?\n"
            + "\n"
            + "A. List.\n"
            + "B. Tuple.\n"
            + "C. Set.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Toán tử", new String[]{
            "Toán tử nào sau đây được sử dụng để cộng hai số trong Python?\n"
            + "\n"
            + "A. +.\n"
            + "B. -.\n"
            + "C. *.\n"
            + "D. /.",
            "Toán tử nào sau đây được sử dụng để trừ hai số trong Python?\n"
            + "\n"
            + "A. +.\n"
            + "B. -.\n"
            + "C. *.\n"
            + "D. /.",
            "Toán tử nào sau đây được sử dụng để nhân hai số trong Python?\n"
            + "\n"
            + "A. +.\n"
            + "B. -.\n"
            + "C. *.\n"
            + "D. /.",
            "Toán tử nào sau đây được sử dụng để chia hai số trong Python?\n"
            + "\n"
            + "A. +.\n"
            + "B. -.\n"
            + "C. *.\n"
            + "D. /.",
            "Toán tử nào sau đây được sử dụng để lấy phần dư của phép chia hai số trong Python?\n"
            + "\n"
            + "A. %.\n"
            + "B. //.\n"
            + "C. **.\n"
            + "D. =.",
            "Toán tử nào sau đây được sử dụng để lấy phần nguyên của phép chia hai số trong Python?\n"
            + "\n"
            + "A. %.\n"
            + "B. //.\n"
            + "C. **.\n"
            + "D. =.",
            "Toán tử nào sau đây được sử dụng để lấy lũy thừa của một số trong Python?\n"
            + "\n"
            + "A. %.\n"
            + "B. //.\n"
            + "C. **.\n"
            + "D. =.",
            "Toán tử nào sau đây được sử dụng để gán giá trị cho một biến trong Python?\n"
            + "\n"
            + "A. %.\n"
            + "B. //.\n"
            + "C. **.\n"
            + "D. =.",
            "Toán tử nào sau đây được sử dụng để so sánh hai giá trị trong Python?\n"
            + "\n"
            + "A. ==.\n"
            + "B. !=.\n"
            + "C. >.\n"
            + "D. Tất cả các đáp án trên.",
            "Toán tử nào sau đây được sử dụng để kết hợp hai chuỗi trong Python?\n"
            + "\n"
            + "A. +.\n"
            + "B. -.\n"
            + "C. *.\n"
            + "D. /.",});

        TITLE_MAP.put("Nhập xuất dữ liệu", new String[]{
            "Hàm nào được sử dụng để nhập dữ liệu từ người dùng trong Python?\n"
            + "\n"
            + "A. print().\n"
            + "B. input().\n"
            + "C. format().\n"
            + "D. open().",
            "Hàm nào được sử dụng để xuất dữ liệu ra màn hình trong Python?\n"
            + "\n"
            + "A. print().\n"
            + "B. input().\n"
            + "C. format().\n"
            + "D. open().",
            "Hàm nào được sử dụng để định dạng chuỗi trong Python?\n"
            + "\n"
            + "A. print().\n"
            + "B. input().\n"
            + "C. format().\n"
            + "D. open().",
            "Hàm nào được sử dụng để mở một tệp trong Python?\n"
            + "\n"
            + "A. print().\n"
            + "B. input().\n"
            + "C. format().\n"
            + "D. open().",
            "Hàm nào được sử dụng để đọc dữ liệu từ một tệp trong Python?\n"
            + "\n"
            + "A. read().\n"
            + "B. readline().\n"
            + "C. readlines().\n"
            + "D. Tất cả các đáp án trên.",
            "Hàm nào được sử dụng để ghi dữ liệu vào một tệp trong Python?\n"
            + "\n"
            + "A. write().\n"
            + "B. writelines().\n"
            + "C. append().\n"
            + "D. Tất cả các đáp án trên.",
            "Phương thức nào được sử dụng để đóng một tệp trong Python?\n"
            + "\n"
            + "A. close().\n"
            + "B. flush().\n"
            + "C. seek().\n"
            + "D. tell().",
            "Phương thức nào được sử dụng để làm sạch bộ đệm của một tệp trong Python?\n"
            + "\n"
            + "A. close().\n"
            + "B. flush().\n"
            + "C. seek().\n"
            + "D. tell().",
            "Phương thức nào được sử dụng để di chuyển con trỏ tệp đến một vị trí cụ thể trong Python?\n"
            + "\n"
            + "A. close().\n"
            + "B. flush().\n"
            + "C. seek().\n"
            + "D. tell().",
            "Phương thức nào được sử dụng để lấy vị trí hiện tại của con trỏ tệp trong Python?\n"
            + "\n"
            + "A. close().\n"
            + "B. flush().\n"
            + "C. seek().\n"
            + "D. tell().",});

        TITLE_MAP.put("Cấu trúc điều kiện", new String[]{
            "Cấu trúc nào được sử dụng để kiểm tra một điều kiện trong Python?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. If-else.\n"
            + "D. Try-except.",
            "Cấu trúc nào được sử dụng để thực thi một khối mã nếu một điều kiện là đúng trong Python?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. If-else.\n"
            + "D. Try-except.",
            "Cấu trúc nào được sử dụng để thực thi một khối mã nếu một điều kiện là sai trong Python?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. If-else.\n"
            + "D. Try-except.",
            "Cấu trúc nào được sử dụng để kiểm tra nhiều điều kiện trong Python?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. If-elif-else.\n"
            + "D. Try-except.",
            "Cấu trúc nào được sử dụng để thực thi một khối mã nếu một trong nhiều điều kiện là đúng trong Python?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. If-elif-else.\n"
            + "D. Try-except.",
            "Cấu trúc nào được sử dụng để thực thi một khối mã nếu tất cả các điều kiện là sai trong Python?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. If-elif-else.\n"
            + "D. Try-except.",
            "Toán tử nào được sử dụng để kiểm tra xem hai giá trị có bằng nhau trong Python?\n"
            + "\n"
            + "A. =.\n"
            + "B. ==.\n"
            + "C. !=.\n"
            + "D. <.",
            "Toán tử nào được sử dụng để kiểm tra xem hai giá trị có khác nhau trong Python?\n"
            + "\n"
            + "A. =.\n"
            + "B. ==.\n"
            + "C. !=.\n"
            + "D. <.",
            "Toán tử nào được sử dụng để kiểm tra xem một giá trị có lớn hơn giá trị khác trong Python?\n"
            + "\n"
            + "A. =.\n"
            + "B. ==.\n"
            + "C. !=.\n"
            + "D. >.",
            "Toán tử nào được sử dụng để kiểm tra xem một giá trị có nhỏ hơn giá trị khác trong Python?\n"
            + "\n"
            + "A. =.\n"
            + "B. ==.\n"
            + "C. !=.\n"
            + "D. <.",});

        TITLE_MAP.put("Vòng lặp", new String[]{
            "Vòng lặp nào được sử dụng để lặp lại một khối mã một số lần xác định trong Python?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. If-else.\n"
            + "D. Try-except.",
            "Vòng lặp nào được sử dụng để lặp lại một khối mã cho đến khi một điều kiện là sai trong Python?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. If-else.\n"
            + "D. Try-except.",
            "Hàm nào được sử dụng để tạo một chuỗi số trong Python?\n"
            + "\n"
            + "A. range().\n"
            + "B. len().\n"
            + "C. enumerate().\n"
            + "D. zip().",
            "Hàm nào được sử dụng để lấy độ dài của một chuỗi trong Python?\n"
            + "\n"
            + "A. range().\n"
            + "B. len().\n"
            + "C. enumerate().\n"
            + "D. zip().",
            "Hàm nào được sử dụng để lặp lại một chuỗi và lấy cả chỉ mục và giá trị trong Python?\n"
            + "\n"
            + "A. range().\n"
            + "B. len().\n"
            + "C. enumerate().\n"
            + "D. zip().",
            "Hàm nào được sử dụng để lặp lại nhiều chuỗi cùng lúc trong Python?\n"
            + "\n"
            + "A. range().\n"
            + "B. len().\n"
            + "C. enumerate().\n"
            + "D. zip().",
            "Câu lệnh nào được sử dụng để thoát khỏi một vòng lặp trong Python?\n"
            + "\n"
            + "A. break.\n"
            + "B. continue.\n"
            + "C. pass.\n"
            + "D. return.",
            "Câu lệnh nào được sử dụng để bỏ qua các lần lặp còn lại của một vòng lặp trong Python?\n"
            + "\n"
            + "A. break.\n"
            + "B. continue.\n"
            + "C. pass.\n"
            + "D. return.",
            "Câu lệnh nào được sử dụng để không làm gì cả trong Python?\n"
            + "\n"
            + "A. break.\n"
            + "B. continue.\n"
            + "C. pass.\n"
            + "D. return.",
            "Câu lệnh nào được sử dụng để trả về một giá trị từ một hàm trong Python?\n"
            + "\n"
            + "A. break.\n"
            + "B. continue.\n"
            + "C. pass.\n"
            + "D. return.",});

        TITLE_MAP.put("Danh sách", new String[]{
            "Danh sách trong Python được tạo ra như thế nào?\n"
            + "\n"
            + "A. ().\n"
            + "B. [].\n"
            + "C. {}.\n"
            + "D. \'\'.",
            "Danh sách trong Python có thể chứa các phần tử có kiểu dữ liệu khác nhau không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số kiểu dữ liệu.\n"
            + "D. Không liên quan.",
            "Danh sách trong Python có thể được thay đổi giá trị không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số phần tử.\n"
            + "D. Không liên quan.",
            "Phương thức nào được sử dụng để thêm một phần tử vào cuối danh sách trong Python?\n"
            + "\n"
            + "A. append().\n"
            + "B. insert().\n"
            + "C. extend().\n"
            + "D. pop().",
            "Phương thức nào được sử dụng để thêm một phần tử vào một vị trí cụ thể trong danh sách trong Python?\n"
            + "\n"
            + "A. append().\n"
            + "B. insert().\n"
            + "C. extend().\n"
            + "D. pop().",
            "Phương thức nào được sử dụng để thêm nhiều phần tử vào cuối danh sách trong Python?\n"
            + "\n"
            + "A. append().\n"
            + "B. insert().\n"
            + "C. extend().\n"
            + "D. pop().",
            "Phương thức nào được sử dụng để xóa một phần tử khỏi danh sách trong Python?\n"
            + "\n"
            + "A. append().\n"
            + "B. insert().\n"
            + "C. extend().\n"
            + "D. pop().",
            "Phương thức nào được sử dụng để đảo ngược thứ tự các phần tử trong danh sách trong Python?\n"
            + "\n"
            + "A. reverse().\n"
            + "B. sort().\n"
            + "C. copy().\n"
            + "D. clear().",
            "Phương thức nào được sử dụng để sắp xếp các phần tử trong danh sách trong Python?\n"
            + "\n"
            + "A. reverse().\n"
            + "B. sort().\n"
            + "C. copy().\n"
            + "D. clear().",
            "Phương thức nào được sử dụng để sao chép một danh sách trong Python?\n"
            + "\n"
            + "A. reverse().\n"
            + "B. sort().\n"
            + "C. copy().\n"
            + "D. clear().",});

        TITLE_MAP.put("Tuple", new String[]{
            "Tuple trong Python được tạo ra như thế nào?\n"
            + "\n"
            + "A. ().\n"
            + "B. [].\n"
            + "C. {}.\n"
            + "D. \'\'.",
            "Tuple trong Python có thể chứa các phần tử có kiểu dữ liệu khác nhau không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số kiểu dữ liệu.\n"
            + "D. Không liên quan.",
            "Tuple trong Python có thể được thay đổi giá trị không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số phần tử.\n"
            + "D. Không liên quan.",
            "Phương thức nào được sử dụng để lấy độ dài của một tuple trong Python?\n"
            + "\n"
            + "A. len().\n"
            + "B. max().\n"
            + "C. min().\n"
            + "D. sum().",
            "Phương thức nào được sử dụng để lấy giá trị lớn nhất trong một tuple trong Python?\n"
            + "\n"
            + "A. len().\n"
            + "B. max().\n"
            + "C. min().\n"
            + "D. sum().",
            "Phương thức nào được sử dụng để lấy giá trị nhỏ nhất trong một tuple trong Python?\n"
            + "\n"
            + "A. len().\n"
            + "B. max().\n"
            + "C. min().\n"
            + "D. sum().",
            "Phương thức nào được sử dụng để tính tổng các giá trị trong một tuple trong Python?\n"
            + "\n"
            + "A. len().\n"
            + "B. max().\n"
            + "C. min().\n"
            + "D. sum().",
            "Phương thức nào được sử dụng để đếm số lần xuất hiện của một giá trị trong một tuple trong Python?\n"
            + "\n"
            + "A. count().\n"
            + "B. index().\n"
            + "C. pop().\n"
            + "D. remove().",
            "Phương thức nào được sử dụng để lấy chỉ mục của một giá trị trong một tuple trong Python?\n"
            + "\n"
            + "A. count().\n"
            + "B. index().\n"
            + "C. pop().\n"
            + "D. remove().",
            "Phương thức nào được sử dụng để xóa một phần tử khỏi một tuple trong Python?\n"
            + "\n"
            + "A. count().\n"
            + "B. index().\n"
            + "C. pop().\n"
            + "D. remove().",});

        TITLE_MAP.put("Dictionary", new String[]{
            "Dictionary trong Python được tạo ra như thế nào?\n"
            + "\n"
            + "A. ().\n"
            + "B. [].\n"
            + "C. {}.\n"
            + "D. \'\'.",
            "Dictionary trong Python có thể chứa các cặp key-value có kiểu dữ liệu khác nhau không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số kiểu dữ liệu.\n"
            + "D. Không liên quan.",
            "Dictionary trong Python có thể được thay đổi giá trị không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ một số cặp key-value.\n"
            + "D. Không liên quan.",
            "Phương thức nào được sử dụng để lấy giá trị của một key trong dictionary trong Python?\n"
            + "\n"
            + "A. get().\n"
            + "B. keys().\n"
            + "C. values().\n"
            + "D. items().",
            "Phương thức nào được sử dụng để lấy tất cả các key trong dictionary trong Python?\n"
            + "\n"
            + "A. get().\n"
            + "B. keys().\n"
            + "C. values().\n"
            + "D. items().",
            "Phương thức nào được sử dụng để lấy tất cả các giá trị trong dictionary trong Python?\n"
            + "\n"
            + "A. get().\n"
            + "B. keys().\n"
            + "C. values().\n"
            + "D. items().",
            "Phương thức nào được sử dụng để lấy tất cả các cặp key-value trong dictionary trong Python?\n"
            + "\n"
            + "A. get().\n"
            + "B. keys().\n"
            + "C. values().\n"
            + "D. items().",
            "Phương thức nào được sử dụng để thêm một cặp key-value vào dictionary trong Python?\n"
            + "\n"
            + "A. update().\n"
            + "B. pop().\n"
            + "C. popitem().\n"
            + "D. clear().",
            "Phương thức nào được sử dụng để xóa một cặp key-value khỏi dictionary trong Python?\n"
            + "\n"
            + "A. update().\n"
            + "B. pop().\n"
            + "C. popitem().\n"
            + "D. clear().",
            "Phương thức nào được sử dụng để xóa tất cả các cặp key-value khỏi dictionary trong Python?\n"
            + "\n"
            + "A. update().\n"
            + "B. pop().\n"
            + "C. popitem().\n"
            + "D. clear().",});

        TITLE_MAP.put("OOP", new String[]{
            "OOP là viết tắt của cụm từ nào?\n"
            + "\n"
            + "A. Object-Oriented Programming.\n"
            + "B. Object-Oriented Project.\n"
            + "C. Object-Oriented Process.\n"
            + "D. Object-Oriented Procedure.",
            "Khái niệm nào sau đây không phải là một nguyên tắc của OOP?\n"
            + "\n"
            + "A. Đóng gói.\n"
            + "B. Kế thừa.\n"
            + "C. Đa hình.\n"
            + "D. Thủ tục.",
            "Khái niệm nào sau đây được sử dụng để tạo ra các đối tượng từ một lớp?\n"
            + "\n"
            + "A. Hàm.\n"
            + "B. Thuộc tính.\n"
            + "C. Phương thức.\n"
            + "D. Khởi tạo.",
            "Khái niệm nào sau đây được sử dụng để ẩn dữ liệu của một đối tượng khỏi thế giới bên ngoài?\n"
            + "\n"
            + "A. Đóng gói.\n"
            + "B. Kế thừa.\n"
            + "C. Đa hình.\n"
            + "D. Trừu tượng.",
            "Khái niệm nào sau đây cho phép một lớp kế thừa các thuộc tính và phương thức từ một lớp khác?\n"
            + "\n"
            + "A. Đóng gói.\n"
            + "B. Kế thừa.\n"
            + "C. Đa hình.\n"
            + "D. Trừu tượng.",
            "Khái niệm nào sau đây cho phép các đối tượng của các lớp khác nhau có thể được sử dụng thay thế cho nhau?\n"
            + "\n"
            + "A. Đóng gói.\n"
            + "B. Kế thừa.\n"
            + "C. Đa hình.\n"
            + "D. Trừu tượng.",
            "Khái niệm nào sau đây cho phép ẩn các chi tiết triển khai của một đối tượng khỏi thế giới bên ngoài?\n"
            + "\n"
            + "A. Đóng gói.\n"
            + "B. Kế thừa.\n"
            + "C. Đa hình.\n"
            + "D. Trừu tượng.",
            "Phương thức nào được sử dụng để khởi tạo một đối tượng trong Python?\n"
            + "\n"
            + "A. __init__().\n"
            + "B. __new__().\n"
            + "C. __del__().\n"
            + "D. __str__().",
            "Phương thức nào được sử dụng để tạo ra một đối tượng mới trong Python?\n"
            + "\n"
            + "A. __init__().\n"
            + "B. __new__().\n"
            + "C. __del__().\n"
            + "D. __str__().",
            "Phương thức nào được sử dụng để hủy một đối tượng trong Python?\n"
            + "\n"
            + "A. __init__().\n"
            + "B. __new__().\n"
            + "C. __del__().\n"
            + "D. __str__().",});

        TITLE_MAP.put("Đọc/ghi file CSV", new String[]{
            "Thư viện nào được sử dụng để đọc và ghi file CSV trong Python?\n"
            + "\n"
            + "A. csv.\n"
            + "B. json.\n"
            + "C. xml.\n"
            + "D. pickle.",
            "Phương thức nào được sử dụng để đọc dữ liệu từ file CSV trong Python?\n"
            + "\n"
            + "A. read().\n"
            + "B. reader().\n"
            + "C. load().\n"
            + "D. parse().",
            "Phương thức nào được sử dụng để ghi dữ liệu vào file CSV trong Python?\n"
            + "\n"
            + "A. write().\n"
            + "B. writer().\n"
            + "C. dump().\n"
            + "D. format().",
            "Phương thức nào được sử dụng để đọc dữ liệu từ file CSV dưới dạng dictionary trong Python?\n"
            + "\n"
            + "A. DictReader().\n"
            + "B. reader().\n"
            + "C. load().\n"
            + "D. parse().",
            "Phương thức nào được sử dụng để ghi dữ liệu vào file CSV dưới dạng dictionary trong Python?\n"
            + "\n"
            + "A. DictWriter().\n"
            + "B. writer().\n"
            + "C. dump().\n"
            + "D. format().",
            "Tham số nào được sử dụng để chỉ định dấu phân tách trong file CSV trong Python?\n"
            + "\n"
            + "A. delimiter.\n"
            + "B. quotechar.\n"
            + "C. quoting.\n"
            + "D. Tất cả các đáp án trên.",
            "Tham số nào được sử dụng để chỉ định ký tự bao quanh các trường trong file CSV trong Python?\n"
            + "\n"
            + "A. delimiter.\n"
            + "B. quotechar.\n"
            + "C. quoting.\n"
            + "D. Tất cả các đáp án trên.",
            "Tham số nào được sử dụng để chỉ định cách xử lý các trường có ký tự bao quanh trong file CSV trong Python?\n"
            + "\n"
            + "A. delimiter.\n"
            + "B. quotechar.\n"
            + "C. quoting.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương thức nào được sử dụng để đọc dữ liệu từ file CSV dưới dạng một danh sách các danh sách trong Python?\n"
            + "\n"
            + "A. reader().\n"
            + "B. DictReader().\n"
            + "C. load().\n"
            + "D. parse().",
            "Phương thức nào được sử dụng để ghi dữ liệu vào file CSV từ một danh sách các danh sách trong Python?\n"
            + "\n"
            + "A. writer().\n"
            + "B. DictWriter().\n"
            + "C. dump().\n"
            + "D. format().",});

        TITLE_MAP.put("JSON", new String[]{
            "JSON là viết tắt của cụm từ nào?\n"
            + "\n"
            + "A. JavaScript Object Notation.\n"
            + "B. Java Script Output Node.\n"
            + "C. JavaScript Oriented Network.\n"
            + "D. Java Standard Object Name.",
            "Thư viện nào được sử dụng để làm việc với JSON trong Python?\n"
            + "\n"
            + "A. csv.\n"
            + "B. json.\n"
            + "C. xml.\n"
            + "D. pickle.",
            "Phương thức nào được sử dụng để đọc dữ liệu từ file JSON trong Python?\n"
            + "\n"
            + "A. read().\n"
            + "B. load().\n"
            + "C. parse().\n"
            + "D. format().",
            "Phương thức nào được sử dụng để ghi dữ liệu vào file JSON trong Python?\n"
            + "\n"
            + "A. write().\n"
            + "B. dump().\n"
            + "C. format().\n"
            + "D. stringify().",
            "Kiểu dữ liệu nào sau đây không được hỗ trợ trong JSON?\n"
            + "\n"
            + "A. Số.\n"
            + "B. Chuỗi.\n"
            + "C. Tuple.\n"
            + "D. Boolean.",
            "Phương thức nào được sử dụng để chuyển đổi dữ liệu Python thành chuỗi JSON?\n"
            + "\n"
            + "A. dumps().\n"
            + "B. loads().\n"
            + "C. parse().\n"
            + "D. format().",
            "Phương thức nào được sử dụng để chuyển đổi chuỗi JSON thành dữ liệu Python?\n"
            + "\n"
            + "A. dumps().\n"
            + "B. loads().\n"
            + "C. parse().\n"
            + "D. format().",
            "Tham số nào được sử dụng để định dạng chuỗi JSON cho dễ đọc trong Python?\n"
            + "\n"
            + "A. indent.\n"
            + "B. separators.\n"
            + "C. sort_keys.\n"
            + "D. Tất cả các đáp án trên.",
            "Tham số nào được sử dụng để chỉ định ký tự phân tách key-value và item trong chuỗi JSON trong Python?\n"
            + "\n"
            + "A. indent.\n"
            + "B. separators.\n"
            + "C. sort_keys.\n"
            + "D. Tất cả các đáp án trên.",
            "Tham số nào được sử dụng để sắp xếp các key trong chuỗi JSON trong Python?\n"
            + "\n"
            + "A. indent.\n"
            + "B. separators.\n"
            + "C. sort_keys.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("XML", new String[]{
            "XML là viết tắt của cụm từ nào?\n"
            + "\n"
            + "A. Extensible Markup Language.\n"
            + "B. Extended Machine Language.\n"
            + "C. External Memory Location.\n"
            + "D. Executable Module Linker.",
            "Thư viện nào được sử dụng để làm việc với XML trong Python?\n"
            + "\n"
            + "A. csv.\n"
            + "B. json.\n"
            + "C. xml.etree.ElementTree.\n"
            + "D. pickle.",
            "Phương thức nào được sử dụng để đọc dữ liệu từ file XML trong Python?\n"
            + "\n"
            + "A. read().\n"
            + "B. parse().\n"
            + "C. load().\n"
            + "D. format().",
            "Phương thức nào được sử dụng để ghi dữ liệu vào file XML trong Python?\n"
            + "\n"
            + "A. write().\n"
            + "B. tostring().\n"
            + "C. dump().\n"
            + "D. format().",
            "Khái niệm nào sau đây được sử dụng để biểu diễn một phần tử XML trong Python?\n"
            + "\n"
            + "A. Element.\n"
            + "B. Attribute.\n"
            + "C. Tag.\n"
            + "D. Text.",
            "Phương thức nào được sử dụng để lấy tất cả các phần tử con của một phần tử XML trong Python?\n"
            + "\n"
            + "A. findall().\n"
            + "B. find().\n"
            + "C. get().\n"
            + "D. set().",
            "Phương thức nào được sử dụng để lấy phần tử con đầu tiên của một phần tử XML trong Python?\n"
            + "\n"
            + "A. findall().\n"
            + "B. find().\n"
            + "C. get().\n"
            + "D. set().",
            "Phương thức nào được sử dụng để lấy giá trị của một thuộc tính XML trong Python?\n"
            + "\n"
            + "A. findall().n"
            + "B. find().\n"
            + "C. get().\n"
            + "D. set().",
            "Phương thức nào được sử dụng để đặt giá trị của một thuộc tính XML trong Python?\n"
            + "\n"
            + "A. findall().\n"
            + "B. find().\n"
            + "C. get().\n"
            + "D. set().",
            "Phương thức nào được sử dụng để tạo một phần tử XML mới trong Python?\n"
            + "\n"
            + "A. Element().\n"
            + "B. SubElement().\n"
            + "C. fromstring().\n"
            + "D. tostring().",});

        TITLE_MAP.put("Try-except", new String[]{
            "Cấu trúc nào được sử dụng để xử lý ngoại lệ trong Python?\n"
            + "\n"
            + "A. if-else.\n"
            + "B. for loop.\n"
            + "C. while loop.\n"
            + "D. try-except.",
            "Khối mã nào được sử dụng để chứa mã có thể gây ra ngoại lệ trong Python?\n"
            + "\n"
            + "A. try.\n"
            + "B. except.\n"
            + "C. else.\n"
            + "D. finally.",
            "Khối mã nào được sử dụng để xử lý ngoại lệ trong Python?\n"
            + "\n"
            + "A. try.\n"
            + "B. except.\n"
            + "C. else.\n"
            + "D. finally.",
            "Khối mã nào được sử dụng để chứa mã được thực thi nếu không có ngoại lệ nào xảy ra trong Python?\n"
            + "\n"
            + "A. try.\n"
            + "B. except.\n"
            + "C. else.\n"
            + "D. finally.",
            "Khối mã nào được sử dụng để chứa mã được thực thi bất kể có ngoại lệ xảy ra hay không trong Python?\n"
            + "\n"
            + "A. try.\n"
            + "B. except.\n"
            + "C. else.\n"
            + "D. finally.",
            "Từ khóa nào được sử dụng để bắt một loại ngoại lệ cụ thể trong Python?\n"
            + "\n"
            + "A. except.\n"
            + "B. catch.\n"
            + "C. handle.\n"
            + "D. rescue.",
            "Từ khóa nào được sử dụng để bắt tất cả các loại ngoại lệ trong Python?\n"
            + "\n"
            + "A. except.\n"
            + "B. catch.\n"
            + "C. handle.\n"
            + "D. rescue.",
            "Từ khóa nào được sử dụng để nâng cao một ngoại lệ trong Python?\n"
            + "\n"
            + "A. raise.\n"
            + "B. throw.\n"
            + "C. signal.\n"
            + "D. trigger.",
            "Phương thức nào được sử dụng để lấy thông tin về một ngoại lệ trong Python?\n"
            + "\n"
            + "A. traceback.format_exc().\n"
            + "B. sys.exc_info().\n"
            + "C. logging.exception().\n"
            + "D. Tất cả các đáp án trên.",
            "Phương thức nào được sử dụng để ghi thông tin về một ngoại lệ vào nhật ký trong Python?\n"
            + "\n"
            + "A. traceback.format_exc().\n"
            + "B. sys.exc_info().\n"
            + "C. logging.exception().\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Finally", new String[]{
            "Khối mã `finally` trong Python được thực thi khi nào?\n"
            + "\n"
            + "A. Chỉ khi ngoại lệ xảy ra.\n"
            + "B. Chỉ khi không có ngoại lệ xảy ra.\n"
            + "C. Bất kể có ngoại lệ xảy ra hay không.\n"
            + "D. Chỉ khi có lỗi cú pháp.",
            "Khối mã `finally` thường được sử dụng để làm gì trong Python?\n"
            + "\n"
            + "A. Xử lý ngoại lệ.\n"
            + "B. Giải phóng tài nguyên.\n"
            + "C. Ghi nhật ký.\n"
            + "D. Tất cả các đáp án trên.",
            "Khối mã `finally` có thể được sử dụng mà không cần khối mã `except` không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi có khối mã `else`.\n"
            + "D. Chỉ khi có khối mã `try`.",
            "Nếu một ngoại lệ được nâng cao trong khối mã `finally`, điều gì sẽ xảy ra?\n"
            + "\n"
            + "A. Ngoại lệ bị bỏ qua.\n"
            + "B. Ngoại lệ được xử lý bởi khối mã `except` gần nhất.\n"
            + "C. Ngoại lệ được truyền lên cho trình gọi.\n"
            + "D. Chương trình bị dừng.",
            "Khối mã `finally` được thực thi trước hay sau khối mã `except` trong Python?\n"
            + "\n"
            + "A. Trước.\n"
            + "B. Sau.\n"
            + "C. Đồng thời.\n"
            + "D. Tùy thuộc vào loại ngoại lệ.",
            "Khối mã `finally` có thể được sử dụng với câu lệnh `return` không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi câu lệnh `return` nằm trong khối mã `try`.\n"
            + "D. Chỉ khi câu lệnh `return` nằm trong khối mã `except`.",
            "Khối mã `finally` có thể được sử dụng với câu lệnh `break` không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi câu lệnh `break` nằm trong vòng lặp `for`.\n"
            + "D. Chỉ khi câu lệnh `break` nằm trong vòng lặp `while`.",
            "Khối mã `finally` có thể được sử dụng với câu lệnh `continue` không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi câu lệnh `continue` nằm trong vòng lặp `for`.\n"
            + "D. Chỉ khi câu lệnh `continue` nằm trong vòng lặp `while`.",
            "Khối mã `finally` có thể được sử dụng với câu lệnh `exit()` không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi câu lệnh `exit()` nằm trong khối mã `try`.\n"
            + "D. Chỉ khi câu lệnh `exit()` nằm trong khối mã `except`.",
            "Khối mã `finally` có thể được sử dụng với câu lệnh `yield` không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi câu lệnh `yield` nằm trong hàm generator.\n"
            + "D. Không liên quan.",});

        TITLE_MAP.put("Tạo ngoại lệ tùy chỉnh", new String[]{
            "Lớp nào được sử dụng để tạo ngoại lệ tùy chỉnh trong Python?\n"
            + "\n"
            + "A. Exception.\n"
            + "B. Error.\n"
            + "C. Warning.\n"
            + "D. BaseException.",
            "Ngoại lệ tùy chỉnh nên được tạo ra khi nào trong Python?\n"
            + "\n"
            + "A. Khi có lỗi cú pháp.\n"
            + "B. Khi có lỗi logic.\n"
            + "C. Khi có lỗi thời gian chạy.\n"
            + "D. Khi có lỗi không thể xử lý bằng các ngoại lệ tích hợp.",
            "Ngoại lệ tùy chỉnh có thể được sử dụng để làm gì trong Python?\n"
            + "\n"
            + "A. Báo hiệu lỗi cho người dùng.\n"
            + "B. Cung cấp thông tin chi tiết về lỗi.\n"
            + "C. Xử lý lỗi một cách tùy chỉnh.\n"
            + "D. Tất cả các đáp án trên.",
            "Ngoại lệ tùy chỉnh có thể được kế thừa từ lớp nào trong Python?\n"
            + "\n"
            + "A. Exception.\n"
            + "B. BaseException.\n"
            + "C. ArithmeticError.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương thức nào được sử dụng để khởi tạo một ngoại lệ tùy chỉnh trong Python?\n"
            + "\n"
            + "A. __init__().\n"
            + "B. __new__().\n"
            + "C. __del__().\n"
            + "D. __str__().",
            "Phương thức nào được sử dụng để lấy thông báo lỗi của một ngoại lệ tùy chỉnh trong Python?\n"
            + "\n"
            + "A. __init__().\n"
            + "B. __new__().\n"
            + "C. __del__().\n"
            + "D. __str__().",
            "Ngoại lệ tùy chỉnh có thể có thuộc tính không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi kế thừa từ lớp `Exception`.\n"
            + "D. Chỉ khi kế thừa từ lớp `BaseException`.",
            "Ngoại lệ tùy chỉnh có thể có phương thức không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi kế thừa từ lớp `Exception`.\n"
            + "D. Chỉ khi kế thừa từ lớp `BaseException`.",
            "Ngoại lệ tùy chỉnh có thể được sử dụng trong khối mã `try-except` không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi được bắt bằng lớp cha.\n"
            + "D. Chỉ khi được bắt bằng lớp con.",
            "Ngoại lệ tùy chỉnh có thể được nâng cao bằng từ khóa nào trong Python?\n"
            + "\n"
            + "A. raise.\n"
            + "B. throw.\n"
            + "C. signal.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Lập trình đa luồng", new String[]{
            "Thư viện nào được sử dụng để lập trình đa luồng trong Python?\n"
            + "\n"
            + "A. threading.\n"
            + "B. multiprocessing.\n"
            + "C. asyncio.\n"
            + "D. subprocess.",
            "Luồng là gì trong Python?\n"
            + "\n"
            + "A. Một tiến trình độc lập.\n"
            + "B. Một đơn vị thực thi nhỏ nhất trong một tiến trình.\n"
            + "C. Một thư viện để lập trình bất đồng bộ.\n"
            + "D. Một phương thức để tạo ra các tiến trình con.",
            "Luồng có thể chia sẻ bộ nhớ với các luồng khác trong cùng một tiến trình không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ khi sử dụng khóa.\n"
            + "D. Chỉ khi sử dụng hàng đợi.",
            "Khóa (lock) được sử dụng để làm gì trong lập trình đa luồng Python?\n"
            + "\n"
            + "A. Ngăn chặn các luồng truy cập vào cùng một tài nguyên cùng lúc.\n"
            + "B. Tạo ra các luồng mới.\n"
            + "C. Đồng bộ hóa các luồng.\n"
            + "D. Tất cả các đáp án trên.",
            "Hàng đợi (queue) được sử dụng để làm gì trong lập trình đa luồng Python?\n"
            + "\n"
            + "A. Truyền dữ liệu giữa các luồng.\n"
            + "B. Tạo ra các luồng mới.\n"
            + "C. Đồng bộ hóa các luồng.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều kiện (condition) được sử dụng để làm gì trong lập trình đa luồng Python?\n"
            + "\n"
            + "A. Đồng bộ hóa các luồng dựa trên một điều kiện.\n"
            + "B. Tạo ra các luồng mới.\n"
            + "C. Truyền dữ liệu giữa các luồng.\n"
            + "D. Tất cả các đáp án trên.",
            "Sự kiện (event) được sử dụng để làm gì trong lập trình đa luồng Python?\n"
            + "\n"
            + "A. Báo hiệu cho các luồng về một sự kiện đã xảy ra.\n"
            + "B. Tạo ra các luồng mới.\n"
            + "C. Truyền dữ liệu giữa các luồng.\n"
            + "D. Tất cả các đáp án trên.",
            "Semaphore được sử dụng để làm gì trong lập trình đa luồng Python?\n"
            + "\n"
            + "A. Kiểm soát số lượng luồng truy cập vào một tài nguyên cùng lúc.\n"
            + "B. Tạo ra các luồng mới.\n"
            + "C. Truyền dữ liệu giữa các luồng.\n"
            + "D. Tất cả các đáp án trên.",
            "Rào cản (barrier) được sử dụng để làm gì trong lập trình đa luồng Python?\n"
            + "\n"
            + "A. Đồng bộ hóa các luồng tại một điểm cụ thể.\n"
            + "B. Tạo ra các luồng mới.\n"
            + "C. Truyền dữ liệu giữa các luồng.\n"
            + "D. Tất cả các đáp án trên.",
            "Pool được sử dụng để làm gì trong lập trình đa luồng Python?\n"
            + "\n"
            + "A. Quản lý một nhóm các luồng.\n"
            + "B. Tạo ra các luồng mới.\n"
            + "C. Truyền dữ liệu giữa các luồng.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Bất đồng bộ", new String[]{
            "Thư viện nào được sử dụng để lập trình bất đồng bộ trong Python?\n"
            + "\n"
            + "A. threading.\n"
            + "B. multiprocessing.\n"
            + "C. asyncio.\n"
            + "D. subprocess.",
            "Lập trình bất đồng bộ là gì trong Python?\n"
            + "\n"
            + "A. Lập trình đa luồng.\n"
            + "B. Lập trình đa tiến trình.\n"
            + "C. Lập trình cho phép thực hiện nhiều tác vụ cùng lúc mà không cần chờ đợi.\n"
            + "D. Lập trình tuần tự.",
            "Coroutines là gì trong lập trình bất đồng bộ Python?\n"
            + "\n"
            + "A. Các luồng.\n"
            + "B. Các tiến trình.\n"
            + "C. Các hàm có thể tạm dừng và tiếp tục thực thi.\n"
            + "D. Các chương trình độc lập.",
            "Event loop là gì trong lập trình bất đồng bộ Python?\n"
            + "\n"
            + "A. Một vòng lặp vô hạn.\n"
            + "B. Một vòng lặp để quản lý các coroutines.\n"
            + "C. Một hàng đợi để truyền dữ liệu giữa các coroutines.\n"
            + "D. Một bộ nhớ chia sẻ giữa các coroutines.",
            "Async/await được sử dụng để làm gì trong lập trình bất đồng bộ Python?\n"
            + "\n"
            + "A. Tạo ra các luồng.\n"
            + "B. Tạo ra các tiến trình.\n"
            + "C. Tạo ra các coroutines.\n"
            + "D. Tạo ra các event loop.",
            "Task được sử dụng để làm gì trong lập trình bất đồng bộ Python?\n"
            + "\n"
            + "A. Đại diện cho một coroutine đang chạy.\n"
            + "B. Tạo ra các luồng.\n"
            + "C. Tạo ra các tiến trình.\n"
            + "D. Tạo ra các event loop.",
            "Future được sử dụng để làm gì trong lập trình bất đồng bộ Python?\n"
            + "\n"
            + "A. Đại diện cho kết quả của một coroutine.\n"
            + "B. Tạo ra các luồng.\n"
            + "C. Tạo ra các tiến trình.\n"
            + "D. Tạo ra các event loop.",
            "Gather được sử dụng để làm gì trong lập trình bất đồng bộ Python?\n"
            + "\n"
            + "A. Chờ đợi cho nhiều coroutines hoàn thành cùng lúc.\n"
            + "B. Tạo ra các luồng.\n"
            + "C. Tạo ra các tiến trình.\n"
            + "D. Tạo ra các event loop.",
            "Timeout được sử dụng để làm gì trong lập trình bất đồng bộ Python?\n"
            + "\n"
            + "A. Hủy bỏ một coroutine nếu nó chạy quá lâu.\n"
            + "B. Tạo ra các luồng.\n"
            + "C. Tạo ra các tiến trình.\n"
            + "D. Tạo ra các event loop.",
            "Semaphore được sử dụng để làm gì trong lập trình bất đồng bộ Python?\n"
            + "\n"
            + "A. Kiểm soát số lượng coroutines truy cập vào một tài nguyên cùng lúc.\n"
            + "B. Tạo ra các luồng.\n"
            + "C. Tạo ra các tiến trình.\n"
            + "D. Tạo ra các event loop.",});
        TITLE_MAP.put("Requests", new String[]{
            "Thư viện nào được sử dụng để gửi yêu cầu HTTP trong Python?\n"
            + "\n"
            + "A. urllib.\n"
            + "B. requests.\n"
            + "C. http.\n"
            + "D. socket.",
            "Phương thức nào được sử dụng để gửi yêu cầu GET trong thư viện Requests?\n"
            + "\n"
            + "A. get().\n"
            + "B. post().\n"
            + "C. put().\n"
            + "D. delete().",
            "Phương thức nào được sử dụng để gửi yêu cầu POST trong thư viện Requests?\n"
            + "\n"
            + "A. get().\n"
            + "B. post().\n"
            + "C. put().\n"
            + "D. delete().",
            "Phương thức nào được sử dụng để gửi yêu cầu PUT trong thư viện Requests?\n"
            + "\n"
            + "A. get().\n"
            + "B. post().\n"
            + "C. put().\n"
            + "D. delete().",
            "Phương thức nào được sử dụng để gửi yêu cầu DELETE trong thư viện Requests?\n"
            + "\n"
            + "A. get().\n"
            + "B. post().\n"
            + "C. put().\n"
            + "D. delete().",
            "Thuộc tính nào được sử dụng để lấy mã trạng thái HTTP từ phản hồi trong thư viện Requests?\n"
            + "\n"
            + "A. status_code.\n"
            + "B. content.\n"
            + "C. text.\n"
            + "D. json().",
            "Thuộc tính nào được sử dụng để lấy nội dung phản hồi dạng byte trong thư viện Requests?\n"
            + "\n"
            + "A. status_code.\n"
            + "B. content.\n"
            + "C. text.\n"
            + "D. json().",
            "Thuộc tính nào được sử dụng để lấy nội dung phản hồi dạng chuỗi Unicode trong thư viện Requests?\n"
            + "\n"
            + "A. status_code.\n"
            + "B. content.\n"
            + "C. text.\n"
            + "D. json().",
            "Phương thức nào được sử dụng để lấy nội dung phản hồi dạng JSON trong thư viện Requests?\n"
            + "\n"
            + "A. status_code.\n"
            + "B. content.\n"
            + "C. text.\n"
            + "D. json().",
            "Tham số nào được sử dụng để truyền dữ liệu trong yêu cầu POST trong thư viện Requests?\n"
            + "\n"
            + "A. params.\n"
            + "B. data.\n"
            + "C. headers.\n"
            + "D. cookies.",});

        TITLE_MAP.put("BeautifulSoup", new String[]{
            "Thư viện nào được sử dụng để phân tích cú pháp HTML và XML trong Python?\n"
            + "\n"
            + "A. re.\n"
            + "B. BeautifulSoup.\n"
            + "C. lxml.\n"
            + "D. cssselect.",
            "Phương thức nào được sử dụng để tìm một phần tử HTML đầu tiên phù hợp với tiêu chí trong BeautifulSoup?\n"
            + "\n"
            + "A. find().\n"
            + "B. find_all().\n"
            + "C. select_one().\n"
            + "D. select().",
            "Phương thức nào được sử dụng để tìm tất cả các phần tử HTML phù hợp với tiêu chí trong BeautifulSoup?\n"
            + "\n"
            + "A. find().\n"
            + "B. find_all().\n"
            + "C. select_one().\n"
            + "D. select().",
            "Phương thức nào được sử dụng để tìm một phần tử HTML đầu tiên phù hợp với bộ chọn CSS trong BeautifulSoup?\n"
            + "\n"
            + "A. find().\n"
            + "B. find_all().\n"
            + "C. select_one().\n"
            + "D. select().",
            "Phương thức nào được sử dụng để tìm tất cả các phần tử HTML phù hợp với bộ chọn CSS trong BeautifulSoup?\n"
            + "\n"
            + "A. find().\n"
            + "B. find_all().\n"
            + "C. select_one().\n"
            + "D. select().",
            "Thuộc tính nào được sử dụng để lấy tên thẻ HTML của một phần tử trong BeautifulSoup?\n"
            + "\n"
            + "A. name.\n"
            + "B. text.\n"
            + "C. attrs.\n"
            + "D. string.",
            "Thuộc tính nào được sử dụng để lấy nội dung văn bản của một phần tử trong BeautifulSoup?\n"
            + "\n"
            + "A. name.\n"
            + "B. text.\n"
            + "C. attrs.\n"
            + "D. string.",
            "Thuộc tính nào được sử dụng để lấy các thuộc tính của một phần tử trong BeautifulSoup?\n"
            + "\n"
            + "A. name.\n"
            + "B. text.\n"
            + "C. attrs.\n"
            + "D. string.",
            "Phương thức nào được sử dụng để lấy phần tử cha của một phần tử trong BeautifulSoup?\n"
            + "\n"
            + "A. parent.\n"
            + "B. find_parent().\n"
            + "C. find_parents().\n"
            + "D. next_sibling.",
            "Phương thức nào được sử dụng để lấy các phần tử cha của một phần tử trong BeautifulSoup?\n"
            + "\n"
            + "A. parent.\n"
            + "B. find_parent().\n"
            + "C. find_parents().\n"
            + "D. next_sibling.",});

        TITLE_MAP.put("Selenium", new String[]{
            "Thư viện nào được sử dụng để tự động hóa trình duyệt web trong Python?\n"
            + "\n"
            + "A. requests.\n"
            + "B. BeautifulSoup.\n"
            + "C. Selenium.\n"
            + "D. urllib.",
            "Phương thức nào được sử dụng để mở một trang web trong Selenium?\n"
            + "\n"
            + "A. get().\n"
            + "B. open().\n"
            + "C. navigate().\n"
            + "D. load().",
            "Phương thức nào được sử dụng để tìm một phần tử HTML đầu tiên phù hợp với tiêu chí trong Selenium?\n"
            + "\n"
            + "A. find_element().\n"
            + "B. find_elements().\n"
            + "C. select_one().\n"
            + "D. select().",
            "Phương thức nào được sử dụng để tìm tất cả các phần tử HTML phù hợp với tiêu chí trong Selenium?\n"
            + "\n"
            + "A. find_element().n"
            + "B. find_elements().\n"
            + "C. select_one().\n"
            + "D. select().",
            "Phương thức nào được sử dụng để nhập văn bản vào một phần tử đầu vào trong Selenium?\n"
            + "\n"
            + "A. send_keys().\n"
            + "B. set_value().\n"
            + "C. type().\n"
            + "D. input().",
            "Phương thức nào được sử dụng để nhấp vào một phần tử trong Selenium?\n"
            + "\n"
            + "A. click().\n"
            + "B. press().\n"
            + "C. activate().\n"
            + "D. trigger().",
            "Phương thức nào được sử dụng để lấy thuộc tính của một phần tử trong Selenium?\n"
            + "\n"
            + "A. get_attribute().\n"
            + "B. get_property().\n"
            + "C. get_value().\n"
            + "D. get().",
            "Phương thức nào được sử dụng để lấy văn bản của một phần tử trong Selenium?\n"
            + "\n"
            + "A. text().\n"
            + "B. get_text().\n"
            + "C. content().\n"
            + "D. inner_html().",
            "Phương thức nào được sử dụng để chuyển đổi sang một iframe trong Selenium?\n"
            + "\n"
            + "A. switch_to.frame().\n"
            + "B. switch_to.window().\n"
            + "C. switch_to.alert().\n"
            + "D. switch_to.parent_frame().",
            "Phương thức nào được sử dụng để chuyển đổi sang một cửa sổ mới trong Selenium?\n"
            + "\n"
            + "A. switch_to.frame().\n"
            + "B. switch_to.window().\n"
            + "C. switch_to.alert().\n"
            + "D. switch_to.parent_frame().",});

        TITLE_MAP.put("SQLite", new String[]{
            "Thư viện nào được sử dụng để làm việc với SQLite trong Python?\n"
            + "\n"
            + "A. sqlite3.\n"
            + "B. mysql.connector.\n"
            + "C. psycopg2.\n"
            + "D. sqlalchemy.",
            "Phương thức nào được sử dụng để kết nối đến cơ sở dữ liệu SQLite trong Python?\n"
            + "\n"
            + "A. connect().\n"
            + "B. create_engine().\n"
            + "C. open().\n"
            + "D. get_connection().",
            "Phương thức nào được sử dụng để tạo một con trỏ (cursor) trong Python SQLite?\n"
            + "\n"
            + "A. cursor().\n"
            + "B. create_cursor().\n"
            + "C. get_cursor().\n"
            + "D. execute().",
            "Phương thức nào được sử dụng để thực thi một truy vấn SQL trong Python SQLite?\n"
            + "\n"
            + "A. execute().\n"
            + "B. query().\n"
            + "C. run().\n"
            + "D. sql().",
            "Phương thức nào được sử dụng để lấy tất cả các hàng từ kết quả truy vấn trong Python SQLite?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lấy một hàng từ kết quả truy vấn trong Python SQLite?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lấy một số hàng từ kết quả truy vấn trong Python SQLite?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lưu các thay đổi vào cơ sở dữ liệu SQLite trong Python?\n"
            + "\n"
            + "A. commit().\n"
            + "B. save().\n"
            + "C. apply().\n"
            + "D. update().",
            "Phương thức nào được sử dụng để hủy các thay đổi trong cơ sở dữ liệu SQLite trong Python?\n"
            + "\n"
            + "A. rollback().\n"
            + "B. revert().\n"
            + "C. cancel().\n"
            + "D. undo().",
            "Phương thức nào được sử dụng để đóng kết nối đến cơ sở dữ liệu SQLite trong Python?\n"
            + "\n"
            + "A. close().\n"
            + "B. disconnect().\n"
            + "C. stop().\n"
            + "D. exit().",});

        TITLE_MAP.put("MySQL", new String[]{
            "Thư viện nào được sử dụng để làm việc với MySQL trong Python?\n"
            + "\n"
            + "A. sqlite3.\n"
            + "B. mysql.connector.\n"
            + "C. psycopg2.\n"
            + "D. sqlalchemy.",
            "Phương thức nào được sử dụng để kết nối đến cơ sở dữ liệu MySQL trong Python?\n"
            + "\n"
            + "A. connect().\n"
            + "B. create_engine().\n"
            + "C. open().\n"
            + "D. get_connection().",
            "Phương thức nào được sử dụng để tạo một con trỏ (cursor) trong Python MySQL?\n"
            + "\n"
            + "A. cursor().\n"
            + "B. create_cursor().\n"
            + "C. get_cursor().\n"
            + "D. execute().",
            "Phương thức nào được sử dụng để thực thi một truy vấn SQL trong Python MySQL?\n"
            + "\n"
            + "A. execute().\n"
            + "B. query().\n"
            + "C. run().\n"
            + "D. sql().",
            "Phương thức nào được sử dụng để lấy tất cả các hàng từ kết quả truy vấn trong Python MySQL?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lấy một hàng từ kết quả truy vấn trong Python MySQL?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lấy một số hàng từ kết quả truy vấn trong Python MySQL?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lưu các thay đổi vào cơ sở dữ liệu MySQL trong Python?\n"
            + "\n"
            + "A. commit().\n"
            + "B. save().\n"
            + "C. apply().\n"
            + "D. update().",
            "Phương thức nào được sử dụng để hủy các thay đổi trong cơ sở dữ liệu MySQL trong Python?\n"
            + "\n"
            + "A. rollback().\n"
            + "B. revert().\n"
            + "C. cancel().\n"
            + "D. undo().",
            "Phương thức nào được sử dụng để đóng kết nối đến cơ sở dữ liệu MySQL trong Python?\n"
            + "\n"
            + "A. close().\n"
            + "B. disconnect().\n"
            + "C. stop().\n"
            + "D. exit().",});

        TITLE_MAP.put("PostgreSQL", new String[]{
            "Thư viện nào được sử dụng để làm việc với PostgreSQL trong Python?\n"
            + "\n"
            + "A. sqlite3.\n"
            + "B. mysql.connector.\n"
            + "C. psycopg2.\n"
            + "D. sqlalchemy.",
            "Phương thức nào được sử dụng để kết nối đến cơ sở dữ liệu PostgreSQL trong Python?\n"
            + "\n"
            + "A. connect().\n"
            + "B. create_engine().\n"
            + "C. open().\n"
            + "D. get_connection().",
            "Phương thức nào được sử dụng để tạo một con trỏ (cursor) trong Python PostgreSQL?\n"
            + "\n"
            + "A. cursor().\n"
            + "B. create_cursor().\n"
            + "C. get_cursor().\n"
            + "D. execute().",
            "Phương thức nào được sử dụng để thực thi một truy vấn SQL trong Python PostgreSQL?\n"
            + "\n"
            + "A. execute().\n"
            + "B. query().\n"
            + "C. run().\n"
            + "D. sql().",
            "Phương thức nào được sử dụng để lấy tất cả các hàng từ kết quả truy vấn trong Python PostgreSQL?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lấy một hàng từ kết quả truy vấn trong Python PostgreSQL?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lấy một số hàng từ kết quả truy vấn trong Python PostgreSQL?\n"
            + "\n"
            + "A. fetchall().\n"
            + "B. fetchone().\n"
            + "C. fetchmany().\n"
            + "D. get_result().",
            "Phương thức nào được sử dụng để lưu các thay đổi vào cơ sở dữ liệu PostgreSQL trong Python?\n"
            + "\n"
            + "A. commit().\n"
            + "B. save().\n"
            + "C. apply().\n"
            + "D. update().",
            "Phương thức nào được sử dụng để hủy các thay đổi trong cơ sở dữ liệu PostgreSQL trong Python?\n"
            + "\n"
            + "A. rollback().\n"
            + "B. revert().\n"
            + "C. cancel().\n"
            + "D. undo().",
            "Phương thức nào được sử dụng để đóng kết nối đến cơ sở dữ liệu PostgreSQL trong Python?\n"
            + "\n"
            + "A. close().\n"
            + "B. disconnect().\n"
            + "C. stop().\n"
            + "D. exit().",});

        TITLE_MAP.put("ORM với SQLAlchemy", new String[]{
            "Thư viện nào được sử dụng để làm việc với ORM trong Python?\n"
            + "\n"
            + "A. sqlite3.\n"
            + "B. mysql.connector.\n"
            + "C. psycopg2.\n"
            + "D. sqlalchemy.",
            "Phương thức nào được sử dụng để tạo một engine kết nối đến cơ sở dữ liệu trong SQLAlchemy?\n"
            + "\n"
            + "A. connect().\n"
            + "B. create_engine().\n"
            + "C. open().\n"
            + "D. get_connection().",
            "Phương thức nào được sử dụng để tạo một session trong SQLAlchemy?\n"
            + "\n"
            + "A. session().\n"
            + "B. create_session().\n"
            + "C. get_session().\n"
            + "D. Session().",
            "Phương thức nào được sử dụng để truy vấn dữ liệu từ cơ sở dữ liệu trong SQLAlchemy?\n"
            + "\n"
            + "A. query().\n"
            + "B. select().\n"
            + "C. get().\n"
            + "D. find().",
            "Phương thức nào được sử dụng để thêm một đối tượng vào cơ sở dữ liệu trong SQLAlchemy?\n"
            + "\n"
            + "A. add().\n"
            + "B. insert().\n"
            + "C. create().\n"
            + "D. save().",
            "Phương thức nào được sử dụng để cập nhật một đối tượng trong cơ sở dữ liệu trong SQLAlchemy?\n"
            + "\n"
            + "A. update().\n"
            + "B. modify().\n"
            + "C. change().\n"
            + "D. edit().",
            "Phương thức nào được sử dụng để xóa một đối tượng khỏi cơ sở dữ liệu trong SQLAlchemy?\n"
            + "\n"
            + "A. delete().\n"
            + "B. remove().\n"
            + "C. drop().\n"
            + "D. erase().",
            "Phương thức nào được sử dụng để lưu các thay đổi vào cơ sở dữ liệu trong SQLAlchemy?\n"
            + "\n"
            + "A. commit().\n"
            + "B. save().\n"
            + "C. apply().\n"
            + "D. update().",
            "Phương thức nào được sử dụng để hủy các thay đổi trong cơ sở dữ liệu trong SQLAlchemy?\n"
            + "\n"
            + "A. rollback().\n"
            + "B. revert().\n"
            + "C. cancel().\n"
            + "D. undo().",
            "Phương thức nào được sử dụng để đóng session trong SQLAlchemy?\n"
            + "\n"
            + "A. close().\n"
            + "B. disconnect().\n"
            + "C. stop().\n"
            + "D. exit().",});

        TITLE_MAP.put("Pandas", new String[]{
            "Thư viện nào được sử dụng để phân tích và xử lý dữ liệu trong Python?\n"
            + "\n"
            + "A. numpy.\n"
            + "B. pandas.\n"
            + "C. matplotlib.\n"
            + "D. seaborn.",
            "Kiểu dữ liệu nào được sử dụng để biểu diễn dữ liệu một chiều trong Pandas?\n"
            + "\n"
            + "A. DataFrame.\n"
            + "B. Series.\n"
            + "C. Panel.\n"
            + "D. Index.",
            "Kiểu dữ liệu nào được sử dụng để biểu diễn dữ liệu hai chiều trong Pandas?\n"
            + "\n"
            + "A. DataFrame.\n"
            + "B. Series.\n"
            + "C. Panel.\n"
            + "D. Index.",
            "Phương thức nào được sử dụng để đọc dữ liệu từ file CSV trong Pandas?\n"
            + "\n"
            + "A. read_csv().\n"
            + "B. read_excel().\n"
            + "C. read_json().\n"
            + "D. read_sql().",
            "Phương thức nào được sử dụng để đọc dữ liệu từ file Excel trong Pandas?\n"
            + "\n"
            + "A. read_csv().\n"
            + "B. read_excel().\n"
            + "C. read_json().\n"
            + "D. read_sql().",
            "Phương thức nào được sử dụng để đọc dữ liệu từ file JSON trong Pandas?\n"
            + "\n"
            + "A. read_csv().\n"
            + "B. read_excel().\n"
            + "C. read_json().\n"
            + "D. read_sql().",
            "Phương thức nào được sử dụng để đọc dữ liệu từ cơ sở dữ liệu SQL trong Pandas?\n"
            + "\n"
            + "A. read_csv().\n"
            + "B. read_excel().\n"
            + "C. read_json().\n"
            + "D. read_sql().",
            "Phương thức nào được sử dụng để lấy thông tin thống kê mô tả của DataFrame trong Pandas?\n"
            + "\n"
            + "A. describe().\n"
            + "B. info().\n"
            + "C. head().\n"
            + "D. tail().",
            "Phương thức nào được sử dụng để lấy thông tin về kiểu dữ liệu và số lượng giá trị không null trong DataFrame trong Pandas?\n"
            + "\n"
            + "A. describe().\n"
            + "B. info().\n"
            + "C. head().\n"
            + "D. tail().",
            "Phương thức nào được sử dụng để lấy một số hàng đầu tiên của DataFrame trong Pandas?\n"
            + "\n"
            + "A. describe().\n"
            + "B. info().\n"
            + "C. head().\n"
            + "D. tail().",});

        TITLE_MAP.put("Numpy", new String[]{
            "Thư viện nào được sử dụng để tính toán số học trong Python?\n"
            + "\n"
            + "A. pandas.\n"
            + "B. numpy.\n"
            + "C. matplotlib.\n"
            + "D. seaborn.",
            "Kiểu dữ liệu nào được sử dụng để biểu diễn mảng đa chiều trong NumPy?\n"
            + "\n"
            + "A. DataFrame.\n"
            + "B. Series.\n"
            + "C. ndarray.\n"
            + "D. Index.",
            "Phương thức nào được sử dụng để tạo một mảng NumPy từ một danh sách Python?\n"
            + "\n"
            + "A. array().\n"
            + "B. asarray().\n"
            + "C. fromlist().\n"
            + "D. convert().",
            "Phương thức nào được sử dụng để tạo một mảng NumPy với các giá trị 0?\n"
            + "\n"
            + "A. zeros().\n"
            + "B. ones().\n"
            + "C. empty().\n"
            + "D. full().",
            "Phương thức nào được sử dụng để tạo một mảng NumPy với các giá trị 1?\n"
            + "\n"
            + "A. zeros().\n"
            + "B. ones().\n"
            + "C. empty().\n"
            + "D. full().",
            "Phương thức nào được sử dụng để tạo một mảng NumPy với các giá trị ngẫu nhiên?\n"
            + "\n"
            + "A. random().\n"
            + "B. rand().\n"
            + "C. randint().\n"
            + "D. random.rand().",
            "Phương thức nào được sử dụng để lấy hình dạng (shape) của một mảng NumPy?\n"
            + "\n"
            + "A. shape().\n"
            + "B. size().\n"
            + "C. ndim().\n"
            + "D. dtype().",
            "Phương thức nào được sử dụng để lấy số lượng phần tử trong một mảng NumPy?\n"
            + "\n"
            + "A. shape().\n"
            + "B. size().\n"
            + "C. ndim().\n"
            + "D. dtype().",
            "Phương thức nào được sử dụng để lấy số chiều của một mảng NumPy?\n"
            + "\n"
            + "A. shape().\n"
            + "B. size().\n"
            + "C. ndim().\n"
            + "D. dtype().",
            "Phương thức nào được sử dụng để lấy kiểu dữ liệu của các phần tử trong một mảng NumPy?\n"
            + "\n"
            + "A. shape().\n"
            + "B. size().\n"
            + "C. ndim().\n"
            + "D. dtype().",});

        TITLE_MAP.put("Matplotlib", new String[]{
            "Thư viện nào được sử dụng để vẽ biểu đồ trong Python?\n"
            + "\n"
            + "A. pandas.\n"
            + "B. numpy.\n"
            + "C. matplotlib.\n"
            + "D. seaborn.",
            "Phương thức nào được sử dụng để vẽ biểu đồ đường trong Matplotlib?\n"
            + "\n"
            + "A. plot().\n"
            + "B. bar().\n"
            + "C. scatter().\n"
            + "D. hist().",
            "Phương thức nào được sử dụng để vẽ biểu đồ cột trong Matplotlib?\n"
            + "\n"
            + "A. plot().\n"
            + "B. bar().\n"
            + "C. scatter().\n"
            + "D. hist().",
            "Phương thức nào được sử dụng để vẽ biểu đồ phân tán trong Matplotlib?\n"
            + "\n"
            + "A. plot().\n"
            + "B. bar().\n"
            + "C. scatter().\n"
            + "D. hist().",
            "Phương thức nào được sử dụng để vẽ biểu đồ histogram trong Matplotlib?\n"
            + "\n"
            + "A. plot().\n"
            + "B. bar().\n"
            + "C. scatter().\n"
            + "D. hist().",
            "Phương thức nào được sử dụng để thêm tiêu đề cho biểu đồ trong Matplotlib?\n"
            + "\n"
            + "A. title().\n"
            + "B. xlabel().\n"
            + "C. ylabel().\n"
            + "D. legend().",
            "Phương thức nào được sử dụng để thêm nhãn cho trục x trong Matplotlib?\n"
            + "\n"
            + "A. title().\n"
            + "B. xlabel().\n"
            + "C. ylabel().\n"
            + "D. legend().",
            "Phương thức nào được sử dụng để thêm nhãn cho trục y trong Matplotlib?\n"
            + "\n"
            + "A. title().\n"
            + "B. xlabel().\n"
            + "C. ylabel().\n"
            + "D. legend().",
            "Phương thức nào được sử dụng để thêm chú thích cho biểu đồ trong Matplotlib?\n"
            + "\n"
            + "A. title().\n"
            + "B. xlabel().\n"
            + "C. ylabel().\n"
            + "D. legend().",
            "Phương thức nào được sử dụng để hiển thị biểu đồ trong Matplotlib?\n"
            + "\n"
            + "A. show().\n"
            + "B. display().\n"
            + "C. render().\n"
            + "D. plot().",});

        TITLE_MAP.put("Socket", new String[]{
            "Thư viện nào được sử dụng để làm việc với socket trong Python?\n"
            + "\n"
            + "A. socket.\n"
            + "B. urllib.\n"
            + "C. requests.\n"
            + "D. http.",
            "Phương thức nào được sử dụng để tạo một socket trong Python?\n"
            + "\n"
            + "A. socket().\n"
            + "B. create().\n"
            + "C. new().\n"
            + "D. open().",
            "Phương thức nào được sử dụng để liên kết một socket với một địa chỉ và cổng trong Python?\n"
            + "\n"
            + "A. bind().\n"
            + "B. connect().\n"
            + "C. listen().\n"
            + "D. accept().",
            "Phương thức nào được sử dụng để lắng nghe các kết nối đến trên một socket trong Python?\n"
            + "\n"
            + "A. bind().\n"
            + "B. connect().\n"
            + "C. listen().\n"
            + "D. accept().",
            "Phương thức nào được sử dụng để chấp nhận một kết nối đến trên một socket trong Python?\n"
            + "\n"
            + "A. bind().\n"
            + "B. connect().\n"
            + "C. listen().\n"
            + "D. accept().",
            "Phương thức nào được sử dụng để gửi dữ liệu qua một socket trong Python?\n"
            + "\n"
            + "A. send().\n"
            + "B. write().\n"
            + "C. transmit().\n"
            + "D. output().",
            "Phương thức nào được sử dụng để nhận dữ liệu từ một socket trong Python?\n"
            + "\n"
            + "A. recv().\n"
            + "B. read().\n"
            + "C. receive().\n"
            + "D. input().",
            "Phương thức nào được sử dụng để đóng một socket trong Python?\n"
            + "\n"
            + "A. close().\n"
            + "B. shutdown().\n"
            + "C. terminate().\n"
            + "D. exit().",
            "Tham số nào được sử dụng để chỉ định địa chỉ IP của máy chủ trong phương thức connect() của socket Python?\n"
            + "\n"
            + "A. host.\n"
            + "B. address.\n"
            + "C. ip.\n"
            + "D. remote_address.",
            "Tham số nào được sử dụng để chỉ định cổng của máy chủ trong phương thức connect() của socket Python?\n"
            + "\n"
            + "A. port.\n"
            + "B. socket_port.\n"
            + "C. server_port.\n"
            + "D. remote_port.",});

        TITLE_MAP.put("Giao thức TCP/IP", new String[]{
            "Giao thức nào được sử dụng để truyền dữ liệu qua Internet?\n"
            + "\n"
            + "A. TCP/IP.\n"
            + "B. UDP.\n"
            + "C. HTTP.\n"
            + "D. FTP.",
            "Giao thức nào được sử dụng để thiết lập kết nối đáng tin cậy giữa hai thiết bị?\n"
            + "\n"
            + "A. TCP.\n"
            + "B. UDP.\n"
            + "C. IP.\n"
            + "D. ICMP.",
            "Giao thức nào được sử dụng để định tuyến dữ liệu qua Internet?\n"
            + "\n"
            + "A. TCP.\n"
            + "B. UDP.\n"
            + "C. IP.\n"
            + "D. ICMP.",
            "Giao thức nào được sử dụng để kiểm tra kết nối mạng?\n"
            + "\n"
            + "A. TCP.\n"
            + "B. UDP.\n"
            + "C. IP.\n"
            + "D. ICMP.",
            "Cổng nào được sử dụng cho giao thức HTTP?\n"
            + "\n"
            + "A. 80.\n"
            + "B. 443.\n"
            + "C. 21.\n"
            + "D. 22.",
            "Cổng nào được sử dụng cho giao thức HTTPS?\n"
            + "\n"
            + "A. 80.\n"
            + "B. 443.\n"
            + "C. 21.\n"
            + "D. 22.",
            "Cổng nào được sử dụng cho giao thức FTP?\n"
            + "\n"
            + "A. 80.\n"
            + "B. 443.\n"
            + "C. 21.\n"
            + "D. 22.",
            "Cổng nào được sử dụng cho giao thức SSH?\n"
            + "\n"
            + "A. 80.\n"
            + "B. 443.\n"
            + "C. 21.\n"
            + "D. 22.",
            "Địa chỉ IP nào được sử dụng cho localhost?\n"
            + "\n"
            + "A. 127.0.0.1.\n"
            + "B. 192.168.0.1.\n"
            + "C. 10.0.0.1.\n"
            + "D. 8.8.8.8.",
            "Địa chỉ IP nào được sử dụng cho DNS công cộng của Google?\n"
            + "\n"
            + "A. 127.0.0.1.\n"
            + "B. 192.168.0.1.\n"
            + "C. 10.0.0.1.\n"
            + "D. 8.8.8.8.",});

        TITLE_MAP.put("UDP", new String[]{
            "Giao thức nào được sử dụng để truyền dữ liệu nhanh chóng nhưng không đáng tin cậy?\n"
            + "\n"
            + "A. TCP.\n"
            + "B. UDP.\n"
            + "C. IP.\n"
            + "D. ICMP.",
            "Giao thức nào được sử dụng cho truyền phát video trực tuyến?\n"
            + "\n"
            + "A. TCP.\n"
            + "B. UDP.\n"
            + "C. IP.\n"
            + "D. ICMP.",
            "Giao thức nào được sử dụng cho trò chơi trực tuyến?\n"
            + "\n"
            + "A. TCP.\n"
            + "B. UDP.\n"
            + "C. IP.\n"
            + "D. ICMP.",
            "Giao thức nào được sử dụng cho DNS?\n"
            + "\n"
            + "A. TCP.\n"
            + "B. UDP.\n"
            + "C. IP.\n"
            + "D. ICMP.",
            "Giao thức nào được sử dụng cho VoIP?\n"
            + "\n"
            + "A. TCP.\n"
            + "B. UDP.\n"
            + "C. IP.\n"
            + "D. ICMP.",
            "Cổng nào được sử dụng cho DNS?\n"
            + "\n"
            + "A. 53.\n"
            + "B. 67.\n"
            + "C. 68.\n"
            + "D. 123.",
            "Cổng nào được sử dụng cho DHCP?\n"
            + "\n"
            + "A. 53.\n"
            + "B. 67.\n"
            + "C. 68.\n"
            + "D. 123.",
            "Cổng nào được sử dụng cho NTP?\n"
            + "\n"
            + "A. 53.\n"
            + "B. 67.\n"
            + "C. 68.\n"
            + "D. 123.",
            "Phương thức nào được sử dụng để gửi dữ liệu qua UDP trong Python?\n"
            + "\n"
            + "A. sendto().\n"
            + "B. send().\n"
            + "C. write().\n"
            + "D. transmit().",
            "Phương thức nào được sử dụng để nhận dữ liệu từ UDP trong Python?\n"
            + "\n"
            + "A. recvfrom().\n"
            + "B. recv().\n"
            + "C. read().\n"
            + "D. receive().",});

        TITLE_MAP.put("Xây dựng ứng dụng Web với Flask/Django", new String[]{
            "Khung làm việc (framework) nào được sử dụng để xây dựng ứng dụng web nhỏ và linh hoạt trong Python?\n"
            + "\n"
            + "A. Flask.\n"
            + "B. Django.\n"
            + "C. Pyramid.\n"
            + "D. Tornado.",
            "Khung làm việc (framework) nào được sử dụng để xây dựng ứng dụng web lớn và phức tạp trong Python?\n"
            + "\n"
            + "A. Flask.\n"
            + "B. Django.\n"
            + "C. Pyramid.\n"
            + "D. Tornado.",
            "ORM (Object-Relational Mapping) là gì trong Django?\n"
            + "\n"
            + "A. Một hệ thống quản lý cơ sở dữ liệu.\n"
            + "B. Một công cụ để ánh xạ các đối tượng Python sang các bảng cơ sở dữ liệu.\n"
            + "C. Một ngôn ngữ truy vấn cơ sở dữ liệu.\n"
            + "D. Một thư viện để làm việc với JSON.",
            "Template engine là gì trong Flask/Django?\n"
            + "\n"
            + "A. Một hệ thống để tạo ra các trang HTML động.\n"
            + "B. Một công cụ để quản lý các tuyến đường (routes) của ứng dụng.\n"
            + "C. Một thư viện để xử lý các yêu cầu HTTP.\n"
            + "D. Một công cụ để kiểm tra ứng dụng.",
            "Middleware là gì trong Flask/Django?\n"
            + "\n"
            + "A. Một lớp để xử lý các yêu cầu và phản hồi HTTP.\n"
            + "B. Một công cụ để quản lý các tệp tĩnh (static files) của ứng dụng.\n"
            + "C. Một thư viện để làm việc với cơ sở dữ liệu.\n"
            + "D. Một công cụ để tạo ra các biểu mẫu (forms) của ứng dụng.",
            "Route là gì trong Flask/Django?\n"
            + "\n"
            + "A. Một URL được ánh xạ tới một hàm trong ứng dụng.\n"
            + "B. Một lớp để xử lý các yêu cầu và phản hồi HTTP.\n"
            + "C. Một công cụ để quản lý các tệp tĩnh (static files) của ứng dụng.\n"
            + "D. Một thư viện để làm việc với cơ sở dữ liệu.",
            "View là gì trong Flask/Django?\n"
            + "\n"
            + "A. Một hàm hoặc lớp để xử lý các yêu cầu HTTP và trả về phản hồi.\n"
            + "B. Một URL được ánh xạ tới một hàm trong ứng dụng.\n"
            + "C. Một công cụ để quản lý các tệp tĩnh (static files) của ứng dụng.\n"
            + "D. Một thư viện để làm việc với cơ sở dữ liệu.",
            "Model là gì trong Django?\n"
            + "\n"
            + "A. Một lớp để định nghĩa cấu trúc của các bảng cơ sở dữ liệu.\n"
            + "B. Một hàm hoặc lớp để xử lý các yêu cầu HTTP và trả về phản hồi.\n"
            + "C. Một URL được ánh xạ tới một hàm trong ứng dụng.\n"
            + "D. Một công cụ để quản lý các tệp tĩnh (static files) của ứng dụng.",
            "Form là gì trong Flask/Django?\n"
            + "\n"
            + "A. Một lớp để tạo ra các biểu mẫu HTML.\n"
            + "B. Một lớp để định nghĩa cấu trúc của các bảng cơ sở dữ liệu.\n"
            + "C. Một hàm hoặc lớp để xử lý các yêu cầu HTTP và trả về phản hồi.\n"
            + "D. Một URL được ánh xạ tới một hàm trong ứng dụng.",
            "Static files là gì trong Flask/Django?\n"
            + "\n"
            + "A. Các tệp như CSS, JavaScript và hình ảnh được sử dụng trong ứng dụng.\n"
            + "B. Một lớp để tạo ra các biểu mẫu HTML.\n"
            + "C. Một lớp để định nghĩa cấu trúc của các bảng cơ sở dữ liệu.\n"
            + "D. Một hàm hoặc lớp để xử lý các yêu cầu HTTP và trả về phản hồi.",});

        TITLE_MAP.put("Machine Learning với scikit-learn, TensorFlow, PyTorch", new String[]{
            "Thư viện nào được sử dụng để xây dựng các mô hình học máy truyền thống trong Python?\n"
            + "\n"
            + "A. scikit-learn.\n"
            + "B. TensorFlow.\n"
            + "C. PyTorch.\n"
            + "D. Keras.",
            "Thư viện nào được sử dụng để xây dựng các mô hình học sâu (deep learning) trong Python?\n"
            + "\n"
            + "A. scikit-learn.\n"
            + "B. TensorFlow.\n"
            + "C. PyTorch.\n"
            + "D. Tất cả các đáp án trên.",
            "Mô hình nào được sử dụng để phân loại dữ liệu trong scikit-learn?\n"
            + "\n"
            + "A. Linear Regression.\n"
            + "B. Logistic Regression.\n"
            + "C. K-Means Clustering.\n"
            + "D. Principal Component Analysis.",
            "Mô hình nào được sử dụng để hồi quy dữ liệu trong scikit-learn?\n"
            + "\n"
            + "A. Linear Regression.\n"
            + "B. Logistic Regression.\n"
            + "C. K-Means Clustering.\n"
            + "D. Principal Component Analysis.",
            "Mô hình nào được sử dụng để phân cụm dữ liệu trong scikit-learn?\n"
            + "\n"
            + "A. Linear Regression.\n"
            + "B. Logistic Regression.\n"
            + "C. K-Means Clustering.\n"
            + "D. Principal Component Analysis.",
            "Mô hình nào được sử dụng để giảm chiều dữ liệu trong scikit-learn?\n"
            + "\n"
            + "A. Linear Regression.\n"
            + "B. Logistic Regression.\n"
            + "C. K-Means Clustering.\n"
            + "D. Principal Component Analysis.",
            "Lớp nào được sử dụng để xây dựng các lớp mạng nơ-ron trong TensorFlow/PyTorch?\n"
            + "\n"
            + "A. Sequential.\n"
            + "B. Model.\n"
            + "C. Layer.\n"
            + "D. Tensor.",
            "Hàm nào được sử dụng để tính toán độ lỗi của mô hình trong TensorFlow/PyTorch?\n"
            + "\n"
            + "A. loss().\n"
            + "B. accuracy().\n"
            + "C. precision().\n"
            + "D. recall().",
            "Hàm nào được sử dụng để tối ưu hóa các tham số của mô hình trong TensorFlow/PyTorch?\n"
            + "\n"
            + "A. optimizer().\n"
            + "B. loss().\n"
            + "C. accuracy().\n"
            + "D. precision().",
            "Phương thức nào được sử dụng để huấn luyện mô hình trong TensorFlow/PyTorch?\n"
            + "\n"
            + "A. fit().\n"
            + "B. train().\n"
            + "C. compile().\n"
            + "D. evaluate().",});

        TITLE_MAP.put("Tự động hóa với Selenium, bot Telegram/Discord.", new String[]{
            "Thư viện nào được sử dụng để tự động hóa trình duyệt web trong Python?\n"
            + "\n"
            + "A. requests.\n"
            + "B. BeautifulSoup.\n"
            + "C. Selenium.\n"
            + "D. urllib.",
            "Thư viện nào được sử dụng để xây dựng bot Telegram trong Python?\n"
            + "\n"
            + "A. telebot.\n"
            + "B. discord.py.\n"
            + "C. pyrogram.\n"
            + "D. Tất cả các đáp án trên.",
            "Thư viện nào được sử dụng để xây dựng bot Discord trong Python?\n"
            + "\n"
            + "A. telebot.\n"
            + "B. discord.py.\n"
            + "C. pyrogram.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương thức nào được sử dụng để tìm một phần tử HTML trong Selenium?\n"
            + "\n"
            + "A. find_element().\n"
            + "B. find_elements().\n"
            + "C. select_one().\n"
            + "D. select().",
            "Phương thức nào được sử dụng để gửi tin nhắn văn bản trong bot Telegram/Discord?\n"
            + "\n"
            + "A. send_message().\n"
            + "B. send_text().\n"
            + "C. reply().\n"
            + "D. post().",
            "Phương thức nào được sử dụng để gửi hình ảnh trong bot Telegram/Discord?\n"
            + "\n"
            + "A. send_photo().\n"
            + "B. send_image().\n"
            + "C. upload().\n"
            + "D. post().",
            "Phương thức nào được sử dụng để gửi tệp trong bot Telegram/Discord?\n"
            + "\n"
            + "A. send_document().\n"
            + "B. send_file().\n"
            + "C. attach().\n"
            + "D. post().",
            "Phương thức nào được sử dụng để xử lý các lệnh từ người dùng trong bot Telegram/Discord?\n"
            + "\n"
            + "A. command_handler().\n"
            + "B. message_handler().\n"
            + "C. event_handler().\n"
            + "D. callback_handler().",
            "Phương thức nào được sử dụng để xử lý các tin nhắn từ người dùng trong bot Telegram/Discord?\n"
            + "\n"
            + "A. command_handler().\n"
            + "B. message_handler().\n"
            + "C. event_handler().\n"
            + "D. callback_handler().",
            "Phương thức nào được sử dụng để xử lý các sự kiện từ người dùng trong bot Telegram/Discord?\n"
            + "\n"
            + "A. command_handler().\n"
            + "B. message_handler().\n"
            + "C. event_handler().\n"
            + "D. callback_handler().",});

        TITLE_MAP.put("Bảo mật, tối ưu hiệu năng", new String[]{
            "Phương pháp nào được sử dụng để ngăn chặn tấn công SQL injection?\n"
            + "\n"
            + "A. Sử dụng parameterized queries.\n"
            + "B. Mã hóa dữ liệu người dùng.\n"
            + "C. Kiểm tra đầu vào người dùng.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để ngăn chặn tấn công Cross-Site Scripting (XSS)?\n"
            + "\n"
            + "A. Sử dụng parameterized queries.\n"
            + "B. Mã hóa dữ liệu người dùng.\n"
            + "C. Kiểm tra đầu vào người dùng.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để ngăn chặn tấn công Cross-Site Request Forgery (CSRF)?\n"
            + "\n"
            + "A. Sử dụng CSRF tokens.\n"
            + "B. Mã hóa dữ liệu người dùng.\n"
            + "C. Kiểm tra đầu vào người dùng.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để tăng hiệu năng của ứng dụng Python?\n"
            + "\n"
            + "A. Sử dụng bộ nhớ đệm (caching).\n"
            + "B. Tối ưu hóa truy vấn cơ sở dữ liệu.\n"
            + "C. Sử dụng các thuật toán hiệu quả.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để giảm thời gian tải trang web?\n"
            + "\n"
            + "A. Nén các tệp tĩnh (static files).\n"
            + "B. Sử dụng CDN (Content Delivery Network).\n"
            + "C. Tối ưu hóa hình ảnh.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để tối ưu hóa hiệu năng cơ sở dữ liệu?\n"
            + "\n"
            + "A. Sử dụng chỉ mục (indexes).\n"
            + "B. Tối ưu hóa truy vấn SQL.\n"
            + "C. Sử dụng bộ nhớ đệm (caching).\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để giám sát hiệu năng của ứng dụng?\n"
            + "\n"
            + "A. Sử dụng các công cụ giám sát (monitoring tools).\n"
            + "B. Ghi nhật ký (logging).\n"
            + "C. Kiểm tra (profiling).\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để giảm thiểu thời gian phản hồi của API?\n"
            + "\n"
            + "A. Sử dụng bộ nhớ đệm (caching).\n"
            + "B. Tối ưu hóa truy vấn cơ sở dữ liệu.\n"
            + "C. Sử dụng các thuật toán hiệu quả.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để bảo vệ ứng dụng khỏi tấn công DDoS?\n"
            + "\n"
            + "A. Sử dụng tường lửa (firewall).\n"
            + "B. Sử dụng CDN (Content Delivery Network).\n"
            + "C. Giới hạn tốc độ yêu cầu (rate limiting).\n"
            + "D. Tất cả các đáp án trên.",
            "Phương pháp nào được sử dụng để mã hóa dữ liệu người dùng?\n"
            + "\n"
            + "A. Sử dụng HTTPS.\n"
            + "B. Sử dụng hashing.\n"
            + "C. Sử dụng mã hóa đối xứng (symmetric encryption).\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("kiểm thử với pytest, unittest", new String[]{
            "Thư viện nào được sử dụng để viết unit test trong Python?\n"
            + "\n"
            + "A. pytest.\n"
            + "B. unittest.\n"
            + "C. doctest.\n"
            + "D. Tất cả các đáp án trên.",
            "Phương thức nào được sử dụng để kiểm tra sự bằng nhau của hai giá trị trong pytest/unittest?\n"
            + "\n"
            + "A. assertEqual().\n"
            + "B. assertTrue().\n"
            + "C. assertFalse().\n"
            + "D. assertRaises().",
            "Phương thức nào được sử dụng để kiểm tra một giá trị là True trong pytest/unittest?\n"
            + "\n"
            + "A. assertEqual().\n"
            + "B. assertTrue().\n"
            + "C. assertFalse().\n"
            + "D. assertRaises().",
            "Phương thức nào được sử dụng để kiểm tra một giá trị là False trong pytest/unittest?\n"
            + "\n"
            + "A. assertEqual().\n"
            + "B. assertTrue().\n"
            + "C. assertFalse().\n"
            + "D. assertRaises().",
            "Phương thức nào được sử dụng để kiểm tra một ngoại lệ được nâng lên trong pytest/unittest?\n"
            + "\n"
            + "A. assertEqual().\n"
            + "B. assertTrue().\n"
            + "C. assertFalse().\n"
            + "D. assertRaises().",
            "Phương thức nào được sử dụng để thiết lập các tài nguyên trước khi chạy mỗi test case trong unittest?\n"
            + "\n"
            + "A. setUp().\n"
            + "B. tearDown().\n"
            + "C. setUpClass().n"
            + "D. tearDownClass().",
            "Phương thức nào được sử dụng để giải phóng các tài nguyên sau khi chạy mỗi test case trong unittest?\n"
            + "\n"
            + "A. setUp().\n"
            + "B. tearDown().\n"
            + "C. setUpClass().\n"
            + "D. tearDownClass().",
            "Phương thức nào được sử dụng để thiết lập các tài nguyên trước khi chạy tất cả các test case trong unittest?\n"
            + "\n"
            + "A. setUp().\n"
            + "B. tearDown().\n"
            + "C. setUpClass().\n"
            + "D. tearDownClass().",
            "Fixture là gì trong pytest?\n"
            + "\n"
            + "A. Một hàm để thiết lập và giải phóng các tài nguyên cho test case.\n"
            + "B. Một phương thức để kiểm tra sự bằng nhau của hai giá trị.\n"
            + "C. Một phương thức để kiểm tra một giá trị là True.\n"
            + "D. Một phương thức để kiểm tra một ngoại lệ được nâng lên.",
            "Marker là gì trong pytest?\n"
            + "\n"
            + "A. Một cách để nhóm và lọc các test case.\n"
            + "B. Một hàm để thiết lập và giải phóng các tài nguyên cho test case.\n"
            + "C. Một phương thức để kiểm tra sự bằng nhau của hai giá trị.\n"
            + "D. Một phương thức để kiểm tra một ngoại lệ được nâng lên.",});

        //C
        TITLE_MAP.put("C là gì?", new String[]{
            "C là một ngôn ngữ lập trình như thế nào?\n"
            + "\n"
            + "A. Thông dịch.\n"
            + "B. Biên dịch.\n"
            + "C. Kịch bản.\n"
            + "D. Trực quan.",
            "C được sử dụng chủ yếu để làm gì?\n"
            + "\n"
            + "A. Phát triển web.\n"
            + "B. Lập trình hệ thống.\n"
            + "C. Khoa học dữ liệu.\n"
            + "D. Trí tuệ nhân tạo.",
            "C được phát triển bởi ai?\n"
            + "\n"
            + "A. Guido van Rossum.\n"
            + "B. Dennis Ritchie.\n"
            + "C. James Gosling.\n"
            + "D. Bjarne Stroustrup.",
            "Đặc điểm nào sau đây KHÔNG phải là của C?\n"
            + "\n"
            + "A. Hiệu suất cao.\n"
            + "B. Quản lý bộ nhớ thủ công.\n"
            + "C. Hỗ trợ lập trình hướng đối tượng.\n"
            + "D. Tính di động.",
            "Phần mở rộng tệp của mã nguồn C là gì?\n"
            + "\n"
            + "A. .py.\n"
            + "B. .c.\n"
            + "C. .java.\n"
            + "D. .cpp.",
            "Kiểu dữ liệu nào được sử dụng để lưu trữ số nguyên trong C?\n"
            + "\n"
            + "A. float.\n"
            + "B. char.\n"
            + "C. int.\n"
            + "D. double.",
            "Toán tử nào được sử dụng để gán giá trị cho một biến trong C?\n"
            + "\n"
            + "A. ==.\n"
            + "B. =.\n"
            + "C. +.\n"
            + "D. -.",
            "Hàm nào được sử dụng để in ra màn hình trong C?\n"
            + "\n"
            + "A. print().\n"
            + "B. printf().\n"
            + "C. console.log().\n"
            + "D. System.out.println().",
            "Câu lệnh nào được sử dụng để kiểm tra điều kiện trong C?\n"
            + "\n"
            + "A. for.\n"
            + "B. while.\n"
            + "C. if.\n"
            + "D. switch.",
            "Vòng lặp nào được sử dụng để lặp lại một khối mã một số lần nhất định trong C?\n"
            + "\n"
            + "A. while.\n"
            + "B. do-while.\n"
            + "C. for.\n"
            + "D. if.",});

        TITLE_MAP.put("Tại sao nên học C?", new String[]{
            "Lợi ích chính của việc học C là gì?\n"
            + "\n"
            + "A. Dễ học và dễ sử dụng.\n"
            + "B. Hiệu suất cao và kiểm soát phần cứng tốt.\n"
            + "C. Thư viện phong phú và cộng đồng lớn.\n"
            + "D. Khả năng phát triển ứng dụng web nhanh chóng.",
            "C được sử dụng làm nền tảng cho nhiều ngôn ngữ lập trình nào?\n"
            + "\n"
            + "A. Python, JavaScript.\n"
            + "B. Java, C++.\n"
            + "C. Ruby, PHP.\n"
            + "D. Swift, Kotlin.",
            "Học C giúp bạn hiểu rõ hơn về điều gì?\n"
            + "\n"
            + "A. Thiết kế giao diện người dùng.\n"
            + "B. Quản lý bộ nhớ và hoạt động của hệ thống.\n"
            + "C. Phát triển ứng dụng di động đa nền tảng.\n"
            + "D. Xây dựng các mô hình học máy.",
            "Trong lĩnh vực nào C vẫn được sử dụng rộng rãi?\n"
            + "\n"
            + "A. Phát triển web frontend.\n"
            + "B. Lập trình hệ thống nhúng.\n"
            + "C. Thiết kế đồ họa 3D.\n"
            + "D. Phát triển trò chơi di động.",
            "Điều nào sau đây KHÔNG phải là lý do nên học C?\n"
            + "\n"
            + "A. Hiểu rõ về cách thức hoạt động của máy tính.\n"
            + "B. Phát triển các ứng dụng hiệu suất cao.\n"
            + "C. Dễ dàng tìm kiếm việc làm với mức lương cao.\n"
            + "D. Có thể phát triển ứng dụng web mà không cần học thêm ngôn ngữ khác.",
            "Học C giúp bạn làm quen với khái niệm nào?\n"
            + "\n"
            + "A. Lập trình hướng đối tượng.\n"
            + "B. Quản lý bộ nhớ thủ công.\n"
            + "C. Lập trình hàm.\n"
            + "D. Lập trình kịch bản.",
            "C cung cấp khả năng nào cho lập trình viên?\n"
            + "\n"
            + "A. Truy cập trực tiếp vào phần cứng.\n"
            + "B. Phát triển ứng dụng web nhanh chóng.\n"
            + "C. Xây dựng giao diện người dùng đồ họa phức tạp.\n"
            + "D. Phát triển ứng dụng di động đa nền tảng.",
            "C là ngôn ngữ nền tảng cho hệ điều hành nào?\n"
            + "\n"
            + "A. Windows.\n"
            + "B. macOS.\n"
            + "C. Linux.\n"
            + "D. Tất cả các đáp án trên.",
            "Học C giúp bạn phát triển kỹ năng nào?\n"
            + "\n"
            + "A. Thiết kế giao diện người dùng.\n"
            + "B. Giải quyết vấn đề và tư duy logic.\n"
            + "C. Phát triển ứng dụng web động.\n"
            + "D. Xây dựng các mô hình học máy phức tạp.",
            "Điều nào sau đây là lợi ích khi học C?\n"
            + "\n"
            + "A. Dễ dàng tìm kiếm việc làm trong lĩnh vực lập trình hệ thống.\n"
            + "B. Phát triển ứng dụng web mà không cần học thêm ngôn ngữ khác.\n"
            + "C. Xây dựng các ứng dụng di động đa nền tảng.\n"
            + "D. Phát triển các ứng dụng đồ họa 3D phức tạp.",});

        TITLE_MAP.put("Các đặc điểm nổi bật của C", new String[]{
            "Đặc điểm nào sau đây là nổi bật của C?\n"
            + "\n"
            + "A. Hỗ trợ thu gom rác tự động.\n"
            + "B. Quản lý bộ nhớ thủ công.\n"
            + "C. Lập trình hướng đối tượng thuần túy.\n"
            + "D. Thư viện chuẩn phong phú.",
            "C được biết đến với điều gì?\n"
            + "\n"
            + "A. Tốc độ thực thi chậm.\n"
            + "B. Hiệu suất cao và khả năng kiểm soát phần cứng tốt.\n"
            + "C. Dễ dàng phát triển các ứng dụng web phức tạp.\n"
            + "D. Khả năng phát triển ứng dụng di động đa nền tảng.",
            "C hỗ trợ kiểu dữ liệu nào?\n"
            + "\n"
            + "A. Kiểu dữ liệu động.\n"
            + "B. Kiểu dữ liệu tĩnh.\n"
            + "C. Kiểu dữ liệu hướng đối tượng.\n"
            + "D. Kiểu dữ liệu kịch bản.",
            "Điều nào sau đây KHÔNG phải là đặc điểm của C?\n"
            + "\n"
            + "A. Tính di động cao.\n"
            + "B. Khả năng truy cập trực tiếp vào bộ nhớ.\n"
            + "C. Hỗ trợ đa luồng tích hợp.\n"
            + "D. Cú pháp đơn giản và dễ học.",
            "C được sử dụng rộng rãi trong lĩnh vực nào?\n"
            + "\n"
            + "A. Phát triển ứng dụng web frontend.\n"
            + "B. Lập trình hệ thống và phần mềm nhúng.\n"
            + "C. Thiết kế đồ họa 3D và trò chơi.\n"
            + "D. Khoa học dữ liệu và trí tuệ nhân tạo.",
            "C có khả năng nào trong việc quản lý bộ nhớ?\n"
            + "\n"
            + "A. Quản lý bộ nhớ tự động.\n"
            + "B. Quản lý bộ nhớ thủ công.\n"
            + "C. Quản lý bộ nhớ bằng thu gom rác.\n"
            + "D. Không có khả năng quản lý bộ nhớ.",
            "C cung cấp khả năng nào cho lập trình viên?\n"
            + "\n"
            + "A. Lập trình hướng đối tượng thuần túy.\n"
            + "B. Truy cập trực tiếp vào phần cứng.\n"
            + "C. Phát triển ứng dụng web nhanh chóng.\n"
            + "D. Xây dựng giao diện người dùng đồ họa phức tạp.",
            "C có đặc điểm nào về tính di động?\n"
            + "\n"
            + "A. Tính di động thấp.\n"
            + "B. Tính di động cao.\n"
            + "C. Không có tính di động.\n"
            + "D. Tính di động phụ thuộc vào hệ điều hành.",
            "C có đặc điểm nào về hiệu suất?\n"
            + "\n"
            + "A. Hiệu suất thấp.\n"
            + "B. Hiệu suất cao.\n"
            + "C. Hiệu suất trung bình.\n"
            + "D. Hiệu suất phụ thuộc vào phần cứng.",
            "C có cú pháp như thế nào?\n"
            + "\n"
            + "A. Cú pháp phức tạp và khó học.\n"
            + "B. Cú pháp đơn giản và dễ học.\n"
            + "C. Cú pháp hướng đối tượng.\n"
            + "D. Cú pháp kịch bản.",});

        TITLE_MAP.put("Nguồn gốc của C", new String[]{
            "C được phát triển tại phòng thí nghiệm nào?\n"
            + "\n"
            + "A. MIT.\n"
            + "B. Bell Labs.\n"
            + "C. Stanford.\n"
            + "D. Microsoft Research.",
            "C được phát triển vào năm nào?\n"
            + "\n"
            + "A. 1960.\n"
            + "B. 1972.\n"
            + "C. 1985.\n"
            + "D. 1991.",
            "C được phát triển để viết lại hệ điều hành nào?\n"
            + "\n"
            + "A. Windows.\n"
            + "B. macOS.\n"
            + "C. Linux.\n"
            + "D. UNIX.",
            "Ai là người đồng phát triển C?\n"
            + "\n"
            + "A. Linus Torvalds.\n"
            + "B. Ken Thompson.\n"
            + "C. Richard Stallman.\n"
            + "D. Tim Berners-Lee.",
            "Phiên bản đầu tiên của C dựa trên ngôn ngữ lập trình nào?\n"
            + "\n"
            + "A. ALGOL.\n"
            + "B. BASIC.\n"
            + "C. B.\n"
            + "D. Pascal.",
            "C được phát triển trên hệ thống máy tính nào?\n"
            + "\n"
            + "A. IBM PC.\n"
            + "B. DEC PDP-11.\n"
            + "C. Apple Macintosh.\n"
            + "D. Sun Microsystems SPARC.",
            "C được phát triển như một phần của dự án nào?\n"
            + "\n"
            + "A. Dự án GNU.\n"
            + "B. Dự án BSD.\n"
            + "C. Dự án UNIX.\n"
            + "D. Dự án Linux.",
            "C được chuẩn hóa bởi tổ chức nào?\n"
            + "\n"
            + "A. IEEE.\n"
            + "B. ISO.\n"
            + "C. W3C.\n"
            + "D. IETF.",
            "C được sử dụng rộng rãi trong hệ điều hành nào?\n"
            + "\n"
            + "A. Windows.\n"
            + "B. macOS.\n"
            + "C. Linux.\n"
            + "D. Tất cả các đáp án trên.",
            "C có ảnh hưởng đến sự phát triển của ngôn ngữ lập trình nào?\n"
            + "\n"
            + "A. Python.\n"
            + "B. Java.\n"
            + "C. C++.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Các phiên bản của C", new String[]{
            "Phiên bản C chuẩn đầu tiên được gọi là gì?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",
            "Phiên bản C nào giới thiệu kiểu dữ liệu `long long`?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",
            "Phiên bản C nào giới thiệu từ khóa `_Thread_local`?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",
            "Phiên bản C nào giới thiệu từ khóa `static_assert`?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",
            "Phiên bản C mới nhất hiện tại là gì?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17/C18.",
            "Phiên bản C nào giới thiệu kiểu dữ liệu `_Bool`?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",
            "Phiên bản C nào giới thiệu thư viện `tgmath.h`?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",
            "Phiên bản C nào giới thiệu kiểu dữ liệu `_Complex`?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",
            "Phiên bản C nào giới thiệu thư viện `stdatomic.h`?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",
            "Phiên bản C nào giới thiệu từ khóa `_Generic`?\n"
            + "\n"
            + "A. C89/C90.\n"
            + "B. C99.\n"
            + "C. C11.\n"
            + "D. C17.",});

        TITLE_MAP.put("C và các ngôn ngữ lập trình khác", new String[]{
            "Ngôn ngữ lập trình nào được phát triển dựa trên C?\n"
            + "\n"
            + "A. Python.\n"
            + "B. Java.\n"
            + "C. C++.\n"
            + "D. JavaScript.",
            "C++ khác C ở điểm nào?\n"
            + "\n"
            + "A. C++ hỗ trợ lập trình hướng đối tượng.\n"
            + "B. C++ có hiệu suất cao hơn C.\n"
            + "C. C++ dễ học hơn C.\n"
            + "D. C++ có cú pháp đơn giản hơn C.",
            "Ngôn ngữ lập trình nào thường được sử dụng thay thế C trong phát triển web?\n"
            + "\n"
            + "A. C++.\n"
            + "B. Java.\n"
            + "C. Python.\n"
            + "D. JavaScript.",
            "Ngôn ngữ lập trình nào thường được sử dụng thay thế C trong khoa học dữ liệu?\n"
            + "\n"
            + "A. C++.\n"
            + "B. Java.\n"
            + "C. Python.\n"
            + "D. JavaScript.",
            "Điều nào sau đây KHÔNG phải là sự khác biệt giữa C và các ngôn ngữ lập trình khác?\n"
            + "\n"
            + "A. C có hiệu suất cao hơn.\n"
            + "B. C quản lý bộ nhớ thủ công.\n"
            + "C. C có cú pháp đơn giản hơn.\n"
            + "D. C có thư viện chuẩn phong phú hơn.",
            "Ngôn ngữ lập trình nào được sử dụng để phát triển ứng dụng di động thay vì C?\n"
            + "\n"
            + "A. C++.\n"
            + "B. Java.\n"
            + "C. Swift.\n"
            + "D. JavaScript.",
            "Ngôn ngữ lập trình nào được sử dụng để phát triển trò chơi thay vì C?\n"
            + "\n"
            + "A. C++.\n"
            + "B. Java.\n"
            + "C. C#.\n"
            + "D. JavaScript.",
            "Ngôn ngữ lập trình nào được sử dụng để phát triển ứng dụng web backend thay vì C?\n"
            + "\n"
            + "A. C++.\n"
            + "B. Java.\n"
            + "C. Python.\n"
            + "D. JavaScript.",
            "Ngôn ngữ lập trình nào được sử dụng để phát triển ứng dụng desktop thay vì C?\n"
            + "\n"
            + "A. C++.\n"
            + "B. Java.\n"
            + "C. C#.\n"
            + "D. JavaScript.",
            "Điều nào sau đây là ưu điểm của C so với các ngôn ngữ lập trình khác?\n"
            + "\n"
            + "A. Dễ học và dễ sử dụng.\n"
            + "B. Hiệu suất cao và kiểm soát phần cứng tốt.\n"
            + "C. Thư viện phong phú và cộng đồng lớn.\n"
            + "D. Khả năng phát triển ứng dụng web nhanh chóng.",});

        TITLE_MAP.put("Ứng dụng của C trong lập trình hệ thống", new String[]{
            "C được sử dụng để phát triển hệ điều hành nào?\n"
            + "\n"
            + "A. Windows.\n"
            + "B. macOS.\n"
            + "C. Linux.\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển trình điều khiển thiết bị nào?\n"
            + "\n"
            + "A. Trình điều khiển card đồ họa.\n"
            + "B. Trình điều khiển thiết bị mạng.\n"
            + "C. Trình điều khiển thiết bị lưu trữ.\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển hệ thống cơ sở dữ liệu nào?\n"
            + "\n"
            + "A. MySQL.\n"
            + "B. PostgreSQL.\n"
            + "C. Oracle.\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển trình biên dịch nào?\n"
            + "\n"
            + "A. GCC.\n"
            + "B. Clang.\n"
            + "C. LLVM.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều nào sau đây KHÔNG phải là ứng dụng của C trong lập trình hệ thống?\n"
            + "\n"
            + "A. Phát triển ứng dụng web frontend.\n"
            + "B. Phát triển hệ điều hành.\n"
            + "C. Phát triển trình điều khiển thiết bị.\n"
            + "D. Phát triển hệ thống cơ sở dữ liệu.",
            "C được sử dụng để phát triển hệ thống nhúng nào?\n"
            + "\n"
            + "A. Hệ thống điều khiển công nghiệp.\n"
            + "B. Hệ thống điều khiển ô tô.\n"
            + "C. Hệ thống điều khiển thiết bị gia dụng.\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển hệ thống thời gian thực nào?\n"
            + "\n"
            + "A. Hệ thống điều khiển máy bay.\n"
            + "B. Hệ thống điều khiển tên lửa.\n"
            + "C. Hệ thống điều khiển nhà máy điện hạt nhân.\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển hệ thống mạng nào?\n"
            + "\n"
            + "A. Hệ thống định tuyến (routers).\n"
            + "B. Hệ thống tường lửa (firewalls).\n"
            + "C. Hệ thống cân bằng tải (load balancers).\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển hệ thống phân tán nào?\n"
            + "\n"
            + "A. Hệ thống tính toán đám mây.\n"
            + "B. Hệ thống xử lý dữ liệu lớn.\n"
            + "C. Hệ thống giao dịch tài chính.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều nào sau đây là ưu điểm của C trong lập trình hệ thống?\n"
            + "\n"
            + "A. Hiệu suất cao và khả năng kiểm soát phần cứng tốt.\n"
            + "B. Dễ học và dễ sử dụng.\n"
            + "C. Thư viện phong phú và cộng đồng lớn.\n"
            + "D. Khả năng phát triển ứng dụng web nhanh chóng.",});

        TITLE_MAP.put("C trong phát triển phần mềm nhúng", new String[]{
            "C được sử dụng để phát triển phần mềm nhúng cho thiết bị nào?\n"
            + "\n"
            + "A. Vi điều khiển.\n"
            + "B. Hệ thống điều khiển công nghiệp.\n"
            + "C. Thiết bị điện tử tiêu dùng.\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển phần mềm nhúng cho hệ thống thời gian thực nào?\n"
            + "\n"
            + "A. Hệ thống điều khiển máy bay.\n"
            + "B. Hệ thống điều khiển tên lửa.\n"
            + "C. Hệ thống điều khiển nhà máy điện hạt nhân.\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển phần mềm nhúng cho hệ thống nào?\n"
            + "\n"
            + "A. Hệ thống điều khiển ô tô.\n"
            + "B. Hệ thống điều khiển thiết bị y tế.\n"
            + "C. Hệ thống điều khiển robot.\n"
            + "D. Tất cả các đáp án trên.",
            "C được sử dụng để phát triển phần mềm nhúng cho hệ thống nào?\n"
            + "\n"
            + "A. Hệ thống điều khiển thiết bị gia dụng.\n"
            + "B. Hệ thống điều khiển thiết bị viễn thông.\n"
            + "C. Hệ thống điều khiển thiết bị quân sự.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều nào sau đây KHÔNG phải là ứng dụng của C trong phát triển phần mềm nhúng?\n"
            + "\n"
            + "A. Phát triển ứng dụng web frontend.\n"
            + "B. Phát triển phần mềm nhúng cho vi điều khiển.\n"
            + "C. Phát triển phần mềm nhúng cho hệ thống thời gian thực.\n"
            + "D. Phát triển phần mềm nhúng cho hệ thống điều khiển công nghiệp.",
            "C có ưu điểm nào trong phát triển phần mềm nhúng?\n"
            + "\n"
            + "A. Hiệu suất cao và khả năng kiểm soát phần cứng tốt.\n"
            + "B. Dễ học và dễ sử dụng.\n"
            + "C. Thư viện phong phú và cộng đồng lớn.\n"
            + "D. Khả năng phát triển ứng dụng web nhanh chóng.",
            "C có khả năng nào trong phát triển phần mềm nhúng?\n"
            + "\n"
            + "A. Truy cập trực tiếp vào phần cứng.\n"
            + "B. Phát triển ứng dụng web nhanh chóng.\n"
            + "C. Xây dựng giao diện người dùng đồ họa phức tạp.\n"
            + "D. Phát triển ứng dụng di động đa nền tảng.",
            "C có đặc điểm nào về kích thước mã trong phát triển phần mềm nhúng?\n"
            + "\n"
            + "A. Kích thước mã lớn.\n"
            + "B. Kích thước mã nhỏ.\n"
            + "C. Kích thước mã trung bình.\n"
            + "D. Kích thước mã phụ thuộc vào thư viện.",
            "C có đặc điểm nào về tốc độ thực thi trong phát triển phần mềm nhúng?\n"
            + "\n"
            + "A. Tốc độ thực thi chậm.\n"
            + "B. Tốc độ thực thi nhanh.\n"
            + "C. Tốc độ thực thi trung bình.\n"
            + "D. Tốc độ thực thi phụ thuộc vào phần cứng.",
            "C có khả năng nào trong việc tối ưu hóa bộ nhớ trong phát triển phần mềm nhúng?\n"
            + "\n"
            + "A. Tối ưu hóa bộ nhớ tự động.\n"
            + "B. Tối ưu hóa bộ nhớ thủ công.\n"
            + "C. Không có khả năng tối ưu hóa bộ nhớ.\n"
            + "D. Tối ưu hóa bộ nhớ phụ thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Cấu trúc tổng quát", new String[]{
            "Phần nào sau đây KHÔNG phải là một phần của cấu trúc tổng quát của chương trình C?\n"
            + "\n"
            + "A. Khai báo thư viện.\n"
            + "B. Khai báo biến toàn cục.\n"
            + "C. Định nghĩa hàm main().\n"
            + "D. Khai báo lớp (class).",
            "Khai báo thư viện trong C được thực hiện bằng lệnh nào?\n"
            + "\n"
            + "A. import.\n"
            + "B. include.\n"
            + "C. using.\n"
            + "D. require.",
            "Hàm nào là điểm bắt đầu thực thi của chương trình C?\n"
            + "\n"
            + "A. start().\n"
            + "B. main().\n"
            + "C. run().\n"
            + "D. execute().",
            "Phần nào trong hàm main() chứa các câu lệnh thực thi của chương trình?\n"
            + "\n"
            + "A. Khai báo biến.\n"
            + "B. Thân hàm.\n"
            + "C. Tham số hàm.\n"
            + "D. Kiểu trả về.",
            "Kiểu trả về thông thường của hàm main() là gì?\n"
            + "\n"
            + "A. void.\n"
            + "B. int.\n"
            + "C. float.\n"
            + "D. char.",
            "Dấu nào được sử dụng để kết thúc một câu lệnh trong C?\n"
            + "\n"
            + "A. Dấu chấm phẩy (;).\n"
            + "B. Dấu chấm (.).\n"
            + "C. Dấu phẩy (,).\n"
            + "D. Dấu hai chấm (:).",
            "Phần nào trong chương trình C được sử dụng để viết chú thích?\n"
            + "\n"
            + "A. //.\n"
            + "B. /* ... */.\n"
            + "C. #.\n"
            + "D. Tất cả các đáp án trên.",
            "Khai báo biến toàn cục được đặt ở đâu trong chương trình C?\n"
            + "\n"
            + "A. Bên trong hàm main().\n"
            + "B. Bên ngoài tất cả các hàm.\n"
            + "C. Bên trong một khối lệnh.\n"
            + "D. Bên trong một vòng lặp.",
            "Khối lệnh trong C được đặt trong dấu nào?\n"
            + "\n"
            + "A. Dấu ngoặc tròn ().\n"
            + "B. Dấu ngoặc vuông [].\n"
            + "C. Dấu ngoặc nhọn {}.\n"
            + "D. Dấu ngoặc kép \"\".",
            "Điều nào sau đây là đúng về cấu trúc tổng quát của chương trình C?\n"
            + "\n"
            + "A. Chương trình C không cần hàm main().\n"
            + "B. Chương trình C chỉ có thể có một hàm.\n"
            + "C. Chương trình C có thể có nhiều hàm.\n"
            + "D. Chương trình C không cần khai báo thư viện.",});

        TITLE_MAP.put("Khai báo biến", new String[]{
            "Kiểu dữ liệu nào được sử dụng để lưu trữ số nguyên trong C?\n"
            + "\n"
            + "A. float.\n"
            + "B. char.\n"
            + "C. int.\n"
            + "D. double.",
            "Kiểu dữ liệu nào được sử dụng để lưu trữ số thực trong C?\n"
            + "\n"
            + "A. int.\n"
            + "B. char.\n"
            + "C. float.\n"
            + "D. boolean.",
            "Kiểu dữ liệu nào được sử dụng để lưu trữ ký tự trong C?\n"
            + "\n"
            + "A. int.\n"
            + "B. char.\n"
            + "C. float.\n"
            + "D. string.",
            "Kiểu dữ liệu nào được sử dụng để lưu trữ giá trị logic (true/false) trong C?\n"
            + "\n"
            + "A. int.\n"
            + "B. char.\n"
            + "C. float.\n"
            + "D. _Bool.",
            "Từ khóa nào được sử dụng để khai báo biến hằng số trong C?\n"
            + "\n"
            + "A. var.\n"
            + "B. const.\n"
            + "C. final.\n"
            + "D. static.",
            "Điều gì xảy ra nếu bạn cố gắng gán một giá trị không phù hợp với kiểu dữ liệu của biến?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ tự động chuyển đổi kiểu dữ liệu.\n"
            + "C. Chương trình sẽ chạy nhưng kết quả không chính xác.\n"
            + "D. Chương trình sẽ bỏ qua giá trị đó.",
            "Phạm vi của biến cục bộ là gì?\n"
            + "\n"
            + "A. Toàn bộ chương trình.\n"
            + "B. Chỉ trong hàm mà biến được khai báo.\n"
            + "C. Chỉ trong khối lệnh mà biến được khai báo.\n"
            + "D. Chỉ trong tệp mà biến được khai báo.",
            "Phạm vi của biến toàn cục là gì?\n"
            + "\n"
            + "A. Toàn bộ chương trình.\n"
            + "B. Chỉ trong hàm mà biến được khai báo.\n"
            + "C. Chỉ trong khối lệnh mà biến được khai báo.\n"
            + "D. Chỉ trong tệp mà biến được khai báo.",
            "Biến tự động (automatic variable) được lưu trữ ở đâu?\n"
            + "\n"
            + "A. Bộ nhớ heap.\n"
            + "B. Bộ nhớ stack.\n"
            + "C. Bộ nhớ tĩnh.\n"
            + "D. Bộ nhớ đăng ký.",
            "Biến tĩnh (static variable) được khởi tạo bao nhiêu lần?\n"
            + "\n"
            + "A. Mỗi khi hàm được gọi.\n"
            + "B. Chỉ một lần khi chương trình bắt đầu.\n"
            + "C. Mỗi khi khối lệnh được thực thi.\n"
            + "D. Không bao giờ được khởi tạo.",});

        TITLE_MAP.put("Hàm main", new String[]{
            "Hàm main() là gì trong chương trình C?\n"
            + "\n"
            + "A. Một hàm do người dùng định nghĩa.\n"
            + "B. Một hàm thư viện chuẩn.\n"
            + "C. Điểm bắt đầu thực thi của chương trình.\n"
            + "D. Một hàm để in ra màn hình.",
            "Kiểu trả về thông thường của hàm main() là gì?\n"
            + "\n"
            + "A. void.\n"
            + "B. int.\n"
            + "C. float.\n"
            + "D. char.",
            "Tham số nào có thể được truyền cho hàm main()?\n"
            + "\n"
            + "A. argc và argv.\n"
            + "B. stdin và stdout.\n"
            + "C. input và output.\n"
            + "D. Không có tham số nào.",
            "argc trong hàm main() đại diện cho gì?\n"
            + "\n"
            + "A. Số lượng đối số dòng lệnh.\n"
            + "B. Mảng các đối số dòng lệnh.\n"
            + "C. Tên của chương trình.\n"
            + "D. Kiểu trả về của hàm main().",
            "argv trong hàm main() đại diện cho gì?\n"
            + "\n"
            + "A. Số lượng đối số dòng lệnh.\n"
            + "B. Mảng các đối số dòng lệnh.\n"
            + "C. Tên của chương trình.\n"
            + "D. Kiểu trả về của hàm main().",
            "Nếu hàm main() trả về 0, điều đó có nghĩa là gì?\n"
            + "\n"
            + "A. Chương trình chạy thành công.\n"
            + "B. Chương trình chạy thất bại.\n"
            + "C. Chương trình bị treo.\n"
            + "D. Chương trình không chạy.",
            "Nếu hàm main() trả về một giá trị khác 0, điều đó có nghĩa là gì?\n"
            + "\n"
            + "A. Chương trình chạy thành công.\n"
            + "B. Chương trình chạy thất bại.\n"
            + "C. Chương trình bị treo.\n"
            + "D. Chương trình không chạy.",
            "Hàm main() có thể được gọi từ hàm nào khác không?\n"
            + "\n"
            + "A. Có, từ bất kỳ hàm nào.\n"
            + "B. Không, chỉ được gọi bởi hệ điều hành.\n"
            + "C. Chỉ được gọi từ các hàm thư viện chuẩn.\n"
            + "D. Chỉ được gọi từ các hàm do người dùng định nghĩa.",
            "Điều gì xảy ra nếu bạn không định nghĩa hàm main() trong chương trình C?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ tự động tạo hàm main().\n"
            + "D. Chương trình sẽ chạy một hàm mặc định.",
            "Hàm main() có thể được định nghĩa nhiều lần trong một chương trình C không?\n"
            + "\n"
            + "A. Có, nếu chúng có tham số khác nhau.\n"
            + "B. Có, nếu chúng có kiểu trả về khác nhau.\n"
            + "C. Không, chỉ được định nghĩa một lần.\n"
            + "D. Có, nếu chúng nằm trong các tệp khác nhau.",});

        TITLE_MAP.put("Các bước biên dịch", new String[]{
            "Bước đầu tiên trong quá trình biên dịch chương trình C là gì?\n"
            + "\n"
            + "A. Liên kết (linking).\n"
            + "B. Tiền xử lý (preprocessing).\n"
            + "C. Biên dịch (compilation).\n"
            + "D. Nạp (loading).",
            "Bước nào trong quá trình biên dịch xử lý các chỉ thị tiền xử lý (#include, #define)?\n"
            + "\n"
            + "A. Liên kết (linking).\n"
            + "B. Tiền xử lý (preprocessing).\n"
            + "C. Biên dịch (compilation).\n"
            + "D. Nạp (loading).",
            "Bước nào trong quá trình biên dịch chuyển đổi mã nguồn C thành mã đối tượng (object code)?\n"
            + "\n"
            + "A. Liên kết (linking).\n"
            + "B. Tiền xử lý (preprocessing).\n"
            + "C. Biên dịch (compilation).\n"
            + "D. Nạp (loading).",
            "Bước nào trong quá trình biên dịch kết hợp mã đối tượng từ nhiều tệp thành tệp thực thi?\n"
            + "\n"
            + "A. Liên kết (linking).\n"
            + "B. Tiền xử lý (preprocessing).\n"
            + "C. Biên dịch (compilation).\n"
            + "D. Nạp (loading).",
            "Tệp nào được tạo ra sau bước biên dịch?\n"
            + "\n"
            + "A. Tệp mã nguồn (.c).\n"
            + "B. Tệp mã đối tượng (.o hoặc .obj).\n"
            + "C. Tệp thực thi (.exe hoặc không có phần mở rộng).\n"
            + "D. Tệp thư viện (.lib hoặc .dll).",
            "Tệp nào được tạo ra sau bước liên kết?\n"
            + "\n"
            + "A. Tệp mã nguồn (.c).\n"
            + "B. Tệp mã đối tượng (.o hoặc .obj).\n"
            + "C. Tệp thực thi (.exe hoặc không có phần mở rộng).\n"
            + "D. Tệp thư viện (.lib hoặc .dll).",
            "Trình biên dịch nào được sử dụng phổ biến cho C trên Linux?\n"
            + "\n"
            + "A. cl.exe.\n"
            + "B. gcc.\n"
            + "C. javac.\n"
            + "D. g++.",
            "Trình biên dịch nào được sử dụng phổ biến cho C trên Windows?\n"
            + "\n"
            + "A. cl.exe.\n"
            + "B. gcc.\n"
            + "C. javac.\n"
            + "D. g++.",
            "Bước nào trong quá trình biên dịch kiểm tra lỗi cú pháp và lỗi kiểu dữ liệu?\n"
            + "\n"
            + "A. Liên kết (linking).\n"
            + "B. Tiền xử lý (preprocessing).\n"
            + "C. Biên dịch (compilation).\n"
            + "D. Nạp (loading).",
            "Bước nào trong quá trình biên dịch tạo ra bảng ký hiệu (symbol table)?\n"
            + "\n"
            + "A. Liên kết (linking).\n"
            + "B. Tiền xử lý (preprocessing).\n"
            + "C. Biên dịch (compilation).\n"
            + "D. Nạp (loading).",});

        TITLE_MAP.put("Trình biên dịch và trình liên kết", new String[]{
            "Trình biên dịch (compiler) làm gì?\n"
            + "\n"
            + "A. Chuyển đổi mã nguồn C thành mã máy.\n"
            + "B. Liên kết các tệp mã đối tượng thành tệp thực thi.\n"
            + "C. Nạp tệp thực thi vào bộ nhớ.\n"
            + "D. Thực thi chương trình.",
            "Trình liên kết (linker) làm gì?\n"
            + "\n"
            + "A. Chuyển đổi mã nguồn C thành mã máy.\n"
            + "B. Liên kết các tệp mã đối tượng thành tệp thực thi.\n"
            + "C. Nạp tệp thực thi vào bộ nhớ.\n"
            + "D. Thực thi chương trình.",
            "Tệp mã đối tượng (object file) chứa gì?\n"
            + "\n"
            + "A. Mã nguồn C.\n"
            + "B. Mã máy chưa hoàn chỉnh.\n"
            + "C. Tệp thực thi hoàn chỉnh.\n"
            + "D. Dữ liệu đầu vào cho chương trình.",
            "Tệp thực thi (executable file) chứa gì?\n"
            + "\n"
            + "A. Mã nguồn C.\n"
            + "B. Mã máy chưa hoàn chỉnh.\n"
            + "C. Mã máy hoàn chỉnh.\n"
            + "D. Dữ liệu đầu vào cho chương trình.",
            "Thư viện tĩnh (static library) được liên kết vào tệp thực thi như thế nào?\n"
            + "\n"
            + "A. Được nạp vào bộ nhớ khi chương trình chạy.\n"
            + "B. Được sao chép vào tệp thực thi.\n"
            + "C. Được liên kết động khi chương trình chạy.\n"
            + "D. Không được liên kết.",
            "Thư viện động (dynamic library) được liên kết vào tệp thực thi như thế nào?\n"
            + "\n"
            + "A. Được nạp vào bộ nhớ khi chương trình chạy.\n"
            + "B. Được sao chép vào tệp thực thi.\n"
            + "C. Được liên kết động khi chương trình chạy.\n"
            + "D. Không được liên kết.",
            "Ưu điểm của thư viện tĩnh so với thư viện động là gì?\n"
            + "\n"
            + "A. Kích thước tệp thực thi nhỏ hơn.\n"
            + "B. Tốc độ thực thi nhanh hơn.\n"
            + "C. Dễ dàng cập nhật thư viện.\n"
            + "D. Tiết kiệm bộ nhớ khi nhiều chương trình sử dụng chung thư viện.",
            "Ưu điểm của thư viện động so với thư viện tĩnh là gì?\n"
            + "\n"
            + "A. Kích thước tệp thực thi nhỏ hơn.\n"
            + "B. Tốc độ thực thi nhanh hơn.\n"
            + "C. Dễ dàng cập nhật thư viện.\n"
            + "D. Tiết kiệm bộ nhớ khi nhiều chương trình sử dụng chung thư viện.",
            "Trình liên kết có thể giải quyết vấn đề nào?\n"
            + "\n"
            + "A. Lỗi cú pháp trong mã nguồn.\n"
            + "B. Lỗi kiểu dữ liệu trong mã nguồn.\n"
            + "C. Các tham chiếu không được giải quyết (undefined references).\n"
            + "D. Lỗi logic trong chương trình.",
            "Trình biên dịch có thể tạo ra mã máy cho nhiều nền tảng khác nhau không?\n"
            + "\n"
            + "A. Có, thông qua biên dịch chéo (cross-compilation).\n"
            + "B. Không, chỉ tạo ra mã máy cho nền tảng hiện tại.\n"
            + "C. Có, nhưng chỉ cho các nền tảng tương thích.\n"
            + "D. Không, cần có trình biên dịch khác cho mỗi nền tảng.",});

        TITLE_MAP.put("Quá trình thực thi", new String[]{
            "Bước đầu tiên trong quá trình thực thi chương trình C là gì?\n"
            + "\n"
            + "A. Nạp (loading).\n"
            + "B. Thực thi (execution).\n"
            + "C. Giải phóng (unloading).\n"
            + "D. Kết thúc (termination).",
            "Bước nào trong quá trình thực thi nạp tệp thực thi vào bộ nhớ?\n"
            + "\n"
            + "A. Nạp (loading).\n"
            + "B. Thực thi (execution).\n"
            + "C. Giải phóng (unloading).\n"
            + "D. Kết thúc (termination).",
            "Bước nào trong quá trình thực thi thực hiện các lệnh của chương trình?\n"
            + "\n"
            + "A. Nạp (loading).\n"
            + "B. Thực thi (execution).\n"
            + "C. Giải phóng (unloading).\n"
            + "D. Kết thúc (termination).",
            "Bước nào trong quá trình thực thi giải phóng bộ nhớ được cấp phát cho chương trình?\n"
            + "\n"
            + "A. Nạp (loading).\n"
            + "B. Thực thi (execution).\n"
            + "C. Giải phóng (unloading).\n"
            + "D. Kết thúc (termination).",
            "Bước nào trong quá trình thực thi kết thúc chương trình?\n"
            + "\n"
            + "A. Nạp (loading).\n"
            + "B. Thực thi (execution).\n"
            + "C. Giải phóng (unloading).\n"
            + "D. Kết thúc (termination).",
            "Bộ nhớ nào được sử dụng để lưu trữ mã chương trình và dữ liệu tĩnh?\n"
            + "\n"
            + "A. Bộ nhớ heap.\n"
            + "B. Bộ nhớ stack.\n"
            + "C. Bộ nhớ dữ liệu.\n"
            + "D. Bộ nhớ đăng ký.",
            "Bộ nhớ nào được sử dụng để lưu trữ các biến cục bộ và tham số hàm?\n"
            + "\n"
            + "A. Bộ nhớ heap.\n"
            + "B. Bộ nhớ stack.\n"
            + "C. Bộ nhớ dữ liệu.\n"
            + "D. Bộ nhớ đăng ký.",
            "Bộ nhớ nào được sử dụng để lưu trữ các biến được cấp phát động?\n"
            + "\n"
            + "A. Bộ nhớ heap.\n"
            + "B. Bộ nhớ stack.\n"
            + "C. Bộ nhớ dữ liệu.\n"
            + "D. Bộ nhớ đăng ký.",
            "Thanh ghi (register) được sử dụng để làm gì trong quá trình thực thi?\n"
            + "\n"
            + "A. Lưu trữ mã chương trình.\n"
            + "B. Lưu trữ dữ liệu tĩnh.\n"
            + "C. Lưu trữ các biến cục bộ.\n"
            + "D. Lưu trữ các giá trị tạm thời và địa chỉ bộ nhớ.",
            "Điều gì xảy ra nếu chương trình cố gắng truy cập vào một vùng nhớ không được cấp phát?\n"
            + "\n"
            + "A. Chương trình sẽ tiếp tục chạy mà không có lỗi.\n"
            + "B. Chương trình sẽ báo lỗi và kết thúc.\n"
            + "C. Chương trình sẽ cấp phát thêm bộ nhớ.\n"
            + "D. Chương trình sẽ ghi đè lên dữ liệu khác.",});

        TITLE_MAP.put("Câu lệnh if", new String[]{
            "Cú pháp của câu lệnh if trong C là gì?\n"
            + "\n"
            + "A. if (điều_kiện) { khối_lệnh; }.\n"
            + "B. if điều_kiện then khối_lệnh end if.\n"
            + "C. if điều_kiện: khối_lệnh.\n"
            + "D. if khối_lệnh where điều_kiện.",
            "Điều kiện trong câu lệnh if phải có kiểu dữ liệu nào?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. char.\n"
            + "D. _Bool.",
            "Nếu điều kiện trong câu lệnh if là sai, khối lệnh bên trong if có được thực thi không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Tùy thuộc vào trình biên dịch.\n"
            + "D. Tùy thuộc vào hệ điều hành.",
            "Khối lệnh trong câu lệnh if được đặt trong dấu nào?\n"
            + "\n"
            + "A. Dấu ngoặc tròn ().\n"
            + "B. Dấu ngoặc vuông [].\n"
            + "C. Dấu ngoặc nhọn {}.\n"
            + "D. Dấu ngoặc kép \"\".",
            "Điều gì xảy ra nếu bạn không đặt khối lệnh trong dấu ngoặc nhọn {} trong câu lệnh if?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chỉ câu lệnh đầu tiên sau if được thực thi.\n"
            + "C. Khối lệnh sẽ được thực thi bất kể điều kiện.\n"
            + "D. Chương trình sẽ chạy nhưng kết quả không chính xác.",
            "Toán tử nào được sử dụng để kiểm tra sự bằng nhau trong điều kiện if?\n"
            + "\n"
            + "A. =.\n"
            + "B. ==.\n"
            + "C. !=.\n"
            + "D. <>.",
            "Toán tử nào được sử dụng để kiểm tra sự khác nhau trong điều kiện if?\n"
            + "\n"
            + "A. =.\n"
            + "B. ==.\n"
            + "C. !=.\n"
            + "D. <>.",
            "Toán tử nào được sử dụng để kiểm tra điều kiện logic AND trong điều kiện if?\n"
            + "\n"
            + "A. &&.\n"
            + "B. ||.\n"
            + "C. !.\n"
            + "D. &.",
            "Toán tử nào được sử dụng để kiểm tra điều kiện logic OR trong điều kiện if?\n"
            + "\n"
            + "A. &&.\n"
            + "B. ||.\n"
            + "C. !.\n"
            + "D. |.",
            "Toán tử nào được sử dụng để kiểm tra điều kiện logic NOT trong điều kiện if?\n"
            + "\n"
            + "A. &&.\n"
            + "B. ||.\n"
            + "C. !.\n"
            + "D. ~.",});

        TITLE_MAP.put("Câu lệnh if-else", new String[]{
            "Cú pháp của câu lệnh if-else trong C là gì?\n"
            + "\n"
            + "A. if (điều_kiện) { khối_lệnh_1; } else { khối_lệnh_2; }.\n"
            + "B. if điều_kiện then khối_lệnh_1 else khối_lệnh_2 end if.\n"
            + "C. if điều_kiện: khối_lệnh_1 else: khối_lệnh_2.\n"
            + "D. if khối_lệnh_1 where điều_kiện else khối_lệnh_2.",
            "Nếu điều kiện trong câu lệnh if-else là đúng, khối lệnh nào được thực thi?\n"
            + "\n"
            + "A. Khối lệnh 1.\n"
            + "B. Khối lệnh 2.\n"
            + "C. Cả hai khối lệnh.\n"
            + "D. Không có khối lệnh nào.",
            "Nếu điều kiện trong câu lệnh if-else là sai, khối lệnh nào được thực thi?\n"
            + "\n"
            + "A. Khối lệnh 1.\n"
            + "B. Khối lệnh 2.\n"
            + "C. Cả hai khối lệnh.\n"
            + "D. Không có khối lệnh nào.",
            "Câu lệnh else có bắt buộc phải có trong câu lệnh if-else không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Tùy thuộc vào trình biên dịch.\n"
            + "D. Tùy thuộc vào hệ điều hành.",
            "Câu lệnh if-else có thể được lồng nhau không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ lồng nhau một cấp.\n"
            + "D. Chỉ lồng nhau hai cấp.",
            "Câu lệnh nào sau đây tương đương với câu lệnh if-else?\n"
            + "\n"
            + "A. switch-case.\n"
            + "B. while.\n"
            + "C. for.\n"
            + "D. do-while.",
            "Câu lệnh if-else được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lặp lại một khối lệnh nhiều lần.\n"
            + "B. Chọn một trong hai khối lệnh để thực thi dựa trên điều kiện.\n"
            + "C. Định nghĩa một hàm.\n"
            + "D. Khai báo một biến.",
            "Điều gì xảy ra nếu bạn sử dụng câu lệnh else mà không có câu lệnh if đi kèm?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ bỏ qua câu lệnh else.\n"
            + "D. Chương trình sẽ thực thi câu lệnh else bất kể điều kiện.",
            "Điều gì xảy ra nếu bạn sử dụng câu lệnh if mà không có điều kiện?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ bỏ qua câu lệnh if.\n"
            + "D. Chương trình sẽ thực thi câu lệnh if bất kể điều kiện.",
            "Điều gì xảy ra nếu bạn sử dụng câu lệnh if với một khối lệnh trống?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ bỏ qua câu lệnh if.\n"
            + "D. Chương trình sẽ thực thi câu lệnh if bất kể điều kiện.",});

        TITLE_MAP.put("Câu lệnh switch-case", new String[]{
            "Cú pháp của câu lệnh switch-case trong C là gì?\n"
            + "\n"
            + "A. switch (biểu_thức) { case giá_trị_1: khối_lệnh_1; break; case giá_trị_2: khối_lệnh_2; break; default: khối_lệnh_3; }.\n"
            + "B. switch biểu_thức case giá_trị_1: khối_lệnh_1; case giá_trị_2: khối_lệnh_2; default: khối_lệnh_3; end switch.\n"
            + "C. switch biểu_thức: case giá_trị_1: khối_lệnh_1; case giá_trị_2: khối_lệnh_2; default: khối_lệnh_3;.\n"
            + "D. switch khối_lệnh_1 where biểu_thức case giá_trị_1: khối_lệnh_2 case giá_trị_2: khối_lệnh_3 default: khối_lệnh_4.",
            "Biểu thức trong câu lệnh switch-case phải có kiểu dữ liệu nào?\n"
            + "\n"
            + "A. int hoặc char.\n"
            + "B. float hoặc double.\n"
            + "C. string.\n"
            + "D. _Bool.",
            "Từ khóa nào được sử dụng để kết thúc một trường hợp (case) trong câu lệnh switch-case?\n"
            + "\n"
            + "A. end.\n"
            + "B. exit.\n"
            + "C. break.\n"
            + "D. return.",
            "Từ khóa nào được sử dụng để định nghĩa trường hợp mặc định (default) trong câu lệnh switch-case?\n"
            + "\n"
            + "A. else.\n"
            + "B. default.\n"
            + "C. otherwise.\n"
            + "D. fallback.",
            "Điều gì xảy ra nếu bạn không sử dụng từ khóa break sau mỗi trường hợp (case) trong câu lệnh switch-case?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ thực thi tất cả các trường hợp sau đó.\n"
            + "C. Chương trình sẽ bỏ qua các trường hợp sau đó.\n"
            + "D. Chương trình sẽ chạy nhưng kết quả không chính xác.",
            "Câu lệnh switch-case có thể được sử dụng thay thế cho câu lệnh nào?\n"
            + "\n"
            + "A. if-else.\n"
            + "B. while.\n"
            + "C. for.\n"
            + "D. do-while.",
            "Câu lệnh switch-case được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lặp lại một khối lệnh nhiều lần.\n"
            + "B. Chọn một trong nhiều khối lệnh để thực thi dựa trên giá trị của biểu thức.\n"
            + "C. Định nghĩa một hàm.\n"
            + "D. Khai báo một biến.",
            "Điều gì xảy ra nếu giá trị của biểu thức không khớp với bất kỳ trường hợp (case) nào trong câu lệnh switch-case?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ thực thi trường hợp mặc định (default).\n"
            + "C. Chương trình sẽ bỏ qua câu lệnh switch-case.\n"
            + "D. Chương trình sẽ thực thi trường hợp đầu tiên.",
            "Điều gì xảy ra nếu bạn sử dụng câu lệnh switch-case mà không có trường hợp mặc định (default)?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ bỏ qua câu lệnh switch-case.\n"
            + "D. Chương trình sẽ thực thi trường hợp đầu tiên.",
            "Điều gì xảy ra nếu bạn sử dụng câu lệnh switch-case với một biểu thức không phải là số nguyên hoặc ký tự?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ bỏ qua câu lệnh switch-case.\n"
            + "D. Chương trình sẽ thực thi trường hợp đầu tiên.",});

        TITLE_MAP.put("Vòng lặp for", new String[]{
            "Cú pháp của vòng lặp for trong C là gì?\n"
            + "\n"
            + "A. for (khởi_tạo; điều_kiện; cập_nhật) { khối_lệnh; }.\n"
            + "B. for khởi_tạo to điều_kiện step cập_nhật do khối_lệnh end for.\n"
            + "C. for khởi_tạo, điều_kiện, cập_nhật: khối_lệnh.\n"
            + "D. for khối_lệnh where khởi_tạo, điều_kiện, cập_nhật.",
            "Phần nào trong vòng lặp for được thực thi trước khi vòng lặp bắt đầu?\n"
            + "\n"
            + "A. Khởi tạo.\n"
            + "B. Điều kiện.\n"
            + "C. Cập nhật.\n"
            + "D. Khối lệnh.",
            "Phần nào trong vòng lặp for được kiểm tra trước mỗi lần lặp?\n"
            + "\n"
            + "A. Khởi tạo.\n"
            + "B. Điều kiện.\n"
            + "C. Cập nhật.\n"
            + "D. Khối lệnh.",
            "Phần nào trong vòng lặp for được thực thi sau mỗi lần lặp?\n"
            + "\n"
            + "A. Khởi tạo.\n"
            + "B. Điều kiện.\n"
            + "C. Cập nhật.\n"
            + "D. Khối lệnh.",
            "Điều kiện trong vòng lặp for phải có kiểu dữ liệu nào?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. char.\n"
            + "D. _Bool.",
            "Vòng lặp for được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lặp lại một khối lệnh một số lần xác định.\n"
            + "B. Lặp lại một khối lệnh cho đến khi điều kiện sai.\n"
            + "C. Chọn một trong nhiều khối lệnh để thực thi.\n"
            + "D. Định nghĩa một hàm.",
            "Điều gì xảy ra nếu điều kiện trong vòng lặp for luôn đúng?\n"
            + "\n"
            + "A. Vòng lặp sẽ kết thúc ngay lập tức.\n"
            + "B. Vòng lặp sẽ lặp lại vô hạn.\n"
            + "C. Chương trình sẽ báo lỗi biên dịch.\n"
            + "D. Chương trình sẽ bỏ qua vòng lặp.",
            "Bạn có thể sử dụng câu lệnh break bên trong vòng lặp for không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng câu lệnh continue bên trong vòng lặp for không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn không khai báo biến trong phần khởi tạo của vòng lặp for?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ tự động khai báo biến.\n"
            + "D. Chương trình sẽ bỏ qua vòng lặp.",});

        TITLE_MAP.put("Vòng lặp while", new String[]{
            "Cú pháp của vòng lặp while trong C là gì?\n"
            + "\n"
            + "A. while (điều_kiện) { khối_lệnh; }.\n"
            + "B. while điều_kiện do khối_lệnh end while.\n"
            + "C. while điều_kiện: khối_lệnh.\n"
            + "D. while khối_lệnh where điều_kiện.",
            "Điều kiện trong vòng lặp while phải có kiểu dữ liệu nào?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. char.\n"
            + "D. _Bool.",
            "Nếu điều kiện trong vòng lặp while là sai ngay từ đầu, khối lệnh bên trong while có được thực thi không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Tùy thuộc vào trình biên dịch.\n"
            + "D. Tùy thuộc vào hệ điều hành.",
            "Vòng lặp while được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lặp lại một khối lệnh một số lần xác định.\n"
            + "B. Lặp lại một khối lệnh cho đến khi điều kiện sai.\n"
            + "C. Chọn một trong nhiều khối lệnh để thực thi.\n"
            + "D. Định nghĩa một hàm.",
            "Điều gì xảy ra nếu điều kiện trong vòng lặp while luôn đúng?\n"
            + "\n"
            + "A. Vòng lặp sẽ kết thúc ngay lập tức.\n"
            + "B. Vòng lặp sẽ lặp lại vô hạn.\n"
            + "C. Chương trình sẽ báo lỗi biên dịch.\n"
            + "D. Chương trình sẽ bỏ qua vòng lặp.",
            "Bạn có thể sử dụng câu lệnh break bên trong vòng lặp while không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng câu lệnh continue bên trong vòng lặp while không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn không cập nhật biến trong điều kiện của vòng lặp while?\n"
            + "\n"
            + "A. Vòng lặp sẽ kết thúc ngay lập tức.\n"
            + "B. Vòng lặp sẽ lặp lại vô hạn.\n"
            + "C. Chương trình sẽ báo lỗi biên dịch.\n"
            + "D. Chương trình sẽ bỏ qua vòng lặp.",
            "Vòng lặp while có thể được sử dụng thay thế cho vòng lặp nào?\n"
            + "\n"
            + "A. for.\n"
            + "B. do-while.\n"
            + "C. switch-case.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn sử dụng vòng lặp while với một khối lệnh trống?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ bỏ qua vòng lặp.\n"
            + "D. Chương trình sẽ thực thi vòng lặp vô hạn.",});

        TITLE_MAP.put("Vòng lặp do-while", new String[]{
            "Cú pháp của vòng lặp do-while trong C là gì?\n"
            + "\n"
            + "A. do { khối_lệnh; } while (điều_kiện);.\n"
            + "B. do khối_lệnh while điều_kiện end do.\n"
            + "C. do: khối_lệnh while điều_kiện.\n"
            + "D. while điều_kiện do khối_lệnh end do.",
            "Điều kiện trong vòng lặp do-while phải có kiểu dữ liệu nào?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. char.\n"
            + "D. _Bool.",
            "Khối lệnh bên trong vòng lặp do-while được thực thi ít nhất bao nhiêu lần?\n"
            + "\n"
            + "A. 0 lần.\n"
            + "B. 1 lần.\n"
            + "C. 2 lần.\n"
            + "D. Vô hạn lần.",
            "Vòng lặp do-while được sử dụng để làm gì?\n"
            + "\n"
            + "A. Lặp lại một khối lệnh một số lần xác định.\n"
            + "B. Lặp lại một khối lệnh cho đến khi điều kiện sai, đảm bảo khối lệnh được thực thi ít nhất một lần.\n"
            + "C. Chọn một trong nhiều khối lệnh để thực thi.\n"
            + "D. Định nghĩa một hàm.",
            "Điều gì xảy ra nếu điều kiện trong vòng lặp do-while luôn đúng?\n"
            + "\n"
            + "A. Vòng lặp sẽ kết thúc ngay lập tức.\n"
            + "B. Vòng lặp sẽ lặp lại vô hạn.\n"
            + "C. Chương trình sẽ báo lỗi biên dịch.\n"
            + "D. Chương trình sẽ bỏ qua vòng lặp.",
            "Bạn có thể sử dụng câu lệnh break bên trong vòng lặp do-while không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng câu lệnh continue bên trong vòng lặp do-while không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn không cập nhật biến trong điều kiện của vòng lặp do-while?\n"
            + "\n"
            + "A. Vòng lặp sẽ kết thúc ngay lập tức.\n"
            + "B. Vòng lặp sẽ lặp lại vô hạn.\n"
            + "C. Chương trình sẽ báo lỗi biên dịch.\n"
            + "D. Chương trình sẽ bỏ qua vòng lặp.",
            "Vòng lặp do-while có thể được sử dụng thay thế cho vòng lặp nào?\n"
            + "\n"
            + "A. for.\n"
            + "B. while.\n"
            + "C. switch-case.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn sử dụng vòng lặp do-while với một khối lệnh trống?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy mà không có lỗi.\n"
            + "C. Chương trình sẽ bỏ qua vòng lặp.\n"
            + "D. Chương trình sẽ thực thi vòng lặp vô hạn.",});

        TITLE_MAP.put("Khai báo mảng một chiều", new String[]{
            "Cú pháp khai báo mảng một chiều trong C là gì?\n"
            + "\n"
            + "A. kiểu_dữ_liệu tên_mảng[kích_thước];.\n"
            + "B. array tên_mảng[kích_thước] of kiểu_dữ_liệu;.\n"
            + "C. tên_mảng = array[kích_thước] of kiểu_dữ_liệu;.\n"
            + "D. tên_mảng: array[kích_thước] of kiểu_dữ_liệu.",
            "Chỉ số của phần tử đầu tiên trong mảng C là bao nhiêu?\n"
            + "\n"
            + "A. 1.\n"
            + "B. 0.\n"
            + "C. -1.\n"
            + "D. Kích thước mảng.",
            "Nếu bạn khai báo một mảng `int arr[5]`, phần tử cuối cùng của mảng có chỉ số là bao nhiêu?\n"
            + "\n"
            + "A. 5.\n"
            + "B. 4.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Điều gì xảy ra nếu bạn truy cập một phần tử mảng có chỉ số vượt quá kích thước mảng?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ báo lỗi thời gian chạy.\n"
            + "C. Chương trình sẽ truy cập một vùng nhớ không xác định.\n"
            + "D. Chương trình sẽ trả về giá trị mặc định.",
            "Hàm nào được sử dụng để lấy kích thước của mảng trong C?\n"
            + "\n"
            + "A. size().\n"
            + "B. length().\n"
            + "C. sizeof().\n"
            + "D. count().",
            "Mảng C có thể chứa các phần tử có kiểu dữ liệu khác nhau không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Mảng C được lưu trữ ở đâu trong bộ nhớ?\n"
            + "\n"
            + "A. Bộ nhớ heap.\n"
            + "B. Bộ nhớ stack.\n"
            + "C. Bộ nhớ tĩnh.\n"
            + "D. Bộ nhớ đăng ký.",
            "Bạn có thể khởi tạo mảng một chiều trong C khi khai báo không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn không khởi tạo mảng một chiều trong C?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Các phần tử mảng sẽ được khởi tạo với giá trị mặc định.\n"
            + "C. Các phần tử mảng sẽ chứa các giá trị ngẫu nhiên.\n"
            + "D. Chương trình sẽ bỏ qua mảng.",
            "Mảng C có thể được truyền cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Truy cập và thao tác với phần tử trong mảng", new String[]{
            "Để truy cập phần tử thứ i trong mảng arr, bạn sử dụng cú pháp nào?\n"
            + "\n"
            + "A. arr(i).\n"
            + "B. arr[i].\n"
            + "C. arr{i}.\n"
            + "D. arr.get(i).",
            "Để gán giá trị 10 cho phần tử thứ 3 trong mảng arr, bạn sử dụng cú pháp nào?\n"
            + "\n"
            + "A. arr(3) = 10;.\n"
            + "B. arr[2] = 10;.\n"
            + "C. arr{3} = 10;.\n"
            + "D. arr.set(3, 10);.",
            "Bạn có thể sử dụng vòng lặp nào để duyệt qua tất cả các phần tử của mảng một chiều?\n"
            + "\n"
            + "A. Vòng lặp for.\n"
            + "B. Vòng lặp while.\n"
            + "C. Vòng lặp do-while.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn cố gắng truy cập một phần tử mảng có chỉ số âm?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ báo lỗi thời gian chạy.\n"
            + "C. Chương trình sẽ truy cập một vùng nhớ không xác định.\n"
            + "D. Chương trình sẽ trả về giá trị mặc định.",
            "Bạn có thể thay đổi giá trị của một phần tử mảng sau khi mảng đã được khai báo không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng hàm nào để sắp xếp các phần tử của mảng một chiều?\n"
            + "\n"
            + "A. sort().\n"
            + "B. qsort().\n"
            + "C. order().\n"
            + "D. arrange().",
            "Bạn có thể sử dụng hàm nào để tìm kiếm một phần tử trong mảng một chiều?\n"
            + "\n"
            + "A. search().\n"
            + "B. find().\n"
            + "C. binary_search().\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể sử dụng mảng một chiều để lưu trữ chuỗi ký tự không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng mảng một chiều để lưu trữ các kiểu dữ liệu khác nhau không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn cố gắng gán một giá trị không phù hợp với kiểu dữ liệu của phần tử mảng?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ tự động chuyển đổi kiểu dữ liệu.\n"
            + "C. Chương trình sẽ chạy nhưng kết quả không chính xác.\n"
            + "D. Chương trình sẽ bỏ qua giá trị đó.",});

        TITLE_MAP.put("Khai báo mảng hai chiều", new String[]{
            "Cú pháp khai báo mảng hai chiều trong C là gì?\n"
            + "\n"
            + "A. kiểu_dữ_liệu tên_mảng[số_hàng][số_cột];.\n"
            + "B. array tên_mảng[số_hàng, số_cột] of kiểu_dữ_liệu;.\n"
            + "C. tên_mảng = array[số_hàng, số_cột] of kiểu_dữ_liệu;.\n"
            + "D. tên_mảng: array[số_hàng, số_cột] of kiểu_dữ_liệu.",
            "Chỉ số của phần tử đầu tiên trong mảng hai chiều C là bao nhiêu?\n"
            + "\n"
            + "A. 1, 1.\n"
            + "B. 0, 0.\n"
            + "C. -1, -1.\n"
            + "D. Số hàng, số cột.",
            "Nếu bạn khai báo một mảng `int arr[3][4]`, phần tử cuối cùng của mảng có chỉ số là bao nhiêu?\n"
            + "\n"
            + "A. 3, 4.\n"
            + "B. 2, 3.\n"
            + "C. 0, 0.\n"
            + "D. 1, 1.",
            "Mảng hai chiều C được lưu trữ như thế nào trong bộ nhớ?\n"
            + "\n"
            + "A. Theo hàng.\n"
            + "B. Theo cột.\n"
            + "C. Theo đường chéo.\n"
            + "D. Theo khối.",
            "Bạn có thể khởi tạo mảng hai chiều trong C khi khai báo không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn không khởi tạo mảng hai chiều trong C?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Các phần tử mảng sẽ được khởi tạo với giá trị mặc định.\n"
            + "C. Các phần tử mảng sẽ chứa các giá trị ngẫu nhiên.\n"
            + "D. Chương trình sẽ bỏ qua mảng.",
            "Mảng hai chiều C có thể được truyền cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Mảng hai chiều C thường được sử dụng để biểu diễn gì?\n"
            + "\n"
            + "A. Danh sách liên kết.\n"
            + "B. Ma trận.\n"
            + "C. Cây nhị phân.\n"
            + "D. Hàng đợi.",
            "Bạn có thể sử dụng vòng lặp nào để duyệt qua tất cả các phần tử của mảng hai chiều C?\n"
            + "\n"
            + "A. Vòng lặp for lồng nhau.\n"
            + "B. Vòng lặp while.\n"
            + "C. Vòng lặp do-while.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn truy cập một phần tử mảng hai chiều có chỉ số vượt quá kích thước mảng?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ báo lỗi thời gian chạy.\n"
            + "C. Chương trình sẽ truy cập một vùng nhớ không xác định.\n"
            + "D. Chương trình sẽ trả về giá trị mặc định.",});

        TITLE_MAP.put("Truy cập và thao tác với phần tử", new String[]{
            "Để truy cập phần tử ở hàng i và cột j trong mảng arr, bạn sử dụng cú pháp nào?\n"
            + "\n"
            + "A. arr(i, j).\n"
            + "B. arr[i][j].\n"
            + "C. arr{i, j}.\n"
            + "D. arr.get(i, j).",
            "Để gán giá trị 10 cho phần tử ở hàng 2 và cột 3 trong mảng arr, bạn sử dụng cú pháp nào?\n"
            + "\n"
            + "A. arr(2, 3) = 10;.\n"
            + "B. arr[1][2] = 10;.\n"
            + "C. arr{2, 3} = 10;.\n"
            + "D. arr.set(2, 3, 10);.",
            "Bạn có thể sử dụng vòng lặp nào để duyệt qua tất cả các phần tử của mảng hai chiều?\n"
            + "\n"
            + "A. Vòng lặp for lồng nhau.\n"
            + "B. Vòng lặp while.\n"
            + "C. Vòng lặp do-while.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn cố gắng truy cập một phần tử mảng hai chiều có chỉ số âm?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ báo lỗi thời gian chạy.\n"
            + "C. Chương trình sẽ truy cập một vùng nhớ không xác định.\n"
            + "D. Chương trình sẽ trả về giá trị mặc định.",
            "Bạn có thể thay đổi giá trị của một phần tử mảng hai chiều sau khi mảng đã được khai báo không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng mảng hai chiều để lưu trữ ma trận không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng mảng hai chiều để lưu trữ bảng dữ liệu không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng mảng hai chiều để lưu trữ hình ảnh không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng mảng hai chiều để lưu trữ trò chơi không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn cố gắng gán một giá trị không phù hợp với kiểu dữ liệu của phần tử mảng hai chiều?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ tự động chuyển đổi kiểu dữ liệu.\n"
            + "C. Chương trình sẽ chạy nhưng kết quả không chính xác.\n"
            + "D. Chương trình sẽ bỏ qua giá trị đó.",});

        TITLE_MAP.put("Khai báo chuỗi", new String[]{
            "Chuỗi ký tự trong C được biểu diễn như thế nào?\n"
            + "\n"
            + "A. Mảng các ký tự.\n"
            + "B. Kiểu dữ liệu string.\n"
            + "C. Danh sách liên kết các ký tự.\n"
            + "D. Cấu trúc dữ liệu chuỗi.",
            "Ký tự kết thúc chuỗi trong C là gì?\n"
            + "\n"
            + "A. '\\n'.\n"
            + "B. '\\0'.\n"
            + "C. '\\t'.\n"
            + "D. '\\r'.",
            "Bạn có thể khởi tạo chuỗi ký tự trong C khi khai báo không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn không khởi tạo chuỗi ký tự trong C?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chuỗi ký tự sẽ được khởi tạo với giá trị mặc định.\n"
            + "C. Chuỗi ký tự sẽ chứa các ký tự ngẫu nhiên.\n"
            + "D. Chương trình sẽ bỏ qua chuỗi ký tự.",
            "Bạn có thể sử dụng mảng ký tự để lưu trữ chuỗi ký tự không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng con trỏ để lưu trữ chuỗi ký tự không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng chuỗi ký tự để lưu trữ các kiểu dữ liệu khác nhau không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn cố gắng gán một chuỗi ký tự lớn hơn kích thước của mảng ký tự?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ ghi đè lên các vùng nhớ khác.\n"
            + "C. Chương trình sẽ cắt bớt chuỗi ký tự.\n"
            + "D. Chương trình sẽ tự động cấp phát thêm bộ nhớ.",
            "Bạn có thể truyền chuỗi ký tự cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể trả về chuỗi ký tự từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Các hàm xử lý chuỗi", new String[]{
            "Hàm nào được sử dụng để tính độ dài của chuỗi trong C?\n"
            + "\n"
            + "A. length().\n"
            + "B. size().\n"
            + "C. strlen().\n"
            + "D. count().",
            "Hàm nào được sử dụng để sao chép chuỗi trong C?\n"
            + "\n"
            + "A. copy().\n"
            + "B. strcpy().\n"
            + "C. duplicate().\n"
            + "D. clone().",
            "Hàm nào được sử dụng để nối hai chuỗi trong C?\n"
            + "\n"
            + "A. concatenate().\n"
            + "B. append().\n"
            + "C. strcat().\n"
            + "D. join().",
            "Hàm nào được sử dụng để so sánh hai chuỗi trong C?\n"
            + "\n"
            + "A. compare().\n"
            + "B. equals().\n"
            + "C. strcmp().\n"
            + "D. match().",
            "Hàm nào được sử dụng để tìm kiếm một chuỗi con trong chuỗi trong C?\n"
            + "\n"
            + "A. search().\n"
            + "B. find().\n"
            + "C. strstr().\n"
            + "D. locate().",
            "Hàm nào được sử dụng để chuyển đổi chuỗi thành số nguyên trong C?\n"
            + "\n"
            + "A. atoi().\n"
            + "B. toInt().\n"
            + "C. parse().\n"
            + "D. convert().",
            "Hàm nào được sử dụng để chuyển đổi chuỗi thành số thực trong C?\n"
            + "\n"
            + "A. atof().\n"
            + "B. toFloat().\n"
            + "C. parse().\n"
            + "D. convert().",
            "Hàm nào được sử dụng để chuyển đổi số nguyên thành chuỗi trong C?\n"
            + "\n"
            + "A. itoa().\n"
            + "B. toString().\n"
            + "C. format().\n"
            + "D. convert().",
            "Hàm nào được sử dụng để chuyển đổi số thực thành chuỗi trong C?\n"
            + "\n"
            + "A. ftoa().\n"
            + "B. toString().\n"
            + "C. format().\n"
            + "D. convert().",
            "Bạn có thể sử dụng hàm nào để đọc chuỗi từ bàn phím trong C?\n"
            + "\n"
            + "A. read().\n"
            + "B. get().\n"
            + "C. fgets().\n"
            + "D. input().",});

        TITLE_MAP.put("So sánh và nối chuỗi", new String[]{
            "Hàm `strcmp()` trả về giá trị nào nếu hai chuỗi bằng nhau?\n"
            + "\n"
            + "A. 1.\n"
            + "B. 0.\n"
            + "C. -1.\n"
            + "D. Một giá trị khác.",
            "Hàm `strcmp()` trả về giá trị nào nếu chuỗi thứ nhất lớn hơn chuỗi thứ hai?\n"
            + "\n"
            + "A. 1.\n"
            + "B. 0.\n"
            + "C. -1.\n"
            + "D. Một giá trị khác.",
            "Hàm `strcmp()` trả về giá trị nào nếu chuỗi thứ nhất nhỏ hơn chuỗi thứ hai?\n"
            + "\n"
            + "A. 1.\n"
            + "B. 0.\n"
            + "C. -1.\n"
            + "D. Một giá trị khác.",
            "Hàm `strcat()` có thay đổi chuỗi thứ nhất không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Hàm `strcat()` có thay đổi chuỗi thứ hai không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn cố gắng nối hai chuỗi mà chuỗi kết quả vượt quá kích thước của mảng ký tự?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ ghi đè lên các vùng nhớ khác.\n"
            + "C. Chương trình sẽ cắt bớt chuỗi kết quả.\n"
            + "D. Chương trình sẽ tự động cấp phát thêm bộ nhớ.",
            "Bạn có thể sử dụng toán tử nào để nối hai chuỗi trong C?\n"
            + "\n"
            + "A. +.\n"
            + "B. &.\n"
            + "C. |.\n"
            + "D. Không có toán tử nào.",
            "Bạn có thể sử dụng toán tử nào để so sánh hai chuỗi trong C?\n"
            + "\n"
            + "A. ==.\n"
            + "B. !=.\n"
            + "C. <, >.\n"
            + "D. Không có toán tử nào.",
            "Bạn có thể sử dụng hàm nào để so sánh hai chuỗi không phân biệt chữ hoa chữ thường trong C?\n"
            + "\n"
            + "A. strcmp().\n"
            + "B. strcmpi().\n"
            + "C. strcasecmp().\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể sử dụng hàm nào để tìm kiếm một ký tự trong chuỗi trong C?\n"
            + "\n"
            + "A. find().\n"
            + "B. locate().\n"
            + "C. strchr().\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Khái niệm về con trỏ", new String[]{
            "Con trỏ trong C là gì?\n"
            + "\n"
            + "A. Một biến lưu trữ địa chỉ bộ nhớ.\n"
            + "B. Một kiểu dữ liệu mới.\n"
            + "C. Một hàm đặc biệt.\n"
            + "D. Một cấu trúc dữ liệu.",
            "Con trỏ được sử dụng để làm gì?\n"
            + "\n"
            + "A. Truy cập trực tiếp vào bộ nhớ.\n"
            + "B. Truyền tham số cho hàm theo tham chiếu.\n"
            + "C. Cấp phát bộ nhớ động.\n"
            + "D. Tất cả các đáp án trên.",
            "Kiểu dữ liệu của con trỏ là gì?\n"
            + "\n"
            + "A. Kiểu dữ liệu của biến mà nó trỏ đến.\n"
            + "B. Kiểu dữ liệu void *.\n"
            + "C. Kiểu dữ liệu pointer.\n"
            + "D. Không có kiểu dữ liệu.",
            "Bạn có thể gán địa chỉ của biến nào cho con trỏ kiểu int *?\n"
            + "\n"
            + "A. Biến kiểu int.\n"
            + "B. Biến kiểu float.\n"
            + "C. Biến kiểu char.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể gán địa chỉ của biến nào cho con trỏ kiểu void *?\n"
            + "\n"
            + "A. Biến kiểu int.\n"
            + "B. Biến kiểu float.\n"
            + "C. Biến kiểu char.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn truy cập vào địa chỉ bộ nhớ mà con trỏ trỏ đến nhưng địa chỉ đó không hợp lệ?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ báo lỗi thời gian chạy.\n"
            + "C. Chương trình sẽ truy cập vào một vùng nhớ ngẫu nhiên.\n"
            + "D. Chương trình sẽ trả về giá trị mặc định.",
            "Bạn có thể sử dụng con trỏ để truy cập các phần tử của mảng không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng con trỏ để truyền mảng cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng con trỏ để trả về mảng từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng con trỏ để cấp phát bộ nhớ động không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Khai báo con trỏ", new String[]{
            "Cú pháp khai báo con trỏ trong C là gì?\n"
            + "\n"
            + "A. kiểu_dữ_liệu *tên_con_trỏ;.\n"
            + "B. pointer tên_con_trỏ of kiểu_dữ_liệu;.\n"
            + "C. tên_con_trỏ = pointer of kiểu_dữ_liệu;.\n"
            + "D. tên_con_trỏ: pointer of kiểu_dữ_liệu.",
            "Kiểu dữ liệu nào được sử dụng để khai báo con trỏ trỏ đến địa chỉ của biến kiểu int?\n"
            + "\n"
            + "A. int *.\n"
            + "B. float *.\n"
            + "C. char *.\n"
            + "D. void *.",
            "Kiểu dữ liệu nào được sử dụng để khai báo con trỏ trỏ đến địa chỉ của biến kiểu float?\n"
            + "\n"
            + "A. int *.\n"
            + "B. float *.\n"
            + "C. char *.\n"
            + "D. void *.",
            "Kiểu dữ liệu nào được sử dụng để khai báo con trỏ trỏ đến địa chỉ của biến kiểu char?\n"
            + "\n"
            + "A. int *.\n"
            + "B. float *.\n"
            + "C. char *.\n"
            + "D. void *.",
            "Kiểu dữ liệu nào được sử dụng để khai báo con trỏ trỏ đến địa chỉ của bất kỳ kiểu dữ liệu nào?\n"
            + "\n"
            + "A. int *.\n"
            + "B. float *.\n"
            + "C. char *.\n"
            + "D. void *.",
            "Bạn có thể gán giá trị nào cho con trỏ khi khai báo?\n"
            + "\n"
            + "A. Địa chỉ của biến.\n"
            + "B. NULL.\n"
            + "C. Giá trị của biến.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn không khởi tạo con trỏ khi khai báo?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Con trỏ sẽ được gán giá trị NULL.\n"
            + "C. Con trỏ sẽ trỏ đến một địa chỉ ngẫu nhiên.\n"
            + "D. Chương trình sẽ bỏ qua con trỏ.",
            "Bạn có thể khai báo con trỏ hằng số không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể khai báo con trỏ trỏ đến hằng số không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể khai báo con trỏ trỏ đến con trỏ không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Toán tử con trỏ", new String[]{
            "Toán tử nào được sử dụng để lấy địa chỉ của biến?\n"
            + "\n"
            + "A. *.\n"
            + "B. &.\n"
            + "C. ->.\n"
            + "D. [].",
            "Toán tử nào được sử dụng để lấy giá trị của biến mà con trỏ trỏ đến?\n"
            + "\n"
            + "A. *.\n"
            + "B. &.\n"
            + "C. ->.\n"
            + "D. [].",
            "Toán tử nào được sử dụng để truy cập thành viên của cấu trúc thông qua con trỏ?\n"
            + "\n"
            + "A. *.\n"
            + "B. &.\n"
            + "C. ->.\n"
            + "D. [].",
            "Bạn có thể sử dụng toán tử nào để truy cập phần tử của mảng thông qua con trỏ?\n"
            + "\n"
            + "A. *.\n"
            + "B. &.\n"
            + "C. ->.\n"
            + "D. [].",
            "Bạn có thể thực hiện phép toán nào với con trỏ?\n"
            + "\n"
            + "A. Cộng.\n"
            + "B. Trừ.\n"
            + "C. So sánh.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn cộng một số nguyên vào con trỏ?\n"
            + "\n"
            + "A. Con trỏ sẽ trỏ đến địa chỉ tiếp theo trong bộ nhớ.\n"
            + "B. Con trỏ sẽ trỏ đến địa chỉ cách địa chỉ hiện tại một số byte bằng số nguyên đó.\n"
            + "C. Con trỏ sẽ trỏ đến địa chỉ cách địa chỉ hiện tại một số byte bằng số nguyên đó nhân với kích thước của kiểu dữ liệu mà con trỏ trỏ đến.\n"
            + "D. Chương trình sẽ báo lỗi.",
            "Điều gì xảy ra nếu bạn trừ một số nguyên khỏi con trỏ?\n"
            + "\n"
            + "A. Con trỏ sẽ trỏ đến địa chỉ trước đó trong bộ nhớ.\n"
            + "B. Con trỏ sẽ trỏ đến địa chỉ cách địa chỉ hiện tại một số byte bằng số nguyên đó.\n"
            + "C. Con trỏ sẽ trỏ đến địa chỉ cách địa chỉ hiện tại một số byte bằng số nguyên đó nhân với kích thước của kiểu dữ liệu mà con trỏ trỏ đến.\n"
            + "D. Chương trình sẽ báo lỗi.",
            "Bạn có thể so sánh hai con trỏ không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể gán giá trị nào cho con trỏ?\n"
            + "\n"
            + "A. Địa chỉ của biến.\n"
            + "B. NULL.\n"
            + "C. Giá trị của biến.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể sử dụng con trỏ để truy cập các biến toàn cục không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Cú pháp định nghĩa hàm", new String[]{
            "Cú pháp định nghĩa hàm trong C là gì?\n"
            + "\n"
            + "A. kiểu_trả_về tên_hàm(tham_số) { khối_lệnh; }.\n"
            + "B. function tên_hàm(tham_số) trả_về kiểu_trả_về { khối_lệnh; }.\n"
            + "C. tên_hàm(tham_số) trả_về kiểu_trả_về: khối_lệnh;.\n"
            + "D. tên_hàm: khối_lệnh trả_về kiểu_trả_về với tham_số.",
            "Phần nào trong định nghĩa hàm chỉ định kiểu dữ liệu của giá trị mà hàm trả về?\n"
            + "\n"
            + "A. tên_hàm.\n"
            + "B. tham_số.\n"
            + "C. khối_lệnh.\n"
            + "D. kiểu_trả_về.",
            "Phần nào trong định nghĩa hàm chứa các biến được truyền vào hàm?\n"
            + "\n"
            + "A. tên_hàm.\n"
            + "B. tham_số.\n"
            + "C. khối_lệnh.\n"
            + "D. kiểu_trả_về.",
            "Phần nào trong định nghĩa hàm chứa các câu lệnh thực thi của hàm?\n"
            + "\n"
            + "A. tên_hàm.\n"
            + "B. tham_số.\n"
            + "C. khối_lệnh.\n"
            + "D. kiểu_trả_về.",
            "Bạn có thể định nghĩa hàm không trả về giá trị không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Kiểu trả về nào được sử dụng cho hàm không trả về giá trị?\n"
            + "\n"
            + "A. int.\n"
            + "B. float.\n"
            + "C. char.\n"
            + "D. void.",
            "Bạn có thể định nghĩa hàm có tham số không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể định nghĩa hàm có nhiều tham số không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể định nghĩa hàm bên trong hàm khác không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể định nghĩa hàm có cùng tên với hàm khác không?\n"
            + "\n"
            + "A. Có, nếu chúng có danh sách tham số khác nhau.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Gọi hàm", new String[]{
            "Cú pháp gọi hàm trong C là gì?\n"
            + "\n"
            + "A. tên_hàm(tham_số);.\n"
            + "B. call tên_hàm(tham_số);.\n"
            + "C. tên_hàm(tham_số) call;.\n"
            + "D. call tên_hàm với tham_số.",
            "Bạn có thể gọi hàm trước khi định nghĩa nó không?\n"
            + "\n"
            + "A. Có, nếu bạn khai báo nguyên mẫu hàm trước khi gọi.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể gọi hàm bên trong hàm khác không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể gọi hàm đệ quy không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể gọi hàm mà không truyền tham số không?\n"
            + "\n"
            + "A. Có, nếu hàm không có tham số.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể gọi hàm mà không quan tâm đến giá trị trả về không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể gọi hàm nhiều lần không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể gọi hàm từ hàm main() không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể gọi hàm mà không cần khai báo nguyên mẫu hàm không?\n"
            + "\n"
            + "A. Có, nếu hàm được định nghĩa trước khi gọi.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn gọi hàm với số lượng tham số không đúng?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ chạy nhưng kết quả không chính xác.\n"
            + "C. Chương trình sẽ bỏ qua các tham số thừa hoặc thiếu.\n"
            + "D. Chương trình sẽ tự động chuyển đổi kiểu dữ liệu của tham số.",});

        TITLE_MAP.put("Hàm trả về giá trị", new String[]{
            "Từ khóa nào được sử dụng để trả về giá trị từ hàm?\n"
            + "\n"
            + "A. return.\n"
            + "B. exit.\n"
            + "C. break.\n"
            + "D. continue.",
            "Kiểu dữ liệu của giá trị trả về phải khớp với kiểu dữ liệu nào?\n"
            + "\n"
            + "A. Kiểu dữ liệu của tham số.\n"
            + "B. Kiểu dữ liệu của biến cục bộ.\n"
            + "C. Kiểu dữ liệu của kiểu trả về của hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể trả về nhiều giá trị từ hàm không?\n"
            + "\n"
            + "A. Không.\n"
            + "B. Có, sử dụng con trỏ hoặc mảng.\n"
            + "C. Có, sử dụng cấu trúc hoặc union.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể trả về con trỏ từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể trả về mảng từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể trả về cấu trúc từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể trả về union từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể trả về hàm từ hàm không?\n"
            + "\n"
            + "A. Không.\n"
            + "B. Có, sử dụng con trỏ hàm.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn không trả về giá trị từ hàm có kiểu trả về không phải void?\n"
            + "\n"
            + "A. Chương trình sẽ báo lỗi biên dịch.\n"
            + "B. Chương trình sẽ trả về giá trị mặc định.\n"
            + "C. Chương trình sẽ trả về giá trị ngẫu nhiên.\n"
            + "D. Chương trình sẽ bỏ qua giá trị trả về.",
            "Bạn có thể sử dụng hàm trả về giá trị để khởi tạo biến không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Truyền tham số theo giá trị", new String[]{
            "Khi truyền tham số theo giá trị, điều gì xảy ra với giá trị của tham số trong hàm?\n"
            + "\n"
            + "A. Giá trị của tham số trong hàm được thay đổi và ảnh hưởng đến giá trị của biến gốc.\n"
            + "B. Giá trị của tham số trong hàm được thay đổi nhưng không ảnh hưởng đến giá trị của biến gốc.\n"
            + "C. Giá trị của tham số trong hàm không được thay đổi.\n"
            + "D. Chương trình báo lỗi.",
            "Kiểu dữ liệu nào có thể được truyền theo giá trị?\n"
            + "\n"
            + "A. Kiểu dữ liệu nguyên thủy (int, float, char,...).\n"
            + "B. Mảng.\n"
            + "C. Con trỏ.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn thay đổi giá trị của tham số trong hàm được truyền theo giá trị?\n"
            + "\n"
            + "A. Giá trị của biến gốc sẽ bị thay đổi.\n"
            + "B. Giá trị của biến gốc sẽ không bị thay đổi.\n"
            + "C. Chương trình sẽ báo lỗi.\n"
            + "D. Kết quả không xác định.",
            "Khi nào bạn nên sử dụng truyền tham số theo giá trị?\n"
            + "\n"
            + "A. Khi bạn muốn thay đổi giá trị của biến gốc.\n"
            + "B. Khi bạn không muốn thay đổi giá trị của biến gốc.\n"
            + "C. Khi bạn muốn truyền mảng hoặc con trỏ cho hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Ưu điểm của truyền tham số theo giá trị là gì?\n"
            + "\n"
            + "A. Ngăn chặn việc thay đổi giá trị của biến gốc ngoài ý muốn.\n"
            + "B. Cho phép thay đổi giá trị của biến gốc.\n"
            + "C. Tăng hiệu suất của chương trình.\n"
            + "D. Tất cả các đáp án trên.",
            "Nhược điểm của truyền tham số theo giá trị là gì?\n"
            + "\n"
            + "A. Không thể thay đổi giá trị của biến gốc.\n"
            + "B. Tốn nhiều bộ nhớ hơn so với truyền tham số theo tham chiếu.\n"
            + "C. Không thể truyền mảng hoặc con trỏ cho hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể truyền bao nhiêu tham số theo giá trị cho hàm?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Tối đa 1.\n"
            + "C. Tối đa 2.\n"
            + "D. Tối đa 3.",
            "Bạn có thể truyền các kiểu dữ liệu khác nhau theo giá trị cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Điều gì xảy ra nếu bạn truyền một mảng theo giá trị cho hàm?\n"
            + "\n"
            + "A. Mảng sẽ được sao chép vào bộ nhớ của hàm.\n"
            + "B. Mảng sẽ được truyền như một con trỏ.\n"
            + "C. Chương trình sẽ báo lỗi.\n"
            + "D. Kết quả không xác định.",
            "Điều gì xảy ra nếu bạn truyền một con trỏ theo giá trị cho hàm?\n"
            + "\n"
            + "A. Con trỏ sẽ được sao chép vào bộ nhớ của hàm.\n"
            + "B. Giá trị mà con trỏ trỏ đến sẽ được sao chép vào bộ nhớ của hàm.\n"
            + "C. Chương trình sẽ báo lỗi.\n"
            + "D. Kết quả không xác định.",});

        TITLE_MAP.put("Truyền tham số theo tham chiếu", new String[]{
            "Khi truyền tham số theo tham chiếu, điều gì xảy ra với giá trị của tham số trong hàm?\n"
            + "\n"
            + "A. Giá trị của tham số trong hàm được thay đổi và ảnh hưởng đến giá trị của biến gốc.\n"
            + "B. Giá trị của tham số trong hàm được thay đổi nhưng không ảnh hưởng đến giá trị của biến gốc.\n"
            + "C. Giá trị của tham số trong hàm không được thay đổi.\n"
            + "D. Chương trình báo lỗi.",
            "Kiểu dữ liệu nào có thể được truyền theo tham chiếu?\n"
            + "\n"
            + "A. Kiểu dữ liệu nguyên thủy (int, float, char,...).\n"
            + "B. Mảng.\n"
            + "C. Con trỏ.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn thay đổi giá trị của tham số trong hàm được truyền theo tham chiếu?\n"
            + "\n"
            + "A. Giá trị của biến gốc sẽ bị thay đổi.\n"
            + "B. Giá trị của biến gốc sẽ không bị thay đổi.\n"
            + "C. Chương trình sẽ báo lỗi.\n"
            + "D. Kết quả không xác định.",
            "Khi nào bạn nên sử dụng truyền tham số theo tham chiếu?\n"
            + "\n"
            + "A. Khi bạn muốn thay đổi giá trị của biến gốc.\n"
            + "B. Khi bạn không muốn thay đổi giá trị của biến gốc.\n"
            + "C. Khi bạn muốn truyền mảng hoặc con trỏ cho hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Ưu điểm của truyền tham số theo tham chiếu là gì?\n"
            + "\n"
            + "A. Cho phép thay đổi giá trị của biến gốc.\n"
            + "B. Ngăn chặn việc thay đổi giá trị của biến gốc ngoài ý muốn.\n"
            + "C. Tăng hiệu suất của chương trình.\n"
            + "D. Tất cả các đáp án trên.",
            "Nhược điểm của truyền tham số theo tham chiếu là gì?\n"
            + "\n"
            + "A. Không thể thay đổi giá trị của biến gốc.\n"
            + "B. Dễ gây ra lỗi nếu không cẩn thận.\n"
            + "C. Không thể truyền mảng hoặc con trỏ cho hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể truyền bao nhiêu tham số theo tham chiếu cho hàm?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Tối đa 1.\n"
            + "C. Tối đa 2.\n"
            + "D. Tối đa 3.",
            "Bạn có thể truyền các kiểu dữ liệu khác nhau theo tham chiếu cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng toán tử nào để truyền tham số theo tham chiếu?\n"
            + "\n"
            + "A. *.\n"
            + "B. &.\n"
            + "C. ->.\n"
            + "D. [].",
            "Điều gì xảy ra nếu bạn truyền một mảng theo tham chiếu cho hàm?\n"
            + "\n"
            + "A. Mảng sẽ được sao chép vào bộ nhớ của hàm.\n"
            + "B. Mảng sẽ được truyền như một con trỏ.\n"
            + "C. Chương trình sẽ báo lỗi.\n"
            + "D. Kết quả không xác định.",});

        TITLE_MAP.put("Sử dụng con trỏ để truyền tham số", new String[]{
            "Khi sử dụng con trỏ để truyền tham số, điều gì xảy ra với giá trị của tham số trong hàm?\n"
            + "\n"
            + "A. Giá trị của tham số trong hàm được thay đổi và ảnh hưởng đến giá trị của biến gốc.\n"
            + "B. Giá trị của tham số trong hàm được thay đổi nhưng không ảnh hưởng đến giá trị của biến gốc.\n"
            + "C. Giá trị của tham số trong hàm không được thay đổi.\n"
            + "D. Chương trình báo lỗi.",
            "Kiểu dữ liệu nào có thể được truyền bằng con trỏ?\n"
            + "\n"
            + "A. Kiểu dữ liệu nguyên thủy (int, float, char,...).\n"
            + "B. Mảng.\n"
            + "C. Con trỏ.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra nếu bạn thay đổi giá trị của tham số trong hàm được truyền bằng con trỏ?\n"
            + "\n"
            + "A. Giá trị của biến gốc sẽ bị thay đổi.\n"
            + "B. Giá trị của biến gốc sẽ không bị thay đổi.\n"
            + "C. Chương trình sẽ báo lỗi.\n"
            + "D. Kết quả không xác định.",
            "Khi nào bạn nên sử dụng con trỏ để truyền tham số?\n"
            + "\n"
            + "A. Khi bạn muốn thay đổi giá trị của biến gốc.\n"
            + "B. Khi bạn không muốn thay đổi giá trị của biến gốc.\n"
            + "C. Khi bạn muốn truyền mảng hoặc con trỏ cho hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Ưu điểm của việc sử dụng con trỏ để truyền tham số là gì?\n"
            + "\n"
            + "A. Cho phép thay đổi giá trị của biến gốc.\n"
            + "B. Ngăn chặn việc thay đổi giá trị của biến gốc ngoài ý muốn.\n"
            + "C. Tăng hiệu suất của chương trình.\n"
            + "D. Tất cả các đáp án trên.",
            "Nhược điểm của việc sử dụng con trỏ để truyền tham số là gì?\n"
            + "\n"
            + "A. Không thể thay đổi giá trị của biến gốc.\n"
            + "B. Dễ gây ra lỗi nếu không cẩn thận.\n"
            + "C. Không thể truyền mảng hoặc con trỏ cho hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể truyền bao nhiêu tham số bằng con trỏ cho hàm?\n"
            + "\n"
            + "A. Không giới hạn.\n"
            + "B. Tối đa 1.\n"
            + "C. Tối đa 2.\n"
            + "D. Tối đa 3.",
            "Bạn có thể truyền các kiểu dữ liệu khác nhau bằng con trỏ cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng toán tử nào để truy cập giá trị của biến gốc thông qua con trỏ?\n"
            + "\n"
            + "A. *.\n"
            + "B. &.\n"
            + "C. ->.\n"
            + "D. [].",
            "Điều gì xảy ra nếu bạn truyền một mảng bằng con trỏ cho hàm?\n"
            + "\n"
            + "A. Mảng sẽ được sao chép vào bộ nhớ của hàm.\n"
            + "B. Mảng sẽ được truyền như một con trỏ.\n"
            + "C. Chương trình sẽ báo lỗi.\n"
            + "D. Kết quả không xác định.",});

        TITLE_MAP.put("Khái niệm hàm đệ quy", new String[]{
            "Hàm đệ quy là gì?\n"
            + "\n"
            + "A. Hàm gọi chính nó.\n"
            + "B. Hàm gọi một hàm khác.\n"
            + "C. Hàm không có tham số.\n"
            + "D. Hàm không trả về giá trị.",
            "Điều kiện dừng của hàm đệ quy là gì?\n"
            + "\n"
            + "A. Điều kiện để hàm tiếp tục gọi chính nó.\n"
            + "B. Điều kiện để hàm dừng việc gọi chính nó.\n"
            + "C. Điều kiện để hàm gọi một hàm khác.\n"
            + "D. Điều kiện để hàm trả về giá trị.",
            "Điều gì xảy ra nếu hàm đệ quy không có điều kiện dừng?\n"
            + "\n"
            + "A. Hàm sẽ gọi chính nó vô hạn lần.\n"
            + "B. Hàm sẽ báo lỗi.\n"
            + "C. Hàm sẽ dừng sau một số lần gọi nhất định.\n"
            + "D. Kết quả không xác định.",
            "Bạn có thể sử dụng hàm đệ quy để giải quyết bài toán nào?\n"
            + "\n"
            + "A. Bài toán có thể chia nhỏ thành các bài toán con tương tự.\n"
            + "B. Bài toán không thể chia nhỏ thành các bài toán con.\n"
            + "C. Bài toán có thể giải quyết bằng vòng lặp.\n"
            + "D. Tất cả các đáp án trên.",
            "Ưu điểm của hàm đệ quy là gì?\n"
            + "\n"
            + "A. Mã nguồn ngắn gọn và dễ hiểu.\n"
            + "B. Giải quyết được các bài toán phức tạp.\n"
            + "C. Tăng hiệu suất của chương trình.\n"
            + "D. Tất cả các đáp án trên.",
            "Nhược điểm của hàm đệ quy là gì?\n"
            + "\n"
            + "A. Tốn nhiều bộ nhớ hơn so với vòng lặp.\n"
            + "B. Dễ gây ra lỗi tràn bộ nhớ stack.\n"
            + "C. Khó gỡ lỗi.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể viết hàm đệ quy cho bài toán tính giai thừa không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể viết hàm đệ quy cho bài toán tính số Fibonacci không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể viết hàm đệ quy cho bài toán tìm kiếm nhị phân không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể viết hàm đệ quy cho bài toán duyệt cây nhị phân không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Cách hoạt động của hàm đệ quy", new String[]{
            "Hàm đệ quy hoạt động như thế nào?\n"
            + "\n"
            + "A. Hàm gọi chính nó cho đến khi đạt điều kiện dừng.\n"
            + "B. Hàm gọi một hàm khác cho đến khi đạt điều kiện dừng.\n"
            + "C. Hàm lặp lại một khối lệnh cho đến khi đạt điều kiện dừng.\n"
            + "D. Hàm trả về giá trị cho đến khi đạt điều kiện dừng.",
            "Điều gì xảy ra khi hàm đệ quy gọi chính nó?\n"
            + "\n"
            + "A. Một bản sao mới của hàm được tạo ra trong bộ nhớ.\n"
            + "B. Hàm tiếp tục thực thi với các tham số mới.\n"
            + "C. Hàm trả về giá trị cho lần gọi trước đó.\n"
            + "D. Tất cả các đáp án trên.",
            "Bộ nhớ stack được sử dụng như thế nào trong hàm đệ quy?\n"
            + "\n"
            + "A. Lưu trữ các biến cục bộ và tham số của mỗi lần gọi hàm.\n"
            + "B. Lưu trữ mã nguồn của hàm.\n"
            + "C. Lưu trữ giá trị trả về của hàm.\n"
            + "D. Lưu trữ địa chỉ của hàm.",
            "Điều gì xảy ra khi hàm đệ quy đạt điều kiện dừng?\n"
            + "\n"
            + "A. Hàm dừng việc gọi chính nó và trả về giá trị.\n"
            + "B. Hàm tiếp tục gọi chính nó với các tham số mới.\n"
            + "C. Hàm báo lỗi tràn bộ nhớ stack.\n"
            + "D. Kết quả không xác định.",
            "Thứ tự thực hiện các lệnh trong hàm đệ quy là gì?\n"
            + "\n"
            + "A. Lệnh gọi đệ quy được thực hiện trước, sau đó là các lệnh khác.\n"
            + "B. Các lệnh khác được thực hiện trước, sau đó là lệnh gọi đệ quy.\n"
            + "C. Các lệnh được thực hiện theo thứ tự xuất hiện trong mã nguồn.\n"
            + "D. Thứ tự thực hiện không xác định.",
            "Điều gì xảy ra nếu hàm đệ quy gọi chính nó quá nhiều lần?\n"
            + "\n"
            + "A. Chương trình báo lỗi tràn bộ nhớ stack.\n"
            + "B. Chương trình chạy chậm hơn.\n"
            + "C. Chương trình trả về kết quả không chính xác.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể sử dụng hàm đệ quy để duyệt cây nhị phân theo thứ tự nào?\n"
            + "\n"
            + "A. Thứ tự trước (preorder).\n"
            + "B. Thứ tự giữa (inorder).\n"
            + "C. Thứ tự sau (postorder).\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể sử dụng hàm đệ quy để sắp xếp mảng không?\n"
            + "\n"
            + "A. Có, sử dụng thuật toán quicksort hoặc mergesort.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng hàm đệ quy để tìm kiếm một phần tử trong mảng không?\n"
            + "\n"
            + "A. Có, sử dụng thuật toán tìm kiếm nhị phân.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể sử dụng hàm đệ quy để giải quyết bài toán tháp Hà Nội không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Ví dụ về hàm đệ quy", new String[]{
            "Hàm đệ quy nào được sử dụng để tính giai thừa của một số?\n"
            + "\n"
            + "A. factorial(n) = n * factorial(n - 1) nếu n > 0, 1 nếu n = 0.\n"
            + "B. factorial(n) = n * factorial(n + 1) nếu n > 0, 1 nếu n = 0.\n"
            + "C. factorial(n) = n + factorial(n - 1) nếu n > 0, 1 nếu n = 0.\n"
            + "D. factorial(n) = n + factorial(n + 1) nếu n > 0, 1 nếu n = 0.",
            "Hàm đệ quy nào được sử dụng để tính số Fibonacci thứ n?\n"
            + "\n"
            + "A. fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2) nếu n > 1, 1 nếu n = 1, 0 nếu n = 0.\n"
            + "B. fibonacci(n) = fibonacci(n + 1) + fibonacci(n + 2) nếu n > 1, 1 nếu n = 1, 0 nếu n = 0.\n"
            + "C. fibonacci(n) = fibonacci(n - 1) - fibonacci(n - 2) nếu n > 1, 1 nếu n = 1, 0 nếu n = 0.\n"
            + "D. fibonacci(n) = fibonacci(n + 1) - fibonacci(n + 2) nếu n > 1, 1 nếu n = 1, 0 nếu n = 0.",
            "Hàm đệ quy nào được sử dụng để tính tổng các phần tử của một mảng?\n"
            + "\n"
            + "A. sum(arr, n) = arr[n - 1] + sum(arr, n - 1) nếu n > 0, 0 nếu n = 0.\n"
            + "B. sum(arr, n) = arr[n - 1] - sum(arr, n - 1) nếu n > 0, 0 nếu n = 0.\n"
            + "C. sum(arr, n) = arr[n - 1] * sum(arr, n - 1) nếu n > 0, 0 nếu n = 0.\n"
            + "D. sum(arr, n) = arr[n - 1] / sum(arr, n - 1) nếu n > 0, 0 nếu n = 0.",
            "Hàm đệ quy nào được sử dụng để tìm kiếm nhị phân trong một mảng đã được sắp xếp?\n"
            + "\n"
            + "A. binarySearch(arr, left, right, x) = binarySearch(arr, mid + 1, right, x) nếu arr[mid] < x, binarySearch(arr, left, mid - 1, x) nếu arr[mid] > x, mid nếu arr[mid] = x.\n"
            + "B. binarySearch(arr, left, right, x) = binarySearch(arr, mid + 1, right, x) nếu arr[mid] > x, binarySearch(arr, left, mid - 1, x) nếu arr[mid] < x, mid nếu arr[mid] = x.\n"
            + "C. binarySearch(arr, left, right, x) = binarySearch(arr, mid + 1, right, x) nếu arr[mid] != x, binarySearch(arr, left, mid - 1, x) nếu arr[mid] != x, mid nếu arr[mid] = x.\n"
            + "D. binarySearch(arr, left, right, x) = binarySearch(arr, mid + 1, right, x) nếu arr[mid] == x, binarySearch(arr, left, mid - 1, x) nếu arr[mid] == x, mid nếu arr[mid] = x.",
            "Hàm đệ quy nào được sử dụng để duyệt cây nhị phân theo thứ tự trước (preorder)?\n"
            + "\n"
            + "A. preorder(node) = print(node.data), preorder(node.left), preorder(node.right).\n"
            + "B. preorder(node) = preorder(node.left), print(node.data), preorder(node.right).\n"
            + "C. preorder(node) = preorder(node.left), preorder(node.right), print(node.data).\n"
            + "D. preorder(node) = preorder(node.right), preorder(node.left), print(node.data).",
            "Hàm đệ quy nào được sử dụng để duyệt cây nhị phân theo thứ tự giữa (inorder)?\n"
            + "\n"
            + "A. inorder(node) = print(node.data), inorder(node.left), inorder(node.right).\n"
            + "B. inorder(node) = inorder(node.left), print(node.data), inorder(node.right).\n"
            + "C. inorder(node) = inorder(node.left), inorder(node.right), print(node.data).\n"
            + "D. inorder(node) = inorder(node.right), inorder(node.left), print(node.data).",
            "Hàm đệ quy nào được sử dụng để duyệt cây nhị phân theo thứ tự sau (postorder)?\n"
            + "\n"
            + "A. postorder(node) = print(node.data), postorder(node.left), postorder(node.right).\n"
            + "B. postorder(node) = postorder(node.left), print(node.data), postorder(node.right).\n"
            + "C. postorder(node) = postorder(node.left), postorder(node.right), print(node.data).\n"
            + "D. postorder(node) = postorder(node.right), postorder(node.left), print(node.data).",
            "Hàm đệ quy nào được sử dụng để giải bài toán tháp Hà Nội?\n"
            + "\n"
            + "A. hanoi(n, source, destination, auxiliary) = hanoi(n - 1, source, auxiliary, destination), move(source, destination), hanoi(n - 1, auxiliary, destination, source).\n"
            + "B. hanoi(n, source, destination, auxiliary) = hanoi(n - 1, source, destination, auxiliary), move(source, destination), hanoi(n - 1, auxiliary, source, destination).\n"
            + "C. hanoi(n, source, destination, auxiliary) = hanoi(n - 1, source, auxiliary, destination), move(source, auxiliary), hanoi(n - 1, destination, auxiliary, source).\n"
            + "D. hanoi(n, source, destination, auxiliary) = hanoi(n - 1, source, destination, auxiliary), move(source, auxiliary), hanoi(n - 1, destination, source, auxiliary).",
            "Hàm đệ quy nào được sử dụng để tìm số lớn nhất trong một mảng?\n"
            + "\n"
            + "A. max(arr, n) = arr[n - 1] nếu n = 1, max(arr, n - 1) nếu arr[n - 1] < max(arr, n - 1), arr[n - 1] nếu arr[n - 1] > max(arr, n - 1).\n"
            + "B. max(arr, n) = arr[n - 1] nếu n = 1, max(arr, n - 1) nếu arr[n - 1] > max(arr, n - 1), arr[n - 1] nếu arr[n - 1] < max(arr, n - 1).\n"
            + "C. max(arr, n) = arr[n - 1] nếu n = 1, max(arr, n - 1) nếu arr[n - 1] != max(arr, n - 1), arr[n - 1] nếu arr[n - 1] == max(arr, n - 1).\n"
            + "D. max(arr, n) = arr[n - 1] nếu n = 1, max(arr, n - 1) nếu arr[n - 1] == max(arr, n - 1), arr[n - 1] nếu arr[n - 1] != max(arr, n - 1).",
            "Hàm đệ quy nào được sử dụng để kiểm tra xem một chuỗi có phải là palindrome không?\n"
            + "\n"
            + "A. isPalindrome(str, left, right) = true nếu left >= right, isPalindrome(str, left + 1, right - 1) nếu str[left] == str[right], false nếu str[left] != str[right].\n"
            + "B. isPalindrome(str, left, right) = true nếu left <= right, isPalindrome(str, left + 1, right - 1) nếu str[left] == str[right], false nếu str[left] != str[right].\n"
            + "C. isPalindrome(str, left, right) = true nếu left >= right, isPalindrome(str, left + 1, right - 1) nếu str[left] != str[right], false nếu str[left] == str[right].\n"
            + "D. isPalindrome(str, left, right) = true nếu left <= right, isPalindrome(str, left + 1, right - 1) nếu str[left] != str[right], false nếu str[left] == str[right].",});

        TITLE_MAP.put("Cấu trúc dữ liệu cơ bản", new String[]{
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử có cùng kiểu dữ liệu?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Cây nhị phân.\n"
            + "D. Hàng đợi.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử có kiểu dữ liệu khác nhau?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Cấu trúc (struct).\n"
            + "C. Cây nhị phân.\n"
            + "D. Hàng đợi.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử theo thứ tự tuyến tính?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Cây nhị phân.\n"
            + "D. Hàng đợi.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử theo thứ tự phân cấp?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Cây nhị phân.\n"
            + "D. Hàng đợi.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử theo thứ tự vào trước ra trước (FIFO)?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Cây nhị phân.\n"
            + "D. Hàng đợi.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử theo thứ tự vào sau ra trước (LIFO)?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Cây nhị phân.\n"
            + "D. Ngăn xếp.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử có thể thay đổi kích thước động?\n"
            + "\n"
            + "A. Mảng tĩnh.\n"
            + "B. Mảng động.\n"
            + "C. Cây nhị phân.\n"
            + "D. Hàng đợi.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử có thể tìm kiếm nhanh chóng?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Bảng băm.\n"
            + "D. Hàng đợi.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử có thể sắp xếp nhanh chóng?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Cây nhị phân tìm kiếm.\n"
            + "D. Hàng đợi.",
            "Cấu trúc dữ liệu nào được sử dụng để lưu trữ một tập hợp các phần tử có thể duyệt qua theo nhiều cách khác nhau?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Đồ thị.\n"
            + "D. Hàng đợi.",});

        TITLE_MAP.put("File I/O trong C", new String[]{
            "File I/O trong C là gì?\n"
            + "\n"
            + "A. Thao tác đọc và ghi dữ liệu từ/đến tệp tin.\n"
            + "B. Thao tác với bộ nhớ động.\n"
            + "C. Thao tác với chuỗi ký tự.\n"
            + "D. Thao tác với con trỏ.",
            "Tại sao cần sử dụng File I/O trong C?\n"
            + "\n"
            + "A. Để lưu trữ dữ liệu vĩnh viễn.\n"
            + "B. Để trao đổi dữ liệu giữa các chương trình.\n"
            + "C. Để xử lý dữ liệu lớn hơn bộ nhớ RAM.\n"
            + "D. Tất cả các đáp án trên.",
            "Các chế độ mở tệp tin trong C là gì?\n"
            + "\n"
            + "A. Đọc (r), ghi (w), thêm (a).\n"
            + "B. Nhị phân (b), văn bản (t).\n"
            + "C. Đọc/ghi (+).\n"
            + "D. Tất cả các đáp án trên.",
            "Hàm nào được sử dụng để mở tệp tin trong C?\n"
            + "\n"
            + "A. open().\n"
            + "B. fopen().\n"
            + "C. create().\n"
            + "D. file().",
            "Hàm nào được sử dụng để đóng tệp tin trong C?\n"
            + "\n"
            + "A. close().\n"
            + "B. fclose().\n"
            + "C. delete().\n"
            + "D. end().",
            "Hàm nào được sử dụng để đọc dữ liệu từ tệp tin trong C?\n"
            + "\n"
            + "A. read().\n"
            + "B. fread().\n"
            + "C. fscanf().\n"
            + "D. Tất cả các đáp án trên.",
            "Hàm nào được sử dụng để ghi dữ liệu vào tệp tin trong C?\n"
            + "\n"
            + "A. write().\n"
            + "B. fwrite().\n"
            + "C. fprintf().\n"
            + "D. Tất cả các đáp án trên.",
            "Hàm nào được sử dụng để di chuyển con trỏ tệp tin trong C?\n"
            + "\n"
            + "A. seek().\n"
            + "B. fseek().\n"
            + "C. move().\n"
            + "D. position().",
            "Hàm nào được sử dụng để kiểm tra lỗi tệp tin trong C?\n"
            + "\n"
            + "A. error().\n"
            + "B. ferror().\n"
            + "C. check().\n"
            + "D. fail().",
            "Hàm nào được sử dụng để kiểm tra cuối tệp tin trong C?\n"
            + "\n"
            + "A. eof().\n"
            + "B. feof().\n"
            + "C. end().\n"
            + "D. finish().",});

        TITLE_MAP.put("Các hàm file I/O", new String[]{
            "Hàm `fopen()` trả về giá trị nào nếu mở tệp tin thành công?\n"
            + "\n"
            + "A. Con trỏ tệp tin.\n"
            + "B. NULL.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Hàm `fopen()` trả về giá trị nào nếu mở tệp tin thất bại?\n"
            + "\n"
            + "A. Con trỏ tệp tin.\n"
            + "B. NULL.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Hàm `fclose()` trả về giá trị nào nếu đóng tệp tin thành công?\n"
            + "\n"
            + "A. Con trỏ tệp tin.\n"
            + "B. NULL.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Hàm `fclose()` trả về giá trị nào nếu đóng tệp tin thất bại?\n"
            + "\n"
            + "A. Con trỏ tệp tin.\n"
            + "B. NULL.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Hàm `fread()` đọc bao nhiêu byte từ tệp tin?\n"
            + "\n"
            + "A. Số byte được chỉ định bởi tham số size.\n"
            + "B. Số byte được chỉ định bởi tham số count.\n"
            + "C. Tích của tham số size và count.\n"
            + "D. Số byte còn lại trong tệp tin.",
            "Hàm `fwrite()` ghi bao nhiêu byte vào tệp tin?\n"
            + "\n"
            + "A. Số byte được chỉ định bởi tham số size.\n"
            + "B. Số byte được chỉ định bởi tham số count.\n"
            + "C. Tích của tham số size và count.\n"
            + "D. Số byte trong bộ nhớ đệm.",
            "Hàm `fseek()` di chuyển con trỏ tệp tin đến vị trí nào?\n"
            + "\n"
            + "A. Vị trí được chỉ định bởi tham số offset.\n"
            + "B. Vị trí được chỉ định bởi tham số whence.\n"
            + "C. Vị trí được tính toán từ offset và whence.\n"
            + "D. Vị trí cuối tệp tin.",
            "Hàm `ferror()` trả về giá trị nào nếu có lỗi tệp tin?\n"
            + "\n"
            + "A. 0.\n"
            + "B. Giá trị khác 0.\n"
            + "C. NULL.\n"
            + "D. 1.",
            "Hàm `feof()` trả về giá trị nào nếu đã đến cuối tệp tin?\n"
            + "\n"
            + "A. 0.\n"
            + "B. Giá trị khác 0.\n"
            + "C. NULL.\n"
            + "D. 1.",
            "Bạn có thể sử dụng hàm nào để đọc một dòng từ tệp tin văn bản trong C?\n"
            + "\n"
            + "A. fgets().\n"
            + "B. fread().\n"
            + "C. fscanf().\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Khái niệm về struct", new String[]{
            "Struct trong C là gì?\n"
            + "\n"
            + "A. Kiểu dữ liệu do người dùng định nghĩa để nhóm các biến có kiểu dữ liệu khác nhau.\n"
            + "B. Kiểu dữ liệu mảng.\n"
            + "C. Kiểu dữ liệu con trỏ.\n"
            + "D. Kiểu dữ liệu hàm.",
            "Tại sao cần sử dụng struct trong C?\n"
            + "\n"
            + "A. Để biểu diễn các đối tượng phức tạp.\n"
            + "B. Để tổ chức dữ liệu một cách logic.\n"
            + "C. Để truyền dữ liệu giữa các hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Cú pháp khai báo struct trong C là gì?\n"
            + "\n"
            + "A. struct tên_struct { các_thành_viên; };.\n"
            + "B. struct tên_struct(các_thành_viên);.\n"
            + "C. struct tên_struct = { các_thành_viên; };.\n"
            + "D. struct tên_struct: các_thành_viên;.",
            "Bạn có thể khai báo biến kiểu struct như thế nào?\n"
            + "\n"
            + "A. struct tên_struct tên_biến;.\n"
            + "B. tên_struct tên_biến;.\n"
            + "C. tên_biến = struct tên_struct;.\n"
            + "D. tên_biến: struct tên_struct;.",
            "Bạn có thể truy cập thành viên của struct như thế nào?\n"
            + "\n"
            + "A. tên_biến.tên_thành_viên.\n"
            + "B. tên_biến->tên_thành_viên.\n"
            + "C. tên_biến[tên_thành_viên].\n"
            + "D. tên_biến(tên_thành_viên).",
            "Bạn có thể khai báo mảng các struct không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể khai báo con trỏ đến struct không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể truyền struct cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể trả về struct từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể khai báo struct bên trong struct khác không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Khái niệm về union", new String[]{
            "Union trong C là gì?\n"
            + "\n"
            + "A. Kiểu dữ liệu do người dùng định nghĩa để lưu trữ các biến có kiểu dữ liệu khác nhau trong cùng một vùng nhớ.\n"
            + "B. Kiểu dữ liệu mảng.\n"
            + "C. Kiểu dữ liệu con trỏ.\n"
            + "D. Kiểu dữ liệu hàm.",
            "Tại sao cần sử dụng union trong C?\n"
            + "\n"
            + "A. Để tiết kiệm bộ nhớ.\n"
            + "B. Để biểu diễn các đối tượng có thể có nhiều kiểu dữ liệu khác nhau.\n"
            + "C. Để truyền dữ liệu giữa các hàm.\n"
            + "D. Tất cả các đáp án trên.",
            "Cú pháp khai báo union trong C là gì?\n"
            + "\n"
            + "A. union tên_union { các_thành_viên; };.\n"
            + "B. union tên_union(các_thành_viên);.\n"
            + "C. union tên_union = { các_thành_viên; };.\n"
            + "D. union tên_union: các_thành_viên;.",
            "Bạn có thể khai báo biến kiểu union như thế nào?\n"
            + "\n"
            + "A. union tên_union tên_biến;.\n"
            + "B. tên_union tên_biến;.\n"
            + "C. tên_biến = union tên_union;.\n"
            + "D. tên_biến: union tên_union;.",
            "Bạn có thể truy cập thành viên của union như thế nào?\n"
            + "\n"
            + "A. tên_biến.tên_thành_viên.\n"
            + "B. tên_biến->tên_thành_viên.\n"
            + "C. tên_biến[tên_thành_viên].\n"
            + "D. tên_biến(tên_thành_viên).",
            "Bạn có thể khai báo mảng các union không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể khai báo con trỏ đến union không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể truyền union cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể trả về union từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể khai báo union bên trong union khác không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Sự khác biệt giữa struct và union", new String[]{
            "Điểm khác biệt chính giữa struct và union là gì?\n"
            + "\n"
            + "A. Struct lưu trữ các thành viên ở các vùng nhớ khác nhau, union lưu trữ các thành viên ở cùng một vùng nhớ.\n"
            + "B. Struct lưu trữ các thành viên có cùng kiểu dữ liệu, union lưu trữ các thành viên có kiểu dữ liệu khác nhau.\n"
            + "C. Struct có thể chứa các struct khác, union không thể chứa union khác.\n"
            + "D. Struct có thể trả về từ hàm, union không thể trả về từ hàm.",
            "Khi nào bạn nên sử dụng struct thay vì union?\n"
            + "\n"
            + "A. Khi bạn cần lưu trữ các thành viên có cùng kiểu dữ liệu.\n"
            + "B. Khi bạn cần tiết kiệm bộ nhớ.\n"
            + "C. Khi bạn cần biểu diễn các đối tượng có thể có nhiều kiểu dữ liệu khác nhau.\n"
            + "D. Khi bạn cần truyền dữ liệu giữa các hàm.",
            "Khi nào bạn nên sử dụng union thay vì struct?\n"
            + "\n"
            + "A. Khi bạn cần lưu trữ các thành viên có cùng kiểu dữ liệu.\n"
            + "B. Khi bạn cần tiết kiệm bộ nhớ.\n"
            + "C. Khi bạn cần biểu diễn các đối tượng có thể có nhiều kiểu dữ liệu khác nhau.\n"
            + "D. Khi bạn cần truyền dữ liệu giữa các hàm.",
            "Kích thước của struct là bao nhiêu?\n"
            + "\n"
            + "A. Tổng kích thước của tất cả các thành viên.\n"
            + "B. Kích thước của thành viên lớn nhất.\n"
            + "C. Kích thước của thành viên nhỏ nhất.\n"
            + "D. Kích thước của kiểu dữ liệu cơ bản.",
            "Kích thước của union là bao nhiêu?\n"
            + "\n"
            + "A. Tổng kích thước của tất cả các thành viên.\n"
            + "B. Kích thước của thành viên lớn nhất.\n"
            + "C. Kích thước của thành viên nhỏ nhất.\n"
            + "D. Kích thước của kiểu dữ liệu cơ bản.",
            "Bạn có thể truy cập thành viên của struct và union như thế nào?\n"
            + "\n"
            + "A. Sử dụng toán tử dấu chấm (.) hoặc toán tử mũi tên (->).\n"
            + "B. Sử dụng toán tử dấu ngoặc vuông ([]).\n"
            + "C. Sử dụng toán tử dấu ngoặc tròn (()).\n"
            + "D. Sử dụng toán tử dấu và (&).",
            "Bạn có thể khai báo struct và union bên trong struct hoặc union khác không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể truyền struct và union cho hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể trả về struct và union từ hàm không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",
            "Bạn có thể khai báo mảng các struct và union không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Danh sách liên kết", new String[]{
            "Danh sách liên kết là gì?\n"
            + "\n"
            + "A. Cấu trúc dữ liệu tuyến tính, trong đó các phần tử được lưu trữ ở các vị trí không liên tiếp trong bộ nhớ.\n"
            + "B. Cấu trúc dữ liệu phi tuyến tính, trong đó các phần tử được lưu trữ ở các vị trí liên tiếp trong bộ nhớ.\n"
            + "C. Cấu trúc dữ liệu mảng.\n"
            + "D. Cấu trúc dữ liệu ngăn xếp.",
            "Ưu điểm của danh sách liên kết so với mảng là gì?\n"
            + "\n"
            + "A. Kích thước có thể thay đổi động.\n"
            + "B. Chèn và xóa phần tử nhanh chóng.\n"
            + "C. Sử dụng bộ nhớ hiệu quả hơn.\n"
            + "D. Tất cả các đáp án trên.",
            "Nhược điểm của danh sách liên kết so với mảng là gì?\n"
            + "\n"
            + "A. Truy cập phần tử chậm hơn.\n"
            + "B. Sử dụng bộ nhớ nhiều hơn.\n"
            + "C. Khó cài đặt hơn.\n"
            + "D. Tất cả các đáp án trên.",
            "Các loại danh sách liên kết phổ biến là gì?\n"
            + "\n"
            + "A. Danh sách liên kết đơn.\n"
            + "B. Danh sách liên kết đôi.\n"
            + "C. Danh sách liên kết vòng.\n"
            + "D. Tất cả các đáp án trên.",
            "Cấu trúc của một nút trong danh sách liên kết là gì?\n"
            + "\n"
            + "A. Dữ liệu và con trỏ đến nút tiếp theo.\n"
            + "B. Dữ liệu và con trỏ đến nút trước đó.\n"
            + "C. Dữ liệu và con trỏ đến nút đầu tiên.\n"
            + "D. Dữ liệu và con trỏ đến nút cuối cùng.",
            "Bạn có thể duyệt qua danh sách liên kết như thế nào?\n"
            + "\n"
            + "A. Sử dụng vòng lặp while với con trỏ chạy từ nút đầu tiên đến nút cuối cùng.\n"
            + "B. Sử dụng vòng lặp for với chỉ số chạy từ 0 đến kích thước danh sách.\n"
            + "C. Sử dụng hàm đệ quy.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể chèn một nút vào danh sách liên kết như thế nào?\n"
            + "\n"
            + "A. Thay đổi con trỏ của nút trước đó và nút tiếp theo.\n"
            + "B. Tạo một nút mới và gán con trỏ của nó cho nút tiếp theo.\n"
            + "C. Xóa nút tiếp theo và gán con trỏ của nút trước đó cho nút mới.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể xóa một nút khỏi danh sách liên kết như thế nào?\n"
            + "\n"
            + "A. Thay đổi con trỏ của nút trước đó để bỏ qua nút cần xóa.\n"
            + "B. Giải phóng bộ nhớ của nút cần xóa.\n"
            + "C. Cả hai đáp án trên.\n"
            + "D. Không thể xóa nút khỏi danh sách liên kết.",
            "Bạn có thể tìm kiếm một nút trong danh sách liên kết như thế nào?\n"
            + "\n"
            + "A. Duyệt qua danh sách và so sánh dữ liệu của từng nút với dữ liệu cần tìm.\n"
            + "B. Sử dụng thuật toán tìm kiếm nhị phân.\n"
            + "C. Sử dụng bảng băm.\n"
            + "D. Không thể tìm kiếm trong danh sách liên kết.",
            "Bạn có thể sắp xếp một danh sách liên kết như thế nào?\n"
            + "\n"
            + "A. Sử dụng thuật toán sắp xếp chèn, sắp xếp chọn hoặc sắp xếp nổi bọt.\n"
            + "B. Sử dụng thuật toán sắp xếp nhanh hoặc sắp xếp trộn.\n"
            + "C. Sử dụng hàm `qsort()`.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Ngăn xếp", new String[]{
            "Ngăn xếp là gì?\n"
            + "\n"
            + "A. Cấu trúc dữ liệu tuyến tính, trong đó các phần tử được thêm và xóa theo thứ tự vào sau ra trước (LIFO).\n"
            + "B. Cấu trúc dữ liệu tuyến tính, trong đó các phần tử được thêm và xóa theo thứ tự vào trước ra trước (FIFO).\n"
            + "C. Cấu trúc dữ liệu phi tuyến tính.\n"
            + "D. Cấu trúc dữ liệu mảng.",
            "Các thao tác cơ bản trên ngăn xếp là gì?\n"
            + "\n"
            + "A. Đẩy (push), lấy (pop), xem đỉnh (peek).\n"
            + "B. Thêm (add), xóa (remove), tìm kiếm (search).\n"
            + "C. Đọc (read), ghi (write), di chuyển (move).\n"
            + "D. Sắp xếp (sort), trộn (merge), đảo ngược (reverse).",
            "Ưu điểm của ngăn xếp là gì?\n"
            + "\n"
            + "A. Thực hiện các thao tác thêm và xóa nhanh chóng.\n"
            + "B. Sử dụng bộ nhớ hiệu quả.\n"
            + "C. Dễ dàng cài đặt.\n"
            + "D. Tất cả các đáp án trên.",
            "Nhược điểm của ngăn xếp là gì?\n"
            + "\n"
            + "A. Chỉ có thể truy cập phần tử ở đỉnh.\n"
            + "B. Không thể thay đổi kích thước sau khi tạo.\n"
            + "C. Dễ gây ra lỗi tràn ngăn xếp.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể cài đặt ngăn xếp bằng cấu trúc dữ liệu nào?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Cả hai đáp án trên.\n"
            + "D. Không thể cài đặt ngăn xếp.",
            "Bạn có thể sử dụng ngăn xếp để giải quyết bài toán nào?\n"
            + "\n"
            + "A. Đảo ngược một chuỗi.\n"
            + "B. Kiểm tra tính hợp lệ của dấu ngoặc.\n"
            + "C. Tính toán biểu thức hậu tố.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra khi bạn đẩy một phần tử vào ngăn xếp đã đầy?\n"
            + "\n"
            + "A. Chương trình báo lỗi tràn ngăn xếp.\n"
            + "B. Phần tử mới sẽ ghi đè lên phần tử cũ nhất.\n"
            + "C. Ngăn xếp tự động tăng kích thước.\n"
            + "D. Không có gì xảy ra.",
            "Điều gì xảy ra khi bạn lấy một phần tử khỏi ngăn xếp rỗng?\n"
            + "\n"
            + "A. Chương trình báo lỗi ngăn xếp rỗng.\n"
            + "B. Hàm lấy (pop) trả về giá trị NULL.\n"
            + "C. Hàm lấy (pop) trả về giá trị mặc định.\n"
            + "D. Không có gì xảy ra.",
            "Bạn có thể sử dụng ngăn xếp để duyệt cây nhị phân theo thứ tự nào?\n"
            + "\n"
            + "A. Thứ tự trước (preorder).\n"
            + "B. Thứ tự giữa (inorder).\n"
            + "C. Thứ tự sau (postorder).\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể sử dụng ngăn xếp để giải quyết bài toán tháp Hà Nội không?\n"
            + "\n"
            + "A. Có.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Hàng đợi", new String[]{
            "Hàng đợi là gì?\n"
            + "\n"
            + "A. Cấu trúc dữ liệu tuyến tính, trong đó các phần tử được thêm và xóa theo thứ tự vào trước ra trước (FIFO).\n"
            + "B. Cấu trúc dữ liệu tuyến tính, trong đó các phần tử được thêm và xóa theo thứ tự vào sau ra trước (LIFO).\n"
            + "C. Cấu trúc dữ liệu phi tuyến tính.\n"
            + "D. Cấu trúc dữ liệu mảng.",
            "Các thao tác cơ bản trên hàng đợi là gì?\n"
            + "\n"
            + "A. Thêm (enqueue), lấy (dequeue), xem đầu (peek).\n"
            + "B. Đẩy (push), lấy (pop), xem đỉnh (peek).\n"
            + "C. Đọc (read), ghi (write), di chuyển (move).\n"
            + "D. Sắp xếp (sort), trộn (merge), đảo ngược (reverse).",
            "Ưu điểm của hàng đợi là gì?\n"
            + "\n"
            + "A. Thực hiện các thao tác thêm và xóa nhanh chóng.\n"
            + "B. Sử dụng bộ nhớ hiệu quả.\n"
            + "C. Dễ dàng cài đặt.\n"
            + "D. Tất cả các đáp án trên.",
            "Nhược điểm của hàng đợi là gì?\n"
            + "\n"
            + "A. Chỉ có thể truy cập phần tử ở đầu.\n"
            + "B. Không thể thay đổi kích thước sau khi tạo.\n"
            + "C. Dễ gây ra lỗi tràn hàng đợi.\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể cài đặt hàng đợi bằng cấu trúc dữ liệu nào?\n"
            + "\n"
            + "A. Mảng.\n"
            + "B. Danh sách liên kết.\n"
            + "C. Cả hai đáp án trên.\n"
            + "D. Không thể cài đặt hàng đợi.",
            "Bạn có thể sử dụng hàng đợi để giải quyết bài toán nào?\n"
            + "\n"
            + "A. Lập lịch CPU.\n"
            + "B. Xử lý yêu cầu in ấn.\n"
            + "C. Tìm kiếm theo chiều rộng (BFS) trong đồ thị.\n"
            + "D. Tất cả các đáp án trên.",
            "Điều gì xảy ra khi bạn thêm một phần tử vào hàng đợi đã đầy?\n"
            + "\n"
            + "A. Chương trình báo lỗi tràn hàng đợi.\n"
            + "B. Phần tử mới sẽ ghi đè lên phần tử cũ nhất.\n"
            + "C. Hàng đợi tự động tăng kích thước.\n"
            + "D. Không có gì xảy ra.",
            "Điều gì xảy ra khi bạn lấy một phần tử khỏi hàng đợi rỗng?\n"
            + "\n"
            + "A. Chương trình báo lỗi hàng đợi rỗng.\n"
            + "B. Hàm lấy (dequeue) trả về giá trị NULL.\n"
            + "C. Hàm lấy (dequeue) trả về giá trị mặc định.\n"
            + "D. Không có gì xảy ra.",
            "Bạn có thể sử dụng hàng đợi để duyệt cây nhị phân theo thứ tự nào?\n"
            + "\n"
            + "A. Thứ tự trước (preorder).\n"
            + "B. Thứ tự giữa (inorder).\n"
            + "C. Thứ tự sau (postorder).\n"
            + "D. Tất cả các đáp án trên.",
            "Bạn có thể sử dụng hàng đợi để giải quyết bài toán tìm đường đi ngắn nhất trong đồ thị không trọng số không?\n"
            + "\n"
            + "A. Có, sử dụng thuật toán BFS.\n"
            + "B. Không.\n"
            + "C. Chỉ trong một số trường hợp nhất định.\n"
            + "D. Tùy thuộc vào trình biên dịch.",});

        TITLE_MAP.put("Mở và đóng tệp tin", new String[]{
            "Hàm nào được sử dụng để mở một tệp tin trong C?\n"
            + "\n"
            + "A. open().\n"
            + "B. fopen().\n"
            + "C. create().\n"
            + "D. file().",
            "Hàm `fopen()` trả về giá trị nào nếu mở tệp tin thành công?\n"
            + "\n"
            + "A. Con trỏ tệp tin.\n"
            + "B. NULL.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Hàm `fopen()` trả về giá trị nào nếu mở tệp tin thất bại?\n"
            + "\n"
            + "A. Con trỏ tệp tin.\n"
            + "B. NULL.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Chế độ mở tệp tin nào được sử dụng để đọc tệp tin văn bản?\n"
            + "\n"
            + "A. \"r\".\n"
            + "B. \"w\".\n"
            + "C. \"a\".\n"
            + "D. \"b\".",
            "Chế độ mở tệp tin nào được sử dụng để ghi tệp tin văn bản (xóa nội dung cũ)?\n"
            + "\n"
            + "A. \"r\".\n"
            + "B. \"w\".\n"
            + "C. \"a\".\n"
            + "D. \"b\".",
            "Chế độ mở tệp tin nào được sử dụng để ghi tệp tin văn bản (thêm vào cuối tệp tin)?\n"
            + "\n"
            + "A. \"r\".\n"
            + "B. \"w\".\n"
            + "C. \"a\".\n"
            + "D. \"b\".",
            "Hàm nào được sử dụng để đóng một tệp tin trong C?\n"
            + "\n"
            + "A. close().\n"
            + "B. fclose().\n"
            + "C. delete().\n"
            + "D. end().",
            "Hàm `fclose()` trả về giá trị nào nếu đóng tệp tin thành công?\n"
            + "\n"
            + "A. Con trỏ tệp tin.\n"
            + "B. NULL.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Hàm `fclose()` trả về giá trị nào nếu đóng tệp tin thất bại?\n"
            + "\n"
            + "A. Con trỏ tệp tin.\n"
            + "B. NULL.\n"
            + "C. 0.\n"
            + "D. 1.",
            "Điều gì xảy ra nếu bạn cố gắng đóng một tệp tin đã được đóng?\n"
            + "\n"
            + "A. Chương trình báo lỗi.\n"
            + "B. Hàm `fclose()` trả về 0.\n"
            + "C. Hàm `fclose()` trả về 1.\n"
            + "D. Không có gì xảy ra.",});

        TITLE_MAP.put("Đọc và ghi tệp tin", new String[]{
            "Hàm nào được sử dụng để đọc một ký tự từ tệp tin trong C?\n"
            + "\n"
            + "A. read().\n"
            + "B. fread().\n"
            + "C. fgetc().\n"
            + "D. fscanf().",
            "Hàm nào được sử dụng để ghi một ký tự vào tệp tin trong C?\n"
            + "\n"
            + "A. write().\n"
            + "B. fwrite().\n"
            + "C. fputc().\n"
            + "D. fprintf().",
            "Hàm nào được sử dụng để đọc một chuỗi từ tệp tin trong C?\n"
            + "\n"
            + "A. read().\n"
            + "B. fread().\n"
            + "C. fgets().\n"
            + "D. fscanf().",
            "Hàm nào được sử dụng để ghi một chuỗi vào tệp tin trong C?\n"
            + "\n"
            + "A. write().\n"
            + "B. fwrite().\n"
            + "C. fputs().\n"
            + "D. fprintf().",
            "Hàm nào được sử dụng để đọc dữ liệu có định dạng từ tệp tin trong C?\n"
            + "\n"
            + "A. read().\n"
            + "B. fread().\n"
            + "C. fgets().\n"
            + "D. fscanf().",
            "Hàm nào được sử dụng để ghi dữ liệu có định dạng vào tệp tin trong C?\n"
            + "\n"
            + "A. write().\n"
            + "B. fwrite().\n"
            + "C. fputs().\n"
            + "D. fprintf().",
            "Hàm `fread()` đọc bao nhiêu byte từ tệp tin?\n"
            + "\n"
            + "A. Số byte được chỉ định bởi tham số size.\n"
            + "B. Số byte được chỉ định bởi tham số count.\n"
            + "C. Tích của tham số size và count.\n"
            + "D. Số byte còn lại trong tệp tin.",
            "Hàm `fwrite()` ghi bao nhiêu byte vào tệp tin?\n"
            + "\n"
            + "A. Số byte được chỉ định bởi tham số size.\n"
            + "B. Số byte được chỉ định bởi tham số count.\n"
            + "C. Tích của tham số size và count.\n"
            + "D. Số byte trong bộ nhớ đệm.",
            "Hàm `fgets()` đọc bao nhiêu ký tự từ tệp tin?\n"
            + "\n"
            + "A. Số ký tự được chỉ định bởi tham số size.\n"
            + "B. Số ký tự được chỉ định bởi tham số count.\n"
            + "C. Số ký tự cho đến khi gặp ký tự '\\n' hoặc cuối tệp tin.\n"
            + "D. Tất cả các ký tự trong tệp tin.",
            "Hàm `fscanf()` đọc dữ liệu đến khi nào?\n"
            + "\n"
            + "A. Gặp ký tự trắng (space, tab, newline).\n"
            + "B. Gặp ký tự không phù hợp với định dạng.\n"
            + "C. Gặp cuối tệp tin.\n"
            + "D. Tất cả các đáp án trên.",});

        TITLE_MAP.put("Các hàm xử lý tệp tin", new String[]{
            "Hàm nào được sử dụng để di chuyển con trỏ tệp tin đến đầu tệp tin?\n"
            + "\n"
            + "A. rewind().\n"
            + "B. fseek(file, 0, SEEK_SET).\n"
            + "C. Cả hai đáp án trên.\n"
            + "D. Không có hàm nào.",
            "Hàm nào được sử dụng để lấy vị trí hiện tại của con trỏ tệp tin?\n"
            + "\n"
            + "A. ftell().\n"
            + "B. fseek(file, 0, SEEK_CUR).\n"
            + "C. getpos().\n"
            + "D. position().",
            "Hàm nào được sử dụng để kiểm tra lỗi tệp tin?\n"
            + "\n"
            + "A. error().\n"
            + "B. ferror().\n"
            + "C. check().\n"
            + "D. fail().",
            "Hàm nào được sử dụng để kiểm tra cuối tệp tin?\n"
            + "\n"
            + "A. eof().\n"
            + "B. feof().\n"
            + "C. end().\n"
            + "D. finish().",
            "Hàm `fseek()` di chuyển con trỏ tệp tin đến vị trí nào?\n"
            + "\n"
            + "A. Vị trí được chỉ định bởi tham số offset.\n"
            + "B. Vị trí được chỉ định bởi tham số whence.\n"
            + "C. Vị trí được tính toán từ offset và whence.\n"
            + "D. Vị trí cuối tệp tin.",
            "Tham số `whence` trong hàm `fseek()` có giá trị nào để di chuyển con trỏ tệp tin đến đầu tệp tin?\n"
            + "\n"
            + "A. SEEK_SET.\n"
            + "B. SEEK_CUR.\n"
            + "C. SEEK_END.\n"
            + "D. SEEK_FILE.",
            "Tham số `whence` trong hàm `fseek()` có giá trị nào để di chuyển con trỏ tệp tin đến vị trí hiện tại?\n"
            + "\n"
            + "A. SEEK_SET.\n"
            + "B. SEEK_CUR.\n"
            + "C. SEEK_END.\n"
            + "D. SEEK_FILE.",
            "Tham số `whence` trong hàm `fseek()` có giá trị nào để di chuyển con trỏ tệp tin đến cuối tệp tin?\n"
            + "\n"
            + "A. SEEK_SET.\n"
            + "B. SEEK_CUR.\n"
            + "C. SEEK_END.\n"
            + "D. SEEK_FILE.",
            "Hàm `ferror()` trả về giá trị nào nếu có lỗi tệp tin?\n"
            + "\n"
            + "A. 0.\n"
            + "B. Giá trị khác 0.\n"
            + "C. NULL.\n"
            + "D. 1.",
            "Hàm `feof()` trả về giá trị nào nếu đã đến cuối tệp tin?\n"
            + "\n"
            + "A. 0.\n"
            + "B. Giá trị khác 0.\n"
            + "C. NULL.\n"
            + "D. 1.",});
       
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
