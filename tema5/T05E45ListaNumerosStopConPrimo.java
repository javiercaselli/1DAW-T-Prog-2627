package tema5;

public class T05E45ListaNumerosStopConPrimo {
    public static void main(String[] args) {
        // Variables
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int media = 0;
        int sumaMedia = 0;
        int elementosMedia = 0;
        boolean esPrimo = false;

        try {
            while (!esPrimo) {
                System.out.println("Introduce números enteros positivos.");
                System.out.print("Para terminar, introduzca un número primo: ");
                int numero = Integer.parseInt(System.console().readLine());
                // Comprobamos si es primo
                int i = 2;
                esPrimo = true;
                while (i < numero && esPrimo) {
                    if (numero % i == 0) {
                        esPrimo = false;
                    }
                    i++;
                }
                // Si no es primo, hacemos los cáculos
                if (!esPrimo) {
                    // Mínimo
                    min = (min > numero) ? numero : min;

                    // Máximo
                    max = (max < numero) ? numero : max;

                    // Media aritmética
                    elementosMedia++;
                    sumaMedia += numero;
                }
            }
            // Da los resultados
            System.out.printf("Ha introducido %d números no primos\n", elementosMedia);
            System.out.printf("Máximo: %d \n", max);
            System.out.printf("Mínimo: %d \n", min);
            System.out.printf("Media: %.2f \n", ((double) sumaMedia / elementosMedia));
            
        } catch (NumberFormatException e) {
            System.out.println("\033[38;5;9mERROR: Se debe introducir un número entero.\033[0m");
        }

    }
}
