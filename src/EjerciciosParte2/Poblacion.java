package EjerciciosParte2;
public class Poblacion {
    private int poblacion;
    private int porcentaje;
    private int valor;

    public Poblacion(int poblacion,int porcentaje)
    {this.poblacion = poblacion;
        this.porcentaje = porcentaje;
    }
    public void calcular(){
        this.valor =(poblacion*porcentaje)/100;

    }

    public int obtenerpoblacion(){return poblacion;}

    public int obtenerPorcentaje(){return porcentaje;}

    public int obtenerValor(){return valor;}
}
