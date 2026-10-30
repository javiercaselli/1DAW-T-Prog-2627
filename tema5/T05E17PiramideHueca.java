package tema5;

public class T05E17PiramideHueca {
    public static void main(String[] args) {
        // Variables
        String relleno;
        int altura;

        // Obtengo datos por teclado
        System.out.print("Introduce la altura de la pirámide: ");
        altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el caracter de relleno: ");
        relleno = System.console().readLine();

        int i = 0;
        while (i < altura) {
            // Desplazamiento previo para alinear cada fila
            int k = altura - i;
            while (k > 0) {
                System.out.print(" ");
                k--;
            }
            // Dibuja cada fila de la pirámide
            if (i == 0 || i == (altura - 1)) {
                // La primera y la última fila se pintan enteras, sin huecos
                int caracteres = 1 + (i * 2);
                int j = 0;
                while (j < caracteres) {
                    System.out.print(relleno);
                    j++;
                }
            } else {    // Las filas intermedias se pintan con huecos
                // Imprime caracter de la pared izquierda
                System.out.print(relleno);
                // Imprime lo huecos que correspondan entre las dos paredes
                int caracteres = 1 + ((i - 1) * 2);
                int j = 0;
                while (j < caracteres) {
                    System.out.print(" ");
                    j++;
                }
                // Imprime caracter de la pared derecha
                System.out.print(relleno);
            }
            System.out.println();
            i++;

        }

    }
}
