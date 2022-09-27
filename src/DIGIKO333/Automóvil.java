package DIGIKO333;

public class Automóvil {
    private int anioModelo;
    private String marca;
    private int velocidad;

    //Constructor
    public Automóvil(int anioModelox, String marcax, int velocidadx) {
        this.anioModelo = anioModelox;
        this.marca = marcax;
        this.velocidad =0;
    }
    //metodos establecer y obtener

    public void estabeceranioModelo(int anioModelo ){
        this.anioModelo=anioModelo;
    }
    public int obteneranioModelo(){
        return this.anioModelo;
    }

    public void estabecermarca(String marca ){
        this.marca=marca;
    }
    public String obtenermarca(){
        return this.marca;
    }

    public void acelerar(){
        System.out.println("El auto acelero" + velocidad);
    }
    public void frenar(){
        System.out.println("El auto freno" + velocidad);
    }

    public int nextInt() {
        return 0;
    }
}
