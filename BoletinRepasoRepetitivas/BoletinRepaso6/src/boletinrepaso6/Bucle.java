package boletinrepaso6;

import javax.swing.JOptionPane;

public class Bucle {
    public void hacerBucle(){
        float area;
        
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado: "));
        area=lado*lado;
        System.out.println("El área del cuadrado es: "+area);
        
    }
    
}
