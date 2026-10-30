package tema5;

public class T05E35RelojDeArena {
    public static void main(String[] args) {
        // Constantes
        final String RELLENO = "*";
        // Variables
        int altura;

        // Obtengo datos por teclado
        System.out.print("Introduce la altura de la pirámide: ");
        altura = Integer.parseInt(System.console().readLine());

        int i = altura - 1;
        while (i > 0) {
            int caracteres = 1 + (i*2);
            int k = altura - i;
            while(k > 0) {
                System.out.print(" ");
                k--;
            }
            int j = 0;
            while (j < caracteres) {
                System.out.print(RELLENO);
                j++;
            }
            System.out.println();
            i--;
        }
        while (i < altura) {
            int caracteres = 1 + (i*2);
            int k = altura - i;
            while(k > 0) {
                System.out.print(" ");
                k--;
            }
            int j = 0;
            while (j < caracteres) {
                System.out.print(RELLENO);
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
