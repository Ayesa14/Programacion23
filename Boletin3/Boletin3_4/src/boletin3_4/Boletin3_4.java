/*Realiza un algoritmo e codifica o programa correspondente  que lea, dende o 
teclado, unha cantidade enteira en euros e amose , por pantalla, o seu 
desglose en billetes de 100, 20, 5 e moedas de 1 € .*/
package boletin3_4;

import java.util.Scanner;

public class Boletin3_4 {

    public static void main(String[] args) {
        int total, billetes100, billetes20, billetes5, monedas1;
       
       System.out.println("Introduce la cantidad total a ingresar: ");
        Scanner cantTotal = new Scanner(System.in);
        total = cantTotal.nextInt();
        
        billetes100 = total / 100;
        billetes20 = (total%100)/20;
        billetes5 = ((total%100)%20)/5;
        monedas1 = ((total%100)%20)%5;
        
        System.out.println("Cantidad de billetes de 100: "+billetes100);
        System.out.println("Cantidad de billetes de 20: "+billetes20);
        System.out.println("Cantidad de billetes de 5: "+billetes5);
        System.out.println("Cantidad de monedas de 1: "+monedas1);
    }
    
}
