package bolextra5_1;

import javax.swing.JOptionPane;

public class Cifras {
    public void cuantasCifras(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número comprendido entre 0 y 99999"));
        
        if (n >= 0 && n <= 99999){
            if (n <= 9)
                System.out.println("El número tiene una cifra");
            
            else if (n > 9 && n <= 99)
                System.out.println("El número tiene dos cifras");
            
            else if (n > 99 && n <= 999)
                System.out.println("El número tiene tres cifras");
            
            else if (n > 999 && n <=9999)
                System.out.println("El número tiene cuatro cifras");
            
            else if (n > 9999 && n<=99999)
                System.out.println("El número tiene cinco cifras");
            
            else
                System.out.println("Error");
        }   
        else
            System.out.println("El número no está dentro del rango permitido");
            
        
        
    }
}
