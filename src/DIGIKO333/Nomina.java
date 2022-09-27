package DIGIKO333;

public class Nomina {
    private double horasTrabajadas;
    private double pagoPorHora;

    public Nomina() {
        this.horasTrabajadas = 0.0;
        this.pagoPorHora = 0.0;
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
        if (horasTrabajadas <= 40) { //no hubo horas extra,pago normal
            salarioBruto = horasTrabajadas * pagoPorHora;
        } else { // si tubo horas extra, pago con bono
            double horasExtras = horasTrabajadas - 40;
            salarioBruto = (horasExtras * 1.5 * pagoPorHora) + (pagoPorHora * 40);
        }
        return salarioBruto;
    }
}
