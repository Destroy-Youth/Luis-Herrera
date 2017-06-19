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
public class ValidarEdad {
    
    public static void validarEdadAlumno(float edad) throws MenorDeEdadException{
        if(edad<18)throw new MenorDeEdadException();
    }
    
}
