package tema3;

import java.util.Scanner;

public class T03E12NotaParaMediaDeseada {
    public static void main(String[] args) {
        // variables
        double nota1, media, nota2;
        Scanner sc = new Scanner(System.in);

        // solicita nota primer examen
        System.out.print("Introduzca la nota del primer examen: ");
        nota1 = sc.nextDouble();

        // solicita media deseada
        System.out.print("¿Qué nota quieres sacar el trimestre?: ");
        media = sc.nextDouble();
        // calcula la segunda nota para obtener la media deseada en el trimestre
        nota2 = (media - (0.4 * nota1)) / 0.6;
        System.out.printf("Para tener un %.2f en el primer trimestre necesita sacar un %.2f en el segundo examen\n", media, nota2);

        // cerramos descriptor del scanner
        sc.close();

    }
}
