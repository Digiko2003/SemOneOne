package Ejercicios;

//By Diego Arturo Enriquez Mercado
public class Ejercicio4 {
    public String nombre;
    public String equipo;
    public String posicion;
    public int goles;

    public Ejercicio4(String nombre, String equipo, String posicion, int goles) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
        this.goles = goles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "Equipo: " + this.equipo + "Posicion: " + this.posicion + "Goles: " + this.goles;
    }
}