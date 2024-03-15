package Emprendiemiento;

public class DatosTabla {

    public static void main(String[]args){

        Empleados[] Ejecucion = new Empleados[5];

        Ejecucion[0] = new Empleados("Sebastian", 21, "Programador", 950590, "Activo");
        Ejecucion[1] = new Empleados("Santiago", 25, "Programador", 750300, "Activo");
        Ejecucion[2] = new Empleados("Maria", 20, "Contabilidad", 850321, "Activo");
        Ejecucion[3] = new Empleados("MIchel", 29, "Contabilidad", 632100, "Activo");
        Ejecucion[4] = new Empleados("Luiz", 39, "Programador", 840834, "Activo");

        for(int x = 0; x<Ejecucion.length; x++){

            Ejecucion[x].aumentoSalario(0.50);
        }

        for(int i = 0; i<Ejecucion.length; i++){

            System.out.println("id: " + Ejecucion[i].dameID() + " Nombre: " + Ejecucion[i].dameNombre() +
            " Edad: " + Ejecucion[i].dameEdad() + " Encargo: " + Ejecucion[i].dameEncargo() + 
            " Salario: " + Ejecucion[i].dameSalario() + " Contrato: " + Ejecucion[i].valorContrato());
        }

    }
    
}
