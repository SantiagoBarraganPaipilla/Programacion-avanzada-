/******************************************************************************
 Fecha: 22-02-2023
 Autor: Santiago Barragan Paipilla
 Tema:Taller 1 Punto 2 
 ***************************************************************************/
#include <iostream>
#include <fstream>
#include <string>
using namespace std;
//Declaro struct
struct Comprador {
    string nombre;
    string apellido;
    string direccion;
    int telefono;
    int cedula;
};
int main() {
    // Se crea un nuevo comprador con memoria dinamica
    Comprador* comprador = new Comprador();

    // Se piden  los datos del comprador y se guardan 
    cout << "Ingrese el nombre del comprador: "<<endl;
    getline(cin, comprador->nombre);
    cout << "Ingrese el apellido del comprador: "<<endl;
    getline(cin, comprador->apellido);
    cout << "Ingrese la direccion del comprador: "<<endl;
    getline(cin, comprador->direccion);
    cout << "Ingrese el telefono del comprador: "<<endl;
    cin >> comprador->telefono;
    cout << "Ingrese la cedula del comprador: "<<endl;
    cin >> comprador->cedula;
    // Se imprime la factura en un archivo de texto
    ofstream factura("factura_electronica.txt");
    factura << "Factura"<<endl;
    factura << "Nombre: " << comprador->nombre <<endl;
    factura << "Apellido: " << comprador->apellido <<endl;
    factura << "Direccion: " << comprador->direccion <<endl;
    factura << "Telefono: " << comprador->telefono <<endl;
    factura << "Cedula: " << comprador->cedula <<endl;
    //Buena practica cerrar siempre archivos 
    factura.close();
// Se libera la memoria del cliente y se borran los datos
    delete comprador; 
    return 0;
}

