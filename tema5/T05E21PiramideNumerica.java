package tema5;

public class T05E21PiramideNumerica {
    public static void main(String[] args) {
        // Variables
        int altura = 0;

        // Obtengo datos por teclado
        while (altura > 9 || altura < 1) {
            System.out.print("Introduce la altura de la pirámide (1-9): ");
            altura = Integer.parseInt(System.console().readLine());
            if (altura > 9 || altura < 1) {
                System.out.println("ERROR: La altura debe ser un número entero entre 0 y 9.");
            }
        }

        // Pirámide numérica
        int i = 0;
        while (i < altura) {
            // Espacios en blanco antes de la pared de la pirámide
            int k = altura - i;
            while(k > 0) {
                System.out.print(" ");
                k--;
            }
            // suma desde 1 hasta el nivel actual
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            // Imprime el centro de la fila (i + 1)
            System.out.print(i + 1);
            // resta desde el centro de la fila (nivel actual) hasta el final (1)
            int l = i;
            while (l > 0) {
                System.out.print(l);
                l--;
            }
            // Salto de línea para la siguiente fila e incremento de i
            System.out.println();
            i++;
        }



    }
}
