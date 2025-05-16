

public class DatosArray {
    // Atributos
    private Integer[] numeros = new Integer[1000];
    private Integer numeroMagico = 0;
    private String fraseMistica = "";

    // Constructor
    public DatosArray(){
        GenerarArray();
        SelectNum();
        fraseMistica = FraseMistica.obtenerFraseMistica();
    }

    // Métodos
    public String ObtenerFraseMistica(int clave) {
        return clave == numeroMagico ? fraseMistica : "Clave incorrecta";
    }

    private void GenerarArray(){
        for(int i = 0; i < 1000; i++){
            numeros[i] = 1000 + (int) (Math.random() * 9000);
        }

    }

    private void SelectNum(){
        int seleccion = (int) (Math.random() * 1000);
        numeroMagico = numeros[seleccion];
    }

    //Getters
    public Integer[] getNumeros() {
        return numeros;
    }

    public Integer getNumeroMagico() {
        return numeroMagico;
    }

}
