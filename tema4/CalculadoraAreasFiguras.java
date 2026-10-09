package tema4;

public class CalculadoraAreasFiguras {
        int opcion = -1;
        while (opcion != 0) {
            // Pinta el menú
            System.out.println("Calculadora de áreas de figuras geométricas:");
            System.err.println("    1. Área cuadrado");
            System.out.println("    2. Área rectángulo");
            System.out.println("    3. Área triángulo");
            System.out.println("    0. Salir");

            // Solicita opción
            System.out.print("Introduzca opción elegida (0-3): ");
            opcion = Integer.parseInt(System.console().readLine());

            // Lo hacemos con un switch/case
            double resultado = 0;
            switch(opcion) {
                case 0:
                    System.out.println("Gracias por usar la aplicación. Hasta la próxima.");
                    break;
                case 1:
                    System.out.print("Introduzca el lado del cuadrado: ");
                    int lado = Integer.parseInt(System.console().readLine());
                    resultado = lado * lado;
                    break;
                case 2:
                    System.out.print("Introduzca la base del rectángulo: ");
                    int base = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduzca la altura del rectángulo: ");
                    int altura = Integer.parseInt(System.console().readLine());
                    resultado = base * altura;
                    break;
                case 3:
                    System.out.print("Introduzca la base de la triángulo: ");
                    base = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduzca la altura del triángulo: ");
                    altura = Integer.parseInt(System.console().readLine());
                    resultado = (base * altura) / 2.0;
                    break;
                default:
                    System.err.println("Opción incorrecta");
                    break;

            }
            if (opcion != 0) {
                System.out.println("\nEl área de la figura es: " + resultado + "\n");
            }
        }
    }
}
