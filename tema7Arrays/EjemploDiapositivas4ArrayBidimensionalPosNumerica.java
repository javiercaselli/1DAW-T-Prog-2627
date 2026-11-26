package tema7Arrays;

public class EjemploDiapositivas4ArrayBidimensionalPosNumerica {
    public static void main(String[] args) {
        int posicion;
        int fila;
        int columna;
        int[][] tabla = { { 8, -12, 33 }, { 14, 1, -24 }, { 100, 51, 69 } };

        System.out.println("El array tiene 3 filas y 3 columnas.");
        System.out.print("Introduzca la posición (contando desde 0): ");
        posicion = Integer.parseInt(System.console().readLine());

        fila = posicion / 3;
        columna = posicion % 3;

        System.out.printf("El elemento que se encuentra en la posición [%d,%d] es %d\n", 
                fila, columna, tabla[fila][columna]);
    }
}
