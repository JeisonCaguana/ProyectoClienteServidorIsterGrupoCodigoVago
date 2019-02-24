/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sansana.modelo;

import java.sql.Date;

/**
 *
 * @author JEISON CAGUANA - PAOLA VILLA - GRUPO CODIGO VAGO
 */
public class Medicamento {

    private int idProd;
    private String nombreProd;
    private String descripcionProd;
    private String categoriaProd;
    private String precioProd;
    private Date fechaReg;

    /**
     * @return the idProd
     */
    public int getIdProd() {
        return idProd;
    }

    /**
     * @param idProd the idProd to set
     */
    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    /**
     * @return the nombreProd
     */
    public String getNombreProd() {
        return nombreProd;
    }

    /**
     * @param nombreProd the nombreProd to set
     */
    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    /**
     * @return the descripcionProd
     */
    public String getDescripcionProd() {
        return descripcionProd;
    }

    /**
     * @param descripcionProd the descripcionProd to set
     */
    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    /**
     * @return the categoriaProd
     */
    public String getCategoriaProd() {
        return categoriaProd;
    }

    /**
     * @param categoriaProd the categoriaProd to set
     */
    public void setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
    }

    /**
     * @return the precioProd
     */
    public String getPrecioProd() {
        return precioProd;
    }

    /**
     * @param precioProd the precioProd to set
     */
    public void setPrecioProd(String precioProd) {
        this.precioProd = precioProd;
    }

    /**
     * @return the fechaReg
     */
    public Date getFechaReg() {
        return fechaReg;
    }

    /**
     * @param fechaReg the fechaReg to set
     */
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

}
