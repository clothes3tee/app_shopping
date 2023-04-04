/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class KetQua {

    private String maThucPham, maGioHang, tenThucPham, loaiThucPham;
    private int giaTienTP, giaTriDD;
    private float khoiLuongTP, khoiLuongIt, phuongAn;

    public KetQua(String maThucPham, String maGioHang, String tenThucPham, String loaiThucPham, int giaTienTP, int giaTriDD, float khoiLuongTP, float khoiLuongIt, float phuongAn) {
        this.maThucPham = maThucPham;
        this.maGioHang = maGioHang;
        this.tenThucPham = tenThucPham;
        this.loaiThucPham = loaiThucPham;
        this.giaTienTP = giaTienTP;
        this.giaTriDD = giaTriDD;
        this.khoiLuongTP = khoiLuongTP;
        this.khoiLuongIt = khoiLuongIt;
        this.phuongAn = phuongAn;
    }

    public String getMaThucPham() {
        return maThucPham;
    }

    public void setMaThucPham(String maThucPham) {
        this.maThucPham = maThucPham;
    }

    public String getMaGioHang() {
        return maGioHang;
    }

    public void setMaGioHang(String maGioHang) {
        this.maGioHang = maGioHang;
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

    public int getGiaTienTP() {
        return giaTienTP;
    }

    public void setGiaTienTP(int giaTienTP) {
        this.giaTienTP = giaTienTP;
    }

    public int getGiaTriDD() {
        return giaTriDD;
    }

    public void setGiaTriDD(int giaTriDD) {
        this.giaTriDD = giaTriDD;
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

    public float getPhuongAn() {
        return phuongAn;
    }

    public void setPhuongAn(float phuongAn) {
        this.phuongAn = phuongAn;
    }

    public KetQua() {
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
        final KetQua other = (KetQua) obj;
        if (this.giaTienTP != other.giaTienTP) {
            return false;
        }
        if (this.giaTriDD != other.giaTriDD) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiLuongTP) != Float.floatToIntBits(other.khoiLuongTP)) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiLuongIt) != Float.floatToIntBits(other.khoiLuongIt)) {
            return false;
        }
        if (Float.floatToIntBits(this.phuongAn) != Float.floatToIntBits(other.phuongAn)) {
            return false;
        }
        if (!Objects.equals(this.maThucPham, other.maThucPham)) {
            return false;
        }
        if (!Objects.equals(this.maGioHang, other.maGioHang)) {
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
        final KetQua other = (KetQua) obj;
        if (this.giaTienTP != other.giaTienTP) {
            return false;
        }
        if (this.giaTriDD != other.giaTriDD) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiLuongTP) != Float.floatToIntBits(other.khoiLuongTP)) {
            return false;
        }
        if (Float.floatToIntBits(this.khoiLuongIt) != Float.floatToIntBits(other.khoiLuongIt)) {
            return false;
        }
        if (Float.floatToIntBits(this.phuongAn) != Float.floatToIntBits(other.phuongAn)) {
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

    @Override
    public String toString() {
        int a = 0;
        if (loaiThucPham.equals("Rau củ")) {
            a = 1;
        }
        if (loaiThucPham.equals("Thịt cá")) {
            a = 2;
        }
        if (loaiThucPham.equals("Các loại hạt")) {
            a = 3;
        }
        return  a + " " + khoiLuongTP + " " + khoiLuongIt +" " + giaTriDD + " "+ giaTienTP*1000 + " " + phuongAn+ " " + tenThucPham;
    }

}
