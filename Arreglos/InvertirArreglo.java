package Arreglos;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase InvertirArreglo: invierte el orden de los elementos de un arreglo intercambiando extremos.
 */

import java.util.Arrays;

public class InvertirArreglo {

    // Intercambia el primero con el último, el segundo con el penúltimo, etc.
    public static void invertir(int[] arreglo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        while (izquierda < derecha) {
            int temporal = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = temporal;
            izquierda++;
            derecha--;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(numeros));
        invertir(numeros);
        System.out.println("Invertido: " + Arrays.toString(numeros));
    }
}