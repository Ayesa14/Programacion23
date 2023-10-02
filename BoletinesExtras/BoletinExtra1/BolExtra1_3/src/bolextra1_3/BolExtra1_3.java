/*
Tenta escribir un programa que escriba na pantalla canto custarache comprar uns 
pantalóns cuxo prezo de catálogo é de 90 €, se sabes que podes conseguir unha 
rebaixa do 25% 
 */
package bolextra1_3;

import java.util.Scanner;

public class BolExtra1_3 {

    
    public static void main(String[] args) {
        float precio, rebaja, precioTotal;
        
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Introduce el precio: ");
        precio = objScanner.nextFloat();
        
        System.out.println("Introduce el porcentaje de la rebaja: ");
        rebaja = objScanner.nextFloat();
        
        precioTotal = precio - ((precio * rebaja) / 100);
        
        System.out.println("El precio final tras la rebaja es: "+precioTotal);
        
        
        
    }
    
}
