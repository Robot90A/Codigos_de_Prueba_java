package Restaurante;

public class Platos extends Servicios implements Comparable, PrecioEntrada {
    
    private int id;
    private static int idSiguiente = 1;
    private String plato;
    private double precio;
    private int mesa;
    private int Nota_plato;

    public Platos(String plato, double precio, int mesa, int Nota_plato){

        id = idSiguiente;
        idSiguiente++;
        this.plato = plato;
        this.precio = precio;
        this.mesa = mesa;
        this.Nota_plato = Nota_plato;

    }

    public int dameID(){

        return id;
    }

    public String damePlato(){

        return plato;
    }

    public double damePrecio(){

        return precio;
    }

    public int dameMesas(){

        return mesa;
    }

    public void costoDelPlato(double costo){

        double porcentaje = costo * 100;
        precio = precio + porcentaje;
    }

    public String PuntuacionPLatillo(){

        return " la puntuacion de la comida es de: " + Nota_plato;
        
    }

    public int compareTo(Object miObject){

        Platos configuracion = (Platos)miObject;
        if(dameID() < configuracion.dameID()){

            return 1;
        }
        if(dameID() > configuracion.dameID()){

            return -1;
        }

        return 0;

    }

    public String detalle(String contexto){

        return "Descripcion: " + contexto;
    }

    public double costoTotal(double cantidad){

        return PrecioEntrada.costoEntradas + cantidad;
    }

 
}
