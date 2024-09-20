package cuenta;

import javax.swing.*;

public class Main
{
    public static String sepLines = "========================================\n";
    public static String sepLinesLong = "==================================================\n";

    public static void main(String[] args)
    {
        menuPrincipal();
    }

    public static void menuPrincipal()
    {
        Persona clienteUno = new Persona("Omar" , "Hernandez", 1122101010);
        Persona clienteDos = new Persona("Valeria" , "Casas", 1123062128);

        double retiro;
        double ingreso;
        double interesVariable;
        int sw, sw2;
        boolean interesCambiado = false;

        sw = Integer.parseInt(JOptionPane.showInputDialog(null, sepLines + "Seleccione una cuenta\n1- Ahorro\n2-Corriente\n" + sepLines));
        switch (sw)
        {
            case 1:
                if (!interesCambiado)
                {
                    interesVariable = Double.parseDouble(JOptionPane.showInputDialog(null, sepLines + "Ingrese el interes\n" + sepLines));
                    CuentaAhorro cA = new CuentaAhorro(clienteDos, 602005500, interesVariable);
                    sw2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una operacion\n1- Ingresar dinero\n2- Retirar dinero\n3. Cambiar Interes"));
                    switch (sw2)
                    {
                        case 1:
                            ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, sepLines + "Digite una cantidad.\n" + sepLines));
                            cA.ingresarDinero(ingreso);
                            cA.actualizarSaldo();
                            JOptionPane.showMessageDialog(null, sepLines +
                                    "-= Informacion de la cuenta =-" +
                                    cA.toString());
                            menuPrincipal();
                            break;
                        case 2:
                            retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese una cantidad a retirar"));
                            cA.retirar(retiro);
                            cA.actualizarSaldo();
                            JOptionPane.showMessageDialog(null, sepLines +
                                    "-= Informacion de la cuenta =-" +
                                    cA.toString());
                            menuPrincipal();
                            break;
                        case 3:
                            interesVariable = Double.parseDouble(JOptionPane.showInputDialog(null, sepLines + "Ingrese el interes.\n" + sepLines));
                            
                            new CuentaAhorro(clienteDos, 602005500, interesVariable);
                            menuPrincipal();
                            break;
                    }
                    break;
                }
                else
                {

                }
            case 2:
                CuentaCorriente cC = new CuentaCorriente(clienteUno, 272003300);
                sw2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una operacion\n1- Ingresar dinero\n2- Retirar dinero"));
                switch (sw2)
                {
                    case 1:
                        ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una cantidad a ingresar"));
                        cC.ingresarDinero(ingreso);
                        cC.actualizarSaldo();
                        JOptionPane.showMessageDialog(null, sepLines +
                                "-= Informacion de la cuenta =-" +
                                cC.toString());
                        menuPrincipal();
                        break;
                    case 2:
                        retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese una cantidad a retirar"));
                        cC.retirar(retiro);
                        cC.actualizarSaldo();
                        JOptionPane.showMessageDialog(null, sepLines +
                                "-= Informacion de la cuenta =-" +
                                cC.toString());
                        menuPrincipal();
                        break;
                }
                break;
        }
    }
}
