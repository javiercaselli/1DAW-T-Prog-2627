package tema5;

import java.text.ListFormat.Style;

public class T05E04CajaFuerte {
    public static void main(String[] args) {
        int clave = 1234;
        int intentos = 4;
        int intentoClave;
        boolean cajaAbierta = false;

        while (intentos > 0 && !cajaAbierta) {
            System.out.print("Introduce la clave de la caja fuerte: ");
            intentoClave = Integer.parseInt(System.console().readLine());
            if (clave != intentoClave) {
                System.out.println("Clave incorrecta");
                intentos--;
            } else {
                System.out.println("Se ha abierto la caja fuerte");
                cajaAbierta = true;
            }
        }

        if (!cajaAbierta) {
            System.out.println("Lo siento se han agotado las 4 oportunidades.\nSe ha emitido aviso a la policía.");
        }
    }
}
