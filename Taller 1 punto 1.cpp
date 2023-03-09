/******************************************************************************
 Fecha: 22-02-2023
 Autor: Santiago Barragan Paipilla
 Tema:Taller 1 Punto 1
 1.- Crear un array con 10 elementos
2.- Crear una función para generar números aleatorios entre 0 y 25
3.- Llenar el array con 10 números aleatorios
4.- Crear un puntero
5.- Imprimir el contenido del array usando el puntero
6.- Imprimir las direcciones del contenido del array usando el puntero.
c++
*******************************************************************************/
#include <iostream>
#include <cstdlib>
#include <ctime>
int generarNumeroAleatorio();
using namespace std;
int main() {
    // Se crea un array con 10 elementos
    int Array[10];

    // funcion random aleatorio
    srand(time(NULL));

    // Llenar el array con 10 números aleatorios usando la funcion de generar numeros 
    for (int i = 0; i < 10; i++) {
        Array[i] = generarNumeroAleatorio();
    }

    // Se crea un puntero
    int* puntero = Array;

    // Imprimir el contenido del array usando el puntero creado
    cout << "Contenido del arreglo:" << endl;
    for (int i = 0; i < 10; i++) {
        cout << *puntero << " ";
        puntero++;
    }
    cout << endl;

    // Apuntar al primer elemento del arreglo
    puntero = Array;

    // Imprimir las direcciones del contenido del arreglo usando el puntero
    cout << "Direcciones del contenido del array usando el puntero:" << endl;
    for (int i = 0; i < 10; i++) {
        cout << puntero << " ";
        puntero++;
    }
    cout << endl;

    return 0;
}

// Función para generar números aleatorios entre 0 y 25
int generarNumeroAleatorio() {
    return rand() % 26;
}
