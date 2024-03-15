package Empresa;
public class Jefes extends Empleado implements Comparable {
    
    private static int idSiguiente = 1;
    private int id;
    private String nombre_jefe;
    private double salario_Jefe ;
    private String Cargo_Jefe;

    public Jefes(String nombre_jefe,double salario_Jefe, String Cargo_Jefe){

        super();
        id = idSiguiente;
        idSiguiente++;
        this.salario_Jefe = salario_Jefe;
        this.Cargo_Jefe = Cargo_Jefe;
        this.nombre_jefe = nombre_jefe;
    }

    public int dameID(){

        return id;
    }

    public String nombreJEFE(){

        return nombre_jefe;
    }
    public String cargoJEFE(){

        return Cargo_Jefe;
    }

    public double dameSalariojefe(){

        return salario_Jefe;
    }

    public void porcentajeSalario(double porcentaje ){
      
        double porcentaje2 = porcentaje * 100;

        double total1 = porcentaje2 + salario_Jefe;

        salario_Jefe = total1;

    }

    public int compareTo(Object mIObject){

        Jefes dameList = (Jefes)mIObject;
        if(this.id < dameList.id){

            return -1;
        }
        if(this.id > dameList.id){

            return 1;
        }

        return 0;


    }

}
