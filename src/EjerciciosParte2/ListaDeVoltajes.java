package EjerciciosParte2;

import java.util.Scanner;
public class ListaDeVoltajes {
    public static void main(String[] args){
        System.out.println("Una lista de 10 voltajes en numeros enteros: ");
        Scanner entrada = new Scanner(System.in);
        int voltaje[] = {89, 75, 82, 93, 78, 95, 81, 88, 77, 82};
        for(int i=0;i<10;i++){
            System.out.println("Voltajes: " + voltaje[i]);
        }
        System.out.println("Programa finalizado");
    }
}
