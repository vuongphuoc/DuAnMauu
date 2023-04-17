/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import Utilities.DBCONECT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DomainModel.ChiTietSP;
import ViewModel.ViewModelCTSP;
import repository.repoChiTietSP;

/**
 *
 * @author vuong
 */
public class repoChiTietSPImpl implements repoChiTietSP {

    @Override
    public ArrayList<ViewModelCTSP> getall() {
        ArrayList<ViewModelCTSP> listChiTietSP = new ArrayList<>();
        try {

            Connection conn = DBCONECT.getConnection();
            String select = "select chitietsp.Id, SanPham.MA as 'masp' , SanPham.Ten as'TenSp',NSX.ten as'Tennsx', MauSac.ten as 'tenmausac', DongSP.Ten as'tenDongSP', ChiTietSP.NamBH, ChiTietSP.SoLuongTon, ChiTietSP.MoTa, ChiTietSP.GiaNhap, ChiTietSP.GiaBan"
                    + "                     FROM ChiTietSP JOIN SanPham ON SanPham.Id = ChiTietSP.IdSP"
                    + "                  				JOIN DongSP ON ChiTietSP.IdDongSP = DongSP.Id\n"
                    + "                 				JOIN MauSac ON ChiTietSP.IdMauSac = MauSac.Id\n"
                    + "                 				JOIN NSX ON ChiTietSP.IdNsx = NSX.Id";
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String masp = rs.getString("masp");
                String tensp = rs.getString("tensp");
                String tennsx = rs.getString("tennsx");
                String tenmausac = rs.getString("tenmausac");
                String tendongsp = rs.getString("tendongsp");
                int namBh = rs.getInt("namBh");
                int soLuongTon = rs.getInt("soLuongTon");
                double giaNhap = rs.getDouble("giaNhap");
                double giaBan = rs.getDouble("giaBan");
                String moTa = rs.getString("moTa");
                ViewModelCTSP cTSP = new ViewModelCTSP(id, masp, tensp, tennsx, tenmausac, tendongsp, namBh, soLuongTon, giaNhap, giaBan, moTa);
                listChiTietSP.add(cTSP);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listChiTietSP;
    }

    @Override
    public boolean add(ChiTietSP ctsp) {
        try {
            Connection conn = DBCONECT.getConnection();
            String insert = "insert into ChiTietSP"
                    + "(IDSP,IdNSX,IdMauSac,IdDongSP,NamBH,Mota,SoLuongTon,GiaNhap,GiaBan)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, ctsp.getIDSP());
            ps.setString(2, ctsp.getIdNSX());
            ps.setString(3, ctsp.getIdMauSac());
            ps.setString(4, ctsp.getIdDongSP());
            ps.setInt(5, ctsp.getNamBH());
            ps.setString(6, ctsp.getMoTa());
            ps.setInt(7, ctsp.getSoLuongTon());
            ps.setDouble(8, ctsp.getGiaNhap());
            ps.setDouble(9, ctsp.getGiaBan());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(ChiTietSP ctsp, String Id) {
        int check = 0;

        try {
            Connection conn = DBCONECT.getConnection();
            String update = "update ChiTietSP set IdSP = ?, IdNSX = ?,IdMauSac = ?, IdDongSP = ?,NamBH = ?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan=? where Id=?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, ctsp.getIDSP());
            ps.setString(2, ctsp.getIdNSX());
            ps.setString(3, ctsp.getIdMauSac());
            ps.setString(4, ctsp.getIdDongSP());
            ps.setInt(5, ctsp.getNamBH());
            ps.setString(6, ctsp.getMoTa());
            ps.setInt(7, ctsp.getSoLuongTon());
            ps.setDouble(8, ctsp.getGiaNhap());
            ps.setDouble(9, ctsp.getGiaBan());
            ps.setString(10, Id);
            check = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String Id) {
        try {
            Connection conn = DBCONECT.getConnection();
            String delete = "delete from ChiTietSP where Id=?";
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, Id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

//    public ArrayList<ChiTietSP> getAll() {
//        ArrayList<ChiTietSP> listChiTietSP = new ArrayList<>();
//        try {
//
//            Connection conn = DBCONECT.getConnection();
//            String select = "select * from ChiTietSP";
//            PreparedStatement ps = conn.prepareStatement(select);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String id = rs.getString("id");
//                String idsp = rs.getString("idsp");
//                String idnsx = rs.getString("idnsx");
//                String idmausac = rs.getString("idmausac");
//                String iddongsp = rs.getString("iddongsp");
//                int nambh = rs.getInt("nambh");
//                String mota = rs.getString("mota");
//                int soluong = rs.getInt("soluongton");
//                double gianhap = rs.getDouble("gianhap");
//                double giaban = rs.getDouble("giaban");
//                ChiTietSP ctsp = new ChiTietSP(id, idsp, idnsx, idmausac, iddongsp, nambh, mota, soluong, gianhap, giaban);
//                listChiTietSP.add(ctsp);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return listChiTietSP;
//    }
//
//    public void insert(ChiTietSP ctsp) {
//        try {
//            Connection conn = DBCONECT.getConnection();
//            String insert = "insert into ChiTietSP"
//                    + "(IDSP,IdNSX,IdMauSac,IdDongSP,NamBH,Mota,SoLuongTon,GiaNhap,GiaBan)"
//                    + "VALUES(?,?,?,?,?,?,?,?,?)";
//            PreparedStatement ps = conn.prepareStatement(insert);
//            ps.setString(1, ctsp.getIDSP());
//            ps.setString(2, ctsp.getIdNSX());
//            ps.setString(3, ctsp.getIdMauSac());
//            ps.setString(4, ctsp.getIdDongSP());
//            ps.setInt(5, ctsp.getNamBH());
//            ps.setString(6, ctsp.getMoTa());
//            ps.setInt(7, ctsp.getSoLuongTon());
//            ps.setDouble(8, ctsp.getGiaNhap());
//            ps.setDouble(9, ctsp.getGiaBan());
//            ps.execute();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public void update(String id, ChiTietSP ctsp) {
//        try {
//            Connection conn = DBCONECT.getConnection();
//            String update = "update ChiTietSP set IdSP = ?, IdNSX = ?,IdMauSac = ?, IdDongSP = ?,NamBH = ?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan=? where Id=?";
//            PreparedStatement ps = conn.prepareStatement(update);
//            ps.setString(1, ctsp.getIDSP());
//            ps.setString(2, ctsp.getIdNSX());
//            ps.setString(3, ctsp.getIdMauSac());
//            ps.setString(4, ctsp.getIdDongSP());
//            ps.setInt(5, ctsp.getNamBH());
//            ps.setString(6, ctsp.getMoTa());
//            ps.setInt(7, ctsp.getSoLuongTon());
//            ps.setDouble(8, ctsp.getGiaNhap());
//            ps.setDouble(9, ctsp.getGiaBan());
//            ps.setString(10, id);
//            ps.execute();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public void delete(String id) {
//        try {
//            Connection conn = DBCONECT.getConnection();
//            String delete = "delete from ChiTietSP where Id=?";
//            PreparedStatement ps = conn.prepareStatement(delete);
//            ps.setString(1, id);
//            ps.execute();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//    @Override
//    public ViewModelChiTietSP getOne(int NamBh) {
//        String query = "SELECT [Id]\n"
//                + "      ,[NamBH]\n"
//                + "      ,[MoTa]\n"
//                + "      ,[SoLuongTon]\n"
//                + "      ,[GiaNhap]\n"
//                + "  FROM [dbo].[ChiTietSP]\n"
//                + "  where NamBH=?";
//        try (Connection con = DBCONECT.getConnection()) {
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setObject(1, NamBh);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return new ViewModelChiTietSP(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getDouble(5));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        }
//        return null;
//    }
}
