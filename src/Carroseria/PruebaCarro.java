package Carroseria;
import java.util.Arrays;

public class PruebaCarro {

    public static void main(String[]args){

        Carro[]configuracion = new Carro[8];

        configuracion[0] = new Carro("Nisaan Altima", "Motor v6", 720500, "1992");
        configuracion[1] = new Carro("Nisaan Maxima", "Motor v6", 820500, "1981");
        configuracion[2] = new Carro("Nisaan Sentra", "1.6 cc", 689100, "1982");
        configuracion[3] = new Carro("Nisaa Rogue", "4 cilindros", 920500, "2007");
        configuracion[4] = new Carro("Nisaa Murano", "Motor v6", 791888, "2002");
        configuracion[5] = new Carro("Nisaa Pathfinder", "Motor v6", 934750, "1996");
        configuracion[6] = new NewModelo("Nissan Armada", "Motor V8", 1508000, "2003");
        configuracion[7] = new NewModelo("Nissan 370z", "V6", 2500800, "2009 ");

        for(int s = 0; s<configuracion.length; s++){

            configuracion[s].configuraCosto(0.50);
        }

        for(int x = 0; x<configuracion.length; x++){

            configuracion[x].configuraRuedas(4);
            configuracion[x].configuraPuertas(2);
        }
        
        NewModelo refundicion = (NewModelo)configuracion[7];
        System.out.println(refundicion.inforDescripcion("Vehiculos de alta Calidad"));

        System.out.println("Tiene un Bono de: " + refundicion.BonoTrabajo(300));
        
        

        Arrays.sort(configuracion);

        for(int i = 0; i<configuracion.length; i++){

            System.out.println(" id: " + configuracion[i].dameID() + " Nombre: " + configuracion[i].dameNombreCarro() + 
            " Motor: " + configuracion[i].dameMotorCarro() +  configuracion[i].Entrada() + " Costo: " + configuracion[i].dameCostoCarro() + 
            " lanzamiento: " + configuracion[i].dameAÑOlanzamiento());

        }

    }
    
}
