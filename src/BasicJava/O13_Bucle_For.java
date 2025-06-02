package BasicJava;

import java.util.Random;

public class O13_Bucle_For {
    public static void main(String[] args) {

        //----------------Ejercicio 1---------------Numeros impares con fori
//        final var min = 5;
//        final var max = 20;
//        final var random = new Random(); //Para poder generar aleatorios
//        final var n = random.nextInt(max - min + 1) + min;
//
//        System.out.println(n);
//        for (var i = 0; i < n; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        //----------------Ejercicio 2---------------Contadores
//        final var min = 15;
//        final var max = 100;
//        final var random = new Random(); //Para poder generar aleatorios
//        final var n = random.nextInt(max - min + 1) + min;
//        System.out.printf("Numero random: %d%n", n);
//        System.out.printf("Numeros Pares: %d%n", contadorValores1(n));
//        System.out.printf("Multiplos de 3: %d%n", contadorValores2(n));
//        System.out.printf("Multiplos de 10: %d%n", contadorValores3(n));

        //----------------Ejercicio 3---------------Acumulador
//        final var min = 15;
//        final var max = 100;
//        final var random = new Random(); //Para poder generar aleatorios
//        final var n = random.nextInt(max - min + 1) + min;
//
//        //Imprimir
//        System.out.printf("Numero random: %d%n", n);
//        System.out.printf("Suma de todos los valores: %d%n", calcularsuma1(n));
//        System.out.printf("Suma de todos los pares: %d%n", calcularsuma2(n));
//        System.out.printf("Suma de mutiplos de 5: %d%n", calcularsuma3(n));

        //----------------Ejercicio 4---------------
//        final var min = 5;
//        final var max = 20;
//        final var random = new Random(); //Para poder generar aleatorios
//        final var n = random.nextInt(max - min + 1) + min;
//
//        System.out.printf("El promedio simple desde 1 hasta %d es %d", n, calcularPromedioSimple(n));

        //----------------Ejercicio 5---------------
        final var min = 2;
        final var max = 10;
        final var random = new Random(); //Para poder generar aleatorios
        final var n = random.nextInt(max - min + 1) + min;

        System.out.printf("El factorial de %d es %d ", n, calcularFactorial(n));
    }

    //--------Ejercicio 2-------
    static int contadorValores1(int n) {
        var contadorPares = 0;
        for (var i = 0; i < n; i++) {
            if (i % 2 == 0) {
                //System.out.println(i);
                contadorPares++;
            }
        }
        return contadorPares;
    }

    static int contadorValores2(int n) {
        var contadorMultiplos = 0;
        for (var i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                //System.out.println(i);
                contadorMultiplos++;
            }
        }
        return contadorMultiplos;
    }

    static int contadorValores3(int n) {
        var contadorMultiplos = 0;
        for (var i = 0; i <= n; i++) {
            if (i % 10 == 0) {
                //System.out.println(i);
                contadorMultiplos++;
            }
        }
        return contadorMultiplos;
    }
    //--------------------------

    //--------Ejercicio 3--------
    static int calcularsuma1(int n) {
        var suma = 0;
        for (var i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    static int calcularsuma2(int n) {
        var suma = 0;
        for (var i = 0; i < n; i++) {

            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    static int calcularsuma3(int n) {
        var suma = 0;
        for (var i = 0; i < n; i++) {
            if (i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
    //--------------------------

    //--------Ejercicio 4--------
    static int calcularPromedioSimple(int n) {
        var suma = 0;
        for (var i = 0; i <= n; i++) {
            suma += i;
        }
        return suma / n;
    }

    //--------Ejercicio 5--------
    static int calcularFactorial(int n) {
        var factorial = 1;
        for (var i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
