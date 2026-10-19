package tema4;

import java.util.Scanner;

public class T04T09HoroscopoIfAnidados {
    public static void main(String[] args) {
        // variables
        int dia, mes;
        Scanner sc = new Scanner(System.in);

        // cabecera
        System.out.println("Este programa te dirá cuál es tu horóscopo");
        System.out.print("Introduce tu mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.print("Introduce tu día de nacimiento: ");
        dia = sc.nextInt();

        // cálculos con operadores lógicos
        if (mes == 1 && dia <= 19) {
            System.out.println("Capricornio");
        } else if (mes == 1 && dia > 19) {
            System.out.println("Acuario");
        }

        // cálculos con sentencias "if" anidadas
        if (mes == 1) {
            if (dia <= 19) {
                System.out.println("Capricornio");
            } else {
                System.out.println("Acuario");
            }
        }

        // cáculo con "switch-case e if"
        switch (mes) {
            case 1:
                if (dia <= 19) {
                    System.out.println("Capricornio");
                } else {
                    System.out.println("Acuario");
                }
                break;
            case 2:
                
        }

        // Cierra Scanner
        sc.close();

    }
}