package tema8Funciones.t08e01LibreriaMatematica;

public class Matematicas {

    /**
     * Almacena cada digito del número entero que recibe como parámetro en una posición de un array.
     * 
     * @param numero numero entero positivo
     * @return array de enteros, del tamaño de tantos dígitos como tenga el número original, conteniendo cada dígito en una posición
     */
    public static int[] enteroAArray(int numero) {
        // Valor retorno
        int[] arrayEnteros = new int[digitos(numero)];

        // Almacena el número en el array
        for (int i = arrayEnteros.length - 1; i >= 0; i--) {
            arrayEnteros[i] = numero % 10;
            numero /= 10;
        }

        return arrayEnteros;
    }

    public static int ArrayAEntero(int[] arrayEnteros) {
        // valor retorno
        int numero = 0;

        return numero;
    }

    /**
     * 
     * @param numero
     * @param posicion
     * @return
     */
    public static int digitoN(int numero, int posicion) {
        int[] arrayEnteros = enteroAArray(numero);

        return arrayEnteros[posicion - 1]; 
    }

    /**
     * Devuelve el número de dígitos que tiene el entero que recibe como parámetro.
     * 
     * @param numero número entero
     * @return número de digitos del entero recibido como parámetro
     */
    public static int digitos(int numero) {
        // valor de retorno
        int digitos = 0;

        // variables
        int divisor = 10;

        // calcula el número de dígitos que tiene el número
        while (numero != 0) {
            numero = numero / divisor;
            digitos++;
        }

        // devuelve el número de digitos calculado
        return digitos;
    }

    /**
     * Devuelve el inverso positivo del número entero que se le pasa como parámetro.
     * 
     * @param numeroOriginal número entero positivo
     * @return inverso del número que se pasa como parámetro
     */
    public static int voltea(int numeroOriginal) {
        // Valor de retorno
        int numeroVolteado = 0;

        // Variables
        int cociente = Integer.MAX_VALUE;
        int tamanio = digitos(numeroOriginal);


        // Almacena el número invertido en el array
        int[] arrayInv = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            arrayInv[i] = numeroOriginal % 10;
            numeroOriginal /= 10;
        }

        // A partir del contenido del array, saca el número invertido buscado
        for (int digito : arrayInv) {
            int multiplicador = 1;
            for (int i = 0; i < tamanio - 1; i++) {
                multiplicador *= 10;
            }
            tamanio--;
            numeroVolteado += digito * multiplicador;
        }


        // Para averiguar el tamaño del número, voy dividiendo por múltiplos de 10 hasta que devuelva 0
        return numeroVolteado;
    }

    /**
     * Comprueba si un número entero es capicua.
     * 
     * @param numero número entero
     * @return devuelte "true" si es capicua, "false" en otro caso
     */
    public static boolean esCapicua(int numero) {
        return (numero == voltea(numero));

        // Alternativa larga y menos elegante
        // Valor de retorno
        // boolean esCapicua = false;

        // int numeroInverso = voltea(numero);
        // esCapicua = (numeroInverso == numero);

        // return esCapicua;
    }

    /**
     * Comprueba si un número entero es primo.
     * 
     * @param numero número entero
     * @return devuelte "true" si es primo, "false" en otro caso
     */
    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= numero / 2; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.err.println(digitos(4536));
        System.out.println(voltea(3485));
        System.out.println(esCapicua(545646));
        System.out.println(esCapicua(23532));
        System.out.println(digitoN(563873, 4));
    }
}
