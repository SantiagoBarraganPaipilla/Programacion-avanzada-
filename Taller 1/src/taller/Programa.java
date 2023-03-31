/*
 * Autor: Santiago Barragan Paipilla
 * Fecha: 31/03/2023
 * Instrucciones: 
 * Círculo: Área, Perímetro, Diámetro
 * Triángulo Rectángulo: Perímetro, Hipotenusa, Altura
 * Crear 3 clases (Persona, Profesor, estudiante), que se pueden presentar. 
   El estudiante que curse 9no o superior, puede inscribirse en el curso de programación. 
   En el programa principal, se presentan los 3 objetos, y si el estudiante puede o no 
   hacer el curso de programación.
 */
package taller;

import java.util.Scanner;
//Clase principal
public class Programa {

	public static void main(String[] args) {
		int numero;
//Menu, se inicia la condicion para que se repita el programa hasta que el usuario dese finalizar 
		do {
		System.out.println("Bienvenido, escriba que desea hacer: ");
        System.out.println("1. Circulo, calcular su area, perimetro y diametro" );
        System.out.println("2. Triangulo Rectangulo calcular perimetro, hipotenusa y altura " );
        System.out.println("3. Presentar persona, profesor y estudiante ");
        System.out.println("4. SALIR ");
        System.out.println("Ingrese el numero del menu: ");
        Scanner dato=new Scanner(System.in);
		numero=dato.nextInt();
		//Condicional multiple excluyente 
		switch (numero) {
		    case 1:
//Llamado de clase circulo con sus metodos 
		    	 //Se crea nuevo objeto
		    	 Circulo circulo = new Circulo(8.3);
		         System.out.println("Radio: " + circulo.getRadio());
		         System.out.println("Area: " + circulo.Area());
		         System.out.println("Perimetro: " + circulo.Perimetro());
		         System.out.println("Diametro: " + circulo.Diametro());
		        break;
		    case 2:
//Llamado de clase triangulo Rectangulo con sus metodos 
		    	// Se crea nuevo objeto
		    	Triangulo_Rectangulo triangulo = new Triangulo_Rectangulo(3.3, 6.7);
		        System.out.println("Base: " + triangulo.getBase());
		        System.out.println("Altura: " + triangulo.getAltura());
		        System.out.println("Perimetro: " + triangulo.Perimetro());
		        System.out.println("Hipotenusa: " + triangulo.Hipotenusa());
		        System.out.println("Altura respecto a la hipotenusa: " + triangulo.getAltura());
		        break;
		    case 3:
//Llamado de clases persona, estudiante y profesor con sus metodos 
		    	//Se crea nuevo objeto
		    	Persona persona1 = new Persona("Jhon", 50, "Jugar futbol");
		    	//Metodo presentarse 
		        persona1.presentarse();
		        //Se crea nuevo objeto
		        Profesor profesor1 = new Profesor("Manuela", 22, "Dormir", "Italiano");
		        //Metodo presentarse y saber que ensena 
		        profesor1.presentarse();
		        profesor1.ensenar();
		        //Se crea nuevo objeto
		        Estudiante estudiante1 = new Estudiante("Samuel", 12, "Correr", 7);
		        //Metodo presentarse y saber si puede cursar programacion 
		        estudiante1.presentarse();
		        if (estudiante1.puedeProgramar()) {
		            System.out.println("El estudiante " + estudiante1.getNombre() + " puede inscribirse en el curso de programación");
		        } else {
		            System.out.println("El estudiante " + estudiante1.getNombre() + " no puede inscribirse en el curso de programación");
		        }
		        //Se crea nuevo objeto
		        Estudiante estudiante2 = new Estudiante("Natalia", 19, "Jugar volley", 11);
		        //Metodo presentarse y saber si puede cursar programacion
		        estudiante2.presentarse();
		        if (estudiante2.puedeProgramar()) {
		            System.out.println("El estudiante " + estudiante2.getNombre() + " puede inscribirse en el curso de programación");
		        } else {
		            System.out.println("El estudiante " + estudiante2.getNombre() + " no puede inscribirse en el curso de programación");
		        }
		        //Se crea nuevo objeto
		        Estudiante estudiante3 = new Estudiante("Santiago", 20, "Cocinar", 11);
		        //Metodo presentarse y saber si puede cursar programacion
		        estudiante3.presentarse();
		        if (estudiante3.puedeProgramar()) {
		            System.out.println("El estudiante " + estudiante3.getNombre() + " puede inscribirse en el curso de programación");
		        } else {
		            System.out.println("El estudiante " + estudiante3.getNombre() + " no puede inscribirse en el curso de programación");
		        }
		        break;
		    default:
		        System.out.println("El numero no es valido");
		        break;
		 } 

	    }while (numero!=4);

	}
}


