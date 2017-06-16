/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checadas;

import java.io.*;

/**
 *
 * @author T-
 */
public class MainArchivos {
    public static void main(String[] args) {
        
    //try-catch es para la interfas de usuario, seguridad para la ejecución del programa
        try{    //Prueba el código para las excepciones
            
     //Generamos un objeto de tipo ModeloArchivo
     ModeloArchivo modelo=new ModeloArchivo();
     //Invocamos al método para escribir el archivo
     modelo.escribirArchivo();
            System.out.println("Se creó el archivo exitosamente");
            
        }catch(FileNotFoundException e){ //Se ejecuta solo si hubieron excepciones
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());            
        }catch(Exception e){
            System.out.println(e.getMessage());            
        }finally{ //Siempre se ejecuta, aunque no hayan excepciones, marca error en case de haber excepciones y no haber catch
            
        }
    }
    
}
