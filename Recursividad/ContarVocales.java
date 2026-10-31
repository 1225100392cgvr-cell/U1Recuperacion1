package Recursividad;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase ContarVocales: cuenta las vocales de una cadena de texto usando recursividad.
 */

public class ContarVocales {

    public static boolean esVocal(char letra) {
        return "aeiouAEIOU".indexOf(letra) != -1;
    }

    // Revisa una letra y suma el resultado de revisar el resto de la cadena.
    public static int contar(String texto, int posicion) {
        if (posicion == texto.length()) {
            return 0; // Se acabó la cadena
        }
        int valorActual = esVocal(texto.charAt(posicion)) ? 1 : 0;
        return valorActual + contar(texto, posicion + 1);
    }

    public static void main(String[] args) {
        String frase = "Programacion orientada a objetos";
        System.out.println("\"" + frase + "\" tiene " + contar(frase, 0) + " vocales");
    }
}