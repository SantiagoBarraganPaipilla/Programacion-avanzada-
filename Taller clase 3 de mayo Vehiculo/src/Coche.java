
 public class Coche extends Vehiculo{
        private String marca;
//Constructor
     public Coche (String marca, int numeroRuedas){
            super (numeroRuedas);
            this.marca = marca;
         }
//Metodos
       public void abrirPuerta(){
            System.out.println("Abriendo puerta...");
       }
}
