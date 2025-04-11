package com.entity;

import java.sql.Timestamp;

public class CongViec {

    public int getMaCongViec() {
        return maCongViec;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public String getDoUuTien() {
        return doUuTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaCongViec(int maCongViec) {
        this.maCongViec = maCongViec;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public void setDoUuTien(String doUuTien) {
        this.doUuTien = doUuTien;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public CongViec(int maCongViec, String tieuDe, String moTa, String ngayHetHan, String doUuTien, boolean trangThai, Timestamp ngayTao, String maNguoiDung) {
        this.maCongViec = maCongViec;
        this.tieuDe = tieuDe;
        this.moTa = moTa;
        this.ngayHetHan = ngayHetHan;
        this.doUuTien = doUuTien;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.maNguoiDung = maNguoiDung;
    }

    public CongViec() {
    }

    public CongViec(int maCongViec, String tieuDe, String moTa, String ngayHetHan, String doUuTien, boolean trangThai, Timestamp ngayTao, String maNguoiDung, String trangThaiKanban) {
        this.maCongViec = maCongViec;
        this.tieuDe = tieuDe;
        this.moTa = moTa;
        this.ngayHetHan = ngayHetHan;
        this.doUuTien = doUuTien;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.maNguoiDung = maNguoiDung;
        this.trangThaiKanban = trangThaiKanban;
    }
    private int maCongViec;
    private String tieuDe;
    private String moTa;
    private String ngayHetHan;
    private String doUuTien;
    private boolean trangThai;
    private Timestamp ngayTao;
    private String maNguoiDung;

    public void setTrangThaiKanban(String trangThaiKanban) {
        this.trangThaiKanban = trangThaiKanban;
    }

    public String getTrangThaiKanban() {
        return trangThaiKanban;
    }
    private String trangThaiKanban;

    // Getters và Setters
    // ...
}
