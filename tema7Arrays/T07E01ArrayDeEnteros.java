package tema7Arrays;

public class T07E01ArrayDeEnteros {
    public static void main(String[] args) {
        // Declara e inicializa el array
        int[] num;
        num = new int[12];

        // Introduce los valores solicitados
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        for (int item : num) {
            System.out.println(item);
        }

        System.out.println(num[0] + num[6] + num[7]);

    }
}
