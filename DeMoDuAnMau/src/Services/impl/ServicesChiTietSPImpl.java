/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.ChiTietSP;
import Services.ServicesChiTietSP;
import ViewModel.ViewModelCTSP;
import java.util.ArrayList;
import repository.impl.repoChiTietSPImpl;
import repository.repoChiTietSP;

/**
 *
 * @author vuong
 */
public class ServicesChiTietSPImpl implements ServicesChiTietSP {

    private repoChiTietSP rctsp = new repoChiTietSPImpl();

    @Override
    public ArrayList<ViewModelCTSP> getall() {
        return rctsp.getall();
    }

    @Override
    public String add(ChiTietSP ctsp) {
        boolean add = rctsp.add(ctsp);
        if (add) {
            return "thêm thành công";
        }
        return " thêm thất bại";
    }

    @Override
    public String update(ChiTietSP ctsp, String Id) {
        boolean update = rctsp.update(ctsp, Id);
        if (update) {
            return " sửa thành công";
        }
        return " sửa thất bại";
    }

    @Override
    public String delete(String Id) {
        boolean delete = rctsp.delete(Id);
        if (delete) {
            return "xóa thành công";
        }
        return "xóa thất bại";
    }


}
