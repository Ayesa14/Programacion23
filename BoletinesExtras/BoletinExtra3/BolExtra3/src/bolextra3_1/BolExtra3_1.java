/*Le un número por teclado que pida o prezo dun produto (pode ter decimais) e 
calcule o prezo final con IVE/IVE. O IVE/IVE sera unha constante que sera do 
21%. A saida será ou nome do produto e ou prezo final co IVE.*/
package bolextra3_1;

import java.util.Scanner;

public class BolExtra3_1 {

    public static void main(String[] args) {
         
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Introduce el precio del producto: ");
        double precio = objScanner.nextDouble();
        
        Iva objIva = new Iva();
        final double IVA=21;
  
        objIva.total(precio, IVA);
        
        
    }
    
}
