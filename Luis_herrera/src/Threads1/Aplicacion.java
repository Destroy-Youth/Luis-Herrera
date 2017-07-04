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
public class Aplicacion {
    public static void main(String[] args) {
        //Ciclo de vida del thread
        
        //Nace
        PrimerTarea t1= new PrimerTarea();
        OtraTarea t2=new OtraTarea();
        TareaReloj t3=new TareaReloj();
        
        //Iniciado (Enable)
        t1.start();
        t2.start();
        t3.start();
        
        
        //Entrar al cpu, lo hace el admin de threads, no el programador
        
    }
}
