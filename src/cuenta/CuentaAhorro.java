package cuenta;

import javax.swing.*;

public class CuentaAhorro extends Cuenta
{
    private double interesVariable;
    private double saldoMinimo;

    public CuentaAhorro(Persona cliente, long numeroCuenta, double interesVariable)
    {
        super(cliente, numeroCuenta);
        this.interesVariable = interesVariable;
        this.saldoMinimo = 200;
    }

    public void cambiarInteresVariable(double nuevoInteres)
    {
        this.interesVariable = nuevoInteres;
    }

    public double calcularInteres()
    {
        return getSaldo() * (interesVariable / 100);
    }

    @Override
    public void retirar(double cantidad)
    {
        if (getSaldo() - cantidad >= saldoMinimo)
        {
            saldoMinimo -= cantidad;
            JOptionPane.showMessageDialog(null, Main.sepLinesLong + "Esta cantidad no puede quedar con menos de lo necesario en su cuenta.\n" + Main.sepLinesLong);
            retirar(cantidad);
        }
    }

    @Override
    public void actualizarSaldo()
    {
        double interes = calcularInteres();
        ingresarDinero(interes);
    }

    public String toString()
    {
        return Main.sepLinesLong +
                "Cuenta Ahorro\n - Numero de Cuenta: " + getNumeroCuenta()
                + "\n - Saldo: " + getSaldo()
                + "\n - Cliente: " + getCliente()
                + "\n - Interes Variable: " + interesVariable
                + "\n - Saldo Minimo: " + saldoMinimo + "\n"
                + Main.sepLinesLong;
    }
}
