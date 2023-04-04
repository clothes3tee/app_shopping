/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.DatabasesHelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.GioHang;
import model.ThucPham;

/**
 *
 * @author Admin
 */
public class GioHangDao {
    public boolean insert(GioHang gh) throws Exception{
        String sql = "INSERT INTO dbo.GioHang(maGioHang,tenGioHang,soTienMua,soThucPham,sotienCl,giatriDD,ngayTao,ghiChu) "+"values(?,?,?,?,?,?,?,?)";
        try(
                Connection con = DatabasesHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
          ){
            pstmt.setString(1, gh.getMaGioHang());
            pstmt.setString(2, gh.getTenGioHang());
            pstmt.setInt(3, gh.getSoTienMua());
            pstmt.setInt(4, gh.getSoThucPham());
            pstmt.setFloat(5, gh.getSoTienCL());
            pstmt.setInt(6, gh.getGiaTriDD());
            pstmt.setString(7, gh.getNgayTao());
            pstmt.setString(8, gh.getGhiChu());
            return pstmt.executeUpdate()>0;
        }   
    }
    
    public boolean update(GioHang gh) throws Exception{
        String sql = "UPDATE dbo.GioHang" +
            " SET tenGioHang = ?, soTienMua = ?, soThucPham = ?, sotienCl = ?,giatriDD = ?, ngayTao = ?, ghiChu = ?" +
                " where maGioHang = ?";;
        try(
                Connection con = DatabasesHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
          ){
            pstmt.setString(8, gh.getMaGioHang());
            pstmt.setString(1, gh.getTenGioHang());
            pstmt.setInt(2, gh.getSoTienMua());
            pstmt.setInt(3, gh.getSoThucPham());
            pstmt.setFloat(4, gh.getSoTienCL());
            pstmt.setInt(5, gh.getGiaTriDD());
            pstmt.setString(6, gh.getNgayTao());
            pstmt.setString(7, gh.getGhiChu());
            return pstmt.executeUpdate()>0;
        }   
    }
    
    public boolean delete(String maGioHang) 
        throws Exception{
        
        String sql = "delete from GioHang" +
            " where maGioHang = ?";
        try(
                Connection con = DatabasesHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
          ){
            pstmt.setString(1, maGioHang);
            return pstmt.executeUpdate()>0;
        }   
    }
    
    
    
    public GioHang findByID(String maGioHang) 
        throws Exception{
        
        String sql = "select * from GioHang" +
            " where maGioHang = ?";
        try(
                Connection con = DatabasesHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
          ){
            pstmt.setString(1, maGioHang);
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()){
                    GioHang gh = createGioHang(rs);
                    return gh;
                }
            }
            return null;
        }   
    } 
    
    public GioHang findByName(String tenGioHang) 
        throws Exception{
        
        String sql = "select * from GioHang" +
            " where tenGioHang = ?";
        try(
                Connection con = DatabasesHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
          ){
            pstmt.setString(1, tenGioHang);
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()){
                    GioHang gh = createGioHang(rs);
                    return gh;
                }
            }
            return null;
        }   
    }  
    
    public ArrayList<GioHang> findAll() 
        throws Exception{
        String sql = "select * from GioHang" ;
        try(
                Connection con = DatabasesHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
          ){
            try(ResultSet rs = pstmt.executeQuery();){
               ArrayList<GioHang> list = new ArrayList<>();
                while (rs.next()){
                    GioHang gh = createGioHang(rs);
                    list.add(gh);
                }
                return list;
            }
        }   
    }  

    private GioHang createGioHang(final ResultSet rs) throws SQLException {
        GioHang gh = new GioHang();
        gh.setMaGioHang(rs.getString("maGioHang"));
        gh.setTenGioHang(rs.getString("tenGioHang"));
        gh.setSoTienMua(rs.getInt("soTienMua"));
        gh.setSoThucPham(rs.getInt("soThucPham"));
        gh.setSoTienCL(rs.getFloat("sotienCl"));
        gh.setGiaTriDD(rs.getInt("giatriDD"));
        gh.setNgayTao(rs.getString("ngayTao"));
        gh.setGhiChu(rs.getString("ghiChu"));
        return gh;
    }
    
}