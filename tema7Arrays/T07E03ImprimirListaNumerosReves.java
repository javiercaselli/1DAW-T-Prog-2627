package tema7Arrays;

public class T07E03ImprimirListaNumerosReves {
    public static void main(String[] args) {
        // Constante
        final int SIZE = 3;

        // Variables
        int[] listaNumeros = new int[SIZE];

        for (int i = (listaNumeros.length - 1); i >=0; i--) {
            listaNumeros[i] = Integer.parseInt(System.console().readLine());
        }

        for (int elemento : listaNumeros) {
            System.out.println(elemento);
        }
    }
}
