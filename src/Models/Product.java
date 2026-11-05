package Models;

public class Product {

    private String nombre;
    private Double precio;
    private Integer cantidad;
    private Integer descuento;

    public Product(String nombre, Double precio, Integer cantidad, Integer descuento){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }
}