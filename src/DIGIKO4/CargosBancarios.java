package DIGIKO4;

public class CargosBancarios {
    private double SaldoCuenta;
    private int CantidadChequesEmitidos;
    public CargosBancarios(double saldo, int cheques){
        this.SaldoCuenta=saldo;
        this.CantidadChequesEmitidos=cheques;
    }
    public double obtenerCobroTotal(){
        double comisionBase, cargoAdicional, comisionPorCheque, cobroTotal;
        //cobro por comision base
        comisionBase=10;
        SaldoCuenta=SaldoCuenta - comisionBase;

        //cobro por carfo adicional
        cargoAdicional=0;
        if(SaldoCuenta<400){
            cargoAdicional=15;
        }
        SaldoCuenta=SaldoCuenta - cargoAdicional;
        //cobro por comisio de cheques
        comisionPorCheque=0;
        if(CantidadChequesEmitidos < 20){
            comisionPorCheque= CantidadChequesEmitidos * 0.10;
        } else if(CantidadChequesEmitidos >=20 && CantidadChequesEmitidos<=39){
            comisionPorCheque=CantidadChequesEmitidos * 0.88;
        }else if(CantidadChequesEmitidos >=40 && CantidadChequesEmitidos<=59){
            comisionPorCheque=CantidadChequesEmitidos * 0.06;
        }else if(CantidadChequesEmitidos >=60) {
            comisionPorCheque=CantidadChequesEmitidos * 0.04;
        }
        //saldo final y cobro total
        SaldoCuenta =SaldoCuenta - comisionPorCheque;
        cobroTotal = comisionBase + cargoAdicional + comisionPorCheque;
        return cobroTotal;
    }//fin de obtener cobro total

    public double obtenerSaldoActual(){
        return SaldoCuenta;
    }
}
