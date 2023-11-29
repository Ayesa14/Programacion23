package boletin12;

import javax.swing.JOptionPane;

public class Garaje {
    private int numCoches;
    private String matricula;
    private String marcaCoche;
    private float tiempo;
    private float dineroRecibido;
    private float dineroDevuelto;
    float precio = 0;
    
   
    public Garaje(){}
    
    public String getMatricula(){
        return matricula= JOptionPane.showInputDialog("Introduce la matrícula: ");
    }
    public float getTiempo(){
        return tiempo = Float.parseFloat(JOptionPane.showInputDialog("Introduce el tiempo: "));
    }
    public float getDineroRecibido(){
        return dineroRecibido= Float.parseFloat(JOptionPane.showInputDialog("Introduce el dinero ingresado: "));
    }
    public float getDineroDevuelto(){
        return dineroDevuelto=(dineroRecibido-precio);
    }
    
    public void comprobarPlazas(){
        int plazas = 0;
        do{
            System.out.println("Plazas disponibles");
            plazas++;}
        while(plazas<5);
        if (plazas==5)
            System.out.println("Completo");    
    }
    
    public double calcularPrecio(){ 
        if (tiempo<=3)
            precio=1.5f;
        else if (tiempo>3)
            precio= (float) (1.5+(tiempo-3)*0.20);
        return precio;
    }  
}
