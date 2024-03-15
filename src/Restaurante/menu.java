package Restaurante;

import java.util.Arrays;
public class menu {

    public static void main (String[]args){
        
        Platos[] Lista = new Platos[5];
    
        Lista[0] = new Platos("Ajiaco santafereño", 53000, 4, 7);
        Lista[1] = new Platos("bandeja paisa", 20000, 1, 10);
        Lista[2] = new Platos("Sancocho de costilla",  29000, 3, 9);
        Lista[3] = new Platos("TAMAL SANTANDEREANO",  4500, 4, 07);
        Lista[4] = new Platos("Picada típica", 60000, 2, 6);
    
        for(int x = 0; x<Lista.length; x++){

            Lista[x].costoDelPlato(0.90);

        }

        System.out.println(Lista[0].detalle("Bienevenidos al restaurante x"));
        System.out.println("El Costo total de la entrada tien un valor de: " + Lista[0].costoTotal(0.50));
        

        Arrays.sort(Lista);

        for(int i = 0; i<Lista.length; i++){

            System.out.println("id: " + Lista[i].dameID() + " Plato: " + Lista[i].damePlato() + " Precio: " 
            + Lista[i].damePrecio() + " Mesa: " + Lista[i].dameMesas() + Lista[i].PuntuacionPLatillo());
        }

    }
    
}
