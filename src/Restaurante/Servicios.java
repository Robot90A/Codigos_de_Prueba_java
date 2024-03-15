package Restaurante;

abstract public class Servicios implements Descripcion {

    private String Nombre_Restaurante;
    private String ubicacion;
    private int Cantidad_mesas;
    private boolean propina;
    

    public Servicios(){

        Nombre_Restaurante = "El rincon enchilado";
        ubicacion = "Calle 113 26 i-31 Cali Colombia";

    }

    public String dameNombre_Restaurant(){

        return Nombre_Restaurante;
    }
    public String dameUbicacion(){

        return ubicacion;
    }

    public void CantidadMesas(int mesas){

        switch(mesas){

            case 1: Cantidad_mesas = 1; break;
            case 2: Cantidad_mesas = 2; break;
            case 3: Cantidad_mesas = 3; break;
            case 4: Cantidad_mesas = 4; break;

        }
    }

    public String dameCantidadMesas(){

        if(Cantidad_mesas == 1){

            return "2 mesas";

        }else if(Cantidad_mesas == 2){

            return "4 mesas";

        }else if(Cantidad_mesas == 3){

            return "8 mesas";

        }else if(Cantidad_mesas == 4){

            return "12 mesas";

        }else {

            return "Cantidad invalidad";
        }

    }

    public void dameDesicion(String FV){

        if(FV.equalsIgnoreCase("si")){

            propina = true;

        }else{

            propina = false;
        }
    }

    public String damePropina(){

        if(propina == true ){

            return "Quiero dar una propina";

        }else{

            return "No quiero dar una propina";
        }
    }

    public abstract String PuntuacionPLatillo();

    

    

}
