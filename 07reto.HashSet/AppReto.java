import java.util.HashSet;

/*

Q1: ¿Por qué el orden de salida no coincide con el de inserción?
Q2: ¿Por qué no se encuentra a Ana?

*/

public class AppReto
{
    public static void main(String[] args)
    {
        HashSet<Persona> personas = new HashSet<Persona>();

        personas.add(new Persona("22222A", "Cristina", 33));  
        personas.add(new Persona("33333A", "Jaime", 22));
        personas.add(new Persona("11111A", "Ana", 27));        

        System.out.println(personas);

        System.out.println(personas.contains(new Persona("11111A", "Ana", 27)));
    }    
}

class Persona
{ 
    private String nif;
    private String nombre;
    private int edad;
    
    public Persona(String nif, String nombre, int edad) 
    {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String nif) 
    {
        this.nif = nif;
    }

    public String getNif()
    {
        return nif;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF: ")
          .append(nif)
          .append("\nNombre: ")
          .append(nombre)
          .append("\nEdad: ")
          .append(edad);
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj) //Upcasting, el objeto que recibe lo vemos como un Objeto
    {
        if(obj instanceof Persona p) //Si la instancia del objeto es una Persona...
            return nif.equals(p.getNif());
        else
            return false;
    }
}