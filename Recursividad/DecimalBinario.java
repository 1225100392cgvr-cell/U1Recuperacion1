package Recursividad;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase DecimalBinario: convierte un número decimal a binario con recursividad.
 */

public class DecimalBinario {

    // Divide entre 2 y concatena los residuos de atrás hacia adelante.
    public static String convertir(int numero) {
        if (numero < 2) {
            return String.valueOf(numero); // Caso base: 0 o 1
        }
        return convertir(numero / 2) + (numero % 2);
    }

    public static void main(String[] args) {
        int[] pruebas = {0, 5, 10, 255};
        for (int numero : pruebas) {
            System.out.println(numero + " en binario es " + convertir(numero));
        }
    }
}