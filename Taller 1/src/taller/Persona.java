package taller;

public class Persona {
	private String nombre;
    private int edad;
    private String hobby;
//Metodo Constructor
    public Persona(String nombre, int edad, String hobby) {
        this.nombre = nombre;
        this.edad = edad;
        this.hobby = hobby;
    }
//Metodos Getters y setters 
    public int getEdad() {
        return edad;
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
//Metodos de la clase 
	//Metodo presentarse 
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + ", tengo " + edad + " años y me gusta " + hobby);
    }
}
