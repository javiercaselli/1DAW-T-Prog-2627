package tema3;

public class T0304OperacionesMatematicas {
    public static void main(String[] args) {
        // variables
        double num1, num2;

        // código
        System.out.print("Introduzca el primer número: ");
        num1 = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca el segundo número: ");
        num2 = Double.parseDouble(System.console().readLine());

        System.out.printf("x = %.1f\n", num1);
        System.out.printf("y = %.1f\n", num2);
        System.out.printf("x + y = %.1f\n", num1 + num2);
        System.out.printf("x - y = %.1f\n", num1 - num2);
        System.out.printf("x / y = %f\n", num1 / num2);
        System.out.printf("x * y = %.1f\n", num1 * num2);
        
    }
}
