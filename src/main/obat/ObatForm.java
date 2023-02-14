/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.obat;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.Koneksi;

/**
 *
 * @author User
 */
public class ObatForm extends javax.swing.JInternalFrame {

    private void reset(){
        txtid.setEditable(false);
        txtnama.setText(null);
        cbjenis.setSelectedIndex(0);
        txtharga.setText(null);
        btnsimpan.setEnabled(true);
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        kodeObat();
    }
    
    private void kodeObat(){
        try{
            String sql = "SELECT MAX(right(kode_obat, 1)) AS kode_obat FROM obat";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if(res.next()){
                int kode = res.getInt(1);
                String AN = "" + (kode + 1);
                String Nol = "";
                
                if(AN.length() == 1){
                    Nol = "00";
                }else if(AN.length() == 2){
                    Nol = "0";
                }else if(AN.length() == 3){
                    Nol = "";
                }
                
                txtid.setText("OBT" + Nol + AN);
                
            } else {
                txtid.setText("OBT001");
            }
        } catch (Exception e){
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }
    
    public ObatForm() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).setNorthPane(null);
        kodeObat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormObat = new javax.swing.JPanel();
        btncari = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        cbjenis = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnDataObat = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(780, 480));

        panelFormObat.setBackground(new java.awt.Color(255, 255, 255));
        panelFormObat.setMaximumSize(new java.awt.Dimension(900, 900));
        panelFormObat.setPreferredSize(new java.awt.Dimension(780, 480));

        btncari.setBackground(new java.awt.Color(255, 255, 255));
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cari.png"))); // NOI18N
        btncari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btncari.setBorderPainted(false);
        btncari.setContentAreaFilled(false);
        btncari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncari.setFocusable(false);
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 255));
        jLabel44.setText("Kode Obat");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 255));
        jLabel45.setText("Nama Obat");

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - Pilih Jenis Obat - -", "Pil", "Tablet", "Sirup", "Serbuk", "Kapsul", "Salep", "Obat Tetes" }));
        cbjenis.setBorder(null);

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 255));
        jLabel46.setText("Jenis Obat");

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 255));
        jLabel47.setText("Harga");

        txtharga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtharga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 0)));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 255));
        jLabel48.setText("Rp. ");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtid.setText("Otomatis");
        txtid.setToolTipText("");
        txtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 0)));

        txtnama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 0)));

        jLabel84.setBackground(new java.awt.Color(102, 102, 255));
        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(51, 51, 255));
        jLabel84.setText("Input Data Obat");

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Vector.png"))); // NOI18N
        btnsimpan.setText(" Simpan");
        btnsimpan.setFocusable(false);
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Group 2803.png"))); // NOI18N
        btnreset.setText(" Reset");
        btnreset.setFocusable(false);
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Group 2802.png"))); // NOI18N
        btndelete.setText(" Delete");
        btndelete.setEnabled(false);
        btndelete.setFocusable(false);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Vector-1.png"))); // NOI18N
        btnupdate.setText(" Update");
        btnupdate.setEnabled(false);
        btnupdate.setFocusable(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnDataObat.setText("Data Obat");
        btnDataObat.setFocusable(false);
        btnDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataObatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormObatLayout = new javax.swing.GroupLayout(panelFormObat);
        panelFormObat.setLayout(panelFormObatLayout);
        panelFormObatLayout.setHorizontalGroup(
            panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormObatLayout.createSequentialGroup()
                .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormObatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel84))
                    .addGroup(panelFormObatLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addGap(29, 29, 29)
                        .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelFormObatLayout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtharga))
                            .addComponent(cbjenis, 0, 218, Short.MAX_VALUE)
                            .addComponent(txtnama)
                            .addComponent(txtid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormObatLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnDataObat))
                    .addGroup(panelFormObatLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        panelFormObatLayout.setVerticalGroup(
            panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormObatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84)
                .addGap(20, 20, 20)
                .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44))
                    .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(panelFormObatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnDataObat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if(txtnama.getText().equals("") || cbjenis.getSelectedIndex() == 0 || txtharga.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Form Tidak Boleh Ada Yang Kosong!!!");
        }else{
            try {
                String sql = "INSERT INTO obat(kode_obat, nama_obat, jenis_obat, harga) "
                        + "VALUES('"+txtid.getText()+"' ,'"+txtnama.getText()+"', '"+cbjenis.getSelectedItem()+"', '"+txtharga.getText()+"')";
                java.sql.Connection conn = (Connection)Koneksi.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Prosess Simpan Data Obat Berhasil..");
                reset();

            }catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String sql = "UPDATE obat SET nama_obat='"+txtnama.getText()+"', jenis_obat='"+cbjenis.getSelectedItem()+"', harga='"+txtharga.getText()+"' WHERE kode_obat = '"+txtid.getText()+"'";
            java.sql.Connection conn = (Connection)Koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Obat Berhasil...");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        reset();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int tanya = JOptionPane.showConfirmDialog(null, "Yakin untuk menghapus data ini?","Confirmation", JOptionPane.YES_NO_OPTION);
        
        if(tanya==0){
            try{
                String sql = "DELETE FROM obat WHERE kode_obat='"+txtid.getText()+"'";
                java.sql.Connection conn = (Connection)Koneksi.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Hapus Data Obat Berhasil....");
            }catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            reset();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        reset();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        String kode = JOptionPane.showInputDialog(null, "Cari Berdasarkan Kode Obat!!!");
        try{
            String sql = "SELECT * FROM obat WHERE kode_obat='"+kode+"'";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            if(res.next()){
                JOptionPane.showMessageDialog(null, "Data ditemukan");
                txtid.setText(res.getString(1));
                txtnama.setText(res.getString(2));
                cbjenis.setSelectedItem(res.getString(3));
                txtharga.setText(res.getString(4));
                
                btnsimpan.setEnabled(false);
                btnupdate.setEnabled(true);
                btndelete.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
                reset();
            }
        } catch (Exception e){
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataObatActionPerformed
        DataObatForm dataObat = new DataObatForm();
        this.getDesktopPane().add(dataObat);
        Dimension gs = this.getDesktopPane().getSize();
        Dimension cs = dataObat.getSize();

        dataObat.setLocation((gs.width - cs.width) / 2, (gs.height - cs.height) / 2);
        
        dataObat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDataObatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataObat;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JPanel panelFormObat;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
