package taller;

public class Triangulo_Rectangulo {
	    private double base;
	    private double altura;
//Metodo constructor
	    public Triangulo_Rectangulo(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}
//Metodos Getters y setters 
	    public double getBase() {
			return base;
	    }
		public void setBase(double base) {
			this.base = base;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
//Metodos de la clase 
		//Metodo para caluclar el perimetro 
		public double Perimetro() {
	        double hipotenusa = Hipotenusa();
	        return base + altura + hipotenusa;
	    }
        //Metodo para calcular hipotenusa
	 	public double Hipotenusa() {
	        return Math.sqrt(base*base + altura*altura);
	    }
        //Metodo para calcular la altura
	    public double Altura() {
	        return (base * altura) / Hipotenusa();
	    }
}


