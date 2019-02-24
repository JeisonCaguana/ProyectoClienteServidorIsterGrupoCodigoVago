/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.controlador;

import com.sansana.modelo.Accesos; 

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO
 */
public class Principal {
    static Accesos acceso = new Accesos();
    public static void main(String[] args) {
         acceso.FrmMenu();
    }
}
