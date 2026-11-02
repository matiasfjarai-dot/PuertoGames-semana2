package app;

import model.Cliente;

/** Punto de entrada del programa de registro de clientes de PuertoGames. */
public class Main {
    /** Crea un cliente de ejemplo y muestra sus datos por consola. */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(
                "matias jara",
                "matias.jara@gmail.com",
                "912345678",
                "Los Alerces",
                125,
                "maipu",
                "santiago"
        );

        System.out.println("=== REGISTRO DE CLIENTE PUERTOGAMES ===");
        System.out.println(cliente1.toString());
    }
}
