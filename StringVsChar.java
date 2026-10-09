public class StringVsChar {
    public static void main(String[] args) {
        char letra1 = 'c'; // las variables de tipo char almacenan un único carácter entre comillas simples
        char letra2 = 'a';
        char letra3 = 's';
        char letra4 = 'a';

        // muestra: La primera letra es c
        System.out.println("La primera letra es " + letra1);
        // muestra: Todas las letras forman la palabra casa
        System.out.println("Todas las letras forman la palabra " + letra1 + letra2 + letra3 + letra4);

        System.out.println(letra1); // muestra: c
        System.out.println(letra2); // muestra: a
        System.out.println(letra1 + letra2); // muestra: 196 (correspondencia 99 y 97 código ASCII)
        System.out.println(letra1 + "" + letra2); // muestra: ca (sin cadena vacía realizaría la suma)

        // Ejemplos de uso de String (cadenas de caracteres)
        String cadenaVacia = "";
        String miSerie = "The haunting of Hill House";
        String miPelicula = "El señor de los anillos";

        System.out.println("Mi serie favorita es " + miSerie);
        System.out.println("He visto más de diez veces  " + miPelicula);

        int numPelis = 47;
        System.out.println("Tengo una colección de " + numPelis + " películas");

        System.out.println("La palabra mamá tiene " + "mamá".length() + " caracteres");

    }
}
