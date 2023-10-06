package bolextra3_1;

public class Iva {
    private double precio;
    final double IVA=21;
    
    
    public void total(double precio, double IVA){
        double total = precio + (precio * (IVA/100));
        
        System.out.println("El precio final con IVA es: "+total);
    }
}
