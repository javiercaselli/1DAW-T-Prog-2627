package tema4;

import java.util.Scanner;

public class T04E18NumerosCapicuaConString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número entero positivo (de 5 cifras como máximo): ");
        numero = sc.nextInt();

        // Validamos que el número sea correcto
        if (numero < 0 || numero >= 100000) {
            System.out.println("ERROR: El número debe ser positivo y tener como mucho 5 cifras");
            sc.close();
            return;
        }

        // Convertimos el número a cadena de caracteres
        String sNumero = String. valueOf(numero);

        // Chequeamos que es capicúa
        boolean capicua = false;

        if (sNumero.length() == 1) {
            capicua = true;
        } else if (sNumero.length() == 2) {
            // Números de dos cifras
            capicua = (sNumero.charAt(0) == sNumero.charAt(1));
        } else if  (sNumero.length() == 3){
            capicua = (sNumero.charAt(0) == sNumero.charAt(2));
        }  else if  (sNumero.length() == 4){
            capicua = (sNumero.charAt(0) == sNumero.charAt(3)) && (sNumero.charAt(1) ==sNumero.charAt(2));
        }  else if  (sNumero.length() == 5){
            capicua = (sNumero.charAt(0) == sNumero.charAt(4)) && (sNumero.charAt(1) ==sNumero.charAt(3));
        }

        if (capicua) {
            System.out.println("El número " + numero + " es capicúa");
        } else {
            System.out.println("El número " + numero + " no es capicúa");
        }
    }
}
