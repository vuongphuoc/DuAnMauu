/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import Utilities.DBCONECT;
import DomainModel.DongSP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.repoDongSP;

/**
 *
 * @author vuong
 */
public class repoDongSPImpl implements repoDongSP{
    @Override
    public ArrayList<DongSP> getall() {
        ArrayList<DongSP> listDSP = new ArrayList<>();
        try {
            Connection conn = DBCONECT.getConnection();
            String select = "select * from DongSP ";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                DongSP sp = new DongSP(id, ma, ten);
                listDSP.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDSP;
    }

    

    @Override
    public boolean add(DongSP dsp) {
        try {
            Connection conn = DBCONECT.getConnection();
            String insert = "insert into DongSP " + "(Ma, Ten)" + "values(?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, dsp.getMa());
            ps.setString(2, dsp.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update(DongSP dsp, String Ma) {
        try {
            Connection conn = DBCONECT.getConnection();
            String update = "update DongSP set Ten = ? where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, dsp.getTen());
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
            String query = "DELETE ChiTietSP WHERE IdDongSP IN ( SELECT id FROM DongSP WHERE DongSP.Ma = ?)\n"
                    + "		DELETE DongSP WHERE DongSP.ma= ?";
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
