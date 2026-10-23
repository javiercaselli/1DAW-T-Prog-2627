package tema4;

import java.util.Scanner;

public class T04E18NumerosCapicua {
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

        // Chequeamos que es capicúa
        boolean capicua = false;

        if (numero / 10 == 0) {
            // número de una cifra
            capicua = true;
        } else if (numero / 100 == 0) {
            // número de dos cifras
            int primeraCifra = numero / 10;
            int ultimaCifra = numero % 10;
            // Comprobación con un if
            if (primeraCifra == ultimaCifra) {
                capicua = true;
            }
            // Otra forma más compacta, comprobar directamente la igualdad (devuelve un booleano y lo podemos usar directamente)
            capicua = (primeraCifra == ultimaCifra);

        } else if (numero / 1000 == 0) {
            // Números de 3 cifras
            int primeraCifra = numero / 100;
            int ultimaCifra = numero % 10;
            capicua = (primeraCifra == ultimaCifra);
        } else if (numero / 10000 == 0) {
            // Números de 4 cifras
            int primeraCifra = numero / 1000;
            int segundaCifra = (numero / 100) % 10;
            int penultimaCifra = (numero / 10) % 10;
            int ultimaCifra = numero % 10;
            capicua = (primeraCifra == ultimaCifra) && (segundaCifra == penultimaCifra);
        } else {
             // Números de 5 cifras
            int primeraCifra = numero / 10000;
            int segundaCifra = (numero / 1000) % 10;
            int penultimaCifra = (numero / 10) % 10;
            int ultimaCifra = numero % 10;
            capicua = (primeraCifra == ultimaCifra) && (segundaCifra == penultimaCifra);           
        }

        if (capicua) {
            System.out.println("El número " + numero + " es capicúa");
        } else {
            System.out.println("El número " + numero + " no es capicúa");
        }

        // Cierra scanner
        sc.close();

        System.out.println("Javier Caselli".charAt(100));
    }
}
