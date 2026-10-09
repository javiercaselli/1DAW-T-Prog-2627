package tema4;

public class T04E03CalculadoraHorasExtra {
    public static void main(String[] args) {
        int horas = 0;
        int sueldo = 0;
        int eurosHoraNormal = 12;
        int eurosHoraExtra = 16;
        int maxHoras = 40;
        int maxLegal = 60;
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        horas = Integer.parseInt(System.console().readLine());
        if (horas < 0 || horas > maxLegal) {
            System.err.println("No es posible trabajar ese número de horas");
        } else if (horas <= maxHoras) {
            sueldo = horas * eurosHoraNormal;
            System.out.printf("El salario a cobrar por %d horas de trabajo es de %d euros", horas, sueldo);
        } else {
            sueldo = (maxHoras * eurosHoraNormal) + ((horas - maxHoras) * eurosHoraExtra);
            System.out.printf("El salario a cobrar por %d horas de trabajo es de %d euros", horas, sueldo);
        }


    }
}
