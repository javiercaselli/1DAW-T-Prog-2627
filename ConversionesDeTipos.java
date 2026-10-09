public class ConversionesDeTipos {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;

        int divisionEntera;
        double divisionDecimal;

        divisionEntera = y / x;  // da como resultado 4 (división entera almacenada en variable entera)
        System.out.println(divisionEntera);
        divisionDecimal = y / x; // da como resultado 4.0 (división de dos enteros -> entero)
        System.out.println(divisionDecimal);
        divisionDecimal = (double) y / (double) x; // da como resultado 4.5 (división dos reales -> real)
        System.out.println(divisionDecimal);
        divisionDecimal = (double) y / x; // da como resultado 4.5 (división real y entero -> real)
        System.out.println(divisionDecimal);
        divisionDecimal = y / (double) x; // da como resultado 4.5 (división entero y real -> real)
        System.out.println(divisionDecimal);
        divisionEntera = (int) ((double) y / x);
        System.out.println(divisionEntera);

    }
}
