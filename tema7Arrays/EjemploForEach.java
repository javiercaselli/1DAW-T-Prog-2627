package tema7Arrays;

public class EjemploForEach {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Recorrido del array con un for clásico
        for (int i = 0; i < numeros.length; i++) {
            int item = numeros[i];
            System.out.print(item + " ");
        }
        System.out.println();
        
        // Recorrido del Array con un for estilo "ForEach"
        for (int item : numeros) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
