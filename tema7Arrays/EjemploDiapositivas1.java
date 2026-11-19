package tema7Arrays;

public class EjemploDiapositivas1 {
    public static void main(String[] args) {
        int suma;
        int[] numeros;
        numeros = new int[4];

        numeros[1] = -30;
        numeros[2] = 0;
        numeros[0] = 26;
        numeros[3] = 100;

        System.out.print("Los valores del array n son los siguientes: ");
        System.out.print(numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3]);

        suma = numeros[0] + numeros[3];
        System.out.println("\nEl primer elemento del array más el último suman " + suma);

    }
}
