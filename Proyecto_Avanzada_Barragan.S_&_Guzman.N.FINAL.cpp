//Librerias a utilizar
#include <iostream>
#include <cstdlib>
#include <cstdio>
#include <vector>
#include <fstream>
#include <cstring>
#include <stdio.h>
#include <algorithm>

/***********************************************************************************************************
~ Santiago Barragan Paipilla & Natalia Catalina Guzman Fuentes ~

Fecha: 
Tema: Proyecto de Aula de Clases
Materia: Programacion avanzada

Empresa Minosaurios Tech, solicta registro de sus empleados.
Estructura de datos de empleado:
	- Codigo numerico
	- Nombres
	- Apellidos
	- Celular
	
Funciones:
	- Registrar empleados: se debe almacenar en un fichero binario "Empleados.bin"
	- Agregar nuevos empledos: se verifica que el empleado no este, la informacion se adiciona al final del
	fichero	.
	- Mostrar los empleados registrados: Se imprime en pantalla los empleados en orden alfabetico.
	- Cambiar el n˙mero de celular del empleado: con el codigo del empleado, si existe, se modifica.
	- Despedir empleado: con el codigo, si existe, se elimina del binario. Se genera una carta de 
	despido.txt
	- Mostrar empleados que han sido despedidos: se presenta un vector con los empleados despedidos. 

***********************************************************************************************************/

using namespace std;


//Struct de los datos de los empleados
struct Empleado{
	
	int codigo;
	char nombres[20];
	char apellidos[20];
	long long celular;
	
};


//Prototipo de las funciones
void Registrar_empleado ();
void Agregar_nuevo_empleado ();
void Orden_alfabetico ();
void Cambiar_numero_celular ();
void Despedir_empleado ();
void Imprimir_despedidos();
//Main, funcion principal
int main() {
	
	
//Declaracion de variables
	
int opcion=0, cantidad;
vector<Empleado> despedidos;

//Do while para hacer el menu que guie el programa 

do
{
	cout<<endl<<"Bienvenido Minosaurio tech "<<endl;
	cout<<endl<<"Tenga en cuenta al ingresar la informacion debe poner en mayuscula las primeras letras de el nombre y apellido."<<endl;
	cout<<endl<<">> Que desea hacer? "<<endl;
	cout<<">> 1. Registrar empleados. "<<endl;
	cout<<">> 2. Agregar nuevos empleados. "<<endl;
	cout<<">> 3. Mostrar los empleados registrados. "<<endl;
	cout<<">> 4. Cambiar el numero de celular de un empelado. "<<endl;
	cout<<">> 5. Despedir un empleado. "<<endl;
	cout<<">> 6. Mostrar empelados que han sido despedidos en un vector. "<<endl;
	cout<<">> 7. Salir de la app."<<endl;
	cout<<endl<<">> Digite su opcion: "<<endl;
	cout<<">> ";
	cin>>opcion;
	
	switch (opcion)
	{
		case 1: 
			Registrar_empleado ();
			break;
		case 2: 
			Agregar_nuevo_empleado();
			break;
		case 3:
			Orden_alfabetico ();
			break;
		case 4:
			Cambiar_numero_celular ();
			break;
		case 5:
			Despedir_empleado ();
			break;
		case 6:
		    Imprimir_despedidos();
			break;
		case 7:
			cout<<"Salir del programa :) "<<endl;
			cout<<"Gracias.";
			
	}
}
while (opcion!=7);
	
	
	return 0;
}


//Implementacion de las funciones


//Funcion para registrar empleados y almacenarlos en un fichero binario
void Registrar_empleado (){
	
	//Se crea un nuevo empleado
    Empleado empleado;

    //Se piden los datos del empleado
	
	cout<< "Ingrese el codigo del empleado: ";
    cin>> empleado.codigo;

    cout<< "Ingrese los nombres del empleado: "<<endl;
    cin>>empleado.nombres;

    cout<< "Ingrese los apellidos del empleado: "<<endl;
    cin>>empleado.apellidos;
	
    cout<< "Ingrese el celular del empleado: ";
    cin>> empleado.celular;
	
    //Se escribe el archivo binario
      ofstream archivo("Empleados.bin", ios::binary | ios::app);
      
    //Se verifica si el archivo abre

    if (archivo.is_open()) {
        archivo.write(reinterpret_cast<char*>(&empleado), sizeof(Empleado));
        archivo.close();
        cout << "El empleado ha sido registrado correctamente." << endl;
    }

    else {
        cout << "Error al abrir el archivo." << endl;
    }

}

//Funcion para agregar un nuevo empleado al final del fichero binario
void Agregar_nuevo_empleado(){
	
	//Se crea variable empleado de tipo estructura

    Empleado empleado;

    int codigo;

    //Se verifica si el usuario ya existe

    bool encontrado = false;

    cout << "Ingrese el codigo del empleado: ";
    cin >> codigo;
    
    //Leer archivo binario y buscar empleado

    ifstream archivo("Empleados.bin", ios::binary);

    if (archivo.is_open()) {
        while (!encontrado && archivo.read(reinterpret_cast<char*>(&empleado), sizeof(Empleado))) {
            if (empleado.codigo == codigo) {
                encontrado = true;
            }
        }

        archivo.close();

    }

    //En caso de no encontrar el empleado agregarlo y si no decir que ya se encuentra

    if (!encontrado) {
         //Se piden los datos del empleado
	
	cout<<"Este codigo para empleado no ha sido usado "<<endl;
    empleado.codigo=codigo;

    cout<< "Ingrese los nombres del empleado: "<<endl;
    cin>>empleado.nombres;

    cout<< "Ingrese los apellidos del empleado: "<<endl;
    cin>>empleado.apellidos;
	
    cout<< "Ingrese el celular del empleado: ";
    cin>> empleado.celular;
	
    //Se escribe el archivo binario
      ofstream archivo("Empleados.bin", ios::binary | ios::app);
      
    //Se verifica si el archivo abre

    if (archivo.is_open()) {
        archivo.write(reinterpret_cast<char*>(&empleado), sizeof(Empleado));
        archivo.close();
        cout << "El empleado ha sido registrado correctamente." << endl;
    }

    else {
        cout << "Error al abrir el archivo." << endl;
    }

    }

    else {
        cout << ">> El empleado ya se encuentra en el sistema." << endl;

    }
}
//Funcion para comparar apellidos y arrojar nombres de los empleados
bool compararPorNombre(const Empleado& a, const Empleado& b) {
    return a.nombres < b.nombres;}
    
//Funcion para imprimir en pantalla en orden alfabetico los empleados registrados 
void Orden_alfabetico (){
	//Abrir archivo binario
	ifstream archivo("Empleados.bin", ios::binary);
    Empleado empleado;
    vector<Empleado> empleados;
    while (archivo.read((char*)&empleado, sizeof(empleado))) {
        empleados.push_back(empleado);
    }
    archivo.close();
    //Funcion sort que compara dos cadenas 
    sort(empleados.begin(), empleados.end(), compararPorNombre);

    cout << "Lista de empleados registrados:\n";
    for (const Empleado& e : empleados) {
        cout << "Nombre: " << e.nombres << " " << e.apellidos <<endl;
    }

}
//Funcion para modificar el numero de celular ya existente de un empleado
void Cambiar_numero_celular (){
	
	int codigo;
    long long nuevo_celular;
    bool encontrado = false;
    Empleado empleado;

    // Abrir fichero binario con funcion de leer y escribir para modificar dotos

    fstream archivo("Empleados.bin", ios::in | ios::out | ios::binary);
    if (!archivo.is_open()) {
        cout << "Error al abrir el archivo" << endl;
    }

    // Pedir el codigo del empleado que se le va a modificar el numero de celular 

    cout << "Ingrese el codigo del empleado a modificar: "<<endl;
    cin >> codigo;

    // Leer cada registro de empleados y buscar el codigo

    while (archivo.read((char*)&empleado, sizeof(empleado))) {
        if (empleado.codigo == codigo) {
            encontrado = true;
            break;
        }
    }

    // Si se encuentra el empleado, pedir el nuevo numero de celular

    if (encontrado) {
        cout << "Ingrese el nuevo numero de celular: ";
        cin >> nuevo_celular;
        
        //Modificar numero de celular
        empleado.celular = nuevo_celular;

        // Mover el puntero al inicio del registro encontrado
        archivo.seekp(-static_cast<int>(sizeof(empleado)), ios::cur);

        // Poner los nuevos datos en el fichero
        archivo.write((char*)&empleado, sizeof(empleado));
        cout << "Numero de celular modificado correctamente" << endl;

    } else {
        cout << "El empleado no existe" << endl; 
    }

    // Cerrar el archivo, buena practica de programacion
    archivo.close();
}
//Funcion para despedir un empleado ingresando su codigo
void Despedir_empleado (){
  //Inicializacion de variables
  int codigo;
  bool encontrado = false;
  Empleado empleado;
  vector <Empleado> despedidos;
  //Se solicita el codigo del empleado a despedir
  cout<<"Ingrese el codigo del empleado que quiere despedir :( "<<endl;
  cin>>codigo;
  //Abrir archivo binario en modo de lectura y escritura
  fstream archivo ("Empleados.bin", ios::in | ios::out | ios::binary);
               if (!archivo){
                cout<<"Error al abrir el archivo "<<endl;
                }
 //Buscar al empleado mediante el codigo ingresado por el usuario
  while(archivo.read((char*)&empleado, sizeof(Empleado))){
        if(empleado.codigo==codigo){
        encontrado=true;
        //Eliminar del archivo binario al empleado encontrado
        archivo.seekp(-sizeof(Empleado), ios::cur);
        Empleado vacio={0};
        archivo.write((char*)&vacio, sizeof(Empleado));
        //Generar la carta de despido en archivo de texto
        char nombre_archivo[50];
        strcpy(nombre_archivo, "Carta_despido_");
        strcat(nombre_archivo, empleado.nombres);
        strcat(nombre_archivo, ".txt");
        ofstream carta(nombre_archivo);
        carta<<"Estimado/a "<<empleado.nombres<<" "<<empleado.apellidos<<endl;
        carta<<"Le comunicamos que a partir de la fecha se ha decidido prescindir de sus servicios en la empresa. "<<endl;
        carta<<"Le agradecemos por los servicios prestados y le deseamos Èxito en sus futuros proyectos <3 "<<endl;
        carta<<"Atentamente "<<endl;
        carta<<" Minosaurios Tech "<<endl;
        carta.close();
     //Guardar la informacion del empleado despedido en el vector
        despedidos.push_back(empleado);
        cout<<"El empleado "<<empleado.nombres<<" ha sido despedido"<<endl;
        ofstream archivo_despedidos("Despedidos.txt");
             for (int i = 0; i < despedidos.size(); i++) {
                  archivo_despedidos<<"Los empleados despedidos son: "<<endl;
                  archivo_despedidos<<"Codigo: "<<despedidos[i].codigo <<endl;
                  archivo_despedidos<<"Nombre: "<< despedidos[i].nombres <<endl;
                  archivo_despedidos<<"Apellido:  " << despedidos[i].apellidos <<endl;
                  archivo_despedidos<<"Celular:  "<<despedidos[i].celular << " "<<endl;
             }
             archivo_despedidos.close();
                                               
         }
    }
                //Si no coincide un empleado con el codigo ingresado se muestra lo siguiente
                if(!encontrado){
                                cout<<"No se encontro al empleado con el codigo "<<codigo<<endl;
                }
               
                archivo.close(); 
}
//Funcion que muestra un vector con los empleados despedidos
void Imprimir_despedidos() {
    // Abrir el archivo en modo de lectura
    ifstream archivo_despedidos("Despedidos.txt");
    
    // Leer el contenido del archivo línea por línea
    string linea;
    while (getline(archivo_despedidos, linea)) {
        // Imprimir cada línea 
        cout << linea << endl;
    }
    
    // Cerrar el archivo
    archivo_despedidos.close();
   
}

