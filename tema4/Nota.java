package tema4;

public class Nota {
    public static void main(String[] args) {

        System.out.print("¿Qué nota has sacado en el último examen? ");
        String entrada = System.console().readLine();
        double nota = Double.parseDouble(entrada);

        if (nota < 5) {
            System.out.println("Lo siento, has suspendido.");
        } else if (nota < 6) {
            System.out.println("Aprobado");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 8) {
            System.out.println("Notable");
        } else if (nota < 9) {
            System.out.println("Notable alto");
        } else if (nota < 10) {
            System.out.println("Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Matrícula de Honor");
        }

        if (nota == 10) {
            System.out.println("Matrícula");
        } else if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 8) {
            System.out.println("Notable alto");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 6) {
            System.out.println("Bien");
        } else if (nota >= 5) {
            System.out.println("Aprobado");
        } else if (nota >= 0) {
            System.out.println("Suspenso");
        }
    }
}
