/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.ChucVu;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesChucVu {

    ArrayList<ChucVu> getall();


    String add(ChucVu cv);

    String update(ChucVu cv, String Ma);

    String delete(String Ma);
}
