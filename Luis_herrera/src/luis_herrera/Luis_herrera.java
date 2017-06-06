/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis_herrera;

/**
 *
 * @author T-
 * apuntes:
 * https://daton.github.io/juan-campos/  
 */
public class Luis_herrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Negrito chaka");
        
        // imc = w/(h.h) 
        /*
        Probar solución
    Generando un usuario Hipotético
        */
        Usuario u=new Usuario();
        
        //asignamos valores
        u.=1.365f;
        u.peso=73f;
        
        //Generamos modelo
        Imc imc=new Imc();
        imc.calcular(u);
        System.out.println("El valor es "+ imc.calcular(u));

    }
    
}
