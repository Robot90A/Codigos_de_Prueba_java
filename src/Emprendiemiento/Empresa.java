package Emprendiemiento;

abstract public class Empresa {

    private String nombre_empresa;
    private String pais;
    private int cantidadEmpleados;
    private String criticaEmpresa;
    private boolean ImplementaEmpresa;
    private int instalaciones;
   

    public Empresa(){

        nombre_empresa = "umbrela_corporate";
        pais = "Colombia";
    }

    public String dameNombre_Empresa(){

        return nombre_empresa;
    }
    public String damePais(){

        return pais;
    }

    public void canEmpleados(int cantidadEmpleados){

        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String dameCantidadEmpleados(){

        return "numeros de Empleados: " + cantidadEmpleados;
    }

    public void criticaDelaEmpresa(String criticaEmpresa){

        this.criticaEmpresa = criticaEmpresa;
    }

    public String dameCriticaDelaEmpresa(){

        return "Critica: " + criticaEmpresa;
    }

    public void implementacion(String opinion){

        if(opinion.equalsIgnoreCase("si")){

            ImplementaEmpresa = true;

        }else{

            ImplementaEmpresa = false;
        }
    }

    public String dameImplementacion(){

        if(ImplementaEmpresa == true){

            return "me gustaria implementar cosas nuevas a la empresa";

        }else {

            return "me gustan las cosas como estan";
        }
    }

    public void areaEmpresa(int filas){

        switch(filas){

            case 1: instalaciones = 1;break;
            case 2: instalaciones = 2;break;
            case 3: instalaciones = 3;break;
            case 4: instalaciones = 4;break;
            case 5: instalaciones = 5;break;

        }
    }

    public String dameAreaEmpresa(){

        if(instalaciones == 1){

            return "Area 1";

        }else if(instalaciones == 2){

            return "Area 2";

        }else if(instalaciones == 3){

            return "Area 3";

        }else if(instalaciones == 4){

            return "Area 4";

        }else if(instalaciones == 5){

            return "Area 5";

        }else{

            return "opsion no valida";
        }
    }

    public abstract String valorContrato();

}
