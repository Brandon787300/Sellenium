package BasicJava;

import java.util.Random;

public class O10_ANDyOR {
    public static void main(String[] args) {

        final var numero = RandomUtilities.generarRandomInt(200, 10, new Random());
        System.out.printf("El numero %d es par y mayor que 50? %b%n", numero, preguntarCondiciones1(numero));
        System.out.printf("El numero %d es multiplo de 3 o menor igual que 35? %b%n", numero, preguntarCondiciones2(numero));
    }

    static boolean preguntarCondiciones1(int numero) {
        return (numero % 2 == 0) && (numero > 50); //TRUE - FALSE
    }

    static boolean preguntarCondiciones2(int numero) {
        return (numero % 3 == 0) || (numero <= 35); //TRUE - FALSE
    }

}
