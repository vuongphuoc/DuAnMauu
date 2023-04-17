/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DomainModel.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author vuong
 */
public interface ServicesKhachHang {

    ArrayList<KhachHang> getall();

    String add(KhachHang kh);

    String update(KhachHang hang, String id);

    String delete(String id);
}
