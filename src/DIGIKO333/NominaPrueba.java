package DIGIKO333;

import DIGIKO333.Nomina;

public class NominaPrueba {
    public static void main(String[] args){
        // Trabajador 1
        Nomina trabajadorNomina=new Nomina();
        trabajadorNomina.establecerHorasTrabajadas(30);
        trabajadorNomina.establecerPagoPorHora(200);
        System.out.println("primer trabajador: ");
        System.out.println("Horas trabajadas: "+ trabajadorNomina.obtenerHorasTrabajadas());
        System.out.println("Pago por hora: "+ trabajadorNomina.obtenerPagoPorHora());
        System.out.println("Salario bruto: "+ trabajadorNomina.obtenerSalarioBruto());
        System.out.println("-----------------------------------------------------");
        // Trabajador 2
        Nomina trabajadorNomina2=new Nomina();
        trabajadorNomina2.establecerHorasTrabajadas(45);
        trabajadorNomina2.establecerPagoPorHora(200);
        System.out.println("primer trabajador: ");
        System.out.println("Horas trabajadas: "+ trabajadorNomina2.obtenerHorasTrabajadas());
        System.out.println("Pago por hora: "+ trabajadorNomina2.obtenerPagoPorHora());
        System.out.println("Salario bruto: "+ trabajadorNomina2.obtenerSalarioBruto());
    }
}
