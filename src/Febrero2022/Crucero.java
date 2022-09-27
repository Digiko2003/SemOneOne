package Febrero2022;

import Febrero2022.Barco;

public class Crucero extends Barco {
    private  int Pasajeros;

    public Crucero(String nombre, String año, int Pasajeros){
        super(nombre,año);
        this.Pasajeros = Pasajeros;
    }
    public void setPasajeros(int Pasajeros){
        this.Pasajeros = Pasajeros;
    }
    public int getPasajeros() {
        return this.Pasajeros;
    }
    public String toString() {
        return "Nombre: "+ this.nombre +"Cantidad Maxima de Pasajeros: "+this.Pasajeros;
    }
}

