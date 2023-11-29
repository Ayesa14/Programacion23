package boletin9_3;

public class Rectangulo {
    public void calcularArea(){
        
        
        float altura = LeerDatos.leerFloatPositivo("Teclea la altura, debe ser positiva: ");
        float base = LeerDatos.leerFloatPositivo("Teclea la base, debe ser positiva: ");
           
        System.out.println("El área es: "+(base * altura)/2);
    }
    
}
