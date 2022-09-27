package DIGIKO4;

import DIGIKO4.CargosBancarios;

import java.util.Scanner;

public class PruebaCargosBancarios {
    public static void main(String[] args){
        Scanner entrada =new Scanner(System.in);
        double saldo;
        int cheques;
        System.out.println("Dame el saldo del cliente: ");
        saldo = entrada.nextDouble();
        System.out.println("Dame la cantidad de cheques emitidos: ");
        cheques = entrada.nextInt();
        CargosBancarios cargosB = new CargosBancarios(saldo,cheques);
        System.out.println("Cargos bancarios: " +
                cargosB.obtenerCobroTotal());

    }
}
