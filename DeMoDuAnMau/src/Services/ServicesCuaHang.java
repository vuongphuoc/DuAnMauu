/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.CuaHang;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesCuaHang {

    ArrayList<CuaHang> getall();

//    CuaHang getOne(String Ten);

    String add(CuaHang ch);

    String update(CuaHang ch, String Ma);

    String delete(String Ma);

//    ArrayList<CuaHang> timKiem(String ten);

}
