package Animal;
public class newEspecies extends Animales implements Comparable, valorEntradas {

    public String dieta;
    public String estatus;
    public double Total;


    public newEspecies(String Nombre, String especie, int cantidad, String dieta, String estatus){

        super(Nombre, especie, cantidad);
        this.dieta = dieta;
        this.estatus = estatus;
        
    }

    public String dameDieta(){

        return dieta;
    }

    public String dameEstatus(){

        return estatus;
    }

    public void damePrecio(double valor){
        
        double valorAnimal = 500000;
        double decimas = valor * 100;
        Total = decimas + valorAnimal;

    }

    public String Precio(){

        return "Precio del animal: " + Total;
    }

    public int compareTo(Object miObject){

        newEspecies complemento = (newEspecies)miObject;
        if(dameID() < complemento.dameID()){

            return -1;
        }
        if(dameID() > complemento.dameID()){

            return 1;
        }

        return 0;

    }

    public double precioEntradas(double ingresarValor){
        
        double aumento = ingresarValor * 100;

        return valorEntradas.Costos + aumento;

    }

}
