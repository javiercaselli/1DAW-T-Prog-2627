package tema8Funciones;

public class T08E02PrimosEntre1Y1000 {

    public static void main(String[] args) {
        for (int numero = 1; numero <= 1000; numero++) {
            if (esPrimo(numero)) {
                System.out.println(numero);
            }
        }
    }

    /**
     * 
     * @param numero
     * @return
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
}
