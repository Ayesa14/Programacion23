/*
 Imos escribir un programa que escriba en pantalla as notas da materia de 
“Programación”. Seguro que seguindo este blogue son magníficas. Na primeira liña
escribirase o nome da materia. Nas seguintes liñas escribiranse as notas dos 
dous parciais realizados, poñendo a nota de cada un en liñas distintas. Na 
última liña escribirase a nota final da materia. Lembra que o que sexa texto 
escríbese entre comiñas dobres e o que sexa número como un número (sen comiñas). 
 */
package bolextra1_2;

import java.util.Scanner;

public class BolExtra1_2 {

    public static void main(String[] args) {
        String materia;
        float nPrimerParcial, nSegundoParcial, nFinal;
        
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Introduce el nombre de la materia: ");
        materia = objScanner.next();
        
        System.out.println("Introduce la nota del primer parcial: ");
        nPrimerParcial = objScanner.nextFloat();
        
        System.out.println("Introduce la nota del segundo parcial: ");
        nSegundoParcial = objScanner.nextFloat();
        
        nFinal = (nPrimerParcial + nSegundoParcial) / 2;
        
        System.out.println("Nombre de la materia: "+materia+ "\nNota del primer parcial: "+nPrimerParcial+ "\nNota del segundo parcial: "+nSegundoParcial+ "\nNota final: "+nFinal);
        
        
       
    }
    
}
