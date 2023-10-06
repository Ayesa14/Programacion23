package boletin5;

public class Consumo {
    // declaro atributos
    private double km, l, vMed, pGas, tempo, consumoMedio, consumoEuros;
    
    //constructores
    public Consumo(){
    }
    
    public Consumo(double kilometros, double litros, double velocidadM, double precioG){
        km = kilometros;
        l = litros;
        vMed = velocidadM;
        pGas = precioG;
    }
    
    //getter y setter
    public void setKm(double kilometros){
        km = kilometros;
    }
    public double getKm(){
        return km;
    }
    
    public void setL(double litros){
        l = litros;
    }
    public double getL(){
        return l;
    }
    
    public void setMed(double velocidadM){
        vMed = velocidadM;
    }
    public double getMed(){
        return vMed;
    }
    
    public void setPGas(double precioG){
        pGas = precioG;
    }
    public double getPGas(){
        return pGas;
    }
    
    public String getTempo(){
        return "El tiempo transcurrido en el viaje ha sido: "+ (km/vMed);
    }
    
    //métodos
    public String consumoMedio(){  // en litro cada 100km
        return "El consumo medio en litros por cada 100 km es: "+ l*100/km+ " litros";
    }
    
    public String consumoEuros(){  // en euros cada 100km
        return "El consumo medio en euros por cada 100 km es: "+ l*100/pGas;
    }
    
    
}
