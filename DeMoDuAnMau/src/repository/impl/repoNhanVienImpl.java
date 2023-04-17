/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import DomainModel.NhanVien;
import Utilities.DBCONECT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.repoNhanVien;

/**
 *
 * @author vuong
 */
public class repoNhanVienImpl implements repoNhanVien {

    @Override
    public ArrayList<NhanVien> getall() {
        ArrayList<NhanVien> listSv = new ArrayList<>();

        try {
            Connection conn = DBCONECT.getConnection();
            String query = " select * from NhanVien";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String tendem = rs.getString("Tendem");
                String ho = rs.getString("ho");
                String gioitinh = rs.getString("gioitinh");
                String ngaysinh = rs.getString("ngaysinh");
                String diachi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                String matkhau = rs.getString("matkhau");
                String idch = rs.getString("idch");
                String idcv = rs.getString("idcv");
                String idguibc = rs.getString("idguibc");
                int trangthai = rs.getInt("trangthai");
                NhanVien nv = new NhanVien(id, ma, ten, tendem, ho, gioitinh, ngaysinh, diachi, sdt, matkhau, idch, idcv, idguibc, trangthai);
                listSv.add(nv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSv;
    }

    @Override
    public boolean add(NhanVien nv) {
        try {
            Connection conn = DBCONECT.getConnection();
            String query = "insert into NhanVien(ma, ho, tendem, ten,gioitinh, ngaysinh, diachi, sdt,MatKhau, idch, idcv, trangthai ) values(?, ?,?,?,?,cast( ? as date),?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getHo());
            ps.setString(3, nv.getTenDem());
            ps.setString(4, nv.getTen());
            ps.setString(5, nv.getGioiTinh());
            ps.setString(6, nv.getNgaySinh());
            ps.setString(7, nv.getDiaChi());
            ps.setString(8, nv.getSdt());
            ps.setString(9, nv.getMatKhau());
            ps.setString(10, nv.getIdCH());
            ps.setString(11, nv.getIDCV());
            ps.setInt(12, nv.getTrangThai());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(NhanVien nv, String Ma) {
        try {
            Connection conn = DBCONECT.getConnection();
            String query = "UPDATE [dbo].[NhanVien]"
                    + " SET\n"
                    + "   [Ten] = ?" //1
                    + " ,[TenDem] = ?" //2
                    + "      ,[Ho] = ?" //3
                    + "      ,[NgaySinh] = ?" //4
                    + "      ,[DiaChi] = ?" //5
                    + "      ,[Sdt] = ?"//6
                    + "      ,[MatKhau] = ?" //7
                    + "      ,[IdCH] = ?"//8
                    + "      ,[IdCV] = ?"//9
                    + "      ,[TrangThai] = ?"//10
                    + " WHERE ma= ?"; //11
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getTenDem());
            ps.setString(3, nv.getHo());
            ps.setString(4, nv.getNgaySinh());
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getSdt());
            ps.setString(7, nv.getMatKhau());
            ps.setString(8, nv.getIdCH());
            ps.setString(9, nv.getId());
            ps.setInt(10, nv.getTrangThai());
            ps.setString(11, Ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        try {
            Connection conn = DBCONECT.getConnection();
            String query = "DELETE HoaDonChiTiet WHERE IdHoaDon IN ( SELECT id FROM HoaDon WHERE HoaDon.Id  = (select id from HoaDon where IdNV = ?))"
                    + "DELETE HoaDon WHERE IdNV IN ( SELECT id FROM NhanVien WHERE NhanVien.Id =?)"
                    + "delete from NhanVien where id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, id);
            ps.setString(3, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }

}
