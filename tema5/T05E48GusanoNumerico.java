package tema5;

public class T05E48GusanoNumerico {
    public static void main(String[] args) {
        // Variables
        int numero = 0;
        int nuevoNumero = 0;
        int posicion = 1;
        boolean comido = false;

        // Pide número por teclado
        while (numero <= 0) {
            System.out.print("Introduzca un número entero (mayor que cero): ");
            numero = Integer.parseInt(System.console().readLine());
        } 

        // Se va descomponiendo en función de lo que se come el gusano
        while (numero != 0) {
            int digito = numero % 10;
            numero = numero / 10;
            if (digito != 8 && digito != 0) {
                nuevoNumero = nuevoNumero + (posicion * digito);
                posicion = posicion * 10;
            } else {
                comido = true;
            }
        }

        // Mensaje por pantalla
        if (comido) {
            System.out.println("Después de haber sido comido por el gusano numérico, se queda en: " + nuevoNumero);
        } else {
            System.out.println("El gusano no se ha comido ningún dígito");
        }
        
        
    }
}
