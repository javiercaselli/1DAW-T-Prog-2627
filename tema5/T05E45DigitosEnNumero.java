package tema5;

import java.util.Scanner;

public class T05E45DigitosEnNumero {
    public static void main(String[] args) {
        // Variables
        long numero;
        Scanner sc = new Scanner(System.in);
        String mensajeSi = "Dígitos que aparecen en el número: ";
        String mensajeNo = "Dígitos que no aparecen en el número: ";
        boolean cero = false;
        boolean uno = false;
        boolean dos = false;
        boolean tres = false;
        boolean cuatro = false;
        boolean cinco = false;
        boolean seis = false;
        boolean siete = false;
        boolean ocho = false;
        boolean nueve = false;

        // Lee el número de teclado
        System.out.print("Introduzca un número entero: ");
        numero = sc.nextLong();

        // Buscamos los dígitos
        while (numero != 0) {
            int digito = (int) numero % 10;  // Obtiene el último dígito del número
            numero = numero / 10;       // Le quita el último dígito al número

            switch (digito) {
                case 0:
                    cero = true;
                    break;
                case 1:
                    uno = true;
                    break;
                case 2:
                    dos = true;
                    break;
                case 3:
                    tres = true;
                    break;
                case 4:
                    cuatro = true;
                    break;
                case 5:
                    cinco = true;
                    break;
                case 6:
                    seis = true;
                    break;
                case 7:
                    siete = true;
                    break;
                case 8:
                    ocho = true;
                    break;
                case 9:
                    nueve = true;
                    break;
                default:
                    System.out.println("ERROR: dígito erróneo");
                    return;
            }
        } 

        // Completo los mensajes de salido con los digitos encontrados y no encontrados, según corresponda
        // mensajeSi += (cero) ? "0 " : "";
        // mensajeNo += (!cero) ? "0 " : "";

        if (cero) mensajeSi += "0 ";
        else mensajeNo += "0 ";
        if (uno) mensajeSi += "1 ";
        else mensajeNo += "1 ";
        if (dos) mensajeSi += "2 ";
        else mensajeNo += "2 ";
        if (tres) mensajeSi += "3 ";
        else mensajeNo += "3 ";
        if (cuatro) mensajeSi += "4 ";
        else mensajeNo += "4 ";
        if (cinco) mensajeSi += "5 ";
        else mensajeNo += "5 ";
        if (seis) mensajeSi += "6 ";
        else mensajeNo += "6 ";
        if (siete) mensajeSi += "7 ";
        else mensajeNo += "7 ";
        if (ocho) mensajeSi += "8 ";
        else mensajeNo += "8 ";
        if (nueve) mensajeSi += "9 ";
        else mensajeNo += "9 ";

        // Pinta resultado
        System.out.println(mensajeSi);
        System.out.println(mensajeNo);

        // Cierra descriptor
        sc.close();
    }
}
