## Boletin 6

# Boletin6_1
    Temos a seguinte clase Coche:

    public class Coche {
        private int velocidade ;

        public Coche(){
        velocidade =0 ;
    }

    Engade a clase Coche os seguintes métodos :

    public int getVelocidade() . Este método devolve a velocidade actual

    public void acelerar (int valor) .Este método incrementa a velocidade na cantidade valor

    public void frenar (int menos).Este método diminue a velocidade na cantidade menos.

    Crea a clase Boletin 6_1 para comprobar que o programa se executa ben .dandolle os valores que precises.

# Boletin 6_2

    A seguinte clase ten problemas de compilación . Corríxeos e ,de seguido, implementa unha clase principal ( Boletin 6₂ ), co metodo main() para testear e verificar os métodos da clase Satelite.

    public class Satelite ( )   {

        private double meridiano ;
        private double paralelo
        private double distanciaTerra ;

    public Satelite ( ) {

    meridiano = paralelo = distanciaTerra = 0
    }

    public Satelite ( double m; double p ; double d ) ; {

    meridiano = m ;
    paralelo = p;
    distanciaTerra = d ;

    }
    public void verPosicion ( ) {

    System.out.println (“ o satelite atopase  no paralelo “ paralelo + “meridiano ” + meridiano “ a unha distancia da terra “ +“ distanciaTerra )


# Boletin 6_3

    Implementa unha aplicación que nos permita traballar con circulos e circunferencias .Para eso crea a clase Circulo cas seguintes características :

    atributos : radio ( tipo double )
    Pi ( constante de tipo double e valor 3.14 )

    métodos : *   constructores, sen e con parámetros
                    *  métodos de acceso
                    *   calcularArea : Non recibe nada e devolve o valor da área . Para calcular radio ^ 2 utiliza a clase Math e o método pow (….)
                    *  calcularLonxitude : Non recibe nada e devolve o valor da lonxitude da circunferencias

        Crea unha clase principal para comprobar que todo funciona ben
