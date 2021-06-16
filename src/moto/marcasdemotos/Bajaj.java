package moto.marcasdemotos;

import moto.IMarca;

public class Bajaj implements IMarca{

    @Override
    public void Modelo() {
            System.out.println("Pulsa NS 200");
    }   

    @Override
    public void motor() {
        System.out.println("200 CC");
    }
    
    
    
}
