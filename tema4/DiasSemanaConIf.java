package tema4;

public class DiasSemanaConIf {
    public static void main(String[] args) {
        int dia;
        System.out.print("Introduzca el número de día (1-7): ");
        dia = Integer.parseInt(System.console().readLine());
        if (dia >= 1 && dia <= 5) {
            System.out.println("Es día lectivo");
        } else if (dia == 6 || dia == 7) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("Entrada errónea");
        }
    }
}
