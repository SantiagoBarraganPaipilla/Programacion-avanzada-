  public class Profesor extends Persona {
	//atributos propios de la subclase 
		private String idprofesor;
	//constructor
	public Profesor (String nombre, String apellidos, int edad) {
	super(nombre, apellidos, edad);
	idprofesor = "unknown";
	
	}
	//métodos propios de la subclase
	public void setidprofesor (String idprofesor) {
	this.idprofesor = idprofesor; }
	public String getidprofesor () {
	return idprofesor; }
	public String tostring() {
	return" "+ getnombre() + " " + getapellidos () + "-" + getedad() + " - " + getidprofesor();
	}
}
