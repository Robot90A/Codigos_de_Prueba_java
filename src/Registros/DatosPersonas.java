package Registros;
abstract public class DatosPersonas {
    
    private int id;
    private static int idSiguiente = 1;
    private String nombre;
    private String apellido;
    private int edad;

    public DatosPersonas(String nombre, String apellido, int edad){
        
        id = idSiguiente;
        idSiguiente++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public int dameID(){

        return id;
    }

    public String dameNombre(){

        return nombre;
    }
    public String dameApellido(){

        return apellido;
    }
    public int dameEdad(){

        return edad;
    }

    public abstract int Ndocumento();

     
}
