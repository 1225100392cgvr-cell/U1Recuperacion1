package Recursividad;
/*
 * @Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase Palindromo: revisa de forma recursiva si una palabra o frase se lee igual al derecho y al revés.
 */
 
public class Palindromo {
 
    // Compara la primera y la última letra; si son iguales, avanza hacia el centro.
    public static boolean esPalindromo(String texto, int inicio, int fin) {
        if (inicio >= fin) {
            return true; // Ya llegamos al centro: todo coincidió
        }
        if (texto.charAt(inicio) != texto.charAt(fin)) {
            return false; // Encontramos letras distintas
        }
        return esPalindromo(texto, inicio + 1, fin - 1);
    }
 
    // Quita espacios y signos, y pasa todo a minúsculas antes de revisar.
    public static boolean revisar(String frase) {
        String limpia = frase.toLowerCase().replaceAll("[^a-z0-9]", "");
        return esPalindromo(limpia, 0, limpia.length() - 1);
    }
 
    public static void main(String[] args) {
        String[] pruebas = {"anita lava la tina", "reconocer", "hola mundo"};
        for (String frase : pruebas) {
            System.out.println("\"" + frase + "\" -> " + revisar(frase));
        }
    }
}
 