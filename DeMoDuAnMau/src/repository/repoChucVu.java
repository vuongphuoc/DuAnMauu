/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.ChucVu;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoChucVu {

    ArrayList<ChucVu> getall();

    boolean add(ChucVu cv);

    boolean update(ChucVu cv, String Ma);

    boolean delete(String Ma);
}
