package bolextra5_2;

import javax.swing.JOptionPane;

public class Vinicultores {
    public void alquilerUva(){
        
        char tipo = (JOptionPane.showInputDialog("Ingrese el tipo de la uva, A o B")).charAt(0);
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la uva, 1 o 2"));
        float precioA = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio uva tipoA"));
        float precioB = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio uva tipoB"));
       
        if ((tipo == 'A') && (tamaño == 1)){
            precioA += 0.20;
            System.out.println("El precio de la uva tipoA y tamaño1 es: "+precioA);
        }
        else if ((tipo == 'A') && (tamaño == 2)){
            precioA += 0.30;
            System.out.println("El precio de la uva tipoA y tamaño2 es: "+precioA);
        }
        else if ((tipo == 'B') && (tamaño == 1)){
            precioB += 0.30;
            System.out.println("El precio de la uva tipoB y tamaño1 es: "+precioB);
        }
        else if ((tipo == 'B') && (tamaño == 2)){
            precioB += 0.50;
            System.out.println("El precio de la uva tipoB y tamaño2 es: "+precioB);
        }
        else{
            System.out.println("Error");
        }
    }
}
