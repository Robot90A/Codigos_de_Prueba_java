package PruebaRelog;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Cronologia{

    public static void main(String[]args){
        
        funcion ejecucion = new funcion(3000, true);
        ejecucion.inicio();
        JOptionPane.showMessageDialog(null, "Parar ejecucion");
        System.exit(0);

    }
}

class funcion {

    private int segundos;
    private boolean condicion;

    public funcion(int segundos, boolean condicion){

        this.segundos = segundos;
        this.condicion = condicion;
    }
    
    private class cronograma implements ActionListener{

        public void actionPerformed(ActionEvent e){

            Date hora = new Date();
            
            System.out.println("Tiempo: " + hora);

            if(condicion == true){

                Toolkit.getDefaultToolkit().beep();
            }

        }

    }

    public void inicio(){

        ActionListener obejto = new cronograma();
        Timer inicio_ejecucion = new Timer(segundos, obejto);
        inicio_ejecucion.restart();
    }

}

