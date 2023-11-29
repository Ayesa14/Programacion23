package boletin16;

public class Revistas extends Publicacion{
    private int numRevista;
    
    public Revistas(int numRevista,String codigo, String titulo, String añoPublicacion){
        super(codigo,titulo,añoPublicacion);
        this.numRevista = numRevista;
    }
    
    public Revistas(){}
    
    public String toString(){
        return super.toString()+ "Revistas{" + "número de revista=" + numRevista + '}';
    }
}
