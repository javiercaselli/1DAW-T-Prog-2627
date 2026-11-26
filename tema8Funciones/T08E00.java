package tema8Funciones;

import java.util.Scanner;

public class T08E00 {
    public static int leerValor() {
        int numero;
        Scanner sc = new Scanner(System.in);

        do {
            numero = sc.nextInt();
            if (!(numero > 2)) {
                System.out.println("Lo siento, el valor mínimo es 2");
                System.out.println("Introduzca un nuevo valor.");
            }
        } while (!(numero > 2));

        sc.close();
        return numero;
    }
}
