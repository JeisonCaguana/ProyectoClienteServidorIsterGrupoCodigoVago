/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.modelo.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO
 */
public class Conexion {
    private final String HOST_DB  = "jdbc:mysql://localhost/";
    private final String HOST_NOM = "bd_clienteservidor"; 
    private final String HOST_CERTIFICADO ="?useTimezone=true&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";
    private final String HOST_USS  = "root";
    private final String HOST_PASS = ""; 
    private Connection con = null;
    
    public Connection getConexion(){ 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.HOST_DB+this.HOST_NOM+this.HOST_CERTIFICADO,this.HOST_USS,this.HOST_PASS);
//            System.out.println("Conexion exitosa a BD: "+this.HOST_NOM);
        } catch(SQLException e){
            System.err.println( e.toString() );
//            System.out.println("Conexion fallida a BD: "+this.HOST_NOM);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }   
}
