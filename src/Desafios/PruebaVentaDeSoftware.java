package Desafios;

import java.util.Scanner;
public class PruebaVentaDeSoftware {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        VentaDeSoftware venta = new VentaDeSoftware(0);
        do{
            menu();
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    int cantidad;
                    System.out.print("Ingresa la cantidad de paquetes vendidos: ");
                    cantidad = entrada.nextInt();
                    venta = new VentaDeSoftware(cantidad);
                    System.out.println("La venta total con el descuento es de " + venta.obtenerTotalVenta() + " pesos");
                    break;
                case 2:
                    System.out.println("La venta total con el descuento es de "+ venta.obtenerTotalVenta() + " pesos");
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
        System.out.println("1. Ingresar paquetes vendidos");
        System.out.println("2. Mostrar total de venta");
        System.out.println("3. Salir");
        System.out.println("Elige tu opcion");
    }
}
