/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import Utilities.DBCONECT;
import DomainModel.ChucVu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.repoChucVu;

/**
 *
 * @author vuong
 */
public class repoChucVuImpl implements repoChucVu {

    @Override
    public ArrayList<ChucVu> getall() {
        ArrayList<ChucVu> listcv = new ArrayList<>();
        try {
            Connection conn = DBCONECT.getConnection();
            String query = " select * from Chucvu ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                ChucVu cv = new ChucVu(id, ma, ten);
                listcv.add(cv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listcv;
    }

    @Override
    public boolean add(ChucVu cv) {
          try {
            Connection conn = DBCONECT.getConnection();
            String query = "insert into Chucvu(ma, ten) values(?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, cv.getMa());
            ps.setString(2, cv.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(ChucVu cv, String Ma) {
        try {
            Connection conn = DBCONECT.getConnection();
            String query = "update ChucVu set ten = ? where ma = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, cv.getTen());
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
            String query = "DELETE Nhanvien WHERE idcv IN ( SELECT id FROM chucvu WHERE chucvu.ma = ?)\n"
                    + "		DELETE chucvu WHERE chucvu.ma= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, Ma);
            ps.setString(2, Ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}