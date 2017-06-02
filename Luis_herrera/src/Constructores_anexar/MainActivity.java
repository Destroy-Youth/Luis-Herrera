package luis_ivan.imc_androir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //https://docs.oracle.com/javase/8/docs/api/
        //Documentacion java

        //Declaramos los integrales
        byte b=12;
        short s=2;
        int i=2;    //Variable default
        long l=2;   //Llaves primarias en bases de datos
        char c='h';

        //Casting de variable (Cambio de tipo de dato)
        b=(byte)s;
        s=b;


        //Declarar referenciados
        String cadena="Hola mundo";
        String falsoNumero="4";

        //Clase wrapper Integer
        int suma=5+Integer.parseInt(falsoNumero);

        String otroFalso="3.5";
        float xx=5*Float.parseFloat(otroFalso);

        Usuario u=new Usuario(80f);

        Toast.makeText(this,"El peso del usuario es "+u.getPeso(),Toast.LENGTH_LONG).show();
    }
}
