package Aplicacion_Imc;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View v){
        Vibrator vi=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        vi.vibrate(4000);
        Usuario u= new Usuario();
        //Pedimos valores
        EditText tPeso = (EditText) findViewById(R.id.textoPeso);
        EditText tAltura = (EditText) findViewById(R.id.textoAltura);

                Imc i=new Imc();

        Toast.makeText(this,"Tu IMC es " + i.calcular(u),Toast.LENGTH_LONG);

    }
}
