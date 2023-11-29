package boletin17;

public class Persona {
    private String nombre;
    private String apellidos;
    private String nif;
    
    public Persona(String nombre, String apellidos, String nif){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }
    
    public Persona(){}
    
    @Override
    public String toString(){
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }
}
