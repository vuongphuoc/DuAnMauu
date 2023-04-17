/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesNhanVien {

    ArrayList<NhanVien> getall();

    String add(NhanVien nv);

    String update(NhanVien nv, String Ma);

    String delete(String id);

}
