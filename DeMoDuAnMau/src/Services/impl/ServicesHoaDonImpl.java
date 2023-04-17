/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.HoaDon;
import Services.ServicesHoaDon;
import ViewModel.ViewModelTableHD;
import java.util.ArrayList;
import repository.impl.repoHoaDonImpl;
import repository.repoHoaDon;

/**
 *
 * @author vuong
 */
public class ServicesHoaDonImpl implements ServicesHoaDon {

    repoHoaDon rhd = new repoHoaDonImpl();

    @Override
    public ArrayList<ViewModelTableHD> getall() {
        return rhd.getall();
    }

    @Override
    public String insert(ViewModelTableHD hd) {
        boolean insert = rhd.insert(hd);
        if (insert) {
            return "thêm thành công";
        }
        return "thêm thất bại";
    }

    @Override
    public String update(HoaDon hd, String id) {
        boolean update = rhd.update(hd, id);
        if (update) {
            return "update thành công";
        }
        return "update thất bại";
    }

    @Override
    public String delete(String id) {
        boolean delete = rhd.delete(id);
        if (delete) {
            return "delete thành công";
        }
        return "delete thất bại";
    }

}
