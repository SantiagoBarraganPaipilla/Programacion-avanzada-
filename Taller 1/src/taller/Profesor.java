package taller;

public class Profesor extends Persona {
       private String materia;
//Metodo constructor  con super para herencia de persona 
    public Profesor(String nombre, int edad, String hobby, String materia) {
		super(nombre, edad, hobby);
		this.materia = materia;
	}
//Metodo Getters y Setters 
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
//Metodos de clase
	//Metodo para ensenar 
	public void ensenar() {
        System.out.println("Soy profesor de " + materia);
    }
}
