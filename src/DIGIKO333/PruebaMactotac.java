package DIGIKO333;

import DIGIKO333.MascotaC;

import java.util.Scanner;
public class PruebaMactotac {
    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        String nombrex, animalx;
        int edadx;
        System.out.println("Dame el nombre de la primera mascota: ");
        nombrex=entrada.next();
        System.out.println("Dame el tipo de animal(perro, gato, pajaro): ");
        animalx=entrada.next();
        System.out.println("Dame la edad del animal en años: ");
        edadx= entrada.nextInt();
        MascotaC miMascota1=new MascotaC(nombrex, animalx, edadx);
        System.out.println("Nombre\t\tAnimal\t\tEdad");
        System.out.println("--------------------------------------------------------");
        System.out.println(miMascota1.obtenerDatos());

        System.out.println("Dame el nombre de la segunda mascota: ");
        nombrex=entrada.next();
        System.out.println("Dame el tipo de animal(perro, gato, pajaro): ");
        animalx=entrada.next();
        System.out.println("Dame la edad del animal en años: ");
        edadx= entrada.nextInt();
        MascotaC miMascota2=new MascotaC(nombrex, animalx, edadx);
        System.out.println("Nombre\t\tAnimal\t\tEdad");
        System.out.println("--------------------------------------------------------");
        System.out.println(miMascota2.obtenerDatos());

        System.out.println("Dame el nombre de la tercera mascota: ");
        nombrex=entrada.next();
        System.out.println("Dame el tipo de animal(perro, gato, pajaro): ");
        animalx=entrada.next();
        System.out.println("Dame la edad del animal en años: ");
        edadx= entrada.nextInt();
        MascotaC miMascota3=new MascotaC(nombrex, animalx, edadx);
        System.out.println("Nombre\t\tAnimal\t\tEdad");
        System.out.println("--------------------------------------------------------");
        System.out.println(miMascota3.obtenerDatos());

    }
}
