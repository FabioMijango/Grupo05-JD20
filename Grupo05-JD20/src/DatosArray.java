
/**
 * Clase DatosArray que genera un array de números aleatorios, selecciona un número mágico
 * y obtiene una frase mística.
 */
public class DatosArray {
    // Atributos
    private Integer[] numeros = new Integer[1000];
    private Integer numeroMagico = 0;
    private String fraseMistica = "";

    /**
     * Constructor de la clase DatosArray.
     * Inicializa el array de números, selecciona un número mágico y obtiene una frase mística.
     */
    public DatosArray(){
        GenerarArray();
        SelectNum();
        fraseMistica = FraseMistica.obtenerFraseMistica();
    }

    /**
     * Devuelve la frase mística si la clave proporcionada coincide con el número mágico.
     *
     * @param clave Clave proporcionada para verificar.
     * @return La frase mística si la clave es correcta, de lo contrario "Clave incorrecta".
     */
    public String ObtenerFraseMistica(int clave) {
        return clave == numeroMagico ? fraseMistica : "Clave incorrecta";
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
     * Selecciona un número mágico aleatorio del array de números.
     */
    private void SelectNum(){
        int seleccion = (int) (Math.random() * 1000);
        numeroMagico = numeros[seleccion];
    }

    /**
     * Obtiene el array de números generados.
     *
     * @return Array de números generados.
     */
    public Integer[] getNumeros() {
        return numeros;
    }

    /**
     * Obtiene el número mágico seleccionado.
     *
     * @return Número mágico seleccionado.
     */
    public Integer getNumeroMagico() {
        return numeroMagico;
    }

}
