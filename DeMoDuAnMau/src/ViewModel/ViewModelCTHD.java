/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

/**
 *
 * @author vuong
 */
public class ViewModelCTHD {

    private String Ma;
    private String ten;
    private int soLuong;
    private double giaBan;

    public ViewModelCTHD() {
    }

    public ViewModelCTHD(String Ma, String ten, int soLuong, double giaBan) {
        this.Ma = Ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
}
