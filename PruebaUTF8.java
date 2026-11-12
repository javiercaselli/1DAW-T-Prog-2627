import java.nio.charset.Charset;

public class PruebaUTF8 {
    public static void main(String[] args) {
        System.out.println("Condificación JVM: " + Charset.defaultCharset());
        System.out.println("Condificación de salida: " + System.getProperty("stdout.encoding"));
        System.out.println("Prueba: € á é í ó ú ñ → ✓ 😀");
    }
}
