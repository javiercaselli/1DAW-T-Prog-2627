package examenT1T2T3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // variables
        String producto;
        double precio;
        int unidades, iva;
        Scanner sc = new Scanner(System.in);

        // cabecera
        System.out.println("=== BYTEZONE TERMINAL ===");

        // Entrada por teclado
        System.out.print("Introduce nombre del producto: ");    // Lee descripción del producto
        producto = sc.nextLine();
        System.out.print("Introduce precio unitario (€): ");    // Lee precio
        precio = sc.nextDouble();
        System.out.print("Introduce unidades vendidas: ");      // Lee unidades vendidas
        unidades = sc.nextInt();
        System.out.print("Introduce IVA (%): ");                // Lee tipo IVA
        iva = sc.nextInt();

        // Cabecera Ticket
        System.out.println();
        System.out.print("\033[38;5;45m");                      // Pone color cyan
        System.out.println("========================================");
        System.out.printf("%27s\n", "BYTECODE STORE");
        System.out.println("========================================");
        System.out.print("\033[0m");                            // Vuelve a formato estándar

        // Datos Ticket
        System.out.println("Producto : " + producto);
        System.out.printf("Detalle  : %d ud. x %.2f €\n", unidades, precio);
        double subtotal = precio * unidades;
        System.out.printf("Subtotal :%28.2f €\n", subtotal);
        double importeIVA = subtotal * iva / 100;
        System.out.print("\033[38;5;220m");                      // Pone color amarillo
        System.out.printf("IVA (%d%%):%28.2f €\n", iva, importeIVA);
        System.out.print("\033[0m");                            // Vuelve a formato estándar
        
        // Total ticket
        double total = subtotal + importeIVA;
        System.out.println("----------------------------------------");
        System.out.print("\033[38;5;46m\033[1m");               // Pone color verde y negrita
        System.out.printf("TOTAL    :%28.2f €\n", total);
        System.out.print("\033[0m");                            // Vuelve a formato estándar
        System.out.println("========================================");
        System.out.println("¡Gracias por su compra!");










        // Cierra scanner
        sc.close();
    }
}
