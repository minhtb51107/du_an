/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author PC
 */

import java.util.Date;

public class TheCongViec {
    private int id;
    private int cotID;
    private String tieuDe;
    private String moTa;
    private String trangThai;
    private Date ngayTao;

    // Constructor không tham số
    public TheCongViec() {
    }

    // Constructor đầy đủ
    public TheCongViec(int id, int cotID, String tieuDe, String moTa, String trangThai, Date ngayTao) {
        this.id = id;
        this.cotID = cotID;
        this.tieuDe = tieuDe;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCotID() {
        return cotID;
    }

    public void setCotID(int cotID) {
        this.cotID = cotID;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "TheCongViec{" +
                "id=" + id +
                ", cotID=" + cotID +
                ", tieuDe='" + tieuDe + '\'' +
                ", moTa='" + moTa + '\'' +
                ", trangThai='" + trangThai + '\'' +
                ", ngayTao=" + ngayTao +
                '}';
    }
}

