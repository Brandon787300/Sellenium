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
}
