/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.modelo;

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO
 */
public class ValidarCampos {
    public void soloNumeros(java.awt.event.KeyEvent evt) { 
        char c=evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();{
        }
    }
    public void soloPrecio(java.awt.event.KeyEvent evt) { 
        char c=evt.getKeyChar();
        if ((c<'0' || c>'9') && c != '.')evt.consume();{ 
        }
    }
    public void soloLetras(java.awt.event.KeyEvent evt) { 
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z')&&(c<'A' || c>'Z')&&(c<' ' || c>' ' )) evt.consume(); {
        }
    }
            
}
