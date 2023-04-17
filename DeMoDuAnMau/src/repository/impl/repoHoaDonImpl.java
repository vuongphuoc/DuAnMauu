/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import DomainModel.HoaDon;
import Utilities.DBCONECT;
import ViewModel.ViewModelTableHD;
import java.sql.Connection;
import java.util.ArrayList;
import repository.repoHoaDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author vuong
 */
public class repoHoaDonImpl implements repoHoaDon {

    @Override
    public ArrayList<ViewModelTableHD> getall() {
        ArrayList<ViewModelTableHD> listHD = new ArrayList<>();
        try {
            Connection conn = DBCONECT.getConnection();
            String select = "select * from HoaDon";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
//                String idKh = rs.getString("IdKH");
//                String idNV = rs.getString("IdNV");
                String Ma = rs.getString("Ma");
                String NgayTao = rs.getString("NgayTao");
//                String NgayThanhToan = rs.getString("NgayThanhToan");
//                String NgayShip = rs.getString("NgayShip");
//                String NgayNhan = rs.getString("NgayNhan");
                int TinhTrang = rs.getInt("TinhTrang");
//                String TenNguoiNhan = rs.getString("TenNguoiNhan");
//                String DiaChi = rs.getString("DiaChi");
//                String Sdt = rs.getString("Sdt");
                ViewModelTableHD vmthd = new ViewModelTableHD(id, Ma, NgayTao, TinhTrang);
                listHD.add(vmthd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHD;
    }

    @Override
    public boolean insert(ViewModelTableHD hd) {
        try {
            Connection conn = DBCONECT.getConnection();
            String insert = "insert into HoaDon" + "(Ma,NgayTao,TinhTrang)" + "VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
//            ps.setString(1, hd.getIdKH());
//            ps.setString(2, hd.getIdNV());
            ps.setString(1, hd.getMaHD());
            ps.setString(2, hd.getNgayTao());
//            ps.setString(5, hd.getNgayThanhToan());
//            ps.setString(6, hd.getNgayShip());
//            ps.setString(7, hd.getNgayNhan());
            ps.setInt(3, hd.getTinhTrang());
//            ps.setString(9, hd.getTenNguoiNhan());
//            ps.setString(10, hd.getDiaChi());
//            ps.setString(11, hd.getSdt());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(HoaDon hd, String id) {
        try {
            Connection conn = DBCONECT.getConnection();
            String update = "update  HoaDon set tinhTrang=? where Id = ? ";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setInt(1, hd.getTinhTrang());
            ps.setString(2, id);

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
            String delete = "delete ChiTietSP where IdHD = ?\n"
                    + "delete HoaDon where Id = ? ";
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, id);
            ps.setString(2, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }

}
