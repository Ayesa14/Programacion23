/*
Realiza unha aplicación que nos calcule unha ecuación de segundo grao. 
Debes pedir as variables a, b e c por teclado e comprobar antes que o 
discriminante (operación na raíz cadrada). Para a raíz cadrada usa o método 
sqlrt de Math
 */
package bolextra3_2;

/*import java.util.Scanner;

public class BolExtra3_2 {

    public static void main(String[] args) {
        
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("Introduce las variables (a,b,c): ");
        double a = objScanner.nextFloat();
        double b = objScanner.nextFloat();
        double c = objScanner.nextFloat();
        
        Ecuacion objEc = new Ecuacion();
        
        objEc.ecuacion(a, b, c);
        
    }
    
}*/
public class BolExtra3_2 {

    public static void main(String[] args) {

        System.out.println("Bienvenido al programa de cálculo de ecuación de 2º GRADO\n"
                + "El programa realiza el cálculo de una ecuación de segundo grado para el que el usuario deben\n"
                + "introducir los datos necesarios.");

        int ejecutar = 0;
        boolean repetir=true, error=true;
        double a=0., b=0., c=0.;
        double resultado1=0., resultado2=0.;
        CEcuacion2Grado ecuacion = new CEcuacion2Grado();

        do{
            do{
                System.out.println("Introduzca valor para 'a'"); a=Menu.pedirNumero();
                System.out.println("Introduzca valor para 'b'"); b=Menu.pedirNumero();
                System.out.println("Introduzca valor para 'c'"); c=Menu.pedirNumero();
                try {
                    if (ecuacion.calcularDiscriminante(a, b, c) <=0 || ecuacion.comprobarDivisible(a) == 0) {
                        throw new ExcepcionNegativo("Operación no válida. La ecuación no tiene soluciones reales o no es cuadrática");
                    }else{
                        resultado1=ecuacion.calcularUnSigno(a, b, c);
                        resultado2=ecuacion.calcularOtroSigno(a, b, c);     
                        error=false;
                    }
                } catch (ExcepcionNegativo en) {
                    en.printStackTrace();
                    System.out.println("Introduzca otros números");
                }

            }while(error);

        System.out.printf("Los resultados de la operación son: %.2f %.2f ", resultado1, resultado2);

        if (ejecutar!=1) repetir = false;   
        }while(repetir);

        System.out.println("\n-----  Gracias por usar la aplicación  -----");
    }

}