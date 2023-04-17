/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.DongSP;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoDongSP {

    ArrayList<DongSP> getall();

//    DongSP getOne(String Ma);

    boolean add(DongSP dsp);

    boolean update(DongSP dsp, String Ma);

    boolean delete(String Ma);
}
