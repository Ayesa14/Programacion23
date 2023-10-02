/*Fai o algoritmo e programa  que calcule o soldo bruto e líquido, a percibir, 
por unha persoa .Sabendo que o soldo total inclue os seguintes conceptos :

    • Soldo fixo. 
    • Comisión : 5% sobre importe total de vendas
    • Quilometraxe : 2 € por km
    • Dietas : 30 € por día de desprazamento .
Para calcular o soldo líquido debemos descontarlle ao soldo bruto :
    • I.R.P.F. = 18 % do soldo total .
    • Retención a seguridade social : 36 € */
package boletin3_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        double sueldoBruto, sueldoFijo, sueldoNeto, ventas, comision, kilometros, kilometraje, dias, dietas, irpf, seguridadSocial;
        
        System.out.println("Introduce el sueldo fijo: ");
        Scanner objSueldo = new Scanner(System.in);
        sueldoFijo = objSueldo.nextDouble();
        
        System.out.println("Introduce el importe total de las ventas realizadas: ");
        ventas = objSueldo.nextDouble();
        comision = (5 * ventas) / 100;
        
        System.out.println("Introduce el total de kilómetros realizados: ");
        kilometros = objSueldo.nextDouble();
        kilometraje = 2 * kilometros;
        
        System.out.println("Introduce el total de días que se desplazó: ");
        dias = objSueldo.nextDouble();
        dietas = 30 * dias;
        
        sueldoBruto = sueldoFijo + comision + kilometraje + dietas;
        
        irpf = sueldoBruto * 0.18;
        seguridadSocial = 36.0;
        
        sueldoNeto = sueldoBruto - (irpf + seguridadSocial);
        
        DecimalFormat df = new DecimalFormat();
        System.out.println("El sueldo neto es: "+df.format(sueldoNeto)+" euros");
    }
    
}
