package Services;

import Interfaces.LecturaEntrada;
import Models.Product;
import java.util.List;
import Services.Validations.ProductoValidation;

public class GuardarProductoService {

    private final LecturaEntrada lectura;
    private final ProductoValidation productoValidation = new ProductoValidation();

    public GuardarProductoService(LecturaEntrada lectura) {
        this.lectura = lectura;
    }

    public void guardarProducto(List<Product> productos) {
        String nombre = lectura.leerEntrada("Ingrese el nombre del producto: ");
        double precio = lectura.leerDouble("Ingrese el precio del producto: ");
        int cantidad = lectura.leerEntero("Ingrese la cantidad del producto: ");
        int descuento = lectura.leerEntero("Ingrese el descuento del producto (0-100%): ");

        try {
            Product nuevo = new Product(nombre, precio, cantidad, descuento);
            productoValidation.validarProducto(nuevo);
            productos.add(nuevo);
            System.out.println("Producto agregado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
