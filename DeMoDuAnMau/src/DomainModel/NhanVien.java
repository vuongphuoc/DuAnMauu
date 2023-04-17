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
public class NhanVien {

    private String id;
    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
    private String gioiTinh;
    private String ngaySinh;
    private String DiaChi;
    private String sdt;
    private String matKhau;
    private String IdCH;
    private String IDCV;
    private String IdGuiBC;
    private int TrangThai;

    public NhanVien() {
    }

    public NhanVien(String id, String ma, String ten, String tenDem, String ho, String gioiTinh, String ngaySinh, String DiaChi, String sdt, String matKhau, String IdCH, String IDCV, String IdGuiBC, int TrangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.DiaChi = DiaChi;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.IdCH = IdCH;
        this.IDCV = IDCV;
        this.IdGuiBC = IdGuiBC;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
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

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
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

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getIdCH() {
        return IdCH;
    }

    public void setIdCH(String IdCH) {
        this.IdCH = IdCH;
    }

    public String getIDCV() {
        return IDCV;
    }

    public void setIDCV(String IDCV) {
        this.IDCV = IDCV;
    }

    public String getIdGuiBC() {
        return IdGuiBC;
    }

    public void setIdGuiBC(String IdGuiBC) {
        this.IdGuiBC = IdGuiBC;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    

}
