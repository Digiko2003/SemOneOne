package DIGIKO2;

import java.util.Scanner;
public class FacturaDelRestaurante {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int CargoPorLaComida;
        double Impuesto;
        double Propina;
        double Total;

        System.out.println("Ingrese cargo por la comida:");
        CargoPorLaComida = entrada.nextInt();

        Impuesto = CargoPorLaComida / 100 * 7.5;
        System.out.println("Monto del impuesto:" + Impuesto);
        Propina = CargoPorLaComida / 100 * 18;
        System.out.println("Monto de la propina:" + Propina);
        Total = CargoPorLaComida / 100 * 125.5;
        System.out.println("Factura total:" + Total);
    }
}
