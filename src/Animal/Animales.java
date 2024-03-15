package Animal;
abstract public class Animales implements contexto {
    

    public static int IdSiguiente = 1;
    public int id;
    private String Nombre;
    private String especie;
    private int cantidad;
   

    public Animales(String Nombre, String especie, int cantidad){
        
        id = IdSiguiente;
        IdSiguiente++;
        this.Nombre = Nombre;
        this.especie = especie;
        this.cantidad = cantidad;
        

    }

    public int dameID(){

        return id;
    }

    public String dameNombre(){

        return Nombre;
    }

    public String dameEspecie(){

        return especie;
    }

    public int dameCantidad(){

        return cantidad;
    }

    public abstract String Precio();

    public String Descripcion(String redaccion){

        return "DESCRIPCION DEL PARQUE: " + redaccion;
    }

    
    
}
