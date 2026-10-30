package tema5;

public class T05E16PiramideSolida {
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
            int caracteres = 1 + (i*2);
            int k = altura - i;
            while(k > 0) {
                System.out.print(" ");
                k--;
            }
            int j = 0;
            while (j < caracteres) {
                System.out.print(relleno);
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
