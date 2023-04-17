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
public class ViewModelCTSP {

    private String id;
    private String masp;
    private String tensp;
    private String tennsx;
    private String tenmausac;
    private String tendongsp;
    private int nambh;
    private int soluongton;
    private double gianhap;
    private double giaban;
    private String mota;

    public ViewModelCTSP() {
    }

    public ViewModelCTSP(String id, String masp, String tensp, String tennsx, String tenmausac, String tendongsp, int nambh, int soluongton, double gianhap, double giaban, String mota) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
        this.tennsx = tennsx;
        this.tenmausac = tenmausac;
        this.tendongsp = tendongsp;
        this.nambh = nambh;
        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.mota = mota;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getTennsx() {
        return tennsx;
    }

    public void setTennsx(String tennsx) {
        this.tennsx = tennsx;
    }

    public String getTenmausac() {
        return tenmausac;
    }

    public void setTenmausac(String tenmausac) {
        this.tenmausac = tenmausac;
    }

    public String getTendongsp() {
        return tendongsp;
    }

    public void setTendongsp(String tendongsp) {
        this.tendongsp = tendongsp;
    }

    public int getNambh() {
        return nambh;
    }

    public void setNambh(int nambh) {
        this.nambh = nambh;
    }

    public int getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(int soluongton) {
        this.soluongton = soluongton;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

}
