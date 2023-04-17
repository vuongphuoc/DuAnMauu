/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.GioHang;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoGioHang {

    ArrayList<GioHang> getAll();

    boolean insert(GioHang gh);

    boolean update(GioHang gh, String id);

    boolean delete(String id);
}
