/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.vista;

import com.placeholder.PlaceHolder;
import com.sansana.controlador.Login;
import javax.swing.ImageIcon; 
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO
 */
public final class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    Login acceso = new Login();
    PlaceHolder plaseHolder;
    public FrmLogin() {
        setComponentes();
        initComponents();
        plaseHolder = new PlaceHolder(txtUsuario, "Ingrese su usuario");
        plaseHolder = new PlaceHolder(txtPassword, "Clave");
    }
    public void setComponentes(){
        this.setUndecorated(true);
        setIconImage(new ImageIcon(getClass().getResource("/assets/logo.png")).getImage());
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        min = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSlider = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(612, 409));
        setMinimumSize(new java.awt.Dimension(612, 409));
        getContentPane().setLayout(null);

        txtUsuario.setBorder(null);
        txtUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUsuario.setOpaque(false);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(330, 150, 160, 14);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPassword.setOpaque(false);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(330, 190, 160, 17);

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/min.png"))); // NOI18N
        min.setBorderPainted(false);
        min.setContentAreaFilled(false);
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        getContentPane().add(min);
        min.setBounds(530, 20, 28, 18);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(330, 230, 170, 23);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/max.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(570, 10, 28, 29);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 0, 320, 520);

        lblSlider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        getContentPane().add(lblSlider);
        lblSlider.setBounds(0, 0, 290, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String txtContrasena = new String(txtPassword.getPassword());
        if (!txtUsuario.equals("") && !txtContrasena.equals("")) {
            acceso.login(txtUsuario.getText(), txtContrasena);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Debe completar los campos");
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minActionPerformed
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSlider;
    private javax.swing.JButton min;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
