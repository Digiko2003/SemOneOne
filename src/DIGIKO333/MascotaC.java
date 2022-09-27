package DIGIKO333;

public class MascotaC {
    private String nombre;
    private String animal;
    private int edad;

    //Constructor
    public MascotaC(String nombrex, String animalx, int edadx){
        this.nombre=nombrex;
        this.animal=animalx;
        this.edad=edadx;
    }
    //metodos establecer y obtener
    public void estabecerNombre(String nombre){
        this.nombre=nombre;
    }
    public String obtenerNombre(){
        return this.nombre;
    }
    public void estabecerAnimal(String animal) {
        this.animal = animal;
    }
    public String obtenerAnimal() {
        return this.animal;
    }
    public void estabecerEdad(int edad) {
        this.edad = edad;
    }
    public int obteneredad() {
        return this.edad;
    }

    public String obtenerDatos(){
        return "" + nombre + "\t\t" + animal + "\t\t" + edad + "\n";
    }
}
