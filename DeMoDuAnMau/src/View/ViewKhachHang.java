/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DomainModel.KhachHang;
import Services.ServicesKhachHang;
import Services.impl.ServicesKhachHangImpl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vuong
 */
public class ViewKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form ViewKhachHang
     */
    private DefaultTableModel defaultTableModel;
    private ServicesKhachHang skh = new ServicesKhachHangImpl();

    public ViewKhachHang() {
        initComponents();
        LoadTable();
        txt_id.disable();
    }

    void LoadTable() {
        defaultTableModel = (DefaultTableModel) tb_KhachHang.getModel();
        defaultTableModel.setRowCount(0);
        for (KhachHang khachHang : skh.getall()) {
            defaultTableModel.addRow(new Object[]{
                khachHang.getIdKh(), khachHang.getMaKH(),
                khachHang.getTenKH(), khachHang.getTenDem(),
                khachHang.getHo(), khachHang.getNgaySinh(), khachHang.getSdt(), khachHang.getDiaChi(),
                khachHang.getThanhPho(), khachHang.getQuocGia(), khachHang.getMatKhau()
            });
        }
    }

    public KhachHang getData() {
        KhachHang kh = new KhachHang();
        kh.setMaKH(txt_Ma.getText());
        kh.setTenKH(txt_ten.getText());
        kh.setTenDem(txt_tenDem.getText());
        kh.setHo(txt_ho.getText());
        kh.setNgaySinh(txt_ngaySinh.getText());
        kh.setSdt(txt_sdt.getText());
        kh.setDiaChi(txt_diaChi.getText());
        kh.setThanhPho(txt_thanhPho.getText());
        kh.setQuocGia(txt_quocGia.getText());
        kh.setMatKhau(txt_matkhau.getText());
        return kh;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_Ma = new javax.swing.JTextField();
        txt_ten = new javax.swing.JTextField();
        txt_tenDem = new javax.swing.JTextField();
        txt_ho = new javax.swing.JTextField();
        txt_ngaySinh = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_diaChi = new javax.swing.JTextField();
        txt_thanhPho = new javax.swing.JTextField();
        txt_quocGia = new javax.swing.JTextField();
        txt_matkhau = new javax.swing.JTextField();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_KhachHang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id");

        jLabel2.setText("Mã");

        jLabel3.setText("Tên");

        jLabel4.setText("Tên đệm");

        jLabel5.setText("Họ");

        jLabel6.setText("Ngày sinh");

        jLabel7.setText("Sdt");

        jLabel8.setText("Địa chỉ");

        jLabel9.setText("Thành Phố");

        jLabel10.setText("Quốc gia");

        jLabel11.setText("Mật khẩu");

        txt_quocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quocGiaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        tb_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã", "Tên", "Tên đệm", "Họ", "Ngày sinh ", "Sdt", "Địa chỉ", "Thành Phố", "Quốc gia", "Mật khẩu"
            }
        ));
        tb_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_KhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_KhachHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_ho, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_tenDem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_quocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_xoa))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_thanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_sua))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(btn_them)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txt_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_thanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_sua)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(txt_tenDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_quocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btn_xoa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(txt_ho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_quocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quocGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quocGiaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, skh.add(getData()));
        LoadTable();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, skh.update(getData(), txt_id.getText()));
        LoadTable();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(this, skh.delete(txt_id.getText()));
        LoadTable();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tb_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_KhachHangMouseClicked
        // TODO add your handling code here:
        int row = tb_KhachHang.getSelectedRow();
        txt_id.setText(tb_KhachHang.getValueAt(row, 0).toString());
        txt_Ma.setText(tb_KhachHang.getValueAt(row, 1).toString());
        txt_ten.setText(tb_KhachHang.getValueAt(row, 2).toString());
        txt_tenDem.setText(tb_KhachHang.getValueAt(row, 3).toString());
        txt_ho.setText(tb_KhachHang.getValueAt(row, 4).toString());
        txt_ngaySinh.setText(tb_KhachHang.getValueAt(row, 5).toString());
        txt_sdt.setText(tb_KhachHang.getValueAt(row, 6).toString());
        txt_diaChi.setText(tb_KhachHang.getValueAt(row, 7).toString());
        txt_thanhPho.setText(tb_KhachHang.getValueAt(row, 8).toString());
        txt_quocGia.setText(tb_KhachHang.getValueAt(row, 9).toString());
        txt_matkhau.setText(tb_KhachHang.getValueAt(row, 10).toString());

    }//GEN-LAST:event_tb_KhachHangMouseClicked

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
            java.util.logging.Logger.getLogger(ViewKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_KhachHang;
    private javax.swing.JTextField txt_Ma;
    private javax.swing.JTextField txt_diaChi;
    private javax.swing.JTextField txt_ho;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_matkhau;
    private javax.swing.JTextField txt_ngaySinh;
    private javax.swing.JTextField txt_quocGia;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tenDem;
    private javax.swing.JTextField txt_thanhPho;
    // End of variables declaration//GEN-END:variables
}
