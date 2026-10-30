package tema5;

import java.util.Scanner;

public class T05E09SerieFibonacci {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int numElementos, ultimo, penultimo;

        // Cabecera
        System.out.println("\033[1mN PRIMEROS NÚMEROS DE LA SERIE DE FIBONACCI\033[0m");
        System.out.print("Introduce un número: ");
        numElementos = sc.nextInt();
        ultimo = 1;
        penultimo = 0;

        for (int i = 1; i <= numElementos; i++) {
            if (i == 1) {                               // Si estamos en el primer elemento, imprime 0
                System.out.printf("%d ", penultimo);
            } else if (i == 2) {                        // Si estamos en el segundo elemento, imprime 1
                System.out.printf("%d ", ultimo);
            } else {                                    // En otro caso, calcula la serie de Fibonacci con normalidad
                int nuevoElemento = ultimo + penultimo;
                penultimo = ultimo;
                ultimo = nuevoElemento;
                System.out.printf("%d ", nuevoElemento);
            }
        }
        System.out.println();


        // Cierra descriptor
        sc.close();
    }
}
