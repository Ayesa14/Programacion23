package boletin4;

public class Boletin4 {

    public static void main(String[] args) {
        //instancio objeto tipo libro con constructor parametrizado
        Libro objLibro = new Libro("Asco", "Carolina Perrot", 2022, (short)100);
        
        objLibro.mostrar();
     
        
       //instancio objeto tipo libro con constructor por defecto
        Libro objLibro2 = new Libro();
        
        objLibro2.setTitulo("A historia de Parche");
        objLibro2.setAutor("Protectora os Biosbardos");
        objLibro2.setAño(2020);
        objLibro2.setNumPaginas((short)100);
        
        objLibro2.mostrar();
        
       
    }
    
}
