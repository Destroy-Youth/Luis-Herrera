package luis_ivan.imc_androir;

/**
 * Created by T- on 01/06/2017.
 */
public class Usuario {
    private float peso;
    private float altura;

    public Usuario(){

    }

    public Usuario(float peso){
        this.peso=peso;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
