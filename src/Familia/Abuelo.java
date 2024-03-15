package Familia;
abstract public class Abuelo implements DescripcionFamilia {

    private String terreno;
    private int vehiculo;
    private double salario;
    private int casa;

    public Abuelo(){

        terreno = "Granja";
        casa = 1;

    }

    public void dineroSalario(double salario){

        this.salario = salario;
    }

    public double dameSalario(){

        return this.salario;
    }

    public String dameTerrero(){

        return terreno;
    }

    public void canVehuculo(int vehiculo){

        this.vehiculo = vehiculo;

    }
    public String dameCanVehiculo(){

        return "Vehiculo: " + this.vehiculo;
    }

   public abstract double dameDinero();

    public void cansalario(double totalSalario){

        double dineroSalari = totalSalario * 100;
        salario = salario + dineroSalari;

    }

    public int dameCASA(){

        return casa;
    }

    


    
}
