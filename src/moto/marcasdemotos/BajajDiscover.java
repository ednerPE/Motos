package moto.marcasdemotos;

import moto.IMarca;

public class BajajDiscover implements IMarca{

    @Override
    public void Modelo() {
            System.out.println("Discover RS");
    }   

    @Override
    public void motor() {
        System.out.println("180 CC");
    }
    
    
    
}
