package tema4;

public class DiasSemanaConSwitch {
    public static void main(String[] args) {
        int dia;
        System.out.print("Introduzca el número de día (1-7): ");
        dia = Integer.parseInt(System.console().readLine());
        switch (dia) {
            case 1: 
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es día lectivo");
                break;
            case 6:
            case 7:
                System.out.println("Es fin de semana");
                break;       
            default:
                System.out.println("Opción errónea");
                break;
        }
    }
}
