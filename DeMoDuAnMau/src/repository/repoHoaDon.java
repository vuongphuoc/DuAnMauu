/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.HoaDon;
import ViewModel.ViewModelTableHD;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoHoaDon {

    ArrayList<ViewModelTableHD> getall();

    boolean insert(ViewModelTableHD hd);

    boolean update(HoaDon hd, String id);

    boolean delete(String id);
}
