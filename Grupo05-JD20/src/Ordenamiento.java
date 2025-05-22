import java.util.Scanner;
import java.util.Random;

public class Ordenamiento {

    public class OrdenamientoYBusqueda {

        public static void main(String[] args) {
            // Genera un arreglo de 1000 números aleatorios entre 1000 y 9999
            int[] numeros = generarNumerosAleatorios(1000);

            // Selecciona una clave mágica aleatoria del arreglo
            int claveMagica = seleccionarClave(numeros);

            // Informa que se va a ordenar el arreglo
            System.out.println("🔮 Ordenando los números mágicos...");
            // Ordena el arreglo usando el algoritmo MergeSort
            mergeSort(numeros, 0, numeros.length - 1);
            System.out.println("✅ Números ordenados.");

            // Solicita al usuario ingresar un número
            Scanner scanner = new Scanner(System.in);
            System.out.print("🔍 Ingresa el número mágico que crees esconde el mensaje: ");
            int intento = scanner.nextInt();

            // Realiza búsqueda binaria del número ingresado por el usuario
            int resultado = busquedaBinaria(numeros, intento);

            // Verifica si el número ingresado es la clave mágica
            if (resultado != -1 && numeros[resultado] == claveMagica) {
                System.out.println("🎉 ¡Correcto! Has encontrado el número mágico.");
                System.out.println("📜 Mensaje secreto: El destino del imperio está en tus manos.");
            } else {
                System.out.println("❌ Lo siento, ese no es el número mágico.");
            }
        }

        // Método para generar un arreglo de números aleatorios entre 1000 y 9999
        public static int[] generarNumerosAleatorios(int cantidad) {
            Random random = new Random();
            int[] numeros = new int[cantidad];
            for (int i = 0; i < cantidad; i++) {
                numeros[i] = random.nextInt(9000) + 1000; // Números entre 1000 y 9999
            }
            return numeros;
        }

        // Método para seleccionar al azar un número del arreglo como clave mágica
        public static int seleccionarClave(int[] numeros) {
            Random random = new Random();
            int indice = random.nextInt(numeros.length); // Índice aleatorio
            return numeros[indice];
        }

        // Implementación del algoritmo MergeSort
        public static void mergeSort(int[] arr, int izquierda, int derecha) {
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

        // Función auxiliar para fusionar dos subarreglos ordenados
        public static void merge(int[] arr, int izquierda, int medio, int derecha) {
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

        // Implementación de búsqueda binaria
        public static int busquedaBinaria(int[] arr, int clave) {
            int izquierda = 0, derecha = arr.length - 1;
            while (izquierda <= derecha) {
                int medio = (izquierda + derecha) / 2;

                // Si el valor del medio es igual a la clave, se encontró
                if (arr[medio] == clave) return medio;

                // Si la clave es mayor, busca en la mitad derecha
                if (arr[medio] < clave) izquierda = medio + 1;
                else derecha = medio - 1; // Si no, busca en la mitad izquierda
            }
            return -1; // Si no se encontró
        }
    }

}

