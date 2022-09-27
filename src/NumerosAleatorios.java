//NumerosAleatorios
import java.util.Random;
public class NumerosAleatorios  {
    public static void main(String[] args) {
        Random r = new Random();
        int numero;

        for (int i = 0; i <=100;i++) {
            numero = r.nextInt(100);
            System.out.print(numero+",");
        }

    }
}