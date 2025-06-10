package Practices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class O4_Arrays {

    public static void main(String[] args) {
        //Default shit
        final var scanner = new Scanner(System.in);
        final var random = new Random();
        //----------------------------------

        //--------Ejercicio 1--------
//        final var tamanoArray = Main.ScannerManager.leerInt(scanner, "Ingrese le tamaño del array");
//        final var min = Main.ScannerManager.leerInt(scanner, "Ingrese el min");
//        final var max = Main.ScannerManager.leerInt(scanner, "Ingrese el max");
//        final var escalar = Main.ScannerManager.leerInt(scanner, "Ingrese le escalar");
//
//        final var array = Utilities.RandomUtilities.generarRandomArrayInt(tamanoArray, max, min, random);
//        scanner.close();
//
//        final var arrayResultante = calcularProductoEscalar(tamanoArray, array, escalar);
//        imprimirInformacion(array, arrayResultante);

        //--------Ejercicio 2--------

//        final var tamanoArray = Main.ScannerManager.leerInt(scanner, "Ingrese le tamaño del array");
//        final var min = Main.ScannerManager.leerInt(scanner, "Ingrese el min");
//        final var max = Main.ScannerManager.leerInt(scanner, "Ingrese el max");
//        final var array1 = Utilities.RandomUtilities.generarRandomArrayInt(tamanoArray, max, min, random);
//        final var array2 = Utilities.RandomUtilities.generarRandomArrayInt(tamanoArray, max, min, random);
//
//        final var arraySuma = calcularSumaArray(array1, array2, tamanoArray);
//        imprimirInformacion(array1, array2, arraySuma);

        //--------Ejercicio 3--------
        final var tamanoArray = ScannerManager.leerInt(scanner, "Ingrese le tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "Ingrese el min");
        final var max = ScannerManager.leerInt(scanner, "Ingrese el max");
        final var array1 = RandomUtilities.generarRandomArrayInt(tamanoArray, max, min, random);
        final var array2 = RandomUtilities.generarRandomArrayInt(tamanoArray, max, min, random);


    }

    //--------Ejercicio 1--------
    static int[] calcularProductoEscalar(int tamanoArray, int[] array, int escalar) {
        final var arrayResultante = new int[tamanoArray];

        for (var i = 0; i < tamanoArray; i++) {
            arrayResultante[i] = array[i] * escalar;

        }

        return arrayResultante;
    }

    static void imprimirInformacion(int[] array, int[] arrayResultante) {

        System.out.printf("Array normal: %s%n", Arrays.toString(array));
        System.out.printf("Array resultante: %s%n", Arrays.toString(arrayResultante));

    }

    //--------Ejercicio 2--------
    static int[] calcularSumaArray(int[] array1, int[] array2, int tamanoArray) {
        final var arraySuma = new int[tamanoArray];

        for (var i = 0; i < tamanoArray; i++) {
            arraySuma[i] = array1[i] + array2[i];
        }

        return arraySuma;
    }

    static void imprimirInformacion(int[] array1, int[] array2, int[] arraySuma) {
        System.out.printf("Primer array %s%n", Arrays.toString(array1));
        System.out.printf("Segundo array array %s%n", Arrays.toString(array2));
        System.out.printf("Suma de los dos arrays %s%n", Arrays.toString(arraySuma));
    }

    //--------Ejercicio 3--------
    static double[] calcularPromedioPonderado(int[] array1, int[] array2) {
        final var arrayPromedio = new double[array1.length];


        for (var i = 0; i < array2.length; i++) {
            arrayPromedio[i] = array1[i] * array2[i];
        }
        return arrayPromedio;

    }

}
