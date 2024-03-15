package TiendaDeRopa;

abstract public class InfoTienda implements infoDescripcion {

    private String nombre_organizacion;
    private String ubicacion;
    private int atuendos_disponibles;
    private int tallas_disponibles;
    private boolean servicioPremium;

    public InfoTienda(){

        nombre_organizacion = "Ropa valle grande";
        ubicacion = "cali colombia";

    }

    public String nameOrganizacion(){

        return nombre_organizacion;
    }

    public String nameUbicacion(){

        return ubicacion;
    }


    public void atuendos(int vestimenta){

        switch(vestimenta){

            case 1: atuendos_disponibles = 1; break;
            case 2: atuendos_disponibles = 2; break;
            case 3: atuendos_disponibles = 3; break;
            case 4: atuendos_disponibles = 4; break;
            case 5: atuendos_disponibles = 5; break;
            
        }

    }

    public String RopaDisponible(){

        if(atuendos_disponibles == 1){

            return "Camisas";

        }else if(atuendos_disponibles == 2){

            return "Pantalones";

        }else if(atuendos_disponibles == 3){

            return "Zapatos";

        }else if(atuendos_disponibles == 4){

            return "Busos";

        }else if(atuendos_disponibles == 5){

            return "medias";

        }else{

            return "obsion no valida";
        }
    }

    public void tallasAtuendos(int tallas){

        switch(tallas){

            case 1: tallas_disponibles = 1; break;
            case 2: tallas_disponibles = 2; break;
            case 3: tallas_disponibles = 3; break;
            case 4: tallas_disponibles = 4; break;
            case 5: tallas_disponibles = 5; break;
        }


    }

    public String tallasMarca(){

        if(tallas_disponibles == 1){

            return "Talla XS";

        }else if(tallas_disponibles == 2){

            return "Talla S";

        }else if(tallas_disponibles == 3){

            return "Talla M";

        }else if(tallas_disponibles == 4){

            return "Talla L";

        }else if(tallas_disponibles == 5){

            return "Talla XL";

        }else{

            return "opcion no valida";
        }
    }

    public void dameServicioPremium(String premium){

        if(premium.equalsIgnoreCase("si")){

            servicioPremium = true;

        }else{

            servicioPremium = false;
        }

    }

    public String premiumServicio(){

        if(servicioPremium == true){

            return "Quiero el servicio premium Gracias";

        }else{

            return "No quiero el servicio premium, Gracias";
        }
    }

    public abstract String fechaProducto(String fecha);

}
