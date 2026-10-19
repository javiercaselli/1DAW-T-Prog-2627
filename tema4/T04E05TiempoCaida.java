package tema4;

public class T04E05TiempoCaida {
    public static void main(String[] args) {
        // Constantes
        final double ACELERACION_GRAVEDAD = 9.81;

        // Variables
        double altura, tiempo;

        // Cabecera
        System.out.println("Cálculo del tiempo de caída de un objeto");
        System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
        altura = Double.parseDouble(System.console().readLine());
        if (altura >= 0.0) {
            tiempo = Math.sqrt(2*altura/ACELERACION_GRAVEDAD);
            System.out.printf("El objeto tarda %.2f segundos\n\n", tiempo);
        } else {
            System.out.println("ERROR: La altura no puede ser negativa");
        }
    }
}
