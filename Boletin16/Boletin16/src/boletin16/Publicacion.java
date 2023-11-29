package boletin16;

public class Publicacion {
    private String codigo;
    private String titulo;
    private String añoPublicacion;
    
    public Publicacion(String codigo, String titulo, String añoPublicacion){
        super();
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }
    
    public Publicacion(){}
    
    public String getAñoPublicacion(){
        return añoPublicacion;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    @Override
    public String toString(){
        return "Publicación{" + "código=" + codigo + ", Título=" + titulo + ", Año de publicación=" + añoPublicacion + '}';
    }
}
