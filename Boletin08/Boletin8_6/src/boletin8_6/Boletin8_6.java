package boletin8_6;

import javax.swing.JOptionPane;

public class Boletin8_6 {

    public static void main(String[] args) {
        Almacen obj = new Almacen();
        System.out.println("---Control de consumo---");
        
        int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ventas realizadas del artículo: "));
    
        obj.ventas(ventas);
    } 
}
    
    

