package Tiempo;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temporizador {

    public static void main (String[]args){
        
        Tiempo contador = new Tiempo();
        Timer miTermporizador = new Timer(2000, contador);
        miTermporizador.start();
        JOptionPane.showMessageDialog(null, " Stop process ");
        System.exit(0);

    }
    
}

class Tiempo implements ActionListener{

    public void actionPerformed(ActionEvent e){

        System.out.println("hack_message: System compromised successfully");
        Toolkit.getDefaultToolkit().beep();
    }
}
