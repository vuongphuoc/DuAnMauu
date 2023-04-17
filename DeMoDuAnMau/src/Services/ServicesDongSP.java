/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.DongSP;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesDongSP {
     ArrayList<DongSP> getall();

    

    String add(DongSP dsp);

    String update(DongSP dsp, String Ma);

    String delete(String Ma);
}
