package Administracion;
public class Clientes {
    
    private static int IdSiguiente = 1;
    private int id;
    private String nombre;
    private String direccion;
    private String garantia;
    private int costo;

    public Clientes(String nombre, String direccion, int costo, String garantia){

        id = IdSiguiente;
        IdSiguiente++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.costo = costo;
        this.garantia = garantia;

    }

    public int dameID(){

        return id;
    }
    public String dameNombre(){

        return this.nombre;
    }
    public String dameDireccion(){

        return this.direccion;
    }
    public int dameCosto(){

        return this.costo;
    }
    public String dameGarantia(){

        return this.garantia;
    }


    
}
