package DIGIKO333;

public class Nomina2 {
    private String nombre;
    private double identificasion;
    private double horasTrabajadas;
    private double pagoPorHora;

    public Nomina2() {
        this.horasTrabajadas = 0.0;
        this.pagoPorHora = 0.0;
    }
    public void establecerNombre(String nombre){
        this.nombre=nombre;
    }
    public String obtenerNombre(){
        return this.nombre;
    }
    public void estableceridentificasion(double identificasion){
        this.identificasion=identificasion;
    }
    public double obteneridentificasion(){
        return this.identificasion;
    }

    public void establecerHorasTrabajadas(double horas) {
        this.horasTrabajadas = horas;
    }

    public double obtenerHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void establecerPagoPorHora(double pago) {
        this.pagoPorHora = pago;
    }

    public double obtenerPagoPorHora() {
        return this.pagoPorHora;
    }

    public double obtenerSalarioBruto() {
        double salarioBruto = 0;
         {salarioBruto = horasTrabajadas * pagoPorHora;}
        return salarioBruto;
    }
}
