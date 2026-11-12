package tema5;

/**
 * 
 * T05E61TableroRepresentacionNumero
 */
public class T05E61TableroRepresentacionNumero {
    public static void main(String[] args) {
        // Variables
        long numero = Long.MIN_VALUE;

        // Petición del número por teclado
        try {
            while (numero < 0) {
                System.out.print("Introduce un número entero positivo: ");
                numero = Long.parseLong(System.console().readLine());
            }
        } catch (NumberFormatException e) {
            System.out.println("\033[38;5;9mERROR: Se debe introducir un número entero positivo.\033[0m");
        }

        // Avergua el dígito más alto del número para saber el número de columnas
        long numeroAux = numero;
        long max = 0;
        while (numeroAux != 0) {
            long digitoActual = numeroAux % 10;
            max = (max < digitoActual) ? digitoActual : max;
            numeroAux = numeroAux / 10;
        }

        // Pintamos el número en una columna
        numeroAux = numero;
        while (numeroAux != 0) {
            long digitoActual = numeroAux % 10;
            numeroAux = numeroAux / 10;
            for (int i = 0; i <= max; i++) {
                if (i != max) {
                    System.out.print(" ---");
                } else {
                    System.out.println(" ---");
                }
            }
            // contenido de la tabla (celdas)
            for (int i = 0; i <= max; i++) {
                if (i == 0) {
                    System.out.print("| " + digitoActual + " ");
                } else if (i == max) {
                    if (i <= digitoActual) {
                        System.out.print("| * |");
                    } else {
                        System.out.print("|   |");
                    }
                } else {
                    if (i <= digitoActual) {
                        System.out.print("| * ");
                    } else {
                        System.out.print("|   ");
                    }
                }
            }
            System.out.println();
            // Borde inferior (solo se invoca cuando estamos en la última fila)
            if (numeroAux == 0) {
                for (int i = 0; i <= max; i++) {
                    if (i != max) {
                        System.out.print(" ---");
                    } else {
                        System.out.println(" ---");
                    }
                }
            }
        }

        // Lo mismo con String
        // String sNumero = String.valueOf(numero);
        // for (int i = 0; i < sNumero.length(); i++) {
        // System.out.println(sNumero.charAt(i));
        // }

    }
}
