/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.CuaHang;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoCuaHang {

    ArrayList<CuaHang> getall();

    boolean add(CuaHang ch);

    boolean update(CuaHang ch, String Ma);

    boolean delete(String Ma);
}
