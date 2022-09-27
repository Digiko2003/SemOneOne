package DIGIKO333;

import DIGIKO333.Esudiante;

//Fig. 4.5 PruevaEstudiante.java
//Crea y prueba objeto Estudiante
public class PruebaEstudiante
{
    public static void main(String[] args)
    {
        Esudiante cuenta1 = new Esudiante("Jane Green", 93.5);
        Esudiante cuenta2 = new Esudiante("Jonh Blue", 72.75);

        System.out.printf("La calificacion en la letra de %s es: %s%n",
                cuenta1.obtenerNombre(),cuenta1.obtenerCalificacionEstudiante());
        System.out.printf("La calificacion en la letra de %s es: %s%n",
                cuenta2.obtenerNombre(),cuenta2.obtenerCalificacionEstudiante());
    }
}
