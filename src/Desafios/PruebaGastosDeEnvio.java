package Desafios;

import Desafios.GastosDeEnvio;

import java.util.Scanner;
public class PruebaGastosDeEnvio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        GastosDeEnvio venta = new GastosDeEnvio(0);
        do{
            menu();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    int Peso;
                    System.out.print("Ingresa peso del paquete: ");
                    Peso = entrada.nextInt();
                    venta = new GastosDeEnvio(Peso);
                    System.out.println("Tarifa por envio es de " + venta.obtenerPeso() + " pesos");
                    break;
                case 2:
                    System.out.println("Tarifa por envio es de "+ venta.obtenerPeso() + " pesos");
                    break;
                case 3:
                    System.out.println("SALIENDO....");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion !=3);
    }
    public static void menu(){
        System.out.println("Calcular las ventas de software");
        System.out.println("1. Ingresar peso del paquete");
        System.out.println("2. Mostrar total de peso");
        System.out.println("3. Salir");
        System.out.println("Elige tu opcion");
    }
}
