/*Programa que calcule el precio total de un producto con IVA*/
package bolextra1;

import java.util.Scanner;

public class BolExtra1 {

    public static void main(String[] args) {
        double baseImponible, iva, total;
        
        System.out.println("Introduce la base: ");
        Scanner objBase = new Scanner(System.in);
        baseImponible = objBase.nextDouble();
        
        System.out.println("Introduce el IVA a aplicar: ");
        iva = objBase.nextDouble();
        
        iva = (baseImponible * iva) / 100;
        total = baseImponible + iva;
        
        System.out.println("La cantidad total es: "+total+" euros, del cual el IVA es: "+iva+" euros y la base imponible: "+baseImponible+" euros");
    }
    
}
