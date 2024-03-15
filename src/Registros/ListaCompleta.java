package Registros;
public class ListaCompleta {
    
    public int pais;
    public boolean Extranjero;


    public void TuCondicionExtranjero(String salud){

        if(salud.equalsIgnoreCase("si")){

            Extranjero = true;

        }else{

            Extranjero = false;
        }
    }

    public String dameUbicacion(){

        if(Extranjero == true){

            return "Soy extranjero";

        }else{

            return "no soy extranjero";
        }


    }

    public void ListaPaises(int listaP){
        
        switch(listaP){

            case 1: pais = 1; break;
            case 2: pais = 2; break;
            case 3: pais = 3; break;
            case 4: pais = 4; break;
            case 5: pais = 5; break;
        }
    }

    public String damePais(){

        if(pais == 1){

            return "Pais actual: Colombia";
        }
        if(pais == 2){

            return "Pais actua: Chile";
        }
        if(pais == 3){

            return "Pais actual: Argentina";
        }
        if(pais == 4){

            return "Pais actual: Venezula";
        }
        if(pais == 5){

            return "Pais actual: Brasil";
        }
        else{
            return "opcion no valida";
        }
    }
    
}
