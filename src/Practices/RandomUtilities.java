package Practices;

import java.util.Random;

public class RandomUtilities {


    static int generarRandomInt(int max, int min, Random random) {
        final var numGenerado = random.nextInt(max - min + 1) + min;
        return numGenerado;
    }

    static Double generarRandomDouble(double max, double min, Random random) {
        final var numGenerado = (max - min) * random.nextDouble() * min;
        return numGenerado;
    }

    //GENERAR ARRAYS CON DATA ALEATORIA---------Generar Random----------
    static int[] generarRandomArrayInt(int n, int min, int max, Random random) {
        final var arrayInt = new int[n];

        for (var i = 0; i < n; i++) {
            arrayInt[i] = RandomUtilities.generarRandomInt(min, max, random);
        }
        return arrayInt;
    }

    static double[] generarRandomArrayDouble(int n, int min, int max, Random random) {
        final var arrayDouble = new double[n];

        for (var i = 0; i < n; i++) {
            arrayDouble[i] = RandomUtilities.generarRandomDouble(min, max, random);
        }
        return arrayDouble;
    }
}
