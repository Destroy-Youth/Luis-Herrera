/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collecciones1_ArreglosMutables_y_Herencia;

/**
 *
 * @author T-
 * 
 * 
 * Perfeccionamiento de la herencia
 */
public class NominaHonorario extends Nomina{
    private float isr;
    private float iva;

    public NominaHonorario() {
    }

    public NominaHonorario(float isr, float iva, String nombre, String aPaterno, long numeroSeguro, float sueldoBase) {
        super(nombre, aPaterno, numeroSeguro, sueldoBase);
        this.isr = isr;
        this.iva = iva;
    }
    
    public float getIsr() {
        return isr;
    }

    public void setIsr(float isr) {
        this.isr = isr;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    
}
