package boletinrepaso5;

public class Bucle {
    public void hacerBucle(){
        int num;
        int suma =0;
        
        for (int i=1; i<=4; i++) {
           num = LeerDatos.leerIntPositivo("Introduce un número positivo: "); 
           System.out.println(num);
           suma+=num;
        }
        System.out.println("La suma de los números es: "+suma);
                
    }
}
