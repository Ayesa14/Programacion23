/*programa que representa un algoritmo, que reciba como dato de entrada o valor 
dunha temperatura expresada en graos centígrados e calcule o seu equivalente en 
graos Fahrenheit e graos Kelvin.*/
package boletin3_2;

import java.util.Scanner;

public class Boletin3_2 {

    public static void main(String[] args) {
       double celsius, fahr, kelv, convFahr, convKelv;
        
        System.out.println("Introduce los grados celsius a convertir: ");
        Scanner objCels = new Scanner(System.in);
        celsius = objCels.nextFloat();
        
        convFahr = (celsius * 9 / 5) + 32;
        convKelv = (celsius + 273.15);
        
        System.out.println(celsius+" grados celsius son "+convFahr+" grados Fahrenheit y "+convKelv+ " grados Kelvin" );
    }
}