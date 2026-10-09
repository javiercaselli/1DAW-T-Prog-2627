package tema2;

public class T02E06FacturaJustificada {
    public static void main(String[] args) {
        // Almacena base imponible, y calula IVA y total de la factura
        double baseImponible = 22.75;
        double iva = baseImponible * 0.21;
        double total = baseImponible + iva;

        // Obtiene la factura justificada
        System.out.printf("%-18s%7.2f\n", "Base imponible", baseImponible);
        System.out.printf("%-18s%7.2f\n", "IVA", iva);
        System.out.printf("%s\n", "-------------------------");
        System.out.printf("%-18s%7.2f\n", "Total", total);
    }
}
