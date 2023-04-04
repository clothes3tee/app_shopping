/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.DatabasesHelper;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ThucPham;

/**
 *
 * @author 84564
 */
public class ThucPhamDao {

    public boolean insert(ThucPham tp) throws Exception {
        String sql = "INSERT INTO dbo.ThucPham(maThucPham,tenThucPham,khoiLuongTP,khoiLuongIt,loaiThucPham,giaTienTP,giaTriDD,donGia)" + "values(?,?,?,?,?,?,?,?)";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tp.getMaThucPham());
            pstmt.setString(2, tp.getTenThucPham());
            pstmt.setFloat(3, tp.getKhoiLuongTP());
            pstmt.setFloat(4, tp.getKhoiLuongIt());
            pstmt.setString(5, tp.getLoaiThucPham());
            pstmt.setInt(6, tp.getGiaTienTP());
            pstmt.setInt(7, tp.getGiaTriDD());
            pstmt.setFloat(8, tp.getDonGia());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean update(ThucPham tp)
            throws Exception {

        String sql = "UPDATE dbo.ThucPham"
                + " SET tenThucPham = ?,khoiLuongTP = ?,khoiLuongIt = ?,loaiThucPham = ?,giaTienTP = ?,giaTriDD = ?,donGia = ?"
                + " where maThucPham = ?";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(8, tp.getMaThucPham());
            pstmt.setString(1, tp.getTenThucPham());
            pstmt.setFloat(2, tp.getKhoiLuongTP());
            pstmt.setFloat(3, tp.getKhoiLuongIt());
            pstmt.setString(4, tp.getLoaiThucPham());
            pstmt.setInt(5, tp.getGiaTienTP());
            pstmt.setInt(6, tp.getGiaTriDD());
            pstmt.setFloat(7, tp.getDonGia());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean delete(String maThucPham)
            throws Exception {

        String sql = "delete from ThucPham"
                + " where maThucPham = ?";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maThucPham);
            return pstmt.executeUpdate() > 0;
        }
    }

    public ThucPham findByID(String maThucPham)
            throws Exception {

        String sql = "select * from ThucPham"
                + " where maThucPham = ?";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maThucPham);
            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    ThucPham tp = createThucPham(rs);
                    return tp;
                }
            }
            return null;
        }
    }

    public ThucPham findByName(String tenThucPham)
            throws Exception {

        String sql = "select * from ThucPham"
                + " where tenThucPham = ?";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tenThucPham);
            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    ThucPham tp = createThucPham(rs);
                    return tp;
                }
            }
            return null;
        }
    }

    public ArrayList<ThucPham> findAll()
            throws Exception {
        String sql = "select * from ThucPham";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            try ( ResultSet rs = pstmt.executeQuery();) {
                ArrayList<ThucPham> list = new ArrayList<>();
                while (rs.next()) {
                    ThucPham tp = createThucPham(rs);
                    list.add(tp);
                }
                return list;
            }
        }
    }

    private ThucPham createThucPham(final ResultSet rs) throws SQLException {
        ThucPham tp = new ThucPham();
        tp.setMaThucPham(rs.getString("maThucPham"));
        tp.setTenThucPham(rs.getString("tenThucPham"));
        tp.setKhoiLuongTP((rs.getFloat("khoiLuongTP")));
        tp.setKhoiLuongIt(rs.getFloat("khoiLuongIt"));
        tp.setLoaiThucPham(rs.getString("loaiThucPham"));
        tp.setGiaTienTP(rs.getInt("giaTienTP"));
        tp.setGiaTriDD(rs.getInt("giaTriDD"));
        tp.setDonGia(rs.getFloat("donGia"));
        return tp;
    }
}
