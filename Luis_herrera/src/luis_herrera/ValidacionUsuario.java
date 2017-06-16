/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis_herrera;

/**
 *
 * @author T-
 */
public class ValidacionUsuario {
    
    //static hace el programa mas rapido al ejecutarse primero
    //static no requiere un objeto para invocarse, es compartido entre todos
    public static void validarNoNegativo(float numero) throws NumeroNoNegativoException{ //throws es para crear una excepcion
        //throws indica la posibilidad de que la funcion lance la excepcion
        if(numero<0)throw new NumeroNoNegativoException();//throw indica que excepcion debe lanzarse si
                                                          //la condicion se cumple
    }
}
