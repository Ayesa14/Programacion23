package boletin14;

import com.ayesa.partes.Monitor;
import com.ayesa.partes.Procesador;
import com.ayesa.partes.Teclado;

public class Main {
    public static void main(String[] args){
        Monitor objMo = new Monitor(12.3f);
        
        Ordenador objPc = new Ordenador(objMo, new Teclado("Newskill"), new Procesador(480), 1890.5f);
        
        System.out.println(objPc.toString());
        System.out.println("Precio= "+objPc.getPrecio());
        System.out.println(objPc.getTe());
        System.out.println(objPc.getPro());
    }
}
