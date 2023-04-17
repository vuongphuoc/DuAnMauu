/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.SanPham;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesSanPham {
    ArrayList<SanPham> getall();

    String add(SanPham sp);

    String update(SanPham sp, String Ma);

    String delete(String Ma);
}
