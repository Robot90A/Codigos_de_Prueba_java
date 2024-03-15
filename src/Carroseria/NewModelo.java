package Carroseria;

public class NewModelo extends Carro implements descripcion{

    
    public NewModelo(String NombreCarro, String MotorCarro, double costoCarro, String añoLanzamiento){

        super(NombreCarro, MotorCarro, costoCarro, añoLanzamiento);
    }

    public String inforDescripcion( String Letra){

        return "Descripcion: " + Letra;
    }

    public double BonoTrabajo(double porcentaje){

        double Bono = 1000;

        return incentivo.valorConstante + Bono + porcentaje;

    }

}
