/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads1;

/**
 *
 * @author T-
 */
public class OtraTarea extends Thread{

    @Override
    public void run() {
        String nombre=getName(); //EL admin de threads dá un nombre al thread
         System.out.println("Soy el segundo thread y me llamo " + nombre);
    }
    
}
