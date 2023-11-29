package boletin16;

public class Boletin16 {

    public static void main(String[] args) {
        Libros l1 = new Libros("si","456a","Pulgarcito","1990");
        Revistas r1 = new Revistas(5,"458d", "El jueves", "2003");
        
        System.out.println(l1.toString());
        System.out.println(r1.toString());
    }
    
}
