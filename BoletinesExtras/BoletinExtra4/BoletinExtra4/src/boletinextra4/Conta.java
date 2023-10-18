package boletinextra4;

public class Conta {
    //declaro atributos
    private String nomeCliente, numConta;
    private double tipoInteres, saldo;
    
    //constructor por defecto
    public Conta(){
    }
    //constructor con parámetros
    public Conta(String nomC, String numC, double tipI, double sal){
        nomeCliente = nomC;
        numConta = numC;
        tipoInteres = tipI;
        saldo = sal;
    }
    
    //getter y setter
    public void setNomeCliente(String nomC){
        nomeCliente = nomC;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public void setNumConta(String numC){
        numConta = numC;
    }
    public String getNumConta(){
        return numConta;
    }
    
    public void setTipoInteres(double tipI){
        tipoInteres = tipI;
    }
    public double getTipoInteres(){
        return tipoInteres;
    }
    
    public void setSaldo(double sal){
        saldo = sal;
    }
    public double getSaldo(){
        return saldo;
    }
    
    //metodo ingreso
    public boolean ingreso(double n){
        boolean ingresoC = true;
        if (n < 0) {
            ingresoC = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoC;
    }
    
    //método reintegro
    public boolean reintegro(double n){
        boolean reintegroC = true;
        if (n < 0) {
            reintegroC = false;
        } else if (saldo >= 0) {
            saldo -= n;
        } else {
            reintegroC = false;
        }
        return reintegroC;
    }
    
    //método transferencia
    public boolean transferencia(Conta c, double n){
        boolean transC = true;
        if (n < 0) {
            transC= false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            transC = false;
        }
        return transC;
    }
    
    public boolean transferencia2 (Conta conta1, Conta conta2, double n){
        double saldoConta1 = conta1.getSaldo();
        double saldoConta2 = conta2.getSaldo();
        
        boolean trans2 = true;
        if (saldoConta1 > 0) {
            conta1.reintegro(n);
            conta2.ingreso(n);
        } else {
            trans2 = false;
        }
        return trans2;
    }
}
