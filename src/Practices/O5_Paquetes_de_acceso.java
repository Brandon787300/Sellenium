package Practices;

import Utilities.RandomUtilities;

import java.util.Random;

public class O5_Paquetes_de_acceso {
    public static void main(String[] args) {
        final var numeroAleatorio = RandomUtilities.generarRandomInt(10, 5, new Random());
        System.out.printf("El numero aleatorio es %d%n", numeroAleatorio);
    }

}
