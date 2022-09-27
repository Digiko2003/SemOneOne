package DIGIKO4;

public class incrementoDecremento {
    public static void main(String[] args){
        int numero = 4;
        System.out.println("Numero: " + numero); // 4
        // Incrementar el numero
        System.out.println("INCREMENTANDO NUMERO..");
        numero++;
        System.out.println("numero: " + numero); // 5
        numero = numero +1;
        System.out.println("numero: " + numero); // 6
        numero = numero +10;
        System.out.println("numero: " + numero); // 16
        numero += 10;
        System.out.println("numero: " + numero); // 26

        //Decrementar el numero
        System.out.println("DECREMENTANDO NUMERO..");
        numero--;
        System.out.println("numero: " + numero); //25
        numero = numero -5;
        System.out.println("numero: " + numero); //20
        numero -= 5;
        System.out.println("numero: " + numero); //15
    }
}
