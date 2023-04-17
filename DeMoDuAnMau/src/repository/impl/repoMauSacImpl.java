/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import Utilities.DBCONECT;
import DomainModel.MauSac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.repoMauSac;

/**
 *
 * @author vuong
 */
public class repoMauSacImpl implements repoMauSac{

    @Override
    public ArrayList<MauSac> getall() {
        ArrayList<MauSac> listMS = new ArrayList<>();
        try {
            Connection conn = DBCONECT.getConnection();
            String select = "select * from MauSac ";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                MauSac sp = new MauSac(id, ma, ten);
                listMS.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMS;
    }

    

    @Override
    public boolean add(MauSac ms) {
        try {
            Connection conn = DBCONECT.getConnection();
            String insert = "insert into MauSac " + "(Ma, Ten)" + "values(?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, ms.getMa());
            ps.setString(2, ms.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(MauSac ms, String Ma) {
        try {
            Connection conn = DBCONECT.getConnection();
            String update = "update MauSac set Ten = ? where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, ms.getTen());
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
            String query = "DELETE ChiTietSP WHERE IdMauSac IN ( SELECT id FROM MauSac WHERE MauSac.Ma = ?)\n"
                    + "		DELETE MauSac WHERE MauSac.ma= ?";
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
