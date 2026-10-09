package tema4;

public class T04E01DiasDeLaSemana {
    public static void main(String[] args) {
        // Lee el día de la semana
        System.out.print("Introduce un día de la semana y te diré qué asignatura toca a primera hora de ese día: ");
        String dia = System.console().readLine();

        // Resuelto con if-else
        if (dia.equals("lunes")) {
            System.out.println("PROGRAMACIÓN");
        } else if (dia.equals("martes")) {
            System.out.println("BASES DE DATOS");
        } else if (dia.equals("miércoles")) {
            System.out.println("SISTEMAS INFORMÁTICOS");
        } else if (dia.equals("jueves")) {
            System.out.println("ENTORNOS DE DESARROLLO");
        } else if (dia.equals("viernes")) {
            System.out.println("IPE I");
        } else {
            System.out.println("Día erróneo");
        }

        // resuelto con switch-case
        switch(dia) {
            case "lunes":
                System.out.println("PROGRAMACIÓN");
                break;
            case "martes":
                System.err.println("BASES DE DATOS");
                break;
            case "miércoles":
                System.out.println("SISTEMAS INFORMÁTICOS");
                break;
            case "jueves":
                System.out.println("ENTORNOS DE DESARROLLO");
                break;
            case "viernes":
                System.out.println("IPE I");
                break;
            default:
                System.out.println("Día erróneo");
                break;
        }
    }
}
