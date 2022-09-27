package EjerciciosParte2;
import java.util.Random;
public class Dado {
    private int lados;
    private int valor;

    public Dado(int numLados) {
        this.lados = numLados;
    }
    public void lanzar() {
        Random rand = new Random();
        //General un valor aleatoria de acuerdo al numero de lados
        this.valor = rand.nextInt(lados) + 1;
    }
    public int obtenerLados() {
        return lados;
    }
    public int obtenerValor() {
        return valor;
    }
}
