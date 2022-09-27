package DIGIKO2;

import java.util.Scanner;
class Booleano1 {

    public static void main( String args[] ) {

        int dato;
        boolean todoCorrecto;
        Scanner teclado = new Scanner(System.in);

        do
        {
            System.out.print("Introduce un dato del 0 al 10: ");
            dato = teclado.nextInt();
            todoCorrecto = true;

            if (dato < 0)
                todoCorrecto = false;

            if (dato > 10)
                todoCorrecto = false;

            if ( ! todoCorrecto )
                System.out.println("No es válido!");
        }
        while ( ! todoCorrecto );
        System.out.println("Terminado!");
    }
}
