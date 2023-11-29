
package boletin9_3;

import javax.swing.JOptionPane;


public class LeerDatos{
    
    public static int leerEntero(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static float leerFloatPositivo(String mensaxe){
        float dato;
    
        do {
           dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        }while(dato <=0);
        return dato;
    }
}
