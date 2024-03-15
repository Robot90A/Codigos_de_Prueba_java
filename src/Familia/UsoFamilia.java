package Familia;
import java.util.Arrays;

public class UsoFamilia {

    public static void main(String[]args){

        Padre[] dameFamilia = new Padre[6];

        dameFamilia[0] = new Padre("Ford F-150", "Honda CBR", 3, 400000);
        dameFamilia[1] = new Padre("Chevrolet", "Yamaha Yzf", 3, 300000);
        dameFamilia[2] = new Padre("Toyota Tacoma", "Harley-Davidson", 1, 200000);
        dameFamilia[3] = new Padre("RAM 1500", "Kawasaki", 03, 350000);
        dameFamilia[4] = new Hijo("Ford Maverick 2022.", "Yankee ", 3, 500800, "BMX", 270000);
        dameFamilia[5] = new Hijo(null, null, 4, 600000, "BMX_v2", 150900);

        for(int p = 0; p<dameFamilia.length; p++ ){

            dameFamilia[p].salariodelpadre(0.50);

        }
        
        Hijo infoHijo = (Hijo)dameFamilia[5];
        System.out.println(infoHijo.reseña("Hijo de su padre y nieto de su tio"));
        System.out.println("Incentivo hijo; " + infoHijo.dineroFamilia(200));
        System.out.println("incentivo hijo 2: " + dameFamilia[2].dineroFamilia(1000));
        

        Arrays.sort(dameFamilia);

        for(int i = 0; i<dameFamilia.length; i++){

            System.out.println("Camioneta: " + dameFamilia[i].dameCanCamioneta() + "Moto: " + dameFamilia[i].dameCanMoto() +
            " Negocio: " + dameFamilia[i].dameNegocios() + " Salario: " + dameFamilia[i].dameDinero() + " $");

        }

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        Hijo[] hijoFamilia = new Hijo[4];

        hijoFamilia[0] = new Hijo("Chevrolet Tracker", "Moto Guzzi", 4, 905700, "Fixies", 356000);
        hijoFamilia[1] = new Hijo("Kia Seltos", "Suzuki", 4, 9136000, "Híbridas", 460720);
        hijoFamilia[2] = new Hijo("Mazda CX-3", "Ducati", 4, 946000, "Gravel", 367300);
        hijoFamilia[3] = new Hijo("Peugeot 2008", "MV Agusta", 4, 945600, "Plegables", 501900);
        

        for(int z = 0; z<hijoFamilia.length; z++){
            
            hijoFamilia[z].salariodelpadre(0.10);
            hijoFamilia[z].salarioDelHijo(0.10);

        }


        for(int m = 0; m<hijoFamilia.length; m++){

            System.out.println("Camioneta: " + hijoFamilia[m].dameCanCamioneta() + " Moto: " + hijoFamilia[m].dameCanMoto() +
            " Negocios: " + hijoFamilia[m].dameNegocios() + " Salario del padre: " + hijoFamilia[m].dameDinero() +
            " Salario del hijo: " + hijoFamilia[m].dameSalariohijo() + " vicicleta: " + hijoFamilia[m].dimeVicicleta());

        }

    }
    
}
