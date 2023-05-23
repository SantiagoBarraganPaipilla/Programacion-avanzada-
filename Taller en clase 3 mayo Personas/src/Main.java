/*
 * Autor: Santiago Barragan Paipilla
 * Fecha: 3 de mayo 
 * Tema: Herencia en situacion de persona 
 */
public class Main {
	public static void main(String[] args) {
		Profesor profesor01 = new Profesor ("Profesor", "mendoza cuba", 33);//profesor01
		//profesor01.setidprofesor("profesor123456789");
		System.out.println(profesor01.toString());
		Alumno alumno01 = new Alumno("Alumno", "Pardo manila", 15);//alumno
		alumno01.setIdAlumno("Alumno123456789");
		System.out.println(alumno01.toString());

		Practicante practicante01 = new Practicante ("Practicante", "Torres nilo", 19);//practicante
		practicante01.setIdPracticante("Practicante123456789");
		System.out.println(practicante01.toString());
		}

}
