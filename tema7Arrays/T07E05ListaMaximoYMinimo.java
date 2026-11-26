package tema7Arrays;

import java.util.Scanner;

public class T07E05ListaMaximoYMinimo {
    public static void main(String[] args) {
        // Constante
        final int SIZE = 10;

        // Variables
        int[] lista = new int[SIZE];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);

        // Lee por pantalla, almacena y calcula max y min
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Introduzca el número entero (%d/%d): ", i+1, SIZE);
            lista[i] = sc.nextInt();
            max = (max < lista[i]) ? lista[i] : max;
            min = (min > lista[i]) ? lista[i] : min;
        }

        // Imprime resultados
        System.out.println("\nResultados:");
        for (int valor: lista) {
            System.out.print(valor);
            if (valor == max) {
                System.out.print("  máximo\n");
            } else if (valor == min) {
                System.out.print("  mínimo\n");
            } else {
                System.out.println();
            }
        }

        // Cierra descriptor scanner
        sc.close();        
    }
}
