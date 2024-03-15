package Empresa;
public class Empleado {

    private String nombre;
    private int edad;
    private String pais;
    private String cargo;
    private double salario;
    private int Area;
    private String Administracion;
    private String RegionEmpresa;
    
    public Empleado(){

        Administracion = "microsoft";
        RegionEmpresa = "Estados unidos";
        
    }

    public String dameAdministracion(){

        return "Nombre de la empresa: " + Administracion;
    }
    public String dameRegion(){

        return "Ubicacion de la empresa: " + RegionEmpresa;
    }

    public void configuraNombre(String nombre){

        this.nombre = nombre;
    }
    public String dameNombre(){

        return "Nombre: " + this.nombre;
    }
    public void configuraEdad(int edad){

        this.edad = edad;
    }
    public String dameEdad(){

        return "Edad: " + this.edad;
    }
    public void configuraPais(String pais){

        this.pais = pais;
    }
    public String damePais(){

        return "pais: " + this.pais;
    }
    public void configuraCargo(String cargo){

        this.cargo = cargo;
    }
    public String dameCargo(){

        return "Cargo: " + this.cargo;
    }

    public void configuraSector(int opcion){

        switch(opcion){

            case 1: Area = 1; break;
            case 2: Area = 2; break;
            case 3: Area = 3; break;
            case 4: Area = 4; break;
            case 5: Area = 5; break;
        }

    }

    public String dameArea(){

        if(Area == 1){

            return "Planta 1";

        }else if(Area == 2){

            return "Planta 2";

        }else if(Area == 3){

            return "Planta 3";

        }else if(Area == 4 ){

            return "Planta 4";

        }else if(Area == 5){

            return "Planta 5";

        }else{

            return "zona no registrada";
        }

    }

    public void configuraSalario(double salario){

        this.salario = salario;
    }

    public String dameSalario(){

        return "Salario: " + this.salario + " $";
    }

}
