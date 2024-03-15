package Familia;
public class Padre extends Abuelo implements Comparable, BonoFamili {

    private String camioneta;
    private String moto;
    private int negocios;
    private double salarioPadre;

    public Padre(String camioneta, String moto, int negocios, double salarioPadre){

        this.camioneta = camioneta;
        this.moto = moto;
        this.negocios = negocios;
        this.salarioPadre = salarioPadre;

    }

    public String dameCanCamioneta(){

        return this.camioneta;

    }

    public String dameCanMoto(){

        return this.moto;
    }

    public int dameNegocios(){

        return this.negocios;
    }

    public void salariodelpadre(double dinero){

        double C = dinero * 100;
        salarioPadre = salarioPadre + C;


    }

    public double dameDinero(){

        return this.salarioPadre;

    }

    public int compareTo(Object miObject){

        Padre dameOcjeto = (Padre) miObject;
        if((this.salarioPadre < dameOcjeto.salarioPadre)){

            return -1;

        }
        if(this.salarioPadre > dameOcjeto.salarioPadre){

            return 1;
        }

        return 0;

    }

    public String reseña(String contexto){

        return "Descrpcion Familiar: " + contexto;
    }

    public double dineroFamilia(double valorDinero){

        return BonoFamili.BonoGanancias + valorDinero;

    }

   
    
}
