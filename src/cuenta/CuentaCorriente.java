package cuenta;

public class CuentaCorriente extends Cuenta
{
    private double interesFijo;

    public CuentaCorriente(Persona cliente, long numeroCuenta)
    {
        super(cliente, numeroCuenta);
    }

    public double calcularInteres()
    {
        interesFijo = 1.5;
        return (getSaldo() * interesFijo) / 100;
    }

    @Override
    public void retirar(double cantidad)
    {}

    @Override
    public void actualizarSaldo()
    {
        double interes = calcularInteres();
        ingresarDinero(interes);
    }

    public String toString()
    {
        return Main.sepLinesLong +
                "Cuenta Corriente\n - Numero de Cuenta: " + getNumeroCuenta()
                + "\n - Saldo: " + getSaldo()
                + "\n - Cliente: " + getCliente()
                + "\n - Interes Fijo: " + interesFijo + "\n" +
                Main.sepLinesLong;
    }
}
