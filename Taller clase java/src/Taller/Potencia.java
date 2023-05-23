package Taller;
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        // Crea un objeto Scanner para obtener la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese la base y el exponente
        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa el exponente: ");
        double exponente = scanner.nextDouble();

        // Calcula la potencia de la base elevada al exponente con la funcion pow() de la libreria Math
        double resultado = Math.pow(base, exponente);

        // Imprime el resultado de la potencia
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }
}


