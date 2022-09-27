package DIGIKO2;

import java.util.Scanner;
public class CaloriasDeGalletas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int galletasConsumidas;
        double TotalDeCalorias;

        System.out.print("¿Cuántas Galletas te comistes?: ");
        galletasConsumidas = entrada.nextInt();

        TotalDeCalorias = galletasConsumidas * 300;
        System.out.println("Tus calorias consumidas son de:" + TotalDeCalorias);
    }
}
