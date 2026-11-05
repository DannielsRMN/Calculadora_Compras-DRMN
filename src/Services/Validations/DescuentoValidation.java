package Services.Validations;

import Interfaces.ReglaValidation;
import Models.Product;

public class DescuentoValidation implements ReglaValidation{

    private static final int DESCUENTO_MINIMO = 0;
    private static final int DESCUENTO_MAXIMO = 100;

    @Override 
    public void validar(Product producto) {
        int descuento = producto.getDescuento();
        if (descuento < DESCUENTO_MINIMO || descuento > DESCUENTO_MAXIMO) {
            throw new IllegalArgumentException("El descuento debe estar entre " + DESCUENTO_MINIMO + "% y " + DESCUENTO_MAXIMO + "%.");
        }
    }
}
