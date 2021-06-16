package moto;

import moto.marcasdemotos.Bajaj;
import moto.marcasdemotos.Suzuki;

public class Moto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------------------");
        
        Motos mg = new Motos(new Suzuki());
        mg.mostrarModelo();
        mg.mostrarMotor();
        
        System.out.println("-------------------");
       Motos mp = new Motos(new Bajaj());
       mp.mostrarModelo();
       mp.mostrarMotor();
    }
    
}
