/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.vista;

import com.sansana.modelo.Accesos;
import com.sansana.vista.medicamento.IfInventario;
import javax.swing.ImageIcon;

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO

 */
public final class FrmMenu extends javax.swing.JFrame {

    Accesos accesos = new Accesos();
    IfInventario acceso  = new IfInventario();

    public FrmMenu() {
        setComponentes();
        initComponents(); 
    }
    public void setComponentes(){
        this.setUndecorated(true);
        setIconImage(new ImageIcon(getClass().getResource("/assets/logo.png")).getImage());   
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSuculsal = new javax.swing.JLabel();
        lblRUC = new javax.swing.JLabel();
        lblTelf = new javax.swing.JLabel();
        lblDirec = new javax.swing.JLabel();
        ldlCorreo = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        min = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblCabeza = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1238, 541));
        setMinimumSize(new java.awt.Dimension(1238, 541));
        getContentPane().setLayout(null);

        lblSuculsal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSuculsal.setForeground(new java.awt.Color(255, 255, 255));
        lblSuculsal.setText("Sucursal: Código Vago");
        getContentPane().add(lblSuculsal);
        lblSuculsal.setBounds(280, 10, 200, 22);

        lblRUC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRUC.setForeground(new java.awt.Color(255, 255, 255));
        lblRUC.setText("RUC: 0605694256001");
        getContentPane().add(lblRUC);
        lblRUC.setBounds(470, 10, 200, 22);

        lblTelf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTelf.setForeground(new java.awt.Color(255, 255, 255));
        lblTelf.setText("Telf: 0995669394");
        getContentPane().add(lblTelf);
        lblTelf.setBounds(280, 30, 170, 22);

        lblDirec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDirec.setForeground(new java.awt.Color(255, 255, 255));
        lblDirec.setText("Dirección: Sangolquí");
        getContentPane().add(lblDirec);
        lblDirec.setBounds(280, 70, 240, 22);

        ldlCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ldlCorreo.setForeground(new java.awt.Color(255, 255, 255));
        ldlCorreo.setText("Correo: info@codigovago.com");
        getContentPane().add(ldlCorreo);
        ldlCorreo.setBounds(280, 50, 300, 22);

        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio);
        btnInicio.setBounds(70, 130, 160, 40);

        btnInventario.setBorder(null);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario);
        btnInventario.setBounds(70, 190, 160, 40);

        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(70, 250, 160, 30);

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/min.png"))); // NOI18N
        min.setBorderPainted(false);
        min.setContentAreaFilled(false);
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        getContentPane().add(min);
        min.setBounds(1140, 30, 63, 39);

        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.setOpaque(false);
        getContentPane().add(panel);
        panel.setBounds(270, 110, 960, 420);

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo1.png"))); // NOI18N
        getContentPane().add(lblMenu);
        lblMenu.setBounds(0, 0, 264, 570);

        lblCabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cabeza.png"))); // NOI18N
        getContentPane().add(lblCabeza);
        lblCabeza.setBounds(260, 0, 976, 106);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondo.png"))); // NOI18N
        lblFondo.setText("jLabel3");
        getContentPane().add(lblFondo);
        lblFondo.setBounds(260, 100, 980, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        accesos.FrmMenu();
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed
    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        panel.add(acceso);
        acceso.show();
    }//GEN-LAST:event_btnInventarioActionPerformed
    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minActionPerformed
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if ( accesos.salirSesion() == 0) {
            accesos.FrmLogin();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblCabeza;
    private javax.swing.JLabel lblDirec;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblRUC;
    private javax.swing.JLabel lblSuculsal;
    private javax.swing.JLabel lblTelf;
    private javax.swing.JLabel ldlCorreo;
    private javax.swing.JButton min;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
