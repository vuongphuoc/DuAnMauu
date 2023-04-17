/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.ChiTietSP;
import ViewModel.ViewModelCTSP;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesChiTietSP {

    ArrayList<ViewModelCTSP> getall();

    String add(ChiTietSP ctsp);

    String update(ChiTietSP ctsp, String Id);

    String delete(String Id);

   
}
