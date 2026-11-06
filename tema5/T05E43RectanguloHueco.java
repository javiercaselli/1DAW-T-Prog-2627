package tema5;

public class T05E43RectanguloHueco {
    public static void main(String[] args) {
        // Variables
        int anchura = 0;
        int altura = 0;

        // Datos por teclado
        try {
            while (anchura < 2) {
                System.out.print("Introduce la anchura del rectángulo (mínimo 2): ");
                anchura = Integer.parseInt(System.console().readLine());
                if (anchura < 2) {
                    System.out.println("ERROR: La anchura debe ser como mínimo de valor 2");
                }

            }
            while (altura < 2) {
                System.out.print("Introduce la altura del rectángulo (mínimo 2): ");
                altura = Integer.parseInt(System.console().readLine());
                if (altura < 2) {
                    System.out.println("ERROR: La anchura debe ser como mínimo de valor 2");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\033[38;5;9mERROR: Se debe introducir un número entero.\033[0m");
        }

        // Dibujar el rectángulo
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (i == 0 || i == altura - 1) {
                    // Si estamos en la primera o última fila se pintan todos los asteriscos
                    System.out.print("* ");
                } else {
                    // En otro caso pintamos solo las "paredes", o sea, primer y último elemento de la fila.
                    if (j == 0 || j == anchura - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.err.println();
        }
    }
}
