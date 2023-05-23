 public class Practicante extends Persona {
   private String idPracticante;
//Constructor 
     public Practicante(String nombre, String apellidos, int edad) {
           super(nombre, apellidos, edad);
            idPracticante = "unknown";
       }
//Metodos 
        public void setIdPracticante(String idPracticante) {
          this.idPracticante = idPracticante;
      }
       public String getIdPracticante() {
       return idPracticante;
       }
       public String toString() {
        return " " + getnombre() + " " + getapellidos() + "-" + getedad() + " " + getIdPracticante();
      }
}
 