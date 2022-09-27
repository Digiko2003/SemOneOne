package DIGIKO2;

import java.util.Scanner;
public class NumeroDivisor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2;

        System.out.println("PROGRAMA QUE DETERMINA SI UN NUMERO ES DIVISOR DE OTRO");
        System.out.println("Digite un numero: ");
        numero1= entrada.nextDouble();
        System.out.println("Digite el segundo numero: ");
        numero2= entrada.nextDouble();

        if(numero1 % numero2 == 0) {
            System.out.println("El segundo numero si es divisor del primero");
        }else  {
            System.out.println("El segundo numero no es divisor del primero");
        }
    }
}
