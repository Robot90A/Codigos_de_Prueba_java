package Familia;
public class Tio extends Abuelo {

    private String negociosTio;
    private int apartamento;
    private String carro;

    public Tio(){

        negociosTio = "Puesto de reparacion";
        carro = "Bentley";

    }

    public void canApartamento(int apartamento){

        this.apartamento = apartamento;

    }
    public String dimeApartamemto(){

        return "Apartamento: " + this.apartamento;
    }

    public String dimeCanCarro(){

        return carro;
    }
    public String dimeNegocios(){

        return negociosTio;
    }

    public double dameDinero(){

        return dameSalario();
    }

    public String reseña(String contexto){

        return "Hermano del padre " + contexto;
    }
    
}
