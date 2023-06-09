/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DomainModel.HoaDon;
import DomainModel.KhachHang;
import DomainModel.NhanVien;
import Services.ServicesHoaDon;
import Services.ServicesKhachHang;
import Services.ServicesNhanVien;
import Services.impl.ServicesHoaDonImpl;
import Services.impl.ServicesKhachHangImpl;
import Services.impl.ServicesNhanVienImpl;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vuong
 */
public class ViewHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form ViewHoaDon
     */
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;
    private ServicesHoaDon shd = new ServicesHoaDonImpl();
    private ServicesKhachHang skh = new ServicesKhachHangImpl();
    private ServicesNhanVien snv = new ServicesNhanVienImpl();

    public ViewHoaDon() {
        initComponents();
        Loadtable();
        addCBBIDNv();
        addCBBIdKH();
        txt_id.disable();
    }

    void addCBBIdKH() {
        defaultComboBoxModel = (DefaultComboBoxModel) cb_IdKH.getModel();
        ArrayList<String> listIDkh = new ArrayList<>();
        for (KhachHang khachHang : skh.getall()) {
            listIDkh.add(khachHang.getMaKH());
        }
        for (String string : listIDkh) {
            defaultComboBoxModel.addElement(string);
        }

    }

    void addCBBIDNv() {
        defaultComboBoxModel = (DefaultComboBoxModel) cb_IdNV.getModel();
        ArrayList<String> listCBBIDNV = new ArrayList<>();
        for (NhanVien nhanVien : snv.getall()) {
            listCBBIDNV.add(nhanVien.getMa());
        }
        for (String string : listCBBIDNV) {
            defaultComboBoxModel.addElement(string);
        }
    }

    public String getIdKhachHang(String maKH) {
        String idKh = "";
        for (KhachHang khachHang : skh.getall()) {
            if (khachHang.getMaKH().equalsIgnoreCase(maKH)) {
                idKh = khachHang.getIdKh();
            }
            break;

        }
        return idKh;
    }

    public String getIDNhanVien(String maNV) {
        String idNv = "";
        for (NhanVien nhanVien : snv.getall()) {
            if (nhanVien.getMa().equalsIgnoreCase(maNV)) {
                idNv = nhanVien.getId();
            }
            break;
        }
        return idNv;
    }

    public String getTinhTrang(int tinhTrang) {
        if (tinhTrang == 0) {
            return "Chờ thanh toán";
        } else {
            return "Đã thanh toán";
        }
    }

    void Loadtable() {
        defaultTableModel = (DefaultTableModel) tb_HoaDon.getModel();
//        defaultTableModel.setRowCount(0);
//        for (HoaDon hd : shd.getall()) {
//            defaultTableModel.addRow(new Object[]{
//                hd.getId(), getIdKhachHang(hd.getIdKH()), getIDNhanVien(hd.getIdNV()),
//                hd.getMa(), hd.getNgayTao(), hd.getNgayThanhToan(), hd.getNgayShip(),
//                hd.getNgayNhan(), getTinhTrang(hd.getTinhTrang()), hd.getTenNguoiNhan(),
//                hd.getDiaChi(), hd.getSdt()
//            });
//        }

    }

//    public HoaDon getData() {
//        HoaDon hd = new HoaDon();
//        hd.setId("");
//        hd.setIdKH(getIdKhachHang(cb_IdKH.getSelectedItem().toString()));
//        hd.setIdNV(getIDNhanVien(cb_IdNV.getSelectedItem().toString()));
//        hd.setMa(txt_Ma.getText());
//        hd.setNgayTao(txt_ngayTao.getText());
//        hd.setNgayThanhToan(txt_ngayThanhToan.getText());
//        hd.setNgayShip(txt_ngayShip.getText());
//        hd.setNgayShip(txt_ngayShip.getText());
//        if (cb_tinhTrang.getSelectedItem().equals("Hàng thật")) {
//            hd.setTinhTrang(0);
//        } else {
//            hd.setTinhTrang(1);
//        }
//        hd.setTenNguoiNhan(txt_ngayNhan.getText());
//        hd.setDiaChi(txt_diaChi.getText());
//        hd.setSdt(txt_sdt.getText());
//        return hd;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_Ma = new javax.swing.JTextField();
        txt_ngayTao = new javax.swing.JTextField();
        txt_ngayThanhToan = new javax.swing.JTextField();
        txt_ngayShip = new javax.swing.JTextField();
        txt_ngayNhan = new javax.swing.JTextField();
        txt_nguoiNhan = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_diaChi = new javax.swing.JTextField();
        cb_IdKH = new javax.swing.JComboBox<>();
        cb_tinhTrang = new javax.swing.JComboBox<>();
        cb_IdNV = new javax.swing.JComboBox<>();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_HoaDon = new javax.swing.JTable();
        btn_Kh = new javax.swing.JButton();
        btn_NV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id");

        jLabel2.setText("Id KH");

        jLabel3.setText("Id NV");

        jLabel4.setText("Mã");

        jLabel5.setText("Ngày tạo");

        jLabel6.setText("Ngày thanh toán");

        jLabel7.setText("Ngày ship");

        jLabel8.setText("Ngày nhận");

        jLabel9.setText("Tình trạng");

        jLabel10.setText("Tên người nhận");

        jLabel11.setText("Sdt");

        jLabel12.setText("Địa chỉ");

        txt_ngayShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ngayShipActionPerformed(evt);
            }
        });

        cb_tinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chờ thanh toán", "Đã thanh toán" }));
        cb_tinhTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tinhTrangActionPerformed(evt);
            }
        });

        cb_IdNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_IdNVActionPerformed(evt);
            }
        });

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        tb_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IDKH", "IDNV", "Ma", "NgayTao", "NgayThanhToan", "NgayShip", "NgayNhan", "TinhTrang", "Ten NguoiNhan", "DiaChi", "SDT"
            }
        ));
        jScrollPane1.setViewportView(tb_HoaDon);

        btn_Kh.setText("+");
        btn_Kh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KhActionPerformed(evt);
            }
        });

        btn_NV.setText("+");
        btn_NV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_them)
                                .addGap(92, 92, 92)
                                .addComponent(btn_sua))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_id)
                                    .addComponent(txt_Ma, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txt_ngayTao, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txt_ngayThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cb_IdKH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_IdNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_Kh)
                                            .addComponent(btn_NV))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_ngayShip, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cb_tinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txt_ngayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_nguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn_xoa)
                                                .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ngayShip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txt_ngayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_IdKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Kh))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(cb_tinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_IdNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NV))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(txt_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(txt_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(txt_ngayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_IdNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_IdNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_IdNVActionPerformed

    private void txt_ngayShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ngayShipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ngayShipActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(this, shd.insert(getData()));
        Loadtable();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(this, shd.update(getData(), txt_id.getText()));
        Loadtable();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, shd.delete(txt_id.getText()));
        Loadtable();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_KhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KhActionPerformed
        // TODO add your handling code here:
//        new ViewKhachHang().setVisible(true);
    }//GEN-LAST:event_btn_KhActionPerformed

    private void btn_NVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NVActionPerformed
        // TODO add your handling code here:
        new ViewNhanVien().setVisible(true);
    }//GEN-LAST:event_btn_NVActionPerformed

    private void cb_tinhTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tinhTrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tinhTrangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Kh;
    private javax.swing.JButton btn_NV;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_IdKH;
    private javax.swing.JComboBox<String> cb_IdNV;
    private javax.swing.JComboBox<String> cb_tinhTrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_HoaDon;
    private javax.swing.JTextField txt_Ma;
    private javax.swing.JTextField txt_diaChi;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_ngayNhan;
    private javax.swing.JTextField txt_ngayShip;
    private javax.swing.JTextField txt_ngayTao;
    private javax.swing.JTextField txt_ngayThanhToan;
    private javax.swing.JTextField txt_nguoiNhan;
    private javax.swing.JTextField txt_sdt;
    // End of variables declaration//GEN-END:variables
}
