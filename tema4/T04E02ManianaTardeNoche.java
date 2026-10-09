package tema4;

public class T04E02ManianaTardeNoche {
    public static void main(String[] args) {
        int hora = 0;
        System.out.print("Introduce la hora del día (0-23): ");
        hora = Integer.parseInt(System.console().readLine());
        if (hora >= 6 && hora <= 12) {
            System.out.println("Es la mañana.");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Es la tarde.");
        } else {
            System.out.println("Es la noche.");
        }
    }
}
