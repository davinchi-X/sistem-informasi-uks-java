/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author User
 */
public class DashboardForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form DashboardForm
     */
    public DashboardForm() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDashboard = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(780, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDashboard.setBackground(new java.awt.Color(255, 255, 255));
        panelDashboard.setPreferredSize(new java.awt.Dimension(730, 450));
        panelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Jadwal dokter");
        jLabel72.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelDashboard.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 200, 30));

        jButton11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Lihat Detail                          >");
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusable(false);
        jButton11.setPreferredSize(new java.awt.Dimension(218, 31));
        panelDashboard.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 224, 29));

        jButton10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Lihat Detail                          >");
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusable(false);
        jButton10.setPreferredSize(new java.awt.Dimension(218, 31));
        panelDashboard.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 140, 224, 29));

        jButton9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Lihat Detail                          >");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setDefaultCapable(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.setPreferredSize(new java.awt.Dimension(218, 31));
        panelDashboard.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 224, 29));

        jLabel70.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("dirawat");
        jLabel70.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelDashboard.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, 30));

        jLabel71.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("berdasarkan Hari");
        jLabel71.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelDashboard.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 200, 30));

        jLabel68.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("dirawat");
        jLabel68.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelDashboard.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, 30));

        jLabel69.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Data  pasien yang sedang");
        jLabel69.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelDashboard.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 200, 30));

        jLabel66.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Data  Dokter");
        jLabel66.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelDashboard.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));

        jLabel22.setBackground(new java.awt.Color(102, 102, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("Dashboard");
        panelDashboard.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kotak biru.png"))); // NOI18N
        panelDashboard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kotak hijau.png"))); // NOI18N
        panelDashboard.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 49, -1, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kotak kuning.png"))); // NOI18N
        panelDashboard.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 49, -1, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Group 25.png"))); // NOI18N
        panelDashboard.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 350, 260));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/peta.png"))); // NOI18N
        panelDashboard.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 280, 170));

        getContentPane().add(panelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JPanel panelDashboard;
    // End of variables declaration//GEN-END:variables
}
