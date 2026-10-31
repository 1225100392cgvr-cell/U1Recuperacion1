package Arreglos;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase QuitarDuplicados: elimina los valores repetidos de un arreglo conservando el orden.
 */

import java.util.Arrays;

public class QuitarDuplicados {

    // Revisa si un valor ya fue guardado en las primeras 'cantidad' posiciones.
    public static boolean yaExiste(int[] arreglo, int cantidad, int valor) {
        for (int i = 0; i < cantidad; i++) {
            if (arreglo[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static int[] quitar(int[] original) {
        int[] temporal = new int[original.length];
        int cantidad = 0;
        for (int valor : original) {
            if (!yaExiste(temporal, cantidad, valor)) {
                temporal[cantidad] = valor;
                cantidad++;
            }
        }
        return Arrays.copyOf(temporal, cantidad); // Recorta al tamaño real
    }

    public static void main(String[] args) {
        int[] numeros = {3, 7, 3, 1, 7, 9, 1};
        System.out.println("Con duplicados: " + Arrays.toString(numeros));
        System.out.println("Sin duplicados: " + Arrays.toString(quitar(numeros)));
    }
}