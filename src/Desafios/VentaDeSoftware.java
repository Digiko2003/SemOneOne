package Desafios;

public class VentaDeSoftware {
    private int unidadesVendidas;

    public VentaDeSoftware(int unidades){
        this.unidadesVendidas = unidades;
    }
    public double obtenerTotalVenta(){
        double porcentajeDescuento = 0;
        if (unidadesVendidas >= 10 && unidadesVendidas <=19){
            porcentajeDescuento = 20;
        } else if (unidadesVendidas >=20 && unidadesVendidas <=49){
            porcentajeDescuento = 30;
        }else if (unidadesVendidas >= 50 && unidadesVendidas <=99){
            porcentajeDescuento = 40;
        }else if (unidadesVendidas >=100){
            porcentajeDescuento = 50;
        }
        double totalVenta;
        totalVenta = unidadesVendidas * 99 - (unidadesVendidas * 99) * porcentajeDescuento / 100;
        return totalVenta;
    }
}
