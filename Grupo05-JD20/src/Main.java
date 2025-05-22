import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave = 0;

        System.out.println("Tienes la clave para obtener la frase mística?");
        System.out.println("Introduce la clave:");

        while(true){
            try {
                clave = sc.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println("Error: Debes ingresar un número entero.");
                sc.next(); // Limpiar el buffer
                continue; // Volver a pedir la clave
            }
        }

        // Crear instancias de las clases
        DatosArray datos = new DatosArray();
        SearchBinaria search = new SearchBinaria();

        /*
        Ordenamiento del array
         */


        /*
        Busqueda binaria
         */
        search.llamarSearchBinaria(datos.getNumeros(), clave);


        /*
        Verificar si la clave es correcta
         */
        if(search.obtenerResultadoBusqueda() != -1){
            System.out.println(datos.ObtenerFraseMistica());
        }else{
            System.out.println("La clave no es correcta");
        }


    }
}