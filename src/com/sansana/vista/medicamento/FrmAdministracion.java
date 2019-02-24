/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.vista.medicamento;

import com.sansana.modelo.Medicamento;
import com.sansana.modelo.sql.Medicamentos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON
 */
public final class FrmAdministracion extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdministracion
     */
    Medicamentos medicamentos= new Medicamentos();
    Medicamento medicamento= new Medicamento();
    IfInventario ventana = new IfInventario();
    public FrmAdministracion() {
        setComponentes();
        initComponents(); 
        rellenar();
    }
    void setComponentes(){
        this.setUndecorated(true);
        setIconImage(new ImageIcon(getClass().getResource("/assets/logo.png")).getImage());   
       
    } 
    void limpiar(){
        txtCodigo.setText("");
        cajaCategoria.setActionCommand("Seleccione");
        txtDescripcion.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
    }
    void rellenar(){ 
        txtCodigo.setText(IfInventario.id); 
        txtNombre.setText(IfInventario.nombre);
        txtPrecio.setText(IfInventario.precio);
        cajaCategoria.setSelectedItem(IfInventario.categoria);
        txtDescripcion.setText(IfInventario.descripcion);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        tbnGrabar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnSalir3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaCategoria = new javax.swing.JComboBox<>();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setBackground(new java.awt.Color(24, 46, 74));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nuevo.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.setActionCommand("Nuevo");
        btnActualizar.setBorder(null);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 110, 30));

        btnLimpiar.setBackground(new java.awt.Color(24, 46, 74));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nuevo.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.setActionCommand("Nuevo");
        btnLimpiar.setBorder(null);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 110, 30));

        tbnGrabar.setBackground(new java.awt.Color(24, 46, 74));
        tbnGrabar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        tbnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nuevo.png"))); // NOI18N
        tbnGrabar.setText("Grabar");
        tbnGrabar.setToolTipText("");
        tbnGrabar.setActionCommand("Nuevo");
        tbnGrabar.setBorder(null);
        tbnGrabar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tbnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(tbnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 110, 30));

        txtDescripcion.setForeground(new java.awt.Color(24, 46, 74));
        txtDescripcion.setBorder(null);
        txtDescripcion.setOpaque(false);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 440, 30));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(24, 46, 74));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(null);
        txtPrecio.setOpaque(false);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(24, 46, 74));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 30));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(24, 46, 74));
        txtCodigo.setBorder(null);
        txtCodigo.setOpaque(false);
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 30));

        btnSalir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/max.png"))); // NOI18N
        btnSalir3.setBorderPainted(false);
        btnSalir3.setContentAreaFilled(false);
        btnSalir3.setDefaultCapable(false);
        btnSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, 50, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categoria");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descripción");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        cajaCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cremas", "Pastillas", "Humectantes" }));
        getContentPane().add(cajaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/formularioInventario.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtCodigo.getText().equals("") || txtNombre.equals("") || txtPrecio.equals("") || cajaCategoria.getSelectedItem().equals("Seleccione") || txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {
            if (!medicamentos.actualizar(Integer.parseInt(txtCodigo.getText()), txtNombre.getText(), txtDescripcion.getText(), (String) cajaCategoria.getSelectedItem(), txtDescripcion.getText()) ){
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            } else {
                JOptionPane.showMessageDialog(null, "Registro Actualizado, Click en Refrescar");
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed
    private void tbnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnGrabarActionPerformed
        if (txtCodigo.getText().equals("") || txtCodigo.equals("") || txtPrecio.equals("") || cajaCategoria.getActionCommand().equals("") || txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {
            if (medicamentos.existeProducto(txtCodigo.getText()) == 0) {
                medicamento.setIdProd(Integer.parseInt(txtCodigo.getText()));
                medicamento.setNombreProd(txtNombre.getText());
                medicamento.setDescripcionProd(txtPrecio.getText());
                medicamento.setCategoriaProd(cajaCategoria.getSelectedItem().toString());
                medicamento.setPrecioProd(txtDescripcion.getText());
                if (medicamentos.registrar(medicamento)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado, debe refrescar");
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                    limpiar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
            }
        }
    }//GEN-LAST:event_tbnGrabarActionPerformed

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir3;
    private javax.swing.JComboBox<String> cajaCategoria;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JButton tbnGrabar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
