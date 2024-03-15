package Transporte;
public class usoVehiculo  {

    public static void main(String []args){

       System.out.println("-----------------------------------------------------------------------------");
        avion[] plane = new avion[3];

        plane[0] = new avion("Boein 747", "Negro", 2, 4, 200500);
        plane[1] = new avion("A380", "blanco", 2, 4, 231000);
        plane[2] = new avion(" F-16", "Blanco", 2, 4, 13560);

        for(int s = 0; s<plane.length; s++){

            plane[s].cantidadCosto(0.50);

        }

        for(int i = 0; i<plane.length; i++){

            System.out.println("Nombre: " + plane[i].dameNombre() + " Color: " + plane[i].dameColor() +
            " Cantidad de alas: " + plane[i].dameCantidadAlas() + " Cantidad de ruedas: " + plane[i].dameCantidadRuedas() +
            " Valor del avion: " + plane[i].dameCostoVehiculo());
        }
        
        System.out.println("----------------------------------------------------------------------------");
        Elicoptero[] Elicopter = new Elicoptero[4];

        Elicopter[0] = new Elicoptero("Boeing AH-64", "Negro", 0, 2);
        Elicopter[1] = new Elicoptero("Eurocoper EC135", "verde", 0, 2);
        Elicopter[2] = new Elicoptero("Bell 407", "Rojo", 0, 2);
        Elicopter[3] = new Elicoptero("Sikorsky UH-60", "Naranja", 0, 2);

        for(int z = 0; z<Elicopter.length; z++ ){
            
            Elicopter[z].PrecioElicop(205456);
            Elicopter[z].damePrecioElicoptero(0.20);

        }

        for(int x = 0; x<Elicopter.length; x++){

            System.out.println(Elicopter[x].dameCostoVehiculo());

        }

    }
    
}
