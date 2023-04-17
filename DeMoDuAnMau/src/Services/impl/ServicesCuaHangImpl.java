/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.CuaHang;
import Services.ServicesCuaHang;
import java.util.ArrayList;
import repository.impl.repoCuaHangImpl;
import repository.repoCuaHang;

/**
 *
 * @author vuong
 */
public class ServicesCuaHangImpl implements ServicesCuaHang {

    repoCuaHang rch = new repoCuaHangImpl();

    @Override
    public ArrayList<CuaHang> getall() {
        return rch.getall();
    }

    @Override
    public String add(CuaHang ch) {
        if (ch.getMa() == null) {
            return "ko đc để trống";
        }
        if (rch.add(ch) == true) {
            return "thêm thành công";
        } else {
            return "thêm thất bại";
        }

//        boolean add = rch.add(ch);
//        if (add) {
//            return "thêm thành công";
//        }
//        return "thêm thất bại";
    }

    @Override
    public String update(CuaHang ch, String Ma) {
        boolean update = rch.update(ch, Ma);
        if (update) {
            return "update thành công";
        }
        return "update thất bại";
    }

    @Override
    public String delete(String Ma) {
        boolean delete = rch.delete(Ma);
        if (delete) {
            return "delete thành công";
        }
        return "delete thất bại";
    }

//    @Override
//    public ArrayList<CuaHang> timKiem(String ten) {
//        ArrayList<CuaHang> listTimKiem = new ArrayList<>();
//        for (CuaHang cuaHang : listTimKiem) {
//            if (cuaHang.getTen().contains(ten)) {
//                listTimKiem.add(cuaHang);
//            }
//        }
//
//        return listTimKiem;
//    }
}
