package DIGIKO4;

public class Sumatoria {
    public static void main(String[] args){
        //
        int suma = 0; //acumulador
        int numero = 1;
        while(numero<=10){
            suma = suma + numero;
            numero++;
        }
        System.out.println("La suma de los numero del 1 al 10 es: " + suma);
    }
}
