package DIGIKO4;

import java.util.Scanner;

public class Loncheria {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Lista de precios para una loncheria");
        //Tortas, refrescos, quesadillas, tacos, aguas frescas
        double precioTortas, precioRefrescos, precioQuesadillas, precioTacos, precioAguas;
        System.out.println("Dame le precio de las tortas: ");
        precioTortas= entrada.nextDouble();
        System.out.printf("%15s %8s?\n", "Cantidad-tortas", "Total");
        System.out.println("---------------------------------------------");

        //for -> inicio, condicion
        for (int i=1; i<=10; i++);{
            System.out.printf("%15d %8.2f\n");
        }

        }
        }
