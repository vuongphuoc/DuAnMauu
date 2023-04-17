/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.ChiTietSP;
import ViewModel.ViewModelCTSP;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoChiTietSP {
    ArrayList<ViewModelCTSP> getall();


    boolean add(ChiTietSP ctsp);

    boolean update(ChiTietSP ctsp, String Id);

    boolean delete(String Id);
}
