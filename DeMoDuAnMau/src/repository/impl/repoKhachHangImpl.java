/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import Utilities.DBCONECT;
import DomainModel.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.repoKhachHang;

/**
 *
 * @author vuong
 */
public class repoKhachHangImpl implements repoKhachHang {

    @Override
    public ArrayList<KhachHang> getall() {
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        try {
            Connection conn = DBCONECT.getConnection();
            String select = "select * from Khachhang";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String Id = rs.getString("Id");
                String Ma = rs.getString("Ma");
                String Ten = rs.getString("Ten");
                String TenDem = rs.getString("TenDem");
                String Ho = rs.getString("Ho");
                String NgaySinh = rs.getString("NgaySinh");
                String Sdt = rs.getString("Sdt");
                String DiaChi = rs.getString("DiaChi");
                String ThanhPho = rs.getString("ThanhPho");
                String QuocGia = rs.getString("QuocGia");
                String MatKhau = rs.getString("MatKhau");
                KhachHang kh = new KhachHang(Id, Ma, Ten, TenDem, Ho, NgaySinh, Sdt, DiaChi, ThanhPho, QuocGia, MatKhau);
                listKhachHang.add(kh);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listKhachHang;
    }

    @Override
    public boolean add(KhachHang kh) {
        try {
            Connection conn = DBCONECT.getConnection();
            String add = "insert into KhachHang" + "(Ma,Ten,TenDem,Ho,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(add);
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setString(3, kh.getTenDem());
            ps.setString(4, kh.getHo());
            ps.setString(5, kh.getNgaySinh());
            ps.setString(6, kh.getSdt());
            ps.setString(7, kh.getDiaChi());
            ps.setString(8, kh.getThanhPho());
            ps.setString(9, kh.getQuocGia());
            ps.setString(10, kh.getMatKhau());
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(KhachHang kh, String Ma) {
        try {
            Connection conn = DBCONECT.getConnection();
            String update = "update KhachHang set ten = ? , tenDem =?,ho = ?, ngaySinh = ?, sdt= ?, thanhPho =?, quocGia =?,matkhau= ? where ma= ?";
            PreparedStatement ps = conn.prepareStatement(Ma);
            ps.setString(1, kh.getTenKH());
            ps.setString(2, kh.getTenDem());
            ps.setString(3, kh.getHo());
            ps.setString(4, kh.getNgaySinh());
            ps.setString(5, kh.getSdt());
            ps.setString(6, kh.getThanhPho());
            ps.setString(7, kh.getQuocGia());
            ps.setString(8, kh.getMatKhau());
            ps.setString(9, Ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String Ma) {
        try {
            Connection conn = DBCONECT.getConnection();
            String delete = "delete from KhachHang where ma = ?";
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, Ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
