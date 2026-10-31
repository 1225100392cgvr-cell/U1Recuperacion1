package Arreglos;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase SumarFilasColumnas: calcula la suma de cada fila y de cada columna de una matriz.
 */

public class SumarFilasColumnas {

    public static int[] sumarFilas(int[][] matriz) {
        int[] resultado = new int[matriz.length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                resultado[fila] += matriz[fila][columna];
            }
        }
        return resultado;
    }

    public static int[] sumarColumnas(int[][] matriz) {
        int[] resultado = new int[matriz[0].length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                resultado[columna] += matriz[fila][columna];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 8, 9}
        };
        int[] filas = sumarFilas(matriz);
        int[] columnas = sumarColumnas(matriz);
        for (int i = 0; i < filas.length; i++) {
            System.out.println("Suma de la fila " + i + ": " + filas[i]);
        }
        for (int i = 0; i < columnas.length; i++) {
            System.out.println("Suma de la columna " + i + ": " + columnas[i]);
        }
    }
}