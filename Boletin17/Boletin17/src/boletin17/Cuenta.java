package boletin17;

public class Cuenta {
    private long nCuenta;
    private double saldo;
    private Persona cliente = new Persona();
    
    public Cuenta(long nCuenta, double saldo, Persona cliente){
        this.nCuenta = nCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public Cuenta(){}
    
    public long getnCuenta(){
        return nCuenta;
    }
    public void setNCuenta(long nCuenta){
        this.nCuenta = nCuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public Persona getCliente(){
        return cliente;
    }
    public void setCliente(Persona cliente){
        this.cliente = cliente;
    }
    
    public void ingresar(double ingreso){
        this.saldo += ingreso;
    }
    
    public void retirar(double retirada){
        this.saldo -= retirada;
    }
    
    public void actualizarSaldo(){
        System.out.println("El saldo es: "+ getSaldo());
    }
    
    @Override
    public String toString(){
        return "Conta{" + "numeroConta=" + nCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
}
