package com.aye.cuentas;

import boletin17.Cuenta;
import boletin17.Persona;

public class CuentaAhorro extends Cuenta {
    private double interes;
    private double saldoMin = 1000;
    
    public CuentaAhorro(double interes, long nCuenta, double saldo, Persona cliente){
        super(nCuenta, saldo, cliente);
        this.interes = saldo * interes / 100;
        if(saldo >= saldoMin){
            super.setSaldo(saldo + interes);
        }
    }
    
    public CuentaAhorro(){}
    
    @Override
    public String toString(){
        return super.toString()+ "CuentaAhorro{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }
}
