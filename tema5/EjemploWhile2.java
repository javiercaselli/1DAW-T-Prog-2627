package tema5;

public class EjemploWhile2 {
    public static void main(String[] args) {
        System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce un número negativo.");
        int numero = 0;
        int suma = 0;
        int contador = 0;
        while (numero >= 0) {
            System.out.print("?: ");
            numero = Integer.parseInt(System.console().readLine());
            if (numero >= 0) {
                contador++;
                suma += numero;
            }
        }

        System.out.printf("Se han introducido %d números en total y la suma de todos ellos es %d", contador, suma);
    }
}
