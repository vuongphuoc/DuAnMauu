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
public class ViewModelSanPham {

    private String ma;
    private String ten;
    private int nambh;
    private String moTa;
    private int soLuongton;
    private double giaNhap;
    private double giaBan;

    public ViewModelSanPham() {
    }

    public String getMa() {
        return ma;
    }

    public ViewModelSanPham(String ma, String ten, int nambh, String moTa, int soLuongton, double giaNhap, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nambh = nambh;
        this.moTa = moTa;
        this.soLuongton = soLuongton;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }
    

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNambh() {
        return nambh;
    }

    public void setNambh(int nambh) {
        this.nambh = nambh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongton() {
        return soLuongton;
    }

    public void setSoLuongton(int soLuongton) {
        this.soLuongton = soLuongton;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
