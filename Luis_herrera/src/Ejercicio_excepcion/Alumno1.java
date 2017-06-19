/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_excepcion;

/**
 *
 * @author Ivan
 Ejercicio:
Implementar una validación  de un objeto de tipo Alumno1 que tiene 
 como atributos nombre, numero de cuenta y edad. 
 No debe de ser posible asignar una edad de menos de 18 años a ningun objeto de tipo Alumno1. 
 Construir una excepción que lleve a cabo la tarea anterior.
 En este tipo de excepciones  el programador tiene que implementar 
 */
public class Alumno1 {
    private String nombre;
    private String noCuenta;
    private int edad;

    
    public void setEdad(int edad)throws MenorDeEdadException{
        ValidarEdad.validarEdadAlumno(edad);
        this.edad = edad;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public int getEdad() {
        return edad;
    }


    
    
}
