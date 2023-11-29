package boletin9_2;

public class Numeros {
    public void calcularSumProd(){
        int suma=0;
        double producto=1;
        int num=10;
        
        while (num <= 90){
            suma += num;
            producto *= num;
            num++;   
        }
        
        System.out.println("La suma es "+suma);
        System.out.println("El producto es "+producto);
    }
}
