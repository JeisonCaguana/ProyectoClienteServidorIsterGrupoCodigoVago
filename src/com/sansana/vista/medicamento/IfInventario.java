/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.vista.medicamento;

import com.sansana.modelo.Accesos;
import com.sansana.modelo.sql.Conexion;
import com.sansana.modelo.sql.Medicamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO
 */
public final class IfInventario extends javax.swing.JInternalFrame{

    /**
     * Creates new form IfMedicamentos
     */
    public static String id = ""; 
    public static String nombre = "";
    public static String precio = "";
    public static String categoria = "";
    public static String descripcion = "";
    Accesos accesos = new Accesos();
    Conexion cc = new Conexion();
    Connection con = cc.getConexion();
    Medicamentos medicamento = new Medicamentos();
    
    
    public IfInventario() {
        initComponents();
        setComponentes();
    }
    void setComponentes(){
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        mostrardatos("");
    }
    void mostrardatos(String valor){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("CÓDIGO"); 
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DESCRIPCIÓN");
        modelo.addColumn("CATEGORIA");
        modelo.addColumn("PRÉCIO");
        modelo.addColumn("FECHA-REGUISTRO");
        tabla.setModel(modelo);
        String query="";
        if(valor.equals("")) {
            query="SELECT * FROM producto;";
        }else{
            query="SELECT * FROM producto WHERE id_prod='"+valor+"';";
        }
        String []datos = new String [6];
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5); 
                datos[5]=rs.getString(6); 
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
           Logger.getLogger(IfInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btnSeleccionar = new javax.swing.JMenuItem();
        btnEliminar = new javax.swing.JMenuItem();
        btnNuevo = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();

        btnSeleccionar.setText("Modificar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnSeleccionar);

        btnEliminar.setText("Eliminar Registro");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnEliminar);

        setMaximumSize(new java.awt.Dimension(963, 418));
        setMinimumSize(new java.awt.Dimension(963, 418));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setBackground(new java.awt.Color(24, 46, 74));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("");
        btnNuevo.setBorder(null);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 100, 40));

        btnRefrescar.setBackground(new java.awt.Color(24, 46, 74));
        btnRefrescar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefrescar.setForeground(new java.awt.Color(255, 255, 255));
        btnRefrescar.setText("Refrescar");
        btnRefrescar.setToolTipText("");
        btnRefrescar.setActionCommand("Nuevo");
        btnRefrescar.setBorder(null);
        btnRefrescar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 100, 40));

        btnBuscar.setBackground(new java.awt.Color(24, 46, 74));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nuevo.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("");
        btnBuscar.setBorder(null);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 100, 40));

        lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/inventario.png"))); // NOI18N
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buscar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, 900, 178));

        txtBuscar.setBorder(null);
        txtBuscar.setOpaque(false);
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 210, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrardatos(txtBuscar.getText());
        txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_btnRefrescarActionPerformed
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        accesos.FrmAdministracion();
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int fila= tabla.getSelectedRow();
        if(fila>=0){
            id = tabla.getValueAt(fila, 0).toString();
            nombre = tabla.getValueAt(fila, 1).toString();
            precio = tabla.getValueAt(fila, 2).toString();
            categoria = tabla.getValueAt(fila, 3).toString();
            descripcion = tabla.getValueAt(fila, 4).toString();
            accesos.FrmAdministracion();
        }else{
            JOptionPane.showMessageDialog(null,"Seleciones una fila..");
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tabla.getSelectedRow();
        String cod = tabla.getValueAt(fila, 0).toString();
        ImageIcon img = new ImageIcon(getClass().getResource("/assets/alerta.png"));
        
        if (JOptionPane.showConfirmDialog(null, "¿Seguro desea Eliminiar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, img) == 0) {
            medicamento.eliminarProducto(cod);
            mostrardatos("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JMenuItem btnSeleccionar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
