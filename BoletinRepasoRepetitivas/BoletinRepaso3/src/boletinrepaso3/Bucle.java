package boletinrepaso3;

import javax.swing.JOptionPane;

public class Bucle {
    public void hacerBucle(){
        int num;
        int i=0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            System.out.println(num);
            i++;
            if (num==0)
                break;
        } while(i<5);
    }
}
