package DIGIKO2;

import java.util.Scanner;
public class NumeroDivisibleEntre14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1;

        System.out.println("PROGRAMA QUE DETERMINA SI UN NUMERO ES DIVISIBLE ENTRE 14");
        System.out.println("Digite un numero:");
        numero1= entrada.nextDouble();

        if(numero1 % 14 == 0) {
            System.out.println("El numero si es divisible entre 14");
        }else  {
            System.out.println("El numero no es divisible entre 14");
        }
    }
}
