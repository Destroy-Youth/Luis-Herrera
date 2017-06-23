/*
http://campitos.herokuapp.com
 */



package Repaso_Examen;
import java.util.*; //Tiene el ArrayList

/**
 *
 * @author T-
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        
        Opcion o1=new Opcion("Estonia", false);
        Opcion o2=new Opcion("Lituania", false);
        Opcion o3=new Opcion("Rusia", false);
        Opcion o4=new Opcion("Kiev", true);
        
        ArrayList<Opcion> opciones=new ArrayList<>();
        
        opciones.add(o1);
        opciones.add(o2);
        opciones.add(o3);
        opciones.add(o4);
        
        Pregunta p=new Pregunta("Cual es la cápital de Ucránia?",opciones);

        preguntas.add(p);
                
        for(Pregunta pre: preguntas){ 
            System.out.println(pre.getTitulo());
            for(Opcion op:pre.getOpciones()){
                System.out.println(op.getTitulo()+" estatus:"+op.isStatus());
            }
        }
        
        
        
        
    }
    
}
