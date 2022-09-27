package DIGIKO2;

import java.util.Scanner;
public class ConsumoDeBebidas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double DosPorCemana;
        double SaborCitricos;

        DosPorCemana = 15000 / 100 * 18;
        System.out.println("Cantidad de clientes que compran 1 o 2 bebidas por cemana:"+ DosPorCemana);
        SaborCitricos = 15000 / 100 * 58;
        System.out.println("Cantidad de clientes que prefieren bebidas sabor a citricos:" + SaborCitricos);
    }

}
