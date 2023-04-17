/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.impl;

import DomainModel.ChucVu;
import Services.ServicesChucVu;
import java.util.ArrayList;
import repository.impl.repoChucVuImpl;
import repository.repoChucVu;

/**
 *
 * @author vuong
 */
public class ServicesChucVuImpl implements ServicesChucVu{
    repoChucVu rcv = new repoChucVuImpl();

    @Override
    public ArrayList<ChucVu> getall() {
        return rcv.getall();
    }

    @Override
    public String add(ChucVu cv) {
        boolean add = rcv.add(cv);
        if(add){
            return "thêm thành công";
        }
        return"thêm thất bại";
    }

    @Override
    public String update(ChucVu cv, String Ma) {
        boolean update = rcv.update(cv, Ma);
        if(update){
            return "update thành công";
        }
        return"update thất bại";
        
    }

    @Override
    public String delete(String Ma) {
        boolean delete = rcv.delete(Ma);
        if(delete){
            return "delete thành công";
        }
        return"delete thất bại";
    }

    

    
}
