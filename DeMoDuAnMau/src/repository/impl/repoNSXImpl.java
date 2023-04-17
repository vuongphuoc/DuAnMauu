/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

/**
 *
 * @author vuong
 */
import Utilities.DBCONECT;
import DomainModel.NSX;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import repository.repoNSX;

public class repoNSXImpl implements repoNSX {

    @Override
    public ArrayList<NSX> getall() {
        ArrayList<NSX> listSP = new ArrayList<>();
        try {
            Connection conn = DBCONECT.getConnection();
            String select = "select * from NSX ";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                NSX sp = new NSX(id, ma, ten);
                listSP.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSP;
    }

   
    @Override
    public boolean add(NSX nsx) {
        try {
            Connection conn = DBCONECT.getConnection();
            String insert = "insert into NSX " + "(Ma, Ten)" + "values(?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, nsx.getMa());
            ps.setString(2, nsx.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(NSX nsx, String Ma) {
        try {
            Connection conn = DBCONECT.getConnection();
            String update = "update NSX set Ten = ? where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, nsx.getTen());
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
            String query = "DELETE ChiTietSP WHERE IdNSX IN ( SELECT id FROM NSX WHERE NSX.Ma = ?)"
                    + "		DELETE NSX WHERE NSX.ma= ?";
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
