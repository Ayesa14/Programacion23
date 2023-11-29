package boletinrepaso9;

public class Bucle {
    public void hacerBucle(){
        int suma=0;
        String numeroActual = "";
        int num = LeerDatos.leerEntero("Introduce un número: ");
        while(suma<100){
           
            suma+=num;
            numeroActual+= num+ " ";
            num = LeerDatos.leerEntero("Introduce un número: ");    
        }
        System.out.println("El listado de números introducidos es: \n"+numeroActual);
        System.out.println("La suma de los números es: "+suma);
        
        
    }
}
