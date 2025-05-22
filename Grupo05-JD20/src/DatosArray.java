
/**
 * Clase DatosArray que genera un array de números aleatorios, selecciona un número mágico
 * y obtiene una frase mística.
 */
public class DatosArray {
    // Atributos
    private int[] numeros = new int[1000];
    private String fraseMistica = "";

    /**
     * Constructor de la clase DatosArray.
     * Inicializa el array de números, selecciona un número mágico y obtiene una frase mística.
     */
    public DatosArray(){
        GenerarArray();
        fraseMistica = FraseMistica.obtenerFraseMistica();
    }

    /**
     * Devuelve la frase mística si la clave proporcionada coincide con el número mágico.
     *
     * @param clave Clave proporcionada para verificar.
     * @return La frase mística si la clave es correcta, de lo contrario "Clave incorrecta".
     */
    public String ObtenerFraseMistica(int clave) {
        return  fraseMistica;
    }

    /**
     * Genera un array de 1000 números aleatorios entre 1000 y 9999.
     */
    private void GenerarArray(){
        for(int i = 0; i < 1000; i++){
            numeros[i] = 1000 + (int) (Math.random() * 9000);
        }

    }


    /**
     * Obtiene el array de números generados.
     *
     * @return Array de números generados.
     */
    public int[] getNumeros() {
        return numeros;
    }

}
