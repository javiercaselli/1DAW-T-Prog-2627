package tema14Excepciones;

import java.util.Scanner;

public class Ejemplo1Excepcion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            double numero1;
            double numero2;
            System.out.print("Introduzca el primer número: ");
            numero1 = Double.parseDouble(s.nextLine());
            System.out.print("Introduzca el segundo número: ");
            numero2 = Double.parseDouble(s.nextLine());
            System.out.println("La media es " + (numero1 + numero2) / 2);
        } catch (Exception e) {
            System.out.println("No se puede calcular la media.");
            System.out.println("Los datos introducidos no son correctos: " + e.getMessage());
        } finally {
            s.close();
            System.out.println("Gracias por utilizar este programa.");
        }
    }
}
