/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author vuong
 */
public class ChiTietSP {

    private String ID;
    private String IDSP;
    private String IdNSX;
    private String IdMauSac;
    private String IdDongSP;
    private int namBH;
    private String moTa;
    private int soLuongTon;
    private double giaNhap;
    private double GiaBan;

    public ChiTietSP() {
    }

    public ChiTietSP(String ID, String IDSP, String IdNSX, String IdMauSac, String IdDongSP, int namBH, String moTa, int soLuongTon, double giaNhap, double GiaBan) {
        this.ID = ID;
        this.IDSP = IDSP;
        this.IdNSX = IdNSX;
        this.IdMauSac = IdMauSac;
        this.IdDongSP = IdDongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.GiaBan = GiaBan;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDSP() {
        return IDSP;
    }

    public void setIDSP(String IDSP) {
        this.IDSP = IDSP;
    }

    public String getIdNSX() {
        return IdNSX;
    }

    public void setIdNSX(String IdNSX) {
        this.IdNSX = IdNSX;
    }

    public String getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(String IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    public String getIdDongSP() {
        return IdDongSP;
    }

    public void setIdDongSP(String IdDongSP) {
        this.IdDongSP = IdDongSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }
    
   

}
