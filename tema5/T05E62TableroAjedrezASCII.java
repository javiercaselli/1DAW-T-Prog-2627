package tema5;

public class T05E62TableroAjedrezASCII {
    public static void main(String[] args) {
        // variables
        int filas = 0;
        int columnas = 0;

        // Recogida de datos por teclado
        while (!(filas >= 3 && filas <= 20)) {
            try {
                System.out.print("Introduzca número de filas (3-20): ");
                filas = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Debe introducirse un número entero entre 3 y 20");
            }
        }
        while (columnas < 3 || columnas > 20) {
            try {
                System.out.print("Introduzca número de columnas (3-20): ");
                columnas = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Debe introducirse un número entero entre 3 y 20");
            }
        }

        // Pinta el marco
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 ) {
                    System.out.print("#");
                } else {
                    if (j == 0 || j == columnas - 1) {
                        System.out.print("#");
                    } else {
                        if ((j+i) % 2 == 0) {
                            System.out.print("X");
                        } else {
                            System.out.print(".");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
