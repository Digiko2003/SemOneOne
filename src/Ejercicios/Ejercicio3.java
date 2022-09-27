package Ejercicios;//By Diego Arturo Enriquez Mercado
import java.io.*;
import java.util.*;import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double c1, c2, c3, c4, c5, promedio = 0;

        System.out.println("Digite la primera calificacion : ");
        c1 = entrada.nextDouble();
        System.out.println("Digite la segunda calificacion : ");
        c2 = entrada.nextDouble();
        System.out.println("Digite la tercera calificacion : ");
        c3 = entrada.nextDouble();
        System.out.println("Digite la cuarta calificacion : ");
        c4 = entrada.nextDouble();
        System.out.println("Digite la quinta calificacion : ");
        c5 = entrada.nextDouble();

        System.out.println("-------------------------------");
        System.out.println("Lista de calificasiones");
        System.out.println("1_    " + c1);
        System.out.println("2_    " + c2);
        System.out.println("3_    " + c3);
        System.out.println("4_    " + c4);
        System.out.println("5_    " + c5);

        System.out.println("-------------------------------");
        System.out.println("Promedio de todas las calificasiones");
        promedio = (c1 + c2 + c3 + c4 + c5) / 5;
        System.out.println("Promedio:   " + promedio);

        System.out.println("-------------------------------");
        System.out.println("La calificasion mas alta y baja");
    }
}

