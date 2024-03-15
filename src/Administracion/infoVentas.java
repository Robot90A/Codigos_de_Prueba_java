package Administracion;
public class infoVentas {

    public static void main (String[]args){
        
        Clientes[] dameCliente = new Clientes[6]; 
        
        dameCliente[0] = new Clientes("Laptop", "Calle 113", 1605000, "si");
        dameCliente[1] = new Clientes("Zapatos", "Calle 113 26-i 31", 114000, "no");
        dameCliente[2] = new Clientes("parlante", "Calle 113 26-i 31", 45000, "no");
        dameCliente[3] = new Clientes("relog", "Calle 113 26-i 31", 20000, "no");
        dameCliente[4] = new Clientes("Celular", "Calle 113 26-i 31", 600000, "si");
        dameCliente[5] = new Extras("gorra", "Calle 113 26-i 31", 15, "no");

        
        for(int i = 0; i<dameCliente.length; i++){
            System.out.println("id: " + dameCliente[i].dameID() + " Nombre: " + dameCliente[i].dameNombre() + 
            " Direccion: " + dameCliente[i].dameDireccion() + " Costo: " + dameCliente[i].dameCosto() + 
            " Garantia: " + dameCliente[i].dameGarantia());
        }

    }
    
}
