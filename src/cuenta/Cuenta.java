package cuenta;

import javax.swing.*;

public abstract class Cuenta
{
    long numeroCuenta;
    double saldo;
    Persona cliente;

    Cuenta (Persona c, long nC)
    {
        numeroCuenta = nC;
        cliente = c;
        saldo = 0.0d;
    }

    public long getNumeroCuenta()
    {
        return numeroCuenta;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public Persona getCliente()
    {
        return cliente;
    }

    public void ingresarDinero(double cantidad)
    {
        if (cantidad != 0)
        {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, Main.sepLines + "Depositados $" + cantidad + " a su cuenta.\n" + Main.sepLines);
        }
        else
        {
            JOptionPane.showMessageDialog(null,  Main.sepLines + "Debe ingresar una cantidad valida.\n" + Main.sepLines);
        }
    }

    public abstract void retirar(double cantidad);

    public abstract void actualizarSaldo();
}
