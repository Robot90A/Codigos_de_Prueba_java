package Animal;
import java.util.Arrays;
public class TablaAnimales {

    public static void main(String[]args){

        newEspecies[] Tabla = new newEspecies[6];

        Tabla[0] = new newEspecies("León", "Panthera leo", 103, "Carnívoro", "Salvaje");
        Tabla[1] = new newEspecies("Vaca", "Bos taurus", 120, "Herbívoro", "Doméstico");
        Tabla[2] = new newEspecies("Elefante", "Loxodonta", 237, "Herbívoro", "Salvaje");
        Tabla[3] = new newEspecies("Perro", "Canis", 150, "Omnívoro", "Doméstico");
        Tabla[4] = new newEspecies("Tigre", "Panthera", 105, "Carnívoro", "Salvaje");
        Tabla[5] = new newEspecies("Conejo", "Oryctolagus", 95, "Herbívoro", "Doméstico");

        for(int x = 0; x<Tabla.length; x++){

            Tabla[x].damePrecio(0.50);
        }

        System.out.println(Tabla[0].Descripcion("un lugar amplio y hermoso para que vivan muchos animales"));
        System.out.println("EL COSTO DE ENTRADA ES DE: " + Tabla[0].precioEntradas(0.80));

        Arrays.sort(Tabla);

        for(int i = 0; i<Tabla.length; i++){

            System.out.println("id: " + Tabla[i].dameID() + " Nombre: " + Tabla[i].dameNombre() + " Especie: " + Tabla[i].dameEspecie() +
            " Cantidad: " + Tabla[i].dameCantidad() + " Dieta: " + Tabla[i].dameDieta() + " Estatus: " + 
            Tabla[i].dameEstatus() +  " Precio: " + Tabla[i].Precio());
        }

    }
    
}
