/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.DatabasesHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.KetQua;
import model.ThucPham;

/**
 *
 * @author Admin
 */
public class KetQuaDao {

    public boolean insert(KetQua kq) throws Exception {
        String sql = "INSERT INTO dbo.KetQua(maThucPham,maGioHang,tenThucPham,khoiLuongTP, khoiLuongIt,loaiThucPham,giaTienTP,giaTriDD,phuongAn) " + "values(?,?,?,?,?,?,?,?,?)";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, kq.getMaThucPham());
            pstmt.setString(2, kq.getMaGioHang());
            pstmt.setString(3, kq.getTenThucPham());
            pstmt.setFloat(4, kq.getKhoiLuongTP());
            pstmt.setFloat(5, kq.getKhoiLuongIt());
            pstmt.setString(6, kq.getLoaiThucPham());
            pstmt.setInt(7, kq.getGiaTienTP());
            pstmt.setInt(8, kq.getGiaTriDD());
            pstmt.setFloat(9, kq.getPhuongAn());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean update(KetQua kq) throws Exception {
        String sql = "UPDATE dbo.KetQua"
                + " SET tenThucPham = ?,khoiLuongTP = ?,khoiLuongIt = ?,loaiThucPham = ?,giaTienTP = ?,giaTriDD = ?,phuongAn =?"
                + " where maThucPham = ? AND maGioHang = ?";;
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(8, kq.getMaThucPham());
            pstmt.setString(9, kq.getMaGioHang());
            pstmt.setString(1, kq.getTenThucPham());
            pstmt.setFloat(2, kq.getKhoiLuongTP());
            pstmt.setFloat(3, kq.getKhoiLuongIt());
            pstmt.setString(4, kq.getLoaiThucPham());
            pstmt.setInt(5, kq.getGiaTienTP());
            pstmt.setInt(6, kq.getGiaTriDD());
            pstmt.setFloat(7, kq.getPhuongAn());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean deleteGioHang(String maGioHang)
            throws Exception {

        String sql = "delete from KetQua"
                + " where maGioHang = ?";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maGioHang);
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean deleteThucPham(String maThucPham)
            throws Exception {

        String sql = "delete from KetQua"
                + " where maThucPham = ?";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maThucPham);
            return pstmt.executeUpdate() > 0;
        }
    }

    public KetQua findByID(String maGioHang)
            throws Exception {

        String sql = "select * from KetQua"
                + " where maGioHang = ?";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maGioHang);
            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    KetQua kq = createKetQua(rs);
                    return kq;
                }
            }
            return null;
        }
    }

    public KetQua findByID(String maGioHang, String maThucPham)
            throws Exception {

        String sql = "select * from KetQua"
                + " where maGioHang = ? AND maThucPham = ?";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maGioHang);
            pstmt.setString(2, maThucPham);
            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    KetQua kq = createKetQua(rs);
                    return kq;
                }
            }
            return null;
        }
    }

    public ArrayList<KetQua> findAll()
            throws Exception {
        String sql = "select * from KetQua";
        try (
                 Connection con = DatabasesHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            try ( ResultSet rs = pstmt.executeQuery();) {
                ArrayList<KetQua> list = new ArrayList<>();
                while (rs.next()) {
                    KetQua kq = createKetQua(rs);
                    list.add(kq);
                }
                return list;
            }
        }
    }

    private KetQua createKetQua(final ResultSet rs) throws SQLException {
        KetQua kq = new KetQua();
        kq.setMaThucPham(rs.getString("maThucPham"));
        kq.setMaGioHang(rs.getString("maGioHang"));
        kq.setTenThucPham(rs.getString("tenThucPham"));
        kq.setKhoiLuongTP(rs.getFloat("khoiLuongTP"));
        kq.setKhoiLuongIt(rs.getFloat("khoiLuongIt"));
        kq.setLoaiThucPham(rs.getString("loaiThucPham"));
        kq.setGiaTienTP(rs.getInt("giaTienTP"));
        kq.setGiaTriDD(rs.getInt("giaTriDD"));
        kq.setPhuongAn(rs.getFloat("phuongAn"));
        return kq;
    }
}
