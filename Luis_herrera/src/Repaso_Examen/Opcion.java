/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso_Examen;

/**
 *
 * @author T-
 */
public class Opcion {
     
    private String titulo;
    private boolean status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Opcion(){}
    public Opcion(String titulo,boolean status){
        this.titulo=titulo;
        this.status=status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    
}
