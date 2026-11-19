package tema6NumerosAleatorios;

import java.util.Random;

public class PruebaRandom {
    public static void main(String[] args) {
        // Forma clásica con Math.random()
        for (int i = 1; i < 11; i++) { System.out.println((int) (Math.random() * 10) + 1 + " "); }

        System.out.println();

        // Forma moderna con librería Random
        Random random = new Random();
        for (int i = 1; i < 11; i++) { System.out.println(random.nextInt(1, 7)); }

        for (int i = 1; i < 11; i++) { System.out.println(random.nextDouble(-15, 117)); }
    }
}
