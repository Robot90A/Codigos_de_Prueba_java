package Transporte;
public class Elicoptero extends Vehiculo_Volador {

    private int rotor;
    private double precioElicoptero;

    public Elicoptero(String nombreVehiculo, String color, int cantidadAlas, int cantidadRuedas){

        super(nombreVehiculo, color, cantidadAlas, cantidadRuedas);
        rotor = 1;
    }

    public int dameRotor(){

        return rotor;
    }

    public void PrecioElicop( double definaPrecioElicop){

        precioElicoptero = definaPrecioElicop;
    }

    public void damePrecioElicoptero(double cantidad){

        double precio = cantidad * 100;
        precioElicoptero = precioElicoptero + precio;
    }

    public String dameCostoVehiculo(){

        return "su modelo es: " + this.dameNombre() + " de color " + dameColor() + 
        " con " + dameCantidadRuedas() + " Ruedas desplegables " + "Con un precio total de: " +
        precioElicoptero;
    }

}
