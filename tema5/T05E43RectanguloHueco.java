package tema5;

public class T05E43RectanguloHueco {
    public static void main(String[] args) {
        // Variables
        int anchura = 0;
        int altura = 0;

        // Datos por teclado
        while (anchura < 2) {
            System.out.print("Introduce la anchura del rectángulo (mínimo 2): ");
            anchura = Integer.parseInt(System.console().readLine());
            if (anchura < 2) {
                System.out.println("ERROR: La anchura debe ser como mínimo de valor 2");
            }

        }
        while (altura < 2) {
            System.out.print("Introduce la altura del rectángulo (mínimo 2): ");
            altura = Integer.parseInt(System.console().readLine());
            if (altura < 2) {
                System.out.println("ERROR: La anchura debe ser como mínimo de valor 2");
            }
        }
    }
}
