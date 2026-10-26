package tema5;

public class EjemploDoWhile2 {
    public static void main(String[] args) {
        System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce el cero (0).");
        int numero = 0;
        int suma = 0;
        int contador = 0;
        do {
            System.out.print("?: ");
            numero = Integer.parseInt(System.console().readLine());
            if (numero != 0) {
                contador++;
                suma += numero;
            }
        } while (numero != 0);

        System.out.printf("Se han introducido %d números en total y la suma de todos ellos es %d", contador, suma);
    }
}
