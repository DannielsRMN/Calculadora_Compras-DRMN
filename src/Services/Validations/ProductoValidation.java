package Services.Validations;

import Interfaces.ReglaValidation;
import Models.Product;
import java.util.List;

// Validación unificada para el producto ingresado
public class ProductoValidation {
    private final List<ReglaValidation> reglas = List.of(
        new DescuentoValidation(),
        new NombreValidation(),
        new PrecioValidation(),
        new CantidadValidation()
    );

    public void validarProducto(Product producto) {
        for (ReglaValidation regla : reglas) {
            regla.validar(producto);
        }
    }
}
