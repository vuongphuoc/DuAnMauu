/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DomainModel.ChiTietSP;
import DomainModel.DongSP;
import DomainModel.MauSac;
import DomainModel.NSX;
import DomainModel.SanPham;
import Services.ServicesChiTietSP;
import Services.ServicesDongSP;
import Services.ServicesMauSac;
import Services.ServicesNSX;
import Services.ServicesSanPham;
import Services.impl.ServicesChiTietSPImpl;
import Services.impl.ServicesDongSPImpl;
import Services.impl.ServicesMauSacImpl;
import Services.impl.ServicesNSXImpl;
import Services.impl.ServicesSanPhamImpl;
import ViewModel.ViewModelCTSP;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vuong
 */
public class ViewChiTietSanPham extends javax.swing.JFrame {

    /**
     * Creates new form ViewChiTietSanPham
     */
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;
    private ServicesChiTietSP sctsp = new ServicesChiTietSPImpl();
    private ServicesSanPham ssp = new ServicesSanPhamImpl();
    private ServicesNSX snsx = new ServicesNSXImpl();
    private ServicesMauSac sms = new ServicesMauSacImpl();
    private ServicesDongSP sdsp = new ServicesDongSPImpl();

    public ViewChiTietSanPham() {
        initComponents();
        LoadTable();
        cbbSanPham();
        cbbDongSP();
        cbbNSX();
        cbbMauSac();

    }

    public void LoadTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tb_chiTietSP.getModel();
        defaultTableModel.setRowCount(0);
        for (ViewModelCTSP chitietsp : sctsp.getall()) {
            defaultTableModel.addRow(new Object[]{
                chitietsp.getMasp(),
                chitietsp.getTensp(),
                chitietsp.getTennsx(),
                chitietsp.getTenmausac(),
                chitietsp.getTendongsp(),
                chitietsp.getNambh(),
                chitietsp.getMota(),
                chitietsp.getSoluongton(),
                chitietsp.getGianhap(),
                chitietsp.getGiaban(),
                chitietsp.getId(),});

        }

    }

    void cbbNSX() {
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) cb_NSX.getModel();
        ArrayList<String> listcbbNSX = new ArrayList<>();
        for (NSX nsx : snsx.getall()) {
            listcbbNSX.add(nsx.getTen());
        }
        for (String string : listcbbNSX) {
            defaultComboBoxModel.addElement(string);
        }
    }

    void cbbMauSac() {
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) cb_mauSac.getModel();
        ArrayList<String> listcbbMauSac = new ArrayList<>();
        for (MauSac mauSac : sms.getall()) {
            listcbbMauSac.add(mauSac.getTen());
        }
        for (String string : listcbbMauSac) {
            defaultComboBoxModel.addElement(string);
        }

    }

    void cbbDongSP() {
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) cb_dongSP.getModel();
        ArrayList<String> listcbbDongSP = new ArrayList<>();
        for (DongSP dongSP : sdsp.getall()) {
            listcbbDongSP.add(dongSP.getTen());
        }
        for (String string : listcbbDongSP) {
            defaultComboBoxModel.addElement(string);
        }
    }

    void cbbSanPham() {
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) cb_sanPham.getModel();
        ArrayList<String> listcbbSanPham = new ArrayList<>();
        for (SanPham sanPham : ssp.getall()) {
            listcbbSanPham.add(sanPham.getTen());
        }
        for (String string : listcbbSanPham) {
            defaultComboBoxModel.addElement(string);
        }
    }

    public String IdMau(String TenMauSac) {
        String idString = "";
        for (MauSac ms : sms.getall()) {
            if (TenMauSac.trim().equals(ms.getTen().trim())) {
                idString = ms.getId();
                break;
            }
        }
        return idString;
    }

    public String Idnsx(String TenNsx) {
        String idString = "";
        for (NSX nsx : snsx.getall()) {
            if (TenNsx.equals(nsx.getTen().trim())) {
                idString = nsx.getId();
                break;
            }
        }
        return idString;
    }

    public String IdDongsp(String TenDongsp) {
        String idString = "";
        for (DongSP dongsp : sdsp.getall()) {
            if (TenDongsp.equals(dongsp.getTen().trim())) {
                idString = dongsp.getId();
                break;
            }
        }
        return idString;
    }

    public String IdSP(String TenSanPham) {
        String idString = "";
        for (SanPham sp : ssp.getall()) {
            if (TenSanPham.trim().equals(sp.getTen().trim())) {
                idString = sp.getId();
                break;
            }
        }
        return idString;
    }

    public ChiTietSP getDaTa() {
        ChiTietSP ctsp = new ChiTietSP();
        int nambh = Integer.parseInt(txt_namBH.getText().trim().toString());
        String moTa = txt_moTa.getText().toString().trim();
        int SL = Integer.parseInt(txt_soLuongTon.getText().toString().trim());
        double giaNhap = Double.parseDouble(txt_giaNhap.getText().toString());
        double giaBan = Double.parseDouble(txt_giaBan.getText().toString());
        String tenmauSac = cb_mauSac.getSelectedItem().toString();
        String tensanpham = cb_sanPham.getSelectedItem().toString();
        String tenDongsp = cb_dongSP.getSelectedItem().toString();
        String tenNsx = cb_NSX.getSelectedItem().toString();
        ctsp.setIDSP(IdSP(tensanpham));
        ctsp.setIdMauSac(IdMau(tenmauSac));
        ctsp.setIdDongSP(IdDongsp(tenDongsp));
        ctsp.setIdNSX(Idnsx(tenNsx));
        ctsp.setNamBH(nambh);
        ctsp.setMoTa(moTa);
        ctsp.setSoLuongTon(SL);
        ctsp.setGiaNhap(giaNhap);
        ctsp.setGiaBan(giaBan);
        return ctsp;
    }

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
        cb_sanPham = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_dongSP = new javax.swing.JComboBox<>();
        cb_mauSac = new javax.swing.JComboBox<>();
        cb_NSX = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_namBH = new javax.swing.JTextField();
        txt_moTa = new javax.swing.JTextField();
        txt_soLuongTon = new javax.swing.JTextField();
        txt_giaNhap = new javax.swing.JTextField();
        txt_giaBan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_chiTietSP = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sp = new javax.swing.JButton();
        btn_ms = new javax.swing.JButton();
        btn_nsx = new javax.swing.JButton();
        btn_dsp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sản Phẩm");

        jLabel2.setText("Dòng SP");

        jLabel3.setText("Màu Săc");

        jLabel4.setText("NSX");

        cb_mauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mauSacActionPerformed(evt);
            }
        });

        jLabel5.setText("Năm BH");

        jLabel6.setText("Mô tả");

        jLabel7.setText("SoLuongTon");

        jLabel8.setText("GiaNhap");

        jLabel9.setText("GiaBan");

        txt_namBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namBHActionPerformed(evt);
            }
        });

        txt_moTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_moTaActionPerformed(evt);
            }
        });

        tb_chiTietSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaSP", "TenSP", "NSX", "MauSac", "DongSP", "Nam Bh", "MoTa", "SoluongTon", "GiaNhap", "GiaBan", "IDCTSP"
            }
        ));
        tb_chiTietSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_chiTietSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_chiTietSP);

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

        btn_sp.setText("SP");
        btn_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_spActionPerformed(evt);
            }
        });

        btn_ms.setText("MS");
        btn_ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_msActionPerformed(evt);
            }
        });

        btn_nsx.setText("NSX");
        btn_nsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nsxActionPerformed(evt);
            }
        });

        btn_dsp.setText("DSP");
        btn_dsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_dongSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_sanPham, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_mauSac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_NSX, 0, 128, Short.MAX_VALUE)
                    .addComponent(txt_namBH)
                    .addComponent(txt_moTa)
                    .addComponent(txt_soLuongTon)
                    .addComponent(txt_giaNhap)
                    .addComponent(txt_giaBan))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sp)
                    .addComponent(btn_ms)
                    .addComponent(btn_nsx)
                    .addComponent(btn_dsp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_sanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_them)
                        .addComponent(btn_sp)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_dongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua)
                    .addComponent(btn_ms))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_mauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa)
                    .addComponent(btn_nsx))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_NSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dsp))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_namBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_moTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_soLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_giaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_giaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_moTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_moTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_moTaActionPerformed

    private void cb_mauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mauSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_mauSacActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        ChiTietSP ctsp = this.getDaTa();
        JOptionPane.showMessageDialog(this, sctsp.add(ctsp));
        LoadTable();

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int row = tb_chiTietSP.getSelectedRow();
        String Id = tb_chiTietSP.getValueAt(row, 10).toString();
        JOptionPane.showMessageDialog(this, sctsp.update(getDaTa(), Id));
        LoadTable();

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int row = tb_chiTietSP.getSelectedRow();
        String Id = tb_chiTietSP.getValueAt(row, 10).toString();
        JOptionPane.showMessageDialog(this, sctsp.delete(Id));
        LoadTable();

    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tb_chiTietSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_chiTietSPMouseClicked
        // TODO add your handling code here:
        int row = tb_chiTietSP.getSelectedRow();
        cb_sanPham.setSelectedItem(tb_chiTietSP.getValueAt(row, 0).toString());
        cb_sanPham.setSelectedItem(tb_chiTietSP.getValueAt(row, 1).toString());
        cb_dongSP.setSelectedItem(tb_chiTietSP.getValueAt(row, 4).toString());
        cb_NSX.setSelectedItem(tb_chiTietSP.getValueAt(row, 2).toString());
        cb_mauSac.setSelectedItem(tb_chiTietSP.getValueAt(row, 3).toString());
        txt_namBH.setText(tb_chiTietSP.getValueAt(row, 5).toString());
        txt_moTa.setText(tb_chiTietSP.getValueAt(row, 6).toString());
        txt_soLuongTon.setText(tb_chiTietSP.getValueAt(row, 7).toString());
        txt_giaNhap.setText(tb_chiTietSP.getValueAt(row, 8).toString());
        txt_giaBan.setText(tb_chiTietSP.getValueAt(row, 9).toString());


    }//GEN-LAST:event_tb_chiTietSPMouseClicked

    private void btn_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_spActionPerformed
        // TODO add your handling code here:
        ViewSanPham vsp = new ViewSanPham();
        vsp.setVisible(true);
        LoadTable();
        this.dispose();

    }//GEN-LAST:event_btn_spActionPerformed

    private void btn_msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_msActionPerformed
        // TODO add your handling code here:
        ViewMauSac vms = new ViewMauSac();
        vms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_msActionPerformed

    private void btn_nsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nsxActionPerformed
        // TODO add your handling code here:
        ViewNSX vnsx = new ViewNSX();
        vnsx.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_nsxActionPerformed

    private void btn_dspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dspActionPerformed
        // TODO add your handling code here:
        ViewDongSP viewDongSP = new ViewDongSP();
        viewDongSP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_dspActionPerformed

    private void txt_namBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namBHActionPerformed

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
            java.util.logging.Logger.getLogger(ViewChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewChiTietSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dsp;
    private javax.swing.JButton btn_ms;
    private javax.swing.JButton btn_nsx;
    private javax.swing.JButton btn_sp;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_NSX;
    private javax.swing.JComboBox<String> cb_dongSP;
    private javax.swing.JComboBox<String> cb_mauSac;
    private javax.swing.JComboBox<String> cb_sanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_chiTietSP;
    private javax.swing.JTextField txt_giaBan;
    private javax.swing.JTextField txt_giaNhap;
    private javax.swing.JTextField txt_moTa;
    private javax.swing.JTextField txt_namBH;
    private javax.swing.JTextField txt_soLuongTon;
    // End of variables declaration//GEN-END:variables
}
