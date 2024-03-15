package Carroseria;
abstract public class Vehiculos {

    private int peso;
    private int carga;
    private boolean definirpeso;
    private String pais_origen;
    private String nombreDueño;
    private String color;
    private String marca_coche;

    public Vehiculos(){

        marca_coche = "Nisaa";
        pais_origen = "Japon";
        peso = 1500;

    }
   
    public void configuraNombrePersona(String dueño){

        nombreDueño = dueño;
    }
    public String dameNombreDueño(){

        return nombreDueño;
    }

    public void configuraColor(String Colores){

        color = Colores;
    }
    public String dameColor(){

        return color;
    }

    public String damePaisOriegen(){

        return pais_origen;
    }
    public String dameMarcaCoche(){

        return marca_coche;
    }

    public void configuraCarga(String cargaPeso){

        if(cargaPeso.equalsIgnoreCase("si")){

            carga = 200;
            definirpeso = true;

        }else{

            carga = 0;
            definirpeso = false;
        }
    }

    public int dameCarga(){

        return carga;
    }

    public int damePeso(){

        if(definirpeso == true){

            int TotalPeso = carga + peso;
            return TotalPeso;
        }else{
            
            return peso;
        }
    }

    public abstract String Entrada();
    
}
