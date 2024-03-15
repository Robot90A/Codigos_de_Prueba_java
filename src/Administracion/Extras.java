package Administracion;
public class Extras extends Clientes {

    private String Ciudad;
    private int codigoPostal;

    public Extras(String nombre, String direccion, int costo, String garantia){

        super(nombre, direccion, costo, garantia);
    }

    public String dameCiudad(){

        return Ciudad;
    }
    public int dameCodePostal(){

        return codigoPostal;
    }
    
}
