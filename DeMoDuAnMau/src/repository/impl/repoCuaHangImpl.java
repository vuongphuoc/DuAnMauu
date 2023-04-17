/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import Utilities.DBCONECT;
import DomainModel.CuaHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.repoCuaHang;

/**
 *
 * @author vuong
 */
public class repoCuaHangImpl implements repoCuaHang {

    @Override
    public ArrayList<CuaHang> getall() {
        ArrayList<CuaHang> listCH = new ArrayList<>();
        try {
            Connection conn = DBCONECT.getConnection();
            String select = "select * from CuaHang ";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String diaChi = rs.getString("DiaChi");
                String thanhPho = rs.getString("ThanhPho");
                String quocGia = rs.getString("QuocGia");
                CuaHang ch = new CuaHang(id, ma, ten, diaChi, thanhPho, quocGia);
                listCH.add(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCH;
    }

    @Override
    public boolean add(CuaHang ch) {
      
        try {
            Connection conn = DBCONECT.getConnection();
            String insert = "insert into  CuaHang (Ma,Ten,DiaChi, ThanhPho, QuocGia) values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, ch.getMa());
            ps.setString(2, ch.getTen());
            ps.setString(3, ch.getDiachi());
            ps.setString(4, ch.getThanhPho());
            ps.setString(5, ch.getQuocGia());
           ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(CuaHang ch, String Ma) {
      
        try {
            Connection conn = DBCONECT.getConnection();
            String update = "update CuaHang set Ten = ?, DiaChi = ? , ThanhPho =? , QuocGia = ? where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, ch.getTen());
            ps.setString(2, ch.getDiachi());
            ps.setString(3, ch.getThanhPho());
            ps.setString(4, ch.getQuocGia());
            ps.setString(5, Ma);
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
            String query = "DELETE nhanvien WHERE idch IN ( SELECT id FROM cuahang WHERE cuahang.ma = ?)\n"
                    + "		DELETE cuahang WHERE cuahang.ma= ?";
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
