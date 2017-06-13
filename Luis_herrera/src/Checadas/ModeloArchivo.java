/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checadas;

import java.io.*; //input-output
/**
 *
 * @author T-
 */
public class ModeloArchivo {
    
    //Método para escribirlo
    
    public void escribirArchivo()throws FileNotFoundException, IOException{ //Excepsión de inexistencia de archivo y
                                    //throws es para depurar, para el programador
                                    
        //Paso 1: Generar el archivo
        File file=new File("archivaldo");
        //Importante:
        FileOutputStream fos=new FileOutputStream(file); //Archivo de salida y encadenamiento de constructores(file)
        ObjectOutputStream oos=new ObjectOutputStream(fos); //Se guarda un objeto
       
        
        String miObjeto="Este es un objeto de la clase String";  //Serializable transforma archivos en bytecode
        oos.writeObject(miObjeto); //Escribe y guarda un objeto, cualquiera
        System.out.println("SE guardó tu string con éxito"); //si no se especifica la extencionm lo guarda en bytecode y está serializada, es decir, se comprime
    }
    
}
