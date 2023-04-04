/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class PhuongAn {
    private String maThucPham;
    private float phuongAn;

    public PhuongAn() {
    }

    public PhuongAn(String maThucPham, long phuongAn) {
        this.maThucPham = maThucPham;
        this.phuongAn = phuongAn;
    }

    public String getMaThucPham() {
        return maThucPham;
    }

    public void setMaThucPham(String maThucPham) {
        this.maThucPham = maThucPham;
    }

    public float getPhuongAn() {
        return phuongAn;
    }

    public void setPhuongAn(float phuongAn) {
        this.phuongAn = phuongAn;
    }

    
    
}
