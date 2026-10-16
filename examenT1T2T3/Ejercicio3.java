package examenT1T2T3;

public class Ejercicio3 {
    public static void main(String[] args) {
        double rMenor, rMayor;

        // Cabecera
        System.out.println("VOLUMEN DE UN TOROIDE");
        System.out.println("=====================");

        // Lectura de datos por pantalla
        System.out.print("Introduzca el radio mayor: ");
        rMayor = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el radio menor: ");
        rMenor = Double.parseDouble(System.console().readLine());

        // Cálculos
        double volumen = 2 * Math.pow(Math.PI, 2) * rMayor * Math.pow(rMenor, 2);

        // Presentación de los resultados
        System.out.printf("El volumen del toroide es de %.4f cm\u00B3", volumen);
    }
}
