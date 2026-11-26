package tema7Arrays;

public class T07E02ArrayDeString {
    public static void main(String[] args) {
        // Declara e inicializa el array
        String[] simbolo = new String[12];

        // Introduce los valores solicitados
        simbolo[0] = "a";
        simbolo[1] = "x";
        simbolo[4] = "@";
        simbolo[6] = " ";
        simbolo[7] = "+";
        simbolo[8] = "Q";

        // Recorre y pinta el contenido del array por pantalla
        for(String item : simbolo) {
            System.out.println(item);
        }

        System.out.println();

        System.out.println("" + simbolo[0] + simbolo[1] + simbolo[2] + simbolo[4] + simbolo[6] + simbolo[7]);
    }
}
