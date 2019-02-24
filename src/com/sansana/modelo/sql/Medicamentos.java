/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.modelo.sql;

import com.sansana.modelo.Medicamento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO
 */
public class Medicamentos extends Conexion {
    public boolean registrar(Medicamento medicamento) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String query = "INSERT INTO producto (id_prod,nombre_prod,descripcion_prod,categoria_prod,precio_prod) VALUES(?,?,?,?,?)";
        try {
            ps = con.prepareStatement( query );
            ps.setInt(1, medicamento.getIdProd());
            ps.setString(2, medicamento.getNombreProd());
            ps.setString(3, medicamento.getDescripcionProd());
            ps.setString(4, medicamento.getCategoriaProd());
            ps.setString(5, medicamento.getPrecioProd()); 
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
        public boolean actualizar(int idProd, String nombreProd, String descripcionProd, String categoriaProd, String precioProd) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE producto SET nombre_prod='"+nombreProd+"',descripcion_prod='"+descripcionProd+"',categoria_prod='"+categoriaProd+"',precio_prod='"+precioProd+"' WHERE id_prod='"+idProd+"';";

        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    public int existeProducto(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT count(id_prod) FROM producto WHERE nombre_prod = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public int eliminarProducto(String id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String query = "DELETE FROM producto WHERE  id_prod='"+id+"';";           
       
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate(); 
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 0;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    
}
