package Practices;

import java.util.Random;

public class O1_Methods {
    public static void main(String[] args) {
        //Instancia para usar el random como parametro
        final var random = new Random();

        //Ejercicio 1

//        System.out.printf("%n01-Ejercicio");
//        final var numGenarado = generarRandomInt(10, 100, random);
//        System.out.printf("%nEntero generado: %d%n", numGenarado);
//
//        System.out.printf("%n01.2-Ejercicio%n");
//        final var numGenerado2 = generarRandomDouble(10, 100);
//        System.out.printf("Double generado: %.2f%n", numGenerado2);
        //----------------------------------------------------------------

        //Ejercicio 2

//        System.out.printf("%n02-Ejercicio%n");
//        final var masa = generarRandomInt(100, 300, random);
//        final var aceleracion = generarRandomInt(3, 5, random);
//        final var fuerza = calcularFuerza(masa, aceleracion);
//        System.out.printf("-Para una masa de %d y aceleracion de %d tenemos una fuerza de %.4f", masa, aceleracion, fuerza);
        //----------------------------------------------------------------

        //Ejercicio 3

//        final var velocidadInicial = generarRandomInt(10, 30, random);
//        final var aceleracion = generarRandomInt(2, 5, random);
//        final var tiempo = generarRandomInt(3, 5, random);
//
//        final var velocidadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);
//        imprimirResultado3(velocidadFinal, velocidadInicial, aceleracion, tiempo);
        //----------------------------------------------------------------

        //Ejercicio 4

//        final var cateto1 = generarRandomDouble(10, 30);
//        final var cateto2 = generarRandomDouble(10, 30);
//
//        final var hipotenusa = calcularHipotenusa(cateto1, cateto2);
//        imprimirResultado4(cateto1, cateto2, hipotenusa);
        //----------------------------------------------------------------

        //Ejercicio 5

        final var radio = generarRandomInt(10, 25, random);
        final var area = calcularArea(radio);
        final var perimetro = calcularPerimetro(radio);
        imprimirResultado5(radio, area, perimetro);
    }

    //Int Random
    static int generarRandomInt(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    //Double Random
    static double generarRandomDouble(int min, int max) {
        final var random = new Random();
        final var randDouble = (max - min) * random.nextDouble() * min;
        return randDouble;
    }

    //Calcular fuerza - Ejercicio 1
    static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    //Calcular velocidad Final
    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial + aceleracion * tiempo;
    }

    //Imprimir Resultado
    static void imprimirResultado3(double velocidadFinal, double velocidadInicial, double aceleracion, int tiempo) {
        System.out.printf("%n03-Ejercicio");
        System.out.printf("%nPara una velocidad inicial %.3f, una celeracion %.3f y un tiempo %d.Se tiene una velocidad final %.3f usnao MRUV.%n ", velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }

    //Calcular hipotenusa - Ejercicio 4
    static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    //Imprimir Resultado - Ejericicio 4
    static void imprimirResultado4(double cateto1, double cateto2, double hipotenusa) {
        System.out.printf("%n04-Ejercicio%n");
        System.out.printf("Para los catetos %.3f & %.3f tenemos una hipotenusa de %.3f.%n", cateto1, cateto2, hipotenusa);
    }

    //Calcular Area - Ejercicio 5
    static double calcularArea(int radio) {
        return Math.PI * radio;
    }

    //Calcular Perimetro - Ejercicio 5
    static double calcularPerimetro(int radio) {
        return 2 * Math.PI * radio;
    }

    //Imprimir Resultado - Ejerciccio 5
    static void imprimirResultado5(int radio, double area, double perimetro) {
        System.out.printf("%n05-Ejercicio%n");
        System.out.printf("Para un radio de %d se tiene un perimetro de %.3f y un area de %.3f", radio, perimetro, area);
    }
}
