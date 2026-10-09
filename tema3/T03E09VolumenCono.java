package tema3;

public class T03E09VolumenCono {
    public static void main(String[] args) {
        double altura, radio, volumen;

        // Texto interfaz usuario
        System.out.println("Volumen de un cono");
        System.out.println("------------------");

        // Lee la altura
        System.out.print("Introduzca la altura (cm): ");
        altura = Double.parseDouble(System.console().readLine());
        
        // Lee el radio de la base
        System.out.print("Introduzca el radio de la base (cm): ");
        radio = Double.parseDouble(System.console().readLine());
        
        // Calcula el volumen
        volumen = (1.0 / 3) * Math.PI * Math.pow(radio, 2.0) * altura;
        System.out.println("El volumen del cono es de " + volumen + " cm3");
    }
}
