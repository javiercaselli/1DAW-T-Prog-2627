package examenT4T5T14;

public class ExamenT4T5T14ControlAforo {
    public static void main(String[] args) {
        // Constantes
        final int AFORO_MIN = 1;
        final int AFORO_MAX = 40;

        // Variables
        int aforoMax = 0;
        int aforoActual = 0;
        int movimiento = Integer.MIN_VALUE;
        int entradas = 0;
        int salidas = 0;
        int rechazos = 0;
        int maxRacha = 0;
        int rachaActual = 0;
        int maxOcupacion = 0;

        // Pide aforo máximo por teclado
        while (aforoMax <= 0 || aforoMax > 40) {
            try {
                System.out.print("Inserte afoto máximo de la sala (1-40): ");
                aforoMax = Integer.parseInt(System.console().readLine());
                if (aforoMax <= 0 || aforoMax > 40) {
                    System.out.println("ERROR: Introducir un número entero positivo entre 1 y 40");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("ERROR: Introducir un número entero positivo entre 1 y 40.");
            }
        }
        // Ahora mismo el aforo coincide con el máximo
        aforoActual = aforoMax;

        // Pide movimientos de entrad y salida hasta que se introduzca cero (0)
        while (movimiento != 0) {
            try {
                System.out.print("Inserte movimiento en la sala (0 para salir del programa): ");
                movimiento = Integer.parseInt(System.console().readLine());
                if (movimiento != 0) {
                    // Analiza el movimiento
                    int genteEnLaSala  = aforoMax - aforoActual;
                    if (movimiento > 0) {
                        // Intenta entrar gente
                        if (aforoActual - movimiento >= 0) {
                            // Disminuye el aforo en el número indicado
                            aforoActual -= movimiento;
                            entradas += movimiento;                      // Estadística de entradas
                            genteEnLaSala  = aforoMax - aforoActual;
                            // Comprueba máxima ocupación de la sesión
                            if (genteEnLaSala > maxOcupacion) {
                                maxOcupacion = genteEnLaSala;           // Estadística máxima ocapación de la sesión
                            }
                            // Actualiza racha
                            rachaActual ++;
                            if (rachaActual > maxRacha) {
                                maxRacha = rachaActual;
                            }

                        } else  {
                            // Está intentando entrar más gente de la que cabe
                            System.out.printf("ERROR: El grupo (%d) supera el aforo actual de la sala (%d)\n", movimiento, aforoActual);
                            rechazos++;                                 // Estadística de rechazos
                        }
                    } else {
                        // Intenta salir gente
                        if (Math.abs(movimiento) <= genteEnLaSala) {
                            // Aumenta el aforo en el número indicado
                            aforoActual += Math.abs(movimiento);
                            salidas += Math.abs(movimiento);             // Estadística de salidas
                            // Reseteo racha
                            rachaActual = 0;
                        } else {
                            // Está intentando salir más gente de la que hay
                            System.out.printf("ERROR: El grupo (%d) supera la asistencia actual de la sala (%d)\n", movimiento, genteEnLaSala);
                            rechazos++;                                 // Estadística de rechazos
                        }
                    }
                    // Pinta ocupación de la sala
                    genteEnLaSala = aforoMax - aforoActual;
                    int filasCompletas = aforoMax / 10;
                    int plazasSobrantes = aforoMax % 10;
                    // Pinta las filas completas
                    for (int i = 0; i < filasCompletas; i++) {
                        System.out.print("|");
                        for (int j = 0; j < 10; j++) {
                            if (genteEnLaSala > 0) {
                                System.out.print("#");
                            } else {
                                System.out.print(".");
                            }
                            genteEnLaSala--;
                        }
                        System.out.print("|\n");
                    }
                    // Pinta las plazas sobrantes
                    System.out.print("|");
                    for (int i = 0; i < plazasSobrantes; i++) {
                        if (genteEnLaSala > 0) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                        genteEnLaSala--;
                    }
                    System.out.print("|\n");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("ERROR: El movimiento debe ser un número entero.");
            }
        }


        // Imprime estadística y sale del programa
        System.out.println();
        System.out.println("Personas que entraron: " + entradas);
        System.out.println("Personas que salieron: " + salidas);
        System.out.println("Movimientos rechazados: " + rechazos);
        System.out.println("Ocupación máxima: " + maxOcupacion);
        System.out.println("Mayor racha de entradas: " + maxRacha);
    }
}
