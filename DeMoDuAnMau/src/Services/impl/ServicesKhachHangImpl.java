/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.KhachHang;
import Services.ServicesKhachHang;
import java.util.ArrayList;
import repository.impl.repoKhachHangImpl;
import repository.repoKhachHang;

/**
 *
 * @author vuong
 */
public class ServicesKhachHangImpl implements ServicesKhachHang {

    repoKhachHang rkh = new repoKhachHangImpl();

    @Override
    public ArrayList<KhachHang> getall() {
        return rkh.getall();
    }

    @Override
    public String add(KhachHang kh) {
        boolean add = rkh.add(kh);
        if (add) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(KhachHang hang, String id) {
        boolean update = rkh.update(hang, id);
        if (update) {
            return "update thành công";
        }
        return "update thất bại";
    }

    @Override
    public String delete(String id) {
        boolean delete = rkh.delete(id);
        if (delete) {
            return "delete thành công";
        }
        return "delete thất bại";
    }

}
