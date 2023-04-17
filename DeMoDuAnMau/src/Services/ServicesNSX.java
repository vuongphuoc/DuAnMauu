/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.NSX;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesNSX {

    ArrayList<NSX> getall();

    String add(NSX nsx);

    String update(NSX nsx, String Ma);

    String delete(String Ma);
}
