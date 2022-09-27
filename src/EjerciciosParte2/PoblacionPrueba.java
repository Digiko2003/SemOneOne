package EjerciciosParte2;
import java.util.Scanner;

public class PoblacionPrueba {
    public static void main(String[] args) {
        Scanner Poblacion = new Scanner(System.in);
        int cantidadPoblacion;
        int cantidadPorcentaje;
        System.out.println("Ingrese el numero de la poblacion inicial: ");
        cantidadPoblacion =Poblacion.nextInt();
        if(cantidadPoblacion>2) {
            System.out.println("Ingrese el Porcentaje de aumento diario: ");
            cantidadPorcentaje = Poblacion.nextInt();

            Poblacion Poblacion1 = new Poblacion(cantidadPoblacion, cantidadPorcentaje);
            System.out.println("Dia 1: " + Poblacion1.obtenerpoblacion());
            int A1 = Poblacion1.obtenerpoblacion() * Poblacion1.obtenerPorcentaje() / 100 + 1000;
            System.out.println("Dia 2: " + A1);
            int h1 = A1 * Poblacion1.obtenerPorcentaje();
            int h2 = (h1 / 100);
            int A2 = A1 + h2;
            System.out.println("Dia 3: " + A2);
            int h3 = A2 * Poblacion1.obtenerPorcentaje();
            int h4 = (h3 / 100);
            int A3 = A2 + h4;
            System.out.println("Dia 4: " + A3);
            int h5 = A3 * Poblacion1.obtenerPorcentaje();
            int h6 = (h5 / 100);
            int A4 = A3 + h6;
            System.out.println("Dia 5: " + A4);
        }else if(cantidadPoblacion<=2){
            System.out.println("Numero invalido");
        }
    }
}
