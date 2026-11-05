package Services;

import java.util.Scanner;

// Servicio para mejorar la lectura y comprensión de resultados en la consola.
public class PausaService {
    public void pausar(Scanner escaner){
        System.out.println("Presione Enter para continuar...");
        escaner.nextLine();
    }
}
