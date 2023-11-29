package boletin9_1;

import javax.swing.JOptionPane;

public class LeerDatos {
     public static int lerEnteiro(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
}
