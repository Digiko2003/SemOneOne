package DIGIKO2;

import java.util.Scanner;
public class AjustadorDeIngredientes {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int Galletas;
        double TazasDeAzucar;
        double TazasDeMantequilla;
        double TazasDeHarina;

        System.out.println("¿Cuantas galletas desea hacer?:");
        Galletas = entrada.nextInt();

        TazasDeAzucar = Galletas * 0.03125;
        System.out.println("Tazas de azucar:" + TazasDeAzucar);
        TazasDeMantequilla = Galletas * 0.02083;
        System.out.println("Tazas de mantequilla:" + TazasDeMantequilla);
        TazasDeHarina = Galletas * 0.05729;
        System.out.println("Tazas de harina:" + TazasDeHarina);
    }
}
