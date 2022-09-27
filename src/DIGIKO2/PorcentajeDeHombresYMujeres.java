package DIGIKO2;

import java.util.Scanner;
public class PorcentajeDeHombresYMujeres {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int TotalDeHombres;
        int TotalDeMujeres;
        int TotalDePersonas;
        double PorcentajeDeHombres;
        double PorcentajeDeMujeres;

        System.out.println("¿Cuantos hombres hay?:");
        TotalDeHombres = entrada.nextInt();
        System.out.println("¿Cuantas mujeres hay?:");
        TotalDeMujeres = entrada.nextInt();
        System.out.println("¿Total de personas?:");
        TotalDePersonas = entrada.nextInt();

        PorcentajeDeHombres = TotalDeHombres * 100 / TotalDePersonas;
        System.out.println("El porcentaje de hombres es de:" + PorcentajeDeHombres);
        PorcentajeDeMujeres = TotalDeMujeres * 100 / TotalDePersonas;
        System.out.println("El porcentaje de mujeres es de:" + PorcentajeDeMujeres);

    }
}
