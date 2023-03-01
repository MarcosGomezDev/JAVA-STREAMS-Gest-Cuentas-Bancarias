
package modeloBancario;

/**
 * @author MGM39434796P
 */
public class CuentaAhorro extends Cuenta{

    protected double interesVariable;
    protected double saldoMinimo;
    
    public CuentaAhorro() {
    }
    
    public CuentaAhorro (int numeroDeCuenta, double saldo, double saldoMinimo, Cliente titular, 
            double interesVariable){
        super(numeroDeCuenta, saldo, titular);
        this.interesVariable = 0.0;
        this.saldoMinimo = saldoMinimo;
    }

    public double getInteresVariable() {
        return interesVariable;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    
    @Override
    public void ingresar(double s) {
        saldo = saldo + s;
    }
    
    @Override
    public void retirar(double s) {
        if (saldo - s >= saldoMinimo) saldo = saldo - s;
        else System.out.println("Operacion no realizada");
    }

    @Override
    public void actualizarSaldo(double s) {
        saldo = s;
    } 
}
