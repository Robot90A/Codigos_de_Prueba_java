package Transporte;
abstract public class Vehiculo_Volador {
    

    private int cantidadAlas;
    private int cantidadRuedas;
    private String color;
    private String nombreVehiculo;

    public Vehiculo_Volador(String nombreVehiculo, String color, int cantidadAlas, int cantidadRuedas){

        this.nombreVehiculo = nombreVehiculo;
        this.color = color;
        this.cantidadAlas = cantidadAlas;
        this.cantidadRuedas = cantidadRuedas;

    }

    public String dameNombre(){

        return this.nombreVehiculo;
    }
    public String dameColor(){

        return this.color;
    }
    public int dameCantidadAlas(){

        return this.cantidadAlas;
    }
    public int dameCantidadRuedas(){

        return this.cantidadRuedas;
    }

    public abstract String dameCostoVehiculo();
    

}
