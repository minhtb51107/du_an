/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.util.Date;

/**
 *
 * @author PC
 */
public class ThoiGianHoatDong {
    private int maHoatDong;
    private String maNguoiDung;
    private Date ngayHoatDong;
    private int thoiGianTongHop;

    // Getters và Setters
    public int getMaHoatDong() {
        return maHoatDong;
    }

    public void setMaHoatDong(int maHoatDong) {
        this.maHoatDong = maHoatDong;
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public Date getNgayHoatDong() {
        return ngayHoatDong;
    }

    public void setNgayHoatDong(Date ngayHoatDong) {
        this.ngayHoatDong = ngayHoatDong;
    }

    public int getThoiGianTongHop() {
        return thoiGianTongHop;
    }

    public void setThoiGianTongHop(int thoiGianTongHop) {
        this.thoiGianTongHop = thoiGianTongHop;
    }
}
