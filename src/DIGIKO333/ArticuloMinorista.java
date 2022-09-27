package DIGIKO333;

public class ArticuloMinorista {
    private String descripcion;
    private int unidades;
    private double precio;

    ArticuloMinorista(String descripcionx, int unidadesx, double preciox){
        this.descripcion=descripcionx;
        this.unidades=unidadesx;
        this.precio=preciox;
    }
    //metodos establecer y obtener
    public void estabecerdescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String obtenerdescripcion(){
        return this.descripcion;
    }
    public void estabecerAnimal(double precio) {
        this.precio = precio;
    }
    public double obtenerAnimal() {
        return this.precio;
    }
    public void estabecerunidades(int unidades) {
        this.unidades = unidades;
    }
    public int obtenerunidades() {
        return this.unidades;
    }

    public String obtenerDatos(){
        return "" + descripcion + "\t\t" + unidades + "\t\t" + precio + "\n";
    }
}

