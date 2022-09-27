package DIGIKO2;

import java.util.Scanner;
public class Multiplo6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;

        System.out.println("PROGRAMA QUE DETERMINA SI UN NUMERO ES MULTIPLO DE 6");
        System.out.println("Digite un numero: ");
        numero= entrada.nextDouble();

        if (numero % 6 == 0) {
            System.out.printf("El numero si es múltiplo de 6");
        } else {
            System.out.println("El numero no es múltiplo de 6");
        }
    }
}
