/*Diseña una clase abstracta llamada Figura que tenga un método abstracto areal. Luego, crea dos subclases, Circulo y Rectangulo, que implementen este método. 
El método area0 del Crculo debe retornar el área de un círculo dado su radio (piradio^2), 
y el método areal del Rectangulo debe retornar el área de un rectángulo dado su ancho y su alto (anchoalto).*/

//Codigo Santiago Barragan Paipilla & Natalia Catalina Guzman Fuentes 
abstract class Figura {
    public abstract double calcularArea();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        double areaCirculo = circulo.calcularArea();
        double areaRectangulo = rectangulo.calcularArea();

        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
    }
}

