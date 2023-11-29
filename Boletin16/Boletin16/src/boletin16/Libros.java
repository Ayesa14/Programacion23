package boletin16;

public class Libros extends Publicacion{
    private String prestado;
    
    public Libros(String prestado,String codigo, String titulo, String añoPublicacion){
        super(codigo, titulo, añoPublicacion);
        this.prestado = prestado;  
    }
    
    public Libros(){}
    
    public String toString(){
        return super.toString()+ "Libros{" + "prestado=" + prestado + '}';
    }
}
