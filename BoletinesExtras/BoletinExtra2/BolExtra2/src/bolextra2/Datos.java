package bolextra2;

public class Datos {
    //declaro atributos
    private float n1, n2, suma, resta, producto, division, resultado;
    
    public Datos(){
        suma=0;
        resta=0;
        producto=0;
        division=0;
        resultado=0;
    }
    
    //métodos
    
    public void suma(float n1, float n2){
        resultado = n1 + (n2);
        System.out.println("El resultado de la suma es: "+resultado );
    }
    
    
    public void resta(float n1, float n2){
        resultado = n1 - (n2);
        System.out.println("El resultado de la resta es: "+resultado);
    }
    
    public void producto(float n1, float n2){
        resultado = n1 * (n2);
        System.out.println("El resultado del producto es: "+resultado);
    }
    
    public void division(float n1, float n2){
        resultado = n1 / (n2);
        System.out.println("El resultado de la división es: "+resultado);
    }
}
