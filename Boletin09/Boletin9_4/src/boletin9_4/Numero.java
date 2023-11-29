package boletin9_4;

public class Numero {
    public void pedirNumero(){
        
        int i=1;
        int num = LeerDatos.leerEntero("Teclea un número del 1 al 10: ");
        do {
           if (num>0 && num<=10)
           System.out.println(num+"*"+i+ " = "+(num*i));
           i++;

        }while(i<=10);
        if (num == 0)
                System.out.println("Se acabó el programa");       
    }
}
        

           

