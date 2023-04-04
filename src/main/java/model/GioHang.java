/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class GioHang {
    private String maGioHang, tenGioHang, ghiChu;
    private int soThucPham, soTienMua,  giaTriDD;
    private float khoiluong, soTienCL;
    private String ngayTao;

    public GioHang() {
    }

    public GioHang(String maGioHang, String tenGioHang, String ghiChu, int soThucPham, int soTienMua, int giaTriDD, float khoiluong, float soTienCL, String ngayTao) {
        this.maGioHang = maGioHang;
        this.tenGioHang = tenGioHang;
        this.ghiChu = ghiChu;
        this.soThucPham = soThucPham;
        this.soTienMua = soTienMua;
        this.giaTriDD = giaTriDD;
        this.khoiluong = khoiluong;
        this.soTienCL = soTienCL;
        this.ngayTao = ngayTao;
    }

    public String getMaGioHang() {
        return maGioHang;
    }

    public void setMaGioHang(String maGioHang) {
        this.maGioHang = maGioHang;
    }

    public String getTenGioHang() {
        return tenGioHang;
    }

    public void setTenGioHang(String tenGioHang) {
        this.tenGioHang = tenGioHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getSoThucPham() {
        return soThucPham;
    }

    public void setSoThucPham(int soThucPham) {
        this.soThucPham = soThucPham;
    }

    public int getSoTienMua() {
        return soTienMua;
    }

    public void setSoTienMua(int soTienMua) {
        this.soTienMua = soTienMua;
    }

    public int getGiaTriDD() {
        return giaTriDD;
    }

    public void setGiaTriDD(int giaTriDD) {
        this.giaTriDD = giaTriDD;
    }

    public float getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(float khoiluong) {
        this.khoiluong = khoiluong;
    }

    public float getSoTienCL() {
        return soTienCL;
    }

    public void setSoTienCL(float soTienCL) {
        this.soTienCL = soTienCL;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GioHang other = (GioHang) obj;
        if (this.soThucPham != other.soThucPham) {
            return false;
        }
        if (this.soTienMua != other.soTienMua) {
            return false;
        }
        if (this.giaTriDD != other.giaTriDD) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiluong) != Float.floatToIntBits(other.khoiluong)) {
            return false;
        }
        if (Float.floatToIntBits(this.soTienCL) != Float.floatToIntBits(other.soTienCL)) {
            return false;
        }
        if (!Objects.equals(this.maGioHang, other.maGioHang)) {
            return false;
        }
        if (!Objects.equals(this.tenGioHang, other.tenGioHang)) {
            return false;
        }
        if (!Objects.equals(this.ghiChu, other.ghiChu)) {
            return false;
        }
        if (!Objects.equals(this.ngayTao, other.ngayTao)) {
            return false;
        }
        return true;
    }

     public boolean equalsTest(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GioHang other = (GioHang) obj;
        if (this.soThucPham != other.soThucPham) {
            return false;
        }
        if (this.soTienMua != other.soTienMua) {
            return false;
        }
        if (this.giaTriDD != other.giaTriDD) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiluong) != Float.floatToIntBits(other.khoiluong)) {
            return false;
        }
        if (Float.floatToIntBits(this.soTienCL) != Float.floatToIntBits(other.soTienCL)) {
            return false;
        }
        return true;
    }  
   
}
