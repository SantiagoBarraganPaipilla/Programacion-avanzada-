/*
 * Quiz Herencia basica y avanzada 
 * Santiago Barragan Paipilla & Natalia Catalina Guzman Fuentes 
 */
abstract class Vehiculo {
    public abstract void acelerar();
}

final class Automovil extends Vehiculo {
    private int velocidad;

    public Automovil() {
        velocidad = 10;
    }

    @Override
    public void acelerar() {
        velocidad += 10;
    }

    public int getVelocidad() {
        return velocidad;
    }
}

final class Motocicleta extends Vehiculo {
    private int velocidad;

    public Motocicleta() {
        velocidad = 10;
    }

    @Override
    public void acelerar() {
        velocidad += 5;
    }

    public int getVelocidad() {
        return velocidad;
    }
}

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        Motocicleta motocicleta = new Motocicleta();

        automovil.acelerar();
        motocicleta.acelerar();

        System.out.println("Velocidad del Automovil: " + automovil.getVelocidad() + " km/h");
        System.out.println("Velocidad de la Motocicleta: " + motocicleta.getVelocidad() + " km/h");
    }
}

