/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads1;

/**
 *
 * @author T-
 * 
 * Esta es la primer forma, la más fácil.
 * Consiste en heredar la clase Thread.
 * 
 */

//Paso 1: Heredar clase Thread
public class PrimerTarea extends Thread{
    
    //Paso 2: Sobreescribir el método run
    @Override //verificar el método padre para sobreescribir
    public void run(){
        
        System.out.println("Soy un Thread que no hace nada");
    }
}
