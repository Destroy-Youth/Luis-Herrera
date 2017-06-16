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
public class Usuario {
    private float peso;
    private float altura;

    public void setPeso(float peso)throws NumeroNoNegativoException{
        ValidacionUsuario.validarNoNegativo(peso);
        this.peso=peso;
    }

    public void setAltura(float altura)throws NumeroNoNegativoException{
        ValidacionUsuario.validarNoNegativo(altura);
        this.altura=altura;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public float getAltura(){
        return altura;
    }
}
