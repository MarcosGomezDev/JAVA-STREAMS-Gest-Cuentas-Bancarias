
package modeloBancario;

/**
 * @author MGM39434796P
 */
public class CuentaCorriente extends Cuenta{
    protected final double interesFijo = 0.15;

    /**
     * Con este constructor lo primero que hara el programa es leer el arrary que
     * hay en el fichero y asi poder trabajr con ella.
     */
    public CuentaCorriente() {
    }

    public CuentaCorriente(int numeroDeCuenta, double saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }
    
    /**
     * Esta clase la utilizaremos en los metodos para ir guardando los cambios
     * dentro del array. 
     * @param s
     */
    @Override
    public void ingresar(double s) {
        saldo = saldo + s;
    }
    
    @Override
    public void retirar(double s) {
        if (saldo - s >= 0) saldo = saldo - s;
        else System.out.println("Operacion no realizada");
    }

    @Override
    public void actualizarSaldo(double s) {
        saldo = s;
    } 
}
