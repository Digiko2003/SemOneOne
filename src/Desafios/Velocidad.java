package Desafios;
import java.util.Scanner;

public class Velocidad {   public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    double Distancia, Tiempo;
    int opcion=4;
    System.out.println("Menú\n1.Velocidad en aire\n2.Velocidad en agua\n3.Velocidad en agua\n4.Salir");
    do {
        System.out.println("Ingrese la opción que desea realizar: ");
        opcion = entrada.nextInt();
        if(opcion>4){
            System.out.println("Opcion no valida");
        }else {
            switch (opcion) {
                case 1:
                    System.out.println("Velocidad del aire\nIngrese la distancia en pies: ");
                    Distancia = entrada.nextDouble();
                    Tiempo = Distancia / 1100;
                    System.out.println("El tiempo que tardara es de: " + Tiempo);
                    break;
                case 2:
                    System.out.println("Velocidad del agua\nIngrese la distancia en pies: ");
                    Distancia = entrada.nextDouble();
                    Tiempo = Distancia / 4900;
                    System.out.println("El tiempo es de: " + Tiempo);
                    break;
                case 3:
                    System.out.println("Velocidad del acero\nIngrese la distancia en pies: ");
                    Distancia = entrada.nextDouble();
                    Tiempo = Distancia / 16400;
                    System.out.println("Total de tiempo : " + Tiempo);
                    break;
                default:
                    System.out.print("Programa terminado");
            }
        }
    }while(opcion != 4);
}
}
