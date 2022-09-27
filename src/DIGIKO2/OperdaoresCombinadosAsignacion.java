package DIGIKO2;

public class OperdaoresCombinadosAsignacion {
    public static void main(String[] args) {
        System.out.println("suma:" + (5 + 8));
        final int c = 7;
        System.out.println("resta:" + (20 - c));
        double resultado = 8.0 / 3;
        System.out.println("division:" + resultado);
        int d =8;
        System.out.println("multiplicasion" + (d * c));
        System.out.println("----------------------------");

        double cantidad = 10;
        double suma = 0, resta = 0, multiplicasion = 1, division =1;
        suma = suma + cantidad;
        System.out.println("suma" + suma);
        suma = suma + cantidad;
        System.out.println("suma" + suma);
        suma = suma + cantidad;
        System.out.println("suma" + suma);

        System.out.println("----------------------------");
        System.out.println("resta" + resta);
        resta -= resta;
        resta -= resta;
        resta -= resta;
        resta -= resta;
        resta -= resta;
        System.out.println("resta" + resta);

        System.out.println("----------------------------");
        multiplicasion = multiplicasion * cantidad; //10
        multiplicasion = multiplicasion * cantidad; //100
        multiplicasion = multiplicasion * cantidad; //1000
        System.out.println("multiplicasion" + multiplicasion);

        System.out.println("----------------------------");
        division = division / cantidad;
        division /= cantidad;
        System.out.println("division" + division);


    }
}
