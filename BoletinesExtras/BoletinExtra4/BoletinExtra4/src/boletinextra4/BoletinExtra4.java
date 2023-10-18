package boletinextra4;

import java.util.Scanner;

public class BoletinExtra4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCliente, numConta;
        double tipoInteres, saldo;
        
        //intanciamos objeto conta1 sin parametros
        Conta conta1 = new Conta();
        
        System.out.println("---Ingresa los datos de la conta1---");
        System.out.println("Nombre: ");
        nomeCliente = sc.nextLine();
        System.out.println("Número de cuenta: ");
        numConta = sc.nextLine();
        System.out.println("Tipo de interes: ");
        tipoInteres = sc.nextDouble();
        System.out.println("Saldo: ");
        saldo = sc.nextDouble();
        
        conta1.setNomeCliente(nomeCliente);
        conta1.setNumConta(numConta);
        conta1.setTipoInteres(tipoInteres);
        conta1.setSaldo(saldo);
        
        //instanciamos objeto conta2 parametrizado
        Conta conta2 = new Conta("Perico Palotes","564645423425", 1.45, 500);
        
        System.out.println("\n---Datos Conta1---");
        System.out.println("Nombre del titular: "+conta1.getNomeCliente());
        System.out.println("Número de cuenta: "+conta1.getNumConta());
        System.out.println("Tipo de interés: "+conta1.getTipoInteres());
        System.out.println("Saldo: "+conta1.getSaldo());
        System.out.println("");
        
        //realizamos ingreso en conta1
        conta1.ingreso(750);
        
        //mostramos saldo tras el ingreso en conta1
        System.out.println("Saldo actual conta1 tras el ingreso: " +conta1.getSaldo());
        System.out.println("");
        
        System.out.println("---Datos Conta2---");
        System.out.println("Nombre del titular: "+conta2.getNomeCliente());
        System.out.println("Número de cuenta: "+conta2.getNumConta());
        System.out.println("Tipo de interés: "+conta2.getTipoInteres());
        System.out.println("Saldo: "+conta2.getSaldo());
        System.out.println("");
        
        //realizamos reintegro en conta2
        conta2.reintegro(300);
        
        //mostramos saldo tras el reintegro conta2
        System.out.println("Saldo actual conta2 tras el reintegro: "+conta2.getSaldo());
        System.out.println("");
        
        //realizamos trasnferencia de conta1 a conta2
        conta1.transferencia(conta2, 100);
        
        //mostramos saldos
        System.out.println("Saldo final(después de la transferencia) conta1: "+conta1.getSaldo());
        System.out.println("Saldo final(después de la transferencia) conta2: "+conta2.getSaldo());
        
        //realizamos transferencia2
        conta1.transferencia2(conta1, conta2, 500);
        
        //mostramos saldos
        System.out.println("\nSaldo final(después de la transferencia2) conta1: "+conta1.getSaldo());
        System.out.println("Saldo final(después de la transferencia2) conta2: "+conta2.getSaldo());
        
        
    }
    
}
