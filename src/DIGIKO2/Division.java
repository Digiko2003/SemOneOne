package DIGIKO2;

import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, division;

        System.out.println("determinar si es posible hacer la division"+"entre el numero 1 y el numero 2");
        System.out.println("Dame un numero: ");
        numero1= entrada.nextDouble();
        System.out.println("Dame otro numero");
        numero2= entrada.nextDouble();

        if(numero2 !=0){
            System.out.println("Hacer la vivision es posible");
            division= numero1 / numero2;
            System.out.println("El resultado de la division es: "+ division);
        }

        else{
                System.out.println("No es posible realizar la division");
            }
        }
    }
