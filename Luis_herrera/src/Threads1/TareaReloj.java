/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads1;

import java.util.*;

/**
 *
 * @author T-
 */
public class TareaReloj extends Thread{

    @Override
    public void run() {
        
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
    
}
