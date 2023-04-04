/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;
import javax.swing.JRadioButton;

/**
 *
 * @author Admin
 */
public class ThucPham {
    private int  giaTriDD, giaTienTP;
    private String maThucPham, tenThucPham, loaiThucPham;
    private float  donGia, khoiLuongTP, khoiLuongIt;

    public ThucPham() {
    }

    public ThucPham(int giaTriDD, int giaTienTP, String maThucPham, String tenThucPham, String loaiThucPham, float donGia, float khoiLuongTP, float khoiLuongIt) {
        this.giaTriDD = giaTriDD;
        this.giaTienTP = giaTienTP;
        this.maThucPham = maThucPham;
        this.tenThucPham = tenThucPham;
        this.loaiThucPham = loaiThucPham;
        this.donGia = donGia;
        this.khoiLuongTP = khoiLuongTP;
        this.khoiLuongIt = khoiLuongIt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final ThucPham other = (ThucPham) obj;
        if (this.giaTriDD != other.giaTriDD) {
            return false;
        }
        if (this.giaTienTP != other.giaTienTP) {
            return false;
        }
        if (Float.floatToIntBits(this.donGia) != Float.floatToIntBits(other.donGia)) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiLuongTP) != Float.floatToIntBits(other.khoiLuongTP)) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiLuongIt) != Float.floatToIntBits(other.khoiLuongIt)) {
            return false;
        }
        if (!Objects.equals(this.maThucPham, other.maThucPham)) {
            return false;
        }
        if (!Objects.equals(this.tenThucPham, other.tenThucPham)) {
            return false;
        }
        if (!Objects.equals(this.loaiThucPham, other.loaiThucPham)) {
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
        final ThucPham other = (ThucPham) obj;
        if (this.giaTriDD != other.giaTriDD) {
            return false;
        }
        if (this.giaTienTP != other.giaTienTP) {
            return false;
        }
        if (Float.floatToIntBits(this.donGia) != Float.floatToIntBits(other.donGia)) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiLuongTP) != Float.floatToIntBits(other.khoiLuongTP)) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiLuongIt) != Float.floatToIntBits(other.khoiLuongIt)) {
            return false;
        }
        if (!Objects.equals(this.tenThucPham, other.tenThucPham)) {
            return false;
        }
        if (!Objects.equals(this.loaiThucPham, other.loaiThucPham)) {
            return false;
        }
        return true;
    }

    public int getGiaTriDD() {
        return giaTriDD;
    }

    public void setGiaTriDD(int giaTriDD) {
        this.giaTriDD = giaTriDD;
    }

    public int getGiaTienTP() {
        return giaTienTP;
    }

    public void setGiaTienTP(int giaTienTP) {
        this.giaTienTP = giaTienTP;
    }

    public String getMaThucPham() {
        return maThucPham;
    }

    public void setMaThucPham(String maThucPham) {
        this.maThucPham = maThucPham;
    }

    public String getTenThucPham() {
        return tenThucPham;
    }

    public void setTenThucPham(String tenThucPham) {
        this.tenThucPham = tenThucPham;
    }

    public String getLoaiThucPham() {
        return loaiThucPham;
    }

    public void setLoaiThucPham(String loaiThucPham) {
        this.loaiThucPham = loaiThucPham;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getKhoiLuongTP() {
        return khoiLuongTP;
    }

    public void setKhoiLuongTP(float khoiLuongTP) {
        this.khoiLuongTP = khoiLuongTP;
    }

    public float getKhoiLuongIt() {
        return khoiLuongIt;
    }

    public void setKhoiLuongIt(float khoiLuongIt) {
        this.khoiLuongIt = khoiLuongIt;
    }

    @Override
    public String toString() {
        
        return "ThucPham{" + "giaTriDD=" + giaTriDD + ", giaTienTP=" + giaTienTP + ", tenThucPham=" + tenThucPham + ", loaiThucPham=" + loaiThucPham + ", donGia=" + donGia + ", khoiLuongTP=" + khoiLuongTP + ", khoiLuongIt=" + khoiLuongIt + '}';
    }

   
    
    
}
