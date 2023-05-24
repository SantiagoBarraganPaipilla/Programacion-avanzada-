import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Cargable {
    void cargar();
}

class ProductoElectronico {
    protected String nombre;
    protected double precio;
    protected int garantia;

    public ProductoElectronico(String nombre, double precio, int garantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getGarantia() {
        return garantia;
    }
}

class Celular extends ProductoElectronico implements Cargable {
    private int cargaInicial;

    public Celular(String nombre, double precio, int garantia, int cargaInicial) {
        super(nombre, precio, garantia);
        this.cargaInicial = cargaInicial;
    }

    @Override
    public void cargar() {
        System.out.println("Cargando el celular " + nombre + " con una carga inicial de " + cargaInicial + "%");
    }

    public void hacerLlamada(String numero) {
        System.out.println("Haciendo una llamada al número " + numero);
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
}

class Computadora extends ProductoElectronico implements Cargable {
    private String sistemaOperativo;

    public Computadora(String nombre, double precio, int garantia, String sistemaOperativo) {
        super(nombre, precio, garantia);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void cargar() {
        System.out.println("Cargando la computadora " + nombre + " con una fuente de poder externa");
    }

    public void ejecutarPrograma(String programa) {
        System.out.println("Ejecutando el programa: " + programa);
    }

    public void reiniciar() {
        System.out.println("Reiniciando la computadora");
    }
}

public class TiendaElectronica {
    private static Scanner scanner = new Scanner(System.in);
    private static List<ProductoElectronico> listaProductos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        while (true) {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearCelular();
                    break;
                case 2:
                    crearComputadora();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n----- MENÚ -----");
        System.out.println("1. Crear celular");
        System.out.println("2. Crear computadora");
        System.out.println("3. Mostrar productos");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
    }

    public static void crearCelular() {
        System.out.print("\nIngrese el nombre del celular: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio del celular: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la garantía del celular: ");
        int garantia = scanner.nextInt();
        System.out.print("Ingrese la carga inicial del celular: ");
        int cargaInicial = scanner.nextInt();

        Celular celular = new Celular(nombre, precio, garantia, cargaInicial);
        listaProductos.add(celular);

        System.out.println("Celular creado y agregado a la lista.");
    }

    public static void crearComputadora() {
        System.out.print("\nIngrese el nombre de la computadora: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio de la computadora: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la garantía de la computadora: ");
        int garantia = scanner.nextInt();
        System.out.print("Ingrese el sistema operativo de la computadora: ");
        String sistemaOperativo = scanner.next();

        Computadora computadora = new Computadora(nombre, precio, garantia, sistemaOperativo);
        listaProductos.add(computadora);

        System.out.println("Computadora creada y agregada a la lista.");
    }

    public static void mostrarProductos() {
        System.out.println("\n----- PRODUCTOS -----");

        for (ProductoElectronico producto : listaProductos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Garantía: " + producto.getGarantia());

            if (producto instanceof Cargable) {
                Cargable cargable = (Cargable) producto;
                cargable.cargar();
            }

            if (producto instanceof Celular) {
                Celular celular = (Celular) producto;
                celular.hacerLlamada("123456789");
            } else if (producto instanceof Computadora) {
                Computadora computadora = (Computadora) producto;
                computadora.ejecutarPrograma("Microsoft Word");
            }

            System.out.println("--------------------");
        }
    }
}
