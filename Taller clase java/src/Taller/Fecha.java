package Taller;
import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        // Crea un objeto Scanner para obtener la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese el día, el mes y el año
        System.out.print("Ingresa el día: ");
        int dia = scanner.nextInt();
        
        System.out.print("Ingresa el mes: ");
        int mes = scanner.nextInt();
        
        System.out.print("Ingresa el año: ");
        int año = scanner.nextInt();

        // Imprime los valores de día, mes y año
        System.out.println("El día es: " + dia);
        System.out.println("El mes es: " + mes);
        System.out.println("El año es: " + año);
        
    }
    
}

