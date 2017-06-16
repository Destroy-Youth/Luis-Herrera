/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis_herrera;

/**
 *
 * Hijos de Java:
-Scala //mas pagado
-Groovy
-kotlinlang.org
-Angular 4 //Front frame
O.O. y funcionales.
 *
 * 
 * 
 * https://docs.oracle.com/javase/8/docs/api/
 */

//Nueva excepcion para no usar números negativos
public class NumeroNoNegativoException extends Exception{ //Extends refiere una herencia de otra clase

    public NumeroNoNegativoException(){ //Constructores nunca son heredados
        super("No puedes usar números negativos"); //Se llama el constructor del padre
        /*
        Exception(String message)
        Constructs a new exception with the specified detail message.
        */
    }
    
   
    
    
    
}
