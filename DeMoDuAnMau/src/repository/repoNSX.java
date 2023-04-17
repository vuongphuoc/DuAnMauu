/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.NSX;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoNSX {

    ArrayList<NSX> getall();

//    NSX getOne(String Ma);

    boolean add(NSX nsx);

    boolean update(NSX nsx, String Ma);

    boolean delete(String Ma);
}
