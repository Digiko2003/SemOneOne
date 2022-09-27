package Ejercicios;

import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        boolean creciente = true;

        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("Digite el primer arreglo: ");
        do {
            for(int i = 0; i < 10; i++) {
                System.out.print((i+1)+". Digite un numero: ");
                a[i] = entrada.nextInt();
            }
            for(int i = 0; i < 9; i++) {
                if(a[i]<a[i+1]){
                    creciente = true;
                }
                if(a[i]>a[i+1]){
                    creciente = false;
                    break;

                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar");
            }
        }while(creciente == false);

        System.out.println("Digite el segundo arreglo: ");
        do {
            for(int i = 0; i < 10; i++) {
                System.out.print((i+1)+". Digite un numero: ");
                b[i] = entrada.nextInt();
            }
            for(int i = 0; i < 9; i++) {
                if(b[i]<b[i+1]){
                    creciente = true;
                }
                if(b[i]>b[i+1]){
                    creciente = false;
                    break;

                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar");
            }
        }while(creciente == false);

        int i=0;//Sera para el arreglo a
        int j=0;//Sera para el arreglo a
        int k=0;//Sera para el arreglo c

        while(i<10 && j<10){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]= b[j];
                j++;
            }
            k++;
        }
        //Cuando salimos del while es porque un arreglo a o b se a copiado correctamente
        if(i==10){
            while(j<10){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        else{
            while(i<10){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        System.out.println("\nEl arreglo C completo es: ");
        for(k=0;k<20;k++){
            System.out.print(c[k]+" ");
        }
        System.out.println("");
    }
}
