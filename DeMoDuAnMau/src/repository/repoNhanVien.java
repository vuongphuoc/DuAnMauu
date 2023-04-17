/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoNhanVien {

    ArrayList<NhanVien> getall();

    boolean add(NhanVien nv);

    boolean update(NhanVien nv, String Ma);

    boolean delete(String id);

}
