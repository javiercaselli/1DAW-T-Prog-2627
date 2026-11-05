package tema5;

public class T05E52DesplazarNumero {
    public static void main(String[] args) {
        int numero = 0;
        int primerDigito = 0;
        int restoDelNumero = 0;

        // Pide número por teclado
        while (numero <= 0) {
            System.out.print("Introduzca un número entero (mayor que cero): ");
            numero = Integer.parseInt(System.console().readLine());
        }

        primerDigito = numero % 10;
        restoDelNumero = numero / 10;

        System.out.println("el número resultado es " + primerDigito + restoDelNumero);
    }

}
