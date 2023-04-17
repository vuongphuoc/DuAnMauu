/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import Utilities.DBCONECT;
import DomainModel.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.repoSanPham;

/**
 *
 * @author vuong
 */
public class repoSanPhamImpl implements repoSanPham {

    @Override
    public ArrayList<SanPham> getall() {
        ArrayList<SanPham> listSP = new ArrayList<>();
        try {
            Connection conn = DBCONECT.getConnection();
            String select = "select * from SanPham ";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                SanPham sp = new SanPham(id, ma, ten);
                listSP.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSP;
    }

//    @Override
//    public SanPham getOne(String Ma) {
//
//        try {
//            Connection conn = DBCONECT.getConnection();
//            String select = "select  Ma, Ten from SanPham where Ma = ? ";
//            PreparedStatement ps = conn.prepareStatement(select);
//            ps.execute();
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {
//
//             String ma = rs.getString("Ma");
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    @Override
    public boolean add(SanPham sp) {
        try {
            Connection conn = DBCONECT.getConnection();
            String insert = "insert into SanPham " + "(Ma, Ten)" + "values(?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, sp.getMa());
            ps.setString(2, sp.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(SanPham sp, String Ma) {
        try {
            Connection conn = DBCONECT.getConnection();
            String update = "update SanPham set Ten = ? where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, sp.getTen());
            ps.setString(2, Ma);
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
            String query = "DELETE ChiTietSP WHERE IdSP IN ( SELECT id FROM SanPham WHERE SanPham.Ma = ?)\n"
                    + "		DELETE SanPham WHERE SanPham.ma= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, Ma);
            ps.setString(2, Ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
//    public ArrayList<SanPham> all() {
//        ArrayList<SanPham> listSP = new ArrayList<>();
//        try {
//            Connection conn = DBCONECT.getConnection();
//            String select = "select * from SanPham ";
//            PreparedStatement ps = conn.prepareStatement(select);
//            ps.execute();
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {
//                String id = rs.getString("Id");
//                String ma = rs.getString("Ma");
//                String ten = rs.getString("Ten");
//                SanPham sp = new SanPham(id, ma, ten);
//                listSP.add(sp);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listSP;
//    }
//
//    public void insert(SanPham sp) {
//        try {
//            Connection conn = DBCONECT.getConnection();
//            String insert = "insert into SanPham " + "(Ma, Ten)" + "values(?,?)";
//            PreparedStatement ps = conn.prepareStatement(insert);
//            ps.setString(1, sp.getMa());
//            ps.setString(2, sp.getTen());
//            ps.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void update(SanPham sp, String Ma) {
//        try {
//            Connection conn = DBCONECT.getConnection();
//            String update = "update SanPham set Ten = ? where Ma = ?";
//            PreparedStatement ps = conn.prepareStatement(update);
//            ps.setString(1,sp.getTen());
//            ps.setString(2, Ma);
//            ps.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void delete(String Ma) {
//        
//        try {
//            Connection conn = DBCONECT.getConnection();
//            String query = "DELETE ChiTietSP WHERE IdSP IN ( SELECT id FROM SanPham WHERE SanPham.Ma = ?)\n"
//                    + "		DELETE SanPham WHERE SanPham.ma= ?";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, Ma);
//            ps.setString(2, Ma);
//            ps.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
