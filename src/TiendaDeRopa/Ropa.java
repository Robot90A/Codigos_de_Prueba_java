package TiendaDeRopa;
import java.util.Date;

public class Ropa extends InfoTienda implements Comparable, Entradas {
    
    private int id;
    private static int idSiguiente = 1;
    private String nombre;
    private String Talla;
    private double precio;

    Date Hora = new Date();

    public Ropa(String nombre, String Talla, double precio){
        
        id = idSiguiente;
        idSiguiente++;
        this.nombre = nombre;
        this.Talla = Talla;
        this.precio = precio;

    }

    public int dameID(){

        return id;
    }

    public String dameNombre(){

        return nombre;
    }

    public String dameTalla(){

        return Talla;
    }

    public double damePrecio(){

        return precio;
    }

    public void ValorExtra(double porcentaje){

        double variable = porcentaje * 100;
        precio = precio + variable;

    }
    
    public String fechaProducto(String fecha){

        return " Hora: " + Hora;
    }

    public int compareTo(Object miObject){

        Ropa Orden = (Ropa)miObject;

        if(dameID() < Orden.dameID()){

            return -1;

        }
        if(dameID() > Orden.dameID()){

            return 1;
        }
        
        return 0;

    }

    public String Descripcion(String contexto){

        return "Reseña: " + contexto;
    }

    public double valorPrecio(int aumento){

        return Entradas.cantidad + aumento;
    }
    
}
