import java.util.Arrays;

public class SearchBinaria {

    private int[] myArray;
    private int indice;

    //llamar la búsqueda binaria
    public void llamarSearchBinaria(int[] array, int elemento) {
        myArray = Arrays.copyOf(array, array.length);
        indice = elemento;
        buscar(myArray, elemento );
    }
    //Algoritmo de búsqueda binaria
    private int buscar(int[] array, int elemento) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (array[medio] == elemento) {
                return medio;
            } else if (array[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return indice = -1;
    }
    //llamar texto de la clase
    public String toString(){
        if (myArray == null) {
            return "No existe el arreglo.";
        }
        if (indice == -1 ) {
            return "El elemento buscado no existe en el arreglo";
        }
        return "El elemento " + myArray[buscar(myArray, indice )] + " ha sido encontrado en el arreglo";
    }
}