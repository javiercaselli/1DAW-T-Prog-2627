package tema4;

public class NumeroEntreUnoYCien {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entre 1 y 100: ");
        int num = Integer.parseInt(System.console().readLine());
        if (num >= 1 && num <= 100) {
            System.out.println("Entrada correcta");
        } else {
            System.out.println("Entrada errónea");
        }

        // Otra forma con el operador lógico "o" (||)
        if (num < 1 || num > 100) {
            System.out.println("Entrada errónea (operador ||)");
        } else {
            System.out.println("Entrada correcta (operador ||)");
        }

    }
}


