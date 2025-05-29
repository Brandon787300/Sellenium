package Practices;

import java.util.Scanner;

public class O2_IF {
    public static void main(String[] args) {

        //Instancias necesarias para los random y scanners
        final var scanner = new Scanner(System.in);


        // __________________EJERCICIO 1__________________
        //Conseguir num
//        final var scanner = new Scanner(System.in);
//        final var numIngreso = ScannerManager.leerInt(scanner, "Ingrese un numero de 1 - 6");
//
//        //Ver que sea un num del 1 - 6
//        final var numVerificado = validarNumero(numIngreso);
//
//
//        //Generar num random
//        final var numRan = RandomUtilities.generarRandomInt(6, 1, new Random());
//        if (numVerificado == false) {
//            System.out.printf("%nNumero no valido intente de nuevo");
//        } else {
//            System.out.printf("Numero generado: %d%n", numRan);
//            mostrarMensajeGanador(numRan, numIngreso);
//        }

        // __________________EJERCICIO 2__________________

        //Conseguir prestamo y calcular extra
//        final var prestamo = ScannerManager.leerDouble(scanner, "Ingrese el prestamo a sacar");
//        final var montoExtra = calcularMonto(prestamo);
//
//        imprimirResultado(prestamo, montoExtra);

        // __________________EJERCICIO 3__________________

        final var radio = ScannerManager.leerDouble(scanner, "Digita el radio");
        imprimirMenu();
        final var opcion = ScannerManager.leerChar(scanner, "Digita la opcion");

        //------------------------------------------------
        if (validarInput(opcion)) {
            if (opcion == 'A') {
                System.out.printf("El area del radio %.3f es %.3f", radio, calcularArea(radio));
            } else if (opcion == 'B') {
                System.out.printf("El area del radio %.3f es %.3f", radio, calcularPerimetro(radio));
            } else if (opcion == 'C') {
                System.out.printf("El area del radio %.3f es %.3f y el perimetro es %.3f", radio, calcularArea(radio), calcularPerimetro(radio));
            }
        } else {
            System.out.printf("Opcion invalida intentalo de nuevo");
        }


    }

    //Ejercicio - 1
    static boolean validarNumero(int numJugador) {
        return numJugador >= 1 && numJugador <= 6;
    }

    //Ejercicio - 1
    static void mostrarMensajeGanador(int numRan, int numIngreso) {
        if (numRan == numIngreso) {
            System.out.printf("GANASTE");
        } else {
            System.out.printf("PERDISTE");
        }
    }
    //-----------------------------------------------------------------

    //Ejercicio 2
    static double calcularMonto(double prestamo) {
        final var aumento1 = (prestamo % 2 == 0) ? prestamo * 0.1 : 0; //Si es par se le aumenta un 10%
        final var aumento2 = (prestamo % 3 == 0) ? 500 : 0; //Si es multiplo de 3 se le aumenta 500
        final var aumento3 = (prestamo > 500) ? 300 : 0; //Si es maor que 500 se le aumenta 300

        return prestamo + aumento1 + aumento2 + aumento3;
    }

    //Ejercicio 2
    static void imprimirResultado(double prestamo, double montoExtra) {
        System.out.printf("Para el prestamo %.3f se le cobrara %.3f", prestamo, montoExtra);
    }
    //-----------------------------------------------------------------

    //Ejercicio 3
    static void imprimirMenu() {
        System.out.printf("%n A: Calcular el área.");
        System.out.printf("%n B: Calcular el perímetro.");
        System.out.printf("%n C: Calcular el ambos.%n");
    }

    //Ejercicio 3 - validar opciones
    static boolean validarInput(char opcion) {
        return opcion == 'A' || opcion == 'B' || opcion == 'C';
    }

    static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}
