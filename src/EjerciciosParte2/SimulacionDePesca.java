package EjerciciosParte2;

import java.util.Scanner;

public class SimulacionDePesca {
    public static void main(String[] args) {

        Dado dado1 = new Dado(6*10);
        dado1.lanzar();

        Scanner entrada = new Scanner(System.in);
        int opcion=2;
        do {
            System.out.println("Para empezar o volver a jugar seleccione 1: ");
            System.out.println("Para Terminar de jugar seleccione 2: ");
            opcion = entrada.nextInt();
            if(opcion>2){
                System.out.println("Opcion no valida");
            }else {
                switch (opcion) {
                    case 1:
                        System.out.println("Empezando a pescar.....");
                        System.out.println("Felizidades ha obtenido " + dado1.obtenerValor() + " Puntos");
                        System.out.println("-----------------------------------------------");
                        break;
                    default:
                        System.out.print("Programa terminado");
                }
            }
        }while(opcion != 2);
    }
}
