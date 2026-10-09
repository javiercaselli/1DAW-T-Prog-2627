package tema2;

public class T02E7E8CharsYStrings {
    public static void main(String[] args) {
        // Ejercicio 7
        char a = 'a';
        char n7 = '7';
        char z = 'z';
        String frase = "Ejemplo de conversión implícita y concatenación de variables tipo \"char\": ";
        
        System.out.println(frase + a + ", " + n7 + ", " + z + ".");

        // Ejercicio 8
        System.out.println(a + n7 + z);
        System.out.println("" + a + n7 + z);
    }
}
