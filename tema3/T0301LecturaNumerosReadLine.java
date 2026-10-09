package tema3;

import java.util.Scanner;

public class T0301LecturaNumerosReadLine {
    public static void main(String[] args) {
        // números
        int num1, num2, resultado;

        System.out.println("Este programa multiplica números enteros.");
        
        // Ejemplo de lectura con readLine y parseo a int usando una variable String auxiliar sNum1
        System.out.print("Por favor, introduzca el primer número: ");
        String sNum1 = System.console().readLine();
        num1 = Integer.parseInt(sNum1);
        
        // Ejemplo de lectura con readLine y parseo a int directo sin usar variable auxiliar
        System.out.print("Introduzca el segundo número: ");
        num2 = Integer.parseInt(System.console().readLine());

        // Calcula el resultado.
        resultado = num1 * num2;

        System.out.printf("%d multiplicado por %d es igual a %d\n", num1, num2, resultado);
        
    }
}
