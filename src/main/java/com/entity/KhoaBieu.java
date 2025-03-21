/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author PC
 */
public class KhoaBieu {

    private int thang; // Tháng
    private int tuan;  // Số tuần trong tháng
    private int ngay;  // Số ngày trong tuần

    // Constructor mặc định
    public KhoaBieu() {
    }

    // Constructor với tham số
    public KhoaBieu(int thang, int tuan, int ngay) {
        this.thang = thang;
        this.tuan = tuan;
        this.ngay = ngay;
    }

    // Getter và Setter
    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getTuan() {
        return tuan;
    }

    public void setTuan(int tuan) {
        this.tuan = tuan;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    // Override phương thức toString để hiển thị thông tin dễ dàng
    @Override
    public String toString() {
        return "KhoaBieu{" +
                "thang=" + thang +
                ", tuan=" + tuan +
                ", ngay=" + ngay +
                '}';
    }
}
