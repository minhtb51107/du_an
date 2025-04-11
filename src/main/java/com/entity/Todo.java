package com.entity;

import java.sql.Timestamp;

public class Todo {
    private String maTodo;
    private String maNguoiDung;
    private String tieuDe;
    private String noiDung;
    private Timestamp ngayTao;
    private boolean trangThai;
    private String trangThaiTask; // TODO, IN_PROGRESS, IN_REVIEW, DONE
    private String level;
    private Timestamp deadline;

    public Todo() {
    }

    public Todo(String maTodo, String maNguoiDung, String tieuDe, String noiDung, Timestamp ngayTao, boolean trangThai, String trangThaiTask) {
        this.maTodo = maTodo;
        this.maNguoiDung = maNguoiDung;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.trangThaiTask = trangThaiTask;
    }

    public String getMaTodo() {
        return maTodo;
    }

    public void setMaTodo(String maTodo) {
        this.maTodo = maTodo;
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Timestamp getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Timestamp ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getTrangThaiTask() {
        return trangThaiTask;
    }

    public void setTrangThaiTask(String trangThaiTask) {
        this.trangThaiTask = trangThaiTask;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }
} 