package TiendaDeRopa;

public class NewTablaRopa extends Ropa {
    
    private int Cantidad;

    public NewTablaRopa(String nombre, String Talla, double precio, int Cantidad){

        super(nombre, Talla, precio);
        this.Cantidad = Cantidad;
    }

    public int CantidadDisponibles(){

        return Cantidad;
    }
    
}
