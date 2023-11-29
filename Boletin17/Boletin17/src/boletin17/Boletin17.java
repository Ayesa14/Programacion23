package boletin17;

import com.aye.cuentas.CuentaAhorro;
import com.aye.cuentas.CuentaCorriente;

public class Boletin17 {

    public static void main(String[] args) {
        Cliente p1 = new Cliente("Paco", "Ramirez", "12345678A");
        CuentaCorriente c1 = new CuentaCorriente(70,1200,p1);
        CuentaAhorro ca1= new CuentaAhorro(2,71,12000,p1);
        
        System.out.println(c1.toString());
        System.out.println(ca1.toString());
    }
    
}
