import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Ordenamiento orden = new Ordenamiento();
        SearchBinaria search = new SearchBinaria();
        DatosArray datos = new DatosArray();
        Scanner sc = new Scanner(System.in);
        int clave = 0;

        System.out.println("Tienes la clave para obtener la frase mística?");
        System.out.println("Introduce la clave:");

        /*
        Validar la entrada del usuario
         */
        while(true){
            try {
                clave = sc.nextInt();
                if(clave > 9999 || clave < 1000){
                    System.out.println("Error: La clave debe ser un número entre 1000 y 9999.");
                    continue; // Volver a pedir la clave
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Error: Debes ingresar un número entero.");
                sc.next(); // Limpiar el buffer
                continue; // Volver a pedir la clave
            }
        }

        /*
        Obtener el array de números
         */
        int[] arr = datos.getNumeros();

        /*
        Ordenamiento del array
         */
        orden.mergeSort(arr, 0, arr.length - 1);

        /*
        Busqueda binaria
         */
        search.llamarSearchBinaria(arr, clave);


        /*
        Verificar si la clave es correcta
         */
        if(search.obtenerResultadoBusqueda() != -1){
            System.out.println("La clave es correcta, tu recompensa:");
            System.out.println(datos.ObtenerFraseMistica());
        }else{
            System.out.println("La clave no es correcta");
        }


    }
}