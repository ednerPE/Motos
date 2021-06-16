package moto;

        
public class Motos{
    
   private IMarca marca;



    public Motos(IMarca marca) {
        this.marca = marca;
    }

  
    public void setMarca(IMarca marca) {
        this.marca = marca;
    }

    
   
   public void mostrarModelo(){
       marca.Modelo();
   }
   
  public void mostrarMotor(){
      marca.motor();
  }
    
}
