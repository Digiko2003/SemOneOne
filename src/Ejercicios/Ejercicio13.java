package Ejercicios;

import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int conteo_pares = 0, conteo_impares = 0;

        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();

            if (arreglo[i] % 2 == 0) {
                conteo_pares++;
            } else {
                conteo_impares++;
            }
        }
        int par[] = new int[conteo_pares];
        int impar[] = new int[conteo_impares];

        conteo_pares = 0;
        conteo_impares = 0;

        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            }
            else{
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }
        System.out.println("\nArreglo pares: ");
        for (int i = 0; i < conteo_pares; i++) {
            System.out.print(par[i]+" ");
        }
        System.out.println(" ");

        System.out.println("\nArreglo impares: ");
        for (int i = 0; i < conteo_impares; i++) {
            System.out.print(impar[i]+" ");
        }
        System.out.println(" ");
    }
}
