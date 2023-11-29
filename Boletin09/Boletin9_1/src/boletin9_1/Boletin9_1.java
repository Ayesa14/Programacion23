/*
Calcular la cantidad de números positivos, negativos y ceros que hay en un grupo de 10 números enteros
 */
package boletin9_1;

public class Boletin9_1 {
 
    public static void main(String[] args) {
        int i=0;
        int positivos=0;
        int negativos=0;
        int ceros=0;

        while(i<10){
            float num = LeerDatos.lerEnteiro("Teclea numero");
            if(num==0){
                ceros++;
            }else if (num<0){
                negativos++;
            }else{
                positivos++;
            }
            i++;
        }
        System.out.println("Numero de ceros: "+ceros+"\nNumero de negativos: "+negativos+"\nNumeros positivos: "+positivos);
    }
}
    
    

