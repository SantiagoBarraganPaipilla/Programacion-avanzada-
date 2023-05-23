/*Sistema de gestión de empleados
Se te ha encargado desarrollar un sistema de gestión de empleados para una empresa. La empresa tiene diferentes tipos de empleados, como empleados a tiempo completo, empleados a tiempo parcial y contratistas. Cada tipo de empleado tiene atributos específicos y se les paga de manera diferente.
Los requisitos del sistema son los siguientes:
1. Debes crear una clase abstracta llamada "Empleado" que tenga los siguientes atributos y métodos:
        * Atributos:
        * nombre (String)
        * edad (int)
        * salario (double)
        * Métodos:
        * obtenerDetalles(): Imprime los detalles del empleado (nombre, edad y salario).
        * calcularSalario(): Método abstracto para calcular el salario del empleado. Este método debe ser implementado en las clases derivadas.
2. Debes crear las siguientes clases derivadas de "Empleado":
3. a) "EmpleadoTiempoCompleto":
        * Atributos adicionales:
        * horasTrabajadas (int)
        * salarioPorHora (double)
        * Métodos:
        * calcularSalario(): Calcula el salario del empleado a tiempo completo multiplicando las horas trabajadas por el salario por hora.
4. b) "EmpleadoTiempoParcial":
        * Atributos adicionales:
        * horasTrabajadas (int)
        * salarioPorHora (double)
        * Métodos:
        * calcularSalario(): Calcula el salario del empleado a tiempo parcial multiplicando las horas trabajadas por el salario por hora.
5. c) "Contratista":
        * Atributos adicionales:
        * horasTrabajadas (int)
        * tarifaPorHora (double)
        * Métodos:
        * calcularSalario(): Calcula el salario del contratista multiplicando las horas trabajadas por la tarifa por hora. A los contratistas se les paga el doble si trabajan más de 40 horas.
6. En el método principal (main) del programa, crea instancias de diferentes tipos de empleados y almacénalas en un arreglo de tipo "Empleado". Luego, recorre el arreglo y llama al método "obtenerDetalles()" y "calcularSalario()" para cada empleado.
7. Prueba el sistema proporcionando diferentes valores de entrada y verifica que los cálculos de salario y los detalles del empleado sean correctos.
Recuerda aplicar los conceptos de herencia y polimorfismo en la implementación de las clases y métodos. Esto permitirá tratar a los diferentes tipos de empleados de manera uniforme a través de la referencia de tipo "Empleado" y lograr un código más flexible y extensible.*/

//Codigo Santiago Barragan Paipilla & Natalia Catalina Guzman Fuentes

abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void obtenerDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }

    public abstract void calcularSalario();
}

class EmpleadoTiempoCompleto extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salario, int horasTrabajadas, double salarioPorHora) {
        super(nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public void calcularSalario() {
        double salario = horasTrabajadas * salarioPorHora;
        System.out.println("Salario del empleado a tiempo completo: " + salario);
    }
}

class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoTiempoParcial(String nombre, int edad, double salario, int horasTrabajadas, double salarioPorHora) {
        super(nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public void calcularSalario() {
        double salario = horasTrabajadas * salarioPorHora;
        System.out.println("Salario del empleado a tiempo parcial: " + salario);
    }
}

class Contratista extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public Contratista(String nombre, int edad, double salario, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public void calcularSalario() {
        double salario;
        if (horasTrabajadas > 40) {
            salario = horasTrabajadas * tarifaPorHora * 2;
        } else {
            salario = horasTrabajadas * tarifaPorHora;
        }
        System.out.println("Salario del contratista: " + salario);
    }
}

public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Juan", 30, 0, 40, 15.0);
        EmpleadoTiempoParcial empleadoTiempoParcial = new EmpleadoTiempoParcial("Maria", 25, 0, 20, 10.0);
        Contratista contratista = new Contratista("Pedro", 35, 0, 50, 20.0);

        empleados[0] = empleadoTiempoCompleto;
        empleados[1] = empleadoTiempoParcial;
        empleados[2] = contratista;

        for (Empleado empleado : empleados) {
            empleado.obtenerDetalles();
            empleado.calcularSalario();
            System.out.println();
        }
    }
}

