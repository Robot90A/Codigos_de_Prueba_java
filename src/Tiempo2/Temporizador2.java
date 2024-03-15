package Tiempo2;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Temporizador2 {

    public static void main(String[]args){

        impresion interfas = new impresion();
        Timer cronometro = new Timer(3000, interfas);
        cronometro.start();
        JOptionPane.showMessageDialog(null, "stop execution");
        
    }
    
}

class impresion implements ActionListener{

    public void actionPerformed(ActionEvent e){

        Date cronologia = new Date();

        System.out.println("time and date: " + cronologia);

        Toolkit.getDefaultToolkit().beep();

    }
}
