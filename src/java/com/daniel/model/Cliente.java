/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.model;

/**
 *
 * @author LabingXEON
 */
public class Cliente {
    private int num_Clie;
    private String empresa;
    private int repClie;
    private float limite_Credito;

    public int getNum_Clie() {
        return num_Clie;
    }

    public void setNum_Clie(int num_Clie) {
        this.num_Clie = num_Clie;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getRepClie() {
        return repClie;
    }

    public void setRepClie(int repClie) {
        this.repClie = repClie;
    }

    public float getLimite_Credito() {
        return limite_Credito;
    }

    public void setLimite_Credito(float limite_Credito) {
        this.limite_Credito = limite_Credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "num_Clie=" + num_Clie + ", empresa=" + empresa + ", repClie=" + repClie + ", limite_Credito=" + limite_Credito + '}';
    }
    
    
            
}
