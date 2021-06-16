package moto.marcasdemotos;

import moto.IMarca;


public class Suzuki implements IMarca{

    @Override
    public void Modelo() {
           System.out.println("Gixxer");
    }

    @Override
    public void motor() {
        System.out.println("250 CC");
    }
    
    
    
    
}
