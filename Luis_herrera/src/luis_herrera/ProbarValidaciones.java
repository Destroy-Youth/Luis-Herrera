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
public class ProbarValidaciones {
    public static void main(String[] args) {
        //Probar sola la excepcion
        float x=7;
        try{
             ValidacionUsuario.validarNoNegativo(x);
                System.out.println("Primero lanza excepcion");
             Usuario u=new Usuario();
             u.setAltura(-x);
                System.out.println("Excepcion de ajuste de altura");
             u.setPeso(80f);
                System.out.println("Excepcion del ajuste del peso");
        }catch(NumeroNoNegativoException e){
            System.out.println(e.getMessage());
        }
       
    }

    
}
