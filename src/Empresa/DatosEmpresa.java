package Empresa;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class DatosEmpresa {

    public static void main(String[]args){

        System.out.println("Datos de los jefes\n");

        Jefes[]Teclado = new Jefes[6];

        Teclado[0] = new Jefes("Sebastian", 190000, "Administrador");
        Teclado[1] = new Jefes("luiz", 10000, "Administrador");
        Teclado[2] = new Jefes("juan", 20000, "Administrador");
        Teclado[3] = new Jefes("Camilo", 16000, "Administrador");
        Teclado[4] = new Jefes("michel", 33000, "Administrador");
        Teclado[5] = new newEmpleados("Fransisco", 72000, "Administrador");

        for (int s = 0; s<Teclado.length; s++){

            Teclado[s].porcentajeSalario(0.20);
        }

        Arrays.sort(Teclado);

        for(int i = 0; i<Teclado.length; i++){

            System.out.println("id: " + Teclado[i].dameID() + " Nombre: " + Teclado[i].nombreJEFE() + " Salario: " + Teclado[i].dameSalariojefe() +
            
            " Cargo: " + Teclado[i].cargoJEFE());
        }

        Empleado Datos = new Empleado();
        System.out.println("-----------------------");
        System.out.println("Datos de la empresa\n");
        System.out.println(Datos.dameAdministracion());
        System.out.println(Datos.dameRegion());

        Datos.configuraNombre(JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL EMPLEADO"));
        System.out.println(Datos.dameNombre());
        Datos.configuraEdad(Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA EDAD DEL EMPLEADO")));
        System.out.println(Datos.dameEdad());

        Datos.configuraPais(JOptionPane.showInputDialog("INGRESE EL PAIS DEL EMPLEADO"));
        System.out.println(Datos.damePais());
        Datos.configuraCargo(JOptionPane.showInputDialog("INGRESE EL CARGO DEL EMPLEADO"));
        System.out.println(Datos.dameCargo());

        Datos.configuraSector(Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL AREA DE TRABAJAO DONDE TRABAJA  \n1: Planta 1 \n2: Planta 2 \n3: Planta 3 \n4: Planta 4 \n5: Planta 5")));
        System.out.println(Datos.dameArea());
        Datos.configuraSalario(Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SALARIO DEL EMPLEADO")));
        System.out.println(Datos.dameSalario());

        
    }
    
}
