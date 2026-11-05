package Services;

import java.util.Scanner;
import Interfaces.LecturaEntrada;

// Servicio de validación de entrada de datos por la consola.
public class LecturaConsolaService implements LecturaEntrada {
    
    private final Scanner escaner;

    public LecturaConsolaService(Scanner escaner) {
        this.escaner = escaner;
    }

    @Override 
    public String leerEntrada(String mensaje) {
        System.out.print(mensaje);
        return escaner.nextLine();
    }

    @Override
    public int leerEntero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(leerEntrada(mensaje).trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese un número entero válido.");
            }
        }
    }

    @Override
    public double leerDouble(String mensaje) {
        while (true) {
            try {
                return Double.parseDouble(leerEntrada(mensaje).trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese un número válido (ej. 12.50).");
            }
        }
    }

}
