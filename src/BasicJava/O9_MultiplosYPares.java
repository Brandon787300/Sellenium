package BasicJava;

import java.util.Random;

public class O9_MultiplosYPares {
    public static void main(String[] args) {
        //Comparacion de datos - Ejercicio 1
        final var random = new Random();
//
//        final var a = Utilities.RandomUtilities.generarRandomInt(100, 20, random);
//        final var b = Utilities.RandomUtilities.generarRandomInt(100, 20, random);
//
//        //Primera opcion - Guardando la variable
//        final var aEsNegativo = esNegativo(a);
//        imprimirResultado(a, esNegativo(a));
//
//        //Segunda opcion - Sin guardar el dato en una variable
//        imprimirResultado(b, esNegativo(b));

        //---------------------------------------------------------------------------

        //Como saber si un numero es multiplo de otro?
        final var n = RandomUtilities.generarRandomInt(25, 10, random);

        //Si el resultado de residuo es 0 es multiplo
        final var esPar = n % 2 == 0; // TRUE / FALSE
        final var esImpar = n % 2 != 0; // TRUE / FALSE

        final var esMultiplo3 = n % 3 == 0; // TRUE / FALSE
        final var esMultiplo5 = n % 5 == 0; // TRUE / FALSE

        System.out.printf("Numero generado: %d%n", n);
        System.out.printf("Es par? %b%n", esPar);
        System.out.printf("Es impar? %b%n", esImpar);
        System.out.printf("Es multiplo de 3? %b%n", esMultiplo3);
        System.out.printf("Es multiplo de 5? %b%n", esMultiplo5);
    }

    //Verificar si es negativo - Ejercicio 1
    static boolean esNegativo(int numero) {
        return numero < 0; //Retorna TRUE / FALSE
    }

    //Mostrar resultado - Ejercicio 1
    static void imprimirResultado(int numero, boolean esNegativo) {
        System.out.printf("Esl numero %d es negativo? %b%n", numero, esNegativo);
    }

    //-----------------------------------------------------------------


}
