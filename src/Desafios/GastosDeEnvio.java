package Desafios;

public class GastosDeEnvio {
    private int PesoDePaquete;

    public GastosDeEnvio(int unidades){
        this.PesoDePaquete = unidades;
    }
    public double obtenerPeso(){
        double Tarifa = 0;
        if (PesoDePaquete >= 2 && PesoDePaquete <=-2){
            Tarifa = 1.10;
        } else if (PesoDePaquete >=2 && PesoDePaquete <=6){
            Tarifa = 2.20;
        }else if (PesoDePaquete >= 6 && PesoDePaquete <=10){
            Tarifa = 3.70;
        }else if (PesoDePaquete >=+10){
            Tarifa = 4.80;
        }
        double total;
        total = PesoDePaquete * Tarifa;
        return total;
    }
}
