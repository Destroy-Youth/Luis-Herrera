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
public class Imc {
    public float calcular(Usuario u){
       // Lógica del calculo
      float resultado=u.getPeso()/(u.getAltura()*u.getAltura());
       
       return resultado;
        
    }
}
