package Ejercicios;

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int n_posicion, ultimo;

        System.out.println("Llenar el arrglo: ");
        for (int i=0;i<10;i++){
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("\nDigite la cantidad de posicion a desplazar: ");
        n_posicion = entrada.nextInt();

        for(int vuelta=1; vuelta<=n_posicion;vuelta++){
            ultimo = arreglo[9];
            for(int i=8;i>=0;i--){
                arreglo[i+1] = arreglo[i];
            }
            arreglo[0] = ultimo;
        }
        System.out.println("\nEl arreglo resultante es: ");
        for(int i=0;i<10;i++){
            System.out.println(i+". Elemento: "+arreglo[i]);

        }
    }
}
