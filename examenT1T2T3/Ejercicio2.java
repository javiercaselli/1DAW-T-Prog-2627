package examenT1T2T3;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Variables
        int segundosTotales, horas, minutos, segundos;

        // Cabecera
        System.out.println("CALCULADORA DE TIEMPO");
        System.out.println("=====================");

        // Introducción de datos
        System.out.print("Introduce una cantidad de segundos: ");
        segundosTotales = Integer.parseInt(System.console().readLine());    // Lee de teclado

        // Cálculos

        // Horas
        horas = segundosTotales / 3600;
        int restoSegundosHoras = segundosTotales % 3600;

        // Minutos
        minutos = restoSegundosHoras / 60;
        segundos = restoSegundosHoras % 60;         // Segundos

        // Presentación del resultado
        System.out.print(segundosTotales + " segundos son ");
        System.out.print("\033[1m\033[48;5;220m");  // Fondo amarillo y negrita
        System.out.print(horas + " horas");
        System.out.print("\033[0m, ");              // Vuelve a texto estándar
        System.out.print("\033[1m\033[48;5;160m");  // Fondo rojo y negrita
        System.out.print(minutos + " minutos");
        System.out.print("\033[0m, ");              // Vuelve a texto estándar
        System.out.print("\033[1m\033[48;5;40m");   // Fondo verde y negrita
        System.out.print(segundos + " segundos");
        System.out.print("\033[0m.");               // Vuelve a texto estándar
    }
}
