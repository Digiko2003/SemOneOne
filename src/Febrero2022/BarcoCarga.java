package Febrero2022;

import Febrero2022.Barco;

public class BarcoCarga extends Barco {
    private int capacidad;

    public BarcoCarga(String nombre, String año, int capacidad){
        super(nombre, año);
        this.capacidad = capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public int getCapacidad(){
        return this.capacidad;
    }
    public String toString(){
        return "Nombre: "+ this.nombre +"Capacidad de Carga: "+this.capacidad;
    }
}