package boletin2_3;
//Crea un algoritmo que cambie euros a dólares ( O cambio pídese por teclado )

import java.util.Scanner;


public class Boletin2_3 {

    
    public static void main(String[] args) {
        float euros, cambio;
        
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de euros a cambiar");
        euros = objScanner.nextFloat();
        
        System.out.println("Introduce cómo está el cambio actualmente");
        cambio = objScanner.nextFloat();
        
        float total = euros * cambio;
        
        System.out.println("El cambio de "+euros+" euros son "+total+" dólares");
        
        
    }
    
}
