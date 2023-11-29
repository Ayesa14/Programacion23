package boletin14;

import com.ayesa.partes.Monitor;
import com.ayesa.partes.Procesador;
import com.ayesa.partes.Teclado;

public class Ordenador {
    private Monitor mo;
    private Teclado te;
    private Procesador pro;
    private float precio;
    
public Ordenador(Monitor mo, Teclado te, Procesador pro, float precio){
    this.mo=mo;
    this.te=te;
    this.pro=pro;
    this.precio=precio;
}
public Ordenador(){}

public void setPrecio(float precio){
    this.precio=precio;
}
public float getPrecio(){
    return precio;
}

public void setMo(Monitor mo){
    this.mo=mo;
}
public Monitor getMo(){
    return mo;
}

public void setTe(Teclado te){
    this.te=te;
}
public Teclado getTe(){
    return te;
}

public void setPro(Procesador pro){
    this.pro=pro;
}
public Procesador getPro(){
    return pro;
}

    @Override
    public String toString(){
        return "Ordenador{" + "precio="+precio+", " +mo+", " +te+ ", " +pro+'}';
    
}


    
}
