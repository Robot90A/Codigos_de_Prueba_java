package Tiempo3;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class Temporizador3 {

    public static void main(String[]args){

        Relog miRelog = new Relog(3000, true);
        miRelog.EnMarcha();
        JOptionPane.showMessageDialog(null, "PARAR CRONOMETRO");
        System.exit(0);


    }
    
}

class Relog{

    private int segundos;
    private boolean sonido;

    private class cronografo implements ActionListener{

        public void actionPerformed(ActionEvent b){

            Date hora = new Date();

            System.out.println("La hora actual es: " + hora);

            if(sonido == true){

                Toolkit.getDefaultToolkit().beep();
            }
        }


    }

    public Relog(int segundos, boolean sonido){

        this.segundos = segundos;
        this.sonido = sonido;

    }

    public void EnMarcha(){

        ActionListener oyente = new cronografo();
        Timer miTemporizador = new Timer(segundos, oyente);
        miTemporizador.start();
        
    }

}


