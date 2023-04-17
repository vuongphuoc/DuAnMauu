/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.SanPham;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoSanPham {

    ArrayList<SanPham> getall();

//    SanPham getOne(String Ma);

    boolean add(SanPham sp);

    boolean update(SanPham sp, String Ma);

    boolean delete(String Ma);
}
