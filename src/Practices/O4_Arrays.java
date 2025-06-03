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
        final var tamanoArray = ScannerManager.leerInt(scanner, "Ingrese le tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "Ingrese el min");
        final var max = ScannerManager.leerInt(scanner, "Ingrese el max");
        final var escalar = ScannerManager.leerInt(scanner, "Ingrese le escalar");

        final var array = RandomUtilities.generarRandomArrayInt(tamanoArray, min, max, random);
        scanner.close();

        final var arrayResultante = calcularProductoEscalar(tamanoArray, array, escalar);


    }

    //--------Ejercicio 1--------
    static int[] calcularProductoEscalar(int tamanoArray, int[] array, int escalar) {
        final var arrayResultante = new int[tamanoArray];


//        for (var i = 0; i < ; i++) {
//
//        } (){
//            int i;
//            arrayResultante[i] = array[i] * escalar;
//            i++;
//        }

        return arrayResultante;
    }

    static void imprimirInformacion(int[] array, int[] arrayResultante) {
        for (var dato : array) {
            System.out.printf("Array normal: $s", Arrays.toString(array));
        }


        for (var dato : arrayResultante) {
            System.out.printf("Array resultante: %s", Arrays.toString(arrayResultante));
        }
    }
}
