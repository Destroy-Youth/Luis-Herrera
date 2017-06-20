/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collecciones1_ArreglosMutables_y_Herencia;

/**
 *
 * @author T-
 * 
 * 
 */

import java.util.*; //Tiene el ArrayList

public class GenerarNominas {
    public static void main(String[] args) {
        NominaContrato nc=new NominaContrato("Juan", "Lopez", 1234, 45000);
        NominaHonorario nh=new NominaHonorario(0.16f, 0.16f, "Ana", "Perez", 4321, 60000);
        
        //Generamos un array list para meter las dos nóminas anteriores
        //El arreglo es de tipo Nomina
        ArrayList<Nomina> misNominas=new ArrayList<>();
        
        //Para agregar un objeto al arreglo ArrayList se usa el metodo add
        //Método polimórfico al aceptar diferentes objetos conuna clase encastro comun
        misNominas.add(nc);
        misNominas.add(nh);
        
        //Para recorrer esta arreglo y verificar el contenido se usa el for mejorado
        for(Nomina nomina: misNominas){  //Inyección de dependencia Front END
            System.out.println("El nombre del usuario es; " + nomina.getNombre());
        }
        
    }
}
