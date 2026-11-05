package Services;

import Models.Product;
import java.util.List;

public class MostrarListadoImporteService {
    public void mostrarListadoImporte(List<Product> productos) {
        CalcularSubtotalService calcularSubtotalService = new CalcularSubtotalService();

        System.out.println("Listado de productos:");
        for (Product producto : productos) {
            System.out.printf("Nombre: %s, Precio: %.2f, Cantidad: %d, Descuento: %d%%, Subtotal: %.2f%n",
            producto.getNombre(), producto.getPrecio(), producto.getCantidad(), producto.getDescuento(),
            calcularSubtotalService.calcularSubtotal(producto.getPrecio(), producto.getCantidad(), producto.getDescuento()));
        }
    }
}
