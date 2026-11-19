package tema7Arrays;

public class EjemploDiapositivas2ArrayUnidimensional {
    public static void main(String[] args) {
        int indice;
        int[] numeros = {8, 33, 200, 150, 11};

        // int[] numeros = new int[5];

        // numeros[0] = 8;
        // numeros[1] = 33;
        // numeros[2] = 200;
        // numeros[3] = 150;
        // numeros[4] = 11;

        System.out.println("El array x tiene 5 elementos ¿cuál de ellos quiere ver?");
        System.out.print("Introduzca un número del 0 al 4: ");
        indice = Integer.parseInt(System.console().readLine());

        System.out.print("El elemento que se encuentra en la posición " + indice);
        System.out.println(" es el " + numeros[indice]);

    }
}
