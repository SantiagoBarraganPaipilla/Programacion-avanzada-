package taller;

public class Estudiante extends Persona {
    private int grado;
//Metodo constructor con super para herencia de persona 
    public Estudiante(String nombre, int edad, String hobby, int grado) {
        super(nombre, edad, hobby);
        this.grado = grado;
    }
//Metodos getters y setters
    public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
//Metodos de clase 
	//Metodo para saber si puede cursar programacion
	public boolean puedeProgramar() {
        return (grado >= 9);
    }
}
