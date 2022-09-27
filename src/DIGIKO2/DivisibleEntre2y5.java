package DIGIKO2;

import java.util.Scanner;
public class DivisibleEntre2y5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;

        System.out.println("PROGRAMA QUE DETERMINA SI UN NUMERO ES DIVISIBLE ENTRE 2 Y 5");
        System.out.println("Digite un numero: ");
        numero= entrada.nextDouble();

        if(numero % 2 == 0 && numero % 5 == 0){
            System.out.println("El numero si es divisible entre 2 y 5");
        }
        else  {
            System.out.println("El numero no es divisible entre 2 y 5");
        }
    }
}
