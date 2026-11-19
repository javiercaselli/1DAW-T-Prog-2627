package tema6NumerosAleatorios;

import java.util.Random;

public class Primitiva {
    public static void main(String[] args) {
        int bola1 = 0;
        int bola2 = 0;
        int bola3 = 0;
        int bola4 = 0;
        int bola5 = 0;
        int bola6 = 0;
        Random rand = new Random();

        bola1 = rand.nextInt(1, 48);
        bola2 = rand.nextInt(1, 48);
        bola3 = rand.nextInt(1, 48);
        bola4 = rand.nextInt(1, 48);
        bola5 = rand.nextInt(1, 48);
        bola6 = rand.nextInt(1, 48);

        System.err.printf("Resultado del sorteo: %d - %d - %d - %d - %d - %d\n\n", bola1, bola2, bola3, bola4, bola5, bola6);
        
    }
}
