package examenT1T2T3;

import java.util.Scanner;

public class TicketTiendaTango {
    public static void main(String[] args) {
        // variables
        int codigo, descuento, unidades;
        double precio;
        Scanner sc = new Scanner(System.in);
        
        // titulo
        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("=========================");

        // Datos por teclado
        System.out.print("Introduce el código del artículo: ");
        codigo = sc.nextInt();
        System.out.print("Introduce el precio: ");
        precio = sc.nextDouble();
        System.out.print("Introduce las unidades vendidas: ");
        unidades = sc.nextInt();
        System.out.print("Introduce descuento: ");
        descuento = sc.nextInt();

        // Cáculos
        double totalSinDescuento = precio * unidades;
        double eurosDescuento = totalSinDescuento * (descuento / 100.0);
        double iva = (totalSinDescuento) * 0.16;

        // Ejemplo justificando la primera columna
        System.out.println("\nSu ticket:\n");
        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("=========================");

        System.out.printf("%-14d%.2f €\n", codigo, precio);
        System.out.printf("%-14s%.2f €\n", unidades + " unidades", totalSinDescuento);
        System.out.printf("-%-14s%.2f €\n", descuento + "%", eurosDescuento);
        System.out.printf("%-14s%.2f €\n", "16% IVA", iva);
        System.out.printf("\033[48;5;250m%-14s%.2f €\033[0m\n", "TOTAL", totalSinDescuento - eurosDescuento + iva);
        
        // Ejemplo justificando la segunda columna
        System.out.println("\nSu ticket:\n");
        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("=========================");

        System.out.printf("%d%12.2f €\n", codigo, precio);
        System.out.printf("%d unidades%12.2f €\n", unidades, totalSinDescuento);
        System.out.printf("-%s%%%12.2f €\n", descuento, eurosDescuento);
        System.out.printf("16%% IVA%12.2f €\n", iva);
        System.out.printf("\033[48;5;250mTOTAL%12.2f €\033[0m\n", totalSinDescuento - eurosDescuento + iva);
        
        // Ejemplo justificando ambas columnas
        System.out.println("\nSu ticket:\n");
        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("=========================");

        System.out.printf("%-14d%7.2f €\n", codigo, precio);
        System.out.printf("%-14s%7.2f €\n", unidades + " unidades", totalSinDescuento);
        System.out.printf("%-14s%7.2f €\n", "-" + descuento + "%", eurosDescuento);
        System.out.printf("%-14s%7.2f €\n", "16% IVA", iva);
        System.out.print("\033[48;5;250m"); // Fondo gris
        System.out.printf("%-14s%7.2f €\n", "TOTAL", totalSinDescuento - eurosDescuento + iva);
        System.out.print("\033[0m");        // Reseteo a texto normal
        
        // cerramos el Scanner
        sc.close();
    }
}
