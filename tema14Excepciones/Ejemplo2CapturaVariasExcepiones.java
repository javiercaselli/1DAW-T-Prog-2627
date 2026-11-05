package tema14Excepciones;

import java.util.Scanner;

public class Ejemplo2CapturaVariasExcepiones {
    public static void main(String[] args) {
        int lineas;
        int asteriscos;
        int longitud;
        int cuentaAsteriscos;

        System.out.println("Este programa pinta varias líneas de asteriscos");

        try {
            // Lectura por teclado
            System.out.print("Introduce el número total de asteriscos: ");
            asteriscos = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce el número total de líneas: ");
            lineas = Integer.parseInt(System.console().readLine());

            // Cálculos
            if ((asteriscos % lineas) == 0) {
                longitud = asteriscos / lineas;
            } else {
                longitud = (int) Math.ceil((double) asteriscos / (double) lineas);
            }

        } catch (NumberFormatException nfe) {
            System.out.println("ERROR: Se deben introducir valores de tipo entero.");
        } catch (ArithmeticException ae) {
            System.out.println("ERROR: El número de líneas debe distinto de cero");
        } catch (Exception e) {
            System.out.println("ERROR: Error desconocido, contacte con el admin.");
        }
    }
}
