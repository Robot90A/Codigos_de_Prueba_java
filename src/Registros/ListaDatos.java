package Registros;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class ListaDatos {

    public static void main(String[]args){

        ListaCompleta dameDatos = new ListaCompleta();

        dameDatos.TuCondicionExtranjero(JOptionPane.showInputDialog("¿Es Extranjero?"));
        System.out.println(dameDatos.dameUbicacion());
        dameDatos.ListaPaises(Integer.parseInt(JOptionPane.showInputDialog("DE QUE PAIS PROVIENES ?" + 
        "\n:1 Colombia" + 
        "\n:2 Chile" +
        "\n:3 Argentina" + 
        "\n:4 Venezula" + 
        "\n:5 Brasil" + 
        "\n:6 opcion no valida")));

        System.out.println(dameDatos.damePais());

        System.out.println("------------------------------------------------------------------------");

        DatosPersonas2[] arraysDatos = new DatosPersonas2[6];

        arraysDatos[0] = new DatosPersonas2("Sebastian", "Ramirez", 21, 123, 950005);
        arraysDatos[1] = new DatosPersonas2("Juan", "Montiel", 24, 104, 640510);
        arraysDatos[2] = new DatosPersonas2("Oswaldo", "Velasquez", 34, 109, 813457);
        arraysDatos[3] = new DatosPersonas2("Miguel", "ordoñez", 26, 101, 520990);
        arraysDatos[4] = new DatosPersonas2("Luiza", "vaneza", 19, 112, 720310);
        arraysDatos[5] = new DatosPersonas2("Estefany", "puentes", 31, 133, 670501);
        

        for(int x = 0; x<arraysDatos.length; x++ ){

            arraysDatos[x].SalarioPersona(0.70);
        }

        Arrays.sort(arraysDatos);

        for(int i = 0; i<arraysDatos.length; i++){

            System.out.println("ID: " + arraysDatos[i].dameID() +  " Nombre: " + arraysDatos[i].dameNombre() + 
            " Apellido: " + arraysDatos[i].dameApellido() + " EDAD: " + arraysDatos[i].dameEdad() + 
            " Docuemnto: " + arraysDatos[i].Ndocumento() + " Salario: " + arraysDatos[i].dameSalario());
        }


    }
    
}
