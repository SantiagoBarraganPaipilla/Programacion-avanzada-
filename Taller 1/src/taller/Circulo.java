package taller;

public class Circulo {
	
	    private double radio;
//Constructor
		public Circulo(double radio) {
	        this.radio = radio;
   }
	    //Metodos getters y setters 
	    public double getRadio() {
			return radio;
		}
		public void setRadio(double radio) {
			this.radio = radio;
		}
// Metodos requeridos 
		//Metodo para el area 
		public double Area() {
	        return Math.PI * radio * radio;
	    }
        //Metodo para el perimetro
	    public double Perimetro() {
	        return 2 * Math.PI * radio;
	    }
        //Metodo para el diametro
	    public double Diametro() {
	        return 2 * radio;
	    }
	}

	


