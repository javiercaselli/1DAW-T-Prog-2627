package tema8Funciones;

public class EjemploApuntes1ParImpar {
    public static void main(String[] args) {
        // Lee por pantalla
        int valor = Integer.parseInt(System.console().readLine());

        /*
            Comprueba si el número es par
            llamando a la función correspondiente
         */
        if (esPar(valor)) {
            System.out.println(valor + " es par");
        } else {
            System.out.println(valor + " es impar");
        }
    }

    /**
     * Determina si un número es par o impar
     * @param numero    número entero a chequear
     * @return          verdadero si es par, falso en otro caso
     */
    public static boolean esPar(int numero) {
        // variables
        int prueba = 7;
        String prueba2 = "Hola";

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
