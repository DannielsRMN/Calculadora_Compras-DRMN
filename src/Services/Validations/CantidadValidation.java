package Services.Validations;

import Interfaces.ReglaValidation;
import Models.Product;

public class CantidadValidation implements ReglaValidation {
    private static final int CANTIDAD_MINIMA = 1;
    private static final int CANTIDAD_MAXIMA = 100;
    
    @Override
    public void validar(Product product) {
        Integer cantidad = product.getCantidad();
        if (cantidad == null || cantidad < CANTIDAD_MINIMA || cantidad > CANTIDAD_MAXIMA) {
            throw new IllegalArgumentException("La cantidad debe estar entre " + CANTIDAD_MINIMA + " y " + CANTIDAD_MAXIMA + ".");
        }
    }
    
}
