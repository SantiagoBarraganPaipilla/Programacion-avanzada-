/*Estás desarrollando un programa para una tienda de productos electrónicos. Tienes diferentes tipos do productos, como televisores, smartphones y computadorar. Cada uno de ellos tiene algunas caraeteríticas comunes, como el precio, la marca y la descripción.
Crea una clase abstracta llamada ProductoElectronico" que contenga los atributos comunes a todos los preduetos electrónicos, como el precio, la marca y la descripción. Esta clase debe tener un método abstracto llamado calcularDescuento" que calculo el descuento aplicable al producto. Crea clases derivadas de "Productoflectronico* para cada tipo de producto específico, "Televisor", "Smartphone" y
"Computadora*. Estas clases deben implementar el método abstracto "calcula Descuento" de acuerdo con las reglas específicas de descuento para cada tipo de producto.
Los televisores tienen un descuento fijo del 10%, mientras que los smartphones un descuento del 5% sobre el precio actual y las computadoras 15%. Crea una clase principal llamada "TiendaElectronica" donde puedas crear instancias de diferentes productos electrónicos y mostrar su información, incluido el
descuento aplicable.*/

//Codigo Santiago Barragn Paipilla & Natalia Catalina Guzman Fuentes 
abstract class ProductoElectronico {
    private double precio;
    private String marca;
    private String descripcion;

    public ProductoElectronico(double precio, String marca, String descripcion) {
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double calcularDescuento();
}

class Televisor extends ProductoElectronico {
    public Televisor(double precio, String marca, String descripcion) {
        super(precio, marca, descripcion);
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.1;
    }
}

class Smartphone extends ProductoElectronico {
    public Smartphone(double precio, String marca, String descripcion) {
        super(precio, marca, descripcion);
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.05;
    }
}

class Computadora extends ProductoElectronico {
    public Computadora(double precio, String marca, String descripcion) {
        super(precio, marca, descripcion);
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.15;
    }
}

public class TiendaElectronica {
    public static void main(String[] args) {
        Televisor televisor = new Televisor(1000.0, "Samsung", "Televisor 4K");
        Smartphone smartphone = new Smartphone(500.0, "Apple", "iPhone 12");
        Computadora computadora = new Computadora(1500.0, "Dell", "Laptop Inspiron");

        System.out.println("Detalles del Televisor:");
        System.out.println("Precio: " + televisor.getPrecio());
        System.out.println("Marca: " + televisor.getMarca());
        System.out.println("Descripción: " + televisor.getDescripcion());
        System.out.println("Descuento: " + televisor.calcularDescuento());
        System.out.println();

        System.out.println("Detalles del Smartphone:");
        System.out.println("Precio: " + smartphone.getPrecio());
        System.out.println("Marca: " + smartphone.getMarca());
        System.out.println("Descripción: " + smartphone.getDescripcion());
        System.out.println("Descuento: " + smartphone.calcularDescuento());
        System.out.println();

        System.out.println("Detalles de la Computadora:");
        System.out.println("Precio: " + computadora.getPrecio());
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Descripción: " + computadora.getDescripcion());
        System.out.println("Descuento: " + computadora.calcularDescuento());
    }
}
