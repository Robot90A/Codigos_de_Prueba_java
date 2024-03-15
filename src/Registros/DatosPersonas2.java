package Registros;
final public class DatosPersonas2 extends DatosPersonas implements Comparable{
    
    private int identificacion;
    private double salario;
    public DatosPersonas2(String nombre, String apellido, int edad, int identificacion, double salario){

        super(nombre, apellido, edad);
        this.identificacion = identificacion;
        this.salario = salario;
    }

    public double dameSalario(){

        return salario;
    }

    public void SalarioPersona(double porcentaje){

        double variable1 = porcentaje * 100;
        salario = salario + variable1;
    }

    public int Ndocumento(){

        return identificacion;
    }

    public int compareTo(Object miObject){

        DatosPersonas2 NewDaatosv1 = (DatosPersonas2)miObject;
        if(this.dameID() < NewDaatosv1.dameID()){

            return -1;
        }

        if(this.dameID() > NewDaatosv1.dameID()){

            return 1;
        }

        return 0;

    }
    
}
