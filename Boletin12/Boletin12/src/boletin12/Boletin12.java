package boletin12;

public class Boletin12 {

    public static void main(String[] args) {
        Garaje obj = new Garaje();
        
        System.out.println("*** Factura ***");
        System.out.println("*Matrícula de coche: "+ obj.getMatricula());
        System.out.println("*Tiempo: "+ obj.getTiempo());
        System.out.println("*Precio: "+ obj.calcularPrecio());
        System.out.println("*Dinero recibido: "+ obj.getDineroRecibido());
        System.out.println("*Dinero devuelto: "+ obj.getDineroDevuelto());
        System.out.println("***Gracias por usar nuestro parking***");
        
        
    }
    
}
