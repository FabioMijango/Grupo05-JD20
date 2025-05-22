import java.util.Scanner;
import java.util.Random;

public class Ordenamiento {

    /**
     * Método que implementa el algoritmo de ordenamiento Merge Sort.
     * Divide el arreglo en mitades, las ordena recursivamente y luego las combina.
     *
     * @param arr       El arreglo que se desea ordenar.
     * @param izquierda El índice inicial del subarreglo.
     * @param derecha   El índice final del subarreglo.
     */
    public void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            // Ordena la mitad izquierda
            mergeSort(arr, izquierda, medio);
            // Ordena la mitad derecha
            mergeSort(arr, medio + 1, derecha);
            // Combina ambas mitades ordenadas
            merge(arr, izquierda, medio, derecha);
        }
    }

    /**
     * Método para fusionar dos subarreglos ordenados en un solo arreglo ordenado.
     *
     * @param arr     El arreglo original.
     * @param izquierda  El índice inicial del subarreglo izquierdo.
     * @param medio   El índice medio que divide los dos subarreglos.
     * @param derecha  El índice final del subarreglo derecho.
     */
    private void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia los datos a los subarreglos temporales L[] y R[]
        for (int i = 0; i < n1; i++)
            L[i] = arr[izquierda + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[medio + 1 + j];

        // Fusiona los arreglos temporales en el arreglo original
        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        // Copia los elementos restantes de L[] si hay
        while (i < n1) arr[k++] = L[i++];

        // Copia los elementos restantes de R[] si hay
        while (j < n2) arr[k++] = R[j++];
    }

}



