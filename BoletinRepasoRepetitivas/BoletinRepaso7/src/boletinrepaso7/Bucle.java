package boletinrepaso7;

public class Bucle {
    public void hacerBucle(){
        float area;
        
        float lado = LeerDatos.leerFloatPositivo("Introduce el lado del cuadrado: ");
        area=lado*lado;
        System.out.println("El área del cuadrado es: "+area);
        
    }
    
}
