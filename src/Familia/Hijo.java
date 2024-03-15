package Familia;
public class Hijo extends Padre implements Comparable {

    private double salarioHijo;
    private String vicicleta;

    public Hijo(String camioneta, String moto, int negocios, double salarioPadre, String vicicleta, double salarioHijo){
        
        super(camioneta, moto, negocios, salarioPadre);
        this.vicicleta = vicicleta;
        this.salarioHijo = salarioHijo;

    }

    public String dimeVicicleta(){

        return this.vicicleta;
    }

    public double dameSalariohijo(){

        return this.salarioHijo;
    }

    public void salarioDelHijo(double decimal){

        double RE = decimal * 100;
        salarioHijo = salarioHijo + RE;

    }

 
}
