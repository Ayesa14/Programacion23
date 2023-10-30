package boletin8_6;

public class Almacen {
    public void ventas(int ventas){
        if (ventas <= 100){
            System.out.println("El consumo es bajo");
        }
        
        else if (ventas > 100 && ventas <= 500){
            System.out.println("El consumo es medio");
        }
        
        else if (ventas > 500 && ventas <= 1000){
            System.out.println("El consumo es alto");
        }
        
        else {
            System.out.println("Es un artículo de primera necesidad");
        }
    }
}