package Arreglos;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase SinDiagonal: muestra una matriz sin su diagonal principal y suma los elementos restantes.
 */

public class SinDiagonal {

    // Imprime la matriz poniendo un guion donde estaría la diagonal.
    public static void mostrarSinDiagonal(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == columna) {
                    System.out.print("-\t");
                } else {
                    System.out.print(matriz[fila][columna] + "\t");
                }
            }
            System.out.println();
        }
    }

    // Suma todo lo que NO está en la diagonal (fila distinta de columna).
    public static int sumarSinDiagonal(int[][] matriz) {
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila != columna) {
                    suma += matriz[fila][columna];
                }
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        mostrarSinDiagonal(matriz);
        System.out.println("Suma sin diagonal: " + sumarSinDiagonal(matriz));
    }
}