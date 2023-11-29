
package boletinrepaso7;

import javax.swing.JOptionPane;


public class LeerDatos{
    
    public static int leerEntero(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static float leerFloatPositivo(String mensaxe){
        float dato;
    
        do {
           dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
           if (dato<=0){
               System.out.println("El número debe ser positivo");
           }
        }while(dato <=0);
        return dato;
    }
    
    public static int leerIntPositivo(String mensaxe){
        int dato;
    
        do {
           dato = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
           if (dato<=0){
               System.out.println("El número debe ser positivo");
           }
        }while(dato <=0);
        return dato;
    }
}
