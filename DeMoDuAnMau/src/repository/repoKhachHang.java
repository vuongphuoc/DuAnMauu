/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import DomainModel.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface repoKhachHang {

    ArrayList<KhachHang> getall();

    boolean add(KhachHang kh);

    boolean update(KhachHang kh, String Ma);

    boolean delete(String Ma);
}
