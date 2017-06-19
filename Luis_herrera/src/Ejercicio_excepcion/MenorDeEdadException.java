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
public class MenorDeEdadException extends Exception{

    public MenorDeEdadException() {
        super("El alumno no puede tener menos de 18 años");
    }
    
    
    
}
