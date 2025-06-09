package BasicJava;

import java.util.Arrays;
import java.util.Random;

public class O16_OrdenarArrays_Int_Double {
    public static void main(String[] args) {
        //Default shit
        final var random = new Random();
        final var min = 10;
        final var max = 500;
        final var n = 10; // Tamaño de array

        //Ejercicio Bubble Sort --INT--
        final var array = RandomUtilities.generarRandomArrayInt(n, max, min, random);
        System.out.printf("El array de int es: %s%n", Arrays.toString(array));
        final var arrayOrdenado = ordenarArrayINT(array);
        System.out.printf("El array ordenado es: %s%n", Arrays.toString(arrayOrdenado));

        System.out.println("------------------------------------------");

        //Ejercicio Bubble Sort --DOUBLE--
        final var array2 = RandomUtilities.generarRandomArrayDouble(n, max, min, random);
        System.out.printf("El array de double es: %s%n", Arrays.toString(array2));
        final var arrayOrdenado2 = ordenarArrayDOUBLE(array2);
        System.out.printf("El array ordenado es: %s%n", Arrays.toString(arrayOrdenado2));
    }

    static int[] ordenarArrayINT(int[] array) {
        final var n = array.length; // Tamaño del array

        for (var i = 0; i < n; i++) { // Pasos
            for (var j = 0; j < n - i - 1; j++) { //Subpasos
                if (array[j] > array[j + 1]) { //Preguntas si esta desordenado
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    static double[] ordenarArrayDOUBLE(double[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
