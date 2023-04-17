/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.MauSac;
import Services.ServicesMauSac;
import java.util.ArrayList;
import repository.impl.repoMauSacImpl;
import repository.impl.repoNSXImpl;
import repository.repoMauSac;

/**
 *
 * @author vuong
 */
public class ServicesMauSacImpl implements ServicesMauSac {

    repoMauSac rms = new repoMauSacImpl();

    @Override
    public ArrayList<MauSac> getall() {
        return rms.getall();
    }


    @Override
    public String add(MauSac nsx) {
        boolean addSanPham = rms.add(nsx);
        if (addSanPham) {
            return "thêm thành công";
        }
        return " thêm thất bại";
    }

    @Override
    public String update(MauSac sp, String Ma) {
        boolean updateSanPham = rms.update(sp, Ma);
        if (updateSanPham) {
            return "sửa thành công";
        }
        return "sửa thất bại";
    }

    @Override
    public String delete(String Ma) {
        boolean deleteSP = rms.delete(Ma);
        if (deleteSP) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
