/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sansana.modelo.sql;


import com.sansana.modelo.Usuario;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Usuarios extends Conexion{
 
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    Connection conexion = getConexion();
    
    public boolean buscarUsuario( Usuario usuario ){ 
        String query = "SELECT usuario_uss,clave_uss FROM usuario WHERE usuario_uss = ? AND clave_uss = ?";
        try { 
            ps = conexion.prepareStatement( query );
            ps.setString( 1, usuario.getUsuario_uss());
            ps.setString( 2, usuario.getClave_uss());
            rs = ps.executeQuery();
            
            if ( rs.next() ) {
                return usuario.getUsuario_uss().equals(rs.getString(1)) && usuario.getClave_uss().equals(rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println( ex.toString() );
        }finally{
            try {
                conexion.close(); 

            } catch (SQLException e) {
                System.out.println( e.toString() );
            }
        }
        return false;
    }
}
