/*
 Programa que dado un número te calcule suma, resta, multiplicación y división
 */
package bolextra2;

import java.util.Scanner;

public class BolExtra2 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
       
        System.out.println("Ingrese el primer número: ");
        float n1 = datos.nextFloat();
        
        System.out.println("Ingrese el segundo número: ");
        float n2 = datos.nextFloat();
        
        // instanciamos objeto datos
        
        Datos objDatos= new Datos();
        
        objDatos.suma(n1, n2);
        objDatos.resta(n1, n2);
        objDatos.producto(n1, n2);
        objDatos.division(n1, n2);
      
      
    
  

        
        
    }
    
}
