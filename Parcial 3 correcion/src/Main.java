/*
* Autor: Santiago Barragan Paipilla 
* Tema: Parcial corregido 
* fecha: 22/05/2023
*/

//Librerias implementadas 
import java.util.ArrayList;

//Clase abstracta Conjunto de datos 
abstract class ConjuntoDeDatos {
	//Atributos de la clase 
    private String nombre;
    private int tamano;
    //Metodo constructor
    public ConjuntoDeDatos(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }
    //Getters y setters 
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	//Metodo abstracto 
    public abstract String describir();
}//Fin de la clase Conjunto de datos 

//Clase conjunto de datos tabular, esta hereda de conjunto de datos 
class ConjuntoDeDatosTabular extends ConjuntoDeDatos {
	//Atributos propios de la clase 
    private int numeroDeColumnas;
    private int numeroDeFilas;
    //Metodo constructor con los atributos heredados
    public ConjuntoDeDatosTabular(String nombre, int tamano, int numeroDeFilas, int numeroDeColumnas) {
        super(nombre, tamano);
        this.numeroDeFilas = numeroDeFilas;
        this.numeroDeColumnas = numeroDeColumnas;
    }
    //Getters y setters 
    public int getNumeroDeColumnas() {
		return numeroDeColumnas;
	}

	public void setNumeroDeColumnas(int numeroDeColumnas) {
		this.numeroDeColumnas = numeroDeColumnas;
	}

	public int getNumeroDeFilas() {
		return numeroDeFilas;
	}

	public void setNumeroDeFilas(int numeroDeFilas) {
		this.numeroDeFilas = numeroDeFilas;
	}
	//Se sobreescribe el metodo abstracto usando la informacion propia de la clase 
    @Override
    public String describir() {
        return "Nombre: " + getNombre() + "\nTamaño: " + getTamano() + "\nTipo: Tabular\nFilas: " + numeroDeFilas +
                " \nColumnas: " + numeroDeColumnas;
    }
}//Fin de la clase coonjunto de datos tabular

//Clase Conjunto de datos imagen, esta hereda de la clase conjunto de datos 
class ConjuntoDeDatosImagen extends ConjuntoDeDatos {
	//Atributos propios de la clase
    private int ancho;
    private int alto;
    //Metodo constructor con los atributos heredados
    public ConjuntoDeDatosImagen(String nombre, int tamano, int ancho, int alto) {
        super(nombre, tamano);
        this.ancho = ancho;
        this.alto = alto;
    }
    //Getters y setters 
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	//Se sobreescribe el metodo abstracto usando la informacion propia de la clase 
    @Override
    public String describir() {
        return "Nombre: " + getNombre() + "\nTamaño: " + getTamano() + "\nTipo: Imagen\nResolución Horizontal: " + ancho +
                " \nResolución Vertical: " + alto;
    }

}//Fin de la clase Conjunto de datos imagen

//Clase analizadora de datos 
class AnalizadorDeDatos {
	//Se declara un ArrayList "ConjuntoDeDatos"
    private ArrayList<ConjuntoDeDatos> conjuntosDeDatos;
    //Metodo constructor 
    public AnalizadorDeDatos() {
        this.conjuntosDeDatos = new ArrayList<>();
    }
    //Metodo de la clase 
    public void añadirConjuntoDeDatos(ConjuntoDeDatos conjuntoDeDatos) {
        conjuntosDeDatos.add(conjuntoDeDatos);
    }
    public void eliminarConjuntoDeDatos(String nombre) {
        conjuntosDeDatos.removeIf(conjunto -> conjunto.getNombre().equals(nombre));
    }
    public ArrayList<String> describirConjuntosDeDatos() {
        ArrayList<String> descripciones = new ArrayList<>();
        for (ConjuntoDeDatos conjunto : conjuntosDeDatos) {
            descripciones.add(conjunto.describir());
        }
        return descripciones;
    }
}//Fin de la clase analizadora de datos 

//Clase main para implementar todas las funciones y ver el correcto funcionamiento
public class Main {
    public static void main(String[] args) {
    	//Se crean los objetos
        ConjuntoDeDatosTabular conjuntoTabular = new ConjuntoDeDatosTabular("Datos de estudiantes", 1000, 200, 5);
        ConjuntoDeDatosImagen conjuntoImagen1 = new ConjuntoDeDatosImagen("Imágenes de satélite", 2000, 1080, 720);
        ConjuntoDeDatosImagen conjuntoImagen2 = new ConjuntoDeDatosImagen("Imágenes de satélite", 2000, 1080, 720);
        AnalizadorDeDatos analizador = new AnalizadorDeDatos();
        //Se agregan los conjuntos
        analizador.añadirConjuntoDeDatos(conjuntoTabular);
        analizador.añadirConjuntoDeDatos(conjuntoImagen1);
        analizador.añadirConjuntoDeDatos(conjuntoImagen2);
        //Se imprime la lsita 
        ArrayList<String> descripciones = analizador.describirConjuntosDeDatos();
        for (String descripcion : descripciones) {
            System.out.println(descripcion);
            System.out.println("-----------------------------");
        }
    }
}//Fin de la clase Main 

//Fin del programa

