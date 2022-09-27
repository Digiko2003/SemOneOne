package Ejercicios;

import java.io.*;
import java.util.*;
public class Orden{

    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        Scanner teclado=new Scanner(System.in);

        int numero,val,mayor,menor;
        double media;

        System.out.println("cuantos numeros quiere ingresar: ");
        numero=teclado.nextInt();
        mayor=0;
        menor=1000000000;
        media=0;

        for (int i=1;i<=numero;i++)
        {
            System.out.println("Ingrese cantidad" + i+": ");
            val=teclado.nextInt();
            if (val>mayor)
            {
                mayor=val;
            }
            if (val<menor)
            {
                menor=val;
            }
            media=media+val;
        }
        media=media/numero;

        System.out.println("El numero mayor es: "+mayor+"\n");
        System.out.println("El numero menor es: "+menor+"\n");
        System.out.println("La media de los valores: "+media);
    }
} 