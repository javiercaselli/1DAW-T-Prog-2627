package tema7Arrays;

import java.util.Random;

public class T07E04TablaCuadradosYCubos {
    public static void main(String[] args) {
        // Constantes
        final int SIZE = 20;

        // Variables 
        int[] numero = new int[SIZE];
        int[] cuadrado = new int[SIZE];
        int[] cubo = new int[SIZE];
        Random rand = new Random();

        // Cabecera
        System.out.println("  n  |    n2    |    n3");
        System.out.println("---------------------------");

        // Bucle para hacer los cálculos
        for (int i = 0; i < numero.length; i++) {
            int valor = rand.nextInt(0, 101);
            numero[i] = valor;
            cuadrado[i] = Math.powExact(valor, 2);
            cubo[i] = Math.powExact(valor, 3);
        }

        // Bucle para imprimir por pantalla
        int i = 0;
        for (int valor : numero) {
            int valorCuadrado = cuadrado[i];
            int valorCubo = cubo[i];
            i++;
            System.out.printf("  %-3d|    %-6d|    %-6d    \n", valor, valorCuadrado, valorCubo);
        }


    }
}
