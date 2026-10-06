package programacion.aplicada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public List<String> getMenuOptions() {
        List<String> opciones = new ArrayList<>();
        opciones.add("1. Saludar");
        opciones.add("2. Mostrar mensaje");
        opciones.add("0. Salir");
        return opciones;
    }

    public void mostrarMenu() {
        System.out.println("=== MENÚ ===");
        for (String opcion : getMenuOptions()) {
            System.out.println(opcion);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            app.mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("¡Hola mundo!");
                case 2 -> System.out.println("Bienvenido al menú.");
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println();
        }
    }
}
