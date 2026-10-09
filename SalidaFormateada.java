public class SalidaFormateada {
  public static void main(String[] args) {
    System.out.printf("El número %d no tiene decimales.\n", 21);
    System.out.printf("El número %f sale con decimales.\n",  21.45);
    System.out.printf("El %.3f sale exactamente con %d decimales.\n", 21.0, 3);
    System.out.printf("Las entradas valen %.2f \"Euros\"\\", 29.95);


    System.out.println("\n\nJavier Caselli");
    System.out.print("Calle Mi casa, 20 \n");
    System.out.printf("Mi número de teléfono es %d\n\n", 600123123);
  } 
}
