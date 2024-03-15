package Transporte;
public class avion extends Vehiculo_Volador{

    private double costoAvion;

    public avion(String nombreVehiculo, String color, int cantidadAlas, int cantidadRuedas, double costoAvion){

        super(nombreVehiculo, color, cantidadAlas, cantidadRuedas);
        this.costoAvion = costoAvion;

    }

    public void cantidadCosto( double valor){

        double decimas = valor * 100;
        costoAvion = costoAvion + decimas;

    }

    public String dameCostoVehiculo(){

        return "El costo del avion es: " + costoAvion;
    }
    
}
