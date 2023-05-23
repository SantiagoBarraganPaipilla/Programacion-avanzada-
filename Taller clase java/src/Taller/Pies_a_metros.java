package Taller;
import java.util.Scanner;

public class Pies_a_metros  {
    public static void main(String[] args) {
        // Crea un objeto Scanner para obtener la entrada de datos 
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese la medida en pies
        System.out.print("Ingresa la medida en pies: ");
        double pies = scanner.nextDouble();

        // Convierte la medida de pies a metros
        double metros = pies * 0.3048;

        // Imprime la medida en metros
        System.out.println(pies + " pies equivale a " + metros + " metros.");
    }
}




