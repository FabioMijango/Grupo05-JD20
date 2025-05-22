import java.util.Arrays;

/**
 * Esta clase implementa la búsqueda binaria en un arreglo de enteros.
 * La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en un arreglo ordenado.
 *
 */
public class SearchBinaria {

    private int[] myArray;
    private int indice;


    /**
     * Constructor de la clase SearchBinaria.
     * Inicializa el arreglo y el índice.
     */
    public void llamarSearchBinaria(int[] array, int elemento) {
        myArray = Arrays.copyOf(array, array.length);
        indice = elemento;
        buscar(myArray, elemento );
    }


    /**
     * Método que realiza la búsqueda binaria en un arreglo ordenado.
     *
     * @param array   El arreglo en el que se busca el elemento.
     * @param elemento El elemento a buscar.
     * @return El índice del elemento encontrado o -1 si no se encuentra.
     */
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

    /**
     * Método que devuelve una representación en cadena del resultado de la búsqueda.
     *
     * @return Una cadena que indica si el elemento fue encontrado o no.
     */
    public String toString(){
        if (myArray == null) {
            return "No existe el arreglo.";
        }
        if (indice == -1 ) {
            return "El elemento buscado no existe en el arreglo";
        }
        return "El elemento " + myArray[buscar(myArray, indice )] + " ha sido encontrado en el arreglo";
    }

    /**
     * Devuelve un mensaje representando el resultado de la búsqueda.
     *
     * @return Un mensaje indicando si el elemento fue encontrado o no.
     */
    public int obtenerResultadoBusqueda() {
        if (indice == -1) {
            return null;
        }
        return indice
    }
}