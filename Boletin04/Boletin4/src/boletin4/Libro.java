package boletin4;

public class Libro {
    //declaro atributos
    private String titulo, autor;
    private int año;
    private short numPaginas;
    private float valoracion;
    
    //constructores
    public Libro (){
    }
    
    public Libro (String titul, String aut, int a, short numPag){
        titulo = titul;
        autor = aut;
        año = a;
        numPaginas = numPag;
    }
    
    //getter y setter
    public void setTitulo(String titul){
        titulo= titul;
    }
    public String getTitulo(){
        return titulo;
    }
    
    
    public void setAutor (String aut){
        autor = aut;
    }
    public String getAutor(){
        return autor;
    }
    
    
    public void setAño (int a){
        año = a;
    }
    public int getAño(){
        return año;
    }
    
    
    public void setNumPaginas (short numPag){
        numPaginas = numPag;
    }
    public short getNumPaginas(){
        return numPaginas;
    }
    
    
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }
    public float getValoracion(){
        return valoracion;
    }
    
    //métodos
    public void mostrar(){
        System.out.println("---Características---\nTítulo: "+titulo+"\nAutor: "+autor+"\nAño: "+año+"\nNúmero de páginas: "+numPaginas+"\nValoración: "+valoracion);
        
    }


    }