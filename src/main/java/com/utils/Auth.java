/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils;

import com.entity.NguoiDung;

/**
 *
 * @author PC
 */
//import com.edusys.entity.NhanVien;
//
public class Auth {
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static NguoiDung user = null;
    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        Auth.user = null;
    }
    /**
     * Kiểm tra xem đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
     /**
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
//    public static boolean isManager() {
//        return Auth.isLogin() && user.getVaiTro();
//    }
}
