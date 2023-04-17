/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.MauSac;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoMauSac {
    ArrayList<MauSac> getall();

//    MauSac getOne(String Ma);

    boolean add(MauSac ms);

    boolean update(MauSac ms, String Ma);

    boolean delete(String Ma);
}
