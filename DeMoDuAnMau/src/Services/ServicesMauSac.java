/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.MauSac;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesMauSac {
    ArrayList<MauSac> getall();


    String add(MauSac ms);

    String update(MauSac ms, String Ma);

    String delete(String Ma);
}
