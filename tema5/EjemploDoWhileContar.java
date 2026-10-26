package tema5;

public class EjemploDoWhileContar {

    public static void main(String[] args) {

        int i = 11; // i es la variable de control del bucle

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println();

        i = 11;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
