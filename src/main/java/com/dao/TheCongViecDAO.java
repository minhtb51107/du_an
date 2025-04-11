/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author PC
 */

import com.entity.TheCongViec;
import com.utils.XJdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TheCongViecDAO {

    public void addTask(TheCongViec task) {
        String sql = "INSERT INTO THE_CONG_VIEC (CotID, TieuDe, MoTa, TrangThai, NgayTao) VALUES (?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
            task.getCotID(),
            task.getTieuDe(),
            task.getMoTa(),
            task.getTrangThai(),
            new Timestamp(System.currentTimeMillis())
        );
    }

    public void updateTask(TheCongViec task) {
        String sql = "UPDATE THE_CONG_VIEC SET TieuDe = ?, MoTa = ?, TrangThai = ? WHERE ID = ?";
        XJdbc.executeUpdate(sql,
            task.getTieuDe(),
            task.getMoTa(),
            task.getTrangThai(),
            task.getId()
        );
    }

    public void deleteTask(int taskId) {
        String sql = "DELETE FROM THE_CONG_VIEC WHERE ID = ?";
        XJdbc.executeUpdate(sql, taskId);
    }

    public List<TheCongViec> getTasksByCotId(int cotId) {
        String sql = "SELECT * FROM THE_CONG_VIEC WHERE CotID = ?";
        List<TheCongViec> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.executeQuery(sql, cotId)) {
            while (rs.next()) {
                TheCongViec task = new TheCongViec();
                task.setId(rs.getInt("ID"));
                task.setCotID(rs.getInt("CotID"));
                task.setTieuDe(rs.getString("TieuDe"));
                task.setMoTa(rs.getString("MoTa"));
                task.setTrangThai(rs.getString("TrangThai"));
                task.setNgayTao(rs.getTimestamp("NgayTao"));
                list.add(task);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

