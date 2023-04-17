/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.HoaDon;
import ViewModel.ViewModelTableHD;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesHoaDon {

    ArrayList<ViewModelTableHD> getall();

    String insert(ViewModelTableHD hd);

    String update(HoaDon hd, String id);

    String delete(String id);
}
