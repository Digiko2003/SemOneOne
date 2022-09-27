package DIGIKO2;

import java.util.Scanner;
public class PositivoNegativoTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1;

        System.out.println("PROGRAMA QUE DETERMINA SI UN NUMERO ES POSITIVO O NEGATIVO");
        System.out.println("Digite un numero:");
        numero1= entrada.nextDouble();

        if(numero1 >0) {
            System.out.println("Resultado: El numero es positivo");
        }
        if(numero1 <0) {
            System.out.println("Resultado: El numero es negativo");
        }
        }
    }