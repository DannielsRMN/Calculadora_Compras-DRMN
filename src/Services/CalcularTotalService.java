package Services;

import Models.Product;
import java.util.List;

public class CalcularTotalService {
    public Double calcularTotal(List<Product> productos) {
        Double total = 0.0;
        CalcularSubtotalService calcularSubtotalService = new CalcularSubtotalService();

        for (Product producto : productos) {
            total += calcularSubtotalService.calcularSubtotal(producto.getPrecio(), producto.getCantidad(), producto.getDescuento());
        }
        return total;
    }
}
