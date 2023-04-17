/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DomainModel.ChucVu;
import DomainModel.CuaHang;
import DomainModel.NhanVien;
import Services.ServicesChucVu;
import Services.ServicesCuaHang;
import Services.ServicesNhanVien;
import Services.impl.ServicesChucVuImpl;
import Services.impl.ServicesCuaHangImpl;
import Services.impl.ServicesNhanVienImpl;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vuong
 */
public class ViewNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form ViewNhanVien
     */
    private ServicesNhanVien snv = new ServicesNhanVienImpl();
    private ServicesChucVu scv = new ServicesChucVuImpl();
    private ServicesCuaHang scH = new ServicesCuaHangImpl();
    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;
    ButtonGroup buttonGroup = new ButtonGroup();

    public ViewNhanVien() {
        initComponents();
        GioiTinh();
        LoadTable();
        addCbbChucVu();
        addCbbCuaHang();
        txt_id.disable();
        txt_idguiBC.disable();

    }

    void GioiTinh() {
        buttonGroup.add(rd_nam);
        buttonGroup.add(rd_nu);
    }

    void addCbbChucVu() {
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) cb_maCV.getModel();
        ArrayList<String> listcbbCV = new ArrayList<>();
        for (ChucVu chucVu : scv.getall()) {
            listcbbCV.add(chucVu.getMa());
        }
        for (String string : listcbbCV) {
            defaultComboBoxModel.addElement(string);
        }
    }

    void addCbbCuaHang() {
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) cb_maCH.getModel();
        ArrayList<String> listcbbCH = new ArrayList<>();
        for (CuaHang ch : scH.getall()) {
            listcbbCH.add(ch.getMa());
        }
        for (String string : listcbbCH) {
            defaultComboBoxModel.addElement(string);
        }
    }

    public String getMaCuaHang(String idch) {
        String Mach = "";
        for (CuaHang cuaHang : scH.getall()) {
            if (cuaHang.getId().equalsIgnoreCase(idch)) {
                Mach = cuaHang.getMa();
                break;
            }

        }
        return Mach;
    }

    public String getMaChucVu(String idcv) {
        String macv = "";
        for (ChucVu cv : scv.getall()) {
            if (cv.getId().equalsIgnoreCase(idcv)) {
                macv = cv.getMa();
                break;
            }

        }
        return macv;
    }

    public String getIDCuaHang(String MaCH) {
        String idCH = "";
        for (CuaHang cuaHang : scH.getall()) {
            if (cuaHang.getMa().equalsIgnoreCase(MaCH)) {
                idCH = cuaHang.getId();
                break;
            }

        }
        return idCH;
    }

    public String getIDChucVu(String MaCV) {
        String idCv = "";
        for (ChucVu cv : scv.getall()) {
            if (cv.getMa().equalsIgnoreCase(MaCV)) {
                idCv = cv.getId();
                break;
            }

        }
        return idCv;
    }

    public String getTrangThaiViecLam(int trangThai) {
        if (trangThai == 0) {
            return "Đang làm việc";
        } else {
            return "Đã nghỉ việc";
        }
    }

    void LoadTable() {
        defaultTableModel = (DefaultTableModel) tb_NhanVien.getModel();
        defaultTableModel.setRowCount(0);
        for (NhanVien nhanVien : snv.getall()) {
            defaultTableModel.addRow(new Object[]{
                nhanVien.getId(), nhanVien.getMa(), nhanVien.getHo(), nhanVien.getTenDem(),
                nhanVien.getTen(), nhanVien.getGioiTinh(), nhanVien.getNgaySinh(),
                nhanVien.getDiaChi(), nhanVien.getSdt(), nhanVien.getMatKhau(),
                getMaCuaHang(nhanVien.getIdCH()),
                getMaChucVu(nhanVien.getIDCV()), getTrangThaiViecLam(nhanVien.getTrangThai())});

        }
    }

    public NhanVien getData() {
        NhanVien nv = new NhanVien();
        nv.setId(txt_id.getText());
        nv.setMa(txt_maKH.getText());
        nv.setHo(txt_ho.getText());
        nv.setTenDem(txt_tenDem.getText());
        nv.setTen(txt_Ten.getText());
        if (rd_nam.isSelected()) {
            nv.setGioiTinh("Nam");
        } else {
            nv.setGioiTinh("Nữ");
        }
        nv.setNgaySinh(txt_ngaySinh.getText());
        nv.setDiaChi(txt_diaChi.getText());
        nv.setSdt(txt_sdt.getText());
        nv.setMatKhau(txt_matKhau.getText());
        nv.setIdCH(getIDCuaHang(cb_maCH.getSelectedItem().toString()));
        nv.setIDCV(getIDChucVu(cb_maCV.getSelectedItem().toString()));
        if (cb_trangThai.getSelectedItem().equals("Đang làm việc")) {
            nv.setTrangThai(0);
        } else {
            nv.setTrangThai(1);
        }
        return nv;
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_maKH = new javax.swing.JTextField();
        txt_ho = new javax.swing.JTextField();
        txt_tenDem = new javax.swing.JTextField();
        txt_Ten = new javax.swing.JTextField();
        txt_idguiBC = new javax.swing.JTextField();
        txt_ngaySinh = new javax.swing.JTextField();
        txt_diaChi = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_matKhau = new javax.swing.JTextField();
        cb_maCH = new javax.swing.JComboBox<>();
        cb_maCV = new javax.swing.JComboBox<>();
        cb_trangThai = new javax.swing.JComboBox<>();
        rd_nam = new javax.swing.JRadioButton();
        rd_nu = new javax.swing.JRadioButton();
        add_Cv = new javax.swing.JButton();
        add_CH = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_NhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id");

        jLabel2.setText("MÃ");

        jLabel3.setText("Họ");

        jLabel4.setText("Tên đệm");

        jLabel5.setText("Tên");

        jLabel6.setText("Mã CH");

        jLabel7.setText("NgaySinh");

        jLabel8.setText("Giới tính");

        jLabel9.setText("Địa chỉ");

        jLabel10.setText("sdt");

        jLabel11.setText("Mật khẩu");

        jLabel12.setText("Mã CV");

        jLabel13.setText("Id guiBC ");

        jLabel14.setText("Trạng thái");

        txt_ho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hoActionPerformed(evt);
            }
        });

        txt_tenDem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenDemActionPerformed(evt);
            }
        });

        txt_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sdtActionPerformed(evt);
            }
        });

        cb_maCH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cb_trangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang làm việc", "Đã nghỉ việc" }));

        rd_nam.setText("Nam");

        rd_nu.setText("Nữ");

        add_Cv.setText("+");
        add_Cv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_CvActionPerformed(evt);
            }
        });

        add_CH.setText("+");
        add_CH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_CHActionPerformed(evt);
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

        tb_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã", "Họ", "Tên đệm", "tên", "Giới tính", "ngày sinh", "địac chỉ", "sdt", "Mật khẩu", "Mã CH", "Mã CV", "Trạng thái"
            }
        ));
        tb_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_NhanVien);

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
                            .addComponent(jLabel13)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_idguiBC, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txt_Ten, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txt_tenDem, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txt_ho, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txt_maKH, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txt_id)
                            .addComponent(cb_maCH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(add_CH)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_nam)
                                .addGap(33, 33, 33)
                                .addComponent(rd_nu))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_xoa)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_sdt, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(txt_diaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(txt_ngaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(cb_maCV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_matKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(cb_trangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(34, 34, 34)
                                .addComponent(add_Cv))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btn_them)
                        .addGap(139, 139, 139)
                        .addComponent(btn_sua)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txt_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_nam)
                    .addComponent(rd_nu))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txt_ho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(txt_tenDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(cb_maCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_maCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_Cv)
                    .addComponent(add_CH))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txt_idguiBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_hoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hoActionPerformed

    private void txt_tenDemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenDemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenDemActionPerformed

    private void txt_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sdtActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, snv.add(getData()));
        LoadTable();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handlin code here:
        JOptionPane.showMessageDialog(this, snv.update(getData(), txt_maKH.getText()));
        LoadTable();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int row = tb_NhanVien.getSelectedRow();
        String id = tb_NhanVien.getValueAt(row, 0).toString();
        JOptionPane.showMessageDialog(this, snv.delete(id));
        LoadTable();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void add_CHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_CHActionPerformed
        // TODO add your handling code here:

        new ViewCuaHang().setVisible(true);
    }//GEN-LAST:event_add_CHActionPerformed

    private void add_CvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_CvActionPerformed
        // TODO add your handling code here:
        new ViewChucVu().setVisible(true);
    }//GEN-LAST:event_add_CvActionPerformed

    private void tb_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_NhanVienMouseClicked
        // TODO add your handling code here:
        int row = tb_NhanVien.getSelectedRow();

        txt_id.setText(tb_NhanVien.getValueAt(row, 0).toString());
        txt_maKH.setText(tb_NhanVien.getValueAt(row, 1).toString());
        txt_ho.setText(tb_NhanVien.getValueAt(row, 2).toString());
        txt_tenDem.setText(tb_NhanVien.getValueAt(row, 3).toString());
        txt_Ten.setText(tb_NhanVien.getValueAt(row, 4).toString());
        if (tb_NhanVien.getValueAt(row, 5).equals("Nam")) {
            rd_nam.setSelected(true);
        } else {
            rd_nu.setSelected(true);
        }
        txt_ngaySinh.setText(tb_NhanVien.getValueAt(row, 6).toString());
        txt_diaChi.setText(tb_NhanVien.getValueAt(row, 7).toString());
        txt_sdt.setText(tb_NhanVien.getValueAt(row, 8).toString());
        txt_matKhau.setText(tb_NhanVien.getValueAt(row, 9).toString());
        cb_maCH.setSelectedItem(tb_NhanVien.getValueAt(row, 10).toString());
        cb_maCV.setSelectedItem(tb_NhanVien.getValueAt(row, 11).toString());
        cb_trangThai.setSelectedItem(tb_NhanVien.getValueAt(row, 12).toString());

    }//GEN-LAST:event_tb_NhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_CH;
    private javax.swing.JButton add_Cv;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_maCH;
    private javax.swing.JComboBox<String> cb_maCV;
    private javax.swing.JComboBox<String> cb_trangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private javax.swing.JTable tb_NhanVien;
    private javax.swing.JTextField txt_Ten;
    private javax.swing.JTextField txt_diaChi;
    private javax.swing.JTextField txt_ho;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_idguiBC;
    private javax.swing.JTextField txt_maKH;
    private javax.swing.JTextField txt_matKhau;
    private javax.swing.JTextField txt_ngaySinh;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tenDem;
    // End of variables declaration//GEN-END:variables
}
