package tema3;

public class EjemploReadLine {
    public static void main(String[] args) {
        String nombre;
        System.out.print("Dime cómo te llamas: ");
        nombre = System.console().readLine();

        System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
    }
}
