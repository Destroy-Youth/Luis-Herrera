/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads2;

import java.util.Calendar;

/**
 *
 * segunda forma de threads: interface Runnable
 * 
 * Aquí usaremos el poliformismo ya que la clase es polimorfica 
 * 
 */
public class Relojote implements Runnable, ComportamientoComer{
    public static void main(String[] args) {
        //Probemos que no se puede crear objetos de las interfaces
       // ComportamientoComer cp=new ComportamientoComer(); //Las interfaces no tienen constructores
       
       
       //Aquí se crea el Thread POLIFORMICAMENTE
       Runnable r=new Relojote(); //Se crea el objeto polimorfico de runnable
       Thread t1=new Thread(r);   //se asigna el objeto 
       t1.start();
       
       
    }

    @Override
    public void run() {

        System.out.println("Pronto serás un reloj!");
         
        long x=0;
        while (true) {         
            Calendar cal= Calendar.getInstance();
            
            //Activar varias propiedades relacionadas con los calendarios
            //hora, minuto y segundo
            int hora = cal.get(Calendar.HOUR_OF_DAY);
            int minuto = cal.get(Calendar.MINUTE);
            int segundo=cal.get(Calendar.SECOND);
            
            System.out.println("La hora es " + hora + ":" + minuto + ":"+segundo);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                
            }
        }

    }

    @Override
    public String obtenerHabitoAlimenticio() {


        return "soy reloj y no como";
    }
    
}
