import Services.MenuService;
import java.util.Scanner;

import Interfaces.LecturaEntrada;
import Models.Product;
import java.util.ArrayList;
import java.util.List;

import Services.GuardarProductoService;
import Services.LecturaConsolaService;
import Services.MostrarListadoImporteService;
import Services.CalcularTotalService;
import Services.MostrarTotalImporteService;
import Services.PausaService;

public class Main {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        List<Product> productos = new ArrayList<>();

        MenuService menuService = new MenuService();
        LecturaEntrada lectura = new LecturaConsolaService(escaner);
        GuardarProductoService guardarProductoService = new GuardarProductoService(lectura);
        MostrarListadoImporteService mostrarListadoImporteService = new MostrarListadoImporteService();
        CalcularTotalService calcularTotalService = new CalcularTotalService();
        MostrarTotalImporteService mostrarTotalImporteService = new MostrarTotalImporteService();
        PausaService pausaService = new PausaService();

        int opcion = 0;
        while (opcion != 3) {
            menuService.mostrarMenu();
            opcion = lectura.leerEntero("Ingrese su opción: ");
            switch (opcion) {
                case 1:
                    guardarProductoService.guardarProducto(productos);
                    break;
                case 2:
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                        pausaService.pausar(escaner);
                    } else {
                        mostrarListadoImporteService.mostrarListadoImporte(productos);
                        Double total = calcularTotalService.calcularTotal(productos);
                        mostrarTotalImporteService.mostrarImporte(total);
                        pausaService.pausar(escaner);
                    }
                    break;
                case 3:
                    System.out.println("Muchas Gracias <3");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}