/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author PC
 */
public class DiemTrungKhoaHoc {

    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public String getMaBaiHocChinh() {
        return maBaiHocChinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public void setMaBaiHocChinh(String maBaiHocChinh) {
        this.maBaiHocChinh = maBaiHocChinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    private String maKhoaHoc;
    private String maBaiHocChinh;
    private double diemTrungBinh;
}
