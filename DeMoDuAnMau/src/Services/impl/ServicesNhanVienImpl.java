/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.NhanVien;
import Services.ServicesNhanVien;
import java.util.ArrayList;
import repository.impl.repoNhanVienImpl;
import repository.repoNhanVien;

/**
 *
 * @author vuong
 */
public class ServicesNhanVienImpl implements ServicesNhanVien {

    private repoNhanVien rnv = new repoNhanVienImpl();

    @Override
    public ArrayList<NhanVien> getall() {
        return rnv.getall();
    }

    @Override
    public String add(NhanVien nv) {
        boolean add = rnv.add(nv);
        if (add) {
            return " thêm thành công";
        }
        return "thêm thất bại";
    }

    @Override
    public String update(NhanVien nv, String Ma) {

        boolean update = rnv.update(nv, Ma);
        if (update) {
            return " sửa thành công";
        }
        return "sửa thất bại";
    }

    @Override
    public String delete(String id) {
        boolean delete = rnv.delete(id);
        if (delete) {
            return " xóa thành công";
        }
        return "xóa thất bại";
    }

}
