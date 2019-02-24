/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sansana.controlador;

import com.sansana.modelo.Accesos;
import com.sansana.modelo.Usuario;
import com.sansana.modelo.sql.Usuarios; 
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO
 */
public class Login {
    Usuarios sqlUsuarios = new Usuarios();
    Accesos accesos = new Accesos();
    Usuario persona = new Usuario();
    
    public void login( String usuario, String clave ){
        persona.setUsuario_uss(usuario);
        persona.setClave_uss(clave);
        if ( sqlUsuarios.buscarUsuario(persona)) { 
            accesos.FrmMenu();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecto");
            accesos.FrmLogin();
        } 
    }
}
