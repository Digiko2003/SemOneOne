package Ejercicios;

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]=new int[10];
        int posicion;

        System.out.println("LLenar el arreglo");
        for (int i=0;i<10;i++){
            System.out.print(i+". Digitalize un numero: ");
            arreglo[i]= entrada.nextInt();
        }

        do{
            System.out.println("Digite una posicion(0-9): ");
            posicion = entrada.nextInt();
        }while(posicion<0 || posicion>9);

        for (int i=posicion;i<9;i++){
            arreglo[i]= arreglo[i+1];
        }
        System.out.println("\nArreglo queda: ");
        for (int i=0;i<9;i++){
            System.out.println(i+". Elemento "+arreglo[i]);
        }
    }
}
