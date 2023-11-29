package com.ayesa.partes;

public class Procesador {
    private int velocidad;
    
    public Procesador(int velocidad){
        this.velocidad=velocidad;
    }
    public Procesador(){}
    
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    @Override
    public String toString(){
        return "Procesador{" + "velocidad=" + velocidad + '}';
    }
}
