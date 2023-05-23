
public class Jugador {
//Atributos 
	    private String nombre;
	    private int elo;
	    private int edad;
	    private int Premio;
//Metodo constructor 
		public Jugador(String nombre, int elo, int edad, int Premio) {
			this.nombre = nombre;
			this.elo = elo;
			this.edad = edad;
			this.Premio = Premio;
		}
//Metodos getters y setters 
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getElo() {
			return elo;
		}
		public void setElo(int elo) {
			this.elo = elo;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public int getPremio() {
			return Premio;
		}
		public void setPremio(int premio) {
			Premio = premio;
		}
//
	    


}
