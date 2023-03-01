package modeloBancario;

/**
 * @author MGM39434796P
 */
public abstract class Cuenta {
    
    protected int numeroDeCuenta;
    protected double saldo;
    protected Cliente titular;
    
    public Cuenta(){
        numeroDeCuenta = 0;
        saldo = 0.0;
        titular = null;
    }
    
    public Cuenta(int numeroDeCuenta, double saldo, Cliente titular){
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void setNumeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    
    public Cliente getTitular(){
        return titular;
    }
    
    abstract public void ingresar(double s);
    
    abstract public void retirar(double s);
    
    abstract public void actualizarSaldo(double s);
}
