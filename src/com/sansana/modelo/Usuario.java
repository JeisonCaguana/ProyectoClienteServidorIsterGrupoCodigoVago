/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sansana.modelo;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Usuario {
    private String usuarioUss;
    private String claveUss;

    public void imprimir (Usuario usuario){ 
        System.out.println("USUARIO: "+usuario.getUsuario_uss());
        System.out.println("CLAVE: "+usuario.getClave_uss());
    }

    /**
     * @return the usuario_uss
     */
    public String getUsuario_uss() {
        return usuarioUss;
    }

    /**
     * @param usuario_uss the usuario_uss to set
     */
    public void setUsuario_uss(String usuario_uss) {
        this.usuarioUss = usuario_uss;
    }

    /**
     * @return the clave_uss
     */
    public String getClave_uss() {
        return claveUss;
    }

    /**
     * @param clave_uss the clave_uss to set
     */
    public void setClave_uss(String clave_uss) {
        this.claveUss = clave_uss;
    }
}
