package tema3;

public class EjemploParseadores {
    public static void main(String[] args) {
        String linea;
        System.out.print("Introduce un número entero: ");
        linea = System.console().readLine();

        int numeroEntero;
        numeroEntero = Integer.parseInt(linea);

        System.out.printf("El número es: %d\n", numeroEntero);
        System.out.printf("El doble del número es: %d\n", 2 * numeroEntero);

        System.out.print("Introduce un número real: ");
        linea = System.console().readLine();

        float numeroReal = Float.parseFloat(linea);
        System.out.printf("El número es: %.2f\n", numeroReal);

        // Ampliación (Long y Double)
        System.out.print("Introduce un número entero largo: ");
        linea = System.console().readLine();

        long numeroLong = Long.parseLong(linea);
        System.out.printf("El número largo es: %d\n", numeroLong);

        System.out.print("Introduce un número decimal de doble precisión: ");
        linea = System.console().readLine();

        double numeroDouble = Double.parseDouble(linea);
        System.out.printf("El número decimal de doble precisión es: %d\n", numeroDouble);

    }
}
