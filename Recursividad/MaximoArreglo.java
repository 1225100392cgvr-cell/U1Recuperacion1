package Recursividad;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase MaximoArreglo: encuentra el número mayor de un arreglo usando recursividad.
 */

public class MaximoArreglo {

    // Compara el elemento actual contra el máximo del resto del arreglo.
    public static int buscarMaximo(int[] arreglo, int posicion) {
        if (posicion == arreglo.length - 1) {
            return arreglo[posicion]; // Último elemento: es el único candidato
        }
        int maximoDelResto = buscarMaximo(arreglo, posicion + 1);
        return Math.max(arreglo[posicion], maximoDelResto);
    }

    public static void main(String[] args) {
        int[] numeros = {4, 17, 9, 23, 5, 12};
        System.out.println("El máximo es: " + buscarMaximo(numeros, 0));
    }
}