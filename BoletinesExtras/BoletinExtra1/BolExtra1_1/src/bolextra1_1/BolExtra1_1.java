/*
Escribe un programa que escriba na pantalla o teu nome completo nunha liña, e na liña seguinte, a túa data de nacemento. 
 */
package bolextra1_1;

import java.util.Scanner;

public class BolExtra1_1 {

    
    public static void main(String[] args) {
        String nombre, dataNacimiento;
        
        Scanner objScanner = new Scanner (System.in);
        
        System.out.println("Introduce tu nombre: ");
        nombre = objScanner.next();
        
        System.out.println("Introduce tu fecha de nacimiento en formato DD/MM/AA: ");
        dataNacimiento = objScanner.next();
        
        System.out.println(nombre+"\n"+dataNacimiento);
        
        
    }
    
}
