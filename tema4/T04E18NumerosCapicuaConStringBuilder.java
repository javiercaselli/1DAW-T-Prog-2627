package tema4;

import java.util.Scanner;

public class T04E18NumerosCapicuaConStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número entero positivo (de 5 cifras como máximo): ");
        numero = sc.nextInt();

        if (numero < 0 || numero >= 100000) {
            System.out.println("ERROR: El número debe ser positivo y tener como mucho 5 cifras");
        }

        String sNumero = String.valueOf(numero);    // Obtengo una cadena de caracteres con el número

        StringBuilder sb = new StringBuilder(sNumero);
        String sNumeroAlReves = sb.reverse().toString();
        if (sNumero.equals(sNumeroAlReves)) {
            System.out.println("Es capicúa");
        } else {
            System.out.println("No es capicúa");
        }

        // Cierra scanner
        sc.close();
    }
}
