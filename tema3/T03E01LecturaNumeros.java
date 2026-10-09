package tema3;

import java.util.Scanner;

public class T03E01LecturaNumeros {
    public static void main(String[] args) {
        // Scanner para leer de teclado
        Scanner sc = new Scanner(System.in);

        // números
        int num1, num2, resultado;

        System.out.println("Este programa multiplica números enteros.");
        System.out.print("Por favor, introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();

        // Calcula el resultado.
        resultado = num1 * num2;

        System.out.printf("%d multiplicado por %d es igual a %d\n", num1, num2, resultado);
        System.out.println(num1 + " * " + num2 + " = " + resultado);

        sc.close();
    }
}
