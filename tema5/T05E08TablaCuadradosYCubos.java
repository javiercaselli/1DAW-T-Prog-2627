package tema5;

public class T05E08TablaCuadradosYCubos {
    public static void main(String[] args) {
        // Constantes
        final int ITERACIONES = 5;

        // Variables
        int numero;
        int iteraciones;

        // Pide número por teclado
        System.out.print("Introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca iteraciones: ");
        iteraciones = Integer.parseInt(System.console().readLine());
        System.out.println();

        // Cabecera
        System.out.println("  n  |    n2    |    n3");
        System.out.println("---------------------------");

        // Bucle para hacer los cálculos y mostrarlos por pantalla
        for (int i = 0; i < iteraciones; i++) {
            int pasoActual = numero + i;
            System.out.printf("  %-3d|    %-6.0f|    %-6.0f    \n", pasoActual, Math.pow(pasoActual, 2), Math.pow(pasoActual, 3));
        }


    }
}
