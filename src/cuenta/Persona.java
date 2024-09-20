package cuenta;

public class Persona
{
    String nombre;
    String apellidos;
    int nIF;

    Persona(String n, String a, int nif)
    {
        nombre = n;
        apellidos = a;
        nIF = nif;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public int getnIF()
    {
        return nIF;
    }

    public String toString()
    {
        return "\n==================================================" +
                "\nPersona" +
                "\n - Nombre: " + nombre
                + "\n - Apellidos: " + apellidos
                + "\n - NIF: " + nIF +
                "\n==================================================";
    }

}
