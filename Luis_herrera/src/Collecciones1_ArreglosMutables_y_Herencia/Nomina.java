/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collecciones1_ArreglosMutables_y_Herencia;

/**
 *
 * @author DY
 * 
 * CLase padre
 */
public class Nomina {
    private String nombre;
    private String aPaterno;
    private long numeroSeguro;
    private float sueldoBase;

    public Nomina() {    }

    
    public Nomina(String nombre, String aPaterno, long numeroSeguro, float sueldoBase) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.numeroSeguro = numeroSeguro;
        this.sueldoBase = sueldoBase;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public long getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(long numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    

    
}
