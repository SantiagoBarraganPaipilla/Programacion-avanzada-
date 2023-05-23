/******************************************************************************
* Autores: Santiago Barragan Paipilla & Natalia Catalina Guzman Fuentes 
* Proyecto Galeria de Arte 
* Programacion Avanzada 
* Entrega: 21 de mayo 2023
* Sustentacion: 24 de mayo 2023
*******************************************************************************/
//Librerias utilizadas 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Clase cliente 
class Cliente {
	//Atributos de clase 
    private String nombre;
    private String direccion;
    private String email;
    private ControlCliente controlCliente;
    //Metodo constructor
    public Cliente(String nombre, String direccion, String email, ControlCliente controlCliente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.controlCliente = controlCliente;
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ControlCliente getControlCliente() {
        return controlCliente;
    }

    public void setControlCliente(ControlCliente controlCliente) {
        this.controlCliente = controlCliente;
    }
    
    //Metodos propios de la  clase

    public void agregarCliente() {
        controlCliente.agregarCliente(this);
    }

    public void eliminarCliente() {
        controlCliente.eliminarCliente(this);
    }

    public void listarCompras() {
        controlCliente.listarCompras(this);
    }
} //Fin clase Cliente

//Clase Control Cliente
class ControlCliente {
	//Creacion  de lista de clientes
    private List<Cliente> clientes;
   // Metodo constructor  
    public ControlCliente() {
        clientes = new ArrayList<>();
    }
 // Metodos de clase 
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    //Metodo necesario para listar las compras del cliente
    public void listarCompras(Cliente cliente) {
        
    }
}//Fin clase Control Cliente

//Clase Obra
class Obra {
	//Atributos de clase
    private String titulo;
    private String tecnica;
    private int año;
    private double precio;
    private Artista artista;
    //Metodo constructor
    public Obra(String titulo, String tecnica, int año, double precio, Artista artista) {
        this.titulo = titulo;
        this.tecnica = tecnica;
        this.año = año;
        this.precio = precio;
        this.artista = artista;
    }
    // Getters y setters para los atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Agregar el artista de la obra agregada 
    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}//Fin clase Obra

//Clase Artista
class Artista {
	//Atributos de clase 
    private String nombre;
    private String fechaNacimiento;
    private String nacionalidad;
    private String biografia;
    //Metodo constructor
    public Artista(String nombre, String fechaNacimiento, String nacionalidad, String biografia) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }
    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
} //Fin clase Artista

//Clase Gestion Obras 
class GestionObras {
	//Crear lista de obras 
    private List<Obra> obras;
    //Metodo constructos
    public GestionObras() {
        obras = new ArrayList<>();
    }
    //Metodos de clase
    public void agregarObra(Obra obra) {
        obras.add(obra);
    }

    public void eliminarObra(Obra obra) {
        obras.remove(obra);
    }
 // Imprimir información de la obra
    public void listarObras() {
        for (Obra obra : obras) {
        }
    }
}//Fin clase GestionObras

//Clase Compra 
class Compra {
	//Atributos de clase
    private String fecha;
    private double precio;
    private Cliente cliente;
    private Obra obra;
    //Metodo constructor
    public Compra(String fecha, double precio, Cliente cliente, Obra obra) {
        this.fecha = fecha;
        this.precio = precio;
        this.cliente = cliente;
        this.obra = obra;
    }
    // Getters y setters para los atributos
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
}//Fin clase Compra

//Clase Control Galeria
class ControlGaleria {
	//Se crean las 3 listas del programa
    private List<Artista> artistas;
    private List<Obra> obras;
    private List<Compra> compras;
    //Metodo constructor 
    public ControlGaleria() {
        artistas = new ArrayList<>();
        obras = new ArrayList<>();
        compras = new ArrayList<>();
    }
    //Metodos llamados de las diferentes clases del programa
    public void agregarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void eliminarArtista(Artista artista) {
        artistas.remove(artista);
    }

    public void agregarObra(Obra obra) {
        obras.add(obra);
    }

    public void eliminarObra(Obra obra) {
        obras.remove(obra);
    }
    //Imprimir las 3 listas 
    public void listarObras() {
        for (Obra obra : obras) {
            // Imprimir información de la obra
            System.out.println("Título: " + obra.getTitulo());
            System.out.println("Técnica: " + obra.getTecnica());
            System.out.println("Año: " + obra.getAño());
            System.out.println("Precio: " + obra.getPrecio());
            System.out.println("Artista: " + obra.getArtista().getNombre());
            System.out.println("--------------------------------------");
        }
    }

    public void listarArtistas() {
        for (Artista artista : artistas) {
            // Imprimir información del artista
            System.out.println("Nombre: " + artista.getNombre());
            System.out.println("Fecha de nacimiento: " + artista.getFechaNacimiento());
            System.out.println("Nacionalidad: " + artista.getNacionalidad());
            System.out.println("Biografía: " + artista.getBiografia());
            System.out.println("--------------------------------------");
        }
    }

    public void realizarCompra(Compra compra) {
        compras.add(compra);
    }

    public void listarCompras() {
        for (Compra compra : compras) {
            // Imprimir información de la compra
            System.out.println("Fecha: " + compra.getFecha());
            System.out.println("Precio: " + compra.getPrecio());
            System.out.println("Cliente: " + compra.getCliente().getNombre());
            System.out.println("Obra: " + compra.getObra().getTitulo());
            System.out.println("--------------------------------------");
        }
    }
    //Se usa el metodo para validar que el titulo o el nombre sea el ingresado por el usuario y se pueda eliminar 
    public Obra buscarObraPorNombre(String titulo) {
        for (Obra obra : obras) {
            if (obra.getTitulo().trim().equals(titulo.trim())) {
                return obra;
            }
        }
        //Si no se encuentra la obra se devuelve null
        return null;
    }
    public Artista buscarArtistaPorNombre(String nombre) {
    for (Artista artista : artistas) {
        if (artista.getNombre().trim().equals(nombre.trim())) {
            return artista;
        }
    }
 // Si no se encuentra el artista, se devuelve null
    return null;  
   }
} //Fin clase ControlGaleria 

//Clase principal, Pantalla Galeria 
public class PantallaGaleria {
    private ControlGaleria controlGaleria;
    //Metodo constructor
    public PantallaGaleria(ControlGaleria controlGaleria) {
        this.controlGaleria = controlGaleria;
    }
    //Metodos de la clase
    public void mostrarObras() {
        controlGaleria.listarObras();
    }

    public void mostrarArtistas() {
        controlGaleria.listarArtistas();
    }

    public void mostrarCompras() {
        controlGaleria.listarCompras();
    }
    //Main, donde el usuario podra interactuar con todos los metodos de las clases del programa 
    public static void main(String[] args) {
        // Crear objetos de prueba
        ControlGaleria controlGaleria = new ControlGaleria();
        ControlCliente controlCliente = new ControlCliente();
        PantallaGaleria pantallaGaleria = new PantallaGaleria(controlGaleria);
        Scanner scanner = new Scanner(System.in);
        // Agregar obras, artistas y compras
        System.out.println("\n--------------------------------------------------------------------------------\n" + 
        		"\n" + 
        		"        \">> BIENVENIDO A LA GALERÍA DE ARTE: El Cactus Volador <<\"\"\n" + 
        		"\n" + 
        		"--------------------------------------------------------------------------------\n" + 
        		"\n" + 
        		"Que desea hacer?");

        while (true) {
        	System.out.println("------------------------");
            System.out.println("1. Agregar obra");
            System.out.println("2. Agregar artista");
            System.out.println("3. Realizar compra");
            System.out.println("0. Ir al siguiente menu:");
            System.out.println("------------------------");

            System.out.print("Ingrese una opción: \n");
            System.out.println(">>");
            int opcion = scanner.nextInt();
            scanner.nextLine(); //Salto de línea

            if (opcion == 0) {
                break;
            }
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la obra: ");
                    String nombreObra = scanner.nextLine();
                    System.out.print("Ingrese la descripción de la obra: ");
                    String descripcionObra = scanner.nextLine();
                    System.out.print("Ingrese el año de creación de la obra: ");
                    int anioObra = scanner.nextInt();
                    System.out.print("Ingrese el precio de la obra: ");
                    double precioObra = scanner.nextDouble();
                    scanner.nextLine(); //salto de línea
                    System.out.print("Ingrese el nombre del artista de la obra: ");
                    String nombreArtistaObra = scanner.nextLine();
                    System.out.print("Ingrese la fecha de nacimiento del artista (dd/mm/aa): ");
                    String fechaNacimientoArtista = scanner.nextLine();
                    System.out.print("Ingrese el país del artista: ");
                    String paisArtista = scanner.nextLine();
                    System.out.print("Ingrese la biografía del artista: ");
                    String biografiaArtista = scanner.nextLine();
                    System.out.println(">> Obra agregada correctamente <<");
                    //Crea obejtos de artista y obra 
                    Artista artistaObra = new Artista(nombreArtistaObra, fechaNacimientoArtista, paisArtista, biografiaArtista);
                    Obra obra = new Obra(nombreObra, descripcionObra, anioObra, precioObra, artistaObra);
                    //Agregar obra 
                    controlGaleria.agregarObra(obra);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del artista: ");
                    String nombreArtista = scanner.nextLine();
                    System.out.print("Ingrese la fecha de nacimiento del artista (dd/mm/aa): ");
                    String fechaNacimiento = scanner.nextLine();
                    System.out.print("Ingrese el país del artista: ");
                    String pais = scanner.nextLine();
                    System.out.print("Ingrese la biografía del artista: ");
                    String biografia = scanner.nextLine();
                    System.out.println(">> Artista agregado correctamente <<");
                    //Crea objeto artista 
                    Artista artista = new Artista(nombreArtista, fechaNacimiento, pais, biografia);
                    //Agregar artista
                    controlGaleria.agregarArtista(artista);
                    break;
                case 3:
                    System.out.print("Ingrese la fecha de compra (dd/mm/aa): ");
                    String fechaCompra = scanner.nextLine();
                    System.out.print("Ingrese el monto de la compra: ");
                    double montoCompra = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Ingrese la dirección del cliente: ");
                    String direccionCliente = scanner.nextLine();
                    System.out.print("Ingrese el correo electrónico del cliente: ");
                    String correoCliente = scanner.nextLine();
                    //Agrega cliente
                    Cliente cliente = new Cliente(nombreCliente, direccionCliente, correoCliente, controlCliente);
                    System.out.print("Ingrese el nombre de la obra comprada: ");
                    String nombreObraCompra = scanner.nextLine();
                    Obra obraCompra = controlGaleria.buscarObraPorNombre(nombreObraCompra);
                    if (obraCompra != null) {
                    	//Crea objeto compra
                        Compra compra = new Compra(fechaCompra, montoCompra, cliente, obraCompra);
                        //Agregar compra
                        controlGaleria.realizarCompra(compra);
                        System.out.println(">> Compra realizada correctamente <<");
                     } else {
                        System.out.println("La obra especificada no existe. La compra no se realizó.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo nuevamente.");
                    break;
            }
        }
        // Mostrar obras, artistas y compras
        System.out.println("Obras:");
        pantallaGaleria.mostrarObras();
        System.out.println();
        System.out.println("Artistas:");
        pantallaGaleria.mostrarArtistas();
        System.out.println();
        System.out.println("Compras:");
        pantallaGaleria.mostrarCompras();
        System.out.println();
        
        // Eliminar obras y artistas ingresados por el usuario
        System.out.println("Eliminar obras y artistas");
        while (true) {
            System.out.println("1. Eliminar obra");
            System.out.println("2. Eliminar artista");
            System.out.println("0. Salir del programa");
            System.out.print("Ingrese una opción: ");
            int opcionEliminar = scanner.nextInt();
            scanner.nextLine(); //salto de línea
            if (opcionEliminar == 0) {
                break;
            }
            switch (opcionEliminar) {
                case 1:
                    System.out.print("Ingrese el nombre de la obra a eliminar: ");
                    String nombreObraEliminar = scanner.nextLine();
                    Obra obraEliminar = controlGaleria.buscarObraPorNombre(nombreObraEliminar);
                    if (obraEliminar != null) {
                        controlGaleria.eliminarObra(obraEliminar);
                        System.out.println("Obra eliminada correctamente.");
                    } else {
                        System.out.println("No se encontró la obra especificada.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del artista a eliminar: ");
                    String nombreArtistaEliminar = scanner.nextLine();
                    Artista artistaEliminar = controlGaleria.buscarArtistaPorNombre(nombreArtistaEliminar);
                    if (artistaEliminar != null) {
                        controlGaleria.eliminarArtista(artistaEliminar);
                        System.out.println("Artista eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró el artista especificado.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo nuevamente.");
                    break;
            }
        }
        // Mostrar listas actualizadas
        System.out.println("Listas actualizadas:");
        System.out.println("Obras:");
        pantallaGaleria.mostrarObras();
        System.out.println();
        System.out.println("Artistas:");
        pantallaGaleria.mostrarArtistas();
        System.out.println();
        System.out.println("Compras:");
        pantallaGaleria.mostrarCompras();
        System.out.println();
    }
}// Fin clase PantallaGaleria 

//Fin del Programa 