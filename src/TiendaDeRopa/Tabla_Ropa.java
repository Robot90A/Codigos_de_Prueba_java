package TiendaDeRopa;
import java.util.Arrays;

public class Tabla_Ropa {

    public static void main(String[]args){

        Ropa[] Teclado = new Ropa[8];

        Teclado[0] = new Ropa("Camisa", "XL", 45000);
        Teclado[1] = new Ropa("Medias", "S", 10000);
        Teclado[2] = new Ropa("Buso", "L", 60000);
        Teclado[3] = new Ropa("Camisa", "M", 30000);
        Teclado[4] = new Ropa("Zapatos", "40", 80000);
        Teclado[5] = new Ropa("Pantalon", "XL", 70000);
        Teclado[6] = new Ropa("medias", "XS", 15000);
        Teclado[7] = new NewTablaRopa("Camisa", "XL", 60000, 30);
        

        NewTablaRopa refundicion = (NewTablaRopa)Teclado[7];
        

        System.out.println(Teclado[0].Descripcion("almacen de ropa con todo lo que puedas soñar"));
        System.out.println("Precio de entrada: " + Teclado[0].valorPrecio(5000) + " $");

        for(int x = 0; x<Teclado.length; x++){

            Teclado[x].ValorExtra(0.50);

        }

        Arrays.sort(Teclado);

        for(int i = 0; i<Teclado.length; i++){

            System.out.println("id: " + Teclado[i].dameID() + " Nombre: " + Teclado[i].dameNombre() + 
            " Talla " + Teclado[i].dameTalla() + " Precio: " + Teclado[i].damePrecio() + 
            Teclado[i].fechaProducto(null));

        }

    }
    
}
