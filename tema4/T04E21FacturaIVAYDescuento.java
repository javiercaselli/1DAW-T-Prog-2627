package tema4;

public class T04E21FacturaIVAYDescuento {
    public static void main(String[] args) {
        // Constantes
        final int TIPO_IVA = 21;
        final int TIPO_IVA_REDUCIDO = 10;
        final int TIPO_IVA_SUPERREDUCIDO = 4;

        final double NOPRO = 0;     // Sin descuento
        final double MITAD = 0.5;   // 50% descuento
        final double MENO5 = 5;     // 5 euros de descuento
        final double CINCO = 0.95;  // 5% descuento

        // Variables
        double baseImponible;
        String tipoIVA;
        String tipoDescuento;
        int tipoIVAnumerico;

        double cantidadIVA;
        double precioConIVA;
        double descuento = 0.0;
        double total = 0.0;

        // Cabecera y datos desde teclado
        System.out.print("Introduce la base imponible: ");
        baseImponible = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
        tipoIVA = System.console().readLine();
        System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        tipoDescuento = System.console().readLine();

        // Comprobaciones y cálculos IVA
        switch(tipoIVA) {
            case "general":
                cantidadIVA = baseImponible * TIPO_IVA_REDUCIDO / 100;
                precioConIVA = baseImponible + cantidadIVA;
                tipoIVAnumerico = TIPO_IVA;
                break;
            case "reducido":
                cantidadIVA = baseImponible * TIPO_IVA_REDUCIDO / 100;
                precioConIVA = baseImponible + cantidadIVA;
                tipoIVAnumerico = TIPO_IVA_REDUCIDO;
                break;
            case "superreducido":
                cantidadIVA = baseImponible * TIPO_IVA_REDUCIDO / 100;
                precioConIVA = baseImponible + cantidadIVA;
                tipoIVAnumerico = TIPO_IVA_SUPERREDUCIDO;
                break;
            default:
                System.out.println("ERROR: Tipo de IVA incorrecto");
                return;
        }

        // Comprobaciones y cáculos de los descuentos
        total = precioConIVA;
        switch(tipoDescuento) {
            case "nopro":
                break;
            case "mitad":
                descuento = precioConIVA * MITAD;
                total -= descuento;
                break;
            case "menos5":
                descuento = MENO5;
                total -= descuento;
                break;
            case "5porc":
                descuento = precioConIVA * CINCO;
                total -= descuento;
                break;
            default:
                System.out.println("ERROR: Código de descuento incorrecto");
                return;
        }

        //Pone el descuento en negativo
        descuento *= -1;

        // Obtiene la factura justificada
        System.out.printf("%-25s%7.2f\n", "Base imponible", baseImponible);
        System.out.printf("%-25s%7.2f\n", "IVA (" + tipoIVAnumerico + "%)", cantidadIVA);
        System.out.printf("%-25s%7.2f\n", "Precio con IVA", precioConIVA);
        System.out.printf("%-25s%7.2f\n", "Cod. promo. (mitad)", descuento);
        System.out.print("\033[48;5;25m\033[1m");               // Fondo gris y negrita
        System.out.printf("%-25s%7.2f\n", "Total", total);
        System.out.print("\033[0m");                            // Reset a texto normal

    }
    
}
