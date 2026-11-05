package Services.Validations;

import Interfaces.ReglaValidation;
import Models.Product;

public class NombreValidation implements ReglaValidation {

    @Override
    public void validar(Product product) {
        String nombre = product.getNombre();
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
    }
}