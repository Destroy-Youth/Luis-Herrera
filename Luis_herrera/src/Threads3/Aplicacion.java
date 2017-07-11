/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads3;

import java.util.Calendar;

/**
 *
 * Threads de examen
 * 
 */
public class Aplicacion {
    public static void main(String[] args) {
        //Paso 1:
        Thread t1=new Thread(  //Background Threads
        new Runnable() {       //Clase interna anónima: se implementa la clase Runnable
            @Override
            public void run() {
                while (true) {                    
                    try{
                        Calendar cal=Calendar.getInstance();
                        int hora=cal.get(Calendar.HOUR_OF_DAY);
                        int minutos=cal.get(Calendar.MINUTE);
                        int segundo=cal.get(Calendar.SECOND);
                        System.out.println(""+hora+":"+minutos+":"+segundo);
                        Thread.sleep(1000);
                        
                    }catch(Exception e){
                        
                    }
                }
            }
          }
        );
        t1.start();
    }
}
