/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.NSX;
import Services.ServicesNSX;
import java.util.ArrayList;
import repository.impl.repoNSXImpl;
import repository.repoNSX;

/**
 *
 * @author vuong
 */
public class ServicesNSXImpl implements ServicesNSX{
    repoNSX rnsx = new repoNSXImpl();
   @Override
    public ArrayList<NSX> getall() {
       return rnsx.getall();
    }

   

    @Override
    public String add(NSX nsx) {
        boolean addSanPham =  rnsx.add(nsx);
        if(addSanPham){
            return"thêm thành công";
        }
        return " thêm thất bại";
    }

    @Override
    public String update(NSX sp, String Ma) {
        boolean updateSanPham = rnsx.update(sp, Ma);
        if(updateSanPham){
            return "sửa thành công";
        }
        return "sửa thất bại";
    }

    @Override
    public String delete(String Ma) {
      boolean deleteSP = rnsx.delete(Ma);
      if(deleteSP){
          return "Xóa thành công";
      }
      return "Xóa thất bại";
    }
}
