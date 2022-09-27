package Ejercicios;

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero,sitio_numero=0,j=0;

        System.out.println("Llenar el arreglo");
        do {
            //Llenado el arreglo
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //Comprobar ai el arreglo esta ordenado en orden creciente
            for(int i=0;i<4;i++){
                if(arreglo[i] < arreglo[i+1]){ //Cresiente: 1-2-3
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){ //Decresiente: 3-2-1
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo no esta ordenado en forma cresiente, vuelve a digitarlo");
            }
        } while(creciente == false);

        System.out.print("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();

        while (arreglo[j]<numero && j<5){
            sitio_numero++;
            j++;
        }
        //Por ultimo, transladamos una posocion en el arreglo a los elementos que van detras del numero
        for(int i=4;i>=sitio_numero;i--){
            arreglo[i+1] = arreglo[1];
        }
        //Insertamos
        arreglo[sitio_numero] = numero;

        System.out.print("\nEl arreglo queda: ");
        for(int i=0;i<6;i++){
            System.out.print(arreglo[i]+"-");
        }
        System.out.println();
    }
}
