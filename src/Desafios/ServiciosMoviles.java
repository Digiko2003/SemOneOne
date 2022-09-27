package Desafios;
import java.util.Scanner;
public class ServiciosMoviles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    double minutos;
                    System.out.println("Slecciono el paquete A");
                    System.out.print("Ingrese la cantidad de minutos que utilizo: ");
                    minutos = entrada.nextDouble();
                    double h1= 39.99;
                    if(minutos <= 450){
                        System.out.println("El cargo total es de: $ "+h1);
                    }
                    else if(minutos>450){
                        double r1= minutos - 450;
                        double r2= r1* 0.45;
                        double r3= h1+r2;
                        System.out.println("El precio de paquete es de: "+h1);
                        System.out.println("Pero utilizo: "+r1+" minutos adicionales");
                        System.out.println("El total es de: $ "+Math.round(r3));
                    }
                    break;
                case 2:
                    System.out.println("Selecciono el paquete B");
                    System.out.print("Ingrese la cantidad de minutos que utilizo: ");
                    minutos = entrada.nextDouble();
                    double h2= 59.99;
                    if(minutos<=900){
                        System.out.println("El cargo total es de: $ "+h2);
                    }
                    else if(minutos>900){
                        double r1= minutos - 900;
                        double r2= r1* 0.40;
                        double r3= h2+r2;
                        System.out.println("El precio de paquete es de: "+h2);
                        System.out.println("Pero utilizo: "+r1+" minutos adicionales");
                        System.out.println("El cargo total es de: $ "+r3);
                    }
                    break;
                case 3:
                    System.out.println("Selecciono el paquete C");
                    System.out.print("Ingrese la cantidad de minutos que utilizo: ");
                    minutos = entrada.nextDouble();
                    double h3= 69.99;
                    if (minutos>=0){
                        System.out.println("El paquete C cuenta con minutos ilimitados, asi que \n el cargo total no cambia");
                        System.out.println("Total: $ "+h3);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Opcion no valida......");
            }
        }while(opcion !=4);
    }
    public static void menu(){
        System.out.println("Proveedor de servicios moviles.");
        System.out.println("*******************************");
        System.out.println("1. Paquete A");
        System.out.println("2. Paquete B");
        System.out.println("3. Paquete C");
        System.out.println("4. Salir");
        System.out.println("*********************************");
        System.out.print("Seleccione el paquete que usted adquirio: ");
    }
}
