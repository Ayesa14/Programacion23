/*Fai un programa , para o software dunha máquina, que converta una cantidade 
enteira de diñeiro, que está en billetes 
de 100, 20, 5 e moedas de 1 € , no seu equivalente en euros ( exp.  2 billetes 
de 100, 3 -> 20 , 6 moedas de 1 -> visualizaríamos 266 € ).*/
package boletin3_3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        int billetes100, billetes20, billetes5, monedas1, total;
        
        System.out.println("Introduce la cantidad de billetes de 100€ que vas a ingresar: ");
        Scanner bill = new Scanner(System.in);
        billetes100 = bill.nextInt();
        
        System.out.println("Introduce la cantidad de billetes de 20€ que vas a ingresar: ");
        
        billetes20 = bill.nextInt();
        
        System.out.println("Introduce la cantidad de billetes de 5€ que vas a ingresar: ");
        
        billetes5 = bill.nextInt();
        
        System.out.println("Introduce la cantidad de monedas de 1€ que vas a ingresar: ");
        
        monedas1 = bill.nextInt();
        
        total = ((billetes100*100) + (billetes20*20) + (billetes5*5) + monedas1);
        
        System.out.println("La suma total ingresada es: "+total+" euros");
    }
    
}
