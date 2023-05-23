
/*Autor: Santiago Barragan Paipilla 
 * Fecha: 12/04/2023
 * Tema:  Hacer un programa en el cual pueda manipular una lista de Jugadores de Ajedrez que han participado en un evento.
  Los datos son: Nombre, ELO, edad, valorPremio. El ELO representa un valor del tipo entero al igual que el valorPremio. 
  Se requiere una aplicación que se pueda ordenar los jugadores en función de el ELO, de la edad y del valor del premio. 
  Inicialmente, la aplicación deberá presentar la lista de almenos 7 jugadores de forma desordenada. 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Principal {

	public static void main(String[] args) {
		// Creamos una lista de jugadores 7 jugadores en desorden 
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("John", 5000, 40, 10000));
        jugadores.add(new Jugador("Luisa", 1800, 30, 500));
        jugadores.add(new Jugador("Felipe", 2200, 22, 20000));
        jugadores.add(new Jugador("Santiago", 3000, 20, 18000));
        jugadores.add(new Jugador("Manuela", 2100, 23, 1500));
        jugadores.add(new Jugador("Natalia", 1700, 19, 4000));
        jugadores.add(new Jugador("Juan", 2300, 18, 1500));
//Imprimir lista desordenada 
        System.out.println("Lista desordenada: ");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador+ " - " +jugador.getNombre()+ " Elo: " +jugador.getElo()+ " Edad: " +jugador.getEdad()+ " Premio: " +jugador.getPremio());
        }
//Llamamos los metodos creados
        // Ordenamos los jugadores por ELO
        ordenarPor_ELO(jugadores);
        System.out.println("Lista de jugadores ordenados por ELO:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador+ " - " +jugador.getNombre()+ " Elo: " +jugador.getElo());
        }
        
        // Ordenamos los jugadores por edad
        ordenarPor_Edad(jugadores);
        System.out.println("Lista de jugadores ordenados por edad:");
        for (Jugador jugador: jugadores) {
            System.out.println(jugador+ " - " +jugador.getNombre() + " Edad: " +jugador.getEdad());
        }
        
        // Ordenamos los jugadores por valor del premio
        ordenarPor_Premio(jugadores);
        System.out.println("Lista de jugadores ordenados por valor del premio:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador+ " - " +jugador.getNombre()+ " Premio: " +jugador.getPremio());
        }
    }
//Metodos de clase para oredenar jugadores 
	// Método para ordenar la lista de jugadores por ELO
    public static void ordenarPor_ELO(ArrayList<Jugador> jugadores) {
    	//Ordenar de forma descendente por medio de clase Collections y comparator
        Collections.sort(jugadores, new Comparator<Jugador>() {
            public int compare(Jugador j1, Jugador j2) {
                return j2.getElo() - j1.getElo();
            }
        });
    }
    
    // Método para ordenar la lista de jugadores por edad
    public static void ordenarPor_Edad(ArrayList<Jugador> jugadores) {
    	//Ordenar de forma ascendente  por medio de clase Collections y comparator
        Collections.sort(jugadores, new Comparator<Jugador>() {
            public int compare(Jugador j1, Jugador j2) {
                return j1.getEdad() - j2.getEdad();
            }
        });
    }
    
    // Método para ordenar la lista de jugadores por valor del premio
    public static void ordenarPor_Premio(ArrayList<Jugador> jugadores) {
    	//Ordenar de forma descendente por medio de clase Collections y comparator
        Collections.sort(jugadores, new Comparator<Jugador>() {
            public int compare(Jugador j1, Jugador j2) {
                return j2.getPremio() - j1.getPremio();
            }
        });
        
    }

}
	

		
		




