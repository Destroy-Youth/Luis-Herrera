/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author T-
 */
public class Excepcion2 {
    public static void main(String[] args) {
        //otra excepcion muy conocida de tipo unchecked es la NumberFormatException
   String falsonumero="4";
   int numeroverdadero=5;
   int corregido=Integer.parseInt(falsonumero);
   int suma=corregido+numeroverdadero;
   System.out.println(corregido+numeroverdadero);
	System.out.println(suma);
    }
    
}
