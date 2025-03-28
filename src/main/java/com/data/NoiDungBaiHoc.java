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
public class NoiDungBaiHoc {
    
    private static final Map<String, int[]> Index_MAP = new HashMap<>();

    static {
        Index_MAP.put("1", new int[]{
            0, 1, 2, 0, 1, 2, 0, 1, 0, 1, 2, 2, 1, 1
        });
        Index_MAP.put("2", new int[]{
            0, 1, 2, 0, 1, 2
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
        TITLE_MAP.put("1", new String[]{
            "Giới thiệu về Java",
            "Java",
            "Java1",
        });
        
         TITLE_MAP.put("2", new String[]{
            "Giới thiệu về Java",
            "Java",
            "Java1",
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
        Content_MAP.put("1", new String[]{
            "Java là ngôn ngữ lập trình máy tính có tính chất hướng đối tượng,",
            
            "là ngôn ngữ lập trình máy tính có tính chất hướng đối tượng,",
 
            "ngôn ngữ lập trình máy tính có tính chất hướng đối tượng,",
        });
        
                Content_MAP.put("2", new String[]{
            "Java là ngôn ngữ lập trình máy tính có tính chất hướng đối tượng,",
            
            "là ngôn ngữ lập trình máy tính có tính chất hướng đối tượng,",
 
            "ngôn ngữ lập trình máy tính có tính chất hướng đối tượng,",
            
             "lập trình máy tính có tính chất hướng đối tượng,",
        });
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
        Code_MAP.put("1", new String[]{
            "class Simple{  \n"
            + "  public static void main(String args[]){  \n"
            + "   System.out.println(\"Hello World\");  \n"
            + "    }  \n"
            + "}  ", 
            
            "class Simple{  \n"
            + "  ublic static void main(String args[]){  \n"
            + "   System.out.println(\"Hello World\");  \n"
            + "    }  \n"
            + "}  "
        });
        
        Code_MAP.put("2", new String[]{
            "class Simple{  \n"
            + "  public static void main(String args[]){  \n"
            + "   System.out.println(\"Hello World\");  \n"
            + "    }  \n"
            + "}  ", 
            
            "class Simple{  \n"
            + "  ublic static void main(String args[]){  \n"
            + "   System.out.println(\"Hello World\");  \n"
            + "    }  \n"
            + "}  "
        });
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
