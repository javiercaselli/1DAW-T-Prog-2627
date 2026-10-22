package tema4;

import java.util.Scanner;

public class T04E09HoroscopoIfAnidados {
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
        // if (mes == 1 && dia <= 19) {
        //     System.out.println("Capricornio");
        // } else if (mes == 1 && dia > 19) {
        //     System.out.println("Acuario");
        // }

        // cálculos con sentencias "if" anidadas
        if (mes == 1) {
            if (dia <= 19) {
                System.out.println("Capricornio");
            } else {
                System.out.println("Acuario");
            }
        } else if (mes == 2) {
            if (dia <= 18) {
                System.out.println("Acuario");
            } else {
                System.out.println("Piscis");
            }
        } else if (mes == 3) {
            if (dia <= 20) {
                System.out.println("Piscis");
            } else {
                System.out.println("Aries");
            }
        } else if (mes == 4) {
            if (dia <= 19) {
                System.out.println("Aries");
            } else {
                System.out.println("Tauro");
            }
        } else if (mes == 5) {
            if (dia <= 20) {
                System.out.println("Tauro");
            } else {
                System.out.println("Géminis");
            }
        } else if (mes == 6) {
            if (dia <= 20) {
                System.out.println("Géminis");
            } else {
                System.out.println("Cáncer");
            }
        } else if (mes == 7) {
            if (dia <= 22) {
                System.out.println("Cáncer");
            } else {
                System.out.println("Leo");
            }
        } else if (mes == 8) {
            if (dia <= 22) {
                System.out.println("Leo");
            } else {
                System.out.println("Virgo");
            }
        } else if (mes == 9) {
            if (dia <= 23) {
                System.out.println("Virgo");
            } else {
                System.out.println("Libra");
            }
        } else if (mes == 10) {
            if (dia <= 22) {
                System.out.println("Libra");
            } else {
                System.out.println("Escorpio");
            }
        } else if (mes == 11) {
            if (dia <= 21) {
                System.out.println("Escorpio");
            } else {
                System.out.println("Sagitario");
            }
        } else if (mes == 12) {
            if (dia <= 21) {
                System.out.println("Sagitario");
            } else {
                System.out.println("Capricornio");
            }
        }

        // cáculo con "switch-case e if"
        /* 
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
        */
       
        // Cierra Scanner
        sc.close();

    }
}