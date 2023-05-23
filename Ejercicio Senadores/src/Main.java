/*1. Declara una clase abstracta "Legislador" que herede de la clase "Persona", con un atributo "provinciaQueRepresenta" (tipo String) y otros atributos.
2. Declara un método abstracto "getCamaraEnQueTrabaja".
3. Crea dos clases concretas que hereden de Legislador: la clase "Diputado" y la clase
"Senador que sobreescriban los métodos abstractos necesarios.
4.Crea una lista de legisladores y muestra por pantalla la cámara en que trabajan
haciendo uso del polimorfismo.*/

//Codigo Santiago Barragan Paipilla & Natalia Catalina Guzman Fuentes 

import java.util.ArrayList;
import java.util.List;

abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

abstract class Legislador extends Persona {
    private String provinciaQueRepresenta;

    public Legislador(String nombre, int edad, String provinciaQueRepresenta) {
        super(nombre, edad);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public abstract String getCamaraEnQueTrabaja();
}

class Diputado extends Legislador {
    public Diputado(String nombre, int edad, String provinciaQueRepresenta) {
        super(nombre, edad, provinciaQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Cámara de Diputados";
    }
}

class Senador extends Legislador {
    public Senador(String nombre, int edad, String provinciaQueRepresenta) {
        super(nombre, edad, provinciaQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Cámara de Senadores";
    }
}
public class Main {
    public static void main(String[] args) {
        List<Legislador> legisladores = new ArrayList<>();

        Diputado diputado1 = new Diputado("Juan Pérez", 45, "Buenos Aires");
        Diputado diputado2 = new Diputado("María González", 38, "Córdoba");
        Senador senador1 = new Senador("Carlos López", 52, "Santa Fe");
        Senador senador2 = new Senador("Ana Rodríguez", 41, "Mendoza");

        legisladores.add(diputado1);
        legisladores.add(diputado2);
        legisladores.add(senador1);
        legisladores.add(senador2);

        for (Legislador legislador : legisladores) {
            System.out.println("Nombre: " + legislador.getNombre());
            System.out.println("Edad: " + legislador.getEdad());
            System.out.println("Provincia que representa: " + legislador.getProvinciaQueRepresenta());
            System.out.println("Cámara en que trabaja: " + legislador.getCamaraEnQueTrabaja());
            System.out.println();
        }
    }
}

