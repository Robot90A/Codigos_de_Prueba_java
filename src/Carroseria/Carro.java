package Carroseria;
public class Carro extends Vehiculos implements Comparable {
    
    private static int IdSiguiente = 1;
    private int id;
    private String NombreCarro;
    private String MotorCarro;
    private double costoCarro;
    private String añoLanzamiento;
    private int CantidadRuedas;
    private int CantidadPuertas;

    public Carro(String NombreCarro, String MotorCarro, double costoCarro, String añoLanzamiento){
        
        id = IdSiguiente;
        IdSiguiente++;
        this.NombreCarro = NombreCarro;
        this.MotorCarro = MotorCarro;
        this.costoCarro = costoCarro;
        this.añoLanzamiento = añoLanzamiento;

    }

    public int dameID(){

        return id;
    }
    public String dameNombreCarro(){

        return NombreCarro;
    }
    public String dameMotorCarro(){

        return MotorCarro;
    }

    public String dameAÑOlanzamiento(){

        return añoLanzamiento;
    }

    public void configuraCosto(double valor){

        double variable = valor * 100;
        costoCarro = costoCarro + variable;
    }

    public double dameCostoCarro(){

        return costoCarro;
    }

    public void configuraRuedas(int canRuedas){

        CantidadRuedas = canRuedas;
    }
    public void configuraPuertas(int canPuertas){

        CantidadPuertas = canPuertas;
    }

    public String Entrada(){

        return " Cantidad de Puertas: " + CantidadPuertas + " Cantidad de Ruedas: " + CantidadRuedas;
    }

    public int compareTo(Object miObject){

        Carro Entrada = (Carro)miObject;
        if(this.dameID() < Entrada.dameID()){

            return -1;
        }
        if(this.dameID() > Entrada.dameID()){

            return 1;
        }

        return 0;

    }

    
}
