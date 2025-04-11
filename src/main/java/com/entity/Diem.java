/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author PC
 */
public class Diem {
    private String maNguoiDung;
    private int maBaiHocChiTiet;
    private double soDiem;
    private double diemTongCT;

    // getters và setters

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public int getMaBaiHocChiTiet() {
        return maBaiHocChiTiet;
    }

    public double getSoDiem() {
        return soDiem;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public void setMaBaiHocChiTiet(int maBaiHocChiTiet) {
        this.maBaiHocChiTiet = maBaiHocChiTiet;
    }

    public void setSoDiem(double soDiem) {
        this.soDiem = soDiem;
    }
    
    public int tinhDiemTB(int tong, int tb){
        int a;
        a = (tong / tb);
        return a;
    }
}
