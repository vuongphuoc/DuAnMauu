/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.DongSP;
import Services.ServicesDongSP;
import java.util.ArrayList;
import repository.impl.repoDongSPImpl;
import repository.repoDongSP;

/**
 *
 * @author vuong
 */
public class ServicesDongSPImpl implements ServicesDongSP {

    repoDongSP rdsp = new repoDongSPImpl();

    @Override
    public ArrayList<DongSP> getall() {
        return rdsp.getall();
    }

    @Override
    public String add(DongSP dsp) {
        boolean addSanPham = rdsp.add(dsp);
        if (addSanPham) {
            return "thêm thành công";
        }
        return " thêm thất bại";
    }

    @Override
    public String update(DongSP dsp, String Ma) {
        boolean updateSanPham = rdsp.update(dsp, Ma);
        if (updateSanPham) {
            return "sửa thành công";
        }
        return "sửa thất bại";
    }

    @Override
    public String delete(String Ma) {
        boolean deleteSP = rdsp.delete(Ma);
        if (deleteSP) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
