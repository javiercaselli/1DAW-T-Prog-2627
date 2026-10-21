package tema4;

import java.util.Scanner;

public class T04E13Piramide {
    public static void main(String[] args) {
        // variables
        String relleno;
        int opcion;
        Scanner sc = new Scanner(System.in);

        // Cabecera
        System.out.println("Este programa pinta una pirámide.");
        System.out.print("Introduzca el caracter de relleno: ");
        relleno = sc.nextLine();
        // Chequeo de longitud correcta
        if (relleno.length() != 1) {
            System.out.println("Error: el relleno debe ser un único caracter");
            sc.close();
            return;
        }

        System.out.println("Elija un tipo de pirámide:");
        System.out.println("1. Con el vértice hacia arriba.");
        System.out.println("2. Con el vértice hacia abajo.");
        System.out.println("3. Con el vértice hacia la izquierda.");
        System.out.println("4. Con el vértice hacia la derecha.");
        System.out.print("? ");
        opcion = sc.nextInt();

        String dosLosetas = relleno + relleno;
        String tresLosetas = dosLosetas + relleno;
        String cincoLosetas = dosLosetas + tresLosetas;

        //pintar pirámide en función de la opción
        if (opcion == 1) {
            System.out.println("  " + relleno);
            System.out.println(" " + tresLosetas);
            System.out.println(cincoLosetas);
        } else if (opcion == 2) {
            System.out.printf("%s\n", cincoLosetas);
            System.out.printf("%4s\n", tresLosetas);
            System.out.printf("%3s\n", relleno);
        } else if (opcion == 3) {
            System.out.printf("%3s\n", relleno);
            System.out.printf("%3s\n", dosLosetas);
            System.out.printf("%3s\n", tresLosetas);
            System.out.printf("%3s\n", dosLosetas);
            System.out.printf("%3s\n", relleno);
        } else if (opcion == 4) {
            System.out.printf("%s\n", relleno);
            System.out.printf("%s\n", dosLosetas);
            System.out.printf("%s\n", tresLosetas);
            System.out.printf("%s\n", dosLosetas);
            System.out.printf("%s\n", relleno);
        } else {
            System.out.println("Opción errónea");
        }


        // Cierra scanner
        sc.close();

    }
}
