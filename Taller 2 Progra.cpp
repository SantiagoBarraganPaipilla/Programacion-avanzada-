/******************************************************************************
 Fecha: 22-02-2023
 Autor: Santiago Barragan Paipilla
 Tema:Taller 2 
*******************************************************************************/
#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;
//Estructura
struct ConjuntoNumerosAleatorios {
    int tamano;
    int valorMaximo;
    int *numeros;
};
//Funciones
void generarConjuntoAleatorio(ConjuntoNumerosAleatorios& conjunto);
void mostrarHistograma(ConjuntoNumerosAleatorios conjunto);



int main() {
    ConjuntoNumerosAleatorios conjunto;
    int opcion;
    //Se hace el menu
    do
    {
    cout << "Menu:" << endl;
    cout << "1. Generar conjunto de numeros aleatorios" << endl;
    cout << "2. Presentar histograma" << endl;
    cout << "3. Salir" << endl;
    cout << "Seleccione una opcion: ";
    cin >> opcion;
        //Condicional multiple excluyente para elegir la funcion
    switch (opcion) {
        case 1:
            cout << "Ingrese el tamano del conjunto: ";
            cin >> conjunto.tamano;
            cout << "Ingrese el valor maximo del conjunto: ";
            cin >> conjunto.valorMaximo;
            generarConjuntoAleatorio(conjunto);
            cout << "Conjunto generado correctamente." << endl;
            break;
        case 2:
            if (conjunto.numeros == NULL) {
                cout << "Debe generar un conjunto primero." << endl;
            } else {
              mostrarHistograma(conjunto);
            }
            break;
        case 3:
            cout << "Saliendo..." << endl;
            break;
    }
        
       }while (opcion!=3);	
     return 0;
}


//Funcion para generar numero aleatorios
void generarConjuntoAleatorio(ConjuntoNumerosAleatorios& conjunto) {
    //Crear memoria para el array
    conjunto.numeros = new int[conjunto.tamano];
    srand(time(NULL));
    //Ciclo para generar conjunto aleatorio
    for (int i = 0; i < conjunto.tamano; i++) {
        conjunto.numeros[i] = rand() % (conjunto.valorMaximo + 1);
    }
    for (int i = 0; i < conjunto.tamano; i++) {
    cout << conjunto.numeros[i] << " ";
}
    
}
//funcion para mostrar histograma con valores generados
void mostrarHistograma(ConjuntoNumerosAleatorios conjunto) {
    //Analizar frecuencia de un numero
    int* frecuencias = new int[conjunto.valorMaximo + 1];
    for (int i = 0; i <= conjunto.valorMaximo; i++) {
        frecuencias[i] = 0;
    }
    for (int i = 0; i < conjunto.tamano; i++) {
        frecuencias[conjunto.numeros[i]]++;
    }
    //imprimir * por cada numero que salga y crear histograma
    for (int i = 0; i <= conjunto.valorMaximo; i++) {
        cout << i << ": ";
        for (int j = 0; j < frecuencias[i]; j++) {
            cout << "*";
        }
        cout << endl;
    }
}
