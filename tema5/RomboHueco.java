package tema5;

public class RomboHueco {
    public static void main(String[] args) {
        // Variables
        String relleno = "";
        int altura = 0;

        // caracter de relleno por teclado
        while (relleno.length() != 1) {
            System.out.print("Introduce el caracter de relleno: ");
            relleno = System.console().readLine();
        }

        // Petición de la altura por teclado
        try {
            while (altura <= 0) {
                System.out.print("Introduce un número entero positivo: ");
                altura = Integer.parseInt(System.console().readLine());
            }
        } catch (NumberFormatException e) {
            System.out.println("\033[38;5;9mERROR: Se debe introducir un número entero positivo.\033[0m");
        }

        // Pirámide del derecho
        int ancho = 1;
        int desplazamiento = altura - 1;
        for (int i = 0; i < altura; i++) {
            // Desplaza los espacios necesarios para que la pirámide quede centrada
            for (int k = 0; k < desplazamiento; k++) {
                System.out.print(" ");
            }
            // pinta la fila
            for (int j = 0; j < ancho; j++) {
                if (j == 0 || j == ancho -1) {
                    System.out.print(relleno);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            ancho += 2;
            desplazamiento--;
        }

        // Pirámide del revés (menos la primera fila de la base)
        ancho -= 4;
        desplazamiento += 2;
        // El primer for define cada fila o piso de la pirámide
        for (int i = 0; i < altura - 1; i++) {
            // Desplaza los espacios necesarios para que la pirámide quede centrada
            for (int k = 0; k < desplazamiento; k++) {
                System.out.print(" ");
            }
            // pinta la fila
            for (int j = 0; j < ancho; j++) {
                if (j == 0 || j == ancho -1) {
                    System.out.print(relleno);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            ancho -= 2;
            desplazamiento++;
        }

    }
}
