/*
Implementa unha clase consumo, que forma parte da centralita electrónica dun 
coche
 */
package boletin5;

public class Boletin5 {

    
    public static void main(String[] args) {
        Consumo objConsumo = new Consumo();
        objConsumo.setL(50.0);
        objConsumo.setPGas(1.57);
        
        Consumo objConsumo2 = new Consumo(200, 50.5, 100.0, 1.57);
        System.out.println(objConsumo2.consumoMedio());
        objConsumo2.setL(60.0);
        double vMed = objConsumo2.getMed();
        System.out.println("La velocidad media es: "+ vMed+ " km/h");
    }
    
}
