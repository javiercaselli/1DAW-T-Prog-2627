package tema4;

public class T04E10SegundoHastaMedianoche {
    public static void main(String[] args) {
        // Constantes
        final int SEGUNDOS_DIA = 24 * 3600;

        // Variables
        int horas, minutos, segundos;

        // Recogida de datos
        System.out.print("Introduce la hora: ");
        horas = Integer.parseInt(System.console().readLine());
        if (horas < 0 || horas >= 24) {         // El if pregunta por la entrada errónea
            System.out.println("ERROR: Las horas deben ser un valor entre 0 y 23");
        } else {
            System.out.print("Introduce los minutos: ");
            minutos = Integer.parseInt(System.console().readLine());
            if (minutos >= 0 && minutos < 59) { // El if pregunta por la entrada correcta
                segundos = SEGUNDOS_DIA - (horas * 3600) - (minutos * 60);
                System.out.println("Desde las " + horas + ":" + minutos + " hasta la medianoche faltan " + segundos + " segundos.");
                System.out.printf("Desde las %d:%d hasta la medianoche faltan %d segundos.\n", horas, minutos, segundos);
            } else {
                System.out.println("ERROR: Las horas deben ser un valor entre 0 y 59");
            }
        }
    }
}
