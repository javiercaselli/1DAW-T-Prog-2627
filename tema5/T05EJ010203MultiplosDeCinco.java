package tema5;

public class T05EJ010203MultiplosDeCinco {
    public static void main(String[] args) {
        // variable
        int i = 0;

        // Con while
        while (i<=100) {
            System.out.printf("%d ", i);
            i=i+5;
        }


        // Con do-while
        System.out.println();
        i = 0;
        do{
            System.out.printf("%d ", i);
            i += 5;
        } while(i <= 100);

        // Con for
        System.out.println();
        for (i = 0; i <= 100; i += 5) {
            System.out.printf("%d ", i);
        }
    }
}
