
package boletin9_4;

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
    
    public static int leerEntero1al10(String mensaxe){
        int num=1;
        do{
           num = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        }while(num<=10);
        return num;
    }
}
