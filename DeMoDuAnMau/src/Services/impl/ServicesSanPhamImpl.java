/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.SanPham;
import Services.ServicesSanPham;

import java.util.ArrayList;
import repository.impl.repoSanPhamImpl;
import repository.repoSanPham;



/**
 *
 * @author vuong
 */
public class ServicesSanPhamImpl implements ServicesSanPham{

    private repoSanPham rsp = new repoSanPhamImpl();


    @Override
    public ArrayList<SanPham> getall() {
       return rsp.getall();
    }

    @Override
    public String add(SanPham sp) {
        boolean addSanPham =  rsp.add(sp);
        if(addSanPham){
            return"thêm thành công";
        }
        return " thêm thất bại";
    }

    @Override
    public String update(SanPham sp, String Ma) {
        boolean updateSanPham = rsp.update(sp, Ma);
        if(updateSanPham){
            return "sửa thành công";
        }
        return "sửa thất bại";
    }

    @Override
    public String delete(String Ma) {
      boolean deleteSP = rsp.delete(Ma);
      if(deleteSP){
          return "Xóa thành công";
      }
      return "Xóa thất bại";
    }
}
