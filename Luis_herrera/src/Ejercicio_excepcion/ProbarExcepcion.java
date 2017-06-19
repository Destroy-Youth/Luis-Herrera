/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_excepcion;

/**
 *
 * @author Ivan
 */
public class ProbarExcepcion {
    public static void main(String[] args) {
        
        String nombre="Luis";
        String noCuenta="12223456";
        int edad=19;
        
        Alumno1 a=new Alumno1();
        try{
            a.setNombre(nombre);
            a.setNoCuenta(noCuenta);
            a.setEdad(edad);
        }catch(MenorDeEdadException e){
            System.out.println(e.getMessage());
        }
    }
}
