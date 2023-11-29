package boletinrepaso4;

public class Bucle {
    public void hacerBucle(){
        int num;
        int i=0;
        do{
            num = LeerDatos.leerIntPositivo("Introduce un número positivo: ");
            System.out.println(num);
            i++;
        } while(i<4);
    }
}
