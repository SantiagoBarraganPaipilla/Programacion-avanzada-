import java.util.Arrays;
public class ordenar {
		public static void imprimirArreglo(String mensaje, int arreglo[]) {
		System.out.println(mensaje + ": [longitud:" + arreglo.length + "]");
		//Se imprime el arreglo
		for (int i=0; i < arreglo. length; i++){
		System.out.print(" - " + arreglo[i]);
		}
		System.out.println();
		}
	public static void main(String[] args) {
		int ejemplo_arreglo[] = {2,-5,3,0,-2,-3,9,-10,4,5};
		float miflotante = 1.0f;
		double[][] matriz = new double[3][3];
		Arrays.sort (ejemplo_arreglo);
		//Se imprime el arreglo ordenado por el metodo sort de Arrays de la clase Utils de Java/
		imprimirArreglo( "Arreglo Ordenado", ejemplo_arreglo);
		//Se busca el índice del valor -2, por el metodo binarySearch de la clase Arrays/
		int indice= Arrays.binarySearch(ejemplo_arreglo, -2);
		System.out .println("se encontro el -2 @ " + indice);

	}

}


