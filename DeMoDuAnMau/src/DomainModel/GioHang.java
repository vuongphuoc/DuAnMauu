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
public class GioHang {
    private String id;
    private String idKh;
    private String idNV;
    private String Ma;
    private String ngayTao;
    private String NgayThanhToan;
    private String tenNguoiNhan;
    private String DiaChi;
    private String sdt;
    private String tinhTrang;

    public GioHang() {
    }

    public GioHang(String id, String idKh, String idNV, String Ma, String ngayTao, String NgayThanhToan, String tenNguoiNhan, String DiaChi, String sdt, String tinhTrang) {
        this.id = id;
        this.idKh = idKh;
        this.idNV = idNV;
        this.Ma = Ma;
        this.ngayTao = ngayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.tenNguoiNhan = tenNguoiNhan;
        this.DiaChi = DiaChi;
        this.sdt = sdt;
        this.tinhTrang = tinhTrang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdKh() {
        return idKh;
    }

    public void setIdKh(String idKh) {
        this.idKh = idKh;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(String NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
}


