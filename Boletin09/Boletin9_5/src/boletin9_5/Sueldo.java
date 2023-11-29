
package boletin9_5;

import java.util.Scanner;


public class Sueldo {
    public static void calcularSueldo(){
        Scanner sc = new Scanner(System.in);
        int sueldo;
        int contador = 0;
        int contadorMenosMil =0;
        int porcentaje = 0;
        do {
            System.out.println("introduzca su sueldo");
            sueldo = sc.nextInt();
            if (sueldo >= 1000 && sueldo <= 1750){
                contador += 1;
            }
            if (sueldo < 1000){
                contadorMenosMil +=1;
            }
        }while (sueldo != 0);

        porcentaje = contadorMenosMil / ( contador + contadorMenosMil) *100;
        System.out.println("El número de trabajadores que ganan entre 1000 y 1750 es de: " + contador);
        System.out.println("El porcentaje de trabajadores que ganan menos de 1000 € es de: " + porcentaje +"%");
    }
}
