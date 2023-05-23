 public class Alumno extends Persona {
	private String idAlumno;
//Constructor
         public Alumno(String nombre, String apellidos, int edad) {
               super(nombre, apellidos, edad);
               idAlumno = "unknown";
}
//Metodos de clase 
  public void setIdAlumno(String idAlumno) {
      this.idAlumno = idAlumno;
     }
   public String getIdAlumno() {
       return idAlumno;
       }
    public String toString() {
   return " " + getnombre() + " " + getapellidos() + "-" + getedad() + " " + getIdAlumno();
}
}