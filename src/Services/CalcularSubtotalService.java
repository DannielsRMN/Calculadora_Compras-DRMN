package Services;

public class CalcularSubtotalService {
    public Double calcularSubtotal(Double precio, Integer cantidad, Integer descuento){
        Double subtotal = precio * cantidad * (1-(descuento / 100.0));
        return subtotal;
    }
}
