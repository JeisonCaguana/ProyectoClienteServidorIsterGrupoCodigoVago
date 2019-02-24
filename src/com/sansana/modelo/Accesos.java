/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sansana.modelo;

import com.sansana.vista.FrmLogin;
import com.sansana.vista.FrmMenu;
import com.sansana.vista.medicamento.FrmAdministracion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Accesos {
    
    public void FrmMenu(){
       FrmMenu FrmMenu = new FrmMenu();
       FrmMenu.setVisible(true);
    }
    public void FrmLogin(){
        FrmLogin FrmLogin = new FrmLogin();
        FrmLogin.setVisible(true);
    }
    public void FrmAdministracion(){
        FrmAdministracion FrmAdministracion = new FrmAdministracion();
        FrmAdministracion.setVisible(true);
    }
    public int salirSesion(){
        ImageIcon img = new ImageIcon(getClass().getResource("/assets/alerta.png"));
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, img);
        return input;
    }
}
