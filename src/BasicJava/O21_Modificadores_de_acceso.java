package BasicJava;

import Utilities.RandomUtilities;

import java.util.Random;

public class O21_Modificadores_de_acceso {
    public static void main(String[] args) {
        final var numeroAleatorio = RandomUtilities.generarRandomInt(10, 5, new Random());
        System.out.printf("El numero aleatorio es %d%n", numeroAleatorio);
    }

    //private : Visible y accesible dentro de la misma clase - private static void imprimirMensaje(){}
    //default : Visible solo en el mismo paquete dode se crea - static void imprimirMensaje(){}
    //public : Visible y accesible en cualquier sitio - public static void imprimirMensaje(){}

}
