/*Programa que saque por pantalla a porcentaxe descontada nunha compra. 
   Introducindo, por teclado, o prezo da tarifa e o prezo pagado.*/
package boletin3_1;

import java.util.Scanner;

public class Boletin3_1 {

    public static void main(String[] args) {
        float tarifa, precio, desc;
        
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Introduce el precio de la tarifa inicial: ");
        tarifa = objScanner.nextFloat();
        
        System.out.println("Introduce el precio pagado: ");
        precio = objScanner.nextFloat();
        
        desc = 100 - ((precio * 100)/tarifa);
        System.out.println("El descuento realizado es: "+desc+"%");
    }
    
}
