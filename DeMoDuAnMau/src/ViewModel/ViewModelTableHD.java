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
public class ViewModelTableHD {
    private String id;
    private String maHD;
    private String ngayTao;
    private int tinhTrang;

    public ViewModelTableHD() {
    }

    public ViewModelTableHD(String id, String maHD, String ngayTao, int tinhTrang) {
        this.id = id;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.tinhTrang = tinhTrang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
