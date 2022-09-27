package Febrero2022;

public class Barco {
    protected String nombre;
    protected String año;
    //Constructor
   public Barco (String Nombre,String año){
       this.nombre=nombre;
       this.año=año;
   }
   public void setNombre(String Nombre){
       this.nombre=nombre;
   }
    public String getNombre() {
        return this.nombre;
    }
    public void setAño(String Año) {
        this.año = Año;
    }

    public String getAño() {
        return this.año;
    }
    public String toString(){
       return "Nombre" + this.nombre + "Año en que se contruyo:" + this.año;
    }
}
