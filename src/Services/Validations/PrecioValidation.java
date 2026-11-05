package Services.Validations;

import Interfaces.ReglaValidation;
import Models.Product;

public class PrecioValidation implements ReglaValidation {
    private static final double PRECIO_MINIMO = 0.01;

    @Override
    public void validar(Product product) {
        Double precio = product.getPrecio();
        if (precio < PRECIO_MINIMO) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
    }
    
}
