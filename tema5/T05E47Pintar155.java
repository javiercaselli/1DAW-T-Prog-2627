package tema5;

public class T05E47Pintar155 {
    public static void main(String[] args) {
        // Variables
        int altura = 0;
        int numEspacios = 0;
        String espacios = "";

        // Datos por teclado
        try {
            while (altura < 5) {
                System.out.print("Introduce la altura (mínimo 5): ");
                altura = Integer.parseInt(System.console().readLine());
                if (altura < 5) {
                    System.out.println("ERROR: La altura debe ser como mínimo de valor 5");
                }
            }
            while (numEspacios < 1) {
                System.out.print("Introduce el número de espacios entre los números (mínimo 1): ");
                numEspacios = Integer.parseInt(System.console().readLine());
                if (numEspacios < 1) {
                    System.out.println("ERROR: Los espacios entre números deben ser como mínimo de valor 1");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\033[38;5;9mERROR: Se debe introducir un número entero.\033[0m");
        }
        // Genera cadena de caracteres con los espacios requeridos
        for (int i = 0; i < numEspacios; i++) {
            espacios += " ";
        }


        // Genera Lineas horizontales del 155
        String lineasHorizontales = "*" + espacios + "****" + espacios + "****\n";
        // Genera líneas verticales a la izquierda del 155
        String lineasVertIzq = "*" + espacios + "*   " + espacios + "*   \n";
        // Genera líneas verticales a la derecha del 155
        String lineasVertDer = "*" + espacios + "    *" + espacios + "    *\n";

        // Parte superior del número 155
        System.out.print(lineasHorizontales);
        System.out.print(lineasVertIzq);
        System.out.print(lineasHorizontales);
        
    }
}
