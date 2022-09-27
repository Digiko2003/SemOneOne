package DIGIKO333;

import java.util.Scanner;
public class ArticuloPrueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String descripcionx;
        int unidadesx;
        double preciox;
        System.out.println("Descripcion: ");
        descripcionx = entrada.next();
        System.out.println("Unidades Disponibles: ");
        unidadesx = entrada.nextInt();
        System.out.println("Precio: ");
        preciox = entrada.nextDouble();
        ArticuloMinorista Articulo1 = new ArticuloMinorista(descripcionx, unidadesx, preciox);
        System.out.println("descripcion\t\tunidades\t\tprecio");
        System.out.println("--------------------------------------------------------");
        System.out.println(Articulo1.obtenerDatos());

        System.out.println("Descripcion: ");
        descripcionx = entrada.next();
        System.out.println("Unidades Disponibles: ");
        unidadesx = entrada.nextInt();
        System.out.println("Precio: ");
        preciox = entrada.nextDouble();
        ArticuloMinorista Articulo2 = new ArticuloMinorista(descripcionx, unidadesx, preciox);
        System.out.println("descripcion\t\tunidades\t\tprecio");
        System.out.println("--------------------------------------------------------");
        System.out.println(Articulo2.obtenerDatos());

        System.out.println("Descripcion: ");
        descripcionx = entrada.next();
        System.out.println("Unidades Disponibles: ");
        unidadesx = entrada.nextInt();
        System.out.println("Precio: ");
        preciox = entrada.nextDouble();
        ArticuloMinorista Articulo3 = new ArticuloMinorista(descripcionx, unidadesx, preciox);
        System.out.println("descripcion\t\tunidades\t\tprecio");
        System.out.println("--------------------------------------------------------");
        System.out.println(Articulo3.obtenerDatos());
    }
}
