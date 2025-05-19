public class Ordenamiento {
    // Método principal que llama al MergeSort

    static void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            mergeSort(arr, izquierda, medio);        // Ordenar mitad izquierda
            mergeSort(arr, medio + 1, derecha);      // Ordenar mitad derecha
            merge(arr, izquierda, medio, derecha);   // Combinar mitades
        }
    }

    static void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, izquierda, L, 0, n1);
        System.arraycopy(arr, medio + 1, R, 0, n2);

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }


}
