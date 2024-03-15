package Emprendiemiento;

public class Empleados extends Empresa {
   
    private int id;
    private static int idSiguiente;
    private String nombre;
    private int edad;
    private String encargo;
    private double salario;
    private String contrato;
    

    public Empleados(String nombre, int edad, String encargo, double salario, String contrato){

        id = idSiguiente;
        idSiguiente++;
        this.nombre = nombre;
        this.edad = edad;
        this.encargo = encargo;
        this.salario = salario;
        this.contrato = contrato;

    }

    public int dameID(){

        return id;
    }
    public String dameNombre(){

        return nombre;
    }
    public int dameEdad(){

        return edad;
    }
    public String dameEncargo(){

        return encargo;
    }

    public double dameSalario(){

        return salario;
    }

    public void aumentoSalario(double porcentaje){

        double variable = porcentaje * 100;
        salario = salario + variable;
    }
    

    public String dameContrato(){

        return contrato;
    }

    public String valorContrato(){

        return "Contrato: " + contrato;

    }

   

   
    
    
}
