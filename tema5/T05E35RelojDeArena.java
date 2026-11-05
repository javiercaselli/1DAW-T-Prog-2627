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

        int i = altura / 2;
        int j = 0;
         int caracteres = 0;
        while (i > 0) {
            // Variable para dibujar los espacios
            // Ejemplo 5: k = (5 / 2 + 1) - i - 1
            // Primera ejecucion bucle: (3) - 2 - 1 = 0
            // Segunda ejecucion: (3) - 1 - 1 = 1
            int k = ((altura / 2 + 1) - i - 1);
			while (k > 0) {
				System.out.print(" ");	
				k--;
			}
            j = 0;
            // Variable para pintar x caracteres
            // Ejemplo 5: 
            caracteres = 1 + (i*2);
			while (j < caracteres) {
				System.out.print("*");	
				j++;
			}
			System.out.println("");
            i--;
        }
        while (i < altura / 2 + 1) {
			j = 0;
			// Dibujar espacios
			int k = ((altura / 2 + 1) - i - 1);
			while (k > 0) {
				System.out.print(" ");	
				k--;
			}
			caracteres = 1 + (i*2);
			while (j < caracteres) {
				System.out.print("*");	
				j++;
			}
			i++;
			System.out.println("");
		}
        
    }
}
