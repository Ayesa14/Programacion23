package com.aye.cuentas;

import boletin17.Cuenta;
import boletin17.Persona;

public class CuentaCorriente extends Cuenta{
    
    public CuentaCorriente(long nCuenta, double saldo, Persona p1){
        super(nCuenta, saldo * 1.5, p1);
    }
    
    public CuentaCorriente(){}
}
