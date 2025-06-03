package BasicJava;

import java.util.Arrays;
import java.util.Random;

public class O15_Arrays {
    public static void main(String[] args) {
        //Arrays con valores iniciales
        final var arrayNombres = new String[]{"Carlos", "Jorge", "Mariana", "Rodrigo", "Jimena"};
        final var arrayNumeros = new int[]{6, 24, 74, 11, 500, 0, 999};

        //Arrays sin valores iniciales
        final var arrayNombres2 = new String[5];
        final var arrayNumeros2 = new int[7];

        //Manipular valores segun su index
        arrayNumeros2[0] = 23;
        arrayNumeros2[1] = 23;
        arrayNumeros2[2] = 23;

        System.out.printf("El valor con index 1 es %d%n", arrayNumeros2[1]);
        //Mostrar todo el array
        //Se convierte a string para poder mostrarlo con %s
        System.out.printf("Los valores del array es %s%n", Arrays.toString(arrayNumeros2));
        //Mostrar tamaño de array
        System.out.printf("El tamaño del array es %d%n ", arrayNumeros2.length);
        //Ultimo elemento
        System.out.printf("El ultimo elemento es", arrayNumeros2.length - 2);

        //Iterar
        final var n = arrayNombres.length;
        System.out.println("Iterar con for:");
        for (var i = 0; i < n; i++) {
            System.out.printf("Index: %d, valor: %s%n", i, arrayNombres[i]);
        }

        //Iterar 2.0 FOR EACH
        //Se decalara un iterador que saca cada dato del array y ejecuta el for por cada dato
        for (var nombre : arrayNombres) {
            System.out.printf("nombre: %s%n", nombre);
        }


        //--------Generar Random--------
        final var random = new Random();

        final var arrayInt = generarRandomArrayInt(10, 10, 100, random);
        final var arrayDouble = generarRandomArrayDouble(10, 10, 30, random);

        System.out.printf("El array de int es: %s%n", Arrays.toString(arrayInt));
        System.out.printf("El array de double es: %s%n", Arrays.toString(arrayDouble));

    }

    //FUNCIONES CON ARRAYS
    static void mostrarArrayIncdices(int[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            System.out.printf("index: %d, value: %d%n", i, array[i]);
        }
    }


    static int[] crearArray() {
        return new int[]{1, 2, 3, 4, 5};
    }

    //GENERAR ARRAYS CON DATA ALEATORIA---------Generar Random----------
    static int[] generarRandomArrayInt(int n, int min, int max, Random random) {
        final var arrayInt = new int[n];

        for (var i = 0; i < n; i++) {
            arrayInt[i] = RandomUtilities.generarRandomInt(max, min, random);
        }
        return arrayInt;
    }

    static double[] generarRandomArrayDouble(int n, int min, int max, Random random) {
        final var arrayDouble = new double[n];

        for (var i = 0; i < n; i++) {
            arrayDouble[i] = RandomUtilities.generarRandomDouble(max, min, random);
        }
        return arrayDouble;
    }

}
